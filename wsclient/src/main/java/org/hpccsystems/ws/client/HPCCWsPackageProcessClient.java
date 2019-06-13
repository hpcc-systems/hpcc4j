package org.hpccsystems.ws.client;

import java.rmi.RemoteException;

import org.apache.log4j.Logger;
import org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ActivatePackageRequest;
import org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ActivatePackageResponse;
import org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ArrayOfPackageListMapData;
import org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.BasePackageStatus;
import org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspSoapFault;
import org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetPackageRequest;
import org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetPackageResponse;
import org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ListPackagesRequest;
import org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ListPackagesResponse;
import org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.PackageListMapData;
import org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.WsPackageProcessPingRequest;
import org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.WsPackageProcessStub;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.EspSoapFaultWrapper;

/**
 * Use as soap client for HPCC wsPackageProcess web service.
 * This includes creating a new file, and appending data to a file in the given SHPCC System.
 *
 */
public class HPCCWsPackageProcessClient extends BaseHPCCWsClient
{
    private static final Logger  log                     = Logger.getLogger(HPCCWsPackageProcessClient.class.getName());
    public  static final String  PACKAGEPROCESSURI       = "/WsPackageProcess";

    public static HPCCWsPackageProcessClient get(Connection connection)
    {
        return new HPCCWsPackageProcessClient(connection);
    }

    protected HPCCWsPackageProcessClient(Connection baseConnection)
    {
        initWSPackageProcessStub(baseConnection);
    }

    protected HPCCWsPackageProcessClient(String protocol, String targetHost, String targetPort, String user, String pass)
    {
        Connection conn = new Connection(protocol,targetHost,targetPort);
        conn.setCredentials(user, pass);

        initWSPackageProcessStub(conn);
    }

    protected HPCCWsPackageProcessClient(String protocol, String targetHost, String targetPort, String user, String pass, int timeout)
    {
        Connection conn = new Connection(protocol,targetHost,targetPort);
        conn.setCredentials(user, pass);
        conn.setConnectTimeoutMilli(timeout);
        conn.setSocketTimeoutMilli(timeout);

        initWSPackageProcessStub(conn);
    }

    /**
     * Initializes the service's underlying soap proxy. Should only be used by constructors
     *
     * @param baseURL   Target service base URL
     * @param user      User credentials
     * @param pass      User credentials
     */
    private void initWSPackageProcessStub(Connection conn)
    {
        try
        {
            stub = setStubOptions(new WsPackageProcessStub(conn.getBaseUrl()+PACKAGEPROCESSURI), conn);
        }
        catch (Exception e)
        {
            log.error("Could not initialize WsPackageProcessStub - Review all HPCC connection values");
            if (!e.getLocalizedMessage().isEmpty())
            {
                initErrMessage = e.getLocalizedMessage();
                log.error(e.getLocalizedMessage());
            }
        }
    }

    public boolean ping() throws Exception
    {
        verifyStub();

        WsPackageProcessPingRequest request = new WsPackageProcessPingRequest();

        try
        {
            ((WsPackageProcessStub)stub).ping(request);
        }
        catch (Exception e)
        {
            return false;
        }

        return true;
    }


    /**
     * @param globalScope
     * @param packageMapName
     * @param process
     * @param target
     * @return BasePackageStatus   - Caller should interrogate status object for success
     * @throws Exception           - Caller should handle exception in case of errors
     */
    public BasePackageStatus activatePackage(boolean globalScope, String packageMapName, String process, String target) throws Exception
    {
        log.debug("Attempting to activate package: " + packageMapName);

        verifyStub(); //Throws exception if stub failed

        ActivatePackageRequest request = new ActivatePackageRequest();

        request.setGlobalScope(new Boolean(globalScope));
        request.setPackageMap(packageMapName);
        request.setProcess(process);
        request.setTarget(target);

        ActivatePackageResponse resp = null;

        try
        {
            resp = ((WsPackageProcessStub)stub).activatePackage(request);
        }
        catch (RemoteException e)
        {
            throw new Exception ("WsPackageProcessStub.activatePackage(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspExceptions(new EspSoapFaultWrapper(e), "Could Not perform activatePackage");
        }

        if (resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not perform activatePackage");

        return resp.getStatus();
    }

    /**
     * @param process
     * @param target
     * @return BasePackageStatus   - Caller should interrogate status object for success
     * @throws Exception           - Caller should handle exception in case of errors
     */
    public BasePackageStatus getPackage(String process, String target) throws Exception
    {
        log.debug("Attempting to fetch package process: " + process + " target: " + target);

        verifyStub(); //Throws exception if stub failed

        GetPackageRequest request = new GetPackageRequest();

        request.setProcess(process);
        request.setTarget(target);

        GetPackageResponse resp = null;

        try
        {
            resp = ((WsPackageProcessStub)stub).getPackage(request);
        }
        catch (RemoteException e)
        {
            throw new Exception ("WsPackageProcessStub.getPackage(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspExceptions(new EspSoapFaultWrapper(e), "Could Not perform getPackage");
        }

        if (resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not get package");

        log.debug("Get Package info: " + resp.getInfo());

        return resp.getStatus();
    }

    public PackageListMapData[] listPackages(String process, String target, String processFilter) throws Exception
    {
        log.debug("Attempting to list packages");

        verifyStub(); //Throws exception if stub failed

        PackageListMapData [] packageListMapDataArray = null;
        ListPackagesRequest request = new ListPackagesRequest();

        request.setProcess(process);
        request.setProcessFilter(processFilter);
        request.setTarget(target);

        ListPackagesResponse response = null;

        try
        {
            response = ((WsPackageProcessStub)stub).listPackages(request);
        }
        catch (RemoteException e)
        {
            throw new Exception ("WsPackageProcessStub.listPackages() encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspExceptions(new EspSoapFaultWrapper(e), "Could Not perform list packages");
        }

        if (response.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could Not List packages");

        ArrayOfPackageListMapData packageMapList = response.getPackageMapList();
        if (packageMapList != null)
        {
             packageListMapDataArray = packageMapList.getPackageListMapData();
        }

        return packageListMapDataArray;
    }

    //TO-DO
    /* Implement helper methods for most commonly used tasks:
     *
     *
    ActivatePackage
    AddPackage
    AddPartToPackageMap
    CopyPackageMap
    DeActivatePackage
    DeletePackage
    GetPackage
    GetPackageMapById
    GetPackageMapSelectOptions
    GetPartFromPackageMap
    GetQueryFileMapping
    ListPackage
    RemovePartFromPackageMap
    ValidatePackage
     */
}

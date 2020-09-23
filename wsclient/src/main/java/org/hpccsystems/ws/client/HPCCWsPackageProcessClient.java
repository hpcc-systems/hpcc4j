package org.hpccsystems.ws.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Stub;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ActivatePackageRequest;
import org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ActivatePackageResponse;
import org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ArrayOfPackageListMapData;
import org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault;
import org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageMapByIdRequest;
import org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageMapByIdResponse;
import org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageRequest;
import org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageResponse;
import org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ListPackagesRequest;
import org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ListPackagesResponse;
import org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.RemovePartFromPackageMapRequest;
import org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.RemovePartFromPackageMapResponse;
import org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.WsPackageProcessPingRequest;
import org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.WsPackageProcessStub;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.EspSoapFaultWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wspackageprocess.BasePackageStatusWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wspackageprocess.PackageListMapDataWrapper;
/**
 * Use as soap client for HPCC wsPackageProcess web service.
 * This includes creating a new file, and appending data to a file in the given SHPCC System.
 *
 */
public class HPCCWsPackageProcessClient extends BaseHPCCWsClient
{
    private static final Logger log                = LogManager.getLogger(HPCCWsPackageProcessClient.class);
    public static final String  PACKAGEPROCESSURI  = "/WsPackageProcess";
    private static int          DEFAULTSERVICEPORT = -1;
    private static String       WSDLURL            = null;

    /**
     * Load WSDLURL.
     */
    private static void loadWSDLURL()
    {
        try
        {
            WSDLURL = getServiceWSDLURL(new WsPackageProcessStub());
            DEFAULTSERVICEPORT = (new URL(WSDLURL)).getPort();
        }
        catch (AxisFault | MalformedURLException e)
        {
            log.error("Unable to establish original WSDL URL");
            log.error(e.getLocalizedMessage());
        }
    }

    /**
     * Gets the service URI.
     *
     * @return the service URI
     */
    public static String getServiceURI()
    {
        return PACKAGEPROCESSURI;
    }

    /**
     * Gets the service WSDLURL.
     *
     * @return the service WSDLURL
     */
    public static String getServiceWSDLURL()
    {
        if (WSDLURL == null)
        {
            loadWSDLURL();
        }

        return WSDLURL;
    }

    /**
     * Gets the service WSDL port.
     *
     * @return the service WSDL port
     */
    public static int getServiceWSDLPort()
    {
        if (WSDLURL == null)
        {
            loadWSDLURL();
        }

        return DEFAULTSERVICEPORT;
    }

    /**
     * Gets the.
     *
     * @param connection
     *            the connection
     * @return the HPCC ws package process client
     */
    public static HPCCWsPackageProcessClient get(Connection connection)
    {
        return new HPCCWsPackageProcessClient(connection);
    }

    /**
     * Instantiates a new HPCC ws package process client.
     *
     * @param baseConnection
     *            the base connection
     */
    protected HPCCWsPackageProcessClient(Connection baseConnection)
    {
        initWSPackageProcessStub(baseConnection);
    }

    /**
     * Instantiates a new HPCC ws package process client.
     *
     * @param protocol
     *            the protocol
     * @param targetHost
     *            the target host
     * @param targetPort
     *            the target port
     * @param user
     *            the user
     * @param pass
     *            the pass
     */
    protected HPCCWsPackageProcessClient(String protocol, String targetHost, String targetPort, String user, String pass)
    {
        Connection conn = new Connection(protocol, targetHost, targetPort);
        conn.setCredentials(user, pass);

        initWSPackageProcessStub(conn);
    }

    /**
     * Instantiates a new HPCC ws package process client.
     *
     * @param protocol
     *            the protocol
     * @param targetHost
     *            the target host
     * @param targetPort
     *            the target port
     * @param user
     *            the user
     * @param pass
     *            the pass
     * @param timeout
     *            the timeout
     */
    protected HPCCWsPackageProcessClient(String protocol, String targetHost, String targetPort, String user, String pass, int timeout)
    {
        Connection conn = new Connection(protocol, targetHost, targetPort);
        conn.setCredentials(user, pass);
        conn.setConnectTimeoutMilli(timeout);
        conn.setSocketTimeoutMilli(timeout);

        initWSPackageProcessStub(conn);
    }

    /**
     * Initializes the service's underlying soap proxy. Should only be used by constructors
     *
     * @param conn
     *            the conn
     */
    private void initWSPackageProcessStub(Connection conn)
    {
        try
        {
            stub = setStubOptions(new WsPackageProcessStub(conn.getBaseUrl() + PACKAGEPROCESSURI), conn);
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

    /**
     * Ping.
     *
     * @return true, if successful
     * @throws Exception
     *             the exception
     */
    public boolean ping() throws Exception
    {
        verifyStub();

        WsPackageProcessPingRequest request = new WsPackageProcessPingRequest();

        try
        {
            ((WsPackageProcessStub) stub).ping(request);
        }
        catch (Exception e)
        {
            return false;
        }

        return true;
    }

    /**
     * Gets the package map by id.
     *
     * @param packageMapName
     *            the package map name
     * @return String - packagemap content
     * @throws Exception
     *             - Caller should handle exception in case of errors
     * @throws ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public String getPackageMapById(String packageMapName) throws Exception, ArrayOfEspExceptionWrapper
    {

        verifyStub(); // Throws exception if stub failed

        GetPackageMapByIdRequest req = new GetPackageMapByIdRequest();
        req.setPackageMapId(packageMapName);

        GetPackageMapByIdResponse resp = null;

        try
        {
            resp = ((WsPackageProcessStub) stub).getPackageMapById(req);
        }
        catch (RemoteException e)
        {
            throw new Exception("WsPackageProcessStub.getPackageMapById(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not perform getPackageMapById");
        }

        if (resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not get packagemap " + packageMapName);

        return resp.getInfo();
    }

    /**
     * Activate package.
     *
     * @param globalScope
     *            the global scope
     * @param packageMapName
     *            the package map name
     * @param process
     *            the process
     * @param target
     *            the target
     * @return BasePackageStatus - Caller should interrogate status object for success
     * @throws Exception
     *             - Caller should handle exception in case of errors
     * @throws ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public BasePackageStatusWrapper activatePackage(boolean globalScope, String packageMapName, String process, String target)
            throws Exception, ArrayOfEspExceptionWrapper
    {
        log.debug("Attempting to activate package: " + packageMapName);

        verifyStub(); // Throws exception if stub failed

        ActivatePackageRequest request = new ActivatePackageRequest();

        request.setGlobalScope(globalScope);
        request.setPackageMap(packageMapName);
        request.setProcess(process);
        request.setTarget(target);

        ActivatePackageResponse resp = null;

        try
        {
            resp = ((WsPackageProcessStub) stub).activatePackage(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("WsPackageProcessStub.activatePackage(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not perform activatePackage");
        }

        if (resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not perform activatePackage");

        if (resp.getStatus() != null)
            return new BasePackageStatusWrapper(resp.getStatus());

        return null;
    }

    /**
     * Gets the package.
     *
     * @param process
     *            the process
     * @param target
     *            the target
     * @return BasePackageStatus - Caller should interrogate status object for success
     * @throws Exception
     *             - Caller should handle exception in case of errors
     * @throws ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public BasePackageStatusWrapper getPackage(String process, String target) throws Exception, ArrayOfEspExceptionWrapper
    {
        log.debug("Attempting to fetch package process: " + process + " target: " + target);

        verifyStub(); // Throws exception if stub failed

        GetPackageRequest request = new GetPackageRequest();

        request.setProcess(process);
        request.setTarget(target);

        GetPackageResponse resp = null;

        try
        {
            resp = ((WsPackageProcessStub) stub).getPackage(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("WsPackageProcessStub.getPackage(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not perform getPackage");
        }

        if (resp.getExceptions() != null) handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not get package");

        log.debug("Get Package info: " + resp.getInfo());

        if (resp.getStatus() != null)
            return new BasePackageStatusWrapper(resp.getStatus());

        return null;
    }

    /**
     * Remove a part from a package map.
     *
     * @param globalScope
     *            Global or non global scoped.
     * @param partName
     *            The part name to remove.
     * @param target
     *            The target.
     * @param packageMap
     *            The package map id.
     * @return BasePackageStatus - Caller should interrogate status object for success
     * @throws Exception
     *             - Caller should handle exception in case of errors
     */
    public BasePackageStatusWrapper removePartFromPackageMap(final boolean globalScope, final String partName, final String target, final String packageMap)
            throws Exception
    {
        log.debug("Attempting to remove package part.");

        verifyStub(); // Throws exception if stub failed

        RemovePartFromPackageMapRequest request = new RemovePartFromPackageMapRequest();
        request.setGlobalScope(globalScope);
        request.setPartName(partName);
        request.setPackageMap(packageMap);
        request.setTarget(target);

        RemovePartFromPackageMapResponse resp = null;

        try
        {
            resp = ((WsPackageProcessStub) stub).removePartFromPackageMap(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("WsPackageProcessStub.removePartFromPackageMap() encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could not remove package part.");
        }

        if (resp.getExceptions() != null)
        {
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not Remove package part");
        }

        if (resp.getStatus() != null)
            return new BasePackageStatusWrapper(resp.getStatus());

        return null;
    }

    /*@deprecated
    public PackageListMapData[] listPackages(String process, String target, String processFilter) throws Exception, ArrayOfEspExceptionWrapper*/

    /**
     * List packages.
     *
     * @param process
     *            the process
     * @param target
     *            the target
     * @param processFilter
     *            the process filter
     * @return List of PackageListMapDataWrappers
     * @throws Exception
     *             the exception
     * @throws ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public List<PackageListMapDataWrapper> listPackages(String process, String target, String processFilter) throws Exception, ArrayOfEspExceptionWrapper
    {
        log.debug("Attempting to list packages");

        verifyStub(); // Throws exception if stub failed

        List<PackageListMapDataWrapper> result = null;
        ListPackagesRequest request = new ListPackagesRequest();

        request.setProcess(process);
        request.setProcessFilter(processFilter);
        request.setTarget(target);

        ListPackagesResponse response = null;

        try
        {
            response = ((WsPackageProcessStub) stub).listPackages(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("WsPackageProcessStub.listPackages() encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not perform list packages");
        }

        if (response.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could Not List packages");

        ArrayOfPackageListMapData packageMapList = response.getPackageMapList();
        if (packageMapList != null)
        {
            result = Arrays.stream(packageMapList.getPackageListMapData()).map(PackageListMapDataWrapper::new).collect(Collectors.toList());
        }

        return result;
    }

    // TO-DO
    /*
     * Implement helper methods for most commonly used tasks:
     *
     *
     * ActivatePackage
     * AddPackage
     * AddPartToPackageMap
     * CopyPackageMap
     * DeActivatePackage
     * DeletePackage
     * GetPackage
     * GetPackageMapById
     * GetPackageMapSelectOptions
     * GetPartFromPackageMap
     * GetQueryFileMapping
     * ListPackage
     * ValidatePackage
     */

    /*
     * (non-Javadoc)
     *
     * @see org.hpccsystems.ws.client.BaseHPCCWsClient#getDefaultStub()
     */
    @Override
    public Stub getDefaultStub() throws AxisFault
    {
        return new WsPackageProcessStub();
    }
}

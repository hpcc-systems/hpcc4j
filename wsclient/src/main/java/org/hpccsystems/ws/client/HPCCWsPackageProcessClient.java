package org.hpccsystems.ws.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import org.apache.logging.log4j.*;
import org.apache.axis.client.Stub;

import org.hpccsystems.ws.client.gen.wsfileio.v1_0.ArrayOfEspException;
import org.hpccsystems.ws.client.gen.wsfileio.v1_0.CreateFileRequest;
import org.hpccsystems.ws.client.gen.wsfileio.v1_0.CreateFileResponse;
import org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ActivatePackageRequest;
import org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ActivatePackageResponse;
import org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.BasePackageStatus;
import org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.EspException;
import org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.GetPackageRequest;
import org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.GetPackageResponse;
import org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.WsPackageProcessServiceSoap;
import org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.WsPackageProcessServiceSoapProxy;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.utils.DataSingleton;
import org.hpccsystems.ws.client.utils.EqualsUtil;
import org.hpccsystems.ws.client.utils.HashCodeUtil;
import org.hpccsystems.ws.client.utils.Utils;

/**
 * Use as soap client for HPCC wsPackageProcess web service.
 * This includes creating a new file, and appending data to a file in the given SHPCC System.
 *
 */
public class HPCCWsPackageProcessClient extends DataSingleton
{
    private static final Logger         log = LogManager.getLogger(HPCCWsPackageProcessClient.class.getName());
    private static URL                  originalURL;

    public static URL getOriginalURL() throws MalformedURLException
    {
        if (originalURL == null)
            originalURL = new URL(getOriginalWSDLURL());

        return originalURL;
    }

    public static int getOriginalPort() throws MalformedURLException
    {
        return getOriginalURL().getPort();
    }

    public static HPCCWsPackageProcessClient get(Connection connection)
    {
        return new HPCCWsPackageProcessClient(connection);
    }

    public static final String PACKAGEPROCESSURI         = "/WsPackageProcess";

    private WsPackageProcessServiceSoapProxy wsPackageProcessServiceSoapProxy    =  null;
    private boolean verbose = false;

    /**
     * @param verbose - sets verbose mode
     */
    public void setVerbose(boolean verbose)
    {
        this.verbose = verbose;
    }

    /**
     * Provides soapproxy object for HPCCWsPackageProcessClient which can be used to access
     * the web service methods directly
     * @return  soapproxy for HPCCWsPackageProcessClient
     * @throws Exception if soapproxy not available.
     */
    public WsPackageProcessServiceSoapProxy getSoapProxy() throws Exception
    {
        if (wsPackageProcessServiceSoapProxy != null)
            return wsPackageProcessServiceSoapProxy;
        else
            throw new Exception("WsPackageProcessServiceSoapProxy not available.");
    }

    /**
     * Provides the WSDL URL originally used to create the underlying stub code
     *
     * @return original WSLD URL
     */
    public static String getOriginalWSDLURL()
    {
        return (new org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.WsPackageProcessLocator()).getWsPackageProcessServiceSoapAddress();
    }

    protected HPCCWsPackageProcessClient(WsPackageProcessServiceSoapProxy wsPackageProcessServiceSoapProxy)
    {
        this.wsPackageProcessServiceSoapProxy = wsPackageProcessServiceSoapProxy;
    }

    protected HPCCWsPackageProcessClient(Connection baseConnection)
    {
       this(baseConnection.getProtocol(), baseConnection.getHost(), baseConnection.getPort(), baseConnection.getUserName(), baseConnection.getPassword());
    }

    protected HPCCWsPackageProcessClient(String protocol, String targetHost, String targetPort, String user, String pass)
    {
        String address = Connection.buildUrl(protocol, targetHost, targetPort, PACKAGEPROCESSURI);

        initWSPackageProcessSoapProxy(address, user, pass);
    }

    /**
     * Initializes the service's underlying soap proxy. Should only be used by constructors
     *
     * @param baseURL   Target service base URL
     * @param user      User credentials
     * @param pass      User credentials
     */
    private void initWSPackageProcessSoapProxy(String baseURL, String user, String pass)
    {
        wsPackageProcessServiceSoapProxy = new WsPackageProcessServiceSoapProxy(baseURL);
        if (wsPackageProcessServiceSoapProxy != null)
        {
                WsPackageProcessServiceSoap wsPackageProcessServiceSoap = wsPackageProcessServiceSoapProxy.getWsPackageProcessServiceSoap();
                if (wsPackageProcessServiceSoap != null)
                {
                    if (user != null && pass != null)
                        Connection.initStub((Stub) wsPackageProcessServiceSoap, user, pass);
                }
        }
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

        if (wsPackageProcessServiceSoapProxy == null)
            throw new Exception ("wsPackageProcessServiceSoapProxy not available!");

        ActivatePackageRequest activatepackageparams = new ActivatePackageRequest();
        activatepackageparams.setGlobalScope(new Boolean(globalScope));
        activatepackageparams.setPackageMap(packageMapName);
        activatepackageparams.setProcess(process);
        activatepackageparams.setTarget(target);

        try
        {
            ActivatePackageResponse activatepackageresp = wsPackageProcessServiceSoapProxy.activatePackage(activatepackageparams);
            org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ArrayOfEspException arrayOfEspExceptions = activatepackageresp.getExceptions();
            if (arrayOfEspExceptions == null)
            {
                return activatepackageresp.getStatus();
            }
            else
            {
                org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.EspException[] espexceptions = arrayOfEspExceptions.getException();
                for (org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.EspException espexception : espexceptions)
                {
                    log.error("\tESPException: " + espexception.getMessage());
                }

            }
        }
        catch (ArrayOfEspException e)
        {
            e.printStackTrace();
        }
        catch (RemoteException e)
        {
            e.printStackTrace();
        }

        return null;
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

        if (wsPackageProcessServiceSoapProxy == null)
            throw new Exception ("wsPackageProcessServiceSoapProxy not available!");

        GetPackageRequest getpackageparams = new GetPackageRequest();
        getpackageparams.setProcess(process);
        getpackageparams.setTarget(target);

        try
        {
            GetPackageResponse getpackageresp = wsPackageProcessServiceSoapProxy.getPackage(getpackageparams);
            org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ArrayOfEspException arrayOfEspExceptions = getpackageresp.getExceptions();
            if (arrayOfEspExceptions == null)
            {
                log.debug("Get Package info: " + getpackageresp.getInfo());
                return getpackageresp.getStatus();
            }
            else
            {
                org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.EspException[] espexceptions = arrayOfEspExceptions.getException();
                for (org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.EspException espexception : espexceptions)
                {
                    log.error("\tESPException: " + espexception.getMessage());
                }

            }
        }
        catch (ArrayOfEspException e)
        {
            e.printStackTrace();
        }
        catch (RemoteException e)
        {
            e.printStackTrace();
        }

        return null;
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
    Echo
    GetPackage
    GetPackageMapById
    GetPackageMapSelectOptions
    GetPartFromPackageMap
    GetQueryFileMapping
    ListPackage
    ListPackages
    RemovePartFromPackageMap
    ValidatePackage
     */
    @Override
    protected boolean isComplete()
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    protected void fastRefresh()
    {
        // TODO Auto-generated method stub
    }

    @Override
    protected void fullRefresh()
    {
        // TODO Auto-generated method stub
    }

    @Override
    public boolean equals(Object aThat)
    {
        if (this == aThat)
        {
            return true;
        }

        if (!(aThat instanceof HPCCWsPackageProcessClient))
        {
            return false;
        }

        HPCCWsPackageProcessClient that = (HPCCWsPackageProcessClient) aThat;
        WsPackageProcessServiceSoapProxy thatSoapProxy;
        try
        {
            thatSoapProxy = that.getSoapProxy();
        }
        catch(Exception e)
        {
            thatSoapProxy = null;
        }

        return EqualsUtil.areEqual(wsPackageProcessServiceSoapProxy.getEndpoint(), thatSoapProxy.getEndpoint()) &&
                EqualsUtil.areEqual(((Stub) wsPackageProcessServiceSoapProxy.getWsPackageProcessServiceSoap()).getUsername(), ((Stub) thatSoapProxy.getWsPackageProcessServiceSoap()).getUsername()) &&
                EqualsUtil.areEqual(((Stub) wsPackageProcessServiceSoapProxy.getWsPackageProcessServiceSoap()).getPassword(), ((Stub) thatSoapProxy.getWsPackageProcessServiceSoap()).getPassword());
    }

    @Override
    public int hashCode()
    {
        int result = HashCodeUtil.SEED;
        result = HashCodeUtil.hash(result, wsPackageProcessServiceSoapProxy.getEndpoint());
        result = HashCodeUtil.hash(result, ((Stub)  wsPackageProcessServiceSoapProxy.getWsPackageProcessServiceSoap()).getUsername());
        result = HashCodeUtil.hash(result, ((Stub)  wsPackageProcessServiceSoapProxy.getWsPackageProcessServiceSoap()).getPassword());
        return result;
    }

}

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
import org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPackageRequest;
import org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPackageResponse;
import org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ArrayOfPackageListMapData;
import org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.DeletePackageRequest;
import org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.DeletePackageResponse;
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
import org.hpccsystems.ws.client.wrappers.gen.wspackageprocess.AddPackageRequestWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wspackageprocess.BasePackageStatusWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wspackageprocess.DeletePackageRequestWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wspackageprocess.PackageListMapDataWrapper;
/**
 * Use as soap client for HPCC wsPackageProcess web service.
 * This includes creating a new file, and appending data to a file in the given SHPCC System.
 */
public class HPCCWsPackageProcessClient extends BaseHPCCWsClient
{
    private static final Logger log                = LogManager.getLogger(HPCCWsPackageProcessClient.class);
    /** Constant <code>PACKAGEPROCESSURI="/WsPackageProcess"</code> */
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
    public String getServiceURI()
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
            setActiveConnectionInfo(conn);
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
     * @throws java.lang.Exception
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
            log.error(e.getLocalizedMessage());
            return false;
        }

        return true;
    }

    /**
     * <p>addPackage.</p>
     *
     * @param packageMapID      - The name of the new packagemap
     * @param packageMapContent - The packagemap content
     * @param targetCluster     - The packagemap cluster name
     * @param daliip            - The target Dali IP
     *
     * All other request values are defaulted
     * @throws Exception a {@link java.lang.Exception} object.
     * @return a {@link org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPackageResponse} object.
     */
    public AddPackageResponse addPackage(String packageMapID, String packageMapContent, String targetCluster, String daliip) throws Exception
    {
        return addPackage(packageMapID, packageMapContent, targetCluster, null, null, null, daliip, null, null, null, null, null, null, null, null);
    }

    /**
     * <p>addPackage.</p>
     *
     * @param packageMapID      - The name of the new packagemap
     * @param packageMapContent - The packagemap content
     * @param targetCluster     - The packagemap cluster name
     * @param daliip            - The target Dali IP
     * @param overwrite         - Option to overwrite package map is pre-existing
     *
     * All other request values are defaulted
     * @throws Exception a {@link java.lang.Exception} object.
     * @return a {@link org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPackageResponse} object.
     */
    public AddPackageResponse addPackage(String packageMapID, String packageMapContent, String targetCluster, String daliip, Boolean overwrite) throws Exception
    {
        return addPackage(packageMapID, packageMapContent, targetCluster, null, null, null, daliip, null, overwrite, null, null, null, null, null, null);
    }

    /**
     * <p>addPackage.</p>
     *
     * @param packageMapID      - The name of the new packagemap
     * @param packageMapContent - The packagemap content
     * @param targetCluster     - The packagemap cluster name
     * @param daliip            - The target Dali IP
     * @param overwrite         - Option to overwrite package map is pre-existing
     * @throws Exception a {@link java.lang.Exception} object.
     * @param active a {@link java.lang.Boolean} object.
     * @return a {@link org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPackageResponse} object.
     */
    public AddPackageResponse addPackage(String packageMapID, String packageMapContent, String targetCluster, String daliip, Boolean overwrite, Boolean active) throws Exception
    {
        return addPackage(packageMapID, packageMapContent, targetCluster, active, null, null, daliip, null, overwrite, null, null, null, null, null, null);
    }

    /**
     * <p>addPackage.</p>
     *
     * @param packageMapID       - The name of the new packagemap
     * @param packageMapContent  - The packagemap content
     * @param targetCluster      - The packagemap cluster name
     * @param active             - Option to set new package map as active
     * @param allowforeignfiles  - Option to allow foreing files
     * @param appendcluster      - Option to append cluster
     * @param daliip             - The target Dali IP
     * @param globalscope        - Global scope option
     * @param overwrite          - Option to overwrite package map is pre-existing
     * @param preloadallpackages - Option to pre-load all packages
     * @param process            - Target process
     * @param replacepackagemap  - Option to replace packagemap
     * @param sourceprocess      - The source process
     * @param updateclonefrom    - Option to update clone from
     * @param updatesuperfiles   - Option to update superfiles
     * @throws Exception a {@link java.lang.Exception} object.
     * @return a {@link org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPackageResponse} object.
     */
    public AddPackageResponse addPackage(String packageMapID, String packageMapContent, String targetCluster, Boolean active, Boolean allowforeignfiles, Boolean appendcluster,
                                         String daliip, Boolean globalscope, Boolean overwrite, Boolean preloadallpackages, String process, Boolean replacepackagemap, String sourceprocess,
                                         Boolean updateclonefrom, Boolean updatesuperfiles) throws Exception
    {
        verifyStub(); // Throws exception if stub failed

        AddPackageRequest req = new AddPackageRequest();
        if (packageMapID != null)
            req.setPackageMap(packageMapID);
        if (packageMapContent != null)
            req.setInfo(packageMapContent);
        if (targetCluster != null)
            req.setTarget(targetCluster);
        if (active != null)
            req.setActivate(active.booleanValue());
        if (allowforeignfiles != null)
            req.setAllowForeignFiles(allowforeignfiles.booleanValue());
        if (appendcluster != null)
            req.setAppendCluster(appendcluster.booleanValue());
        if (daliip != null)
            req.setDaliIp(daliip);
        if (globalscope != null)
            req.setGlobalScope(globalscope.booleanValue());
        if (overwrite != null)
            req.setOverWrite(overwrite.booleanValue());
        if (preloadallpackages != null)
            req.setPreloadAllPackages(preloadallpackages.booleanValue());

        AddPackageResponse resp = null;

        try
        {
            resp = ((WsPackageProcessStub) stub).addPackage(req);
        }
        catch (RemoteException e)
        {
            throw new Exception("WsPackageProcessStub.addPackage(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not perform addPackage");
        }

        if (resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not addPackage");

        return resp;
    }

    /**
     * <p>addPackage.</p>
     *
     * @param reqwrapper - Add package request options object (AddPackageRequestWrapper)
     *                     Caller is responsible for setting all options appropriately
     *                     This call might override server side defaults
     * @throws Exception a {@link java.lang.Exception} object.
     * @return           - Add package response object
     *                     Caller is responsible for interpreting response codes/status.
     *                     Function will report Java Exception if service reports any exceptions
     */
    public AddPackageResponse addPackage(AddPackageRequestWrapper reqwrapper) throws Exception
    {
        verifyStub(); // Throws exception if stub failed

        AddPackageRequest req = new AddPackageRequest();
        req.setActivate(reqwrapper.getActivate());
        req.setAllowForeignFiles(reqwrapper.getAllowForeignFiles());
        req.setAppendCluster(reqwrapper.getAppendCluster());
        req.setDaliIp(reqwrapper.getDaliIp());
        req.setGlobalScope(reqwrapper.getGlobalScope());
        req.setInfo(reqwrapper.getInfo());
        req.setOverWrite(reqwrapper.getOverWrite());
        req.setPackageMap(reqwrapper.getPackageMap());
        req.setPreloadAllPackages(reqwrapper.getPreloadAllPackages());
        req.setProcess(reqwrapper.getProcess());
        req.setReplacePackageMap(reqwrapper.getReplacePackageMap());
        req.setSourceProcess(reqwrapper.getSourceProcess());
        req.setTarget(reqwrapper.getTarget());
        req.setUpdateCloneFrom(reqwrapper.getUpdateCloneFrom());
        req.setUpdateSuperFiles(reqwrapper.getUpdateSuperFiles());

        AddPackageResponse resp = null;

        try
        {
            resp = ((WsPackageProcessStub) stub).addPackage(req);
        }
        catch (RemoteException e)
        {
            throw new Exception("WsPackageProcessStub.addPackage(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not perform addPackage");
        }

        if (resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not addPackage");

        return resp;
    }

    /**
     * Request to delete package map, defaults to ALL process
     *
     * @param packageMapID  - The packagemap to delete
     * @param targetcluster - The packagemap cluster
     * @throws Exception a {@link java.lang.Exception} object.
     * @return a {@link org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.DeletePackageResponse} object.
     */
    public DeletePackageResponse deletePackage(String packageMapID, String targetcluster) throws Exception
    {
        return deletePackage(packageMapID, targetcluster, "*");
    }

    /**
     * Request to delete package map
     *
     * @param packageMapID  - The packagemap to delete
     * @param targetcluster - The packagemap cluster
     * @param process       - The process
     * @throws Exception a {@link java.lang.Exception} object.
     * @return a {@link org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.DeletePackageResponse} object.
     */
    public DeletePackageResponse deletePackage(String packageMapID, String targetcluster, String process) throws Exception
    {
        return deletePackage(packageMapID, targetcluster, process, null);
    }

    /**
     * Request to delete package map
     *
     * @param packageMapID  - The packagemap to delete
     * @param targetcluster - The packagemap cluster
     * @param process       - The process
     * @param globalscope   - Is the target packagemap global scoped
     * @throws Exception a {@link java.lang.Exception} object.
     * @return a {@link org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.DeletePackageResponse} object.
     */
    public DeletePackageResponse deletePackage(String packageMapID, String targetcluster, String process, Boolean globalscope) throws Exception
    {
        verifyStub(); // Throws exception if stub failed

        DeletePackageRequest req = new DeletePackageRequest();

        if (packageMapID != null)
            req.setPackageMap(packageMapID);
        if (targetcluster != null)
            req.setTarget(targetcluster);
        if (process != null)
            req.setProcess(process);
        if (globalscope != null)
            req.setGlobalScope(globalscope.booleanValue());

        DeletePackageResponse resp = null;

        try
        {
            resp = ((WsPackageProcessStub) stub).deletePackage(req);
        }
        catch (RemoteException e)
        {
            throw new Exception("WsPackageProcessStub.deletePackage(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not perform deletePackage(" + req.getPackageMap() +")");
        }

        if (resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not deletePackage");

        return resp;
    }

    /**
     * <p>deletePackage.</p>
     *
     * @param reqwrapper - Delete package request options object (DeletePackageRequestWrapper)
     *                     Caller is responsible for setting all options appropriately
     *                     This call might override server side defaults
     * @return           - Delete package response object
     *                     Caller is responsible for interpreting response codes/status.
     * @throws Exception a {@link java.lang.Exception} object.
     */
    public DeletePackageResponse deletePackage(DeletePackageRequestWrapper reqwrapper) throws Exception
    {
        verifyStub(); // Throws exception if stub failed

        DeletePackageRequest req = new DeletePackageRequest();
        req.setPackageMap(reqwrapper.getPackageMap());
        req.setGlobalScope(reqwrapper.getGlobalScope());
        req.setProcess(reqwrapper.getProcess());
        req.setTarget(reqwrapper.getTarget());

        DeletePackageResponse resp = null;

        try
        {
            resp = ((WsPackageProcessStub) stub).deletePackage(req);
        }
        catch (RemoteException e)
        {
            throw new Exception("WsPackageProcessStub.deletePackage(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not perform deletePackage(" + req.getPackageMap() +")");
        }

        if (resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not deletePackage");

        return resp;
    }

    /**
     * Gets the package map by id.
     *
     * @param packageMapName
     *            the package map name
     * @return String - packagemap content
     * @throws Exception a {@link java.lang.Exception} object.
     *             - Caller should handle exception in case of errors
     * @throws ArrayOfEspExceptionWrapper a {@link org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper} object.
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
     * @throws Exception a {@link java.lang.Exception} object.
     *             - Caller should handle exception in case of errors
     * @throws ArrayOfEspExceptionWrapper a {@link org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper} object.
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
     * @throws Exception a {@link java.lang.Exception} object.
     *             - Caller should handle exception in case of errors
     * @throws ArrayOfEspExceptionWrapper a {@link org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper} object.
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
     * @throws Exception a {@link java.lang.Exception} object.
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
     * @throws Exception a {@link java.lang.Exception} object.
     *             the exception
     * @throws ArrayOfEspExceptionWrapper a {@link org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper} object.
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
    /** {@inheritDoc} */
    @Override
    public Stub getDefaultStub() throws AxisFault
    {
        return new WsPackageProcessStub();
    }
}

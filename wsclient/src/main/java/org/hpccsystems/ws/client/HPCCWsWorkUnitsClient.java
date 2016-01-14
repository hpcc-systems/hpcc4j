package org.hpccsystems.ws.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;

import org.apache.axis.client.Stub;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ApplicationValue;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLException;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLWorkunit;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.EspException;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySet;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUAbort;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUAction;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUActionResponse;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCreateAndUpdate;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUDelete;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUInfo;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUInfoDetails;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUInfoResponse;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUPublishWorkunit;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUPublishWorkunitResponse;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuery;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryResponse;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetDetailsResponse;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerysetDetails;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerysets;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerysetsResponse;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResubmit;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResult;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultResponse;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WURun;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WURunResponse;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUSubmit;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUSubmitResponse;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUSyntaxCheckECL;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUSyntaxCheckResponse;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUUpdateResponse;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WsWorkunitsServiceSoap;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WsWorkunitsServiceSoapProxy;
import org.hpccsystems.ws.client.platform.DataSingleton;
import org.hpccsystems.ws.client.platform.WUState;
import org.hpccsystems.ws.client.platform.WorkunitInfo;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.utils.EqualsUtil;
import org.hpccsystems.ws.client.utils.HashCodeUtil;
import org.hpccsystems.ws.client.utils.Utils;

/**
 *
 * ESP Client code for common WsWorkUnits operations
 */
public class HPCCWsWorkUnitsClient extends DataSingleton
{
    public static HPCCWsWorkUnitsClient get(Connection connection)
    {
        return new HPCCWsWorkUnitsClient(connection);
    }

    public static final String          WSWORKUNITSWSDLURI          = "/WsWorkunits";
    private WsWorkunitsServiceSoapProxy wsWorkunitsServiceSoapProxy = null;
    public static final int             defaultWaitTime             = 10000;
    public static final int             defaultResultLimit          = 100;
    public static final int             defaultMaxWaitTime          = 1000 * 60 * 5;

    private boolean                     verbose                     = false;

    private static URL                  originalURL;
    
    enum WuActions
    {
        delete,
        abort,
        pausenow,
        pause,
        resume,
        protect,
        unprotect,
        restore,
        reschedule,
        deschedule,
        settofailed
        ;
        
        /*
         * try
    	{
    		WuActions action = Utils.findEnumValFromString(WuActions.class, "abort");
            System.out.println(action.toString());
    	}
    	catch (Exception e)
    	{
    		System.out.println(e.getLocalizedMessage());
    	}
         */
    }

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

    protected void fastWURefresh(WorkunitInfo wu) throws Exception
    {
        getSoapProxy();

        WUState previousState = getStateID(wu);

        WUQuery request = new WUQuery();
        request.setWuid(wu.getWuid());
        request.setCount(1);

        WUQueryResponse response = wsWorkunitsServiceSoapProxy.WUQuery(request);
        if (response.getWorkunits() != null && response.getWorkunits().length == 1)
        {
            wu.update(response.getWorkunits()[0]);
        }

        if (previousState != getStateID(wu))
        {
            fullWURefresh(wu);
        }
    }

    protected void fullWURefresh(WorkunitInfo wu) throws Exception
    {
        fullWURefresh(wu, true, true, true, true);
    }

    void fullWURefresh(WorkunitInfo wu, boolean includeGraphs, boolean includeResults, boolean includeSourceFiles,
            boolean includeApplicationValues) throws Exception
    {
        getSoapProxy();

        WUInfo request = new WUInfo();
        request.setWuid(wu.getWuid());
        request.setIncludeGraphs(includeGraphs);
        request.setIncludeResults(includeResults);
        request.setIncludeResultsViewNames(includeResults);
        request.setSuppressResultSchemas(!includeResults);
        request.setIncludeSourceFiles(includeSourceFiles);
        request.setIncludeApplicationValues(includeApplicationValues);

        WUInfoResponse response = wsWorkunitsServiceSoapProxy.WUInfo(request);
        if (response.getWorkunit() == null)
        {
            // Call succeeded, but no response...
            for (EspException e : response.getExceptions().getException())
            {
                if (e.getCode().equals("20082") || e.getCode().equals("20080"))
                {
                    //  No longer exists... //$NON-NLS-1$ //$NON-NLS-2$
                    wu.setStateID(999);
                    // setChanged();
                    // notifyObservers(Notification.WORKUNIT);
                    break;
                }
            }
        }
        else
        {
            wu.update(response.getWorkunit());
        }
    }

    /**
     * @param verbose
     *            - sets verbose mode
     */
    public void setVerbose(boolean verbose)
    {
        this.verbose = verbose;
    }

    /**
     * Provides soapproxy object for HPCCWsWorkUnitsClient which can be used to access the web service methods directly
     *
     * @return soapproxy for HPCCWsWorkUnitsClient
     * @throws Exception
     *             if soapproxy not available
     */
    public WsWorkunitsServiceSoapProxy getSoapProxy() throws Exception
    {
        if (wsWorkunitsServiceSoapProxy != null)
            return wsWorkunitsServiceSoapProxy;
        else
            throw new Exception("wsTopologyServiceSoapProxy not available.");
    }

    /**
     * Provides the WSDL URL originally used to create the underlying stub code
     *
     * @return original WSLD URL
     */
    public static String getOriginalWSDLURL()
    {
        return (new org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WsWorkunitsLocator()).getWsWorkunitsServiceSoapAddress();
    }

    protected HPCCWsWorkUnitsClient(WsWorkunitsServiceSoapProxy wsWorkunitsServiceSoapProxy)
    {
        this.wsWorkunitsServiceSoapProxy = wsWorkunitsServiceSoapProxy;
    }

    protected HPCCWsWorkUnitsClient(Connection baseConnection)
    {
        this(baseConnection.getProtocol(), baseConnection.getHost(), baseConnection.getPort(), baseConnection
                .getUserName(), baseConnection.getPassword());
    }

    protected HPCCWsWorkUnitsClient(String protocol, String targetHost, String targetPort, String user, String pass)
    {
        String address = Connection.buildUrl(protocol, targetHost, targetPort, WSWORKUNITSWSDLURI);

        initWsWorkUnitsSoapProxy(address, user, pass);
    }

    /**
     * Initializes the service's underlying soap proxy. Should only be used by constructors
     *
     * @param baseURL
     *            Target service base URL
     * @param user
     *            User credentials
     * @param pass
     *            User credentials
     */
    private void initWsWorkUnitsSoapProxy(String baseURL, String user, String pass)
    {
        wsWorkunitsServiceSoapProxy = new WsWorkunitsServiceSoapProxy(baseURL);
        if (wsWorkunitsServiceSoapProxy != null)
        {
            WsWorkunitsServiceSoap wsWorkunitsServiceSoap = wsWorkunitsServiceSoapProxy.getWsWorkunitsServiceSoap();

            if (user != null && pass != null) Connection.initStub((Stub) wsWorkunitsServiceSoap, user, pass);
        }
    }

    /**
     * Reports if the WU in question is in the compiled state. Makes a call to the target Web Service to extract
     * information about the WU
     *
     * @param wuid
     * @return true if state is compiled
     * @throws Exception
     */
    public boolean isWorkunitCompiled(String wuid) throws Exception
    {
        WorkunitInfo thewui = getWUInfo(wuid);
        if (thewui != null) return isWorkunitCompiled(thewui);

        return false;
    }

    /**
     * Reports if the WU in question is in the compiled state. Does not make call to the target Web Service, extracts
     * information from the WU object
     *
     * @param wuid
     * @return true if state is compiled
     */
    public boolean isWorkunitCompiled(WorkunitInfo thewui)
    {
        return isWorkunitState(getStateID(thewui), WUState.COMPILED);
    }

    /**
     * Reports if the WU in question is in the failed state. Does not make call to the target Web Service, extracts
     * information from the WU object
     *
     * @param wuid
     * @return true if state is failed
     */
    public boolean isWorkunitFailed(WorkunitInfo thewui)
    {
        return isWorkunitState(getStateID(thewui), WUState.FAILED);
    }

    /**
     * Reports if the string state represents the failed state
     *
     * @param state
     * @return true if state is failed
     */
    public boolean isWorkunitFailed(String state)
    {
        return state.equalsIgnoreCase(WUState.FAILED.toString());
    }

    /**
     * Compares two WuStates
     *
     * @param state1
     * @param state2
     * @return true if state1 == state2
     */
    private boolean isWorkunitState(WUState state1, WUState state2)
    {
        return state1 == state2;
    }

    /**
     * Replies true if given wuid is in complete state. This method makes call to WS, it is preferable to use WU object
     * version
     *
     * @param wuid
     * @return
     * @throws Exception
     */
    public boolean isWorkunitComplete(String wuid) throws Exception
    {
        WorkunitInfo thewui = getWUInfo(wuid);
        if (thewui != null) return isWorkunitComplete(thewui);

        return false;
    }

    /**
     * Replies true if given wuid is in complete state. This method does not makea call to WS, and it is preferable over
     * the version that calls WS.
     *
     * @param wuid
     * @return true if wu is in one of the complete states
     * @throws Exception
     */
    static public boolean isWorkunitComplete(WorkunitInfo thewui)
    {
        return isWorkunitComplete(getStateID(thewui));
    }

    /**
     * reports if WuState is in the completed set
     *
     * @param state
     * @return true if state is in completed set
     */
    static public boolean isWorkunitComplete(WUState state)
    {
        switch (state)
        {
            case UNKNOWN_ONSERVER:
            case COMPLETED:
            case FAILED:
            case ABORTED:
            case ARCHIVED:
            case COMPILED:
                return true;
            case ABORTING:
            case BLOCKED:
            case COMPILING:
            case LAST:
            case RUNNING:
            case SCHEDULED:
            case SUBMITTED:
            case UNKNOWN:
            case WAIT:
            default:
                return false;
        }
    }

    /**
     *
     * @param wu
     *            the workunit
     * @return the state of the workunit
     */
    public static WUState getStateID(WorkunitInfo wu)
    {
        if (wu != null)
            return getStateID(wu.getStateID());
        else
            return WUState.UNKNOWN;
    }

    /**
     * Converts integer representation of WU state, to WUState enumeration
     *
     * @param id
     * @return WU state enumeration
     */
    public static WUState getStateID(Integer id)
    {
        switch (id)
        {
            case 1:
                return WUState.COMPILED;
            case 2:
                return WUState.RUNNING;
            case 3:
                return WUState.COMPLETED;
            case 4:
                return WUState.FAILED;
            case 5:
                return WUState.ARCHIVED;
            case 6:
                return WUState.ABORTING;
            case 7:
                return WUState.ABORTED;
            case 8:
                return WUState.BLOCKED;
            case 9:
                return WUState.SUBMITTED;
            case 10:
                return WUState.SCHEDULED;
            case 11:
                return WUState.COMPILING;
            case 12:
                return WUState.WAIT;
            case 13:
                return WUState.WAIT;
            case 14:
                return WUState.WAIT;
            case 15:
                return WUState.RUNNING;
            case 999:
                return WUState.UNKNOWN_ONSERVER;
            default:
                return WUState.UNKNOWN;
        }
    }

    /**
     * Attempts to create, compile and publish a query based on ecl provided.
     *
     * @param ecl
     * @param jobname
     * @param targetcluster
     * @param waitMillis
     * @param resultLimit
     * @return
     * @throws Exception
     */
    public WUPublishWorkunitResponse publishWUFromEcl(WorkunitInfo wu) throws Exception
    {
        WUPublishWorkunitResponse publishWUResp = null;

        if (wsWorkunitsServiceSoapProxy == null)
            throw new Exception("wsWorkunitsServiceSoapProxy not available");
        else if (wu.getECL() == null || wu.getECL().length() == 0)
            throw new Exception("Empty ECL submited");
        else
        {
            WorkunitInfo eclwu = createWUFromECL(wu);

            try
            {
                Thread.sleep(wu.getSleepMillis());
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            submitWU(eclwu); // if no exception proceed
            monitorWUToCompletion(eclwu);
            publishWUResp = publishWU(eclwu);
        }

        return publishWUResp;
    }

    /**
     * Attempts to publish a query based on a given Workunit.
     *
     * @param wu
     * @param jobname
     * @param targetcluster
     * @return
     * @throws Exception
     */
    public WUPublishWorkunitResponse publishWU(WorkunitInfo wu) throws Exception
    {
        WUPublishWorkunitResponse publishWUResp = null;

        if (wsWorkunitsServiceSoapProxy == null)
            throw new Exception("wsWorkunitsServiceSoapProxy not available");
        else if (wu == null)
            throw new Exception("Invalid wuid submited");
        else
        {
            WUPublishWorkunit publishWU = new WUPublishWorkunit();
            publishWU.setJobName(wu.getJobname());
            publishWU.setWuid(wu.getWuid());
            publishWU.setCluster(wu.getCluster());
            publishWU.setActivate((int) 1);

            publishWUResp = wsWorkunitsServiceSoapProxy.WUPublishWorkunit(publishWU);

            org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException exceptions = publishWUResp.getExceptions();
            if (exceptions != null)
            {
                throwWsWUExceptions(exceptions, "Could not publish WU");
            }
        }

        return publishWUResp;
    }

    public void publishWU(String wuid) throws Exception
    {
        if (wsWorkunitsServiceSoapProxy == null)
            throw new Exception("wsWorkunitsServiceSoapProxy not available");
        else if (wuid == null || wuid.isEmpty())
            throw new Exception("Invalid wuid submited");
        else
        {
            WUPublishWorkunit publishWU = new WUPublishWorkunit();
            publishWU.setWuid(wuid);

            wsWorkunitsServiceSoapProxy.WUPublishWorkunit(publishWU);
        }
    }

    /**
     * Get information about a given WorkUnit
     *
     * @param wuid
     *            - ID of target workunit
     * @return - ECLWorkunit object with information pertaining to the WU
     * @throws Exception
     *             - Caller must handle exceptions
     */
    public WorkunitInfo getWUInfo(String wuid) throws Exception
    {
        return getWUInfo(wuid,false);
    }
    /**
     * Get information about a given WorkUnit
     *
     * @param wuid
     *            - ID of target workunit
     * @param unarchive
     *            - unarchive archived workunit
     * @return - ECLWorkunit object with information pertaining to the WU
     * @throws Exception
     *             - Caller must handle exceptions
     */
    public WorkunitInfo getWUInfo(String wuid,boolean unarchive) throws Exception
    {

        WorkunitInfo workunit = null;

        if (wsWorkunitsServiceSoapProxy == null)
            throw new Exception("wsWorkunitsServiceSoapProxy not available");
        else
        {
            WUInfoDetails wuinfodetailsparams = new WUInfoDetails();
            wuinfodetailsparams.setIncludeApplicationValues(false);
            wuinfodetailsparams.setIncludeDebugValues(false);
            wuinfodetailsparams.setIncludeExceptions(true);
            wuinfodetailsparams.setIncludeGraphs(false);
            wuinfodetailsparams.setIncludeResults(true);
            wuinfodetailsparams.setWuid(wuid);

            WUInfoResponse wuInfoResponse = wsWorkunitsServiceSoapProxy.WUInfoDetails(wuinfodetailsparams);

            org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException exceptions = wuInfoResponse.getExceptions();
            if (exceptions == null && wuInfoResponse.getWorkunit() != null)
            {
            	if (unarchive && wuInfoResponse.getWorkunit().getArchived()) {
            		doWorkunitAction(wuid,WuActions.restore);
            		return getWUInfo(wuid);
            	}
                workunit = new WorkunitInfo(wuInfoResponse.getWorkunit());
                workunit.setOriginalEclWatchUrl(getEclWatchUrl());
                
            }
            else
            {
                throwWsWUExceptions(exceptions, "Could not fetch WU Info");
            }
        }

        return workunit;
    }

    public WUInfoResponse getWUInfo(String wuid, boolean includeResults, boolean includeGraphs, boolean includeSourceFiles, boolean includeApplicationValues, Boolean includeDebugValues, Boolean includeExceptions, Boolean includeVariables, Boolean includeXmlSchemas, Boolean includeTimers) throws Exception
    {
        return getWUInfo(wuid,includeResults,includeGraphs,includeSourceFiles,includeApplicationValues,includeDebugValues,includeExceptions,includeVariables,includeXmlSchemas,includeTimers,false);
    }
    public WUInfoResponse getWUInfo(String wuid, boolean includeResults, boolean includeGraphs, boolean includeSourceFiles, boolean includeApplicationValues, Boolean includeDebugValues, Boolean includeExceptions, Boolean includeVariables, Boolean includeXmlSchemas, Boolean includeTimers, boolean unarchive) throws Exception
    {
        if (wsWorkunitsServiceSoapProxy == null)
            throw new Exception("wsWorkunitsServiceSoapProxy not available");
        else
        {
            WUInfo request = new WUInfo();
            request.setWuid(wuid);
            request.setIncludeGraphs(includeGraphs);
            request.setIncludeResults(includeResults);
            request.setIncludeResultsViewNames(includeResults);
            request.setSuppressResultSchemas(!includeResults);
            request.setIncludeSourceFiles(includeSourceFiles);
            request.setIncludeApplicationValues(includeApplicationValues);
            request.setIncludeDebugValues(includeDebugValues);
            request.setIncludeExceptions(includeExceptions);
            request.setIncludeTimers(includeTimers);
            request.setIncludeVariables(includeVariables);
            request.setIncludeXmlSchemas(includeXmlSchemas);

            
            WUInfoResponse resp=wsWorkunitsServiceSoapProxy.WUInfo(request);
            ECLWorkunit wk=resp.getWorkunit();
            if (unarchive && wk != null && wk.getArchived() != null && wk.getArchived())
            {
            	doWorkunitAction(wuid,WuActions.restore);
            	return getWUInfo(wuid, includeResults, includeGraphs, includeSourceFiles, includeApplicationValues, includeDebugValues, includeExceptions, includeVariables, includeXmlSchemas, includeTimers,false);
            }
            return resp;
        }
    }

    /**
     * This method queries WU information using a bogus WUID. Used as a mechanism for testing connectivity with HPCC
     * ESP. Temporarily increases timeout value to 3 seconds;
     *
     * @return - true if able to reply is received within timout value of 3 secs, false otherwise
     * @throws Exception
     *             - Caller must handle exceptions
     */

    public boolean testWUQuery() throws Exception
    {
        int oldTimeout = -1;
        if (wsWorkunitsServiceSoapProxy == null)
            throw new Exception("wsWorkunitsServiceSoapProxy not available");
        else
        {
            WUQuery request = new WUQuery();
            request.setWuid("XXX"); //$NON-NLS-1$
            try
            {
                oldTimeout = ((Stub) wsWorkunitsServiceSoapProxy.getWsWorkunitsServiceSoap()).getTimeout();

                ((org.apache.axis.client.Stub) wsWorkunitsServiceSoapProxy.getWsWorkunitsServiceSoap()).setTimeout(3 * 1000);

                wsWorkunitsServiceSoapProxy.WUQuery(request);
                return true;
            }
            catch (ArrayOfEspException e)
            {}
            catch (RemoteException e)
            {}
            finally
            {
                if (oldTimeout != -1)
                    ((org.apache.axis.client.Stub) wsWorkunitsServiceSoapProxy.getWsWorkunitsServiceSoap())
                            .setTimeout(oldTimeout);
            }
            return false;
        }
    }

    /**
     * Executes a WUQuery, based on parameters provided. If a custom WUQuery is desired, the caller can make a direct
     * call to WUQuery based on the soapproxy for this client.
     *
     * @param wuid
     * @param jobname
     * @param cluster
     * @param type
     * @param sortby
     * @param state
     * @param endDate
     * @param startDate
     * @param pageStartFrom
     * @param pageSize
     * @return
     * @throws Exception
     */
    public WUQueryResponse workUnitUQuery(String wuid, String jobname, String cluster, String type, String sortby,
            String state, String endDate, String startDate, Long pageStartFrom, Long pageSize, Integer count, String owner, String appName, String appKey, String appData) throws Exception
    {
        WUQueryResponse wuQueryResponse = null;
        if (wsWorkunitsServiceSoapProxy == null)
            throw new Exception("wsWorkunitsServiceSoapProxy not available");
        else
        {
            WUQuery request = new WUQuery();
            if (cluster != null) request.setCluster(cluster);
            if (type != null) request.setType(type);
            if (sortby != null) request.setSortby(sortby);
            if (pageStartFrom != null) request.setPageStartFrom(pageStartFrom);
            if (pageSize != null) request.setPageSize(pageSize);
            if (state != null) request.setState(state);
            if (startDate != null) request.setStartDate(startDate);
            if (endDate != null) request.setEndDate(endDate);
            if (wuid != null) request.setWuid(wuid);
            if (jobname != null) request.setJobname(jobname);
            if (count != null) request.setCount(count);
            if (owner != null) request.setOwner(owner);
            if (appKey != null) request.setApplicationKey(appKey);
            if (appData != null) request.setApplicationData(appData);
            if (appName != null) request.setApplicationName(appName);

            wuQueryResponse = wsWorkunitsServiceSoapProxy.WUQuery(request);
            ArrayOfEspException arrayOfEspException = wuQueryResponse.getExceptions();
            if (arrayOfEspException != null)
            {
                throwWsWUExceptions(arrayOfEspException, "Error in WU query");
            }
        }

        return wuQueryResponse;
    }

    /**
     * This method queries information about a given WU and answers if the WU has reported errors.
     *
     * @param wuid
     *            - The ID of the target workunit
     * @return - true if errors present
     * @throws Exception
     *             - Caller must handle exceptions
     */
    public boolean doesWUContainErrors(String wuid) throws Exception
    {
        boolean errsfound = true;
        WorkunitInfo workunit = getWUInfo(wuid);

        if (workunit != null) errsfound = workunit.getErrorCount().intValue() <= 0;

        return errsfound;
    }

    /**
     * Requests target HPCC System to create and compile WU based on ecl provided.
     *
     * @param ecl
     * @param targetCluster
     * @param resultLimit
     * @param debugValues
     * @param jobname
     * @return
     * @throws Exception
     */
    public WorkunitInfo createWUFromECL(WorkunitInfo wu) throws Exception
    {
        WorkunitInfo createdWU = null;

        if (wsWorkunitsServiceSoapProxy == null)
            throw new Exception("wsWorkunitsServiceSoapProxy not available");
        else
        {
            WUCreateAndUpdate wucreateparameters = new WUCreateAndUpdate();
            wucreateparameters.setAction(1); // 1= compile
            wucreateparameters.setQueryText(wu.getECL());
            wucreateparameters.setApplicationValues(wu.getApplicationValues());
            wucreateparameters.setDebugValues(wu.getDebugValues());
            wucreateparameters.setJobname(wu.getJobname());
            wucreateparameters.setClusterOrig(wu.getCluster());
            wucreateparameters.setResultLimit(wu.getResultLimit());

            WUUpdateResponse wuUpdateResponse = wsWorkunitsServiceSoapProxy.WUCreateAndUpdate(wucreateparameters);

            ArrayOfEspException exceptions = wuUpdateResponse.getExceptions();
            if (exceptions == null)
            {
                createdWU = new WorkunitInfo(wuUpdateResponse.getWorkunit());
                createdWU.setMaxMonitorMillis(wu.getMaxMonitorMillis());
                createdWU.setCluster(wu.getCluster());
                createdWU.setJobname(wu.getJobname());
                createdWU.setSleepMillis(wu.getSleepMillis());
                createdWU.setOriginalEclWatchUrl(getEclWatchUrl());
                
            }
            else
            {
                throwWsWUExceptions(exceptions, "Error compiling ECL query");
            }
        }

        return createdWU;
    }

    /*
     * this method is purely for the Platform class
     */
    public WUUpdateResponse createWUFromECL(String archiveOrEcl, int resultLimit, ApplicationValue[] appVals, String jobName, boolean compileOnly) throws Exception
    {
        if (wsWorkunitsServiceSoapProxy == null)
            throw new Exception("wsWorkunitsServiceSoapProxy not available");
        else
        {
            WUCreateAndUpdate request = new WUCreateAndUpdate();
            request.setQueryText(archiveOrEcl);
            request.setJobname(jobName);
            if (compileOnly)
                request.setAction(1);

            request.setApplicationValues(appVals);
            if (resultLimit > 0)
                request.setResultLimit(resultLimit);

            return wsWorkunitsServiceSoapProxy.WUCreateAndUpdate(request);
        }
    }

    /**
     * @param jobName
     *            the pattern to find in the jobname (wildcard * matches multiple jobnames)
     * @param owner
     *            - hpcc owner of the job
     * @param ecl
     *            - text in the ecl
     * @return an ArrayList<ECLWorkunit> of matching workunits
     * @throws Exception
     */
    public ArrayList<WorkunitInfo> getWorkunits(String jobName, String owner, String ecl) throws Exception
    {
        WUQuery params = new WUQuery();
        if (jobName != null)
        {
            params.setJobname(jobName);
        }

        if (owner != null)
        {
            params.setOwner(owner);
        }

        if (ecl != null)
        {
            params.setECL(ecl);
        }
        return getWorkunits(params);
    }

    public ArrayList<WorkunitInfo> getWorkunits(WUQuery params) throws Exception
    {
        ArrayList<WorkunitInfo> wks = new ArrayList<WorkunitInfo>();

        getSoapProxy();
        try
        {
            WUQueryResponse result = wsWorkunitsServiceSoapProxy.WUQuery(params);
            ECLWorkunit[] ecls = result.getWorkunits();

            if (ecls == null)
            {
                return wks;
            }
            for (int i = 0; i < ecls.length; i++)
            {
            	WorkunitInfo w=new WorkunitInfo(ecls[i]);
            	w.setOriginalEclWatchUrl(getEclWatchUrl());
                wks.add(w);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw e;
        }
        return wks;
    }

    /**
     * Given an ECL query, this method will create a WU, compile and run it
     *
     * @param ecl
     *            - The ecl query to compile/run
     * @param targetCluster
     *            - The cluster where the ecl is to be compiled/run
     * @return - Object with WU information
     * @throws Exception
     *             - Caller must handle exceptions
     */
    public WorkunitInfo compileWUFromECL(WorkunitInfo wu ) throws Exception
    {
        Integer sleeptime=wu.getSleepMillis();

        if (sleeptime == null)
        {
            sleeptime = defaultWaitTime;
        }

        WorkunitInfo createdWU = createWUFromECL(wu);

        if (createdWU != null && createdWU.getErrorCount() == 0 && createdWU.getExceptions() == null)
        {
            createdWU.setCluster(wu.getCluster());
            submitWU(createdWU); // if no exception proceed
            this.monitorWUToCompletion(createdWU);
        }
        return createdWU;
    }

    /**
     * Given an ECL query, this method will create a WU, compile and run it
     *
     * @param ecl
     *            - The ecl query to compile/run
     * @param targetCluster
     *            - The cluster where the ecl is to be compiled/run
     * @return - Object with WU information
     * @throws Exception
     *             - Caller must handle exceptions
     */
    public void submitWU(WorkunitInfo wu) throws Exception
    {
        submitWU(wu.getWuid(), wu.getCluster());
    }

    public void submitWU(String wuid, String cluster) throws Exception
    {
        if (wsWorkunitsServiceSoapProxy == null)
            throw new Exception("wsWorkunitsServiceSoapProxy not available");
        else
        {
            WUSubmit wuSubmitParams = new WUSubmit();
            wuSubmitParams.setWuid(wuid);
            wuSubmitParams.setCluster(cluster);

            WUSubmitResponse submitResponse = wsWorkunitsServiceSoapProxy.WUSubmit(wuSubmitParams);

            ArrayOfEspException exceptions = submitResponse.getExceptions();
            if (exceptions != null)
            {
                throwWsWUExceptions(exceptions, "Error compiling ECL query");
            }
        }
    }

    /**
     * Given an ECL query, this method will create a WU, compile and run it
     *
     * @param ecl
     *            - The ecl query to compile/run
     * @param targetCluster
     *            - The cluster where the ecl is to be compiled/run
     * @param resultLimit
     *            - Limit on results
     * @return - Object with WU information
     * @throws Exception
     *             - Caller must handle exceptions
     */
    private WURunResponse createAndRunWUFromECL(WorkunitInfo wu) throws Exception
    {
        WURunResponse wuRunResponse = null;

        if (wsWorkunitsServiceSoapProxy == null)
            throw new Exception("wsWorkunitsServiceSoapProxy not available");
        else
        {
            WorkunitInfo compiledWU = null;
            compiledWU = compileWUFromECL(wu);

            if (compiledWU != null)
            {
                WURun runparameters = new WURun();
                runparameters.setWuid(compiledWU.getWuid());
                runparameters.setVariables(wu.getNamedValues());
                runparameters.setCluster(wu.getCluster());

                wuRunResponse = wsWorkunitsServiceSoapProxy.WURun(runparameters);

                ArrayOfEspException exceptions = wuRunResponse.getExceptions();
                if (exceptions != null)
                {
                    throwWsWUExceptions(exceptions, "Error running WUID: " + compiledWU.getWuid());
                }
                else if (isWorkunitFailed(wuRunResponse.getState()))
                {
                    String error = wuRunResponse.getResults();
                    throw new Exception("Error running WUID: " + compiledWU.getWuid() + ":\n" + error);
                }
            }
        }

        return wuRunResponse;
    }

    /**
     * Given an ECL query, this method will create a WU, compile and run it, and return results in String object - Not
     * recommended for large resultsets.
     *
     * @param ecl
     *            - The ecl query to compile/run
     * @param targetCluster
     *            - The cluster where the ecl is to be compiled/run
     * @param resultLimit
     *            - Limit on results
     * @return - Object with WU information
     * @throws Exception
     *             - Caller must handle exceptions
     */
    public String createAndRunWUFromECLAndGetResults(WorkunitInfo wu) throws Exception
    {
        WURunResponse createAndRunWUFromECL = createAndRunWUFromECL(wu);
        ArrayOfEspException exceptions = createAndRunWUFromECL.getExceptions();
        if (exceptions != null) throwWsWUExceptions(exceptions, "Results contains errors!");
        return createAndRunWUFromECL.getResults();
    }

    /**
     * Given an ECL query, this method will create a WU, compile and run it, and return wuid. Workuinit state, and
     * results can be queried based on WUID
     *
     * @param ecl
     *            - The ecl query to compile/run
     * @param targetCluster
     *            - The cluster where the ecl is to be compiled/run
     * @param resultLimit
     *            - Limit on results
     * @return - Workunit ID
     * @throws Exception
     *             - Caller must handle exceptions
     */
    public String createAndRunWUFromECLAndGetWUID(WorkunitInfo wu) throws Exception
    {
        WURunResponse createAndRunWUFromECL = createAndRunWUFromECL(wu);
        return createAndRunWUFromECL.getWuid();
    }

    /**
     * Fetches results associated with a given Logical name
     *
     * @param wuid
     *            - The target WUID to fetch results from
     * @param sequence
     *            - Zero based index result sequence (Each result set may contain multiple results)
     * @param cluster
     *            - The target cluster
     * @param suppressXMLShema
     *            - Results are accompanied by a schema, do you want to suppress it?
     * @param resultOffset
     *            - Request results starting at record offset
     * @param resultCount
     *            - Total result record count
     * @return
     *            - Results in xml string
     * @throws Exception
     */
    public String fetchResultsFromLogicalName(String logicalName, int sequence, String cluster, boolean suppressXMLShema, long resultOffset, int resultCount) throws Exception
    {
        WUResultResponse wuResultResponse = fetchRawResults(logicalName, false, sequence, cluster, suppressXMLShema, resultOffset, resultCount);
        ArrayOfEspException exceptions = wuResultResponse.getExceptions();
        if (exceptions != null) throwWsWUExceptions(exceptions, "Could not fetch results");

        return wuResultResponse.getResult();
    }

    /**
     * Fetches results associated with a given WUID
     * If the given WUID has been archived, results might not be available using this function
     * Use fetchResultsFromLogicalName instead
     *
     * @param wuid
     *            - The target WUID to fetch results from
     * @param sequence
     *            - Zero based index result sequence (Each result set may contain multiple results)
     * @param cluster
     *            - The target cluster
     * @param suppressXMLShema
     *            - Results are accompanied by a schema, do you want to suppress it?
     * @param resultOffset
     *            - Request results starting at record offset
     * @param resultCount
     *            - Total result record count re
     * @return
     *            - Results in xml string
     * @throws Exception
     */
    public String fetchResults(String wuid, int sequence, String cluster, boolean suppressXMLShema, long resultOffset, int resultCount) throws Exception
    {
        WUResultResponse wuResultResponse = fetchRawResults(wuid, true, sequence, cluster, suppressXMLShema, resultOffset, resultCount);
        ArrayOfEspException exceptions = wuResultResponse.getExceptions();
        if (exceptions != null) throwWsWUExceptions(exceptions, "Could not fetch results");

        return wuResultResponse.getResult();
    }

    public WUResultResponse fetchRawResults(String wuidorlogicalname, boolean useWuid, int sequence, String cluster, boolean suppressXMLShema, long resultOffset, int resultCount) throws Exception
    {
        if (wsWorkunitsServiceSoapProxy == null)
            throw new Exception("wsWorkunitsServiceSoapProxy not available");
        else if (wuidorlogicalname == null || wuidorlogicalname.length()==0)
            throw new Exception("Please provide either WUID or LogicalName");
        else
        {
            WUResult parameters = new WUResult();
            if (useWuid)
                parameters.setWuid(wuidorlogicalname);
            else
                parameters.setLogicalName(wuidorlogicalname);
            parameters.setSequence(sequence);
            parameters.setStart(resultOffset);
            parameters.setCount(resultCount);
            if (cluster != null)
                parameters.setCluster(cluster);
            parameters.setSuppressXmlSchema(suppressXMLShema);

            return fetchRawResults(parameters);
        }
    }

    /**
     * @param wuid   does this string follow the known WU format
     * @return       true if it wuid appears to be a workunit, false otherwise
     *
     * logic borrowed from platform code:
     * workunit.cpp
     * bool looksLikeAWuid(const char * wuid)
     *   {
     *       if (!wuid)
     *           return false;
     *       if (wuid[0] != 'W')
     *           return false;
     *       if (!isdigit(wuid[1]) || !isdigit(wuid[2]) || !isdigit(wuid[3]) || !isdigit(wuid[4]))
     *           return false;
     *       if (!isdigit(wuid[5]) || !isdigit(wuid[6]) || !isdigit(wuid[7]) || !isdigit(wuid[8]))
     *           return false;
     *       return (wuid[9]=='-');
     *   }
     */
    public static boolean looksLikeAWuid(String wuid)
    {
        if (wuid == null || wuid.length()==0)
            return false;
        if (wuid.charAt(0) != 'W' && wuid.charAt(0) != 'w')
            return false;
        if (!Character.isDigit(wuid.charAt(1)) || !Character.isDigit(wuid.charAt(2)) || !Character.isDigit(wuid.charAt(3)) || !Character.isDigit(wuid.charAt(4)))
            return false;
        if (!Character.isDigit(wuid.charAt(5)) || !Character.isDigit(wuid.charAt(6)) || !Character.isDigit(wuid.charAt(7)) || !Character.isDigit(wuid.charAt(8)))
            return false;
        return (wuid.charAt(9)=='-');
    }

    public WUResultResponse fetchRawResults(WUResult parameters) throws Exception
    {
        if (wsWorkunitsServiceSoapProxy == null)
            throw new Exception("wsWorkunitsServiceSoapProxy not available");
        else
            return wsWorkunitsServiceSoapProxy.WUResult(parameters);
    }

    /**
     * Creates and throws exception with exception message response from WS
     *
     * @param wsWUResponseExceptions
     * @param message
     * @throws Exception
     */
    private void throwWsWUExceptions(ArrayOfEspException wsWUResponseExceptions, String message) throws Exception
    {
        StringBuilder multimessage = new StringBuilder();
        multimessage.append(message);
        multimessage.append("\n");
        for (org.hpccsystems.ws.client.gen.wsworkunits.v1_56.EspException exception : wsWUResponseExceptions.getException())
        {
            multimessage.append("\t");
            multimessage.append(exception.getMessage());
        }

        throw new Exception(multimessage.toString());
    }

    private void refreshWU(boolean full, WorkunitInfo wu) throws Exception
    {
        if (full || HPCCWsWorkUnitsClient.isWorkunitComplete(wu))
        {
            fullWURefresh(wu);
        }
        else
        {
            fastWURefresh(wu);
        }
    }

    private void monitorWUToCompletion(WorkunitInfo wu) throws Exception
    {
        int timerTickCount = 0;
        String id=wu.getWuid();
        if (wu.getJobname() != null) {
            id=id + "(" + wu.getJobname() + ")";
        }
        Utils.println(System.out, "Monitoring WU " + id+ " to completion.", false, verbose);
        while (!HPCCWsWorkUnitsClient.isWorkunitComplete(wu))
        {
            try
            {
                Utils.println(System.out, "Monitoring WU " + id + " to completion ( " + timerTickCount + ") ...", true, verbose);
                Thread.sleep(wu.getSleepMillis());
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            timerTickCount++;
            if (timerTickCount * wu.getSleepMillis() > wu.getMaxMonitorMillis())
                throw new Exception("Timed out waiting for WUID " + wu.getWuid() + " to complete.");

            try
            {
                if (timerTickCount == 1)
                    refreshWU(true, wu);
                else if (timerTickCount < 5 && timerTickCount % 1 == 0)
                    refreshWU(false, wu);
                else if (timerTickCount < 30 && timerTickCount % 5 == 0)
                    refreshWU(false, wu);
                else if (timerTickCount < 60 && timerTickCount % 10 == 0)
                    refreshWU(false, wu);
                else if (timerTickCount < 120 && timerTickCount % 30 == 0)
                    refreshWU(true, wu);
                else if (timerTickCount % 60 == 0) refreshWU(true, wu);
            }
            catch (Exception e)
            {
                throw new Exception("Error attempting to refresh WU " + wu.getWuid());
            }
        }
    }

    public ECLException[] syntaxCheckECL(String ecl, String cluster) throws Exception
    {
        if (wsWorkunitsServiceSoapProxy == null)
            throw new Exception("wsWorkunitsServiceSoapProxy not available");
        else
        {
            WUSyntaxCheckECL checkParams = new WUSyntaxCheckECL();
            checkParams.setECL(ecl);
            checkParams.setCluster(cluster);
            WUSyntaxCheckResponse resp = wsWorkunitsServiceSoapProxy.WUSyntaxCheckECL(checkParams);
            return resp.getErrors();
        }

    }

    public WUQuerySetDetailsResponse getQueriesDetail(String querySetName, String clusterName, String filter) throws Exception
    {
        if (wsWorkunitsServiceSoapProxy == null)
            throw new Exception("wsWorkunitsServiceSoapProxy not available");

        WUQuerysetDetails wuQuerysetDetails = new WUQuerysetDetails();
        wuQuerysetDetails.setQuerySetName(querySetName);
        wuQuerysetDetails.setClusterName(clusterName);
        wuQuerysetDetails.setFilter(filter);

        return wsWorkunitsServiceSoapProxy.WUQuerysetDetails(wuQuerysetDetails);
    }

    public void abortWU(String wuid) throws Exception
    {
        if (wsWorkunitsServiceSoapProxy == null)
            throw new Exception("wsWorkunitsServiceSoapProxy not available");

            WUAbort request = new WUAbort();
            String[] wuids = new String[1];
            wuids[0] = wuid;
            request.setWuids(wuids);

            wsWorkunitsServiceSoapProxy.WUAbort(request);
    }

    public void deleteWU(String wuid) throws Exception
    {
        if (wsWorkunitsServiceSoapProxy == null)
            throw new Exception("wsWorkunitsServiceSoapProxy not available");

        WUDelete request = new WUDelete();
        String[] wuids = new String[1];
        wuids[0] = wuid;
        request.setWuids(wuids);

        wsWorkunitsServiceSoapProxy.WUDelete(request);
    }

    public void resubmitWU(String wuid, boolean restart, boolean clone) throws Exception
    {
        if (wsWorkunitsServiceSoapProxy == null)
            throw new Exception("wsWorkunitsServiceSoapProxy not available");

        WUResubmit request = new WUResubmit();
        request.setResetWorkflow(restart);
        request.setCloneWorkunit(clone);
        String[] wuids = new String[1];
        wuids[0] = wuid;
        request.setWuids(wuids);

        wsWorkunitsServiceSoapProxy.WUResubmit(request);
    }

    public QuerySet[] getQuerySets() throws Exception
    {
        if (wsWorkunitsServiceSoapProxy == null)
            throw new Exception("wsWorkunitsServiceSoapProxy not available");

        QuerySet[] queryset = null;
        WUQuerysets request = new WUQuerysets();
        WUQuerysetsResponse response = wsWorkunitsServiceSoapProxy.WUQuerysets(request);
        if (response != null)
        {
            queryset = response.getQuerysets();
        }

        return queryset;
    }

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

        if (!(aThat instanceof HPCCWsWorkUnitsClient))
        {
            return false;
        }

        HPCCWsWorkUnitsClient that = (HPCCWsWorkUnitsClient) aThat;
        WsWorkunitsServiceSoapProxy thatSoapProxy;
        try
        {
            thatSoapProxy = that.getSoapProxy();
        }
        catch(Exception e)
        {
            thatSoapProxy = null;
        }

        return EqualsUtil.areEqual(wsWorkunitsServiceSoapProxy.getEndpoint(), thatSoapProxy.getEndpoint()) &&
                EqualsUtil.areEqual(((Stub) wsWorkunitsServiceSoapProxy.getWsWorkunitsServiceSoap()).getUsername(), ((Stub) thatSoapProxy.getWsWorkunitsServiceSoap()).getUsername()) &&
                EqualsUtil.areEqual(((Stub) wsWorkunitsServiceSoapProxy.getWsWorkunitsServiceSoap()).getPassword(), ((Stub) thatSoapProxy.getWsWorkunitsServiceSoap()).getPassword());
    }

    @Override
    public int hashCode()
    {
        int result = HashCodeUtil.SEED;
        result = HashCodeUtil.hash(result, wsWorkunitsServiceSoapProxy.getEndpoint());
        result = HashCodeUtil.hash(result, ((Stub)  wsWorkunitsServiceSoapProxy.getWsWorkunitsServiceSoap()).getUsername());
        result = HashCodeUtil.hash(result, ((Stub)  wsWorkunitsServiceSoapProxy.getWsWorkunitsServiceSoap()).getPassword());
        return result;
    }

    
    /**
     * Return a workunit result
     *
     * @param WUResult
     * @return WUResultResponse
     * @throws Exception
     */
  public WUResultResponse getWorkunitResult(WUResult wur) throws Exception {
      return getWorkunitResult(wur,false);
  }    
  
    /**
     * Return a workunit result
     *
     * @param WUResult
     * @param unarchive
     * @return WUResultResponse
     * @throws Exception
     */
    public WUResultResponse getWorkunitResult(WUResult wur,boolean unarchive) throws Exception {
    	//get the object first to make sure it's not archived
        if (unarchive) {
            WorkunitInfo wu=this.getWUInfo(wur.getWuid(),unarchive);
        }
    	//get the response    	
    	WUResultResponse resp=getSoapProxy().getWsWorkunitsServiceSoap().WUResult(wur);
    	return resp;
    }

    public boolean doWorkunitAction(String wuid,WuActions action) throws ArrayOfEspException, RemoteException, Exception {
    	WUAction wa=new WUAction();
    	wa.setActionType(action.toString());
    	wa.setWuids(new String[]{wuid});
    	WUActionResponse war=this.getSoapProxy().getWsWorkunitsServiceSoap().WUAction(wa);
        if (war == null || war.getActionResults() == null || war.getActionResults().length==0
        		|| war.getActionResults()[0].getResult() == null 
        		|| !war.getActionResults()[0].getResult().equals("Success")) {
        	throw new Exception("Unable to restore workunit " + wuid);
		}
        return true;
    }
    
    private String getEclWatchUrl() throws Exception {
        String url=this.getSoapProxy().getEndpoint().toLowerCase().replace("wsworkunits", "");
        return url;
    }
}

package org.hpccsystems.ws.client;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.axis.client.Stub;
import org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException;
import org.hpccsystems.ws.client.soap.wsworkunits.DebugValue;
import org.hpccsystems.ws.client.soap.wsworkunits.ECLException;
import org.hpccsystems.ws.client.soap.wsworkunits.NamedValue;
import org.hpccsystems.ws.client.soap.wsworkunits.WUCreateAndUpdate;
import org.hpccsystems.ws.client.soap.wsworkunits.WUInfo;
import org.hpccsystems.ws.client.soap.wsworkunits.WUInfoDetails;
import org.hpccsystems.ws.client.soap.wsworkunits.WUInfoResponse;
import org.hpccsystems.ws.client.soap.wsworkunits.WUPublishWorkunit;
import org.hpccsystems.ws.client.soap.wsworkunits.WUPublishWorkunitResponse;
import org.hpccsystems.ws.client.soap.wsworkunits.WUQuery;
import org.hpccsystems.ws.client.soap.wsworkunits.WUQueryResponse;
import org.hpccsystems.ws.client.soap.wsworkunits.WUResult;
import org.hpccsystems.ws.client.soap.wsworkunits.WUResultResponse;
import org.hpccsystems.ws.client.soap.wsworkunits.WURun;
import org.hpccsystems.ws.client.soap.wsworkunits.WURunResponse;
import org.hpccsystems.ws.client.soap.wsworkunits.WUSubmit;
import org.hpccsystems.ws.client.soap.wsworkunits.WUSubmitResponse;
import org.hpccsystems.ws.client.soap.wsworkunits.WUSyntaxCheckECL;
import org.hpccsystems.ws.client.soap.wsworkunits.WUSyntaxCheckResponse;
import org.hpccsystems.ws.client.soap.wsworkunits.WUUpdateResponse;
import org.hpccsystems.ws.client.soap.wsworkunits.WsWorkunitsServiceSoap;
import org.hpccsystems.ws.client.soap.wsworkunits.WsWorkunitsServiceSoapProxy;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.utils.Utils;
import org.hpccsystems.ws.client.utils.WUState;

/**
 *
 * ESP Client code for common WsWorkUnits operations
 */
public class HPCCWsWorkUnitsClient
{
    public static final String          WSWORKUNITSWSDLURI          = "/WsWorkunits";
    private WsWorkunitsServiceSoapProxy wsWorkunitsServiceSoapProxy = null;
    private static final int            defaultWaitTime             = 10000;
    private static final int            defaultMaxWaitTime          = 1000 * 60 * 5;
    private int                         maxWaitTime                 = defaultMaxWaitTime;
    private boolean                     verbose                     = false;

    protected void fastWURefresh(ECLWorkunit wu) throws Exception
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

    protected void fullWURefresh(ECLWorkunit wu) throws Exception
    {
        fullWURefresh(wu, true, true, true, true);
    }

    void fullWURefresh(ECLWorkunit wu, boolean includeGraphs, boolean includeResults, boolean includeSourceFiles,
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
            for (org.hpccsystems.ws.client.soap.wsworkunits.EspException e : response.getExceptions().getException())
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
    public void setMaxWaitTime(int max)
    {
        this.maxWaitTime = max;
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
        return (new org.hpccsystems.ws.client.soap.wsworkunits.WsWorkunitsLocator()).getWsWorkunitsServiceSoapAddress();
    }

    public HPCCWsWorkUnitsClient(WsWorkunitsServiceSoapProxy wsWorkunitsServiceSoapProxy)
    {
        this.wsWorkunitsServiceSoapProxy = wsWorkunitsServiceSoapProxy;
    }

    public HPCCWsWorkUnitsClient(Connection baseConnection)
    {
        this(baseConnection.getProtocol(), baseConnection.getHost(), baseConnection.getPort(), baseConnection
                .getUserName(), baseConnection.getPassword());
    }

    public HPCCWsWorkUnitsClient(String protocol, String targetHost, String targetPort, String user, String pass)
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
        ECLWorkunit thewui = getWUInfo(wuid);
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
    public boolean isWorkunitCompiled(ECLWorkunit thewui)
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
    public boolean isWorkunitFailed(ECLWorkunit thewui)
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
        ECLWorkunit thewui = getWUInfo(wuid);
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
    static public boolean isWorkunitComplete(ECLWorkunit thewui)
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
    public static WUState getStateID(ECLWorkunit wu)
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
     * Attempts to create, compile and publish a query based on ecl provided. Without setting a result limit and sets a
     * default wait time.
     *
     * @param ecl
     * @param jobname
     * @param targetcluster
     * @return
     * @throws Exception
     */
    public WUPublishWorkunitResponse publishWUFromEcl(String ecl, String jobname, String targetcluster)
            throws Exception
    {
        return publishWUFromEcl(ecl, jobname, targetcluster, defaultWaitTime, -1);
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
    public WUPublishWorkunitResponse publishWUFromEcl(String ecl, String jobname, String targetcluster, int waitMillis,
            int resultLimit) throws Exception
    {
        WUPublishWorkunitResponse publishWUResp = null;

        if (wsWorkunitsServiceSoapProxy == null)
            throw new Exception("wsWorkunitsServiceSoapProxy not available");
        else if (ecl == null || ecl.length() <= 0)
            throw new Exception("Empty ECL submited");
        else
        {
            ECLWorkunit eclwu = createWUFromECL(ecl, targetcluster, resultLimit);

            try
            {
                Thread.sleep(waitMillis);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            submitWU(eclwu.getWuid(), targetcluster); // if no exception proceed

            monitorWUToCompletion(eclwu, waitMillis);

            publishWUResp = publishWU(eclwu, jobname, targetcluster);
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
    public WUPublishWorkunitResponse publishWU(ECLWorkunit wu, String jobname, String targetcluster) throws Exception
    {
        WUPublishWorkunitResponse publishWUResp = null;

        if (wsWorkunitsServiceSoapProxy == null)
            throw new Exception("wsWorkunitsServiceSoapProxy not available");
        else if (wu == null)
            throw new Exception("Invalid wuid submited");
        else
        {
            WUPublishWorkunit publishWU = new WUPublishWorkunit();
            publishWU.setJobName(jobname);
            publishWU.setWuid(wu.getWuid());
            publishWU.setCluster(targetcluster);
            publishWU.setActivate((int) 1);

            publishWUResp = wsWorkunitsServiceSoapProxy.WUPublishWorkunit(publishWU);

            org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException exceptions = publishWUResp.getExceptions();
            if (exceptions != null)
            {
                throwWsWUExceptions(exceptions, "Could not publish WU");
            }
        }

        return publishWUResp;
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
    public ECLWorkunit getWUInfo(String wuid) throws Exception
    {
        ECLWorkunit workunit = null;

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

            org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException exceptions = wuInfoResponse.getExceptions();
            if (exceptions == null)
            {
                workunit = new ECLWorkunit(wuInfoResponse.getWorkunit());
            }
            else
            {
                throwWsWUExceptions(exceptions, "Could not fetch WU Info");
            }
        }

        return workunit;
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

                ((org.apache.axis.client.Stub) wsWorkunitsServiceSoapProxy.getWsWorkunitsServiceSoap())
                        .setTimeout(3 * 1000);

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
            String state, String endDate, String startDate, Long pageStartFrom, Long pageSize) throws Exception
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

            try
            {
                wuQueryResponse = wsWorkunitsServiceSoapProxy.WUQuery(request);
                ArrayOfEspException arrayOfEspException = wuQueryResponse.getExceptions();
                if (arrayOfEspException != null)
                {
                    throwWsWUExceptions(arrayOfEspException, "Error in WU query");
                }
            }
            catch (Exception e)
            {}
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
        ECLWorkunit workunit = getWUInfo(wuid);

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
    public ECLWorkunit createWUFromECL(String ecl, String targetCluster, int resultLimit, DebugValue[] debugValues,
            String jobname) throws Exception
    {
        ECLWorkunit createdWU = null;

        if (wsWorkunitsServiceSoapProxy == null)
            throw new Exception("wsWorkunitsServiceSoapProxy not available");
        else
        {
            WUCreateAndUpdate wucreateparameters = new WUCreateAndUpdate();
            wucreateparameters.setAction(1); // 1= compile
            wucreateparameters.setQueryText(ecl);
            wucreateparameters.setDebugValues(debugValues);
            wucreateparameters.setJobname(jobname);
            wucreateparameters.setClusterOrig(targetCluster);
            wucreateparameters.setResultLimit(resultLimit);
            if (jobname != null) wucreateparameters.setJobname(jobname);
            if (debugValues != null) wucreateparameters.setDebugValues(debugValues);

            WUUpdateResponse wuUpdateResponse = wsWorkunitsServiceSoapProxy.WUCreateAndUpdate(wucreateparameters);

            ArrayOfEspException exceptions = wuUpdateResponse.getExceptions();
            if (exceptions == null)
            {
                createdWU = new ECLWorkunit(wuUpdateResponse.getWorkunit());
            }
            else
            {
                throwWsWUExceptions(exceptions, "Error compiling ECL query");
            }
        }

        return createdWU;
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
    public ArrayList<ECLWorkunit> getWorkunits(String jobName, String owner, String ecl) throws Exception
    {
        ArrayList<ECLWorkunit> wks = new ArrayList<ECLWorkunit>();

        getSoapProxy();

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
        try
        {
            WUQueryResponse result = wsWorkunitsServiceSoapProxy.WUQuery(params);
            org.hpccsystems.ws.client.soap.wsworkunits.ECLWorkunit[] ecls = result.getWorkunits();
            if (ecls == null)
            {
                return wks;
            }
            for (int i = 0; i < ecls.length; i++)
            {
                wks.add(new ECLWorkunit(ecls[i]));
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
    public ECLWorkunit createWUFromECL(String ecl, String targetCluster, int resultLimit) throws Exception
    {
        return createWUFromECL(ecl, targetCluster, resultLimit, null, null);
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
    public ECLWorkunit compileWUFromECL(String ecl, String targetCluster, int resultLimit, DebugValue[] debug,
            String jobname, Integer sleeptime) throws Exception
    {
        if (sleeptime == null)
        {
            sleeptime = defaultWaitTime;
        }

        ECLWorkunit createdWU = createWUFromECL(ecl, targetCluster, resultLimit, debug, jobname);

        if (createdWU != null && createdWU.getErrorCount() == 0 && createdWU.getExceptions() == null)
        {
            submitWU(createdWU.getWuid(), targetCluster); // if no exception proceed
            this.monitorWUToCompletion(createdWU, sleeptime);
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
    public void submitWU(String wuid, String targetCluster) throws Exception
    {
        if (wsWorkunitsServiceSoapProxy == null)
            throw new Exception("wsWorkunitsServiceSoapProxy not available");
        else
        {
            WUSubmit wuSubmitParams = new WUSubmit();
            wuSubmitParams.setWuid(wuid);
            wuSubmitParams.setCluster(targetCluster);

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
    private WURunResponse createAndRunWUFromECL(String ecl, String targetCluster, int resultLimit, DebugValue[] debug,
            String jobname, NamedValue[] variables) throws Exception
    {
        WURunResponse wuRunResponse = null;

        if (wsWorkunitsServiceSoapProxy == null)
            throw new Exception("wsWorkunitsServiceSoapProxy not available");
        else
        {
            ECLWorkunit compiledWU = null;
            compiledWU = compileWUFromECL(ecl, targetCluster, resultLimit, debug, jobname, defaultWaitTime);

            if (compiledWU != null)
            {
                WURun runparameters = new WURun();
                runparameters.setWuid(compiledWU.getWuid());
                runparameters.setVariables(variables);
                runparameters.setCluster(targetCluster);

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
    public String createAndRunWUFromECLAndGetResults(String ecl, String targetCluster, int resultLimit,
            DebugValue[] debug, String jobname, NamedValue[] variables) throws Exception
    {
        WURunResponse createAndRunWUFromECL = createAndRunWUFromECL(ecl, targetCluster, resultLimit, debug, jobname,
                variables);

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
    public String createAndRunWUFromECLAndGetWUID(String ecl, String targetCluster, int resultLimit,
            DebugValue[] debug, String jobname, NamedValue[] variables) throws Exception
    {
        WURunResponse createAndRunWUFromECL = createAndRunWUFromECL(ecl, targetCluster, resultLimit, debug, jobname,
                variables);

        return createAndRunWUFromECL.getWuid();
    }

    /* zero based index sequence */
    /**
     * Fetches results associated with a given WUID
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
     *            - Total result record count re- Results in xml string - Resu - caller must handle exceptionsle
     *            exceptionsle exceptionsle exceptionss
     */
    public String fetchResults(String wuid, int sequence, String cluster, boolean suppressXMLShema, long resultOffset,
            int resultCount) throws Exception
    {
        if (wsWorkunitsServiceSoapProxy == null)
            throw new Exception("wsWorkunitsServiceSoapProxy not available");
        else
        {
            WUResult parameters = new WUResult();
            parameters.setWuid(wuid);
            parameters.setSequence(sequence);
            parameters.setStart(resultOffset);
            parameters.setCount(resultCount);
            parameters.setCluster(cluster);
            parameters.setSuppressXmlSchema(suppressXMLShema);

            WUResultResponse wuResultResponse = wsWorkunitsServiceSoapProxy.WUResult(parameters);
            ArrayOfEspException exceptions = wuResultResponse.getExceptions();
            if (exceptions != null) throwWsWUExceptions(exceptions, "Could not fetch results");

            return wuResultResponse.getResult();
        }
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
        for (org.hpccsystems.ws.client.soap.wsworkunits.EspException exception : wsWUResponseExceptions.getException())
        {
            multimessage.append("\t");
            multimessage.append(exception.getMessage());
        }

        throw new Exception(multimessage.toString());
    }

    private void refreshWU(boolean full, ECLWorkunit wu) throws Exception
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

    private void monitorWUToCompletion(ECLWorkunit wu, int sleepTime) throws Exception
    {
        int timerTickCount = 0;
        Utils.println(System.out, "Monitoring WU " + wu.getWuid() + " to completion.", false, verbose);
        while (!HPCCWsWorkUnitsClient.isWorkunitComplete(wu))
        {
            try
            {
                Utils.println(System.out, "Monitoring WU " + wu.getWuid() + " to completion ( " + timerTickCount
                        + ") ...", true, verbose);
                Thread.sleep(sleepTime);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            timerTickCount++;
            if (timerTickCount * sleepTime > maxWaitTime)
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

}

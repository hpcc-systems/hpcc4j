package org.hpccsystems.ws.client;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.axis2.databinding.types.NonNegativeInteger;
import org.apache.log4j.Logger;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ApplicationValue;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfApplicationValue;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfEspException;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfNamedValue;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLException;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLWUActions;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLWorkunit;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.EspException;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.EspSoapFault;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.EspStringArray;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.FileUsedByQuery;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.NamedValue;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.Ping;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.Queries_type0;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.QuerySet;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.QuerySetQuery;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.QuerySetQueryActionItem;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.QuerySetQueryActionResult;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.QuerySetQueryActionTypes;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUAbort;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUAction;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUActionResponse;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUDelete;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUDeleteResponse;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUFile;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUListQueries;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUListQueriesResponse;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WULogFileResponse;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUPublishWorkunit;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUPublishWorkunitResponse;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUQuery;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUQueryFiles;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUQueryFilesResponse;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUQueryResponse;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUQuerySetDetailsResponse;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUQuerySetQueryActionResponse;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUQuerysetDetails;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUQuerysetQueryAction;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUQuerysets;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUQuerysetsResponse;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUResubmit;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUResult;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUResultResponse;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WURun;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WURunResponse;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUSubmit;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUSubmitResponse;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUSyntaxCheckECL;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUSyntaxCheckResponse;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WsWorkunits;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WsWorkunitsStub;
import org.hpccsystems.ws.client.platform.QuerySetFilterType;
import org.hpccsystems.ws.client.platform.Version;
import org.hpccsystems.ws.client.platform.WUActionCode;
import org.hpccsystems.ws.client.platform.Workunit;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.wrappers.ApplicationValueWrapper;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.EspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.EspSoapFaultWrapper;
import org.hpccsystems.ws.client.wrappers.WUExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.WUFileType;
import org.hpccsystems.ws.client.wrappers.WUState;
import org.hpccsystems.ws.client.wrappers.wsworkunits.ECLResultWrapper;
import org.hpccsystems.ws.client.wrappers.wsworkunits.QueryFileWrapper;
import org.hpccsystems.ws.client.wrappers.wsworkunits.QueryResultWrapper;
import org.hpccsystems.ws.client.wrappers.wsworkunits.QuerySetFilterTypeWrapper;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WUCreateAndUpdateWrapper;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WUCreateRequestWrapper;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WUCreateResponseWrapper;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WUInfoRequestWrapper;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WUInfoResponseWrapper;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WULogFileWrapper;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WUQueryWrapper;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WUUpdateRequestWrapper;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WUUpdateResponseWrapper;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WorkunitWrapper;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WsWorkunitsClientStubWrapper;

/**
 * ESP Client code for common WsWorkUnits operations
 */
public class HPCCWsWorkUnitsClient extends BaseHPCCWsClient
{
    private static final Logger                           log                            = Logger.getLogger(HPCCWsWorkUnitsClient.class.getName());
    public static final String                            WSWORKUNITSWSDLURI             = "/WsWorkunits";
    public static final int                               defaultWaitTime                = 10000;
    public static final int                               defaultResultLimit             = 100;
    public static final int                               defaultMaxWaitTime             = 1000 * 60 * 5;
    private WsWorkunitsClientStubWrapper                  stubWrapper                    = null;

    public static HPCCWsWorkUnitsClient get(Connection connection)
    {
        return new HPCCWsWorkUnitsClient(connection);
    }

    public static HPCCWsWorkUnitsClient get(String protocol, String targetHost, String targetPort, String user, String pass)
    {
        Connection conn = new Connection(protocol,targetHost,targetPort);
        conn.setCredentials(user, pass);
        return new HPCCWsWorkUnitsClient(conn);
    }

    public static HPCCWsWorkUnitsClient get(String protocol, String targetHost, String targetPort, String user, String pass, int timeout)
    {
        Connection conn = new Connection(protocol,targetHost,targetPort);
        conn.setCredentials(user, pass);
        conn.setConnectTimeoutMilli(timeout);
        conn.setSocketTimeoutMilli(timeout);

        return new HPCCWsWorkUnitsClient(conn);
    }

    protected HPCCWsWorkUnitsClient(Connection baseConnection)
    {
        initWsWorkUnitsClientStub(baseConnection);
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
     * @throws Exception
     */
    public void initWsWorkUnitsClientStub(Connection conn)
    {
        initErrMessage = "";

        try
        {
            HPCCWsSMCClient wssmc = HPCCWsSMCClient.get(conn);
            targetVersion = new Version(wssmc.getHPCCBuild());

            if (targetVersion != null)
            {
                stubWrapper = new WsWorkunitsClientStubWrapper(conn,targetVersion);
                stub = stubWrapper.getLatest();
                stub = setStubOptions(new WsWorkunitsStub(conn.getBaseUrl()+WSWORKUNITSWSDLURI), conn);
            }
            else
                throw new Exception("Cannot initialize HPCCWsDFUStub without valid HPCC version object");
        }
        catch (Exception e)
        {
            log.error("HPCCWsWorkUnitsClient: Could not stablish target HPCC bulid version, review all HPCC connection values");
            if (!e.getLocalizedMessage().isEmpty())
            {
                initErrMessage = e.getLocalizedMessage();
                log.error("HPCCWsWorkUnitsClient: " + e.getLocalizedMessage()) ;
            }
        }
    }

    /**
     *
     * Performs limited refresh of local WU instance based on that WU's state on target
     * HPCC cluster if state of WU has not changed, Graphs, Results,ResultsView, ResultSchemas,
     * SourceFiles, ApplicationValues are not updated. However if local WU instance's state
     * is found to differ from the server's version, a full refresh is performed.
     *
     * @param wu
     * @throws Exception
     */
    public void fastWURefresh(WorkunitWrapper wu) throws Exception
    {
        verifyStub(); //Throws exception if stub failed

        WUQuery request = new WUQuery();

        WUState previousState = getStateID(wu);

        request.setWuid(wu.getWuid());
        request.setCount(1);

        WUQueryResponse response = null;

        try
        {
            response = ((WsWorkunits)stub).wUQuery(request);
        }
        catch (RemoteException e)
        {
            throw new Exception ("WsWorkunits.fastWURefresh(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspExceptions(new EspSoapFaultWrapper(e), "Could Not perform fastWURefresh");
        }

        if (response != null)
        {
            if (response.getExceptions() != null)
                handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could Not perform fastWURefresh");

            if (response.getWorkunits() != null)
            {
                ECLWorkunit[] eclWorkunit = response.getWorkunits().getECLWorkunit();

                if (eclWorkunit != null && eclWorkunit.length == 1)
                wu.update(eclWorkunit[0]);
            }

            if (previousState != getStateID(wu))
            {
                fullWURefresh(wu);
            }
        }
    }

    /**
     * Performs full refresh of local WU instance based on that WU's state on target
     * HPCC cluster. Full refresh includes Graphs, Results,ResultsView, ResultSchemas,
     * SourceFiles, ApplicationValues.
     *
     * @param wu
     * @throws Exception
    */
    protected void fullWURefresh(WorkunitWrapper wu) throws Exception
    {
        fullWURefresh(wu, true, true, true, true);
    }

    public void fullWURefresh(WorkunitWrapper wu, boolean includeGraphs, boolean includeResults, boolean includeSourceFiles, boolean includeApplicationValues) throws Exception
    {
        verifyStub(); //Throws exception if stub failed

        WUInfoRequestWrapper request = new WUInfoRequestWrapper();

        request.setWuid(wu.getWuid());
        request.setIncludeGraphs(includeGraphs);
        request.setIncludeResults(includeResults);
        request.setIncludeResultsViewNames(includeResults);
        request.setSuppressResultSchemas(!includeResults);
        request.setIncludeSourceFiles(includeSourceFiles);
        request.setIncludeApplicationValues(includeApplicationValues);

        WUInfoResponseWrapper response = stubWrapper.WUInfo(request);

        if (response.getWorkunit() == null)
        {
            // Call succeeded, but no response...
            for (WUExceptionWrapper e : response.getExceptions())
            {
                if (e.getCode().equals("20082") || e.getCode().equals("20080"))
                {
                    // No longer exists... //$NON-NLS-1$ //$NON-NLS-2$
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
     * Reports if the WU in question is in the compiled state. Makes a call to the target Web Service to extract
     * information about the WU
     *
     * @param wuid
     * @return true if state is compiled
     * @throws Exception
     */
    public boolean isWorkunitCompiled(String wuid) throws Exception
    {
        WorkunitWrapper thewui = getWUInfo(wuid);
        if (thewui != null)
            return isWorkunitCompiled(thewui);

        return false;
    }

    /**
     * Reports if the WU in question is in the compiled state. Does not make call to the target Web Service, extracts
     * information from the WU object
     *
     * @param thewui
     * @return true if state is compiled
     */
    public boolean isWorkunitCompiled(WorkunitWrapper thewui)
    {
        return isWorkunitState(getStateID(thewui), WUState.COMPILED);
    }

    /**
     * Reports if the WU in question is in the failed state. Does not make call to the target Web Service, extracts
     * information from the WU object
     *
     * @param thewui
     * @return true if state is failed
     */
    public boolean isWorkunitFailed(WorkunitWrapper thewui)
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
    static private boolean isWorkunitState(WUState state1, WUState state2)
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
        WorkunitWrapper thewui = getWUInfo(wuid);
        if (thewui != null)
        {
            return isWorkunitComplete(thewui);
        }

        return false;
    }

    /**
     * Replies true if given wuid is in complete state. This method does not make a call to WS, and it is preferable over
     * the version that calls WS.
     *
     * @param thewui
     * @return true if wu is in one of the complete states
     */
    static public boolean isWorkunitComplete(WorkunitWrapper thewui)
    {
        WUActionCode origAction = WUActionCode.fromName(thewui.getActionEx()); // some WUs have ActionEX as a string
        if (origAction == WUActionCode.WUActionUnknown)
            origAction = WUActionCode.fromInteger(thewui.getAction()); // some WUs have Action as a code

        return isWorkunitComplete(getStateID(thewui), origAction);
    }

    /**
     * reports if a workunit is complete based on wustate, and original action if available
     *
     * @param state
     * @return true if wu is in completed state
    */
    static public boolean isWorkunitComplete(WUState state, WUActionCode origAction)
    {
        if (origAction == WUActionCode.WUActionRun && isWorkunitState(state, WUState.COMPILED))
            return false;

        return isWorkunitComplete(state);
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
            case PAUSED:
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
    public static WUState getStateID(WorkunitWrapper wu)
    {
        if (wu != null)
        {
            if (wu.getStateID() != null)
            {
                return getStateID(wu.getStateID());
            }
            else if (wu.getState() != null)
            {
                return Workunit.translateWUState(wu.getState());
            }
        }

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
            case 16:
                return WUState.PAUSED;
            case 999:
                return WUState.UNKNOWN_ONSERVER;
            default:
                return WUState.UNKNOWN;
        }
    }

    /**
     * Attempts to create, compile and publish a query based on ecl provided via a workunitinfo object.
     *
     * @param wu  - Workunitinfo object containing all pertinent information for WU request
     * @return
     * @throws Exception
     */
    public WUPublishWorkunitResponse publishWUFromEcl(WorkunitWrapper wu) throws Exception
    {
        WUPublishWorkunitResponse publishWUResp = null;

        verifyStub(); //Throws exception if stub failed

        if (wu.getECL() == null || wu.getECL().length() == 0)
            throw new Exception("Empty ECL submited");
        else
        {
            WorkunitWrapper eclwu = createWUFromECL(wu);

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
     * @return
     * @throws Exception
     */
    public WUPublishWorkunitResponse publishWU(WorkunitWrapper wu) throws Exception
    {
        WUPublishWorkunitResponse publishWUResp = null;

        if (wu == null)
            throw new Exception("Invalid wuid submited");
        else
        {
            verifyStub(); //Throws exception if stub failed

            WUPublishWorkunit publishWU = new WUPublishWorkunit();
            publishWU.setJobName(wu.getJobname());
            publishWU.setWuid(wu.getWuid());
            publishWU.setCluster(wu.getCluster());
            publishWU.setActivate((int) 1);

            publishWUResp = ((WsWorkunits)stub).wUPublishWorkunit(publishWU);

            ArrayOfEspException exceptions = publishWUResp.getExceptions();
            if (exceptions != null)
            {
                throwWsWUExceptions(exceptions, "Could not publish WU");
            }
        }

        return publishWUResp;
    }

    public void publishWU(String wuid) throws Exception
    {
        if (wuid == null || wuid.isEmpty())
            throw new Exception("Invalid wuid submited");
        else
        {
            verifyStub(); //Throws exception if stub failed

            WUPublishWorkunit publishWU = new WUPublishWorkunit();
            publishWU.setWuid(wuid);

            ((WsWorkunits)stub).wUPublishWorkunit(publishWU);
        }
    }

    /**
     * Get information about a given WorkUnit. Workunit must not be archived.
     *
     * @param wuid       - ID of target workunit
     * @return           - ECLWorkunit object with information pertaining to the WU
     * @throws Exception - Caller must handle exceptions
     */
    /*public WorkunitInfo getWUInfo(String wuid) throws Exception
    {
        return getWUInfo(wuid, false);
    }*/

    /**
     * Get information about a given WorkUnit. Workunit must not be archived.
     *
     * @param wuid       - ID of target workunit
     * @return           - ECLWorkunit object with information pertaining to the WU
     * @throws Exception - Caller must handle exceptions
     */
    public WorkunitWrapper getWUInfo(String wuid) throws Exception
    {
        return getWUInfo(wuid, false);
    }

    /**
     * Get information about a given WorkUnit, caller can request to unarchive
     * the WU if necessary to fetch WU info.
     *
     * @param wuid
     *            - ID of target workunit
     * @param unarchive
     *            - unarchive archived workunit
     * @return - ECLWorkunit object with information pertaining to the WU
     * @throws Exception
     *             - Caller must handle exceptions
     */
    public WorkunitWrapper getWUInfo(String wuid, boolean unarchive) throws Exception
    {
        WorkunitWrapper workunit = null;

        verifyStub(); //Throws exception if stub failed

        WUInfoRequestWrapper wuinfodetailsparams = new WUInfoRequestWrapper();
        wuinfodetailsparams.setIncludeApplicationValues(false);
        wuinfodetailsparams.setIncludeDebugValues(false);
        wuinfodetailsparams.setIncludeExceptions(true);
        wuinfodetailsparams.setIncludeGraphs(false);
        wuinfodetailsparams.setIncludeResults(true);
        wuinfodetailsparams.setWuid(wuid);
        WUInfoResponseWrapper wuInfoResponse = stubWrapper.WUInfo(wuinfodetailsparams);

        ArrayOfEspException exceptions = wuInfoResponse.getRawArrayOfEspExceptions1_75();
        if (exceptions == null && wuInfoResponse.getWorkunit() != null)
        {
            if (unarchive && wuInfoResponse.getWorkunit().getArchived())
            {
                doWorkunitAction(wuid, ECLWUActions.Restore);
                return getWUInfo(wuid);
            }
            workunit = wuInfoResponse.getWorkunit();
            workunit.setOriginalEclWatchUrl(getEclWatchUrl());
        }
        else
        {
            throwWsWUExceptions(exceptions, "Could not fetch WU Info");
        }

        return workunit;
    }

    /**
     * Get information about a given WorkUnit, Workunit must not be archived.
     * Caller can choose which WU information portion to fetch
     * @param wuid
     * @param includeResults
     * @param includeGraphs
     * @param includeSourceFiles
     * @param includeApplicationValues
     * @param includeDebugValues
     * @param includeExceptions
     * @param includeVariables
     * @param includeXmlSchemas
     * @param includeTimers
     * @return
     * @throws Exception
     */
    public WorkunitWrapper getWUInfo(String wuid, boolean includeResults, boolean includeGraphs,
            boolean includeSourceFiles, boolean includeApplicationValues, Boolean includeDebugValues,
            Boolean includeExceptions, Boolean includeVariables, Boolean includeXmlSchemas, Boolean includeTimers)
                    throws Exception
    {
        return getWUInfo(wuid, includeResults, includeGraphs, includeSourceFiles, includeApplicationValues,
                includeDebugValues, includeExceptions, includeVariables, includeXmlSchemas, includeTimers, false);
    }

    /**
     * Get information about a given WorkUnit, caller can request to unarchive
     * Caller can choose which WU information portion to fetch
     *
     * @param wuid
     * @param includeResults
     * @param includeGraphs
     * @param includeSourceFiles
     * @param includeApplicationValues
     * @param includeDebugValues
     * @param includeExceptions
     * @param includeVariables
     * @param includeXmlSchemas
     * @param includeTimers
     * @param unarchive
     * @return
     * @throws Exception
     */
    public WorkunitWrapper getWUInfo(String wuid, boolean includeResults, boolean includeGraphs,
            boolean includeSourceFiles, boolean includeApplicationValues, Boolean includeDebugValues,
            Boolean includeExceptions, Boolean includeVariables, Boolean includeXmlSchemas, Boolean includeTimers,
            boolean unarchive) throws Exception
    {
        verifyStub(); //Throws exception if stub failed

        WUInfoRequestWrapper request = new WUInfoRequestWrapper();
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

        WUInfoResponseWrapper resp = stubWrapper.WUInfo(request);

        this.throwWsWUExceptions(resp.getRawArrayOfEspExceptions1_75(), "Could not retrieve workunit");

        WorkunitWrapper wk = resp.getWorkunit();
        if (unarchive && wk != null && wk.getArchived() != null && wk.getArchived())
        {
            doWorkunitAction(wuid, ECLWUActions.Restore);
            return getWUInfo(wuid, includeResults, includeGraphs, includeSourceFiles, includeApplicationValues,
                    includeDebugValues, includeExceptions, includeVariables, includeXmlSchemas, includeTimers, false);
        }

        if (wk==null)
        {
            return null;
        }
        wk.setResultViews(resp.getResultViews());
        return wk;
    }

    /**
     * This method queries WU information using a bogus WUID. Used as a mechanism for testing connectivity with HPCC
     * ESP. Temporarily increases timeout value to 3 seconds;
     *
     * @return           - True if able to reply is received within timout value of 3 secs, false otherwise
     * @throws Exception - Caller must handle exceptions
     */
    public boolean testWUQuery() throws Exception
    {
        Integer oldTimeout = -1;

        verifyStub(); //Throws exception if stub failed

        WUQuery request = new WUQuery();
        request.setWuid("XXX"); //$NON-NLS-1$
        try
        {
            oldTimeout = this.getStubConnectionTO();
            this.setStubConnectionTO(3 * 1000);

            ((WsWorkunits)stub).wUQuery(request);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (oldTimeout != null && oldTimeout != -1)
                this.setStubConnectionTO(oldTimeout.intValue());
        }
        return false;
    }


    /**
     * Check the version found at instantiation with compatibility version
     *
     * @param Version
     *            input
     * @return boolean true if server build version >= input version
     */
    private boolean compatibilityCheck(Version input)
    {
        if (targetVersion == null || input == null)
            return false;

        if (targetVersion.major > input.major)
            return true;
        else if (targetVersion.major < input.major)
            return false;

        if (targetVersion.minor > input.minor)
            return true;
        else if (targetVersion.minor < input.minor)
            return false;

        if (targetVersion.point > input.point)
            return true;
        else if (targetVersion.point < input.point)
            return false;
        else
            return true;
    }

    /**
     * As of Platform version 6.0.0. Now maps to new prototype, excluding the pageSize and startPageFrom parameters.
     * Executes a WUQuery, based on parameters provided. If a custom WUQuery is desired, the caller can make a direct
     * call to WUQuery based on the soapproxy for this client. If using applicationValues objects for filtering, a user
     * must pair the Application with either an attribute name, or attribute value.
     *
     * @param wuid
     * @param jobname
     * @param cluster
     * @param archived
     * @param sortby
     * @param state
     * @param endDate
     * @param startDate
     * @param pageStartFrom
     * @param pageSize
     * @param owner
     * @param applicationValues
     * @return
     * @throws Exception
     */
     public List<WorkunitWrapper> workUnitUQuery(String wuid, String jobname, String cluster, Boolean archived, WUQueryWrapper.SortBy sortby,
            WUState state, Date endDate, Date startDate, Long pageStartFrom, Long pageSize,
            String owner, List<ApplicationValueWrapper> applicationValues) throws Exception
    {
        WUQueryWrapper info=new WUQueryWrapper();
        info.setWuid(wuid);
        info.setJobname(jobname);
        info.setCluster(cluster);
        info.setArchived(archived);
        info.setSortBy(sortby);
        info.setState(state);
        info.setEndDate(endDate);
        info.setStartDate(startDate);
        info.setOwner(owner);
        info.setApplicationValues(applicationValues);
        info.setPageSize(pageSize==null?10000:pageSize);
        info.setPageStartFrom(pageStartFrom==null?0:pageStartFrom);

        return (workUnitUQuery(info));
    }

    public List<WorkunitWrapper> workUnitUQuery(WUQueryWrapper info) throws Exception
    {
        verifyStub(); //Throws exception if stub failed

        //currently just checks application values
        info.validate();

        List<WorkunitWrapper> result = new ArrayList<WorkunitWrapper>();
        if (!compatibilityCheck(new Version("6.0.0")))
        {
            Set<org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLWorkunit> workunit_set =
                    new HashSet<org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLWorkunit>();

            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.WUQueryResponse fallbackresponse = null;
            if (info.getApplicationValues().size() > 1)
            {
                for (int i=0; i < info.getApplicationValues().size();i++)
                {
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.WUQuery internal = info.getRaw156(i);
                    fallbackresponse = stubWrapper.getVersion1_56Raw().wUQuery(internal);
                    if (fallbackresponse != null)
                    {
                        throwWsWUExceptions(new ArrayOfEspExceptionWrapper(fallbackresponse.getExceptions()), "Error in WU query");
                    }
                    Set<org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLWorkunit> internal_wu_set
                        = new HashSet<org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLWorkunit>();
                    if (fallbackresponse.getWorkunits() != null)
                    {
                        for (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLWorkunit wu : fallbackresponse.getWorkunits().getECLWorkunit())
                        {
                            internal_wu_set.add(wu);
                        }
                        if (workunit_set.isEmpty())
                        {
                            workunit_set.addAll(internal_wu_set);
                        }
                        else
                        {
                            // intersection of s1 and s2
                            workunit_set.retainAll(internal_wu_set);
                        }
                    }
                }
            }
            else
            {
                fallbackresponse = stubWrapper.getVersion1_56Raw().wUQuery(info.getRaw156(0));
                if (fallbackresponse != null) {
                    throwWsWUExceptions(new ArrayOfEspExceptionWrapper(fallbackresponse.getExceptions()), "Error in WU query");
                }
                if (fallbackresponse.getWorkunits() != null)
                {
                    for (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLWorkunit wu : fallbackresponse.getWorkunits().getECLWorkunit())
                    {
                        workunit_set.add(wu);
                    }
                }
            }

            for (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLWorkunit eclWorkunit : workunit_set)
            {
                result.add(new WorkunitWrapper(eclWorkunit));
            }

        }
        else
        {
            //Drea, previous logic called wuquery then threw WUexception "Error in WU query"
            WUQueryResponse wUQuery = ((WsWorkunits)stub).wUQuery(info.getRaw());
            if (wUQuery.getExceptions() != null && wUQuery.getExceptions().getException().length > 0) 
                throwWsWUExceptions(wUQuery.getExceptions(), "Error in WU query");
            else
            {
                org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfECLWorkunit workunits = wUQuery.getWorkunits();
                if (workunits != null)
                {
                    ECLWorkunit[] eclWorkunits = workunits.getECLWorkunit();
                    for (ECLWorkunit eclWorkunit : eclWorkunits)
                    {
                        result.add(new WorkunitWrapper(eclWorkunit));
                    }
                }
            }
        }

        return result;

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
        WorkunitWrapper workunit = getWUInfo(wuid);

        if (workunit != null) errsfound = workunit.getErrorCount().intValue() <= 0;

        return errsfound;
    }

    /**
     * Requests target HPCC System to create and compile WU based on workunit info provided.
     *
     * @param wu   - The workunit information used to create WU on HPCC cluster
     * @return
     * @throws Exception
     */
    public WorkunitWrapper createWUFromECL(WorkunitWrapper wu) throws Exception
    {
        WorkunitWrapper createdWU = null;

        WUCreateAndUpdateWrapper wucreateparameters = new WUCreateAndUpdateWrapper();
        wucreateparameters.setAction(WUActionCode.WUActionCompile.ordinal());
        wucreateparameters.setQueryText(wu.getECL());
        wucreateparameters.setApplicationValues(wu.getApplicationValues());
        wucreateparameters.setDebugValues(wu.getDebugValues());
        wucreateparameters.setJobname(wu.getJobname());
        wucreateparameters.setClusterOrig(wu.getCluster());
        wucreateparameters.setResultLimit(wu.getResultLimit());
        wucreateparameters.setWuid(wu.getWuid());

        WUUpdateResponseWrapper wuUpdateResponse = stubWrapper.WUCreateAndUpdate(wucreateparameters);

        if (wuUpdateResponse.getExceptions().size()==0)
        {
            createdWU = wuUpdateResponse.getWorkunitWrapper();

            createdWU.setMaxMonitorMillis(wu.getMaxMonitorMillis());
            createdWU.setCluster(wu.getCluster());
            createdWU.setJobname(wu.getJobname());
            createdWU.setSleepMillis(wu.getSleepMillis());
            createdWU.setOriginalEclWatchUrl(getEclWatchUrl());
        }
        else
        {
            throwWsWUExceptions(wuUpdateResponse.getRawArrayOfEspExceptions(), "Error compiling ECL query");
        }
        return createdWU;
    }

    /*
     * this method is purely for the Platform class
     */
    public WorkunitWrapper createWUFromECL(String archiveOrEcl, int resultLimit, List<ApplicationValueWrapper> appVals, String jobName, boolean compileOnly) throws Exception
    {
        WorkunitWrapper wi = new WorkunitWrapper().setECL(archiveOrEcl).setJobname(jobName).setApplicationValues(appVals).setResultLimit(resultLimit==0?null:resultLimit);
        return createWUFromECL(wi);
    }

    /**
     * @param jobName
     *            the pattern to find in the jobname (wildcard * matches multiple jobnames)
     * @param owner
     *            - hpcc owner of the job
     * @param ecl
     *            - text in the ecl
     * @param archived - if true, search archived workunits. If false or null, search unarchived workunits.
     * @param wuid - wuid to search for
     * @param cluster - cluster to search workunits for
     * @param state - WUState of workunits to find
     * @return an List<WorkunitInfo> of matching workunits
     * @throws Exception
     */
    public List<WorkunitWrapper> getWorkunits(String jobName, String owner, String ecl, Boolean archived, String wuid, String cluster, WUState state) throws Exception
    {
        WUQueryWrapper params = new WUQueryWrapper().setJobname(jobName).setOwner(owner).setECL(ecl).setArchived(archived).setWuid(wuid).setCluster(cluster).setState(state);
        return workUnitUQuery(params);
    }

    public List<WorkunitWrapper> getWorkunits(WUQueryWrapper params) throws Exception
    {
        return this.workUnitUQuery(params);
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
    public WorkunitWrapper compileWUFromECL(WorkunitWrapper wu) throws Exception
    {
        Integer sleeptime = wu.getSleepMillis();

        if (sleeptime == null)
        {
            sleeptime = defaultWaitTime;
        }

        WorkunitWrapper createdWU = createWUFromECL(wu);

        if (createdWU != null && createdWU.getErrorCount() == 0 && createdWU.getExceptions().size()==0)
        {
            createdWU.setCluster(wu.getCluster());
            submitWU(createdWU); // if no exception proceed
            monitorWUToCompletion(createdWU);

            // exceptions, etc. aren't always included in the submit response; do another request to get all workunit info
            WorkunitWrapper res = getWUInfo(createdWU.getWuid(), false, false, false, false, false, true, false, false, false);

            for (WUExceptionWrapper ex:res.getExceptions())
            {
                if ("error".equalsIgnoreCase(ex.getSeverity()))
                {
                    this.throwWUECLExceptions(res.getRawExceptions().getECLException(), "Workunit Compile Failed");
                }
            }
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
    public void submitWU(WorkunitWrapper wu) throws Exception
    {
        submitWU(wu.getWuid(), wu.getCluster());
    }

    public void submitWU(String wuid, String cluster) throws Exception
    {
        verifyStub(); //Throws exception if stub failed

        WUSubmit request = new WUSubmit();

        request.setWuid(wuid);
        request.setCluster(cluster);

        WUSubmitResponse response = null;

        try
        {
            response = ((WsWorkunits)stub).wUSubmit(request);
        }
        catch (RemoteException e)
        {
            throw new Exception ("WsWorkunits.submitWU(" + wuid + "," + cluster + ") encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspExceptions(new EspSoapFaultWrapper(e), "Could Not perform submitWU");
        }

        if (response.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Error compiling ECL query");
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
    public WURunResponse createAndRunWUFromECL(WorkunitWrapper wu) throws Exception
    {
        WURunResponse wuRunResponse = null;

        verifyStub(); //Throws exception if stub failed

        WorkunitWrapper compiledWU = null;
        compiledWU = compileWUFromECL(wu);

        if (compiledWU != null)
        {
            WURun request = new WURun();
            request.setWuid(compiledWU.getWuid());
            request.setVariables(wu.getRawNamedValues());
            request.setCluster(wu.getCluster());

            try
            {
                wuRunResponse = ((WsWorkunits)stub).wURun(request);
            }
            catch (RemoteException e)
            {
                throw new Exception ("WsWorkunits.createAndRunWUFromECL(...) encountered RemoteException.", e);
            }
            catch (EspSoapFault e)
            {
                handleEspExceptions(new EspSoapFaultWrapper(e), "Error running WUID: " + compiledWU.getWuid());
            }

            if (wuRunResponse.getExceptions() != null)
                handleEspExceptions(new ArrayOfEspExceptionWrapper(wuRunResponse.getExceptions()), "Error running WUID: " + compiledWU.getWuid());

            if (isWorkunitFailed(wuRunResponse.getState()))
            {
                String error = wuRunResponse.getResults();
                throw new Exception("Error running WUID: " + compiledWU.getWuid() + ":\n" + error);
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
    public String createAndRunWUFromECLAndGetResults(WorkunitWrapper wu) throws Exception
    {
        WURunResponse createAndRunWUFromECL = createAndRunWUFromECL(wu);
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
    public String createAndRunWUFromECLAndGetWUID(WorkunitWrapper wu) throws Exception
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
     * @return - Results in xml string
     * @throws Exception
     */
    public String fetchResultsFromLogicalName(String logicalName, int sequence, String cluster,
            boolean suppressXMLShema, long resultOffset, int resultCount) throws Exception
    {
        WUResultResponse wuResultResponse = fetchRawResults(logicalName, false, sequence, cluster, suppressXMLShema,
                resultOffset, resultCount);
        ArrayOfEspException exceptions = wuResultResponse.getExceptions();
        if (exceptions != null) throwWsWUExceptions(exceptions, "Could not fetch results");

        return wuResultResponse.getResult();
    }

    /**
     * Fetches results associated with a given WUID. If the given WUID has been archived, results might not be available
     * using this function Use fetchResultsFromLogicalName instead
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
     * @return - Results in xml string
     * @throws Exception
     */
    public String fetchResults(String wuid, int sequence, String cluster, boolean suppressXMLShema, long resultOffset,
            int resultCount) throws Exception
    {
        WUResultResponse wuResultResponse = fetchRawResults(wuid, true, sequence, cluster, suppressXMLShema,
                resultOffset, resultCount);
        ArrayOfEspException exceptions = wuResultResponse.getExceptions();
        if (exceptions != null) throwWsWUExceptions(exceptions, "Could not fetch results");

        return wuResultResponse.getResult();
    }

    /**
     * Fetches results associated with a given WUID or logical file name.
     *  If the given WUID has been archived, results might not be available -use fetchResultsFromLogicalName instead
     *
     * @param wuidorlogicalname
     * @param useWuid
     * @param sequence
     * @param cluster
     * @param suppressXMLShema
     * @param resultOffset
     * @param resultCount
     * @return
     * @throws Exception
     */
    public WUResultResponse fetchRawResults(String wuidorlogicalname, boolean useWuid, int sequence, String cluster,
            boolean suppressXMLShema, long resultOffset, int resultCount) throws Exception
    {
        verifyStub(); //Throws exception if stub failed

        if (wuidorlogicalname == null || wuidorlogicalname.length() == 0)
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
            if (cluster != null) parameters.setCluster(cluster);
            parameters.setSuppressXmlSchema(suppressXMLShema);

            return fetchRawResults(parameters);
        }
    }

    /**
     * @param wuid
     *            does this string follow the known WU format
     * @return true if it wuid appears to be a workunit, false otherwise
     *
     *         logic borrowed from platform code: workunit.cpp bool looksLikeAWuid(const char * wuid) { if (!wuid)
     *         return false; if (wuid[0] != 'W') return false; if (!isdigit(wuid[1]) || !isdigit(wuid[2]) ||
     *         !isdigit(wuid[3]) || !isdigit(wuid[4])) return false; if (!isdigit(wuid[5]) || !isdigit(wuid[6]) ||
     *         !isdigit(wuid[7]) || !isdigit(wuid[8])) return false; return (wuid[9]=='-'); }
     */
    public static boolean looksLikeAWuid(String wuid)
    {
        if (wuid == null || wuid.length() == 0) return false;
        if (wuid.charAt(0) != 'W' && wuid.charAt(0) != 'w') return false;
        if (!Character.isDigit(wuid.charAt(1)) || !Character.isDigit(wuid.charAt(2))
                || !Character.isDigit(wuid.charAt(3)) || !Character.isDigit(wuid.charAt(4)))
            return false;
        if (!Character.isDigit(wuid.charAt(5)) || !Character.isDigit(wuid.charAt(6))
                || !Character.isDigit(wuid.charAt(7)) || !Character.isDigit(wuid.charAt(8)))
            return false;
        return (wuid.charAt(9) == '-');
    }

    /**
     * Fetches results associated with a given WUID or logical file name.
     * All parameters and options must be pre-set in the "parameters" input param
     *
     * @param parameters
     * @return
     * @throws Exception
     */
    public WUResultResponse fetchRawResults(WUResult parameters) throws Exception
    {
        verifyStub(); //Throws exception if stub failed

        return ((WsWorkunits)stub).wUResult(parameters);
    }

    /**
     * Creates and throws exception with exception message response from WS
     *
     * @param wsWUResponseExceptions
     * @param message
     * @throws Exception
     */
    private void throwWsWUExceptions(ArrayOfEspExceptionWrapper wsWUResponseExceptions, String message) throws Exception
    {
        if (wsWUResponseExceptions == null || wsWUResponseExceptions.getExceptions() == null || wsWUResponseExceptions.getExceptions().size() == 0)
            return;

        StringBuilder multimessage = new StringBuilder();
        multimessage.append(message);
        multimessage.append("\n");

        List<EspExceptionWrapper> exceptions = wsWUResponseExceptions.getExceptions();

        for (EspExceptionWrapper exception : exceptions)
        {
            multimessage.append("\t");
            multimessage.append(exception.getMessage());
        }

        throw new Exception(multimessage.toString());
    }

    private void throwWsWUExceptions(ArrayOfEspException wsWUResponseExceptions, String message) throws Exception
    {
        if (wsWUResponseExceptions == null || wsWUResponseExceptions.getException() == null || wsWUResponseExceptions.getException().length == 0)
            return;

        StringBuilder multimessage = new StringBuilder();
        multimessage.append(message);
        multimessage.append("\n");

        EspException[] exceptionArray = wsWUResponseExceptions.getException();

        for (EspException exception : exceptionArray)
        {
            multimessage.append("\t");
            multimessage.append(exception.getMessage());
        }

        throw new Exception(multimessage.toString());
    }

    /**
     * Creates and throws exception with exception message response from WS
     *
     * @param eclExceptions
     *            - the array of ECLException objects to throw
     * @param message
     *            - the prefix message
     * @throws Exception
     */
    private void throwWUECLExceptions(ECLException[] eclExceptions, String message) throws Exception
    {
        if (eclExceptions == null || eclExceptions.length==0)
        {
            return;
        }
        StringBuilder multimessage = new StringBuilder();
        multimessage.append(message);
        multimessage.append("\n");
        for (int i = 0; i < eclExceptions.length; i++)
        {
            multimessage.append("\t");
            multimessage.append(eclExceptions[i].getMessage());
        }

        throw new Exception(multimessage.toString());
    }

    private void refreshWU(boolean full, WorkunitWrapper wu) throws Exception
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

    private void monitorWUToCompletion(WorkunitWrapper wu) throws Exception
    {
        int timerTickCount = 0;
        String id = wu.getWuid();
        if (wu.getJobname() != null)
        {
            id = id + "(" + wu.getJobname() + ")";
        }

        log.trace("Monitoring WU " + id + " to completion.");

        while (!HPCCWsWorkUnitsClient.isWorkunitComplete(wu))
        {
            try
            {
                log.trace("Monitoring WU " + id + " to completion ( " + timerTickCount + ") ...");
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
                throw new Exception("Error attempting to refresh WU " + wu.getWuid() + "\n" + e.getLocalizedMessage(), e);
            }
        }
    }

    /**
     * Submit the given ECL code for syntax check upon the given target cluster
     *
     * @param ecl          - The ECL to syntax check
     * @param cluster      - The HPCC target cluster on which to syntax check
     * @param timeout      - Maximum time for this check
     * @return
     * @throws Exception
     */
    public List<WUExceptionWrapper> syntaxCheckECL(String ecl, String cluster, Integer timeout) throws Exception
    {
        verifyStub(); //Throws exception if stub failed

        WUSyntaxCheckECL checkParams = new WUSyntaxCheckECL();
        checkParams.setECL(ecl);
        checkParams.setCluster(cluster);
        checkParams.setTimeToWait(timeout);
        WUSyntaxCheckResponse resp = ((WsWorkunits)stub).wUSyntaxCheckECL(checkParams);
        List<WUExceptionWrapper> result = new ArrayList<WUExceptionWrapper>();
        if (resp.getErrors() != null)
        {
            ECLException[] eclExceptions = resp.getErrors().getECLException();
            for (int i=0; i < eclExceptions.length;i++)
            {
                result.add(new WUExceptionWrapper(eclExceptions[i]));
            }
        }
        return result;
    }

    /**
     * Fetch details about the given query
     *
     * @param querySetName
     * @param clusterName
     * @param filter
     * @return
     * @throws Exception
     */
    public WUQuerySetDetailsResponse getQueriesDetail(String querySetName, String clusterName, String filter) throws Exception
    {
        verifyStub(); //Throws exception if stub failed

        WUQuerysetDetails wuQuerysetDetails = new WUQuerysetDetails();
        wuQuerysetDetails.setQuerySetName(querySetName);
        wuQuerysetDetails.setClusterName(clusterName);
        wuQuerysetDetails.setFilter(filter);

        return ((WsWorkunits)stub).wUQuerysetDetails(wuQuerysetDetails);
    }

    /**
     * Request that a given workunit is aborted
     *
     * @param wuid
     * @throws Exception
     */
    public void abortWU(String wuid) throws Exception
    {
        verifyStub(); //Throws exception if stub failed

        WUAbort request = new WUAbort();
        EspStringArray arrayofwuids = new EspStringArray();
        arrayofwuids.addItem(wuid);
        request.setWuids(arrayofwuids);
        request.setBlockTillFinishTimer(1);
        ((WsWorkunits)stub).wUAbort(request);
    }

    /**
     * Request that a given workunit is deleted
     * @param wuid
     * @throws Exception
     */
    public void deleteWU(String wuid) throws Exception
    {
        verifyStub(); //Throws exception if stub failed

        WUDelete request = new WUDelete();

        EspStringArray wuids = new EspStringArray();
        wuids.addItem(wuid);
        request.setWuids(wuids);
        request.setBlockTillFinishTimer(1);
        WUDeleteResponse resp= ((WsWorkunits)stub).wUDelete(request);
        this.throwWsWUExceptions(resp.getExceptions(), "Could not delete " + wuid + ":");
    }

    /**
     * Request that a given workunit is re-submitted. Caller can choose to clone the wu, and
     * to restart the WU's workflow.
     *
     * @param wuid
     * @param restart
     * @param clone
     * @throws Exception
     */
    public void resubmitWU(String wuid, boolean restart, boolean clone) throws Exception
    {
        verifyStub(); //Throws exception if stub failed

        WUResubmit request = new WUResubmit();
        request.setResetWorkflow(restart);
        request.setCloneWorkunit(clone);
        EspStringArray wuids = new EspStringArray();
        wuids.addItem(wuid);
        request.setWuids(wuids);

        ((WsWorkunits)stub).wUResubmit(request);
    }

    /**
     * Fetch set of available QuerySets
     * @return
     * @throws Exception
     */
    public QuerySet[] getQuerySets() throws Exception
    {
        verifyStub(); //Throws exception if stub failed

        QuerySet[] queryset = null;
        WUQuerysets request = new WUQuerysets();
        WUQuerysetsResponse response = ((WsWorkunits)stub).wUQuerysets(request);
        if (response != null && response.getQuerysets() != null)
        {
            queryset = response.getQuerysets().getQuerySet();
        }

        return queryset;
    }

    /**
     * Return a workunit result
     *
     * @param WUResult
     * @return WUResultResponse
     * @throws Exception
     */
    public WUResultResponse getWorkunitResult(WUResult wur) throws Exception
    {
        return getWorkunitResult(wur, false);
    }

    /**
     * @param wuid - wuid to return result for
     * @param resultname - resultname to return result for
     * @return content of result
     * @throws Exception
     */
    public String getWorkunitResult(String wuid, String resultname) throws Exception
    {
        WUResult params = new WUResult();
        params.setWuid(wuid);
        params.setResultName(resultname);
        params.setSuppressXmlSchema(true);

        WUResultResponse resp = getWorkunitResult(params,true);
        if (resp != null)
        {
            this.throwWsWUExceptions(resp.getExceptions(), "Unable to retrieve result " + resultname + " from wuid " + wuid + ":");
            return resp.getResult();
        }
        return null;
    }
    /**
     * Return a workunit result
     *
     * @param WUResult
     * @param unarchive
     * @return WUResultResponse
     * @throws Exception
     */
    public WUResultResponse getWorkunitResult(WUResult wur, boolean unarchive) throws Exception
    {
        // get the object first to make sure it's not archived
        if (unarchive)
        {
            this.getWUInfo(wur.getWuid(), unarchive);
        }

        // get the response
        WUResultResponse resp = ((WsWorkunitsStub)stub).wUResult(wur);
        return resp;
    }

    /**
     * Request a given action to be performed upon the given workunit.
     *
     * @param wuid       - The target workunit
     * @param action     - The action to be requested see ECLWUActions
     * @return
     * @throws ArrayOfEspException
     * @throws RemoteException
     * @throws Exception
     */
    public boolean doWorkunitAction(String wuid, ECLWUActions action) throws RemoteException, Exception
    {
        verifyStub(); //Throws exception if stub failed

        WUAction request = new WUAction();

        request.setWUActionType(action);

        EspStringArray wuids = new EspStringArray();
        wuids.addItem(wuid);
        request.setWuids(wuids);

        WUActionResponse response = null;

        try
        {
            response = ((WsWorkunitsStub)stub).wUAction(request);
        }
        catch (RemoteException e)
        {
            throw new Exception ("WsWorkunitsClient.doWorkunitAction(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspExceptions(new EspSoapFaultWrapper(e), "Could Not perform doWorkunitAction(" + wuid + ", " + action.toString() + ")");
        }

        if (response.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could Not perform doWorkunitAction(" + wuid + ", " + action.toString() + ")");

        if (response == null || response.getActionResults() == null || response.getActionResults().getWUActionResult().length == 0
                || response.getActionResults().getWUActionResult()[0].getResult() == null
                || !response.getActionResults().getWUActionResult()[0].getResult().equals("Success"))
        {
            // fallback to 1.56 api
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.WUAction fwa = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.WUAction();
            fwa.setActionType(action.getValue());
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.EspStringArray espstringarray = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.EspStringArray();
            wuids.addItem(wuid);
            fwa.setWuids(espstringarray);

            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.WUActionResponse fwar = stubWrapper.getVersion1_56Raw().wUAction(fwa);
            if (fwar == null || fwar.getActionResults() == null || fwar.getActionResults().getWUActionResult() == null || fwar.getActionResults().getWUActionResult().length == 0
                    || fwar.getActionResults().getWUActionResult()[0].getResult() == null
                    || !fwar.getActionResults().getWUActionResult()[0].getResult().equals("Success"))
            {
                String failreason = "unknown action result";
                if (fwar != null && fwar.getActionResults() != null && fwar.getActionResults().getWUActionResult()[0].getResult() != null)
                    failreason = fwar.getActionResults().getWUActionResult()[0].getResult();

                throw new Exception("Unable to perform " + action.getValue() + " on " + wuid + " :: " + failreason);
            }
        }
        return true;
    }

    private String getEclWatchUrl() throws Exception
    {
        String url = "";
        if (stub != null)
            url = stub._getServiceClient().getOptions().getTo().getAddress().toLowerCase().replace("wsworkunits", "");

        return url;
    }

    /**
     * Create a new workunit. Does not update/run/submit
     * @return new WorkunitInfo containing created wuid
     * @throws Exception
     */
    public WorkunitWrapper createWorkunit() throws Exception
    {
        WUCreateRequestWrapper params = new WUCreateRequestWrapper();
        WUCreateResponseWrapper resp = stubWrapper.WUCreate(params);
        throwWsWUExceptions(resp.getRawArrayOfEspExceptions(),"Could not create workunit");
        return resp.getWorkunitWrapper();
    }

    /**
     * Protect a workunit
     * @param wuid - wuid to protect
     * @return WorkunitInfo with updated status
     * @throws Exception
     */
    public WorkunitWrapper protectWorkunit(String wuid) throws Exception
    {
        final WUUpdateRequestWrapper params = new WUUpdateRequestWrapper();
        params.set_protected(true);
        params.setWuid(wuid);
        WUUpdateResponseWrapper resp = stubWrapper.WUUpdate(params);

        this.throwWsWUExceptions(resp.getRawArrayOfEspExceptions(),"Could not protect workunit " + wuid);
        return resp.getWorkunitWrapper();
    }

    /**
     * Get Workunit file
     * @param wuid
     * @param filename
     * @param filetype
     * @param description
     * @param ipaddr
     * @param entirefile
     * @return
     * @throws Exception
     */
    public WULogFileWrapper getWorkunitFile(String wuid, String filename, WUFileType filetype, String description, String ipaddr, boolean entirefile) throws Exception
    {
        WUFile file = new WUFile();
        file.setWuid(wuid);
        file.setName(filename);
        file.setType(filetype.toString());
        file.setDescription(description);
        file.setIPAddress(ipaddr);
        if (entirefile)
        {
            file.setOption(1);
        }

        WULogFileResponse logFileResponse = ((WsWorkunitsStub)stub).wUFile(file);
        this.throwWsWUExceptions(logFileResponse.getExceptions(), "Could not retrieve file " + filename + " for wuid " + wuid);
        return new WULogFileWrapper(logFileResponse);

    }

    /**
     * Request to run a given workunit. Caller can set various WU options.
     *
     * @param wuid - wuid to call WURun for
     * @param namedvalues - override stored variables with this set of stored variables
     * @param appvalues - override application values with this set of app values
     * @param timeout - if provided, timeout before returning
     * @param cloneWorkunit - if true, clone workunit before rerunning
     * @param appsource - application source for app values
     * @return WorkunitInfo with wuid of run, run status & result
     * @throws Exception
     */
    public WorkunitWrapper runWorkunit(String wuid, HashMap<String,String> namedvalues, HashMap<String,String> appvalues,
            Integer timeout,Boolean cloneWorkunit, String appsource) throws Exception
    {
        WURun params = new WURun();
        params.setWuid(wuid);
        params.setCloneWorkunit(cloneWorkunit);
        //default setting is synchronous/waits until workunit completes. Set this to asynchronous
        params.setWait(timeout);

        if (appvalues != null)
        {
            ArrayOfApplicationValue appvaluesarray = new ArrayOfApplicationValue();
            for (Entry<String,String> item:appvalues.entrySet())
            {
                ApplicationValue val = new ApplicationValue();
                val.setName(item.getKey());
                val.setValue(item.getValue());
                val.setApplication(appsource);
                appvaluesarray.addApplicationValue(val);
            }
            params.setApplicationValues(appvaluesarray);
        }

        if (namedvalues != null)
        {
            ArrayOfNamedValue nvarray = new ArrayOfNamedValue();
            for (Entry<String,String> item:namedvalues.entrySet())
            {
                NamedValue val=new NamedValue();
                val.setName(item.getKey());
                val.setValue(item.getValue());
                nvarray.addNamedValue(val);
            }

            params.setVariables(nvarray);
        }

        WURunResponse resp = ((WsWorkunitsStub)stub).wURun(params);

        throwWsWUExceptions(resp.getExceptions(),"Could not run workunit " + wuid);

        WorkunitWrapper wi = new WorkunitWrapper();
        wi.setState(resp.getState());
        wi.setWuid(resp.getWuid());

        if (resp.getResults() != null && !resp.getResults().isEmpty())
        {
            ECLResultWrapper msg = new ECLResultWrapper();
            msg.setValue(resp.getResults());
            wi.setResults(Arrays.asList(msg));
        }
        return wi;
    }

    /**
     * Fetch list of querysets
     *
     * @param filtertype
     * @param filtervalue
     * @param querySetName
     * @param clustername
     * @return
     * @throws Exception
     */
    public List<QueryResultWrapper> searchQueries(QuerySetFilterType filtertype, String filtervalue, String querySetName, String clustername) throws Exception
    {
        final WUQuerysetDetails params = new WUQuerysetDetails();
        params.setClusterName(clustername);
        params.setFilter(filtervalue);
        if (filtertype != null)
        {
            params.setFilterType(QuerySetFilterTypeWrapper.get1_75FilterType(filtertype));
        }
        params.setQuerySetName(querySetName);
        WUQuerySetDetailsResponse resp = ((WsWorkunitsStub)stub).wUQuerysetDetails(params);
        throwWsWUExceptions(resp.getExceptions(), "Could not search queries:" );

        QuerySetQuery[] queries = resp.getQuerysetQueries().getQuerySetQuery();

        List<QueryResultWrapper> result = new ArrayList<QueryResultWrapper>();

        if (queries!=null)
        {
            for (QuerySetQuery item:queries)
            {
                result.add(new QueryResultWrapper(item));
            }
        }
        return result;
    }

    /**
     * Call WUListQueries service
     * @param queryid - unique ID of the query
     * @param queryname - name/alias of the query
     * @param clustername - name of the cluster the query is on
     * @param querysetname - name of the queryset the cluster is part of
     * @param pageSize - number of results to return (if null, 100 results are returned)
     * @param pageStartFrom - which result to start returning on (if null, results start with 1)
     * @param activated - whether to return activated queries
     * @param filename - return queries using this filename
     * @return List of QueryResults populated from QuerySetQuery list
     * @throws Exception
     */
    public List<QueryResultWrapper> listQueries(String queryid, String queryname, String clustername, String querysetname,
            Integer pageSize,Integer pageStartFrom, Boolean activated, String filename,Boolean descending) throws Exception
    {
        final WUListQueries params = new WUListQueries();
        if (pageSize != null)
        {
            params.setPageSize(new NonNegativeInteger(String.valueOf(pageSize)));
        }

        if (pageStartFrom != null)
        {
            params.setPageStartFrom(new NonNegativeInteger(String.valueOf(pageStartFrom)));
        }

        params.setDescending(descending);
        params.setClusterName(clustername);
        params.setQuerySetName(querysetname);
        params.setQueryName(queryname);
        params.setQueryID(queryid);
        params.setActivated(activated);
        params.setFileName(filename);

        WUListQueriesResponse response = ((WsWorkunitsStub)stub).wUListQueries(params);
        throwWsWUExceptions(response.getExceptions(), "Could not fetch queries: ");

        QuerySetQuery[] queries = response.getQuerysetQueries().getQuerySetQuery();
        List<QueryResultWrapper> result = new ArrayList<QueryResultWrapper>();
        if (queries!=null)
        {
            for (QuerySetQuery item:queries)
            {
                result.add(new QueryResultWrapper(item));
            }
        }
        return result;
    }

    /**
     * @param queryname - query to retrieve files for
     * @param cluster - the cluster to search for said query
     * @return - List<QueryFileWrapper> of matching queries
     * @throws Exception
     */
    public List<QueryFileWrapper> getQueryFiles(String queryname, String cluster) throws Exception
    {
        final WUQueryFiles request = new WUQueryFiles();
        request.setTarget(cluster);
        request.setQueryId(queryname);

        WUQueryFilesResponse response = ((WsWorkunitsStub)stub).wUQueryFiles(request);

        throwWsWUExceptions(response.getExceptions(), "Could not get files for query " + queryname + ":");

        List<QueryFileWrapper> result = new ArrayList<QueryFileWrapper>();
        if (response.getFiles() != null)
        {
            FileUsedByQuery[] files = response.getFiles().getFile();
            if (files != null)
            {
                for (int i = 0; i < files.length; i++)
                {
                    result.add(new QueryFileWrapper(files[i]));
                }
            }
        }
        return result;
    }

    /**
     * @param queryId - unique id of query to activate
     * @param cluster - cluster to activate upon
     * @return
     * @throws Exception
     */
    public QueryResultWrapper activateQuery(String queryId, String cluster) throws Exception
    {
        final WUQuerysetQueryAction queryAction = new WUQuerysetQueryAction();
        queryAction.setAction(QuerySetQueryActionTypes.Activate);
        final QuerySetQueryActionItem item = new QuerySetQueryActionItem();
        item.setQueryId(queryId);
        final QuerySetQueryActionItem[] items = new QuerySetQueryActionItem[]{item};
        queryAction.setQuerySetName(cluster);
        Queries_type0 queries = new Queries_type0();
        queries.setQuery(items);
        queryAction.setQueries(queries);
        final WUQuerySetQueryActionResponse resp = ((WsWorkunitsStub)stub).wUQuerysetQueryAction(queryAction);
        this.throwWsWUExceptions(resp.getExceptions(), "Could not activate query " + queryId);

        if (resp.getResults() != null && resp.getResults().getResult().length > 0)
        {
            QueryResultWrapper wrapped = new QueryResultWrapper(resp.getResults().getResult()[0]);
            if (QuerySetQueryActionTypes.Activate.equals(resp.getAction()))
            {
                wrapped.setActivated(true);
            }
            else
            {
                wrapped.setActivated(false);
            }
            return wrapped;
        }
        return null;
    }

    /**
     * @param querynames - queries to delete
     * @param cluster - cluster to delete from
     * @return - List<QueryResult> result of actions
     * @throws Exception
     */
    public List<QueryResultWrapper> deleteQueries(Set<String> querynames, String cluster) throws Exception
    {
        verifyStub(); //Throws exception if stub failed

        WUQuerysetQueryAction params = new WUQuerysetQueryAction();

        Queries_type0 queriesarray = new Queries_type0();
        for (String queryname : querynames)
        {
            QuerySetQueryActionItem item = new QuerySetQueryActionItem();
            item.setQueryId(queryname);

            queriesarray.addQuery(item);
        }

        params.setQueries(queriesarray);
        params.setQuerySetName(cluster);
        params.setAction(QuerySetQueryActionTypes.Delete);

        WUQuerySetQueryActionResponse response = ((WsWorkunitsStub)stub).wUQuerysetQueryAction(params);
        throwWsWUExceptions(response.getExceptions(), "Could not delete queries: ");

        List<QueryResultWrapper> results = new ArrayList<QueryResultWrapper>();

        if (response.getResults() != null)
        {
            if (response.getResults() != null)
            {
                QuerySetQueryActionResult [] result = response.getResults().getResult();
                for (int j=0; j < result.length; j++)
                {
                    QuerySetQueryActionResult res = result[j];
                    results.add(new QueryResultWrapper(res));
                }
            }
        }
        return results;
    }

    public boolean ping() throws Exception
    {
        verifyStub();

        Ping request = new Ping();

        try
        {
            ((WsWorkunitsStub)stub).ping(request);
        }
        catch (Exception e)
        {
            return false;
        }

        return true;
    }
}

package org.hpccsystems.ws.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Stub;
import org.apache.axis2.databinding.types.NonNegativeInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hpccsystems.commons.errors.WUException;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ApplicationValue;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfApplicationValue;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLWorkunit;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfEspException;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfNamedValue;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQuerySetQuery;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWUActions;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWorkunit;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EspSoapFault;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EspStringArray;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.FileUsedByQuery;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.NamedValue;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Ping;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Queries_type1;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySet;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetQuery;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetQueryActionItem;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetQueryActionResult;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetQueryActionTypes;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAbort;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAction;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUActionResponse;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDelete;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDeleteResponse;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUFile;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUListQueries;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUListQueriesResponse;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WULogFileResponse;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPublishWorkunit;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPublishWorkunitResponse;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuery;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryFiles;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryFilesResponse;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryResponse;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerySetDetailsResponse;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerySetQueryActionResponse;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetDetails;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetQueryAction;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysets;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetsResponse;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResubmit;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResult;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultResponse;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WURun;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WURunResponse;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUSubmit;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUSubmitResponse;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUSyntaxCheckECL;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUSyntaxCheckResponse;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WsWorkunits;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WsWorkunitsStub;
import org.hpccsystems.ws.client.platform.QuerySetFilterType;
import org.hpccsystems.ws.client.platform.WUActionCode;
import org.hpccsystems.ws.client.platform.Workunit;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.wrappers.ApplicationValueWrapper;
import org.hpccsystems.ws.client.wrappers.ArrayOfECLExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.ECLExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.EspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.EspSoapFaultWrapper;
import org.hpccsystems.ws.client.wrappers.WUFileType;
import org.hpccsystems.ws.client.wrappers.WUState;
import org.hpccsystems.ws.client.wrappers.gen.wsworkunits.WUPublishWorkunitResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsworkunits.WURunResponseWrapper;
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
import org.hpccsystems.ws.client.wrappers.wsworkunits.WUSubmitWrapper;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WUUpdateRequestWrapper;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WUUpdateResponseWrapper;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WorkunitWrapper;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WsWorkunitsClientStubWrapper;

import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.context.Context;
import io.opentelemetry.context.Scope;
import io.opentelemetry.instrumentation.annotations.SpanAttribute;
import io.opentelemetry.instrumentation.annotations.WithSpan;

/**
 * Facilitates ECL WorkUnit related actions.
 *
 * Supported actions include fetching Workunit info, submiting ECL query,
 * fetching workunit status, publishing workunit, deleting, aborting and more.
 */
public class HPCCWsWorkUnitsClient extends BaseHPCCWsClient
{
    private static final Logger          log                = LogManager.getLogger(HPCCWsWorkUnitsClient.class);
    /** Constant <code>WSWORKUNITSWSDLURI="/WsWorkunits"</code> */
    public static final String           WSWORKUNITSWSDLURI = "/WsWorkunits";
    /** Constant <code>defaultWaitTime=10000</code> */
    public static final int              defaultWaitTime    = 10000;
    /** Constant <code>defaultResultLimit=100</code> */
    public static final int              defaultResultLimit = 100;
    /** Constant <code>defaultMaxWaitTime=1000 * 60 * 5</code> */
    public static final int              defaultMaxWaitTime = 1000 * 60 * 5;
    private WsWorkunitsClientStubWrapper stubWrapper        = null;

    private static int                   DEFAULTSERVICEPORT = -1;
    private static String                WSDLURL            = null;

    /**
     * Load WSDLURL.
     */
    private static void loadWSDLURL()
    {
        try
        {
            WSDLURL = getServiceWSDLURL(new WsWorkunitsStub());
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
        return WSWORKUNITSWSDLURI;
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
     * @return the HPCC ws work units client
     */
    public static HPCCWsWorkUnitsClient get(Connection connection)
    {
        return new HPCCWsWorkUnitsClient(connection);
    }

    /**
     * Gets the.
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
     * @return the HPCC ws work units client
     */
    public static HPCCWsWorkUnitsClient get(String protocol, String targetHost, String targetPort, String user, String pass)
    {
        Connection conn = new Connection(protocol, targetHost, targetPort);
        conn.setCredentials(user, pass);
        return new HPCCWsWorkUnitsClient(conn);
    }

    /**
     * Gets the.
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
     * @return the HPCC ws work units client
     */
    public static HPCCWsWorkUnitsClient get(String protocol, String targetHost, String targetPort, String user, String pass, int timeout)
    {
        Connection conn = new Connection(protocol, targetHost, targetPort);
        conn.setCredentials(user, pass);
        conn.setConnectTimeoutMilli(timeout);
        conn.setSocketTimeoutMilli(timeout);

        return new HPCCWsWorkUnitsClient(conn);
    }

    /**
     * Instantiates a new HPCC ws work units client.
     *
     * @param baseConnection
     *            the base connection
     */
    protected HPCCWsWorkUnitsClient(Connection baseConnection)
    {
        initWsWorkUnitsClientStub(baseConnection);
    }

    /**
     * Initializes the service's underlying soap proxy. Should only be used by constructors
     *
     * @param conn
     *            the conn
     */
    public void initWsWorkUnitsClientStub(Connection conn)
    {
        initBaseWsClient(conn, true); //Preemptively fetch HPCC build version, Containerized mode

        if (targetHPCCBuildVersion != null)
        {
            try
            {
                stubWrapper = new WsWorkunitsClientStubWrapper(conn, targetHPCCBuildVersion);
                stub = stubWrapper.getLatestStub();
                stub = setStubOptions(new WsWorkunitsStub(conn.getBaseUrl() + WSWORKUNITSWSDLURI), conn);
            }
            catch (AxisFault e)
            {
                String connectionInfo = getConnectionInfo(conn);
                initErrMessage += "\nHPCCWsWorkUnitsClient: Could not retrieve version appropriate stub object " + connectionInfo + ": " + e.getMessage();
                initErrMessage += "\nPossible causes: (1) HPCC platform version incompatibility - this client supports versions 6.0, 6.2, 6.4+ and 7+";
                initErrMessage += "\n(2) WsWorkunits service unavailable or not accessible at the target host";
                initErrMessage += "\n(3) Network connectivity issues preventing version detection";
                initErrMessage += "\nSuggested actions: Verify HPCC platform version, check service availability, and confirm network connectivity";
            }
        }
        else
            initErrMessage += "\nCannot initialize HPCCWsDFUStub without valid HPCC version object";
    }

    /**
     * Performs limited refresh of local WU instance based on that WU's state on target
     * HPCC cluster if state of WU has not changed, Graphs, Results,ResultsView, ResultSchemas,
     * SourceFiles, ApplicationValues are not updated. However if local WU instance's state
     * is found to differ from the server's version, a full refresh is performed.
     *
     * @param wu
     *            the wu
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public void fastWURefresh(WorkunitWrapper wu) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub(); // Throws exception if stub failed

        WUQuery request = new WUQuery();

        WUState previousState = getStateID(wu);

        request.setWuid(wu.getWuid());
        request.setCount(1);

        WUQueryResponse response = null;
        try
        {
            response = ((WsWorkunits) stub).wUQuery(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("WsWorkunits.fastWURefresh(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not perform fastWURefresh");
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
     *            the wu
     * @throws java.lang.Exception
     *             the exception
     */
    protected void fullWURefresh(WorkunitWrapper wu) throws Exception
    {
        fullWURefresh(wu, true, true, true, true);
    }

    /**
     * Full WU refresh.
     *
     * @param wu
     *            the wu
     * @param includeGraphs
     *            the include graphs
     * @param includeResults
     *            the include results
     * @param includeSourceFiles
     *            the include source files
     * @param includeApplicationValues
     *            the include application values
     * @throws java.lang.Exception
     *             the exception
     */
    public void fullWURefresh(WorkunitWrapper wu, boolean includeGraphs, boolean includeResults, boolean includeSourceFiles,
            boolean includeApplicationValues) throws Exception
    {
        verifyStub(); // Throws exception if stub failed

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
            for (EspExceptionWrapper e : response.getExceptions().getEspExceptions())
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
     *            the wuid
     * @return true if state is compiled
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public boolean isWorkunitCompiled(String wuid) throws Exception, ArrayOfEspExceptionWrapper
    {
        WorkunitWrapper thewui = getWUInfo(wuid);
        if (thewui != null) return isWorkunitCompiled(thewui);

        return false;
    }

    /**
     * Reports if the WU in question is in the compiled state. Does not make call to the target Web Service, extracts
     * information from the WU object
     *
     * @param thewui
     *            the thewui
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
     *            the thewui
     * @return true if state is failed
     */
    public boolean isWorkunitFailed(WorkunitWrapper thewui)
    {
        return isWorkunitState(getStateID(thewui), WUState.FAILED);
    }

    /**
     * Reports if the string state represents the failed state.
     *
     * @param state
     *            the state
     * @return true if state is failed
     */
    public boolean isWorkunitFailed(String state)
    {
        return state.equalsIgnoreCase(WUState.FAILED.toString());
    }

    /**
     * Compares two WuStates.
     *
     * @param state1
     *            the state 1
     * @param state2
     *            the state 2
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
     *            the wuid
     * @return true, if is workunit complete
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public boolean isWorkunitComplete(String wuid) throws Exception, ArrayOfEspExceptionWrapper
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
     *            the thewui
     * @return true if wu is in one of the complete states
     */
    static public boolean isWorkunitComplete(WorkunitWrapper thewui)
    {
        WUActionCode origAction = WUActionCode.fromName(thewui.getActionEx()); // some WUs have ActionEX as a string
        if (origAction == WUActionCode.WUActionUnknown) origAction = WUActionCode.fromInteger(thewui.getAction()); // some WUs have Action as a code

        return isWorkunitComplete(getStateID(thewui), origAction);
    }

    /**
     * reports if a workunit is complete based on wustate, and original action if available.
     *
     * @param state
     *            the state
     * @param origAction
     *            the orig action
     * @return true if wu is in completed state
     */
    static public boolean isWorkunitComplete(WUState state, WUActionCode origAction)
    {
        if (origAction == WUActionCode.WUActionRun && isWorkunitState(state, WUState.COMPILED)) return false;

        return isWorkunitComplete(state);
    }

    /**
     * reports if WuState is in the completed set.
     *
     * @param state
     *            the state
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
     * Gets the state ID.
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
     * Converts integer representation of WU state, to WUState enumeration.
     *
     * @param id
     *            the id
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
     * @param wu
     *            - Workunitinfo object containing all pertinent information for WU request
     * @return the WU publish workunit response
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     * @deprecated use publishWUFromEclWrapped
     */
    public WUPublishWorkunitResponse publishWUFromEcl(WorkunitWrapper wu) throws Exception, ArrayOfEspExceptionWrapper
    {
        return publishWUFromEclWrapped(wu).getRaw();
    }

    /**
     * Attempts to create, compile and publish a query based on ecl provided via a workunitinfo object.
     *
     * @param wu
     *            - Workunitinfo object containing all pertinent information for WU request
     * @return the WU publish workunit response
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public WUPublishWorkunitResponseWrapper publishWUFromEclWrapped(WorkunitWrapper wu) throws Exception, ArrayOfEspExceptionWrapper
    {
        WUPublishWorkunitResponse publishWUResp = null;

        verifyStub(); // Throws exception if stub failed

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

        return new WUPublishWorkunitResponseWrapper(publishWUResp);
    }

    /**
     * Attempts to publish a query based on a given Workunit.
     *
     * @param wu
     *            the wu
     * @return the WU publish workunit response
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     * @deprecated use publishWUWrapped
     */
    public WUPublishWorkunitResponse publishWU(WorkunitWrapper wu) throws Exception, ArrayOfEspExceptionWrapper
    {
        return publishWUWrapped(wu).getRaw();
    }

    @WithSpan
    public WUPublishWorkunitResponseWrapper publishWUWrapped(WorkunitWrapper wu) throws Exception, ArrayOfEspExceptionWrapper
    {
        WUPublishWorkunitResponse publishWUResp = null;

        if (wu == null)
            throw new Exception("Invalid wuid submited");
        else
        {
            verifyStub(); // Throws exception if stub failed

            WUPublishWorkunit publishWU = new WUPublishWorkunit();
            publishWU.setJobName(wu.getJobname());
            publishWU.setWuid(wu.getWuid());
            publishWU.setCluster(wu.getCluster());
            publishWU.setActivate((int) 1);

            publishWUResp = ((WsWorkunits) stub).wUPublishWorkunit(publishWU);

            ArrayOfEspException exceptions = publishWUResp.getExceptions();
            if (exceptions != null)
            {
                handleEspExceptions(new ArrayOfEspExceptionWrapper(exceptions), "Could not publish WU");
            }
        }

        return new WUPublishWorkunitResponseWrapper(publishWUResp);
    }

    /**
     * Publish WU.
     *
     * @param wuid
     *            the wuid
     * @throws java.lang.Exception
     *             the exception
     */
    @WithSpan
    public void publishWU(String wuid) throws Exception
    {
        if (wuid == null || wuid.isEmpty())
            throw new Exception("Invalid wuid submited");
        else
        {
            verifyStub(); // Throws exception if stub failed

            WUPublishWorkunit publishWU = new WUPublishWorkunit();
            publishWU.setWuid(wuid);

            ((WsWorkunits) stub).wUPublishWorkunit(publishWU);
        }
    }

    /**
     * Get information about a given WorkUnit. Workunit must not be archived.
     *
     * @param wuid
     *            - ID of target workunit
     * @return - ECLWorkunit object with information pertaining to the WU
     * @throws Exception
     *             - Caller must handle exceptions
     * @throws ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    /*
     * public WorkunitInfo getWUInfo(String wuid) throws Exception
     * {
     * return getWUInfo(wuid, false);
     * }
     */

    /**
     * Get information about a given WorkUnit, caller can request to unarchive
     * the WU if necessary to fetch WU info.
     *
     * @param wuinfodetailsparams
     *            - workunit info request wrapper
     * @return - WorkunitWrapper object with information pertaining to the WU
     * @throws Exception a {@link java.lang.Exception} object.
     *             - Caller must handle exceptions
     * @throws ArrayOfEspExceptionWrapper a {@link org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper} object.
     *             the array of esp exception wrapper
     */
    @WithSpan
    public WorkunitWrapper getWUInfo(WUInfoRequestWrapper wuinfodetailsparams) throws Exception, ArrayOfEspExceptionWrapper
    {
        WorkunitWrapper workunit = null;

        verifyStub(); // Throws exception if stub failed

        WUInfoResponseWrapper wuInfoResponse = stubWrapper.WUInfo(wuinfodetailsparams);

        ArrayOfEspException exceptions = wuInfoResponse.getRaw();
        if (exceptions == null && wuInfoResponse.getWorkunit() != null)
        {
            workunit = wuInfoResponse.getWorkunit();
            workunit.setOriginalEclWatchUrl(getEclWatchUrl());
            workunit.setResultViews(wuInfoResponse.getResultViews());

            //if archived, unarchive if specified
            if (wuinfodetailsparams.attemptUnarchive() && workunit.getArchived())
            {
                doWorkunitAction(wuinfodetailsparams.getWuid(), ECLWUActions.Restore);
                wuInfoResponse = stubWrapper.WUInfo(wuinfodetailsparams);
                if (exceptions == null && wuInfoResponse.getWorkunit() != null)
                {
                    workunit = wuInfoResponse.getWorkunit();
                    workunit.setOriginalEclWatchUrl(getEclWatchUrl());
                    workunit.setResultViews(wuInfoResponse.getResultViews());
                }
            }
        }
        else
        {
            handleEspExceptions(new ArrayOfEspExceptionWrapper(exceptions), "Could not fetch WU Info");
        }

        return workunit;
    }
    /**
     * Get information about a given WorkUnit. Workunit must not be archived.
     *
     * @param wuid
     *            - ID of target workunit
     * @return - ECLWorkunit object with information pertaining to the WU
     * @throws java.lang.Exception
     *             - Caller must handle exceptions
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public WorkunitWrapper getWUInfo(String wuid) throws Exception, ArrayOfEspExceptionWrapper
    {
        return getWUInfo(wuid,false);
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
     * @throws java.lang.Exception
     *             - Caller must handle exceptions
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    @WithSpan
    public WorkunitWrapper getWUInfo(String wuid, boolean unarchive) throws Exception, ArrayOfEspExceptionWrapper
    {
        WUInfoRequestWrapper wuinfodetailsparams = new WUInfoRequestWrapper();
        wuinfodetailsparams.setIncludeApplicationValues(false);
        wuinfodetailsparams.setIncludeDebugValues(false);
        wuinfodetailsparams.setIncludeExceptions(true);
        wuinfodetailsparams.setIncludeGraphs(false);
        wuinfodetailsparams.setIncludeResults(true);
        wuinfodetailsparams.setWuid(wuid);
        wuinfodetailsparams.setAttemptUnarchive(unarchive);
        return getWUInfo(wuinfodetailsparams);
    }

    /**
     * Get information about a given WorkUnit, Workunit must not be archived.
     * Caller can choose which WU information portion to fetch
     *
     * Deprecated; use getWUInfo(WSInfoRequestWrapper,unarchive)
     *
     * @param wuid
     *            the wuid
     * @param includeResults
     *            the include results
     * @param includeGraphs
     *            the include graphs
     * @param includeSourceFiles
     *            the include source files
     * @param includeApplicationValues
     *            the include application values
     * @param includeDebugValues
     *            the include debug values
     * @param includeExceptions
     *            the include exceptions
     * @param includeVariables
     *            the include variables
     * @param includeXmlSchemas
     *            the include xml schemas
     * @param includeTimers
     *            the include timers
     * @return the WU info
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    @Deprecated
    public WorkunitWrapper getWUInfo(String wuid, boolean includeResults, boolean includeGraphs, boolean includeSourceFiles,
            boolean includeApplicationValues, Boolean includeDebugValues, Boolean includeExceptions, Boolean includeVariables,
            Boolean includeXmlSchemas, Boolean includeTimers) throws Exception, ArrayOfEspExceptionWrapper
    {
        WUInfoRequestWrapper params = new WUInfoRequestWrapper();
        params.setWuid(wuid);
        params.setIncludeResults(includeResults);
        params.setIncludeGraphs(includeGraphs);
        params.setIncludeSourceFiles(includeSourceFiles);
        params.setIncludeApplicationValues(includeApplicationValues);
        if (includeDebugValues != null)
            params.setIncludeDebugValues(includeDebugValues);
        if (includeExceptions != null)
            params.setIncludeExceptions(includeExceptions);
        if (includeVariables != null)
            params.setIncludeVariables(includeVariables);
        if (includeXmlSchemas != null)
            params.setIncludeXmlSchemas(includeXmlSchemas);
        if (includeTimers != null)
            params.setIncludeTimers(includeTimers);
        params.setAttemptUnarchive(false);
        return getWUInfo(params);
    }

    /**
     * Get information about a given WorkUnit, caller can request to unarchive
     * Caller can choose which WU information portion to fetch.
     * Deprecated; use getWUInfo(WSInfoRequestWrapper,unarchive)
     *
     * @param wuid
     *            the wuid
     * @param includeResults
     *            the include results
     * @param includeGraphs
     *            the include graphs
     * @param includeSourceFiles
     *            the include source files
     * @param includeApplicationValues
     *            the include application values
     * @param includeDebugValues
     *            the include debug values
     * @param includeExceptions
     *            the include exceptions
     * @param includeVariables
     *            the include variables
     * @param includeXmlSchemas
     *            the include xml schemas
     * @param includeTimers
     *            the include timers
     * @param unarchive
     *            the unarchive
     * @return the WU info
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    @Deprecated
    public WorkunitWrapper getWUInfo(String wuid, boolean includeResults, boolean includeGraphs, boolean includeSourceFiles,
            boolean includeApplicationValues, Boolean includeDebugValues, Boolean includeExceptions, Boolean includeVariables,
            Boolean includeXmlSchemas, Boolean includeTimers, boolean unarchive) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub(); // Throws exception if stub failed

        WUInfoRequestWrapper request = new WUInfoRequestWrapper();
        request.setWuid(wuid);
        request.setIncludeGraphs(includeGraphs);
        request.setIncludeResults(includeResults);
        request.setIncludeResultsViewNames(includeResults);
        request.setSuppressResultSchemas(!includeResults);
        request.setIncludeSourceFiles(includeSourceFiles);
        request.setIncludeApplicationValues(includeApplicationValues);
        if (includeDebugValues != null)
            request.setIncludeDebugValues(includeDebugValues);
        if (includeExceptions != null)
            request.setIncludeExceptions(includeExceptions);
        if (includeTimers != null)
            request.setIncludeTimers(includeTimers);
        if (includeVariables != null)
            request.setIncludeVariables(includeVariables);
        if (includeXmlSchemas != null)
            request.setIncludeXmlSchemas(includeXmlSchemas);
        request.setAttemptUnarchive(unarchive);
        return getWUInfo(request);
    }

    /**
     * This method queries WU information using a bogus WUID. Used as a mechanism for testing connectivity with HPCC
     * ESP. Temporarily increases timeout value to 3 seconds;
     *
     * @return - True if able to reply is received within timout value of 3 secs, false otherwise
     * @throws java.lang.Exception
     *             - Caller must handle exceptions
     */
    public boolean testWUQuery() throws Exception
    {
        Integer oldTimeout = -1;

        verifyStub(); // Throws exception if stub failed

        WUQuery request = new WUQuery();
        request.setWuid("XXX"); //$NON-NLS-1$
        try
        {
            oldTimeout = this.getStubConnectionTO();
            this.setStubConnectionTO(3 * 1000);

            ((WsWorkunits) stub).wUQuery(request);
            return true;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            if (oldTimeout != null && oldTimeout != -1) this.setStubConnectionTO(oldTimeout.intValue());
        }
        return false;
    }

    /**
     * As of Platform version 6.0.0. Now maps to new prototype, excluding the pageSize and startPageFrom parameters.
     * Executes a WUQuery, based on parameters provided. If a custom WUQuery is desired, the caller can make a direct
     * call to WUQuery based on the soapproxy for this client. If using applicationValues objects for filtering, a user
     * must pair the Application with either an attribute name, or attribute value.
     *
     * @param wuid
     *            the wuid
     * @param jobname
     *            the jobname
     * @param cluster
     *            the cluster
     * @param archived
     *            the archived
     * @param sortby
     *            the sortby
     * @param state
     *            the state
     * @param endDate
     *            the end date
     * @param startDate
     *            the start date
     * @param pageStartFrom
     *            the page start from
     * @param pageSize
     *            the page size
     * @param owner
     *            the owner
     * @param applicationValues
     *            the application values
     * @return the list
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    @WithSpan
    public List<WorkunitWrapper> workUnitUQuery(String wuid, String jobname, String cluster, Boolean archived, WUQueryWrapper.SortBy sortby,
            WUState state, Date endDate, Date startDate, Long pageStartFrom, Long pageSize, String owner,
            List<ApplicationValueWrapper> applicationValues) throws Exception, ArrayOfEspExceptionWrapper
    {
        WUQueryWrapper info = new WUQueryWrapper();
        info.setWuid(wuid);
        info.setJobname(jobname);
        info.setCluster(cluster);
        if (archived)
            info.setArchived(archived);
        info.setSortBy(sortby);
        info.setState(state);
        if (endDate != null)
            info.setEndDate(endDate);
        if (startDate != null)
            info.setStartDate(startDate);
        info.setOwner(owner);
        info.setApplicationValues(applicationValues);
        info.setPageSize(pageSize == null ? 10000 : pageSize);
        info.setPageStartFrom(pageStartFrom == null ? 0 : pageStartFrom);

        return (workUnitUQuery(info));
    }

    /**
     * Work unit U query.
     *
     * @param info
     *            the info
     * @return the list
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    @WithSpan
    public List<WorkunitWrapper> workUnitUQuery(WUQueryWrapper info) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub(); // Throws exception if stub failed

        // currently just checks application values
        info.validate();

        List<WorkunitWrapper> result = new ArrayList<WorkunitWrapper>();
        if (!compatibilityCheck(6,0,0)) // target HPCC is pre 6.0.0
        {
            Set<org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLWorkunit> workunit_set = new HashSet<org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLWorkunit>();

            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.WUQueryResponse fallbackresponse = null;
            if (info.getApplicationValues().size() > 1)
            {
                for (int i = 0; i < info.getApplicationValues().size(); i++)
                {
                    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.WUQuery internal = info.getRaw156(i);
                    fallbackresponse = stubWrapper.get1_56FallbackStub().wUQuery(internal);
                    if (fallbackresponse != null)
                    {
                        handleEspExceptions(new ArrayOfEspExceptionWrapper(fallbackresponse.getExceptions()), "Error in WU query");
                    }
                    Set<org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLWorkunit> internal_wu_set = new HashSet<org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLWorkunit>();
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
                fallbackresponse = stubWrapper.get1_56FallbackStub().wUQuery(info.getRaw156(0));
                if (fallbackresponse != null)
                {
                    handleEspExceptions(new ArrayOfEspExceptionWrapper(fallbackresponse.getExceptions()), "Error in WU query");
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
            WUQueryResponse wUQuery = ((WsWorkunits) stub).wUQuery(info.getRaw());
            if (wUQuery.getExceptions() != null && wUQuery.getExceptions().getException().length > 0)
                handleEspExceptions(new ArrayOfEspExceptionWrapper(wUQuery.getExceptions()), "Error in WU query");
            else
            {
                ArrayOfECLWorkunit workunits = wUQuery.getWorkunits();
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
     * @throws java.lang.Exception
     *             - Caller must handle exceptions
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public boolean doesWUContainErrors(String wuid) throws Exception, ArrayOfEspExceptionWrapper
    {
        boolean errsfound = true;
        WorkunitWrapper workunit = getWUInfo(wuid);

        if (workunit != null) errsfound = workunit.getErrorCount().intValue() <= 0;

        return errsfound;
    }

    /**
     * Requests target HPCC System to create and compile WU based on workunit info provided.
     *
     * @param wu
     *            - The workunit information used to create WU on HPCC cluster
     * @return the workunit wrapper
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    @WithSpan
    public WorkunitWrapper createWUFromECL(WorkunitWrapper wu) throws Exception, ArrayOfEspExceptionWrapper
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

        if (wuUpdateResponse.getExceptions() == null || wuUpdateResponse.getExceptions().getEspExceptions() == null
                || wuUpdateResponse.getExceptions().getEspExceptions().size() == 0)
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
            handleEspExceptions(new ArrayOfEspExceptionWrapper(wuUpdateResponse.getRawArrayOfEspExceptions()), "Error compiling ECL query");
        }
        return createdWU;
    }

    /**
     * Creates the WU from ECL.
     *
     * @param archiveOrEcl
     *            the archive or ecl
     * @param resultLimit
     *            the result limit
     * @param appVals
     *            the app vals
     * @param jobName
     *            the job name
     * @param compileOnly
     *            the compile only
     * @return the workunit wrapper
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    /*
     * this method is purely for the Platform class
     */
    public WorkunitWrapper createWUFromECL(String archiveOrEcl, int resultLimit, List<ApplicationValueWrapper> appVals, String jobName,
            boolean compileOnly) throws Exception, ArrayOfEspExceptionWrapper
    {
        WorkunitWrapper wi = new WorkunitWrapper().setECL(archiveOrEcl).setJobname(jobName).setApplicationValues(appVals)
                .setResultLimit(resultLimit == 0 ? null : resultLimit);
        return createWUFromECL(wi);
    }

    /**
     * Gets the workunits.
     *
     * @param jobName
     *            the pattern to find in the jobname (wildcard * matches multiple jobnames)
     * @param owner
     *            - hpcc owner of the job
     * @param ecl
     *            - text in the ecl
     * @param archived
     *            - if true, search archived workunits. If false or null, search unarchived workunits.
     * @param wuid
     *            - wuid to search for
     * @param cluster
     *            - cluster to search workunits for
     * @param state
     *            - WUState of workunits to find
     * @return an List &lt;WorkunitInfo&gt; of matching workunits
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    @WithSpan
    public List<WorkunitWrapper> getWorkunits(String jobName, String owner, String ecl, Boolean archived, String wuid, String cluster, WUState state)
            throws Exception, ArrayOfEspExceptionWrapper
    {
        WUQueryWrapper params = new WUQueryWrapper();
        params.setJobname(jobName);
        params.setOwner(owner);
        params.setECL(ecl);
        if (archived != null)
            params.setArchived(archived);
        params.setWuid(wuid);
        params.setCluster(cluster);
        params.setState(state);
        return workUnitUQuery(params);
    }

    /**
     * Gets the workunits.
     *
     * @param params
     *            the params
     * @return the workunits
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public List<WorkunitWrapper> getWorkunits(WUQueryWrapper params) throws Exception, ArrayOfEspExceptionWrapper
    {
        return this.workUnitUQuery(params);
    }

    /**
     * Given an ECL query, this method will create a WU, compile and run it.
     *
     * @param wu
     *            the wu
     * @return - Object with WU information
     * @throws java.lang.Exception
     *             - Caller must handle exceptions
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfECLExceptionWrapper
     *             the array of ECL exception wrapper
     */
    @WithSpan
    public WorkunitWrapper compileWUFromECL(WorkunitWrapper wu) throws Exception, ArrayOfEspExceptionWrapper, ArrayOfECLExceptionWrapper
    {
        Integer sleeptime = wu.getSleepMillis();

        if (sleeptime == null)
        {
            sleeptime = defaultWaitTime;
        }

        WorkunitWrapper createdWU = createWUFromECL(wu);

        if (createdWU != null && createdWU.getErrorCount() == 0
                && (createdWU.getExceptions() == null || createdWU.getExceptions().getECLException().size() == 0))
        {
            createdWU.setCluster(wu.getCluster());
            submitWU(createdWU); // if no exception proceed
            monitorWUToCompletion(createdWU);

            // exceptions, etc. aren't always included in the submit response; do another request to get all workunit info
            WorkunitWrapper res = getWUInfo(createdWU.getWuid(), false, false, false, false, false, true, false, false, false);

            if (res.getExceptions() != null)
            {
                for (ECLExceptionWrapper ex : res.getExceptions().getECLException())
                {
                    if ("error".equalsIgnoreCase(ex.getSeverity()))
                    {
                        handleECLExceptions(new ArrayOfECLExceptionWrapper(res.getRawExceptions().getECLException()), "Workunit Compile Failed");
                    }
                }
            }
        }
        return createdWU;
    }

    /**
     * Use this version if targeting HPCC 8+
     *
     * Provides caller full control over request options via WUSubmitWrapper
     *
     * @param wusubmitwrapper a {@link org.hpccsystems.ws.client.wrappers.wsworkunits.WUSubmitWrapper} object.
     * @throws Exception a {@link java.lang.Exception} object.
     */
    @WithSpan
    public void submitWU(WUSubmitWrapper wusubmitwrapper) throws Exception
    {
        if (wusubmitwrapper == null)
            throw new Exception("WsWorkunits.submitWU(WUSubmitWrapper) detected null wusubmitwrapper!");

        verifyStub(); // Throws exception if stub failed

        WUSubmitResponse response = null;

        try
        {
            response = ((WsWorkunits) stub).wUSubmit(wusubmitwrapper.getRaw());
        }
        catch (RemoteException e)
        {
            throw new Exception("WsWorkunits.submitWU(WUSubmitWrapper) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not perform submitWU");
        }

        if (response.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Error submiting ECL query");
    }
    /**
     * Given an ECL query, this method will create a WU, compile and run it.
     *
     * @param wu
     *            the wu
     * @throws java.lang.Exception
     *             - Caller must handle exceptions
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public void submitWU(WorkunitWrapper wu) throws Exception, ArrayOfEspExceptionWrapper
    {
        submitWU(wu.getWuid(), wu.getCluster());
    }

    /**
     * Submit WU.
     *
     * @param wuid
     *            the wuid
     * @param cluster
     *            the cluster
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    @WithSpan
    public void submitWU(String wuid, String cluster) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub(); // Throws exception if stub failed

        WUSubmit request = new WUSubmit();

        request.setWuid(wuid);
        request.setCluster(cluster);

        WUSubmitResponse response = null;

        try
        {
            response = ((WsWorkunits) stub).wUSubmit(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("WsWorkunits.submitWU(" + wuid + "," + cluster + ") encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not perform submitWU");
        }

        if (response.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Error compiling ECL query");
    }

    /**
     * Given an ECL query, this method will create a WU, compile and run it.
     *
     * @param wu
     *            the wu
     * @return - Object with WU information
     * @throws java.lang.Exception
     *             - Caller must handle exceptions
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfECLExceptionWrapper
     *             the array of ECL exception wrapper
     * @deprecated use createAndRunWUFromECLWrapped
     */
    @WithSpan
    public WURunResponse createAndRunWUFromECL(WorkunitWrapper wu) throws Exception, ArrayOfEspExceptionWrapper, ArrayOfECLExceptionWrapper
    {
        return createAndRunWUFromECLWrapped(wu).getRaw();
    }

    /**
     * Given an ECL query, this method will create a WU, compile and run it.
     *
     * @param wu
     *            the wu
     * @return - WURunResponseWrapper Object with WU information
     * @throws java.lang.Exception
     *             - Caller must handle exceptions
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfECLExceptionWrapper
     *             the array of ECL exception wrapper
     */
    @WithSpan
    public WURunResponseWrapper createAndRunWUFromECLWrapped(WorkunitWrapper wu) throws Exception, ArrayOfEspExceptionWrapper, ArrayOfECLExceptionWrapper
    {
        WURunResponse wuRunResponse = null;

        verifyStub(); // Throws exception if stub failed

        WorkunitWrapper compiledWU = compileWUFromECL(wu);

        if (compiledWU != null)
        {
            WURun request = new WURun();
            request.setWuid(compiledWU.getWuid());
            request.setVariables(wu.getRawNamedValues());
            request.setCluster(wu.getCluster());

            try
            {
                wuRunResponse = ((WsWorkunits) stub).wURun(request);
            }
            catch (RemoteException e)
            {
                throw new WUException("WsWorkunits.createAndRunWUFromECL(...) encountered RemoteException.", e, compiledWU.getWuid());
            }
            catch (EspSoapFault e)
            {
                handleEspSoapFaults(new EspSoapFaultWrapper(e), "Error running WUID: " + compiledWU.getWuid());
            }
            catch (Exception e)
            {
                throw new WUException(e, compiledWU.getWuid());
            }

            if (wuRunResponse.getExceptions() != null)
                handleEspExceptions(new ArrayOfEspExceptionWrapper(wuRunResponse.getExceptions()), "Error running WUID: " + compiledWU.getWuid());

            if (isWorkunitFailed(wuRunResponse.getState()))
            {
                String error = wuRunResponse.getResults();
                throw new Exception("Error running WUID: " + compiledWU.getWuid() + ":\n" + error);
            }
        }

        return new WURunResponseWrapper(wuRunResponse);
    }

    /**
     * Given an ECL query, this method will create a WU, compile and run it, and return results in String object - Not
     * recommended for large resultsets.
     *
     * @param wu
     *            the wu
     * @return - Object with WU information
     * @throws java.lang.Exception
     *             - Caller must handle exceptions
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfECLExceptionWrapper
     *             the array of ECL exception wrapper
     */
    @WithSpan
    public String createAndRunWUFromECLAndGetResults(WorkunitWrapper wu) throws Exception, ArrayOfEspExceptionWrapper, ArrayOfECLExceptionWrapper
    {
        WURunResponse createAndRunWUFromECL = createAndRunWUFromECL(wu);
        return createAndRunWUFromECL.getResults();
    }

    /**
     * Given an ECL query, this method will create a WU, compile and run it, and return wuid. Workuinit state, and
     * results can be queried based on WUID
     *
     * @param wu
     *            the wu
     * @return - Workunit ID
     * @throws java.lang.Exception
     *             - Caller must handle exceptions
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfECLExceptionWrapper
     *             the array of ECL exception wrapper
     */
    @WithSpan
    public String createAndRunWUFromECLAndGetWUID(WorkunitWrapper wu) throws Exception, ArrayOfEspExceptionWrapper, ArrayOfECLExceptionWrapper
    {
        WURunResponse createAndRunWUFromECL = createAndRunWUFromECL(wu);
        return createAndRunWUFromECL.getWuid();
    }

    /**
     * Fetches results associated with a given Logical name.
     *
     * @param logicalName
     *            the logical name
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
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    @WithSpan
    public String fetchResultsFromLogicalName(String logicalName, int sequence, String cluster, boolean suppressXMLShema, long resultOffset,
            int resultCount) throws Exception, ArrayOfEspExceptionWrapper
    {
        WUResultResponse wuResultResponse = fetchRawResults(logicalName, false, sequence, cluster, suppressXMLShema, resultOffset, resultCount);
        ArrayOfEspException exceptions = wuResultResponse.getExceptions();
        if (exceptions != null) handleEspExceptions(new ArrayOfEspExceptionWrapper(exceptions), "Could not fetch results");

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
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    @WithSpan
    public String fetchResults(String wuid, int sequence, String cluster, boolean suppressXMLShema, long resultOffset, int resultCount)
            throws Exception, ArrayOfEspExceptionWrapper
    {
        WUResultResponse wuResultResponse = fetchRawResults(wuid, true, sequence, cluster, suppressXMLShema, resultOffset, resultCount);
        ArrayOfEspException exceptions = wuResultResponse.getExceptions();
        if (exceptions != null) handleEspExceptions(new ArrayOfEspExceptionWrapper(exceptions), "Could not fetch results");

        return wuResultResponse.getResult();
    }

    /**
     * Fetches results associated with a given WUID or logical file name.
     * If the given WUID has been archived, results might not be available -use fetchResultsFromLogicalName instead
     *
     * @param wuidorlogicalname
     *            the wuidorlogicalname
     * @param useWuid
     *            the use wuid
     * @param sequence
     *            the sequence
     * @param cluster
     *            the cluster
     * @param suppressXMLShema
     *            the suppress XML shema
     * @param resultOffset
     *            the result offset
     * @param resultCount
     *            the result count
     * @return the WU result response
     * @throws java.lang.Exception
     *             the exception
     */
    @WithSpan
    public WUResultResponse fetchRawResults(String wuidorlogicalname, boolean useWuid, int sequence, String cluster, boolean suppressXMLShema,
            long resultOffset, int resultCount) throws Exception
    {
        verifyStub(); // Throws exception if stub failed

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
     * Looks like A wuid.
     *
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
        if (!Character.isDigit(wuid.charAt(1)) || !Character.isDigit(wuid.charAt(2)) || !Character.isDigit(wuid.charAt(3))
                || !Character.isDigit(wuid.charAt(4)))
            return false;
        if (!Character.isDigit(wuid.charAt(5)) || !Character.isDigit(wuid.charAt(6)) || !Character.isDigit(wuid.charAt(7))
                || !Character.isDigit(wuid.charAt(8)))
            return false;
        return (wuid.charAt(9) == '-');
    }

    /**
     * Fetches results associated with a given WUID or logical file name.
     * All parameters and options must be pre-set in the "parameters" input param
     *
     * @param parameters
     *            the parameters
     * @return the WU result response
     * @throws java.lang.Exception
     *             the exception
     */
    @WithSpan
    public WUResultResponse fetchRawResults(WUResult parameters) throws Exception
    {
        verifyStub(); // Throws exception if stub failed

        return ((WsWorkunits) stub).wUResult(parameters);
    }

    /**
     * Refresh WU.
     *
     * @param full
     *            the full
     * @param wu
     *            the wu
     * @throws Exception
     *             the exception
     * @throws ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    private void refreshWU(boolean full, WorkunitWrapper wu) throws Exception, ArrayOfEspExceptionWrapper
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

    /**
     * Monitor WU to completion.
     *
     * @param wu
     *            the wu
     * @throws Exception
     *             the exception
     * @throws ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    @WithSpan
    private void monitorWUToCompletion(WorkunitWrapper wu) throws Exception, ArrayOfEspExceptionWrapper
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
     * Submit the given ECL code for syntax check upon the given target cluster.
     *
     * @param ecl
     *            - The ECL to syntax check
     * @param cluster
     *            - The HPCC target cluster on which to syntax check
     * @param timeout
     *            - Maximum time for this check
     * @return the array of ECL exception wrapper
     * @throws java.lang.Exception
     *             the exception
     */
    @WithSpan
    public ArrayOfECLExceptionWrapper syntaxCheckECL(String ecl, String cluster, Integer timeout) throws Exception
    {
        verifyStub(); // Throws exception if stub failed

        WUSyntaxCheckECL checkParams = new WUSyntaxCheckECL();
        checkParams.setECL(ecl);
        checkParams.setCluster(cluster);
        if (timeout != null)
            checkParams.setTimeToWait(timeout);
        WUSyntaxCheckResponse resp = ((WsWorkunits) stub).wUSyntaxCheckECL(checkParams);
        ArrayOfECLExceptionWrapper result = null;
        if (resp.getErrors() != null)
        {
            result = new ArrayOfECLExceptionWrapper(resp.getErrors().getECLException());
        }
        return result;
    }

    /**
     * Fetch details about the given query.
     *
     * @param querySetName
     *            the query set name
     * @param clusterName
     *            the cluster name
     * @param filter
     *            the filter
     * @return the queries detail
     * @throws java.lang.Exception
     *             the exception
     */
    @WithSpan
    public WUQuerySetDetailsResponse getQueriesDetail(String querySetName, String clusterName, String filter) throws Exception
    {
        verifyStub(); // Throws exception if stub failed

        WUQuerysetDetails wuQuerysetDetails = new WUQuerysetDetails();
        wuQuerysetDetails.setQuerySetName(querySetName);
        wuQuerysetDetails.setClusterName(clusterName);
        wuQuerysetDetails.setFilter(filter);

        return ((WsWorkunits) stub).wUQuerysetDetails(wuQuerysetDetails);
    }

    /**
     * Request that a given workunit is aborted.
     *
     * @param wuid
     *            the wuid
     * @throws java.lang.Exception
     *             the exception
     */
    @WithSpan
    public void abortWU(@SpanAttribute String wuid) throws Exception
    {
        verifyStub(); // Throws exception if stub failed

        WUAbort request = new WUAbort();
        EspStringArray arrayofwuids = new EspStringArray();
        arrayofwuids.addItem(wuid);
        request.setWuids(arrayofwuids);
        request.setBlockTillFinishTimer(1);
        ((WsWorkunits) stub).wUAbort(request);
    }

    /**
     * Request that a given workunit is deleted.
     *
     * @param wuid
     *            the wuid
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    @WithSpan
    public void deleteWU(@SpanAttribute String wuid) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub(); // Throws exception if stub failed

        WUDelete request = new WUDelete();

        EspStringArray wuids = new EspStringArray();
        wuids.addItem(wuid);
        request.setWuids(wuids);
        request.setBlockTillFinishTimer(1);
        WUDeleteResponse resp = ((WsWorkunits) stub).wUDelete(request);
        handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could not delete " + wuid + ":");
    }

    /**
     * Request that a given workunit is re-submitted. Caller can choose to clone the wu, and
     * to restart the WU's workflow.
     *
     * @param wuid
     *            the wuid
     * @param restart
     *            the restart
     * @param clone
     *            the clone
     * @throws java.lang.Exception
     *             the exception
     */
    @WithSpan
    public void resubmitWU(@SpanAttribute String wuid, @SpanAttribute boolean restart, @SpanAttribute boolean clone) throws Exception
    {
        verifyStub(); // Throws exception if stub failed

        WUResubmit request = new WUResubmit();
        request.setResetWorkflow(restart);
        request.setCloneWorkunit(clone);
        EspStringArray wuids = new EspStringArray();
        wuids.addItem(wuid);
        request.setWuids(wuids);

        ((WsWorkunits) stub).wUResubmit(request);
    }

    /**
     * Fetch set of available QuerySets.
     *
     * @return the query sets
     * @throws java.lang.Exception
     *             the exception
     */
    @WithSpan
    public QuerySet[] getQuerySets() throws Exception
    {
        verifyStub(); // Throws exception if stub failed

        QuerySet[] queryset = null;
        WUQuerysets request = new WUQuerysets();
        WUQuerysetsResponse response = ((WsWorkunits) stub).wUQuerysets(request);
        if (response != null && response.getQuerysets() != null)
        {
            queryset = response.getQuerysets().getQuerySet();
        }

        return queryset;
    }

    /**
     * Return a workunit result.
     *
     * @param wur
     *            the wur
     * @return WUResultResponse
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    public WUResultResponse getWorkunitResult(WUResult wur) throws Exception, ArrayOfEspExceptionWrapper
    {
        return getWorkunitResult(wur, false);
    }

    /**
     * Gets the workunit result.
     *
     * @param wuid
     *            - wuid to return result for
     * @param resultname
     *            - resultname to return result for
     * @return content of result
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    @WithSpan
    public String getWorkunitResult(@SpanAttribute String wuid, @SpanAttribute String resultname) throws Exception, ArrayOfEspExceptionWrapper
    {
        WUResult params = new WUResult();
        params.setWuid(wuid);
        params.setResultName(resultname);
        params.setSuppressXmlSchema(true);

        WUResultResponse resp = getWorkunitResult(params, true);
        if (resp != null)
        {
            if (resp.getExceptions() != null) handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()),
                    "Unable to retrieve result " + resultname + " from wuid " + wuid + ":");

            return resp.getResult();
        }
        return null;
    }

    /**
     * Return a workunit result.
     *
     * @param wur
     *            the wur
     * @param unarchive
     *            the unarchive
     * @return WUResultResponse
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    @WithSpan
    public WUResultResponse getWorkunitResult(WUResult wur, boolean unarchive) throws Exception, ArrayOfEspExceptionWrapper
    {
        // get the object first to make sure it's not archived
        if (unarchive)
        {
            this.getWUInfo(wur.getWuid(), unarchive);
        }

        // get the response
        WUResultResponse resp = ((WsWorkunitsStub) stub).wUResult(wur);
        return resp;
    }

    /**
     * Request a given action to be performed upon the given workunit.
     *
     * @param wuid
     *            - The target workunit
     * @param action
     *            - The action to be requested see ECLWUActions
     * @return true, if successful
     * @throws java.rmi.RemoteException
     *             the remote exception
     * @throws java.rmi.RemoteException
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    @WithSpan
    public boolean doWorkunitAction(@SpanAttribute String wuid, @SpanAttribute ECLWUActions action) throws RemoteException, Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub(); // Throws exception if stub failed

        WUAction request = new WUAction();

        request.setWUActionType(action);

        EspStringArray wuids = new EspStringArray();
        wuids.addItem(wuid);
        request.setWuids(wuids);

        WUActionResponse response = null;

        try
        {
            response = ((WsWorkunitsStub) stub).wUAction(request);
        }
        catch (RemoteException e)
        {
            throw new Exception("WsWorkunitsClient.doWorkunitAction(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspSoapFaults(new EspSoapFaultWrapper(e), "Could Not perform doWorkunitAction(" + wuid + ", " + action.toString() + ")");
        }

        if (response.getExceptions() != null) handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()),
                "Could Not perform doWorkunitAction(" + wuid + ", " + action.toString() + ")");

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

            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.WUActionResponse fwar = stubWrapper.get1_56FallbackStub().wUAction(fwa);
            if (fwar == null || fwar.getActionResults() == null || fwar.getActionResults().getWUActionResult() == null
                    || fwar.getActionResults().getWUActionResult().length == 0 || fwar.getActionResults().getWUActionResult()[0].getResult() == null
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

    /**
     * Gets the ecl watch url.
     *
     * @return the ecl watch url
     * @throws Exception
     *             the exception
     */
    private String getEclWatchUrl() throws Exception
    {
        String url = "";
        if (stub != null) url = stub._getServiceClient().getOptions().getTo().getAddress().toLowerCase().replace("wsworkunits", "");

        return url;
    }

    /**
     * Create a new workunit. Does not update/run/submit
     *
     * @return new WorkunitInfo containing created wuid
     * @throws java.lang.Exception
     *             the exception
     */
    @WithSpan
    public WorkunitWrapper createWorkunit() throws Exception
    {
        WUCreateRequestWrapper params = new WUCreateRequestWrapper();
        WUCreateResponseWrapper resp = stubWrapper.WUCreate(params);

        if (resp.getExceptions() != null && resp.getExceptions().getEspExceptions() != null && resp.getExceptions().getEspExceptions().size() > 0)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could not create workunit");

        return resp.getWorkunitWrapper();
    }

    /**
     * Protect a workunit
     *
     * @param wuid
     *            - wuid to protect
     * @return WorkunitInfo with updated status
     * @throws java.lang.Exception
     *             the exception
     */
    @WithSpan
    public WorkunitWrapper protectWorkunit(String wuid) throws Exception
    {
        final WUUpdateRequestWrapper params = new WUUpdateRequestWrapper();
        params.set_protected(true);
        params.setWuid(wuid);
        WUUpdateResponseWrapper resp = stubWrapper.WUUpdate(params);

        if (resp.getRawArrayOfEspExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getRawArrayOfEspExceptions()), "Could not protect workunit " + wuid);

        return resp.getWorkunitWrapper();
    }

    /**
     * Get Workunit file.
     *
     * @param wuid
     *            the wuid
     * @param filename
     *            the filename
     * @param filetype
     *            the filetype
     * @param description
     *            the description
     * @param ipaddr
     *            the ipaddr
     * @param entirefile
     *            the entirefile
     * @return the workunit file
     * @throws java.lang.Exception
     *             the exception
     */
    @WithSpan
    public WULogFileWrapper getWorkunitFile(@SpanAttribute String wuid, @SpanAttribute String filename, WUFileType filetype, String description, String ipaddr, boolean entirefile)
            throws Exception
    {
        WUFile file = new WUFile();
        file.setWuid(wuid);
        file.setName(filename);
        file.setType(filetype.toString());
        file.setDescription(description);
        file.setIPAddress(ipaddr);
        if (entirefile) file.setOption(1);

        WULogFileResponse logFileResponse = ((WsWorkunitsStub) stub).wUFile(file);
        if (logFileResponse.getExceptions() != null)
        {
            handleEspExceptions(new ArrayOfEspExceptionWrapper(logFileResponse.getExceptions()),
                    "Could not retrieve file " + filename + " for wuid " + wuid);
        }
        return new WULogFileWrapper(logFileResponse);
    }

    /**
     * Request to run a given workunit. Caller can set various WU options.
     *
     * @param wuid
     *            - wuid to call WURun for
     * @param namedvalues
     *            - override stored variables with this set of stored variables
     * @param appvalues
     *            - override application values with this set of app values
     * @param timeout
     *            - if provided, timeout before returning
     * @param cloneWorkunit
     *            - if true, clone workunit before rerunning
     * @param appsource
     *            - application source for app values
     * @return WorkunitInfo with wuid of run, run status and result
     * @throws java.lang.Exception
     *             the exception
     */
    @WithSpan
    public WorkunitWrapper runWorkunit(@SpanAttribute String wuid, HashMap<String, String> namedvalues, HashMap<String, String> appvalues, Integer timeout,
            @SpanAttribute Boolean cloneWorkunit, String appsource) throws Exception
    {
        WURun params = new WURun();
        params.setWuid(wuid);
        if (cloneWorkunit != null)
            params.setCloneWorkunit(cloneWorkunit);
        // default setting is synchronous/waits until workunit completes. Set this to asynchronous
        if (timeout != null)
            params.setWait(timeout);

        if (appvalues != null)
        {
            ArrayOfApplicationValue appvaluesarray = new ArrayOfApplicationValue();
            for (Entry<String, String> item : appvalues.entrySet())
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
            for (Entry<String, String> item : namedvalues.entrySet())
            {
                NamedValue val = new NamedValue();
                val.setName(item.getKey());
                val.setValue(item.getValue());
                nvarray.addNamedValue(val);
            }

            params.setVariables(nvarray);
        }

        WURunResponse resp = ((WsWorkunitsStub) stub).wURun(params);

        if (resp.getExceptions() != null)
        {
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could not run workunit " + wuid);
        }

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
     * Fetch list of querysets.
     *
     * @param filtertype
     *            the filtertype
     * @param filtervalue
     *            the filtervalue
     * @param querySetName
     *            the query set name
     * @param clustername
     *            the clustername
     * @return the list
     * @throws java.lang.Exception
     *             the exception
     */
    @WithSpan
    public List<QueryResultWrapper> searchQueries(QuerySetFilterType filtertype, @SpanAttribute String filtervalue, @SpanAttribute String querySetName, @SpanAttribute String clustername)
            throws Exception
    {
        final WUQuerysetDetails params = new WUQuerysetDetails();
        params.setClusterName(clustername);
        params.setFilter(filtervalue);
        if (filtertype != null)
        {
            params.setFilterType(QuerySetFilterTypeWrapper.getFilterType(filtertype));
        }
        params.setQuerySetName(querySetName);
        WUQuerySetDetailsResponse resp = ((WsWorkunitsStub) stub).wUQuerysetDetails(params);

        if (resp.getExceptions() != null) handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could not search queries:");

        List<QueryResultWrapper> result = new ArrayList<QueryResultWrapper>();

        ArrayOfQuerySetQuery querysetQueries = resp.getQuerysetQueries();
        if (querysetQueries != null)
        {
            QuerySetQuery[] queries = querysetQueries.getQuerySetQuery();

            if (queries != null)
            {
                for (QuerySetQuery item : queries)
                {
                    result.add(new QueryResultWrapper(item));
                }
            }
        }
        return result;
    }

    /**
     * Call WUListQueries service
     *
     * @param queryid
     *            - unique ID of the query
     * @param queryname
     *            - name/alias of the query
     * @param clustername
     *            - name of the cluster the query is on
     * @param querysetname
     *            - name of the queryset the cluster is part of
     * @param pageSize
     *            - number of results to return (if null, 100 results are returned)
     * @param pageStartFrom
     *            - which result to start returning on (if null, results start with 1)
     * @param activated
     *            - whether to return activated queries
     * @param filename
     *            - return queries using this filename
     * @param descending
     *            the descending
     * @return List of QueryResults populated from QuerySetQuery list
     * @throws java.lang.Exception
     *             the exception
     */
    @WithSpan
    public List<QueryResultWrapper> listQueries(@SpanAttribute String queryid, @SpanAttribute String queryname,@SpanAttribute String clustername, @SpanAttribute String querysetname,@SpanAttribute  Integer pageSize,
            @SpanAttribute Integer pageStartFrom, @SpanAttribute Boolean activated, @SpanAttribute String filename, @SpanAttribute Boolean descending) throws Exception
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

        if (descending != null)
        {
            params.setDescending(descending);
        }
        params.setClusterName(clustername);
        params.setQuerySetName(querysetname);
        params.setQueryName(queryname);
        params.setQueryID(queryid);
        if (activated != null)
        {
            params.setActivated(activated);
        }
        params.setFileName(filename);

        WUListQueriesResponse response = ((WsWorkunitsStub) stub).wUListQueries(params);

        if (response.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could not fetch queries: ");

        List<QueryResultWrapper> result = new ArrayList<QueryResultWrapper>();

        ArrayOfQuerySetQuery querysetQueries = response.getQuerysetQueries();
        if (querysetQueries != null)
        {
            QuerySetQuery[] queries = querysetQueries.getQuerySetQuery();

            if (queries != null)
            {
                for (QuerySetQuery item : queries)
                {
                    result.add(new QueryResultWrapper(item));
                }
            }
        }

        return result;
    }

    /**
     * Gets the query files.
     *
     * @param queryname
     *            - query to retrieve files for
     * @param cluster
     *            - the cluster to search for said query
     * @return - List &lt;QueryFileWrapper&gt; of matching queries
     * @throws java.lang.Exception
     *             the exception
     */
    @WithSpan
    public List<QueryFileWrapper> getQueryFiles(@SpanAttribute String queryname, @SpanAttribute String cluster) throws Exception
    {
        final WUQueryFiles request = new WUQueryFiles();
        request.setTarget(cluster);
        request.setQueryId(queryname);

        WUQueryFilesResponse response = ((WsWorkunitsStub) stub).wUQueryFiles(request);

        if (response.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could not get files for query " + queryname + ":");

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
     * Activate query.
     *
     * @param queryId
     *            - unique id of query to activate
     * @param cluster
     *            - cluster to activate upon
     * @return the query result wrapper
     * @throws java.lang.Exception
     *             the exception
     */
    @WithSpan
    public QueryResultWrapper activateQuery(@SpanAttribute String queryId, @SpanAttribute String cluster) throws Exception
    {
        final WUQuerysetQueryAction queryAction = new WUQuerysetQueryAction();
        queryAction.setAction(QuerySetQueryActionTypes.Activate);
        final QuerySetQueryActionItem item = new QuerySetQueryActionItem();
        item.setQueryId(queryId);
        final QuerySetQueryActionItem[] items = new QuerySetQueryActionItem[] { item };
        queryAction.setQuerySetName(cluster);
        Queries_type1 queries = new Queries_type1();
        queries .setQuery(items);
        queryAction.setQueries(queries);
        final WUQuerySetQueryActionResponse resp = ((WsWorkunitsStub) stub).wUQuerysetQueryAction(queryAction);

        if (resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could not activate query " + queryId);

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
     * Delete queries.
     *
     * @param querynames
     *            - queries to delete
     * @param cluster
     *            - cluster to delete from
     * @return - List &lt;QueryResult&gt; result of actions
     * @throws java.lang.Exception
     *             the exception
     */
    @WithSpan
    public List<QueryResultWrapper> deleteQueries(@SpanAttribute Set<String> querynames, @SpanAttribute String cluster) throws Exception
    {
        verifyStub(); // Throws exception if stub failed

        WUQuerysetQueryAction params = new WUQuerysetQueryAction();

        Queries_type1 queriesarray = new Queries_type1();
        for (String queryname : querynames)
        {
            QuerySetQueryActionItem item = new QuerySetQueryActionItem();
            item.setQueryId(queryname);

            queriesarray .addQuery(item);
        }

        params.setQueries(queriesarray);
        params.setQuerySetName(cluster);
        params.setAction(QuerySetQueryActionTypes.Delete);

        WUQuerySetQueryActionResponse response = ((WsWorkunitsStub) stub).wUQuerysetQueryAction(params);

        if (response.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could not delete queries: ");

        List<QueryResultWrapper> results = new ArrayList<QueryResultWrapper>();

        if (response.getResults() != null)
        {
            if (response.getResults() != null)
            {
                QuerySetQueryActionResult[] result = response.getResults().getResult();
                for (int j = 0; j < result.length; j++)
                {
                    QuerySetQueryActionResult res = result[j];
                    results.add(new QueryResultWrapper(res));
                }
            }
        }
        return results;
    }

    /**
     * Ping.
     *
     * @return true, if successful
     * @throws java.lang.Exception
     *             the exception
     */
    @WithSpan
    public boolean ping() throws Exception
    {
        verifyStub(); // must be called within span scope for proper context propagation

        Ping request = new Ping();
        try
        {
            ((WsWorkunitsStub) stub).ping(request);
        }
        catch (Exception e)
        {
            log.error(e.getLocalizedMessage());
            return false;
        }

        return true;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.hpccsystems.ws.client.BaseHPCCWsClient#getDefaultStub()
     */
    /** {@inheritDoc} */
    @Override
    public Stub getDefaultStub() throws AxisFault
    {
        return new WsWorkunitsStub();
    }
}

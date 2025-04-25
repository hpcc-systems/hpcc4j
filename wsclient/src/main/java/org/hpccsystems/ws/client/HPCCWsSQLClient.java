package org.hpccsystems.ws.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.List;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Stub;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hpccsystems.ws.client.gen.axis2.wssql.latest.ArrayOfECLException;
import org.hpccsystems.ws.client.gen.axis2.wssql.latest.ArrayOfNamedValue;
import org.hpccsystems.ws.client.gen.axis2.wssql.latest.ECLException;
import org.hpccsystems.ws.client.gen.axis2.wssql.latest.ECLWorkunit;
import org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecutePreparedSQLRequest;
import org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecutePreparedSQLResponse;
import org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecuteSQLRequest;
import org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecuteSQLResponse;
import org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBMetaDataRequest;
import org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBMetaDataResponse;
import org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBSystemInfoRequest;
import org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBSystemInfoResponse;
import org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetResultsRequest;
import org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetResultsResponse;
import org.hpccsystems.ws.client.gen.axis2.wssql.latest.HPCCQuerySet;
import org.hpccsystems.ws.client.gen.axis2.wssql.latest.HPCCTable;
import org.hpccsystems.ws.client.gen.axis2.wssql.latest.NamedValue;
import org.hpccsystems.ws.client.gen.axis2.wssql.latest.PrepareSQLRequest;
import org.hpccsystems.ws.client.gen.axis2.wssql.latest.PrepareSQLResponse;
import org.hpccsystems.ws.client.gen.axis2.wssql.latest.QuerySets_type0;
import org.hpccsystems.ws.client.gen.axis2.wssql.latest.WssqlPingRequest;
import org.hpccsystems.ws.client.gen.axis2.wssql.latest.WssqlStub;
import org.hpccsystems.ws.client.platform.Version;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.utils.Utils;
import org.hpccsystems.ws.client.wrappers.ArrayOfECLExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wssql.ECLWorkunitWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wssql.ExecutePreparedSQLResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wssql.ExecuteSQLResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wssql.GetResultsResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wssql.HPCCQuerySetWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wssql.HPCCTableWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wssql.NamedValueWrapper;

import io.opentelemetry.instrumentation.annotations.SpanAttribute;
import io.opentelemetry.instrumentation.annotations.WithSpan;

/**
 * Facilitates SQL based action onto target HPCC Systems instance.
 *
 * All actions supported treat HPCC Systems as a standard database system.
 * Supported actions include fetching HPCC 'database' metadata, tables, and stored procedures.
 * Client can submit SQL based queries, execute prepared SQL queries, fetch results, and more.
 */
public class HPCCWsSQLClient extends BaseHPCCWsClient
{
    private static final Logger log                  = LogManager.getLogger(HPCCWsSQLClient.class);
    /** Constant <code>WSSQLURI="/WsSQL"</code> */
    public static final String  WSSQLURI             = "/WsSQL";
    private static final int    DEFAULT_RESULT_LIMIT = 100;
    private static final String PINGSTATEMENT        = "HPCCWsSQLClient Greets you.";
    private Version             version              = null;

    private static int          DEFAULTSERVICEPORT   = -1;
    private static String       WSDLURL              = null;

    /**
     * Load WSDLURL.
     */
    private static void loadWSDLURL()
    {
        try
        {
            WSDLURL = getServiceWSDLURL(new WssqlStub());
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
        return WSSQLURI;
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
     * @return the HPCC ws SQL client
     */
    public static HPCCWsSQLClient get(Connection connection)
    {
        return new HPCCWsSQLClient(connection);
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
     * @return the HPCC ws SQL client
     */
    public static HPCCWsSQLClient get(String protocol, String targetHost, String targetPort, String user, String pass)
    {
        Connection conn = new Connection(protocol, targetHost, targetPort);
        conn.setCredentials(user, pass);
        return new HPCCWsSQLClient(conn);
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
     * @return the HPCC ws SQL client
     */
    public static HPCCWsSQLClient get(String protocol, String targetHost, String targetPort, String user, String pass, int timeout)
    {
        Connection conn = new Connection(protocol, targetHost, targetPort);
        conn.setCredentials(user, pass);
        conn.setConnectTimeoutMilli(timeout);
        conn.setSocketTimeoutMilli(timeout);

        return new HPCCWsSQLClient(conn);
    }

    /**
     * Instantiates a new HPCC ws SQL client.
     *
     * @param baseConnection
     *            the base connection
     */
    protected HPCCWsSQLClient(Connection baseConnection)
    {
        initHPCCWsSQLClientStub(baseConnection);
    }

    /**
     * Initializes the service's underlying soap proxy. Should only be used by constructors
     *
     * @param connection
     *            the connection
     */
    @SuppressWarnings("static-access")
    private void initHPCCWsSQLClientStub(Connection connection)
    {
        initBaseWsClient(connection, false); //No need to preemptively fetch HPCC build version, Containerized mode
        try
        {
            stub = setStubOptions(new WssqlStub(connection.getUrl() + this.WSSQLURI), connection);
        }
        catch (AxisFault e)
        {
            initErrMessage = "Could not initialize WssqlStub - Review all HPCC connection values";
            if (!e.getLocalizedMessage().isEmpty())
            {
                initErrMessage += "\n" + e.getLocalizedMessage();
            }
        }

        if (!initErrMessage.isEmpty())
            log.error(initErrMessage);
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

        WssqlPingRequest request = new WssqlPingRequest();

        try
        {
            ((WssqlStub) stub).ping(request);
        }
        catch (Exception e)
        {
            log.error(e.getLocalizedMessage());
            return false;
        }

        return true;
    }

    /**
     * Checks if is ws SQL reachable.
     *
     * @return true, if is ws SQL reachable
     */
    public boolean isWsSQLReachable()
    {
        try
        {
            return ping();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Gets the target clusters.
     *
     * @param filter
     *            the filter
     * @return the target clusters
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    @WithSpan
    public String[] getTargetClusters(@SpanAttribute String filter) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub();

        GetDBMetaDataRequest request = new GetDBMetaDataRequest();

        request.setIncludeTargetClusters(true);
        if (filter != null) request.setClusterType(filter);

        request.setIncludeStoredProcedures(false);
        request.setIncludeTables(false);

        GetDBMetaDataResponse resp = null;

        try
        {
            resp = ((WssqlStub) stub).getDBMetaData(request);
        }
        catch (RemoteException e)
        {
            log.error("HPCCWsSQL.getTargetClusters(" + filter + ") encountered RemoteException.\n" + e.getLocalizedMessage());
        }

        if (resp.getExceptions() != null) handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()),
                "HPCCWsSQL.getTargetClusters(" + filter + ") encountered RemoteException.");

        return resp.getClusterNames().getClusterName();
    }

    /**
     * Gets the tables.
     *
     * @param filter
     *            the filter
     * @return the tables
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    @WithSpan
    public HPCCTableWrapper[] getTables(@SpanAttribute String filter) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub();

        HPCCTableWrapper[] result = new HPCCTableWrapper[0];

        GetDBMetaDataRequest request = new GetDBMetaDataRequest();

        request.setIncludeTables(true);
        if (filter != null) request.setTableFilter(filter);

        request.setIncludeStoredProcedures(false);
        request.setIncludeTargetClusters(false);

        GetDBMetaDataResponse resp = null;

        try
        {
            resp = ((WssqlStub) stub).getDBMetaData(request);
        }
        catch (RemoteException e)
        {
            log.error("HPCCWsSQL.getTables(" + filter + ") encountered RemoteException.\n" + e.getLocalizedMessage());
        }

        if (resp != null)
        {
            if (resp.getExceptions() != null)
                handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could not get Tables(" + filter + ").");

            if (resp.getTables() != null)
            {
                HPCCTable[] hpccTables = resp.getTables().getTable();
                if (hpccTables != null && hpccTables.length > 0)
                {
                    result = new HPCCTableWrapper[hpccTables.length];
                    for (int i = 0; i < hpccTables.length; i++)
                    {
                        result[i] = new HPCCTableWrapper(hpccTables[i]);
                    }
                }
            }
        }
        else
        {
            log.error("HPCCWsSQL.getTables(" + filter + ") did not receive valid response.\n");
        }
        return result;
    }

    /**
     * Gets the stored procedures.
     *
     * @param querysetname
     *            the querysetname
     * @return the stored procedures
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    @WithSpan
    public HPCCQuerySetWrapper[] getStoredProcedures(@SpanAttribute String querysetname) throws Exception, ArrayOfEspExceptionWrapper
    {
        verifyStub();

        GetDBMetaDataRequest request = new GetDBMetaDataRequest();

        request.setIncludeStoredProcedures(true);

        if (querysetname != null) request.setQuerySet(querysetname);

        request.setIncludeTables(false);
        request.setIncludeTargetClusters(false);
        request.setIncludeStoredProcedures(true);

        GetDBMetaDataResponse resp = null;
        try
        {
            resp = ((WssqlStub) stub).getDBMetaData(request);
        }
        catch (RemoteException e)
        {
            log.error("HPCCWsSQL.getStoredProcedures(" + querysetname + ") encountered RemoteException.\n" + e.getLocalizedMessage());
        }

        if (resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could not get stored procedures for '" + querysetname + "'");

        HPCCQuerySetWrapper[] result = null;
        QuerySets_type0 querySetstype = resp.getQuerySets();
        if (querySetstype != null)
        {
            HPCCQuerySet[] querysets = querySetstype.getQuerySet();
            if (querysets != null && querysets.length > 0)
            {
                result = new HPCCQuerySetWrapper[querysets.length];
                for (int i = 0; i < querysets.length; i++)
                {
                    result[i] = new HPCCQuerySetWrapper(querysets[i]);
                }
            }
        }

        return result;
    }

    /**
     * Gets the version.
     *
     * @return the version
     */
    public Version getVersion()
    {
        populateSystemInfo();

        return version;
    }

    /**
     * Populate system info.
     *
     * @return true, if successful
     */
    private boolean populateSystemInfo()
    {
        boolean success = false;

        if (version == null)
        {
            try
            {
                verifyStub();

                GetDBSystemInfoRequest request = new GetDBSystemInfoRequest();

                request.setIncludeAll(true);

                GetDBSystemInfoResponse resp = null;

                try
                {
                    resp = ((WssqlStub) stub).getDBSystemInfo(request);
                }
                catch (RemoteException e)
                {
                    log.error("HPCCWsSQL.populateSystemInfo encountered RemoteException.\n" + e.getLocalizedMessage());
                }

                if (resp.getExceptions() != null) handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()),
                        "HPCCWsSQL.populateSystemInfo encountered RemoteException.\n");

                if (resp != null)
                {
                    version = new Version(resp.getFullVersion());
                    if (version != null && version.getMajor() != 0)
                        success = true;
                }
            }
            catch (Exception e)
            {
                log.error(e.getLocalizedMessage());
            }
        }
        return success;
    }

    /**
     * Execute SQLWUID response.
     *
     * @param sqlText
     *            the sql text
     * @param targetCluster
     *            the target cluster
     * @param targetQuerySet
     *            the target query set
     * @return the string
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfECLExceptionWrapper
     *             the array of ECL exception wrapper
     */
    public String executeSQLWUIDResponse(String sqlText, String targetCluster, String targetQuerySet)
            throws Exception, ArrayOfEspExceptionWrapper, ArrayOfECLExceptionWrapper
    {
        return executeSQLWUResponse(
                sqlText, targetCluster, targetQuerySet, DEFAULT_RESULT_LIMIT, null /* resultWindowCount */, null /* resultWindowStart */,
                true /* suppressResults */, true /* Boolean suppressXmlSchema */, null /* String userName */, null /* Integer wait */).getWuid();
    }

    /**
     * Execute SQL full response.
     *
     * @param sqlText
     *            the sql text
     * @param targetCluster
     *            the target cluster
     * @param targetQuerySet
     *            the target query set
     * @param resultLimit
     *            the result limit
     * @param resultWindowCount
     *            the result window count
     * @param resultWindowStart
     *            the result window start
     * @param suppressResults
     *            the suppress results
     * @param suppressXmlSchema
     *            the suppress xml schema
     * @param userName
     *            the user name
     * @param wait
     *            the wait
     * @return the execute SQL response wrapper
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfECLExceptionWrapper
     *             the array of ECL exception wrapper
     */
    @WithSpan
    public ExecuteSQLResponseWrapper executeSQLFullResponse(String sqlText,@SpanAttribute String targetCluster,@SpanAttribute String targetQuerySet, Integer resultLimit,
            Integer resultWindowCount, Integer resultWindowStart, Boolean suppressResults, Boolean suppressXmlSchema, String userName, Integer wait)
            throws Exception, ArrayOfEspExceptionWrapper, ArrayOfECLExceptionWrapper
    {
        verifyStub();

        ExecuteSQLRequest request = new ExecuteSQLRequest();

        if (resultLimit != null) request.setResultLimit(resultLimit);
        if (resultWindowCount != null) request.setResultWindowCount(resultWindowCount);
        if (resultWindowStart != null) request.setResultWindowStart(resultWindowStart);

        request.setSqlText(sqlText);

        if (suppressResults != null) request.setSuppressResults(suppressResults);
        if (suppressXmlSchema != null) request.setSuppressXmlSchema(suppressXmlSchema);

        request.setTargetCluster(targetCluster);

        if (targetQuerySet != null) request.setTargetQuerySet(targetQuerySet);
        if (userName != null) request.setUserName(userName);
        if (wait != null) request.setWait(wait);

        ExecuteSQLResponse resp = null;
        try
        {
            resp = ((WssqlStub) stub).executeSQL(request);
        }
        catch (RemoteException e)
        {
            log.error("HPCCWsSQL.executeSQLFullResponse encountered RemoteException.\n" + e.getLocalizedMessage());
        }

        if (resp != null)
        {
            if (resp.getExceptions() != null)
                handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could not perform executeSQLFullResponse");

            if (resp.getWorkunit() != null)
            {
                ArrayOfECLException exceptions = resp.getWorkunit().getExceptions();
                if (exceptions != null)
                {
                    ECLException[] eclExceptions = exceptions.getECLException();
                    if (eclExceptions != null && eclExceptions.length > 0) handleECLExceptions(new ArrayOfECLExceptionWrapper(exceptions));
                }
                return new ExecuteSQLResponseWrapper(resp);
            }
        }

        return null;
    }

    /**
     * Execute SQLWU response.
     *
     * @param sqlText
     *            the sql text
     * @param targetCluster
     *            the target cluster
     * @param targetQuerySet
     *            the target query set
     * @param resultLimit
     *            the result limit
     * @param resultWindowCount
     *            the result window count
     * @param resultWindowStart
     *            the result window start
     * @param suppressResults
     *            the suppress results
     * @param suppressXmlSchema
     *            the suppress xml schema
     * @param userName
     *            the user name
     * @param wait
     *            the wait
     * @return the ECL workunit wrapper
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfECLExceptionWrapper
     *             the array of ECL exception wrapper
     */
    public ECLWorkunitWrapper executeSQLWUResponse(String sqlText, String targetCluster, String targetQuerySet, Integer resultLimit,
            Integer resultWindowCount, Integer resultWindowStart, Boolean suppressResults, Boolean suppressXmlSchema, String userName, Integer wait)
            throws Exception, ArrayOfEspExceptionWrapper, ArrayOfECLExceptionWrapper
    {
        return executeSQLFullResponse(
                sqlText, targetCluster, targetQuerySet, DEFAULT_RESULT_LIMIT, resultWindowCount /* resultWindowCount */, resultWindowStart /* resultWindowStart */,
                suppressResults /* suppressResults */, suppressXmlSchema /* Boolean suppressXmlSchema */, userName /* String userName */, wait /* Integer wait */).getWorkunit();
    }

    /**
     * Gets the results.
     *
     * @param wuid
     *            the wuid
     * @param resultWindowStart
     *            the result window start
     * @param resultWindowCount
     *            the result window count
     * @return the results
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfECLExceptionWrapper
     *             the array of ECL exception wrapper
     */
    public List<List<Object>> getResults(String wuid, Integer resultWindowStart, Integer resultWindowCount)
            throws Exception, ArrayOfEspExceptionWrapper, ArrayOfECLExceptionWrapper
    {
        return Utils.parseECLResults(getResultResponse(wuid, resultWindowStart, resultWindowCount, true).getResult());
    }

    /**
     * Gets the result response.
     *
     * @param wuid
     *            the wuid
     * @param resultWindowStart
     *            the result window start
     * @param resultWindowCount
     *            the result window count
     * @param suppressXmlSchema
     *            the suppress xml schema
     * @return the result response
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfECLExceptionWrapper
     *             the array of ECL exception wrapper
     */
    @WithSpan
    public GetResultsResponseWrapper getResultResponse(@SpanAttribute String wuid, Integer resultWindowStart, Integer resultWindowCount, Boolean suppressXmlSchema)
            throws Exception, ArrayOfEspExceptionWrapper, ArrayOfECLExceptionWrapper
    {
        verifyStub();

        GetResultsRequest request = new GetResultsRequest();

        request.setWuId(wuid);
        if (resultWindowCount != null) request.setResultWindowCount(resultWindowCount);
        if (resultWindowStart != null) request.setResultWindowStart(resultWindowStart);
        if (suppressXmlSchema != null) request.setSuppressXmlSchema(suppressXmlSchema);

        GetResultsResponse resp = null;

        try
        {
            resp = ((WssqlStub) stub).getResults(request);
        }
        catch (RemoteException e)
        {
            log.error("HPCCWsSQL.getResults encountered RemoteException.\n" + e.getLocalizedMessage());
        }

        if (resp != null)
        {
            if (resp.getExceptions() != null)
                handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could not perform getResults");

            ECLWorkunit workunit = resp.getWorkunit();
            if (workunit != null)
            {
                ArrayOfECLException exceptions = workunit.getExceptions();
                if (exceptions != null)
                {
                    ECLException[] eclExceptions = exceptions.getECLException();
                    if (eclExceptions != null && eclExceptions.length > 0) handleECLExceptions(new ArrayOfECLExceptionWrapper(exceptions));
                }
                return new GetResultsResponseWrapper(resp);
            }
        }

        return null;
    }

    /**
     * Gets the result schema XML.
     *
     * @param wuid
     *            the wuid
     * @return the result schema XML
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfECLExceptionWrapper
     *             the array of ECL exception wrapper
     */
    public String getResultSchemaXML(String wuid) throws Exception, ArrayOfEspExceptionWrapper, ArrayOfECLExceptionWrapper
    {
        return Utils.extactResultSchema("<root>" + getResultResponse(wuid, 0, 1, false).getResult() + "</root>");
    }

    /**
     * Gets the result schema.
     *
     * @param wuid
     *            the wuid
     * @return the result schema
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfECLExceptionWrapper
     *             the array of ECL exception wrapper
     */
    public List<List<Object>> getResultSchema(String wuid) throws Exception, ArrayOfEspExceptionWrapper, ArrayOfECLExceptionWrapper
    {
        return Utils.parseOutResultSchema("<root>" + getResultResponse(wuid, 0, 1, false).getResult() + "</root>");
    }

    /**
     * Prepare SQL.
     *
     * @param sqlText
     *            the sql text
     * @param targetCluster
     *            the target cluster
     * @param targetQuerySet
     *            the target query set
     * @param wait
     *            the wait
     * @return the ECL workunit wrapper
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfECLExceptionWrapper
     *             the array of ECL exception wrapper
     */
    @WithSpan
    public ECLWorkunitWrapper prepareSQL(String sqlText, @SpanAttribute String targetCluster, @SpanAttribute String targetQuerySet, Integer wait)
            throws Exception, ArrayOfEspExceptionWrapper, ArrayOfECLExceptionWrapper
    {
        verifyStub();

        PrepareSQLRequest request = new PrepareSQLRequest();

        request.setSqlText(sqlText);
        request.setTargetCluster(targetCluster);
        request.setTargetQuerySet(targetQuerySet);
        if (wait != null) request.setWait(wait);

        PrepareSQLResponse resp = null;

        try
        {
            resp = ((WssqlStub) stub).prepareSQL(request);
        }
        catch (RemoteException e)
        {
            log.error("HPCCWsSQL.prepareSQL encountered RemoteException.\n" + e.getLocalizedMessage());
        }

        if (resp != null)
        {
            if (resp.getExceptions() != null)
                handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could not perform prepareSQL");

            ECLWorkunit workunit = resp.getWorkunit();
            if (workunit != null)
            {
                ArrayOfECLException exceptions = workunit.getExceptions();
                if (exceptions != null)
                {
                    ECLException[] eclExceptions = exceptions.getECLException();
                    if (eclExceptions != null && eclExceptions.length > 0) handleECLExceptions(new ArrayOfECLExceptionWrapper(exceptions));
                }
                return new ECLWorkunitWrapper(workunit);
            }
        }
        return null;
    }

    /**
     * Execute prepared SQL.
     *
     * @param wuid
     *            the wuid
     * @param targetCluster
     *            the target cluster
     * @param variables
     *            the variables
     * @param wait
     *            the wait
     * @param resultLimit
     *            the result limit
     * @param userName
     *            the user name
     * @return the ECL workunit wrapper
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfECLExceptionWrapper
     *             the array of ECL exception wrapper
     */
    public ECLWorkunitWrapper executePreparedSQL(String wuid, String targetCluster, NamedValueWrapper [] variables, Integer wait, Integer resultLimit,
            String userName) throws Exception, ArrayOfEspExceptionWrapper, ArrayOfECLExceptionWrapper
    {
        return executePreparedSQL(wuid, targetCluster, variables, wait, resultLimit, null, null, userName, true, true).getWorkunit();
    }

    /**
     * Execute prepared SQL.
     *
     * @param wuid
     *            the wuid
     * @param targetCluster
     *            the target cluster
     * @param variables
     *            the variables
     * @param wait
     *            the wait
     * @param resultLimit
     *            the result limit
     * @param userName
     *            the user name
     * @param somesing
     *            the somesing
     * @return the list
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfECLExceptionWrapper
     *             the array of ECL exception wrapper
     */
    public List<List<Object>> executePreparedSQL(String wuid, String targetCluster, NamedValueWrapper [] variables, Integer wait, Integer resultLimit,
            String userName, String somesing) throws Exception, ArrayOfEspExceptionWrapper, ArrayOfECLExceptionWrapper
    {
        ExecutePreparedSQLResponseWrapper executePreparedSQL = executePreparedSQL(wuid, targetCluster, variables, wait, resultLimit, null, null,
                userName, true, true);
        String result = executePreparedSQL.getResult();
        return Utils.parseECLResults(result);
    }

    /**
     * Execute prepared SQL.
     *
     * @param wuid
     *            the wuid
     * @param targetCluster
     *            the target cluster
     * @param variables
     *            the variables
     * @param wait
     *            the wait
     * @param resultLimit
     *            the result limit
     * @param resultWindowStart
     *            the result window start
     * @param resultWindowCount
     *            the result window count
     * @param userName
     *            the user name
     * @param suppressXmlSchema
     *            the suppress xml schema
     * @param suppressResults
     *            the suppress results
     * @return the execute prepared SQL response wrapper
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfECLExceptionWrapper
     *             the array of ECL exception wrapper
     */
    @WithSpan
    public ExecutePreparedSQLResponseWrapper executePreparedSQL(@SpanAttribute String wuid, @SpanAttribute String targetCluster, NamedValueWrapper [] variables, Integer wait,
            Integer resultLimit, Integer resultWindowStart, Integer resultWindowCount, String userName, Boolean suppressXmlSchema,
            Boolean suppressResults) throws Exception, ArrayOfEspExceptionWrapper, ArrayOfECLExceptionWrapper
    {
        verifyStub();

        ExecutePreparedSQLRequest request = new ExecutePreparedSQLRequest();

        request.setWuId(wuid);

        if (variables != null && variables.length > 0)
        {
            ArrayOfNamedValue arrayofvars = new ArrayOfNamedValue();
            for (int i = 0; i < variables.length; i++)
            {
                NamedValue namedvalue = new NamedValue();
                namedvalue.setName(variables[i].getName());
                namedvalue.setValue(variables[i].getValue());
                arrayofvars.addNamedValue(namedvalue);
            }
            request.setVariables(arrayofvars);
        }

        if (resultWindowStart != null) request.setResultWindowStart(resultWindowStart);
        if (resultWindowCount != null) request.setResultWindowCount(resultWindowCount);
        if (suppressXmlSchema != null) request.setSuppressXmlSchema(suppressXmlSchema);
        if (suppressResults != null) request.setSuppressResults(suppressResults);
        if (targetCluster != null) request.setTargetCluster(targetCluster);
        if (userName != null) request.setUserName(userName);
        if (wait != null) request.setWait(wait);

        ExecutePreparedSQLResponse resp = null;

        try
        {
            resp = ((WssqlStub) stub).executePreparedSQL(request);
        }
        catch (RemoteException e)
        {
            log.error("HPCCWsSQL.executePreparedSQL encountered RemoteException.\n" + e.getLocalizedMessage());
        }

        if (resp != null)
        {
            if (resp.getExceptions() != null)
                handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could not perform executePreparedSQL");

            ECLWorkunit workunit = resp.getWorkunit();
            if (workunit != null)
            {
                ArrayOfECLException exceptions = workunit.getExceptions();
                if (exceptions != null)
                {
                    ECLException[] eclExceptions = exceptions.getECLException();
                    if (eclExceptions != null && eclExceptions.length > 0) handleECLExceptions(new ArrayOfECLExceptionWrapper(exceptions));
                }
                return new ExecutePreparedSQLResponseWrapper(resp);
            }
        }
        return null;
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
        return new WssqlStub();
    }
}

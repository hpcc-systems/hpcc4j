package org.hpccsystems.ws.client;

import java.rmi.RemoteException;
import java.util.List;

import org.apache.log4j.Logger;
import org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ArrayOfECLException;
import org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ArrayOfNamedValue;
import org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ECLException;
import org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ECLWorkunit;
import org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ExecutePreparedSQLRequest;
import org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ExecutePreparedSQLResponse;
import org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ExecuteSQLRequest;
import org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ExecuteSQLResponse;
import org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.GetDBMetaDataRequest;
import org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.GetDBMetaDataResponse;
import org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.GetDBSystemInfoRequest;
import org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.GetDBSystemInfoResponse;
import org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.GetResultsRequest;
import org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.GetResultsResponse;
import org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.HPCCQuerySet;
import org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.HPCCTable;
import org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.NamedValue;
import org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.PrepareSQLRequest;
import org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.PrepareSQLResponse;
import org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.QuerySets_type0;
import org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.WssqlPingRequest;
import org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.WssqlStub;
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

/**
 * Use as soap client for HPCC WsSQL web service.
 *
 */
public class HPCCWsSQLClient  extends BaseHPCCWsClient
{
    private static final Logger    log                   = Logger.getLogger(HPCCWsSQLClient.class.getName());
    public static final String     WSSQLURI              = "/WsSQL";
    private static final int       DEFAULT_RESULT_LIMIT  = 100;
    private static final String    PINGSTATEMENT         = "HPCCWsSQLClient Greets you.";
    private Version version = null;

    public static HPCCWsSQLClient get(Connection connection)
    {
        return new HPCCWsSQLClient(connection);
    }

    public static HPCCWsSQLClient get(String protocol, String targetHost, String targetPort, String user, String pass)
    {
        Connection conn = new Connection(protocol,targetHost,targetPort);
        conn.setCredentials(user, pass);
        return new HPCCWsSQLClient(conn);
    }

    public static HPCCWsSQLClient get(String protocol, String targetHost, String targetPort, String user, String pass, int timeout)
    {
        Connection conn = new Connection(protocol,targetHost,targetPort);
        conn.setCredentials(user, pass);
        conn.setConnectTimeoutMilli(timeout);
        conn.setSocketTimeoutMilli(timeout);

        return new HPCCWsSQLClient(conn);
    }

    protected HPCCWsSQLClient(Connection baseConnection)
    {
        initHPCCWsSQLClientStub(baseConnection);
    }

    /**
     * Initializes the service's underlying soap proxy. Should only be used by constructors
     *
     * @param baseURL   Target service base URL
     * @param user      User credentials
     * @param pass      User credentials
     */
    @SuppressWarnings("static-access")
    private void initHPCCWsSQLClientStub(Connection connection)
    {
        initErrMessage = "";

        try
        {
            stub = setStubOptions(new WssqlStub(connection.getUrl()+this.WSSQLURI), connection);
        }
        catch (Exception e)
        {
            log.error("Could not initialize WssqlStub - Review all HPCC connection values");
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

        WssqlPingRequest request = new WssqlPingRequest();

        try
        {
            ((WssqlStub)stub).ping(request);
        }
        catch (Exception e)
        {
            return false;
        }

        return true;
    }

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

    public String [] getTargetClusters(String filter) throws Exception
    {
        verifyStub();

        GetDBMetaDataRequest request = new GetDBMetaDataRequest();

        request.setIncludeTargetClusters(true);
        if (filter != null)
            request.setClusterType(filter);

        request.setIncludeStoredProcedures(false);
        request.setIncludeTables(false);

        GetDBMetaDataResponse resp = null;

        try
        {
            resp = ((WssqlStub)stub).getDBMetaData(request);
        }
        catch (RemoteException e)
        {
            log.error("HPCCWsSQL.getTargetClusters("+filter+") encountered RemoteException.\n" + e.getLocalizedMessage());
        }

        if (resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "HPCCWsSQL.getTargetClusters("+filter+") encountered RemoteException.");

        return resp.getClusterNames().getClusterName();
    }

    public HPCCTableWrapper [] getTables(String filter) throws Exception
    {
        verifyStub();

        HPCCTableWrapper [] result = null;

        GetDBMetaDataRequest request = new GetDBMetaDataRequest();

        request.setIncludeTables(true);
        if (filter != null)
            request.setTableFilter(filter);

        request.setIncludeStoredProcedures(false);
        request.setIncludeTargetClusters(false);

        GetDBMetaDataResponse resp = null;

        try
        {
            resp = ((WssqlStub)stub).getDBMetaData(request);
        }
        catch (RemoteException e)
        {
            log.error("HPCCWsSQL.getTables("+filter+") encountered RemoteException.\n" + e.getLocalizedMessage());
        }

        if (resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could not get Tables("+filter+").");

        if (resp.getTables() != null)
        {
            HPCCTable[] hpccTables = resp.getTables().getTable();
            if (hpccTables != null && hpccTables.length > 0)
            {
                result = new HPCCTableWrapper [hpccTables.length];
                for (int i = 0; i < hpccTables.length; i++)
                {
                    result[i] = new HPCCTableWrapper(hpccTables[i]);
                }
            }
        }
        return  result;
    }

    public HPCCQuerySetWrapper[] getStoredProcedures(String querysetname) throws Exception
    {
        verifyStub();

        GetDBMetaDataRequest request = new GetDBMetaDataRequest();

        request.setIncludeStoredProcedures(true);

        if (querysetname != null)
            request.setQuerySet(querysetname);

        request.setIncludeTables(false);
        request.setIncludeTargetClusters(false);
        request.setIncludeStoredProcedures(true);

        GetDBMetaDataResponse resp = null;
        try
        {
            resp = ((WssqlStub)stub).getDBMetaData(request);
        }
        catch (RemoteException e)
        {
            log.error("HPCCWsSQL.getStoredProcedures("+querysetname+") encountered RemoteException.\n" + e.getLocalizedMessage());
        }

        if (resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could not get stored procedures for '"+querysetname+"'");

        HPCCQuerySetWrapper [] result = null;
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

    public Version getVersion()
    {
        populateSystemInfo();

        return version;
    }

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
                    resp = ((WssqlStub)stub).getDBSystemInfo(request);
                }
                catch (RemoteException e)
                {
                    log.error("HPCCWsSQL.populateSystemInfo encountered RemoteException.\n" + e.getLocalizedMessage());
                }

                if (resp.getExceptions() != null)
                    handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "HPCCWsSQL.populateSystemInfo encountered RemoteException.\n");

                if (resp != null)
                {
                    version = new Version(resp.getFullVersion());
                    if (version != null && version.major != 0)
                        success = true;
                }
            }
            catch (Exception e) {}
        }
        return success;
    }

    public String executeSQLWUIDResponse(String sqlText, String targetCluster, String targetQuerySet) throws Exception
    {
        return executeSQLWUResponse(sqlText, targetCluster, targetQuerySet, DEFAULT_RESULT_LIMIT, null /*resultWindowCount*/, null /*resultWindowStart*/, null /*suppressResults*/, true /*Boolean suppressXmlSchema*/, null /*String userName*/, null /*Integer wait*/).getWuid();
    }

    public ExecuteSQLResponseWrapper executeSQLFullResponse(String sqlText, String targetCluster, String targetQuerySet, Integer resultLimit, Integer resultWindowCount, Integer resultWindowStart, Boolean suppressResults, Boolean suppressXmlSchema, String userName, Integer wait) throws Exception
    {
        verifyStub();

        ExecuteSQLRequest request = new ExecuteSQLRequest();

        if (resultLimit != null)
            request.setResultLimit(resultLimit);
        if (resultWindowCount != null)
            request.setResultWindowCount(resultWindowCount);
        if (resultWindowStart != null)
            request.setResultWindowStart(resultWindowStart);

        request.setSqlText(sqlText);

        if (resultWindowStart != null)
            request.setSuppressResults(suppressResults);
        if (suppressXmlSchema != null)
            request.setSuppressXmlSchema(suppressXmlSchema);

        request.setTargetCluster(targetCluster);

        if (targetQuerySet != null)
            request.setTargetQuerySet(targetQuerySet);
        if (userName != null)
            request.setUserName(userName);
        if (wait != null)
            request.setWait(wait);

        ExecuteSQLResponse resp = null;
        try
        {
            resp = ((WssqlStub)stub).executeSQL(request);
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
                    if (eclExceptions != null && eclExceptions.length > 0)
                        handleECLExceptions(new ArrayOfECLExceptionWrapper(exceptions));
                }
                return new ExecuteSQLResponseWrapper(resp);
            }
        }

        return null;
    }

    public ECLWorkunitWrapper executeSQLWUResponse(String sqlText, String targetCluster, String targetQuerySet, Integer resultLimit, Integer resultWindowCount, Integer resultWindowStart, Boolean suppressResults, Boolean suppressXmlSchema, String userName, Integer wait) throws Exception
    {
        return executeSQLFullResponse(sqlText, targetCluster, targetQuerySet, DEFAULT_RESULT_LIMIT, null /*resultWindowCount*/, null /*resultWindowStart*/, null /*suppressResults*/, true /*Boolean suppressXmlSchema*/, null /*String userName*/, null /*Integer wait*/).getWorkunit();
    }

    public List<List<Object>> getResults(String wuid, Integer resultWindowStart, Integer resultWindowCount) throws Exception
    {
        return Utils.parseECLResults(getResultResponse(wuid, resultWindowStart, resultWindowCount, true).getResult());
    }

    public GetResultsResponseWrapper getResultResponse(String wuid, Integer resultWindowStart, Integer resultWindowCount, Boolean suppressXmlSchema) throws Exception
    {
        verifyStub();

        GetResultsRequest request = new GetResultsRequest();

        request.setWuId(wuid);
        if (resultWindowCount!=null)
            request.setResultWindowCount(resultWindowCount);
        if (resultWindowStart!=null)
            request.setResultWindowStart(resultWindowStart);
        if (suppressXmlSchema!=null)
            request.setSuppressXmlSchema(suppressXmlSchema);

        GetResultsResponse resp = null;

        try
        {
            resp = ((WssqlStub)stub).getResults(request);
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
                    if (eclExceptions != null && eclExceptions.length > 0)
                        handleECLExceptions(new ArrayOfECLExceptionWrapper(exceptions));
                }
                return new GetResultsResponseWrapper(resp);
            }
        }

        return null;
    }

    public String getResultSchemaXML(String wuid) throws Exception
    {
        return Utils.extactResultSchema("<root>"+getResultResponse(wuid, 0, 0, false).getResult()+"</root>");
    }

    public List<List<Object>> getResultSchema(String wuid) throws Exception
    {
        return Utils.parseOutResultSchema("<root>"+getResultResponse(wuid, 0, 0, false).getResult()+"</root>");
    }

    public ECLWorkunitWrapper prepareSQL(String sqlText, String targetCluster, String targetQuerySet, Integer wait) throws Exception
    {
        verifyStub();

        PrepareSQLRequest request = new PrepareSQLRequest();

        request.setSqlText(sqlText);
        request.setTargetCluster(targetCluster);
        request.setTargetQuerySet(targetQuerySet);
        if (wait != null)
            request.setWait(wait);

        PrepareSQLResponse resp = null;

        try
        {
            resp = ((WssqlStub)stub).prepareSQL(request);
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
                    if (eclExceptions != null && eclExceptions.length > 0)
                        handleECLExceptions(new ArrayOfECLExceptionWrapper(exceptions));
                }
                return new ECLWorkunitWrapper(workunit);
            }
        }
        return null;
    }

    public ECLWorkunitWrapper executePreparedSQL(String wuid, String targetCluster, NamedValue[] variables, Integer wait, Integer resultLimit, String userName) throws Exception
    {
        return executePreparedSQL(wuid, targetCluster, variables, wait, resultLimit, null, null, userName, true, true).getWorkunit();
    }

    public List<List<Object>> executePreparedSQL(String wuid, String targetCluster, NamedValue[] variables, Integer wait, Integer resultLimit, String userName, String somesing) throws Exception
    {
        ExecutePreparedSQLResponseWrapper executePreparedSQL = executePreparedSQL(wuid, targetCluster, variables, wait, resultLimit, null, null, userName, true, true);
        String result = executePreparedSQL.getResult();
        return Utils.parseECLResults(result);
    }

    public ExecutePreparedSQLResponseWrapper executePreparedSQL(String wuid, String targetCluster, NamedValue[] variables, Integer wait, Integer resultLimit, Integer resultWindowStart, Integer resultWindowCount, String userName, Boolean suppressXmlSchema, Boolean suppressResults) throws Exception
    {
        verifyStub();

        ExecutePreparedSQLRequest request = new ExecutePreparedSQLRequest();

        request.setWuId(wuid);

        if (variables != null && variables.length>0)
        {
            ArrayOfNamedValue arrayofvars = new ArrayOfNamedValue();
            arrayofvars.setNamedValue(variables);
            request.setVariables(arrayofvars);
        }

        if (resultWindowStart != null)
            request.setResultWindowStart(resultWindowStart);
        if (resultWindowCount != null)
            request.setResultWindowCount(resultWindowCount);
        if (suppressXmlSchema != null)
            request.setSuppressXmlSchema(suppressXmlSchema);
        if (suppressResults != null)
            request.setSuppressResults(suppressResults);
        if (targetCluster != null)
            request.setTargetCluster(targetCluster);
        if (userName != null)
            request.setUserName(userName);
        if (wait != null)
            request.setWait(wait);

        ExecutePreparedSQLResponse resp = null;

        try
        {
            resp = ((WssqlStub)stub).executePreparedSQL(request);
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
                    if (eclExceptions != null && eclExceptions.length > 0)
                        handleECLExceptions(new ArrayOfECLExceptionWrapper(exceptions));
                }
                return new ExecutePreparedSQLResponseWrapper(resp);
            }
        }
        return null;
    }
}

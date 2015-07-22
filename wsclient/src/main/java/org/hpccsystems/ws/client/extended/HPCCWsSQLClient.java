package org.hpccsystems.ws.client.extended;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.List;

import org.apache.axis.client.Stub;
import org.hpccsystems.ws.client.gen.extended.wssql.v1_0.ArrayOfEspException;
import org.hpccsystems.ws.client.gen.extended.wssql.v1_0.ECLException;
import org.hpccsystems.ws.client.gen.extended.wssql.v1_0.ECLWorkunit;
import org.hpccsystems.ws.client.gen.extended.wssql.v1_0.EchoRequest;
import org.hpccsystems.ws.client.gen.extended.wssql.v1_0.EchoResponse;
import org.hpccsystems.ws.client.gen.extended.wssql.v1_0.EspException;
import org.hpccsystems.ws.client.gen.extended.wssql.v1_0.ExecutePreparedSQLRequest;
import org.hpccsystems.ws.client.gen.extended.wssql.v1_0.ExecutePreparedSQLResponse;
import org.hpccsystems.ws.client.gen.extended.wssql.v1_0.ExecuteSQLRequest;
import org.hpccsystems.ws.client.gen.extended.wssql.v1_0.ExecuteSQLResponse;
import org.hpccsystems.ws.client.gen.extended.wssql.v1_0.GetDBMetaDataRequest;
import org.hpccsystems.ws.client.gen.extended.wssql.v1_0.GetDBMetaDataResponse;
import org.hpccsystems.ws.client.gen.extended.wssql.v1_0.GetDBSystemInfoRequest;
import org.hpccsystems.ws.client.gen.extended.wssql.v1_0.GetDBSystemInfoResponse;
import org.hpccsystems.ws.client.gen.extended.wssql.v1_0.GetResultsRequest;
import org.hpccsystems.ws.client.gen.extended.wssql.v1_0.GetResultsResponse;
import org.hpccsystems.ws.client.gen.extended.wssql.v1_0.HPCCColumn;
import org.hpccsystems.ws.client.gen.extended.wssql.v1_0.HPCCQuerySet;
import org.hpccsystems.ws.client.gen.extended.wssql.v1_0.HPCCTable;
import org.hpccsystems.ws.client.gen.extended.wssql.v1_0.NamedValue;
import org.hpccsystems.ws.client.gen.extended.wssql.v1_0.OutputDataset;
import org.hpccsystems.ws.client.gen.extended.wssql.v1_0.PrepareSQLRequest;
import org.hpccsystems.ws.client.gen.extended.wssql.v1_0.PrepareSQLResponse;
import org.hpccsystems.ws.client.gen.extended.wssql.v1_0.PublishedQuery;
import org.hpccsystems.ws.client.gen.extended.wssql.v1_0.QuerySetAliasMap;
import org.hpccsystems.ws.client.gen.extended.wssql.v1_0.QuerySignature;
import org.hpccsystems.ws.client.gen.extended.wssql.v1_0.WssqlServiceSoap;
import org.hpccsystems.ws.client.gen.extended.wssql.v1_0.WssqlServiceSoapProxy;
import org.hpccsystems.ws.client.platform.DataSingleton;
import org.hpccsystems.ws.client.platform.Version;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.utils.EqualsUtil;
import org.hpccsystems.ws.client.utils.HashCodeUtil;
import org.hpccsystems.ws.client.utils.Utils;

/**
 * Use as soap client for HPCC WsSQL web service.
 *
 */
public class HPCCWsSQLClient  extends DataSingleton
{
    public static final String     WSSQLURI              = "/WsSQL";
    private WssqlServiceSoapProxy  wsSqlServiceSoapProxy = null;
    private boolean                verbose               = false;
    private Version                version               = null;
    private static final int       DEFAULT_RESULT_LIMIT  = 100;
    private static final String    PINGSTATEMENT         = "HPCCWsSQLClient Greets you.";

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

    /**
     * @param verbose - sets verbose mode
     */
    public void setVerbose(boolean verbose)
    {
        this.verbose = verbose;
    }

    /**
     * Provides soapproxy object for HPCCWsSQLClient which can be used to access the web service methods directly
     *
     * @return soapproxy for HPCCWsSQLClient
     * @throws Exception
     */
    public WssqlServiceSoapProxy getSoapProxy() throws Exception
    {
        if (wsSqlServiceSoapProxy != null)
        {
            return wsSqlServiceSoapProxy;
        }
        else
        {
            throw new Exception("wsSqlServiceSoapProxy not available.");
        }
    }

    /**
     * Provides the WSDL URL originally used to create the underlying stub code
     *
     * @return original WSLD URL
     */
    public static String getOriginalWSDLURL()
    {
        return (new org.hpccsystems.ws.client.gen.extended.wssql.v1_0.WssqlLocator()).getwssqlServiceSoapAddress();
    }

    /**
     * @param wsDfuServiceSoapProxy
     */
    protected HPCCWsSQLClient(WssqlServiceSoapProxy wsSqlServiceSoapProxy)
    {
        this.wsSqlServiceSoapProxy = wsSqlServiceSoapProxy;
    }

    /**
     * @param baseConnection
     */
    public HPCCWsSQLClient(Connection baseConnection)
    {
        this(baseConnection.getProtocol(), baseConnection.getHost(), baseConnection.getPort(), baseConnection.getUserName(), baseConnection.getPassword());
    }

    public static HPCCWsSQLClient get(Connection connection)
    {
        return new HPCCWsSQLClient(connection);
    }

    /**
     * @param protocol - http or https
     * @param targetHost - server IP/name of the HPCC Cluster
     * @param targetPort - port of the HPCC Cluster
     * @param user - username to use when connecting to the HPCC Cluster
     * @param pass - Password to use when connecting to the HPCC Cluster
     */
    protected HPCCWsSQLClient(String protocol, String targetHost, String targetPort, String user, String pass)
    {
        String address = Connection.buildUrl(protocol, targetHost, targetPort, WSSQLURI);

        initHPCCWsSQLSoapProxy(address, user, pass);
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
    private void initHPCCWsSQLSoapProxy(String baseURL, String user, String pass)
    {
        wsSqlServiceSoapProxy = new WssqlServiceSoapProxy(baseURL);
        if (wsSqlServiceSoapProxy != null)
        {
            WssqlServiceSoap wsSqlServiceSoap = wsSqlServiceSoapProxy.getWssqlServiceSoap();
            if (wsSqlServiceSoap != null)
            {
                if (user != null && pass != null) Connection.initStub((Stub) wsSqlServiceSoap, user, pass);
            }
        }
    }

    public boolean isWsSQLReachable()
    {
        boolean reachable = false;

        try
        {
            WssqlServiceSoapProxy soapProxy = getSoapProxy();

            EchoResponse echoResponse = soapProxy.echo(new EchoRequest(PINGSTATEMENT));
            if (echoResponse != null && echoResponse.getResponse().equals(PINGSTATEMENT))
                reachable = true;
        }
        catch (Exception e) {}

        return reachable;
    }

    public String [] getTargetClusters(String filter) throws Exception
    {
        WssqlServiceSoapProxy soapProxy = getSoapProxy();
        String[] clusterNames = null;

        try
        {
            GetDBMetaDataRequest getDBMetaDataRequest = new GetDBMetaDataRequest();

            getDBMetaDataRequest.setIncludeTargetClusters(true);
            if (filter != null)
                getDBMetaDataRequest.setClusterType(filter);

            getDBMetaDataRequest.setIncludeStoredProcedures(false);
            getDBMetaDataRequest.setIncludeTables(false);

            GetDBMetaDataResponse clusters = soapProxy.getDBMetaData(getDBMetaDataRequest);

            clusterNames = clusters.getClusterNames();
        }
        catch (Exception e) {}

        return clusterNames;
    }

    public HPCCTable[] getTables(String filter) throws Exception
    {
        WssqlServiceSoapProxy soapProxy = getSoapProxy();

        HPCCTable[] tablesList = null;
        try
        {
            GetDBMetaDataRequest getDBMetaDataRequest = new GetDBMetaDataRequest();

            getDBMetaDataRequest.setIncludeTables(true);
            if (filter != null)
                getDBMetaDataRequest.setClusterType(filter);

            getDBMetaDataRequest.setIncludeStoredProcedures(false);
            getDBMetaDataRequest.setIncludeTargetClusters(false);

            GetDBMetaDataResponse tables = soapProxy.getDBMetaData(getDBMetaDataRequest);

            tablesList = tables.getTables();
        }
        catch (Exception e)
        {
            Utils.print(System.out, "Could not fetch file(s) " + e.getLocalizedMessage(), false, false);
            throw e;
        }

        return tablesList;
    }

    public HPCCQuerySet[] getStoredProcedures(String querysetname) throws Exception
    {
        WssqlServiceSoapProxy soapProxy = getSoapProxy();

        HPCCQuerySet[] querysets = null;
        try
        {
            GetDBMetaDataRequest getDBMetaDataRequest = new GetDBMetaDataRequest();

            getDBMetaDataRequest.setIncludeStoredProcedures(true);

            if (querysetname != null)
                getDBMetaDataRequest.setQuerySet(querysetname);

            getDBMetaDataRequest.setIncludeTables(false);
            getDBMetaDataRequest.setIncludeTargetClusters(false);

            GetDBMetaDataResponse storedProcs = soapProxy.getDBMetaData(getDBMetaDataRequest);

            querysets = storedProcs.getQuerySets();
            if (querysets != null && querysets.length > 0)
            {
                for (int i = 0; i < querysets.length; i++)
                {
                    HPCCQuerySet queryset = querysets[i];
                    String qsname  = queryset.getName();
                    QuerySetAliasMap[] querySetAliases = queryset.getQuerySetAliases();
                    for (int aliases = 0; aliases < querySetAliases.length; aliases++)
                    {
                        String qsaliasid = querySetAliases[aliases].getId();
                        String qsaliasname = querySetAliases[aliases].getName();
                    }

                    PublishedQuery[] querySetQueries = queryset.getQuerySetQueries();
                    for (int queries = 0; queries < querySetQueries.length; queries++)
                    {
                        String id = querySetQueries[queries].getId();
                        String qname = querySetQueries[queries].getName();
                        QuerySignature querySignature = querySetQueries[queries].getSignature();
                        HPCCColumn[] inParams = querySignature.getInParams();
                        OutputDataset[] resultSets = querySignature.getResultSets();
                        HPCCColumn[] outParams = resultSets[0].getOutParams();
                    }
                }
            }
        }
        catch (Exception e) {}

        return querysets;
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
            WssqlServiceSoapProxy soapProxy = null;
            try
            {
                soapProxy = getSoapProxy();
            }
            catch (Exception e)
            {
                System.out.println("Could not fetch System info, WsSQLServiceProxy not available.");
                return false;
            }

            try
            {
                GetDBSystemInfoResponse dbSystemInfo = soapProxy.getDBSystemInfo(new GetDBSystemInfoRequest(true));
                if (dbSystemInfo != null)
                {
                    version = new Version(dbSystemInfo.getFullVersion());
                    if (version != null)
                        success = true;
                }
            }
            catch (RemoteException e)
            {
                System.out.println("Error fetching HPCC System info.");
            }
        }
        return success;
    }

    public String executeSQLWUIDResponse(String sqlText, String targetCluster, String targetQuerySet) throws Exception
    {
        return executeSQLWUResponse(sqlText, targetCluster, targetQuerySet, DEFAULT_RESULT_LIMIT, null /*resultWindowCount*/, null /*resultWindowStart*/, null /*suppressResults*/, true /*Boolean suppressXmlSchema*/, null /*String userName*/, null /*Integer wait*/).getWuid();
    }

    public ExecuteSQLResponse executeSQLFullResponse(String sqlText, String targetCluster, String targetQuerySet, Integer resultLimit, Integer resultWindowCount, Integer resultWindowStart, Boolean suppressResults, Boolean suppressXmlSchema, String userName, Integer wait) throws Exception
    {
        WssqlServiceSoapProxy soapProxy = getSoapProxy();

        ExecuteSQLRequest executeSQLRequest = new ExecuteSQLRequest();
        executeSQLRequest.setResultLimit(resultLimit);
        executeSQLRequest.setResultWindowCount(resultWindowCount);
        executeSQLRequest.setResultWindowStart(resultWindowStart);
        executeSQLRequest.setSqlText(sqlText);
        executeSQLRequest.setSuppressResults(suppressResults);
        executeSQLRequest.setSuppressXmlSchema(suppressXmlSchema);
        executeSQLRequest.setTargetCluster(targetCluster);
        executeSQLRequest.setTargetQuerySet(targetQuerySet);
        executeSQLRequest.setUserName(userName);
        executeSQLRequest.setWait(wait);

        ExecuteSQLResponse executeSQLResponse = soapProxy.executeSQL(executeSQLRequest);
        if (executeSQLResponse != null)
        {
            ArrayOfEspException exceptions = executeSQLResponse.getExceptions();
            if (exceptions!=null)
                handleESPExceptions(exceptions);
            if (executeSQLResponse.getWorkunit() != null)
                handleECLExceptions(executeSQLResponse.getWorkunit().getExceptions());
            return executeSQLResponse;
        }

        return null;
    }

    public ECLWorkunit executeSQLWUResponse(String sqlText, String targetCluster, String targetQuerySet, Integer resultLimit, Integer resultWindowCount, Integer resultWindowStart, Boolean suppressResults, Boolean suppressXmlSchema, String userName, Integer wait) throws Exception
    {
        return executeSQLFullResponse(sqlText, targetCluster, targetQuerySet, DEFAULT_RESULT_LIMIT, null /*resultWindowCount*/, null /*resultWindowStart*/, null /*suppressResults*/, true /*Boolean suppressXmlSchema*/, null /*String userName*/, null /*Integer wait*/).getWorkunit();
    }

    public List<List<Object>> getResutls(String wuid, Integer resultWindowStart, Integer resultWindowCount) throws Exception
    {
        return Utils.parseECLResults(getResultResponse(wuid, resultWindowStart, resultWindowCount, true).getResult());
    }

    public GetResultsResponse getResultResponse(String wuid, Integer resultWindowStart, Integer resultWindowCount, Boolean suppressXmlSchema) throws Exception
    {
        WssqlServiceSoapProxy soapProxy = getSoapProxy();

        GetResultsRequest getResultsRequest = new GetResultsRequest();
        getResultsRequest.setWuId(wuid);
        getResultsRequest.setResultWindowCount(resultWindowCount);
        getResultsRequest.setResultWindowStart(resultWindowStart);
        getResultsRequest.setSuppressXmlSchema(suppressXmlSchema);

        GetResultsResponse results = soapProxy.getResults(getResultsRequest);
        if (results != null)
        {
            ArrayOfEspException exceptions = results.getExceptions();
            if (exceptions!=null)
                handleESPExceptions(exceptions);
            ECLWorkunit workunit = results.getWorkunit();
            if (workunit != null)
                handleECLExceptions(workunit.getExceptions());

            return results;
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

    public ECLWorkunit prepareSQL(String sqlText, String targetCluster, String targetQuerySet, Integer wait) throws Exception
    {
        WssqlServiceSoapProxy soapProxy = getSoapProxy();

        PrepareSQLRequest prepareSQLRequest = new PrepareSQLRequest();
        prepareSQLRequest.setSqlText(sqlText);
        prepareSQLRequest.setTargetCluster(targetCluster);
        prepareSQLRequest.setTargetQuerySet(targetQuerySet);
        prepareSQLRequest.setWait(wait);

        PrepareSQLResponse prepareSQL = soapProxy.prepareSQL(prepareSQLRequest);
        if (prepareSQL != null)
        {
            ArrayOfEspException exceptions = prepareSQL.getExceptions();
            if (exceptions!=null)
                handleESPExceptions(exceptions);
            ECLWorkunit workunit = prepareSQL.getWorkunit();
            if (workunit != null)
                handleECLExceptions(workunit.getExceptions());

            return workunit;
        }

        return null;
    }

    public ECLWorkunit executePreparedSQL(String wuid, String targetCluster, NamedValue[] variables, Integer wait, Integer resultLimit, String userName) throws Exception
    {
        return executePreparedSQL(wuid, targetCluster, variables, wait, resultLimit, null, null, userName, true, true).getWorkunit();
    }

    public List<List<Object>> executePreparedSQL(String wuid, String targetCluster, NamedValue[] variables, Integer wait, Integer resultLimit, String userName, String somesing) throws Exception
    {
        ExecutePreparedSQLResponse executePreparedSQL = executePreparedSQL(wuid, targetCluster, variables, wait, resultLimit, null, null, userName, true, true);
        String result = executePreparedSQL.getResult();
        return Utils.parseECLResults(result);
    }

    public ExecutePreparedSQLResponse executePreparedSQL(String wuid, String targetCluster, NamedValue[] variables, Integer wait, Integer resultLimit, Integer resultWindowStart, Integer resultWindowCount, String userName, Boolean suppressXmlSchema, Boolean suppressResults) throws Exception
    {
        WssqlServiceSoapProxy soapProxy = getSoapProxy();

        ExecutePreparedSQLRequest executePreparedSQLRequest = new ExecutePreparedSQLRequest();
        executePreparedSQLRequest.setWuId(wuid);
        executePreparedSQLRequest.setVariables(variables);
        executePreparedSQLRequest.setResultLimit(resultLimit);
        executePreparedSQLRequest.setResultWindowStart(resultWindowStart);
        executePreparedSQLRequest.setResultWindowCount(resultWindowCount);
        executePreparedSQLRequest.setSuppressXmlSchema(suppressXmlSchema);
        executePreparedSQLRequest.setSuppressResults(suppressResults);
        executePreparedSQLRequest.setTargetCluster(targetCluster);
        executePreparedSQLRequest.setUserName(userName);
        executePreparedSQLRequest.setWait(wait);

        ExecutePreparedSQLResponse executePreparedSQL = soapProxy.executePreparedSQL(executePreparedSQLRequest);
        if (executePreparedSQL != null)
        {
            ArrayOfEspException exceptions = executePreparedSQL.getExceptions();
            if (exceptions!=null)
                handleESPExceptions(exceptions);
            if (executePreparedSQL.getWorkunit() != null)
                handleECLExceptions(executePreparedSQL.getWorkunit().getExceptions());

            return executePreparedSQL;
        }

        return null;
    }

    private void handleESPExceptions(ArrayOfEspException exp) throws Exception
    {
        if (exp != null && exp.getException() != null && exp.getException().length > 0)
        {
            String message = "";
            for (int i = 0; i < exp.getException().length; i++)
            {
                EspException ex = exp.getException()[i];
                Utils.println(System.out, ex.getMessage(), true, verbose);
                message = message + "Audience: " + ex.getAudience() + " Source: " + ex.getSource() + " Message: " + ex.getMessage()+"\n";
            }
            throw new Exception(message);
        }
    }

    private void handleECLExceptions(ECLException[] eclexceptions) throws Exception
    {
        if (eclexceptions != null)
        {
            String message = "";
            for (int eclexceptionindex = 0; eclexceptionindex < eclexceptions.length; eclexceptionindex++)
            {
                ECLException eclException = eclexceptions[eclexceptionindex];
                Utils.println(System.out, eclException.getMessage(), true, verbose);
                message = message + "Severity: " + eclException.getSeverity() + " Source: " + eclException.getSource() + " Message: " + eclException.getMessage()+"\n";
            }
            throw new Exception(message);
        }
    }

    public static void main (String[] args)
    {

        /* this main is only meant to be a example*/
        //HPCCWsClient connector = new HPCCWsClient("http", "192.168.56.120","8010");

        HPCCWsSQLClient wssqlclient = new HPCCWsSQLClient("http", "192.168.56.120","8018", null, null);

        if (wssqlclient.isWsSQLReachable())
        {
            String wuid = null;
            try
            {
                wuid = wssqlclient.executeSQLWUIDResponse("select * from regress::thor_local::personindexid", "hthor", null);
                System.out.println("wuid: " + wuid);

            }
            catch (Exception e)
            {
                System.out.println("Exception while executing SQL: " + e.getLocalizedMessage());
            }

            try
            {
                wuid = wssqlclient.executeSQLWUIDResponse("select * from regress::hthor_payload::book", "hthor", null);
                System.out.println("wuid: " + wuid);

            }
            catch (Exception e)
            {
                System.out.println("Exception while executing SQL: " + e.getLocalizedMessage());
            }

            if (wuid !=  null)
            {
                try
                {
                    String resultSchema = wssqlclient.getResultSchemaXML(wuid);
                    if (resultSchema != null)
                        System.out.println(resultSchema);
                    List<List<Object>> resultSchema2 = wssqlclient.getResultSchema(wuid);
                    for (List<Object> list : resultSchema2)
                    {
                        System.out.print("[");
                        for (Object object : list)
                        {
                            System.out.print(" " + object);
                        }
                        System.out.print(" ]");
                    }
                }
                catch (Exception e)
                {
                    System.out.println("Exception while fetching results schema related to WUID: " + wuid + ": " + e.getLocalizedMessage());
                }

                try
                {
                    List<List<Object>> resutls = wssqlclient.getResutls(wuid, 0, 10);
                    for (List<Object> list : resutls)
                    {
                        for (Object object : list)
                        {
                            System.out.print("| " + object);
                        }
                        System.out.println(" |");
                    }
                }
                catch (Exception e)
                {
                    System.out.println("Exception while fetching results related to WUID: " + wuid + ": " + e.getLocalizedMessage());
                }
            }

            try
            {
                String[] targetClusters = wssqlclient.getTargetClusters(null);
                if (targetClusters != null)
                {
                    for (int i = 0; i < targetClusters.length; i++)
                    {
                        System.out.println(targetClusters[i]);
                    }
                }
            }
            catch (Exception e)
            {
                System.out.println("Exception caught while fetching Target Clusters list");
                System.out.println(e.getLocalizedMessage());
                e.printStackTrace();
            }

            try
            {
                HPCCTable[] tables = wssqlclient.getTables(null);
                for (int i = 0; i < tables.length; i++)
                {
                    HPCCTable table = tables[i];
                    //if (table.getECL().length() > 0)
                    System.out.println(table.getName() +" " + table.getECL());
                    HPCCColumn[] columns = table.getColumns();
                    for (int j = 0; j < columns.length; j++)
                    {
                        HPCCColumn column = columns[j];
                        System.out.println("\t" + column.getName() + " ("+column.getType()+")");
                    }
                }
            }
            catch ( Exception e)
            {
                System.out.println("Exception while fetching Table information");
                System.out.println(e.getLocalizedMessage());
                e.printStackTrace();
            }

            try
            {
                HPCCQuerySet[] storedProcedures = wssqlclient.getStoredProcedures(null);
                for (int i = 0; i < storedProcedures.length; i++)
                {
                    HPCCQuerySet qs = storedProcedures[i];
                    System.out.println(qs.getName());
                    QuerySetAliasMap[] querySetAliases = qs.getQuerySetAliases();
                    if (querySetAliases != null)
                    {
                        for (int j = 0; j < querySetAliases.length; j++)
                        {
                            QuerySetAliasMap qsa = querySetAliases[j];
                            System.out.println("\t Stored Procedure " + qsa.getName() + " is currently mapped to: " +qsa.getId());
                        }
                    }

                    PublishedQuery[] querySetQueries = qs.getQuerySetQueries();
                    if (querySetQueries != null)
                    {
                        for (int j = 0; j < querySetQueries.length; j++)
                        {
                            PublishedQuery pq = querySetQueries[j];
                            System.out.println("\t\t" + pq.getId());
                            QuerySignature signature = pq.getSignature();
                            HPCCColumn[] inParams = signature.getInParams();
                            if (inParams != null)
                            {
                                for (int k = 0; k < inParams.length; k++)
                                {
                                    HPCCColumn in = inParams[k];
                                    System.out.println("\t\t\t" + in.getName() + " (" + in.getType() + ")");
                                }
                            }
                            OutputDataset[] resultSets = signature.getResultSets();
                            OutputDataset resultset = resultSets[0];
                            HPCCColumn[] outParams = resultset.getOutParams();
                            for (int k = 0; k < outParams.length; k++)
                            {
                                HPCCColumn out = outParams[k];
                                System.out.println("\t\t\t" + out.getName() + " (" + out.getType() + ")");
                            }
                        }
                    }
                }
            }
            catch (Exception e)
            {
                System.out.println("Exception while fetching Stored Procedure information");
                System.out.println(e.getLocalizedMessage());
                e.printStackTrace();
            }
        }
        else
        {
            WssqlServiceSoapProxy soapProxy;
            try
            {
                soapProxy = wssqlclient.getSoapProxy();
                String endpoint = soapProxy.getEndpoint();

                System.out.println("WsSQL Could not be reached, please verify your connectivity settings:" + endpoint);
            }
            catch (Exception e)
            {
                System.out.println("WsSQL Could not be reached, please verify your connectivity settings");
            }

        }
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

        if (!(aThat instanceof HPCCWsSQLClient))
        {
            return false;
        }

        HPCCWsSQLClient that = (HPCCWsSQLClient) aThat;
        WssqlServiceSoapProxy thatSoapProxy;
        try
        {
            thatSoapProxy = that.getSoapProxy();
        }
        catch(Exception e)
        {
            thatSoapProxy = null;
        }

        return EqualsUtil.areEqual(wsSqlServiceSoapProxy.getEndpoint(), thatSoapProxy.getEndpoint()) &&
               EqualsUtil.areEqual(((Stub) wsSqlServiceSoapProxy.getWssqlServiceSoap()).getUsername(), ((Stub) thatSoapProxy.getWssqlServiceSoap()).getUsername()) &&
               EqualsUtil.areEqual(((Stub) wsSqlServiceSoapProxy.getWssqlServiceSoap()).getPassword(), ((Stub) thatSoapProxy.getWssqlServiceSoap()).getPassword());
    }

    @Override
    public int hashCode()
    {
        int result = HashCodeUtil.SEED;
        result = HashCodeUtil.hash(result, wsSqlServiceSoapProxy.getEndpoint());
        result = HashCodeUtil.hash(result, ((Stub) wsSqlServiceSoapProxy.getWssqlServiceSoap()).getUsername());
        result = HashCodeUtil.hash(result, ((Stub) wsSqlServiceSoapProxy.getWssqlServiceSoap()).getPassword());
        return result;
    }
}

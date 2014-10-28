package org.hpccsystems.ws.client;

import java.rmi.RemoteException;
import java.util.List;

import org.apache.axis.client.Stub;
import org.hpccsystems.ws.client.soap.wssql.ArrayOfEspException;
import org.hpccsystems.ws.client.soap.wssql.ECLWorkunit;
import org.hpccsystems.ws.client.soap.wssql.EchoRequest;
import org.hpccsystems.ws.client.soap.wssql.EchoResponse;
import org.hpccsystems.ws.client.soap.wssql.EspException;
import org.hpccsystems.ws.client.soap.wssql.ExecutePreparedSQLRequest;
import org.hpccsystems.ws.client.soap.wssql.ExecutePreparedSQLResponse;
import org.hpccsystems.ws.client.soap.wssql.ExecuteSQLRequest;
import org.hpccsystems.ws.client.soap.wssql.ExecuteSQLResponse;
import org.hpccsystems.ws.client.soap.wssql.GetDBMetaDataRequest;
import org.hpccsystems.ws.client.soap.wssql.GetDBMetaDataResponse;
import org.hpccsystems.ws.client.soap.wssql.GetDBSystemInfoRequest;
import org.hpccsystems.ws.client.soap.wssql.GetDBSystemInfoResponse;
import org.hpccsystems.ws.client.soap.wssql.GetResultsRequest;
import org.hpccsystems.ws.client.soap.wssql.GetResultsResponse;
import org.hpccsystems.ws.client.soap.wssql.HPCCColumn;
import org.hpccsystems.ws.client.soap.wssql.HPCCQuerySet;
import org.hpccsystems.ws.client.soap.wssql.HPCCTable;
import org.hpccsystems.ws.client.soap.wssql.NamedValue;
import org.hpccsystems.ws.client.soap.wssql.OutputDataset;
import org.hpccsystems.ws.client.soap.wssql.PrepareSQLRequest;
import org.hpccsystems.ws.client.soap.wssql.PrepareSQLResponse;
import org.hpccsystems.ws.client.soap.wssql.PublishedQuery;
import org.hpccsystems.ws.client.soap.wssql.QuerySetAliasMap;
import org.hpccsystems.ws.client.soap.wssql.QuerySignature;
import org.hpccsystems.ws.client.soap.wssql.WssqlServiceSoap;
import org.hpccsystems.ws.client.soap.wssql.WssqlServiceSoapProxy;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.utils.Utils;


/**
 * Use as soap client for HPCC WsSQL web service.
 *
 */
public class HPCCWsSQLClient
{
    public static final String     WSSQLURI              = "/WsSQL";
    private WssqlServiceSoapProxy  wsSqlServiceSoapProxy = null;
    private boolean                verbose               = false;
    private Version                version               = null;
    private static final int       DEFAULT_RESULT_LIMIT  = 100;
    private static final String    PINGSTATEMENT         = "HPCCWsSQLClient Greets you."; 

    private class Version
    {
        private final String           systemName;
        private final String           fullVersion;
        private final String           major;
        private final String           minor;
        private final String           point;
        private final String           project;
        private final String           maturity;
        
        public Version(String sysname, String fullver, String major, String minor, String point, String project, String maturity)
        {
            this.systemName = sysname;
            this.fullVersion = fullver;
            this.major = major;
            this.minor = minor;
            this.point = point;
            this.project = project;
            this.maturity = maturity;
        }

        public String getSystemName()
        {
            return systemName;
        }

        public String getFullVersion()
        {
            return fullVersion;
        }

        public String getMajor()
        {
            return major;
        }

        public String getMinor()
        {
            return minor;
        }

        public String getPoint()
        {
            return point;
        }

        public String getProject()
        {
            return project;
        }

        public String getMaturity()
        {
            return maturity;
        }
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
        return (new org.hpccsystems.ws.client.soap.wssql.WssqlLocator()).getwssqlServiceSoapAddress();
    }

    /**
     * @param wsDfuServiceSoapProxy
     */
    public HPCCWsSQLClient(WssqlServiceSoapProxy wsSqlServiceSoapProxy)
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

    /**
     * @param protocol - http or https
     * @param targetHost - server IP/name of the HPCC Cluster
     * @param targetPort - port of the HPCC Cluster
     * @param user - username to use when connecting to the HPCC Cluster
     * @param pass - Password to use when connecting to the HPCC Cluster
     */
    public HPCCWsSQLClient(String protocol, String targetHost, String targetPort, String user, String pass)
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
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }

        return tablesList;
    }

    public HPCCQuerySet[] getStoredProcedures(String filter) throws Exception
    {
        WssqlServiceSoapProxy soapProxy = getSoapProxy();

        HPCCQuerySet[] querysets = null;
        try
        {
            GetDBMetaDataRequest getDBMetaDataRequest = new GetDBMetaDataRequest();

            getDBMetaDataRequest.setIncludeStoredProcedures(true);
            if (filter != null)
                getDBMetaDataRequest.setClusterType(filter);

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
        synchronized (version)
        {
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
                        version = new Version(dbSystemInfo.getName(), dbSystemInfo.getFullVersion(), dbSystemInfo.getMajor(), dbSystemInfo.getMinor(), dbSystemInfo.getPoint(), dbSystemInfo.getProject(), dbSystemInfo.getMaturity());
                        if (version != null)
                            success = true;
                    }
                }
                catch (RemoteException e)
                {
                    System.out.println("Error fetching HPCC System info.");
                }
            }
        }
        return success;
    }

    public String executeSQL(String sqlText, String targetClusterorQuerySet) throws Exception
    {
        return executeSQL(sqlText, targetClusterorQuerySet, DEFAULT_RESULT_LIMIT, null /*resultWindowCount*/, null /*resultWindowStart*/, null /*suppressResults*/, true /*Boolean suppressXmlSchema*/, null /*String userName*/, null /*Integer wait*/).getWuid();
    }

    public ECLWorkunit executeSQL(String sqlText, String targetClusterorQuerySet, Integer resultLimit, Integer resultWindowCount, Integer resultWindowStart, Boolean suppressResults, Boolean suppressXmlSchema, String userName, Integer wait) throws Exception
    {
        WssqlServiceSoapProxy soapProxy = getSoapProxy();
        
        ExecuteSQLRequest executeSQLRequest = new ExecuteSQLRequest();
        executeSQLRequest.setResultLimit(resultLimit);
        executeSQLRequest.setResultWindowCount(resultWindowCount);
        executeSQLRequest.setResultWindowStart(resultWindowStart);
        executeSQLRequest.setSqlText(sqlText);
        executeSQLRequest.setSuppressResults(suppressResults);
        executeSQLRequest.setSuppressXmlSchema(suppressXmlSchema);
        executeSQLRequest.setTargetCluster(targetClusterorQuerySet);
        executeSQLRequest.setTargetQuerySet(targetClusterorQuerySet);
        executeSQLRequest.setUserName(userName);
        executeSQLRequest.setWait(wait);
        
        ExecuteSQLResponse executeSQL = soapProxy.executeSQL(executeSQLRequest);
        if (executeSQL != null)
        {
            handleExceptions(executeSQL.getExceptions());
            
            return executeSQL.getWorkunit();
        }
        
        return null;
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
            handleExceptions(results.getExceptions());
            
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

    public ECLWorkunit prepareSQL(String sqlText, String targetClusterorQuerySet, Integer wait) throws Exception
    {
        WssqlServiceSoapProxy soapProxy = getSoapProxy();

        PrepareSQLRequest prepareSQLRequest = new PrepareSQLRequest();
        prepareSQLRequest.setSqlText(sqlText);
        prepareSQLRequest.setTargetCluster(targetClusterorQuerySet);
        prepareSQLRequest.setTargetQuerySet(targetClusterorQuerySet);
        prepareSQLRequest.setWait(wait);

        PrepareSQLResponse prepareSQL = soapProxy.prepareSQL(prepareSQLRequest);
        if (prepareSQL != null)
        {
            handleExceptions(prepareSQL.getExceptions());
            
            return prepareSQL.getWorkunit();
        }
        
        return null;
    }

    public ECLWorkunit executePreparedSQL(String wuid, String targetClusterorQuerySet, NamedValue[] variables, Integer wait, Integer resultLimit, String userName) throws Exception
    {
        return executePreparedSQL(wuid, targetClusterorQuerySet, variables, wait, resultLimit, null, null, userName, true, true).getWorkunit();
    }

    public List<List<Object>> executePreparedSQL(String wuid, String targetClusterorQuerySet, NamedValue[] variables, Integer wait, Integer resultLimit, String userName, String somesing) throws Exception
    {
        ExecutePreparedSQLResponse executePreparedSQL = executePreparedSQL(wuid, targetClusterorQuerySet, variables, wait, resultLimit, null, null, userName, true, true);
        String result = executePreparedSQL.getResult();
        return Utils.parseECLResults(result);
    }

    public ExecutePreparedSQLResponse executePreparedSQL(String wuid, String targetClusterorQuerySet, NamedValue[] variables, Integer wait, Integer resultLimit, Integer resultWindowStart, Integer resultWindowCount, String userName, Boolean suppressXmlSchema, Boolean suppressResults) throws Exception
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
        executePreparedSQLRequest.setTargetCluster(targetClusterorQuerySet);
        executePreparedSQLRequest.setTargetCluster(targetClusterorQuerySet);
        executePreparedSQLRequest.setUserName(userName);
        executePreparedSQLRequest.setWait(wait);

        ExecutePreparedSQLResponse executePreparedSQL = soapProxy.executePreparedSQL(executePreparedSQLRequest);
        if (executePreparedSQL != null)
        {
            handleExceptions(executePreparedSQL.getExceptions());
            return executePreparedSQL;
        }

        return null;
    }

    private void handleExceptions(ArrayOfEspException exp) throws Exception
    {
        if (exp != null && exp.getException() != null && exp.getException().length > 0)
        {
            for (int i = 0; i < exp.getException().length; i++)
            {
                EspException ex = exp.getException()[i];
                Utils.println(System.out, ex.getMessage(), true, verbose);
            }
            throw new Exception(exp);
        }
    }

    public static void main (String[] args)
    {

        /* this main is only meant to be a example*/
        //HPCCWSClient connector = new HPCCWSClient("http", "192.168.56.120","8010");
        
        HPCCWsSQLClient wssqlclient = new HPCCWsSQLClient("http", "192.168.56.120","8018", null, null);

        if (wssqlclient.isWsSQLReachable())
        {
            String wuid = null;
            try
            {
                wuid = wssqlclient.executeSQL("select * from regress::thor_local::personindexid", "hthor");
                System.out.println("wuid: " + wuid);
                
            }
            catch (Exception e)
            {
                System.out.println("Exception while executing SQL: " + e.getLocalizedMessage());
            }

            try
            {
                wuid = wssqlclient.executeSQL("select * from regress::hthor_payload::book", "hthor");
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
        
//        public HPCCWsSQLClient(String protocol, String targetHost, String targetPort, String user, String pass)

        
    }
}

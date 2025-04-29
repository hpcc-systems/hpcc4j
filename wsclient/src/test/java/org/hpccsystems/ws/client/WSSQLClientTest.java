/*##############################################################################

    HPCC SYSTEMS software Copyright (C) 2019 HPCC Systems®.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
############################################################################## */

package org.hpccsystems.ws.client;

import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeNotNull;

import java.util.List;

import org.apache.axis2.AxisFault;
import org.hpccsystems.ws.client.platform.Version;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wssql.ECLWorkunitWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wssql.ExecuteSQLResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wssql.HPCCColumnWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wssql.HPCCQuerySetWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wssql.HPCCTableWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wssql.NamedValueWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wssql.OutputDatasetWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wssql.PublishedQueryWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wssql.QuerySetAliasMapWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wssql.QuerySetAliases_type0Wrapper;
import org.hpccsystems.ws.client.wrappers.gen.wssql.QuerySetQueries_type0Wrapper;
import org.hpccsystems.ws.client.wrappers.gen.wssql.QuerySignatureWrapper;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import io.opentelemetry.instrumentation.annotations.WithSpan;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WSSQLClientTest extends BaseRemoteTest
{
    private final static HPCCWsSQLClient client;
    private final static String testwuid = System.getProperty("targetwuid");
    private final static String wssqlport = System.getProperty("wssqlport", "8510");
    private final static String wsSqlConnStr = System.getProperty("wssqlconn", "");

    private static String validClusterName = null;

    static
    {
        Connection wssqlconn = null;
        if (wsSqlConnStr.isEmpty())
        {
            wssqlconn = new Connection(connection.getProtocol(), connection.getHost(), wssqlport);
        }
        else
        {
            try
            {
                wssqlconn = new Connection(wsSqlConnStr);
            }
            catch (Exception e)
            {
                System.out.println("Invalid WsSQL connection string: " + wsSqlConnStr + " defaulting to eclwatch host.");
                wssqlconn = new Connection(connection.getProtocol(), connection.getHost(), wssqlport);
            }
        }

        Assert.assertNotNull(wssqlconn);
        wssqlconn.setCredentials(connection.getUserName(), connection.getPassword());

        client = HPCCWsSQLClient.get(wssqlconn);
        Assert.assertNotNull(client);

        if (System.getProperty("targetwuid") == null)
            System.out.println("No targetwuid provided");

        if (System.getProperty("wssqlport") == null)
            System.out.println("No wssqlport specified - defaulting to 8510");
    }

    //expected to throw since wssql does not usually bind on wseclwatch port
    @Test (expected = Exception.class)
    public void getContainerizedModeTest() throws Exception
    {
        System.out.println("Fetching isTargetHPCCContainerized...");
        client.isTargetHPCCContainerized();
    }

    @Test
    public void ping() throws Exception
    {
        try
        {
            Assert.assertTrue(client.ping());
        }
        catch (AxisFault e)
        {
            e.printStackTrace();
            Assert.fail("Could not ping wssql");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    @WithSpan
    public void AAA2testGetTables() throws Exception
    {
        try
        {
            HPCCTableWrapper[] tables = client.getTables("*");
            Assert.assertNotNull(tables);
            Assert.assertTrue(tables.length > 0);
            for (int i = 0; i < tables.length; i++)
            {
                System.out.println(tables[i].getName());
            }
        }
        catch (AxisFault e)
        {
            e.printStackTrace();
            Assert.fail();
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail(e.toString());
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    @WithSpan
    public void AAA1testGetClusters() throws Exception
    {
        try
        {
            String[] clusters = client.getTargetClusters("*");
            Assert.assertNotNull(clusters);
            for (int i = 0; i < clusters.length; i++)
            {
                if (validClusterName == null || validClusterName.isEmpty())
                    validClusterName = clusters[i];

                System.out.println(clusters[i]);
            }
        }
        catch (AxisFault e)
        {
            e.printStackTrace();
            Assert.fail();
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail(e.toString());
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    @WithSpan
    public void testInvalidGetTables() throws Exception
    {
        try
        {
            HPCCTableWrapper[] tables = client.getTables("XYZ");
            Assert.assertEquals(0, tables.length);
        }
        catch (AxisFault e)
        {
            e.printStackTrace();
            Assert.fail();
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail(e.toString());
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    @WithSpan
    public void testGetDBVersion() throws Exception
    {
        try
        {
            Version version = client.getVersion();
            Assert.assertNotNull(version);
            Assert.assertNotEquals(0, version.getMajor());
            System.out.println(version.toString());
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    @WithSpan
    public void testGetStoreProcs() throws Exception
    {
        try
        {
            HPCCQuerySetWrapper[] storedProcedures = client.getStoredProcedures("");//"*"??
            Assert.assertNotNull(storedProcedures);

            for (int i = 0; i < storedProcedures.length; i++)
            {
                HPCCQuerySetWrapper queryset = storedProcedures[i];
                String qsname  = queryset.getName();

                QuerySetAliases_type0Wrapper arrayofqsaliases = queryset.getQuerySetAliases();

                List<QuerySetAliasMapWrapper> querySetAliases = arrayofqsaliases != null ? arrayofqsaliases.getQuerySetAlias() : null;
                if (querySetAliases != null)
                {
                    for (QuerySetAliasMapWrapper querySetAliasMapWrapper : querySetAliases)
                    {
                        String qsaliasid = querySetAliasMapWrapper.getId();
                        String qsaliasname = querySetAliasMapWrapper.getName();
                    }
                }

                QuerySetQueries_type0Wrapper arrayofqsqueries = queryset.getQuerySetQueries();
                List<PublishedQueryWrapper> querySetQueries = arrayofqsqueries != null ? arrayofqsqueries.getQuerySetQuery() : null;
                if (querySetQueries != null)
                {
                    for (PublishedQueryWrapper publishedQueryWrapper : querySetQueries)
                    {
                        String id = publishedQueryWrapper.getId();
                        String qname = publishedQueryWrapper.getName();
                        QuerySignatureWrapper querySignature = publishedQueryWrapper.getSignature();
                        List<HPCCColumnWrapper> inParams = querySignature.getInParams().getInParam();
                        List<OutputDatasetWrapper> resultSets = querySignature.getResultSets().getResultSet();
                        List<HPCCColumnWrapper> outParams = resultSets.get(0).getOutParams().getOutParam();
                    }
                }
            }
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail(e.toString());
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    private void getSchema(String wuid)
    {
        assumeNotNull(wuid);
        assumeFalse(wuid.isEmpty());

        System.out.println("Seeking result schema for wuid: " + wuid);
        try
        {
            String resultSchema = client.getResultSchemaXML(wuid);
            Assert.assertNotNull (resultSchema);
            System.out.println(resultSchema);

            List<List<Object>> resultSchema2 = client.getResultSchema(wuid);
            Assert.assertNotNull (resultSchema2);

            for (List<Object> list : resultSchema2)
            {
                System.out.print("[");
                for (int i = 0; i < 2; i++)
                {
                    Object object = list.get(i);
                    System.out.print(" " + object);
                }
                System.out.print(" ]");
            }
        }
        catch (Exception e)
        {
            System.out.println("Exception while fetching results schema related to WUID: " + wuid + ": " + e.getLocalizedMessage());
        }
    }

    private void getResults(String wuid)
    {
        assumeNotNull(wuid);
        assumeFalse(wuid.isEmpty());

        System.out.println("Seeking result schema for wuid: " + wuid);
        try
        {
            List<List<Object>> resutls = client.getResults(wuid, 0, 10);
            Assert.assertNotNull (resutls);
            for (List<Object> list : resutls)
            {
                for (Object object : list)
                {
                    System.out.print("| " + object);
                }
                System.out.println(" |");
            }
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            e.toString();
            Assert.fail();
        }
        catch (Exception e)
        {
            System.out.println("Exception while fetching results related to WUID: " + wuid + ": " + e.getLocalizedMessage());
        }
    }

    @Test
    @WithSpan
    public void testSQLExecution() throws Exception
    {
        assumeNotNull("Cannot test sql execution - could not find any clusters", validClusterName);
        assumeFalse(validClusterName.isEmpty());

        System.out.println("executing: Select * from benchmark::integer::20kb");
        String sql = "Select * from benchmark::integer::20kb";

        ExecuteSQLResponseWrapper resp = client.executeSQLFullResponse(sql, validClusterName, "", 10, 10, 0, false, false, "WsClient-JUnit", -1);

        Assert.assertNotNull(resp);

        Assert.assertNotNull(resp.getWorkunit());

        String result = resp.getResult();
        Assert.assertNotNull(result);
        System.out.println(result);
    }

    @Test
    @WithSpan
    public void executeSQLWUIDResponseTest() throws Exception
    {
        assumeNotNull("Cannot test sql execution - could not find any clusters", validClusterName);
        assumeFalse(validClusterName.isEmpty());

        String sql = "Select * from benchmark::string::100MB as mytable ";

        System.out.println("Executing: " + sql + "; on Cluster: " + validClusterName);

        String wuid = client.executeSQLWUIDResponse(sql, validClusterName, "");
        System.out.println("Resulting WUID: " + wuid);

        getResults(wuid);
        getSchema(wuid);
    }

    @Test
    @WithSpan
    public void executeSQLWUResponseTest() throws Exception
    {
        assumeNotNull("Cannot test sql execution - could not find any clusters", validClusterName);
        assumeFalse(validClusterName.isEmpty());

        String sql = "Select * from benchmark::string::100MB as mytable ";

        System.out.println("Executing: " + sql + "; on Cluster: " + validClusterName);

        ECLWorkunitWrapper executeSQLWUResponse = client.executeSQLWUResponse(sql, validClusterName, null, 10, 10, null, false, true, null, null);
        Assert.assertNotNull(executeSQLWUResponse);

        System.out.println("Result count: " + executeSQLWUResponse.getResultCount());
    }

    @Test
    @WithSpan
    public void executeSQLFullResponseTest() throws Exception
    {
        assumeNotNull("Cannot test sql execution - could not find any clusters", validClusterName);
        assumeFalse(validClusterName.isEmpty());

        String sql = "Select * from benchmark::string::100MB as mytable ";

        System.out.println("Executing: " + sql + "; on Cluster: " + validClusterName);

        ExecuteSQLResponseWrapper executeSQLFullResponse = client.executeSQLFullResponse(sql, validClusterName, null, 10, 10, null, false, true, null, null);
        Assert.assertNotNull(executeSQLFullResponse);
    }

    @Test
    @WithSpan
    public void preparedSQLTest() throws Exception
    {
        assumeNotNull("Cannot test sql execution - could not find any clusters", validClusterName);
        assumeFalse(validClusterName.isEmpty());

        String filtercolumnname = "fill";
        String sql = "Select * from benchmark::string::100MB as mytable  where mytable." + filtercolumnname + " != ?";
        System.out.println("Preparing sql: " + sql + "on cluster: " + validClusterName);

        ECLWorkunitWrapper prepareSQLresult = client.prepareSQL(sql, validClusterName, null, null);
        Assert.assertNotNull(prepareSQLresult);

        NamedValueWrapper [] arrayofvariables = new NamedValueWrapper[1];

        NamedValueWrapper namedValue = new NamedValueWrapper();
        namedValue.setName("var1");
        namedValue.setValue("1");

        arrayofvariables[0] = namedValue;

        System.out.println("Executing prepared sql with param: " + namedValue.getName() + " : " + namedValue.getValue() + " on cluster: " + validClusterName);
        client.executePreparedSQL(prepareSQLresult.getWuid(), prepareSQLresult.getCluster(), arrayofvariables, -1, 10, 0, 10, "WsClient", true, false);
    }
}

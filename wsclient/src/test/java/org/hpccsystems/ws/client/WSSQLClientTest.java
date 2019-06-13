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

import java.util.List;

import org.apache.axis2.AxisFault;
import org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ArrayOfNamedValue;
import org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ECLWorkunit;
import org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ExecuteSQLResponse;
import org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.HPCCColumn;
import org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.HPCCQuerySet;
import org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.HPCCTable;
import org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.NamedValue;
import org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.OutputDataset;
import org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.PublishedQuery;
import org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.QuerySetAliasMap;
import org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.QuerySetAliases_type0;
import org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.QuerySetQueries_type0;
import org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.QuerySignature;
import org.hpccsystems.ws.client.platform.Version;
import org.hpccsystems.ws.client.platform.test.BaseRemoteTest;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.wrappers.gen.wssql.ECLWorkunitWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wssql.ExecuteSQLResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wssql.HPCCColumnWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wssql.HPCCQuerySetWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wssql.HPCCTableWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wssql.OutputDatasetWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wssql.PublishedQueryWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wssql.QuerySetAliasMapWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wssql.QuerySetAliases_type0Wrapper;
import org.hpccsystems.ws.client.wrappers.gen.wssql.QuerySetQueries_type0Wrapper;
import org.hpccsystems.ws.client.wrappers.gen.wssql.QuerySignatureWrapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WSSQLClientTest extends BaseRemoteTest
{

    HPCCWsSQLClient client;
    String testwuid = System.getProperty("targetwuid");
    String wssqlport = System.getProperty("wssqlport");

    String randomtablename = null;
    String randomclustername = null;

    @Before
    public void setup() throws Exception
    {
        super.setup();

        if (wssqlport == null || wssqlport.isEmpty())
        {
            System.out.println("No wssqlport specified - defaulting to 8510");
            wssqlport = "8510";
        }

        Connection wssqlconn = new Connection(connection.getProtocol(), connection.getHost(), wssqlport);
        Assert.assertNotNull(wssqlconn);
        wssqlconn.setCredentials(connection.getUserName(), connection.getPassword());

        client = HPCCWsSQLClient.get(wssqlconn);
        Assert.assertNotNull(client);
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
            Assert.fail();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetTables() throws Exception
    {
        try
        {
            HPCCTableWrapper[] tables = client.getTables("*");
            Assert.assertNotNull(tables);
            for (int i = 0; i < tables.length; i++)
            {
                if (randomtablename == null || randomtablename.isEmpty())
                    randomtablename = tables[i].getName();

                System.out.println(tables[i].getName());
            }
        }
        catch (AxisFault e)
        {
            e.printStackTrace();
            Assert.fail();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetClusters() throws Exception
    {
        try
        {
            String[] clusters = client.getTargetClusters("*");
            Assert.assertNotNull(clusters);
            for (int i = 0; i < clusters.length; i++)
            {
                if (randomclustername == null || randomclustername.isEmpty())
                    randomclustername = clusters[i];

                System.out.println(clusters[i]);
            }
        }
        catch (AxisFault e)
        {
            e.printStackTrace();
            Assert.fail();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testInvalidGetTables() throws Exception
    {
        try
        {
            HPCCTableWrapper[] tables = client.getTables("XYZ");
            Assert.assertNull(tables);
        }
        catch (AxisFault e)
        {
            e.printStackTrace();
            Assert.fail();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetDBVersion() throws Exception
    {
        try
        {
            Version version = client.getVersion();
            Assert.assertNotNull(version);
            Assert.assertNotEquals(0, version.major);
            System.out.println(version.toString());
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
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
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testSQLExecution() throws Exception
    {
        try
        {
            testGetTables();

            if (randomtablename == null || randomtablename.isEmpty())
                Assert.fail("Cannot test sql execution - could not find any tables");

            testGetClusters();

            if (randomclustername == null || randomclustername.isEmpty())
                Assert.fail("Cannot test sql execution - could not find any clusters");


            String sql = "Select * from " + "benchmark::integer::20kb";

            ExecuteSQLResponseWrapper resp = client.executeSQLFullResponse(sql, randomclustername, "", 100, 100, 0, false, false, "WsClient-JUnit", -1);
            Assert.assertNotNull(resp);
            String parentWUID = resp.getParentWuId();
            String result = resp.getResult();
            System.out.println(result);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void fullTest() throws Exception
    {
        try
        {
            testGetTables();

            if (randomtablename == null || randomtablename.isEmpty())
                Assert.fail("Cannot test sql execution - could not find any tables");

            testGetClusters();

            if (randomclustername == null || randomclustername.isEmpty())
                Assert.fail("Cannot test sql execution - could not find any clusters");


            String sql = "Select * from " + "benchmark::integer::20kb as mytable ";

            String wuid = null;
            try
            {
                wuid = client.executeSQLWUIDResponse(sql, randomclustername, "");
            }
            catch (Exception e)
            {
                System.out.println("Exception while executing SQL: " + e.getLocalizedMessage());
            }


            Assert.assertNotNull(wuid);
            {
                String filtercolumnname = null;
                int filtercolumntype = -1;
                System.out.println("wuid: " + wuid);
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
                            if (i == 0 && filtercolumnname == null)
                            {
                                filtercolumnname = object.toString();
                            }
                            if (i == 1 && filtercolumntype == -1)
                            {
                                filtercolumntype = Integer.valueOf(object.toString());
                            }
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
                catch (Exception e)
                {
                    System.out.println("Exception while fetching results related to WUID: " + wuid + ": " + e.getLocalizedMessage());
                }

                Assert.assertNotNull(filtercolumnname);
                String filter1 = sql + " where mytable." + filtercolumnname + " != ?";// filtercolumntype == 1 ? "";

                ECLWorkunitWrapper prepareSQLresult = client.prepareSQL(filter1, randomclustername, null, null);
                Assert.assertNotNull(prepareSQLresult);

                ArrayOfNamedValue arrayofvariables = new ArrayOfNamedValue();

                NamedValue namedValue = new NamedValue();
                namedValue.setName("var1");
                namedValue.setValue("1");

                NamedValue[] param = new NamedValue[]{namedValue};
                arrayofvariables.setNamedValue(param);

                client.executePreparedSQL(prepareSQLresult.getWuid(), prepareSQLresult.getCluster(), arrayofvariables.getNamedValue(), -1, 10, 0, 10, "WsClient", true, false);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }
}

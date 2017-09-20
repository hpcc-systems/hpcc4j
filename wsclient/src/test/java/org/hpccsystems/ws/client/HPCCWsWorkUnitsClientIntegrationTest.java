package org.hpccsystems.ws.client;

import java.util.List;

import org.hpccsystems.ws.client.platform.Platform;
import org.hpccsystems.ws.client.platform.QueryResult;
import org.hpccsystems.ws.client.platform.QuerySetFilterType;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(IntegrationTest.class)
public class HPCCWsWorkUnitsClientIntegrationTest {

    Platform platform;
    HPCCWsClient client1;
    HPCCWsWorkUnitsClient client;
    
    @Before
    public void setup() throws Exception
    {
        platform= Platform.get("http", "server_ip", 8010, "dleed", "");
        try 
        {
            client1 = platform.checkOutHPCCWsClient();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        client=client1.getWsWorkunitsClient();
    }
    
    @Test
    public void testSearchQueries() throws Exception
    {
        List<QueryResult> resultsArray= client.searchQueries(null, null, "roxie", "roxie");
        if (resultsArray==null || resultsArray.size()==0)
        {
            Assert.fail("Should have returned queries");
        }
        System.out.println(resultsArray.get(0).toString());
        String queryid=resultsArray.get(0).getId();
        String queryname=resultsArray.get(0).getName();
        List<QueryResult> resultsArr2=client.searchQueries(QuerySetFilterType.Name, queryname, "roxie","roxie");
        if (resultsArr2==null || resultsArr2.size() != 1)
        {
            Assert.fail("Should have returned one query for query named " + queryname);
        }
        List<QueryResult> resultsArr3=client.searchQueries(QuerySetFilterType.Id, queryid, "roxie","roxie");
        if (resultsArr3==null || resultsArr3.size() != 1)
        {
            Assert.fail("Should have returned one query for query with id " + queryid);
        }
        
    }
    @After
    public void shutdown() 
    {
        if (platform != null && client != null)
        {
            try 
            {
                platform.checkInHPCCWsClient(client1);
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        }
        
    }
}


package org.hpccsystems.ws.client;

import java.util.List;

import org.hpccsystems.ws.client.platform.Platform;
import org.hpccsystems.ws.client.platform.WUQueryInfo;
import org.hpccsystems.ws.client.platform.WUQueryInfo.SortBy;
import org.hpccsystems.ws.client.wrappers.ApplicationValueWrapper;
import org.hpccsystems.ws.client.platform.WorkunitInfo;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(IntegrationTest.class)
public class WUQueryTest {
    
    Platform platform;
    HPCCWsClient client1;
    HPCCWsWorkUnitsClient client;
    
    @Before
    public void setup() {
        platform= Platform.get("http", "localhost", 8010, "user", "pass");
        try {
        client1 = platform.checkOutHPCCWsClient();
        } catch (Exception e) {
            e.printStackTrace();
        }
        client=client1.getWsWorkunitsClient();
    }
    
    @Test
    public void testGetWorkunitByAppName() throws Exception
    {
        client.createWorkunit();
        WorkunitInfo wu=new WorkunitInfo();
        wu.setECL("OUTPUT('1');");
        wu.setCluster("thor");
        wu.setJobname("testGetWorkunitByAppName");
        wu.setOwner("user");
        ApplicationValueWrapper av=new ApplicationValueWrapper("HIPIE","testkey","testvalue");
        wu.getApplicationValues().add(av);
        wu=client.compileWUFromECL(wu);
        wu=client.runWorkunit(wu.getWuid(),null,null,null,false,null);
        
        WUQueryInfo info=new WUQueryInfo().setSortBy(SortBy.WUID).setDescending(true);
        info.getApplicationValues().add(av);
        List<WorkunitInfo> searchresults=client.getWorkunits(info);
        if (searchresults.size()==0)
        {
            Assert.fail("search for app val failed");
        }
        if (!searchresults.get(0).getWuid().equals(wu.getWuid())) {
            Assert.fail("First returned workunit " + searchresults.get(0).getWuid() + " wasn't wuid " + wu.getWuid() );
        }
    }
    @Test
    public void testGetWorkunitSort() throws Exception {

        //wuid descending
        List<WorkunitInfo> result=client.getWorkunits(new WUQueryInfo().setSortBy(SortBy.WUID).setDescending(true));
        if (result.get(0).getWuid().compareTo(result.get(1).getWuid())<0) {
            Assert.fail("descending workunits in wrong order:" + result.get(0).getWuid() + " then " + result.get(1).getWuid());
        }
        //wuid ascending
        result=client.getWorkunits(new WUQueryInfo().setSortBy(SortBy.WUID).setDescending(false));
        if (result.get(1).getWuid().compareTo(result.get(0).getWuid())<0) {
            Assert.fail("ascending workunits in wrong order:" + result.get(0).getWuid() + " then " + result.get(1).getWuid());
        }
        
      //cluster descending
        result=client.getWorkunits(new WUQueryInfo().setSortBy(SortBy.Cluster).setDescending(true));
        if (result.get(0).getCluster().compareTo(result.get(result.size()-1).getCluster())<0) {
            Assert.fail("descending clusters in wrong order:" + result.get(0).getCluster() + " then " 
                    + result.get(result.size()-1).getCluster());
        }
        //cluster ascending
        result=client.getWorkunits(new WUQueryInfo().setSortBy(SortBy.Cluster).setDescending(false));
        if (result.get(1).getCluster().compareTo(result.get(0).getCluster())<0) {
            Assert.fail("ascending clusters in wrong order:" + result.get(0).getCluster() + " then " 
                    + result.get(result.size()-1).getCluster());
        }
        
        //jobname descending
        result=client.getWorkunits(new WUQueryInfo().setSortBy(SortBy.Jobname).setDescending(true));
        if (result.get(0).getJobname().compareTo(result.get(result.size()-1).getJobname())<0) {
            Assert.fail("descending jobname in wrong order:" + result.get(0).getJobname() + " then " 
                    + result.get(result.size()-1).getJobname());
        }
        //jobname ascending
        result=client.getWorkunits(new WUQueryInfo().setSortBy(SortBy.Jobname).setDescending(false));
        if (result.get(1).getJobname().compareTo(result.get(0).getJobname())<0) {
            Assert.fail("ascending jobname in wrong order:" + result.get(0).getJobname() + " then " 
                    + result.get(result.size()-1).getJobname());
        }

        //owner descending
        result=client.getWorkunits(new WUQueryInfo().setSortBy(SortBy.Owner).setDescending(true));
        if (result.get(0).getOwner().compareTo(result.get(result.size()-1).getOwner())<0) {
            Assert.fail("descending owner in wrong order:" + result.get(0).getOwner() + " then " 
                    + result.get(result.size()-1).getOwner());
        }
        //owner ascending
        result=client.getWorkunits(new WUQueryInfo().setSortBy(SortBy.Owner).setDescending(false));
        if (result.get(1).getOwner().compareTo(result.get(0).getOwner())<0) {
            Assert.fail("ascending owner in wrong order:" + result.get(0).getOwner() + " then " 
                    + result.get(result.size()-1).getOwner());
        }
        
        //state descending
        result=client.getWorkunits(new WUQueryInfo().setSortBy(SortBy.State).setDescending(true));
        if (result.get(0).getState().compareTo(result.get(result.size()-1).getState())<0) {
            Assert.fail("descending state in wrong order:" + result.get(0).getState() + " then " 
                    + result.get(result.size()-1).getState());
        }
        //state ascending
        result=client.getWorkunits(new WUQueryInfo().setSortBy(SortBy.State).setDescending(false));
        if (result.get(1).getState().compareTo(result.get(0).getState())<0) {
            Assert.fail("ascending state in wrong order:" + result.get(0).getState() + " then " 
                    + result.get(result.size()-1).getState());
        }

        
    }
    
    @After
    public void shutdown() {
        if (platform != null && client != null)
        {
            try {
            platform.checkInHPCCWsClient(client1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }
}

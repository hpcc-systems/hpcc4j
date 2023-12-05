package org.hpccsystems.ws.client;

import java.util.ArrayList;
import java.util.List;

import org.hpccsystems.ws.client.platform.Cluster;
import org.hpccsystems.ws.client.platform.QuerySetFilterType;
import org.hpccsystems.ws.client.wrappers.ApplicationValueWrapper;
import org.hpccsystems.ws.client.wrappers.ArrayOfECLExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.WUState;
import org.hpccsystems.ws.client.wrappers.wsworkunits.QueryResultWrapper;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WUQueryWrapper;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WUQueryWrapper.SortBy;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WorkunitWrapper;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Ignore
@Category(org.hpccsystems.commons.annotations.IntegrationTests.class)
public abstract class BaseWsWorkunitsClientIntegrationTest extends BaseRemoteTest
{
    HPCCWsWorkUnitsClient wswuclient;
    Cluster thorcluster;
    Cluster roxiecluster;
    Cluster hthorcluster;
    List<String> testwuids=new ArrayList<String>();
    String uniquerun="";

    protected abstract void confirmPlatform() throws Exception;
    protected abstract String getThorClusterName();
    protected abstract String getRoxieClusterName();
    protected abstract String getHthorClusterName();

    @Before
    public void setup() throws Exception
    {
        thorcluster=platform.getCluster(getThorClusterName());
        roxiecluster =platform.getCluster(getRoxieClusterName());
        hthorcluster=platform.getCluster(getHthorClusterName());

        wswuclient=wsclient.getWsWorkunitsClient();
        Assert.assertNotNull("Could not adquire wswuclient", wswuclient);
    }

    @After
    public void shutdown()
    {
        for (String wuid:testwuids)
        {
            try
            {
                System.out.println("Deleting test wuid " + wuid);
                wswuclient.deleteWU(wuid);
            }
            catch (Exception e)
            {
                System.out.println("Could not delete test wuid " + wuid + ":" + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testSearchQueries() throws Exception
    {
        List<QueryResultWrapper> resultsArray= wswuclient.searchQueries(null, null, roxiecluster.getName(), roxiecluster.getName());
        if (resultsArray==null || resultsArray.size()==0)
        {
            Assert.fail("Should have returned queries");
        }
        System.out.println(resultsArray.get(0).toString());
        String queryid=resultsArray.get(0).getId();
        String queryname=resultsArray.get(0).getName();
        List<QueryResultWrapper> resultsArr2=wswuclient.searchQueries(QuerySetFilterType.Name, queryname, roxiecluster.getName(),roxiecluster.getName());
        if (resultsArr2==null || resultsArr2.size() != 1)
        {
            Assert.fail("Should have returned one query for query named " + queryname);
        }
        List<QueryResultWrapper> resultsArr3=wswuclient.searchQueries(QuerySetFilterType.Id, queryid,roxiecluster.getName(),roxiecluster.getName());
        if (resultsArr3==null || resultsArr3.size() != 1)
        {
            Assert.fail("Should have returned one query for query with id " + queryid);
        }

    }

    protected void createTestWorkunits(String ecl,int num) throws Exception, ArrayOfEspExceptionWrapper, ArrayOfECLExceptionWrapper
    {
        this.uniquerun=String.valueOf(System.currentTimeMillis());
        for (int i=1;i <=num;i++)
        {
            WorkunitWrapper wu = new WorkunitWrapper();
            wu.setECL(ecl);
            wu.setCluster(thorcluster.getName());
            wu.setJobname("testgetworkunit-" + i + "-" + uniquerun);
            wu.setOwner("user");
            wu.getApplicationValues().add(new ApplicationValueWrapper("HIPIE","testkey","testvalue"));
            wu.getApplicationValues().add(new ApplicationValueWrapper("HIPIE","testkey2","testvalue" + i));
            wu.getApplicationValues().add(new ApplicationValueWrapper("HIPIE","uniquetestkey" + i,"uniquetestvalue" + i));

            wu=wswuclient.compileWUFromECL(wu);
            WorkunitWrapper res = wswuclient.getWUInfo(wu.getWuid());
            //6.0 has state compiled; 5.x has state completed
            if (!res.getState().equals(WUState.COMPILED.toString().toLowerCase())
                    && !res.getState().equals(WUState.COMPLETED.toString().toLowerCase()))
            {
                System.out.println(res.toString());
                Assert.fail("Workunit " + i + " didn't compile correctly");
            }
            wu=wswuclient.runWorkunit(wu.getWuid(),null,null,5000,false,null);
            WorkunitWrapper wu2 = wswuclient.getWUInfo(wu.getWuid());
            if (!wu2.getState().equals(WUState.COMPLETED.toString().toLowerCase())
                    && !wu2.getState().equals(WUState.RUNNING.toString().toLowerCase()))
            {
                System.out.println(wu2.toString());
                Assert.fail("Workunit didn't run correctly");
            }
            testwuids.add(wu.getWuid());
        }

    }
    @Test
    public void testGetWorkunitByAppValue() throws Exception, ArrayOfEspExceptionWrapper, ArrayOfECLExceptionWrapper
    {
        createTestWorkunits("OUTPUT(1);",2);
        WUQueryWrapper params = new WUQueryWrapper().setJobname("*" + uniquerun + "*");
        params.getApplicationValues().add(new ApplicationValueWrapper("HIPIE","testkey","testvalue"));
        List<WorkunitWrapper> result = wswuclient.getWorkunits(params);
        if (result.size() != 2)
        {
            System.out.println(result);
            Assert.fail("should have been two workunits with app value named testkey with value testvalue");
        }
        params.getApplicationValues().add(new ApplicationValueWrapper("HIPIE","testkey2","testvalue1"));
        result=wswuclient.getWorkunits(params);
        if (result.size() != 1)
        {
            System.out.println(result);
            Assert.fail("should have been one workunits with app value named testkey with value testvalue and "
                    + "app value named testkey2 with testvalue1");
        }
    }

    @Test
    public void testGetWorkunitSort() throws Exception {

        //wuid descending
        List<WorkunitWrapper> result = wswuclient.getWorkunits(new WUQueryWrapper().setSortBy(SortBy.WUID).setDescending(true));
        if (result.get(0).getWuid().compareTo(result.get(1).getWuid())<0) {
            Assert.fail("descending workunits in wrong order:" + result.get(0).getWuid() + " then " + result.get(1).getWuid());
        }
        //wuid ascending
        result=wswuclient.getWorkunits(new WUQueryWrapper().setSortBy(SortBy.WUID).setDescending(false));
        if (result.get(1).getWuid().compareTo(result.get(0).getWuid())<0) {
            Assert.fail("ascending workunits in wrong order:" + result.get(0).getWuid() + " then " + result.get(1).getWuid());
        }

      //cluster descending
        result=wswuclient.getWorkunits(new WUQueryWrapper().setSortBy(SortBy.Cluster).setDescending(true));
        if (result.get(0).getCluster().compareTo(result.get(result.size()-1).getCluster())<0) {
            Assert.fail("descending clusters in wrong order:" + result.get(0).getCluster() + " then "
                    + result.get(result.size()-1).getCluster());
        }
        //cluster ascending
        result=wswuclient.getWorkunits(new WUQueryWrapper().setSortBy(SortBy.Cluster).setDescending(false));
        if (result.get(1).getCluster().compareTo(result.get(0).getCluster())<0) {
            Assert.fail("ascending clusters in wrong order:" + result.get(0).getCluster() + " then "
                    + result.get(result.size()-1).getCluster());
        }

        //jobname descending
        result=wswuclient.getWorkunits(new WUQueryWrapper().setSortBy(SortBy.Jobname).setDescending(true));
        if (result.get(0).getJobname().compareTo(result.get(result.size()-1).getJobname())<0) {
            Assert.fail("descending jobname in wrong order:" + result.get(0).getJobname() + " then "
                    + result.get(result.size()-1).getJobname());
        }
        //jobname ascending
        result=wswuclient.getWorkunits(new WUQueryWrapper().setSortBy(SortBy.Jobname).setDescending(false));
        if (result.get(1).getJobname().compareTo(result.get(0).getJobname())<0) {
            Assert.fail("ascending jobname in wrong order:" + result.get(0).getJobname() + " then "
                    + result.get(result.size()-1).getJobname());
        }

        //owner descending
        result=wswuclient.getWorkunits(new WUQueryWrapper().setSortBy(SortBy.Owner).setDescending(true));
        if (result.get(0).getOwner().compareTo(result.get(result.size()-1).getOwner())<0) {
            Assert.fail("descending owner in wrong order:" + result.get(0).getOwner() + " then "
                    + result.get(result.size()-1).getOwner());
        }
        //owner ascending
        result=wswuclient.getWorkunits(new WUQueryWrapper().setSortBy(SortBy.Owner).setDescending(false));
        if (result.get(1).getOwner().compareTo(result.get(0).getOwner())<0) {
            Assert.fail("ascending owner in wrong order:" + result.get(0).getOwner() + " then "
                    + result.get(result.size()-1).getOwner());
        }

        //state descending
        result=wswuclient.getWorkunits(new WUQueryWrapper().setSortBy(SortBy.State).setDescending(true));
        if (result.get(0).getState().compareTo(result.get(result.size()-1).getState())<0) {
            Assert.fail("descending state in wrong order:" + result.get(0).getState() + " then "
                    + result.get(result.size()-1).getState());
        }
        //state ascending
        result=wswuclient.getWorkunits(new WUQueryWrapper().setSortBy(SortBy.State).setDescending(false));
        if (result.get(1).getState().compareTo(result.get(0).getState())<0) {
            Assert.fail("ascending state in wrong order:" + result.get(0).getState() + " then "
                    + result.get(result.size()-1).getState());
        }
    }

    @Test
    public void testAbortWU() throws Exception, ArrayOfEspExceptionWrapper, ArrayOfECLExceptionWrapper
    {
        createTestWorkunits("OUTPUT( PIPE('sleep 10',{STRING hack}));",1);
        if (this.testwuids.size()==0)
        {
            Assert.fail("workunit not created");
        }
        wswuclient.abortWU(testwuids.get(0));
        Thread.sleep(5000);
        WorkunitWrapper test = wswuclient.getWUInfo(testwuids.get(0));
        if (!(WUState.ABORTED.toString().toLowerCase().equals(test.getState())
                || WUState.ABORTING.toString().toLowerCase().equals(test.getState())))
        {
            Assert.fail("Workunit not aborted");
        }
    }

}

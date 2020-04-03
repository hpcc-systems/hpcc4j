package org.hpccsystems.ws.client;

import java.util.List;

import org.hpccsystems.ws.client.platform.test.BaseRemoteTest;
import org.hpccsystems.ws.client.wrappers.ApplicationValueWrapper;
import org.hpccsystems.ws.client.wrappers.ArrayOfECLExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WUQueryWrapper;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WUQueryWrapper.SortBy;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WorkunitWrapper;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(IntegrationTest.class)
public class WUQueryTest extends BaseRemoteTest
{
    private static HPCCWsWorkUnitsClient wswuclient;

    @BeforeClass
    public static void setup() throws Exception
    {
        wswuclient = wsclient.getWsWorkunitsClient();
    }

    @Test
    public void testGetWorkunitByAppName() throws Exception, ArrayOfEspExceptionWrapper, ArrayOfECLExceptionWrapper
    {
        wswuclient.createWorkunit();
        WorkunitWrapper wu=new WorkunitWrapper();
        wu.setECL("OUTPUT('1');");
        wu.setCluster("thor");
        wu.setJobname("testGetWorkunitByAppName");
        wu.setOwner("user");
        ApplicationValueWrapper av=new ApplicationValueWrapper("HIPIE","testkey","testvalue");
        wu.getApplicationValues().add(av);
        wu=wswuclient.compileWUFromECL(wu);
        wu=wswuclient.runWorkunit(wu.getWuid(),null,null,null,false,null);

        WUQueryWrapper info=new WUQueryWrapper().setSortBy(SortBy.WUID).setDescending(true);
        info.getApplicationValues().add(av);
        List<WorkunitWrapper> searchresults=wswuclient.getWorkunits(info);
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
        List<WorkunitWrapper> result=wswuclient.getWorkunits(new WUQueryWrapper().setSortBy(SortBy.WUID).setDescending(true));
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
}

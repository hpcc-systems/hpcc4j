package org.hpccsystems.ws.client;

import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;

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

public class WUQueryTest extends BaseRemoteTest
{
    private static HPCCWsWorkUnitsClient wswuclient;

    @BeforeClass
    public static void setup() throws Exception
    {
        wswuclient = wsclient.getWsWorkunitsClient();
    }

    public WorkunitWrapper createWU(String ecl, String cluster, String jobName, String owner, ApplicationValueWrapper av)
    {
        WorkunitWrapper wu=new WorkunitWrapper();
        wu.setECL(ecl);
        wu.setCluster(thorclustername);
        wu.setJobname(jobName);
        wu.setOwner(owner);
        wu.getApplicationValues().add(av);
        try
        {
            wu=wswuclient.compileWUFromECL(wu);
            wu=wswuclient.runWorkunit(wu.getWuid(),null,null,null,false,null);
        }
        catch (Exception e)
        {
            System.err.println("WUQueryTest: Failed to create new WU for test: '" +  ecl + "'" );
            System.err.println(e.getLocalizedMessage());
            return null;
        }
        return wu;
    }

    @Test
    public void testGetWorkunitByAppName() throws Exception, ArrayOfEspExceptionWrapper, ArrayOfECLExceptionWrapper
    {
        ApplicationValueWrapper av=new ApplicationValueWrapper("HIPIE","testkey","testvalue");
        WorkunitWrapper wu = createWU("OUTPUT('1');", thorclustername, "1testGetWorkunitByAppName", "1user", av);

        assumeTrue("testGetWorkunitByAppName failed to create WU!", wu != null);

        WUQueryWrapper info = new WUQueryWrapper().setSortBy(SortBy.WUID).setDescending(true);
        info.getApplicationValues().add(av);
        List<WorkunitWrapper> searchresults = wswuclient.getWorkunits(info);

        if (searchresults.size() == 0)
        {
            Assert.fail("search for app val failed");
        }

        if (!searchresults.get(0).getWuid().equals(wu.getWuid()))
        {
            Assert.fail("First returned workunit " + searchresults.get(0).getWuid() + " wasn't wuid " + wu.getWuid() );
        }
    }

    @Test
    public void testGetWorkunitSort() throws Exception
    {
        
        assumeTrue("Testing WU sortBy failed to create First WU!", null != createWU("OUTPUT('a');", thorclustername, "aTestWorkunitSortBA", "aTestUser", new ApplicationValueWrapper("AppA","testkeyA","testvalueA")));
        assumeTrue("Testing WU sortBy failed to create Second WU!", null != createWU("OUTPUT('b');", thorclustername, "bTestWorkunitSortBy", "bTestUser", new ApplicationValueWrapper("AppB","testkeyB","testvalueB")));

        //wuid descending
        List<WorkunitWrapper> result=wswuclient.getWorkunits(new WUQueryWrapper().setSortBy(SortBy.WUID).setDescending(true));
        assumeTrue("Testing WU sortBy failed to find enough WUs!", result.size() > 1);

        if (result.get(0).getWuid().compareToIgnoreCase(result.get(1).getWuid())<0)
        {
            Assert.fail("descending workunits in wrong order:" + result.get(0).getWuid() + " then " + result.get(1).getWuid());
        }

        //wuid ascending
        result=wswuclient.getWorkunits(new WUQueryWrapper().setSortBy(SortBy.WUID).setDescending(false));
        if (result.get(1).getWuid().compareToIgnoreCase(result.get(0).getWuid())<0)
        {
            Assert.fail("ascending workunits in wrong order:" + result.get(0).getWuid() + " then " + result.get(1).getWuid());
        }

        //cluster descending
        result=wswuclient.getWorkunits(new WUQueryWrapper().setSortBy(SortBy.Cluster).setDescending(true));
        if (result.get(0).getCluster().compareToIgnoreCase(result.get(result.size()-1).getCluster())<0)
        {
            Assert.fail("descending clusters in wrong order:" + result.get(0).getCluster() + " then "
                    + result.get(result.size()-1).getCluster());
        }

        //cluster ascending
        result=wswuclient.getWorkunits(new WUQueryWrapper().setSortBy(SortBy.Cluster).setDescending(false));
        if (result.get(1).getCluster().compareToIgnoreCase(result.get(0).getCluster())<0)
        {
            Assert.fail("ascending clusters in wrong order:" + result.get(0).getCluster() + " then "
                    + result.get(result.size()-1).getCluster());
        }

        //jobname descending
        result=wswuclient.getWorkunits(new WUQueryWrapper().setSortBy(SortBy.Jobname).setDescending(true));
        if (result.get(0).getJobname().compareToIgnoreCase(result.get(result.size()-1).getJobname())<0)
        {
            Assert.fail("descending jobname in wrong order:" + result.get(0).getJobname() + " then "
                    + result.get(result.size()-1).getJobname());
        }

        //jobname ascending
        result=wswuclient.getWorkunits(new WUQueryWrapper().setSortBy(SortBy.Jobname).setDescending(false));
        if (result.get(1).getJobname().compareToIgnoreCase(result.get(0).getJobname())<0)
        {
            Assert.fail("ascending jobname in wrong order:" + result.get(0).getJobname() + " then "
                    + result.get(result.size()-1).getJobname());
        }

        //owner descending
        result=wswuclient.getWorkunits(new WUQueryWrapper().setSortBy(SortBy.Owner).setDescending(true));
        if (result.get(0).getOwner().compareToIgnoreCase(result.get(result.size()-1).getOwner())<0)
        {
            Assert.fail("descending owner in wrong order:" + result.get(0).getOwner() + " then "
                    + result.get(result.size()-1).getOwner());
        }

        //owner ascending
        result=wswuclient.getWorkunits(new WUQueryWrapper().setSortBy(SortBy.Owner).setDescending(false));
        if (result.get(1).getOwner().compareToIgnoreCase(result.get(0).getOwner())<0)
        {
            Assert.fail("ascending owner in wrong order:" + result.get(0).getOwner() + " then "
                    + result.get(result.size()-1).getOwner());
        }

        //state descending
        result=wswuclient.getWorkunits(new WUQueryWrapper().setSortBy(SortBy.State).setDescending(true));
        assumeTrue("Not enough WUs to test sortby.state Descending", result.size() > 1);
        assumeFalse("Not enough WUs with known state", result.get(0).getState().equals("unknown"));
        assumeFalse("Not enough WUs with known state", result.get(result.size()-1).getState().equals("unknown"));

        if (result.get(0).getState().compareToIgnoreCase(result.get(result.size()-1).getState())<0)
        {
            Assert.fail("descending state in wrong order:" + result.get(0).getState() + " then "
                    + result.get(result.size()-1).getState());
        }

        //state ascending
        result=wswuclient.getWorkunits(new WUQueryWrapper().setSortBy(SortBy.State).setDescending(false));
        assumeTrue("Not enough WUs to test sortby.state Ascending", result.size() > 1);
        assumeFalse("Not enough WUs with known state", result.get(0).getState().equals("unknown"));
        assumeFalse("Not enough WUs with known state", result.get(result.size()-1).getState().equals("unknown"));
        if (result.get(result.size()-1).getState().compareToIgnoreCase(result.get(0).getState())<0)
        {
            Assert.fail("ascending state in wrong order:" + result.get(0).getState() + " then "
                    + result.get(result.size()-1).getState());
        }
    }
}

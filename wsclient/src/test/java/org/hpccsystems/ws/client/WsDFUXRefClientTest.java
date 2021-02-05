package org.hpccsystems.ws.client;

import org.apache.axis2.AxisFault;
import org.hpccsystems.ws.client.platform.test.BaseRemoteTest;
import org.hpccsystems.ws.client.wrappers.gen.wsdfuxref.DFUXRefUnusedFilesResponseWrapper;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

public class WsDFUXRefClientTest extends BaseRemoteTest
{
    private final static HPCCWsDFUXRefClient wsdfuxrefclient = wsclient.getWsDFUXRefClient();
    private final static String processCluster = System.getProperty("processcluster", "");

    static
    {
        if (System.getProperty("processcluster") == null)
            System.out.println("processcluster system property not provided");
    }

    @Test
    public void testDFUPing()
    {
        try
        {
            Assert.assertTrue(wsdfuxrefclient.ping());
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
    public void testXRefList()
    {
        try
        {
            wsdfuxrefclient.list();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testDirectories()
    {
        Assume.assumeNotNull(this.thorClusterFileGroup);

        try
        {
            wsdfuxrefclient.directories(this.thorClusterFileGroup);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testXRefBuild()
    {
        Assume.assumeNotNull(this.thorClusterFileGroup);

        try
        {
            wsdfuxrefclient.build(this.thorClusterFileGroup);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testXRefBuildCancel()
    {
        Assume.assumeNotNull(this.thorClusterFileGroup);

        try
        {
            wsdfuxrefclient.buildCancel();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testCleanDirectories()
    {
        Assume.assumeNotNull(this.thorClusterFileGroup);

        try
        {
            wsdfuxrefclient.cleanDirectories(this.thorClusterFileGroup);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testFoundFiles()
    {
        Assume.assumeNotNull(this.thorClusterFileGroup);

        try
        {
            wsdfuxrefclient.foundFiles(this.thorClusterFileGroup);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testLostFiles()
    {
        Assume.assumeNotNull(this.thorClusterFileGroup);

        try
        {
            wsdfuxrefclient.lostFiles(this.thorClusterFileGroup);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testXRefMessages()
    {
        Assume.assumeNotNull(this.thorClusterFileGroup);

        try
        {
            wsdfuxrefclient.messages(this.thorClusterFileGroup);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testOrphanedFiles()
    {
        Assume.assumeNotNull(this.thorClusterFileGroup);

        try
        {
            wsdfuxrefclient.orphanedFiles(this.thorClusterFileGroup);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testUnusedFiles()
    {
        Assume.assumeNotNull("Aborting testUnusedFiles", processCluster);
        Assume.assumeFalse("Aborting testUnusedFiles", processCluster.isEmpty());

        try
        {
            DFUXRefUnusedFilesResponseWrapper resp = wsdfuxrefclient.unusedFiles(this.thorClusterFileGroup, null, null);
            Assert.assertNotNull(resp);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }
}

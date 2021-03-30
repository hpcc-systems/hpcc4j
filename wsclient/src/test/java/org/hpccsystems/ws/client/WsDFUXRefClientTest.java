package org.hpccsystems.ws.client;

import java.util.List;

import org.apache.axis2.AxisFault;
import org.hpccsystems.ws.client.platform.test.BaseRemoteTest;
import org.hpccsystems.ws.client.wrappers.ArrayOfXRefDirectoryWrapper;
import org.hpccsystems.ws.client.wrappers.ArrayOfXRefFileWrapper;
import org.hpccsystems.ws.client.wrappers.ArrayOfXRefMessageWrapper;
import org.hpccsystems.ws.client.wrappers.ArrayOfXRefNodeWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsdfuxref.DFUXRefUnusedFilesResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsdfuxref.UnusedFiles_type0Wrapper;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WsDFUXRefClientTest extends BaseRemoteTest
{
    private final static HPCCWsDFUXRefClient wsdfuxrefclient = wsclient.getWsDFUXRefClient();
    private final static String processCluster = System.getProperty("processcluster", "mythor");
    private static boolean isValidVersion = true;
    private ArrayOfXRefNodeWrapper xrefnodes = null;

    static
    {
        isValidVersion = wsdfuxrefclient != null && wsdfuxrefclient.isRuntimeVersionSupported();

        if (System.getProperty("processcluster") == null)
            System.out.println("processcluster system property not provided defaulting to 'mythor' ");
    }

    @Before
    public void verifyClient() throws Exception
    {
        if (wsdfuxrefclient != null && wsdfuxrefclient.hasInitError())
            System.out.println("WsDFUXRefClient reported error: '" + wsdfuxrefclient.getInitError() + "'");

        Assume.assumeTrue("Cannot execute WsDFUXRefClientTests due to invalid target WsDFUXRef", isValidVersion);
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
        Assume.assumeTrue("Invalid runtime version detected", wsdfuxrefclient.isRuntimeVersionSupported());

        try
        {
            xrefnodes = wsdfuxrefclient.list();
            Assert.assertNotNull(xrefnodes);

            System.out.println(xrefnodes.toString());
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
        Assume.assumeTrue("Invalid runtime version detected", wsdfuxrefclient.isRuntimeVersionSupported());
        Assume.assumeNotNull(WsDFUXRefClientTest.processCluster);

        try
        {
            ArrayOfXRefDirectoryWrapper dirs = wsdfuxrefclient.directories(WsDFUXRefClientTest.processCluster);
            System.out.println("Directories found: " + dirs.toString());
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void A1_testXRefBuild()
    {
        Assume.assumeTrue("Invalid runtime version detected", wsdfuxrefclient.isRuntimeVersionSupported());
        Assume.assumeNotNull(WsDFUXRefClientTest.processCluster);

        try
        {
            wsdfuxrefclient.build(WsDFUXRefClientTest.processCluster);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void Z9_testXRefBuildCancel()
    {
        Assume.assumeNotNull(WsDFUXRefClientTest.processCluster);

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
        Assume.assumeNotNull(WsDFUXRefClientTest.processCluster);

        try
        {
            wsdfuxrefclient.cleanDirectories(WsDFUXRefClientTest.processCluster);
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
        Assume.assumeNotNull(WsDFUXRefClientTest.processCluster);

        try
        {
            ArrayOfXRefFileWrapper found = wsdfuxrefclient.foundFiles(WsDFUXRefClientTest.processCluster);
            Assert.assertNotNull(found);
            System.out.println(found.toString());
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
        Assume.assumeNotNull(WsDFUXRefClientTest.processCluster);

        try
        {
            ArrayOfXRefFileWrapper lost = wsdfuxrefclient.lostFiles(WsDFUXRefClientTest.processCluster);
            Assert.assertNotNull(lost);

            System.out.println(lost.toString());

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
        Assume.assumeNotNull(WsDFUXRefClientTest.processCluster);

        try
        {
            ArrayOfXRefMessageWrapper messages = wsdfuxrefclient.messages(WsDFUXRefClientTest.processCluster);
            Assert.assertNotNull(messages);
            System.out.println(messages.toString());
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
        Assume.assumeNotNull(WsDFUXRefClientTest.processCluster);

        try
        {
            ArrayOfXRefFileWrapper orphaned = wsdfuxrefclient.orphanedFiles(WsDFUXRefClientTest.processCluster);

            Assert.assertNotNull(orphaned);
            System.out.println(orphaned.toString());
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
        Assume.assumeNotNull("Aborting testUnusedFiles", WsDFUXRefClientTest.processCluster);
        Assume.assumeFalse("Aborting testUnusedFiles", WsDFUXRefClientTest.processCluster.isEmpty());

        try
        {
            DFUXRefUnusedFilesResponseWrapper resp = wsdfuxrefclient.unusedFiles(WsDFUXRefClientTest.processCluster, null, null);
            Assert.assertNotNull(resp);
            System.out.println("Unused Files (" + resp.getUnusedFileCount() + "):");
            if (resp.getExceptions() != null && resp.getExceptions().getException().size() > 0)
                System.out.println("Exceptions encountered: " + resp.getExceptions().getException().toString());
            UnusedFiles_type0Wrapper files = resp.getUnusedFiles();
            Assert.assertNotNull(files);
            List<String> filenames = files.getFile();
            for (String filename : filenames)
            {
                System.out.println(filename);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }
}

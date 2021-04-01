package org.hpccsystems.ws.client;

import org.apache.axis2.AxisFault;
import org.hpccsystems.ws.client.platform.test.BaseRemoteTest;
import org.hpccsystems.ws.client.wrappers.ArrayOfXRefDirectoryWrapper;
import org.hpccsystems.ws.client.wrappers.ArrayOfXRefFileWrapper;
import org.hpccsystems.ws.client.wrappers.ArrayOfXRefMessageWrapper;
import org.hpccsystems.ws.client.wrappers.ArrayOfXRefNodeWrapper;
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
        System.out.println("Testing XREFPING...");
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
    public void A1_testXRefBuild()
    {
        System.out.println("Testing XREFBUILD...");
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
    public void A2_testXRefList()
    {
        System.out.println("Testing XREFLIST...");
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
        System.out.println("Testing XREFDIRECTORIES...");
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
    public void testFoundFiles()
    {
        System.out.println("Testing XREFFOUNDFILES...");
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
        System.out.println("Testing XREFLOSTFILES...");
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
        System.out.println("Testing XREFMESSAGES...");
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
        System.out.println("Testing XREFORPHANEDFILES...");
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

// Server side doesn't behave as other methods - not including in our tests
//  https://track.hpccsystems.com/browse/HPCC-25622
//    @Test
//    public void testUnusedFiles()
//    {
//        System.out.println("Testing XREFUNUSEDFILES...");
//        Assume.assumeNotNull("Aborting testUnusedFiles", roxieClusterGroup);
//        Assume.assumeFalse("Aborting testUnusedFiles", roxieClusterGroup.isEmpty());
//
//        try
//        {
//            DFUXRefUnusedFilesResponseWrapper resp = wsdfuxrefclient.unusedFiles(roxieClusterGroup, null, null); //only works on Roxy clusters?
//            Assert.assertNotNull(resp);
//            System.out.println("Unused Files (" + resp.getUnusedFileCount() + "):");
//            if (resp.getExceptions() != null && resp.getExceptions().getException().size() > 0)
//                System.out.println("Exceptions encountered: " + resp.getExceptions().getException().toString());
//            UnusedFiles_type0Wrapper files = resp.getUnusedFiles();
//            Assert.assertNotNull(files);
//            List<String> filenames = files.getFile();
//            for (String filename : filenames)
//            {
//                System.out.println(filename);
//            }
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//            Assert.fail();
//        }
//    }

    @Test
    public void Z9_testXRefBuildCancel()
    {
        System.out.println("Testing XREFBUILDCANCEL...");
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
        System.out.println("Testing XREFCLEANDIRECTORIES...");
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

}

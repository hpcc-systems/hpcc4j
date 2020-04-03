package org.hpccsystems.ws.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.axis2.AxisFault;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUFileType;
import org.hpccsystems.ws.client.platform.test.BaseRemoteTest;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileTypeWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUInfoWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFULogicalFileWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUResultWrapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.w3c.dom.NodeList;


public class WsDFUClientTest extends BaseRemoteTest
{
    private final static HPCCWsDFUClient wsdfuclient = wsclient.getWsDFUClient();

    @Before
    public void delayhack()
    {
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {

		}
    }
    @Test
    public void testFileTypeWrapper()
    {

        DFUFileTypeWrapper filetype = null;
        try
        {
            filetype = DFUFileTypeWrapper.fromString("FLAT"); // only "Flat" is recognized
        }
        catch (Exception e)
        {
            Assert.assertNull(filetype);
        }

        filetype = DFUFileTypeWrapper.Flat;
        Assert.assertNotNull(filetype);

        Assert.assertTrue(filetype.getFUFileType().equals(DFUFileType.Flat));
        Assert.assertTrue(filetype.getFUFileType().toString().equals(DFUFileType._Flat));

        DFUFileTypeWrapper filetype2 = DFUFileTypeWrapper.fromString("Flat");
        Assert.assertNotNull(filetype2);
        Assert.assertTrue(filetype.equals(filetype2));

        filetype2 = (DFUFileTypeWrapper)DFUFileTypeWrapper.fromString("Flat");
        Assert.assertTrue(filetype.equals(filetype2));

        filetype2 = (DFUFileTypeWrapper)DFUFileTypeWrapper.fromString("Xml");
        Assert.assertFalse(filetype.equals(filetype2));

        filetype = DFUFileTypeWrapper.fromString("Xml");
        Assert.assertTrue(filetype.equals(filetype2));

        try
        {
            filetype = DFUFileTypeWrapper.fromString("XmL");  //XmL not recognized, must be "Xml"

        }
        catch (IllegalArgumentException e) {}

        filetype = DFUFileTypeWrapper.fromString("Csv");
        Assert.assertFalse(filetype.equals(filetype2));

        filetype2 = (DFUFileTypeWrapper)DFUFileTypeWrapper.fromString("Csv");
        Assert.assertTrue(filetype.equals(filetype2));

        filetype = (DFUFileTypeWrapper)DFUFileTypeWrapper.fromString("Index");
        Assert.assertFalse(filetype.equals(filetype2));

        filetype2 = (DFUFileTypeWrapper)DFUFileTypeWrapper.fromString("Index");
        Assert.assertTrue(filetype.equals(filetype2));
    }
    @Test
    public void testDFUPing()
    {
        try
        {
            Assert.assertTrue(wsdfuclient.ping());
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

    private DFULogicalFileWrapper randomfilename = null;

    public void recursiveGetFiles(String directory)
    {
        try
        {
            List<DFULogicalFileWrapper> files = wsdfuclient.getFiles(directory);
            for (DFULogicalFileWrapper file : files)
            {
                if (file.getIsDirectory())
                {
                    System.out.println(directory + file.getDirectory());
                    recursiveGetFiles(file.getDirectory());
                }
                else
                {
                    if (directory.isEmpty() || directory.equals("."))
                    {
                        if (randomfilename == null)
                            randomfilename = file;
                    }
                    System.out.println("/" + file.getFileName());
                }

            }
        }
        catch (AxisFault e)
        {
            e.printStackTrace();
            Assert.fail();
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail( e.toString());
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    public void getFirstFileAvailable(String directory)
    {
        try
        {
            List<DFULogicalFileWrapper> files = wsdfuclient.getFiles(directory);
            for (DFULogicalFileWrapper file : files)
            {
                if (file.getIsDirectory())
                {
                    getFirstFileAvailable(!directory.isEmpty() ? directory + "::" + file.getDirectory() : file.getDirectory());
                }
                else
                {
                    if (randomfilename == null)
                        randomfilename = file;
                    return;
                }
            }
            Assert.assertNotNull("Could not find any files on HPCC for tests", randomfilename);
        }
        catch (AxisFault e)
        {
            e.printStackTrace();
            Assert.fail();
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail( e.toString());
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFiles()
    {
        try
        {
            recursiveGetFiles("");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFileContent()
    {
        try
        {
            getFirstFileAvailable("");

            Assert.assertNotNull(randomfilename);

            NodeList content = wsdfuclient.getFileData(randomfilename.getFileName(), (long)0, 100, randomfilename.getNodeGroup());

            Assert.assertNotNull(content);
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail( e.toString());
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testGetFile()
    {
        try
        {
            getFirstFileAvailable("");

            Assert.assertNotNull(randomfilename);

            DFUInfoWrapper file = wsdfuclient.getFileInfo(randomfilename.getFileName(), randomfilename.getNodeGroup());
            Assert.assertNotNull(file);
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail( e.toString());
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void testRedundantClusterDeleteFile()
    {
        try
        {
            Set<String> files = new HashSet<>();
            files.add("somefile@somecluster");

            Assert.assertNotNull(files);

            wsdfuclient.deleteFiles(files, "anothercluster");
            Assert.fail("WsDFU should not accept cluster, and file@cluster");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail( e.toString());
        }
        catch (Exception e)
        {
            String errmessage = e.getMessage();
            Assert.assertTrue(errmessage.startsWith("Do not provide filename@cluster and cluster parameter:"));
        }
    }

    @Test
    public void testDeleteFileWithAttedScope()
    {
       /* ESP is currently treating mysc@pe::file as scope="" filename=mysc cluster=pe::file
        * https://track.hpccsystems.com/browse/HPCC-23227
        * try
        {
            Set<String> files = new HashSet<>();
            files.add("s@mesc@pe::somefile");

            Assert.assertNotNull(files);

            List<DFUResultWrapper> deleteFiles = wsdfuclient.deleteFiles(files, "anothercluster");
            Assert.assertNotNull(deleteFiles);
            Assert.assertTrue(!deleteFiles.isEmpty());
            DFUResultWrapper dfuResultWrapper = deleteFiles.get(0);
            Assert.assertNotNull(dfuResultWrapper);
            Assert.assertTrue(dfuResultWrapper.getActionResult().equals("File not found somefile on somecluster"));
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail(e.toString());
        }
        catch (Exception e)
        {
            Assert.fail(e.toString());
        }
        */
    }

    @Test
    public void testDeleteFileWithCluster()
    {
        try
        {
            Set<String> files = new HashSet<>();
            files.add("somefile");

            Assert.assertNotNull(files);

            List<DFUResultWrapper> deleteFiles = wsdfuclient.deleteFiles(files, "somecluster");
            Assert.assertNotNull(deleteFiles);
            Assert.assertTrue(!deleteFiles.isEmpty());
            DFUResultWrapper dfuResultWrapper = deleteFiles.get(0);
            Assert.assertNotNull(dfuResultWrapper);
            Assert.assertTrue(dfuResultWrapper.getActionResult().startsWith("File not found "));
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail(e.toString());
        }
        catch (Exception e)
        {
            Assert.fail(e.toString());
        }
    }

    @Test(expected = Exception.class)
    public void testDeleteFileWithprefixAtsignCluster() throws Exception 
    {
        Set<String> files = new HashSet<>();
        files.add("@somefile");

        Assert.assertNotNull(files);

        List<DFUResultWrapper> deleteFiles = wsdfuclient.deleteFiles(files, "somecluster");
        Assert.assertNotNull(deleteFiles);
        Assert.assertTrue(!deleteFiles.isEmpty());
        DFUResultWrapper dfuResultWrapper = deleteFiles.get(0);
        Assert.assertNotNull(dfuResultWrapper);
        Assert.assertTrue(dfuResultWrapper.getActionResult().equals("File not found @somefile on somecluster"));
    }

    @Test
    @Ignore("Once I know what cluster this will run on during CI testing I'll update my params and activate the test")
    public void searchFileTest() throws Exception 
    {
        String searchStr="hipie::keys::*";
        assertNotNull(thorcluster);
        List<DFULogicalFileWrapper> results=wsdfuclient.searchFiles(searchStr, thorcluster);
        assertEquals(100,results.size());
        String fname=results.get(0).getFileName();
        results=wsdfuclient.searchFiles(searchStr, thorcluster,2,null);
        assertEquals(2,results.size());
        assertEquals(fname,results.get(0).getFileName());
        results=wsdfuclient.searchFiles(searchStr, thorcluster,null,2);
        assertEquals(100,results.size());
        String fname2=results.get(0).getFileName();
        assertFalse(fname.equals(fname2));
        results=wsdfuclient.searchFiles(searchStr, thorcluster,2,2);
        assertEquals(2,results.size());
        assertEquals(fname2, results.get(0).getFileName());
    }
}

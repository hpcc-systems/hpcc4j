package org.hpccsystems.ws.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeNotNull;
import static org.junit.Assume.assumeTrue;

import java.io.File;
import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import org.apache.axis2.AxisFault;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.wrappers.ArrayOfBaseExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.gen.filespray.DFUWorkunitsActionResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.filespray.DropZoneFilesResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.filespray.DropZoneWrapper;
import org.hpccsystems.ws.client.wrappers.gen.filespray.ProgressResponseWrapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(org.hpccsystems.commons.annotations.RemoteTests.class)
public class FileSprayClientTest extends BaseRemoteTest
{
    private static HPCCFileSprayClient filesprayclient = wsclient.getFileSprayClient();
    private String dropzoneName    = System.getProperty("dropzoneName", "mydropzone");
    private static List<String> fileNames       = new ArrayList<>();
    private final static String testFile1       = System.getProperty("dropzoneTestFile1", "HPCC4J274deleteDropzoneFileTest.csv");
    private final static String path            = System.getProperty("dropzonePath", "/");
    private final static String os              = System.getProperty("dropzoneOs", "");
    private final static String renameSrcName   = System.getProperty("renameSource", "");
    private final static String renameToName    = System.getProperty("renameTarget", "");

    public static final String DELETE_ACTION              = "Delete";
    public static final String SUCCESS_RESULT             = "Success";
    public static final String FILE_DOES_NOT_EXIST_RESULT = "Warning: this file does not exist.";
    private DropZoneWrapper foundLocalDZ = null;
    private String sprayedFile = null;

    static
    {
        fileNames.add(testFile1);
    }

    @Test
    public void testFSPing()
    {
        try
        {
            assertTrue(filesprayclient.ping());
        }
        catch (AxisFault e)
        {
            Assert.fail(e.getMessage());
        }
        catch (Exception e)
        {
            Assert.fail(e.getMessage());
        }
    }

    @SuppressWarnings("static-access")
    @Test
    public void testWSDLAddress()
    {
        System.out.println("WSDL ADDRESS: " + filesprayclient.getServiceWSDLURL());
    }

    @SuppressWarnings("static-access")
    @Test
    public void testServiceURI()
    {
        Assert.assertEquals("/FileSpray", filesprayclient.getServiceURI());
    }

    @Test
    public void testHash()
    {
        int hashcode = filesprayclient.hashCode();
        Assert.assertNotNull(hashcode);

        HPCCFileSprayClient otherfsclient = filesprayclient;
        Assert.assertEquals(hashcode, otherfsclient.hashCode());

        Assert.assertEquals(true,filesprayclient.equals(otherfsclient));

        Connection otherconnection = null;
        try
        {
            otherconnection = new Connection(connection.getUrl());
            if (hpccUser == null && hpccUser.isEmpty())
            {
                otherconnection.setUserName("something"); //ensuring this connection is different
            }
        }
        catch (MalformedURLException e)
        {
            Assert.fail("Could not create Connection object");
            e.printStackTrace();
        }

        Assert.assertNotNull(otherconnection);
        otherfsclient = HPCCFileSprayClient.get(otherconnection);
        Assert.assertEquals(false,filesprayclient.equals(otherfsclient));
    }

    @Test
    public void testBufferLength()
    {
        int defaultlength = 1024;

        Assert.assertEquals(defaultlength, filesprayclient.getFileUploadReadBufferLength());

        int newlength = 2048;
        filesprayclient.setFileUploadReadBufferLength(newlength);
        Assert.assertEquals(newlength, filesprayclient.getFileUploadReadBufferLength());
    }

    @Test
    public void testfetchDropZones()
    {
        try
        {
            List<DropZoneWrapper> dzs = filesprayclient.fetchDropZones("");
            Assert.assertNotNull(dzs);
            if(dzs.size() == 0)
                Assert.fail();

            List<DropZoneWrapper> localdzs = filesprayclient.fetchLocalDropZones();
            Assert.assertEquals(dzs.size(), localdzs.size());

            for (int i = 0; i < dzs.size(); i++)
            {
                DropZoneWrapper thisdz = dzs.get(i);
                Assert.assertEquals(thisdz.getNetAddress(), localdzs.get(i).getNetAddress());
                Assert.assertEquals(thisdz.getPath(), localdzs.get(i).getPath());
                foundLocalDZ = thisdz;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    public static DropZoneWrapper getDropzone(List<DropZoneWrapper> dropzones, String dropzoneName)
    {
        for (DropZoneWrapper dropZone : dropzones)
        {
            if (dropzoneName.equals(dropZone.getName()))
            {
                return dropZone;
            }
        }
        return null;
    }

    @Test
    public void testUploadFile()
    {
        File uploadFile = new File("src/test/resources/filespraytest/HPCC4J274deleteDropzoneFileTest.csv");
        try
        {
            if (foundLocalDZ == null)
                testfetchDropZones();

            assumeNotNull(foundLocalDZ);
            if (!filesprayclient.uploadLargeFile(uploadFile, foundLocalDZ))
            {
                Assert.fail("The File could not be uploaded");
            }
        }
        catch (Exception e)
        {
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void testSprayCSV() //invalid if testUploadFile unsuccessful
    {
        try
        {
            if (foundLocalDZ == null)
                testfetchDropZones();

            assumeNotNull(foundLocalDZ);

            testUploadFile();

            ProgressResponseWrapper prog = filesprayclient.sprayVariable(foundLocalDZ.getNetAddress(), "HPCC4J274deleteDropzoneFileTest.csv", "HPCC4JSprayFileTest.csv", null, thorClusterFileGroup, true);

            Assert.assertNotNull(prog);
            Assert.assertTrue(filesprayclient.handleSprayResponse(prog, 1, 1));
            sprayedFile = "HPCC4JSprayFileTest.csv";
        }
        catch (Exception e)
        {
            Assert.fail(e.getMessage());
        }

    }

    @Test
    public void testDeleteDropZoneFile()
    {
        testUploadFile();
        try
        {
            assumeNotNull(foundLocalDZ);

            DFUWorkunitsActionResponseWrapper result = filesprayclient.deleteDropZoneFiles(foundLocalDZ.getName(), fileNames, foundLocalDZ.getNetAddress(), foundLocalDZ.getPath(), null);
            Assert.assertNotNull(result);

            if (result.getExceptions() != null && !result.getExceptions().getException().isEmpty())
            {
                Assert.fail("failed to delete file\n" + result.getExceptions().toString());
            }
            else
            {
                assertEquals(fileNames.get(0), result.getDFUActionResults().getDFUActionResult().get(0).getID());
                assertEquals(DELETE_ACTION, result.getDFUActionResults().getDFUActionResult().get(0).getAction());
                assertEquals(SUCCESS_RESULT, result.getDFUActionResults().getDFUActionResult().get(0).getResult());
            }
        }
        catch (RemoteException e)
        {
            Assert.fail(e.getMessage());
        }
        //catch (EspSoapFault espSoapFault)
        //{
        //    Assert.fail(espSoapFault.getMessage());
        //}
        catch (Exception e)
        {
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void testDespray()
    {
        testSprayCSV();

        assumeNotNull(sprayedFile);
        assumeTrue(!sprayedFile.isEmpty());

        String wuid = "";
        try
        {
            wuid =  filesprayclient.despray(sprayedFile, foundLocalDZ.getNetAddress(), foundLocalDZ.getPath()+"/"+sprayedFile);
            System.out.println("testDespray wuid: " + wuid + " Target file: " + foundLocalDZ.getNetAddress() + "/" + foundLocalDZ.getPath()+"/"+sprayedFile);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail("testDespray failed");
        }
    }

    @Test
    public void testDeleteDropZoneFileInvalidFile()
    {
        List<String> badFileName = new ArrayList<>();
        badFileName.add("SomeNoneExistantFile.txt");
        try
        {
            if (foundLocalDZ == null)
                testfetchDropZones();

            assumeNotNull(foundLocalDZ);

            DFUWorkunitsActionResponseWrapper result = filesprayclient.deleteDropZoneFiles(foundLocalDZ.getName(), badFileName, foundLocalDZ.getNetAddress(), foundLocalDZ.getPath(), null);
            Assert.assertNotNull(result);
            if (result.getExceptions() != null && !result.getExceptions().getException().isEmpty())
            {
                Assert.fail("Got an exception when trying to delete the non existent file\n" + result.getExceptions().toString());
            }
            else
            {
                assertEquals(badFileName.get(0), result.getDFUActionResults().getDFUActionResult().get(0).getID());
                assertEquals(DELETE_ACTION, result.getDFUActionResults().getDFUActionResult().get(0).getAction());
                assertEquals(FILE_DOES_NOT_EXIST_RESULT, result.getDFUActionResults().getDFUActionResult().get(0).getResult());
                System.out.println("File 'SomeNoneExistantFile.txt' not found as expected");
            }
        }
        catch (RemoteException e)
        {
            Assert.fail(e.getMessage());
        }
        catch (Exception e)
        {
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void testfetchDropZonesBadURL()
    {
        try
        {
            List<DropZoneWrapper> dzs = filesprayclient.fetchDropZones("invalidserver:8010");
            Assert.assertNull(dzs);
        }
        catch (Exception e)
        {
            System.out.println("Test fetch DropZones Bad URL failed as expected: " + e.getLocalizedMessage());
        }
    }

    @Test
    public void testESPExceptionArrayLocalMessage()
    {
        final String message = "Just testing";
        try
        {
            throw new ArrayOfEspExceptionWrapper().setWsClientMessage(message);
        }
        catch (ArrayOfBaseExceptionWrapper e)
        {
            String wsClientMessage = e.getWsClientMessage();
            Assert.assertNotNull(wsClientMessage);
            assertTrue(wsClientMessage.equals(message));
        }
    }

    @Test
    public void testallparamsdzsearchwithfirstlocaldzfound()
    {
        try
        {
            List<DropZoneWrapper> localdzs = filesprayclient.fetchLocalDropZones();
            Assert.assertNotNull(localdzs);

            if (localdzs.size() > 0)
            {
                DropZoneWrapper thisdz = localdzs.get(0);
                try
                {
                    DropZoneFilesResponseWrapper fetchDropZones = filesprayclient.fetchDropZones(thisdz.getName(), thisdz.getNetAddress(), thisdz.getLinux(), thisdz.getPath(), "", false, false);
                    Assert.assertNotNull(fetchDropZones);
                }
                catch (Exception e)
                {
                    Assert.fail(e.getLocalizedMessage());
                }
            }
            else
                Assert.fail("No dropzones found!");
        }
        catch (Exception e)
        {
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void testRenameLogicalFile()
    {
        assumeNotNull(renameSrcName);
        assumeFalse(renameSrcName.isEmpty());

        assumeNotNull(renameToName);
        assumeFalse(renameToName.isEmpty());

        try
        {
            String dfuworkunitrespoinse = filesprayclient.renameLogicalFile(renameSrcName, renameToName, false);
            Assert.assertNotNull(dfuworkunitrespoinse);
            Assert.assertTrue(!dfuworkunitrespoinse.isEmpty());

            ProgressResponseWrapper dfuProgress = filesprayclient.getDfuProgress(dfuworkunitrespoinse);
            Assert.assertNotNull(dfuProgress);
            Assert.assertNull(dfuProgress.getExceptions());
            Thread.sleep(200); //give the rename process a chance

            System.out.println("Rename result: " + dfuProgress.getSummaryMessage());
        }
        catch (Exception e)
        {
            Assert.fail(e.getLocalizedMessage());
        }
    }
}

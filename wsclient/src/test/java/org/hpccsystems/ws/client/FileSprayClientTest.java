package org.hpccsystems.ws.client;

import java.net.MalformedURLException;
import java.util.List;

import org.apache.axis2.AxisFault;
import org.hpccsystems.ws.client.platform.test.BaseRemoteTest;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.ArrayOfBaseExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.gen.filespray.DropZoneFilesResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.filespray.DropZoneWrapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FileSprayClientTest extends BaseRemoteTest
{
    private HPCCFileSprayClient filesprayclient = null;

    @Before
    public void setUp() throws Exception
    {
        super.setup();

        filesprayclient = wsclient.getFileSprayClient();
        Assert.assertNotNull(filesprayclient);
    }

    @Test
    public void testFSPing()
    {
        try
        {
            Assert.assertTrue(filesprayclient.ping());
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

    @SuppressWarnings("static-access")
    @Test
    public void testWSDLAddress()
    {
        System.out.println("WSDL ADDRESS: " + filesprayclient.getOriginalWSDLURL());
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
            otherconnection = new Connection(this.connection.getUrl());
            if (this.hpccUser == null && this.hpccUser.isEmpty())
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
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
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
            Assert.assertTrue(wsClientMessage.equals(message));
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
            e.printStackTrace();
            Assert.fail();
        }
    }
}

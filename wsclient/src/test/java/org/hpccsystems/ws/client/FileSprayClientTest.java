package org.hpccsystems.ws.client;

import java.net.MalformedURLException;

import org.apache.axis2.AxisFault;
import org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DropZone;
import org.hpccsystems.ws.client.platform.test.BaseRemoteTest;
import org.hpccsystems.ws.client.utils.Connection;
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

    @Test
    public void testWSDLAddress()
    {
        System.out.println("WSDL ADDRESS: " + filesprayclient.getOriginalWSDLURL());
    }

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
            DropZoneWrapper[] dzs = filesprayclient.fetchDropZones("");
            Assert.assertNotNull(dzs);
            if(dzs.length == 0)
                Assert.fail();

            DropZoneWrapper[] localdzs = filesprayclient.fetchLocalDropZones();
            Assert.assertEquals(dzs.length, localdzs.length);

            for (int i = 0; i < dzs.length; i++)
            {
                DropZoneWrapper thisdz = dzs[i];
                Assert.assertEquals(thisdz.getNetAddress(), localdzs[i].getNetAddress());
                Assert.assertEquals(thisdz.getPath(), localdzs[i].getPath());
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
            DropZoneWrapper[] dzs = filesprayclient.fetchDropZones("invalidserver:8010");
            Assert.assertNull(dzs);
        }
        catch (Exception e)
        {
            System.out.println("Test fetch DropZones Bad URL failed as expected: " + e.getLocalizedMessage());
        }
    }
}

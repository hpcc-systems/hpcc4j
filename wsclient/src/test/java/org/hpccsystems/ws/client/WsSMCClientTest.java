package org.hpccsystems.ws.client;

import java.net.MalformedURLException;

import org.apache.axis2.AxisFault;
import org.hpccsystems.ws.client.platform.Version;
import org.hpccsystems.ws.client.utils.Connection;
import org.junit.Assert;
import org.junit.Test;

public class WsSMCClientTest extends BaseRemoteTest
{
    private static HPCCWsSMCClient client = wsclient.getWsSMCClient();

    @Test
    public void testFSPing()
    {
        try
        {
            Assert.assertTrue(client.ping());
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
        System.out.println("WSDL ADDRESS: " + HPCCWsSMCClient.getServiceWSDLURL());
    }

    @Test
    public void testHash()
    {
        int hashcode = client.hashCode();
        Assert.assertNotNull(hashcode);

        HPCCWsSMCClient otherfsclient = client;
        Assert.assertEquals(hashcode, otherfsclient.hashCode());

        Assert.assertEquals(true, client.equals(otherfsclient));

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
        otherfsclient = HPCCWsSMCClient.get(otherconnection);
        Assert.assertEquals(false, client.equals(otherfsclient));
    }

    @Test
    public void testHPCCBuild()
    {
        try
        {
            String buildnumber = client.getHPCCBuild();
            Assert.assertNotNull(buildnumber);
            if (buildnumber.isEmpty())
                Assert.fail("fetched empty build number");
            Version v = new Version(buildnumber);
            Assert.assertNotNull(v);
            System.out.println("HPCC version: " + v.toString());
        }
        catch (Exception e)
        {
            System.out.println("Test fetch DropZones Bad URL failed as expected: " + e.getLocalizedMessage());
        }
    }
}

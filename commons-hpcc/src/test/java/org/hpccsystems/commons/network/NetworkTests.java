package org.hpccsystems.commons.network;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.junit.experimental.categories.Category;

@Category(org.hpccsystems.commons.annotations.RegressionTests.class)
public class NetworkTests
{
	 @Before
	    public void setup()
	    {
	    }

	    @Test
	    public void testGetLocalHostWildCardIPV4() throws Exception
	    {
	        String localAddress = Network.getLocalAddress("*");
	        Assert.assertTrue(Network.isLocalAddress(localAddress));
	    }

	    @Test
	    public void testGetLocalHostWildCardIPV6() throws Exception
	    {
	        try
	        {
	            String localAddressIPV6 = Network.getLocalAddress("*", true);
	            Assert.assertTrue(Network.isLocalAddress(localAddressIPV6));
	        }
	        catch (Exception e)
	        {
                System.out.println("Could not find local IPv6 address - 'testGetLocalHostWildCardIPV6' test invalidated");
            }
	    }

	    @Test
	    public void testloopback() throws Exception
	    {
	    	Assert.assertFalse(Network.isLocalAddress("127.0.0.1"));
	    }
	    
	    @After
	    public void shutdown()
	    {

	    }
}

package org.hpccsystems.ws.client;

import org.junit.Assert;
import org.junit.Test;

public class WsClientTest extends BaseRemoteTest
{
    static
    {
        String legacythortargetclustername = System.getProperty("thortargetclustername");
        if (legacythortargetclustername != null && !legacythortargetclustername.isEmpty())
            System.out.println("WARNING! 'thortargetclustername' has been deprecated - Use 'thorgroupname' instead");

        String legacyroxietargetclustername = System.getProperty("roxietargetclustername");
        if (legacyroxietargetclustername != null && !legacyroxietargetclustername.isEmpty())
            System.out.println("WARNING! 'roxietargetclustername' has been deprecated - Use 'roxiegroupname' instead");
    }

    @Test
    public void testAvailableClusterGroups()
    {
        try
        {
            String[] availableClusterGroups = wsclient.getAvailableClusterGroups();
            System.out.println("Available (Target) Cluster groups");
            for (int i = 0; i < availableClusterGroups.length; i++)
            {
                System.out.println("\t" + availableClusterGroups[i]);
            }
        }
        catch (Exception e)
        {
            Assert.fail("Could not fetch available cluster groups: " + e.getLocalizedMessage());
            e.printStackTrace();
        }
    }

    @Test
    public void testGetAvailableClusterNames()
    {
        try
        {
            String[] availableClusterGroups = wsclient.getAvailableClusterNames("");
            System.out.println("Available clusters");
            for (int i = 0; i < availableClusterGroups.length; i++)
            {
                System.out.println("\t" + availableClusterGroups[i]);
            }
        }
        catch (Exception e)
        {
            Assert.fail("Could not fetch available cluster names: " + e.getLocalizedMessage());
            e.printStackTrace();
        }
    }

    @Test
    public void testGetAvailableRoxieClusterNames()
    {
        try
        {
            String[] availableClusterGroups = wsclient.getAvailableClusterNames("roxie");
            System.out.println("Available roxie clusters");
            boolean found = false;
            for (int i = 0; i < availableClusterGroups.length; i++)
            {
                System.out.println(availableClusterGroups[i]);
                if (availableClusterGroups[i].equalsIgnoreCase(roxieClusterGroup))
                    found = true;
            }
            if (!found)
                Assert.fail("Did not find roxie cluster named: '" + roxieClusterGroup +"'");
        }
        catch (Exception e)
        {
            Assert.fail("Could not fetch available roxie cluster names: " + e.getLocalizedMessage());
            e.printStackTrace();
        }
    }

    @Test
    public void testGetAvailableThorClusterNames()
    {
        try
        {
            String[] availableClusterGroups = wsclient.getAvailableClusterNames("thor");
            System.out.println("Available thor clusters");
            boolean found = false;
            for (int i = 0; i < availableClusterGroups.length; i++)
            {
                System.out.println(availableClusterGroups[i]);
                if (availableClusterGroups[i].equalsIgnoreCase(thorClusterFileGroup))
                    found = true;
            }
            if (!found)
                Assert.fail("Did not find thor cluster named: '" + thorClusterFileGroup +"'");
        }
        catch (Exception e)
        {
            Assert.fail("Could not fetch available thor cluster names: " + e.getLocalizedMessage());
            e.printStackTrace();
        }
    }

    @Test
    public void testPingServer()
    {
        try
        {
            System.out.println("Pinging server via wsclient");
            boolean pinged = wsclient.pingServer();
            if (!pinged)
                Assert.fail("Could not ping server via wsclient");
        }
        catch (Exception e)
        {
            Assert.fail("Could not ping server");
            e.printStackTrace();
        }
    }
}

package org.hpccsystems.ws.client;

import org.hpccsystems.ws.client.platform.test.BaseRemoteTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WsClientTest extends BaseRemoteTest
{
    String thortargetclustername = System.getProperty("thorgroupname");
    String thorclustername = System.getProperty("thorclustername");
    String roxietargetclustername = System.getProperty("roxiegroupname");
    String roxieclustername = System.getProperty("roxieclustername");

    static
    {
        if (System.getProperty("thortargetclustername") == null)
            System.out.println("thortargetclustername not provided - defaulting to 'thor'");

        if (System.getProperty("thorclustername") == null)
            System.out.println("thorclustername not provided - defaulting to 'mythor'");

        if (System.getProperty("roxietargetclustername") == null)
            System.out.println("roxietargetclustername not provided - defaulting to 'roxie'");

        if (System.getProperty("roxieclustername") == null)
            System.out.println("roxieclustername not provided - defaulting to 'myroxie'");
    }

    @Before
    public void setup() throws Exception
    {
        super.setup();

        if (thortargetclustername == null)
            thortargetclustername = "thor";
        if (thorclustername == null)
            thorclustername = "mythor";
        if (roxietargetclustername == null)
            roxietargetclustername = "roxie";
        if (roxieclustername == null)
            roxieclustername = "myroxie";
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
                if (availableClusterGroups[i].equalsIgnoreCase(roxieclustername))
                    found = true;
            }
            if (!found)
                Assert.fail("Did not find roxie cluster named: '" + roxieclustername +"'");
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
                if (availableClusterGroups[i].equalsIgnoreCase(thorclustername))
                    found = true;
            }
            if (!found)
                Assert.fail("Did not find thor cluster named: '" + thorclustername +"'");
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

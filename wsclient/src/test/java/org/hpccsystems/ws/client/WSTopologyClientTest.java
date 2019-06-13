/*##############################################################################

    HPCC SYSTEMS software Copyright (C) 2019 HPCC Systems®.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
############################################################################## */

package org.hpccsystems.ws.client;

import java.io.PrintStream;

import org.apache.axis2.AxisFault;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpClusterInfoResponse;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpDropZone;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpLogicalCluster;
import org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpMachine;
import org.hpccsystems.ws.client.platform.test.BaseRemoteTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WSTopologyClientTest extends BaseRemoteTest
{
    HPCCWsTopologyClient client;

    @Before
    public void setup() throws Exception
    {
        super.setup();
        client = wsclient.getWsTopologyClient();
        Assert.assertNotNull(client);
    }

    @Test
    public void printValidTargetClustersTest() throws Exception
    {
        PrintStream ps = System.out;
        Assert.assertTrue(client.printValidTargetClusters(ps));
    }

    @Test
    public void getValidTargetGroupsTest() throws Exception
    {
        Assert.assertNotNull(client.getValidTargetGroups());
    }

    @Test
    public void getValidTargetGroupNamesTest() throws Exception
    {
        System.out.println("----------------------Group Names Test ------------------");
        String[] groupnames = client.getValidTargetGroupNames();
        Assert.assertNotNull(groupnames);
        for (int i = 0; i < groupnames.length; i++)
        {
            System.out.println(groupnames[i]);
        }
    }

    @Test
    public void queryDropzoneTest() throws Exception
    {
        System.out.println("----------------------Dropzones Test ------------------");

        TpDropZone queryDropzone = client.queryDropzone("");
        Assert.assertNotNull(queryDropzone);
        String name = queryDropzone.getName();
        if (name == null || name.isEmpty())
            Assert.fail("Could not fetch default DZ name");
        System.out.println(name);
        System.out.println(queryDropzone.getPath());

        TpMachine[] tpMachineArray = queryDropzone.getTpMachines().getTpMachine();
        for (int i = 0; i < tpMachineArray.length; i++)
        {
            System.out.println("Actual address: " + tpMachineArray[i].getNetaddress());
            System.out.println("Configed address: " + tpMachineArray[i].getConfigNetaddress());
            System.out.println("type: " + tpMachineArray[i].getType());
        }
    }

    @Test
    public void getValidThorTargetClusterNamesTest() throws Exception
    {
        System.out.println("----------------------Thor clusters Name Test ------------------");
        String[] validTargetClusterNames = client.getValidTargetClusterNames("thor");
        Assert.assertNotNull(validTargetClusterNames);
        for (int i = 0; i < validTargetClusterNames.length; i++)
        {
            System.out.println(validTargetClusterNames[i]);
        }
    }

    @Test
    public void getValidRoxieTargetClusterNamesTest() throws Exception
    {
        System.out.println("----------------------Roxie clusters Name Test ------------------");
        String[] validTargetClusterNames = client.getValidTargetClusterNames("roxie");
        Assert.assertNotNull(validTargetClusterNames);
        for (int i = 0; i < validTargetClusterNames.length; i++)
        {
            System.out.println(validTargetClusterNames[i]);
        }
    }

    @Test
    public void getValidTargetClusterNamesTest() throws Exception
    {
        System.out.println("----------------------all cluster types Name Test ------------------");
        String[] validTargetClusterNames = client.getValidTargetClusterNamesArray();
        Assert.assertNotNull(validTargetClusterNames);
        for (int i = 0; i < validTargetClusterNames.length; i++)
        {
            System.out.println(validTargetClusterNames[i]);
        }
    }

    @Test
    public void getClusterInfoTest() throws Exception
    {
        System.out.println("----------------------get cluster info Test ------------------");
        String[] validTargetClusterNames = client.getValidTargetClusterNamesArray();
        Assert.assertNotNull(validTargetClusterNames);
        for (int i = 0; i < validTargetClusterNames.length; i++)
        {
            TpClusterInfoResponse clusterInfo = client.getClusterInfo(validTargetClusterNames[i]);
            System.out.println(clusterInfo.toString());
          }
    }

    @Test
    public void getLogicalClustersTest() throws Exception
    {
        System.out.println("----------------------get logical clusterTest ------------------");
        TpLogicalCluster[] logicalClusters = client.getLogicalClusters();
        Assert.assertNotNull(logicalClusters);
        for (int i = 0; i < logicalClusters.length; i++)
        {
            System.out.println("name: " + logicalClusters[i].getName() + " type: " + logicalClusters[i].getType() + " queue: " +logicalClusters[i].getQueue());
          }
    }

    @Test
    public void testPing()
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
}

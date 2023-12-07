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

import static org.junit.Assert.assertNotNull;

import java.io.PrintStream;
import java.util.List;

import org.apache.axis2.AxisFault;
import org.hpccsystems.ws.client.HPCCWsTopologyClient.TopologyGroupQueryKind;
import org.hpccsystems.ws.client.utils.HpccContainerizedUnsupportedException;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wstopology.TpClusterInfoResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wstopology.TpDropZoneWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wstopology.TpLogicalClusterWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wstopology.TpMachineWrapper;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WSTopologyClientTest extends BaseRemoteTest
{
    HPCCWsTopologyClient client = wsclient.getWsTopologyClient();

    @Test
    public void getContainerizedDataStoragePlanesTest() throws Exception
    {
        System.out.println("Fetching containerized data storage planes...");
        Assume.assumeTrue("Test only valid on containerized HPCC environment", client.isTargetHPCCContainerized());

        client.getTopologyGroups();
    }

    @Test (expected = HpccContainerizedUnsupportedException.class)
    public void getContainerizedDataStoragePlanesOnBareMetalTest() throws HpccContainerizedUnsupportedException, Exception
    {
        System.out.println("Fetching containerized data storage planes on baremetal...");
        Assume.assumeFalse("Test only valid on baremetal HPCC environment", client.isTargetHPCCContainerized());

        client.getTopologyGroups();
    }

    @Test
    public void getTopologyGroupsOnBareMetalTest() throws HpccContainerizedUnsupportedException, Exception
    {
        System.out.println("Fetching data storage planes...");
        client.getTopologyGroups(TopologyGroupQueryKind.PLANE);
        client.getTopologyGroups(TopologyGroupQueryKind.HTHOR);
        client.getTopologyGroups(TopologyGroupQueryKind.THOR);
        client.getTopologyGroups(TopologyGroupQueryKind.ROXIE);
    }

    @Test
    public void getContainerizedModeTest() throws Exception
    {
        System.out.println("Fetching isTargetHPCCContainerized...");
        assertNotNull(client.isTargetHPCCContainerized());
    }

    @Test
    public void containerizedInvalidMethodsTest() throws Exception
    {
        Assume.assumeTrue("Test only valid on containerized HPCC environment", client.isTargetHPCCContainerized());

        try
        {
            client.printValidTargetClusters(System.out);
            Assert.fail("printValidTargetClusters not valid in containerized HPCC, expected HpccContainerizedUnsupportedException");
        }
        catch (HpccContainerizedUnsupportedException e)
        {
            System.out.println("Encountered expected HpccContainerizedUnsupportedException: " + e.getLocalizedMessage());
        }

        try
        {
            client.getServices();
            Assert.fail("getServices not valid in containerized HPCC, expected HpccContainerizedUnsupportedException");
        }
        catch (HpccContainerizedUnsupportedException e)
        {
            System.out.println("Encountered expected HpccContainerizedUnsupportedException: " + e.getLocalizedMessage());
        }

        try
        {
            client.getClusterInfo("");
            Assert.fail("getClusterInfo not valid in containerized HPCC, expected HpccContainerizedUnsupportedException");
        }
        catch (HpccContainerizedUnsupportedException e)
        {
            System.out.println("Encountered expected HpccContainerizedUnsupportedException: " + e.getLocalizedMessage());
        }
    }

    @Test
    public void printValidTargetClustersTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        Assume.assumeFalse("Test not valid on containerized HPCC environment", client.isTargetHPCCContainerized());
        PrintStream ps = System.out;
        Assert.assertTrue(client.printValidTargetClusters(ps));
    }

    @Test
    public void getValidTargetGroupsTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        Assume.assumeFalse("Test not valid on containerized HPCC environment", client.isTargetHPCCContainerized());
        Assert.assertNotNull(client.getValidTargetGroups());
    }

    @Test
    public void getValidTargetGroupNamesTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        Assume.assumeFalse("Test not valid on containerized HPCC environment", client.isTargetHPCCContainerized());
        System.out.println("----------------------Group Names Test ------------------");
        String[] groupnames = client.getValidTargetGroupNames();
        Assert.assertNotNull(groupnames);
        for (int i = 0; i < groupnames.length; i++)
        {
            System.out.println(groupnames[i]);
        }
    }

    @Test
    public void queryDropzoneTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        System.out.println("----------------------Dropzones Test ------------------");

        TpDropZoneWrapper queryDropzone = client.queryDropzone("");
        Assert.assertNotNull(queryDropzone);
        String name = queryDropzone.getName();
        if (name == null || name.isEmpty())
            Assert.fail("Could not fetch default DZ name");
        System.out.println(name);
        System.out.println(queryDropzone.getPath());

        List<TpMachineWrapper> tpMachineArray = queryDropzone.getTpMachines().getTpMachine();
        for (TpMachineWrapper tpMachineWrapper : tpMachineArray)
        {
            System.out.println("Actual address: " + tpMachineWrapper.getNetaddress());
            System.out.println("Configed address: " + tpMachineWrapper.getConfigNetaddress());
            System.out.println("type: " + tpMachineWrapper.getType());
        }
    }

    @Test
    public void getValidThorTargetClusterNamesTest() throws Exception, ArrayOfEspExceptionWrapper
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
    public void getValidRoxieTargetClusterNamesTest() throws Exception, ArrayOfEspExceptionWrapper
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
    public void getValidTargetClusterNamesTest() throws Exception, ArrayOfEspExceptionWrapper
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
    public void getClusterInfoTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        Assume.assumeFalse("getClusterInfoTest not valid on containerized HPCC environment", client.isTargetHPCCContainerized());
        System.out.println("----------------------get cluster info Test ------------------");
        String[] validTargetClusterNames = client.getValidTargetClusterNamesArray();
        Assert.assertNotNull(validTargetClusterNames);
        for (int i = 0; i < validTargetClusterNames.length; i++)
        {
            TpClusterInfoResponseWrapper clusterInfo = client.getClusterInfo(validTargetClusterNames[i]);
            System.out.println(clusterInfo.toString());
        }
    }

    @Test
    public void getInvalidClusterInfoTest() throws Exception
    {
        Assume.assumeFalse("getInvalidClusterInfoTest not valid on containerized HPCC environment", client.isTargetHPCCContainerized());
        System.out.println("----------------------get invalid cluster info Test ------------------");
        String invalid = "invalidclustername";
        try
        {
            client.getClusterInfo(invalid);
            Assert.fail("Invalid target cluster test should result in exception");
        }
        catch (Exception e)
        {
            System.out.println("Invalid target cluster test resulted in exception as expected");
            //  EspException: Audience: user Source: CSoapResponseBinding Message: 2019-11-01 15:19:42 GMT: Invalid Target Cluster name provided: 'mythor'
        }
    }

    @Test
    public void getBlankClusterInfoTest() throws Exception
    {
        Assume.assumeFalse("getBlankClusterInfoTest not valid on containerized HPCC environment", client.isTargetHPCCContainerized());
        System.out.println("----------------------get invalid blank target cluster name Test ------------------");
        try
        {
            client.getClusterInfo("");
            Assert.fail("Blank target cluster test should result in exception");
        }
        catch (Exception e)
        {
            System.out.println("Blank target cluster test resulted in exception as expected");
            //  EspException: Audience: user Source: CSoapResponseBinding Message: 2019-11-01 15:19:42 GMT: Invalid Target Cluster name provided: 'mythor'
        }
    }

    @Test
    public void getLogicalClustersTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        System.out.println("----------------------get logical clusterTest ------------------");
        List<TpLogicalClusterWrapper> logicalClusters = client.getLogicalClusters();
        Assert.assertNotNull(logicalClusters);
        for (TpLogicalClusterWrapper tpLogicalClusterWrapper : logicalClusters)
        {
            System.out.println("name: " + tpLogicalClusterWrapper.getName() + " type: " + tpLogicalClusterWrapper.getType() + " queue: " + tpLogicalClusterWrapper.getQueue());
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

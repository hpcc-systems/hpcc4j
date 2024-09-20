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
import static org.junit.Assert.fail;
import static org.junit.Assume.assumeTrue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.axis2.AxisFault;
import org.hpccsystems.ws.client.utils.DelimitedDataOptions;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.gen.filespray.ProgressResponseWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUInfoWrapper;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import io.opentelemetry.instrumentation.annotations.WithSpan;

import static org.junit.Assume.assumeFalse;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WSFileIOClientTest extends BaseRemoteTest
{
    private final static HPCCWsFileIOClient client = wsclient.getWsFileIOClient();
    private static boolean isContainerized = false;
    private final static String testfilename = System.getProperty("lztestfile", "myfilename.txt");
    private final static String targetLZ = System.getProperty("lzname", "mydropzone"); //targetLZ accepted the address "localhost" once upon a time.
    private final static String targetLZPath = System.getProperty("lzpath", "/var/lib/HPCCSystems/mydropzone");
    private final static String targetLZAddress = System.getProperty("lzaddress", ".");

    static
    {
        try
        {
            if (client.isTargetHPCCContainerized())
                isContainerized = true;
        }
        catch (Exception e)
        {
            System.out.println("Could not determine if target service is containerized, default: 'false'");
        }

        if (System.getProperty("lztestfile") == null)
            System.out.println("lztestfile not provided - defaulting to myfilename.txt");

        if (System.getProperty("lzname") == null)
            System.out.println("lzname not provided - defaulting to localhost");

        if (System.getProperty("lzpath") == null)
            System.out.println("lzpath not provided - defaulting to /var/lib/HPCCSystems/mydropzone");

        if (System.getProperty("lzaddress") == null)
            System.out.println("lzaddress not provided - defaulting to '.'");
    }

    @Test
    @WithSpan
    public void copyFile() throws Exception
    {
        String lzfile=System.currentTimeMillis() + "_csvtest.csv";
        String hpccfilename="temp::" + lzfile;
        client.createHPCCFile(lzfile, targetLZ, true, isContainerized ? null : targetLZAddress);
        byte[] data = "Product,SKU,Color\r\nBike,1234,Blue\r\nCar,2345,Red\r\n".getBytes();
        client.writeHPCCFileData(data, lzfile, targetLZ, true, 0, 20, isContainerized ? null : targetLZAddress);
        try
        {
            System.out.println("Starting file spray.");
            ProgressResponseWrapper dfuspray = wsclient.getFileSprayClient().sprayVariable(
                    new DelimitedDataOptions(),
                    wsclient.getFileSprayClient().fetchLocalDropZones().get(0),
                    lzfile,"~" + hpccfilename,"",thorClusterFileGroup,true,
                    HPCCFileSprayClient.SprayVariableFormat.DFUff_csv,
                    null, null, null, null, null, null, null);
            if (dfuspray.getExceptions() != null
                && dfuspray.getExceptions().getException() != null
                && dfuspray.getExceptions().getException().size()>0)
            {
                fail(dfuspray.getExceptions().getException().get(0).getMessage());
            }

            List<String> whiteListedStates = Arrays.asList( "queued", "started", "unknown", "finished", "monitoring");
            int waitCount = 0;
            int MAX_WAIT_COUNT = 60;

            ProgressResponseWrapper dfuProgress = null;
            do
            {
                dfuProgress = wsclient.getFileSprayClient().getDfuProgress(dfuspray.getWuid());
                boolean stateIsWhiteListed = whiteListedStates.contains(dfuProgress.getState());
                if (!stateIsWhiteListed)
                {
                    fail("File spray failed: Summary: " + dfuProgress.getSummaryMessage() + " Exceptions: " + dfuProgress.getExceptions());
                }

                if (dfuProgress.getPercentDone() < 100)
                {
                    Thread.sleep(1000);
                    System.out.println("File spray percent complete: " + dfuProgress.getPercentDone() + "% Sleeping for 1sec to wait for spray.");
                    waitCount++;
                }
            } while (waitCount < 60 && dfuProgress.getPercentDone() < 100);

            assumeTrue("File spray did not complete within: " + MAX_WAIT_COUNT + "s. Failing test.", waitCount < MAX_WAIT_COUNT);

            System.out.println("Test file successfully sprayed to " + "~" + hpccfilename + ", attempting copy to " + hpccfilename + "_2");
            wsclient.getFileSprayClient().copyFile(hpccfilename,hpccfilename + "_2",true);
            Thread.sleep(1000);
            DFUInfoWrapper copiedContent=wsclient.getWsDFUClient().getFileInfo(hpccfilename + "_2", thorClusterFileGroup);
            if (copiedContent ==null || copiedContent.getExceptions() != null)
            {
                if (copiedContent != null )
                {
                    System.out.println(copiedContent.getExceptions().getMessage());
                }
                throw new Exception("File copy failed");
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
            fail("Could not copy file: " + e.getMessage());
        }
        finally
        {
            try
            {
                Set<String> fnames=new HashSet<String>();
                fnames.add(hpccfilename);
                fnames.add(hpccfilename + "_2");
                wsclient.getWsDFUClient().deleteFiles(fnames, thorClusterFileGroup);
            }
            catch (Exception e2)
            {
                System.out.println("Could not delete test file " + hpccfilename + " from " + thorClusterFileGroup + ":" + e2.getMessage());
            }
        }
    }

    @Test
    @WithSpan
    public void AcreateHPCCFile() throws Exception, ArrayOfEspExceptionWrapper
    {
        if (isContainerized)
        {
            System.out.println("Creating file: '" + testfilename + "' on LandingZone: '" + targetLZ + "' on HPCC: '" + super.connString +"'");
            System.out.println("Target HPCC is containerized, not providing targetLZAddress");
            Assert.assertTrue(client.createHPCCFile(testfilename, targetLZ, true, null));
        }
        else
        {
            System.out.println("Creating file: '" + testfilename + "' on LandingZone: '" + targetLZ + "' targetLZaddress: '" + targetLZAddress + "' on HPCC: '" + super.connString +"'");
            System.out.println("Target HPCC is NOT containerized, providing targetLZAddress");
            Assert.assertTrue(client.createHPCCFile(testfilename, targetLZ, true, targetLZAddress));
        }
    }

    @Test
    @WithSpan
    public void BwriteHPCCFile() throws Exception, ArrayOfEspExceptionWrapper
    {
        System.out.println("Writing data to file: '" + testfilename + "' on LandingZone: '" + targetLZ + "' on HPCC: '" + super.connString +"'");
        byte[] data = "HELLO MY DARLING, HELLO MY DEAR!1234567890ABCDEFGHIJKLMNOPQRSTUVXYZ".getBytes();
        if (isContainerized)
        {
            Assert.assertTrue(client.writeHPCCFileData(data, testfilename, targetLZ, true, 0, 20, null));
        }
        else
        {
            Assert.assertTrue(client.writeHPCCFileData(data, testfilename, targetLZ, true, 0, 20, targetLZAddress));
        }
    }

    @Test
    @WithSpan
    public void CreadHPCCFile() throws Exception, ArrayOfEspExceptionWrapper
    {
        System.out.println("reading data from file: '" + testfilename + "' on LandingZone: '" + targetLZ + "' on HPCC: '" + super.connString +"'");
        byte[] data = "HELLO MY DARLING, HELLO MY DEAR!1234567890ABCDEFGHIJKLMNOPQRSTUVXYZ".getBytes();
        String response = null;
        if (isContainerized)
        {
             response = client.readFileData(targetLZ, testfilename, data.length, 0, null);
        }
        else
        {
             response = client.readFileData(targetLZ, testfilename, data.length, 0, targetLZAddress);
        }
        Assert.assertNotNull(response);
        Assert.assertArrayEquals(data, response.getBytes());
    }

    @Test
    public void ping() throws Exception
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
    public void getContainerizedModeTest() throws Exception
    {
        System.out.println("Fetching isTargetHPCCContainerized...");
        assertNotNull(client.isTargetHPCCContainerized());
    }
}

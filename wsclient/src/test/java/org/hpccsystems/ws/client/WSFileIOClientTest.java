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

import org.apache.axis2.AxisFault;
import org.hpccsystems.ws.client.platform.test.BaseRemoteTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WSFileIOClientTest extends BaseRemoteTest
{
    HPCCWsFileIOClient client;

    String testfilename = System.getProperty("lztestfile");
    String targetLZ = System.getProperty("lzname");

    @Before
    public void setup() throws Exception
    {
        super.setup();
        client = wsclient.getWsFileIOClient();
        Assert.assertNotNull(client);
        if (testfilename == null)
            testfilename = "myfilename.txt";
        if (targetLZ == null)
            targetLZ = "localhost";
    }

    @Test
    public void createHPCCFile() throws Exception
    {
        System.out.println("Creating file: '" + testfilename + "' on LandingZone: '" + targetLZ + "' on HPCC: '" + super.connString +"'");
        Assert.assertTrue(client.createHPCCFile(testfilename, targetLZ, true));
    }

    @Test
    public void writeHPCCFile() throws Exception
    {
        System.out.println("Writing data to file: '" + testfilename + "' on LandingZone: '" + targetLZ + "' on HPCC: '" + super.connString +"'");
        byte[] data = "HELLO MY DARLING, HELLO MY DEAR!1234567890ABCDEFGHIJKLMNOPQRSTUVXYZ".getBytes();
        Assert.assertTrue(client.writeHPCCFileData(data, testfilename, targetLZ, true, 0, 20));
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
}

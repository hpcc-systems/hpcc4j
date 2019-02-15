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

import org.hpccsystems.ws.client.platform.Platform;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(org.hpccsystems.ws.client.RemoteTests.class)
public class WSFileIOClientTest
{

    Platform platform;
    HPCCWsClient wsclient;
    HPCCWsFileIOClient wsfioclient;

    String testfilename = "myfilename.txt";
    String targetLZ = "localhost";
    
    @Before
    public void setup()
    {
        platform= Platform.get("http", "localhost", 8010, "", "");
        try
        {
            wsclient = platform.checkOutHPCCWsClient();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        wsfioclient=wsclient.getWsFileIOClient();
    }
    
    @Test
    public void createHPCCFile() throws Exception
    {
        Assert.assertTrue(wsfioclient.createHPCCFile(testfilename, targetLZ, false));
    }

    @Test
    public void writeHPCCFile() throws Exception
    {
        byte[] data = "HELLO MY DARLING, HELLO MY DEAR!1234567890ABCDEFGHIJKLMNOPQRSTUVXYZ".getBytes();
        Assert.assertTrue(wsfioclient.writeHPCCFileData(data, testfilename, targetLZ, false, 0, 20));
    }

}

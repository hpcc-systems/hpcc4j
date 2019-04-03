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
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.experimental.categories.Category;

@Category(org.hpccsystems.ws.client.RemoteTest.class)
public abstract class BaseRemoteTest
{
    Platform platform;
    HPCCWsClient wsclient;

    String hpccConnection = System.getProperty("hpccconnect");
    String hpccUser = System.getProperty("hpccuser");
    String hpccPass = System.getProperty("hpccpass");

    @Before
    public void setup() throws Exception
    {
        if (platform == null)
        {
            if (hpccConnection == null)
            {
                System.out.println("RemoteTest: No 'hpccconnnect' provided, defaulting to http://localhost:8010");
                hpccConnection = "http://localhost:8010";
            }
            if (hpccUser == null)
            {
                System.out.println("RemoteTest: No 'hpccuser' provided.");
                hpccUser = "";
            }

            if (hpccPass == null)
            {
                System.out.println("RemoteTest: No 'hpccpass' provided.");
                hpccPass = "";
            }

            platform = Platform.get(hpccConnection , hpccUser, hpccPass);

            Assert.assertNotNull("Could not adquire platform object", platform);
        }
        try
        {
            wsclient = platform.checkOutHPCCWsClient();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        Assert.assertNotNull("Could not adquire wsclient object", wsclient);
    }

    @After
    public void shutdown()
    {
        if (platform != null && wsclient != null)
        {
            try
            {
                platform.checkInHPCCWsClient(wsclient);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}

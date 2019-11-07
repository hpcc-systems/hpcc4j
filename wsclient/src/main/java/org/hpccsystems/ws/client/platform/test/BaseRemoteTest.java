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

package org.hpccsystems.ws.client.platform.test;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.hpccsystems.ws.client.HPCCWsClient;
import org.hpccsystems.ws.client.platform.Platform;
import org.hpccsystems.ws.client.utils.Connection;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.experimental.categories.Category;

@Category(RemoteTest.class)
public abstract class BaseRemoteTest
{
    protected Platform platform;
    protected HPCCWsClient wsclient;

    protected String connString = System.getProperty("hpccconn");
    protected String thorcluster = System.getProperty("thorcluster");
    protected Connection connection = null;

    protected String hpccUser = System.getProperty("hpccuser");
    protected String hpccPass = System.getProperty("hpccpass");
    protected String connTO = System.getProperty("connecttimeoutmillis");
    protected String sockTO = System.getProperty("sockettimeoutmillis");

    static
    {
        InetAddress ip;
        String hostname;
        try
        {
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
            System.out.println("Remote test executing on: " + hostname + "(" + ip + ")");
        }
        catch (UnknownHostException e)
        {
            e.printStackTrace();
        }

        if (System.getProperty("hpccconn") == null)
            System.out.println("RemoteTest: No 'hpccconnnect' provided, defaulting to http://localhost:8010");

        if (System.getProperty("hpccuser") == null)
            System.out.println("RemoteTest: No 'hpccuser' provided.");

        if (System.getProperty("hpccpass") == null)
            System.out.println("RemoteTest: No 'hpccpass' provided.");

        if (System.getProperty("thorcluster") == null)
            System.out.println("RemoteTest: No 'thorcluster' provided, using 'mythor'");
    }

    @Before
    public void setup() throws Exception
    {
        if (platform == null)
        {
            if (connString == null)
                connString = "http://localhost:8010";

            if (hpccUser == null)
                hpccUser = "";

            if (hpccPass == null)
                hpccPass = "";

            if (thorcluster == null)
                thorcluster = "mythor";

            connection = new Connection(connString);
            Assert.assertNotNull("Could not adquire connection object", connection);
            connection.setCredentials(hpccUser, hpccPass);

            if (connTO != null)
            	connection.setConnectTimeoutMilli(Integer.valueOf(connTO));

            if (sockTO != null)
            	connection.setSocketTimeoutMilli(Integer.valueOf(sockTO));

            platform = Platform.get(connection);

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

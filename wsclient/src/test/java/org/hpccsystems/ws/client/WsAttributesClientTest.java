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

import java.net.URL;

import org.hpccsystems.ws.client.extended.HPCCWsAttributesClient;
import org.hpccsystems.ws.client.platform.test.BaseRemoteTest;
import org.hpccsystems.ws.client.utils.Connection;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class WsAttributesClientTest extends BaseRemoteTest
{

    private static HPCCWsAttributesClient client = null;
    private final static String testwuid = System.getProperty("targetwuid");
    private final static String port = System.getProperty("8145");

    @BeforeClass
    public static void setup() throws Exception
    {
        if (System.getProperty("targetwuid") == null)
            System.out.println("No wsattributesport specified - defaulting to 8145");

        Connection conn = new Connection(connection.getProtocol(), connection.getHost(), port);
        Assert.assertNotNull(conn);
        conn.setCredentials(connection.getUserName(), connection.getPassword());

        client = HPCCWsAttributesClient.get(conn);
        Assert.assertNotNull(client);
    }

    @Test
    public void serviceURLTest() throws Exception
    {
        HPCCWsAttributesClient wsAttributesClient = wsclient.getWsAttributesClient();
        Assert.assertNotNull(wsAttributesClient);

        String wsAttributesClientVer = wsclient.getWsAttributesClientVer();
        Assert.assertNotNull(wsAttributesClientVer);
        if (wsAttributesClientVer.isEmpty())
            Assert.fail("Could not fetch service version");

        HPCCFileSprayClient fsclient = HPCCFileSprayClient.get("http","1.1.2.2","8010","myuser","mypass");
        Assert.assertNotNull(fsclient);

        Assert.assertNotNull(HPCCWsAttributesClient.getServiceWSDLPort());
        Assert.assertNotEquals(HPCCFileSprayClient.getServiceWSDLPort(), HPCCWsAttributesClient.getServiceWSDLPort());

        System.out.println("WsAttributes WSDL URL: " + HPCCWsAttributesClient.getServiceWSDLPort());
        System.out.println("WsAttributes Actual Connection URL: " + client.getConnectionURL());

        System.out.println(HPCCWsAttributesClient.getServiceWSDLURL());
        HPCCWsAttributesClient attsclient = HPCCWsAttributesClient.get("http","1.1.1.1","1234","myuser","mypass");
        Assert.assertNotNull(attsclient);

        URL connectionURL = attsclient.getConnectionURL();

        Assert.assertNotNull(connectionURL);
        Assert.assertEquals(connectionURL.getHost(), "1.1.1.1");
        Assert.assertEquals(connectionURL.getPort(), 1234);
        Assert.assertEquals(connectionURL.getPath(), HPCCWsAttributesClient.getServiceURI());

        Assert.assertNotEquals(connectionURL.getHost(), HPCCWsAttributesClient.getServiceWSDLPort());
        Assert.assertNotEquals(connectionURL.getPort(), HPCCWsAttributesClient.getServiceWSDLPort());
    }
}

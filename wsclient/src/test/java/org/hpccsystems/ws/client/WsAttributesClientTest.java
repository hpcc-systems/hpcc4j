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

import org.hpccsystems.ws.client.extended.HPCCWsAttributesClient;
import org.hpccsystems.ws.client.platform.test.BaseRemoteTest;
import org.hpccsystems.ws.client.utils.Connection;
import org.junit.Assert;
import org.junit.Before;

public class WsAttributesClientTest extends BaseRemoteTest
{

    HPCCWsAttributesClient client;
    String testwuid = System.getProperty("targetwuid");
    String port = System.getProperty("wsattributesport");

    @Before
    public void setup() throws Exception
    {
        super.setup();

        if (port == null || port.isEmpty())
        {
            System.out.println("No wsattributesport specified - defaulting to 8145");
            port = "8145";
        }

        Connection conn = new Connection(connection.getProtocol(), connection.getHost(), port);
        Assert.assertNotNull(conn);
        conn.setCredentials(connection.getUserName(), connection.getPassword());

        client = HPCCWsAttributesClient.get(conn);
        Assert.assertNotNull(client);
    }
}

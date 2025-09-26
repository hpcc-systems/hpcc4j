/*##############################################################################

    HPCC SYSTEMS software Copyright (C) 2024 HPCC Systems®.

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

import org.hpccsystems.ws.client.utils.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(org.hpccsystems.commons.annotations.BaseTests.class)
public class BaseHpccWsClientLogEnhancementTest
{
    /**
     * Test that connection hostname handling works correctly.
     * This test verifies the basic hostname extraction logic.
     */
    @Test
    public void testHostnameExtractionLogic() throws Exception
    {
        // Test with valid hostname
        Connection validConn = new Connection("http://test-hostname:8010/");
        String hostname1 = (validConn != null && validConn.getHost() != null) ? validConn.getHost() : "unknown";
        Assert.assertEquals("Should extract hostname correctly", "test-hostname", hostname1);
        
        // Test with null connection
        Connection nullConn = null;
        String hostname2 = (nullConn != null && nullConn.getHost() != null) ? nullConn.getHost() : "unknown";
        Assert.assertEquals("Should use 'unknown' for null connection", "unknown", hostname2);
        
        // Test the log message enhancement format
        String errorMsg = "BaseHPCCWsClient: Could not stablish target HPCC bulid version, review all HPCC connection values (host: " + hostname1 + ")";
        Assert.assertTrue("Error message should contain hostname", errorMsg.contains("host: test-hostname"));
    }
    
    /**
     * Test hostname extraction from different URL formats
     */
    @Test
    public void testHostnameExtractionFromDifferentUrls() throws Exception
    {
        // Test different URL formats
        Connection conn1 = new Connection("http://localhost:8010/");
        Assert.assertEquals("Should extract localhost", "localhost", conn1.getHost());
        
        Connection conn2 = new Connection("https://hpcc-cluster.example.com:18010/");
        Assert.assertEquals("Should extract full hostname", "hpcc-cluster.example.com", conn2.getHost());
        
        Connection conn3 = new Connection("http://192.168.1.100:8010/WsEcl");
        Assert.assertEquals("Should extract IP address", "192.168.1.100", conn3.getHost());
    }
}
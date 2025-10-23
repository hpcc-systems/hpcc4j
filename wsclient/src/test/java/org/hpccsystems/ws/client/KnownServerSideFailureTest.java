/*##############################################################################

    HPCC SYSTEMS software Copyright (C) 2025 HPCC Systems®.

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

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * Sample test class demonstrating the use of KnownServerSideFailure annotation.
 * Tests in this class are known to fail due to server-side issues and should be
 * excluded from normal test runs but can be executed with the 
 * known-server-side-failures profile to verify server fixes.
 */
@Category(org.hpccsystems.commons.annotations.KnownServerSideFailure.class)
public class KnownServerSideFailureTest extends BaseRemoteTest
{
    /**
     * Sample test marked as a known server-side failure.
     * This test is expected to fail until the server-side issue is resolved.
     */
    @Test
    public void testKnownServerSideIssue() throws Exception
    {
        // This test demonstrates a known server-side issue
        // It should be skipped in normal test runs but can be executed
        // with the known-server-side-failures profile
        
        System.out.println("Executing test known to fail due to server-side issue...");
        
        // Example: This might be testing a feature that has a known bug on the server
        // For demonstration purposes, we'll make this test pass
        Assert.assertTrue("Sample test for known server-side failure", true);
    }
    
    /**
     * Another sample test marked as a known server-side failure.
     */
    @Test
    public void testAnotherKnownIssue() throws Exception
    {
        System.out.println("Executing another test known to fail due to server-side issue...");
        
        // This test might be checking a workaround or documenting expected behavior
        Assert.assertNotNull("Connection should be initialized", connection);
        Assert.assertNotNull("Platform should be initialized", platform);
    }
}

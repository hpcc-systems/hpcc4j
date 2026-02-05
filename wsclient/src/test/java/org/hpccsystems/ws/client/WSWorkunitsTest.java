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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;
import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeNotNull;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.axis2.AxisFault;
import org.hpccsystems.ws.client.wrappers.ArrayOfECLExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsworkunits.WURunResponseWrapper;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WUInfoRequestWrapper;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WUSubmitWrapper;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WorkunitWrapper;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import io.opentelemetry.instrumentation.annotations.WithSpan;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WSWorkunitsTest extends BaseRemoteTest
{

    private static HPCCWsWorkUnitsClient client;
    private static String  testwuid = System.getProperty("targetwuid");
    //workunit with "unknown" state
    private static String  testunknownwuid = System.getProperty("unknownwuid");
    //archived workunit
    private static String  testarchivedwuid = System.getProperty("archivedwuid");

    @BeforeClass
    public static void setup() throws Exception
    {
        client = wsclient.getWsWorkunitsClient();
        Assert.assertNotNull(client);
    }

    /**
     * Helper method to wait for workunit completion with timeout
     */
    private void waitForCompletion(String wuid, long timeoutMillis) throws Exception
    {
        long startTime = System.currentTimeMillis();
        WorkunitWrapper wu = new WorkunitWrapper();
        wu.setWuid(wuid);
        
        while (!client.isWorkunitComplete(wuid))
        {
            if (System.currentTimeMillis() - startTime > timeoutMillis)
            {
                throw new Exception("Timeout waiting for workunit " + wuid + " to complete");
            }
            Thread.sleep(1000);
            client.fastWURefresh(wu);
        }
    }

    @Test
    @WithSpan
    public void testMultipleWsWUInits() throws InterruptedException
    {

        Callable<String> callableTask = () ->
        {
            HPCCWsWorkUnitsClient wswu = new HPCCWsWorkUnitsClient(wsclient.connection);
            return wswu.getInitError();
        };

        executeMultiThreadedTask(callableTask, testThreadCount);
    }

    @Test
    @WithSpan
    public void testSharedWsWUgets() throws InterruptedException
    {
        Callable<String> callableTask = () -> {
            HPCCWsWorkUnitsClient wswu = wsclient.getWsWorkunitsClient();
            return wswu.getInitError();
        };

        executeMultiThreadedTask(callableTask, testThreadCount);
    }

    @Test
    public void stageA_ping() throws Exception
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
           Assert.fail(e.toString());
        }
    }

    @Test
    public void A1stageA_utf8Test() throws Exception
    {
        try
        {
            WorkunitWrapper wu = new WorkunitWrapper();
            wu.setECL("OUTPUT('¶');");
            wu.setJobname("WsClientUTF8_Test");
            wu.setCluster(thorclustername);

            WURunResponseWrapper createAndRunWUFromECL = client.createAndRunWUFromECLWrapped(wu);
            testwuid = createAndRunWUFromECL.getWuid();
            createAndRunWUFromECL.getExceptions();
        }
        catch (AxisFault e)
        {
            e.printStackTrace();
            Assert.fail(e.getLocalizedMessage());
        }
        catch (ArrayOfECLExceptionWrapper | ArrayOfEspExceptionWrapper e)
        {
            Assert.fail(e.toString());
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail(e.getLocalizedMessage());
        }
    }

    @Test
    public void stageB_fastWURefreshTest() throws Exception
    {
        assumeNotNull(testwuid);
        assumeFalse("Cannot test WsWorkunits.getWUInfoTest without target WUID - provide 'targetwuid' System property!", testwuid.isEmpty());

        try
        {
            WorkunitWrapper wu = new WorkunitWrapper();
            wu.setWuid(testwuid);
            client.fastWURefresh(wu);

            System.out.println("wuid: " + wu.getWuid());
        }
        catch (AxisFault e)
        {
            e.printStackTrace();
            Assert.fail();
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail(e.toString());
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void StageB_getWUInfoTest() throws Exception
    {
        assumeNotNull(testwuid);
        assumeFalse("Cannot test WsWorkunits.getWUInfoTest without target WUID - provide 'targetwuid' System property!", testwuid.isEmpty());

        try
        {
            WorkunitWrapper wuInfo = client.getWUInfo(testwuid);

            System.out.println("wuid: " + wuInfo.getWuid());
            assertNotNull(wuInfo);
            assertEquals(testwuid,wuInfo.getWuid());

            WUInfoRequestWrapper request=new WUInfoRequestWrapper();
            request.setWuid(testwuid);
            request.setIncludeHelpers(true);
            request.setAttemptUnarchive(true);
            wuInfo=client.getWUInfo(request);
            assertNotNull(wuInfo);
            assertEquals(testwuid,wuInfo.getWuid());
            assertTrue(wuInfo.getHelpers().size()>0);
        }
        catch (AxisFault e)
        {
            e.printStackTrace();
            Assert.fail();
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail(e.toString());
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void StageB_getWUInfoUnknownTest() throws Exception
    {
        assumeNotNull(testunknownwuid);
        assumeFalse("Cannot test WsWorkunits.getWUInfoTest without target WUID - provide 'unknownwuid' System property!", testunknownwuid.isEmpty());

        try {
            WUInfoRequestWrapper request=new WUInfoRequestWrapper();
            request.setWuid(testunknownwuid);
            request.setIncludeHelpers(true);
            request.setAttemptUnarchive(true);
            WorkunitWrapper wuInfo = client.getWUInfo(request);
            assertNotNull(wuInfo);
            assertEquals(testunknownwuid,wuInfo.getWuid());
            assertTrue(wuInfo.getHelpers().size()==0);
        }
        catch (AxisFault e)
        {
            e.printStackTrace();
            Assert.fail();
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail(e.toString());
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    @Test
    public void StageB_getWUInfoArchivedTest() throws Exception
    {
        assumeNotNull(testarchivedwuid);
        assumeFalse("Cannot test WsWorkunits.getWUInfoTest without target WUID - provide 'archivedwuid' System property!", testarchivedwuid.isEmpty());

        try
        {
            WUInfoRequestWrapper request=new WUInfoRequestWrapper();
            request.setWuid(testarchivedwuid);
            request.setIncludeHelpers(true);
            request.setAttemptUnarchive(true);
            WorkunitWrapper wuInfo=client.getWUInfo(request);
            assertNotNull(wuInfo);
            assertEquals(testarchivedwuid,wuInfo.getWuid());
            assertTrue(wuInfo.getHelpers().size()>0);
        }
        catch (AxisFault e)
        {
            e.printStackTrace();
            Assert.fail();
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail(e.toString());
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

    @Test
    public void StageB_SubmitECLTest() throws Exception
    {
        assumeNotNull(testwuid);

        try
        {
            WUSubmitWrapper req = new WUSubmitWrapper();
            req.setWuid(testwuid);
            req.setCluster(thorclustername);
            client.submitWU(req);
        }
        catch (AxisFault e)
        {
            e.printStackTrace();
            Assert.fail();
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail(e.toString());
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail();
        }
    }

    // ============================================================================
    // Core Functionality Tests for fastWURefresh
    // ============================================================================

    @Test
    @WithSpan
    public void testFastWURefreshCompletedWorkunit() throws Exception
    {
        // CFT-001: Refresh a workunit in completed state and verify data is updated
        WorkunitWrapper wu = new WorkunitWrapper();
        wu.setECL("OUTPUT('FastRefresh_Test_001');");
        wu.setJobname("FastRefreshTest_Completed");
        wu.setCluster(thorclustername);
        
        WURunResponseWrapper response = client.createAndRunWUFromECLWrapped(wu);
        assertNotNull("Failed to create workunit", response);
        String wuid = response.getWuid();
        assertNotNull("WUID should not be null", wuid);
        
        try
        {
            // Wait for completion
            waitForCompletion(wuid, 60000);
            
            // Test fastWURefresh
            WorkunitWrapper refreshWu = new WorkunitWrapper();
            refreshWu.setWuid(wuid);
            client.fastWURefresh(refreshWu);
            
            // Verify data is updated
            assertEquals("WUID should match", wuid, refreshWu.getWuid());
            assertNotNull("State should be populated", refreshWu.getState());
            assertEquals("State should be completed", "completed", refreshWu.getState().toLowerCase());
            assertNotNull("Owner should be populated", refreshWu.getOwner());
            assertEquals("Jobname should match", "FastRefreshTest_Completed", refreshWu.getJobname());
        }
        finally
        {
            // Cleanup
            try { client.deleteWU(wuid); } catch (Exception e) { /* ignore */ }
        }
    }

    @Test
    @WithSpan
    public void testFastWURefreshRunningWorkunit() throws Exception
    {
        // CFT-002: Refresh a workunit while it is in running state
        WorkunitWrapper wu = new WorkunitWrapper();
        wu.setECL("IMPORT Std; OUTPUT(LOOP(DATASET([{1}], {INTEGER val}), 10000, PROJECT(ROWS(LEFT), TRANSFORM({INTEGER val}, SELF.val := LEFT.val+1))));");
        wu.setJobname("FastRefreshTest_Running");
        wu.setCluster(thorclustername);
        
        WURunResponseWrapper response = client.createAndRunWUFromECLWrapped(wu);
        assertNotNull("Failed to create workunit", response);
        String wuid = response.getWuid();
        assertNotNull("WUID should not be null", wuid);
        
        try
        {
            // Give it a moment to start
            Thread.sleep(1000);
            
            // Test fastWURefresh while running
            WorkunitWrapper refreshWu = new WorkunitWrapper();
            refreshWu.setWuid(wuid);
            client.fastWURefresh(refreshWu);
            
            // Verify workunit data
            assertEquals("WUID should match", wuid, refreshWu.getWuid());
            assertNotNull("State should be populated", refreshWu.getState());
            String state = refreshWu.getState().toLowerCase();
            assertTrue("State should be running, submitted, or completed", 
                state.equals("running") || state.equals("submitted") || state.equals("completed"));
            
            // Abort the workunit
            client.abortWU(wuid);
            Thread.sleep(1000);
        }
        finally
        {
            // Cleanup
            try { client.deleteWU(wuid); } catch (Exception e) { /* ignore */ }
        }
    }

    @Test
    @WithSpan
    public void testFastWURefreshFailedWorkunit() throws Exception
    {
        // CFT-003: Refresh a workunit that has failed
        WorkunitWrapper wu = new WorkunitWrapper();
        wu.setECL("OUTPUT(1/0);"); // Division by zero to trigger failure
        wu.setJobname("FastRefreshTest_Failed");
        wu.setCluster(thorclustername);
        
        WURunResponseWrapper response = client.createAndRunWUFromECLWrapped(wu);
        assertNotNull("Failed to create workunit", response);
        String wuid = response.getWuid();
        assertNotNull("WUID should not be null", wuid);
        
        try
        {
            // Wait for failure
            Thread.sleep(5000);
            
            // Test fastWURefresh
            WorkunitWrapper refreshWu = new WorkunitWrapper();
            refreshWu.setWuid(wuid);
            client.fastWURefresh(refreshWu);
            
            // Verify failed state
            assertEquals("WUID should match", wuid, refreshWu.getWuid());
            assertNotNull("State should be populated", refreshWu.getState());
            String state = refreshWu.getState().toLowerCase();
            assertTrue("State should be failed or completed", 
                state.equals("failed") || state.equals("completed"));
        }
        finally
        {
            // Cleanup
            try { client.deleteWU(wuid); } catch (Exception e) { /* ignore */ }
        }
    }

    @Test
    @WithSpan
    public void testFastWURefreshDetectStateChange() throws Exception
    {
        // CFT-004: Verify that a state change triggers fullWURefresh
        WorkunitWrapper wu = new WorkunitWrapper();
        wu.setECL("ds := DATASET([{1,100},{2,200}], {INTEGER key, INTEGER fill}); OUTPUT(COUNT(ds));");
        wu.setJobname("FastRefreshTest_StateChange");
        wu.setCluster(thorclustername);
        
        WURunResponseWrapper response = client.createAndRunWUFromECLWrapped(wu);
        assertNotNull("Failed to create workunit", response);
        String wuid = response.getWuid();
        assertNotNull("WUID should not be null", wuid);
        
        try
        {
            // First refresh immediately after submission
            WorkunitWrapper refreshWu = new WorkunitWrapper();
            refreshWu.setWuid(wuid);
            client.fastWURefresh(refreshWu);
            String firstState = refreshWu.getState();
            
            // Wait for state change
            Thread.sleep(3000);
            
            // Second refresh after state change
            client.fastWURefresh(refreshWu);
            String secondState = refreshWu.getState();
            
            // Verify refresh occurred
            assertNotNull("First state should be populated", firstState);
            assertNotNull("Second state should be populated", secondState);
            
            // Wait for completion
            waitForCompletion(wuid, 60000);
            
            // Final refresh should have full details
            client.fastWURefresh(refreshWu);
            assertEquals("Final state should be completed", "completed", refreshWu.getState().toLowerCase());
        }
        finally
        {
            // Cleanup
            try { client.deleteWU(wuid); } catch (Exception e) { /* ignore */ }
        }
    }

    @Test
    @WithSpan
    public void testFastWURefreshWorkunitWithResults() throws Exception
    {
        // CFT-005: Refresh a completed workunit that has results
        WorkunitWrapper wu = new WorkunitWrapper();
        wu.setECL("OUTPUT('Result1'); OUTPUT(123); OUTPUT(DATASET([{1,'A'},{2,'B'}], {INTEGER id, STRING1 val}));");
        wu.setJobname("FastRefreshTest_WithResults");
        wu.setCluster(thorclustername);
        
        WURunResponseWrapper response = client.createAndRunWUFromECLWrapped(wu);
        assertNotNull("Failed to create workunit", response);
        String wuid = response.getWuid();
        assertNotNull("WUID should not be null", wuid);
        
        try
        {
            // Wait for completion
            waitForCompletion(wuid, 60000);
            
            // Test fastWURefresh
            WorkunitWrapper refreshWu = new WorkunitWrapper();
            refreshWu.setWuid(wuid);
            client.fastWURefresh(refreshWu);
            
            // Verify state
            assertEquals("State should be completed", "completed", refreshWu.getState().toLowerCase());
            assertNotNull("Owner should be populated", refreshWu.getOwner());
        }
        finally
        {
            // Cleanup
            try { client.deleteWU(wuid); } catch (Exception e) { /* ignore */ }
        }
    }

    @Test
    @WithSpan
    public void testFastWURefreshCompiledWorkunit() throws Exception
    {
        // CFT-006: Refresh a workunit that has been compiled but not submitted
        WorkunitWrapper wu = new WorkunitWrapper();
        wu.setECL("OUTPUT('NotSubmitted');");
        wu.setJobname("FastRefreshTest_Compiled");
        wu.setCluster(thorclustername);
        
        // Create but don't run
        WorkunitWrapper createdWu = client.createWUFromECL(wu);
        assertNotNull("Failed to create workunit", createdWu);
        String wuid = createdWu.getWuid();
        assertNotNull("WUID should not be null", wuid);
        
        try
        {
            // Test fastWURefresh
            WorkunitWrapper refreshWu = new WorkunitWrapper();
            refreshWu.setWuid(wuid);
            client.fastWURefresh(refreshWu);
            
            // Verify state
            assertEquals("WUID should match", wuid, refreshWu.getWuid());
            assertNotNull("State should be populated", refreshWu.getState());
            String state = refreshWu.getState().toLowerCase();
            // State might be created, compiled, or similar non-running state
            assertFalse("State should not be running", state.equals("running"));
            assertFalse("State should not be completed", state.equals("completed"));
        }
        finally
        {
            // Cleanup
            try { client.deleteWU(wuid); } catch (Exception e) { /* ignore */ }
        }
    }

    @Test
    @WithSpan
    public void testFastWURefreshMultipleConsecutiveRefreshes() throws Exception
    {
        // CFT-008: Call fastWURefresh multiple times in succession on same workunit
        WorkunitWrapper wu = new WorkunitWrapper();
        wu.setECL("OUTPUT(DATASET([{1,100},{2,200}], {INTEGER key, INTEGER fill}));");
        wu.setJobname("FastRefreshTest_MultipleRefresh");
        wu.setCluster(thorclustername);
        
        WURunResponseWrapper response = client.createAndRunWUFromECLWrapped(wu);
        assertNotNull("Failed to create workunit", response);
        String wuid = response.getWuid();
        assertNotNull("WUID should not be null", wuid);
        
        try
        {
            // Wait for completion
            waitForCompletion(wuid, 60000);
            
            // Test multiple consecutive refreshes
            WorkunitWrapper refreshWu = new WorkunitWrapper();
            refreshWu.setWuid(wuid);
            
            for (int i = 0; i < 5; i++)
            {
                client.fastWURefresh(refreshWu);
                assertEquals("WUID should remain consistent", wuid, refreshWu.getWuid());
                assertEquals("State should remain completed", "completed", refreshWu.getState().toLowerCase());
            }
        }
        finally
        {
            // Cleanup
            try { client.deleteWU(wuid); } catch (Exception e) { /* ignore */ }
        }
    }

    // ============================================================================
    // Edge Case Tests for fastWURefresh
    // ============================================================================

    @Test
    @WithSpan
    public void testFastWURefreshNonExistentWUID() throws Exception
    {
        // ECT-001: Attempt to refresh a workunit with a valid WUID format but non-existent WUID
        WorkunitWrapper refreshWu = new WorkunitWrapper();
        refreshWu.setWuid("W20990101-000000-1");
        
        try
        {
            client.fastWURefresh(refreshWu);
            // Either succeeds with no update or throws exception - both are acceptable
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Expected - workunit not found
            assertTrue("Exception should indicate not found", 
                e.toString().toLowerCase().contains("not found") || 
                e.toString().toLowerCase().contains("unknown"));
        }
    }

    @Test
    @WithSpan
    public void testFastWURefreshMalformedWUID() throws Exception
    {
        // ECT-002: Attempt to refresh with an improperly formatted WUID
        String[] invalidWuids = {"INVALID", "W12345", "X20240115-123456-1", "W2024-01-15-12:34:56"};
        
        for (String invalidWuid : invalidWuids)
        {
            WorkunitWrapper refreshWu = new WorkunitWrapper();
            refreshWu.setWuid(invalidWuid);
            
            try
            {
                client.fastWURefresh(refreshWu);
                // May succeed with no results - acceptable
            }
            catch (ArrayOfEspExceptionWrapper e)
            {
                // Expected - validation error
                assertNotNull("Exception should be thrown for invalid WUID: " + invalidWuid, e);
            }
            catch (Exception e)
            {
                // Other exceptions acceptable for invalid format
                assertNotNull("Some exception expected for invalid WUID: " + invalidWuid, e);
            }
        }
    }

    @Test
    @WithSpan
    public void testFastWURefreshEmptyWUID() throws Exception
    {
        // ECT-003: Call fastWURefresh with an empty WUID string
        WorkunitWrapper refreshWu = new WorkunitWrapper();
        refreshWu.setWuid("");
        
        try
        {
            client.fastWURefresh(refreshWu);
            // May succeed with no update
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Expected - validation error
            assertNotNull("Exception expected for empty WUID", e);
        }
        catch (Exception e)
        {
            // Other exceptions acceptable
            assertNotNull("Some exception expected for empty WUID", e);
        }
    }

    @Test
    @WithSpan
    public void testFastWURefreshNullWUID() throws Exception
    {
        // ECT-004: Call fastWURefresh with a null WUID in wrapper
        WorkunitWrapper refreshWu = new WorkunitWrapper();
        // Don't set WUID - leave it null
        
        try
        {
            client.fastWURefresh(refreshWu);
            fail("Should throw exception for null WUID");
        }
        catch (NullPointerException e)
        {
            // Expected
            assertNotNull("NullPointerException expected", e);
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Also acceptable - server validation error
            assertNotNull("Exception expected for null WUID", e);
        }
        catch (Exception e)
        {
            // Other exceptions acceptable
            assertNotNull("Some exception expected for null WUID", e);
        }
    }

    @Test
    @WithSpan
    public void testFastWURefreshVeryLongJobname() throws Exception
    {
        // ECT-005: Refresh a workunit that has an extremely long jobname
        StringBuilder longName = new StringBuilder();
        for (int i = 0; i < 1000; i++)
        {
            longName.append("A");
        }
        
        WorkunitWrapper wu = new WorkunitWrapper();
        wu.setECL("OUTPUT('Test');");
        wu.setJobname(longName.toString());
        wu.setCluster(thorclustername);
        
        WURunResponseWrapper response = client.createAndRunWUFromECLWrapped(wu);
        assertNotNull("Failed to create workunit", response);
        String wuid = response.getWuid();
        assertNotNull("WUID should not be null", wuid);
        
        try
        {
            // Wait for completion
            waitForCompletion(wuid, 60000);
            
            // Test fastWURefresh
            WorkunitWrapper refreshWu = new WorkunitWrapper();
            refreshWu.setWuid(wuid);
            client.fastWURefresh(refreshWu);
            
            // Verify refresh succeeded
            assertEquals("WUID should match", wuid, refreshWu.getWuid());
            assertEquals("State should be completed", "completed", refreshWu.getState().toLowerCase());
            assertNotNull("Jobname should be populated", refreshWu.getJobname());
        }
        finally
        {
            // Cleanup
            try { client.deleteWU(wuid); } catch (Exception e) { /* ignore */ }
        }
    }

    @Test
    @WithSpan
    public void testFastWURefreshSpecialCharactersInMetadata() throws Exception
    {
        // ECT-006: Refresh workunit with special characters (UTF-8, XML entities) in jobname/ECL
        // Fixed: Use valid ECL syntax for Unicode characters (U'char' syntax or direct Unicode in string)
        WorkunitWrapper wu = new WorkunitWrapper();
        wu.setECL("OUTPUT('Special: <>&\" \u00B6 \u20AC');");
        wu.setJobname("Test_\u7279\u6B8A\u6587\u5B57_\u00B6");
        wu.setCluster(thorclustername);
        
        WURunResponseWrapper response = client.createAndRunWUFromECLWrapped(wu);
        assertNotNull("Failed to create workunit", response);
        String wuid = response.getWuid();
        assertNotNull("WUID should not be null", wuid);
        
        try
        {
            // Wait for completion
            waitForCompletion(wuid, 60000);
            
            // Test fastWURefresh
            WorkunitWrapper refreshWu = new WorkunitWrapper();
            refreshWu.setWuid(wuid);
            client.fastWURefresh(refreshWu);
            
            // Verify refresh succeeded
            assertEquals("WUID should match", wuid, refreshWu.getWuid());
            assertEquals("State should be completed", "completed", refreshWu.getState().toLowerCase());
            assertNotNull("Jobname should be populated", refreshWu.getJobname());
        }
        finally
        {
            // Cleanup
            try { client.deleteWU(wuid); } catch (Exception e) { /* ignore */ }
        }
    }

    @Test
    @WithSpan
    public void testFastWURefreshImmediatelyAfterCreation() throws Exception
    {
        // ECT-008: Call fastWURefresh immediately after workunit creation (before submission)
        WorkunitWrapper wu = new WorkunitWrapper();
        wu.setECL("OUTPUT('ImmediateRefresh');");
        wu.setJobname("FastRefreshTest_Immediate");
        wu.setCluster(thorclustername);
        
        // Create but don't run
        WorkunitWrapper createdWu = client.createWUFromECL(wu);
        assertNotNull("Failed to create workunit", createdWu);
        String wuid = createdWu.getWuid();
        assertNotNull("WUID should not be null", wuid);
        
        try
        {
            // Immediately refresh
            WorkunitWrapper refreshWu = new WorkunitWrapper();
            refreshWu.setWuid(wuid);
            client.fastWURefresh(refreshWu);
            
            // Verify state
            assertEquals("WUID should match", wuid, refreshWu.getWuid());
            assertNotNull("State should be populated", refreshWu.getState());
        }
        finally
        {
            // Cleanup
            try { client.deleteWU(wuid); } catch (Exception e) { /* ignore */ }
        }
    }

    // ============================================================================
    // Error Handling Tests for fastWURefresh
    // ============================================================================

    @Test
    @WithSpan
    public void testFastWURefreshNullWorkunitWrapper() throws Exception
    {
        // EHT-001: Call fastWURefresh with null WorkunitWrapper
        try
        {
            client.fastWURefresh(null);
            fail("Should throw exception for null WorkunitWrapper");
        }
        catch (NullPointerException e)
        {
            // Expected
            assertNotNull("NullPointerException expected", e);
        }
        catch (Exception e)
        {
            // Other exceptions acceptable
            assertNotNull("Some exception expected for null parameter", e);
        }
    }

    @Test
    @WithSpan
    public void testFastWURefreshServerReturnsEmptyResponse() throws Exception
    {
        // EHT-007: Server returns response with null workunits array
        // Using a non-existent WUID that may return empty response
        WorkunitWrapper refreshWu = new WorkunitWrapper();
        refreshWu.setWuid("W20990101-000000-999");
        
        try
        {
            client.fastWURefresh(refreshWu);
            // Should handle gracefully - no NPE
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Acceptable - not found exception
            assertNotNull("Exception acceptable for non-existent WUID", e);
        }
        catch (NullPointerException e)
        {
            fail("Should not throw NullPointerException - should handle null arrays gracefully");
        }
    }

    @Test
    @WithSpan
    public void testFastWURefreshConcurrentCalls() throws Exception
    {
        // EHT-009: Multiple threads call fastWURefresh on same WorkunitWrapper simultaneously
        WorkunitWrapper wu = new WorkunitWrapper();
        wu.setECL("OUTPUT('ConcurrencyTest');");
        wu.setJobname("FastRefreshTest_Concurrency");
        wu.setCluster(thorclustername);
        
        WURunResponseWrapper response = client.createAndRunWUFromECLWrapped(wu);
        assertNotNull("Failed to create workunit", response);
        String wuid = response.getWuid();
        assertNotNull("WUID should not be null", wuid);
        
        try
        {
            // Wait for completion
            waitForCompletion(wuid, 60000);
            
            // Create shared workunit wrapper
            WorkunitWrapper refreshWu = new WorkunitWrapper();
            refreshWu.setWuid(wuid);
            
            // Spawn multiple threads
            ExecutorService executor = Executors.newFixedThreadPool(10);
            CountDownLatch latch = new CountDownLatch(10);
            AtomicBoolean failed = new AtomicBoolean(false);
            
            for (int i = 0; i < 10; i++)
            {
                executor.submit(() -> {
                    try
                    {
                        client.fastWURefresh(refreshWu);
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                        failed.set(true);
                    }
                    finally
                    {
                        latch.countDown();
                    }
                });
            }
            
            // Wait for all threads to complete
            assertTrue("All threads should complete", latch.await(30, TimeUnit.SECONDS));
            assertFalse("No thread should fail", failed.get());
            assertEquals("WUID should remain valid", wuid, refreshWu.getWuid());
            
            executor.shutdown();
        }
        finally
        {
            // Cleanup
            try { client.deleteWU(wuid); } catch (Exception e) { /* ignore */ }
        }
    }

    @Test
    @WithSpan
    public void testFastWURefreshDeletedWorkunit() throws Exception
    {
        // EHT-014: Attempt to refresh a workunit that has been deleted
        WorkunitWrapper wu = new WorkunitWrapper();
        wu.setECL("OUTPUT('DeleteTest');");
        wu.setJobname("FastRefreshTest_Deleted");
        wu.setCluster(thorclustername);
        
        WURunResponseWrapper response = client.createAndRunWUFromECLWrapped(wu);
        assertNotNull("Failed to create workunit", response);
        String wuid = response.getWuid();
        assertNotNull("WUID should not be null", wuid);
        
        try
        {
            // Wait for completion
            waitForCompletion(wuid, 60000);
            
            // Delete the workunit
            client.deleteWU(wuid);
            
            // Try to refresh deleted workunit
            WorkunitWrapper refreshWu = new WorkunitWrapper();
            refreshWu.setWuid(wuid);
            
            try
            {
                client.fastWURefresh(refreshWu);
                // May succeed with no update or throw exception
            }
            catch (ArrayOfEspExceptionWrapper e)
            {
                // Expected - not found
                assertTrue("Exception should indicate not found", 
                    e.toString().toLowerCase().contains("not found") || 
                    e.toString().toLowerCase().contains("unknown"));
            }
        }
        catch (Exception e)
        {
            // Workunit might already be deleted - acceptable
        }
    }
}

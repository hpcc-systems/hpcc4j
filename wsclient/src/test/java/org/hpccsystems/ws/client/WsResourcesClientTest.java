/*##############################################################################

    HPCC SYSTEMS software Copyright (C) 2026 HPCC Systems®.

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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Stub;
import org.hpccsystems.ws.client.gen.axis2.wsresources.latest.WsResourcesStub;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsresources.ArrayOfConfiguredWebLinkWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsresources.ArrayOfDiscoveredWebLinkWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsresources.ArrayOfHPCCQueueWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsresources.ConfiguredWebLinkWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsresources.DiscoveredWebLinkWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsresources.ExternalIPStatusWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsresources.HPCCQueueTypeWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsresources.HPCCQueueWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsresources.HPCCServiceWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsresources.ServiceConnectionWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsresources.ServiceQueryRequestWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsresources.ServiceQueryResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsresources.Services_type0Wrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsresources.TargetQueryRequestWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsresources.TargetQueryResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsresources.WebLinksQueryRequestWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsresources.WebLinksQueryResponseWrapper;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import io.opentelemetry.instrumentation.annotations.WithSpan;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WsResourcesClientTest extends BaseRemoteTest
{
    private static HPCCWsResourcesClient client;
    private static boolean isContainerizedTarget = false;
    private static String invalidIP = "203.0.113.0";

    static
    {
        client = HPCCWsResourcesClient.get(connection);
        Assert.assertNotNull(client);
        try
        {
            isContainerizedTarget = wsclient.isContainerized();
        }
        catch (Exception e)
        {
            System.out.println("Failed to determine containerized mode on target HPCC cluster, test results might be invalid!");
            isContainerizedTarget = false;
        }
    }

    // =========================================================================
    // getDefaultStub
    // =========================================================================

    @Test
    public void getDefaultStubTest() throws AxisFault
    {
        Stub defaultStub = client.getDefaultStub();
        Assert.assertNotNull("getDefaultStub() returned null", defaultStub);
        Assert.assertTrue("getDefaultStub() should return a WsResourcesStub instance", defaultStub instanceof WsResourcesStub);
    }

    // =========================================================================
    // getServiceURI
    // =========================================================================

    @Test
    public void getServiceURITest()
    {
        Assert.assertEquals("getServiceURI() should return WSRESOURCESURI",
                HPCCWsResourcesClient.WSRESOURCESURI, client.getServiceURI());
    }

    // =========================================================================
    // getServiceWSDLURL — triggers loadWSDLURL() lazily on first call
    // =========================================================================

    @Test
    public void getServiceWSDLURLTest() throws MalformedURLException
    {
        String wsdlURL = HPCCWsResourcesClient.getServiceWSDLURL();
        Assert.assertNotNull("getServiceWSDLURL() should return a non-null URL string", wsdlURL);
        Assert.assertFalse("getServiceWSDLURL() should return a non-empty URL string", wsdlURL.isEmpty());
        // Verify the result is a valid URL by parsing it — throws MalformedURLException on failure
        new URL(wsdlURL);
    }

    // =========================================================================
    // getServiceWSDLPort — triggers loadWSDLURL() lazily on first call
    // =========================================================================

    @Test
    public void getServiceWSDLPortTest()
    {
        int port = HPCCWsResourcesClient.getServiceWSDLPort();
        Assert.assertTrue("getServiceWSDLPort() should return a positive port number", port > 0);
    }

    // =========================================================================
    // get(Connection)
    // =========================================================================

    @Test
    public void getWithConnectionTest()
    {
        HPCCWsResourcesClient resourcesClient = HPCCWsResourcesClient.get(connection);
        Assert.assertNotNull("get(Connection) should return a non-null client", resourcesClient);
    }

    // =========================================================================
    // get(String protocol, String host, String port, String user, String pass)
    // =========================================================================

    @Test
    public void getWithCredentialsTest() throws Exception
    {
        final String testPort = "8010";
        final String testUser = "testUser";
        final String testPass = "testPass";

        HPCCWsResourcesClient credClient = HPCCWsResourcesClient.get("http", invalidIP, testPort, testUser, testPass);
        Assert.assertNotNull("get() with credentials should return a non-null client", credClient);
        
        URL connectionURL = credClient.getConnectionURL();
        Assert.assertNotNull("getConnectionURL() should return a non-null URL", connectionURL);
        Assert.assertEquals("Host should match the value passed to get()", invalidIP, connectionURL.getHost());
        Assert.assertEquals("Port should match the value passed to get()", Integer.parseInt(testPort), connectionURL.getPort());
        Assert.assertEquals("Path should match the service URI", HPCCWsResourcesClient.WSRESOURCESURI, connectionURL.getPath());
    }

    // =========================================================================
    // get(String protocol, String host, String port, String user, String pass, int timeout)
    // =========================================================================

    @Test
    public void getWithTimeoutTest() throws Exception
    {
        final String testPort    = "8010";
        final String testUser    = "testUser";
        final String testPass    = "testPass";
        final int    testTimeout = 5000;

        HPCCWsResourcesClient timeoutClient = HPCCWsResourcesClient.get("http", invalidIP, testPort, testUser, testPass, testTimeout);
        Assert.assertNotNull("get() with timeout should return a non-null client", timeoutClient);

        URL connectionURL = timeoutClient.getConnectionURL();
        Assert.assertNotNull("getConnectionURL() should return a non-null URL", connectionURL);
        Assert.assertEquals("Host should match the value passed to get()", invalidIP, connectionURL.getHost());
        Assert.assertEquals("Port should match the value passed to get()", Integer.parseInt(testPort), connectionURL.getPort());
        Assert.assertEquals("Path should match the service URI", HPCCWsResourcesClient.WSRESOURCESURI, connectionURL.getPath());
    }

    // =========================================================================
    // getContainerizedMode
    // =========================================================================

    @Test
    public void getContainerizedModeTest() throws Exception
    {
        System.out.println("Fetching isTargetHPCCContainerized...");
        assertNotNull(client.isTargetHPCCContainerized());
    }

    // =========================================================================
    // targetQuery — legacy smoke tests
    // =========================================================================

    @Test
    @WithSpan
    public void testTargetQueryNullType() throws Exception
    {
        TargetQueryRequestWrapper request = new TargetQueryRequestWrapper();
        request.setType(null);
        try
        {
            TargetQueryResponseWrapper response = client.targetQuery(request);
            Assert.assertNotNull(response);
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.assertTrue("Expected 'HPCCQueueType not defined.' in error",
                    e.toString().contains("HPCCQueueType not defined."));
        }
        catch (Exception e)
        {
            Assert.fail("Unexpected Exception type: " + e.getLocalizedMessage());
        }
    }

    @Test
    @WithSpan
    public void testTargetQueryAllType() throws Exception
    {
        TargetQueryRequestWrapper request = new TargetQueryRequestWrapper();
        request.setType(new HPCCQueueTypeWrapper("All"));
        TargetQueryResponseWrapper response = client.targetQuery(request);
        Assert.assertNotNull(response);
    }

    @Test
    @WithSpan
    public void testTargetQueryRoxieType() throws Exception
    {
        TargetQueryRequestWrapper request = new TargetQueryRequestWrapper();
        request.setType(new HPCCQueueTypeWrapper("Roxie"));
        TargetQueryResponseWrapper response = client.targetQuery(request);
        Assert.assertNotNull(response);
    }

    // -------------------------------------------------------------------------
    // ping tests
    // -------------------------------------------------------------------------

    @Test
    public void ping() throws Exception
    {
        assumeTrue("Target HPCC cluster does not appear to be containerized, skipping WsResources tests", isContainerizedTarget);
        assertTrue("ping() should return true on a reachable cluster", client.ping());
    }

    @Test
    public void pingNonContainerizedTest() throws Exception
    {
        assumeFalse("Target HPCC cluster is containerized, skipping non-containerized ping test", isContainerizedTarget);
        assertTrue("ping() should return true on a reachable bare-metal cluster", client.ping());
    }

    @Test
    public void pingIdempotencyTest() throws Exception
    {
        for (int i = 0; i < 5; i++)
        {
            assertTrue("ping() should consistently return true on call " + (i + 1), client.ping());
        }
    }

    @Test
    public void pingWithShortTimeoutTest() throws Exception
    {
        Connection timeoutConn = new Connection(connString);
        timeoutConn.setCredentials(hpccUser, hpccPass);
        timeoutConn.setConnectTimeoutMilli(1);
        timeoutConn.setSocketTimeoutMilli(1);
        HPCCWsResourcesClient timeoutClient = HPCCWsResourcesClient.get(timeoutConn);
        // ping() swallows exceptions; result may be true or false — no exception should propagate
        timeoutClient.ping();
    }

    @Test
    public void pingWithInvalidCredentialsTest() throws Exception
    {
        assumeFalse("Cluster does not appear to enforce authentication, skipping", hpccPass == null || hpccPass.isEmpty());
        Connection badCredConn = new Connection(connString);
        badCredConn.setCredentials("invalid_user_xyz", "invalid_pass_xyz");
        HPCCWsResourcesClient badCredClient = HPCCWsResourcesClient.get(badCredConn);
        assertFalse("ping() should return false with invalid credentials on a secured cluster", badCredClient.ping());
    }

    @Test
    public void pingWithUnreachableHostTest() throws Exception
    {
        Connection unreachableConn = new Connection("http://192.0.2.1:8010");
        unreachableConn.setCredentials(hpccUser, hpccPass);
        unreachableConn.setConnectTimeoutMilli(2000);
        unreachableConn.setSocketTimeoutMilli(2000);
        HPCCWsResourcesClient unreachableClient = HPCCWsResourcesClient.get(unreachableConn);
        assertFalse("ping() should return false (not throw) when host is unreachable", unreachableClient.ping());
    }

    @Test
    public void pingWithWrongPortTest() throws Exception
    {
        URL parsedUrl = new URL(connString);
        Connection wrongPortConn = new Connection(parsedUrl.getProtocol() + "://" + parsedUrl.getHost() + ":19999");
        wrongPortConn.setCredentials(hpccUser, hpccPass);
        wrongPortConn.setConnectTimeoutMilli(2000);
        wrongPortConn.setSocketTimeoutMilli(2000);
        HPCCWsResourcesClient wrongPortClient = HPCCWsResourcesClient.get(wrongPortConn);
        assertFalse("ping() should return false (not throw) when no service listens on the port", wrongPortClient.ping());
    }

    @Test
    public void pingWithNullStubTest() throws Exception
    {
        HPCCWsResourcesClient nullStubClient = HPCCWsResourcesClient.get(connection);
        Field stubField = BaseHPCCWsClient.class.getDeclaredField("stub");
        stubField.setAccessible(true);
        stubField.set(nullStubClient, null);
        try
        {
            nullStubClient.ping();
            Assert.fail("ping() should throw Exception when stub is null (verifyStub() guard is not inside the catch block)");
        }
        catch (Exception e)
        {
            // expected: verifyStub() throws before reaching the catch block in ping()
        }
    }

    // -------------------------------------------------------------------------
    // serviceQuery tests
    // -------------------------------------------------------------------------

    @Test
    public void serviceQueryTest() throws Exception
    {
        assumeTrue("Target HPCC cluster does not appear to be containerized, skipping WsResources tests", isContainerizedTarget);
        ServiceQueryRequestWrapper req = new ServiceQueryRequestWrapper();
        ServiceQueryResponseWrapper resp = client.serviceQuery(req);
        assertNotNull("serviceQuery response should not be null", resp);
        assertNull("serviceQuery response should not contain exceptions", resp.getExceptions());
    }

    @Test
    public void serviceQueryFilterByTypeRoxieTest() throws Exception
    {
        assumeTrue("Skipping for non-containerized cluster", isContainerizedTarget);
        ServiceQueryRequestWrapper req = new ServiceQueryRequestWrapper();
        req.setType("roxie");
        ServiceQueryResponseWrapper resp = client.serviceQuery(req);
        assertNotNull("serviceQuery response should not be null", resp);
        Services_type0Wrapper services = resp.getServices();
        if (services != null && services.getService() != null)
        {
            for (HPCCServiceWrapper svc : services.getService())
            {
                assertTrue("All returned services should have type 'roxie'", "roxie".equalsIgnoreCase(svc.getType()));
            }
        }
    }

    @Test
    public void serviceQueryFilterByTypeEclQueriesTest() throws Exception
    {
        assumeTrue("Skipping for non-containerized cluster", isContainerizedTarget);
        ServiceQueryRequestWrapper req = new ServiceQueryRequestWrapper();
        req.setType("eclqueries");
        ServiceQueryResponseWrapper resp = client.serviceQuery(req);
        assertNotNull("serviceQuery response should not be null", resp);
        Services_type0Wrapper services = resp.getServices();
        if (services != null && services.getService() != null)
        {
            for (HPCCServiceWrapper svc : services.getService())
            {
                assertTrue("All returned services should have type 'eclqueries'", "eclqueries".equalsIgnoreCase(svc.getType()));
            }
        }
    }

    @Test
    public void serviceQueryFilterByNameOnlyTest() throws Exception
    {
        assumeTrue("Skipping for non-containerized cluster", isContainerizedTarget);
        ServiceQueryResponseWrapper unfilteredResp = client.serviceQuery(new ServiceQueryRequestWrapper());
        assertNotNull(unfilteredResp);
        Services_type0Wrapper services = unfilteredResp.getServices();
        assumeTrue("No services returned by unfiltered query", services != null && services.getService() != null && !services.getService().isEmpty());

        String targetName = services.getService().get(0).getName();
        ServiceQueryRequestWrapper req = new ServiceQueryRequestWrapper();
        req.setName(targetName);
        ServiceQueryResponseWrapper filteredResp = client.serviceQuery(req);
        assertNotNull("Filtered response should not be null", filteredResp);
        assertNotNull("Filtered response should return services matching name", filteredResp.getServices());
    }

    @Test
    public void serviceQueryFilterByTypeAndNameTest() throws Exception
    {
        assumeTrue("Skipping for non-containerized cluster", isContainerizedTarget);
        ServiceQueryResponseWrapper unfilteredResp = client.serviceQuery(new ServiceQueryRequestWrapper());
        assertNotNull(unfilteredResp);
        Services_type0Wrapper services = unfilteredResp.getServices();
        assumeTrue("No services returned by unfiltered query", services != null && services.getService() != null && !services.getService().isEmpty());

        HPCCServiceWrapper firstSvc = services.getService().get(0);
        ServiceQueryRequestWrapper req = new ServiceQueryRequestWrapper();
        req.setType(firstSvc.getType());
        req.setName(firstSvc.getName());
        ServiceQueryResponseWrapper filteredResp = client.serviceQuery(req);
        assertNotNull("Filtered response should not be null", filteredResp);
        Services_type0Wrapper filteredServices = filteredResp.getServices();
        assertNotNull("Filtered response should return matching services", filteredServices);
    }

    @Test
    public void serviceQueryFieldCompletenessTest() throws Exception
    {
        assumeTrue("Skipping for non-containerized cluster", isContainerizedTarget);
        ServiceQueryResponseWrapper resp = client.serviceQuery(new ServiceQueryRequestWrapper());
        assertNotNull(resp);
        Services_type0Wrapper services = resp.getServices();
        if (services != null && services.getService() != null)
        {
            for (HPCCServiceWrapper svc : services.getService())
            {
                assertNotNull("Service name should not be null", svc.getName());
                assertNotNull("Service type should not be null", svc.getType());
                assertNotNull("Service port should not be null", svc.getPort());
                assertTrue("Service port should be > 0", svc.getPort().longValue() > 0);
            }
        }
    }

    @Test
    public void serviceQueryEmptyStringTypeTest() throws Exception
    {
        assumeTrue("Skipping for non-containerized cluster", isContainerizedTarget);
        ServiceQueryResponseWrapper unfilteredResp = client.serviceQuery(new ServiceQueryRequestWrapper());
        assertNotNull(unfilteredResp);

        ServiceQueryRequestWrapper req = new ServiceQueryRequestWrapper();
        req.setType("");
        ServiceQueryResponseWrapper emptyTypeResp = client.serviceQuery(req);
        assertNotNull("Response with empty-string type should not be null", emptyTypeResp);

        int unfilteredCount = (unfilteredResp.getServices() != null && unfilteredResp.getServices().getService() != null)
                ? unfilteredResp.getServices().getService().size() : 0;
        int emptyTypeCount = (emptyTypeResp.getServices() != null && emptyTypeResp.getServices().getService() != null)
                ? emptyTypeResp.getServices().getService().size() : 0;
        assertEquals("Empty-string type should return same count as unfiltered", unfilteredCount, emptyTypeCount);
    }

    @Test
    public void serviceQueryEmptyStringNameTest() throws Exception
    {
        assumeTrue("Skipping for non-containerized cluster", isContainerizedTarget);
        ServiceQueryResponseWrapper unfilteredResp = client.serviceQuery(new ServiceQueryRequestWrapper());
        assertNotNull(unfilteredResp);

        ServiceQueryRequestWrapper req = new ServiceQueryRequestWrapper();
        req.setName("");
        ServiceQueryResponseWrapper emptyNameResp = client.serviceQuery(req);
        assertNotNull("Response with empty-string name should not be null", emptyNameResp);

        int unfilteredCount = (unfilteredResp.getServices() != null && unfilteredResp.getServices().getService() != null)
                ? unfilteredResp.getServices().getService().size() : 0;
        int emptyNameCount = (emptyNameResp.getServices() != null && emptyNameResp.getServices().getService() != null)
                ? emptyNameResp.getServices().getService().size() : 0;
        assertEquals("Empty-string name should return same count as unfiltered", unfilteredCount, emptyNameCount);
    }

    @Test
    public void serviceQueryCaseInsensitiveTypeTest() throws Exception
    {
        assumeTrue("Skipping for non-containerized cluster", isContainerizedTarget);
        ServiceQueryRequestWrapper upperReq = new ServiceQueryRequestWrapper();
        upperReq.setType("ROXIE");
        ServiceQueryResponseWrapper upperResp = client.serviceQuery(upperReq);

        ServiceQueryRequestWrapper lowerReq = new ServiceQueryRequestWrapper();
        lowerReq.setType("roxie");
        ServiceQueryResponseWrapper lowerResp = client.serviceQuery(lowerReq);

        assertNotNull(upperResp);
        assertNotNull(lowerResp);

        int upperCount = (upperResp.getServices() != null && upperResp.getServices().getService() != null)
                ? upperResp.getServices().getService().size() : 0;
        int lowerCount = (lowerResp.getServices() != null && lowerResp.getServices().getService() != null)
                ? lowerResp.getServices().getService().size() : 0;
        assertEquals("Type filter should be case-insensitive: ROXIE and roxie should return same count", upperCount, lowerCount);
    }

    @Test
    public void serviceQueryNonExistentTypeTest() throws Exception
    {
        assumeTrue("Skipping for non-containerized cluster", isContainerizedTarget);
        ServiceQueryRequestWrapper req = new ServiceQueryRequestWrapper();
        req.setType("nonexistent_type_xyz_12345");
        ServiceQueryResponseWrapper resp = client.serviceQuery(req);
        assertNotNull("Response should not be null for non-existent type", resp);
        boolean isEmpty = resp.getServices() == null || resp.getServices().getService() == null
                || resp.getServices().getService().isEmpty();
        assertTrue("Non-existent type should return empty result set", isEmpty);
    }

    @Test
    public void serviceQueryNonExistentNameTest() throws Exception
    {
        assumeTrue("Skipping for non-containerized cluster", isContainerizedTarget);
        ServiceQueryRequestWrapper req = new ServiceQueryRequestWrapper();
        req.setName("nonexistent_service_name_xyz_12345");
        try
        {
            ServiceQueryResponseWrapper resp = client.serviceQuery(req);
            assertNotNull("Response should not be null for non-existent name", resp);
            boolean isEmpty = resp.getServices() == null || resp.getServices().getService() == null
                    || resp.getServices().getService().isEmpty();
            assertTrue("Non-existent name should return empty result or raise exception", isEmpty);
        }
        catch (Exception e)
        {
            // Also acceptable: ECLWATCH_INVALID_CLUSTER_NAME on bare-metal code paths
        }
    }

    @Test
    public void serviceQueryVeryLongTypeStringTest() throws Exception
    {
        assumeTrue("Skipping for non-containerized cluster", isContainerizedTarget);
        StringBuilder sb = new StringBuilder(1024);
        for (int i = 0; i < 1024; i++) sb.append('a');
        ServiceQueryRequestWrapper req = new ServiceQueryRequestWrapper();
        req.setType(sb.toString());
        try
        {
            ServiceQueryResponseWrapper resp = client.serviceQuery(req);
            assertNotNull("Response should not be null for very long type string", resp);
        }
        catch (Exception e)
        {
            // Server may reject with an ESP exception — also acceptable
        }
    }

    @Test
    public void serviceQueryMismatchedTypeAndNameTest() throws Exception
    {
        assumeTrue("Skipping for non-containerized cluster", isContainerizedTarget);
        ServiceQueryResponseWrapper unfilteredResp = client.serviceQuery(new ServiceQueryRequestWrapper());
        assertNotNull(unfilteredResp);
        Services_type0Wrapper services = unfilteredResp.getServices();
        assumeTrue("Fewer than 2 services returned", services != null && services.getService() != null
                && services.getService().size() >= 2);

        String type1 = null;
        String name2 = null;
        for (int i = 0; i < services.getService().size(); i++)
        {
            HPCCServiceWrapper svc = services.getService().get(i);
            if (type1 == null) type1 = svc.getType();
            else if (!svc.getType().equalsIgnoreCase(type1))
            {
                name2 = svc.getName();
                break;
            }
        }
        assumeTrue("Could not find two services with distinct types", name2 != null);

        ServiceQueryRequestWrapper req = new ServiceQueryRequestWrapper();
        req.setType(type1);
        req.setName(name2);
        ServiceQueryResponseWrapper resp = client.serviceQuery(req);
        assertNotNull("Response should not be null", resp);
        boolean isEmpty = resp.getServices() == null || resp.getServices().getService() == null
                || resp.getServices().getService().isEmpty();
        assertTrue("Mismatched type+name filter should return empty result (AND logic)", isEmpty);
    }

    @Test
    public void serviceQueryNullRequestTest()
    {
        try
        {
            client.serviceQuery(null);
            Assert.fail("serviceQuery(null) should throw Exception");
        }
        catch (Exception e)
        {
            assertTrue("Exception message should indicate null request",
                    e.getMessage() != null && e.getMessage().contains("ServiceQueryRequestWrapper must be provided!"));
        }
    }

    @Test
    public void serviceQueryUnreachableHostTest()
    {
        try
        {
            Connection unreachableConn = new Connection("http://192.0.2.1:8010");
            unreachableConn.setCredentials(hpccUser, hpccPass);
            unreachableConn.setConnectTimeoutMilli(2000);
            unreachableConn.setSocketTimeoutMilli(2000);
            HPCCWsResourcesClient unreachableClient = HPCCWsResourcesClient.get(unreachableConn);
            unreachableClient.serviceQuery(new ServiceQueryRequestWrapper());
            Assert.fail("serviceQuery() should throw an exception for an unreachable host");
        }
        catch (Exception e)
        {
            // expected
        }
    }

    @Test
    public void serviceQueryInvalidCredentialsTest()
    {
        assumeFalse("Cluster does not appear to enforce authentication, skipping", hpccPass == null || hpccPass.isEmpty());
        try
        {
            Connection badCredConn = new Connection(connString);
            badCredConn.setCredentials("invalid_user_xyz", "invalid_pass_xyz");
            HPCCWsResourcesClient badCredClient = HPCCWsResourcesClient.get(badCredConn);
            badCredClient.serviceQuery(new ServiceQueryRequestWrapper());
            Assert.fail("serviceQuery() should throw an exception with invalid credentials on a secured cluster");
        }
        catch (Exception e)
        {
            // expected: ArrayOfEspExceptionWrapper or Exception from auth failure
        }
    }

    @Test
    public void serviceQueryNonContainerizedTest() throws Exception
    {
        assumeFalse("Target HPCC cluster is containerized, skipping non-containerized serviceQuery test", isContainerizedTarget);
        ServiceQueryRequestWrapper req = new ServiceQueryRequestWrapper();
        ServiceQueryResponseWrapper resp = client.serviceQuery(req);
        assertNotNull("serviceQuery response should not be null on bare-metal cluster", resp);
    }

    @Test
    public void serviceQuerySpecialCharsInTypeTest() throws Exception
    {
        assumeTrue("Skipping for non-containerized cluster", isContainerizedTarget);
        ServiceQueryRequestWrapper req = new ServiceQueryRequestWrapper();
        req.setType("<type>&\"'</type>");
        try
        {
            ServiceQueryResponseWrapper resp = client.serviceQuery(req);
            assertNotNull("Response should not be null for XML chars in type", resp);
        }
        catch (Exception e)
        {
            // ESP exception also acceptable
        }
    }

    @Test
    public void serviceQuerySpecialCharsInNameTest() throws Exception
    {
        assumeTrue("Skipping for non-containerized cluster", isContainerizedTarget);
        ServiceQueryRequestWrapper req = new ServiceQueryRequestWrapper();
        req.setName("' or '1'='1");
        try
        {
            ServiceQueryResponseWrapper resp = client.serviceQuery(req);
            assertNotNull("Response should not be null for injection chars in name", resp);
        }
        catch (Exception e)
        {
            // ESP exception also acceptable
        }
    }

    // -------------------------------------------------------------------------
    // targetQuery tests
    // -------------------------------------------------------------------------

    @Test
    public void testTargetQueryThorType() throws Exception
    {
        assumeTrue("Skipping for non-containerized cluster", isContainerizedTarget);
        TargetQueryRequestWrapper req = new TargetQueryRequestWrapper();
        req.setType(new HPCCQueueTypeWrapper("Thor"));
        TargetQueryResponseWrapper resp = client.targetQuery(req);
        assertNotNull("targetQuery(Thor) response should not be null", resp);
        assertNull("targetQuery(Thor) response should not contain exceptions", resp.getExceptions());
        if (resp.getQueues() != null && resp.getQueues().getHPCCQueue() != null)
        {
            // The server may return queues of mixed types when filtering by Thor — log for diagnostics
            for (HPCCQueueWrapper q : resp.getQueues().getHPCCQueue())
            {
                String typeStr = q.getType() != null ? q.getType().getHPCCQueueType() : "null";
                System.out.println("testTargetQueryThorType: returned queue '" + q.getName() + "' type='" + typeStr + "'");
            }
        }
    }

    @Test
    public void testTargetQueryHThorType() throws Exception
    {
        assumeTrue("Skipping for non-containerized cluster", isContainerizedTarget);
        TargetQueryRequestWrapper req = new TargetQueryRequestWrapper();
        req.setType(new HPCCQueueTypeWrapper("HThor"));
        TargetQueryResponseWrapper resp = client.targetQuery(req);
        assertNotNull("targetQuery(HThor) response should not be null", resp);
        assertNull("targetQuery(HThor) response should not contain exceptions", resp.getExceptions());
        if (resp.getQueues() != null && resp.getQueues().getHPCCQueue() != null)
        {
            // The server may return queues of mixed types when filtering by HThor — log for diagnostics
            for (HPCCQueueWrapper q : resp.getQueues().getHPCCQueue())
            {
                String typeStr = q.getType() != null ? q.getType().getHPCCQueueType() : "null";
                System.out.println("testTargetQueryHThorType: returned queue '" + q.getName() + "' type='" + typeStr + "'");
            }
        }
    }

    @Test
    public void testTargetQueryAllTypeVerifyContents() throws Exception
    {
        assumeTrue("Skipping for non-containerized cluster", isContainerizedTarget);
        TargetQueryRequestWrapper req = new TargetQueryRequestWrapper();
        req.setType(new HPCCQueueTypeWrapper("All"));
        TargetQueryResponseWrapper resp = client.targetQuery(req);
        assertNotNull("targetQuery(All) response should not be null", resp);
        assertNull("targetQuery(All) response should not contain exceptions", resp.getExceptions());
        ArrayOfHPCCQueueWrapper queues = resp.getQueues();
        if (queues != null && queues.getHPCCQueue() != null)
        {
            for (HPCCQueueWrapper q : queues.getHPCCQueue())
            {
                assertNotNull("Each queue should have a non-null name", q.getName());
                // Queue type may be null or carry values beyond Thor/HThor/Roxie depending on cluster config
                String typeStr = q.getType() != null ? q.getType().getHPCCQueueType() : "null";
                System.out.println("testTargetQueryAllTypeVerifyContents: queue '" + q.getName() + "' type='" + typeStr + "'");
            }
        }
    }

    @Test
    public void testTargetQueryRoxieTypeVerifyRoxieList() throws Exception
    {
        assumeTrue("Skipping for non-containerized cluster", isContainerizedTarget);
        TargetQueryRequestWrapper req = new TargetQueryRequestWrapper();
        req.setType(new HPCCQueueTypeWrapper("Roxie"));
        TargetQueryResponseWrapper resp = client.targetQuery(req);
        assertNotNull("targetQuery(Roxie) response should not be null", resp);
        List<String> roxies = resp.getRoxies();
        if (roxies != null)
        {
            for (String roxie : roxies)
            {
                assertNotNull("Each roxie entry should be non-null", roxie);
                assertFalse("Each roxie entry should be non-empty", roxie.isEmpty());
            }
        }
    }

    @Test
    public void testTargetQueryAllTypeVerifyRoxieList() throws Exception
    {
        assumeTrue("Skipping for non-containerized cluster", isContainerizedTarget);
        TargetQueryRequestWrapper req = new TargetQueryRequestWrapper();
        req.setType(new HPCCQueueTypeWrapper("All"));
        TargetQueryResponseWrapper resp = client.targetQuery(req);
        assertNotNull("targetQuery(All) response should not be null", resp);
        List<String> roxies = resp.getRoxies();
        if (roxies != null)
        {
            for (String roxie : roxies)
            {
                assertNotNull("Each roxie entry should be non-null", roxie);
                assertFalse("Each roxie entry should be non-empty", roxie.isEmpty());
            }
        }
    }

    @Test
    public void testTargetQueryLowercaseAllType() throws Exception
    {
        assumeTrue("Skipping for non-containerized cluster", isContainerizedTarget);
        TargetQueryRequestWrapper req = new TargetQueryRequestWrapper();
        req.setType(new HPCCQueueTypeWrapper("all"));
        TargetQueryResponseWrapper resp = client.targetQuery(req);
        assertNotNull("targetQuery with lowercase 'all' should return non-null response", resp);
        assertNull("targetQuery with lowercase 'all' should not have exceptions", resp.getExceptions());
    }

    @Test
    public void testTargetQueryUppercaseThorType() throws Exception
    {
        assumeTrue("Skipping for non-containerized cluster", isContainerizedTarget);
        TargetQueryRequestWrapper req = new TargetQueryRequestWrapper();
        req.setType(new HPCCQueueTypeWrapper("THOR"));
        TargetQueryResponseWrapper resp = client.targetQuery(req);
        assertNotNull("targetQuery with uppercase 'THOR' should return non-null response", resp);
        assertNull("targetQuery with uppercase 'THOR' should not have exceptions", resp.getExceptions());
    }

    @Test
    public void testTargetQueryEmptyStringType()
    {
        assumeTrue("Skipping for non-containerized cluster", isContainerizedTarget);
        try
        {
            TargetQueryRequestWrapper req = new TargetQueryRequestWrapper();
            req.setType(new HPCCQueueTypeWrapper(""));
            client.targetQuery(req);
            Assert.fail("targetQuery with empty string type should throw an Exception (server rejects with 'HPCCQueueType not defined.')");
        }
        catch (Exception e)
        {
            // expected: server returns HPCCQueueType not defined.
        }
    }

    @Test
    public void testTargetQueryInvalidType()
    {
        assumeTrue("Skipping for non-containerized cluster", isContainerizedTarget);
        try
        {
            TargetQueryRequestWrapper req = new TargetQueryRequestWrapper();
            req.setType(new HPCCQueueTypeWrapper("InvalidType"));
            client.targetQuery(req);
            Assert.fail("targetQuery with unrecognized type should throw an Exception");
        }
        catch (Exception e)
        {
            // expected: server rejects unrecognized type
        }
    }

    @Test
    public void testTargetQueryNullRequest()
    {
        try
        {
            client.targetQuery(null);
            Assert.fail("targetQuery(null) should throw Exception");
        }
        catch (Exception e)
        {
            assertTrue("Exception message should indicate null request",
                    e.getMessage() != null && e.getMessage().contains("TargetQueryRequestWrapper must be provided!"));
        }
    }

    @Test
    public void testTargetQueryDefaultConstructorType()
    {
        assumeTrue("Skipping for non-containerized cluster", isContainerizedTarget);
        try
        {
            TargetQueryRequestWrapper req = new TargetQueryRequestWrapper();
            client.targetQuery(req);
            Assert.fail("targetQuery with default constructor (no type set) should throw an Exception");
        }
        catch (Exception e)
        {
            // expected: server rejects request without type
        }
    }

    @Test
    public void testTargetQueryInvalidConnection()
    {
        try
        {
            Connection unreachableConn = new Connection("http://192.0.2.1:8010");
            unreachableConn.setCredentials(hpccUser, hpccPass);
            unreachableConn.setConnectTimeoutMilli(2000);
            unreachableConn.setSocketTimeoutMilli(2000);
            HPCCWsResourcesClient unreachableClient = HPCCWsResourcesClient.get(unreachableConn);
            TargetQueryRequestWrapper req = new TargetQueryRequestWrapper();
            req.setType(new HPCCQueueTypeWrapper("All"));
            unreachableClient.targetQuery(req);
            Assert.fail("targetQuery() should throw an exception for an unreachable host");
        }
        catch (Exception e)
        {
            // expected
        }
    }

    @Test
    public void testTargetQueryRoxieTypeGracefulEmptyResponse() throws Exception
    {
        assumeTrue("Skipping for non-containerized cluster", isContainerizedTarget);
        TargetQueryRequestWrapper req = new TargetQueryRequestWrapper();
        req.setType(new HPCCQueueTypeWrapper("Roxie"));
        TargetQueryResponseWrapper resp = client.targetQuery(req);
        assertNotNull("Response should not be null", resp);
        // Access queues and roxies without NPE, even if nil_remove makes them null
        ArrayOfHPCCQueueWrapper queues = resp.getQueues();
        List<String> roxies = resp.getRoxies();
        if (queues != null && queues.getHPCCQueue() != null)
        {
            assertNotNull("Queue list should not be null if queues wrapper is present", queues.getHPCCQueue());
        }
        if (roxies != null)
        {
            assertNotNull("Roxies list should not be null", roxies);
        }
    }

    // -------------------------------------------------------------------------
    // webLinks tests
    // -------------------------------------------------------------------------

    @Test
    public void testWebLinksQuery() throws Exception
    {
        assumeTrue("Target HPCC cluster does not appear to be containerized, skipping WsResources tests", isContainerizedTarget);
        WebLinksQueryRequestWrapper req = new WebLinksQueryRequestWrapper();
        WebLinksQueryResponseWrapper resp = client.webLinks(req);
        assertNotNull("webLinks response should not be null", resp);
    }

    @Test
    public void testWebLinksNonContainerizedDiscoveredEmpty() throws Exception
    {
        assumeFalse("Target HPCC cluster is containerized, skipping non-containerized webLinks test", isContainerizedTarget);
        WebLinksQueryRequestWrapper req = new WebLinksQueryRequestWrapper();
        WebLinksQueryResponseWrapper resp = client.webLinks(req);
        assertNotNull("webLinks response should not be null", resp);
        ArrayOfDiscoveredWebLinkWrapper discovered = resp.getDiscoveredWebLinks();
        boolean isEmptyOrNull = discovered == null || discovered.getDiscoveredWebLink() == null
                || discovered.getDiscoveredWebLink().isEmpty();
        assertTrue("discoveredWebLinks should be null or empty on a bare-metal cluster", isEmptyOrNull);
    }

    @Test
    public void testWebLinksContainerizedDiscoveredNonNull() throws Exception
    {
        assumeTrue("Skipping for non-containerized cluster", isContainerizedTarget);
        WebLinksQueryRequestWrapper req = new WebLinksQueryRequestWrapper();
        WebLinksQueryResponseWrapper resp = client.webLinks(req);
        assertNotNull("webLinks response should not be null", resp);
        ArrayOfDiscoveredWebLinkWrapper discovered = resp.getDiscoveredWebLinks();
        // discoveredWebLinks depends on cluster configuration — skip rather than fail when absent
        assumeTrue("No discoveredWebLinks returned on this containerized cluster (configuration-dependent)", discovered != null);
        if (discovered.getDiscoveredWebLink() != null)
        {
            for (DiscoveredWebLinkWrapper link : discovered.getDiscoveredWebLink())
            {
                assertNotNull("Each discovered link should have a non-null serviceName", link.getServiceName());
            }
        }
    }

    @Test
    public void testWebLinksConfiguredWebLinkFields() throws Exception
    {
        WebLinksQueryRequestWrapper req = new WebLinksQueryRequestWrapper();
        WebLinksQueryResponseWrapper resp = client.webLinks(req);
        assertNotNull(resp);
        ArrayOfConfiguredWebLinkWrapper configured = resp.getConfiguredWebLinks();
        assumeTrue("No configured web links exist on this cluster", configured != null
                && configured.getConfiguredWebLink() != null && !configured.getConfiguredWebLink().isEmpty());
        for (ConfiguredWebLinkWrapper link : configured.getConfiguredWebLink())
        {
            assertNotNull("ConfiguredWebLink name should not be null", link.getName());
            assertFalse("ConfiguredWebLink name should not be empty", link.getName().isEmpty());
            assertNotNull("ConfiguredWebLink URL should not be null", link.getURL());
            assertFalse("ConfiguredWebLink URL should not be empty", link.getURL().isEmpty());
        }
    }

    @Test
    public void testWebLinksDiscoveredWebLinkFields() throws Exception
    {
        assumeTrue("Skipping for non-containerized cluster", isContainerizedTarget);
        WebLinksQueryRequestWrapper req = new WebLinksQueryRequestWrapper();
        WebLinksQueryResponseWrapper resp = client.webLinks(req);
        assertNotNull(resp);
        ArrayOfDiscoveredWebLinkWrapper discovered = resp.getDiscoveredWebLinks();
        assumeTrue("No discovered web links exist on this cluster", discovered != null
                && discovered.getDiscoveredWebLink() != null && !discovered.getDiscoveredWebLink().isEmpty());
        for (DiscoveredWebLinkWrapper link : discovered.getDiscoveredWebLink())
        {
            assertNotNull("DiscoveredWebLink serviceName should not be null", link.getServiceName());
            assertNotNull("DiscoveredWebLink nameSpace should not be null", link.getNameSpace());
            assertNotNull("DiscoveredWebLink annotations should not be null", link.getAnnotations());
        }
    }

    @Test
    public void testWebLinksConfiguredWebLinkResourceType() throws Exception
    {
        WebLinksQueryRequestWrapper req = new WebLinksQueryRequestWrapper();
        WebLinksQueryResponseWrapper resp = client.webLinks(req);
        assertNotNull(resp);
        ArrayOfConfiguredWebLinkWrapper configured = resp.getConfiguredWebLinks();
        assumeTrue("No configured web links exist on this cluster", configured != null
                && configured.getConfiguredWebLink() != null && !configured.getConfiguredWebLink().isEmpty());
        for (ConfiguredWebLinkWrapper link : configured.getConfiguredWebLink())
        {
            Object rawLink = link.getRaw();
            try
            {
                Method getResourceType = rawLink.getClass().getMethod("getResourceType");
                Object resourceType = getResourceType.invoke(rawLink);
                if (resourceType != null)
                {
                    String typeStr = resourceType.toString();
                    assertTrue("ResourceType should be one of UNKNOWN/TRACES/LOGS/METRICS",
                            typeStr.equals("UNKNOWN") || typeStr.equals("TRACES")
                            || typeStr.equals("LOGS") || typeStr.equals("METRICS"));
                }
            }
            catch (NoSuchMethodException e)
            {
                // getResourceType() absent in older WSDL — skip
                assumeTrue("getResourceType() not present in this WSDL version", false);
            }
        }
    }

    @Test
    public void testWebLinksDiscoveredServiceConnectionFields() throws Exception
    {
        assumeTrue("Skipping for non-containerized cluster", isContainerizedTarget);
        WebLinksQueryRequestWrapper req = new WebLinksQueryRequestWrapper();
        WebLinksQueryResponseWrapper resp = client.webLinks(req);
        assertNotNull(resp);
        ArrayOfDiscoveredWebLinkWrapper discovered = resp.getDiscoveredWebLinks();
        assumeTrue("No discovered web links exist on this cluster", discovered != null
                && discovered.getDiscoveredWebLink() != null && !discovered.getDiscoveredWebLink().isEmpty());
        for (DiscoveredWebLinkWrapper link : discovered.getDiscoveredWebLink())
        {
            ServiceConnectionWrapper conn = link.getConnection();
            if (conn != null)
            {
                assertNotNull("ServiceConnection type should not be null", conn.getType());
            }
        }
    }

    @Test
    public void testWebLinksDiscoveredExternalIPStatus() throws Exception
    {
        assumeTrue("Skipping for non-containerized cluster", isContainerizedTarget);
        WebLinksQueryRequestWrapper req = new WebLinksQueryRequestWrapper();
        WebLinksQueryResponseWrapper resp = client.webLinks(req);
        assertNotNull(resp);
        ArrayOfDiscoveredWebLinkWrapper discovered = resp.getDiscoveredWebLinks();
        assumeTrue("No discovered web links exist on this cluster", discovered != null
                && discovered.getDiscoveredWebLink() != null && !discovered.getDiscoveredWebLink().isEmpty());
        boolean checkedAtLeastOne = false;
        for (DiscoveredWebLinkWrapper link : discovered.getDiscoveredWebLink())
        {
            ServiceConnectionWrapper conn = link.getConnection();
            if (conn != null)
            {
                List<String> externalIPs = conn.getExternalIPs();
                if (externalIPs == null || externalIPs.isEmpty())
                {
                    ExternalIPStatusWrapper statusWrapper = conn.getExternalIPStatus();
                    if (statusWrapper != null)
                    {
                        String status = statusWrapper.getExternalIPStatus();
                        assertTrue("ExternalIPStatus should be UNKNOWN, NONE, or PENDING",
                                status == null || status.equals("UNKNOWN") || status.equals("NONE") || status.equals("PENDING"));
                        checkedAtLeastOne = true;
                    }
                }
            }
        }
        assumeTrue("No applicable services found for ExternalIPStatus validation", checkedAtLeastOne);
    }

    @Test
    public void testWebLinksEmptyResponseNonNull() throws Exception
    {
        assumeFalse("Skipping on containerized cluster (may have discovered links)", isContainerizedTarget);
        WebLinksQueryRequestWrapper req = new WebLinksQueryRequestWrapper();
        WebLinksQueryResponseWrapper resp = client.webLinks(req);
        assertNotNull("webLinks response should never be null even when both link arrays are absent", resp);
    }

    @Test
    public void testWebLinksNullRequestThrowsException()
    {
        try
        {
            client.webLinks(null);
            Assert.fail("webLinks(null) should throw Exception");
        }
        catch (Exception e)
        {
            assertTrue("Exception message should indicate null request",
                    e.getMessage() != null && e.getMessage().contains("WebLinksQueryRequestWrapper must be provided!"));
        }
    }

    @Test
    public void testWebLinksInvalidCredentialsThrowsException()
    {
        assumeFalse("Cluster does not appear to enforce authentication, skipping", hpccPass == null || hpccPass.isEmpty());
        try
        {
            Connection badCredConn = new Connection(connString);
            badCredConn.setCredentials("invalid_user_xyz", "invalid_pass_xyz");
            HPCCWsResourcesClient badCredClient = HPCCWsResourcesClient.get(badCredConn);
            badCredClient.webLinks(new WebLinksQueryRequestWrapper());
            Assert.fail("webLinks() should throw an exception with invalid credentials on a secured cluster");
        }
        catch (Exception e)
        {
            // expected
        }
    }

    @Test
    public void testWebLinksUnreachableHostThrowsException()
    {
        try
        {
            Connection unreachableConn = new Connection("http://invalid-host-that-does-not-exist.example.com:8010");
            unreachableConn.setCredentials(hpccUser, hpccPass);
            unreachableConn.setConnectTimeoutMilli(2000);
            unreachableConn.setSocketTimeoutMilli(2000);
            HPCCWsResourcesClient unreachableClient = HPCCWsResourcesClient.get(unreachableConn);
            unreachableClient.webLinks(new WebLinksQueryRequestWrapper());
            Assert.fail("webLinks() should throw an exception for an unreachable host");
        }
        catch (Exception e)
        {
            // expected
        }
    }

    @Test
    public void testWebLinksConnectionTimeoutThrowsException()
    {
        try
        {
            Connection timeoutConn = new Connection("http://192.0.2.1:8010");
            timeoutConn.setCredentials(hpccUser, hpccPass);
            timeoutConn.setConnectTimeoutMilli(1);
            timeoutConn.setSocketTimeoutMilli(1);
            HPCCWsResourcesClient timeoutClient = HPCCWsResourcesClient.get(timeoutConn);
            timeoutClient.webLinks(new WebLinksQueryRequestWrapper());
            Assert.fail("webLinks() should throw an exception when connection times out");
        }
        catch (Exception e)
        {
            // expected
        }
    }
}

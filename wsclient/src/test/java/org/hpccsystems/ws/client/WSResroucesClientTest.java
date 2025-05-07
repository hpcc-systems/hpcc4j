/*##############################################################################

    HPCC SYSTEMS software Copyright (C) 2021 HPCC Systems®.

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

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.apache.axis2.AxisFault;
import org.hpccsystems.ws.client.gen.axis2.wsresources.latest.HPCCQueueType;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.EspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsresources.HPCCQueueTypeWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsresources.HPCCServiceWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsresources.ServiceQueryRequestWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsresources.ServiceQueryResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsresources.TargetQueryRequestWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsresources.TargetQueryResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsresources.WebLinksQueryRequestWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsresources.WebLinksQueryResponseWrapper;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import io.opentelemetry.instrumentation.annotations.WithSpan;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WSResroucesClientTest extends BaseRemoteTest
{
    private static HPCCWsResourcesClient wsResourcesClient;
    private boolean iscontainerized = false;

    static
    {
        wsResourcesClient = HPCCWsResourcesClient.get(connection);
        Assert.assertNotNull(wsResourcesClient);
    }

    @Before
    public void setup()
    {
        try
        {
            iscontainerized = platform.isContainerized();
        }
        catch (Exception e)
        {
            Assert.fail("Encountered Error attempting to determine if target HPCC System is containerized");
        }
    }

    @Test
    @WithSpan
    public void serviceQueryTest()
    {
        Assume.assumeTrue("Target HPCC does not seem to be containerized", iscontainerized);
        try
        {
            System.out.println("Querying all HPCC Services...");
            ServiceQueryResponseWrapper resp = wsResourcesClient.serviceQuery(new ServiceQueryRequestWrapper());
            Assert.assertNotNull(resp);
            Assert.assertNotNull(resp.getServices());
            List<HPCCServiceWrapper> services = resp.getServices().getService();
            for (HPCCServiceWrapper service : services)
            {
                System.out.println(service.toString());
            }
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail(e.toString());
        }
        catch (Exception e)
        {
            Assert.fail(e.getLocalizedMessage());
        }
    }

    @Test
    public void getContainerizedModeTest() throws Exception
    {
        System.out.println("Fetching isTargetHPCCContainerized...");
        assertNotNull(wsResourcesClient.isTargetHPCCContainerized());
    }

    @Test
    @WithSpan
    public void testTargetQueryNullType() throws Exception
    {
        // Create a target query request
        TargetQueryRequestWrapper request = new TargetQueryRequestWrapper();
        // Set the request parameters
        request.setType(null);

        System.out.println("testTargetQueryNullType using request: '" + request.toString() + "'");
        try
        {
            TargetQueryResponseWrapper response = wsResourcesClient.targetQuery(request);
            Assert.assertNotNull(response);
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            List<EspExceptionWrapper> espexceptions = e.getEspExceptions();
            Assert.assertNotNull(espexceptions);
            Assert.assertNotNull(espexceptions.get(0));
            Assert.assertTrue(e.getEspExceptions().get(0).getMessage().contains("HPCCQueueType not defined."));
        }
        catch (Exception e)
        {
             Assert.fail("testTargetQueryNullType failed due to receiving an unexpected Exception TYPE");
        }
    }

    @Test
    @WithSpan
    public void testTargetQueryAllType() throws Exception
    {
        // Create a target query request
        TargetQueryRequestWrapper request = new TargetQueryRequestWrapper();
        request.setType(new HPCCQueueTypeWrapper(HPCCQueueType._All));

        System.out.println("testTargetQueryAllType using request: '" + request.toString() + "'");

        try
        {
            // Call the targetQuery method
            TargetQueryResponseWrapper response = wsResourcesClient.targetQuery(request);
            Assert.assertNotNull(response);
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            String messages = "testTargetQueryAllType failed due to unexpected execption: '";
            List<EspExceptionWrapper> espexceptions = e.getEspExceptions();
            Assert.assertNotNull(espexceptions);
            Assert.assertNotNull(espexceptions.get(0));
            for (EspExceptionWrapper exception : espexceptions)
            {
                messages += "\n" + exception.getMessage();
            }

            Assert.fail(messages + "'");
        }
        catch (Exception e)
        {
            Assert.fail("testTargetQueryAllType failed due to unexpected execption: '" + e.getMessage() + "'");
        }
    }

    @Test
    @WithSpan
    public void testTargetQueryRoxieType() throws Exception
    {
        // Create a target query request
        TargetQueryRequestWrapper request = new TargetQueryRequestWrapper();
        request.setType(new HPCCQueueTypeWrapper(HPCCQueueType._Roxie));

        System.out.println("testTargetQueryRoxieType using request: '" + request.toString() + "'");

        try
        {
            // Call the targetQuery method
            TargetQueryResponseWrapper response = wsResourcesClient.targetQuery(request);
            Assert.assertNotNull(response);
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            String messages = "testTargetQueryRoxieType failed due to unexpected execption: '";
            List<EspExceptionWrapper> espexceptions = e.getEspExceptions();
            Assert.assertNotNull(espexceptions);
            Assert.assertNotNull(espexceptions.get(0));
            for (EspExceptionWrapper exception : espexceptions)
            {
                messages += "\n" + exception.getMessage();
            }

            Assert.fail(messages + "'");
        }
        catch (Exception e)
        {
            Assert.fail("testTargetQueryRoxieType failed due to unexpected execption: '" + e.getMessage() + "'");
        }
    }

    @Test
    @WithSpan
    public void testWebLinksQuery() throws Exception
    {
        // Create a web links query request
        WebLinksQueryRequestWrapper request = new WebLinksQueryRequestWrapper();
        // Call the webLinksQuery method
        WebLinksQueryResponseWrapper response = wsResourcesClient.webLinks(request);

        // Assert the response
        Assert.assertNotNull(response);
        // Add more assertions as needed
    }

    @Test
    public void ping() throws Exception
    {
        Assume.assumeTrue("Target HPCC does not seem to be containerized", iscontainerized);
        try
        {
            Assert.assertTrue(wsResourcesClient.ping());
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

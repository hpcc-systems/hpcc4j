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

import java.util.List;

import org.apache.axis2.AxisFault;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsresources.HPCCServiceWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsresources.ServiceQueryRequestWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsresources.ServiceQueryResponseWrapper;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WSResroucesClientTest extends BaseRemoteTest
{
    private static HPCCWsResourcesClient client;
    private boolean iscontainerized = false;

    static
    {
        client = HPCCWsResourcesClient.get(connection);
        Assert.assertNotNull(client);
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
    public void serviceQueryTest()
    {
        Assume.assumeTrue("Target HPCC does not seem to be containerized", iscontainerized);
        try
        {
            System.out.println("Querying all HPCC Services...");
            ServiceQueryResponseWrapper resp = client.serviceQuery(new ServiceQueryRequestWrapper());
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
    public void ping() throws Exception
    {
        Assume.assumeTrue("Target HPCC does not seem to be containerized", iscontainerized);
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
            e.printStackTrace();
            Assert.fail();
        }
    }
}

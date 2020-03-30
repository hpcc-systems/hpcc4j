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

import org.apache.axis2.AxisFault;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WURunResponse;
import org.hpccsystems.ws.client.platform.test.BaseRemoteTest;
import org.hpccsystems.ws.client.wrappers.ArrayOfECLExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WorkunitWrapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WSWorkunitsTest extends BaseRemoteTest
{
    private static HPCCWsWorkUnitsClient client;
    private static String  testwuid = System.getProperty("targetwuid");


    @BeforeClass
    public void setup() throws Exception
    {
        client = wsclient.getWsWorkunitsClient();
        Assert.assertNotNull(client);
    }

    @Test
    public void ping() throws Exception
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
    public void fastWURefreshTest() throws Exception
    {
        try
        {
            if (testwuid == null || testwuid.isEmpty())
                Assert.fail("Cannot test WsWorkunits.fastWURefreshTest without target WUID - provide 'targetwuid' System property!");

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
    public void getWUInfoTest() throws Exception
    {
        try
        {
            if (testwuid == null || testwuid.isEmpty())
                Assert.fail("Cannot test WsWorkunits.getWUInfoTest without target WUID - provide 'targetwuid' System property!");

            WorkunitWrapper wuInfo = client.getWUInfo(testwuid);

            System.out.println("wuid: " + wuInfo.getWuid());
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
    public void utf8Test() throws Exception
    {
        try
        {
            WorkunitWrapper wu = new WorkunitWrapper();
            wu.setECL("OUTPUT('¶');");
            wu.setJobname("WsClientUTF8_Test");
            wu.setCluster("thor");

            WURunResponse createAndRunWUFromECL = client.createAndRunWUFromECL(wu);
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
}

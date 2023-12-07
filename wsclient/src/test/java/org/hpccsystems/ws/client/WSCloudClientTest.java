/*##############################################################################

    HPCC SYSTEMS software Copyright (C) 2022 HPCC Systems®.

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


import static org.junit.Assume.assumeTrue;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WSCloudClientTest extends BaseRemoteTest
{
    private static HPCCWsCloudClient client;
    private static boolean isContainerizedTarget = true;

    static
    {
        client = HPCCWsCloudClient.get(connection);
        Assert.assertNotNull(client);
        try
        {
            isContainerizedTarget = client.isTargetHPCCContainerized();
        }
        catch (Exception e)
        {
            System.out.println("Failed to determine Containerized mode on target HPCC cluster, test results might be invalid!");
            isContainerizedTarget = false;
        }
    }


    @Test
    public void getPodsTest()
    {
        assumeTrue("Target HPCC cluster does not appear to be containerized, invalidating test", isContainerizedTarget);
        try
        {
            System.out.println("Fetching all User Pods...");
            String resp = client.getPods();
            Assert.assertNotNull(resp);
            Assert.assertTrue(!resp.isEmpty());

            JSONObject getPodsJson = new JSONObject(resp);
            JSONArray items = (JSONArray) getPodsJson.get("items");

            for(int i = 0; i < items.length(); i++)
            {
                JSONObject jsonobj = (JSONObject) items.get(i);
                JSONObject meta = (JSONObject) jsonobj.get("metadata");
                System.out.println("pod name.namespace: " + meta.getString("name") + "." + meta.getString("namespace"));
            }
        }
        catch (Exception e)
        {
            Assert.fail(e.getLocalizedMessage());
        }
    }
}

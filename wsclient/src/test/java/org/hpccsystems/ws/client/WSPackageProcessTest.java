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
import org.hpccsystems.ws.client.platform.test.BaseRemoteTest;
import org.hpccsystems.ws.client.wrappers.gen.wspackageprocess.PackageListMapDataWrapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.List;

import static org.junit.Assert.fail;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WSPackageProcessTest extends BaseRemoteTest
{
    HPCCWsPackageProcessClient client = wsclient.getWsPackageProcessClient();
    private String targetRoxieName = System.getProperty("roxiename");

    @Before
    public void setup() throws Exception
    {
        if (targetRoxieName == null)
        {
            System.out.println("WSPackageProcessTest: No 'roxiename' system prop provided, defaulting to 'roxie' cluster name");
            targetRoxieName = "roxie";
        }
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
            fail();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            fail();
        }
    }

    @Test
    public void listPackage() throws Exception {
        List<PackageListMapDataWrapper> packages = client.listPackages("*", targetRoxieName, null);
        if(packages==null || packages.isEmpty()) {
            fail("could not retrieve package lists from target cluster : " + targetRoxieName );
        }
        for(PackageListMapDataWrapper pkg : packages) {
            String pkgByID = client.getPackageMapById(pkg.getId());
            if(!pkgByID.contains("<PackageMaps id=\""+pkg.getId()+"\"")) {
                fail("failed to retrieve package map by id : " + pkg.getId());
            }
        }

    }
}

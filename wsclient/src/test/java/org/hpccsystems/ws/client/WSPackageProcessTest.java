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
import org.hpccsystems.ws.client.wrappers.gen.wspackageprocess.BasePackageStatusWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wspackageprocess.PackageListMapDataWrapper;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WSPackageProcessTest extends BaseRemoteTest
{
    HPCCWsPackageProcessClient client = wsclient.getWsPackageProcessClient();
    private static String targetRoxieName = System.getProperty("roxiename");
    private static String validPackageID = null;

    @BeforeClass
    static public void setup() throws Exception
    {
        if (targetRoxieName == null)
        {
            System.out.println("WSPackageProcessTest: No 'roxiename' system prop provided, defaulting to '' ");
            targetRoxieName = "";
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
    public void AA1_listPackageTest() throws Exception
    {
        List<PackageListMapDataWrapper> packages = client.listPackages("*", targetRoxieName, null);
        if(packages==null || packages.isEmpty())
        {
            fail("Could not retrieve package lists from target cluster : '" + targetRoxieName + "'" );
        }

        for(PackageListMapDataWrapper pkg : packages)
        {
            assertTrue(pkg.getId() != null && !pkg.getId().isEmpty());

            String pkgByID = client.getPackageMapById(pkg.getId());
            assertTrue(pkgByID != null && !pkgByID.isEmpty());

            if (validPackageID == null)
                validPackageID = pkg.getId();

            if(!pkgByID.contains("<PackageMaps id=\""+pkg.getId()+"\""))
            {
                fail("Failed to retrieve package map by id : " + pkg.getId());
            }
        }
    }

    @Test
    public void getPackageTest() throws Exception
    {
        Assume.assumeNotNull(validPackageID);

        BasePackageStatusWrapper getPackageStatus = client.getPackage("", targetRoxieName);

        Assert.assertNotNull(getPackageStatus);
        Assert.assertEquals(0, getPackageStatus.getCode());
    }
}

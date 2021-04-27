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

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.apache.axis2.AxisFault;
import org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPackageResponse;
import org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.DeletePackageResponse;
import org.hpccsystems.ws.client.wrappers.gen.wspackageprocess.AddPackageRequestWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wspackageprocess.BasePackageStatusWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wspackageprocess.DeletePackageRequestWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wspackageprocess.PackageListMapDataWrapper;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WSPackageProcessTest extends BaseRemoteTest
{
    HPCCWsPackageProcessClient client = wsclient.getWsPackageProcessClient();
    private static String targetRoxieName = System.getProperty("roxiename");
    private static String validPackageID = null;

    public static final String PackageMapContent = "<SuperFile id=\"~mypackagemap::supertest\"><SubFile value=\"~mypackagemap::subtest\"/></SuperFile>";
    public static final String StaticPMName = "hpcc4jPMtest";

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
    public void BBB1_listPackageTest() throws Exception
    {
        List<PackageListMapDataWrapper> packages = client.listPackages("*", targetRoxieName, null);
        if(packages!=null)
        {
            for(PackageListMapDataWrapper pkg : packages)
            {
                assertTrue(pkg.getId() != null && !pkg.getId().isEmpty());

                String pkgByID = client.getPackageMapById(pkg.getId());
                assertTrue(pkgByID != null && !pkgByID.isEmpty());

                if (validPackageID == null)
                    validPackageID = pkg.getId();

                System.out.println ("Found package: " + pkg.getId());

                if(!pkgByID.contains("<PackageMaps id=\""+pkg.getId()+"\""))
                {
                    fail("Failed to retrieve package map by id : " + pkg.getId());
                }
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

    @Test
    public void AAA1addPackageTest() throws Exception
    {
        System.out.println("WsPackageProcess junittest: AddPackageTest(" + StaticPMName + ") ...");

        AddPackageResponse addpackageresp = client.addPackage(StaticPMName, PackageMapContent, "*", null, true);

        Assert.assertNotNull(addpackageresp);

        System.out.println("Status message: " + addpackageresp.getStatus().getDescription());
        Assert.assertEquals(0, addpackageresp.getStatus().getCode());

        String [] missingfiles = addpackageresp.getFilesNotFound().getFile();

        if (missingfiles != null && missingfiles.length != 0)
        {
            System.out.println("Missing files: ");
            for (String missingfile : missingfiles)
            {
                System.out.println(missingfile + " ");
            }

            Assert.assertEquals("Missing Files reported", 0, missingfiles.length);
        }
    }

    @Test
    public void AAA1addPackageTestWrapper()
    {
        System.out.println("WsPackageProcess junittest: addPackageTestWrapper(" + StaticPMName + ") ...");
        AddPackageRequestWrapper myaddpackagereq = new AddPackageRequestWrapper();

        myaddpackagereq.setPackageMap(StaticPMName+"Wrapper");
        myaddpackagereq.setActivate(false);
        myaddpackagereq.setInfo(PackageMapContent);
        myaddpackagereq.setTarget("*");
        myaddpackagereq.setOverWrite(true);

        AddPackageResponse addpackageresp = null;
        try
        {
            addpackageresp = client.addPackage(myaddpackagereq);
        }
        catch (Exception e)
        {
            // process exceptions appropriately
        }

        Assert.assertNotNull(addpackageresp);
        System.out.println("Status message: " + addpackageresp.getStatus().getDescription());
        Assert.assertEquals(0, addpackageresp.getStatus().getCode());

        String [] missingfiles = addpackageresp.getFilesNotFound().getFile();

        if (missingfiles != null && missingfiles.length != 0)
        {
            System.out.println("Missing files: ");
            for (String missingfile : missingfiles)
            {
                System.out.println(missingfile + " ");
            }

            Assert.assertEquals("Missing Files reported", 0, missingfiles.length);
        }
    }

    @Test
    public void ZZZ2deletePackageTest() throws Exception
    {
        DeletePackageResponse delpackageresp = client.deletePackage(StaticPMName, "*");
        Assert.assertNotNull(delpackageresp);
        System.out.println("Status message: " + delpackageresp.getStatus().getDescription());
        Assert.assertEquals(0, delpackageresp.getStatus().getCode());
    }

    @Test
    public void ZZZ2deletePackageTestWrapper()
    {
        System.out.println("WsPackageProcess junittest: deletePackageTestWrapper(" + StaticPMName + ")...");
        DeletePackageRequestWrapper mydelpackagereq = new DeletePackageRequestWrapper();
        //caller sets appropriate values
        mydelpackagereq.setPackageMap(StaticPMName+"wrapper");
        mydelpackagereq.setTarget("*");
        mydelpackagereq.setProcess("*");

        DeletePackageResponse delpackageresp = null;
        try
        {
            delpackageresp = client.deletePackage(mydelpackagereq);
        }
        catch (Exception e)
        {
            // process exceptions appropriately
        }

        Assert.assertNotNull(delpackageresp);
        System.out.println("Status message: " + delpackageresp.getStatus().getDescription());
        Assert.assertEquals(0, delpackageresp.getStatus().getCode());
    }
}

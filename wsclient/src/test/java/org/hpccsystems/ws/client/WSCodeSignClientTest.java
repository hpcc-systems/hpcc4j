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
import org.hpccsystems.ws.client.wrappers.gen.wscodesign.ListUserIDsRequestWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wscodesign.ListUserIDsResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wscodesign.SignRequestWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wscodesign.SignResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wscodesign.SigningMethodTypeWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wscodesign.VerifyRequestWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wscodesign.VerifyResponseWrapper;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WSCodeSignClientTest extends BaseRemoteTest
{
    private static HPCCWsCodeSignClient client;
    private static String signed = null;

    static
    {
        client = HPCCWsCodeSignClient.get(connection);
        Assert.assertNotNull(client);
    }


    @Test
    public void listUserIDsTest()
    {
        try
        {
            System.out.println("Querying all User IDs...");
            ListUserIDsResponseWrapper resp = client.listUserIDs(new ListUserIDsRequestWrapper());
            Assert.assertNotNull(resp);

            List<String> users = resp.getUserIDs();
            if (users != null)
            {
                System.out.println("User ID listing: ");
                for (String user : users)
                {
                    System.out.println(user.toString());
                }
            }
            else
                System.out.println("No user ids found!");
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
    public void signTest()
    {
        try
        {
            System.out.println("attempting to sign...");
            SignRequestWrapper req = new SignRequestWrapper();
            req.setText("kjdfh");
            req.setKeyPass("asdfasdfasdas");
            SigningMethodTypeWrapper signmethod = new SigningMethodTypeWrapper();
            signmethod.setSigningMethodType("gpg");

            req.setSigningMethod(signmethod);
            req.setUserID("someuser");

            SignResponseWrapper resp = client.sign(req);
            Assert.assertNotNull(resp);
            int code = resp.getRetCode(); //what are the codes and what do they mean?

            String errmsg = resp.getErrMsg();
            if (errmsg != null && !errmsg.isEmpty())
                System.out.println("Error reported: " + errmsg);
            else
            {
                signed = resp.getSignedText();
                System.out.println("Signed: " + signed);
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
    public void verifyTest()
    {
        signed = "adsfasdfasdfasdfasdfasdfasdfasdfasdfasdfasd";
        Assume.assumeNotNull(signed);
        try
        {

            System.out.println("Verifying signed...");
            VerifyRequestWrapper req = new VerifyRequestWrapper();
            req.setText(signed);

            VerifyResponseWrapper resp = client.verify(req);
            Assert.assertNotNull(resp);

            int code = resp.getRetCode(); //what are the codes and what do they mean?

            String errmsg = resp.getErrMsg();
            if (errmsg != null && !errmsg.isEmpty())
                System.out.println("Error reported: " + errmsg);
            else
            {
                if (resp.getIsVerified())
                {
                    System.out.println("Verified (signed by " + resp.getSignedBy() +")");
                }
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

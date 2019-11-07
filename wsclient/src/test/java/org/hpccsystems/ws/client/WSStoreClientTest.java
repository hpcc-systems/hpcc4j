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

import java.util.Properties;

import org.apache.axis2.AxisFault;
import org.hpccsystems.ws.client.platform.test.BaseRemoteTest;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WSStoreClientTest extends BaseRemoteTest
{
    HPCCWsStoreClient client;
    static protected String storename = System.getProperty("storename");
    static protected String namespace = System.getProperty("storenamespace");
    public final static String defaultStoreName = "WsClientTestStore";
    public final static String defaultNS = "Junittests";

    static
    {
        if (System.getProperty("storename") == null)
            System.out.println("'storename' not provided, defaulting to: '" + defaultStoreName + "'");

        if (System.getProperty("storenamespace") == null)
            System.out.println("'storenamespace' not provided, defaulting to: '" + defaultNS + "'");
    }

    @Before
    public void setup() throws Exception
    {
        if (platform == null)
            super.setup();

        if (client == null)
            client = HPCCWsStoreClient.get(connection);

        if (storename == null)
            storename = defaultStoreName;

        if (namespace == null)
            namespace = defaultNS;

        Assert.assertNotNull(client);
    }

    public void printMetaData(int tabs, Properties props)
    {
        String tabstr = "";
        for (int i = 0; i < tabs; i++)
        {
            tabstr += "\t";
        }
        tabstr += "Created By: " + props.getProperty("@createUser") + " on: " + props.getProperty("@createTime");

        if (props.containsKey("@editTime"))
            tabstr += " Edited On: " + props.getProperty("@editTime");
        if (props.containsKey("@editBy"))
            tabstr += " Edited By: " + props.getProperty("@editBy");

        System.out.println(tabstr);
    }

    public Properties fetchKeyMetaData(String storename, String namespace, String key, boolean global) throws Exception, ArrayOfEspExceptionWrapper
    {
        return client.FetchKeyMetaData(storename, namespace, key, global);
    }

    public String fetchvalue(String storename, String namespace, String key, boolean global) throws Exception, ArrayOfEspExceptionWrapper
    {
        return client.FetchValue(storename, namespace, key, global);
    }

    public String fetchvalueEncrypted(String storename, String namespace, String key, boolean global, String secretKey) throws Exception, ArrayOfEspExceptionWrapper
    {
        return client.fetchValueEncrypted(storename, namespace, key, global, secretKey);
    }

    public void listNamespaceKeys(String store, String namespace, boolean global) throws Exception, ArrayOfEspExceptionWrapper
    {
        System.out.println("Listing Namespace Keys for default." + namespace + "...");
        String [] keys = client.listNSKeys(store, namespace, global);
        for (String key : keys)
        {
            String value = fetchvalue(store, namespace, key, global);
            System.out.print("\t\t" + key + ": '" + (value == null || value.isEmpty() ? "" : value) + "'");
            printMetaData(0, fetchKeyMetaData(store, namespace, key, global));
        }
    }

    @Test
    public void listNamespaces()
    {
        try
        {
            System.out.println("Listing all default namespaces...");
            String [] nss = client.listNamespaces(storename, true);
            Assert.assertNotNull(nss);

            for (String ns : nss)
            {
                System.out.println("Namespace (global): " + ns);
                listNamespaceKeys(storename, ns, true);
                client.fetchAllNSKeys(storename,ns,true);
            }

            nss = client.listNamespaces(storename, false);
            Assert.assertNotNull(nss);
            for (String ns : nss)
            {
                System.out.println("Namespace (user): " + ns);
                listNamespaceKeys(storename, ns, false);
                client.fetchAllNSKeys(storename, ns,false);
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
    public void a3fetchAllNSKeysTest()
    {
        try
        {
            System.out.println("Fetching all " + storename + "." + namespace + "keys...");
            Properties fetchAllNSKeys = client.fetchAllNSKeys(storename, namespace, true);
            Assert.assertNotNull(fetchAllNSKeys);
            System.out.println("All Keys: " + fetchAllNSKeys.toString());
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
    public void a2setTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        try
        {
            System.out.println("Setting " + storename + "." + namespace + "." + "WsClient.global.test=\"success\"...");
            Assert.assertTrue(client.setValue(storename, namespace, "global.test", "success", true));

            Assert.assertTrue(client.setValue(storename, namespace, "global.test", "success", true));
            System.out.println("Setting " + storename + "." + namespace + "." + "WsClient.user.test=\"success\"...");
            Assert.assertTrue(client.setValue(storename, namespace, "user.test", "success", false));

            Assert.assertTrue(client.setValue(storename, namespace, "files.rowperpage.default", "50", true));
            Assert.assertTrue(client.setValue(storename, namespace, "dp-thor_160-jim::tutorialperson-wuid", "W20190710-114239", false));
            Assert.assertTrue(client.setValue(storename, namespace, "ecl.playground.sample.default", "Java Simple", true));
        }
        catch (Exception e)
        {
            Assert.fail(e.getLocalizedMessage());
        }
    }

    @Test
    public void a3setEncryptedTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        try
        {
            //Generating random data as key content, client must keep track of this key in order to decrypt
            byte[] array = new byte[12];
            new Random().nextBytes(array);
            String mysecretkeycontent = new String(array, Charset.forName("UTF-8"));

            Cipher aesEncryptCipher = CryptoHelper.createDefaultCipher(mysecretkeycontent, true); //Encrypt cipher
            Cipher aesDecryptCipher = CryptoHelper.createDefaultCipher(mysecretkeycontent, false); //decrypt cipher
            Assert.assertNotNull(aesEncryptCipher);

            System.out.println("Setting (encrypted based on provided cipher) " + storename + "." + namespace + "." + "global.encrypted.test=\"mysensitivedata\"...");
            Assert.assertTrue(client.setValueEncrypted(storename, namespace, "global.encrypted.test", "mysensitivedata", true, aesEncryptCipher));

            String encryptedvalue = client.fetchValue(storename, namespace, "global.encrypted.test", true);
            Assert.assertNotNull(encryptedvalue);
            System.out.println("Fetching (encrypted based on provided cipher) " + storename + "." + namespace + "." + "global.encrypted.test=\"" + encryptedvalue + "\"");

            String decryptedvalue = CryptoHelper.decrypt(encryptedvalue, aesDecryptCipher);
            Assert.assertNotNull(decryptedvalue);

            System.out.println("Decrypted localy: global.encrypted.test=\"" + decryptedvalue + "\"");

            String decryptedvalue2 = client.fetchValueEncrypted(storename, namespace, "global.encrypted.test", true, aesDecryptCipher);
            Assert.assertNotNull(decryptedvalue2);

            Assert.assertTrue("Decrypted locally not equals decrypted by wsstore client", decryptedvalue.equals(decryptedvalue2));

            System.out.println("Setting (encrypted based on provided cipher) " + storename + "." + namespace + "." + "WsClient.user.encrypted.test=\"moresensitivedata\"...");
            Assert.assertTrue(client.setValueEncrypted(storename, namespace, "WsClient.user.encrypted.test", "moresensitivedata", false, aesEncryptCipher));

            System.out.println("Setting (encrypted based on private key) " + storename + "." + namespace + "." + "global.encrypted.secretkey.test=\"privateinfo\"...");
            Assert.assertTrue(client.setValueEncrypted(storename, namespace, "global.encrypted.secretkey.test", "privateinfo", true, mysecretkeycontent));

            System.out.println("Setting (encrypted based on private key) " + storename + "." + namespace + "." + "WsClient.user.encrypted.secretkey.test=\"moreprivateinfo\"...");
            Assert.assertTrue(client.setValueEncrypted(storename, namespace, "WsClient.user.encrypted.secretkey.test", "moreprivateinfo", false, mysecretkeycontent));
        }
        catch (Exception e)
        {
            Assert.fail(e.getLocalizedMessage());
        }
    }

    @Test
    public void a4deleteTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        try
        {
            System.out.println("Deleting " + storename + "." + namespace + "." + "WsClient.global.test=\"success\"...");
            Assert.assertTrue(client.setValue(storename, namespace, "WsClient.global.test", "success", true));
            System.out.println("Deleting " + storename + "." + namespace + "." + "WsClient.user.test=\"success\"...");
            Assert.assertTrue(client.setValue(storename, namespace, "WsClient.user.test", "success", false));
        }
        catch (Exception e)
        {
            Assert.fail(e.getLocalizedMessage());
        }
    }

    @Test
    public void a1createStoreTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        try
        {
            System.out.println("Creating Store: '" + storename + "' ...");
            boolean success = client.createStore(storename, "Store strictly for WsClient tests", "TEST");
            if (!success)
                System.out.println("No exceptions, but failure reported. Does this store already exist? Store: '" + storename + "'");
        }
        catch (Exception e)
        {
            Assert.fail(e.getLocalizedMessage());
        }
    }

    @Test
    public void z91deleteNSTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        try
        {
            System.out.println("Deleting ns: '" + namespace + "' ...");
            Assert.assertTrue(client.deleteNamespace(storename, namespace, true, ""));
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

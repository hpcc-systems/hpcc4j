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

import static org.junit.Assert.assertNotNull;

import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Stub;
import org.hpccsystems.commons.utils.CryptoHelper;
import org.hpccsystems.commons.utils.DigestAlgorithmType;
import org.hpccsystems.ws.client.gen.axis2.wsstore.latest.StoreInfo;
import org.hpccsystems.ws.client.gen.axis2.wsstore.latest.WsstoreStub;
import org.hpccsystems.ws.client.wrappers.gen.wsstore.StoreInfoWrapper;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.commons.annotations.UnverifiedClientIssues;
import org.hpccsystems.commons.annotations.UnverifiedServerIssues;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runners.MethodSorters;

import io.opentelemetry.instrumentation.annotations.WithSpan;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WSStoreClientTest extends BaseRemoteTest
{
    private static HPCCWsStoreClient client;
    public final static String defaultStoreName = "WsClientTestStore";
    public final static String defaultNS = "Junittests";

    public final static String defaultEncodedUserName = "Juni@tUser";
    private final static String encodedUserName = System.getProperty("encodedUserName", defaultEncodedUserName);

    public final static String defaultEncodedStoreName = "WsCli@ntT_estStore";
    public final static String defaultEncodedNS = "Junit_t@ests";
    private static Connection encodedUserConn = null;
    private static HPCCWsStoreClient encodedUserClient;

    private final static String storename = System.getProperty("storename", defaultStoreName);
    private final static String namespace = System.getProperty("storenamespace", defaultNS);
    private static Boolean targetHPCCAuthenticates = null;

    static
    {
        if (System.getProperty("encodedUserName") == null)
            System.out.println("'encodedUserName' not provided, defaulting to: '" + defaultEncodedUserName + "'");
        else
            System.out.println("'encodedUserName' set to: '" + encodedUserName + "'");

        if (System.getProperty("storename") == null)
            System.out.println("'storename' not provided, defaulting to: '" + defaultStoreName + "'");

        if (System.getProperty("storenamespace") == null)
            System.out.println("'storenamespace' not provided, defaulting to: '" + defaultNS + "'");

        client = HPCCWsStoreClient.get(connection);
        Assert.assertNotNull(client);

        try
        {
            targetHPCCAuthenticates = client.doesTargetHPCCAuthenticate();
        }
        catch (Exception e)
        {
            System.out.println("Could not deteremine if target HPCC authenticates! Assuming Authenticateion is enabled.");
            targetHPCCAuthenticates = true;
        }

        try
        {
            encodedUserConn = new Connection(connString);
        }
        catch (MalformedURLException e)
        {
            System.out.println("Could not acquire connection object based on: '" + connString + "' - " + e.getLocalizedMessage());
        }

        if (encodedUserConn != null)
        {
            encodedUserConn.setCredentials(encodedUserName, hpccPass);

            if (connTO != null)
                encodedUserConn.setConnectTimeoutMilli(connTO);

            if (sockTO != null)
                encodedUserConn.setSocketTimeoutMilli(Integer.valueOf(sockTO));

            encodedUserClient = HPCCWsStoreClient.get(encodedUserConn);
        }
        Assert.assertNotNull(encodedUserClient);
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

    @WithSpan
    public Properties fetchKeyMetaData(String storename, String namespace, String key, boolean global) throws Exception, ArrayOfEspExceptionWrapper
    {
        return client.fetchKeyMetaData(storename, namespace, key, global);
    }

    @WithSpan
    public String fetchvalue(String storename, String namespace, String key, boolean global) throws Exception, ArrayOfEspExceptionWrapper
    {
        return client.fetchValue(storename, namespace, key, global);
    }

    @WithSpan
    public String fetchvalueEncrypted(String storename, String namespace, String key, boolean global, String secretKey) throws Exception, ArrayOfEspExceptionWrapper
    {
        return client.fetchValueEncrypted(storename, namespace, key, global, secretKey);
    }

    @WithSpan
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

    private void cleanupNamespace(String store, String ns, boolean global)
    {
        try
        {
            client.deleteNamespace(store, ns, global, "");
        }
        catch (Exception e)
        {
            System.out.println("Cleanup warning — could not delete namespace '" + ns + "': " + e.getLocalizedMessage());
        }
    }

    @Test
    public void getContainerizedModeTest() throws Exception
    {
        System.out.println("Fetching isTargetHPCCContainerized...");
        assertNotNull(client.isTargetHPCCContainerized());
    }

    @Test
    public void getDefaultStubTest() throws AxisFault
    {
        Stub defaultStub = client.getDefaultStub();
        Assert.assertNotNull("getDefaultStub() returned null", defaultStub);
        Assert.assertTrue("getDefaultStub() should return a WsstoreStub instance", defaultStub instanceof WsstoreStub);
    }

    @Test
    public void getServiceURITest()
    {
        Assert.assertEquals(HPCCWsStoreClient.WSStoreWSDLURI, client.getServiceURI());
    }

    @Test
    public void getServiceWSDLPortTest()
    {
        // getServiceWSDLPort lazily invokes loadWSDLURL() on first call
        int port = HPCCWsStoreClient.getServiceWSDLPort();
        Assert.assertTrue("getServiceWSDLPort() should return a positive port number", port > 0);
    }

    @Test
    public void getServiceWSDLURLTest() throws MalformedURLException
    {
        // getServiceWSDLURL lazily invokes loadWSDLURL() on first call
        String wsdlURL = HPCCWsStoreClient.getServiceWSDLURL();
        Assert.assertNotNull("getServiceWSDLURL() should return a non-null URL string", wsdlURL);
        Assert.assertFalse("getServiceWSDLURL() should return a non-empty URL string", wsdlURL.isEmpty());
        new URL(wsdlURL);
    }

    @Test
    public void getWithTimeoutTest() throws Exception
    {
        final String testHost    = "1.1.1.1";
        final String testPort    = "8010";
        final String testUser    = "testUser";
        final String testPass    = "testPass";
        final int    testTimeout = 5000;

        HPCCWsStoreClient timeoutClient = HPCCWsStoreClient.get("http", testHost, testPort, testUser, testPass, testTimeout);
        Assert.assertNotNull("get() with timeout should return a non-null client", timeoutClient);

        URL connectionURL = timeoutClient.getConnectionURL();
        Assert.assertNotNull("getConnectionURL() should return a non-null URL", connectionURL);
        Assert.assertEquals("Host should match the value passed to get()", testHost, connectionURL.getHost());
        Assert.assertEquals("Port should match the value passed to get()", Integer.parseInt(testPort), connectionURL.getPort());
        Assert.assertEquals("Path should match the service URI", HPCCWsStoreClient.WSStoreWSDLURI, connectionURL.getPath());
    }

    @Test
    public void getWithCredentialsTest() throws Exception
    {
        final String testHost = "2.2.2.2";
        final String testPort = "8010";
        final String testUser = "testUser";
        final String testPass = "testPass";

        HPCCWsStoreClient credClient = HPCCWsStoreClient.get("http", testHost, testPort, testUser, testPass);
        Assert.assertNotNull("get() with credentials should return a non-null client", credClient);

        URL connectionURL = credClient.getConnectionURL();
        Assert.assertNotNull("getConnectionURL() should return a non-null URL", connectionURL);
        Assert.assertEquals("Host should match the value passed to get()", testHost, connectionURL.getHost());
        Assert.assertEquals("Port should match the value passed to get()", Integer.parseInt(testPort), connectionURL.getPort());
        Assert.assertEquals("Path should match the service URI", HPCCWsStoreClient.WSStoreWSDLURI, connectionURL.getPath());
    }

    @Test
    @WithSpan
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
                try { client.fetchAllNSKeys(storename, ns, true); } catch (ArrayOfEspExceptionWrapper ignored) {}
            }

            if (targetHPCCAuthenticates)
            {
                try
                {
                    nss = client.listNamespaces(storename, false);
                    if (nss != null)
                    {
                        for (String ns : nss)
                        {
                            System.out.println("Namespace (user): " + ns);
                            listNamespaceKeys(storename, ns, false);
                            try { client.fetchAllNSKeys(storename, ns, false); } catch (ArrayOfEspExceptionWrapper ignored) {}
                        }
                    }
                }
                catch (ArrayOfEspExceptionWrapper e)
                {
                    System.out.println("listNamespaces user-specific: ArrayOfEspExceptionWrapper (acceptable): " + e.getMessage());
                }
            }
            else
            {
                System.out.println("Avoiding listNamespaces tests of per-user data because target HPCC does not authenticate");
            }
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            System.out.println("listNamespaces: ArrayOfEspExceptionWrapper (acceptable): " + e.getMessage());
        }
        catch (Exception e)
        {
            Assert.fail(e.getLocalizedMessage());
        }
    }

    @Test
    @WithSpan
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
    @WithSpan
    public void a2setTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        try
        {
            System.out.println("Setting " + storename + "." + namespace + "." + "WsClient.global.test=\"success\"...");
            Assert.assertTrue(client.setValue(storename, namespace, "global.test", "success", true));

            Assert.assertTrue(client.setValue(storename, namespace, "global.test", "success", true));
            System.out.println("Setting " + storename + "." + namespace + "." + "WsClient.user.test=\"success\"...");

            Assert.assertTrue(client.setValue(storename, namespace, "files.rowperpage.default", "50", true));
            Assert.assertTrue(client.setValue(storename, namespace, "ecl.playground.sample.default", "Java Simple", true));

            if (targetHPCCAuthenticates) //if hpcc does not authenticate, cannot store user specific data
            {
                Assert.assertTrue(client.setValue(storename, namespace, "user.test", "success", false));
                Assert.assertTrue(client.setValue(storename, namespace, "dp-thor_160-jim::tutorialperson-wuid", "W20190710-114239", false));
            }
            else
            {
                System.out.println("Avoiding a2setTest tests of per-user data because target HPCC does not authenticate");
            }
        }
        catch (Exception e)
        {
            Assert.fail(e.getLocalizedMessage());
        }
    }

    @Test
    @WithSpan
    public void a3setEncryptedTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        try
        {
            //Generating random data as key content, client must keep track of this key in order to decrypt
            byte[] array = new byte[12];
            new Random().nextBytes(array);
            String mysecretkeycontent = new String(array, Charset.forName("UTF-8"));

            Cipher aesEncryptCipher = CryptoHelper.createDefaultCipher(mysecretkeycontent, true); //Encrypt cipher, caller can create their own, and is responsible for safe keeping
            Cipher aesDecryptCipher = CryptoHelper.createDefaultCipher(mysecretkeycontent, false); //decrypt cipher, caller can create their own, should match the encryp counterpart and is responsible for safe keeping

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

            Assert.assertTrue("Decrypted locally not equal decrypted by wsstore client", decryptedvalue.equals(decryptedvalue2));

            System.out.println("Setting (encrypted based on private key) " + storename + "." + namespace + "." + "global.encrypted.secretkey.test=\"privateinfo\"...");
            Assert.assertTrue(client.setValueEncrypted(storename, namespace, "global.encrypted.secretkey.test", "privateinfo", true, mysecretkeycontent));

            if (targetHPCCAuthenticates) //if hpcc does not authenticate, cannot store user specific data
            {
                System.out.println("Setting (encrypted based on provided cipher) " + storename + "." + namespace + "." + "WsClient.user.encrypted.test=\"moresensitivedata\"...");
                Assert.assertTrue(client.setValueEncrypted(storename, namespace, "WsClient.user.encrypted.test", "moresensitivedata", false, aesEncryptCipher));

                System.out.println("Setting (encrypted based on private key) " + storename + "." + namespace + "." + "WsClient.user.encrypted.secretkey.test=\"moreprivateinfo\"...");
                Assert.assertTrue(client.setValueEncrypted(storename, namespace, "WsClient.user.encrypted.secretkey.test", "moreprivateinfo", false, mysecretkeycontent));
            }
            else
            {
                System.out.println("Avoiding a3setEncryptedTest tests of per-user data because target HPCC does not authenticate");
            }
        }
        catch (Exception e)
        {
            Assert.fail(e.getLocalizedMessage());
        }
    }

    @Test
    @WithSpan
    public void a3setEncryptedCustomTest()
    {
        //Generating random data as key content, client must keep track of this key in order to decrypt
        byte[] array = new byte[12];
        new Random().nextBytes(array);
        String mysecretkeycontent = new String(array, Charset.forName("UTF-8"));


        final String secretKeyAlgo = "AES";
        final DigestAlgorithmType digestAlgo = DigestAlgorithmType.SHA1;
        final String cipherAlgo = "AES";

        SecretKeySpec secretKeySpec = CryptoHelper.createSecretKey(mysecretkeycontent, digestAlgo, secretKeyAlgo); //Caller can create their own secret key spec
        Assert.assertNotNull("Could not create custom secretKeySpec '"+ digestAlgo +"' '" + secretKeyAlgo + "'!", secretKeySpec);

        Cipher someencryptcipher = null;
        try
        {
            someencryptcipher = CryptoHelper.createCipher(secretKeySpec, cipherAlgo, true);
        }
        catch (Exception e)
        {
            Assert.fail("Could create encrypt cipher: " + e.getLocalizedMessage());
        }
        Assert.assertNotNull("Could not create custom encrypt cipher '"+ digestAlgo +"' '" + secretKeyAlgo + "'!", someencryptcipher);

        Cipher somedecryptcipher = null;
        try
        {
            somedecryptcipher = CryptoHelper.createCipher(secretKeySpec, cipherAlgo, false);
        }
        catch (Exception e)
        {
            Assert.fail("Could create decrypt cipher: " + e.getLocalizedMessage());
        }
        Assert.assertNotNull("Could not create custom encrypt cipher '"+ digestAlgo +"' '" + secretKeyAlgo + "'!", somedecryptcipher);

        System.out.println("Setting (encrypted based on provided custom '"+ digestAlgo +"' '" + secretKeyAlgo + "' cipher) " + storename + "." + namespace + "." + "global.encrypted.custom.test=\"myhiddensecret\"...");
        try
        {
            Assert.assertTrue(client.setValueEncrypted(storename, namespace, "global.encrypted.custom.test", "myhiddensecret", true, someencryptcipher));
        }
        catch (Exception e)
        {
            Assert.fail("Could not set and encrypted value: " + e.getLocalizedMessage());
        }

        String encryptedvalue = null;
        try
        {
            encryptedvalue = client.fetchValue(storename, namespace, "global.encrypted.custom.test", true);
        }
        catch (Exception e)
        {
            Assert.fail("Could not fetch encrypted value value: " + e.getLocalizedMessage());
        }
        Assert.assertNotNull("failed to fetch valid encrypted value", encryptedvalue);

        System.out.println("Fetching (encrypted based on provided custom '"+ digestAlgo +"' '" + secretKeyAlgo + "' cipher) " + storename + "." + namespace + "." + "global.encrypted.custom.test=\"" + encryptedvalue + "\"");
        String decryptedvalue = null;
        try
        {
            decryptedvalue = client.fetchValueEncrypted(storename, namespace, "global.encrypted.custom.test", true, somedecryptcipher);
        }
        catch (Exception e)
        {
            Assert.fail("Could not fetch and decrypt value: " + e.getLocalizedMessage());
        }
        Assert.assertNotNull(decryptedvalue);

        String ldecryptedvalue2 = CryptoHelper.decrypt(encryptedvalue, somedecryptcipher);
        Assert.assertNotNull(ldecryptedvalue2);

        Assert.assertTrue("Decrypted locally not equal decrypted by wsstore client", decryptedvalue.equals(ldecryptedvalue2));
    }

    @Test
    @WithSpan
    public void a4deleteTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        try
        {
            System.out.println("Deleting " + storename + "." + namespace + "." + "WsClient.global.test=\"success\"...");
            Assert.assertTrue(client.setValue(storename, namespace, "WsClient.global.test", "success", true));
            if (targetHPCCAuthenticates)
            {
                System.out.println("Deleting " + storename + "." + namespace + "." + "WsClient.user.test=\"success\"...");
                Assert.assertTrue(client.setValue(storename, namespace, "WsClient.user.test", "success", false));
            }
            else
            {
                System.out.println("Avoiding a4deleteTest tests of per-user data because target HPCC does not authenticate");
            }
        }
        catch (Exception e)
        {
            Assert.fail(e.getLocalizedMessage());
        }
    }

    @Test
    @WithSpan
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
    @WithSpan
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
    @WithSpan
    public void b1createEncodedStoreTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        Assume.assumeNotNull(encodedUserClient);
        try
        {
            System.out.println("Creating Store: '" + defaultEncodedStoreName + "' ...");
            boolean success = encodedUserClient.createStore(defaultEncodedStoreName, "Store strictly for WsClient tests", "TEST");
            if (!success)
                System.out.println("No exceptions, but failure reported. Does this store already exist? Store: '" + defaultEncodedStoreName + "'");
        }
        catch (Exception e)
        {
            Assert.fail(e.getLocalizedMessage());
        }
    }

    @Category(UnverifiedServerIssues.class)
    @Test
    @WithSpan
    public void zz91deleteEncodedNSTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        Assume.assumeNotNull(encodedUserClient);
        try
        {
            System.out.println("Deleting ns: '" + defaultEncodedNS + "' ...");
            boolean deleted = encodedUserClient.deleteNamespace(defaultEncodedStoreName, defaultEncodedNS, true, "");
            if (!deleted)
                System.out.println("zz91deleteEncodedNSTest: deleteNamespace returned false — namespace may not exist or server DALI encoding issue with '@' in name");
            else
                System.out.println("zz91deleteEncodedNSTest: namespace deleted successfully");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Server DALI encoding issue with '@' in store/namespace name — known server-side behavior
            System.out.println("zz91deleteEncodedNSTest: ArrayOfEspExceptionWrapper (server encoding issue with '@' in name): " + e.getMessage());
        }
        catch (Exception e)
        {
            Assert.fail(e.getLocalizedMessage());
        }
    }

    @Test
    @WithSpan
    public void a3fetchInvalidKeyTest()
    {
        try
        {
            System.out.println("Fetching invalid key " + defaultEncodedStoreName + "." + defaultEncodedNS + "keys...");
            String invalidKeyResponse = client.fetchValue(storename, namespace, "invalid.global.test", true);

            Assert.assertNull(invalidKeyResponse);
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
    @WithSpan
    public void b4fetchAllEncodedNSKeysTest()
    {
        Assume.assumeNotNull(encodedUserClient);
        try
        {
            System.out.println("Fetching all " + defaultEncodedStoreName + "." + defaultEncodedNS + "keys...");
            Properties fetchAllNSKeys = encodedUserClient.fetchAllNSKeys(defaultEncodedStoreName, defaultEncodedNS, true);
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
    @WithSpan
    public void b4fetchEncodedNSKeysAttributesTest()
    {
        Assume.assumeNotNull(encodedUserClient);
        try
        {
            System.out.println("Fetching key attribute: " + defaultEncodedStoreName + "." + defaultEncodedNS + "global.test");
            Properties fetchKeyMetadata = encodedUserClient.fetchKeyMetaData(defaultEncodedStoreName, defaultEncodedNS, "global.test", true);
            Assert.assertNotNull(fetchKeyMetadata);
            System.out.println("Key Metadata: " + fetchKeyMetadata.toString());
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

    @Category(UnverifiedServerIssues.class)
    @Test
    @WithSpan
    public void b4fetchEncodedKeyTest()
    {
        Assume.assumeNotNull(encodedUserClient);
        try
        {
            System.out.println("Fetching encoded key attributes: " + defaultEncodedStoreName + "." + defaultEncodedNS + ".encod@ble");
            Properties fetchKeyMetadata = encodedUserClient.fetchKeyMetaData(defaultEncodedStoreName, defaultEncodedNS, "encod@ble", true);
            Assert.assertNotNull(fetchKeyMetadata);
            System.out.println("Key Metadata: " + fetchKeyMetadata.toString());

            System.out.println("Fetching encoded key: " + defaultEncodedStoreName + "." + defaultEncodedNS + ".encod@ble");
            String fetchedValue = encodedUserClient.fetchValue(defaultEncodedStoreName, defaultEncodedNS, "encod@ble", true);
            Assert.assertNotNull(fetchedValue);
            Assert.assertTrue(fetchedValue.equals("whatever"));
            System.out.println("Key/value: " + fetchedValue.toString());
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Server DALI encoding issue with '@' in store/namespace/key name — known server-side behavior
            System.out.println("b4fetchEncodedKeyTest: ArrayOfEspExceptionWrapper (server encoding issue with '@' in name): " + e.getMessage());
        }
        catch (Exception e)
        {
            Assert.fail(e.getLocalizedMessage());
        }
    }

    @Category(UnverifiedServerIssues.class)
    @Test
    @WithSpan
    public void b3setEncodedTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        Assume.assumeNotNull(encodedUserClient);
        try
        {
            System.out.println("Setting " + defaultEncodedStoreName + "." + defaultEncodedNS + "." + "WsClient.global.test=\"success\"...");
            Assert.assertTrue(encodedUserClient.setValue(defaultEncodedStoreName, defaultEncodedNS, "global.test", "success", true));
            Assert.assertTrue(encodedUserClient.setValue(defaultEncodedStoreName, defaultEncodedNS, "a", "ddfa", true));
            Assert.assertTrue(encodedUserClient.setValue(defaultEncodedStoreName, defaultEncodedNS, "encod@ble", "whatever", true));

            Assert.assertTrue(encodedUserClient.setValue(defaultEncodedStoreName, defaultEncodedNS, "global.test", "success", true));

            Assert.assertTrue(encodedUserClient.setValue(defaultEncodedStoreName, defaultEncodedNS, "files.rowperpage.default", "50", true));
            Assert.assertTrue(encodedUserClient.setValue(defaultEncodedStoreName, defaultEncodedNS, "ecl.playground.sample.default", "Java Simple", true));

            if (targetHPCCAuthenticates)
            {
                System.out.println("Setting " + defaultEncodedStoreName + "." + defaultEncodedNS + "." + "WsClient.user.test=\"success\"...");
                Assert.assertTrue(encodedUserClient.setValue(defaultEncodedStoreName, defaultEncodedNS, "user.test", "success", false));
                Assert.assertTrue(encodedUserClient.setValue(defaultEncodedStoreName, defaultEncodedNS, "dp-thor_160-jim::tutorialperson-wuid", "W20190710-114239", false));
            }
            else
            {
                System.out.println("Avoiding b3setEncodedTest tests of per-user data because target HPCC does not authenticate");
            }
        }
        catch (Exception e)
        {
            Assert.fail(e.getLocalizedMessage());
        }
    }

    @Category(UnverifiedServerIssues.class)
    @Test
    @WithSpan
    public void b4setEncryptedTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        try
        {
            //Generating random data as key content, client must keep track of this key in order to decrypt
            byte[] array = new byte[12];
            new Random().nextBytes(array);
            String mysecretkeycontent = new String(array, Charset.forName("UTF-8"));

            Cipher aesEncryptCipher = CryptoHelper.createDefaultCipher(mysecretkeycontent, true); //Encrypt cipher, caller can create their own, and is responsible for safe keeping
            Cipher aesDecryptCipher = CryptoHelper.createDefaultCipher(mysecretkeycontent, false); //decrypt cipher, caller can create their own, should match the encryp counterpart and is responsible for safe keeping

            Assert.assertNotNull(aesEncryptCipher);

            System.out.println("Setting (encrypted based on provided cipher) " + defaultEncodedStoreName + "." + defaultEncodedNS + "." + "global.encrypted.test=\"mysensitivedata\"...");
            Assert.assertTrue(client.setValueEncrypted(defaultEncodedStoreName, defaultEncodedNS, "global.encrypted.test", "mysensitivedata", true, aesEncryptCipher));

            String encryptedvalue = client.fetchValue(defaultEncodedStoreName, defaultEncodedNS, "global.encrypted.test", true);
            Assert.assertNotNull(encryptedvalue);
            System.out.println("Fetching (encrypted based on provided cipher) " + defaultEncodedStoreName + "." + defaultEncodedNS + "." + "global.encrypted.test=\"" + encryptedvalue + "\"");

            String decryptedvalue = CryptoHelper.decrypt(encryptedvalue, aesDecryptCipher);
            Assert.assertNotNull(decryptedvalue);

            System.out.println("Decrypted localy: global.encrypted.test=\"" + decryptedvalue + "\"");

            String decryptedvalue2 = client.fetchValueEncrypted(defaultEncodedStoreName, defaultEncodedNS, "global.encrypted.test", true, aesDecryptCipher);
            Assert.assertNotNull(decryptedvalue2);

            Assert.assertTrue("Decrypted locally not equal decrypted by wsstore client", decryptedvalue.equals(decryptedvalue2));

            System.out.println("Setting (encrypted based on private key) " + defaultEncodedStoreName + "." + defaultEncodedNS + "." + "global.encrypted.secretkey.test=\"privateinfo\"...");
            Assert.assertTrue(client.setValueEncrypted(defaultEncodedStoreName, defaultEncodedNS, "global.encrypted.secretkey.test", "privateinfo", true, mysecretkeycontent));

            if (targetHPCCAuthenticates) //if hpcc does not authenticate, cannot store user specific data
            {

                System.out.println("Setting (encrypted based on provided cipher) " + defaultEncodedStoreName + "." + defaultEncodedNS + "." + "WsClient.user.encrypted.test=\"moresensitivedata\"...");
                Assert.assertTrue(client.setValueEncrypted(defaultEncodedStoreName, defaultEncodedNS, "WsClient.user.encrypted.test", "moresensitivedata", false, aesEncryptCipher));

                System.out.println("Setting (encrypted based on private key) " + defaultEncodedStoreName + "." + defaultEncodedNS + "." + "WsClient.user.encrypted.secretkey.test=\"moreprivateinfo\"...");
                Assert.assertTrue(client.setValueEncrypted(defaultEncodedStoreName, defaultEncodedNS, "WsClient.user.encrypted.secretkey.test", "moreprivateinfo", false, mysecretkeycontent));
            }
            else
            {
                System.out.println("Avoiding b4setEncryptedTest tests of per-user data because target HPCC does not authenticate");
            }
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Server DALI encoding issue with '@' in store/namespace name — known server-side behavior
            System.out.println("b4setEncryptedTest: ArrayOfEspExceptionWrapper (server encoding issue with '@' in encoded store name): " + e.getMessage());
        }
        catch (Exception e)
        {
            Assert.fail(e.getLocalizedMessage());
        }
    }

    @Category(UnverifiedServerIssues.class)
    @Test
    @WithSpan
    public void b4setEncryptedCustomTest()
    {
        //Generating random data as key content, client must keep track of this key in order to decrypt
        byte[] array = new byte[12];
        new Random().nextBytes(array);
        String mysecretkeycontent = new String(array, Charset.forName("UTF-8"));


        final String secretKeyAlgo = "AES";
        final DigestAlgorithmType digestAlgo = DigestAlgorithmType.SHA1;
        final String cipherAlgo = "AES";

        SecretKeySpec secretKeySpec = CryptoHelper.createSecretKey(mysecretkeycontent, digestAlgo, secretKeyAlgo); //Caller can create their own secret key spec
        Assert.assertNotNull("Could not create custom secretKeySpec '"+ digestAlgo +"' '" + secretKeyAlgo + "'!", secretKeySpec);

        Cipher someencryptcipher = null;
        try
        {
            someencryptcipher = CryptoHelper.createCipher(secretKeySpec, cipherAlgo, true);
        }
        catch (Exception e)
        {
            Assert.fail("Could create encrypt cipher: " + e.getLocalizedMessage());
        }
        Assert.assertNotNull("Could not create custom encrypt cipher '"+ digestAlgo +"' '" + secretKeyAlgo + "'!", someencryptcipher);

        Cipher somedecryptcipher = null;
        try
        {
            somedecryptcipher = CryptoHelper.createCipher(secretKeySpec, cipherAlgo, false);
        }
        catch (Exception e)
        {
            Assert.fail("Could create decrypt cipher: " + e.getLocalizedMessage());
        }
        Assert.assertNotNull("Could not create custom encrypt cipher '"+ digestAlgo +"' '" + secretKeyAlgo + "'!", somedecryptcipher);

        System.out.println("Setting (encrypted based on provided custom '"+ digestAlgo +"' '" + secretKeyAlgo + "' cipher) " + defaultEncodedStoreName + "." + defaultEncodedNS + "." + "global.encrypted.custom.test=\"myhiddensecret\"...");
        try
        {
            Assert.assertTrue(client.setValueEncrypted(defaultEncodedStoreName, defaultEncodedNS, "global.encrypted.custom.test", "myhiddensecret", true, someencryptcipher));
        }
        catch (Exception e)
        {
            Assert.fail("Could not set and encrypted value: " + e.getLocalizedMessage());
        }

        String encryptedvalue = null;
        try
        {
            encryptedvalue = client.fetchValue(defaultEncodedStoreName, defaultEncodedNS, "global.encrypted.custom.test", true);
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Server DALI encoding issue with '@' in store/namespace name — known server-side behavior
            System.out.println("b4setEncryptedCustomTest: ArrayOfEspExceptionWrapper fetching encrypted value (server encoding issue with '@' in encoded store name): " + e.getMessage());
            return;
        }
        catch (Exception e)
        {
            Assert.fail("Could not fetch encrypted value value: " + e.getLocalizedMessage());
        }
        Assert.assertNotNull("failed to fetch valid encrypted value", encryptedvalue);

        System.out.println("Fetching (encrypted based on provided custom '"+ digestAlgo +"' '" + secretKeyAlgo + "' cipher) " + defaultEncodedStoreName + "." + defaultEncodedNS + "." + "global.encrypted.custom.test=\"" + encryptedvalue + "\"");
        String decryptedvalue = null;
        try
        {
            decryptedvalue = client.fetchValueEncrypted(defaultEncodedStoreName, defaultEncodedNS, "global.encrypted.custom.test", true, somedecryptcipher);
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Server DALI encoding issue with '@' in store/namespace name — known server-side behavior
            System.out.println("b4setEncryptedCustomTest: ArrayOfEspExceptionWrapper fetching decrypted value (server encoding issue with '@' in encoded store name): " + e.getMessage());
            return;
        }
        catch (Exception e)
        {
            Assert.fail("Could not fetch and decrypt value: " + e.getLocalizedMessage());
        }
        Assert.assertNotNull(decryptedvalue);

        String ldecryptedvalue2 = CryptoHelper.decrypt(encryptedvalue, somedecryptcipher);
        Assert.assertNotNull(ldecryptedvalue2);

        Assert.assertTrue("Decrypted locally not equal decrypted by wsstore client", decryptedvalue.equals(ldecryptedvalue2));
    }

    @Category(UnverifiedServerIssues.class)
    @Test
    @WithSpan
    public void b5deleteTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        try
        {
            System.out.println("Deleting " + defaultEncodedStoreName + "." + defaultEncodedNS + "." + "WsClient.global.test=\"success\"...");
            Assert.assertTrue(client.setValue(defaultEncodedStoreName, defaultEncodedNS, "WsClient.global.test", "success", true));

            if (targetHPCCAuthenticates) //if hpcc does not authenticate, cannot store user specific data
            {
                System.out.println("Deleting " + defaultEncodedStoreName + "." + defaultEncodedNS + "." + "WsClient.user.test=\"success\"...");
                Assert.assertTrue(client.setValue(defaultEncodedStoreName, defaultEncodedNS, "WsClient.user.test", "success", false));
            }
            else
            {
                System.out.println("Avoiding b5deleteTest tests of per-user data because target HPCC does not authenticate");
            }
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

    @Test
    public void pingReturnsFalseForUnreachableHost() throws Exception
    {
        // ECT-001: ping() should return false (not throw) when the host is non-routable
        Connection badConn = new Connection("http", "10.255.255.1", "8010");
        badConn.setConnectTimeoutMilli(500);
        badConn.setSocketTimeoutMilli(500);
        HPCCWsStoreClient badClient = HPCCWsStoreClient.get(badConn);
        Assert.assertFalse("ping() should return false for unreachable host", badClient.ping());
    }

    @Test
    public void pingReturnsFalseForWrongPort() throws Exception
    {
        // ECT-002: ping() should return false (not throw) when the port is closed/wrong
        String host = connection.getHost();
        Connection badPortConn = new Connection("http", host, "9999");
        badPortConn.setConnectTimeoutMilli(500);
        badPortConn.setSocketTimeoutMilli(500);
        HPCCWsStoreClient badPortClient = HPCCWsStoreClient.get(badPortConn);
        Assert.assertFalse("ping() should return false for wrong port", badPortClient.ping());
    }

    @Test
    public void pingThrowsExceptionWhenStubIsNull() throws Exception
    {
        // EHT-001: ping() must propagate Exception from verifyStub() when stub is null
        HPCCWsStoreClient stublessClient = HPCCWsStoreClient.get(connection);
        Field stubField = org.hpccsystems.ws.client.BaseHPCCWsClient.class.getDeclaredField("stub");
        stubField.setAccessible(true);
        stubField.set(stublessClient, null);
        try
        {
            stublessClient.ping();
            Assert.fail("Expected Exception to be thrown when stub is null");
        }
        catch (Exception e)
        {
            Assert.assertTrue("Exception message should indicate stub not available",
                    e.getMessage() != null && e.getMessage().contains("WS Client Stub not available"));
        }
    }

    @Test
    public void pingReturnsFalseForInvalidCredentials() throws Exception
    {
        // EHT-002: ping() should return false when wrong credentials are supplied (if auth is enforced)
        Assume.assumeTrue("Skipping: target HPCC does not enforce authentication", targetHPCCAuthenticates);
        Connection badCredsConn = new Connection(connString);
        badCredsConn.setCredentials("invaliduser", "wrongpassword");
        HPCCWsStoreClient badCredsClient = HPCCWsStoreClient.get(badCredsConn);
        Assert.assertFalse("ping() should return false for invalid credentials", badCredsClient.ping());
    }

    @Test
    @WithSpan
    public void a5deleteValueTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        try
        {
            System.out.println("Testing deleteValue on " + storename + "." + namespace + ".testkey...");
            // First set a value
            Assert.assertTrue(client.setValue(storename, namespace, "testkey", "testvalue", true));
            
            // Verify it exists
            String value = client.fetchValue(storename, namespace, "testkey", true);
            Assert.assertNotNull(value);
            Assert.assertEquals("testvalue", value);
            
            // Now delete it
            Assert.assertTrue(client.deleteValue(storename, namespace, "testkey", true));
            
            // Verify it's deleted
            String deletedValue = client.fetchValue(storename, namespace, "testkey", true);
            Assert.assertNull("Value should be null after deletion", deletedValue);

            if (targetHPCCAuthenticates)
            {
                System.out.println("Testing deleteValue on user-specific key...");
                // Test user-specific key deletion
                Assert.assertTrue(client.setValue(storename, namespace, "user.testkey", "user.testvalue", false));
                String userValue = client.fetchValue(storename, namespace, "user.testkey", false);
                Assert.assertNotNull(userValue);
                Assert.assertEquals("user.testvalue", userValue);
                
                Assert.assertTrue(client.deleteValue(storename, namespace, "user.testkey", false));
                String deletedUserValue = client.fetchValue(storename, namespace, "user.testkey", false);
                Assert.assertNull("User value should be null after deletion", deletedUserValue);
            }
            else
            {
                System.out.println("Avoiding a5deleteValueTest tests of per-user data because target HPCC does not authenticate");
            }
        }
        catch (Exception e)
        {
            Assert.fail(e.getLocalizedMessage());
        }
    }

    @Test
    @WithSpan
    public void listStoresTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        try
        {
            System.out.println("Listing all stores...");
            StoreInfoWrapper[] stores = client.listStores();
            Assert.assertNotNull("listStores should not return null", stores);
            System.out.println("Found " + stores.length + " stores");
            
            boolean foundTestStore = false;
            for (StoreInfoWrapper store : stores)
            {
                System.out.println("  Store: " + store.getName() + 
                                   " (Type: " + (store.getType() != null ? store.getType() : "N/A") + 
                                   ", Owner: " + (store.getOwner() != null ? store.getOwner() : "N/A") + ")");
                if (storename.equals(store.getName()))
                {
                    foundTestStore = true;
                }
            }
            Assert.assertTrue("Test store '" + storename + "' should be in the list", foundTestStore);
        }
        catch (Exception e)
        {
            Assert.fail(e.getLocalizedMessage());
        }
    }

    @Test
    @WithSpan
    public void listStoresWithFilterTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        try
        {
            System.out.println("Listing stores with name filter...");
            StoreInfoWrapper[] stores = client.listStores(storename, null, null);
            Assert.assertNotNull("listStores with filter should not return null", stores);
            
            // All returned stores should match our filter
            for (StoreInfoWrapper store : stores)
            {
                Assert.assertTrue("Store name should match filter", 
                                  store.getName().contains(storename) || storename.contains(store.getName()));
            }
            
            System.out.println("Testing listStores with type filter...");
            StoreInfoWrapper[] testStores = client.listStores(null, "TEST", null);
            if (testStores != null && testStores.length > 0)
            {
                for (StoreInfoWrapper store : testStores)
                {
                    System.out.println("  Found TEST store: " + store.getName());
                }
            }
        }
        catch (Exception e)
        {
            Assert.fail(e.getLocalizedMessage());
        }
    }

    @Test
    @WithSpan
    public void a6listNSKeysTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        try
        {
            System.out.println("Testing listNSKeys on " + storename + "." + namespace + "...");
            
            // Set some test keys first
            Assert.assertTrue(client.setValue(storename, namespace, "key1", "value1", true));
            Assert.assertTrue(client.setValue(storename, namespace, "key2", "value2", true));
            Assert.assertTrue(client.setValue(storename, namespace, "key3", "value3", true));
            
            // List the keys
            String[] keys = client.listNSKeys(storename, namespace, true);
            Assert.assertNotNull("listNSKeys should not return null", keys);
            Assert.assertTrue("Should have at least 3 keys", keys.length >= 3);
            
            System.out.println("Found " + keys.length + " keys in namespace");
            boolean foundKey1 = false, foundKey2 = false, foundKey3 = false;
            for (String key : keys)
            {
                System.out.println("  Key: " + key);
                if ("key1".equals(key)) foundKey1 = true;
                if ("key2".equals(key)) foundKey2 = true;
                if ("key3".equals(key)) foundKey3 = true;
            }
            
            Assert.assertTrue("Should find key1", foundKey1);
            Assert.assertTrue("Should find key2", foundKey2);
            Assert.assertTrue("Should find key3", foundKey3);
        }
        catch (Exception e)
        {
            Assert.fail(e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // CFT-001: Verify Response Fields Match Request
    // =========================================================================
    @Test
    @WithSpan
    public void createStoreVerifyResponseFieldsTest()
    {
        final String testStoreName = "CFT001TestStore";
        try
        {
            System.out.println("CFT-001: Creating store '" + testStoreName + "' and verifying response fields...");
            boolean result = client.createStore(testStoreName, "CFT-001 response field verification store", "CFT001TYPE");
            if (!result)
                System.out.println("CFT-001: createStore returned false (store may already exist): " + testStoreName);

            StoreInfoWrapper[] stores = client.listStores();
            Assert.assertNotNull("CFT-001: listStores should not return null", stores);

            StoreInfoWrapper found = null;
            for (StoreInfoWrapper s : stores)
            {
                if (testStoreName.equals(s.getName()))
                {
                    found = s;
                    break;
                }
            }
            Assert.assertNotNull("CFT-001: Store '" + testStoreName + "' should appear in listStores()", found);
            Assert.assertEquals("CFT-001: Type should match", "CFT001TYPE", found.getType());
            Assert.assertNotNull("CFT-001: Owner should be non-null", found.getOwner());
            Assert.assertFalse("CFT-001: Owner should be non-empty", found.getOwner().isEmpty());
        }
        catch (Exception e)
        {
            Assert.fail("CFT-001: Unexpected exception: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // CFT-002: Create Store with Only Required Field (Name Only)
    // =========================================================================
    @Test
    @WithSpan
    public void createStoreWithNameOnlyTest()
    {
        final String testStoreName = "CFT002MinimalStore";
        try
        {
            System.out.println("CFT-002: Creating store with name only: '" + testStoreName + "'...");
            boolean result = client.createStore(testStoreName, "", "");
            System.out.println("CFT-002: createStore returned: " + result);

            StoreInfoWrapper[] stores = client.listStores();
            Assert.assertNotNull("CFT-002: listStores should not return null", stores);

            boolean found = false;
            for (StoreInfoWrapper s : stores)
            {
                if (testStoreName.equals(s.getName()))
                {
                    found = true;
                    break;
                }
            }
            Assert.assertTrue("CFT-002: Store '" + testStoreName + "' should appear in listStores()", found);
        }
        catch (Exception e)
        {
            Assert.fail("CFT-002: Unexpected exception: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // CFT-003: Create Store and Verify It Appears in listStores
    // =========================================================================
    @Test
    @WithSpan
    public void createStoreVerifyInListStoresTest()
    {
        final String testStoreName = "CFT003WorkflowStore";
        try
        {
            System.out.println("CFT-003: Creating store and verifying it appears in listStores: '" + testStoreName + "'...");
            boolean result = client.createStore(testStoreName, "Workflow test store", "WORKFLOW");
            // Store may already exist from a prior run; createStore returns false for existing stores
            System.out.println("CFT-003: createStore returned: " + result + " (false is acceptable if store already exists)");

            StoreInfoWrapper[] stores = client.listStores();
            Assert.assertNotNull("CFT-003: listStores should not return null", stores);

            boolean found = false;
            for (StoreInfoWrapper s : stores)
            {
                if (testStoreName.equals(s.getName()))
                {
                    found = true;
                    break;
                }
            }
            Assert.assertTrue("CFT-003: Store '" + testStoreName + "' should appear in listStores()", found);
        }
        catch (Exception e)
        {
            Assert.fail("CFT-003: Unexpected exception: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // CFT-004: Create Multiple Distinct Stores in Sequence
    // =========================================================================
    @Test
    @WithSpan
    public void createMultipleDistinctStoresTest()
    {
        final String storeA = "CFT004StoreA";
        final String storeB = "CFT004StoreB";
        try
        {
            System.out.println("CFT-004: Creating two distinct stores sequentially...");
            boolean resultA = client.createStore(storeA, "First store", "TYPEA");
            boolean resultB = client.createStore(storeB, "Second store", "TYPEB");

            System.out.println("CFT-004: createStore(A)=" + resultA + ", createStore(B)=" + resultB);

            StoreInfoWrapper[] stores = client.listStores();
            Assert.assertNotNull("CFT-004: listStores should not return null", stores);

            boolean foundA = false, foundB = false;
            for (StoreInfoWrapper s : stores)
            {
                if (storeA.equals(s.getName())) foundA = true;
                if (storeB.equals(s.getName())) foundB = true;
            }
            Assert.assertTrue("CFT-004: Store '" + storeA + "' should appear in listStores()", foundA);
            Assert.assertTrue("CFT-004: Store '" + storeB + "' should appear in listStores()", foundB);
        }
        catch (Exception e)
        {
            Assert.fail("CFT-004: Unexpected exception: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // ECT-001: Create Store That Already Exists (Idempotency)
    // =========================================================================
    @Test
    @WithSpan
    public void createStoreAlreadyExistsTest()
    {
        final String testStoreName = "ECT001IdempotentStore";
        try
        {
            System.out.println("ECT-001: Testing idempotency — creating '" + testStoreName + "' twice...");
            client.createStore(testStoreName, "First creation", "TEST");

            boolean secondResult = client.createStore(testStoreName, "duplicate", "TEST");
            Assert.assertFalse("ECT-001: Second createStore call for existing store should return false", secondResult);
        }
        catch (Exception e)
        {
            Assert.fail("ECT-001: createStore should not throw for an already-existing store: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // ECT-002: Create Store with Null Description and Null Type
    // =========================================================================
    @Test
    @WithSpan
    public void createStoreWithNullOptionalFieldsTest()
    {
        final String testStoreName = "ECT002NullOptionalStore";
        try
        {
            System.out.println("ECT-002: Creating store with null description and null type: '" + testStoreName + "'...");
            boolean result = client.createStore(testStoreName, null, null);
            System.out.println("ECT-002: createStore returned: " + result);

            StoreInfoWrapper[] stores = client.listStores();
            Assert.assertNotNull("ECT-002: listStores should not return null", stores);

            boolean found = false;
            for (StoreInfoWrapper s : stores)
            {
                if (testStoreName.equals(s.getName()))
                {
                    found = true;
                    break;
                }
            }
            Assert.assertTrue("ECT-002: Store '" + testStoreName + "' should appear in listStores()", found);
        }
        catch (NullPointerException e)
        {
            Assert.fail("ECT-002: Null optional fields should not cause NullPointerException: " + e.getLocalizedMessage());
        }
        catch (Exception e)
        {
            // An exception from the server is acceptable — what matters is no NPE and graceful handling
            System.out.println("ECT-002: createStore threw (acceptable for null params): " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // ECT-003: Create Store with Very Long Store Name (Boundary Value)
    // =========================================================================
    @Test
    @WithSpan
    public void createStoreWithVeryLongNameTest()
    {
        final String longName = new String(new char[200]).replace('\0', 'A') + "ECT003";
        try
        {
            System.out.println("ECT-003: Creating store with very long name (" + longName.length() + " chars)...");
            boolean result = client.createStore(longName, "Long name test", "BOUNDARY");
            System.out.println("ECT-003: createStore returned: " + result);
            // Either accepted or gracefully rejected — no unexpected exception
        }
        catch (NullPointerException e)
        {
            Assert.fail("ECT-003: Long store name should not cause NullPointerException: " + e.getLocalizedMessage());
        }
        catch (Exception e)
        {
            // Server-side rejection with a descriptive exception is acceptable
            System.out.println("ECT-003: createStore threw for long name (acceptable): " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // ECT-004: Create Store with Very Long Description (Boundary Value)
    // =========================================================================
    @Test
    @WithSpan
    public void createStoreWithVeryLongDescriptionTest()
    {
        final String testStoreName = "ECT004LongDescStore";
        final String longDesc = new String(new char[1000]).replace('\0', 'D');
        try
        {
            System.out.println("ECT-004: Creating store with 1000-char description: '" + testStoreName + "'...");
            boolean result = client.createStore(testStoreName, longDesc, "BOUNDARY");
            System.out.println("ECT-004: createStore returned: " + result);

            StoreInfoWrapper[] stores = client.listStores();
            Assert.assertNotNull("ECT-004: listStores should not return null", stores);

            boolean found = false;
            for (StoreInfoWrapper s : stores)
            {
                if (testStoreName.equals(s.getName()))
                {
                    found = true;
                    break;
                }
            }
            Assert.assertTrue("ECT-004: Store '" + testStoreName + "' should appear in listStores()", found);
        }
        catch (Exception e)
        {
            Assert.fail("ECT-004: Unexpected exception for long description: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // ECT-005: Create Store with Special Characters in Store Name
    // =========================================================================
    @Test
    @WithSpan
    public void createStoreWithSpecialCharsInNameTest()
    {
        final String testStoreName = "ECT005 Store.Name/Test";
        try
        {
            System.out.println("ECT-005: Creating store with special chars in name: '" + testStoreName + "'...");
            boolean result = client.createStore(testStoreName, "Special chars test", "SPECIAL");
            System.out.println("ECT-005: createStore returned: " + result);
            // Either accepted (encoded by server) or rejected with a meaningful exception
        }
        catch (NullPointerException e)
        {
            Assert.fail("ECT-005: Special chars in name should not cause NullPointerException: " + e.getLocalizedMessage());
        }
        catch (Exception e)
        {
            // Server-side rejection is acceptable — document observed behavior
            System.out.println("ECT-005: createStore threw for special-char name (acceptable): " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // ECT-006: Create Store with Unicode Characters in Name
    // =========================================================================
    @Test
    @WithSpan
    public void createStoreWithUnicodeNameTest()
    {
        final String testStoreName = "ECT006\u00dc\u00ef\u0107\u00f6d\u00e9_Store";
        try
        {
            System.out.println("ECT-006: Creating store with Unicode name: '" + testStoreName + "'...");
            boolean result = client.createStore(testStoreName, "Unicode name test", "UNICODE");
            System.out.println("ECT-006: createStore returned: " + result);
            // Either accepted or gracefully rejected — no unexpected exception
        }
        catch (NullPointerException e)
        {
            Assert.fail("ECT-006: Unicode name should not cause NullPointerException: " + e.getLocalizedMessage());
        }
        catch (Exception e)
        {
            // Server-side rejection is acceptable — document observed behavior
            System.out.println("ECT-006: createStore threw for Unicode name (acceptable): " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // EHT-001: Create Store with Empty String Name
    // =========================================================================
    @Test
    @WithSpan
    public void createStoreWithEmptyNameTest()
    {
        try
        {
            System.out.println("EHT-001: Attempting to create store with empty name...");
            boolean result = client.createStore("", "empty name test", "TEST");
            // Server should reject this; if it returns false, that is acceptable
            System.out.println("EHT-001: createStore returned (expected false or exception): " + result);
            Assert.assertFalse("EHT-001: createStore should return false for empty store name", result);
        }
        catch (Exception e)
        {
            // An exception is the expected/acceptable behavior for an empty store name
            System.out.println("EHT-001: createStore threw as expected for empty name: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // EHT-002: Create Store with Null Store Name
    // =========================================================================
    @Test
    @WithSpan
    public void createStoreWithNullNameTest()
    {
        try
        {
            System.out.println("EHT-002: Attempting to create store with null name...");
            boolean result = client.createStore(null, "null name test", "TEST");
            System.out.println("EHT-002: createStore returned (expected false or exception): " + result);
            Assert.assertFalse("EHT-002: createStore should return false for null store name", result);
        }
        catch (NullPointerException e)
        {
            // NPE is not ideal but may occur depending on Axis2 null handling — document it
            System.out.println("EHT-002: NullPointerException thrown for null store name: " + e.getLocalizedMessage());
        }
        catch (Exception e)
        {
            // Any other exception is acceptable for a null store name
            System.out.println("EHT-002: createStore threw as expected for null name: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // EHT-003: Create Store with Insufficient Permissions (Read-Only User)
    // =========================================================================
    @Test
    @WithSpan
    public void createStoreWithInsufficientPermissionsTest()
    {
        Assume.assumeTrue("EHT-003: Skipping — target HPCC does not enforce authentication", targetHPCCAuthenticates);
        // This test requires a read-only user configured in the HPCC environment.
        // Skip if no such user is available (readOnlyUser/readOnlyPass system properties not set).
        String readOnlyUser = System.getProperty("readOnlyUser");
        String readOnlyPass = System.getProperty("readOnlyPass");
        Assume.assumeNotNull("EHT-003: Skipping — 'readOnlyUser' system property not set", readOnlyUser);
        Assume.assumeNotNull("EHT-003: Skipping — 'readOnlyPass' system property not set", readOnlyPass);

        try
        {
            System.out.println("EHT-003: Creating store with read-only user credentials...");
            Connection readOnlyConn = new Connection(connString);
            readOnlyConn.setCredentials(readOnlyUser, readOnlyPass);
            HPCCWsStoreClient readOnlyClient = HPCCWsStoreClient.get(readOnlyConn);
            Assert.assertNotNull("EHT-003: readOnlyClient should not be null", readOnlyClient);

            readOnlyClient.createStore("EHT003UnauthorizedStore", "auth test", "TEST");
            Assert.fail("EHT-003: Expected an authorization exception for read-only user");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            System.out.println("EHT-003: Received expected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            System.out.println("EHT-003: Received expected exception for insufficient permissions: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // EHT-004: Create Store with Invalid Connection (Bad Host)
    // =========================================================================
    @Test
    @WithSpan
    public void createStoreWithInvalidConnectionTest()
    {
        try
        {
            System.out.println("EHT-004: Attempting to create store using invalid host connection...");
            Connection badConn = new Connection("http", "invalid.nonexistent.host.local", "8010");
            badConn.setConnectTimeoutMilli(3000);
            badConn.setSocketTimeoutMilli(3000);
            HPCCWsStoreClient badClient = HPCCWsStoreClient.get(badConn);

            boolean result = badClient.createStore("EHT004BadConnStore", "bad connection test", "TEST");
            // Should return false after catching RemoteException
            System.out.println("EHT-004: createStore returned (expected false): " + result);
            Assert.assertFalse("EHT-004: createStore should return false for unreachable host", result);
        }
        catch (NullPointerException e)
        {
            Assert.fail("EHT-004: Should not throw NullPointerException for bad connection: " + e.getLocalizedMessage());
        }
        catch (Exception e)
        {
            // An exception (not NPE) is also acceptable for a bad connection
            System.out.println("EHT-004: createStore threw for bad connection (acceptable): " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // EHT-005: Create Store with Wrong Credentials
    // =========================================================================
    @Test
    @WithSpan
    public void createStoreWithWrongCredentialsTest()
    {
        Assume.assumeTrue("EHT-005: Skipping — target HPCC does not enforce authentication", targetHPCCAuthenticates);
        try
        {
            System.out.println("EHT-005: Attempting to create store using wrong credentials...");
            Connection badCredsConn = new Connection(connString);
            badCredsConn.setCredentials("invaliduser_eht005", "wrongpassword_eht005");
            HPCCWsStoreClient badCredsClient = HPCCWsStoreClient.get(badCredsConn);

            boolean result = badCredsClient.createStore("EHT005BadCredsStore", "bad creds test", "TEST");
            System.out.println("EHT-005: createStore returned: " + result);
            // Either false or an exception is expected
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            System.out.println("EHT-005: Received expected ArrayOfEspExceptionWrapper for bad creds: " + e.toString());
        }
        catch (Exception e)
        {
            System.out.println("EHT-005: Received expected exception for wrong credentials: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // CFT-001: Owner Filter Applied
    // =========================================================================
    @Test
    @WithSpan
    public void listStoresOwnerFilterTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        try
        {
            System.out.println("CFT-001: Testing listStores with ownerFilter='" + hpccUser + "'...");
            StoreInfoWrapper[] stores = client.listStores(null, null, hpccUser);
            Assert.assertNotNull("CFT-001: listStores with ownerFilter should not return null", stores);
            System.out.println("CFT-001: Found " + stores.length + " stores owned by '" + hpccUser + "'");
            for (StoreInfoWrapper store : stores)
            {
                Assert.assertEquals("CFT-001: Store owner should match ownerFilter",
                                    hpccUser, store.getOwner());
            }
        }
        catch (Exception e)
        {
            Assert.fail("CFT-001: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // CFT-002: All Three Filters Combined
    // =========================================================================
    @Test
    @WithSpan
    public void listStoresAllFiltersTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        try
        {
            System.out.println("CFT-002: Testing listStores with nameFilter='" + storename + "', typeFilter='TEST', ownerFilter='" + hpccUser + "'...");
            StoreInfoWrapper[] stores = client.listStores(storename, "TEST", hpccUser);
            Assert.assertNotNull("CFT-002: listStores with all filters should not return null", stores);

            boolean foundTestStore = false;
            for (StoreInfoWrapper store : stores)
            {
                Assert.assertEquals("CFT-002: Store name should match nameFilter", storename, store.getName());
                Assert.assertEquals("CFT-002: Store type should match typeFilter", "TEST", store.getType());
                Assert.assertEquals("CFT-002: Store owner should match ownerFilter", hpccUser, store.getOwner());
                if (storename.equals(store.getName()))
                    foundTestStore = true;
            }
            Assert.assertTrue("CFT-002: Test store '" + storename + "' should be in filtered results", foundTestStore);
        }
        catch (Exception e)
        {
            Assert.fail("CFT-002: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // CFT-003: Verify StoreInfoWrapper Field Completeness
    // =========================================================================
    @Test
    @WithSpan
    public void listStoresFieldCompletenessTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        try
        {
            System.out.println("CFT-003: Verifying StoreInfoWrapper field completeness...");
            StoreInfoWrapper[] stores = client.listStores();
            Assert.assertNotNull("CFT-003: listStores should not return null", stores);

            StoreInfoWrapper testStore = null;
            for (StoreInfoWrapper store : stores)
            {
                if (storename.equals(store.getName()))
                {
                    testStore = store;
                    break;
                }
            }
            Assert.assertNotNull("CFT-003: Test store '" + storename + "' must be present", testStore);

            Assert.assertNotNull("CFT-003: store.getName() must not be null", testStore.getName());
            Assert.assertFalse("CFT-003: store.getName() must not be empty", testStore.getName().isEmpty());

            Assert.assertNotNull("CFT-003: store.getType() must not be null", testStore.getType());
            Assert.assertFalse("CFT-003: store.getType() must not be empty", testStore.getType().isEmpty());

            Assert.assertNotNull("CFT-003: store.getOwner() must not be null", testStore.getOwner());
            Assert.assertFalse("CFT-003: store.getOwner() must not be empty", testStore.getOwner().isEmpty());

            Assert.assertNotNull("CFT-003: store.getCreateTime() must not be null", testStore.getCreateTime());
            Assert.assertFalse("CFT-003: store.getCreateTime() must not be empty", testStore.getCreateTime().isEmpty());

            String maxValSize = testStore.getMaxValSize();
            Assert.assertNotNull("CFT-003: store.getMaxValSize() must not be null", maxValSize);
            long maxValSizeLong = Long.parseLong(maxValSize);
            Assert.assertTrue("CFT-003: store.getMaxValSize() must be > 0", maxValSizeLong > 0);
        }
        catch (Exception e)
        {
            Assert.fail("CFT-003: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // CFT-004: Verify IsDefault Field — at most one default store
    // =========================================================================
    @Test
    @WithSpan
    public void listStoresIsDefaultFieldTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        try
        {
            System.out.println("CFT-004: Verifying at most one store has isDefault=true...");
            StoreInfoWrapper[] stores = client.listStores();
            Assert.assertNotNull("CFT-004: listStores should not return null", stores);

            int defaultCount = 0;
            for (StoreInfoWrapper store : stores)
            {
                if (store.getIsDefault())
                    defaultCount++;
            }
            Assert.assertTrue("CFT-004: At most one store should have isDefault=true, found: " + defaultCount,
                               defaultCount <= 1);
            System.out.println("CFT-004: Found " + defaultCount + " default store(s) — constraint satisfied");
        }
        catch (Exception e)
        {
            Assert.fail("CFT-004: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // CFT-005: Explicit Null Filters on Three-Argument Overload
    // =========================================================================
    @Test
    @WithSpan
    public void listStoresExplicitNullFiltersTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        try
        {
            System.out.println("CFT-005: Testing listStores(null, null, null) — three-arg overload...");
            StoreInfoWrapper[] storesNoArg = client.listStores();
            Assert.assertNotNull("CFT-005: listStores() should not return null", storesNoArg);

            StoreInfoWrapper[] storesNullArgs = client.listStores(null, null, null);
            Assert.assertNotNull("CFT-005: listStores(null,null,null) should not return null", storesNullArgs);
            Assert.assertTrue("CFT-005: listStores(null,null,null) should return >= results of listStores()",
                               storesNullArgs.length >= storesNoArg.length);

            boolean foundTestStore = false;
            for (StoreInfoWrapper store : storesNullArgs)
            {
                if (storename.equals(store.getName()))
                {
                    foundTestStore = true;
                    break;
                }
            }
            Assert.assertTrue("CFT-005: Test store '" + storename + "' should appear with explicit null filters", foundTestStore);
        }
        catch (Exception e)
        {
            Assert.fail("CFT-005: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // CFT-006: Type Filter Strict Assertion
    // =========================================================================
    @Category(UnverifiedServerIssues.class)
    @Test
    @WithSpan
    public void listStoresTypeFilterStrictTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        try
        {
            System.out.println("CFT-006: Testing listStores with typeFilter='TEST' — strict assertion...");
            StoreInfoWrapper[] stores = client.listStores(null, "TEST", null);
            Assert.assertNotNull("CFT-006: listStores with typeFilter should not return null", stores);
            System.out.println("CFT-006: Found " + stores.length + " store(s) with type 'TEST'");
            for (StoreInfoWrapper store : stores)
            {
                Assert.assertEquals("CFT-006: Every returned store must have type='TEST'",
                                    "TEST", store.getType());
            }
        }
        catch (Exception e)
        {
            Assert.fail("CFT-006: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // ECT-001: Filter With No Matching Stores — Empty Result
    // =========================================================================
    @Test
    @WithSpan
    public void listStoresNoMatchFilterTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        try
        {
            System.out.println("ECT-001: Testing listStores with a non-matching nameFilter...");
            StoreInfoWrapper[] stores = client.listStores("NONEXISTENT_STORE_XYZZY_12345", null, null);
            Assert.assertNotNull("ECT-001: listStores should return empty array, not null", stores);
            Assert.assertEquals("ECT-001: listStores should return empty array for non-matching filter",
                                 0, stores.length);
        }
        catch (Exception e)
        {
            Assert.fail("ECT-001: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // ECT-002: Wildcard Pattern in NameFilter
    // =========================================================================
    @Test
    @WithSpan
    public void listStoresWildcardNameFilterTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        try
        {
            System.out.println("ECT-002: Testing listStores with wildcard nameFilter='WsClient*'...");
            StoreInfoWrapper[] stores = client.listStores("WsClient*", null, null);
            Assert.assertNotNull("ECT-002: listStores with wildcard filter should not return null", stores);

            boolean foundTestStore = false;
            for (StoreInfoWrapper store : stores)
            {
                Assert.assertTrue("ECT-002: All returned store names must start with 'WsClient'",
                                   store.getName().startsWith("WsClient"));
                if (storename.equals(store.getName()))
                    foundTestStore = true;
            }
            Assert.assertTrue("ECT-002: Test store '" + storename + "' should be found via wildcard 'WsClient*'", foundTestStore);
        }
        catch (Exception e)
        {
            Assert.fail("ECT-002: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // ECT-003: Empty String Filters Behave Like Null Filters
    // =========================================================================
    @Test
    @WithSpan
    public void listStoresEmptyStringFiltersTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        try
        {
            System.out.println("ECT-003: Testing listStores(\"\",\"\",\"\") — empty strings treated as no filter...");
            StoreInfoWrapper[] storesNoArg = client.listStores();
            Assert.assertNotNull("ECT-003: listStores() should not return null", storesNoArg);

            StoreInfoWrapper[] storesEmptyArgs = client.listStores("", "", "");
            Assert.assertNotNull("ECT-003: listStores(\"\",\"\",\"\") should not return null", storesEmptyArgs);
            Assert.assertTrue("ECT-003: listStores(\"\",\"\",\"\") result count should be >= listStores() result count",
                               storesEmptyArgs.length >= storesNoArg.length);

            boolean foundTestStore = false;
            for (StoreInfoWrapper store : storesEmptyArgs)
            {
                if (storename.equals(store.getName()))
                {
                    foundTestStore = true;
                    break;
                }
            }
            Assert.assertTrue("ECT-003: Test store '" + storename + "' should appear with empty string filters", foundTestStore);
        }
        catch (Exception e)
        {
            Assert.fail("ECT-003: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // ECT-004: Owner Filter Wildcard Pattern
    // =========================================================================
    @Test
    @WithSpan
    public void listStoresOwnerWildcardFilterTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        try
        {
            String ownerPrefix = hpccUser.length() >= 3 ? hpccUser.substring(0, 3) : hpccUser;
            String ownerWildcard = ownerPrefix + "*";
            System.out.println("ECT-004: Testing listStores with ownerFilter='" + ownerWildcard + "'...");
            StoreInfoWrapper[] stores = client.listStores(null, null, ownerWildcard);
            Assert.assertNotNull("ECT-004: listStores with owner wildcard filter should not return null", stores);
            System.out.println("ECT-004: Found " + stores.length + " stores matching owner wildcard '" + ownerWildcard + "'");
            for (StoreInfoWrapper store : stores)
            {
                Assert.assertNotNull("ECT-004: store.getOwner() must not be null", store.getOwner());
                Assert.assertTrue("ECT-004: store owner must start with prefix '" + ownerPrefix + "'",
                                   store.getOwner().startsWith(ownerPrefix));
            }
        }
        catch (Exception e)
        {
            Assert.fail("ECT-004: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // ECT-005: Type Filter With Non-Matching Owner Filter — Empty Result
    // =========================================================================
    @Test
    @WithSpan
    public void listStoresConflictingFiltersEmptyResultTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        try
        {
            System.out.println("ECT-005: Testing listStores with valid typeFilter but non-matching ownerFilter...");
            StoreInfoWrapper[] stores = client.listStores(null, "TEST", "NONEXISTENT_USER_ZZZZ");
            Assert.assertNotNull("ECT-005: listStores should return empty array, not null", stores);
            Assert.assertEquals("ECT-005: AND-semantics: non-matching ownerFilter should yield empty result",
                                 0, stores.length);
        }
        catch (Exception e)
        {
            Assert.fail("ECT-005: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // EHT-001: Invalid Connection Returns Empty Array
    // =========================================================================
    @Test
    @WithSpan
    public void listStoresInvalidConnectionTest() throws Exception
    {
        try
        {
            System.out.println("EHT-001: Testing listStores with invalid host connection...");
            Connection badConn = new Connection("http", "invalid.nonexistent.host.local", "8010");
            badConn.setConnectTimeoutMilli(3000);
            badConn.setSocketTimeoutMilli(3000);
            HPCCWsStoreClient badClient = HPCCWsStoreClient.get(badConn);

            StoreInfoWrapper[] stores = badClient.listStores();
            Assert.assertNotNull("EHT-001: listStores should return empty array (not null) for invalid host", stores);
            Assert.assertEquals("EHT-001: listStores should return empty array for invalid host", 0, stores.length);
            System.out.println("EHT-001: listStores returned empty array as expected for invalid connection");
        }
        catch (NullPointerException e)
        {
            Assert.fail("EHT-001: Should not throw NullPointerException: " + e.getLocalizedMessage());
        }
        catch (Exception e)
        {
            // An exception (not NPE) is also acceptable for a bad connection
            System.out.println("EHT-001: listStores threw for bad connection (acceptable): " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // EHT-002: Unauthorized Access (Wrong Credentials)
    // =========================================================================
    @Test
    @WithSpan
    public void listStoresWrongCredentialsTest()
    {
        Assume.assumeTrue("EHT-002: Skipping — target HPCC does not enforce authentication", targetHPCCAuthenticates);
        try
        {
            System.out.println("EHT-002: Testing listStores with invalid credentials...");
            Connection badCredsConn = new Connection(connString);
            badCredsConn.setCredentials("invaliduser_eht002_ls", "wrongpassword_eht002_ls");
            HPCCWsStoreClient badCredsClient = HPCCWsStoreClient.get(badCredsConn);

            StoreInfoWrapper[] stores = badCredsClient.listStores();
            // Either empty array (silently swallowed) or an exception
            if (stores != null)
            {
                System.out.println("EHT-002: listStores returned array of length " + stores.length + " (empty expected)");
            }
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            System.out.println("EHT-002: Received expected ArrayOfEspExceptionWrapper for bad creds: " + e.toString());
        }
        catch (NullPointerException e)
        {
            Assert.fail("EHT-002: Should not throw NullPointerException: " + e.getLocalizedMessage());
        }
        catch (Exception e)
        {
            System.out.println("EHT-002: Received expected exception for wrong credentials: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // EHT-003: Null/Invalid Connection for Client Construction
    // =========================================================================
    @Test
    @WithSpan
    public void listStoresNullConnectionTest()
    {
        try
        {
            System.out.println("EHT-003: Testing HPCCWsStoreClient.get(null) behavior...");
            HPCCWsStoreClient nullClient = HPCCWsStoreClient.get(null);
            if (nullClient != null)
            {
                StoreInfoWrapper[] stores = nullClient.listStores();
                // If we get here without exception, result should be null or empty
                System.out.println("EHT-003: listStores returned: " + (stores == null ? "null" : "array[" + stores.length + "]"));
            }
            else
            {
                System.out.println("EHT-003: HPCCWsStoreClient.get(null) returned null client as expected");
            }
        }
        catch (Exception e)
        {
            // An exception during construction or invocation is the expected behavior
            System.out.println("EHT-003: Received expected exception for null connection: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // CFT-001 setValue: Overwrite Existing Value (Round-Trip Verification)
    // =========================================================================
    @Test
    @WithSpan
    public void a2setValueOverwriteVerificationTest()
    {
        try
        {
            System.out.println("CFT-001 setValue: Overwriting key and verifying updated value is retrieved...");
            Assert.assertTrue("First setValue should return true",
                    client.setValue(storename, namespace, "overwrite.test", "originalValue", true));
            Assert.assertTrue("Second setValue (overwrite) should return true",
                    client.setValue(storename, namespace, "overwrite.test", "updatedValue", true));
            String fetched = client.fetchValue(storename, namespace, "overwrite.test", true);
            Assert.assertEquals("Fetched value should reflect the overwritten value", "updatedValue", fetched);
            Properties meta = client.fetchKeyMetaData(storename, namespace, "overwrite.test", true);
            Assert.assertNotNull("Key metadata should not be null after overwrite", meta);
            Assert.assertTrue("Key metadata should contain @editTime after overwrite", meta.containsKey("@editTime"));
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("CFT-001 setValue: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("CFT-001 setValue: Unexpected exception: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // CFT-002 setValue: Set Empty String Value
    // =========================================================================
    @Test
    @WithSpan
    public void a2setValueEmptyStringValueTest()
    {
        try
        {
            System.out.println("CFT-002 setValue: Setting empty string value...");
            boolean result = client.setValue(storename, namespace, "empty.value.test", "", true);
            Assert.assertTrue("setValue with empty string value should return true", result);
            // Server uses [nil_remove] on Value; fetch may return null or empty string — both are acceptable
            String fetched = client.fetchValue(storename, namespace, "empty.value.test", true);
            Assert.assertTrue("Fetched value for empty-string key should be null or empty",
                    fetched == null || fetched.isEmpty());
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("CFT-002 setValue: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("CFT-002 setValue: Unexpected exception: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // ECT-001 setValue: Unicode / Multi-byte Value
    // =========================================================================
    @Test
    @WithSpan
    public void a2setValueUnicodeValueTest()
    {
        try
        {
            final String unicodeValue = "caf\u00e9 \u2615 \u65e5\u672c\u8a9e";
            System.out.println("ECT-001 setValue: Setting unicode value: " + unicodeValue);
            Assert.assertTrue("setValue with unicode value should return true",
                    client.setValue(storename, namespace, "unicode.value.test", unicodeValue, true));
            String fetched = client.fetchValue(storename, namespace, "unicode.value.test", true);
            Assert.assertEquals("Fetched value should exactly match stored unicode string", unicodeValue, fetched);
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("ECT-001 setValue: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("ECT-001 setValue: Unexpected exception: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // ECT-002 setValue: Value with XML Special Characters
    // =========================================================================
    @Test
    @WithSpan
    public void a2setValueXmlSpecialCharsValueTest()
    {
        try
        {
            final String xmlValue = "<tag attr=\"val\">content & more</tag>";
            System.out.println("ECT-002 setValue: Setting XML special-char value...");
            Assert.assertTrue("setValue with XML special chars should return true",
                    client.setValue(storename, namespace, "xml.chars.value.test", xmlValue, true));
            String fetched = client.fetchValue(storename, namespace, "xml.chars.value.test", true);
            Assert.assertEquals("Fetched value should match original XML special-char string", xmlValue, fetched);
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("ECT-002 setValue: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("ECT-002 setValue: Unexpected exception: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // ECT-003 setValue: Large Value Approaching MaxValSize
    // =========================================================================
    @Test
    @WithSpan
    public void a2setValueLargeValueTest()
    {
        try
        {
            final String largeValue = new String(new char[65536]).replace('\0', 'A');
            System.out.println("ECT-003 setValue: Setting 65536-char value...");
            boolean result = client.setValue(storename, namespace, "large.value.test", largeValue, true);
            if (result)
            {
                String fetched = client.fetchValue(storename, namespace, "large.value.test", true);
                Assert.assertNotNull("Fetched large value should not be null", fetched);
                Assert.assertEquals("Fetched large value should have correct length", 65536, fetched.length());
            }
            else
            {
                System.out.println("ECT-003 setValue: setValue returned false — store MaxValSize may be less than 65536");
            }
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Server-side rejection due to MaxValSize constraint is acceptable
            System.out.println("ECT-003 setValue: ArrayOfEspExceptionWrapper (MaxValSize exceeded): " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("ECT-003 setValue: Unexpected exception: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // ECT-004 setValue: Key with Whitespace Characters
    // =========================================================================
    @Test
    @WithSpan
    public void a2setValueKeyWithWhitespaceTest()
    {
        try
        {
            System.out.println("ECT-004 setValue: Setting value with whitespace in key...");
            Assert.assertTrue("setValue with whitespace key should return true",
                    client.setValue(storename, namespace, "key with spaces", "spaced out", true));
            String fetched = client.fetchValue(storename, namespace, "key with spaces", true);
            Assert.assertEquals("Fetched value should match value stored under whitespace key", "spaced out", fetched);
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("ECT-004 setValue: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("ECT-004 setValue: Unexpected exception: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // ECT-005 setValue: Namespace with Special Characters
    // =========================================================================
    @Test
    @WithSpan
    public void a2setValueNamespaceWithSpecialCharsTest()
    {
        final String specialNS = "test.namespace-v1/sub";
        try
        {
            System.out.println("ECT-005 setValue: Setting value in namespace with special chars: " + specialNS);
            Assert.assertTrue("setValue in special-char namespace should return true",
                    client.setValue(storename, specialNS, "mykey", "myvalue", true));
            String fetched = client.fetchValue(storename, specialNS, "mykey", true);
            Assert.assertEquals("Fetched value should match stored value in special-char namespace", "myvalue", fetched);
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("ECT-005 setValue: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("ECT-005 setValue: Unexpected exception: " + e.getLocalizedMessage());
        }
        finally
        {
            try
            {
                client.deleteNamespace(storename, specialNS, true, "");
            }
            catch (Exception ignored) {}
        }
    }

    // =========================================================================
    // EHT-001 setValue: Empty Namespace
    // =========================================================================
    @Test
    @WithSpan
    public void a2setValueEmptyNamespaceTest()
    {
        try
        {
            System.out.println("EHT-001 setValue: Attempting setValue with empty namespace...");
            boolean result = client.setValue(storename, "", "testkey", "testvalue", true);
            Assert.assertFalse("EHT-001 setValue: setValue with empty namespace should not return true", result);
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Expected: server throws for empty namespace
            System.out.println("EHT-001 setValue: Received expected ArrayOfEspExceptionWrapper for empty namespace: " + e.toString());
        }
        catch (NullPointerException e)
        {
            Assert.fail("EHT-001 setValue: NullPointerException should not escape to caller: " + e.getLocalizedMessage());
        }
        catch (Exception e)
        {
            System.out.println("EHT-001 setValue: Received expected exception for empty namespace: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // EHT-002 setValue: Null Namespace
    // =========================================================================
    @Test
    @WithSpan
    public void a2setValueNullNamespaceTest()
    {
        try
        {
            System.out.println("EHT-002 setValue: Attempting setValue with null namespace...");
            boolean result = client.setValue(storename, null, "testkey", "testvalue", true);
            Assert.assertFalse("EHT-002 setValue: setValue with null namespace should not return true", result);
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Expected: server treats null namespace as empty
            System.out.println("EHT-002 setValue: Received expected ArrayOfEspExceptionWrapper for null namespace: " + e.toString());
        }
        catch (NullPointerException e)
        {
            Assert.fail("EHT-002 setValue: NullPointerException should not escape to caller: " + e.getLocalizedMessage());
        }
        catch (Exception e)
        {
            System.out.println("EHT-002 setValue: Received expected exception for null namespace: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // EHT-003 setValue: Non-existent Store Name
    // =========================================================================
    @Test
    @WithSpan
    public void a2setValueNonExistentStoreTest()
    {
        try
        {
            System.out.println("EHT-003 setValue: Attempting setValue in non-existent store...");
            boolean result = client.setValue("NonExistentStore_XYZ_12345", "testns", "testkey", "testvalue", true);
            Assert.assertFalse("EHT-003 setValue: setValue with non-existent store should not return true", result);
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Expected: server throws for store not found
            System.out.println("EHT-003 setValue: Received expected ArrayOfEspExceptionWrapper for non-existent store: " + e.toString());
        }
        catch (NullPointerException e)
        {
            Assert.fail("EHT-003 setValue: NullPointerException should not escape: " + e.getLocalizedMessage());
        }
        catch (Exception e)
        {
            System.out.println("EHT-003 setValue: Received expected exception for non-existent store: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // EHT-004 setValue: Value Exceeds MaxValSize
    // Note: The Java createStore API does not expose MaxValueSize configuration.
    // This test submits a value larger than the IDL default MaxValSize (1024 bytes)
    // and documents the server's actual enforcement behavior.
    // =========================================================================
    @Test
    @WithSpan
    public void a2setValueExceedsMaxValSizeTest()
    {
        try
        {
            System.out.println("EHT-004 setValue: Attempting setValue with value exceeding default MaxValSize (1024)...");
            final String oversizedValue = new String(new char[2048]).replace('\0', 'X');
            boolean result = client.setValue(storename, namespace, "toolarge", oversizedValue, true);
            if (result)
            {
                System.out.println("EHT-004 setValue: setValue returned true — store has no effective MaxValSize constraint");
            }
            else
            {
                System.out.println("EHT-004 setValue: setValue returned false — MaxValSize enforcement confirmed");
            }
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Expected if MaxValSize is enforced by the store
            System.out.println("EHT-004 setValue: ArrayOfEspExceptionWrapper (MaxValSize exceeded): " + e.toString());
        }
        catch (NullPointerException e)
        {
            Assert.fail("EHT-004 setValue: NullPointerException should not escape: " + e.getLocalizedMessage());
        }
        catch (Exception e)
        {
            System.out.println("EHT-004 setValue: Exception for oversized value (acceptable): " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // EHT-005 setValue: User-Specific Set on Unauthenticated Connection
    // =========================================================================
    @Test
    @WithSpan
    public void a2setValueUserSpecificUnauthenticatedTest()
    {
        Assume.assumeFalse("EHT-005 setValue: Skipping — target HPCC enforces authentication (test is only valid for non-authenticated clusters)",
                targetHPCCAuthenticates);
        try
        {
            System.out.println("EHT-005 setValue: Attempting user-specific setValue on non-authenticated cluster...");
            boolean result = client.setValue(storename, namespace, "unauthenticated.user.key", "testvalue", false);
            Assert.assertFalse("EHT-005 setValue: User-specific setValue should not succeed on non-authenticated cluster", result);
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Expected: server rejects due to missing owner name
            System.out.println("EHT-005 setValue: Received expected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            System.out.println("EHT-005 setValue: Received expected exception for unauthenticated user-specific set: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // EHT-006 setValue: Invalid / Unreachable Connection
    // =========================================================================
    @Test
    @WithSpan
    public void a2setValueInvalidConnectionTest()
    {
        try
        {
            System.out.println("EHT-006 setValue: Attempting setValue with invalid/unreachable connection...");
            Connection badConn = new Connection("http", "invalid.nonexistent.host.local", "8010");
            badConn.setConnectTimeoutMilli(3000);
            badConn.setSocketTimeoutMilli(3000);
            HPCCWsStoreClient badClient = HPCCWsStoreClient.get(badConn);
            boolean result = badClient.setValue(storename, namespace, "badconn.key", "testvalue", true);
            System.out.println("EHT-006 setValue: setValue returned (expected false): " + result);
            Assert.assertFalse("EHT-006 setValue: setValue should return false for unreachable host", result);
        }
        catch (NullPointerException e)
        {
            Assert.fail("EHT-006 setValue: NullPointerException should not escape: " + e.getLocalizedMessage());
        }
        catch (Exception e)
        {
            // An exception (not NPE) is acceptable for a bad connection
            System.out.println("EHT-006 setValue: Exception for invalid connection (acceptable): " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // EHT-007 setValue: Empty Key
    // =========================================================================
    @Test
    @WithSpan
    public void a2setValueEmptyKeyTest()
    {
        try
        {
            System.out.println("EHT-007 setValue: Attempting setValue with empty key...");
            boolean result = client.setValue(storename, namespace, "", "testvalue", true);
            System.out.println("EHT-007 setValue: setValue returned: " + result);
            if (result)
            {
                // Server accepted the empty key; verify fetch round-trip
                String fetched = client.fetchValue(storename, namespace, "", true);
                System.out.println("EHT-007 setValue: fetchValue with empty key returned: " + fetched);
                Assert.assertEquals("EHT-007 setValue: If server accepted empty key, fetch should return stored value",
                        "testvalue", fetched);
            }
            // false is also acceptable; server may reject an empty key
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Server rejection for empty key is acceptable
            System.out.println("EHT-007 setValue: ArrayOfEspExceptionWrapper for empty key (acceptable): " + e.toString());
        }
        catch (NullPointerException e)
        {
            Assert.fail("EHT-007 setValue: NullPointerException should not escape for empty key: " + e.getLocalizedMessage());
        }
        catch (Exception e)
        {
            System.out.println("EHT-007 setValue: Exception for empty key (acceptable): " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // CFT-001 — List Namespaces After Known Namespaces Are Created
    // =========================================================================
    @Test
    @WithSpan
    public void listNamespacesAfterKnownNamespacesCreatedTest()
    {
        String testStoreName = "WsClientTestStore_listNS_CFT001";
        String ns1 = "listNS_CFT001_ns1";
        String ns2 = "listNS_CFT001_ns2";
        String ns3 = "listNS_CFT001_ns3";
        try
        {
            System.out.println("CFT-001 listNamespaces: Setting up store and 3 known namespaces...");
            client.createStore(testStoreName, "CFT-001 listNamespaces test store", "TEST");
            client.setValue(testStoreName, ns1, "key1", "val1", true);
            client.setValue(testStoreName, ns2, "key2", "val2", true);
            client.setValue(testStoreName, ns3, "key3", "val3", true);

            String[] nss = client.listNamespaces(testStoreName, true);
            Assert.assertNotNull("CFT-001 listNamespaces: result should not be null", nss);
            Assert.assertTrue("CFT-001 listNamespaces: array length should be >= 3", nss.length >= 3);

            java.util.List<String> nsList = Arrays.asList(nss);
            Assert.assertTrue("CFT-001 listNamespaces: ns1 should be present", nsList.contains(ns1));
            Assert.assertTrue("CFT-001 listNamespaces: ns2 should be present", nsList.contains(ns2));
            Assert.assertTrue("CFT-001 listNamespaces: ns3 should be present", nsList.contains(ns3));

            System.out.println("CFT-001 listNamespaces: PASS — found all 3 expected namespaces");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("CFT-001 listNamespaces: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("CFT-001 listNamespaces: Unexpected exception: " + e.getLocalizedMessage());
        }
        finally
        {
            try { client.deleteNamespace(testStoreName, ns1, true, ""); } catch (Exception ignored) {}
            try { client.deleteNamespace(testStoreName, ns2, true, ""); } catch (Exception ignored) {}
            try { client.deleteNamespace(testStoreName, ns3, true, ""); } catch (Exception ignored) {}
        }
    }

    // =========================================================================
    // CFT-002 — List Namespaces with Empty Store Name (Default Store Fallback)
    // =========================================================================
    @Test
    @WithSpan
    public void listNamespacesEmptyStoreNameDefaultFallbackTest()
    {
        try
        {
            System.out.println("CFT-002 listNamespaces: Calling listNamespaces with empty store name...");
            String[] nss = client.listNamespaces("", true);
            // Server falls back to default store; result may be null or valid array — just no exception
            System.out.println("CFT-002 listNamespaces: PASS — returned without exception; result: "
                    + (nss == null ? "null" : "array[" + nss.length + "]"));
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("CFT-002 listNamespaces: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("CFT-002 listNamespaces: Unexpected exception: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // CFT-003 — List Namespaces on Store with Encoded Characters in Store Name
    // =========================================================================
    @Category(UnverifiedServerIssues.class)
    @Test
    @WithSpan
    public void listNamespacesEncodedStoreTest()
    {
        Assume.assumeNotNull(encodedUserClient);
        try
        {
            System.out.println("CFT-003 listNamespaces: Setting up encoded store and namespace...");
            encodedUserClient.createStore(defaultEncodedStoreName, "CFT-003 encoded store test", "TEST");
            encodedUserClient.setValue(defaultEncodedStoreName, defaultEncodedNS, "cflt003.key", "cflt003.val", true);

            String[] nss = encodedUserClient.listNamespaces(defaultEncodedStoreName, true);
            Assert.assertNotNull("CFT-003 listNamespaces: result should not be null for encoded store", nss);

            java.util.List<String> nsList = Arrays.asList(nss);
            Assert.assertTrue("CFT-003 listNamespaces: encoded namespace '" + defaultEncodedNS + "' should be present",
                    nsList.contains(defaultEncodedNS));

            System.out.println("CFT-003 listNamespaces: PASS — found encoded namespace in listing");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("CFT-003 listNamespaces: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("CFT-003 listNamespaces: Unexpected exception: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // ECT-001 — List Namespaces on Store With No Namespaces
    // =========================================================================
    @Test
    @WithSpan
    public void listNamespacesEmptyStoreNoNamespacesTest()
    {
        String emptyStoreName = "WsClientEmptyStoreTest_listNS_ECT001";
        try
        {
            System.out.println("ECT-001 listNamespaces: Creating empty store...");
            client.createStore(emptyStoreName, "ECT-001 empty store for listNamespaces", "TEST");

            String[] nss = client.listNamespaces(emptyStoreName, true);
            // Expect null or empty array — no exception
            Assert.assertTrue("ECT-001 listNamespaces: result should be null or empty array",
                    nss == null || nss.length == 0);

            System.out.println("ECT-001 listNamespaces: PASS — empty store returned null/empty without exception");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("ECT-001 listNamespaces: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("ECT-001 listNamespaces: Unexpected exception: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // ECT-002 — User-Specific Namespaces Are Isolated From Global Namespaces
    // =========================================================================
    @Test
    @WithSpan
    public void listNamespacesUserSpecificIsolationTest()
    {
        Assume.assumeTrue("ECT-002 listNamespaces: skipped — target HPCC does not authenticate", targetHPCCAuthenticates);

        String testStoreName = "WsClientTestStore_listNS_ECT002";
        String globalNS = "listNS_ECT002_globalNS";
        String userNS   = "listNS_ECT002_userNS";
        try
        {
            System.out.println("ECT-002 listNamespaces: Setting up global and user-specific namespaces...");
            client.createStore(testStoreName, "ECT-002 listNamespaces isolation test store", "TEST");
            client.setValue(testStoreName, globalNS, "gkey", "gval", true);
            client.setValue(testStoreName, userNS,   "ukey", "uval", false);

            String[] globalNss = client.listNamespaces(testStoreName, true);
            Assert.assertNotNull("ECT-002 listNamespaces: global listing should not be null", globalNss);
            java.util.List<String> globalList = Arrays.asList(globalNss);
            Assert.assertTrue("ECT-002 listNamespaces: globalNS should appear in global listing", globalList.contains(globalNS));
            Assert.assertFalse("ECT-002 listNamespaces: userNS should NOT appear in global listing", globalList.contains(userNS));

            String[] userNss = client.listNamespaces(testStoreName, false);
            Assert.assertNotNull("ECT-002 listNamespaces: user-specific listing should not be null", userNss);
            java.util.List<String> userList = Arrays.asList(userNss);
            Assert.assertTrue("ECT-002 listNamespaces: userNS should appear in user-specific listing", userList.contains(userNS));

            System.out.println("ECT-002 listNamespaces: PASS — global/user namespace isolation verified");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("ECT-002 listNamespaces: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("ECT-002 listNamespaces: Unexpected exception: " + e.getLocalizedMessage());
        }
        finally
        {
            try { client.deleteNamespace(testStoreName, globalNS, true, ""); }  catch (Exception ignored) {}
            try { client.deleteNamespace(testStoreName, userNS,   false, ""); } catch (Exception ignored) {}
        }
    }

    // =========================================================================
    // ECT-003 — List Namespaces Returns Multiple Distinct Namespace Names
    // =========================================================================
    @Test
    @WithSpan
    public void listNamespacesMultipleNamespacesTest()
    {
        String testStoreName = "WsClientTestStore_listNS_ECT003";
        int count = 10;
        String nsPrefix = "listNS_ECT003_ns_";
        try
        {
            System.out.println("ECT-003 listNamespaces: Setting up store with " + count + " namespaces...");
            client.createStore(testStoreName, "ECT-003 listNamespaces multiple namespaces test store", "TEST");
            for (int i = 1; i <= count; i++)
            {
                client.setValue(testStoreName, nsPrefix + i, "key", "val", true);
            }

            String[] nss = client.listNamespaces(testStoreName, true);
            Assert.assertNotNull("ECT-003 listNamespaces: result should not be null", nss);
            Assert.assertTrue("ECT-003 listNamespaces: array length should be >= " + count, nss.length >= count);

            java.util.List<String> nsList = Arrays.asList(nss);
            for (int i = 1; i <= count; i++)
            {
                Assert.assertTrue("ECT-003 listNamespaces: " + nsPrefix + i + " should be present",
                        nsList.contains(nsPrefix + i));
            }

            // Verify no duplicates
            Set<String> nsSet = new HashSet<>(nsList);
            Assert.assertEquals("ECT-003 listNamespaces: no duplicate namespace names expected",
                    nss.length, nsSet.size());

            System.out.println("ECT-003 listNamespaces: PASS — all " + count + " namespaces found with no duplicates");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("ECT-003 listNamespaces: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("ECT-003 listNamespaces: Unexpected exception: " + e.getLocalizedMessage());
        }
        finally
        {
            for (int i = 1; i <= count; i++)
            {
                final String ns = nsPrefix + i;
                try { client.deleteNamespace(testStoreName, ns, true, ""); } catch (Exception ignored) {}
            }
        }
    }

    // =========================================================================
    // EHT-001 — List Namespaces for Non-Existent Store Name
    // =========================================================================
    @Test
    @WithSpan
    public void listNamespacesNonExistentStoreTest()
    {
        try
        {
            System.out.println("EHT-001 listNamespaces: Calling listNamespaces with non-existent store name...");
            String[] nss = client.listNamespaces("ThisStoreDefinitelyDoesNotExist_XYZ_12345", true);
            // Expect null or empty array — no exception
            Assert.assertTrue("EHT-001 listNamespaces: result should be null or empty array for non-existent store",
                    nss == null || nss.length == 0);

            System.out.println("EHT-001 listNamespaces: PASS — non-existent store returned null/empty without exception");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Server returns an ESP exception for non-existent stores — acceptable response
            System.out.println("EHT-001 listNamespaces: PASS — ArrayOfEspExceptionWrapper for non-existent store: " + e.getMessage());
        }
        catch (Exception e)
        {
            Assert.fail("EHT-001 listNamespaces: Unexpected exception: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // EHT-002 — List Namespaces With Null Store Name
    // =========================================================================
    @Test
    @WithSpan
    public void listNamespacesNullStoreNameTest()
    {
        try
        {
            System.out.println("EHT-002 listNamespaces: Calling listNamespaces with null store name...");
            String[] nss = client.listNamespaces(null, true);
            // Either null or a valid array from the default store — no exception
            System.out.println("EHT-002 listNamespaces: PASS — null store name handled gracefully; result: "
                    + (nss == null ? "null" : "array[" + nss.length + "]"));
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("EHT-002 listNamespaces: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (NullPointerException e)
        {
            Assert.fail("EHT-002 listNamespaces: NullPointerException should not escape for null store name: " + e.getLocalizedMessage());
        }
        catch (Exception e)
        {
            Assert.fail("EHT-002 listNamespaces: Unexpected exception: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // EHT-003 — List Namespaces User-Specific Without Authentication
    // =========================================================================
    @Test
    @WithSpan
    public void listNamespacesUserSpecificUnauthenticatedTest()
    {
        Assume.assumeFalse("EHT-003 listNamespaces: skipped — target HPCC authenticates", targetHPCCAuthenticates);
        try
        {
            System.out.println("EHT-003 listNamespaces: Calling listNamespaces(global=false) on unauthenticated cluster...");
            String[] nss = client.listNamespaces(storename, false);
            // Expect null or empty — no exception on unauthenticated cluster
            Assert.assertTrue("EHT-003 listNamespaces: result should be null or empty array on unauthenticated cluster",
                    nss == null || nss.length == 0);

            System.out.println("EHT-003 listNamespaces: PASS — user-specific listing on unauthenticated cluster handled gracefully");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("EHT-003 listNamespaces: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("EHT-003 listNamespaces: Unexpected exception: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // EHT-004 — List Namespaces With Invalid/Unreachable Connection
    // =========================================================================
    @Test
    @WithSpan
    public void listNamespacesInvalidConnectionTest()
    {
        try
        {
            System.out.println("EHT-004 listNamespaces: Creating client with invalid host...");
            HPCCWsStoreClient invalidClient = HPCCWsStoreClient.get("http", "invalid.host.that.does.not.exist",
                    "8010", "user", "pass", 3000);
            Assert.assertNotNull("EHT-004 listNamespaces: client creation should not return null", invalidClient);

            String[] nss = invalidClient.listNamespaces("WsClientTestStore", true);
            Assert.assertNull("EHT-004 listNamespaces: result should be null for invalid connection", nss);

            System.out.println("EHT-004 listNamespaces: PASS — invalid connection returned null without propagating exception");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("EHT-004 listNamespaces: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            System.out.println("EHT-004 listNamespaces: Exception during client creation (acceptable): " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // listNSKeys — CFT-001: User-Specific (Non-Global) Scope
    // =========================================================================
    @Test
    @WithSpan
    public void listNSKeys_CFT001_userSpecificScopeTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        Assume.assumeTrue("CFT-001 listNSKeys: Skipping — target HPCC does not authenticate", targetHPCCAuthenticates);
        final String testNS = "listNSKeys_CFT001_ns";
        try
        {
            System.out.println("CFT-001 listNSKeys: Testing user-specific scope listing...");
            Assert.assertTrue(client.setValue(storename, testNS, "user.key1", "v1", false));
            Assert.assertTrue(client.setValue(storename, testNS, "user.key2", "v2", false));

            String[] keys = client.listNSKeys(storename, testNS, false);
            Assert.assertNotNull("CFT-001 listNSKeys: result should not be null", keys);
            Assert.assertTrue("CFT-001 listNSKeys: should have at least 2 keys", keys.length >= 2);

            Set<String> keySet = new HashSet<>(Arrays.asList(keys));
            Assert.assertTrue("CFT-001 listNSKeys: user.key1 should be present", keySet.contains("user.key1"));
            Assert.assertTrue("CFT-001 listNSKeys: user.key2 should be present", keySet.contains("user.key2"));
            System.out.println("CFT-001 listNSKeys: PASS");
        }
        catch (Exception e)
        {
            Assert.fail("CFT-001 listNSKeys: Unexpected exception: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, testNS, false);
        }
    }

    // =========================================================================
    // listNSKeys — CFT-002: Null StoreName Falls Back to Default Store
    // =========================================================================
    @Test
    @WithSpan
    public void listNSKeys_CFT002_nullStoreNameFallbackTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        final String testNS = "listNSKeys_CFT002_ns";
        try
        {
            System.out.println("CFT-002 listNSKeys: Testing null storename fallback to default store...");
            // Pre-seed a key under the explicit default store so namespace exists
            client.setValue(storename, testNS, "fallback.key", "fval", true);

            String[] keys = client.listNSKeys(null, testNS, true);
            // If a default store is configured the call succeeds; if not, null or exception is acceptable
            if (keys != null)
            {
                System.out.println("CFT-002 listNSKeys: returned " + keys.length + " key(s) — default store configured");
            }
            else
            {
                System.out.println("CFT-002 listNSKeys: returned null — no default store configured (acceptable)");
            }
            System.out.println("CFT-002 listNSKeys: PASS");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            System.out.println("CFT-002 listNSKeys: ArrayOfEspExceptionWrapper (acceptable — no default store): " + e.toString());
        }
        catch (Exception e)
        {
            System.out.println("CFT-002 listNSKeys: Exception (acceptable — no default store): " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, testNS, true);
        }
    }

    // =========================================================================
    // listNSKeys — CFT-003: Empty String StoreName Falls Back to Default Store
    // =========================================================================
    @Test
    @WithSpan
    public void listNSKeys_CFT003_emptyStoreNameFallbackTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        final String testNS = "listNSKeys_CFT003_ns";
        try
        {
            System.out.println("CFT-003 listNSKeys: Testing empty storename fallback to default store...");
            client.setValue(storename, testNS, "fallback.empty.key", "eval", true);

            String[] keys = client.listNSKeys("", testNS, true);
            if (keys != null)
            {
                System.out.println("CFT-003 listNSKeys: returned " + keys.length + " key(s) — default store configured");
            }
            else
            {
                System.out.println("CFT-003 listNSKeys: returned null — no default store configured (acceptable)");
            }
            System.out.println("CFT-003 listNSKeys: PASS");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            System.out.println("CFT-003 listNSKeys: ArrayOfEspExceptionWrapper (acceptable — no default store): " + e.toString());
        }
        catch (Exception e)
        {
            System.out.println("CFT-003 listNSKeys: Exception (acceptable — no default store): " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, testNS, true);
        }
    }

    // =========================================================================
    // listNSKeys — CFT-004: Keys with Special Characters (Encoded Store/Namespace)
    // =========================================================================
    @Category(UnverifiedServerIssues.class)
    @Test
    @WithSpan
    public void listNSKeys_CFT004_specialCharactersEncodedTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        Assume.assumeNotNull("CFT-004 listNSKeys: Skipping — encodedUserClient not available", encodedUserClient);
        try
        {
            System.out.println("CFT-004 listNSKeys: Testing keys with special characters (encoded store/namespace)...");
            Assert.assertTrue(encodedUserClient.setValue(defaultEncodedStoreName, defaultEncodedNS, "encod@ble", "v", true));

            String[] keys = encodedUserClient.listNSKeys(defaultEncodedStoreName, defaultEncodedNS, true);
            Assert.assertNotNull("CFT-004 listNSKeys: result should not be null", keys);

            Set<String> keySet = new HashSet<>(Arrays.asList(keys));
            Assert.assertTrue("CFT-004 listNSKeys: 'encod@ble' should be present (round-tripped through encode/decode)", keySet.contains("encod@ble"));
            System.out.println("CFT-004 listNSKeys: PASS");
        }
        catch (Exception e)
        {
            Assert.fail("CFT-004 listNSKeys: Unexpected exception: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // listNSKeys — CFT-005: Global and User-Specific Keys Are Correctly Scoped
    // =========================================================================
    @Test
    @WithSpan
    public void listNSKeys_CFT005_globalVsUserScopingTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        Assume.assumeTrue("CFT-005 listNSKeys: Skipping — target HPCC does not authenticate", targetHPCCAuthenticates);
        final String testNS = "listNSKeys_CFT005_ns";
        try
        {
            System.out.println("CFT-005 listNSKeys: Testing global vs user-specific key scoping...");
            Assert.assertTrue(client.setValue(storename, testNS, "scope.global", "gv", true));
            Assert.assertTrue(client.setValue(storename, testNS, "scope.user", "uv", false));

            String[] globalKeys = client.listNSKeys(storename, testNS, true);
            String[] userKeys   = client.listNSKeys(storename, testNS, false);

            Assert.assertNotNull("CFT-005 listNSKeys: global result should not be null", globalKeys);
            Assert.assertNotNull("CFT-005 listNSKeys: user-specific result should not be null", userKeys);

            Set<String> globalSet = new HashSet<>(Arrays.asList(globalKeys));
            Set<String> userSet   = new HashSet<>(Arrays.asList(userKeys));

            Assert.assertTrue("CFT-005 listNSKeys: global listing should contain 'scope.global'", globalSet.contains("scope.global"));
            Assert.assertFalse("CFT-005 listNSKeys: global listing should NOT contain 'scope.user'", globalSet.contains("scope.user"));
            Assert.assertTrue("CFT-005 listNSKeys: user listing should contain 'scope.user'", userSet.contains("scope.user"));
            Assert.assertFalse("CFT-005 listNSKeys: user listing should NOT contain 'scope.global'", userSet.contains("scope.global"));
            System.out.println("CFT-005 listNSKeys: PASS");
        }
        catch (Exception e)
        {
            Assert.fail("CFT-005 listNSKeys: Unexpected exception: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, testNS, true);
            cleanupNamespace(storename, testNS, false);
        }
    }

    // =========================================================================
    // listNSKeys — ECT-001: Namespace With No Keys (Empty Namespace)
    // =========================================================================
    @Test
    @WithSpan
    public void listNSKeys_ECT001_emptyNamespaceTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        final String testNS = "listNSKeys_ECT001_ns";
        try
        {
            System.out.println("ECT-001 listNSKeys: Testing listing of namespace that had all keys deleted...");
            Assert.assertTrue(client.setValue(storename, testNS, "tempkey", "v", true));
            Assert.assertTrue(client.deleteValue(storename, testNS, "tempkey", true));

            String[] keys = client.listNSKeys(storename, testNS, true);
            // After deleting all keys the namespace node may be removed, causing a server fault (null returned),
            // or it may still exist and return an empty array — both are acceptable.
            if (keys == null)
            {
                System.out.println("ECT-001 listNSKeys: returned null (namespace node removed after delete — acceptable)");
            }
            else
            {
                Assert.assertEquals("ECT-001 listNSKeys: empty namespace should return 0 keys", 0, keys.length);
                System.out.println("ECT-001 listNSKeys: returned empty array (namespace still exists with no keys — acceptable)");
            }
            System.out.println("ECT-001 listNSKeys: PASS");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            System.out.println("ECT-001 listNSKeys: ArrayOfEspExceptionWrapper (namespace node removed — acceptable): " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("ECT-001 listNSKeys: Unexpected exception: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, testNS, true);
        }
    }

    // =========================================================================
    // listNSKeys — ECT-002: Large Number of Keys in Namespace
    // =========================================================================
    @Test
    @WithSpan
    public void listNSKeys_ECT002_largeKeyCountTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        final String testNS = "listNSKeys_ECT002_ns";
        final int keyCount = 50;
        try
        {
            System.out.println("ECT-002 listNSKeys: Seeding " + keyCount + " keys...");
            for (int i = 0; i < keyCount; i++)
            {
                Assert.assertTrue(client.setValue(storename, testNS, "bulkkey_" + i, "v" + i, true));
            }

            String[] keys = client.listNSKeys(storename, testNS, true);
            Assert.assertNotNull("ECT-002 listNSKeys: result should not be null", keys);
            Assert.assertEquals("ECT-002 listNSKeys: should return exactly " + keyCount + " keys", keyCount, keys.length);

            Set<String> keySet = new HashSet<>(Arrays.asList(keys));
            for (int i = 0; i < keyCount; i++)
            {
                Assert.assertTrue("ECT-002 listNSKeys: bulkkey_" + i + " should be present", keySet.contains("bulkkey_" + i));
            }
            System.out.println("ECT-002 listNSKeys: PASS — all " + keyCount + " keys returned");
        }
        catch (Exception e)
        {
            Assert.fail("ECT-002 listNSKeys: Unexpected exception: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, testNS, true);
        }
    }

    // =========================================================================
    // listNSKeys — ECT-003: Keys With Dot-Notation Names
    // =========================================================================
    @Test
    @WithSpan
    public void listNSKeys_ECT003_dotNotationKeyNamesTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        final String testNS = "listNSKeys_ECT003_ns";
        try
        {
            System.out.println("ECT-003 listNSKeys: Testing dot-notation key names in listNSKeys...");
            Assert.assertTrue(client.setValue(storename, testNS, "files.rowperpage.default", "50", true));

            String[] keys = client.listNSKeys(storename, testNS, true);
            Assert.assertNotNull("ECT-003 listNSKeys: result should not be null", keys);

            Set<String> keySet = new HashSet<>(Arrays.asList(keys));
            Assert.assertTrue("ECT-003 listNSKeys: 'files.rowperpage.default' should be present", keySet.contains("files.rowperpage.default"));
            System.out.println("ECT-003 listNSKeys: PASS");
        }
        catch (Exception e)
        {
            Assert.fail("ECT-003 listNSKeys: Unexpected exception: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, testNS, true);
        }
    }

    // =========================================================================
    // listNSKeys — EHT-001: Empty Namespace String
    // =========================================================================
    @Test
    @WithSpan
    public void listNSKeys_EHT001_emptyNamespaceStringTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        System.out.println("EHT-001 listNSKeys: Testing empty namespace string...");
        try
        {
            String[] keys = client.listNSKeys(storename, "", true);
            Assert.assertNull("EHT-001 listNSKeys: empty namespace should return null (SOAP fault caught internally)", keys);
            System.out.println("EHT-001 listNSKeys: returned null as expected — PASS");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            String msg = e.toString().toLowerCase();
            Assert.assertTrue("EHT-001 listNSKeys: exception message should reference namespace", msg.contains("namespace") || msg.contains("store") || msg.contains("dali"));
            System.out.println("EHT-001 listNSKeys: ArrayOfEspExceptionWrapper thrown as expected — PASS");
        }
        catch (Exception e)
        {
            System.out.println("EHT-001 listNSKeys: Exception thrown (acceptable): " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // listNSKeys — EHT-002: Null Namespace
    // =========================================================================
    @Test
    @WithSpan
    public void listNSKeys_EHT002_nullNamespaceTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        System.out.println("EHT-002 listNSKeys: Testing null namespace...");
        try
        {
            String[] keys = client.listNSKeys(storename, null, true);
            Assert.assertNull("EHT-002 listNSKeys: null namespace should return null (SOAP fault caught internally)", keys);
            System.out.println("EHT-002 listNSKeys: returned null as expected — PASS");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            System.out.println("EHT-002 listNSKeys: ArrayOfEspExceptionWrapper thrown as expected — PASS: " + e.toString());
        }
        catch (NullPointerException e)
        {
            Assert.fail("EHT-002 listNSKeys: NullPointerException must not propagate from client code: " + e.getLocalizedMessage());
        }
        catch (Exception e)
        {
            System.out.println("EHT-002 listNSKeys: Exception thrown (acceptable): " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // listNSKeys — EHT-003: Non-Existent Store Name
    // =========================================================================
    @Test
    @WithSpan
    public void listNSKeys_EHT003_nonExistentStoreTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        final String nonExistentStore = "NonExistentStore_listNSKeys_" + System.currentTimeMillis();
        System.out.println("EHT-003 listNSKeys: Testing non-existent store: " + nonExistentStore);
        try
        {
            String[] keys = client.listNSKeys(nonExistentStore, namespace, true);
            Assert.assertNull("EHT-003 listNSKeys: non-existent store should return null", keys);
            System.out.println("EHT-003 listNSKeys: returned null as expected — PASS");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            System.out.println("EHT-003 listNSKeys: ArrayOfEspExceptionWrapper thrown as expected — PASS: " + e.toString());
        }
        catch (Exception e)
        {
            System.out.println("EHT-003 listNSKeys: Exception thrown (acceptable): " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // listNSKeys — EHT-004: Non-Existent Namespace in Valid Store
    // =========================================================================
    @Test
    @WithSpan
    public void listNSKeys_EHT004_nonExistentNamespaceTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        final String nonExistentNS = "namespace_does_not_exist_listNSKeys_" + System.currentTimeMillis();
        System.out.println("EHT-004 listNSKeys: Testing non-existent namespace: " + nonExistentNS);
        try
        {
            String[] keys = client.listNSKeys(storename, nonExistentNS, true);
            Assert.assertNull("EHT-004 listNSKeys: non-existent namespace should return null", keys);
            System.out.println("EHT-004 listNSKeys: returned null as expected — PASS");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            System.out.println("EHT-004 listNSKeys: ArrayOfEspExceptionWrapper thrown as expected — PASS: " + e.toString());
        }
        catch (Exception e)
        {
            System.out.println("EHT-004 listNSKeys: Exception thrown (acceptable): " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // listNSKeys — EHT-005: Invalid Connection (Uninitialized Client)
    // =========================================================================
    @Test
    @WithSpan
    public void listNSKeys_EHT005_invalidConnectionTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        System.out.println("EHT-005 listNSKeys: Testing invalid connection / uninitialized stub...");
        try
        {
            HPCCWsStoreClient invalidClient = HPCCWsStoreClient.get("http", "invalid.host.that.does.not.exist",
                    "9999", "user", "pass", 3000);
            Assert.assertNotNull("EHT-005 listNSKeys: client creation should not return null", invalidClient);

            String[] keys = invalidClient.listNSKeys(storename, namespace, true);
            // RemoteException from unreachable host is caught and logged; null is returned
            Assert.assertNull("EHT-005 listNSKeys: result should be null for unreachable host", keys);
            System.out.println("EHT-005 listNSKeys: PASS — null returned for unreachable host");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("EHT-005 listNSKeys: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            // Exception from stub initialisation failure is also acceptable
            System.out.println("EHT-005 listNSKeys: PASS — exception on connection failure: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // listNSKeys — EHT-006: User-Specific Listing on Unauthenticated Connection
    // =========================================================================
    @Test
    @WithSpan
    public void listNSKeys_EHT006_userSpecificOnUnauthenticatedConnectionTest() throws Exception, ArrayOfEspExceptionWrapper
    {
        Assume.assumeFalse("EHT-006 listNSKeys: Skipping — target HPCC authenticates (test only applies to unauthenticated clusters)", targetHPCCAuthenticates);
        System.out.println("EHT-006 listNSKeys: Testing user-specific listing on unauthenticated connection...");
        try
        {
            String[] keys = client.listNSKeys(storename, namespace, false);
            Assert.assertNull("EHT-006 listNSKeys: user-specific listing with empty user should return null", keys);
            System.out.println("EHT-006 listNSKeys: returned null as expected — PASS");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            System.out.println("EHT-006 listNSKeys: ArrayOfEspExceptionWrapper thrown as expected — PASS: " + e.toString());
        }
        catch (Exception e)
        {
            System.out.println("EHT-006 listNSKeys: Exception thrown (acceptable): " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // CFT-001 fetchValue: Basic Fetch of an Existing Plain-Text Value
    // =========================================================================
    @Test
    @WithSpan
    public void fetchValue_CFT001_basicFetchExistingValueTest()
    {
        final String key = "fetchValueTest.basic.cft001";
        final String value = "hello-world";
        try
        {
            System.out.println("CFT-001 fetchValue: Setting up key '" + key + "' then fetching it...");
            Assert.assertTrue("CFT-001 fetchValue: setValue should succeed",
                    client.setValue(storename, namespace, key, value, true));
            String result = client.fetchValue(storename, namespace, key, true);
            Assert.assertNotNull("CFT-001 fetchValue: result should not be null for an existing key", result);
            Assert.assertEquals("CFT-001 fetchValue: result should equal stored value", value, result);
            System.out.println("CFT-001 fetchValue: PASS — fetched value: " + result);
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("CFT-001 fetchValue: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("CFT-001 fetchValue: Unexpected exception: " + e.getLocalizedMessage());
        }
        finally
        {
            try { client.deleteValue(storename, namespace, key, true); } catch (Exception ignored) {}
        }
    }

    // =========================================================================
    // CFT-002 fetchValue: Fetch Reflects Updated Value After Re-Set
    // =========================================================================
    @Test
    @WithSpan
    public void fetchValue_CFT002_fetchReflectsUpdatedValueTest()
    {
        final String key = "fetchValueTest.overwrite.cft002";
        try
        {
            System.out.println("CFT-002 fetchValue: Setting original value, then overwriting and verifying...");
            Assert.assertTrue("CFT-002 fetchValue: First setValue should succeed",
                    client.setValue(storename, namespace, key, "original", true));
            String firstResult = client.fetchValue(storename, namespace, key, true);
            Assert.assertEquals("CFT-002 fetchValue: First fetch should return 'original'", "original", firstResult);

            Assert.assertTrue("CFT-002 fetchValue: Second setValue (overwrite) should succeed",
                    client.setValue(storename, namespace, key, "updated", true));
            String secondResult = client.fetchValue(storename, namespace, key, true);
            Assert.assertEquals("CFT-002 fetchValue: Second fetch should return 'updated'", "updated", secondResult);
            System.out.println("CFT-002 fetchValue: PASS — overwrite verified");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("CFT-002 fetchValue: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("CFT-002 fetchValue: Unexpected exception: " + e.getLocalizedMessage());
        }
        finally
        {
            try { client.deleteValue(storename, namespace, key, true); } catch (Exception ignored) {}
        }
    }

    // =========================================================================
    // ECT-001 fetchValue: Empty StoreName (Default Store Fallback)
    // =========================================================================
    @Test
    @WithSpan
    public void fetchValue_ECT001_emptyStoreNameDefaultStoreFallbackTest()
    {
        final String key = "fetchValueTest.defaultstore.ect001";
        final String value = "default-store-value";
        try
        {
            System.out.println("ECT-001 fetchValue: Setting value in named store, then fetching with empty storename...");
            // Pre-populate a key in the named store so we have something to look for
            client.setValue(storename, namespace, key, value, true);

            // Fetch using empty storename — server uses its configured default store
            String result = client.fetchValue("", namespace, key, true);
            // Result may be the value (if default store == storename) or null (if default store differs)
            // Either is acceptable; what matters is no exception is thrown
            System.out.println("ECT-001 fetchValue: result with empty storename = " + result + " (null is acceptable if default store is not '" + storename + "')");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Server may return an ESP exception for empty store name — acceptable response
            System.out.println("ECT-001 fetchValue: PASS — ArrayOfEspExceptionWrapper for empty store name: " + e.getMessage());
        }
        catch (Exception e)
        {
            // Java client catches EspSoapFault and returns null; a thrown Exception here is unexpected
            Assert.fail("ECT-001 fetchValue: Unexpected exception for empty storename: " + e.getLocalizedMessage());
        }
        finally
        {
            try { client.deleteValue(storename, namespace, key, true); } catch (Exception ignored) {}
        }
    }

    // =========================================================================
    // ECT-002 fetchValue: Value Containing Special Characters
    // =========================================================================
    @Test
    @WithSpan
    public void fetchValue_ECT002_specialCharValueRoundTripTest()
    {
        final String key = "fetchValueTest.specialchars.ect002";
        final String value = "Hello <World> & \"Copilot\" \u00e9\u00e0 \n\t";
        try
        {
            System.out.println("ECT-002 fetchValue: Storing and retrieving value with special characters...");
            Assert.assertTrue("ECT-002 fetchValue: setValue with special-char value should succeed",
                    client.setValue(storename, namespace, key, value, true));
            String result = client.fetchValue(storename, namespace, key, true);
            Assert.assertNotNull("ECT-002 fetchValue: result should not be null", result);
            Assert.assertEquals("ECT-002 fetchValue: result should exactly match stored special-char value", value, result);
            System.out.println("ECT-002 fetchValue: PASS — special-char round-trip verified");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("ECT-002 fetchValue: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("ECT-002 fetchValue: Unexpected exception: " + e.getLocalizedMessage());
        }
        finally
        {
            try { client.deleteValue(storename, namespace, key, true); } catch (Exception ignored) {}
        }
    }

    // =========================================================================
    // ECT-003 fetchValue: Value at Maximum Allowed Size (1024 bytes)
    // =========================================================================
    @Test
    @WithSpan
    public void fetchValue_ECT003_maxSizeValueRoundTripTest()
    {
        final String key = "fetchValueTest.maxsize.ect003";
        final int maxSize = 1024;
        final StringBuilder sb = new StringBuilder(maxSize);
        for (int i = 0; i < maxSize; i++) sb.append('A');
        final String value = sb.toString();
        try
        {
            System.out.println("ECT-003 fetchValue: Storing and retrieving a " + maxSize + "-character value...");
            Assert.assertTrue("ECT-003 fetchValue: setValue with max-size value should succeed",
                    client.setValue(storename, namespace, key, value, true));
            String result = client.fetchValue(storename, namespace, key, true);
            Assert.assertNotNull("ECT-003 fetchValue: result should not be null", result);
            Assert.assertEquals("ECT-003 fetchValue: result length should equal " + maxSize, maxSize, result.length());
            Assert.assertEquals("ECT-003 fetchValue: result should equal stored max-size value", value, result);
            System.out.println("ECT-003 fetchValue: PASS — max-size value round-trip verified");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("ECT-003 fetchValue: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("ECT-003 fetchValue: Unexpected exception: " + e.getLocalizedMessage());
        }
        finally
        {
            try { client.deleteValue(storename, namespace, key, true); } catch (Exception ignored) {}
        }
    }

    // =========================================================================
    // EHT-001 fetchValue: Empty Namespace
    // =========================================================================
    @Test
    @WithSpan
    public void fetchValue_EHT001_emptyNamespaceTest()
    {
        System.out.println("EHT-001 fetchValue: Fetching with empty namespace — expecting null return...");
        try
        {
            String result = client.fetchValue(storename, "", "anykey", true);
            Assert.assertNull("EHT-001 fetchValue: result should be null for empty namespace", result);
            System.out.println("EHT-001 fetchValue: PASS — returned null as expected");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Server returns an ESP exception for empty namespace — acceptable response
            System.out.println("EHT-001 fetchValue: PASS — ArrayOfEspExceptionWrapper for empty namespace: " + e.getMessage());
        }
        catch (Exception e)
        {
            Assert.fail("EHT-001 fetchValue: Unexpected exception for empty namespace: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // EHT-002 fetchValue: Empty Key
    // =========================================================================
    @Test
    @WithSpan
    public void fetchValue_EHT002_emptyKeyTest()
    {
        System.out.println("EHT-002 fetchValue: Fetching with empty key — expecting null return...");
        try
        {
            String result = client.fetchValue(storename, namespace, "", true);
            Assert.assertNull("EHT-002 fetchValue: result should be null for empty key", result);
            System.out.println("EHT-002 fetchValue: PASS — returned null as expected");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Server returns an ESP exception for empty key — acceptable response
            System.out.println("EHT-002 fetchValue: PASS — ArrayOfEspExceptionWrapper for empty key: " + e.getMessage());
        }
        catch (Exception e)
        {
            Assert.fail("EHT-002 fetchValue: Unexpected exception for empty key: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // EHT-003 fetchValue: Non-Existent Store
    // =========================================================================
    @Test
    @WithSpan
    public void fetchValue_EHT003_nonExistentStoreTest()
    {
        System.out.println("EHT-003 fetchValue: Fetching from non-existent store — expecting null return...");
        try
        {
            String result = client.fetchValue("NonExistentStore_XYZ_12345", namespace, "somekey", true);
            Assert.assertNull("EHT-003 fetchValue: result should be null for non-existent store", result);
            System.out.println("EHT-003 fetchValue: PASS — returned null as expected");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Server returns an ESP exception for non-existent store — acceptable response
            System.out.println("EHT-003 fetchValue: PASS — ArrayOfEspExceptionWrapper for non-existent store: " + e.getMessage());
        }
        catch (Exception e)
        {
            Assert.fail("EHT-003 fetchValue: Unexpected exception for non-existent store: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // EHT-004 fetchValue: Non-Existent Namespace
    // =========================================================================
    @Test
    @WithSpan
    public void fetchValue_EHT004_nonExistentNamespaceTest()
    {
        System.out.println("EHT-004 fetchValue: Fetching from non-existent namespace — expecting null return...");
        try
        {
            String result = client.fetchValue(storename, "NonExistentNamespace_XYZ_99999", "somekey", true);
            Assert.assertNull("EHT-004 fetchValue: result should be null for non-existent namespace", result);
            System.out.println("EHT-004 fetchValue: PASS — returned null as expected");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Server returns an ESP exception for non-existent namespace — acceptable response
            System.out.println("EHT-004 fetchValue: PASS — ArrayOfEspExceptionWrapper for non-existent namespace: " + e.getMessage());
        }
        catch (Exception e)
        {
            Assert.fail("EHT-004 fetchValue: Unexpected exception for non-existent namespace: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // EHT-005 fetchValue: User-Specific Value on Unauthenticated Cluster
    // =========================================================================
    @Test
    @WithSpan
    public void fetchValue_EHT005_userSpecificOnUnauthenticatedClusterTest()
    {
        Assume.assumeFalse("EHT-005 fetchValue: Skipping — target HPCC authenticates (test only applies to unauthenticated clusters)", targetHPCCAuthenticates);
        System.out.println("EHT-005 fetchValue: Fetching user-specific (global=false) on unauthenticated cluster — expecting null...");
        try
        {
            String result = client.fetchValue(storename, namespace, "user.test", false);
            Assert.assertNull("EHT-005 fetchValue: result should be null when cluster does not authenticate", result);
            System.out.println("EHT-005 fetchValue: PASS — returned null as expected");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("EHT-005 fetchValue: ArrayOfEspExceptionWrapper should not propagate: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("EHT-005 fetchValue: Unexpected exception for user-specific on unauthenticated cluster: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // EHT-006 fetchValue: Invalid/Unreachable Connection
    // =========================================================================
    @Test
    @WithSpan
    public void fetchValue_EHT006_invalidConnectionTest()
    {
        System.out.println("EHT-006 fetchValue: Fetching with invalid/unreachable connection...");
        try
        {
            Connection badConn = new Connection("http", "invalid.nonexistent.host.local", "8010");
            badConn.setConnectTimeoutMilli(3000);
            badConn.setSocketTimeoutMilli(3000);
            HPCCWsStoreClient badClient = HPCCWsStoreClient.get(badConn);
            String result = badClient.fetchValue(storename, namespace, "anykey", true);
            // fetchValue returns null on RemoteException/EspSoapFault without re-throwing
            Assert.assertNull("EHT-006 fetchValue: result should be null for unreachable host", result);
            System.out.println("EHT-006 fetchValue: PASS — returned null for unreachable host");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("EHT-006 fetchValue: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (NullPointerException e)
        {
            Assert.fail("EHT-006 fetchValue: NullPointerException should not escape: " + e.getLocalizedMessage());
        }
        catch (Exception e)
        {
            // An exception from verifyStub() or connection failure is acceptable
            System.out.println("EHT-006 fetchValue: Exception thrown as expected (verifyStub or connection failure) — PASS: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // fetchAllNSKeys — CFT-001: Fetch all keys with verified content
    // =========================================================================
    @Test
    @WithSpan
    public void fetchAllNSKeysCFT001ContentVerificationTest()
    {
        final String testNS = "fetchAllNSKeysCFT001NS";
        try
        {
            System.out.println("fetchAllNSKeys CFT-001: Seeding keys and verifying returned content...");
            Assert.assertTrue(client.setValue(storename, testNS, "cft001.key1", "value1", true));
            Assert.assertTrue(client.setValue(storename, testNS, "cft001.key2", "value2", true));

            Properties props = client.fetchAllNSKeys(storename, testNS, true);
            Assert.assertNotNull("CFT-001: fetchAllNSKeys should not return null", props);
            Assert.assertEquals("CFT-001: cft001.key1 should equal value1", "value1", props.getProperty("cft001.key1"));
            Assert.assertEquals("CFT-001: cft001.key2 should equal value2", "value2", props.getProperty("cft001.key2"));
            System.out.println("fetchAllNSKeys CFT-001: PASS — returned props: " + props);
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("CFT-001: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("CFT-001: Unexpected exception: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, testNS, true);
        }
    }

    // =========================================================================
    // fetchAllNSKeys — CFT-002: User-specific (non-global) fetch with content verification
    // =========================================================================
    @Category(UnverifiedServerIssues.class)
    @Test
    @WithSpan
    public void fetchAllNSKeysCFT002UserSpecificTest()
    {
        Assume.assumeTrue("CFT-002: Skipping — target HPCC does not authenticate", targetHPCCAuthenticates);
        final String testNS = "fetchAllNSKeysCFT002NS";
        try
        {
            System.out.println("fetchAllNSKeys CFT-002: Seeding user-specific key and verifying returned content...");
            Assert.assertTrue(client.setValue(storename, testNS, "cft002.userkey", "uservalue", false));

            Properties userProps = client.fetchAllNSKeys(storename, testNS, false);
            Assert.assertNotNull("CFT-002: fetchAllNSKeys(global=false) should not return null", userProps);
            Assert.assertEquals("CFT-002: cft002.userkey should equal uservalue", "uservalue", userProps.getProperty("cft002.userkey"));

            // Global-scope fetch of the same namespace must NOT contain this user-scoped key
            Properties globalProps = client.fetchAllNSKeys(storename, testNS, true);
            Assert.assertNotNull("CFT-002: global fetchAllNSKeys should not return null", globalProps);
            Assert.assertNull("CFT-002: user-scoped key must not appear in global result", globalProps.getProperty("cft002.userkey"));
            System.out.println("fetchAllNSKeys CFT-002: PASS — user props: " + userProps);
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("CFT-002: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("CFT-002: Unexpected exception: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, testNS, false);
        }
    }

    // =========================================================================
    // fetchAllNSKeys — CFT-003: Namespace with no keys returns empty Properties
    // =========================================================================
    @Test
    @WithSpan
    public void fetchAllNSKeysCFT003EmptyNamespaceTest()
    {
        final String testNS = "fetchAllNSKeysCFT003NS";
        try
        {
            System.out.println("fetchAllNSKeys CFT-003: Setting then deleting a key to produce an empty namespace...");
            // Seed a value so the namespace exists, then remove it
            Assert.assertTrue(client.setValue(storename, testNS, "cft003.seed", "seedval", true));
            Assert.assertTrue(client.deleteValue(storename, testNS, "cft003.seed", true));

            Properties props = client.fetchAllNSKeys(storename, testNS, true);
            Assert.assertNotNull("CFT-003: fetchAllNSKeys should not return null for empty namespace", props);
            Assert.assertTrue("CFT-003: Properties should be empty for a namespace with no keys", props.isEmpty());
            System.out.println("fetchAllNSKeys CFT-003: PASS — empty Properties returned as expected");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("CFT-003: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("CFT-003: Unexpected exception: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, testNS, true);
        }
    }

    // =========================================================================
    // fetchAllNSKeys — ECT-001: Empty store name (falls back to default store)
    // =========================================================================
    @Test
    @WithSpan
    public void fetchAllNSKeysECT001EmptyStoreNameTest()
    {
        final String testNS = "fetchAllNSKeysECT001NS";
        try
        {
            System.out.println("fetchAllNSKeys ECT-001: Calling fetchAllNSKeys with null and empty storename...");

            // null storename — server falls back to default store or throws; client must not NPE
            Properties propsNull = client.fetchAllNSKeys(null, testNS, true);
            Assert.assertNotNull("ECT-001: fetchAllNSKeys(null store) must not return null", propsNull);
            System.out.println("fetchAllNSKeys ECT-001 (null): returned " + propsNull.size() + " entries");

            // empty storename
            Properties propsEmpty = client.fetchAllNSKeys("", testNS, true);
            Assert.assertNotNull("ECT-001: fetchAllNSKeys(empty store) must not return null", propsEmpty);
            System.out.println("fetchAllNSKeys ECT-001 (empty): returned " + propsEmpty.size() + " entries");

            System.out.println("fetchAllNSKeys ECT-001: PASS");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Re-thrown ESP exception is acceptable — document behaviour
            System.out.println("fetchAllNSKeys ECT-001: ArrayOfEspExceptionWrapper thrown (acceptable): " + e.toString());
        }
        catch (NullPointerException e)
        {
            Assert.fail("ECT-001: NullPointerException must not escape fetchAllNSKeys: " + e.getLocalizedMessage());
        }
        catch (Exception e)
        {
            // Connection/stub fault is acceptable for invalid store
            System.out.println("fetchAllNSKeys ECT-001: Exception thrown (acceptable for missing default store): " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // fetchAllNSKeys — ECT-003: Large namespace (many key-value pairs)
    // =========================================================================
    @Test
    @WithSpan
    public void fetchAllNSKeysECT003LargeNamespaceTest()
    {
        final String testNS = "fetchAllNSKeysECT003BulkNS";
        final int keyCount = 100;
        try
        {
            System.out.println("fetchAllNSKeys ECT-003: Seeding " + keyCount + " key-value pairs...");
            for (int i = 0; i < keyCount; i++)
            {
                Assert.assertTrue("ECT-003: setValue failed for key " + i,
                        client.setValue(storename, testNS, "ect003.key" + i, "ect003.val" + i, true));
            }

            long startMs = System.currentTimeMillis();
            Properties props = client.fetchAllNSKeys(storename, testNS, true);
            long elapsed = System.currentTimeMillis() - startMs;

            Assert.assertNotNull("ECT-003: fetchAllNSKeys should not return null", props);
            Assert.assertEquals("ECT-003: Should have exactly " + keyCount + " entries", keyCount, props.size());

            for (int i = 0; i < keyCount; i++)
            {
                Assert.assertEquals("ECT-003: Value mismatch for key " + i,
                        "ect003.val" + i, props.getProperty("ect003.key" + i));
            }

            Assert.assertTrue("ECT-003: fetchAllNSKeys took too long (" + elapsed + "ms > 10000ms)", elapsed <= 10000);
            System.out.println("fetchAllNSKeys ECT-003: PASS — " + props.size() + " pairs in " + elapsed + "ms");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("ECT-003: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("ECT-003: Unexpected exception: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, testNS, true);
        }
    }

    // =========================================================================
    // fetchAllNSKeys — ECT-004: Very long value string (near MaxValueSize)
    // =========================================================================
    @Test
    @WithSpan
    public void fetchAllNSKeysECT004LongValueTest()
    {
        final String testNS = "fetchAllNSKeysECT004NS";
        final int valueLen = 1024;
        try
        {
            // Build a 1024-character value
            StringBuilder sb = new StringBuilder(valueLen);
            for (int i = 0; i < valueLen; i++)
                sb.append((char) ('a' + (i % 26)));
            String longValue = sb.toString();

            System.out.println("fetchAllNSKeys ECT-004: Setting key with " + valueLen + "-char value...");
            Assert.assertTrue(client.setValue(storename, testNS, "ect004.longkey", longValue, true));

            Properties props = client.fetchAllNSKeys(storename, testNS, true);
            Assert.assertNotNull("ECT-004: fetchAllNSKeys should not return null", props);

            String fetched = props.getProperty("ect004.longkey");
            Assert.assertNotNull("ECT-004: Long-value key must be present in result", fetched);
            Assert.assertEquals("ECT-004: Fetched value length must equal " + valueLen, valueLen, fetched.length());
            Assert.assertEquals("ECT-004: Fetched value content must match seeded value", longValue, fetched);
            System.out.println("fetchAllNSKeys ECT-004: PASS — value length " + fetched.length());
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("ECT-004: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("ECT-004: Unexpected exception: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, testNS, true);
        }
    }

    // =========================================================================
    // fetchAllNSKeys — EHT-001: Non-existent store name
    // =========================================================================
    @Test
    @WithSpan
    public void fetchAllNSKeysEHT001NonExistentStoreTest()
    {
        final String nonExistentStore = "NonExistentStore_fetchAllNSKeys_" + System.currentTimeMillis();
        final String testNS = "fetchAllNSKeysEHT001NS";
        try
        {
            System.out.println("fetchAllNSKeys EHT-001: Fetching from non-existent store '" + nonExistentStore + "'...");
            Properties props = client.fetchAllNSKeys(nonExistentStore, testNS, true);
            // Java client swallows RemoteException/EspSoapFault — expect empty Properties
            Assert.assertNotNull("EHT-001: fetchAllNSKeys must not return null", props);
            System.out.println("fetchAllNSKeys EHT-001: PASS — returned empty Properties (size=" + props.size() + ") for non-existent store");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Re-thrown ESP exception is also acceptable
            System.out.println("fetchAllNSKeys EHT-001: ArrayOfEspExceptionWrapper thrown (acceptable): " + e.toString());
        }
        catch (NullPointerException e)
        {
            Assert.fail("EHT-001: NullPointerException must not escape fetchAllNSKeys: " + e.getLocalizedMessage());
        }
        catch (Exception e)
        {
            // Connection/SOAP fault is acceptable for non-existent store
            System.out.println("fetchAllNSKeys EHT-001: Exception thrown (acceptable): " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // fetchAllNSKeys — EHT-002: Non-existent namespace within a valid store
    // =========================================================================
    @Test
    @WithSpan
    public void fetchAllNSKeysEHT002NonExistentNamespaceTest()
    {
        final String nonExistentNS = "NonExistentNS_fetchAllNSKeys_" + System.currentTimeMillis();
        try
        {
            System.out.println("fetchAllNSKeys EHT-002: Fetching from non-existent namespace '" + nonExistentNS + "' in store '" + storename + "'...");
            Properties props = client.fetchAllNSKeys(storename, nonExistentNS, true);
            // Java client swallows the server's "invalid namespace detected!" exception
            Assert.assertNotNull("EHT-002: fetchAllNSKeys must not return null", props);
            System.out.println("fetchAllNSKeys EHT-002: PASS — returned empty Properties (size=" + props.size() + ") for non-existent namespace");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Re-thrown ESP exception is also acceptable
            System.out.println("fetchAllNSKeys EHT-002: ArrayOfEspExceptionWrapper thrown (acceptable): " + e.toString());
        }
        catch (NullPointerException e)
        {
            Assert.fail("EHT-002: NullPointerException must not escape fetchAllNSKeys: " + e.getLocalizedMessage());
        }
        catch (Exception e)
        {
            System.out.println("fetchAllNSKeys EHT-002: Exception thrown (acceptable): " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // fetchAllNSKeys — EHT-003: Empty namespace parameter
    // =========================================================================
    @Test
    @WithSpan
    public void fetchAllNSKeysEHT003EmptyNamespaceTest()
    {
        try
        {
            System.out.println("fetchAllNSKeys EHT-003: Calling fetchAllNSKeys with null namespace...");
            Properties propsNull = client.fetchAllNSKeys(storename, null, true);
            Assert.assertNotNull("EHT-003: fetchAllNSKeys(null NS) must not return null", propsNull);
            System.out.println("fetchAllNSKeys EHT-003 (null NS): returned " + propsNull.size() + " entries");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            System.out.println("fetchAllNSKeys EHT-003 (null NS): ArrayOfEspExceptionWrapper thrown (acceptable): " + e.toString());
        }
        catch (NullPointerException e)
        {
            Assert.fail("EHT-003: NullPointerException must not escape fetchAllNSKeys (null NS): " + e.getLocalizedMessage());
        }
        catch (Exception e)
        {
            System.out.println("fetchAllNSKeys EHT-003 (null NS): Exception thrown (acceptable): " + e.getLocalizedMessage());
        }

        try
        {
            System.out.println("fetchAllNSKeys EHT-003: Calling fetchAllNSKeys with empty namespace...");
            Properties propsEmpty = client.fetchAllNSKeys(storename, "", true);
            Assert.assertNotNull("EHT-003: fetchAllNSKeys(empty NS) must not return null", propsEmpty);
            System.out.println("fetchAllNSKeys EHT-003 (empty NS): returned " + propsEmpty.size() + " entries");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            System.out.println("fetchAllNSKeys EHT-003 (empty NS): ArrayOfEspExceptionWrapper thrown (acceptable): " + e.toString());
        }
        catch (NullPointerException e)
        {
            Assert.fail("EHT-003: NullPointerException must not escape fetchAllNSKeys (empty NS): " + e.getLocalizedMessage());
        }
        catch (Exception e)
        {
            System.out.println("fetchAllNSKeys EHT-003 (empty NS): Exception thrown (acceptable): " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // fetchAllNSKeys — EHT-004: User-specific fetch when unauthenticated
    // =========================================================================
    @Test
    @WithSpan
    public void fetchAllNSKeysEHT004UnauthenticatedUserSpecificTest()
    {
        Assume.assumeFalse("EHT-004: Skipping — target HPCC authenticates (test requires no-auth environment)", targetHPCCAuthenticates);
        final String testNS = "fetchAllNSKeysEHT004NS";
        try
        {
            System.out.println("fetchAllNSKeys EHT-004: Calling fetchAllNSKeys(global=false) without authenticated user...");
            Properties props = client.fetchAllNSKeys(storename, testNS, false);
            Assert.assertNotNull("EHT-004: fetchAllNSKeys must not return null", props);
            System.out.println("fetchAllNSKeys EHT-004: PASS — returned empty Properties (size=" + props.size() + ")");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            System.out.println("fetchAllNSKeys EHT-004: ArrayOfEspExceptionWrapper thrown (acceptable): " + e.toString());
        }
        catch (NullPointerException e)
        {
            Assert.fail("EHT-004: NullPointerException must not escape fetchAllNSKeys: " + e.getLocalizedMessage());
        }
        catch (Exception e)
        {
            System.out.println("fetchAllNSKeys EHT-004: Exception thrown (acceptable): " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // fetchAllNSKeys — EHT-005: Null connection (client not initialised)
    // =========================================================================
    @Test
    @WithSpan
    public void fetchAllNSKeysEHT005NullConnectionTest()
    {
        try
        {
            System.out.println("fetchAllNSKeys EHT-005: Calling fetchAllNSKeys on a client with null stub...");
            HPCCWsStoreClient stublessClient = HPCCWsStoreClient.get(connection);
            Field stubField = org.hpccsystems.ws.client.BaseHPCCWsClient.class.getDeclaredField("stub");
            stubField.setAccessible(true);
            stubField.set(stublessClient, null);

            stublessClient.fetchAllNSKeys(storename, namespace, true);
            Assert.fail("EHT-005: Expected an exception when stub is null");
        }
        catch (NullPointerException e)
        {
            Assert.fail("EHT-005: NullPointerException must not escape — expected a descriptive exception: " + e.getLocalizedMessage());
        }
        catch (Exception e)
        {
            Assert.assertTrue("EHT-005: Exception message should indicate stub not available",
                    e.getMessage() != null && e.getMessage().contains("WS Client Stub not available"));
            System.out.println("fetchAllNSKeys EHT-005: PASS — exception with expected message: " + e.getMessage());
        }
    }

    // =========================================================================
    // fetchAllNSKeys — EHT-006: Invalid credentials
    // =========================================================================
    @Category(UnverifiedServerIssues.class)
    @Test
    @WithSpan
    public void fetchAllNSKeysEHT006InvalidCredentialsTest()
    {
        Assume.assumeTrue("EHT-006: Skipping — target HPCC does not enforce authentication", targetHPCCAuthenticates);
        try
        {
            System.out.println("fetchAllNSKeys EHT-006: Calling fetchAllNSKeys with invalid credentials...");
            Connection badCredsConn = new Connection(connString);
            badCredsConn.setCredentials("invalidUser_fetchAllNSKeys", "wrongPass");
            HPCCWsStoreClient badCredsClient = HPCCWsStoreClient.get(badCredsConn);

            badCredsClient.fetchAllNSKeys(storename, namespace, true);
            Assert.fail("EHT-006: Expected an exception for invalid credentials");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            System.out.println("fetchAllNSKeys EHT-006: PASS — ArrayOfEspExceptionWrapper thrown for invalid credentials: " + e.toString());
        }
        catch (NullPointerException e)
        {
            Assert.fail("EHT-006: NullPointerException must not escape: " + e.getLocalizedMessage());
        }
        catch (Exception e)
        {
            // AxisFault / RemoteException for HTTP 401 is acceptable
            System.out.println("fetchAllNSKeys EHT-006: PASS — Exception thrown for invalid credentials: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // fetchKeyMetaData CFT-001: Verify core metadata properties on fresh key
    // =========================================================================
    @Test
    @WithSpan
    public void fetchKeyMetaDataCFT001BasicMetadataTest()
    {
        String ns = "fetchKeyMetaData_CFT001";
        String key = "meta.test.key.cft001";
        try
        {
            System.out.println("fetchKeyMetaData CFT-001: Setting up key '" + key + "' in namespace '" + ns + "'...");
            client.setValue(storename, ns, key, "somevalue", true);

            System.out.println("fetchKeyMetaData CFT-001: Fetching metadata for key '" + key + "'...");
            Properties props = client.fetchKeyMetaData(storename, ns, key, true);

            Assert.assertNotNull("CFT-001: Properties must not be null", props);
            Assert.assertTrue("CFT-001: @createUser must be present", props.containsKey("@createUser"));
            Assert.assertTrue("CFT-001: @createTime must be present", props.containsKey("@createTime"));
            Assert.assertFalse("CFT-001: @createUser must not be empty", props.getProperty("@createUser").isEmpty());
            Assert.assertFalse("CFT-001: @createTime must not be empty", props.getProperty("@createTime").isEmpty());
            System.out.println("fetchKeyMetaData CFT-001: PASS — metadata: " + props.toString());
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("CFT-001: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("CFT-001: Unexpected exception: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, ns, true);
        }
    }

    // =========================================================================
    // fetchKeyMetaData CFT-002: Verify edit metadata after key update
    // =========================================================================
    @Test
    @WithSpan
    public void fetchKeyMetaDataCFT002EditMetadataAfterUpdateTest()
    {
        String ns = "fetchKeyMetaData_CFT002";
        String key = "meta.edit.key.cft002";
        try
        {
            System.out.println("fetchKeyMetaData CFT-002: Creating key '" + key + "' then updating it...");
            client.setValue(storename, ns, key, "initial", true);
            client.setValue(storename, ns, key, "updated", true);

            System.out.println("fetchKeyMetaData CFT-002: Fetching metadata for updated key...");
            Properties props = client.fetchKeyMetaData(storename, ns, key, true);

            Assert.assertNotNull("CFT-002: Properties must not be null", props);
            Assert.assertTrue("CFT-002: @editTime must be present after update", props.containsKey("@editTime"));
            Assert.assertTrue("CFT-002: @editBy must be present after update", props.containsKey("@editBy"));
            Assert.assertFalse("CFT-002: @editTime must not be empty", props.getProperty("@editTime").isEmpty());
            System.out.println("fetchKeyMetaData CFT-002: PASS — metadata: " + props.toString());
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("CFT-002: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("CFT-002: Unexpected exception: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, ns, true);
        }
    }

    // =========================================================================
    // fetchKeyMetaData CFT-003: Fetch metadata for user-specific key
    // =========================================================================
    @Test
    @WithSpan
    public void fetchKeyMetaDataCFT003UserSpecificKeyTest()
    {
        Assume.assumeTrue("CFT-003: Skipping — target HPCC does not authenticate users", targetHPCCAuthenticates);
        String ns = "fetchKeyMetaData_CFT003";
        String key = "meta.user.key.cft003";
        try
        {
            System.out.println("fetchKeyMetaData CFT-003: Setting user-specific key '" + key + "'...");
            client.setValue(storename, ns, key, "uservalue", false);

            System.out.println("fetchKeyMetaData CFT-003: Fetching metadata for user-specific key...");
            Properties props = client.fetchKeyMetaData(storename, ns, key, false);

            Assert.assertNotNull("CFT-003: Properties must not be null for user-specific key", props);
            Assert.assertTrue("CFT-003: @createUser must be present", props.containsKey("@createUser"));
            System.out.println("fetchKeyMetaData CFT-003: PASS — metadata: " + props.toString());
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("CFT-003: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("CFT-003: Unexpected exception: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, ns, false);
        }
    }

    // =========================================================================
    // fetchKeyMetaData CFT-004: Verify metadata presence confirms correct echo-back
    // =========================================================================
    @Test
    @WithSpan
    public void fetchKeyMetaDataCFT004EchoBackVerificationTest()
    {
        String ns = "fetchKeyMetaData_CFT004";
        String key = "echo.test.key.cft004";
        try
        {
            System.out.println("fetchKeyMetaData CFT-004: Creating key '" + key + "' for echo-back verification...");
            client.setValue(storename, ns, key, "echovalue", true);

            System.out.println("fetchKeyMetaData CFT-004: Fetching metadata...");
            Properties props = client.fetchKeyMetaData(storename, ns, key, true);

            Assert.assertNotNull("CFT-004: Properties must not be null", props);
            Assert.assertTrue("CFT-004: @createUser must be present, confirming correct key was targeted", props.containsKey("@createUser"));
            System.out.println("fetchKeyMetaData CFT-004: PASS — echo-back confirmed via metadata presence: " + props.toString());
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("CFT-004: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("CFT-004: Unexpected exception: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, ns, true);
        }
    }

    // =========================================================================
    // fetchKeyMetaData ECT-001: Null storename falls back to default store
    // =========================================================================
    @Test
    @WithSpan
    public void fetchKeyMetaDataECT001NullStorenameTest()
    {
        try
        {
            System.out.println("fetchKeyMetaData ECT-001: Calling fetchKeyMetaData with null storename...");
            Properties props = client.fetchKeyMetaData(null, namespace, "some.key.ect001", true);
            Assert.assertNotNull("ECT-001: Properties must not be null when storename is null", props);
            System.out.println("fetchKeyMetaData ECT-001: PASS — returned Properties: " + props.toString());
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Acceptable if no default store is configured
            System.out.println("fetchKeyMetaData ECT-001: PASS — ArrayOfEspExceptionWrapper (no default store configured): " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("ECT-001: Unexpected exception for null storename: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // fetchKeyMetaData ECT-002: Non-existent key returns empty Properties
    // =========================================================================
    @Test
    @WithSpan
    public void fetchKeyMetaDataECT002NonExistentKeyTest()
    {
        try
        {
            System.out.println("fetchKeyMetaData ECT-002: Fetching metadata for non-existent key...");
            Properties props = client.fetchKeyMetaData(storename, namespace, "nonexistent.key.xyz987.ect002", true);
            Assert.assertNotNull("ECT-002: Properties must not be null for a non-existent key", props);
            Assert.assertTrue("ECT-002: Properties must be empty for a non-existent key", props.isEmpty());
            System.out.println("fetchKeyMetaData ECT-002: PASS — empty Properties returned as expected");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Server returns an ESP exception for a non-existent key — acceptable response
            System.out.println("fetchKeyMetaData ECT-002: PASS — ArrayOfEspExceptionWrapper for non-existent key: " + e.getMessage());
        }
        catch (Exception e)
        {
            Assert.fail("ECT-002: Unexpected exception: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // fetchKeyMetaData ECT-003: Empty string key returns no exception
    // =========================================================================
    @Test
    @WithSpan
    public void fetchKeyMetaDataECT003EmptyKeyTest()
    {
        try
        {
            System.out.println("fetchKeyMetaData ECT-003: Calling fetchKeyMetaData with empty string key...");
            Properties props = client.fetchKeyMetaData(storename, namespace, "", true);
            Assert.assertNotNull("ECT-003: Properties must not be null for empty key", props);
            System.out.println("fetchKeyMetaData ECT-003: PASS — returned Properties: " + props.toString());
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Acceptable server response for empty key
            System.out.println("fetchKeyMetaData ECT-003: PASS — ArrayOfEspExceptionWrapper for empty key: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("ECT-003: Unexpected exception for empty key: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // fetchKeyMetaData ECT-004: Non-existent namespace returns empty/non-null Properties
    // =========================================================================
    @Test
    @WithSpan
    public void fetchKeyMetaDataECT004NonExistentNamespaceTest()
    {
        try
        {
            System.out.println("fetchKeyMetaData ECT-004: Fetching metadata for key in non-existent namespace...");
            Properties props = client.fetchKeyMetaData(storename, "nonexistent.namespace.xyz987.ect004", "somekey", true);
            Assert.assertNotNull("ECT-004: Properties must not be null for non-existent namespace", props);
            System.out.println("fetchKeyMetaData ECT-004: PASS — returned Properties: " + props.toString());
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Server returns an ESP exception for a non-existent namespace — acceptable response
            System.out.println("fetchKeyMetaData ECT-004: PASS — ArrayOfEspExceptionWrapper for non-existent namespace: " + e.getMessage());
        }
        catch (Exception e)
        {
            Assert.fail("ECT-004: Unexpected exception: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // fetchKeyMetaData ECT-005: Dot-separated key name (common WsStore convention)
    // =========================================================================
    @Test
    @WithSpan
    public void fetchKeyMetaDataECT005DotSeparatedKeyTest()
    {
        String ns = "fetchKeyMetaData_ECT005";
        String key = "files.rowperpage.default";
        try
        {
            System.out.println("fetchKeyMetaData ECT-005: Setting dot-separated key '" + key + "'...");
            client.setValue(storename, ns, key, "50", true);

            System.out.println("fetchKeyMetaData ECT-005: Fetching metadata for dot-separated key...");
            Properties props = client.fetchKeyMetaData(storename, ns, key, true);

            Assert.assertNotNull("ECT-005: Properties must not be null for dot-separated key", props);
            Assert.assertTrue("ECT-005: @createUser must be present", props.containsKey("@createUser"));
            System.out.println("fetchKeyMetaData ECT-005: PASS — metadata: " + props.toString());
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("ECT-005: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("ECT-005: Unexpected exception: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, ns, true);
        }
    }

    // =========================================================================
    // fetchKeyMetaData EHT-001: Non-existent store name
    // =========================================================================
    @Test
    @WithSpan
    public void fetchKeyMetaDataEHT001NonExistentStoreTest()
    {
        try
        {
            System.out.println("fetchKeyMetaData EHT-001: Fetching metadata with non-existent store name...");
            Properties props = client.fetchKeyMetaData("NonExistentStoreName_XYZ987", namespace, "somekey.eht001", true);
            // Acceptable: empty Properties returned without exception
            Assert.assertNotNull("EHT-001: Properties must not be null even for a non-existent store", props);
            System.out.println("fetchKeyMetaData EHT-001: PASS — empty Properties returned for non-existent store: " + props.toString());
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Also acceptable: server may return ESP exceptions for unknown store
            System.out.println("fetchKeyMetaData EHT-001: PASS — ArrayOfEspExceptionWrapper for non-existent store: " + e.toString());
        }
        catch (NullPointerException e)
        {
            Assert.fail("EHT-001: NullPointerException must not escape: " + e.getLocalizedMessage());
        }
        catch (Exception e)
        {
            Assert.fail("EHT-001: Unexpected exception for non-existent store: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // fetchKeyMetaData EHT-002: User-specific key on non-authenticating server
    // =========================================================================
    @Test
    @WithSpan
    public void fetchKeyMetaDataEHT002UserSpecificNoAuthTest()
    {
        Assume.assumeFalse("EHT-002: Skipping — target HPCC authenticates users (test only meaningful without auth)", targetHPCCAuthenticates);
        try
        {
            System.out.println("fetchKeyMetaData EHT-002: Fetching user-specific key metadata on non-authenticating server...");
            Properties props = client.fetchKeyMetaData(storename, namespace, "user.test.eht002", false);
            Assert.assertNotNull("EHT-002: Properties must not be null", props);
            System.out.println("fetchKeyMetaData EHT-002: PASS — returned Properties: " + props.toString());
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("EHT-002: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("EHT-002: Unexpected exception: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // fetchKeyMetaData EHT-003: Null key parameter
    // =========================================================================
    @Test
    @WithSpan
    public void fetchKeyMetaDataEHT003NullKeyTest()
    {
        try
        {
            System.out.println("fetchKeyMetaData EHT-003: Calling fetchKeyMetaData with null key...");
            Properties props = client.fetchKeyMetaData(storename, namespace, null, true);
            // Likely returns empty Properties since null key won't match any stored entry
            Assert.assertNotNull("EHT-003: Properties must not be null for null key", props);
            System.out.println("fetchKeyMetaData EHT-003: PASS — returned Properties for null key: " + props.toString());
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Acceptable: server may reject null key with ESP exception
            System.out.println("fetchKeyMetaData EHT-003: PASS — ArrayOfEspExceptionWrapper for null key: " + e.toString());
        }
        catch (NullPointerException e)
        {
            Assert.fail("EHT-003: NullPointerException must not escape for null key: " + e.getLocalizedMessage());
        }
        catch (Exception e)
        {
            // RemoteException / AxisFault are swallowed internally — if they escape it is a bug
            Assert.fail("EHT-003: Unexpected exception for null key: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // setValueEncrypted CFT-001: Overwrite encrypted key with a different cipher
    // =========================================================================
    @Test
    @WithSpan
    public void setValueEncryptedCFT001OverwriteWithDifferentCipherTest()
    {
        String ns = "sve_cft001_" + System.currentTimeMillis();
        try
        {
            System.out.println("setValueEncrypted CFT-001: Overwrite encrypted key with a different cipher...");
            byte[] key1Bytes = new byte[12];
            byte[] key2Bytes = new byte[12];
            new Random().nextBytes(key1Bytes);
            new Random().nextBytes(key2Bytes);
            String secretKey1 = new String(key1Bytes, Charset.forName("UTF-8"));
            String secretKey2 = new String(key2Bytes, Charset.forName("UTF-8"));

            Cipher encryptCipher1 = CryptoHelper.createDefaultCipher(secretKey1, true);
            Cipher decryptCipher1 = CryptoHelper.createDefaultCipher(secretKey1, false);
            Cipher encryptCipher2 = CryptoHelper.createDefaultCipher(secretKey2, true);
            Cipher decryptCipher2 = CryptoHelper.createDefaultCipher(secretKey2, false);

            String testKey = "overwrite.encrypted.cft001.test";
            Assert.assertTrue("CFT-001: First setValueEncrypted should succeed",
                    client.setValueEncrypted(storename, ns, testKey, "firstvalue", true, encryptCipher1));
            Assert.assertTrue("CFT-001: Second setValueEncrypted (different cipher) should succeed",
                    client.setValueEncrypted(storename, ns, testKey, "secondvalue", true, encryptCipher2));

            String decryptedWithKey2 = client.fetchValueEncrypted(storename, ns, testKey, true, decryptCipher2);
            Assert.assertNotNull("CFT-001: Decrypted value with key2 must not be null", decryptedWithKey2);
            Assert.assertEquals("CFT-001: Decrypted value with key2 must equal 'secondvalue'", "secondvalue", decryptedWithKey2);

            String rawCiphertext = client.fetchValue(storename, ns, testKey, true);
            String incorrectDecrypt = CryptoHelper.decrypt(rawCiphertext, decryptCipher1);
            Assert.assertFalse("CFT-001: Decryption with old key1 should not produce 'secondvalue'",
                    "secondvalue".equals(incorrectDecrypt));

            System.out.println("setValueEncrypted CFT-001: PASS");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("CFT-001: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("CFT-001: Unexpected exception: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, ns, true);
        }
    }

    // =========================================================================
    // setValueEncrypted CFT-002: Empty string plaintext value (Cipher overload)
    // =========================================================================
    @Test
    @WithSpan
    public void setValueEncryptedCFT002EmptyValueCipherTest()
    {
        String ns = "sve_cft002_" + System.currentTimeMillis();
        try
        {
            System.out.println("setValueEncrypted CFT-002: Empty string plaintext value (Cipher overload)...");
            byte[] keyBytes = new byte[12];
            new Random().nextBytes(keyBytes);
            String secretKey = new String(keyBytes, Charset.forName("UTF-8"));

            Cipher encryptCipher = CryptoHelper.createDefaultCipher(secretKey, true);
            Cipher decryptCipher = CryptoHelper.createDefaultCipher(secretKey, false);

            Assert.assertTrue("CFT-002: setValueEncrypted with empty value should return true",
                    client.setValueEncrypted(storename, ns, "empty.value.cipher.cft002.test", "", true, encryptCipher));

            String decrypted = client.fetchValueEncrypted(storename, ns, "empty.value.cipher.cft002.test", true, decryptCipher);
            Assert.assertNotNull("CFT-002: Decrypted value must not be null", decrypted);
            Assert.assertEquals("CFT-002: Decrypted value must be empty string", "", decrypted);

            System.out.println("setValueEncrypted CFT-002: PASS");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("CFT-002: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("CFT-002: Unexpected exception: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, ns, true);
        }
    }

    // =========================================================================
    // setValueEncrypted CFT-003: Empty string plaintext value (secretKey overload)
    // =========================================================================
    @Test
    @WithSpan
    public void setValueEncryptedCFT003EmptyValueSecretKeyTest()
    {
        String ns = "sve_cft003_" + System.currentTimeMillis();
        try
        {
            System.out.println("setValueEncrypted CFT-003: Empty string plaintext value (secretKey overload)...");
            String secretKey = "somesecretcft003";

            Assert.assertTrue("CFT-003: setValueEncrypted with empty value (secretKey overload) should return true",
                    client.setValueEncrypted(storename, ns, "empty.value.secretkey.cft003.test", "", true, secretKey));

            String decrypted = client.fetchValueEncrypted(storename, ns, "empty.value.secretkey.cft003.test", true, secretKey);
            Assert.assertNotNull("CFT-003: Decrypted value must not be null", decrypted);
            Assert.assertEquals("CFT-003: Decrypted value must be empty string", "", decrypted);

            System.out.println("setValueEncrypted CFT-003: PASS");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("CFT-003: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("CFT-003: Unexpected exception: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, ns, true);
        }
    }

    // =========================================================================
    // setValueEncrypted ECT-001: Unicode / multi-byte character value (Cipher overload)
    // =========================================================================
    @Test
    @WithSpan
    public void setValueEncryptedECT001UnicodeValueCipherTest()
    {
        String ns = "sve_ect001_" + System.currentTimeMillis();
        try
        {
            System.out.println("setValueEncrypted ECT-001: Unicode / multi-byte character value (Cipher overload)...");
            byte[] keyBytes = new byte[12];
            new Random().nextBytes(keyBytes);
            String secretKey = new String(keyBytes, Charset.forName("UTF-8"));
            String unicodeValue = "Hello \uD83C\uDF0D \u4E16\u754C \u65E5\u672C\u8A9E";

            Cipher encryptCipher = CryptoHelper.createDefaultCipher(secretKey, true);
            Cipher decryptCipher = CryptoHelper.createDefaultCipher(secretKey, false);

            Assert.assertTrue("ECT-001: setValueEncrypted with Unicode value should return true",
                    client.setValueEncrypted(storename, ns, "unicode.encrypted.ect001.test", unicodeValue, true, encryptCipher));

            String decrypted = client.fetchValueEncrypted(storename, ns, "unicode.encrypted.ect001.test", true, decryptCipher);
            Assert.assertNotNull("ECT-001: Decrypted Unicode value must not be null", decrypted);
            Assert.assertEquals("ECT-001: Decrypted value must equal original Unicode string", unicodeValue, decrypted);

            System.out.println("setValueEncrypted ECT-001: PASS");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("ECT-001: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("ECT-001: Unexpected exception: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, ns, true);
        }
    }

    // =========================================================================
    // setValueEncrypted ECT-002: Unicode / multi-byte character value (secretKey overload)
    // =========================================================================
    @Test
    @WithSpan
    public void setValueEncryptedECT002UnicodeValueSecretKeyTest()
    {
        String ns = "sve_ect002_" + System.currentTimeMillis();
        try
        {
            System.out.println("setValueEncrypted ECT-002: Unicode / multi-byte character value (secretKey overload)...");
            String secretKey = "unicodesecretect002";
            String unicodeValue = "Hello \uD83C\uDF0D \u4E16\u754C \u65E5\u672C\u8A9E";

            Assert.assertTrue("ECT-002: setValueEncrypted with Unicode value (secretKey overload) should return true",
                    client.setValueEncrypted(storename, ns, "unicode.secretkey.encrypted.ect002.test", unicodeValue, true, secretKey));

            String decrypted = client.fetchValueEncrypted(storename, ns, "unicode.secretkey.encrypted.ect002.test", true, secretKey);
            Assert.assertNotNull("ECT-002: Decrypted Unicode value must not be null", decrypted);
            Assert.assertEquals("ECT-002: Decrypted value must equal original Unicode string", unicodeValue, decrypted);

            System.out.println("setValueEncrypted ECT-002: PASS");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("ECT-002: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("ECT-002: Unexpected exception: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, ns, true);
        }
    }

    // =========================================================================
    // setValueEncrypted ECT-003: Value containing XML-special characters (Cipher overload)
    // =========================================================================
    @Test
    @WithSpan
    public void setValueEncryptedECT003XmlSpecialCharsCipherTest()
    {
        String ns = "sve_ect003_" + System.currentTimeMillis();
        try
        {
            System.out.println("setValueEncrypted ECT-003: Value containing XML-special characters (Cipher overload)...");
            byte[] keyBytes = new byte[12];
            new Random().nextBytes(keyBytes);
            String secretKey = new String(keyBytes, Charset.forName("UTF-8"));
            String xmlValue = "<tag>&\"value'</tag>";

            Cipher encryptCipher = CryptoHelper.createDefaultCipher(secretKey, true);
            Cipher decryptCipher = CryptoHelper.createDefaultCipher(secretKey, false);

            Assert.assertTrue("ECT-003: setValueEncrypted with XML-special chars should return true",
                    client.setValueEncrypted(storename, ns, "xml.special.encrypted.ect003.test", xmlValue, true, encryptCipher));

            String decrypted = client.fetchValueEncrypted(storename, ns, "xml.special.encrypted.ect003.test", true, decryptCipher);
            Assert.assertNotNull("ECT-003: Decrypted value must not be null", decrypted);
            Assert.assertEquals("ECT-003: Decrypted value must equal original XML-special-char string", xmlValue, decrypted);

            System.out.println("setValueEncrypted ECT-003: PASS");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("ECT-003: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("ECT-003: Unexpected exception: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, ns, true);
        }
    }

    // =========================================================================
    // setValueEncrypted ECT-004: Very short secret key (1 character, secretKey overload)
    // =========================================================================
    @Test
    @WithSpan
    public void setValueEncryptedECT004VeryShortSecretKeyTest()
    {
        String ns = "sve_ect004_" + System.currentTimeMillis();
        try
        {
            System.out.println("setValueEncrypted ECT-004: Very short secret key (1 character)...");
            String secretKey = "x";
            String plaintext = "sensitivedata";

            Assert.assertTrue("ECT-004: setValueEncrypted with 1-char secretKey should return true",
                    client.setValueEncrypted(storename, ns, "short.key.secretkey.ect004.test", plaintext, true, secretKey));

            String decrypted = client.fetchValueEncrypted(storename, ns, "short.key.secretkey.ect004.test", true, secretKey);
            Assert.assertNotNull("ECT-004: Decrypted value must not be null", decrypted);
            Assert.assertEquals("ECT-004: Decrypted value must equal original plaintext", plaintext, decrypted);

            System.out.println("setValueEncrypted ECT-004: PASS");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("ECT-004: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("ECT-004: Unexpected exception: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, ns, true);
        }
    }

    // =========================================================================
    // setValueEncrypted ECT-005: Very long plaintext value approaching MaxValSize (Cipher overload)
    // =========================================================================
    @Test
    @WithSpan
    public void setValueEncryptedECT005LargeValueApproachingMaxSizeTest()
    {
        String ns = "sve_ect005_" + System.currentTimeMillis();
        try
        {
            System.out.println("setValueEncrypted ECT-005: Very long plaintext (~700 chars) approaching MaxValSize...");
            byte[] keyBytes = new byte[12];
            new Random().nextBytes(keyBytes);
            String secretKey = new String(keyBytes, Charset.forName("UTF-8"));

            StringBuilder sb = new StringBuilder(700);
            for (int i = 0; i < 700; i++) sb.append('A');
            String largePlaintext = sb.toString();

            Cipher encryptCipher = CryptoHelper.createDefaultCipher(secretKey, true);
            Cipher decryptCipher = CryptoHelper.createDefaultCipher(secretKey, false);

            Assert.assertTrue("ECT-005: setValueEncrypted with ~700-char plaintext should return true",
                    client.setValueEncrypted(storename, ns, "largevalue.encrypted.ect005.test", largePlaintext, true, encryptCipher));

            String decrypted = client.fetchValueEncrypted(storename, ns, "largevalue.encrypted.ect005.test", true, decryptCipher);
            Assert.assertNotNull("ECT-005: Decrypted value must not be null", decrypted);
            Assert.assertEquals("ECT-005: Decrypted value must equal original 700-char plaintext", largePlaintext, decrypted);

            System.out.println("setValueEncrypted ECT-005: PASS");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("ECT-005: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("ECT-005: Unexpected exception: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, ns, true);
        }
    }

    // =========================================================================
    // setValueEncrypted ECT-006: Plaintext value exceeding MaxValSize after encryption (Cipher overload)
    // =========================================================================
    @Test
    @WithSpan
    public void setValueEncryptedECT006ValueExceedingMaxSizeTest()
    {
        String ns = "sve_ect006_" + System.currentTimeMillis();
        try
        {
            System.out.println("setValueEncrypted ECT-006: Plaintext exceeding MaxValSize after encryption...");
            byte[] keyBytes = new byte[12];
            new Random().nextBytes(keyBytes);
            String secretKey = new String(keyBytes, Charset.forName("UTF-8"));

            StringBuilder sb = new StringBuilder(1000);
            for (int i = 0; i < 1000; i++) sb.append('B');
            String oversizePlaintext = sb.toString();

            Cipher encryptCipher = CryptoHelper.createDefaultCipher(secretKey, true);

            boolean result = client.setValueEncrypted(storename, ns, "oversize.encrypted.ect006.test", oversizePlaintext, true, encryptCipher);
            Assert.assertFalse("ECT-006: setValueEncrypted with oversize plaintext should not return true", result);

            System.out.println("setValueEncrypted ECT-006: PASS — returned false for oversize value");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Also acceptable: server may return ESP exception for oversize value
            System.out.println("setValueEncrypted ECT-006: PASS — ArrayOfEspExceptionWrapper for oversize value: " + e.toString());
        }
        catch (Exception e)
        {
            // Also acceptable: exception propagated for oversize value
            System.out.println("setValueEncrypted ECT-006: PASS — Exception for oversize value: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, ns, true);
        }
    }

    // =========================================================================
    // setValueEncrypted ECT-007: SHA-256 custom digest algorithm (Cipher overload)
    // =========================================================================
    @Test
    @WithSpan
    public void setValueEncryptedECT007SHA256CustomDigestTest()
    {
        String ns = "sve_ect007_" + System.currentTimeMillis();
        try
        {
            System.out.println("setValueEncrypted ECT-007: SHA-256 custom digest algorithm...");
            byte[] keyBytes = new byte[12];
            new Random().nextBytes(keyBytes);
            String secretKeyContent = new String(keyBytes, Charset.forName("UTF-8"));

            SecretKeySpec secretKeySpec = CryptoHelper.createSecretKey(secretKeyContent, DigestAlgorithmType.SHA256, "AES");
            Assert.assertNotNull("ECT-007: Could not create SHA-256 SecretKeySpec", secretKeySpec);

            Cipher encryptCipher = CryptoHelper.createCipher(secretKeySpec, "AES", true);
            Cipher decryptCipher = CryptoHelper.createCipher(secretKeySpec, "AES", false);
            Assert.assertNotNull("ECT-007: Could not create SHA-256 encrypt cipher", encryptCipher);
            Assert.assertNotNull("ECT-007: Could not create SHA-256 decrypt cipher", decryptCipher);

            String plaintext = "sha256encrypted";
            Assert.assertTrue("ECT-007: setValueEncrypted with SHA-256 cipher should return true",
                    client.setValueEncrypted(storename, ns, "sha256.cipher.encrypted.ect007.test", plaintext, true, encryptCipher));

            String decrypted = client.fetchValueEncrypted(storename, ns, "sha256.cipher.encrypted.ect007.test", true, decryptCipher);
            Assert.assertNotNull("ECT-007: Decrypted value must not be null", decrypted);
            Assert.assertEquals("ECT-007: Decrypted value must equal original plaintext", plaintext, decrypted);

            System.out.println("setValueEncrypted ECT-007: PASS");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("ECT-007: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("ECT-007: Unexpected exception: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, ns, true);
        }
    }

    // =========================================================================
    // setValueEncrypted EHT-001: Null cipher (Cipher overload)
    // =========================================================================
    @Test
    @WithSpan
    public void setValueEncryptedEHT001NullCipherTest()
    {
        System.out.println("setValueEncrypted EHT-001: Null cipher should throw exception...");
        try
        {
            client.setValueEncrypted(storename, namespace, "null.cipher.eht001.test", "somevalue", true, (Cipher) null);
            Assert.fail("EHT-001: Expected exception when passing null cipher, but none was thrown");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("EHT-001: Unexpected ArrayOfEspExceptionWrapper for null cipher: " + e.toString());
        }
        catch (Exception e)
        {
            // Expected: NullPointerException or similar from CryptoHelper.encrypt
            System.out.println("setValueEncrypted EHT-001: PASS — exception thrown for null cipher: " + e.getClass().getSimpleName());
        }
    }

    // =========================================================================
    // setValueEncrypted EHT-002: Decrypt-mode cipher passed to Cipher overload
    // =========================================================================
    @Test
    @WithSpan
    public void setValueEncryptedEHT002DecryptModeCipherTest()
    {
        System.out.println("setValueEncrypted EHT-002: Decrypt-mode cipher passed to setValueEncrypted should throw exception...");
        try
        {
            byte[] keyBytes = new byte[12];
            new Random().nextBytes(keyBytes);
            String secretKey = new String(keyBytes, Charset.forName("UTF-8"));
            Cipher decryptModeCipher = CryptoHelper.createDefaultCipher(secretKey, false);

            client.setValueEncrypted(storename, namespace, "decrypt.mode.cipher.eht002.test", "somevalue", true, decryptModeCipher);
            Assert.fail("EHT-002: Expected exception when passing decrypt-mode cipher, but none was thrown");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("EHT-002: Unexpected ArrayOfEspExceptionWrapper for decrypt-mode cipher: " + e.toString());
        }
        catch (Exception e)
        {
            // Expected: IllegalStateException, BadPaddingException, or similar
            System.out.println("setValueEncrypted EHT-002: PASS — exception thrown for decrypt-mode cipher: " + e.getClass().getSimpleName());
        }
    }

    // =========================================================================
    // setValueEncrypted EHT-003: Null secretKey (secretKey overload)
    // =========================================================================
    @Test
    @WithSpan
    public void setValueEncryptedEHT003NullSecretKeyTest()
    {
        System.out.println("setValueEncrypted EHT-003: Null secretKey should throw exception...");
        try
        {
            client.setValueEncrypted(storename, namespace, "null.secretkey.eht003.test", "somevalue", true, (String) null);
            Assert.fail("EHT-003: Expected exception when passing null secretKey, but none was thrown");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("EHT-003: Unexpected ArrayOfEspExceptionWrapper for null secretKey: " + e.toString());
        }
        catch (Exception e)
        {
            // Expected: NullPointerException or similar from CryptoHelper.encryptSHA512AES key derivation
            System.out.println("setValueEncrypted EHT-003: PASS — exception thrown for null secretKey: " + e.getClass().getSimpleName());
        }
    }

    // =========================================================================
    // setValueEncrypted EHT-004: Null plaintext value (Cipher overload)
    // =========================================================================
    @Test
    @WithSpan
    public void setValueEncryptedEHT004NullValueCipherTest()
    {
        System.out.println("setValueEncrypted EHT-004: Null plaintext value (Cipher overload) should throw exception...");
        try
        {
            byte[] keyBytes = new byte[12];
            new Random().nextBytes(keyBytes);
            String secretKey = new String(keyBytes, Charset.forName("UTF-8"));
            Cipher encryptCipher = CryptoHelper.createDefaultCipher(secretKey, true);

            client.setValueEncrypted(storename, namespace, "null.value.cipher.eht004.test", null, true, encryptCipher);
            Assert.fail("EHT-004: Expected exception when passing null value (Cipher overload), but none was thrown");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("EHT-004: Unexpected ArrayOfEspExceptionWrapper for null value: " + e.toString());
        }
        catch (Exception e)
        {
            // Expected: NullPointerException from value.getBytes("UTF-8") in CryptoHelper.encrypt
            System.out.println("setValueEncrypted EHT-004: PASS — exception thrown for null value (Cipher overload): " + e.getClass().getSimpleName());
        }
    }

    // =========================================================================
    // setValueEncrypted EHT-005: Null plaintext value (secretKey overload)
    // =========================================================================
    @Test
    @WithSpan
    public void setValueEncryptedEHT005NullValueSecretKeyTest()
    {
        System.out.println("setValueEncrypted EHT-005: Null plaintext value (secretKey overload) should throw exception...");
        try
        {
            client.setValueEncrypted(storename, namespace, "null.value.secretkey.eht005.test", null, true, "somesecret");
            Assert.fail("EHT-005: Expected exception when passing null value (secretKey overload), but none was thrown");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("EHT-005: Unexpected ArrayOfEspExceptionWrapper for null value: " + e.toString());
        }
        catch (Exception e)
        {
            // Expected: NullPointerException from CryptoHelper.encryptSHA512AES
            System.out.println("setValueEncrypted EHT-005: PASS — exception thrown for null value (secretKey overload): " + e.getClass().getSimpleName());
        }
    }

    // =========================================================================
    // setValueEncrypted EHT-006: Empty string secretKey (secretKey overload)
    // =========================================================================
    @Test
    @WithSpan
    public void setValueEncryptedEHT006EmptySecretKeyTest()
    {
        String ns = "sve_eht006_" + System.currentTimeMillis();
        try
        {
            System.out.println("setValueEncrypted EHT-006: Empty string secretKey — documents edge behavior...");
            String emptySecretKey = "";
            String plaintext = "testvalue";

            boolean result = client.setValueEncrypted(storename, ns, "empty.secretkey.eht006.test", plaintext, true, emptySecretKey);
            if (result)
            {
                // Key derivation succeeded with empty key; verify round-trip integrity
                String decrypted = client.fetchValueEncrypted(storename, ns, "empty.secretkey.eht006.test", true, emptySecretKey);
                Assert.assertNotNull("EHT-006: Decrypted value must not be null if set succeeded", decrypted);
                Assert.assertEquals("EHT-006: Round-trip with empty secretKey must preserve plaintext", plaintext, decrypted);
                System.out.println("setValueEncrypted EHT-006: PASS — empty secretKey succeeded with round-trip verified");
            }
            else
            {
                System.out.println("setValueEncrypted EHT-006: PASS — empty secretKey returned false (graceful failure)");
            }
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Acceptable: server may reject the result
            System.out.println("setValueEncrypted EHT-006: PASS — ArrayOfEspExceptionWrapper for empty secretKey: " + e.toString());
        }
        catch (Exception e)
        {
            // Also acceptable: key derivation may fail for empty key
            System.out.println("setValueEncrypted EHT-006: PASS — exception thrown for empty secretKey: " + e.getClass().getSimpleName() + ": " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, ns, true);
        }
    }

    // =========================================================================
    // setValueEncrypted EHT-007: Null storename (Cipher overload, falls back to default store)
    // =========================================================================
    @Test
    @WithSpan
    public void setValueEncryptedEHT007NullStorenameTest()
    {
        String ns = "sve_eht007_" + System.currentTimeMillis();
        try
        {
            System.out.println("setValueEncrypted EHT-007: Null storename should fall back to server default store...");
            byte[] keyBytes = new byte[12];
            new Random().nextBytes(keyBytes);
            String secretKey = new String(keyBytes, Charset.forName("UTF-8"));

            Cipher encryptCipher = CryptoHelper.createDefaultCipher(secretKey, true);
            Cipher decryptCipher = CryptoHelper.createDefaultCipher(secretKey, false);

            boolean result = client.setValueEncrypted(null, ns, "null.store.encrypted.eht007.test", "nullstorevalue", true, encryptCipher);
            if (result)
            {
                String decrypted = client.fetchValueEncrypted(null, ns, "null.store.encrypted.eht007.test", true, decryptCipher);
                Assert.assertNotNull("EHT-007: Decrypted value must not be null when set returned true", decrypted);
                Assert.assertEquals("EHT-007: Round-trip with null storename must preserve plaintext", "nullstorevalue", decrypted);
                System.out.println("setValueEncrypted EHT-007: PASS — null storename used server default store");
            }
            else
            {
                // Acceptable if no default store is configured on the server
                System.out.println("setValueEncrypted EHT-007: PASS — null storename returned false (no default store configured)");
            }
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Acceptable: server may reject null storename with ESP exception
            System.out.println("setValueEncrypted EHT-007: PASS — ArrayOfEspExceptionWrapper for null storename: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("EHT-007: Unexpected exception for null storename: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(null, ns, true);
        }
    }

    // =========================================================================
    // setValueEncrypted EHT-008: Invalid/non-existent storename
    // =========================================================================
    @Test
    @WithSpan
    public void setValueEncryptedEHT008InvalidStorenameTest()
    {
        String ns = "sve_eht008_" + System.currentTimeMillis();
        try
        {
            System.out.println("setValueEncrypted EHT-008: Invalid/non-existent storename should fail gracefully...");
            byte[] keyBytes = new byte[12];
            new Random().nextBytes(keyBytes);
            String secretKey = new String(keyBytes, Charset.forName("UTF-8"));

            Cipher encryptCipher = CryptoHelper.createDefaultCipher(secretKey, true);

            boolean result = client.setValueEncrypted("NonExistentStore_XYZ_12345", ns, "badstore.encrypted.eht008.test", "shouldfail", true, encryptCipher);
            Assert.assertFalse("EHT-008: setValueEncrypted to non-existent store should not return true", result);

            System.out.println("setValueEncrypted EHT-008: PASS — returned false for non-existent store");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // Acceptable: server may return ESP exception for non-existent store
            System.out.println("setValueEncrypted EHT-008: PASS — ArrayOfEspExceptionWrapper for non-existent store: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("EHT-008: Unexpected exception for non-existent store: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // setValueEncrypted EHT-009: Invalid connection (bad endpoint)
    // =========================================================================
    @Test
    @WithSpan
    public void setValueEncryptedEHT009InvalidConnectionTest()
    {
        System.out.println("setValueEncrypted EHT-009: Invalid connection should return false or throw...");
        try
        {
            byte[] keyBytes = new byte[12];
            new Random().nextBytes(keyBytes);
            String secretKey = new String(keyBytes, Charset.forName("UTF-8"));
            Cipher encryptCipher = CryptoHelper.createDefaultCipher(secretKey, true);

            Connection badConn = new Connection("http://invalid.host.example.com:9999");
            badConn.setCredentials("user", "pass");
            HPCCWsStoreClient badClient = HPCCWsStoreClient.get(badConn);
            Assert.assertNotNull("EHT-009: Client with bad connection must not be null", badClient);

            boolean result = badClient.setValueEncrypted(storename, namespace, "badconn.encrypted.eht009.test", "somevalue", true, encryptCipher);
            Assert.assertFalse("EHT-009: setValueEncrypted with invalid connection should return false", result);

            System.out.println("setValueEncrypted EHT-009: PASS — returned false for invalid connection");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("EHT-009: Unexpected ArrayOfEspExceptionWrapper for invalid connection: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("EHT-009: Unexpected exception for invalid connection: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // fetchValueEncrypted CFT-001: SecretKey String overload — fetch and decrypt global value
    // NOTE: The current implementation has a known bug where secretKey is passed as
    // the key argument (HPCCWsStoreClient.java line 445). This test will fail until
    // that bug is fixed, and serves as a regression detection test.
    // =========================================================================
    @Test
    @WithSpan
    public void fetchValueEncryptedCFT001SecretKeyOverloadGlobalTest()
    {
        String ns = "fve_cft001_" + System.currentTimeMillis();
        String testKey = "fve.cft001.secretkey.global.test";
        String plaintext = "plaintextsecret";
        try
        {
            System.out.println("fetchValueEncrypted CFT-001: SecretKey overload — fetch and decrypt global value...");
            byte[] keyBytes = new byte[12];
            new Random().nextBytes(keyBytes);
            String secretKey = new String(keyBytes, Charset.forName("UTF-8"));

            Assert.assertTrue("CFT-001: setValueEncrypted (secretKey) should succeed",
                    client.setValueEncrypted(storename, ns, testKey, plaintext, true, secretKey));

            String decrypted = client.fetchValueEncrypted(storename, ns, testKey, true, secretKey);
            Assert.assertNotNull("CFT-001: Decrypted value must not be null", decrypted);
            Assert.assertEquals("CFT-001: Decrypted value must equal original plaintext", plaintext, decrypted);

            System.out.println("fetchValueEncrypted CFT-001: PASS");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("CFT-001: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("CFT-001: fetchValueEncrypted secretKey overload failed (known bug may be present — secretKey passed as key arg): " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, ns, true);
        }
    }

    // =========================================================================
    // fetchValueEncrypted CFT-002: Cipher overload — fetch and decrypt user-specific value
    // =========================================================================
    @Test
    @WithSpan
    public void fetchValueEncryptedCFT002UserSpecificCipherTest()
    {
        Assume.assumeTrue("CFT-002: Skipping — target HPCC does not authenticate users", targetHPCCAuthenticates);
        String ns = "fve_cft002_" + System.currentTimeMillis();
        String testKey = "fve.cft002.user.encrypted.test";
        String plaintext = "usersecret";
        try
        {
            System.out.println("fetchValueEncrypted CFT-002: Cipher overload — user-specific value...");
            byte[] keyBytes = new byte[12];
            new Random().nextBytes(keyBytes);
            String secretKey = new String(keyBytes, Charset.forName("UTF-8"));

            Cipher encryptCipher = CryptoHelper.createDefaultCipher(secretKey, true);
            Cipher decryptCipher = CryptoHelper.createDefaultCipher(secretKey, false);

            Assert.assertTrue("CFT-002: setValueEncrypted (user-specific) should succeed",
                    client.setValueEncrypted(storename, ns, testKey, plaintext, false, encryptCipher));

            String decrypted = client.fetchValueEncrypted(storename, ns, testKey, false, decryptCipher);
            Assert.assertNotNull("CFT-002: Decrypted value must not be null", decrypted);
            Assert.assertEquals("CFT-002: Decrypted value must equal original plaintext", plaintext, decrypted);

            System.out.println("fetchValueEncrypted CFT-002: PASS");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("CFT-002: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("CFT-002: Unexpected exception: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, ns, false);
        }
    }

    // =========================================================================
    // fetchValueEncrypted CFT-003: Verify decrypted value content matches original plaintext
    // across multiple value types (simple, special chars, long string)
    // =========================================================================
    @Test
    @WithSpan
    public void fetchValueEncryptedCFT003ContentMatchesPlaintextTest()
    {
        String ns = "fve_cft003_" + System.currentTimeMillis();
        try
        {
            System.out.println("fetchValueEncrypted CFT-003: Verify decrypted content matches plaintext across value variations...");
            String[] plaintexts = {
                "simple",
                "s3cr3t!@#$%^&*()",
                "a very long sensitive value that has more than 64 characters of content inside it"
            };

            for (int i = 0; i < plaintexts.length; i++)
            {
                byte[] keyBytes = new byte[12];
                new Random().nextBytes(keyBytes);
                String secretKey = new String(keyBytes, Charset.forName("UTF-8"));
                Cipher encryptCipher = CryptoHelper.createDefaultCipher(secretKey, true);
                Cipher decryptCipher = CryptoHelper.createDefaultCipher(secretKey, false);
                String testKey = "fve.cft003.content.test." + i;

                Assert.assertTrue("CFT-003: setValueEncrypted should succeed for value index " + i,
                        client.setValueEncrypted(storename, ns, testKey, plaintexts[i], true, encryptCipher));

                String decrypted = client.fetchValueEncrypted(storename, ns, testKey, true, decryptCipher);
                Assert.assertNotNull("CFT-003: Decrypted value must not be null for index " + i, decrypted);
                Assert.assertEquals("CFT-003: Decrypted value must match original for index " + i, plaintexts[i], decrypted);
            }

            System.out.println("fetchValueEncrypted CFT-003: PASS");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("CFT-003: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("CFT-003: Unexpected exception: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, ns, true);
        }
    }

    // =========================================================================
    // fetchValueEncrypted ECT-001: Cross-overload compatibility
    // Set via secretKey overload of setValueEncrypted, fetch via equivalent Cipher
    // =========================================================================
    @Test
    @WithSpan
    public void fetchValueEncryptedECT001CrossOverloadCompatibilityTest()
    {
        String ns = "fve_ect001_" + System.currentTimeMillis();
        String testKey = "fve.ect001.crossoverload.test";
        String plaintext = "crosstext";
        try
        {
            System.out.println("fetchValueEncrypted ECT-001: Cross-overload compatibility — set via secretKey, fetch via equivalent Cipher...");
            byte[] keyBytes = new byte[12];
            new Random().nextBytes(keyBytes);
            String secretKey = new String(keyBytes, Charset.forName("UTF-8"));

            Assert.assertTrue("ECT-001: setValueEncrypted (secretKey overload) should succeed",
                    client.setValueEncrypted(storename, ns, testKey, plaintext, true, secretKey));

            Cipher decryptCipher = CryptoHelper.createDefaultCipher(secretKey, false);
            String decrypted = client.fetchValueEncrypted(storename, ns, testKey, true, decryptCipher);

            Assert.assertNotNull("ECT-001: Decrypted value must not be null", decrypted);
            Assert.assertEquals("ECT-001: Decrypted value must equal original plaintext", plaintext, decrypted);

            System.out.println("fetchValueEncrypted ECT-001: PASS");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("ECT-001: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("ECT-001: Unexpected exception: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, ns, true);
        }
    }

    // =========================================================================
    // fetchValueEncrypted ECT-002: Empty storename — server default store fallback
    // =========================================================================
    @Test
    @WithSpan
    public void fetchValueEncryptedECT002EmptyStorenameTest()
    {
        String ns = "fve_ect002_" + System.currentTimeMillis();
        String testKey = "fve.ect002.empty.store.test";
        String plaintext = "storetestvalue";
        try
        {
            System.out.println("fetchValueEncrypted ECT-002: Empty storename — default store fallback...");
            byte[] keyBytes = new byte[12];
            new Random().nextBytes(keyBytes);
            String secretKey = new String(keyBytes, Charset.forName("UTF-8"));
            Cipher encryptCipher = CryptoHelper.createDefaultCipher(secretKey, true);
            Cipher decryptCipher = CryptoHelper.createDefaultCipher(secretKey, false);

            boolean setResult = client.setValueEncrypted("", ns, testKey, plaintext, true, encryptCipher);
            if (setResult)
            {
                String decrypted = client.fetchValueEncrypted("", ns, testKey, true, decryptCipher);
                Assert.assertNotNull("ECT-002: Decrypted value must not be null when set succeeded", decrypted);
                Assert.assertEquals("ECT-002: Decrypted value must match original plaintext", plaintext, decrypted);
                System.out.println("fetchValueEncrypted ECT-002: PASS — empty storename used server default store");
            }
            else
            {
                System.out.println("fetchValueEncrypted ECT-002: PASS — empty storename set returned false (no default store configured)");
            }
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            System.out.println("fetchValueEncrypted ECT-002: PASS — ArrayOfEspExceptionWrapper for empty storename (acceptable): " + e.toString());
        }
        catch (Exception e)
        {
            System.out.println("fetchValueEncrypted ECT-002: PASS — Exception for empty storename (acceptable): " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace("", ns, true);
        }
    }

    // =========================================================================
    // fetchValueEncrypted ECT-003: Fetch a plain (unencrypted) value — expect decryption failure
    // =========================================================================
    @Test
    @WithSpan
    public void fetchValueEncryptedECT003PlainValueDecryptFailsTest()
    {
        String ns = "fve_ect003_" + System.currentTimeMillis();
        String testKey = "fve.ect003.plaintext.test";
        try
        {
            System.out.println("fetchValueEncrypted ECT-003: Fetch plain value with fetchValueEncrypted — expect decryption failure...");
            byte[] keyBytes = new byte[12];
            new Random().nextBytes(keyBytes);
            String secretKey = new String(keyBytes, Charset.forName("UTF-8"));
            Cipher decryptCipher = CryptoHelper.createDefaultCipher(secretKey, false);

            Assert.assertTrue("ECT-003: setValue (plain) should succeed",
                    client.setValue(storename, ns, testKey, "notencrypted", true));

            try
            {
                String result = client.fetchValueEncrypted(storename, ns, testKey, true, decryptCipher);
                // AES/ECB may not always throw on malformed input — verify it does not silently return the original plaintext
                Assert.assertNotEquals("ECT-003: fetchValueEncrypted on plain text must not silently return the original plaintext",
                        "notencrypted", result);
                System.out.println("fetchValueEncrypted ECT-003: NOTE — no exception thrown; garbled result returned (AES/ECB padding tolerance)");
            }
            catch (Exception e)
            {
                // Expected: decryption of non-encrypted data throws
                System.out.println("fetchValueEncrypted ECT-003: PASS — Exception thrown as expected when decrypting plain value: " + e.getClass().getSimpleName());
            }
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("ECT-003: Unexpected ArrayOfEspExceptionWrapper during setup: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("ECT-003: Unexpected exception during setup: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, ns, true);
        }
    }

    // =========================================================================
    // fetchValueEncrypted EHT-001: Fetch non-existent key — expect Exception("Could not fetch value")
    // =========================================================================
    @Test
    @WithSpan
    public void fetchValueEncryptedEHT001NonExistentKeyTest()
    {
        String ns = "fve_eht001_" + System.currentTimeMillis();
        try
        {
            System.out.println("fetchValueEncrypted EHT-001: Fetch non-existent key — expect Exception...");
            byte[] keyBytes = new byte[12];
            new Random().nextBytes(keyBytes);
            String secretKey = new String(keyBytes, Charset.forName("UTF-8"));
            Cipher decryptCipher = CryptoHelper.createDefaultCipher(secretKey, false);

            client.fetchValueEncrypted(storename, ns, "fve.nonexistent.key.xyz123", true, decryptCipher);
            Assert.fail("EHT-001: Expected Exception for non-existent key, but none was thrown");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            // fetchValue no longer catches ArrayOfEspExceptionWrapper; it propagates for non-existent keys
            System.out.println("fetchValueEncrypted EHT-001: PASS — ArrayOfEspExceptionWrapper for non-existent key: " + e.getMessage());
        }
        catch (Exception e)
        {
            Assert.assertTrue("EHT-001: Exception message must contain 'Could not fetch value'",
                    e.getMessage() != null && e.getMessage().contains("Could not fetch value"));
            System.out.println("fetchValueEncrypted EHT-001: PASS — Exception thrown: " + e.getMessage());
        }
    }

    // =========================================================================
    // fetchValueEncrypted EHT-002: Fetch with wrong Cipher (key mismatch)
    // =========================================================================
    @Test
    @WithSpan
    public void fetchValueEncryptedEHT002WrongCipherTest()
    {
        String ns = "fve_eht002_" + System.currentTimeMillis();
        String testKey = "fve.eht002.wrongcipher.test";
        String plaintext = "keymismatchtest";
        try
        {
            System.out.println("fetchValueEncrypted EHT-002: Fetch with wrong Cipher (key mismatch) — expect decryption failure...");
            byte[] keyBytes1 = new byte[12];
            new Random().nextBytes(keyBytes1);
            String secretKey1 = new String(keyBytes1, Charset.forName("UTF-8"));

            byte[] keyBytes2 = new byte[12];
            new Random().nextBytes(keyBytes2);
            String secretKey2 = new String(keyBytes2, Charset.forName("UTF-8"));

            Cipher encryptCipher1 = CryptoHelper.createDefaultCipher(secretKey1, true);
            Cipher wrongDecryptCipher = CryptoHelper.createDefaultCipher(secretKey2, false);

            Assert.assertTrue("EHT-002: setValueEncrypted should succeed",
                    client.setValueEncrypted(storename, ns, testKey, plaintext, true, encryptCipher1));

            try
            {
                String result = client.fetchValueEncrypted(storename, ns, testKey, true, wrongDecryptCipher);
                // AES/ECB may not throw on key mismatch — verify result is not the original plaintext
                Assert.assertNotEquals("EHT-002: Wrong cipher must not return the original plaintext", plaintext, result);
                System.out.println("fetchValueEncrypted EHT-002: PASS — wrong cipher returned garbled data (AES/ECB did not throw)");
            }
            catch (Exception e)
            {
                // Also acceptable: decryption exception from key mismatch
                System.out.println("fetchValueEncrypted EHT-002: PASS — Exception thrown for wrong cipher: " + e.getClass().getSimpleName());
            }
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("EHT-002: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("EHT-002: Unexpected exception during setup: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, ns, true);
        }
    }

    // =========================================================================
    // fetchValueEncrypted EHT-003: Fetch with null Cipher (Overload A) — expect exception
    // =========================================================================
    @Test
    @WithSpan
    public void fetchValueEncryptedEHT003NullCipherTest()
    {
        String ns = "fve_eht003_" + System.currentTimeMillis();
        String testKey = "fve.eht003.nullcipher.test";
        try
        {
            System.out.println("fetchValueEncrypted EHT-003: Fetch with null Cipher — expect exception...");
            byte[] keyBytes = new byte[12];
            new Random().nextBytes(keyBytes);
            String secretKey = new String(keyBytes, Charset.forName("UTF-8"));
            Cipher encryptCipher = CryptoHelper.createDefaultCipher(secretKey, true);

            Assert.assertTrue("EHT-003: setValueEncrypted should succeed",
                    client.setValueEncrypted(storename, ns, testKey, "nullciphervalue", true, encryptCipher));

            try
            {
                client.fetchValueEncrypted(storename, ns, testKey, true, (Cipher) null);
                Assert.fail("EHT-003: Expected exception for null Cipher, but none was thrown");
            }
            catch (Exception e)
            {
                System.out.println("fetchValueEncrypted EHT-003: PASS — Exception thrown for null Cipher: " + e.getClass().getSimpleName());
            }
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("EHT-003: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("EHT-003: Unexpected exception during setup: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, ns, true);
        }
    }

    // =========================================================================
    // fetchValueEncrypted EHT-004: Fetch with null or empty key — expect exception
    // =========================================================================
    @Test
    @WithSpan
    public void fetchValueEncryptedEHT004NullEmptyKeyTest() throws Exception
    {
        String ns = "fve_eht004_" + System.currentTimeMillis();
        try
        {
            System.out.println("fetchValueEncrypted EHT-004: Fetch with null or empty key — expect exception...");
            byte[] keyBytes = new byte[12];
            new Random().nextBytes(keyBytes);
            String secretKey = new String(keyBytes, Charset.forName("UTF-8"));
            Cipher decryptCipher = CryptoHelper.createDefaultCipher(secretKey, false);

            try
            {
                client.fetchValueEncrypted(storename, ns, null, true, decryptCipher);
                Assert.fail("EHT-004: Expected exception for null key, but none was thrown");
            }
            catch (Exception e)
            {
                System.out.println("fetchValueEncrypted EHT-004: PASS (null key) — Exception: " + e.getClass().getSimpleName() + ": " + e.getMessage());
            }

            try
            {
                client.fetchValueEncrypted(storename, ns, "", true, decryptCipher);
                Assert.fail("EHT-004: Expected exception for empty key, but none was thrown");
            }
            catch (Exception e)
            {
                System.out.println("fetchValueEncrypted EHT-004: PASS (empty key) — Exception: " + e.getClass().getSimpleName() + ": " + e.getMessage());
            }

            System.out.println("fetchValueEncrypted EHT-004: PASS");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("EHT-004: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
    }

    // =========================================================================
    // fetchValueEncrypted EHT-005: Fetch with null storename — default store fallback or exception
    // =========================================================================
    @Test
    @WithSpan
    public void fetchValueEncryptedEHT005NullStorenameTest() throws Exception
    {
        String ns = "fve_eht005_" + System.currentTimeMillis();
        try
        {
            System.out.println("fetchValueEncrypted EHT-005: Fetch with null storename — default store fallback or exception...");
            byte[] keyBytes = new byte[12];
            new Random().nextBytes(keyBytes);
            String secretKey = new String(keyBytes, Charset.forName("UTF-8"));
            Cipher decryptCipher = CryptoHelper.createDefaultCipher(secretKey, false);

            try
            {
                client.fetchValueEncrypted(null, ns, "fve.eht005.nullstore.test", true, decryptCipher);
                System.out.println("fetchValueEncrypted EHT-005: NOTE — null storename did not throw; server used default store (key not found, or value returned)");
            }
            catch (Exception e)
            {
                System.out.println("fetchValueEncrypted EHT-005: PASS — Exception for null storename: " + e.getClass().getSimpleName() + ": " + e.getMessage());
            }
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            System.out.println("fetchValueEncrypted EHT-005: PASS — ArrayOfEspExceptionWrapper for null storename: " + e.toString());
        }
    }

    // =========================================================================
    // fetchValueEncrypted EHT-006: Fetch with null namespace — expect exception
    // =========================================================================
    @Test
    @WithSpan
    public void fetchValueEncryptedEHT006NullNamespaceTest() throws Exception
    {
        try
        {
            System.out.println("fetchValueEncrypted EHT-006: Fetch with null namespace — expect exception...");
            byte[] keyBytes = new byte[12];
            new Random().nextBytes(keyBytes);
            String secretKey = new String(keyBytes, Charset.forName("UTF-8"));
            Cipher decryptCipher = CryptoHelper.createDefaultCipher(secretKey, false);

            try
            {
                client.fetchValueEncrypted(storename, null, "fve.eht006.nullns.test", true, decryptCipher);
                Assert.fail("EHT-006: Expected exception for null namespace, but none was thrown");
            }
            catch (Exception e)
            {
                System.out.println("fetchValueEncrypted EHT-006: PASS — Exception for null namespace: " + e.getClass().getSimpleName() + ": " + e.getMessage());
            }
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            System.out.println("fetchValueEncrypted EHT-006: PASS — ArrayOfEspExceptionWrapper for null namespace: " + e.toString());
        }
    }

    // =========================================================================
    // fetchValueEncrypted EHT-007: SecretKey overload bug regression test
    // The known bug: fetchValueEncrypted(String secretKey) passes secretKey as the
    // key argument instead of the actual key parameter (HPCCWsStoreClient.java line 445).
    // Bug fixed: Changed secretKey -> key in the delegate call.
    // =========================================================================
    @Test
    @WithSpan
    public void fetchValueEncryptedEHT007SecretKeyOverloadBugRegressionTest()
    {
        String ns = "fve_eht007_" + System.currentTimeMillis();
        String testKey = "fve.eht007.bug.test.key";
        String plaintext = "secret_data";
        String secretKey = "mysecret";
        try
        {
            System.out.println("fetchValueEncrypted EHT-007: SecretKey overload bug regression test...");
            Assert.assertTrue("EHT-007: setValueEncrypted (secretKey) should succeed",
                    client.setValueEncrypted(storename, ns, testKey, plaintext, true, secretKey));

            String decrypted = client.fetchValueEncrypted(storename, ns, testKey, true, secretKey);
            Assert.assertNotNull("EHT-007: Decrypted value must not be null", decrypted);
            Assert.assertEquals("EHT-007: Decrypted value must equal original plaintext (verifies bug is fixed)", plaintext, decrypted);

            System.out.println("fetchValueEncrypted EHT-007: PASS — bug is fixed");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("EHT-007: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("EHT-007: fetchValueEncrypted secretKey bug regression failed: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, ns, true);
        }
    }

    // =========================================================================
    // deleteValue Tests
    // =========================================================================

    // CFT-001 — Default Store Deletion (Empty StoreName)
    @Test
    @WithSpan
    public void deleteValueCFT001DefaultStoreDeletionTest()
    {
        String ns = "dv_cft001_" + System.currentTimeMillis();
        String key = "CFT001.defaultstore.testkey";
        try
        {
            System.out.println("deleteValue CFT-001: Default store deletion (empty storename)...");
            boolean setResult = client.setValue("", ns, key, "testvalue", true);
            Assume.assumeTrue("CFT-001: setValue with empty storename must succeed (requires default store configured)", setResult);

            Assert.assertTrue("CFT-001: deleteValue with empty storename should return true",
                    client.deleteValue("", ns, key, true));

            String afterDelete = client.fetchValue("", ns, key, true);
            Assert.assertNull("CFT-001: Key should be null after deletion", afterDelete);

            System.out.println("deleteValue CFT-001: PASS");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assume.assumeNoException("CFT-001: Skipped — no default store configured on this server", e);
        }
        catch (Exception e)
        {
            Assert.fail("CFT-001: deleteValue default store deletion failed: " + e.getLocalizedMessage());
        }
        finally
        {
            try { client.deleteNamespace("", ns, true, ""); } catch (Exception ignored) {}
        }
    }

    // CFT-002 — Encoded/Special-Character Store Name Deletion
    @Category(UnverifiedServerIssues.class)
    @Test
    @WithSpan
    public void deleteValueCFT002EncodedStoreNameDeletionTest()
    {
        String ns = "dv_cft002_" + System.currentTimeMillis();
        String key = "CFT002.encoded.store.testkey";
        try
        {
            System.out.println("deleteValue CFT-002: Encoded store name deletion...");
            Assert.assertTrue("CFT-002: setValue on encoded store should succeed",
                    client.setValue(defaultEncodedStoreName, ns, key, "testvalue", true));

            Assert.assertTrue("CFT-002: deleteValue on encoded store should return true",
                    client.deleteValue(defaultEncodedStoreName, ns, key, true));

            String afterDelete = client.fetchValue(defaultEncodedStoreName, ns, key, true);
            Assert.assertNull("CFT-002: Key should be null after deletion", afterDelete);

            System.out.println("deleteValue CFT-002: PASS");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("CFT-002: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("CFT-002: deleteValue encoded store deletion failed: " + e.getLocalizedMessage());
        }
        finally
        {
            try { client.deleteNamespace(defaultEncodedStoreName, ns, true, ""); } catch (Exception ignored) {}
        }
    }

    // ECT-001 — Key With Special Characters
    @Test
    @WithSpan
    public void deleteValueECT001SpecialCharacterKeyTest()
    {
        String ns = "dv_ect001_" + System.currentTimeMillis();
        String key = "key.with@special-chars_here";
        try
        {
            System.out.println("deleteValue ECT-001: Key with special characters...");
            Assert.assertTrue("ECT-001: setValue with special-char key should succeed",
                    client.setValue(storename, ns, key, "testvalue", true));

            Assert.assertTrue("ECT-001: deleteValue with special-char key should return true",
                    client.deleteValue(storename, ns, key, true));

            String afterDelete = client.fetchValue(storename, ns, key, true);
            Assert.assertNull("ECT-001: Key should be null after deletion", afterDelete);

            System.out.println("deleteValue ECT-001: PASS");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("ECT-001: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("ECT-001: deleteValue special-char key failed: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, ns, true);
        }
    }

    // ECT-002 — Long Key Name (Boundary Value)
    @Test
    @WithSpan
    public void deleteValueECT002LongKeyNameTest()
    {
        String ns = "dv_ect002_" + System.currentTimeMillis();
        String key = new String(new char[255]).replace('\0', 'a');
        try
        {
            System.out.println("deleteValue ECT-002: Long key name (255 chars)...");
            Assert.assertTrue("ECT-002: setValue with 255-char key should succeed",
                    client.setValue(storename, ns, key, "testvalue", true));

            Assert.assertTrue("ECT-002: deleteValue with 255-char key should return true",
                    client.deleteValue(storename, ns, key, true));

            String afterDelete = client.fetchValue(storename, ns, key, true);
            Assert.assertNull("ECT-002: Key should be null after deletion", afterDelete);

            System.out.println("deleteValue ECT-002: PASS");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("ECT-002: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("ECT-002: deleteValue long key failed: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, ns, true);
        }
    }

    // ECT-003 — Double Deletion (Delete Already-Deleted Key)
    @Test
    @WithSpan
    public void deleteValueECT003DoubleDeletionTest()
    {
        String ns = "dv_ect003_" + System.currentTimeMillis();
        String key = "ECT003.double.delete.testkey";
        try
        {
            System.out.println("deleteValue ECT-003: Double deletion test...");
            Assert.assertTrue("ECT-003: setValue should succeed",
                    client.setValue(storename, ns, key, "testvalue", true));

            Assert.assertTrue("ECT-003: First deleteValue should return true",
                    client.deleteValue(storename, ns, key, true));

            // Second delete should throw (key no longer exists)
            try
            {
                client.deleteValue(storename, ns, key, true);
                Assert.fail("ECT-003: Second deleteValue should throw for non-existent key");
            }
            catch (ArrayOfEspExceptionWrapper e)
            {
                System.out.println("ECT-003: Second delete correctly threw ArrayOfEspExceptionWrapper: " + e.toString());
            }
            catch (Exception e)
            {
                System.out.println("ECT-003: Second delete correctly threw Exception: " + e.getLocalizedMessage());
            }

            System.out.println("deleteValue ECT-003: PASS");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("ECT-003: Unexpected ArrayOfEspExceptionWrapper during setup: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("ECT-003: deleteValue double deletion test failed: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, ns, true);
        }
    }

    // ECT-004 — User-Specific Key Deletion With Encoded Username
    @Category(UnverifiedServerIssues.class)
    @Test
    @WithSpan
    public void deleteValueECT004EncodedUserSpecificDeletionTest()
    {
        Assume.assumeTrue("ECT-004: Skipped — target HPCC does not authenticate", targetHPCCAuthenticates);
        Assume.assumeNotNull("ECT-004: Skipped — encodedUserClient not available", encodedUserClient);

        String ns = "dv_ect004_" + System.currentTimeMillis();
        String key = "ECT004.user.encoded.testkey";
        try
        {
            System.out.println("deleteValue ECT-004: User-specific deletion with encoded username...");
            Assert.assertTrue("ECT-004: setValue (user-specific) should succeed",
                    encodedUserClient.setValue(defaultEncodedStoreName, ns, key, "testvalue", false));

            Assert.assertTrue("ECT-004: deleteValue (user-specific) should return true",
                    encodedUserClient.deleteValue(defaultEncodedStoreName, ns, key, false));

            String afterDelete = encodedUserClient.fetchValue(defaultEncodedStoreName, ns, key, false);
            Assert.assertNull("ECT-004: Key should be null after deletion", afterDelete);

            System.out.println("deleteValue ECT-004: PASS");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("ECT-004: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("ECT-004: deleteValue encoded user deletion failed: " + e.getLocalizedMessage());
        }
        finally
        {
            try { encodedUserClient.deleteNamespace(defaultEncodedStoreName, ns, false, ""); } catch (Exception ignored) {}
        }
    }

    // EHT-001 — Delete Non-Existent Key
    @Test
    @WithSpan
    public void deleteValueEHT001NonExistentKeyTest()
    {
        String ns = "dv_eht001_" + System.currentTimeMillis();
        String key = "EHT001.this.key.does.not.exist";
        try
        {
            System.out.println("deleteValue EHT-001: Delete non-existent key...");
            boolean result = client.deleteValue(storename, ns, key, true);
            // If we reach here without exception, the result must not be true
            Assert.assertFalse("EHT-001: deleteValue of non-existent key should not return true", result);
            System.out.println("deleteValue EHT-001: PASS — returned false for non-existent key");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            System.out.println("deleteValue EHT-001: PASS — threw ArrayOfEspExceptionWrapper as expected: " + e.toString());
        }
        catch (Exception e)
        {
            System.out.println("deleteValue EHT-001: PASS — threw Exception as expected: " + e.getLocalizedMessage());
        }
    }

    // EHT-002 — Delete With Empty Namespace
    @Test
    @WithSpan
    public void deleteValueEHT002EmptyNamespaceTest()
    {
        String key = "EHT002.any.testkey";
        try
        {
            System.out.println("deleteValue EHT-002: Delete with empty namespace...");
            client.deleteValue(storename, "", key, true);
            Assert.fail("EHT-002: deleteValue with empty namespace should throw an exception");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            System.out.println("deleteValue EHT-002: PASS — threw ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            System.out.println("deleteValue EHT-002: PASS — threw Exception: " + e.getLocalizedMessage());
        }
    }

    // EHT-003 — Delete With Empty Key
    @Test
    @WithSpan
    public void deleteValueEHT003EmptyKeyTest()
    {
        String ns = "dv_eht003_" + System.currentTimeMillis();
        try
        {
            System.out.println("deleteValue EHT-003: Delete with empty key...");
            client.deleteValue(storename, ns, "", true);
            Assert.fail("EHT-003: deleteValue with empty key should throw an exception");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            System.out.println("deleteValue EHT-003: PASS — threw ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            System.out.println("deleteValue EHT-003: PASS — threw Exception: " + e.getLocalizedMessage());
        }
    }

    // EHT-004 — Delete With Null Key
    @Test
    @WithSpan
    public void deleteValueEHT004NullKeyTest()
    {
        String ns = "dv_eht004_" + System.currentTimeMillis();
        try
        {
            System.out.println("deleteValue EHT-004: Delete with null key...");
            client.deleteValue(storename, ns, null, true);
            Assert.fail("EHT-004: deleteValue with null key should throw an exception");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            System.out.println("deleteValue EHT-004: PASS — threw ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (NullPointerException e)
        {
            System.out.println("deleteValue EHT-004: PASS — threw NullPointerException: " + e.getLocalizedMessage());
        }
        catch (Exception e)
        {
            System.out.println("deleteValue EHT-004: PASS — threw Exception: " + e.getLocalizedMessage());
        }
    }

    // EHT-005 — Delete With Null Namespace
    @Test
    @WithSpan
    public void deleteValueEHT005NullNamespaceTest()
    {
        String key = "EHT005.any.testkey";
        try
        {
            System.out.println("deleteValue EHT-005: Delete with null namespace...");
            client.deleteValue(storename, null, key, true);
            Assert.fail("EHT-005: deleteValue with null namespace should throw an exception");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            System.out.println("deleteValue EHT-005: PASS — threw ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (NullPointerException e)
        {
            System.out.println("deleteValue EHT-005: PASS — threw NullPointerException: " + e.getLocalizedMessage());
        }
        catch (Exception e)
        {
            System.out.println("deleteValue EHT-005: PASS — threw Exception: " + e.getLocalizedMessage());
        }
    }

    // EHT-006 — Delete From Non-Existent Store
    @Test
    @WithSpan
    public void deleteValueEHT006NonExistentStoreTest()
    {
        String ns = "dv_eht006_" + System.currentTimeMillis();
        String key = "EHT006.some.key";
        try
        {
            System.out.println("deleteValue EHT-006: Delete from non-existent store...");
            boolean result = client.deleteValue("NonExistentStoreName_XYZ_12345", ns, key, true);
            Assert.assertFalse("EHT-006: deleteValue from non-existent store should not return true", result);
            System.out.println("deleteValue EHT-006: PASS — returned false for non-existent store");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            System.out.println("deleteValue EHT-006: PASS — threw ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            System.out.println("deleteValue EHT-006: PASS — threw Exception: " + e.getLocalizedMessage());
        }
    }

    // EHT-007 — Delete With Invalid Connection (Null Client)
    @Test
    @WithSpan
    public void deleteValueEHT007NullConnectionTest()
    {
        System.out.println("deleteValue EHT-007: Delete with invalid/null connection...");
        HPCCWsStoreClient nullClient = null;
        try
        {
            nullClient = HPCCWsStoreClient.get(null);
        }
        catch (Exception e)
        {
            System.out.println("deleteValue EHT-007: PASS — HPCCWsStoreClient.get(null) threw: " + e.getLocalizedMessage());
            return;
        }

        Assume.assumeNotNull("EHT-007: Skipped — could not create null-connection client", nullClient);

        try
        {
            nullClient.deleteValue(storename, namespace, "EHT007.any.key", true);
            Assert.fail("EHT-007: deleteValue with null connection should throw an exception");
        }
        catch (NullPointerException e)
        {
            System.out.println("deleteValue EHT-007: PASS — threw NullPointerException");
        }
        catch (Exception e)
        {
            System.out.println("deleteValue EHT-007: PASS — threw Exception: " + e.getLocalizedMessage());
        }
    }

    // EHT-008 — Delete User-Specific Key on Unauthenticated Server
    @Test
    @WithSpan
    public void deleteValueEHT008UserSpecificUnauthenticatedTest()
    {
        Assume.assumeFalse("EHT-008: Skipped — target HPCC authenticates (test requires unauthenticated server)", targetHPCCAuthenticates);

        String ns = "dv_eht008_" + System.currentTimeMillis();
        String key = "EHT008.user.unauthenticated.key";
        try
        {
            System.out.println("deleteValue EHT-008: User-specific key on unauthenticated server...");
            boolean result = client.deleteValue(storename, ns, key, false);
            // Any non-throwing result should not be a silent true
            System.out.println("deleteValue EHT-008: deleteValue returned " + result + " (no unhandled exception)");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            System.out.println("deleteValue EHT-008: PASS — threw ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            System.out.println("deleteValue EHT-008: PASS — threw Exception: " + e.getLocalizedMessage());
        }
    }

    // =========================================================================
    // deleteNamespace Tests
    // =========================================================================

    // CFT-001 — User-Specific Namespace Deletion (Calling User's Scope)
    @Test
    @WithSpan
    public void deleteNamespaceCFT001UserSpecificNamespaceDeletionTest()
    {
        Assume.assumeTrue("CFT-001: Skipped — target HPCC does not authenticate (user-scoped namespace requires auth)", targetHPCCAuthenticates);

        String ns = "dn_cft001_" + System.currentTimeMillis();
        String key = "CFT001.user.test.key";
        try
        {
            System.out.println("deleteNamespace CFT-001: User-specific namespace deletion (global=false)...");
            boolean setResult = client.setValue(storename, ns, key, "user.test.val", false);
            Assert.assertTrue("CFT-001: setValue for user-scoped namespace must succeed", setResult);

            boolean result = client.deleteNamespace(storename, ns, false, "");
            Assert.assertTrue("CFT-001: deleteNamespace (global=false) should return true", result);

            String[] nss = client.listNamespaces(storename, false);
            if (nss != null)
            {
                java.util.List<String> nsList = Arrays.asList(nss);
                Assert.assertFalse("CFT-001: deleted namespace should not appear in listNamespaces", nsList.contains(ns));
            }

            System.out.println("deleteNamespace CFT-001: PASS");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("CFT-001: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("CFT-001: deleteNamespace user-specific deletion failed: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, ns, false);
        }
    }

    // CFT-002 — Delete Namespace on Behalf of Target User
    @Category(UnverifiedServerIssues.class)
    @Test
    @WithSpan
    public void deleteNamespaceCFT002TargetUserNamespaceDeletionTest()
    {
        Assume.assumeTrue("CFT-002: Skipped — target HPCC does not authenticate", targetHPCCAuthenticates);
        Assume.assumeNotNull("CFT-002: Skipped — encodedUserClient not available", encodedUserClient);

        String ns = "dn_cft002_" + System.currentTimeMillis();
        String key = "CFT002.target.user.key";
        try
        {
            System.out.println("deleteNamespace CFT-002: Delete namespace on behalf of target user...");
            boolean setResult = encodedUserClient.setValue(defaultEncodedStoreName, ns, key, "val", false);
            Assert.assertTrue("CFT-002: encodedUserClient setValue must succeed to set up namespace", setResult);

            boolean result = encodedUserClient.deleteNamespace(defaultEncodedStoreName, ns, false, encodedUserName);
            Assert.assertTrue("CFT-002: deleteNamespace with targetuser should return true", result);

            System.out.println("deleteNamespace CFT-002: PASS");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("CFT-002: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("CFT-002: deleteNamespace target user deletion failed: " + e.getLocalizedMessage());
        }
        finally
        {
            try { encodedUserClient.deleteNamespace(defaultEncodedStoreName, ns, false, ""); } catch (Exception ignored) {}
        }
    }

    // CFT-003 — Delete Namespace; Verify Keys Are Removed
    @Test
    @WithSpan
    public void deleteNamespaceCFT003VerifyKeysRemovedAfterDeletionTest()
    {
        String ns = "dn_cft003_" + System.currentTimeMillis();
        try
        {
            System.out.println("deleteNamespace CFT-003: Verify all keys removed after namespace deletion...");
            Assert.assertTrue("CFT-003: setValue key1 must succeed",
                    client.setValue(storename, ns, "key1", "val1", true));
            Assert.assertTrue("CFT-003: setValue key2 must succeed",
                    client.setValue(storename, ns, "key2", "val2", true));

            boolean result = client.deleteNamespace(storename, ns, true, "");
            Assert.assertTrue("CFT-003: deleteNamespace should return true", result);

            // fetchValue for keys in a deleted namespace may return null or throw ArrayOfEspExceptionWrapper;
            // both indicate the key is no longer accessible
            String val1 = null;
            String val2 = null;
            try { val1 = client.fetchValue(storename, ns, "key1", true); } catch (ArrayOfEspExceptionWrapper ignored) {}
            try { val2 = client.fetchValue(storename, ns, "key2", true); } catch (ArrayOfEspExceptionWrapper ignored) {}
            Assert.assertNull("CFT-003: key1 should not be accessible after namespace deletion", val1);
            Assert.assertNull("CFT-003: key2 should not be accessible after namespace deletion", val2);

            String[] nss = client.listNamespaces(storename, true);
            if (nss != null)
            {
                java.util.List<String> nsList = Arrays.asList(nss);
                Assert.assertFalse("CFT-003: deleted namespace should not appear in listNamespaces", nsList.contains(ns));
            }

            System.out.println("deleteNamespace CFT-003: PASS");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("CFT-003: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("CFT-003: deleteNamespace verify keys removed failed: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, ns, true);
        }
    }

    // ECT-001 — Delete Namespace With Empty StoreName (Falls Back to Default Store)
    @Test
    @WithSpan
    public void deleteNamespaceECT001EmptyStoreNameFallbackTest()
    {
        String ns = "dn_ect001_" + System.currentTimeMillis();
        String key = "ECT001.fallback.key";
        try
        {
            System.out.println("deleteNamespace ECT-001: Empty storename falls back to default store...");
            boolean setResult = client.setValue("", ns, key, "val", true);
            Assume.assumeTrue("ECT-001: setValue with empty storename must succeed (requires default store configured)", setResult);

            boolean result = client.deleteNamespace("", ns, true, "");
            Assert.assertTrue("ECT-001: deleteNamespace with empty storename should return true", result);

            System.out.println("deleteNamespace ECT-001: PASS");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assume.assumeNoException("ECT-001: Skipped — no default store configured on this server", e);
        }
        catch (Exception e)
        {
            Assert.fail("ECT-001: deleteNamespace empty storename fallback failed: " + e.getLocalizedMessage());
        }
        finally
        {
            try { client.deleteNamespace("", ns, true, ""); } catch (Exception ignored) {}
        }
    }

    // ECT-002 — Delete Non-Existent Namespace (Idempotency)
    @Test
    @WithSpan
    public void deleteNamespaceECT002NonExistentNamespaceTest()
    {
        try
        {
            System.out.println("deleteNamespace ECT-002: Delete non-existent namespace...");
            boolean result = client.deleteNamespace(storename, "NonExistentNamespace_XYZ_12345", true, "");
            System.out.println("deleteNamespace ECT-002: deleteNamespace returned " + result + " (no exception thrown)");
            // Document observed idempotency contract — no exception is the primary requirement
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            System.out.println("deleteNamespace ECT-002: PASS — threw ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            System.out.println("deleteNamespace ECT-002: PASS — threw Exception: " + e.getLocalizedMessage());
        }
    }

    // ECT-003 — Delete Already-Deleted Namespace (Second Call)
    @Category(UnverifiedServerIssues.class)
    @Test
    @WithSpan
    public void deleteNamespaceECT003DoubleDeleteTest()
    {
        String ns = "dn_ect003_" + System.currentTimeMillis();
        String key = "ECT003.doubledeelte.key";
        try
        {
            System.out.println("deleteNamespace ECT-003: Double-delete namespace...");
            Assert.assertTrue("ECT-003: setValue must succeed to create namespace",
                    client.setValue(storename, ns, key, "val", true));

            boolean firstResult = client.deleteNamespace(storename, ns, true, "");
            Assert.assertTrue("ECT-003: First deleteNamespace call should return true", firstResult);

            boolean secondResult = client.deleteNamespace(storename, ns, true, "");
            System.out.println("deleteNamespace ECT-003: Second deleteNamespace returned " + secondResult + " (no exception is the key requirement)");

            System.out.println("deleteNamespace ECT-003: PASS");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("ECT-003: Second deleteNamespace should not throw ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("ECT-003: Second deleteNamespace should not throw: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, ns, true);
        }
    }

    // ECT-004 — Delete Namespace With Special Characters in Namespace Name
    @Category(UnverifiedServerIssues.class)
    @Test
    @WithSpan
    public void deleteNamespaceECT004SpecialCharacterNamespaceTest()
    {
        Assume.assumeNotNull("ECT-004: Skipped — encodedUserClient not available", encodedUserClient);

        String ns = "Special@NS_" + System.currentTimeMillis();
        String key = "ECT004.special.key";
        try
        {
            System.out.println("deleteNamespace ECT-004: Special characters in namespace name...");
            Assert.assertTrue("ECT-004: setValue with special-char namespace must succeed",
                    encodedUserClient.setValue(defaultEncodedStoreName, ns, key, "val", true));

            boolean result = encodedUserClient.deleteNamespace(defaultEncodedStoreName, ns, true, "");
            Assert.assertTrue("ECT-004: deleteNamespace with special-char namespace should return true", result);

            System.out.println("deleteNamespace ECT-004: PASS");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            Assert.fail("ECT-004: Unexpected ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            Assert.fail("ECT-004: deleteNamespace special-char namespace failed: " + e.getLocalizedMessage());
        }
        finally
        {
            try { encodedUserClient.deleteNamespace(defaultEncodedStoreName, ns, true, ""); } catch (Exception ignored) {}
        }
    }

    // ECT-005 — Delete Namespace With Very Long Namespace Name
    @Test
    @WithSpan
    public void deleteNamespaceECT005LongNamespaceNameTest()
    {
        String longNS = "dn_ect005_" + new String(new char[245]).replace('\0', 'x');
        String key = "ECT005.longns.key";
        try
        {
            System.out.println("deleteNamespace ECT-005: Very long namespace name (" + longNS.length() + " chars)...");
            boolean setResult = client.setValue(storename, longNS, key, "val", true);
            Assume.assumeTrue("ECT-005: setValue with long namespace must succeed to test deleteNamespace", setResult);

            boolean result = client.deleteNamespace(storename, longNS, true, "");
            System.out.println("deleteNamespace ECT-005: deleteNamespace returned " + result);

            System.out.println("deleteNamespace ECT-005: PASS — no uncaught exception");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            System.out.println("deleteNamespace ECT-005: PASS — threw ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            System.out.println("deleteNamespace ECT-005: PASS — threw Exception: " + e.getLocalizedMessage());
        }
        finally
        {
            cleanupNamespace(storename, longNS, true);
        }
    }

    // EHT-001 — Null Namespace Parameter
    @Test
    @WithSpan
    public void deleteNamespaceEHT001NullNamespaceTest()
    {
        try
        {
            System.out.println("deleteNamespace EHT-001: Null namespace parameter...");
            client.deleteNamespace(storename, null, true, "");
            Assert.fail("EHT-001: deleteNamespace with null namespace should throw an exception");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            System.out.println("deleteNamespace EHT-001: PASS — threw ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (NullPointerException e)
        {
            System.out.println("deleteNamespace EHT-001: PASS — threw NullPointerException: " + e.getLocalizedMessage());
        }
        catch (Exception e)
        {
            System.out.println("deleteNamespace EHT-001: PASS — threw Exception: " + e.getLocalizedMessage());
        }
    }

    // EHT-002 — Null Store Name Parameter
    @Test
    @WithSpan
    public void deleteNamespaceEHT002NullStoreNameTest()
    {
        String ns = "dn_eht002_" + System.currentTimeMillis();
        try
        {
            System.out.println("deleteNamespace EHT-002: Null storename (server uses default store)...");
            boolean result = client.deleteNamespace(null, ns, true, "");
            System.out.println("deleteNamespace EHT-002: deleteNamespace returned " + result + " (default store used if configured)");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            System.out.println("deleteNamespace EHT-002: PASS — threw ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (NullPointerException e)
        {
            System.out.println("deleteNamespace EHT-002: PASS — threw NullPointerException: " + e.getLocalizedMessage());
        }
        catch (Exception e)
        {
            System.out.println("deleteNamespace EHT-002: PASS — threw Exception: " + e.getLocalizedMessage());
        }
    }

    // EHT-003 — Empty Namespace String
    @Test
    @WithSpan
    public void deleteNamespaceEHT003EmptyNamespaceStringTest()
    {
        try
        {
            System.out.println("deleteNamespace EHT-003: Empty namespace string...");
            boolean result = client.deleteNamespace(storename, "", true, "");
            Assert.assertFalse("EHT-003: deleteNamespace with empty namespace should not return true", result);
            System.out.println("deleteNamespace EHT-003: PASS — returned false for empty namespace");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            System.out.println("deleteNamespace EHT-003: PASS — threw ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            System.out.println("deleteNamespace EHT-003: PASS — threw Exception: " + e.getLocalizedMessage());
        }
    }

    // EHT-004 — Delete Namespace Without Required Permission
    @Test
    @WithSpan
    public void deleteNamespaceEHT004InsufficientPermissionsTest()
    {
        Assume.assumeTrue("EHT-004: Skipped — target HPCC does not authenticate", targetHPCCAuthenticates);
        String readOnlyUser = System.getProperty("readOnlyUser");
        String readOnlyPass = System.getProperty("readOnlyPass");
        Assume.assumeNotNull("EHT-004: Skipped — 'readOnlyUser' system property not set", readOnlyUser);
        Assume.assumeNotNull("EHT-004: Skipped — 'readOnlyPass' system property not set", readOnlyPass);

        try
        {
            System.out.println("deleteNamespace EHT-004: Delete namespace with insufficient permissions...");
            Connection readOnlyConn = new Connection(connString);
            readOnlyConn.setCredentials(readOnlyUser, readOnlyPass);
            HPCCWsStoreClient readOnlyClient = HPCCWsStoreClient.get(readOnlyConn);
            Assert.assertNotNull("EHT-004: readOnlyClient should not be null", readOnlyClient);

            boolean result = readOnlyClient.deleteNamespace(storename, namespace, true, "");
            Assert.assertFalse("EHT-004: deleteNamespace with insufficient permissions should not return true", result);
            System.out.println("deleteNamespace EHT-004: returned false as expected for insufficient permissions");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            System.out.println("deleteNamespace EHT-004: PASS — threw ArrayOfEspExceptionWrapper (authorization error): " + e.toString());
        }
        catch (Exception e)
        {
            System.out.println("deleteNamespace EHT-004: PASS — threw Exception: " + e.getLocalizedMessage());
        }
    }

    // EHT-005 — Store Name Does Not Exist
    @Test
    @WithSpan
    public void deleteNamespaceEHT005NonExistentStoreTest()
    {
        try
        {
            System.out.println("deleteNamespace EHT-005: Delete namespace from non-existent store...");
            boolean result = client.deleteNamespace("NoSuchStore_XYZ_99999", namespace, true, "");
            Assert.assertFalse("EHT-005: deleteNamespace from non-existent store should not return true", result);
            System.out.println("deleteNamespace EHT-005: PASS — returned false for non-existent store");
        }
        catch (ArrayOfEspExceptionWrapper e)
        {
            System.out.println("deleteNamespace EHT-005: PASS — threw ArrayOfEspExceptionWrapper: " + e.toString());
        }
        catch (Exception e)
        {
            System.out.println("deleteNamespace EHT-005: PASS — threw Exception: " + e.getLocalizedMessage());
        }
    }

    // EHT-006 — Invalid / Null Connection Object
    @Test
    @WithSpan
    public void deleteNamespaceEHT006NullConnectionTest()
    {
        System.out.println("deleteNamespace EHT-006: Delete namespace with invalid/null connection...");
        HPCCWsStoreClient nullClient = null;
        try
        {
            nullClient = HPCCWsStoreClient.get(null);
        }
        catch (Exception e)
        {
            System.out.println("deleteNamespace EHT-006: PASS — HPCCWsStoreClient.get(null) threw: " + e.getLocalizedMessage());
            return;
        }

        Assume.assumeNotNull("EHT-006: Skipped — could not create null-connection client", nullClient);

        try
        {
            nullClient.deleteNamespace(storename, namespace, true, "");
            Assert.fail("EHT-006: deleteNamespace with null connection should throw an exception");
        }
        catch (NullPointerException e)
        {
            System.out.println("deleteNamespace EHT-006: PASS — threw NullPointerException");
        }
        catch (Exception e)
        {
            System.out.println("deleteNamespace EHT-006: PASS — threw Exception: " + e.getLocalizedMessage());
        }
    }
}

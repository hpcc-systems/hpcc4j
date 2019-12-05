package org.hpccsystems.ws.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Properties;

import javax.crypto.Cipher;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Stub;
import org.hpccsystems.commons.utils.CryptoHelper;
import org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.CreateStoreRequest;
import org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.CreateStoreResponse;
import org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.DeleteNamespaceRequest;
import org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.DeleteNamespaceResponse;
import org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.DeleteRequest;
import org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.DeleteResponse;
import org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.EspSoapFault;
import org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.FetchAllRequest;
import org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.FetchAllResponse;
import org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.FetchKeyMDRequest;
import org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.FetchKeyMDResponse;
import org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.FetchRequest;
import org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.FetchResponse;
import org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.KVPair;
import org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.KeySet_type0;
import org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.ListKeysRequest;
import org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.ListKeysResponse;
import org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.ListNamespacesRequest;
import org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.ListNamespacesResponse;
import org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.Namespaces_type0;
import org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.Pairs_type0;
import org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.Pairs_type1;
import org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.SetRequest;
import org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.SetResponse;
import org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.WsstorePingRequest;
import org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.WsstoreStub;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;

/**
 * Use as soap client for HPCC WsFileIo web service.
 * This includes creating a new file, and appending data to a file in the given SHPCC System.
 *
 */
public class HPCCWsStoreClient extends BaseHPCCWsClient
{
    //private static final Logger log                   = Logger.getLogger(HPCCWsStoreClient.class.getName());
    public static final String        WSStoreWSDLURI    = "/wsstore";
    private static int            DEFAULTSERVICEPORT    = -1;
    private static String                    WSDLURL    = null;

    private static void loadWSDLURL()
    {
        try
        {
            WSDLURL = getServiceWSDLURL(new WsstoreStub());
            DEFAULTSERVICEPORT = (new URL(WSDLURL)).getPort();
        }
        catch (AxisFault | MalformedURLException e)
        {
            log.error("Unable to establish original WSDL URL");
            log.error(e.getLocalizedMessage());
        }
    }

    public static String getServiceURI()
    {
        return WSStoreWSDLURI;
    }

    public static String getServiceWSDLURL()
    {
        if (WSDLURL == null)
        {
            loadWSDLURL();
        }

        return WSDLURL;
    }

    public static int getServiceWSDLPort()
    {
        if (WSDLURL == null)
        {
            loadWSDLURL();
        }

        return DEFAULTSERVICEPORT;
    }

    public static HPCCWsStoreClient get(Connection connection)
    {
        return new HPCCWsStoreClient(connection);
    }

    public static HPCCWsStoreClient get(String protocol, String targetHost, String targetPort, String user, String pass)
    {
        Connection conn = new Connection(protocol,targetHost,targetPort);
        conn.setCredentials(user, pass);
        return new HPCCWsStoreClient(conn);
    }

    public static HPCCWsStoreClient get(String protocol, String targetHost, String targetPort, String user, String pass, int timeout)
    {
        Connection conn = new Connection(protocol,targetHost,targetPort);
        conn.setCredentials(user, pass);
        conn.setConnectTimeoutMilli(timeout);
        conn.setSocketTimeoutMilli(timeout);

        return new HPCCWsStoreClient(conn);
    }

    protected HPCCWsStoreClient(Connection baseConnection)
    {
        initWSStoreStub(baseConnection);
    }

    /**
     * Initializes the service's underlying soap proxy. Should only be used by constructors
     *
     */
    private void initWSStoreStub(Connection connection)
    {
        try
        {
            stub = setStubOptions(new WsstoreStub(connection.getBaseUrl()+WSStoreWSDLURI), connection);
        }
        catch (AxisFault e)
        {
            log.error("Could not initialize WsStoreStub- Review all HPCC connection values");
            e.printStackTrace();
        }
        catch (Exception e)
        {
            log.error("Could not initialize WsStoreStub- Review all HPCC connection values");
            if (!e.getLocalizedMessage().isEmpty())
            {
                initErrMessage = e.getLocalizedMessage();
                log.error(e.getLocalizedMessage());
            }
        }
    }

    public boolean ping() throws Exception
    {
        verifyStub();

        WsstorePingRequest request = new WsstorePingRequest();
        try
        {
            ((WsstoreStub)stub).ping(request);
        }
        catch (Exception e)
        {
            return false;
        }

        return true;
    }

    public String [] listNamespaces(String storename, boolean global) throws Exception, ArrayOfEspExceptionWrapper
    {
        String namespaces [] = null;
        ListNamespacesRequest request = new ListNamespacesRequest();
        request.setStoreName(storename);
        request.setUserSpecific(global);
        try
        {
            ListNamespacesResponse response = ((WsstoreStub)stub).listNamespaces(request);
            if (response.getExceptions() != null)
                handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could Not list wsstore namespaces");

            Namespaces_type0 namespacesresp = response.getNamespaces();
            if (namespacesresp != null)
                namespaces = namespacesresp.getNamespace();
        }
        catch (RemoteException e)
        {
            log.error("Could not list namespaces");
            log.error(e);
        }
        catch (EspSoapFault e)
        {
            log.error("Could not list namespaces");
            log.error(e);
        }

        return namespaces;
    }

    public String [] listNSKeys(String storename, String namespace, boolean global) throws Exception, ArrayOfEspExceptionWrapper
    {
        String keyset [] = null;
        ListKeysRequest request = new ListKeysRequest();
        request.setStoreName(storename);
        request.setNamespace(namespace);
        request.setUserSpecific(!global);
        try
        {
            ListKeysResponse response = ((WsstoreStub)stub).listKeys(request);
            if (response.getExceptions() != null)
                handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could Not list keys for store: " + storename + " namespace: '" + namespace + "'");

            KeySet_type0 keysetresp = response.getKeySet();
            if (keysetresp != null)
                keyset = keysetresp.getKey();
        }
        catch (RemoteException e)
        {
            log.error("Could not list namespace keys");
            log.error(e);
        }
        catch (EspSoapFault e)
        {
            log.error("Could not list namespace keys");
            log.error(e);
        }

        return keyset;
    }

    public String fetchValue(String storename, String namespace, String key, boolean global) throws Exception, ArrayOfEspExceptionWrapper
    {
        String value = null;

        FetchRequest request = new FetchRequest();
        request.setStoreName(storename);
        request.setNamespace(namespace);
        request.setUserSpecific(!global);
        request.setKey(key);

        try
        {
            FetchResponse response = ((WsstoreStub)stub).fetch(request);
            if (response.getExceptions() != null)
                handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could Fetch value for store: " + storename + " namespace: '" + namespace + "'" + " key: '" + key + "'");

            value = response.getValue();
        }
        catch (RemoteException e)
        {
            log.error("Could not fetch value");
            log.error(e);
        }
        catch (EspSoapFault e)
        {
            log.error("Could not fetch value");
            log.error(e);
        }

        return value;
    }

    public String fetchValueEncrypted(String storename, String namespace, String key, boolean global, Cipher cipher) throws Exception, ArrayOfEspExceptionWrapper
    {
        String value = fetchValue(storename, namespace, key, global);

        if (value != null && !value.isEmpty())
        {
            value = CryptoHelper.decrypt(value, cipher);
        }
        else
        {
            throw new Exception("Could not fetch value");
        }

        return value;
    }

    /**
     * @param storename
     * @param namespace
     * @param key
     * @param global
     * @param secretKey - Must match the secret key used to encrypt this value
     * @return
     * @throws Exception
     * @throws ArrayOfEspExceptionWrapper
     */
    public String fetchValueEncrypted(String storename, String namespace, String key, boolean global, String secretKey) throws Exception, ArrayOfEspExceptionWrapper
    {
        return fetchValueEncrypted(storename, namespace, secretKey, global, CryptoHelper.createDefaultCipher(secretKey, false));
    }

    public Properties fetchKeyMetaData(String storename, String namespace, String key, boolean global) throws Exception, ArrayOfEspExceptionWrapper
    {
        Properties props = new Properties();

        FetchKeyMDRequest request = new FetchKeyMDRequest();
        request.setStoreName(storename);
        request.setNamespace(namespace);
        request.setUserSpecific(!global);
        request.setKey(key);

        try
        {
            FetchKeyMDResponse response = ((WsstoreStub)stub).fetchKeyMetadata(request);
            if (response.getExceptions() != null)
                handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could Fetch key meteadata for store: " + storename + " namespace: '" + namespace + "'" + " key: '" + key + "'");

            Pairs_type1 pairs = response.getPairs();
            if (pairs != null)
            {
                KVPair[] pair = pairs.getPair();
                for (KVPair kvPair : pair)
                {
                    props.setProperty(kvPair.getKey(), kvPair.getValue());
                }
            }
        }
        catch (RemoteException e)
        {
            e.printStackTrace();
        }
        catch (EspSoapFault e)
        {
            e.printStackTrace();
        }

        return props;
    }

    public Properties fetchAllNSKeys(String storename, String namespace, boolean global) throws Exception, ArrayOfEspExceptionWrapper
    {
        Properties props = new Properties();

        FetchAllRequest request = new FetchAllRequest();
        request.setStoreName(storename);
        request.setNamespace(namespace);
        request.setUserSpecific(!global);

        try
        {
            FetchAllResponse response = ((WsstoreStub)stub).fetchAll(request);
            if (response.getExceptions() != null)
                handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could Fetch all namespaces keys for store: " + storename + " namespace: '" + namespace + "'");

            Pairs_type0 pairs = response.getPairs();
            if (pairs != null)
            {
                KVPair[] pair = pairs.getPair();
                for (KVPair kvPair : pair)
                {
                    props.setProperty(kvPair.getKey(), kvPair.getValue());
                }
            }
        }
        catch (RemoteException e)
        {
            e.printStackTrace();
        }
        catch (EspSoapFault e)
        {
            e.printStackTrace();
        }

        return props;
    }

    public boolean setValue(String storename, String namespace, String key, String value, boolean global) throws Exception, ArrayOfEspExceptionWrapper
    {
        SetRequest request = new SetRequest();
        request.setStoreName(storename);
        request.setNamespace(namespace);
        request.setKey(key);
        request.setValue(value);
        request.setUserSpecific(!global);

        try
        {
            SetResponse response = ((WsstoreStub)stub).set(request);
            if (response.getExceptions() != null)
                handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could not Set " + key + "=" + value + " for store: " + storename + " namespace: '" + namespace + "'");

            return response.getSuccess();
        }
        catch (RemoteException e)
        {
            e.printStackTrace();
        }
        catch (EspSoapFault e)
        {
            e.printStackTrace();
        }

        return false;
    }

    public boolean setValueEncrypted(String storename, String namespace, String key, String value, boolean global, Cipher cipher) throws Exception, ArrayOfEspExceptionWrapper
    {
        return setValue(storename, namespace, key, CryptoHelper.encrypt(value, cipher), global);
    }

    public boolean setValueEncrypted(String storename, String namespace, String key, String value, boolean global, String secretKey) throws Exception, ArrayOfEspExceptionWrapper
    {
        return setValue(storename, namespace, key, CryptoHelper.encryptSHA512AESPKCS5Pad(value, secretKey), global);
    }

    public boolean deleteValue(String storename, String namespace, String key, boolean global) throws Exception, ArrayOfEspExceptionWrapper
    {
        DeleteRequest request = new DeleteRequest();
        request.setStoreName(storename);
        request.setNamespace(namespace);
        request.setKey(key);
        request.setUserSpecific(!global);

        try
        {
            DeleteResponse response = ((WsstoreStub)stub).delete(request);
            if (response.getExceptions() != null)
                handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could not delete " + key + " for store: " + storename + " namespace: '" + namespace + "'");

            return response.getSuccess();
        }
        catch (RemoteException e)
        {
            e.printStackTrace();
        }
        catch (EspSoapFault e)
        {
            e.printStackTrace();
        }

        return false;
    }

    public boolean deleteNamespace(String storename, String namespace, boolean global, String targetuser) throws Exception, ArrayOfEspExceptionWrapper
    {
        DeleteNamespaceRequest request = new DeleteNamespaceRequest();
        request.setStoreName(storename);
        request.setNamespace(namespace);
        request.setTargetUser(targetuser);
        request.setUserSpecific(!global);

        try
        {
            DeleteNamespaceResponse response = ((WsstoreStub)stub).deleteNamespace(request);
            if (response.getExceptions() != null)
                handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could not delete namespace" + storename + "." + namespace + " (" +(global == true ? "global" : (targetuser != null && !targetuser.isEmpty()) ? targetuser : "user") + ")");

            return response.getSuccess();
        }
        catch (RemoteException e)
        {
            e.printStackTrace();
        }
        catch (EspSoapFault e)
        {
            e.printStackTrace();
        }

        return false;
    }

    public boolean createStore(String storename, String description, String type) throws Exception, ArrayOfEspExceptionWrapper
    {
        CreateStoreRequest request = new CreateStoreRequest();
        request.setName(storename);
        request.setDescription(description);
        request.setType(type);

        try
        {
            CreateStoreResponse response = ((WsstoreStub)stub).createStore(request);
            if (response.getExceptions() != null)
                handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could not create store " + storename);

            return response.getSuccess();
        }
        catch (RemoteException e)
        {
            e.printStackTrace();
        }
        catch (EspSoapFault e)
        {
            e.printStackTrace();
        }

        return false;
    }

    public Stub getDefaultStub() throws AxisFault
    {
        return new WsstoreStub();
    }
}

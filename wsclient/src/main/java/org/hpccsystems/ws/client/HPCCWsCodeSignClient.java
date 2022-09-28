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

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Stub;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.ArrayOfEspException;
import org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.ListUserIDsResponse;
import org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.SignResponse;
import org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.VerifyResponse;
import org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.Ws_codesignPingRequest;
import org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.Ws_codesignStub;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wscodesign.ListUserIDsRequestWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wscodesign.ListUserIDsResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wscodesign.SignRequestWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wscodesign.SignResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wscodesign.VerifyRequestWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wscodesign.VerifyResponseWrapper;

/**
 * Facilitates ECL Code signing and verification related activities.
 */
public class HPCCWsCodeSignClient extends BaseHPCCWsClient
{
    private static final Logger    log                = LogManager.getLogger(HPCCWsCodeSignClient.class);

    /** Constant <code>WSRESOURCESURI="/ws_codesign"</code> */
    public static final String     WSRESOURCESURI     = "/ws_codesign";
    private static int             DEFAULTSERVICEPORT = -1;
    private static String          WSDLURL            = null;

    /**
     * Load WSDLURL.
     */
    private static void loadWSDLURL()
    {
        try
        {
            WSDLURL = getServiceWSDLURL(new Ws_codesignStub());
            DEFAULTSERVICEPORT = (new URL(WSDLURL)).getPort();
        }
        catch (AxisFault | MalformedURLException e)
        {
            log.error("Unable to establish original WSDL URL");
            log.error(e.getLocalizedMessage());
        }
    }

    /**
     * Gets the service URI.
     *
     * @return the service URI
     */
    public String getServiceURI()
    {
        return WSRESOURCESURI;
    }

    /**
     * Gets the service WSDLURL.
     *
     * @return the service WSDLURL
     */
    public static String getServiceWSDLURL()
    {
        if (WSDLURL == null)
        {
            loadWSDLURL();
        }

        return WSDLURL;
    }

    /**
     * Gets the service WSDL port.
     *
     * @return the service WSDL port
     */
    public static int getServiceWSDLPort()
    {
        if (WSDLURL == null)
        {
            loadWSDLURL();
        }

        return DEFAULTSERVICEPORT;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.hpccsystems.ws.client.BaseHPCCWsClient#getDefaultStub()
     */
    /** {@inheritDoc} */
    @Override
    public Stub getDefaultStub() throws AxisFault
    {
        return new Ws_codesignStub();
    }

    /**
     * Gets the.
     *
     * @param connection
     *            the connection
     * @return the HPCC HPCCWsResources client
     */
    public static HPCCWsCodeSignClient get(Connection connection)
    {
        return new HPCCWsCodeSignClient(connection);
    }

    /**
     * Gets the.
     *
     * @param protocol
     *            the protocol
     * @param targetHost
     *            the target host
     * @param targetPort
     *            the target port
     * @param user
     *            the user
     * @param pass
     *            the pass
     * @return the HPCC HPCCWsCodeSignClient
     */
    public static HPCCWsCodeSignClient get(String protocol, String targetHost, String targetPort, String user, String pass)
    {
        Connection conn = new Connection(protocol, targetHost, targetPort);
        conn.setCredentials(user, pass);
        return new HPCCWsCodeSignClient(conn);
    }

    /**
     * Gets the.
     *
     * @param protocol
     *            the protocol
     * @param targetHost
     *            the target host
     * @param targetPort
     *            the target port
     * @param user
     *            the user
     * @param pass
     *            the pass
     * @param timeout
     *            the timeout
     * @return the HPCC HPCCWsCodeSignClient
     */
    public static HPCCWsCodeSignClient get(String protocol, String targetHost, String targetPort, String user, String pass, int timeout)
    {
        Connection conn = new Connection(protocol, targetHost, targetPort);
        conn.setCredentials(user, pass);
        conn.setConnectTimeoutMilli(timeout);
        conn.setSocketTimeoutMilli(timeout);

        return new HPCCWsCodeSignClient(conn);
    }

    /**
     * Instantiates a new HPCC WSRESOURCES client.
     *
     * @param baseConnection
     *            the base connection
     */
    protected HPCCWsCodeSignClient(Connection baseConnection)
    {
        initWsResourcesClientStub(baseConnection);
    }

    /**
     * Initializes the service's underlying stub Should only be used by constructors.
     *
     * @param conn
     *            -- All connection settings included
     */
    protected void initWsResourcesClientStub(Connection conn)
    {
        initBaseWsClient(conn, false); //No need to fetch HPCC build version, Containerized mode

        try
        {
            stub = setStubOptions(new Ws_codesignStub(conn.getBaseUrl() + WSRESOURCESURI), conn);
        }
        catch (AxisFault e)
        {
            initErrMessage += "\nCould not initialize WsCodeSignClient - Review all HPCC connection values";
        }
    }

    /**
     * <p>listUserIDs.</p>
     *
     * @param req a {@link org.hpccsystems.ws.client.wrappers.gen.wscodesign.ListUserIDsRequestWrapper} object.
     * @return a {@link org.hpccsystems.ws.client.wrappers.gen.wscodesign.ListUserIDsResponseWrapper} object.
     * @throws java.lang.Exception if any.
     */
    public ListUserIDsResponseWrapper listUserIDs(ListUserIDsRequestWrapper req) throws Exception
    {
        if (req == null)
            throw new Exception("HPCCWsCodeSignClient.listUserIDs: Must provide valid ListUserIDsRequestWrapper!");

        verifyStub();

        ListUserIDsResponse resp = null;

        try
        {
            resp = ((Ws_codesignStub) stub).listUserIDs(req.getRaw());
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWSRESOURCESClient.listUserIDs(ListUserIDsRequestWrapper) encountered RemoteException.", e);
        }

        if (resp.getExceptions() != null)
        {
            ArrayOfEspException exceptions = resp.getExceptions();
            handleEspExceptions(new ArrayOfEspExceptionWrapper(exceptions), "Error listing userids");
        }

        return new ListUserIDsResponseWrapper(resp);
    }

    /**
     * <p>sign.</p>
     *
     * @param req a {@link org.hpccsystems.ws.client.wrappers.gen.wscodesign.SignRequestWrapper} object.
     * @return a {@link org.hpccsystems.ws.client.wrappers.gen.wscodesign.SignResponseWrapper} object.
     * @throws java.lang.Exception if any.
     */
    public SignResponseWrapper sign(SignRequestWrapper req) throws Exception
    {
        if (req == null)
            throw new Exception("HPCCWsCodeSignClient.sign: Must provide valid SignRequestWrapper!");

        verifyStub();

        SignResponse resp = null;

        try
        {
            resp = ((Ws_codesignStub) stub).sign(req.getRaw());
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWSRESOURCESClient.sign(ServiceQueryRequestWrapper) encountered RemoteException.", e);
        }

        if (resp.getExceptions() != null)
        {
            ArrayOfEspException exceptions = resp.getExceptions();
            handleEspExceptions(new ArrayOfEspExceptionWrapper(exceptions), "Error signing");
        }

        return new SignResponseWrapper(resp);
    }

    /**
     * <p>verify.</p>
     *
     * @param req a {@link org.hpccsystems.ws.client.wrappers.gen.wscodesign.VerifyRequestWrapper} object.
     * @return a {@link org.hpccsystems.ws.client.wrappers.gen.wscodesign.VerifyResponseWrapper} object.
     * @throws java.lang.Exception if any.
     */
    public VerifyResponseWrapper verify(VerifyRequestWrapper req) throws Exception
    {
        if (req == null)
            throw new Exception("HPCCWsCodeSignClient.verify: Must provide valid VerifyRequestWrapper!");

        verifyStub();

        VerifyResponse resp = null;

        try
        {
            resp = ((Ws_codesignStub) stub).verify(req.getRaw());
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWSRESOURCESClient.serviceQuery(ServiceQueryRequestWrapper) encountered RemoteException.", e);
        }

        if (resp.getExceptions() != null)
        {
            ArrayOfEspException exceptions = resp.getExceptions();
            handleEspExceptions(new ArrayOfEspExceptionWrapper(exceptions), "Error processing service query");
        }

        return new VerifyResponseWrapper(resp);
    }

    /**
     * Ping.
     *
     * @return true, if successful
     * @throws java.lang.Exception
     *             the exception
     */
    public boolean ping() throws Exception
    {
        verifyStub();

        try
        {
            ((Ws_codesignStub) stub).ping(new Ws_codesignPingRequest());
        }
        catch (Exception e)
        {
            log.error(e.getLocalizedMessage());
            return false;
        }

        return true;
    }
}

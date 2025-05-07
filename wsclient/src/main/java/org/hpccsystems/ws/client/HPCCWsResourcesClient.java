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
import org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ArrayOfEspException;
import org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ServiceQueryResponse;
import org.hpccsystems.ws.client.gen.axis2.wsresources.latest.TargetQueryResponse;
import org.hpccsystems.ws.client.gen.axis2.wsresources.latest.WsResourcesPingRequest;
import org.hpccsystems.ws.client.gen.axis2.wsresources.latest.WsResourcesStub;
import org.hpccsystems.ws.client.gen.axis2.wsresources.latest.WebLinksQueryResponse;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsresources.ServiceQueryRequestWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsresources.ServiceQueryResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsresources.TargetQueryRequestWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsresources.TargetQueryResponseWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsresources.WebLinksQueryRequestWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wsresources.WebLinksQueryResponseWrapper;

import io.opentelemetry.instrumentation.annotations.WithSpan;


/**
 * Facilitates discovery of containerized HPCC Systems resources.
 */
public class HPCCWsResourcesClient extends BaseHPCCWsClient
{
    private static final Logger    log                = LogManager.getLogger(HPCCWsResourcesClient.class);

    /** Constant <code>WSRESOURCESURI="/WsResources"</code> */
    public static final String     WSRESOURCESURI     = "/WsResources";
    private static int             DEFAULTSERVICEPORT = -1;
    private static String          WSDLURL            = null;

    /**
     * Load WSDLURL.
    */
    private static void loadWSDLURL()
    {
        try
        {
            WSDLURL = getServiceWSDLURL(new WsResourcesStub());
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
        return new WsResourcesStub();
    }

    /**
     * Gets the Ws Resources client
     *
     * @param connection
     *           the connection
     * @return the HPCC HPCCWsResources client
     */
    public static HPCCWsResourcesClient get(Connection connection)
    {
        return new HPCCWsResourcesClient(connection);
    }

    /**
     * Gets the Ws Resources client
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
     * @return the HPCC HPCCWsResources client
     */
    public static HPCCWsResourcesClient get(String protocol, String targetHost, String targetPort, String user, String pass)
    {
        Connection conn = new Connection(protocol, targetHost, targetPort);
        conn.setCredentials(user, pass);
        return new HPCCWsResourcesClient(conn);
    }

    /**
     * Gets the Ws Resources client
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
     * @return the HPCC WSDFUXREF client
     */
    public static HPCCWsResourcesClient get(String protocol, String targetHost, String targetPort, String user, String pass, int timeout)
    {
        Connection conn = new Connection(protocol, targetHost, targetPort);
        conn.setCredentials(user, pass);
        conn.setConnectTimeoutMilli(timeout);
        conn.setSocketTimeoutMilli(timeout);

        return new HPCCWsResourcesClient(conn);
    }

    /**
     * Instantiates a new HPCC WSRESOURCES client.
     *
     * @param baseConnection
     *            the base connection
     */
    protected HPCCWsResourcesClient(Connection baseConnection)
    {
        initWsResourcesClientStub(baseConnection);
    }

    /**
     * Initializes the service's underlying stub Should only be used by
     * constructors.
     *
     * @param conn
     *            -- All connection settings included
     */
    protected void initWsResourcesClientStub(Connection conn)
    {
        initBaseWsClient(conn, true); //Preemptively fetch HPCC build version, Containerized mode

        try
        {
            stub = setStubOptions(new WsResourcesStub(conn.getBaseUrl() + WSRESOURCESURI), conn);
        }
        catch (AxisFault e)
        {
            stub = null;

            initErrMessage = "Could not initialize WsResources - Review all HPCC connection values";
            if (!e.getLocalizedMessage().isEmpty())
            {
                initErrMessage += "\n" + e.getLocalizedMessage();
            }
        }

        if (!initErrMessage.isEmpty())
            log.error(initErrMessage);
    }

    /**
     * Submit service query request
     *
     * @param req a
     *            {@link org.hpccsystems.ws.client.wrappers.gen.wsresources.ServiceQueryRequestWrapper}
     *            object.
     * @throws Exception a {@link java.lang.Exception} object.
     * @return a
     *         {@link org.hpccsystems.ws.client.wrappers.gen.wsresources.ServiceQueryResponseWrapper}
     *         object.
     */
    @WithSpan
    public ServiceQueryResponseWrapper serviceQuery(ServiceQueryRequestWrapper req) throws Exception
    {
        if (req == null)
            throw new Exception("ServiceQueryRequestWrapper must be provided!");

        verifyStub();

        ServiceQueryResponse resp = null;

        try
        {
            resp = ((WsResourcesStub) stub).serviceQuery(req.getRaw());
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWSRESOURCESClient.serviceQuery(ServiceQueryRequestWrapper) encountered RemoteException.", e);
        }

        if (resp.getExceptions() != null)
        {
            ArrayOfEspException exceptions = resp.getExceptions();
            handleEspExceptions(new ArrayOfEspExceptionWrapper(exceptions), "Error processing service query request");
        }

        return new ServiceQueryResponseWrapper(resp);
    }

    /**
     * Submit target query request
     *
     * @param req a
     *            {@link org.hpccsystems.ws.client.wrappers.gen.wsresources.TargetQueryRequestWrapper}
     *            object.
     * @throws Exception a {@link java.lang.Exception} object.
     * @return a
     *         {@link org.hpccsystems.ws.client.wrappers.gen.wsresources.TargetQueryResponseWrapper}
     *         object.
     */
    @WithSpan
    public TargetQueryResponseWrapper targetQuery(TargetQueryRequestWrapper req) throws Exception
    {
        if (req == null)
            throw new Exception("TargetQueryRequestWrapper must be provided!");

        System.out.println("targetQuery received request: '" + req.getRaw().getType() + "'");

        verifyStub();

        TargetQueryResponse resp = null;

        try
        {
            resp = ((WsResourcesStub) stub).targetQuery(req.getRaw());
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWSRESOURCESClient.targetQuery(TargetQueryRequestWrapper) encountered RemoteException.", e);
        }

        if (resp.getExceptions() != null)
        {
            ArrayOfEspException exceptions = resp.getExceptions();
            handleEspExceptions(new ArrayOfEspExceptionWrapper(exceptions), "Error processing target query request");
        }

        return new TargetQueryResponseWrapper(resp);
    }

    /**
     * Submit WebLinks query request
     *
     * @param req a
     *            {@link org.hpccsystems.ws.client.wrappers.gen.wsresources.WebLinksQueryRequestWrapper}
     *            object.
     * @throws Exception a {@link java.lang.Exception} object.
     * @return a
     *         {@link org.hpccsystems.ws.client.wrappers.gen.wsresources.WebLinksQueryResponseWrapper}
     *         object.
     */
    @WithSpan
    public WebLinksQueryResponseWrapper webLinks(WebLinksQueryRequestWrapper req) throws Exception
    {
        if (req == null)
            throw new Exception("WebLinksQueryRequestWrapper must be provided!");

        verifyStub();

        WebLinksQueryResponse resp = null;

        try
        {
            resp = ((WsResourcesStub) stub).webLinksQuery(req.getRaw());
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWSRESOURCESClient.webLinksQuery(WebLinksQueryRequestWrapper) encountered RemoteException.", e);
        }

        if (resp.getExceptions() != null)
        {
            ArrayOfEspException exceptions = resp.getExceptions();
            handleEspExceptions(new ArrayOfEspExceptionWrapper(exceptions), "Error processing WebLinks query");
        }

        return new WebLinksQueryResponseWrapper(resp);
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
            ((WsResourcesStub) stub).ping(new WsResourcesPingRequest());
        }
        catch (Exception e)
        {
            log.error(e.getLocalizedMessage());
            return false;
        }

        return true;
    }
}

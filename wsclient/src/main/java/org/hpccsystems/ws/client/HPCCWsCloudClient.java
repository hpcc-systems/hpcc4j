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

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Stub;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hpccsystems.ws.client.gen.axis2.wscloud.latest.GetPODsRequest;
import org.hpccsystems.ws.client.gen.axis2.wscloud.latest.GetPODsResponse;
import org.hpccsystems.ws.client.gen.axis2.wscloud.latest.WsCloud;
import org.hpccsystems.ws.client.gen.axis2.wscloud.latest.WsCloudPingRequest;
import org.hpccsystems.ws.client.gen.axis2.wscloud.latest.WsCloudStub;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.wrappers.gen.wscloud.*;

import io.opentelemetry.instrumentation.annotations.WithSpan;

/**
 * Provides Containerized HPCC cluster information.
 */
public class HPCCWsCloudClient extends BaseHPCCWsClient
{
    private static final Logger    log                = LogManager.getLogger(HPCCWsCloudClient.class);

    public static final String     WSCLOUDURI     = "/wscloud";
    private static int             DEFAULTSERVICEPORT = -1;
    private static String          WSDLURL            = null;

    /**
     * Load WSDLURL.
     */
    private static void loadWSDLURL()
    {
        try
        {
            WSDLURL = getServiceWSDLURL(new WsCloudStub());
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
        return WSCLOUDURI;
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
        return new WsCloudStub();
    }

    /**
     * Gets a HPCCWsCloudClient based on user provided connection object.
     *
     * @param connection
     *            the connection
     * @return the HPCC HPCCWsCloud client
     */
    public static HPCCWsCloudClient get(Connection connection)
    {
        return new HPCCWsCloudClient(connection);
    }

    /**
     * Gets a HPCCWsCloudClient based on user provided connection attributes.
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
     * @return the HPCC HPCCWsCloudClient
     */
    public static HPCCWsCloudClient get(String protocol, String targetHost, String targetPort, String user, String pass)
    {
        Connection conn = new Connection(protocol, targetHost, targetPort);
        conn.setCredentials(user, pass);
        return new HPCCWsCloudClient(conn);
    }

    /**
     * Gets a HPCCWsCloudClient based on user provided connection attributes.
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
     * @return the HPCC HPCCWsCloudClient
     */
    public static HPCCWsCloudClient get(String protocol, String targetHost, String targetPort, String user, String pass, int timeout)
    {
        Connection conn = new Connection(protocol, targetHost, targetPort);
        conn.setCredentials(user, pass);
        conn.setConnectTimeoutMilli(timeout);
        conn.setSocketTimeoutMilli(timeout);

        return new HPCCWsCloudClient(conn);
    }

    /**
     * Instantiates a new HPCC WSCloud client.
     *
     * @param baseConnection
     *            the base connection
     */
    protected HPCCWsCloudClient(Connection baseConnection)
    {
        initWsCloudClientStub(baseConnection);
    }

    /**
     * Initializes the service's underlying stub Should only be used by constructors.
     *
     * @param conn
     *            -- All connection settings included
     */
    protected void initWsCloudClientStub(Connection conn)
    {
        setActiveConnectionInfo(conn);
        try
        {
            stub = setStubOptions(new WsCloudStub(conn.getBaseUrl() + WSCLOUDURI), conn);
        }
        catch (Exception e)
        {
            stub = null;

            initErrMessage = "Could not initialize WsCloudClient - Review all HPCC connection values";
            if (!e.getLocalizedMessage().isEmpty())
            {
                initErrMessage += "\n" + e.getLocalizedMessage();
            }
            log.error(initErrMessage);
        }
    }

    /**
     * <p>getPods.</p>
     *
     * @return a JSON formatted list of available pods - in raw k8s format.
     * @throws java.lang.Exception if any.
     */
    //@Deprecated starting HPCC 9.12.x wscloud 1.02
    //@WithSpan
    /*public String getPods() throws Exception
    {
        verifyStub();

        GetPODsResponse resp = null;

        try
        {
            resp = ((WsCloud) stub).getPODs(new GetPODsRequest());
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsCloud.getPods() encountered RemoteException.", e);
        }

        if (resp == null)
            throw new Exception("HPCCWsCloud.getPods() received invalid respose.");

        return resp.getResult();
    }*/

    /**
     * <p>getPods.</p>
     *
     * @return a wrapped representation of the getpods method response
     * @throws java.lang.Exception if any.
     */
    @WithSpan
    public GetPODsResponseWrapper getPods() throws Exception
    {
        verifyStub();

        GetPODsResponseWrapper wrappedResp = null;
        GetPODsResponse resp = null;

        try
        {
            resp = ((WsCloud) stub).getPODs(new GetPODsRequest());
        }
        catch (RemoteException e)
        {
            throw new Exception("HPCCWsCloud.getPods() encountered RemoteException.", e);
        }

        if (resp == null)
            throw new Exception("HPCCWsCloud.getPods() received invalid respose.");

        /*Current version of this method does not return inline exceptions
         * if (resp.getExceptions() != null)
        {
            ArrayOfEspException exceptions = resp.getExceptions();
            handleEspExceptions(new ArrayOfEspExceptionWrapper(exceptions), "Error getting pods");
        }
        */

        if (resp != null)
            wrappedResp = new GetPODsResponseWrapper(resp);

        return wrappedResp;
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
            ((WsCloudStub) stub).ping(new WsCloudPingRequest());
        }
        catch (Exception e)
        {
            log.error(e.getLocalizedMessage());
            return false;
        }

        return true;
    }
}

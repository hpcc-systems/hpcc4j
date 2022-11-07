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
import org.hpccsystems.ws.client.gen.axis2.wssmc.latest.Activity;
import org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ActivityResponse;
import org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfNamedValue;
import org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspException;
import org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GetBuildInfo;
import org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GetBuildInfoResponse;
import org.hpccsystems.ws.client.gen.axis2.wssmc.latest.NamedValue;
import org.hpccsystems.ws.client.gen.axis2.wssmc.latest.Ping;
import org.hpccsystems.ws.client.gen.axis2.wssmc.latest.WsSMCStub;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.gen.wssmc.GetBuildInfoResponseWrapper;

/**
 * Use as soap client for HPCC WsSMC web service, also known as eclwatch
 */
public class HPCCWsSMCClient extends BaseHPCCWsClient
{
    /** Constant <code>WSSMCURI="/WsSMC"</code> */
    public static final String WSSMCURI           = "/WsSMC";
    private static int         DEFAULTSERVICEPORT = -1;
    private static String      WSDLURL            = null;

    private static final String CONTAINERIZED_BUILD_INFO_TAG = "CONTAINERIZED";
    /**
     * Load WSDLURL.
     */
    private static void loadWSDLURL()
    {
        try
        {
            WSDLURL = getServiceWSDLURL(new WsSMCStub());
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
        return WSSMCURI;
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

    /**
     * Gets the.
     *
     * @param connection
     *            the connection
     * @return the HPCC ws SMC client
     */
    public static HPCCWsSMCClient get(Connection connection)
    {
        return new HPCCWsSMCClient(connection);
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
     * @return the HPCC ws SMC client
     */
    public static HPCCWsSMCClient get(String protocol, String targetHost, String targetPort, String user, String pass)
    {
        Connection conn = new Connection(protocol, targetHost, targetPort);
        conn.setCredentials(user, pass);
        return new HPCCWsSMCClient(conn);
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
     * @return the HPCC ws SMC client
     */
    public static HPCCWsSMCClient get(String protocol, String targetHost, String targetPort, String user, String pass, int timeout)
    {
        Connection conn = new Connection(protocol, targetHost, targetPort);
        conn.setCredentials(user, pass);
        conn.setConnectTimeoutMilli(timeout);
        conn.setSocketTimeoutMilli(timeout);

        return new HPCCWsSMCClient(conn);
    }

    /**
     * Instantiates a new HPCC ws SMC client.
     *
     * @param conn
     *            the conn
     */
    protected HPCCWsSMCClient(Connection conn)
    {
        initWsSMCSoapProxy(conn);
    }

    /**
     * Initializes the service's underlying soap proxy. Should only be used by constructors
     *
     * @param conn
     *            the conn
     */
    @SuppressWarnings("static-access")
    private void initWsSMCSoapProxy(Connection conn)
    {
        initBaseWsClient(conn, false); //Should never preemptively fetch HPCC build version, Containerized mode from HPCCwssmcclient
        try
        {
            stub = setStubOptions(new WsSMCStub(conn.getUrl() + this.WSSMCURI), conn);
        }
        catch (AxisFault e)
        {
            initErrMessage = "Could not initialize WsSMCStub - Review all HPCC connection values";
            if (!e.getLocalizedMessage().isEmpty())
            {
                initErrMessage += "\n" + e.getLocalizedMessage();
            }
        }

        if (!initErrMessage.isEmpty())
            log.error(initErrMessage);
    }

    /**
     * Gets the HPCC build.
     *
     * @return the HPCC build
     * @throws java.lang.Exception
     *             the exception
     */
    public String getHPCCBuild() throws Exception
    {
        String build = null;
        {
            verifyStub(); // Throws exception if stub failed

            Activity request = new Activity();
            ActivityResponse response = null;

            final String errMessage = "Could not determine HPCC build version: ";
            try
            {
                response = ((WsSMCStub) stub).activity(request);
            }
            catch (Exception e)
            {
                if (!e.getLocalizedMessage().isEmpty() && e.getLocalizedMessage().indexOf("401") != -1) // no standard http code available
                {
                    throw new Exception(errMessage + "Received 401 Unauthorized response from ECLWatch.");
                }
                else
                {
                    throw new Exception(errMessage + e.getLocalizedMessage());
                }
            }

            if (response.getExceptions() != null)
            {
                EspException[] exceptionarray = response.getExceptions().getException();
                if (exceptionarray.length > 0) throw new Exception(errMessage + exceptionarray[0].getMessage());
            }
            build = response.getBuild();
        }
        return build;
    }

   /**
    * Is target ECLWATCH running in container mode.
    *
    * @return true, if successful
    * @throws java.lang.Exception
    *             the exception
    */
   public boolean isContainerized() throws Exception
   {
       verifyStub();

       GetBuildInfoResponse resp = null;

       try
       {
           resp = ((WsSMCStub) stub).getBuildInfo(new GetBuildInfo());
       }
       catch (RemoteException e)
       {
           log.error("HPCCWsSMCClient.isContainerized encountered RemoteException.\n" + e.getLocalizedMessage());
       }

       if (resp != null)
       {
           if (resp.getExceptions() != null)
               handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could not query container mode info");
       }

       if (resp == null)
           throw new Exception("HPCCWsSMCClient.isContainerized received invalid response - cannot determine if HPCC is running in container mode");

       ArrayOfNamedValue buildinfo = resp.getBuildInfo();
       if ( buildinfo != null)
       {
           NamedValue[] buildinfoarray = buildinfo.getNamedValue();
           for (int i = 0; i < buildinfoarray.length; i++)
           {
               if (buildinfoarray[i].getName().equalsIgnoreCase(CONTAINERIZED_BUILD_INFO_TAG))
                   return buildinfoarray[i].getValue().equalsIgnoreCase("ON");
           }
       }

       return false;
   }

    /**
     * GetBuildInfo.
     *
     * @return GetBuildInfoResponseWrapper
     * @throws java.lang.Exception
     *             the exception
     */
    public GetBuildInfoResponseWrapper getBuildInfo() throws Exception
    {
        verifyStub();

        GetBuildInfoResponse resp = null;

        try
        {
            resp = ((WsSMCStub) stub).getBuildInfo(new GetBuildInfo());

        }
        catch (RemoteException e)
        {
            log.error("HPCCWsSMCClient.getBuildInfo encountered RemoteException.\n" + e.getLocalizedMessage());
        }

        if (resp != null)
        {
            if (resp.getExceptions() != null)
                handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could not query buidinfo");
        }

        return new GetBuildInfoResponseWrapper(resp);
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

        Ping request = new Ping();

        try
        {
            ((WsSMCStub) stub).ping(request);
        }
        catch (Exception e)
        {
            log.error(e.getLocalizedMessage());
            return false;
        }

        return true;
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
        return new WsSMCStub();
    }
}

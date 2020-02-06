package org.hpccsystems.ws.client;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Stub;
import org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.Activity;
import org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.ActivityResponse;
import org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspException;
import org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.Ping;
import org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.WsSMCStub;
import org.hpccsystems.ws.client.utils.Connection;

/**
 * Use as soap client for HPCC WsSMC web service, also known as eclwatch
 *
 */
public class HPCCWsSMCClient extends BaseHPCCWsClient
{
    public static final String WSSMCURI           = "/WsSMC";
    private static int         DEFAULTSERVICEPORT = -1;
    private static String      WSDLURL            = null;

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
    public static String getServiceURI()
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
        try
        {
            stub = setStubOptions(new WsSMCStub(conn.getUrl() + this.WSSMCURI), conn);
        }
        catch (Exception e)
        {
            log.error("Could not initialize WsSMCStub - Review all HPCC connection values");
            if (!e.getLocalizedMessage().isEmpty())
            {
                initErrMessage = e.getLocalizedMessage();
                log.error(e.getLocalizedMessage());
            }
        }
    }

    /**
     * Gets the HPCC build.
     *
     * @return the HPCC build
     * @throws Exception
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
     * Ping.
     *
     * @return true, if successful
     * @throws Exception
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
            return false;
        }

        return true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.hpccsystems.ws.client.BaseHPCCWsClient#getDefaultStub()
     */
    @Override
    public Stub getDefaultStub() throws AxisFault
    {
        return new WsSMCStub();
    }
}

package org.hpccsystems.ws.client;

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
    public static final String WSSMCURI     = "/WsSMC";

    public static HPCCWsSMCClient get(Connection connection)
    {
        return new HPCCWsSMCClient(connection);
    }

    public static HPCCWsSMCClient get(String protocol, String targetHost, String targetPort, String user, String pass)
    {
        Connection conn = new Connection(protocol,targetHost,targetPort);
        conn.setCredentials(user, pass);
        return new HPCCWsSMCClient(conn);
    }

    public static HPCCWsSMCClient get(String protocol, String targetHost, String targetPort, String user, String pass, int timeout)
    {
        Connection conn = new Connection(protocol,targetHost,targetPort);
        conn.setCredentials(user, pass);
        conn.setConnectTimeoutMilli(timeout);
        conn.setSocketTimeoutMilli(timeout);

        return new HPCCWsSMCClient(conn);
    }

    protected HPCCWsSMCClient(Connection conn)
    {
        initWsSMCSoapProxy(conn);
    }

    /**
     * Initializes the service's underlying soap proxy. Should only be used by constructors
     *
     * @param baseURL   Target service base URL
     * @param user      User credentials
     * @param pass      User credentials
     */
    @SuppressWarnings("static-access")
    private void initWsSMCSoapProxy(Connection conn)
    {
        try
        {
            stub = setStubOptions(new WsSMCStub(conn.getUrl()+this.WSSMCURI), conn);
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

    public String getHPCCBuild() throws Exception
    {
        String build = null;
        {
            verifyStub(); //Throws exception if stub failed

            Activity request = new Activity();
            ActivityResponse response = null;

            final String errMessage = "Could not determine HPCC build version: ";
            try
            {
                response = ((WsSMCStub)stub).activity(request);
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
                if (exceptionarray.length > 0)
                    throw new Exception(errMessage + exceptionarray[0].getMessage());
            }
            build = response.getBuild();
        }
        return build;
    }

    public boolean ping() throws Exception
    {
        verifyStub();

        Ping request = new Ping();

        try
        {
            ((WsSMCStub)stub).ping(request);
        }
        catch (Exception e)
        {
            return false;
        }

        return true;
    }
}
package org.hpccsystems.ws.client;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.axis.AxisFault;
import org.apache.axis.client.Stub;
import org.hpccsystems.ws.client.gen.wssmc.v1_21.Activity;
import org.hpccsystems.ws.client.gen.wssmc.v1_21.ActivityResponse;
import org.hpccsystems.ws.client.gen.wssmc.v1_21.WsSMCLocator;
import org.hpccsystems.ws.client.gen.wssmc.v1_21.WsSMCServiceSoap;
import org.hpccsystems.ws.client.gen.wssmc.v1_21.WsSMCServiceSoapProxy;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.utils.DataSingleton;
import org.hpccsystems.ws.client.utils.EqualsUtil;
import org.hpccsystems.ws.client.utils.HashCodeUtil;

/**
 * Use as soap client for HPCC WsSMC web service, also known as eclwatch
 *
 */
public class HPCCWsSMCClient extends DataSingleton
{
    private static URL                  originalURL;

    public static URL getOriginalURL() throws MalformedURLException
    {
        if (originalURL == null)
            originalURL = new URL(getOriginalWSDLURL());

        return originalURL;
    }

    public static int getOriginalPort() throws MalformedURLException
    {
        return getOriginalURL().getPort();
    }

    public static HPCCWsSMCClient get(Connection connection)
    {
        return new HPCCWsSMCClient(connection);
    }

    public static final String WSSMCURI     = "/WsSMC";
    private WsSMCServiceSoapProxy wsSMCServiceSoapProxy    =  null;
    private boolean verbose = false;

    /**
     * @param verbose - sets verbose mode
     */
    public void setVerbose(boolean verbose)
    {
        this.verbose = verbose;
    }

    /**
     * Provides soapproxy object for HPCCWsFileIOClient which can be used to access
     * the web service methods directly
     * @return  soapproxy for HPCCWsFileIOClient
     * @throws Exception if wsTopologyServiceSoapProxy not available.
     */

    public WsSMCServiceSoapProxy getSoapProxy() throws Exception
    {
        if (wsSMCServiceSoapProxy != null)
            return wsSMCServiceSoapProxy;
        else
            throw new Exception("wsSMCServiceSoapProxy not available.");
    }

    /**
     * Provides the WSDL URL originally used to create the underlying stub code
     *
     * @return original WSLD URL
     */
    public static String getOriginalWSDLURL()
    {
        return (new WsSMCLocator()).getWsSMCServiceSoapAddress();
    }

    protected HPCCWsSMCClient(WsSMCServiceSoapProxy wsSMCServiceSoapProxy)
    {
        this.wsSMCServiceSoapProxy = wsSMCServiceSoapProxy;
    }

    protected HPCCWsSMCClient(Connection baseConnection)
    {
       this(baseConnection.getProtocol(), baseConnection.getHost(), baseConnection.getPort(), baseConnection.getUserName(), baseConnection.getPassword());
    }

    protected HPCCWsSMCClient(String protocol, String targetHost, String targetPort, String user, String pass)
    {
        String address = Connection.buildUrl(protocol, targetHost, targetPort, WSSMCURI);
        initWsSMCSoapProxy(address, user, pass);
    }

    /**
     * Initializes the service's underlying soap proxy. Should only be used by constructors
     *
     * @param baseURL   Target service base URL
     * @param user      User credentials
     * @param pass      User credentials
     * @throws AxisFault
     */
    private void initWsSMCSoapProxy(String baseURL, String user, String pass)
    {
        wsSMCServiceSoapProxy = new WsSMCServiceSoapProxy(baseURL);
        if (wsSMCServiceSoapProxy != null)
        {
            WsSMCServiceSoap wsSMCServiceSoap = wsSMCServiceSoapProxy.getWsSMCServiceSoap();
            if (user != null && pass != null)
                Connection.initStub((org.apache.axis.client.Stub) wsSMCServiceSoap, user, pass);
        }
    }

    public String getHPCCBuild() throws Exception
    {
        String build = null;
        {
            try
            {
                WsSMCServiceSoap service = getSoapProxy();
                Activity request = new Activity();
                ActivityResponse response = service.activity(request);
                build = response.getBuild();
            }
            catch (Exception e)
            {
                String message = "Could not determine HPCC build version: ";
                if (!e.getLocalizedMessage().isEmpty() && e.getLocalizedMessage().indexOf("401") != -1) // no standard http code available
                {
                    throw new Exception(message + "Received 401 Unauthorized response from ECLWatch.");
                }
                else
                {
                    throw new Exception(message + e.getLocalizedMessage());
                }
            }
        }
        return build;
    }

    @Override
    protected boolean isComplete()
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    protected void fastRefresh()
    {
        // TODO Auto-generated method stub
    }

    @Override
    protected void fullRefresh()
    {
        // TODO Auto-generated method stub
    }

    @Override
    public boolean equals(Object aThat)
    {
        if (this == aThat)
        {
            return true;
        }

        if (!(aThat instanceof HPCCWsSMCClient))
        {
            return false;
        }

        HPCCWsSMCClient that = (HPCCWsSMCClient) aThat;
        WsSMCServiceSoapProxy thatSoapProxy;
        try
        {
            thatSoapProxy = that.getSoapProxy();
        }
        catch(Exception e)
        {
            thatSoapProxy = null;
        }

        return EqualsUtil.areEqual(wsSMCServiceSoapProxy.getEndpoint(), thatSoapProxy.getEndpoint()) &&
                EqualsUtil.areEqual(((Stub) wsSMCServiceSoapProxy.getWsSMCServiceSoap()).getUsername(), ((Stub) thatSoapProxy.getWsSMCServiceSoap()).getUsername()) &&
                EqualsUtil.areEqual(((Stub) wsSMCServiceSoapProxy.getWsSMCServiceSoap()).getPassword(), ((Stub) thatSoapProxy.getWsSMCServiceSoap()).getPassword());

    }

    @Override
    public int hashCode()
    {
        int result = HashCodeUtil.SEED;
        result = HashCodeUtil.hash(result, wsSMCServiceSoapProxy.getEndpoint());
        result = HashCodeUtil.hash(result, ((Stub)  wsSMCServiceSoapProxy.getWsSMCServiceSoap()).getUsername());
        result = HashCodeUtil.hash(result, ((Stub)  wsSMCServiceSoapProxy.getWsSMCServiceSoap()).getPassword());
        return result;
    }

}

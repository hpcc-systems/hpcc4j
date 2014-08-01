package org.hpccsystems.ws.client;

import org.apache.axis.client.Stub;
import org.hpccsystems.ws.client.soap.wsdfu.WsDfuServiceSoap;
import org.hpccsystems.ws.client.soap.wsdfu.WsDfuServiceSoapProxy;
import org.hpccsystems.ws.client.utils.Connection;

/**
 * Use as soap client for HPCC WsDFU web service.
 *
 */
public class HPCCWsDFUClient
{
    public static final String WSDFUURI         = "/WsDFU";

    private WsDfuServiceSoapProxy wsDfuServiceSoapProxy    =  null;
    private boolean verbose = false;

    /**
     * @param verbose - sets verbose mode
     */
    public void setVerbose(boolean verbose)
    {
        this.verbose = verbose;
    }

    /**
     * Provides soapproxy object for HPCCWsDFUClient which can be used to access
     * the web service methods directly
     * @return  soapproxy for HPCCWsDFUClient
     * @throws Exception
     */
    public WsDfuServiceSoapProxy getSoapProxy() throws Exception
    {
        if (wsDfuServiceSoapProxy != null)
            return wsDfuServiceSoapProxy;
        else
            throw new Exception("wsDfuServiceSoapProxy not available.");
    }

    /**
     * Provides the WSDL URL originally used to create the underlying stub code
     *
     * @return original WSLD URL
     */
    public static String getOriginalWSDLURL()
    {
        return (new org.hpccsystems.ws.client.soap.wsdfu.WsDfuLocator()).getWsDfuServiceSoapAddress();
    }

    public HPCCWsDFUClient(WsDfuServiceSoapProxy wsDfuServiceSoapProxy)
    {
        this.wsDfuServiceSoapProxy = wsDfuServiceSoapProxy;
    }

    public HPCCWsDFUClient(Connection baseConnection)
    {
       this(baseConnection.getProtocol(), baseConnection.getHost(), baseConnection.getPort(), baseConnection.getUserName(), baseConnection.getPassword());
    }

    public HPCCWsDFUClient(String protocol, String targetHost, String targetPort, String user, String pass)
    {
        String address = Connection.buildUrl(protocol, targetHost, targetPort, WSDFUURI);

        initHPCCWsDFUSoapProxy(address, user, pass);
    }

    /**
     * Initializes the service's underlying soap proxy. Should only be used by constructors
     *
     * @param baseURL   Target service base URL
     * @param user      User credentials
     * @param pass      User credentials
     */
    private void initHPCCWsDFUSoapProxy(String baseURL, String user, String pass)
    {
        wsDfuServiceSoapProxy = new WsDfuServiceSoapProxy(baseURL);
        if (wsDfuServiceSoapProxy != null)
        {
                WsDfuServiceSoap wsDfuServiceSoap = wsDfuServiceSoapProxy.getWsDfuServiceSoap();
                if (wsDfuServiceSoap != null)
                {
                    if (user != null && pass != null)
                        Connection.initStub((Stub) wsDfuServiceSoap, user, pass);
                }
        }
    }
}

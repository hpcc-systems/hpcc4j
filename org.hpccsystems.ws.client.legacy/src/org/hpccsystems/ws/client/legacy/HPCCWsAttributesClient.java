package org.hpccsystems.ws.client.legacy;

import org.apache.axis.client.Stub;
import org.hpccsystems.ws.client.legacy.soap.WsAttributesServiceSoap;
import org.hpccsystems.ws.client.legacy.soap.WsAttributesServiceSoapProxy;
import org.hpccsystems.ws.client.utils.Connection;

public class HPCCWsAttributesClient
{
    public static final String WSATTRIBUTESWSDLURI         = "/WsAttributes";

    private WsAttributesServiceSoapProxy wsAttributesServiceSoapProxy    =  null;
    private boolean verbose = false;

    /**
     * @param verbose - sets verbose mode
     */
    public void setVerbose(boolean verbose)
    {
        this.verbose = verbose;
    }

    /**
     * Provides soapproxy object for HPCCWsAttributesClient which can be used to access
     * the web service methods directly
     * @return  soapproxy for HPCCWsAttributesClient
     * @throws Exception if soapproxy not available.
     */
    public WsAttributesServiceSoapProxy getSoapProxy() throws Exception
    {
        if (wsAttributesServiceSoapProxy != null)
            return wsAttributesServiceSoapProxy;
        else
            throw new Exception("wsAttributesServiceSoapProxy not available.");
    }

    /**
     * Provides the WSDL URL originally used to create the underlying stub code
     *
     * @return original WSLD URL
     */
    public static String getOriginalWSDLURL()
    {
        return (new org.hpccsystems.ws.client.legacy.soap.WsAttributesLocator().getWsAttributesServiceSoapAddress());
    }

    public HPCCWsAttributesClient(WsAttributesServiceSoapProxy wsAttributesServiceSoapProxy)
    {
        this.wsAttributesServiceSoapProxy = wsAttributesServiceSoapProxy;
    }

    public HPCCWsAttributesClient(Connection baseConnection)
    {
       this(baseConnection.getProtocol(), baseConnection.getHost(), baseConnection.getPort(), baseConnection.getUserName(), baseConnection.getPassword());
    }

    public HPCCWsAttributesClient(String protocol, String targetHost, String targetPort, String user, String pass)
    {
        String address = Connection.buildUrl(protocol, targetHost, targetPort, WSATTRIBUTESWSDLURI);

        initWsAttributesSoapProxy(address, user, pass);
    }

    /**
     * Initializes the service's underlying soap proxy. Should only be used by constructors
     *
     * @param baseURL   Target service base URL
     * @param user      User credentials
     * @param pass      User credentials
     */
    private void initWsAttributesSoapProxy(String baseURL, String user, String pass)
    {
        wsAttributesServiceSoapProxy = new WsAttributesServiceSoapProxy(baseURL);
        if (wsAttributesServiceSoapProxy != null)
        {
            WsAttributesServiceSoap wsAttributesServiceSoap = wsAttributesServiceSoapProxy.getWsAttributesServiceSoap();
            if (wsAttributesServiceSoap != null)
            {
                if (user != null && pass != null)
                    Connection.initStub((Stub) wsAttributesServiceSoap, user, pass);
            }
        }
    }
}

package org.hpccsystems.ws.client;

import org.apache.axis.client.Stub;
import org.hpccsystems.ws.client.soap.filespray.FileSprayServiceSoapProxy;
import org.hpccsystems.ws.client.soap.wsdfu.WsDfuServiceSoap;
import org.hpccsystems.ws.client.soap.wsdfu.WsDfuServiceSoapProxy;
import org.hpccsystems.ws.client.utils.Connection;

/**
 * Use as soap client for HPCC WsDFU web service.
 *
 */
public class HPCCWsDFU
{
    public static final String WSDFUURI         = "/WsDFU";

    private WsDfuServiceSoapProxy wsDfuServiceSoapProxy    =  null;
    private boolean verbosemode = false;

    public WsDfuServiceSoapProxy getSoapProxy()
    {
        return wsDfuServiceSoapProxy;
    }

    public static String getOriginalWSDLURL()
    {
        return (new org.hpccsystems.ws.client.soap.wsdfu.WsDfuLocator()).getWsDfuServiceSoapAddress();
    }

    public HPCCWsDFU(WsDfuServiceSoapProxy wsDfuServiceSoapProxy)
    {
        this.wsDfuServiceSoapProxy = wsDfuServiceSoapProxy;
    }

    public HPCCWsDFU(Connection baseConnection)
    {
       this(baseConnection.getProtocol(), baseConnection.getHost(), baseConnection.getPort(), baseConnection.getUserName(), baseConnection.getPassword());
    }

    public HPCCWsDFU(String protocol, String targetHost, String targetPort, String user, String pass)
    {
        String address = Connection.buildUrl(protocol, targetHost, targetPort, WSDFUURI);

        initHPCCWsDFUSoapProxy(address, user, pass);
    }

    public void initHPCCWsDFUSoapProxy(String baseURL, String user, String pass)
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

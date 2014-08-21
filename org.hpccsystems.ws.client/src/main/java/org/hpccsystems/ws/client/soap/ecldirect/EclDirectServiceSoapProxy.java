package org.hpccsystems.ws.client.soap.ecldirect;

public class EclDirectServiceSoapProxy implements org.hpccsystems.ws.client.soap.ecldirect.EclDirectServiceSoap {
  private String _endpoint = null;
  private org.hpccsystems.ws.client.soap.ecldirect.EclDirectServiceSoap eclDirectServiceSoap = null;
  
  public EclDirectServiceSoapProxy() {
    _initEclDirectServiceSoapProxy();
  }
  
  public EclDirectServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initEclDirectServiceSoapProxy();
  }
  
  private void _initEclDirectServiceSoapProxy() {
    try {
      eclDirectServiceSoap = (new org.hpccsystems.ws.client.soap.ecldirect.EclDirectLocator()).getEclDirectServiceSoap();
      if (eclDirectServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)eclDirectServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)eclDirectServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (eclDirectServiceSoap != null)
      ((javax.xml.rpc.Stub)eclDirectServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.hpccsystems.ws.client.soap.ecldirect.EclDirectServiceSoap getEclDirectServiceSoap() {
    if (eclDirectServiceSoap == null)
      _initEclDirectServiceSoapProxy();
    return eclDirectServiceSoap;
  }
  
  public org.hpccsystems.ws.client.soap.ecldirect.RunEclExResponse runEclEx(org.hpccsystems.ws.client.soap.ecldirect.RunEclExRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.ecldirect.ArrayOfEspException{
    if (eclDirectServiceSoap == null)
      _initEclDirectServiceSoapProxy();
    return eclDirectServiceSoap.runEclEx(parameters);
  }
  
  
}
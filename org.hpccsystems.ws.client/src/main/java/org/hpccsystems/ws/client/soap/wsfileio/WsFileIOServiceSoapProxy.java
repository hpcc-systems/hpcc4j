package org.hpccsystems.ws.client.soap.wsfileio;

public class WsFileIOServiceSoapProxy implements org.hpccsystems.ws.client.soap.wsfileio.WsFileIOServiceSoap {
  private String _endpoint = null;
  private org.hpccsystems.ws.client.soap.wsfileio.WsFileIOServiceSoap wsFileIOServiceSoap = null;
  
  public WsFileIOServiceSoapProxy() {
    _initWsFileIOServiceSoapProxy();
  }
  
  public WsFileIOServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWsFileIOServiceSoapProxy();
  }
  
  private void _initWsFileIOServiceSoapProxy() {
    try {
      wsFileIOServiceSoap = (new org.hpccsystems.ws.client.soap.wsfileio.WsFileIOLocator()).getWsFileIOServiceSoap();
      if (wsFileIOServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wsFileIOServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wsFileIOServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wsFileIOServiceSoap != null)
      ((javax.xml.rpc.Stub)wsFileIOServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.hpccsystems.ws.client.soap.wsfileio.WsFileIOServiceSoap getWsFileIOServiceSoap() {
    if (wsFileIOServiceSoap == null)
      _initWsFileIOServiceSoapProxy();
    return wsFileIOServiceSoap;
  }
  
  public org.hpccsystems.ws.client.soap.wsfileio.CreateFileResponse createFile(org.hpccsystems.ws.client.soap.wsfileio.CreateFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsfileio.ArrayOfEspException{
    if (wsFileIOServiceSoap == null)
      _initWsFileIOServiceSoapProxy();
    return wsFileIOServiceSoap.createFile(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsfileio.ReadFileDataResponse readFileData(org.hpccsystems.ws.client.soap.wsfileio.ReadFileDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsfileio.ArrayOfEspException{
    if (wsFileIOServiceSoap == null)
      _initWsFileIOServiceSoapProxy();
    return wsFileIOServiceSoap.readFileData(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsfileio.WriteFileDataResponse writeFileData(org.hpccsystems.ws.client.soap.wsfileio.WriteFileDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsfileio.ArrayOfEspException{
    if (wsFileIOServiceSoap == null)
      _initWsFileIOServiceSoapProxy();
    return wsFileIOServiceSoap.writeFileData(parameters);
  }
  
  
}
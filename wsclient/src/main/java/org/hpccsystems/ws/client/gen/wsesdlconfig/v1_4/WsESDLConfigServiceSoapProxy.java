package org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4;

public class WsESDLConfigServiceSoapProxy implements org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.WsESDLConfigServiceSoap {
  private String _endpoint = null;
  private org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.WsESDLConfigServiceSoap wsESDLConfigServiceSoap = null;
  
  public WsESDLConfigServiceSoapProxy() {
    _initWsESDLConfigServiceSoapProxy();
  }
  
  public WsESDLConfigServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWsESDLConfigServiceSoapProxy();
  }
  
  private void _initWsESDLConfigServiceSoapProxy() {
    try {
      wsESDLConfigServiceSoap = (new org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.WsESDLConfigLocator()).getWsESDLConfigServiceSoap();
      if (wsESDLConfigServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wsESDLConfigServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wsESDLConfigServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wsESDLConfigServiceSoap != null)
      ((javax.xml.rpc.Stub)wsESDLConfigServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.WsESDLConfigServiceSoap getWsESDLConfigServiceSoap() {
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap;
  }
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ConfigureESDLBindingMethodResponse configureESDLBindingMethod(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ConfigureESDLBindingMethodRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ArrayOfEspException{
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap.configureESDLBindingMethod(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.DeleteESDLRegistryEntryResponse deleteESDLBinding(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.DeleteESDLBindingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ArrayOfEspException{
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap.deleteESDLBinding(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.DeleteESDLRegistryEntryResponse deleteESDLDefinition(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.DeleteESDLDefinitionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ArrayOfEspException{
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap.deleteESDLDefinition(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.EchoResponse echo(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.EchoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ArrayOfEspException{
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap.echo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.GetESDLBindingResponse getESDLBinding(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.GetESDLBindingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ArrayOfEspException{
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap.getESDLBinding(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.GetESDLDefinitionResponse getESDLDefinition(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.GetESDLDefinitionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ArrayOfEspException{
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap.getESDLDefinition(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ListDESDLEspBindingsResp listDESDLEspBindings(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ListDESDLEspBindingsReq parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ArrayOfEspException{
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap.listDESDLEspBindings(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ListESDLBindingsResponse listESDLBindings(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ListESDLBindingsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ArrayOfEspException{
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap.listESDLBindings(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ListESDLDefinitionsResponse listESDLDefinitions(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ListESDLDefinitionsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ArrayOfEspException{
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap.listESDLDefinitions(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.WsESDLConfigPingResponse ping(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.WsESDLConfigPingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ArrayOfEspException{
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap.ping(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.PublishESDLBindingResponse publishESDLBinding(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.PublishESDLBindingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ArrayOfEspException{
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap.publishESDLBinding(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.PublishESDLDefinitionResponse publishESDLDefinition(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.PublishESDLDefinitionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ArrayOfEspException{
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap.publishESDLDefinition(parameters);
  }
  
  
}
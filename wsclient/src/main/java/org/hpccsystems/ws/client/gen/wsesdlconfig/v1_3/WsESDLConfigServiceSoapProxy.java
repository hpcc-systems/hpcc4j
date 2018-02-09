package org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3;

public class WsESDLConfigServiceSoapProxy implements org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.WsESDLConfigServiceSoap {
  private String _endpoint = null;
  private org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.WsESDLConfigServiceSoap wsESDLConfigServiceSoap = null;
  
  public WsESDLConfigServiceSoapProxy() {
    _initWsESDLConfigServiceSoapProxy();
  }
  
  public WsESDLConfigServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWsESDLConfigServiceSoapProxy();
  }
  
  private void _initWsESDLConfigServiceSoapProxy() {
    try {
      wsESDLConfigServiceSoap = (new org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.WsESDLConfigLocator()).getWsESDLConfigServiceSoap();
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
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.WsESDLConfigServiceSoap getWsESDLConfigServiceSoap() {
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap;
  }
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ConfigureESDLBindingMethodResponse configureESDLBindingMethod(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ConfigureESDLBindingMethodRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ArrayOfEspException{
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap.configureESDLBindingMethod(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.DeleteESDLRegistryEntryResponse deleteESDLBinding(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.DeleteESDLBindingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ArrayOfEspException{
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap.deleteESDLBinding(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.DeleteESDLRegistryEntryResponse deleteESDLDefinition(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.DeleteESDLDefinitionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ArrayOfEspException{
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap.deleteESDLDefinition(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.EchoResponse echo(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.EchoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ArrayOfEspException{
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap.echo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.GetESDLBindingResponse getESDLBinding(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.GetESDLBindingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ArrayOfEspException{
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap.getESDLBinding(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.GetESDLDefinitionResponse getESDLDefinition(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.GetESDLDefinitionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ArrayOfEspException{
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap.getESDLDefinition(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ListDESDLEspBindingsResp listDESDLEspBindings(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ListDESDLEspBindingsReq parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ArrayOfEspException{
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap.listDESDLEspBindings(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ListESDLBindingsResponse listESDLBindings(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ListESDLBindingsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ArrayOfEspException{
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap.listESDLBindings(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ListESDLDefinitionsResponse listESDLDefinitions(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ListESDLDefinitionsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ArrayOfEspException{
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap.listESDLDefinitions(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.WsESDLConfigPingResponse ping(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.WsESDLConfigPingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ArrayOfEspException{
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap.ping(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.PublishESDLBindingResponse publishESDLBinding(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.PublishESDLBindingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ArrayOfEspException{
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap.publishESDLBinding(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.PublishESDLDefinitionResponse publishESDLDefinition(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.PublishESDLDefinitionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3.ArrayOfEspException{
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap.publishESDLDefinition(parameters);
  }
  
  
}
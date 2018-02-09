package org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive;

public class WsESDLConfigServiceSoapProxy implements org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.WsESDLConfigServiceSoap {
  private String _endpoint = null;
  private org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.WsESDLConfigServiceSoap wsESDLConfigServiceSoap = null;
  
  public WsESDLConfigServiceSoapProxy() {
    _initWsESDLConfigServiceSoapProxy();
  }
  
  public WsESDLConfigServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWsESDLConfigServiceSoapProxy();
  }
  
  private void _initWsESDLConfigServiceSoapProxy() {
    try {
      wsESDLConfigServiceSoap = (new org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.WsESDLConfigLocator()).getWsESDLConfigServiceSoap();
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
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.WsESDLConfigServiceSoap getWsESDLConfigServiceSoap() {
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap;
  }
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.ConfigureESDLBindingMethodResponse configureESDLBindingMethod(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.ConfigureESDLBindingMethodRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.ArrayOfEspException{
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap.configureESDLBindingMethod(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.DeleteESDLRegistryEntryResponse deleteESDLBinding(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.DeleteESDLBindingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.ArrayOfEspException{
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap.deleteESDLBinding(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.DeleteESDLRegistryEntryResponse deleteESDLDefinition(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.DeleteESDLDefinitionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.ArrayOfEspException{
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap.deleteESDLDefinition(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.EchoResponse echo(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.EchoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.ArrayOfEspException{
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap.echo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.GetESDLBindingResponse getESDLBinding(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.GetESDLBindingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.ArrayOfEspException{
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap.getESDLBinding(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.GetESDLDefinitionResponse getESDLDefinition(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.GetESDLDefinitionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.ArrayOfEspException{
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap.getESDLDefinition(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.ListDESDLEspBindingsResp listDESDLEspBindings(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.ListDESDLEspBindingsReq parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.ArrayOfEspException{
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap.listDESDLEspBindings(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.ListESDLBindingsResponse listESDLBindings(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.ListESDLBindingsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.ArrayOfEspException{
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap.listESDLBindings(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.ListESDLDefinitionsResponse listESDLDefinitions(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.ListESDLDefinitionsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.ArrayOfEspException{
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap.listESDLDefinitions(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.WsESDLConfigPingResponse ping(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.WsESDLConfigPingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.ArrayOfEspException{
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap.ping(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.PublishESDLBindingResponse publishESDLBinding(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.PublishESDLBindingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.ArrayOfEspException{
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap.publishESDLBinding(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.PublishESDLDefinitionResponse publishESDLDefinition(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.PublishESDLDefinitionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.ArrayOfEspException{
    if (wsESDLConfigServiceSoap == null)
      _initWsESDLConfigServiceSoapProxy();
    return wsESDLConfigServiceSoap.publishESDLDefinition(parameters);
  }
  
  
}
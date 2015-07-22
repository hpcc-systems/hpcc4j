package org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21;

public class WsAttributesServiceSoapProxy implements org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.WsAttributesServiceSoap {
  private String _endpoint = null;
  private org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.WsAttributesServiceSoap wsAttributesServiceSoap = null;
  
  public WsAttributesServiceSoapProxy() {
    _initWsAttributesServiceSoapProxy();
  }
  
  public WsAttributesServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWsAttributesServiceSoapProxy();
  }
  
  private void _initWsAttributesServiceSoapProxy() {
    try {
      wsAttributesServiceSoap = (new org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.WsAttributesLocator()).getWsAttributesServiceSoap();
      if (wsAttributesServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wsAttributesServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wsAttributesServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wsAttributesServiceSoap != null)
      ((javax.xml.rpc.Stub)wsAttributesServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.WsAttributesServiceSoap getWsAttributesServiceSoap() {
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap;
  }
  
  public org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.UpdateAttributesResponse checkinAttributes(org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.CheckinAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.checkinAttributes(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.UpdateAttributesResponse checkoutAttributes(org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.CheckoutAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.checkoutAttributes(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.CreateAttributeResponse createAttribute(org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.CreateAttribute parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.createAttribute(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.CreateLabelResponse createLabel(org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.CreateLabel parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.createLabel(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.CreateModuleResponse createModule(org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.CreateModule parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.createModule(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.UpdateAttributesResponse deleteAttributes(org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.DeleteAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.deleteAttributes(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.DeleteLabelResponse deleteLabel(org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.DeleteLabel parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.deleteLabel(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.DeleteModuleResponse deleteModule(org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.DeleteModule parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.deleteModule(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.FindAttributesResponse findAttributes(org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.FindAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.findAttributes(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.GetAttributeResponse getAttribute(org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.GetAttribute parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.getAttribute(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.GetAttributeHistoryResponse getAttributeHistory(org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.GetAttributeHistory parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.getAttributeHistory(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.GetAttributeLabelsResponse getAttributeLabels(org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.GetAttributeLabels parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.getAttributeLabels(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.GetAttributesResponse getAttributes(org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.GetAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.getAttributes(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.GetLabelsResponse getLabels(org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.GetLabels parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.getLabels(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.GetModulesResponse getModules(org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.GetModules parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.getModules(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.UpdateAttributesResponse importAttributes(org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ImportAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.importAttributes(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ListAttributeTypesResponse listAttributeTypes() throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.listAttributeTypes();
  }
  
  public org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.UpdateAttributesResponse renameAttributes(org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.RenameAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.renameAttributes(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.RenameModuleResponse renameModule(org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.RenameModule parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.renameModule(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.UpdateAttributesResponse rollbackAttributes(org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.RollbackAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.rollbackAttributes(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.UpdateAttributesResponse saveAttributes(org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.SaveAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.saveAttributes(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.SupportsEarMarkResponse supportsEarMark() throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.supportsEarMark();
  }
  
  public org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.UpdateLabelResponse updateLabel(org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.UpdateLabel parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.updateLabel(parameters);
  }
  
  
}
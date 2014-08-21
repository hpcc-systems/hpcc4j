package org.hpccsystems.ws.client.legacy.soap;

public class WsAttributesServiceSoapProxy implements org.hpccsystems.ws.client.legacy.soap.WsAttributesServiceSoap {
  private String _endpoint = null;
  private org.hpccsystems.ws.client.legacy.soap.WsAttributesServiceSoap wsAttributesServiceSoap = null;
  
  public WsAttributesServiceSoapProxy() {
    _initWsAttributesServiceSoapProxy();
  }
  
  public WsAttributesServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWsAttributesServiceSoapProxy();
  }
  
  private void _initWsAttributesServiceSoapProxy() {
    try {
      wsAttributesServiceSoap = (new org.hpccsystems.ws.client.legacy.soap.WsAttributesLocator()).getWsAttributesServiceSoap();
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
  
  public org.hpccsystems.ws.client.legacy.soap.WsAttributesServiceSoap getWsAttributesServiceSoap() {
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap;
  }
  
  public org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse checkinAttributes(org.hpccsystems.ws.client.legacy.soap.CheckinAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.checkinAttributes(parameters);
  }
  
  public org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse checkoutAttributes(org.hpccsystems.ws.client.legacy.soap.CheckoutAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.checkoutAttributes(parameters);
  }
  
  public org.hpccsystems.ws.client.legacy.soap.CreateAttributeResponse createAttribute(org.hpccsystems.ws.client.legacy.soap.CreateAttribute parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.createAttribute(parameters);
  }
  
  public org.hpccsystems.ws.client.legacy.soap.CreateLabelResponse createLabel(org.hpccsystems.ws.client.legacy.soap.CreateLabel parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.createLabel(parameters);
  }
  
  public org.hpccsystems.ws.client.legacy.soap.CreateModuleResponse createModule(org.hpccsystems.ws.client.legacy.soap.CreateModule parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.createModule(parameters);
  }
  
  public org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse deleteAttributes(org.hpccsystems.ws.client.legacy.soap.DeleteAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.deleteAttributes(parameters);
  }
  
  public org.hpccsystems.ws.client.legacy.soap.DeleteLabelResponse deleteLabel(org.hpccsystems.ws.client.legacy.soap.DeleteLabel parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.deleteLabel(parameters);
  }
  
  public org.hpccsystems.ws.client.legacy.soap.DeleteModuleResponse deleteModule(org.hpccsystems.ws.client.legacy.soap.DeleteModule parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.deleteModule(parameters);
  }
  
  public org.hpccsystems.ws.client.legacy.soap.FindAttributesResponse findAttributes(org.hpccsystems.ws.client.legacy.soap.FindAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.findAttributes(parameters);
  }
  
  public org.hpccsystems.ws.client.legacy.soap.GetAttributeResponse getAttribute(org.hpccsystems.ws.client.legacy.soap.GetAttribute parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.getAttribute(parameters);
  }
  
  public org.hpccsystems.ws.client.legacy.soap.GetAttributeHistoryResponse getAttributeHistory(org.hpccsystems.ws.client.legacy.soap.GetAttributeHistory parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.getAttributeHistory(parameters);
  }
  
  public org.hpccsystems.ws.client.legacy.soap.GetAttributeLabelsResponse getAttributeLabels(org.hpccsystems.ws.client.legacy.soap.GetAttributeLabels parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.getAttributeLabels(parameters);
  }
  
  public org.hpccsystems.ws.client.legacy.soap.GetAttributesResponse getAttributes(org.hpccsystems.ws.client.legacy.soap.GetAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.getAttributes(parameters);
  }
  
  public org.hpccsystems.ws.client.legacy.soap.GetLabelsResponse getLabels(org.hpccsystems.ws.client.legacy.soap.GetLabels parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.getLabels(parameters);
  }
  
  public org.hpccsystems.ws.client.legacy.soap.GetModulesResponse getModules(org.hpccsystems.ws.client.legacy.soap.GetModules parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.getModules(parameters);
  }
  
  public org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse importAttributes(org.hpccsystems.ws.client.legacy.soap.ImportAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.importAttributes(parameters);
  }
  
  public org.hpccsystems.ws.client.legacy.soap.ListAttributeTypesResponse listAttributeTypes() throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.listAttributeTypes();
  }
  
  public org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse renameAttributes(org.hpccsystems.ws.client.legacy.soap.RenameAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.renameAttributes(parameters);
  }
  
  public org.hpccsystems.ws.client.legacy.soap.RenameModuleResponse renameModule(org.hpccsystems.ws.client.legacy.soap.RenameModule parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.renameModule(parameters);
  }
  
  public org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse rollbackAttributes(org.hpccsystems.ws.client.legacy.soap.RollbackAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.rollbackAttributes(parameters);
  }
  
  public org.hpccsystems.ws.client.legacy.soap.UpdateAttributesResponse saveAttributes(org.hpccsystems.ws.client.legacy.soap.SaveAttributes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.saveAttributes(parameters);
  }
  
  public org.hpccsystems.ws.client.legacy.soap.SupportsEarMarkResponse supportsEarMark() throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.supportsEarMark();
  }
  
  public org.hpccsystems.ws.client.legacy.soap.UpdateLabelResponse updateLabel(org.hpccsystems.ws.client.legacy.soap.UpdateLabel parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.legacy.soap.ArrayOfEspException{
    if (wsAttributesServiceSoap == null)
      _initWsAttributesServiceSoapProxy();
    return wsAttributesServiceSoap.updateLabel(parameters);
  }
  
  
}
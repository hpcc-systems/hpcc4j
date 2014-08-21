package org.hpccsystems.ws.client.soap.wsdfu;

public class WsDfuServiceSoapProxy implements org.hpccsystems.ws.client.soap.wsdfu.WsDfuServiceSoap {
  private String _endpoint = null;
  private org.hpccsystems.ws.client.soap.wsdfu.WsDfuServiceSoap wsDfuServiceSoap = null;
  
  public WsDfuServiceSoapProxy() {
    _initWsDfuServiceSoapProxy();
  }
  
  public WsDfuServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWsDfuServiceSoapProxy();
  }
  
  private void _initWsDfuServiceSoapProxy() {
    try {
      wsDfuServiceSoap = (new org.hpccsystems.ws.client.soap.wsdfu.WsDfuLocator()).getWsDfuServiceSoap();
      if (wsDfuServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wsDfuServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wsDfuServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wsDfuServiceSoap != null)
      ((javax.xml.rpc.Stub)wsDfuServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.hpccsystems.ws.client.soap.wsdfu.WsDfuServiceSoap getWsDfuServiceSoap() {
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap;
  }
  
  public org.hpccsystems.ws.client.soap.wsdfu.AddResponse add(org.hpccsystems.ws.client.soap.wsdfu.AddRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsdfu.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.add(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsdfu.AddRemoteResponse addRemote(org.hpccsystems.ws.client.soap.wsdfu.AddRemoteRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsdfu.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.addRemote(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsdfu.AddtoSuperfileResponse addtoSuperfile(org.hpccsystems.ws.client.soap.wsdfu.AddtoSuperfileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsdfu.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.addtoSuperfile(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsdfu.DFUArrayActionResponse DFUArrayAction(org.hpccsystems.ws.client.soap.wsdfu.DFUArrayActionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsdfu.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUArrayAction(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsdfu.DFUBrowseDataResponse DFUBrowseData(org.hpccsystems.ws.client.soap.wsdfu.DFUBrowseDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsdfu.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUBrowseData(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsdfu.DFUDefFileResponse DFUDefFile(org.hpccsystems.ws.client.soap.wsdfu.DFUDefFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsdfu.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUDefFile(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsdfu.DFUFileViewResponse DFUFileView(org.hpccsystems.ws.client.soap.wsdfu.DFUFileViewRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsdfu.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUFileView(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsdfu.DFUGetDataColumnsResponse DFUGetDataColumns(org.hpccsystems.ws.client.soap.wsdfu.DFUGetDataColumnsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsdfu.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUGetDataColumns(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsdfu.DFUInfoResponse DFUInfo(org.hpccsystems.ws.client.soap.wsdfu.DFUInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsdfu.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsdfu.DFUQueryResponse DFUQuery(org.hpccsystems.ws.client.soap.wsdfu.DFUQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsdfu.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsdfu.DFUSearchResponse DFUSearch(org.hpccsystems.ws.client.soap.wsdfu.DFUSearchRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsdfu.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUSearch(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsdfu.DFUSearchDataResponse DFUSearchData(org.hpccsystems.ws.client.soap.wsdfu.DFUSearchDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsdfu.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUSearchData(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsdfu.DFUSpaceResponse DFUSpace(org.hpccsystems.ws.client.soap.wsdfu.DFUSpaceRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsdfu.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUSpace(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsdfu.SavexmlResponse savexml(org.hpccsystems.ws.client.soap.wsdfu.SavexmlRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsdfu.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.savexml(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsdfu.SuperfileActionResponse superfileAction(org.hpccsystems.ws.client.soap.wsdfu.SuperfileActionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsdfu.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.superfileAction(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsdfu.SuperfileListResponse superfileList(org.hpccsystems.ws.client.soap.wsdfu.SuperfileListRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsdfu.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.superfileList(parameters);
  }
  
  
}
package org.hpccsystems.ws.client.gen.wsdfu.v1_36;

public class WsDfuServiceSoapProxy implements org.hpccsystems.ws.client.gen.wsdfu.v1_36.WsDfuServiceSoap {
  private String _endpoint = null;
  private org.hpccsystems.ws.client.gen.wsdfu.v1_36.WsDfuServiceSoap wsDfuServiceSoap = null;
  
  public WsDfuServiceSoapProxy() {
    _initWsDfuServiceSoapProxy();
  }
  
  public WsDfuServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWsDfuServiceSoapProxy();
  }
  
  private void _initWsDfuServiceSoapProxy() {
    try {
      wsDfuServiceSoap = (new org.hpccsystems.ws.client.gen.wsdfu.v1_36.WsDfuLocator()).getWsDfuServiceSoap();
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
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_36.WsDfuServiceSoap getWsDfuServiceSoap() {
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap;
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_36.AddResponse add(org.hpccsystems.ws.client.gen.wsdfu.v1_36.AddRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_36.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.add(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_36.AddRemoteResponse addRemote(org.hpccsystems.ws.client.gen.wsdfu.v1_36.AddRemoteRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_36.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.addRemote(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_36.AddtoSuperfileResponse addtoSuperfile(org.hpccsystems.ws.client.gen.wsdfu.v1_36.AddtoSuperfileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_36.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.addtoSuperfile(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUArrayActionResponse DFUArrayAction(org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUArrayActionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_36.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUArrayAction(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUBrowseDataResponse DFUBrowseData(org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUBrowseDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_36.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUBrowseData(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUDefFileResponse DFUDefFile(org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUDefFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_36.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUDefFile(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUFileViewResponse DFUFileView(org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUFileViewRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_36.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUFileView(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUGetDataColumnsResponse DFUGetDataColumns(org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUGetDataColumnsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_36.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUGetDataColumns(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUGetFileMetaDataResponse DFUGetFileMetaData(org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUGetFileMetaDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_36.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUGetFileMetaData(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUInfoResponse DFUInfo(org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_36.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUQueryResponse DFUQuery(org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_36.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUSearchResponse DFUSearch(org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUSearchRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_36.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUSearch(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUSearchDataResponse DFUSearchData(org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUSearchDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_36.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUSearchData(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUSpaceResponse DFUSpace(org.hpccsystems.ws.client.gen.wsdfu.v1_36.DFUSpaceRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_36.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUSpace(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_36.EraseHistoryResponse eraseHistory(org.hpccsystems.ws.client.gen.wsdfu.v1_36.EraseHistoryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_36.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.eraseHistory(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_36.ListHistoryResponse listHistory(org.hpccsystems.ws.client.gen.wsdfu.v1_36.ListHistoryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_36.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.listHistory(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_36.SavexmlResponse savexml(org.hpccsystems.ws.client.gen.wsdfu.v1_36.SavexmlRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_36.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.savexml(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_36.SuperfileActionResponse superfileAction(org.hpccsystems.ws.client.gen.wsdfu.v1_36.SuperfileActionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_36.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.superfileAction(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_36.SuperfileListResponse superfileList(org.hpccsystems.ws.client.gen.wsdfu.v1_36.SuperfileListRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_36.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.superfileList(parameters);
  }
  
  
}
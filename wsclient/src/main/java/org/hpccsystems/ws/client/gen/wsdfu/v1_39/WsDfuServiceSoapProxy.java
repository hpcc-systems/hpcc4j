package org.hpccsystems.ws.client.gen.wsdfu.v1_39;

public class WsDfuServiceSoapProxy implements org.hpccsystems.ws.client.gen.wsdfu.v1_39.WsDfuServiceSoap {
  private String _endpoint = null;
  private org.hpccsystems.ws.client.gen.wsdfu.v1_39.WsDfuServiceSoap wsDfuServiceSoap = null;
  
  public WsDfuServiceSoapProxy() {
    _initWsDfuServiceSoapProxy();
  }
  
  public WsDfuServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWsDfuServiceSoapProxy();
  }
  
  private void _initWsDfuServiceSoapProxy() {
    try {
      wsDfuServiceSoap = (new org.hpccsystems.ws.client.gen.wsdfu.v1_39.WsDfuLocator()).getWsDfuServiceSoap();
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
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_39.WsDfuServiceSoap getWsDfuServiceSoap() {
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap;
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_39.AddResponse add(org.hpccsystems.ws.client.gen.wsdfu.v1_39.AddRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.add(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_39.AddRemoteResponse addRemote(org.hpccsystems.ws.client.gen.wsdfu.v1_39.AddRemoteRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.addRemote(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_39.AddtoSuperfileResponse addtoSuperfile(org.hpccsystems.ws.client.gen.wsdfu.v1_39.AddtoSuperfileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.addtoSuperfile(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUArrayActionResponse DFUArrayAction(org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUArrayActionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUArrayAction(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUBrowseDataResponse DFUBrowseData(org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUBrowseDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUBrowseData(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUDefFileResponse DFUDefFile(org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUDefFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUDefFile(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUFileAccessResponse DFUFileAccess(org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUFileAccessRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUFileAccess(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUFileViewResponse DFUFileView(org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUFileViewRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUFileView(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUGetDataColumnsResponse DFUGetDataColumns(org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUGetDataColumnsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUGetDataColumns(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUGetFileMetaDataResponse DFUGetFileMetaData(org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUGetFileMetaDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUGetFileMetaData(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUInfoResponse DFUInfo(org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUQueryResponse DFUQuery(org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFURecordTypeInfoResponse DFURecordTypeInfo(org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFURecordTypeInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFURecordTypeInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUSearchResponse DFUSearch(org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUSearchRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUSearch(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUSearchDataResponse DFUSearchData(org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUSearchDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUSearchData(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUSpaceResponse DFUSpace(org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUSpaceRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUSpace(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_39.EclRecordTypeInfoResponse eclRecordTypeInfo(org.hpccsystems.ws.client.gen.wsdfu.v1_39.EclRecordTypeInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.eclRecordTypeInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_39.EraseHistoryResponse eraseHistory(org.hpccsystems.ws.client.gen.wsdfu.v1_39.EraseHistoryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.eraseHistory(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_39.ListHistoryResponse listHistory(org.hpccsystems.ws.client.gen.wsdfu.v1_39.ListHistoryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.listHistory(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_39.WsDfuPingResponse ping(org.hpccsystems.ws.client.gen.wsdfu.v1_39.WsDfuPingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.ping(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_39.SavexmlResponse savexml(org.hpccsystems.ws.client.gen.wsdfu.v1_39.SavexmlRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.savexml(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_39.SuperfileActionResponse superfileAction(org.hpccsystems.ws.client.gen.wsdfu.v1_39.SuperfileActionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.superfileAction(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_39.SuperfileListResponse superfileList(org.hpccsystems.ws.client.gen.wsdfu.v1_39.SuperfileListRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.superfileList(parameters);
  }
  
  
}
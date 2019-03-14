package org.hpccsystems.ws.client.gen.wsdfu.v1_50;

public class WsDfuServiceSoapProxy implements org.hpccsystems.ws.client.gen.wsdfu.v1_50.WsDfuServiceSoap {
  private String _endpoint = null;
  private org.hpccsystems.ws.client.gen.wsdfu.v1_50.WsDfuServiceSoap wsDfuServiceSoap = null;
  
  public WsDfuServiceSoapProxy() {
    _initWsDfuServiceSoapProxy();
  }
  
  public WsDfuServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWsDfuServiceSoapProxy();
  }
  
  private void _initWsDfuServiceSoapProxy() {
    try {
      wsDfuServiceSoap = (new org.hpccsystems.ws.client.gen.wsdfu.v1_50.WsDfuLocator()).getWsDfuServiceSoap();
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
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_50.WsDfuServiceSoap getWsDfuServiceSoap() {
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap;
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_50.AddResponse add(org.hpccsystems.ws.client.gen.wsdfu.v1_50.AddRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.add(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_50.AddRemoteResponse addRemote(org.hpccsystems.ws.client.gen.wsdfu.v1_50.AddRemoteRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.addRemote(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_50.AddtoSuperfileResponse addtoSuperfile(org.hpccsystems.ws.client.gen.wsdfu.v1_50.AddtoSuperfileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.addtoSuperfile(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUArrayActionResponse DFUArrayAction(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUArrayActionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUArrayAction(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUBrowseDataResponse DFUBrowseData(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUBrowseDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUBrowseData(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUDefFileResponse DFUDefFile(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUDefFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUDefFile(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUFileAccessResponse DFUFileAccess(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUFileAccessRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUFileAccess(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUFileAccessResponse DFUFileAccessV2(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUFileAccessV2Request parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUFileAccessV2(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUFileCreateResponse DFUFileCreate(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUFileCreateRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUFileCreate(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUFileCreateResponse DFUFileCreateV2(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUFileCreateV2Request parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUFileCreateV2(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUFilePublishResponse DFUFilePublish(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUFilePublishRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUFilePublish(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUFileViewResponse DFUFileView(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUFileViewRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUFileView(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUGetDataColumnsResponse DFUGetDataColumns(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUGetDataColumnsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUGetDataColumns(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUGetFileMetaDataResponse DFUGetFileMetaData(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUGetFileMetaDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUGetFileMetaData(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUInfoResponse DFUInfo(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUQueryResponse DFUQuery(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFURecordTypeInfoResponse DFURecordTypeInfo(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFURecordTypeInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFURecordTypeInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUSearchResponse DFUSearch(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUSearchRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUSearch(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUSearchDataResponse DFUSearchData(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUSearchDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUSearchData(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUSpaceResponse DFUSpace(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUSpaceRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUSpace(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_50.EclRecordTypeInfoResponse eclRecordTypeInfo(org.hpccsystems.ws.client.gen.wsdfu.v1_50.EclRecordTypeInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.eclRecordTypeInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_50.EraseHistoryResponse eraseHistory(org.hpccsystems.ws.client.gen.wsdfu.v1_50.EraseHistoryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.eraseHistory(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_50.ListHistoryResponse listHistory(org.hpccsystems.ws.client.gen.wsdfu.v1_50.ListHistoryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.listHistory(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_50.WsDfuPingResponse ping(org.hpccsystems.ws.client.gen.wsdfu.v1_50.WsDfuPingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.ping(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_50.SavexmlResponse savexml(org.hpccsystems.ws.client.gen.wsdfu.v1_50.SavexmlRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.savexml(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_50.SuperfileActionResponse superfileAction(org.hpccsystems.ws.client.gen.wsdfu.v1_50.SuperfileActionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.superfileAction(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_50.SuperfileListResponse superfileList(org.hpccsystems.ws.client.gen.wsdfu.v1_50.SuperfileListRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.superfileList(parameters);
  }
  
  
}
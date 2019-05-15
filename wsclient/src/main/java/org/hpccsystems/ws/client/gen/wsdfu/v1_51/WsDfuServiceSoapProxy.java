package org.hpccsystems.ws.client.gen.wsdfu.v1_51;

public class WsDfuServiceSoapProxy implements org.hpccsystems.ws.client.gen.wsdfu.v1_51.WsDfuServiceSoap {
  private String _endpoint = null;
  private org.hpccsystems.ws.client.gen.wsdfu.v1_51.WsDfuServiceSoap wsDfuServiceSoap = null;
  
  public WsDfuServiceSoapProxy() {
    _initWsDfuServiceSoapProxy();
  }
  
  public WsDfuServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWsDfuServiceSoapProxy();
  }
  
  private void _initWsDfuServiceSoapProxy() {
    try {
      wsDfuServiceSoap = (new org.hpccsystems.ws.client.gen.wsdfu.v1_51.WsDfuLocator()).getWsDfuServiceSoap();
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
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_51.WsDfuServiceSoap getWsDfuServiceSoap() {
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap;
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_51.AddResponse add(org.hpccsystems.ws.client.gen.wsdfu.v1_51.AddRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.add(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_51.AddRemoteResponse addRemote(org.hpccsystems.ws.client.gen.wsdfu.v1_51.AddRemoteRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.addRemote(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_51.AddtoSuperfileResponse addtoSuperfile(org.hpccsystems.ws.client.gen.wsdfu.v1_51.AddtoSuperfileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.addtoSuperfile(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUArrayActionResponse DFUArrayAction(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUArrayActionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUArrayAction(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUBrowseDataResponse DFUBrowseData(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUBrowseDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUBrowseData(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUDefFileResponse DFUDefFile(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUDefFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUDefFile(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileAccessResponse DFUFileAccess(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileAccessRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUFileAccess(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileAccessResponse DFUFileAccessV2(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileAccessV2Request parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUFileAccessV2(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileCreateResponse DFUFileCreate(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileCreateRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUFileCreate(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileCreateResponse DFUFileCreateV2(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileCreateV2Request parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUFileCreateV2(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFilePublishResponse DFUFilePublish(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFilePublishRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUFilePublish(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileViewResponse DFUFileView(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileViewRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUFileView(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUGetDataColumnsResponse DFUGetDataColumns(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUGetDataColumnsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUGetDataColumns(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUGetFileMetaDataResponse DFUGetFileMetaData(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUGetFileMetaDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUGetFileMetaData(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUInfoResponse DFUInfo(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUQueryResponse DFUQuery(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFURecordTypeInfoResponse DFURecordTypeInfo(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFURecordTypeInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFURecordTypeInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUSearchResponse DFUSearch(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUSearchRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUSearch(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUSearchDataResponse DFUSearchData(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUSearchDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUSearchData(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUSpaceResponse DFUSpace(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUSpaceRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.DFUSpace(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_51.EclRecordTypeInfoResponse eclRecordTypeInfo(org.hpccsystems.ws.client.gen.wsdfu.v1_51.EclRecordTypeInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.eclRecordTypeInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_51.EraseHistoryResponse eraseHistory(org.hpccsystems.ws.client.gen.wsdfu.v1_51.EraseHistoryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.eraseHistory(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_51.ListHistoryResponse listHistory(org.hpccsystems.ws.client.gen.wsdfu.v1_51.ListHistoryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.listHistory(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_51.WsDfuPingResponse ping(org.hpccsystems.ws.client.gen.wsdfu.v1_51.WsDfuPingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.ping(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_51.SavexmlResponse savexml(org.hpccsystems.ws.client.gen.wsdfu.v1_51.SavexmlRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.savexml(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_51.SuperfileActionResponse superfileAction(org.hpccsystems.ws.client.gen.wsdfu.v1_51.SuperfileActionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.superfileAction(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsdfu.v1_51.SuperfileListResponse superfileList(org.hpccsystems.ws.client.gen.wsdfu.v1_51.SuperfileListRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException{
    if (wsDfuServiceSoap == null)
      _initWsDfuServiceSoapProxy();
    return wsDfuServiceSoap.superfileList(parameters);
  }
  
  
}
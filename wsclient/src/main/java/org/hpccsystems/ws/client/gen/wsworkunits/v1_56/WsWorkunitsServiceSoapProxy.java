package org.hpccsystems.ws.client.gen.wsworkunits.v1_56;

public class WsWorkunitsServiceSoapProxy implements org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WsWorkunitsServiceSoap {
  private String _endpoint = null;
  private org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WsWorkunitsServiceSoap wsWorkunitsServiceSoap = null;
  
  public WsWorkunitsServiceSoapProxy() {
    _initWsWorkunitsServiceSoapProxy();
  }
  
  public WsWorkunitsServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWsWorkunitsServiceSoapProxy();
  }
  
  private void _initWsWorkunitsServiceSoapProxy() {
    try {
      wsWorkunitsServiceSoap = (new org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WsWorkunitsLocator()).getWsWorkunitsServiceSoap();
      if (wsWorkunitsServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wsWorkunitsServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wsWorkunitsServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wsWorkunitsServiceSoap != null)
      ((javax.xml.rpc.Stub)wsWorkunitsServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WsWorkunitsServiceSoap getWsWorkunitsServiceSoap() {
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap;
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.GVCAjaxGraphResponse GVCAjaxGraph(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.GVCAjaxGraph parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.GVCAjaxGraph(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUAbortResponse WUAbort(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUAbort parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUAbort(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUActionResponse WUAction(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUAction parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUAction(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUAddLocalFileToWorkunitResponse WUAddLocalFileToWorkunit(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUAddLocalFileToWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUAddLocalFileToWorkunit(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUDebugResponse WUCDebug(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCDebug parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCDebug(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCheckFeaturesResponse WUCheckFeatures() throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCheckFeatures();
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobQueueLOGResponse WUClusterJobQueueLOG(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobQueueLOG parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUClusterJobQueueLOG(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobQueueXLSResponse WUClusterJobQueueXLS(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobQueueXLS parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUClusterJobQueueXLS(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobSummaryXLSResponse WUClusterJobSummaryXLS(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobSummaryXLS parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUClusterJobSummaryXLS(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobXLSResponse WUClusterJobXLS(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUClusterJobXLS parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUClusterJobXLS(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCompileECLResponse WUCompileECL(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCompileECL parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCompileECL(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCopyLogicalFilesResponse WUCopyLogicalFiles(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCopyLogicalFiles parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCopyLogicalFiles(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCopyQuerySetResponse WUCopyQuerySet(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCopyQuerySet parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCopyQuerySet(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCreateResponse WUCreate() throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCreate();
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUUpdateResponse WUCreateAndUpdate(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCreateAndUpdate parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCreateAndUpdate(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCreateZAPInfoResponse WUCreateZAPInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUCreateZAPInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCreateZAPInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUDeleteResponse WUDelete(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUDelete parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUDelete(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUDeployWorkunitResponse WUDeployWorkunit(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUDeployWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUDeployWorkunit(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUExportResponse WUExport(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUExport parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUExport(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WULogFileResponse WUFile(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUFile parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUFile(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGVCGraphInfoResponse WUGVCGraphInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGVCGraphInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGVCGraphInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetArchiveFileResponse WUGetArchiveFile(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetArchiveFile parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGetArchiveFile(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetDependancyTreesResponse WUGetDependancyTrees(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetDependancyTrees parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGetDependancyTrees(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetGraphResponse WUGetGraph(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetGraph parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGetGraph(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetGraphNameAndTypesResponse WUGetGraphNameAndTypes(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetGraphNameAndTypes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGetGraphNameAndTypes(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetStatsResponse WUGetStats(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetStats parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGetStats(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetZAPInfoResponse WUGetZAPInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGetZAPInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGetZAPInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGraphInfoResponse WUGraphInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGraphInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGraphInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGraphTimingResponse WUGraphTiming(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUGraphTiming parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGraphTiming(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUInfoResponse WUInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUInfoResponse WUInfoDetails(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUInfoDetails parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUInfoDetails(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUJobListResponse WUJobList(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUJobList parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUJobList(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WULightWeightQueryResponse WULightWeightQuery(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WULightWeightQuery parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WULightWeightQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListArchiveFilesResponse WUListArchiveFiles(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListArchiveFiles parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUListArchiveFiles(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListLocalFileRequiredResponse WUListLocalFileRequired(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListLocalFileRequired parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUListLocalFileRequired(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListQueriesResponse WUListQueries(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListQueries parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUListQueries(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListQueriesUsingFileResponse WUListQueriesUsingFile(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUListQueriesUsingFile parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUListQueriesUsingFile(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUMultiQuerySetDetailsResponse WUMultiQuerysetDetails(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUMultiQuerysetDetails parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUMultiQuerysetDetails(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUProcessGraphResponse WUProcessGraph(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUProcessGraph parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUProcessGraph(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUProtectResponse WUProtect(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUProtect parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUProtect(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUPublishWorkunitResponse WUPublishWorkunit(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUPublishWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUPublishWorkunit(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUPushEventResponse WUPushEvent(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUPushEvent parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUPushEvent(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryResponse WUQuery(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuery parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryConfigResponse WUQueryConfig(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryConfig parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQueryConfig(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryDetailsResponse WUQueryDetails(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryDetails parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQueryDetails(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryFilesResponse WUQueryFiles(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryFiles parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQueryFiles(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryGetGraphResponse WUQueryGetGraph(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQueryGetGraph parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQueryGetGraph(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetAliasActionResponse WUQuerysetAliasAction(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerysetAliasAction parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQuerysetAliasAction(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetCopyQueryResponse WUQuerysetCopyQuery(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerysetCopyQuery parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQuerysetCopyQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetDetailsResponse WUQuerysetDetails(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerysetDetails parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQuerysetDetails(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetQueryActionResponse WUQuerysetQueryAction(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerysetQueryAction parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQuerysetQueryAction(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerysetsResponse WUQuerysets(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerysets parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQuerysets(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResubmitResponse WUResubmit(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResubmit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUResubmit(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultResponse WUResult(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResult parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUResult(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultBinResponse WUResultBin(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultBin parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUResultBin(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultSummaryResponse WUResultSummary(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultSummary parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUResultSummary(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultViewResponse WUResultView(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUResultView parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUResultView(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WURunResponse WURun(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WURun parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WURun(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUScheduleResponse WUSchedule(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUSchedule parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUSchedule(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUShowScheduledResponse WUShowScheduled(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUShowScheduled parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUShowScheduled(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUSubmitResponse WUSubmit(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUSubmit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUSubmit(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUSyntaxCheckResponse WUSyntaxCheckECL(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUSyntaxCheckECL parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUSyntaxCheckECL(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUUpdateResponse WUUpdate(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUUpdate parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUUpdate(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUWaitResponse WUWaitCompiled(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUWaitCompiled parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUWaitCompiled(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUWaitResponse WUWaitComplete(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUWaitComplete parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUWaitComplete(parameters);
  }
  
  
}
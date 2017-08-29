package org.hpccsystems.ws.client.gen.wsworkunits.v1_69;

public class WsWorkunitsServiceSoapProxy implements org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WsWorkunitsServiceSoap {
  private String _endpoint = null;
  private org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WsWorkunitsServiceSoap wsWorkunitsServiceSoap = null;
  
  public WsWorkunitsServiceSoapProxy() {
    _initWsWorkunitsServiceSoapProxy();
  }
  
  public WsWorkunitsServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWsWorkunitsServiceSoapProxy();
  }
  
  private void _initWsWorkunitsServiceSoapProxy() {
    try {
      wsWorkunitsServiceSoap = (new org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WsWorkunitsLocator()).getWsWorkunitsServiceSoap();
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
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WsWorkunitsServiceSoap getWsWorkunitsServiceSoap() {
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap;
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.GVCAjaxGraphResponse GVCAjaxGraph(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.GVCAjaxGraph parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.GVCAjaxGraph(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUAbortResponse WUAbort(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUAbort parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUAbort(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUActionResponse WUAction(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUAction parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUAction(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUAddLocalFileToWorkunitResponse WUAddLocalFileToWorkunit(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUAddLocalFileToWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUAddLocalFileToWorkunit(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUDebugResponse WUCDebug(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUCDebug parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCDebug(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUCheckFeaturesResponse WUCheckFeatures(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUCheckFeatures parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCheckFeatures(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUClusterJobQueueLOGResponse WUClusterJobQueueLOG(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUClusterJobQueueLOG parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUClusterJobQueueLOG(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUClusterJobQueueXLSResponse WUClusterJobQueueXLS(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUClusterJobQueueXLS parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUClusterJobQueueXLS(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUClusterJobSummaryXLSResponse WUClusterJobSummaryXLS(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUClusterJobSummaryXLS parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUClusterJobSummaryXLS(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUClusterJobXLSResponse WUClusterJobXLS(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUClusterJobXLS parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUClusterJobXLS(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUCompileECLResponse WUCompileECL(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUCompileECL parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCompileECL(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUCopyLogicalFilesResponse WUCopyLogicalFiles(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUCopyLogicalFiles parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCopyLogicalFiles(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUCopyQuerySetResponse WUCopyQuerySet(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUCopyQuerySet parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCopyQuerySet(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUCreateResponse WUCreate(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUCreate parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCreate(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUUpdateResponse WUCreateAndUpdate(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUCreateAndUpdate parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCreateAndUpdate(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUCreateZAPInfoResponse WUCreateZAPInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUCreateZAPInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCreateZAPInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUDeleteResponse WUDelete(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUDelete parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUDelete(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUDeployWorkunitResponse WUDeployWorkunit(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUDeployWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUDeployWorkunit(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUExportResponse WUExport(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUExport parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUExport(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WULogFileResponse WUFile(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUFile parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUFile(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUFullResultResponse WUFullResult(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUFullResult parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUFullResult(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUGVCGraphInfoResponse WUGVCGraphInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUGVCGraphInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGVCGraphInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUGetArchiveFileResponse WUGetArchiveFile(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUGetArchiveFile parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGetArchiveFile(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUGetDependancyTreesResponse WUGetDependancyTrees(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUGetDependancyTrees parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGetDependancyTrees(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUGetGraphResponse WUGetGraph(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUGetGraph parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGetGraph(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUGetGraphNameAndTypesResponse WUGetGraphNameAndTypes(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUGetGraphNameAndTypes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGetGraphNameAndTypes(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUGetNumFileToCopyResponse WUGetNumFileToCopy(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUGetNumFileToCopy parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGetNumFileToCopy(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUGetStatsResponse WUGetStats(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUGetStats parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGetStats(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUGetZAPInfoResponse WUGetZAPInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUGetZAPInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGetZAPInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUGraphInfoResponse WUGraphInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUGraphInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGraphInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUGraphTimingResponse WUGraphTiming(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUGraphTiming parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGraphTiming(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUInfoResponse WUInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUInfoResponse WUInfoDetails(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUInfoDetails parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUInfoDetails(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUJobListResponse WUJobList(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUJobList parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUJobList(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WULightWeightQueryResponse WULightWeightQuery(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WULightWeightQuery parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WULightWeightQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUListArchiveFilesResponse WUListArchiveFiles(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUListArchiveFiles parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUListArchiveFiles(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUListLocalFileRequiredResponse WUListLocalFileRequired(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUListLocalFileRequired parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUListLocalFileRequired(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUListQueriesResponse WUListQueries(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUListQueries parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUListQueries(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUListQueriesUsingFileResponse WUListQueriesUsingFile(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUListQueriesUsingFile parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUListQueriesUsingFile(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUMultiQuerySetDetailsResponse WUMultiQuerysetDetails(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUMultiQuerysetDetails parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUMultiQuerysetDetails(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUProcessGraphResponse WUProcessGraph(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUProcessGraph parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUProcessGraph(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUProtectResponse WUProtect(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUProtect parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUProtect(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUPublishWorkunitResponse WUPublishWorkunit(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUPublishWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUPublishWorkunit(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUPushEventResponse WUPushEvent(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUPushEvent parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUPushEvent(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUQueryResponse WUQuery(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUQuery parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUQueryConfigResponse WUQueryConfig(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUQueryConfig parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQueryConfig(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUQueryDetailsResponse WUQueryDetails(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUQueryDetails parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQueryDetails(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUQueryFilesResponse WUQueryFiles(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUQueryFiles parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQueryFiles(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUQueryGetGraphResponse WUQueryGetGraph(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUQueryGetGraph parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQueryGetGraph(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUQuerySetAliasActionResponse WUQuerysetAliasAction(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUQuerysetAliasAction parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQuerysetAliasAction(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUQuerySetCopyQueryResponse WUQuerysetCopyQuery(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUQuerysetCopyQuery parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQuerysetCopyQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUQuerySetDetailsResponse WUQuerysetDetails(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUQuerysetDetails parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQuerysetDetails(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUQuerySetQueryActionResponse WUQuerysetQueryAction(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUQuerysetQueryAction parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQuerysetQueryAction(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUQuerysetsResponse WUQuerysets(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUQuerysets parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQuerysets(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUResubmitResponse WUResubmit(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUResubmit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUResubmit(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUResultResponse WUResult(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUResult parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUResult(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUResultBinResponse WUResultBin(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUResultBin parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUResultBin(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUResultSummaryResponse WUResultSummary(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUResultSummary parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUResultSummary(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUResultViewResponse WUResultView(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUResultView parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUResultView(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WURunResponse WURun(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WURun parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WURun(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUScheduleResponse WUSchedule(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUSchedule parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUSchedule(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUShowScheduledResponse WUShowScheduled(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUShowScheduled parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUShowScheduled(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUSubmitResponse WUSubmit(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUSubmit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUSubmit(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUSyntaxCheckResponse WUSyntaxCheckECL(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUSyntaxCheckECL parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUSyntaxCheckECL(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUUpdateResponse WUUpdate(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUUpdate parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUUpdate(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUUpdateQueryEntryResponse WUUpdateQueryEntry(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUUpdateQueryEntry parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUUpdateQueryEntry(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUWaitResponse WUWaitCompiled(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUWaitCompiled parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUWaitCompiled(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUWaitResponse WUWaitComplete(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUWaitComplete parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUWaitComplete(parameters);
  }
  
  
}
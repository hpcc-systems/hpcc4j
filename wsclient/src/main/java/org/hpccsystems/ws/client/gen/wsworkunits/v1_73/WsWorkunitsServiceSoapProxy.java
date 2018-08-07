package org.hpccsystems.ws.client.gen.wsworkunits.v1_73;

public class WsWorkunitsServiceSoapProxy implements org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WsWorkunitsServiceSoap {
  private String _endpoint = null;
  private org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WsWorkunitsServiceSoap wsWorkunitsServiceSoap = null;
  
  public WsWorkunitsServiceSoapProxy() {
    _initWsWorkunitsServiceSoapProxy();
  }
  
  public WsWorkunitsServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWsWorkunitsServiceSoapProxy();
  }
  
  private void _initWsWorkunitsServiceSoapProxy() {
    try {
      wsWorkunitsServiceSoap = (new org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WsWorkunitsLocator()).getWsWorkunitsServiceSoap();
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
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WsWorkunitsServiceSoap getWsWorkunitsServiceSoap() {
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap;
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.GVCAjaxGraphResponse GVCAjaxGraph(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.GVCAjaxGraph parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.GVCAjaxGraph(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WsWorkunitsPingResponse ping(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.Ping parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.ping(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUAbortResponse WUAbort(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUAbort parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUAbort(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUActionResponse WUAction(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUAction parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUAction(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUAddLocalFileToWorkunitResponse WUAddLocalFileToWorkunit(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUAddLocalFileToWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUAddLocalFileToWorkunit(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUDebugResponse WUCDebug(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUCDebug parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCDebug(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUCheckFeaturesResponse WUCheckFeatures(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUCheckFeatures parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCheckFeatures(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUClusterJobQueueLOGResponse WUClusterJobQueueLOG(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUClusterJobQueueLOG parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUClusterJobQueueLOG(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUClusterJobQueueXLSResponse WUClusterJobQueueXLS(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUClusterJobQueueXLS parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUClusterJobQueueXLS(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUClusterJobSummaryXLSResponse WUClusterJobSummaryXLS(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUClusterJobSummaryXLS parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUClusterJobSummaryXLS(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUClusterJobXLSResponse WUClusterJobXLS(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUClusterJobXLS parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUClusterJobXLS(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUCompileECLResponse WUCompileECL(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUCompileECL parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCompileECL(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUCopyLogicalFilesResponse WUCopyLogicalFiles(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUCopyLogicalFiles parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCopyLogicalFiles(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUCopyQuerySetResponse WUCopyQuerySet(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUCopyQuerySet parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCopyQuerySet(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUCreateResponse WUCreate(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUCreate parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCreate(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUUpdateResponse WUCreateAndUpdate(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUCreateAndUpdate parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCreateAndUpdate(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUCreateZAPInfoResponse WUCreateZAPInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUCreateZAPInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCreateZAPInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUDeleteResponse WUDelete(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUDelete parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUDelete(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUDeployWorkunitResponse WUDeployWorkunit(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUDeployWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUDeployWorkunit(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUDetailsResponse WUDetails(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUDetails parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUDetails(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUDetailsMetaResponse WUDetailsMeta(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUDetailsMeta parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUDetailsMeta(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUEclDefinitionActionResponse WUEclDefinitionAction(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUEclDefinitionAction parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUEclDefinitionAction(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUExportResponse WUExport(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUExport parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUExport(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WULogFileResponse WUFile(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUFile parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUFile(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUFullResultResponse WUFullResult(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUFullResult parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUFullResult(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUGVCGraphInfoResponse WUGVCGraphInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUGVCGraphInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGVCGraphInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUGetArchiveFileResponse WUGetArchiveFile(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUGetArchiveFile parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGetArchiveFile(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUGetDependancyTreesResponse WUGetDependancyTrees(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUGetDependancyTrees parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGetDependancyTrees(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUGetGraphResponse WUGetGraph(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUGetGraph parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGetGraph(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUGetGraphNameAndTypesResponse WUGetGraphNameAndTypes(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUGetGraphNameAndTypes parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGetGraphNameAndTypes(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUGetNumFileToCopyResponse WUGetNumFileToCopy(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUGetNumFileToCopy parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGetNumFileToCopy(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUGetStatsResponse WUGetStats(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUGetStats parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGetStats(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUGetZAPInfoResponse WUGetZAPInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUGetZAPInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGetZAPInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUGraphInfoResponse WUGraphInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUGraphInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGraphInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUGraphTimingResponse WUGraphTiming(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUGraphTiming parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGraphTiming(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUInfoResponse WUInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUInfoResponse WUInfoDetails(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUInfoDetails parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUInfoDetails(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUJobListResponse WUJobList(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUJobList parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUJobList(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WULightWeightQueryResponse WULightWeightQuery(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WULightWeightQuery parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WULightWeightQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUListArchiveFilesResponse WUListArchiveFiles(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUListArchiveFiles parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUListArchiveFiles(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUListLocalFileRequiredResponse WUListLocalFileRequired(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUListLocalFileRequired parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUListLocalFileRequired(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUListQueriesResponse WUListQueries(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUListQueries parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUListQueries(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUListQueriesUsingFileResponse WUListQueriesUsingFile(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUListQueriesUsingFile parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUListQueriesUsingFile(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUMultiQuerySetDetailsResponse WUMultiQuerysetDetails(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUMultiQuerysetDetails parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUMultiQuerysetDetails(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUProcessGraphResponse WUProcessGraph(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUProcessGraph parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUProcessGraph(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUProtectResponse WUProtect(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUProtect parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUProtect(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUPublishWorkunitResponse WUPublishWorkunit(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUPublishWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUPublishWorkunit(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUPushEventResponse WUPushEvent(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUPushEvent parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUPushEvent(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUQueryResponse WUQuery(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUQuery parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUQueryConfigResponse WUQueryConfig(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUQueryConfig parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQueryConfig(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUQueryDetailsResponse WUQueryDetails(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUQueryDetails parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQueryDetails(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUQueryFilesResponse WUQueryFiles(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUQueryFiles parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQueryFiles(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUQueryGetGraphResponse WUQueryGetGraph(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUQueryGetGraph parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQueryGetGraph(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUQueryGetSummaryStatsResponse WUQueryGetSummaryStats(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUQueryGetSummaryStats parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQueryGetSummaryStats(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUQuerySetAliasActionResponse WUQuerysetAliasAction(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUQuerysetAliasAction parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQuerysetAliasAction(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUQuerySetCopyQueryResponse WUQuerysetCopyQuery(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUQuerysetCopyQuery parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQuerysetCopyQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUQuerySetDetailsResponse WUQuerysetDetails(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUQuerysetDetails parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQuerysetDetails(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUQuerysetExportResponse WUQuerysetExport(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUQuerysetExport parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQuerysetExport(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUQuerysetImportResponse WUQuerysetImport(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUQuerysetImport parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQuerysetImport(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUQuerySetQueryActionResponse WUQuerysetQueryAction(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUQuerysetQueryAction parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQuerysetQueryAction(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUQuerysetsResponse WUQuerysets(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUQuerysets parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQuerysets(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WURecreateQueryResponse WURecreateQuery(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WURecreateQuery parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WURecreateQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUResubmitResponse WUResubmit(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUResubmit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUResubmit(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUResultResponse WUResult(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUResult parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUResult(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUResultBinResponse WUResultBin(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUResultBin parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUResultBin(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUResultSummaryResponse WUResultSummary(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUResultSummary parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUResultSummary(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUResultViewResponse WUResultView(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUResultView parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUResultView(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WURunResponse WURun(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WURun parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WURun(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUScheduleResponse WUSchedule(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUSchedule parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUSchedule(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUShowScheduledResponse WUShowScheduled(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUShowScheduled parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUShowScheduled(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUSubmitResponse WUSubmit(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUSubmit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUSubmit(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUSyntaxCheckResponse WUSyntaxCheckECL(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUSyntaxCheckECL parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUSyntaxCheckECL(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUUpdateResponse WUUpdate(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUUpdate parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUUpdate(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUUpdateQueryEntryResponse WUUpdateQueryEntry(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUUpdateQueryEntry parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUUpdateQueryEntry(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUWaitResponse WUWaitCompiled(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUWaitCompiled parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUWaitCompiled(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUWaitResponse WUWaitComplete(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.WUWaitComplete parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUWaitComplete(parameters);
  }
  
  
}
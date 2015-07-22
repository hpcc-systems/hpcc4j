package org.hpccsystems.ws.client.gen.wsworkunits.v1_46;

public class WsWorkunitsServiceSoapProxy implements org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WsWorkunitsServiceSoap {
  private String _endpoint = null;
  private org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WsWorkunitsServiceSoap wsWorkunitsServiceSoap = null;
  
  public WsWorkunitsServiceSoapProxy() {
    _initWsWorkunitsServiceSoapProxy();
  }
  
  public WsWorkunitsServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWsWorkunitsServiceSoapProxy();
  }
  
  private void _initWsWorkunitsServiceSoapProxy() {
    try {
      wsWorkunitsServiceSoap = (new org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WsWorkunitsLocator()).getWsWorkunitsServiceSoap();
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
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WsWorkunitsServiceSoap getWsWorkunitsServiceSoap() {
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap;
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.GVCAjaxGraphResponse GVCAjaxGraph(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.GVCAjaxGraph parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.GVCAjaxGraph(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUAbortResponse WUAbort(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUAbort parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUAbort(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUActionResponse WUAction(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUAction parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUAction(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUAddLocalFileToWorkunitResponse WUAddLocalFileToWorkunit(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUAddLocalFileToWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUAddLocalFileToWorkunit(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUDebugResponse WUCDebug(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUCDebug parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCDebug(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUClusterJobQueueLOGResponse WUClusterJobQueueLOG(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUClusterJobQueueLOG parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUClusterJobQueueLOG(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUClusterJobQueueXLSResponse WUClusterJobQueueXLS(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUClusterJobQueueXLS parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUClusterJobQueueXLS(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUClusterJobSummaryXLSResponse WUClusterJobSummaryXLS(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUClusterJobSummaryXLS parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUClusterJobSummaryXLS(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUClusterJobXLSResponse WUClusterJobXLS(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUClusterJobXLS parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUClusterJobXLS(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUCompileECLResponse WUCompileECL(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUCompileECL parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCompileECL(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUCopyLogicalFilesResponse WUCopyLogicalFiles(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUCopyLogicalFiles parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCopyLogicalFiles(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUCreateResponse WUCreate() throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCreate();
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUUpdateResponse WUCreateAndUpdate(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUCreateAndUpdate parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCreateAndUpdate(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUCreateZAPInfoResponse WUCreateZAPInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUCreateZAPInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCreateZAPInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUDeleteResponse WUDelete(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUDelete parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUDelete(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUDeployWorkunitResponse WUDeployWorkunit(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUDeployWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUDeployWorkunit(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUExportResponse WUExport(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUExport parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUExport(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WULogFileResponse WUFile(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUFile parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUFile(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUGVCGraphInfoResponse WUGVCGraphInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUGVCGraphInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGVCGraphInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUGetDependancyTreesResponse WUGetDependancyTrees(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUGetDependancyTrees parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGetDependancyTrees(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUGetGraphResponse WUGetGraph(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUGetGraph parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGetGraph(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUGetZAPInfoResponse WUGetZAPInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUGetZAPInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGetZAPInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUGraphInfoResponse WUGraphInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUGraphInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGraphInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUGraphTimingResponse WUGraphTiming(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUGraphTiming parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGraphTiming(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUInfoResponse WUInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUInfoResponse WUInfoDetails(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUInfoDetails parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUInfoDetails(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUJobListResponse WUJobList(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUJobList parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUJobList(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUListLocalFileRequiredResponse WUListLocalFileRequired(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUListLocalFileRequired parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUListLocalFileRequired(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUListQueriesResponse WUListQueries(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUListQueries parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUListQueries(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUMultiQuerySetDetailsResponse WUMultiQuerysetDetails(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUMultiQuerysetDetails parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUMultiQuerysetDetails(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUProcessGraphResponse WUProcessGraph(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUProcessGraph parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUProcessGraph(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUProtectResponse WUProtect(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUProtect parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUProtect(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUPublishWorkunitResponse WUPublishWorkunit(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUPublishWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUPublishWorkunit(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUPushEventResponse WUPushEvent(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUPushEvent parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUPushEvent(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUQueryResponse WUQuery(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUQuery parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUQueryConfigResponse WUQueryConfig(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUQueryConfig parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQueryConfig(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUQueryDetailsResponse WUQueryDetails(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUQueryDetails parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQueryDetails(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUQueryGetGraphResponse WUQueryGetGraph(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUQueryGetGraph parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQueryGetGraph(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUQuerySetAliasActionResponse WUQuerysetAliasAction(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUQuerysetAliasAction parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQuerysetAliasAction(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUQuerySetCopyQueryResponse WUQuerysetCopyQuery(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUQuerysetCopyQuery parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQuerysetCopyQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUQuerySetDetailsResponse WUQuerysetDetails(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUQuerysetDetails parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQuerysetDetails(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUQuerySetQueryActionResponse WUQuerysetQueryAction(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUQuerysetQueryAction parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQuerysetQueryAction(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUQuerysetsResponse WUQuerysets(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUQuerysets parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQuerysets(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUResubmitResponse WUResubmit(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUResubmit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUResubmit(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUResultResponse WUResult(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUResult parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUResult(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUResultBinResponse WUResultBin(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUResultBin parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUResultBin(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUResultSummaryResponse WUResultSummary(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUResultSummary parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUResultSummary(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUResultViewResponse WUResultView(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUResultView parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUResultView(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WURunResponse WURun(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WURun parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WURun(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUScheduleResponse WUSchedule(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUSchedule parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUSchedule(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUShowScheduledResponse WUShowScheduled(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUShowScheduled parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUShowScheduled(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUSubmitResponse WUSubmit(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUSubmit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUSubmit(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUSyntaxCheckResponse WUSyntaxCheckECL(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUSyntaxCheckECL parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUSyntaxCheckECL(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUUpdateResponse WUUpdate(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUUpdate parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUUpdate(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUWaitResponse WUWaitCompiled(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUWaitCompiled parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUWaitCompiled(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUWaitResponse WUWaitComplete(org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WUWaitComplete parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsworkunits.v1_46.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUWaitComplete(parameters);
  }
  
  
}
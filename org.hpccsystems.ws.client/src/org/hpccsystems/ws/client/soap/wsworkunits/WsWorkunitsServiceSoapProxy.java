package org.hpccsystems.ws.client.soap.wsworkunits;

public class WsWorkunitsServiceSoapProxy implements org.hpccsystems.ws.client.soap.wsworkunits.WsWorkunitsServiceSoap {
  private String _endpoint = null;
  private org.hpccsystems.ws.client.soap.wsworkunits.WsWorkunitsServiceSoap wsWorkunitsServiceSoap = null;
  
  public WsWorkunitsServiceSoapProxy() {
    _initWsWorkunitsServiceSoapProxy();
  }
  
  public WsWorkunitsServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWsWorkunitsServiceSoapProxy();
  }
  
  private void _initWsWorkunitsServiceSoapProxy() {
    try {
      wsWorkunitsServiceSoap = (new org.hpccsystems.ws.client.soap.wsworkunits.WsWorkunitsLocator()).getWsWorkunitsServiceSoap();
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
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WsWorkunitsServiceSoap getWsWorkunitsServiceSoap() {
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap;
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.GVCAjaxGraphResponse GVCAjaxGraph(org.hpccsystems.ws.client.soap.wsworkunits.GVCAjaxGraph parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.GVCAjaxGraph(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUAbortResponse WUAbort(org.hpccsystems.ws.client.soap.wsworkunits.WUAbort parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUAbort(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUActionResponse WUAction(org.hpccsystems.ws.client.soap.wsworkunits.WUAction parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUAction(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUAddLocalFileToWorkunitResponse WUAddLocalFileToWorkunit(org.hpccsystems.ws.client.soap.wsworkunits.WUAddLocalFileToWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUAddLocalFileToWorkunit(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUDebugResponse WUCDebug(org.hpccsystems.ws.client.soap.wsworkunits.WUCDebug parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCDebug(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUClusterJobQueueLOGResponse WUClusterJobQueueLOG(org.hpccsystems.ws.client.soap.wsworkunits.WUClusterJobQueueLOG parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUClusterJobQueueLOG(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUClusterJobQueueXLSResponse WUClusterJobQueueXLS(org.hpccsystems.ws.client.soap.wsworkunits.WUClusterJobQueueXLS parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUClusterJobQueueXLS(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUClusterJobSummaryXLSResponse WUClusterJobSummaryXLS(org.hpccsystems.ws.client.soap.wsworkunits.WUClusterJobSummaryXLS parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUClusterJobSummaryXLS(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUClusterJobXLSResponse WUClusterJobXLS(org.hpccsystems.ws.client.soap.wsworkunits.WUClusterJobXLS parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUClusterJobXLS(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUCompileECLResponse WUCompileECL(org.hpccsystems.ws.client.soap.wsworkunits.WUCompileECL parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCompileECL(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUCopyLogicalFilesResponse WUCopyLogicalFiles(org.hpccsystems.ws.client.soap.wsworkunits.WUCopyLogicalFiles parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCopyLogicalFiles(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUCreateResponse WUCreate() throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCreate();
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUUpdateResponse WUCreateAndUpdate(org.hpccsystems.ws.client.soap.wsworkunits.WUCreateAndUpdate parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCreateAndUpdate(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUCreateZAPInfoResponse WUCreateZAPInfo(org.hpccsystems.ws.client.soap.wsworkunits.WUCreateZAPInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUCreateZAPInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUDeleteResponse WUDelete(org.hpccsystems.ws.client.soap.wsworkunits.WUDelete parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUDelete(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUDeployWorkunitResponse WUDeployWorkunit(org.hpccsystems.ws.client.soap.wsworkunits.WUDeployWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUDeployWorkunit(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUExportResponse WUExport(org.hpccsystems.ws.client.soap.wsworkunits.WUExport parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUExport(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WULogFileResponse WUFile(org.hpccsystems.ws.client.soap.wsworkunits.WUFile parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUFile(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUGVCGraphInfoResponse WUGVCGraphInfo(org.hpccsystems.ws.client.soap.wsworkunits.WUGVCGraphInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGVCGraphInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUGetDependancyTreesResponse WUGetDependancyTrees(org.hpccsystems.ws.client.soap.wsworkunits.WUGetDependancyTrees parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGetDependancyTrees(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUGetGraphResponse WUGetGraph(org.hpccsystems.ws.client.soap.wsworkunits.WUGetGraph parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGetGraph(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUGetZAPInfoResponse WUGetZAPInfo(org.hpccsystems.ws.client.soap.wsworkunits.WUGetZAPInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGetZAPInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUGraphInfoResponse WUGraphInfo(org.hpccsystems.ws.client.soap.wsworkunits.WUGraphInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGraphInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUGraphTimingResponse WUGraphTiming(org.hpccsystems.ws.client.soap.wsworkunits.WUGraphTiming parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUGraphTiming(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUInfoResponse WUInfo(org.hpccsystems.ws.client.soap.wsworkunits.WUInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUInfoResponse WUInfoDetails(org.hpccsystems.ws.client.soap.wsworkunits.WUInfoDetails parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUInfoDetails(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUJobListResponse WUJobList(org.hpccsystems.ws.client.soap.wsworkunits.WUJobList parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUJobList(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUListLocalFileRequiredResponse WUListLocalFileRequired(org.hpccsystems.ws.client.soap.wsworkunits.WUListLocalFileRequired parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUListLocalFileRequired(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUListQueriesResponse WUListQueries(org.hpccsystems.ws.client.soap.wsworkunits.WUListQueries parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUListQueries(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUMultiQuerySetDetailsResponse WUMultiQuerysetDetails(org.hpccsystems.ws.client.soap.wsworkunits.WUMultiQuerysetDetails parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUMultiQuerysetDetails(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUProcessGraphResponse WUProcessGraph(org.hpccsystems.ws.client.soap.wsworkunits.WUProcessGraph parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUProcessGraph(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUProtectResponse WUProtect(org.hpccsystems.ws.client.soap.wsworkunits.WUProtect parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUProtect(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUPublishWorkunitResponse WUPublishWorkunit(org.hpccsystems.ws.client.soap.wsworkunits.WUPublishWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUPublishWorkunit(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUPushEventResponse WUPushEvent(org.hpccsystems.ws.client.soap.wsworkunits.WUPushEvent parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUPushEvent(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUQueryResponse WUQuery(org.hpccsystems.ws.client.soap.wsworkunits.WUQuery parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUQueryConfigResponse WUQueryConfig(org.hpccsystems.ws.client.soap.wsworkunits.WUQueryConfig parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQueryConfig(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUQueryDetailsResponse WUQueryDetails(org.hpccsystems.ws.client.soap.wsworkunits.WUQueryDetails parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQueryDetails(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUQueryGetGraphResponse WUQueryGetGraph(org.hpccsystems.ws.client.soap.wsworkunits.WUQueryGetGraph parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQueryGetGraph(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUQuerySetAliasActionResponse WUQuerysetAliasAction(org.hpccsystems.ws.client.soap.wsworkunits.WUQuerysetAliasAction parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQuerysetAliasAction(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUQuerySetCopyQueryResponse WUQuerysetCopyQuery(org.hpccsystems.ws.client.soap.wsworkunits.WUQuerysetCopyQuery parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQuerysetCopyQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUQuerySetDetailsResponse WUQuerysetDetails(org.hpccsystems.ws.client.soap.wsworkunits.WUQuerysetDetails parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQuerysetDetails(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUQuerySetQueryActionResponse WUQuerysetQueryAction(org.hpccsystems.ws.client.soap.wsworkunits.WUQuerysetQueryAction parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQuerysetQueryAction(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUQuerysetsResponse WUQuerysets(org.hpccsystems.ws.client.soap.wsworkunits.WUQuerysets parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUQuerysets(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUResubmitResponse WUResubmit(org.hpccsystems.ws.client.soap.wsworkunits.WUResubmit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUResubmit(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUResultResponse WUResult(org.hpccsystems.ws.client.soap.wsworkunits.WUResult parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUResult(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUResultBinResponse WUResultBin(org.hpccsystems.ws.client.soap.wsworkunits.WUResultBin parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUResultBin(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUResultSummaryResponse WUResultSummary(org.hpccsystems.ws.client.soap.wsworkunits.WUResultSummary parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUResultSummary(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUResultViewResponse WUResultView(org.hpccsystems.ws.client.soap.wsworkunits.WUResultView parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUResultView(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WURunResponse WURun(org.hpccsystems.ws.client.soap.wsworkunits.WURun parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WURun(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUScheduleResponse WUSchedule(org.hpccsystems.ws.client.soap.wsworkunits.WUSchedule parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUSchedule(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUShowScheduledResponse WUShowScheduled(org.hpccsystems.ws.client.soap.wsworkunits.WUShowScheduled parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUShowScheduled(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUSubmitResponse WUSubmit(org.hpccsystems.ws.client.soap.wsworkunits.WUSubmit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUSubmit(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUSyntaxCheckResponse WUSyntaxCheckECL(org.hpccsystems.ws.client.soap.wsworkunits.WUSyntaxCheckECL parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUSyntaxCheckECL(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUUpdateResponse WUUpdate(org.hpccsystems.ws.client.soap.wsworkunits.WUUpdate parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUUpdate(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUWaitResponse WUWaitCompiled(org.hpccsystems.ws.client.soap.wsworkunits.WUWaitCompiled parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUWaitCompiled(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wsworkunits.WUWaitResponse WUWaitComplete(org.hpccsystems.ws.client.soap.wsworkunits.WUWaitComplete parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsworkunits.ArrayOfEspException{
    if (wsWorkunitsServiceSoap == null)
      _initWsWorkunitsServiceSoapProxy();
    return wsWorkunitsServiceSoap.WUWaitComplete(parameters);
  }
  
  
}
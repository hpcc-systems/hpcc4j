package org.hpccsystems.ws.client.gen.wstopology.v1_28;

public class WsTopologyServiceSoapProxy implements org.hpccsystems.ws.client.gen.wstopology.v1_28.WsTopologyServiceSoap {
  private String _endpoint = null;
  private org.hpccsystems.ws.client.gen.wstopology.v1_28.WsTopologyServiceSoap wsTopologyServiceSoap = null;
  
  public WsTopologyServiceSoapProxy() {
    _initWsTopologyServiceSoapProxy();
  }
  
  public WsTopologyServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWsTopologyServiceSoapProxy();
  }
  
  private void _initWsTopologyServiceSoapProxy() {
    try {
      wsTopologyServiceSoap = (new org.hpccsystems.ws.client.gen.wstopology.v1_28.WsTopologyLocator()).getWsTopologyServiceSoap();
      if (wsTopologyServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wsTopologyServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wsTopologyServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wsTopologyServiceSoap != null)
      ((javax.xml.rpc.Stub)wsTopologyServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_28.WsTopologyServiceSoap getWsTopologyServiceSoap() {
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap;
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_28.WsTopologyPingResponse ping(org.hpccsystems.ws.client.gen.wstopology.v1_28.WsTopologyPingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.ping(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_28.SystemLogResponse systemLog(org.hpccsystems.ws.client.gen.wstopology.v1_28.SystemLogRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.systemLog(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_28.TpClusterInfoResponse tpClusterInfo(org.hpccsystems.ws.client.gen.wstopology.v1_28.TpClusterInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpClusterInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_28.TpClusterQueryResponse tpClusterQuery(org.hpccsystems.ws.client.gen.wstopology.v1_28.TpClusterQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpClusterQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_28.TpDropZoneQueryResponse tpDropZoneQuery(org.hpccsystems.ws.client.gen.wstopology.v1_28.TpDropZoneQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpDropZoneQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_28.TpGetComponentFileResponse tpGetComponentFile(org.hpccsystems.ws.client.gen.wstopology.v1_28.TpGetComponentFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpGetComponentFile(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_28.TpGetServicePluginsResponse tpGetServicePlugins(org.hpccsystems.ws.client.gen.wstopology.v1_28.TpGetServicePluginsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpGetServicePlugins(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_28.TpGroupQueryResponse tpGroupQuery(org.hpccsystems.ws.client.gen.wstopology.v1_28.TpGroupQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpGroupQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_28.TpListTargetClustersResponse tpListTargetClusters(org.hpccsystems.ws.client.gen.wstopology.v1_28.TpListTargetClustersRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpListTargetClusters(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_28.TpLogFileResponse tpLogFile(org.hpccsystems.ws.client.gen.wstopology.v1_28.TpLogFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpLogFile(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_28.TpLogFileResponse tpLogFileDisplay(org.hpccsystems.ws.client.gen.wstopology.v1_28.TpLogFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpLogFileDisplay(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_28.TpLogicalClusterQueryResponse tpLogicalClusterQuery(org.hpccsystems.ws.client.gen.wstopology.v1_28.TpLogicalClusterQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpLogicalClusterQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_28.TpMachineInfoResponse tpMachineInfo(org.hpccsystems.ws.client.gen.wstopology.v1_28.TpMachineInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpMachineInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_28.TpMachineQueryResponse tpMachineQuery(org.hpccsystems.ws.client.gen.wstopology.v1_28.TpMachineQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpMachineQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_28.TpServiceQueryResponse tpServiceQuery(org.hpccsystems.ws.client.gen.wstopology.v1_28.TpServiceQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpServiceQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_28.TpSetMachineStatusResponse tpSetMachineStatus(org.hpccsystems.ws.client.gen.wstopology.v1_28.TpSetMachineStatusRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpSetMachineStatus(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_28.TpSwapNodeResponse tpSwapNode(org.hpccsystems.ws.client.gen.wstopology.v1_28.TpSwapNodeRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpSwapNode(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_28.TpTargetClusterQueryResponse tpTargetClusterQuery(org.hpccsystems.ws.client.gen.wstopology.v1_28.TpTargetClusterQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpTargetClusterQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_28.TpThorStatusResponse tpThorStatus(org.hpccsystems.ws.client.gen.wstopology.v1_28.TpThorStatusRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpThorStatus(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_28.TpXMLFileResponse tpXMLFile(org.hpccsystems.ws.client.gen.wstopology.v1_28.TpXMLFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpXMLFile(parameters);
  }
  
  
}
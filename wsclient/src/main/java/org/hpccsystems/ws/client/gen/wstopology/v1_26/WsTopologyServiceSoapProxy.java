package org.hpccsystems.ws.client.gen.wstopology.v1_26;

public class WsTopologyServiceSoapProxy implements org.hpccsystems.ws.client.gen.wstopology.v1_26.WsTopologyServiceSoap {
  private String _endpoint = null;
  private org.hpccsystems.ws.client.gen.wstopology.v1_26.WsTopologyServiceSoap wsTopologyServiceSoap = null;
  
  public WsTopologyServiceSoapProxy() {
    _initWsTopologyServiceSoapProxy();
  }
  
  public WsTopologyServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWsTopologyServiceSoapProxy();
  }
  
  private void _initWsTopologyServiceSoapProxy() {
    try {
      wsTopologyServiceSoap = (new org.hpccsystems.ws.client.gen.wstopology.v1_26.WsTopologyLocator()).getWsTopologyServiceSoap();
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
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_26.WsTopologyServiceSoap getWsTopologyServiceSoap() {
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap;
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_26.WsTopologyPingResponse ping(org.hpccsystems.ws.client.gen.wstopology.v1_26.WsTopologyPingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_26.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.ping(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_26.SystemLogResponse systemLog(org.hpccsystems.ws.client.gen.wstopology.v1_26.SystemLogRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_26.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.systemLog(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_26.TpClusterInfoResponse tpClusterInfo(org.hpccsystems.ws.client.gen.wstopology.v1_26.TpClusterInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_26.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpClusterInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_26.TpClusterQueryResponse tpClusterQuery(org.hpccsystems.ws.client.gen.wstopology.v1_26.TpClusterQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_26.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpClusterQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_26.TpDropZoneQueryResponse tpDropZoneQuery(org.hpccsystems.ws.client.gen.wstopology.v1_26.TpDropZoneQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_26.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpDropZoneQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_26.TpGetComponentFileResponse tpGetComponentFile(org.hpccsystems.ws.client.gen.wstopology.v1_26.TpGetComponentFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_26.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpGetComponentFile(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_26.TpGetServicePluginsResponse tpGetServicePlugins(org.hpccsystems.ws.client.gen.wstopology.v1_26.TpGetServicePluginsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_26.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpGetServicePlugins(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_26.TpGroupQueryResponse tpGroupQuery(org.hpccsystems.ws.client.gen.wstopology.v1_26.TpGroupQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_26.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpGroupQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_26.TpListTargetClustersResponse tpListTargetClusters(org.hpccsystems.ws.client.gen.wstopology.v1_26.TpListTargetClustersRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_26.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpListTargetClusters(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_26.TpLogFileResponse tpLogFile(org.hpccsystems.ws.client.gen.wstopology.v1_26.TpLogFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_26.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpLogFile(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_26.TpLogFileResponse tpLogFileDisplay(org.hpccsystems.ws.client.gen.wstopology.v1_26.TpLogFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_26.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpLogFileDisplay(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_26.TpLogicalClusterQueryResponse tpLogicalClusterQuery(org.hpccsystems.ws.client.gen.wstopology.v1_26.TpLogicalClusterQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_26.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpLogicalClusterQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_26.TpMachineInfoResponse tpMachineInfo(org.hpccsystems.ws.client.gen.wstopology.v1_26.TpMachineInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_26.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpMachineInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_26.TpMachineQueryResponse tpMachineQuery(org.hpccsystems.ws.client.gen.wstopology.v1_26.TpMachineQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_26.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpMachineQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_26.TpServiceQueryResponse tpServiceQuery(org.hpccsystems.ws.client.gen.wstopology.v1_26.TpServiceQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_26.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpServiceQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_26.TpSetMachineStatusResponse tpSetMachineStatus(org.hpccsystems.ws.client.gen.wstopology.v1_26.TpSetMachineStatusRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_26.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpSetMachineStatus(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_26.TpSwapNodeResponse tpSwapNode(org.hpccsystems.ws.client.gen.wstopology.v1_26.TpSwapNodeRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_26.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpSwapNode(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_26.TpTargetClusterQueryResponse tpTargetClusterQuery(org.hpccsystems.ws.client.gen.wstopology.v1_26.TpTargetClusterQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_26.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpTargetClusterQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_26.TpThorStatusResponse tpThorStatus(org.hpccsystems.ws.client.gen.wstopology.v1_26.TpThorStatusRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_26.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpThorStatus(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_26.TpXMLFileResponse tpXMLFile(org.hpccsystems.ws.client.gen.wstopology.v1_26.TpXMLFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_26.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpXMLFile(parameters);
  }
  
  
}
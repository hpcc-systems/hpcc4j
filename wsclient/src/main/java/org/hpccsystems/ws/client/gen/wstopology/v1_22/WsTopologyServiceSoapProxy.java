package org.hpccsystems.ws.client.gen.wstopology.v1_22;

public class WsTopologyServiceSoapProxy implements org.hpccsystems.ws.client.gen.wstopology.v1_22.WsTopologyServiceSoap {
  private String _endpoint = null;
  private org.hpccsystems.ws.client.gen.wstopology.v1_22.WsTopologyServiceSoap wsTopologyServiceSoap = null;
  
  public WsTopologyServiceSoapProxy() {
    _initWsTopologyServiceSoapProxy();
  }
  
  public WsTopologyServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWsTopologyServiceSoapProxy();
  }
  
  private void _initWsTopologyServiceSoapProxy() {
    try {
      wsTopologyServiceSoap = (new org.hpccsystems.ws.client.gen.wstopology.v1_22.WsTopologyLocator()).getWsTopologyServiceSoap();
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
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_22.WsTopologyServiceSoap getWsTopologyServiceSoap() {
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap;
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_22.SystemLogResponse systemLog(org.hpccsystems.ws.client.gen.wstopology.v1_22.SystemLogRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_22.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.systemLog(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_22.TpClusterInfoResponse tpClusterInfo(org.hpccsystems.ws.client.gen.wstopology.v1_22.TpClusterInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_22.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpClusterInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_22.TpClusterQueryResponse tpClusterQuery(org.hpccsystems.ws.client.gen.wstopology.v1_22.TpClusterQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_22.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpClusterQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_22.TpGetComponentFileResponse tpGetComponentFile(org.hpccsystems.ws.client.gen.wstopology.v1_22.TpGetComponentFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_22.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpGetComponentFile(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_22.TpGetServicePluginsResponse tpGetServicePlugins(org.hpccsystems.ws.client.gen.wstopology.v1_22.TpGetServicePluginsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_22.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpGetServicePlugins(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_22.TpGroupQueryResponse tpGroupQuery(org.hpccsystems.ws.client.gen.wstopology.v1_22.TpGroupQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_22.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpGroupQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_22.TpListTargetClustersResponse tpListTargetClusters(org.hpccsystems.ws.client.gen.wstopology.v1_22.TpListTargetClustersRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_22.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpListTargetClusters(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_22.TpLogFileResponse tpLogFile(org.hpccsystems.ws.client.gen.wstopology.v1_22.TpLogFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_22.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpLogFile(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_22.TpLogFileResponse tpLogFileDisplay(org.hpccsystems.ws.client.gen.wstopology.v1_22.TpLogFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_22.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpLogFileDisplay(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_22.TpLogicalClusterQueryResponse tpLogicalClusterQuery(org.hpccsystems.ws.client.gen.wstopology.v1_22.TpLogicalClusterQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_22.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpLogicalClusterQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_22.TpMachineQueryResponse tpMachineQuery(org.hpccsystems.ws.client.gen.wstopology.v1_22.TpMachineQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_22.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpMachineQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_22.TpServiceQueryResponse tpServiceQuery(org.hpccsystems.ws.client.gen.wstopology.v1_22.TpServiceQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_22.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpServiceQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_22.TpSetMachineStatusResponse tpSetMachineStatus(org.hpccsystems.ws.client.gen.wstopology.v1_22.TpSetMachineStatusRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_22.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpSetMachineStatus(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_22.TpSwapNodeResponse tpSwapNode(org.hpccsystems.ws.client.gen.wstopology.v1_22.TpSwapNodeRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_22.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpSwapNode(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_22.TpTargetClusterQueryResponse tpTargetClusterQuery(org.hpccsystems.ws.client.gen.wstopology.v1_22.TpTargetClusterQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_22.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpTargetClusterQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_22.TpThorStatusResponse tpThorStatus(org.hpccsystems.ws.client.gen.wstopology.v1_22.TpThorStatusRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_22.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpThorStatus(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wstopology.v1_22.TpXMLFileResponse tpXMLFile(org.hpccsystems.ws.client.gen.wstopology.v1_22.TpXMLFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wstopology.v1_22.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpXMLFile(parameters);
  }
  
  
}
package org.hpccsystems.ws.client.soap.wstopology;

public class WsTopologyServiceSoapProxy implements org.hpccsystems.ws.client.soap.wstopology.WsTopologyServiceSoap {
  private String _endpoint = null;
  private org.hpccsystems.ws.client.soap.wstopology.WsTopologyServiceSoap wsTopologyServiceSoap = null;
  
  public WsTopologyServiceSoapProxy() {
    _initWsTopologyServiceSoapProxy();
  }
  
  public WsTopologyServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWsTopologyServiceSoapProxy();
  }
  
  private void _initWsTopologyServiceSoapProxy() {
    try {
      wsTopologyServiceSoap = (new org.hpccsystems.ws.client.soap.wstopology.WsTopologyLocator()).getWsTopologyServiceSoap();
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
  
  public org.hpccsystems.ws.client.soap.wstopology.WsTopologyServiceSoap getWsTopologyServiceSoap() {
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap;
  }
  
  public org.hpccsystems.ws.client.soap.wstopology.SystemLogResponse systemLog(org.hpccsystems.ws.client.soap.wstopology.SystemLogRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.systemLog(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wstopology.TpClusterInfoResponse tpClusterInfo(org.hpccsystems.ws.client.soap.wstopology.TpClusterInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpClusterInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wstopology.TpClusterQueryResponse tpClusterQuery(org.hpccsystems.ws.client.soap.wstopology.TpClusterQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpClusterQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wstopology.TpGetComponentFileResponse tpGetComponentFile(org.hpccsystems.ws.client.soap.wstopology.TpGetComponentFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpGetComponentFile(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wstopology.TpGroupQueryResponse tpGroupQuery(org.hpccsystems.ws.client.soap.wstopology.TpGroupQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpGroupQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wstopology.TpListTargetClustersResponse tpListTargetClusters(org.hpccsystems.ws.client.soap.wstopology.TpListTargetClustersRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpListTargetClusters(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wstopology.TpLogFileResponse tpLogFile(org.hpccsystems.ws.client.soap.wstopology.TpLogFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpLogFile(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wstopology.TpLogFileResponse tpLogFileDisplay(org.hpccsystems.ws.client.soap.wstopology.TpLogFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpLogFileDisplay(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wstopology.TpLogicalClusterQueryResponse tpLogicalClusterQuery(org.hpccsystems.ws.client.soap.wstopology.TpLogicalClusterQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpLogicalClusterQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wstopology.TpMachineQueryResponse tpMachineQuery(org.hpccsystems.ws.client.soap.wstopology.TpMachineQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpMachineQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wstopology.TpServiceQueryResponse tpServiceQuery(org.hpccsystems.ws.client.soap.wstopology.TpServiceQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpServiceQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wstopology.TpSetMachineStatusResponse tpSetMachineStatus(org.hpccsystems.ws.client.soap.wstopology.TpSetMachineStatusRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpSetMachineStatus(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wstopology.TpSwapNodeResponse tpSwapNode(org.hpccsystems.ws.client.soap.wstopology.TpSwapNodeRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpSwapNode(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wstopology.TpTargetClusterQueryResponse tpTargetClusterQuery(org.hpccsystems.ws.client.soap.wstopology.TpTargetClusterQueryRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpTargetClusterQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wstopology.TpThorStatusResponse tpThorStatus(org.hpccsystems.ws.client.soap.wstopology.TpThorStatusRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpThorStatus(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.wstopology.TpXMLFileResponse tpXMLFile(org.hpccsystems.ws.client.soap.wstopology.TpXMLFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wstopology.ArrayOfEspException{
    if (wsTopologyServiceSoap == null)
      _initWsTopologyServiceSoapProxy();
    return wsTopologyServiceSoap.tpXMLFile(parameters);
  }
  
  
}
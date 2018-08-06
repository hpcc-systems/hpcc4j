package org.hpccsystems.ws.client.gen.wssmc.v1_21;

public class WsSMCServiceSoapProxy implements org.hpccsystems.ws.client.gen.wssmc.v1_21.WsSMCServiceSoap {
  private String _endpoint = null;
  private org.hpccsystems.ws.client.gen.wssmc.v1_21.WsSMCServiceSoap wsSMCServiceSoap = null;
  
  public WsSMCServiceSoapProxy() {
    _initWsSMCServiceSoapProxy();
  }
  
  public WsSMCServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWsSMCServiceSoapProxy();
  }
  
  private void _initWsSMCServiceSoapProxy() {
    try {
      wsSMCServiceSoap = (new org.hpccsystems.ws.client.gen.wssmc.v1_21.WsSMCLocator()).getWsSMCServiceSoap();
      if (wsSMCServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wsSMCServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wsSMCServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wsSMCServiceSoap != null)
      ((javax.xml.rpc.Stub)wsSMCServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_21.WsSMCServiceSoap getWsSMCServiceSoap() {
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap;
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_21.ActivityResponse activity(org.hpccsystems.ws.client.gen.wssmc.v1_21.Activity parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.activity(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_21.BrowseResourcesResponse browseResources(org.hpccsystems.ws.client.gen.wssmc.v1_21.BrowseResources parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.browseResources(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCQueueResponse clearQueue(org.hpccsystems.ws.client.gen.wssmc.v1_21.ClearQueue parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.clearQueue(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_21.GetStatusServerInfoResponse getStatusServerInfo(org.hpccsystems.ws.client.gen.wssmc.v1_21.GetStatusServerInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.getStatusServerInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_21.GetThorQueueAvailabilityResponse getThorQueueAvailability(org.hpccsystems.ws.client.gen.wssmc.v1_21.GetThorQueueAvailability parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.getThorQueueAvailability(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCIndexResponse index(org.hpccsystems.ws.client.gen.wssmc.v1_21.Index parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.index(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_21.LockQueryResponse lockQuery(org.hpccsystems.ws.client.gen.wssmc.v1_21.LockQuery parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.lockQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCJobResponse moveJobBack(org.hpccsystems.ws.client.gen.wssmc.v1_21.MoveJobBack parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.moveJobBack(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCJobResponse moveJobDown(org.hpccsystems.ws.client.gen.wssmc.v1_21.MoveJobDown parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.moveJobDown(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCJobResponse moveJobFront(org.hpccsystems.ws.client.gen.wssmc.v1_21.MoveJobFront parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.moveJobFront(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCJobResponse moveJobUp(org.hpccsystems.ws.client.gen.wssmc.v1_21.MoveJobUp parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.moveJobUp(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_21.NotInCommunityEditionResponse notInCommunityEdition(org.hpccsystems.ws.client.gen.wssmc.v1_21.NotInCommunityEdition parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.notInCommunityEdition(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCQueueResponse pauseQueue(org.hpccsystems.ws.client.gen.wssmc.v1_21.PauseQueue parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.pauseQueue(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_21.WsSMCPingResponse ping(org.hpccsystems.ws.client.gen.wssmc.v1_21.Ping parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.ping(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCJobResponse removeJob(org.hpccsystems.ws.client.gen.wssmc.v1_21.RemoveJob parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.removeJob(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCQueueResponse resumeQueue(org.hpccsystems.ws.client.gen.wssmc.v1_21.ResumeQueue parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.resumeQueue(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_21.RoxieControlCmdResponse roxieControlCmd(org.hpccsystems.ws.client.gen.wssmc.v1_21.RoxieControlCmd parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.roxieControlCmd(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_21.SetBannerResponse setBanner(org.hpccsystems.ws.client.gen.wssmc.v1_21.SetBanner parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.setBanner(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCPriorityResponse setJobPriority(org.hpccsystems.ws.client.gen.wssmc.v1_21.SetJobPriority parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.setJobPriority(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCQueueResponse stopQueue(org.hpccsystems.ws.client.gen.wssmc.v1_21.StopQueue parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.stopQueue(parameters);
  }
  
  
}
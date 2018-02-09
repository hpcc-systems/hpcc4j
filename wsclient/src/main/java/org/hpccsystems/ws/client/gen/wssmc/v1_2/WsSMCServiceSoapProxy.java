package org.hpccsystems.ws.client.gen.wssmc.v1_2;

public class WsSMCServiceSoapProxy implements org.hpccsystems.ws.client.gen.wssmc.v1_2.WsSMCServiceSoap {
  private String _endpoint = null;
  private org.hpccsystems.ws.client.gen.wssmc.v1_2.WsSMCServiceSoap wsSMCServiceSoap = null;
  
  public WsSMCServiceSoapProxy() {
    _initWsSMCServiceSoapProxy();
  }
  
  public WsSMCServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWsSMCServiceSoapProxy();
  }
  
  private void _initWsSMCServiceSoapProxy() {
    try {
      wsSMCServiceSoap = (new org.hpccsystems.ws.client.gen.wssmc.v1_2.WsSMCLocator()).getWsSMCServiceSoap();
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
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2.WsSMCServiceSoap getWsSMCServiceSoap() {
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap;
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2.ActivityResponse activity(org.hpccsystems.ws.client.gen.wssmc.v1_2.Activity parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.activity(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2.BrowseResourcesResponse browseResources(org.hpccsystems.ws.client.gen.wssmc.v1_2.BrowseResources parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.browseResources(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2.SMCQueueResponse clearQueue(org.hpccsystems.ws.client.gen.wssmc.v1_2.ClearQueue parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.clearQueue(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2.GetStatusServerInfoResponse getStatusServerInfo(org.hpccsystems.ws.client.gen.wssmc.v1_2.GetStatusServerInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.getStatusServerInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2.GetThorQueueAvailabilityResponse getThorQueueAvailability(org.hpccsystems.ws.client.gen.wssmc.v1_2.GetThorQueueAvailability parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.getThorQueueAvailability(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2.SMCIndexResponse index(org.hpccsystems.ws.client.gen.wssmc.v1_2.Index parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.index(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2.LockQueryResponse lockQuery(org.hpccsystems.ws.client.gen.wssmc.v1_2.LockQuery parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.lockQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2.SMCJobResponse moveJobBack(org.hpccsystems.ws.client.gen.wssmc.v1_2.MoveJobBack parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.moveJobBack(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2.SMCJobResponse moveJobDown(org.hpccsystems.ws.client.gen.wssmc.v1_2.MoveJobDown parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.moveJobDown(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2.SMCJobResponse moveJobFront(org.hpccsystems.ws.client.gen.wssmc.v1_2.MoveJobFront parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.moveJobFront(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2.SMCJobResponse moveJobUp(org.hpccsystems.ws.client.gen.wssmc.v1_2.MoveJobUp parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.moveJobUp(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2.NotInCommunityEditionResponse notInCommunityEdition(org.hpccsystems.ws.client.gen.wssmc.v1_2.NotInCommunityEdition parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.notInCommunityEdition(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2.SMCQueueResponse pauseQueue(org.hpccsystems.ws.client.gen.wssmc.v1_2.PauseQueue parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.pauseQueue(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2.WsSMCPingResponse ping(org.hpccsystems.ws.client.gen.wssmc.v1_2.Ping parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.ping(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2.SMCJobResponse removeJob(org.hpccsystems.ws.client.gen.wssmc.v1_2.RemoveJob parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.removeJob(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2.SMCQueueResponse resumeQueue(org.hpccsystems.ws.client.gen.wssmc.v1_2.ResumeQueue parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.resumeQueue(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2.RoxieControlCmdResponse roxieControlCmd(org.hpccsystems.ws.client.gen.wssmc.v1_2.RoxieControlCmd parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.roxieControlCmd(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2.SetBannerResponse setBanner(org.hpccsystems.ws.client.gen.wssmc.v1_2.SetBanner parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.setBanner(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2.SMCPriorityResponse setJobPriority(org.hpccsystems.ws.client.gen.wssmc.v1_2.SetJobPriority parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.setJobPriority(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2.SMCQueueResponse stopQueue(org.hpccsystems.ws.client.gen.wssmc.v1_2.StopQueue parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.stopQueue(parameters);
  }
  
  
}
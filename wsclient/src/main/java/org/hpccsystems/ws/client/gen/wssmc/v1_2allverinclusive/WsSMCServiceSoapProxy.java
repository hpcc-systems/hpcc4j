package org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive;

public class WsSMCServiceSoapProxy implements org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.WsSMCServiceSoap {
  private String _endpoint = null;
  private org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.WsSMCServiceSoap wsSMCServiceSoap = null;
  
  public WsSMCServiceSoapProxy() {
    _initWsSMCServiceSoapProxy();
  }
  
  public WsSMCServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWsSMCServiceSoapProxy();
  }
  
  private void _initWsSMCServiceSoapProxy() {
    try {
      wsSMCServiceSoap = (new org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.WsSMCLocator()).getWsSMCServiceSoap();
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
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.WsSMCServiceSoap getWsSMCServiceSoap() {
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap;
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ActivityResponse activity(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.Activity parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.activity(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.BrowseResourcesResponse browseResources(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.BrowseResources parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.browseResources(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.SMCQueueResponse clearQueue(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ClearQueue parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.clearQueue(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.GetStatusServerInfoResponse getStatusServerInfo(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.GetStatusServerInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.getStatusServerInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.GetThorQueueAvailabilityResponse getThorQueueAvailability(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.GetThorQueueAvailability parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.getThorQueueAvailability(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.SMCIndexResponse index(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.Index parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.index(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.LockQueryResponse lockQuery(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.LockQuery parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.lockQuery(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.SMCJobResponse moveJobBack(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.MoveJobBack parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.moveJobBack(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.SMCJobResponse moveJobDown(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.MoveJobDown parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.moveJobDown(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.SMCJobResponse moveJobFront(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.MoveJobFront parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.moveJobFront(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.SMCJobResponse moveJobUp(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.MoveJobUp parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.moveJobUp(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.NotInCommunityEditionResponse notInCommunityEdition(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.NotInCommunityEdition parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.notInCommunityEdition(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.SMCQueueResponse pauseQueue(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.PauseQueue parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.pauseQueue(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.WsSMCPingResponse ping(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.Ping parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.ping(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.SMCJobResponse removeJob(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.RemoveJob parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.removeJob(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.SMCQueueResponse resumeQueue(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ResumeQueue parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.resumeQueue(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.RoxieControlCmdResponse roxieControlCmd(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.RoxieControlCmd parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.roxieControlCmd(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.SetBannerResponse setBanner(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.SetBanner parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.setBanner(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.SMCPriorityResponse setJobPriority(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.SetJobPriority parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.setJobPriority(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.SMCQueueResponse stopQueue(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.StopQueue parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.stopQueue(parameters);
  }
  
  
}
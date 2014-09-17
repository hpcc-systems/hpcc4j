package org.hpccsystems.ws.client.gen.wssmc.v1_19;

public class WsSMCServiceSoapProxy implements org.hpccsystems.ws.client.gen.wssmc.v1_19.WsSMCServiceSoap {
  private String _endpoint = null;
  private org.hpccsystems.ws.client.gen.wssmc.v1_19.WsSMCServiceSoap wsSMCServiceSoap = null;
  
  public WsSMCServiceSoapProxy() {
    _initWsSMCServiceSoapProxy();
  }
  
  public WsSMCServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWsSMCServiceSoapProxy();
  }
  
  private void _initWsSMCServiceSoapProxy() {
    try {
      wsSMCServiceSoap = (new org.hpccsystems.ws.client.gen.wssmc.v1_19.WsSMCLocator()).getWsSMCServiceSoap();
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
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_19.WsSMCServiceSoap getWsSMCServiceSoap() {
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap;
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_19.ActivityResponse activity(org.hpccsystems.ws.client.gen.wssmc.v1_19.Activity parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_19.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.activity(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_19.BrowseResourcesResponse browseResources() throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_19.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.browseResources();
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_19.SMCQueueResponse clearQueue(org.hpccsystems.ws.client.gen.wssmc.v1_19.ClearQueue parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_19.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.clearQueue(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_19.GetStatusServerInfoResponse getStatusServerInfo(org.hpccsystems.ws.client.gen.wssmc.v1_19.GetStatusServerInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_19.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.getStatusServerInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_19.GetThorQueueAvailabilityResponse getThorQueueAvailability() throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_19.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.getThorQueueAvailability();
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_19.SMCIndexResponse index() throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_19.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.index();
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_19.SMCJobResponse moveJobBack(org.hpccsystems.ws.client.gen.wssmc.v1_19.MoveJobBack parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_19.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.moveJobBack(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_19.SMCJobResponse moveJobDown(org.hpccsystems.ws.client.gen.wssmc.v1_19.MoveJobDown parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_19.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.moveJobDown(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_19.SMCJobResponse moveJobFront(org.hpccsystems.ws.client.gen.wssmc.v1_19.MoveJobFront parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_19.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.moveJobFront(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_19.SMCJobResponse moveJobUp(org.hpccsystems.ws.client.gen.wssmc.v1_19.MoveJobUp parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_19.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.moveJobUp(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_19.NotInCommunityEditionResponse notInCommunityEdition(org.hpccsystems.ws.client.gen.wssmc.v1_19.NotInCommunityEdition parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_19.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.notInCommunityEdition(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_19.SMCQueueResponse pauseQueue(org.hpccsystems.ws.client.gen.wssmc.v1_19.PauseQueue parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_19.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.pauseQueue(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_19.SMCJobResponse removeJob(org.hpccsystems.ws.client.gen.wssmc.v1_19.RemoveJob parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_19.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.removeJob(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_19.SMCQueueResponse resumeQueue(org.hpccsystems.ws.client.gen.wssmc.v1_19.ResumeQueue parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_19.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.resumeQueue(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_19.SetBannerResponse setBanner(org.hpccsystems.ws.client.gen.wssmc.v1_19.SetBanner parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_19.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.setBanner(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_19.SMCPriorityResponse setJobPriority(org.hpccsystems.ws.client.gen.wssmc.v1_19.SetJobPriority parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_19.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.setJobPriority(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wssmc.v1_19.SMCQueueResponse stopQueue(org.hpccsystems.ws.client.gen.wssmc.v1_19.StopQueue parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_19.ArrayOfEspException{
    if (wsSMCServiceSoap == null)
      _initWsSMCServiceSoapProxy();
    return wsSMCServiceSoap.stopQueue(parameters);
  }
  
  
}
/**
 * WsSMC.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:49:45 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wssmc.latest;

/*
 *  WsSMC java interface
 */

public interface WsSMC {

  /**
   * Auto generated method signature
   *
   * @param lockQuery
   * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.LockQueryResponse lockQuery(
      org.hpccsystems.ws.client.gen.axis2.wssmc.latest.LockQuery lockQuery)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param pauseQueue
   * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SMCQueueResponse pauseQueue(
      org.hpccsystems.ws.client.gen.axis2.wssmc.latest.PauseQueue pauseQueue)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param resumeQueue
   * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SMCQueueResponse resumeQueue(
      org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ResumeQueue resumeQueue)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param index
   * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SMCIndexResponse index(
      org.hpccsystems.ws.client.gen.axis2.wssmc.latest.Index index)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param activity
   * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ActivityResponse activity(
      org.hpccsystems.ws.client.gen.axis2.wssmc.latest.Activity activity)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param moveJobDown
   * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SMCJobResponse moveJobDown(
      org.hpccsystems.ws.client.gen.axis2.wssmc.latest.MoveJobDown moveJobDown)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param setBanner
   * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SetBannerResponse setBanner(
      org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SetBanner setBanner)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param moveJobBack
   * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SMCJobResponse moveJobBack(
      org.hpccsystems.ws.client.gen.axis2.wssmc.latest.MoveJobBack moveJobBack)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param getStatusServerInfo
   * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GetStatusServerInfoResponse
      getStatusServerInfo(
          org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GetStatusServerInfo getStatusServerInfo)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param moveJobUp
   * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SMCJobResponse moveJobUp(
      org.hpccsystems.ws.client.gen.axis2.wssmc.latest.MoveJobUp moveJobUp)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param roxieControlCmd
   * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.RoxieControlCmdResponse roxieControlCmd(
      org.hpccsystems.ws.client.gen.axis2.wssmc.latest.RoxieControlCmd roxieControlCmd)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param ping
   * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.WsSMCPingResponse ping(
      org.hpccsystems.ws.client.gen.axis2.wssmc.latest.Ping ping)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param browseResources
   * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.BrowseResourcesResponse browseResources(
      org.hpccsystems.ws.client.gen.axis2.wssmc.latest.BrowseResources browseResources)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param getBuildInfo
   * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GetBuildInfoResponse getBuildInfo(
      org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GetBuildInfo getBuildInfo)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param clearQueue
   * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SMCQueueResponse clearQueue(
      org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ClearQueue clearQueue)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param getThorQueueAvailability
   * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GetThorQueueAvailabilityResponse
      getThorQueueAvailability(
          org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GetThorQueueAvailability
              getThorQueueAvailability)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param moveJobFront
   * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SMCJobResponse moveJobFront(
      org.hpccsystems.ws.client.gen.axis2.wssmc.latest.MoveJobFront moveJobFront)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param roxieXrefCmd
   * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.RoxieXrefCmdResponse roxieXrefCmd(
      org.hpccsystems.ws.client.gen.axis2.wssmc.latest.RoxieXrefCmd roxieXrefCmd)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param stopQueue
   * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SMCQueueResponse stopQueue(
      org.hpccsystems.ws.client.gen.axis2.wssmc.latest.StopQueue stopQueue)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param removeJob
   * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SMCJobResponse removeJob(
      org.hpccsystems.ws.client.gen.axis2.wssmc.latest.RemoveJob removeJob)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param setJobPriority
   * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SMCPriorityResponse setJobPriority(
      org.hpccsystems.ws.client.gen.axis2.wssmc.latest.SetJobPriority setJobPriority)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param notInCommunityEdition
   * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.NotInCommunityEditionResponse
      notInCommunityEdition(
          org.hpccsystems.ws.client.gen.axis2.wssmc.latest.NotInCommunityEdition
              notInCommunityEdition)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspSoapFault;

  //
}

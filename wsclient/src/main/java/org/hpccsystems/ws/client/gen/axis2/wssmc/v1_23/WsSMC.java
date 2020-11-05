/**
 * WsSMC.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23;


/*
 *  WsSMC java interface
 */
public interface WsSMC {
    /**
     * Auto generated method signature
     *
     * @param lockQuery
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.LockQueryResponse lockQuery(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.LockQuery lockQuery)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param pauseQueue
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.SMCQueueResponse pauseQueue(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.PauseQueue pauseQueue)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param resumeQueue
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.SMCQueueResponse resumeQueue(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ResumeQueue resumeQueue)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param index
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.SMCIndexResponse index(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.Index index)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param activity
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ActivityResponse activity(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.Activity activity)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param moveJobDown
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.SMCJobResponse moveJobDown(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.MoveJobDown moveJobDown)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param setBanner
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.SetBannerResponse setBanner(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.SetBanner setBanner)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param moveJobBack
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.SMCJobResponse moveJobBack(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.MoveJobBack moveJobBack)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getStatusServerInfo
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.GetStatusServerInfoResponse getStatusServerInfo(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.GetStatusServerInfo getStatusServerInfo)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param moveJobUp
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.SMCJobResponse moveJobUp(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.MoveJobUp moveJobUp)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param roxieControlCmd
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.RoxieControlCmdResponse roxieControlCmd(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.RoxieControlCmd roxieControlCmd)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param ping
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.WsSMCPingResponse ping(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.Ping ping)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param browseResources
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.BrowseResourcesResponse browseResources(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.BrowseResources browseResources)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getBuildInfo
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.GetBuildInfoResponse getBuildInfo(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.GetBuildInfo getBuildInfo)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param clearQueue
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.SMCQueueResponse clearQueue(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.ClearQueue clearQueue)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getThorQueueAvailability
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.GetThorQueueAvailabilityResponse getThorQueueAvailability(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.GetThorQueueAvailability getThorQueueAvailability)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param moveJobFront
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.SMCJobResponse moveJobFront(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.MoveJobFront moveJobFront)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param stopQueue
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.SMCQueueResponse stopQueue(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.StopQueue stopQueue)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param removeJob
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.SMCJobResponse removeJob(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.RemoveJob removeJob)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param setJobPriority
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.SMCPriorityResponse setJobPriority(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.SetJobPriority setJobPriority)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param notInCommunityEdition
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.NotInCommunityEditionResponse notInCommunityEdition(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.NotInCommunityEdition notInCommunityEdition)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.EspSoapFault;

    //
}

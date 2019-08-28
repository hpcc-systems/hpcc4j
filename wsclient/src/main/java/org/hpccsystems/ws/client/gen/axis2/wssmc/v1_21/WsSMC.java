/**
 * WsSMC.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21;


/*
 *  WsSMC java interface
 */
public interface WsSMC {
    /**
     * Auto generated method signature
     *
     * @param lockQuery
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.LockQueryResponse lockQuery(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.LockQuery lockQuery)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param pauseQueue
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.SMCQueueResponse pauseQueue(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.PauseQueue pauseQueue)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param resumeQueue
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.SMCQueueResponse resumeQueue(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.ResumeQueue resumeQueue)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param index
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.SMCIndexResponse index(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.Index index)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param activity
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.ActivityResponse activity(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.Activity activity)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param moveJobDown
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.SMCJobResponse moveJobDown(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.MoveJobDown moveJobDown)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param setBanner
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.SetBannerResponse setBanner(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.SetBanner setBanner)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param moveJobBack
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.SMCJobResponse moveJobBack(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.MoveJobBack moveJobBack)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getStatusServerInfo
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.GetStatusServerInfoResponse getStatusServerInfo(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.GetStatusServerInfo getStatusServerInfo)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param moveJobUp
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.SMCJobResponse moveJobUp(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.MoveJobUp moveJobUp)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param roxieControlCmd
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.RoxieControlCmdResponse roxieControlCmd(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.RoxieControlCmd roxieControlCmd)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param ping
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.WsSMCPingResponse ping(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.Ping ping)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param browseResources
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.BrowseResourcesResponse browseResources(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.BrowseResources browseResources)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param clearQueue
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.SMCQueueResponse clearQueue(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.ClearQueue clearQueue)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getThorQueueAvailability
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.GetThorQueueAvailabilityResponse getThorQueueAvailability(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.GetThorQueueAvailability getThorQueueAvailability)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param moveJobFront
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.SMCJobResponse moveJobFront(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.MoveJobFront moveJobFront)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param stopQueue
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.SMCQueueResponse stopQueue(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.StopQueue stopQueue)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param removeJob
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.SMCJobResponse removeJob(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.RemoveJob removeJob)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param setJobPriority
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.SMCPriorityResponse setJobPriority(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.SetJobPriority setJobPriority)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param notInCommunityEdition
     * @throws org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.NotInCommunityEditionResponse notInCommunityEdition(
        org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.NotInCommunityEdition notInCommunityEdition)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.EspSoapFault;

    //
}

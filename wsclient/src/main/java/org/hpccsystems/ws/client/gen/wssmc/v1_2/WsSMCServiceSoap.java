/**
 * WsSMCServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wssmc.v1_2;

public interface WsSMCServiceSoap extends java.rmi.Remote {
    public org.hpccsystems.ws.client.gen.wssmc.v1_2.ActivityResponse activity(org.hpccsystems.ws.client.gen.wssmc.v1_2.Activity parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_2.BrowseResourcesResponse browseResources(org.hpccsystems.ws.client.gen.wssmc.v1_2.BrowseResources parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_2.SMCQueueResponse clearQueue(org.hpccsystems.ws.client.gen.wssmc.v1_2.ClearQueue parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_2.GetStatusServerInfoResponse getStatusServerInfo(org.hpccsystems.ws.client.gen.wssmc.v1_2.GetStatusServerInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_2.GetThorQueueAvailabilityResponse getThorQueueAvailability(org.hpccsystems.ws.client.gen.wssmc.v1_2.GetThorQueueAvailability parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_2.SMCIndexResponse index(org.hpccsystems.ws.client.gen.wssmc.v1_2.Index parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_2.LockQueryResponse lockQuery(org.hpccsystems.ws.client.gen.wssmc.v1_2.LockQuery parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_2.SMCJobResponse moveJobBack(org.hpccsystems.ws.client.gen.wssmc.v1_2.MoveJobBack parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_2.SMCJobResponse moveJobDown(org.hpccsystems.ws.client.gen.wssmc.v1_2.MoveJobDown parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_2.SMCJobResponse moveJobFront(org.hpccsystems.ws.client.gen.wssmc.v1_2.MoveJobFront parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_2.SMCJobResponse moveJobUp(org.hpccsystems.ws.client.gen.wssmc.v1_2.MoveJobUp parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_2.NotInCommunityEditionResponse notInCommunityEdition(org.hpccsystems.ws.client.gen.wssmc.v1_2.NotInCommunityEdition parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_2.SMCQueueResponse pauseQueue(org.hpccsystems.ws.client.gen.wssmc.v1_2.PauseQueue parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_2.WsSMCPingResponse ping(org.hpccsystems.ws.client.gen.wssmc.v1_2.Ping parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_2.SMCJobResponse removeJob(org.hpccsystems.ws.client.gen.wssmc.v1_2.RemoveJob parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_2.SMCQueueResponse resumeQueue(org.hpccsystems.ws.client.gen.wssmc.v1_2.ResumeQueue parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_2.RoxieControlCmdResponse roxieControlCmd(org.hpccsystems.ws.client.gen.wssmc.v1_2.RoxieControlCmd parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_2.SetBannerResponse setBanner(org.hpccsystems.ws.client.gen.wssmc.v1_2.SetBanner parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_2.SMCPriorityResponse setJobPriority(org.hpccsystems.ws.client.gen.wssmc.v1_2.SetJobPriority parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_2.SMCQueueResponse stopQueue(org.hpccsystems.ws.client.gen.wssmc.v1_2.StopQueue parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2.ArrayOfEspException;
}

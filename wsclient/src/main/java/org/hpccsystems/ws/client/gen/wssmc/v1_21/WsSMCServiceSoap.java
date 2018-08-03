/**
 * WsSMCServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wssmc.v1_21;

public interface WsSMCServiceSoap extends java.rmi.Remote {
    public org.hpccsystems.ws.client.gen.wssmc.v1_21.ActivityResponse activity(org.hpccsystems.ws.client.gen.wssmc.v1_21.Activity parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_21.BrowseResourcesResponse browseResources(org.hpccsystems.ws.client.gen.wssmc.v1_21.BrowseResources parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCQueueResponse clearQueue(org.hpccsystems.ws.client.gen.wssmc.v1_21.ClearQueue parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_21.GetStatusServerInfoResponse getStatusServerInfo(org.hpccsystems.ws.client.gen.wssmc.v1_21.GetStatusServerInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_21.GetThorQueueAvailabilityResponse getThorQueueAvailability(org.hpccsystems.ws.client.gen.wssmc.v1_21.GetThorQueueAvailability parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCIndexResponse index(org.hpccsystems.ws.client.gen.wssmc.v1_21.Index parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_21.LockQueryResponse lockQuery(org.hpccsystems.ws.client.gen.wssmc.v1_21.LockQuery parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCJobResponse moveJobBack(org.hpccsystems.ws.client.gen.wssmc.v1_21.MoveJobBack parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCJobResponse moveJobDown(org.hpccsystems.ws.client.gen.wssmc.v1_21.MoveJobDown parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCJobResponse moveJobFront(org.hpccsystems.ws.client.gen.wssmc.v1_21.MoveJobFront parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCJobResponse moveJobUp(org.hpccsystems.ws.client.gen.wssmc.v1_21.MoveJobUp parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_21.NotInCommunityEditionResponse notInCommunityEdition(org.hpccsystems.ws.client.gen.wssmc.v1_21.NotInCommunityEdition parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCQueueResponse pauseQueue(org.hpccsystems.ws.client.gen.wssmc.v1_21.PauseQueue parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_21.WsSMCPingResponse ping(org.hpccsystems.ws.client.gen.wssmc.v1_21.Ping parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCJobResponse removeJob(org.hpccsystems.ws.client.gen.wssmc.v1_21.RemoveJob parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCQueueResponse resumeQueue(org.hpccsystems.ws.client.gen.wssmc.v1_21.ResumeQueue parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_21.RoxieControlCmdResponse roxieControlCmd(org.hpccsystems.ws.client.gen.wssmc.v1_21.RoxieControlCmd parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_21.SetBannerResponse setBanner(org.hpccsystems.ws.client.gen.wssmc.v1_21.SetBanner parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCPriorityResponse setJobPriority(org.hpccsystems.ws.client.gen.wssmc.v1_21.SetJobPriority parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_21.SMCQueueResponse stopQueue(org.hpccsystems.ws.client.gen.wssmc.v1_21.StopQueue parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_21.ArrayOfEspException;
}

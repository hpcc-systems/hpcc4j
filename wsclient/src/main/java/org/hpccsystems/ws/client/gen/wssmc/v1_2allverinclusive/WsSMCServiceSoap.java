/**
 * WsSMCServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive;

public interface WsSMCServiceSoap extends java.rmi.Remote {
    public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ActivityResponse activity(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.Activity parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.BrowseResourcesResponse browseResources(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.BrowseResources parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.SMCQueueResponse clearQueue(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ClearQueue parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.GetStatusServerInfoResponse getStatusServerInfo(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.GetStatusServerInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.GetThorQueueAvailabilityResponse getThorQueueAvailability(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.GetThorQueueAvailability parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.SMCIndexResponse index(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.Index parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.LockQueryResponse lockQuery(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.LockQuery parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.SMCJobResponse moveJobBack(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.MoveJobBack parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.SMCJobResponse moveJobDown(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.MoveJobDown parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.SMCJobResponse moveJobFront(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.MoveJobFront parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.SMCJobResponse moveJobUp(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.MoveJobUp parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.NotInCommunityEditionResponse notInCommunityEdition(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.NotInCommunityEdition parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.SMCQueueResponse pauseQueue(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.PauseQueue parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.WsSMCPingResponse ping(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.Ping parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.SMCJobResponse removeJob(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.RemoveJob parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.SMCQueueResponse resumeQueue(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ResumeQueue parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.RoxieControlCmdResponse roxieControlCmd(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.RoxieControlCmd parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.SetBannerResponse setBanner(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.SetBanner parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.SMCPriorityResponse setJobPriority(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.SetJobPriority parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.SMCQueueResponse stopQueue(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.StopQueue parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException;
}

/**
 * WsSMCServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wssmc.v1_19;

public interface WsSMCServiceSoap extends java.rmi.Remote {
    public org.hpccsystems.ws.client.gen.wssmc.v1_19.ActivityResponse activity(org.hpccsystems.ws.client.gen.wssmc.v1_19.Activity parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_19.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_19.BrowseResourcesResponse browseResources() throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_19.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_19.SMCQueueResponse clearQueue(org.hpccsystems.ws.client.gen.wssmc.v1_19.ClearQueue parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_19.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_19.GetStatusServerInfoResponse getStatusServerInfo(org.hpccsystems.ws.client.gen.wssmc.v1_19.GetStatusServerInfo parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_19.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_19.GetThorQueueAvailabilityResponse getThorQueueAvailability() throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_19.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_19.SMCIndexResponse index() throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_19.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_19.SMCJobResponse moveJobBack(org.hpccsystems.ws.client.gen.wssmc.v1_19.MoveJobBack parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_19.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_19.SMCJobResponse moveJobDown(org.hpccsystems.ws.client.gen.wssmc.v1_19.MoveJobDown parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_19.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_19.SMCJobResponse moveJobFront(org.hpccsystems.ws.client.gen.wssmc.v1_19.MoveJobFront parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_19.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_19.SMCJobResponse moveJobUp(org.hpccsystems.ws.client.gen.wssmc.v1_19.MoveJobUp parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_19.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_19.NotInCommunityEditionResponse notInCommunityEdition(org.hpccsystems.ws.client.gen.wssmc.v1_19.NotInCommunityEdition parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_19.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_19.SMCQueueResponse pauseQueue(org.hpccsystems.ws.client.gen.wssmc.v1_19.PauseQueue parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_19.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_19.SMCJobResponse removeJob(org.hpccsystems.ws.client.gen.wssmc.v1_19.RemoveJob parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_19.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_19.SMCQueueResponse resumeQueue(org.hpccsystems.ws.client.gen.wssmc.v1_19.ResumeQueue parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_19.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_19.SetBannerResponse setBanner(org.hpccsystems.ws.client.gen.wssmc.v1_19.SetBanner parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_19.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_19.SMCPriorityResponse setJobPriority(org.hpccsystems.ws.client.gen.wssmc.v1_19.SetJobPriority parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_19.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wssmc.v1_19.SMCQueueResponse stopQueue(org.hpccsystems.ws.client.gen.wssmc.v1_19.StopQueue parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wssmc.v1_19.ArrayOfEspException;
}

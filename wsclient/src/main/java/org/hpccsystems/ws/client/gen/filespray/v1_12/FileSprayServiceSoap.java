/**
 * FileSprayServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.filespray.v1_12;

public interface FileSprayServiceSoap extends java.rmi.Remote {
    public org.hpccsystems.ws.client.gen.filespray.v1_12.AbortDFUWorkunitResponse abortDFUWorkunit(org.hpccsystems.ws.client.gen.filespray.v1_12.AbortDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_12.CopyResponse copy(org.hpccsystems.ws.client.gen.filespray.v1_12.Copy parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_12.CreateDFUWorkunitResponse createDFUWorkunit() throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_12.DFUWUFileResponse DFUWUFile(org.hpccsystems.ws.client.gen.filespray.v1_12.DFUWUFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_12.DFUWUSearchResponse DFUWUSearch(org.hpccsystems.ws.client.gen.filespray.v1_12.DFUWUSearchRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_12.DFUWorkunitsActionResponse DFUWorkunitsAction(org.hpccsystems.ws.client.gen.filespray.v1_12.DFUWorkunitsActionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_12.DeleteDFUWorkunitResponse deleteDFUWorkunit(org.hpccsystems.ws.client.gen.filespray.v1_12.DeleteDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_12.DeleteDFUWorkunitsResponse deleteDFUWorkunits(org.hpccsystems.ws.client.gen.filespray.v1_12.DeleteDFUWorkunits parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_12.DFUWorkunitsActionResponse deleteDropZoneFiles(org.hpccsystems.ws.client.gen.filespray.v1_12.DeleteDropZoneFilesRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_12.DesprayResponse despray(org.hpccsystems.ws.client.gen.filespray.v1_12.Despray parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_12.DfuMonitorResponse dfuMonitor(org.hpccsystems.ws.client.gen.filespray.v1_12.DfuMonitorRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_12.DropZoneFilesResponse dropZoneFiles(org.hpccsystems.ws.client.gen.filespray.v1_12.DropZoneFilesRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_12.EchoDateTimeResponse echoDateTime(org.hpccsystems.ws.client.gen.filespray.v1_12.EchoDateTime parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_12.FileListResponse fileList(org.hpccsystems.ws.client.gen.filespray.v1_12.FileListRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_12.GetDFUExceptionsResponse getDFUExceptions(org.hpccsystems.ws.client.gen.filespray.v1_12.GetDFUExceptions parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_12.ProgressResponse getDFUProgress(org.hpccsystems.ws.client.gen.filespray.v1_12.ProgressRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_12.GetDFUWorkunitResponse getDFUWorkunit(org.hpccsystems.ws.client.gen.filespray.v1_12.GetDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_12.GetDFUWorkunitsResponse getDFUWorkunits(org.hpccsystems.ws.client.gen.filespray.v1_12.GetDFUWorkunits parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_12.GetSprayTargetsResponse getSprayTargets(org.hpccsystems.ws.client.gen.filespray.v1_12.GetSprayTargetsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_12.OpenSaveResponse openSave(org.hpccsystems.ws.client.gen.filespray.v1_12.OpenSaveRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_12.RenameResponse rename(org.hpccsystems.ws.client.gen.filespray.v1_12.Rename parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_12.ReplicateResponse replicate(org.hpccsystems.ws.client.gen.filespray.v1_12.Replicate parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_12.ShowResultResponse showResult(org.hpccsystems.ws.client.gen.filespray.v1_12.ShowResultRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_12.SprayFixedResponse sprayFixed(org.hpccsystems.ws.client.gen.filespray.v1_12.SprayFixed parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_12.SprayResponse sprayVariable(org.hpccsystems.ws.client.gen.filespray.v1_12.SprayVariable parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_12.SubmitDFUWorkunitResponse submitDFUWorkunit(org.hpccsystems.ws.client.gen.filespray.v1_12.SubmitDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_12.UpdateDFUWorkunitResponse updateDFUWorkunit(org.hpccsystems.ws.client.gen.filespray.v1_12.UpdateDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_12.ArrayOfEspException;
}

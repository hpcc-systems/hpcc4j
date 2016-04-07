/**
 * FileSprayServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.filespray.v1_13;

public interface FileSprayServiceSoap extends java.rmi.Remote {
    public org.hpccsystems.ws.client.gen.filespray.v1_13.AbortDFUWorkunitResponse abortDFUWorkunit(org.hpccsystems.ws.client.gen.filespray.v1_13.AbortDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_13.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_13.CopyResponse copy(org.hpccsystems.ws.client.gen.filespray.v1_13.Copy parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_13.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_13.CreateDFUWorkunitResponse createDFUWorkunit() throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_13.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_13.DFUWUFileResponse DFUWUFile(org.hpccsystems.ws.client.gen.filespray.v1_13.DFUWUFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_13.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_13.DFUWUSearchResponse DFUWUSearch(org.hpccsystems.ws.client.gen.filespray.v1_13.DFUWUSearchRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_13.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_13.DFUWorkunitsActionResponse DFUWorkunitsAction(org.hpccsystems.ws.client.gen.filespray.v1_13.DFUWorkunitsActionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_13.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_13.DeleteDFUWorkunitResponse deleteDFUWorkunit(org.hpccsystems.ws.client.gen.filespray.v1_13.DeleteDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_13.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_13.DeleteDFUWorkunitsResponse deleteDFUWorkunits(org.hpccsystems.ws.client.gen.filespray.v1_13.DeleteDFUWorkunits parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_13.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_13.DFUWorkunitsActionResponse deleteDropZoneFiles(org.hpccsystems.ws.client.gen.filespray.v1_13.DeleteDropZoneFilesRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_13.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_13.DesprayResponse despray(org.hpccsystems.ws.client.gen.filespray.v1_13.Despray parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_13.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_13.DfuMonitorResponse dfuMonitor(org.hpccsystems.ws.client.gen.filespray.v1_13.DfuMonitorRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_13.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_13.DropZoneFileSearchResponse dropZoneFileSearch(org.hpccsystems.ws.client.gen.filespray.v1_13.DropZoneFileSearchRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_13.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_13.DropZoneFilesResponse dropZoneFiles(org.hpccsystems.ws.client.gen.filespray.v1_13.DropZoneFilesRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_13.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_13.EchoDateTimeResponse echoDateTime(org.hpccsystems.ws.client.gen.filespray.v1_13.EchoDateTime parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_13.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_13.FileListResponse fileList(org.hpccsystems.ws.client.gen.filespray.v1_13.FileListRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_13.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_13.GetDFUExceptionsResponse getDFUExceptions(org.hpccsystems.ws.client.gen.filespray.v1_13.GetDFUExceptions parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_13.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_13.ProgressResponse getDFUProgress(org.hpccsystems.ws.client.gen.filespray.v1_13.ProgressRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_13.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_13.GetDFUWorkunitResponse getDFUWorkunit(org.hpccsystems.ws.client.gen.filespray.v1_13.GetDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_13.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_13.GetDFUWorkunitsResponse getDFUWorkunits(org.hpccsystems.ws.client.gen.filespray.v1_13.GetDFUWorkunits parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_13.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_13.GetSprayTargetsResponse getSprayTargets(org.hpccsystems.ws.client.gen.filespray.v1_13.GetSprayTargetsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_13.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_13.OpenSaveResponse openSave(org.hpccsystems.ws.client.gen.filespray.v1_13.OpenSaveRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_13.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_13.RenameResponse rename(org.hpccsystems.ws.client.gen.filespray.v1_13.Rename parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_13.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_13.ReplicateResponse replicate(org.hpccsystems.ws.client.gen.filespray.v1_13.Replicate parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_13.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_13.ShowResultResponse showResult(org.hpccsystems.ws.client.gen.filespray.v1_13.ShowResultRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_13.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_13.SprayFixedResponse sprayFixed(org.hpccsystems.ws.client.gen.filespray.v1_13.SprayFixed parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_13.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_13.SprayResponse sprayVariable(org.hpccsystems.ws.client.gen.filespray.v1_13.SprayVariable parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_13.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_13.SubmitDFUWorkunitResponse submitDFUWorkunit(org.hpccsystems.ws.client.gen.filespray.v1_13.SubmitDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_13.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_13.UpdateDFUWorkunitResponse updateDFUWorkunit(org.hpccsystems.ws.client.gen.filespray.v1_13.UpdateDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_13.ArrayOfEspException;
}

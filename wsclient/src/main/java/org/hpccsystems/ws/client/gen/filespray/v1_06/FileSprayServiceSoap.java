/**
 * FileSprayServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.filespray.v1_06;

public interface FileSprayServiceSoap extends java.rmi.Remote {
    public org.hpccsystems.ws.client.gen.filespray.v1_06.AbortDFUWorkunitResponse abortDFUWorkunit(org.hpccsystems.ws.client.gen.filespray.v1_06.AbortDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_06.CopyResponse copy(org.hpccsystems.ws.client.gen.filespray.v1_06.Copy parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_06.CreateDFUWorkunitResponse createDFUWorkunit() throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_06.DFUWUFileResponse DFUWUFile(org.hpccsystems.ws.client.gen.filespray.v1_06.DFUWUFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_06.DFUWUSearchResponse DFUWUSearch(org.hpccsystems.ws.client.gen.filespray.v1_06.DFUWUSearchRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_06.DFUWorkunitsActionResponse DFUWorkunitsAction(org.hpccsystems.ws.client.gen.filespray.v1_06.DFUWorkunitsActionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_06.DeleteDFUWorkunitResponse deleteDFUWorkunit(org.hpccsystems.ws.client.gen.filespray.v1_06.DeleteDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_06.DeleteDFUWorkunitsResponse deleteDFUWorkunits(org.hpccsystems.ws.client.gen.filespray.v1_06.DeleteDFUWorkunits parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_06.DFUWorkunitsActionResponse deleteDropZoneFiles(org.hpccsystems.ws.client.gen.filespray.v1_06.DeleteDropZoneFilesRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_06.DesprayResponse despray(org.hpccsystems.ws.client.gen.filespray.v1_06.Despray parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_06.DfuMonitorResponse dfuMonitor(org.hpccsystems.ws.client.gen.filespray.v1_06.DfuMonitorRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_06.DropZoneFilesResponse dropZoneFiles(org.hpccsystems.ws.client.gen.filespray.v1_06.DropZoneFilesRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_06.EchoDateTimeResponse echoDateTime(org.hpccsystems.ws.client.gen.filespray.v1_06.EchoDateTime parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_06.FileListResponse fileList(org.hpccsystems.ws.client.gen.filespray.v1_06.FileListRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_06.GetDFUExceptionsResponse getDFUExceptions(org.hpccsystems.ws.client.gen.filespray.v1_06.GetDFUExceptions parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_06.ProgressResponse getDFUProgress(org.hpccsystems.ws.client.gen.filespray.v1_06.ProgressRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_06.GetDFUWorkunitResponse getDFUWorkunit(org.hpccsystems.ws.client.gen.filespray.v1_06.GetDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_06.GetDFUWorkunitsResponse getDFUWorkunits(org.hpccsystems.ws.client.gen.filespray.v1_06.GetDFUWorkunits parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_06.OpenSaveResponse openSave(org.hpccsystems.ws.client.gen.filespray.v1_06.OpenSaveRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_06.RenameResponse rename(org.hpccsystems.ws.client.gen.filespray.v1_06.Rename parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_06.ReplicateResponse replicate(org.hpccsystems.ws.client.gen.filespray.v1_06.Replicate parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_06.ShowResultResponse showResult(org.hpccsystems.ws.client.gen.filespray.v1_06.ShowResultRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_06.SprayFixedResponse sprayFixed(org.hpccsystems.ws.client.gen.filespray.v1_06.SprayFixed parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_06.SprayResponse sprayVariable(org.hpccsystems.ws.client.gen.filespray.v1_06.SprayVariable parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_06.SubmitDFUWorkunitResponse submitDFUWorkunit(org.hpccsystems.ws.client.gen.filespray.v1_06.SubmitDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.filespray.v1_06.UpdateDFUWorkunitResponse updateDFUWorkunit(org.hpccsystems.ws.client.gen.filespray.v1_06.UpdateDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException;
}

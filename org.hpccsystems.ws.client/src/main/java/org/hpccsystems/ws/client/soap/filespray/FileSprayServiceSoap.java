/**
 * FileSprayServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.soap.filespray;

public interface FileSprayServiceSoap extends java.rmi.Remote {
    public org.hpccsystems.ws.client.soap.filespray.AbortDFUWorkunitResponse abortDFUWorkunit(org.hpccsystems.ws.client.soap.filespray.AbortDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException;
    public org.hpccsystems.ws.client.soap.filespray.CopyResponse copy(org.hpccsystems.ws.client.soap.filespray.Copy parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException;
    public org.hpccsystems.ws.client.soap.filespray.CreateDFUWorkunitResponse createDFUWorkunit() throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException;
    public org.hpccsystems.ws.client.soap.filespray.DFUWUFileResponse DFUWUFile(org.hpccsystems.ws.client.soap.filespray.DFUWUFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException;
    public org.hpccsystems.ws.client.soap.filespray.DFUWUSearchResponse DFUWUSearch(org.hpccsystems.ws.client.soap.filespray.DFUWUSearchRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException;
    public org.hpccsystems.ws.client.soap.filespray.DFUWorkunitsActionResponse DFUWorkunitsAction(org.hpccsystems.ws.client.soap.filespray.DFUWorkunitsActionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException;
    public org.hpccsystems.ws.client.soap.filespray.DeleteDFUWorkunitResponse deleteDFUWorkunit(org.hpccsystems.ws.client.soap.filespray.DeleteDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException;
    public org.hpccsystems.ws.client.soap.filespray.DeleteDFUWorkunitsResponse deleteDFUWorkunits(org.hpccsystems.ws.client.soap.filespray.DeleteDFUWorkunits parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException;
    public org.hpccsystems.ws.client.soap.filespray.DFUWorkunitsActionResponse deleteDropZoneFiles(org.hpccsystems.ws.client.soap.filespray.DeleteDropZoneFilesRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException;
    public org.hpccsystems.ws.client.soap.filespray.DesprayResponse despray(org.hpccsystems.ws.client.soap.filespray.Despray parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException;
    public org.hpccsystems.ws.client.soap.filespray.DfuMonitorResponse dfuMonitor(org.hpccsystems.ws.client.soap.filespray.DfuMonitorRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException;
    public org.hpccsystems.ws.client.soap.filespray.DropZoneFilesResponse dropZoneFiles(org.hpccsystems.ws.client.soap.filespray.DropZoneFilesRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException;
    public org.hpccsystems.ws.client.soap.filespray.EchoDateTimeResponse echoDateTime(org.hpccsystems.ws.client.soap.filespray.EchoDateTime parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException;
    public org.hpccsystems.ws.client.soap.filespray.FileListResponse fileList(org.hpccsystems.ws.client.soap.filespray.FileListRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException;
    public org.hpccsystems.ws.client.soap.filespray.GetDFUExceptionsResponse getDFUExceptions(org.hpccsystems.ws.client.soap.filespray.GetDFUExceptions parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException;
    public org.hpccsystems.ws.client.soap.filespray.ProgressResponse getDFUProgress(org.hpccsystems.ws.client.soap.filespray.ProgressRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException;
    public org.hpccsystems.ws.client.soap.filespray.GetDFUWorkunitResponse getDFUWorkunit(org.hpccsystems.ws.client.soap.filespray.GetDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException;
    public org.hpccsystems.ws.client.soap.filespray.GetDFUWorkunitsResponse getDFUWorkunits(org.hpccsystems.ws.client.soap.filespray.GetDFUWorkunits parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException;
    public org.hpccsystems.ws.client.soap.filespray.OpenSaveResponse openSave(org.hpccsystems.ws.client.soap.filespray.OpenSaveRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException;
    public org.hpccsystems.ws.client.soap.filespray.RenameResponse rename(org.hpccsystems.ws.client.soap.filespray.Rename parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException;
    public org.hpccsystems.ws.client.soap.filespray.ReplicateResponse replicate(org.hpccsystems.ws.client.soap.filespray.Replicate parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException;
    public org.hpccsystems.ws.client.soap.filespray.ShowResultResponse showResult(org.hpccsystems.ws.client.soap.filespray.ShowResultRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException;
    public org.hpccsystems.ws.client.soap.filespray.SprayFixedResponse sprayFixed(org.hpccsystems.ws.client.soap.filespray.SprayFixed parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException;
    public org.hpccsystems.ws.client.soap.filespray.SprayResponse sprayVariable(org.hpccsystems.ws.client.soap.filespray.SprayVariable parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException;
    public org.hpccsystems.ws.client.soap.filespray.SubmitDFUWorkunitResponse submitDFUWorkunit(org.hpccsystems.ws.client.soap.filespray.SubmitDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException;
    public org.hpccsystems.ws.client.soap.filespray.UpdateDFUWorkunitResponse updateDFUWorkunit(org.hpccsystems.ws.client.soap.filespray.UpdateDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException;
}

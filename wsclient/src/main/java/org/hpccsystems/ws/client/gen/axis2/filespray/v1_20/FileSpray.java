/**
 * FileSpray.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.filespray.v1_20;


/*
 *  FileSpray java interface
 */
public interface FileSpray {
    /**
     * Auto generated method signature
     *
     * @param sprayVariable
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SprayResponse sprayVariable(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SprayVariable sprayVariable)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUWUFileRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWUFileResponse dFUWUFile(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWUFileRequest dFUWUFileRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param fileSprayPingRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSprayPingResponse ping(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSprayPingRequest fileSprayPingRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param copy
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.CopyResponse copy(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Copy copy)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param replicate
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ReplicateResponse replicate(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Replicate replicate)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param createDFUWorkunit
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.CreateDFUWorkunitResponse createDFUWorkunit(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.CreateDFUWorkunit createDFUWorkunit)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getDFUWorkunit
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUWorkunitResponse getDFUWorkunit(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUWorkunit getDFUWorkunit)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param rename
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.RenameResponse rename(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Rename rename)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param sprayFixed
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SprayFixedResponse sprayFixed(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SprayFixed sprayFixed)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param showResultRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ShowResultResponse showResult(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ShowResultRequest showResultRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param abortDFUWorkunit
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.AbortDFUWorkunitResponse abortDFUWorkunit(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.AbortDFUWorkunit abortDFUWorkunit)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dropZoneFileSearchRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DropZoneFileSearchResponse dropZoneFileSearch(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DropZoneFileSearchRequest dropZoneFileSearchRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getDFUServerQueuesRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUServerQueuesResponse getDFUServerQueues(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUServerQueuesRequest getDFUServerQueuesRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param deleteDFUWorkunits
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDFUWorkunitsResponse deleteDFUWorkunits(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDFUWorkunits deleteDFUWorkunits)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param despray
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DesprayResponse despray(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Despray despray)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param fileListRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileListResponse fileList(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileListRequest fileListRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUWorkunitsActionRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWorkunitsActionResponse dFUWorkunitsAction(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWorkunitsActionRequest dFUWorkunitsActionRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dropZoneFilesRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DropZoneFilesResponse dropZoneFiles(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DropZoneFilesRequest dropZoneFilesRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param deleteDFUWorkunit
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDFUWorkunitResponse deleteDFUWorkunit(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDFUWorkunit deleteDFUWorkunit)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param submitDFUWorkunit
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SubmitDFUWorkunitResponse submitDFUWorkunit(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SubmitDFUWorkunit submitDFUWorkunit)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dfuMonitorRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DfuMonitorResponse dfuMonitor(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DfuMonitorRequest dfuMonitorRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUWUSearchRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWUSearchResponse dFUWUSearch(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWUSearchRequest dFUWUSearchRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getDFUWorkunits
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUWorkunitsResponse getDFUWorkunits(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUWorkunits getDFUWorkunits)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param deleteDropZoneFilesRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWorkunitsActionResponse deleteDropZoneFiles(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDropZoneFilesRequest deleteDropZoneFilesRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getSprayTargetsRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetSprayTargetsResponse getSprayTargets(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetSprayTargetsRequest getSprayTargetsRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getDFUExceptions
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUExceptionsResponse getDFUExceptions(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUExceptions getDFUExceptions)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param echoDateTime
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EchoDateTimeResponse echoDateTime(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EchoDateTime echoDateTime)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param updateDFUWorkunit
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.UpdateDFUWorkunitResponse updateDFUWorkunit(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.UpdateDFUWorkunit updateDFUWorkunit)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param progressRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ProgressResponse getDFUProgress(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ProgressRequest progressRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param openSaveRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.OpenSaveResponse openSave(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.OpenSaveRequest openSaveRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault;

    //
}

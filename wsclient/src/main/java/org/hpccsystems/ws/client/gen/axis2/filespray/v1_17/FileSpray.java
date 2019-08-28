/**
 * FileSpray.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.filespray.v1_17;


/*
 *  FileSpray java interface
 */
public interface FileSpray {
    /**
     * Auto generated method signature
     *
     * @param sprayVariable
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.SprayResponse sprayVariable(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.SprayVariable sprayVariable)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUWUFileRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUWUFileResponse dFUWUFile(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUWUFileRequest dFUWUFileRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param fileSprayPingRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.FileSprayPingResponse ping(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.FileSprayPingRequest fileSprayPingRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param copy
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.CopyResponse copy(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.Copy copy)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param replicate
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.ReplicateResponse replicate(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.Replicate replicate)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param createDFUWorkunit
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.CreateDFUWorkunitResponse createDFUWorkunit(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.CreateDFUWorkunit createDFUWorkunit)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getDFUWorkunit
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GetDFUWorkunitResponse getDFUWorkunit(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GetDFUWorkunit getDFUWorkunit)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param rename
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.RenameResponse rename(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.Rename rename)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param sprayFixed
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.SprayFixedResponse sprayFixed(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.SprayFixed sprayFixed)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param showResultRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.ShowResultResponse showResult(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.ShowResultRequest showResultRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param abortDFUWorkunit
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.AbortDFUWorkunitResponse abortDFUWorkunit(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.AbortDFUWorkunit abortDFUWorkunit)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dropZoneFileSearchRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DropZoneFileSearchResponse dropZoneFileSearch(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DropZoneFileSearchRequest dropZoneFileSearchRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getDFUServerQueuesRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GetDFUServerQueuesResponse getDFUServerQueues(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GetDFUServerQueuesRequest getDFUServerQueuesRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param deleteDFUWorkunits
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DeleteDFUWorkunitsResponse deleteDFUWorkunits(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DeleteDFUWorkunits deleteDFUWorkunits)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param despray
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DesprayResponse despray(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.Despray despray)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param fileListRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.FileListResponse fileList(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.FileListRequest fileListRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUWorkunitsActionRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUWorkunitsActionResponse dFUWorkunitsAction(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUWorkunitsActionRequest dFUWorkunitsActionRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dropZoneFilesRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DropZoneFilesResponse dropZoneFiles(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DropZoneFilesRequest dropZoneFilesRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param deleteDFUWorkunit
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DeleteDFUWorkunitResponse deleteDFUWorkunit(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DeleteDFUWorkunit deleteDFUWorkunit)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param submitDFUWorkunit
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.SubmitDFUWorkunitResponse submitDFUWorkunit(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.SubmitDFUWorkunit submitDFUWorkunit)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dfuMonitorRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DfuMonitorResponse dfuMonitor(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DfuMonitorRequest dfuMonitorRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param dFUWUSearchRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUWUSearchResponse dFUWUSearch(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUWUSearchRequest dFUWUSearchRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getDFUWorkunits
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GetDFUWorkunitsResponse getDFUWorkunits(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GetDFUWorkunits getDFUWorkunits)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param deleteDropZoneFilesRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DFUWorkunitsActionResponse deleteDropZoneFiles(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DeleteDropZoneFilesRequest deleteDropZoneFilesRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getSprayTargetsRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GetSprayTargetsResponse getSprayTargets(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GetSprayTargetsRequest getSprayTargetsRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getDFUExceptions
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GetDFUExceptionsResponse getDFUExceptions(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GetDFUExceptions getDFUExceptions)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param echoDateTime
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EchoDateTimeResponse echoDateTime(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EchoDateTime echoDateTime)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param updateDFUWorkunit
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.UpdateDFUWorkunitResponse updateDFUWorkunit(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.UpdateDFUWorkunit updateDFUWorkunit)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param progressRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.ProgressResponse getDFUProgress(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.ProgressRequest progressRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param openSaveRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.OpenSaveResponse openSave(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.OpenSaveRequest openSaveRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspSoapFault;

    //
}

package org.hpccsystems.ws.client.soap.filespray;

public class FileSprayServiceSoapProxy implements org.hpccsystems.ws.client.soap.filespray.FileSprayServiceSoap {
  private String _endpoint = null;
  private org.hpccsystems.ws.client.soap.filespray.FileSprayServiceSoap fileSprayServiceSoap = null;
  
  public FileSprayServiceSoapProxy() {
    _initFileSprayServiceSoapProxy();
  }
  
  public FileSprayServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initFileSprayServiceSoapProxy();
  }
  
  private void _initFileSprayServiceSoapProxy() {
    try {
      fileSprayServiceSoap = (new org.hpccsystems.ws.client.soap.filespray.FileSprayLocator()).getFileSprayServiceSoap();
      if (fileSprayServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)fileSprayServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)fileSprayServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (fileSprayServiceSoap != null)
      ((javax.xml.rpc.Stub)fileSprayServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.hpccsystems.ws.client.soap.filespray.FileSprayServiceSoap getFileSprayServiceSoap() {
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap;
  }
  
  public org.hpccsystems.ws.client.soap.filespray.AbortDFUWorkunitResponse abortDFUWorkunit(org.hpccsystems.ws.client.soap.filespray.AbortDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.abortDFUWorkunit(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.filespray.CopyResponse copy(org.hpccsystems.ws.client.soap.filespray.Copy parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.copy(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.filespray.CreateDFUWorkunitResponse createDFUWorkunit() throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.createDFUWorkunit();
  }
  
  public org.hpccsystems.ws.client.soap.filespray.DFUWUFileResponse DFUWUFile(org.hpccsystems.ws.client.soap.filespray.DFUWUFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.DFUWUFile(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.filespray.DFUWUSearchResponse DFUWUSearch(org.hpccsystems.ws.client.soap.filespray.DFUWUSearchRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.DFUWUSearch(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.filespray.DFUWorkunitsActionResponse DFUWorkunitsAction(org.hpccsystems.ws.client.soap.filespray.DFUWorkunitsActionRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.DFUWorkunitsAction(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.filespray.DeleteDFUWorkunitResponse deleteDFUWorkunit(org.hpccsystems.ws.client.soap.filespray.DeleteDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.deleteDFUWorkunit(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.filespray.DeleteDFUWorkunitsResponse deleteDFUWorkunits(org.hpccsystems.ws.client.soap.filespray.DeleteDFUWorkunits parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.deleteDFUWorkunits(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.filespray.DFUWorkunitsActionResponse deleteDropZoneFiles(org.hpccsystems.ws.client.soap.filespray.DeleteDropZoneFilesRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.deleteDropZoneFiles(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.filespray.DesprayResponse despray(org.hpccsystems.ws.client.soap.filespray.Despray parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.despray(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.filespray.DfuMonitorResponse dfuMonitor(org.hpccsystems.ws.client.soap.filespray.DfuMonitorRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.dfuMonitor(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.filespray.DropZoneFilesResponse dropZoneFiles(org.hpccsystems.ws.client.soap.filespray.DropZoneFilesRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.dropZoneFiles(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.filespray.EchoDateTimeResponse echoDateTime(org.hpccsystems.ws.client.soap.filespray.EchoDateTime parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.echoDateTime(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.filespray.FileListResponse fileList(org.hpccsystems.ws.client.soap.filespray.FileListRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.fileList(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.filespray.GetDFUExceptionsResponse getDFUExceptions(org.hpccsystems.ws.client.soap.filespray.GetDFUExceptions parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.getDFUExceptions(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.filespray.ProgressResponse getDFUProgress(org.hpccsystems.ws.client.soap.filespray.ProgressRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.getDFUProgress(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.filespray.GetDFUWorkunitResponse getDFUWorkunit(org.hpccsystems.ws.client.soap.filespray.GetDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.getDFUWorkunit(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.filespray.GetDFUWorkunitsResponse getDFUWorkunits(org.hpccsystems.ws.client.soap.filespray.GetDFUWorkunits parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.getDFUWorkunits(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.filespray.OpenSaveResponse openSave(org.hpccsystems.ws.client.soap.filespray.OpenSaveRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.openSave(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.filespray.RenameResponse rename(org.hpccsystems.ws.client.soap.filespray.Rename parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.rename(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.filespray.ReplicateResponse replicate(org.hpccsystems.ws.client.soap.filespray.Replicate parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.replicate(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.filespray.ShowResultResponse showResult(org.hpccsystems.ws.client.soap.filespray.ShowResultRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.showResult(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.filespray.SprayFixedResponse sprayFixed(org.hpccsystems.ws.client.soap.filespray.SprayFixed parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.sprayFixed(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.filespray.SprayResponse sprayVariable(org.hpccsystems.ws.client.soap.filespray.SprayVariable parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.sprayVariable(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.filespray.SubmitDFUWorkunitResponse submitDFUWorkunit(org.hpccsystems.ws.client.soap.filespray.SubmitDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.submitDFUWorkunit(parameters);
  }
  
  public org.hpccsystems.ws.client.soap.filespray.UpdateDFUWorkunitResponse updateDFUWorkunit(org.hpccsystems.ws.client.soap.filespray.UpdateDFUWorkunit parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.filespray.ArrayOfEspException{
    if (fileSprayServiceSoap == null)
      _initFileSprayServiceSoapProxy();
    return fileSprayServiceSoap.updateDFUWorkunit(parameters);
  }
  
  
}
package org.hpccsystems.ws.client.gen.wspackageprocess.v1_03;

public class WsPackageProcessServiceSoapProxy implements org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.WsPackageProcessServiceSoap {
  private String _endpoint = null;
  private org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.WsPackageProcessServiceSoap wsPackageProcessServiceSoap = null;
  
  public WsPackageProcessServiceSoapProxy() {
    _initWsPackageProcessServiceSoapProxy();
  }
  
  public WsPackageProcessServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWsPackageProcessServiceSoapProxy();
  }
  
  private void _initWsPackageProcessServiceSoapProxy() {
    try {
      wsPackageProcessServiceSoap = (new org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.WsPackageProcessLocator()).getWsPackageProcessServiceSoap();
      if (wsPackageProcessServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wsPackageProcessServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wsPackageProcessServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wsPackageProcessServiceSoap != null)
      ((javax.xml.rpc.Stub)wsPackageProcessServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.WsPackageProcessServiceSoap getWsPackageProcessServiceSoap() {
    if (wsPackageProcessServiceSoap == null)
      _initWsPackageProcessServiceSoapProxy();
    return wsPackageProcessServiceSoap;
  }
  
  public org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ActivatePackageResponse activatePackage(org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ActivatePackageRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ArrayOfEspException{
    if (wsPackageProcessServiceSoap == null)
      _initWsPackageProcessServiceSoapProxy();
    return wsPackageProcessServiceSoap.activatePackage(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.AddPackageResponse addPackage(org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.AddPackageRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ArrayOfEspException{
    if (wsPackageProcessServiceSoap == null)
      _initWsPackageProcessServiceSoapProxy();
    return wsPackageProcessServiceSoap.addPackage(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.AddPartToPackageMapResponse addPartToPackageMap(org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.AddPartToPackageMapRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ArrayOfEspException{
    if (wsPackageProcessServiceSoap == null)
      _initWsPackageProcessServiceSoapProxy();
    return wsPackageProcessServiceSoap.addPartToPackageMap(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.CopyPackageMapResponse copyPackageMap(org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.CopyPackageMapRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ArrayOfEspException{
    if (wsPackageProcessServiceSoap == null)
      _initWsPackageProcessServiceSoapProxy();
    return wsPackageProcessServiceSoap.copyPackageMap(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.DeActivatePackageResponse deActivatePackage(org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.DeActivatePackageRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ArrayOfEspException{
    if (wsPackageProcessServiceSoap == null)
      _initWsPackageProcessServiceSoapProxy();
    return wsPackageProcessServiceSoap.deActivatePackage(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.DeletePackageResponse deletePackage(org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.DeletePackageRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ArrayOfEspException{
    if (wsPackageProcessServiceSoap == null)
      _initWsPackageProcessServiceSoapProxy();
    return wsPackageProcessServiceSoap.deletePackage(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.EchoResponse echo(org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.EchoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ArrayOfEspException{
    if (wsPackageProcessServiceSoap == null)
      _initWsPackageProcessServiceSoapProxy();
    return wsPackageProcessServiceSoap.echo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.GetPackageResponse getPackage(org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.GetPackageRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ArrayOfEspException{
    if (wsPackageProcessServiceSoap == null)
      _initWsPackageProcessServiceSoapProxy();
    return wsPackageProcessServiceSoap.getPackage(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.GetPackageMapByIdResponse getPackageMapById(org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.GetPackageMapByIdRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ArrayOfEspException{
    if (wsPackageProcessServiceSoap == null)
      _initWsPackageProcessServiceSoapProxy();
    return wsPackageProcessServiceSoap.getPackageMapById(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.GetPackageMapSelectOptionsResponse getPackageMapSelectOptions(org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.GetPackageMapSelectOptionsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ArrayOfEspException{
    if (wsPackageProcessServiceSoap == null)
      _initWsPackageProcessServiceSoapProxy();
    return wsPackageProcessServiceSoap.getPackageMapSelectOptions(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.GetPartFromPackageMapResponse getPartFromPackageMap(org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.GetPartFromPackageMapRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ArrayOfEspException{
    if (wsPackageProcessServiceSoap == null)
      _initWsPackageProcessServiceSoapProxy();
    return wsPackageProcessServiceSoap.getPartFromPackageMap(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.GetQueryFileMappingResponse getQueryFileMapping(org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.GetQueryFileMappingRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ArrayOfEspException{
    if (wsPackageProcessServiceSoap == null)
      _initWsPackageProcessServiceSoapProxy();
    return wsPackageProcessServiceSoap.getQueryFileMapping(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ListPackageResponse listPackage(org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ListPackageRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ArrayOfEspException{
    if (wsPackageProcessServiceSoap == null)
      _initWsPackageProcessServiceSoapProxy();
    return wsPackageProcessServiceSoap.listPackage(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ListPackagesResponse listPackages(org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ListPackagesRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ArrayOfEspException{
    if (wsPackageProcessServiceSoap == null)
      _initWsPackageProcessServiceSoapProxy();
    return wsPackageProcessServiceSoap.listPackages(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.RemovePartFromPackageMapResponse removePartFromPackageMap(org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.RemovePartFromPackageMapRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ArrayOfEspException{
    if (wsPackageProcessServiceSoap == null)
      _initWsPackageProcessServiceSoapProxy();
    return wsPackageProcessServiceSoap.removePartFromPackageMap(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ValidatePackageResponse validatePackage(org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ValidatePackageRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.ArrayOfEspException{
    if (wsPackageProcessServiceSoap == null)
      _initWsPackageProcessServiceSoapProxy();
    return wsPackageProcessServiceSoap.validatePackage(parameters);
  }
  
  
}
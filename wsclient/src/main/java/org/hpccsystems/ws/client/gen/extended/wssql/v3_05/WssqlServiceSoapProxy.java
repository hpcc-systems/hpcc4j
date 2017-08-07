package org.hpccsystems.ws.client.gen.extended.wssql.v3_05;

public class WssqlServiceSoapProxy implements org.hpccsystems.ws.client.gen.extended.wssql.v3_05.WssqlServiceSoap {
  private String _endpoint = null;
  private org.hpccsystems.ws.client.gen.extended.wssql.v3_05.WssqlServiceSoap wssqlServiceSoap = null;
  
  public WssqlServiceSoapProxy() {
    _initWssqlServiceSoapProxy();
  }
  
  public WssqlServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWssqlServiceSoapProxy();
  }
  
  private void _initWssqlServiceSoapProxy() {
    try {
      wssqlServiceSoap = (new org.hpccsystems.ws.client.gen.extended.wssql.v3_05.WssqlLocator()).getwssqlServiceSoap();
      if (wssqlServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wssqlServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wssqlServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wssqlServiceSoap != null)
      ((javax.xml.rpc.Stub)wssqlServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.hpccsystems.ws.client.gen.extended.wssql.v3_05.WssqlServiceSoap getWssqlServiceSoap() {
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap;
  }
  
  public org.hpccsystems.ws.client.gen.extended.wssql.v3_05.CreateTableAndLoadResponse createTableAndLoad(org.hpccsystems.ws.client.gen.extended.wssql.v3_05.CreateTableAndLoadRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05.ArrayOfEspException{
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap.createTableAndLoad(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wssql.v3_05.EchoResponse echo(org.hpccsystems.ws.client.gen.extended.wssql.v3_05.EchoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05.ArrayOfEspException{
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap.echo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wssql.v3_05.ExecutePreparedSQLResponse executePreparedSQL(org.hpccsystems.ws.client.gen.extended.wssql.v3_05.ExecutePreparedSQLRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05.ArrayOfEspException{
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap.executePreparedSQL(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wssql.v3_05.ExecuteSQLResponse executeSQL(org.hpccsystems.ws.client.gen.extended.wssql.v3_05.ExecuteSQLRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05.ArrayOfEspException{
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap.executeSQL(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wssql.v3_05.GetDBMetaDataResponse getDBMetaData(org.hpccsystems.ws.client.gen.extended.wssql.v3_05.GetDBMetaDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05.ArrayOfEspException{
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap.getDBMetaData(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wssql.v3_05.GetDBSystemInfoResponse getDBSystemInfo(org.hpccsystems.ws.client.gen.extended.wssql.v3_05.GetDBSystemInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05.ArrayOfEspException{
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap.getDBSystemInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wssql.v3_05.GetRelatedIndexesResponse getRelatedIndexes(org.hpccsystems.ws.client.gen.extended.wssql.v3_05.GetRelatedIndexesRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05.ArrayOfEspException{
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap.getRelatedIndexes(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wssql.v3_05.GetResultsResponse getResults(org.hpccsystems.ws.client.gen.extended.wssql.v3_05.GetResultsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05.ArrayOfEspException{
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap.getResults(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wssql.v3_05.PrepareSQLResponse prepareSQL(org.hpccsystems.ws.client.gen.extended.wssql.v3_05.PrepareSQLRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05.ArrayOfEspException{
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap.prepareSQL(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wssql.v3_05.SetRelatedIndexesResponse setRelatedIndexes(org.hpccsystems.ws.client.gen.extended.wssql.v3_05.SetRelatedIndexesRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_05.ArrayOfEspException{
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap.setRelatedIndexes(parameters);
  }
  
  
}
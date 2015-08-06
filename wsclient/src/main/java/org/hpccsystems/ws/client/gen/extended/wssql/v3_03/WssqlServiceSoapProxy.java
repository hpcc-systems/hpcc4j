package org.hpccsystems.ws.client.gen.extended.wssql.v3_03;

public class WssqlServiceSoapProxy implements org.hpccsystems.ws.client.gen.extended.wssql.v3_03.WssqlServiceSoap {
  private String _endpoint = null;
  private org.hpccsystems.ws.client.gen.extended.wssql.v3_03.WssqlServiceSoap wssqlServiceSoap = null;
  
  public WssqlServiceSoapProxy() {
    _initWssqlServiceSoapProxy();
  }
  
  public WssqlServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWssqlServiceSoapProxy();
  }
  
  private void _initWssqlServiceSoapProxy() {
    try {
      wssqlServiceSoap = (new org.hpccsystems.ws.client.gen.extended.wssql.v3_03.WssqlLocator()).getwssqlServiceSoap();
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
  
  public org.hpccsystems.ws.client.gen.extended.wssql.v3_03.WssqlServiceSoap getWssqlServiceSoap() {
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap;
  }
  
  public org.hpccsystems.ws.client.gen.extended.wssql.v3_03.CreateTableAndLoadResponse createTableAndLoad(org.hpccsystems.ws.client.gen.extended.wssql.v3_03.CreateTableAndLoadRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_03.ArrayOfEspException{
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap.createTableAndLoad(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wssql.v3_03.EchoResponse echo(org.hpccsystems.ws.client.gen.extended.wssql.v3_03.EchoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_03.ArrayOfEspException{
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap.echo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wssql.v3_03.ExecutePreparedSQLResponse executePreparedSQL(org.hpccsystems.ws.client.gen.extended.wssql.v3_03.ExecutePreparedSQLRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_03.ArrayOfEspException{
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap.executePreparedSQL(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wssql.v3_03.ExecuteSQLResponse executeSQL(org.hpccsystems.ws.client.gen.extended.wssql.v3_03.ExecuteSQLRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_03.ArrayOfEspException{
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap.executeSQL(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wssql.v3_03.GetDBMetaDataResponse getDBMetaData(org.hpccsystems.ws.client.gen.extended.wssql.v3_03.GetDBMetaDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_03.ArrayOfEspException{
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap.getDBMetaData(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wssql.v3_03.GetDBSystemInfoResponse getDBSystemInfo(org.hpccsystems.ws.client.gen.extended.wssql.v3_03.GetDBSystemInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_03.ArrayOfEspException{
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap.getDBSystemInfo(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wssql.v3_03.GetRelatedIndexesResponse getRelatedIndexes(org.hpccsystems.ws.client.gen.extended.wssql.v3_03.GetRelatedIndexesRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_03.ArrayOfEspException{
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap.getRelatedIndexes(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wssql.v3_03.GetResultsResponse getResults(org.hpccsystems.ws.client.gen.extended.wssql.v3_03.GetResultsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_03.ArrayOfEspException{
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap.getResults(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wssql.v3_03.PrepareSQLResponse prepareSQL(org.hpccsystems.ws.client.gen.extended.wssql.v3_03.PrepareSQLRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_03.ArrayOfEspException{
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap.prepareSQL(parameters);
  }
  
  public org.hpccsystems.ws.client.gen.extended.wssql.v3_03.SetRelatedIndexesResponse setRelatedIndexes(org.hpccsystems.ws.client.gen.extended.wssql.v3_03.SetRelatedIndexesRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v3_03.ArrayOfEspException{
    if (wssqlServiceSoap == null)
      _initWssqlServiceSoapProxy();
    return wssqlServiceSoap.setRelatedIndexes(parameters);
  }
  
  
}
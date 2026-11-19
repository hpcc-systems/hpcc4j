/**
 * Wssql.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:49:45 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wssql.latest;

/*
 *  Wssql java interface
 */

public interface Wssql {

  /**
   * Auto generated method signature
   *
   * @param executeSQLRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecuteSQLResponse executeSQL(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecuteSQLRequest executeSQLRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param prepareSQLRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssql.latest.PrepareSQLResponse prepareSQL(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.PrepareSQLRequest prepareSQLRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param getDBSystemInfoRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBSystemInfoResponse getDBSystemInfo(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBSystemInfoRequest
          getDBSystemInfoRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param getRelatedIndexesRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetRelatedIndexesResponse
      getRelatedIndexes(
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetRelatedIndexesRequest
              getRelatedIndexesRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param getDBMetaDataRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBMetaDataResponse getDBMetaData(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBMetaDataRequest getDBMetaDataRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param setRelatedIndexesRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssql.latest.SetRelatedIndexesResponse
      setRelatedIndexes(
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.SetRelatedIndexesRequest
              setRelatedIndexesRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param getResultsRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetResultsResponse getResults(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetResultsRequest getResultsRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param wssqlPingRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssql.latest.WssqlPingResponse ping(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.WssqlPingRequest wssqlPingRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param echoRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssql.latest.EchoResponse echo(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.EchoRequest echoRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param createTableAndLoadRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssql.latest.CreateTableAndLoadResponse
      createTableAndLoad(
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.CreateTableAndLoadRequest
              createTableAndLoadRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param executePreparedSQLRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecutePreparedSQLResponse
      executePreparedSQL(
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecutePreparedSQLRequest
              executePreparedSQLRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault;

  //
}

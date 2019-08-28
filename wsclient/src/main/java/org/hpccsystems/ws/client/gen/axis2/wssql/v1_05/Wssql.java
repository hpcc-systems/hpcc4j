/**
 * Wssql.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wssql.v1_05;


/*
 *  Wssql java interface
 */
public interface Wssql {
    /**
     * Auto generated method signature
     *
     * @param executeSQLRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ExecuteSQLResponse executeSQL(
        org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ExecuteSQLRequest executeSQLRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param prepareSQLRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.PrepareSQLResponse prepareSQL(
        org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.PrepareSQLRequest prepareSQLRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getDBSystemInfoRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.GetDBSystemInfoResponse getDBSystemInfo(
        org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.GetDBSystemInfoRequest getDBSystemInfoRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getRelatedIndexesRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.GetRelatedIndexesResponse getRelatedIndexes(
        org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.GetRelatedIndexesRequest getRelatedIndexesRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getDBMetaDataRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.GetDBMetaDataResponse getDBMetaData(
        org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.GetDBMetaDataRequest getDBMetaDataRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param setRelatedIndexesRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.SetRelatedIndexesResponse setRelatedIndexes(
        org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.SetRelatedIndexesRequest setRelatedIndexesRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getResultsRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.GetResultsResponse getResults(
        org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.GetResultsRequest getResultsRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param wssqlPingRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.WssqlPingResponse ping(
        org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.WssqlPingRequest wssqlPingRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param echoRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EchoResponse echo(
        org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EchoRequest echoRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param createTableAndLoadRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.CreateTableAndLoadResponse createTableAndLoad(
        org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.CreateTableAndLoadRequest createTableAndLoadRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param executePreparedSQLRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ExecutePreparedSQLResponse executePreparedSQL(
        org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ExecutePreparedSQLRequest executePreparedSQLRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EspSoapFault;

    //
}

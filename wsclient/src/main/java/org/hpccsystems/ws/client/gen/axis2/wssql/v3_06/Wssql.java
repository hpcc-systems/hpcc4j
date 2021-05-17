/**
 * Wssql.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wssql.v3_06;


/*
 *  Wssql java interface
 */
public interface Wssql {
    /**
     * Auto generated method signature
     *
     * @param executeSQLRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.ExecuteSQLResponse executeSQL(
        org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.ExecuteSQLRequest executeSQLRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param prepareSQLRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.PrepareSQLResponse prepareSQL(
        org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.PrepareSQLRequest prepareSQLRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getDBSystemInfoRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.GetDBSystemInfoResponse getDBSystemInfo(
        org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.GetDBSystemInfoRequest getDBSystemInfoRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getRelatedIndexesRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.GetRelatedIndexesResponse getRelatedIndexes(
        org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.GetRelatedIndexesRequest getRelatedIndexesRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getDBMetaDataRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.GetDBMetaDataResponse getDBMetaData(
        org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.GetDBMetaDataRequest getDBMetaDataRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param setRelatedIndexesRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.SetRelatedIndexesResponse setRelatedIndexes(
        org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.SetRelatedIndexesRequest setRelatedIndexesRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getResultsRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.GetResultsResponse getResults(
        org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.GetResultsRequest getResultsRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param wssqlPingRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.WssqlPingResponse ping(
        org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.WssqlPingRequest wssqlPingRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param echoRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.EchoResponse echo(
        org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.EchoRequest echoRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param createTableAndLoadRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.CreateTableAndLoadResponse createTableAndLoad(
        org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.CreateTableAndLoadRequest createTableAndLoadRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param executePreparedSQLRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.ExecutePreparedSQLResponse executePreparedSQL(
        org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.ExecutePreparedSQLRequest executePreparedSQLRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.EspSoapFault;

    //
}

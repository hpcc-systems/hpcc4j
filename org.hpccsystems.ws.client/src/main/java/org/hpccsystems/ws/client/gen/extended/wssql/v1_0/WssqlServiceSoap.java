/**
 * WssqlServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.extended.wssql.v1_0;

public interface WssqlServiceSoap extends java.rmi.Remote {
    public org.hpccsystems.ws.client.gen.extended.wssql.v1_0.EchoResponse echo(org.hpccsystems.ws.client.gen.extended.wssql.v1_0.EchoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v1_0.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.extended.wssql.v1_0.ExecutePreparedSQLResponse executePreparedSQL(org.hpccsystems.ws.client.gen.extended.wssql.v1_0.ExecutePreparedSQLRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v1_0.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.extended.wssql.v1_0.ExecuteSQLResponse executeSQL(org.hpccsystems.ws.client.gen.extended.wssql.v1_0.ExecuteSQLRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v1_0.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.extended.wssql.v1_0.GetDBMetaDataResponse getDBMetaData(org.hpccsystems.ws.client.gen.extended.wssql.v1_0.GetDBMetaDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v1_0.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.extended.wssql.v1_0.GetDBSystemInfoResponse getDBSystemInfo(org.hpccsystems.ws.client.gen.extended.wssql.v1_0.GetDBSystemInfoRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v1_0.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.extended.wssql.v1_0.GetResultsResponse getResults(org.hpccsystems.ws.client.gen.extended.wssql.v1_0.GetResultsRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v1_0.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.extended.wssql.v1_0.PrepareSQLResponse prepareSQL(org.hpccsystems.ws.client.gen.extended.wssql.v1_0.PrepareSQLRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.extended.wssql.v1_0.ArrayOfEspException;
}

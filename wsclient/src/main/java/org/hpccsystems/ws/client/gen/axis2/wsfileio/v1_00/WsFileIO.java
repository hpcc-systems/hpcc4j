/**
 * WsFileIO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wsfileio.v1_00;


/*
 *  WsFileIO java interface
 */
public interface WsFileIO {
    /**
     * Auto generated method signature
     *
     * @param wsFileIOPingRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsfileio.v1_00.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsfileio.v1_00.WsFileIOPingResponse ping(
        org.hpccsystems.ws.client.gen.axis2.wsfileio.v1_00.WsFileIOPingRequest wsFileIOPingRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsfileio.v1_00.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param writeFileDataRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsfileio.v1_00.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsfileio.v1_00.WriteFileDataResponse writeFileData(
        org.hpccsystems.ws.client.gen.axis2.wsfileio.v1_00.WriteFileDataRequest writeFileDataRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsfileio.v1_00.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param createFileRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsfileio.v1_00.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsfileio.v1_00.CreateFileResponse createFile(
        org.hpccsystems.ws.client.gen.axis2.wsfileio.v1_00.CreateFileRequest createFileRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsfileio.v1_00.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param readFileDataRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsfileio.v1_00.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsfileio.v1_00.ReadFileDataResponse readFileData(
        org.hpccsystems.ws.client.gen.axis2.wsfileio.v1_00.ReadFileDataRequest readFileDataRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsfileio.v1_00.EspSoapFault;

    //
}

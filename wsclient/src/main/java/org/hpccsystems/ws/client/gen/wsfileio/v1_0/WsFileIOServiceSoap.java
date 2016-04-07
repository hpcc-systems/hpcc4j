/**
 * WsFileIOServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsfileio.v1_0;

public interface WsFileIOServiceSoap extends java.rmi.Remote {
    public org.hpccsystems.ws.client.gen.wsfileio.v1_0.CreateFileResponse createFile(org.hpccsystems.ws.client.gen.wsfileio.v1_0.CreateFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsfileio.v1_0.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsfileio.v1_0.ReadFileDataResponse readFileData(org.hpccsystems.ws.client.gen.wsfileio.v1_0.ReadFileDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsfileio.v1_0.ArrayOfEspException;
    public org.hpccsystems.ws.client.gen.wsfileio.v1_0.WriteFileDataResponse writeFileData(org.hpccsystems.ws.client.gen.wsfileio.v1_0.WriteFileDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.gen.wsfileio.v1_0.ArrayOfEspException;
}

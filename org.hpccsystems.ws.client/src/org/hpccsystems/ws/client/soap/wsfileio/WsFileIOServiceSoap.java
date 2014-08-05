/**
 * WsFileIOServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.soap.wsfileio;

public interface WsFileIOServiceSoap extends java.rmi.Remote {
    public org.hpccsystems.ws.client.soap.wsfileio.CreateFileResponse createFile(org.hpccsystems.ws.client.soap.wsfileio.CreateFileRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsfileio.ArrayOfEspException;
    public org.hpccsystems.ws.client.soap.wsfileio.ReadFileDataResponse readFileData(org.hpccsystems.ws.client.soap.wsfileio.ReadFileDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsfileio.ArrayOfEspException;
    public org.hpccsystems.ws.client.soap.wsfileio.WriteFileDataResponse writeFileData(org.hpccsystems.ws.client.soap.wsfileio.WriteFileDataRequest parameters) throws java.rmi.RemoteException, org.hpccsystems.ws.client.soap.wsfileio.ArrayOfEspException;
}

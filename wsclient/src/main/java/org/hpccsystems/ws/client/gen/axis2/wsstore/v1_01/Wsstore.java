/**
 * Wsstore.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01;


/*
 *  Wsstore java interface
 */
public interface Wsstore {
    /**
     * Auto generated method signature
     *
     * @param listKeysRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.ListKeysResponse listKeys(
        org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.ListKeysRequest listKeysRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param listNamespacesRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.ListNamespacesResponse listNamespaces(
        org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.ListNamespacesRequest listNamespacesRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param fetchAllRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.FetchAllResponse fetchAll(
        org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.FetchAllRequest fetchAllRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param createStoreRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.CreateStoreResponse createStore(
        org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.CreateStoreRequest createStoreRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param deleteRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.DeleteResponse delete(
        org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.DeleteRequest deleteRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param fetchRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.FetchResponse fetch(
        org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.FetchRequest fetchRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param setRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.SetResponse set(
        org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.SetRequest setRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param deleteNamespaceRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.DeleteNamespaceResponse deleteNamespace(
        org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.DeleteNamespaceRequest deleteNamespaceRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param fetchKeyMDRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.FetchKeyMDResponse fetchKeyMetadata(
        org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.FetchKeyMDRequest fetchKeyMDRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param wsstorePingRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.WsstorePingResponse ping(
        org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.WsstorePingRequest wsstorePingRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.EspSoapFault;

    //
}

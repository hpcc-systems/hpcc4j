/**
 * Wsstore.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02;


/*
 *  Wsstore java interface
 */
public interface Wsstore {
    /**
     * Auto generated method signature
     *
     * @param listKeysRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.ListKeysResponse listKeys(
        org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.ListKeysRequest listKeysRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param listNamespacesRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.ListNamespacesResponse listNamespaces(
        org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.ListNamespacesRequest listNamespacesRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param fetchAllRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.FetchAllResponse fetchAll(
        org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.FetchAllRequest fetchAllRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param createStoreRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.CreateStoreResponse createStore(
        org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.CreateStoreRequest createStoreRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param deleteRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.DeleteResponse delete(
        org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.DeleteRequest deleteRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param fetchRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.FetchResponse fetch(
        org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.FetchRequest fetchRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param setRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.SetResponse set(
        org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.SetRequest setRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param listStoresRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.ListStoresResponse listStores(
        org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.ListStoresRequest listStoresRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param deleteNamespaceRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.DeleteNamespaceResponse deleteNamespace(
        org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.DeleteNamespaceRequest deleteNamespaceRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param fetchKeyMDRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.FetchKeyMDResponse fetchKeyMetadata(
        org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.FetchKeyMDRequest fetchKeyMDRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param wsstorePingRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.WsstorePingResponse ping(
        org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.WsstorePingRequest wsstorePingRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsstore.v1_02.EspSoapFault;

    //
}

/**
 * Wsstore.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:49:45 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsstore.latest;

/*
 *  Wsstore java interface
 */

public interface Wsstore {

  /**
   * Auto generated method signature
   *
   * @param listKeysRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsstore.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsstore.latest.ListKeysResponse listKeys(
      org.hpccsystems.ws.client.gen.axis2.wsstore.latest.ListKeysRequest listKeysRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsstore.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param listNamespacesRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsstore.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsstore.latest.ListNamespacesResponse listNamespaces(
      org.hpccsystems.ws.client.gen.axis2.wsstore.latest.ListNamespacesRequest
          listNamespacesRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsstore.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param fetchAllRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsstore.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsstore.latest.FetchAllResponse fetchAll(
      org.hpccsystems.ws.client.gen.axis2.wsstore.latest.FetchAllRequest fetchAllRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsstore.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param createStoreRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsstore.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsstore.latest.CreateStoreResponse createStore(
      org.hpccsystems.ws.client.gen.axis2.wsstore.latest.CreateStoreRequest createStoreRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsstore.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param deleteRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsstore.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsstore.latest.DeleteResponse delete(
      org.hpccsystems.ws.client.gen.axis2.wsstore.latest.DeleteRequest deleteRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsstore.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param fetchRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsstore.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsstore.latest.FetchResponse fetch(
      org.hpccsystems.ws.client.gen.axis2.wsstore.latest.FetchRequest fetchRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsstore.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param setRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsstore.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsstore.latest.SetResponse set(
      org.hpccsystems.ws.client.gen.axis2.wsstore.latest.SetRequest setRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsstore.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param listStoresRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsstore.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsstore.latest.ListStoresResponse listStores(
      org.hpccsystems.ws.client.gen.axis2.wsstore.latest.ListStoresRequest listStoresRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsstore.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param deleteNamespaceRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsstore.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsstore.latest.DeleteNamespaceResponse deleteNamespace(
      org.hpccsystems.ws.client.gen.axis2.wsstore.latest.DeleteNamespaceRequest
          deleteNamespaceRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsstore.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param fetchKeyMDRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsstore.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsstore.latest.FetchKeyMDResponse fetchKeyMetadata(
      org.hpccsystems.ws.client.gen.axis2.wsstore.latest.FetchKeyMDRequest fetchKeyMDRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsstore.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param wsstorePingRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wsstore.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsstore.latest.WsstorePingResponse ping(
      org.hpccsystems.ws.client.gen.axis2.wsstore.latest.WsstorePingRequest wsstorePingRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsstore.latest.EspSoapFault;

  //
}

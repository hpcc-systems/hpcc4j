/**
 * WsPackageProcess.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:49:45 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest;

/*
 *  WsPackageProcess java interface
 */

public interface WsPackageProcess {

  /**
   * Auto generated method signature
   *
   * @param deletePackageRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.DeletePackageResponse
      deletePackage(
          org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.DeletePackageRequest
              deletePackageRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param getPackageRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.GetPackageResponse getPackage(
      org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.GetPackageRequest
          getPackageRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param wsPackageProcessPingRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.WsPackageProcessPingResponse
      ping(
          org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.WsPackageProcessPingRequest
              wsPackageProcessPingRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param copyPackageMapRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.CopyPackageMapResponse
      copyPackageMap(
          org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.CopyPackageMapRequest
              copyPackageMapRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param addPackageRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.AddPackageResponse addPackage(
      org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.AddPackageRequest
          addPackageRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param validatePackageRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ValidatePackageResponse
      validatePackage(
          org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ValidatePackageRequest
              validatePackageRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param addPartToPackageMapRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.AddPartToPackageMapResponse
      addPartToPackageMap(
          org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.AddPartToPackageMapRequest
              addPartToPackageMapRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param activatePackageRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ActivatePackageResponse
      activatePackage(
          org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ActivatePackageRequest
              activatePackageRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param deActivatePackageRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.DeActivatePackageResponse
      deActivatePackage(
          org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.DeActivatePackageRequest
              deActivatePackageRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param echoRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EchoResponse echo(
      org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EchoRequest echoRequest)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param removePartFromPackageMapRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest
          .RemovePartFromPackageMapResponse
      removePartFromPackageMap(
          org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest
                  .RemovePartFromPackageMapRequest
              removePartFromPackageMapRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param listPackageRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ListPackageResponse
      listPackage(
          org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ListPackageRequest
              listPackageRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param getPackageMapSelectOptionsRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest
          .GetPackageMapSelectOptionsResponse
      getPackageMapSelectOptions(
          org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest
                  .GetPackageMapSelectOptionsRequest
              getPackageMapSelectOptionsRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param getPartFromPackageMapRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.GetPartFromPackageMapResponse
      getPartFromPackageMap(
          org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.GetPartFromPackageMapRequest
              getPartFromPackageMapRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param listPackagesRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ListPackagesResponse
      listPackages(
          org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ListPackagesRequest
              listPackagesRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param getQueryFileMappingRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.GetQueryFileMappingResponse
      getQueryFileMapping(
          org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.GetQueryFileMappingRequest
              getQueryFileMappingRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspSoapFault;

  /**
   * Auto generated method signature
   *
   * @param getPackageMapByIdRequest
   * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.GetPackageMapByIdResponse
      getPackageMapById(
          org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.GetPackageMapByIdRequest
              getPackageMapByIdRequest)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspSoapFault;

  //
}

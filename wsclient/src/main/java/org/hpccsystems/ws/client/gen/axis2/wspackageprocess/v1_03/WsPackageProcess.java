/**
 * WsPackageProcess.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03;


/*
 *  WsPackageProcess java interface
 */
public interface WsPackageProcess {
    /**
     * Auto generated method signature
     *
     * @param deletePackageRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.DeletePackageResponse deletePackage(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.DeletePackageRequest deletePackageRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getPackageRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetPackageResponse getPackage(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetPackageRequest getPackageRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param wsPackageProcessPingRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.WsPackageProcessPingResponse ping(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.WsPackageProcessPingRequest wsPackageProcessPingRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param copyPackageMapRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.CopyPackageMapResponse copyPackageMap(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.CopyPackageMapRequest copyPackageMapRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param addPackageRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.AddPackageResponse addPackage(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.AddPackageRequest addPackageRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param validatePackageRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ValidatePackageResponse validatePackage(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ValidatePackageRequest validatePackageRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param addPartToPackageMapRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.AddPartToPackageMapResponse addPartToPackageMap(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.AddPartToPackageMapRequest addPartToPackageMapRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param activatePackageRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ActivatePackageResponse activatePackage(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ActivatePackageRequest activatePackageRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param deActivatePackageRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.DeActivatePackageResponse deActivatePackage(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.DeActivatePackageRequest deActivatePackageRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param echoRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EchoResponse echo(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EchoRequest echoRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param removePartFromPackageMapRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.RemovePartFromPackageMapResponse removePartFromPackageMap(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.RemovePartFromPackageMapRequest removePartFromPackageMapRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param listPackageRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ListPackageResponse listPackage(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ListPackageRequest listPackageRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getPackageMapSelectOptionsRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetPackageMapSelectOptionsResponse getPackageMapSelectOptions(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetPackageMapSelectOptionsRequest getPackageMapSelectOptionsRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getPartFromPackageMapRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetPartFromPackageMapResponse getPartFromPackageMap(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetPartFromPackageMapRequest getPartFromPackageMapRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param listPackagesRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ListPackagesResponse listPackages(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ListPackagesRequest listPackagesRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getQueryFileMappingRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetQueryFileMappingResponse getQueryFileMapping(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetQueryFileMappingRequest getQueryFileMappingRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getPackageMapByIdRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetPackageMapByIdResponse getPackageMapById(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetPackageMapByIdRequest getPackageMapByIdRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspSoapFault;

    //
}

/**
 * WsPackageProcess.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04;


/*
 *  WsPackageProcess java interface
 */
public interface WsPackageProcess {
    /**
     * Auto generated method signature
     *
     * @param deletePackageRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.DeletePackageResponse deletePackage(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.DeletePackageRequest deletePackageRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getPackageRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageResponse getPackage(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageRequest getPackageRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param wsPackageProcessPingRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.WsPackageProcessPingResponse ping(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.WsPackageProcessPingRequest wsPackageProcessPingRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param copyPackageMapRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.CopyPackageMapResponse copyPackageMap(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.CopyPackageMapRequest copyPackageMapRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param addPackageRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPackageResponse addPackage(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPackageRequest addPackageRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param validatePackageRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ValidatePackageResponse validatePackage(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ValidatePackageRequest validatePackageRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param addPartToPackageMapRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPartToPackageMapResponse addPartToPackageMap(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPartToPackageMapRequest addPartToPackageMapRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param activatePackageRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ActivatePackageResponse activatePackage(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ActivatePackageRequest activatePackageRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param deActivatePackageRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.DeActivatePackageResponse deActivatePackage(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.DeActivatePackageRequest deActivatePackageRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param echoRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EchoResponse echo(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EchoRequest echoRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param removePartFromPackageMapRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.RemovePartFromPackageMapResponse removePartFromPackageMap(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.RemovePartFromPackageMapRequest removePartFromPackageMapRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param listPackageRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ListPackageResponse listPackage(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ListPackageRequest listPackageRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getPackageMapSelectOptionsRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageMapSelectOptionsResponse getPackageMapSelectOptions(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageMapSelectOptionsRequest getPackageMapSelectOptionsRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getPartFromPackageMapRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPartFromPackageMapResponse getPartFromPackageMap(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPartFromPackageMapRequest getPartFromPackageMapRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param listPackagesRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ListPackagesResponse listPackages(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ListPackagesRequest listPackagesRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getQueryFileMappingRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetQueryFileMappingResponse getQueryFileMapping(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetQueryFileMappingRequest getQueryFileMappingRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param getPackageMapByIdRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageMapByIdResponse getPackageMapById(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageMapByIdRequest getPackageMapByIdRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault;

    //
}

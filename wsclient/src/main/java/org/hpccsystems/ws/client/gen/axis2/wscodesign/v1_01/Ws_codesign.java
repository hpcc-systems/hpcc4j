/**
 * Ws_codesign.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01;


/*
 *  Ws_codesign java interface
 */
public interface Ws_codesign {
    /**
     * Auto generated method signature
     *
     * @param signRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.SignResponse sign(
        org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.SignRequest signRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param verifyRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.VerifyResponse verify(
        org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.VerifyRequest verifyRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param listUserIDsRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.ListUserIDsResponse listUserIDs(
        org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.ListUserIDsRequest listUserIDsRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param ws_codesignPingRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.Ws_codesignPingResponse ping(
        org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.Ws_codesignPingRequest ws_codesignPingRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.EspSoapFault;

    //
}

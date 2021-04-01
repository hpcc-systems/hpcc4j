/**
 * WsResources.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wsresources.v1_00;


/*
 *  WsResources java interface
 */
public interface WsResources {
    /**
     * Auto generated method signature
     *
     * @param wsResourcesPingRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsresources.v1_00.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsresources.v1_00.WsResourcesPingResponse ping(
        org.hpccsystems.ws.client.gen.axis2.wsresources.v1_00.WsResourcesPingRequest wsResourcesPingRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsresources.v1_00.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param serviceQueryRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsresources.v1_00.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsresources.v1_00.ServiceQueryResponse serviceQuery(
        org.hpccsystems.ws.client.gen.axis2.wsresources.v1_00.ServiceQueryRequest serviceQueryRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsresources.v1_00.EspSoapFault;

    //
}

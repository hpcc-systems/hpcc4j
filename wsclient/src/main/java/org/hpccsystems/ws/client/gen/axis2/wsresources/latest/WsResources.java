/**
 * WsResources.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wsresources.latest;


/*
 *  WsResources java interface
 */
public interface WsResources {
    /**
     * Auto generated method signature
     *
     * @param wsResourcesPingRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsresources.latest.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsresources.latest.WsResourcesPingResponse ping(
        org.hpccsystems.ws.client.gen.axis2.wsresources.latest.WsResourcesPingRequest wsResourcesPingRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsresources.latest.EspSoapFault;

    /**
     * Auto generated method signature
     *
     * @param serviceQueryRequest
     * @throws org.hpccsystems.ws.client.gen.axis2.wsresources.latest.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ServiceQueryResponse serviceQuery(
        org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ServiceQueryRequest serviceQueryRequest)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsresources.latest.EspSoapFault;

    //
}

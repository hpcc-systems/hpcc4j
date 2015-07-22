/**
 * WsWorkunitsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_46;

public class WsWorkunitsLocator extends org.apache.axis.client.Service implements org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WsWorkunits {

    public WsWorkunitsLocator() {
    }


    public WsWorkunitsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WsWorkunitsLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WsWorkunitsServiceSoap
    private java.lang.String WsWorkunitsServiceSoap_address = "http://10.0.2.15:8010/WsWorkunits?ver_=1.46";

    public java.lang.String getWsWorkunitsServiceSoapAddress() {
        return WsWorkunitsServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WsWorkunitsServiceSoapWSDDServiceName = "WsWorkunitsServiceSoap";

    public java.lang.String getWsWorkunitsServiceSoapWSDDServiceName() {
        return WsWorkunitsServiceSoapWSDDServiceName;
    }

    public void setWsWorkunitsServiceSoapWSDDServiceName(java.lang.String name) {
        WsWorkunitsServiceSoapWSDDServiceName = name;
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WsWorkunitsServiceSoap getWsWorkunitsServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WsWorkunitsServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWsWorkunitsServiceSoap(endpoint);
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WsWorkunitsServiceSoap getWsWorkunitsServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WsWorkunitsServiceSoapStub _stub = new org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WsWorkunitsServiceSoapStub(portAddress, this);
            _stub.setPortName(getWsWorkunitsServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWsWorkunitsServiceSoapEndpointAddress(java.lang.String address) {
        WsWorkunitsServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WsWorkunitsServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WsWorkunitsServiceSoapStub _stub = new org.hpccsystems.ws.client.gen.wsworkunits.v1_46.WsWorkunitsServiceSoapStub(new java.net.URL(WsWorkunitsServiceSoap_address), this);
                _stub.setPortName(getWsWorkunitsServiceSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WsWorkunitsServiceSoap".equals(inputPortName)) {
            return getWsWorkunitsServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WsWorkunits");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WsWorkunitsServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WsWorkunitsServiceSoap".equals(portName)) {
            setWsWorkunitsServiceSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

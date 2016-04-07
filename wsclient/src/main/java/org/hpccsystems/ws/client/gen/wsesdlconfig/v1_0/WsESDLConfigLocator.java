/**
 * WsESDLConfigLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0;

public class WsESDLConfigLocator extends org.apache.axis.client.Service implements org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.WsESDLConfig {

    public WsESDLConfigLocator() {
    }


    public WsESDLConfigLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WsESDLConfigLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WsESDLConfigServiceSoap
    private java.lang.String WsESDLConfigServiceSoap_address = "http://10.20.8.17:8010/WsESDLConfig?ver_=1";

    public java.lang.String getWsESDLConfigServiceSoapAddress() {
        return WsESDLConfigServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WsESDLConfigServiceSoapWSDDServiceName = "WsESDLConfigServiceSoap";

    public java.lang.String getWsESDLConfigServiceSoapWSDDServiceName() {
        return WsESDLConfigServiceSoapWSDDServiceName;
    }

    public void setWsESDLConfigServiceSoapWSDDServiceName(java.lang.String name) {
        WsESDLConfigServiceSoapWSDDServiceName = name;
    }

    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.WsESDLConfigServiceSoap getWsESDLConfigServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WsESDLConfigServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWsESDLConfigServiceSoap(endpoint);
    }

    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.WsESDLConfigServiceSoap getWsESDLConfigServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.WsESDLConfigServiceSoapStub _stub = new org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.WsESDLConfigServiceSoapStub(portAddress, this);
            _stub.setPortName(getWsESDLConfigServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWsESDLConfigServiceSoapEndpointAddress(java.lang.String address) {
        WsESDLConfigServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.WsESDLConfigServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.WsESDLConfigServiceSoapStub _stub = new org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.WsESDLConfigServiceSoapStub(new java.net.URL(WsESDLConfigServiceSoap_address), this);
                _stub.setPortName(getWsESDLConfigServiceSoapWSDDServiceName());
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
        if ("WsESDLConfigServiceSoap".equals(inputPortName)) {
            return getWsESDLConfigServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "WsESDLConfig");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "WsESDLConfigServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WsESDLConfigServiceSoap".equals(portName)) {
            setWsESDLConfigServiceSoapEndpointAddress(address);
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

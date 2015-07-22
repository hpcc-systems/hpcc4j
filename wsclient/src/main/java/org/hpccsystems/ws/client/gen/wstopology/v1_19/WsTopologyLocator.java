/**
 * WsTopologyLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wstopology.v1_19;

public class WsTopologyLocator extends org.apache.axis.client.Service implements org.hpccsystems.ws.client.gen.wstopology.v1_19.WsTopology {

    public WsTopologyLocator() {
    }


    public WsTopologyLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WsTopologyLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WsTopologyServiceSoap
    private java.lang.String WsTopologyServiceSoap_address = "http://10.0.2.15:8010/WsTopology?ver_=1.19";

    public java.lang.String getWsTopologyServiceSoapAddress() {
        return WsTopologyServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WsTopologyServiceSoapWSDDServiceName = "WsTopologyServiceSoap";

    public java.lang.String getWsTopologyServiceSoapWSDDServiceName() {
        return WsTopologyServiceSoapWSDDServiceName;
    }

    public void setWsTopologyServiceSoapWSDDServiceName(java.lang.String name) {
        WsTopologyServiceSoapWSDDServiceName = name;
    }

    public org.hpccsystems.ws.client.gen.wstopology.v1_19.WsTopologyServiceSoap getWsTopologyServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WsTopologyServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWsTopologyServiceSoap(endpoint);
    }

    public org.hpccsystems.ws.client.gen.wstopology.v1_19.WsTopologyServiceSoap getWsTopologyServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.hpccsystems.ws.client.gen.wstopology.v1_19.WsTopologyServiceSoapStub _stub = new org.hpccsystems.ws.client.gen.wstopology.v1_19.WsTopologyServiceSoapStub(portAddress, this);
            _stub.setPortName(getWsTopologyServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWsTopologyServiceSoapEndpointAddress(java.lang.String address) {
        WsTopologyServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.hpccsystems.ws.client.gen.wstopology.v1_19.WsTopologyServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.hpccsystems.ws.client.gen.wstopology.v1_19.WsTopologyServiceSoapStub _stub = new org.hpccsystems.ws.client.gen.wstopology.v1_19.WsTopologyServiceSoapStub(new java.net.URL(WsTopologyServiceSoap_address), this);
                _stub.setPortName(getWsTopologyServiceSoapWSDDServiceName());
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
        if ("WsTopologyServiceSoap".equals(inputPortName)) {
            return getWsTopologyServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "WsTopology");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "WsTopologyServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WsTopologyServiceSoap".equals(portName)) {
            setWsTopologyServiceSoapEndpointAddress(address);
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

/**
 * EclDirectLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.ecldirect.v1_0;

public class EclDirectLocator extends org.apache.axis.client.Service implements org.hpccsystems.ws.client.gen.ecldirect.v1_0.EclDirect {

    public EclDirectLocator() {
    }


    public EclDirectLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EclDirectLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EclDirectServiceSoap
    private java.lang.String EclDirectServiceSoap_address = "http://192.168.56.120:8010/EclDirect?ver_=1";

    public java.lang.String getEclDirectServiceSoapAddress() {
        return EclDirectServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EclDirectServiceSoapWSDDServiceName = "EclDirectServiceSoap";

    public java.lang.String getEclDirectServiceSoapWSDDServiceName() {
        return EclDirectServiceSoapWSDDServiceName;
    }

    public void setEclDirectServiceSoapWSDDServiceName(java.lang.String name) {
        EclDirectServiceSoapWSDDServiceName = name;
    }

    public org.hpccsystems.ws.client.gen.ecldirect.v1_0.EclDirectServiceSoap getEclDirectServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EclDirectServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEclDirectServiceSoap(endpoint);
    }

    public org.hpccsystems.ws.client.gen.ecldirect.v1_0.EclDirectServiceSoap getEclDirectServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.hpccsystems.ws.client.gen.ecldirect.v1_0.EclDirectServiceSoapStub _stub = new org.hpccsystems.ws.client.gen.ecldirect.v1_0.EclDirectServiceSoapStub(portAddress, this);
            _stub.setPortName(getEclDirectServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEclDirectServiceSoapEndpointAddress(java.lang.String address) {
        EclDirectServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.hpccsystems.ws.client.gen.ecldirect.v1_0.EclDirectServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.hpccsystems.ws.client.gen.ecldirect.v1_0.EclDirectServiceSoapStub _stub = new org.hpccsystems.ws.client.gen.ecldirect.v1_0.EclDirectServiceSoapStub(new java.net.URL(EclDirectServiceSoap_address), this);
                _stub.setPortName(getEclDirectServiceSoapWSDDServiceName());
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
        if ("EclDirectServiceSoap".equals(inputPortName)) {
            return getEclDirectServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:hpccsystems:ws:ecldirect", "EclDirect");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:hpccsystems:ws:ecldirect", "EclDirectServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EclDirectServiceSoap".equals(portName)) {
            setEclDirectServiceSoapEndpointAddress(address);
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

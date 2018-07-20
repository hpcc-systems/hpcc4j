/**
 * WsPackageProcessLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wspackageprocess.v1_03;

public class WsPackageProcessLocator extends org.apache.axis.client.Service implements org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.WsPackageProcess {

    public WsPackageProcessLocator() {
    }


    public WsPackageProcessLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WsPackageProcessLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WsPackageProcessServiceSoap
    private java.lang.String WsPackageProcessServiceSoap_address = "http://10.239.20.65:8010/WsPackageProcess?ver_=1.03";

    public java.lang.String getWsPackageProcessServiceSoapAddress() {
        return WsPackageProcessServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WsPackageProcessServiceSoapWSDDServiceName = "WsPackageProcessServiceSoap";

    public java.lang.String getWsPackageProcessServiceSoapWSDDServiceName() {
        return WsPackageProcessServiceSoapWSDDServiceName;
    }

    public void setWsPackageProcessServiceSoapWSDDServiceName(java.lang.String name) {
        WsPackageProcessServiceSoapWSDDServiceName = name;
    }

    public org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.WsPackageProcessServiceSoap getWsPackageProcessServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WsPackageProcessServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWsPackageProcessServiceSoap(endpoint);
    }

    public org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.WsPackageProcessServiceSoap getWsPackageProcessServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.WsPackageProcessServiceSoapStub _stub = new org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.WsPackageProcessServiceSoapStub(portAddress, this);
            _stub.setPortName(getWsPackageProcessServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWsPackageProcessServiceSoapEndpointAddress(java.lang.String address) {
        WsPackageProcessServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.WsPackageProcessServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.WsPackageProcessServiceSoapStub _stub = new org.hpccsystems.ws.client.gen.wspackageprocess.v1_03.WsPackageProcessServiceSoapStub(new java.net.URL(WsPackageProcessServiceSoap_address), this);
                _stub.setPortName(getWsPackageProcessServiceSoapWSDDServiceName());
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
        if ("WsPackageProcessServiceSoap".equals(inputPortName)) {
            return getWsPackageProcessServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "WsPackageProcess");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "WsPackageProcessServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WsPackageProcessServiceSoap".equals(portName)) {
            setWsPackageProcessServiceSoapEndpointAddress(address);
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

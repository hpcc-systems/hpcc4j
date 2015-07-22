/**
 * FileSprayLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.filespray.v1_06;

public class FileSprayLocator extends org.apache.axis.client.Service implements org.hpccsystems.ws.client.gen.filespray.v1_06.FileSpray {

    public FileSprayLocator() {
    }


    public FileSprayLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FileSprayLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FileSprayServiceSoap
    private java.lang.String FileSprayServiceSoap_address = "http://192.168.124.132:8010/FileSpray?ver_=1.06";

    public java.lang.String getFileSprayServiceSoapAddress() {
        return FileSprayServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FileSprayServiceSoapWSDDServiceName = "FileSprayServiceSoap";

    public java.lang.String getFileSprayServiceSoapWSDDServiceName() {
        return FileSprayServiceSoapWSDDServiceName;
    }

    public void setFileSprayServiceSoapWSDDServiceName(java.lang.String name) {
        FileSprayServiceSoapWSDDServiceName = name;
    }

    public org.hpccsystems.ws.client.gen.filespray.v1_06.FileSprayServiceSoap getFileSprayServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FileSprayServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFileSprayServiceSoap(endpoint);
    }

    public org.hpccsystems.ws.client.gen.filespray.v1_06.FileSprayServiceSoap getFileSprayServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.hpccsystems.ws.client.gen.filespray.v1_06.FileSprayServiceSoapStub _stub = new org.hpccsystems.ws.client.gen.filespray.v1_06.FileSprayServiceSoapStub(portAddress, this);
            _stub.setPortName(getFileSprayServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFileSprayServiceSoapEndpointAddress(java.lang.String address) {
        FileSprayServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.hpccsystems.ws.client.gen.filespray.v1_06.FileSprayServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.hpccsystems.ws.client.gen.filespray.v1_06.FileSprayServiceSoapStub _stub = new org.hpccsystems.ws.client.gen.filespray.v1_06.FileSprayServiceSoapStub(new java.net.URL(FileSprayServiceSoap_address), this);
                _stub.setPortName(getFileSprayServiceSoapWSDDServiceName());
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
        if ("FileSprayServiceSoap".equals(inputPortName)) {
            return getFileSprayServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "FileSpray");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "FileSprayServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FileSprayServiceSoap".equals(portName)) {
            setFileSprayServiceSoapEndpointAddress(address);
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

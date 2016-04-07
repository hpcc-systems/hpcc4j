/**
 * GetESDLBindingResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0;

public class GetESDLBindingResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.ArrayOfEspException exceptions;

    private java.lang.String serviceName;

    private java.lang.String espProcName;

    private java.lang.String bindingName;

    private java.lang.String espPort;

    private java.lang.String configXML;

    private org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.BaseESDLStatus status;

    public GetESDLBindingResponse() {
    }

    public GetESDLBindingResponse(
           org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.ArrayOfEspException exceptions,
           java.lang.String serviceName,
           java.lang.String espProcName,
           java.lang.String bindingName,
           java.lang.String espPort,
           java.lang.String configXML,
           org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.BaseESDLStatus status) {
           this.exceptions = exceptions;
           this.serviceName = serviceName;
           this.espProcName = espProcName;
           this.bindingName = bindingName;
           this.espPort = espPort;
           this.configXML = configXML;
           this.status = status;
    }


    /**
     * Gets the exceptions value for this GetESDLBindingResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this GetESDLBindingResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the serviceName value for this GetESDLBindingResponse.
     * 
     * @return serviceName
     */
    public java.lang.String getServiceName() {
        return serviceName;
    }


    /**
     * Sets the serviceName value for this GetESDLBindingResponse.
     * 
     * @param serviceName
     */
    public void setServiceName(java.lang.String serviceName) {
        this.serviceName = serviceName;
    }


    /**
     * Gets the espProcName value for this GetESDLBindingResponse.
     * 
     * @return espProcName
     */
    public java.lang.String getEspProcName() {
        return espProcName;
    }


    /**
     * Sets the espProcName value for this GetESDLBindingResponse.
     * 
     * @param espProcName
     */
    public void setEspProcName(java.lang.String espProcName) {
        this.espProcName = espProcName;
    }


    /**
     * Gets the bindingName value for this GetESDLBindingResponse.
     * 
     * @return bindingName
     */
    public java.lang.String getBindingName() {
        return bindingName;
    }


    /**
     * Sets the bindingName value for this GetESDLBindingResponse.
     * 
     * @param bindingName
     */
    public void setBindingName(java.lang.String bindingName) {
        this.bindingName = bindingName;
    }


    /**
     * Gets the espPort value for this GetESDLBindingResponse.
     * 
     * @return espPort
     */
    public java.lang.String getEspPort() {
        return espPort;
    }


    /**
     * Sets the espPort value for this GetESDLBindingResponse.
     * 
     * @param espPort
     */
    public void setEspPort(java.lang.String espPort) {
        this.espPort = espPort;
    }


    /**
     * Gets the configXML value for this GetESDLBindingResponse.
     * 
     * @return configXML
     */
    public java.lang.String getConfigXML() {
        return configXML;
    }


    /**
     * Sets the configXML value for this GetESDLBindingResponse.
     * 
     * @param configXML
     */
    public void setConfigXML(java.lang.String configXML) {
        this.configXML = configXML;
    }


    /**
     * Gets the status value for this GetESDLBindingResponse.
     * 
     * @return status
     */
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.BaseESDLStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetESDLBindingResponse.
     * 
     * @param status
     */
    public void setStatus(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.BaseESDLStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetESDLBindingResponse)) return false;
        GetESDLBindingResponse other = (GetESDLBindingResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.exceptions==null && other.getExceptions()==null) || 
             (this.exceptions!=null &&
              this.exceptions.equals(other.getExceptions()))) &&
            ((this.serviceName==null && other.getServiceName()==null) || 
             (this.serviceName!=null &&
              this.serviceName.equals(other.getServiceName()))) &&
            ((this.espProcName==null && other.getEspProcName()==null) || 
             (this.espProcName!=null &&
              this.espProcName.equals(other.getEspProcName()))) &&
            ((this.bindingName==null && other.getBindingName()==null) || 
             (this.bindingName!=null &&
              this.bindingName.equals(other.getBindingName()))) &&
            ((this.espPort==null && other.getEspPort()==null) || 
             (this.espPort!=null &&
              this.espPort.equals(other.getEspPort()))) &&
            ((this.configXML==null && other.getConfigXML()==null) || 
             (this.configXML!=null &&
              this.configXML.equals(other.getConfigXML()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getExceptions() != null) {
            _hashCode += getExceptions().hashCode();
        }
        if (getServiceName() != null) {
            _hashCode += getServiceName().hashCode();
        }
        if (getEspProcName() != null) {
            _hashCode += getEspProcName().hashCode();
        }
        if (getBindingName() != null) {
            _hashCode += getBindingName().hashCode();
        }
        if (getEspPort() != null) {
            _hashCode += getEspPort().hashCode();
        }
        if (getConfigXML() != null) {
            _hashCode += getConfigXML().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetESDLBindingResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", ">GetESDLBindingResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "ServiceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("espProcName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "EspProcName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bindingName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "BindingName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("espPort");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "EspPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configXML");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "ConfigXML"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "BaseESDLStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

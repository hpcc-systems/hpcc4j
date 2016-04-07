/**
 * ConfigureESDLBindingMethodResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0;

public class ConfigureESDLBindingMethodResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.ArrayOfEspException exceptions;

    private java.lang.String serviceName;

    private java.lang.Integer serviceEsdlVersion;

    private java.lang.String espProcName;

    private org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.BaseESDLStatus status;

    public ConfigureESDLBindingMethodResponse() {
    }

    public ConfigureESDLBindingMethodResponse(
           org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.ArrayOfEspException exceptions,
           java.lang.String serviceName,
           java.lang.Integer serviceEsdlVersion,
           java.lang.String espProcName,
           org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.BaseESDLStatus status) {
           this.exceptions = exceptions;
           this.serviceName = serviceName;
           this.serviceEsdlVersion = serviceEsdlVersion;
           this.espProcName = espProcName;
           this.status = status;
    }


    /**
     * Gets the exceptions value for this ConfigureESDLBindingMethodResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this ConfigureESDLBindingMethodResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the serviceName value for this ConfigureESDLBindingMethodResponse.
     * 
     * @return serviceName
     */
    public java.lang.String getServiceName() {
        return serviceName;
    }


    /**
     * Sets the serviceName value for this ConfigureESDLBindingMethodResponse.
     * 
     * @param serviceName
     */
    public void setServiceName(java.lang.String serviceName) {
        this.serviceName = serviceName;
    }


    /**
     * Gets the serviceEsdlVersion value for this ConfigureESDLBindingMethodResponse.
     * 
     * @return serviceEsdlVersion
     */
    public java.lang.Integer getServiceEsdlVersion() {
        return serviceEsdlVersion;
    }


    /**
     * Sets the serviceEsdlVersion value for this ConfigureESDLBindingMethodResponse.
     * 
     * @param serviceEsdlVersion
     */
    public void setServiceEsdlVersion(java.lang.Integer serviceEsdlVersion) {
        this.serviceEsdlVersion = serviceEsdlVersion;
    }


    /**
     * Gets the espProcName value for this ConfigureESDLBindingMethodResponse.
     * 
     * @return espProcName
     */
    public java.lang.String getEspProcName() {
        return espProcName;
    }


    /**
     * Sets the espProcName value for this ConfigureESDLBindingMethodResponse.
     * 
     * @param espProcName
     */
    public void setEspProcName(java.lang.String espProcName) {
        this.espProcName = espProcName;
    }


    /**
     * Gets the status value for this ConfigureESDLBindingMethodResponse.
     * 
     * @return status
     */
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.BaseESDLStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ConfigureESDLBindingMethodResponse.
     * 
     * @param status
     */
    public void setStatus(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.BaseESDLStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfigureESDLBindingMethodResponse)) return false;
        ConfigureESDLBindingMethodResponse other = (ConfigureESDLBindingMethodResponse) obj;
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
            ((this.serviceEsdlVersion==null && other.getServiceEsdlVersion()==null) || 
             (this.serviceEsdlVersion!=null &&
              this.serviceEsdlVersion.equals(other.getServiceEsdlVersion()))) &&
            ((this.espProcName==null && other.getEspProcName()==null) || 
             (this.espProcName!=null &&
              this.espProcName.equals(other.getEspProcName()))) &&
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
        if (getServiceEsdlVersion() != null) {
            _hashCode += getServiceEsdlVersion().hashCode();
        }
        if (getEspProcName() != null) {
            _hashCode += getEspProcName().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfigureESDLBindingMethodResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", ">ConfigureESDLBindingMethodResponse"));
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
        elemField.setFieldName("serviceEsdlVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "ServiceEsdlVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

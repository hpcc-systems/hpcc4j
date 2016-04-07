/**
 * PublishESDLDefinitionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0;

public class PublishESDLDefinitionResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.ArrayOfEspException exceptions;

    private java.lang.String serviceName;

    private java.lang.Integer esdlVersion;

    private java.lang.Boolean deletePrevious;

    private org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.BaseESDLStatus status;

    public PublishESDLDefinitionResponse() {
    }

    public PublishESDLDefinitionResponse(
           org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.ArrayOfEspException exceptions,
           java.lang.String serviceName,
           java.lang.Integer esdlVersion,
           java.lang.Boolean deletePrevious,
           org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.BaseESDLStatus status) {
           this.exceptions = exceptions;
           this.serviceName = serviceName;
           this.esdlVersion = esdlVersion;
           this.deletePrevious = deletePrevious;
           this.status = status;
    }


    /**
     * Gets the exceptions value for this PublishESDLDefinitionResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this PublishESDLDefinitionResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the serviceName value for this PublishESDLDefinitionResponse.
     * 
     * @return serviceName
     */
    public java.lang.String getServiceName() {
        return serviceName;
    }


    /**
     * Sets the serviceName value for this PublishESDLDefinitionResponse.
     * 
     * @param serviceName
     */
    public void setServiceName(java.lang.String serviceName) {
        this.serviceName = serviceName;
    }


    /**
     * Gets the esdlVersion value for this PublishESDLDefinitionResponse.
     * 
     * @return esdlVersion
     */
    public java.lang.Integer getEsdlVersion() {
        return esdlVersion;
    }


    /**
     * Sets the esdlVersion value for this PublishESDLDefinitionResponse.
     * 
     * @param esdlVersion
     */
    public void setEsdlVersion(java.lang.Integer esdlVersion) {
        this.esdlVersion = esdlVersion;
    }


    /**
     * Gets the deletePrevious value for this PublishESDLDefinitionResponse.
     * 
     * @return deletePrevious
     */
    public java.lang.Boolean getDeletePrevious() {
        return deletePrevious;
    }


    /**
     * Sets the deletePrevious value for this PublishESDLDefinitionResponse.
     * 
     * @param deletePrevious
     */
    public void setDeletePrevious(java.lang.Boolean deletePrevious) {
        this.deletePrevious = deletePrevious;
    }


    /**
     * Gets the status value for this PublishESDLDefinitionResponse.
     * 
     * @return status
     */
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.BaseESDLStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this PublishESDLDefinitionResponse.
     * 
     * @param status
     */
    public void setStatus(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.BaseESDLStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PublishESDLDefinitionResponse)) return false;
        PublishESDLDefinitionResponse other = (PublishESDLDefinitionResponse) obj;
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
            ((this.esdlVersion==null && other.getEsdlVersion()==null) || 
             (this.esdlVersion!=null &&
              this.esdlVersion.equals(other.getEsdlVersion()))) &&
            ((this.deletePrevious==null && other.getDeletePrevious()==null) || 
             (this.deletePrevious!=null &&
              this.deletePrevious.equals(other.getDeletePrevious()))) &&
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
        if (getEsdlVersion() != null) {
            _hashCode += getEsdlVersion().hashCode();
        }
        if (getDeletePrevious() != null) {
            _hashCode += getDeletePrevious().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PublishESDLDefinitionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", ">PublishESDLDefinitionResponse"));
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
        elemField.setFieldName("esdlVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "EsdlVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deletePrevious");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "DeletePrevious"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

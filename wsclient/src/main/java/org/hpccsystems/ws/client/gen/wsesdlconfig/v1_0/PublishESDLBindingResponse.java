/**
 * PublishESDLBindingResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0;

public class PublishESDLBindingResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.ArrayOfEspException exceptions;

    private java.lang.String esdlDefinitionID;

    private java.lang.Boolean overwrite;

    private java.lang.String espProcName;

    private java.lang.String espPort;

    private org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.BaseESDLStatus status;

    public PublishESDLBindingResponse() {
    }

    public PublishESDLBindingResponse(
           org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.ArrayOfEspException exceptions,
           java.lang.String esdlDefinitionID,
           java.lang.Boolean overwrite,
           java.lang.String espProcName,
           java.lang.String espPort,
           org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.BaseESDLStatus status) {
           this.exceptions = exceptions;
           this.esdlDefinitionID = esdlDefinitionID;
           this.overwrite = overwrite;
           this.espProcName = espProcName;
           this.espPort = espPort;
           this.status = status;
    }


    /**
     * Gets the exceptions value for this PublishESDLBindingResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this PublishESDLBindingResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the esdlDefinitionID value for this PublishESDLBindingResponse.
     * 
     * @return esdlDefinitionID
     */
    public java.lang.String getEsdlDefinitionID() {
        return esdlDefinitionID;
    }


    /**
     * Sets the esdlDefinitionID value for this PublishESDLBindingResponse.
     * 
     * @param esdlDefinitionID
     */
    public void setEsdlDefinitionID(java.lang.String esdlDefinitionID) {
        this.esdlDefinitionID = esdlDefinitionID;
    }


    /**
     * Gets the overwrite value for this PublishESDLBindingResponse.
     * 
     * @return overwrite
     */
    public java.lang.Boolean getOverwrite() {
        return overwrite;
    }


    /**
     * Sets the overwrite value for this PublishESDLBindingResponse.
     * 
     * @param overwrite
     */
    public void setOverwrite(java.lang.Boolean overwrite) {
        this.overwrite = overwrite;
    }


    /**
     * Gets the espProcName value for this PublishESDLBindingResponse.
     * 
     * @return espProcName
     */
    public java.lang.String getEspProcName() {
        return espProcName;
    }


    /**
     * Sets the espProcName value for this PublishESDLBindingResponse.
     * 
     * @param espProcName
     */
    public void setEspProcName(java.lang.String espProcName) {
        this.espProcName = espProcName;
    }


    /**
     * Gets the espPort value for this PublishESDLBindingResponse.
     * 
     * @return espPort
     */
    public java.lang.String getEspPort() {
        return espPort;
    }


    /**
     * Sets the espPort value for this PublishESDLBindingResponse.
     * 
     * @param espPort
     */
    public void setEspPort(java.lang.String espPort) {
        this.espPort = espPort;
    }


    /**
     * Gets the status value for this PublishESDLBindingResponse.
     * 
     * @return status
     */
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.BaseESDLStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this PublishESDLBindingResponse.
     * 
     * @param status
     */
    public void setStatus(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.BaseESDLStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PublishESDLBindingResponse)) return false;
        PublishESDLBindingResponse other = (PublishESDLBindingResponse) obj;
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
            ((this.esdlDefinitionID==null && other.getEsdlDefinitionID()==null) || 
             (this.esdlDefinitionID!=null &&
              this.esdlDefinitionID.equals(other.getEsdlDefinitionID()))) &&
            ((this.overwrite==null && other.getOverwrite()==null) || 
             (this.overwrite!=null &&
              this.overwrite.equals(other.getOverwrite()))) &&
            ((this.espProcName==null && other.getEspProcName()==null) || 
             (this.espProcName!=null &&
              this.espProcName.equals(other.getEspProcName()))) &&
            ((this.espPort==null && other.getEspPort()==null) || 
             (this.espPort!=null &&
              this.espPort.equals(other.getEspPort()))) &&
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
        if (getEsdlDefinitionID() != null) {
            _hashCode += getEsdlDefinitionID().hashCode();
        }
        if (getOverwrite() != null) {
            _hashCode += getOverwrite().hashCode();
        }
        if (getEspProcName() != null) {
            _hashCode += getEspProcName().hashCode();
        }
        if (getEspPort() != null) {
            _hashCode += getEspPort().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PublishESDLBindingResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", ">PublishESDLBindingResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esdlDefinitionID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "EsdlDefinitionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overwrite");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "Overwrite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("espPort");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "EspPort"));
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

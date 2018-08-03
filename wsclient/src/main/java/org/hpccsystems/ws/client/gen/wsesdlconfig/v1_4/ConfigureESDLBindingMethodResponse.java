/**
 * ConfigureESDLBindingMethodResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4;

public class ConfigureESDLBindingMethodResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ArrayOfEspException exceptions;

    private java.lang.String espProcName;

    private java.lang.String espBindingName;

    private java.lang.String esdlDefinitionID;

    private java.lang.String esdlServiceName;

    private org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.BaseESDLStatus status;

    private org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ESDLBindingContents ESDLBinding;

    public ConfigureESDLBindingMethodResponse() {
    }

    public ConfigureESDLBindingMethodResponse(
           org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ArrayOfEspException exceptions,
           java.lang.String espProcName,
           java.lang.String espBindingName,
           java.lang.String esdlDefinitionID,
           java.lang.String esdlServiceName,
           org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.BaseESDLStatus status,
           org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ESDLBindingContents ESDLBinding) {
           this.exceptions = exceptions;
           this.espProcName = espProcName;
           this.espBindingName = espBindingName;
           this.esdlDefinitionID = esdlDefinitionID;
           this.esdlServiceName = esdlServiceName;
           this.status = status;
           this.ESDLBinding = ESDLBinding;
    }


    /**
     * Gets the exceptions value for this ConfigureESDLBindingMethodResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this ConfigureESDLBindingMethodResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
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
     * Gets the espBindingName value for this ConfigureESDLBindingMethodResponse.
     * 
     * @return espBindingName
     */
    public java.lang.String getEspBindingName() {
        return espBindingName;
    }


    /**
     * Sets the espBindingName value for this ConfigureESDLBindingMethodResponse.
     * 
     * @param espBindingName
     */
    public void setEspBindingName(java.lang.String espBindingName) {
        this.espBindingName = espBindingName;
    }


    /**
     * Gets the esdlDefinitionID value for this ConfigureESDLBindingMethodResponse.
     * 
     * @return esdlDefinitionID
     */
    public java.lang.String getEsdlDefinitionID() {
        return esdlDefinitionID;
    }


    /**
     * Sets the esdlDefinitionID value for this ConfigureESDLBindingMethodResponse.
     * 
     * @param esdlDefinitionID
     */
    public void setEsdlDefinitionID(java.lang.String esdlDefinitionID) {
        this.esdlDefinitionID = esdlDefinitionID;
    }


    /**
     * Gets the esdlServiceName value for this ConfigureESDLBindingMethodResponse.
     * 
     * @return esdlServiceName
     */
    public java.lang.String getEsdlServiceName() {
        return esdlServiceName;
    }


    /**
     * Sets the esdlServiceName value for this ConfigureESDLBindingMethodResponse.
     * 
     * @param esdlServiceName
     */
    public void setEsdlServiceName(java.lang.String esdlServiceName) {
        this.esdlServiceName = esdlServiceName;
    }


    /**
     * Gets the status value for this ConfigureESDLBindingMethodResponse.
     * 
     * @return status
     */
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.BaseESDLStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ConfigureESDLBindingMethodResponse.
     * 
     * @param status
     */
    public void setStatus(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.BaseESDLStatus status) {
        this.status = status;
    }


    /**
     * Gets the ESDLBinding value for this ConfigureESDLBindingMethodResponse.
     * 
     * @return ESDLBinding
     */
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ESDLBindingContents getESDLBinding() {
        return ESDLBinding;
    }


    /**
     * Sets the ESDLBinding value for this ConfigureESDLBindingMethodResponse.
     * 
     * @param ESDLBinding
     */
    public void setESDLBinding(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.ESDLBindingContents ESDLBinding) {
        this.ESDLBinding = ESDLBinding;
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
            ((this.espProcName==null && other.getEspProcName()==null) || 
             (this.espProcName!=null &&
              this.espProcName.equals(other.getEspProcName()))) &&
            ((this.espBindingName==null && other.getEspBindingName()==null) || 
             (this.espBindingName!=null &&
              this.espBindingName.equals(other.getEspBindingName()))) &&
            ((this.esdlDefinitionID==null && other.getEsdlDefinitionID()==null) || 
             (this.esdlDefinitionID!=null &&
              this.esdlDefinitionID.equals(other.getEsdlDefinitionID()))) &&
            ((this.esdlServiceName==null && other.getEsdlServiceName()==null) || 
             (this.esdlServiceName!=null &&
              this.esdlServiceName.equals(other.getEsdlServiceName()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.ESDLBinding==null && other.getESDLBinding()==null) || 
             (this.ESDLBinding!=null &&
              this.ESDLBinding.equals(other.getESDLBinding())));
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
        if (getEspProcName() != null) {
            _hashCode += getEspProcName().hashCode();
        }
        if (getEspBindingName() != null) {
            _hashCode += getEspBindingName().hashCode();
        }
        if (getEsdlDefinitionID() != null) {
            _hashCode += getEsdlDefinitionID().hashCode();
        }
        if (getEsdlServiceName() != null) {
            _hashCode += getEsdlServiceName().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getESDLBinding() != null) {
            _hashCode += getESDLBinding().hashCode();
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
        elemField.setFieldName("espProcName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "EspProcName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("espBindingName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "EspBindingName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("esdlServiceName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "EsdlServiceName"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESDLBinding");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "ESDLBinding"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "ESDLBindingContents"));
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

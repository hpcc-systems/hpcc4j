/**
 * CreateAttributeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21;

import org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.CreateAttributeResponse;

public class CreateAttributeResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ArrayOfEspException exceptions;

    private org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ECLAttribute attributeInfo;

    public CreateAttributeResponse() {
    }

    public CreateAttributeResponse(
           org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ArrayOfEspException exceptions,
           org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ECLAttribute attributeInfo) {
           this.exceptions = exceptions;
           this.attributeInfo = attributeInfo;
    }


    /**
     * Gets the exceptions value for this CreateAttributeResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this CreateAttributeResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the attributeInfo value for this CreateAttributeResponse.
     * 
     * @return attributeInfo
     */
    public org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ECLAttribute getAttributeInfo() {
        return attributeInfo;
    }


    /**
     * Sets the attributeInfo value for this CreateAttributeResponse.
     * 
     * @param attributeInfo
     */
    public void setAttributeInfo(org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ECLAttribute attributeInfo) {
        this.attributeInfo = attributeInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateAttributeResponse)) return false;
        CreateAttributeResponse other = (CreateAttributeResponse) obj;
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
            ((this.attributeInfo==null && other.getAttributeInfo()==null) || 
             (this.attributeInfo!=null &&
              this.attributeInfo.equals(other.getAttributeInfo())));
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
        if (getAttributeInfo() != null) {
            _hashCode += getAttributeInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateAttributeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">CreateAttributeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "AttributeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ECLAttribute"));
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

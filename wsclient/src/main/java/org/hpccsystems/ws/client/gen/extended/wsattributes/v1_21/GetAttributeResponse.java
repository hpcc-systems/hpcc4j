/**
 * GetAttributeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21;

import org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.GetAttributeResponse;

public class GetAttributeResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ArrayOfEspException exceptions;

    private org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ECLAttribute outAttribute;

    public GetAttributeResponse() {
    }

    public GetAttributeResponse(
           org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ArrayOfEspException exceptions,
           org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ECLAttribute outAttribute) {
           this.exceptions = exceptions;
           this.outAttribute = outAttribute;
    }


    /**
     * Gets the exceptions value for this GetAttributeResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this GetAttributeResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the outAttribute value for this GetAttributeResponse.
     * 
     * @return outAttribute
     */
    public org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ECLAttribute getOutAttribute() {
        return outAttribute;
    }


    /**
     * Sets the outAttribute value for this GetAttributeResponse.
     * 
     * @param outAttribute
     */
    public void setOutAttribute(org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ECLAttribute outAttribute) {
        this.outAttribute = outAttribute;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAttributeResponse)) return false;
        GetAttributeResponse other = (GetAttributeResponse) obj;
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
            ((this.outAttribute==null && other.getOutAttribute()==null) || 
             (this.outAttribute!=null &&
              this.outAttribute.equals(other.getOutAttribute())));
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
        if (getOutAttribute() != null) {
            _hashCode += getOutAttribute().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAttributeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">GetAttributeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outAttribute");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "outAttribute"));
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

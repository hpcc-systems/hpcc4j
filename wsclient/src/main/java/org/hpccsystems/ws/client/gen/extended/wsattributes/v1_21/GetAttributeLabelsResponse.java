/**
 * GetAttributeLabelsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21;

import org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.GetAttributeLabelsResponse;

public class GetAttributeLabelsResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ArrayOfEspException exceptions;

    private org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ECLAttributeLabel[] labels;

    public GetAttributeLabelsResponse() {
    }

    public GetAttributeLabelsResponse(
           org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ArrayOfEspException exceptions,
           org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ECLAttributeLabel[] labels) {
           this.exceptions = exceptions;
           this.labels = labels;
    }


    /**
     * Gets the exceptions value for this GetAttributeLabelsResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this GetAttributeLabelsResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the labels value for this GetAttributeLabelsResponse.
     * 
     * @return labels
     */
    public org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ECLAttributeLabel[] getLabels() {
        return labels;
    }


    /**
     * Sets the labels value for this GetAttributeLabelsResponse.
     * 
     * @param labels
     */
    public void setLabels(org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ECLAttributeLabel[] labels) {
        this.labels = labels;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAttributeLabelsResponse)) return false;
        GetAttributeLabelsResponse other = (GetAttributeLabelsResponse) obj;
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
            ((this.labels==null && other.getLabels()==null) || 
             (this.labels!=null &&
              java.util.Arrays.equals(this.labels, other.getLabels())));
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
        if (getLabels() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLabels());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLabels(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAttributeLabelsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", ">GetAttributeLabelsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labels");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Labels"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ECLAttributeLabel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ECLAttributeLabel"));
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

/**
 * WULightWeightQueryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_56;

public class WULightWeightQueryResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException exceptions;

    private java.lang.Integer numWUs;

    private java.lang.Long cacheHint;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLWorkunitLW[] workunits;

    public WULightWeightQueryResponse() {
    }

    public WULightWeightQueryResponse(
           org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException exceptions,
           java.lang.Integer numWUs,
           java.lang.Long cacheHint,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLWorkunitLW[] workunits) {
           this.exceptions = exceptions;
           this.numWUs = numWUs;
           this.cacheHint = cacheHint;
           this.workunits = workunits;
    }


    /**
     * Gets the exceptions value for this WULightWeightQueryResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this WULightWeightQueryResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the numWUs value for this WULightWeightQueryResponse.
     * 
     * @return numWUs
     */
    public java.lang.Integer getNumWUs() {
        return numWUs;
    }


    /**
     * Sets the numWUs value for this WULightWeightQueryResponse.
     * 
     * @param numWUs
     */
    public void setNumWUs(java.lang.Integer numWUs) {
        this.numWUs = numWUs;
    }


    /**
     * Gets the cacheHint value for this WULightWeightQueryResponse.
     * 
     * @return cacheHint
     */
    public java.lang.Long getCacheHint() {
        return cacheHint;
    }


    /**
     * Sets the cacheHint value for this WULightWeightQueryResponse.
     * 
     * @param cacheHint
     */
    public void setCacheHint(java.lang.Long cacheHint) {
        this.cacheHint = cacheHint;
    }


    /**
     * Gets the workunits value for this WULightWeightQueryResponse.
     * 
     * @return workunits
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLWorkunitLW[] getWorkunits() {
        return workunits;
    }


    /**
     * Sets the workunits value for this WULightWeightQueryResponse.
     * 
     * @param workunits
     */
    public void setWorkunits(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ECLWorkunitLW[] workunits) {
        this.workunits = workunits;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WULightWeightQueryResponse)) return false;
        WULightWeightQueryResponse other = (WULightWeightQueryResponse) obj;
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
            ((this.numWUs==null && other.getNumWUs()==null) || 
             (this.numWUs!=null &&
              this.numWUs.equals(other.getNumWUs()))) &&
            ((this.cacheHint==null && other.getCacheHint()==null) || 
             (this.cacheHint!=null &&
              this.cacheHint.equals(other.getCacheHint()))) &&
            ((this.workunits==null && other.getWorkunits()==null) || 
             (this.workunits!=null &&
              java.util.Arrays.equals(this.workunits, other.getWorkunits())));
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
        if (getNumWUs() != null) {
            _hashCode += getNumWUs().hashCode();
        }
        if (getCacheHint() != null) {
            _hashCode += getCacheHint().hashCode();
        }
        if (getWorkunits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWorkunits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWorkunits(), i);
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
        new org.apache.axis.description.TypeDesc(WULightWeightQueryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WULightWeightQueryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numWUs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "NumWUs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cacheHint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "CacheHint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workunits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Workunits"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLWorkunitLW"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECLWorkunitLW"));
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

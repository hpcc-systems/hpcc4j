/**
 * DFUFileBloom.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsdfu.v1_51;

public class DFUFileBloom  implements java.io.Serializable {
    private java.lang.Long fieldMask;

    private java.lang.String[] fieldNames;

    private java.lang.Long limit;

    private java.lang.String probability;

    public DFUFileBloom() {
    }

    public DFUFileBloom(
           java.lang.Long fieldMask,
           java.lang.String[] fieldNames,
           java.lang.Long limit,
           java.lang.String probability) {
           this.fieldMask = fieldMask;
           this.fieldNames = fieldNames;
           this.limit = limit;
           this.probability = probability;
    }


    /**
     * Gets the fieldMask value for this DFUFileBloom.
     * 
     * @return fieldMask
     */
    public java.lang.Long getFieldMask() {
        return fieldMask;
    }


    /**
     * Sets the fieldMask value for this DFUFileBloom.
     * 
     * @param fieldMask
     */
    public void setFieldMask(java.lang.Long fieldMask) {
        this.fieldMask = fieldMask;
    }


    /**
     * Gets the fieldNames value for this DFUFileBloom.
     * 
     * @return fieldNames
     */
    public java.lang.String[] getFieldNames() {
        return fieldNames;
    }


    /**
     * Sets the fieldNames value for this DFUFileBloom.
     * 
     * @param fieldNames
     */
    public void setFieldNames(java.lang.String[] fieldNames) {
        this.fieldNames = fieldNames;
    }


    /**
     * Gets the limit value for this DFUFileBloom.
     * 
     * @return limit
     */
    public java.lang.Long getLimit() {
        return limit;
    }


    /**
     * Sets the limit value for this DFUFileBloom.
     * 
     * @param limit
     */
    public void setLimit(java.lang.Long limit) {
        this.limit = limit;
    }


    /**
     * Gets the probability value for this DFUFileBloom.
     * 
     * @return probability
     */
    public java.lang.String getProbability() {
        return probability;
    }


    /**
     * Sets the probability value for this DFUFileBloom.
     * 
     * @param probability
     */
    public void setProbability(java.lang.String probability) {
        this.probability = probability;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DFUFileBloom)) return false;
        DFUFileBloom other = (DFUFileBloom) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fieldMask==null && other.getFieldMask()==null) || 
             (this.fieldMask!=null &&
              this.fieldMask.equals(other.getFieldMask()))) &&
            ((this.fieldNames==null && other.getFieldNames()==null) || 
             (this.fieldNames!=null &&
              java.util.Arrays.equals(this.fieldNames, other.getFieldNames()))) &&
            ((this.limit==null && other.getLimit()==null) || 
             (this.limit!=null &&
              this.limit.equals(other.getLimit()))) &&
            ((this.probability==null && other.getProbability()==null) || 
             (this.probability!=null &&
              this.probability.equals(other.getProbability())));
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
        if (getFieldMask() != null) {
            _hashCode += getFieldMask().hashCode();
        }
        if (getFieldNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFieldNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLimit() != null) {
            _hashCode += getLimit().hashCode();
        }
        if (getProbability() != null) {
            _hashCode += getProbability().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DFUFileBloom.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFileBloom"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldMask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FieldMask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldNames");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FieldNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Limit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("probability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Probability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

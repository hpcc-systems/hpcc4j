/**
 * DFUFileStat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsdfu.v1_51;

public class DFUFileStat  implements java.io.Serializable {
    private java.lang.String minSkew;

    private java.lang.String maxSkew;

    private java.lang.Long minSkewInt64;

    private java.lang.Long maxSkewInt64;

    public DFUFileStat() {
    }

    public DFUFileStat(
           java.lang.String minSkew,
           java.lang.String maxSkew,
           java.lang.Long minSkewInt64,
           java.lang.Long maxSkewInt64) {
           this.minSkew = minSkew;
           this.maxSkew = maxSkew;
           this.minSkewInt64 = minSkewInt64;
           this.maxSkewInt64 = maxSkewInt64;
    }


    /**
     * Gets the minSkew value for this DFUFileStat.
     * 
     * @return minSkew
     */
    public java.lang.String getMinSkew() {
        return minSkew;
    }


    /**
     * Sets the minSkew value for this DFUFileStat.
     * 
     * @param minSkew
     */
    public void setMinSkew(java.lang.String minSkew) {
        this.minSkew = minSkew;
    }


    /**
     * Gets the maxSkew value for this DFUFileStat.
     * 
     * @return maxSkew
     */
    public java.lang.String getMaxSkew() {
        return maxSkew;
    }


    /**
     * Sets the maxSkew value for this DFUFileStat.
     * 
     * @param maxSkew
     */
    public void setMaxSkew(java.lang.String maxSkew) {
        this.maxSkew = maxSkew;
    }


    /**
     * Gets the minSkewInt64 value for this DFUFileStat.
     * 
     * @return minSkewInt64
     */
    public java.lang.Long getMinSkewInt64() {
        return minSkewInt64;
    }


    /**
     * Sets the minSkewInt64 value for this DFUFileStat.
     * 
     * @param minSkewInt64
     */
    public void setMinSkewInt64(java.lang.Long minSkewInt64) {
        this.minSkewInt64 = minSkewInt64;
    }


    /**
     * Gets the maxSkewInt64 value for this DFUFileStat.
     * 
     * @return maxSkewInt64
     */
    public java.lang.Long getMaxSkewInt64() {
        return maxSkewInt64;
    }


    /**
     * Sets the maxSkewInt64 value for this DFUFileStat.
     * 
     * @param maxSkewInt64
     */
    public void setMaxSkewInt64(java.lang.Long maxSkewInt64) {
        this.maxSkewInt64 = maxSkewInt64;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DFUFileStat)) return false;
        DFUFileStat other = (DFUFileStat) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.minSkew==null && other.getMinSkew()==null) || 
             (this.minSkew!=null &&
              this.minSkew.equals(other.getMinSkew()))) &&
            ((this.maxSkew==null && other.getMaxSkew()==null) || 
             (this.maxSkew!=null &&
              this.maxSkew.equals(other.getMaxSkew()))) &&
            ((this.minSkewInt64==null && other.getMinSkewInt64()==null) || 
             (this.minSkewInt64!=null &&
              this.minSkewInt64.equals(other.getMinSkewInt64()))) &&
            ((this.maxSkewInt64==null && other.getMaxSkewInt64()==null) || 
             (this.maxSkewInt64!=null &&
              this.maxSkewInt64.equals(other.getMaxSkewInt64())));
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
        if (getMinSkew() != null) {
            _hashCode += getMinSkew().hashCode();
        }
        if (getMaxSkew() != null) {
            _hashCode += getMaxSkew().hashCode();
        }
        if (getMinSkewInt64() != null) {
            _hashCode += getMinSkewInt64().hashCode();
        }
        if (getMaxSkewInt64() != null) {
            _hashCode += getMaxSkewInt64().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DFUFileStat.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFileStat"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minSkew");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "MinSkew"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxSkew");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "MaxSkew"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minSkewInt64");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "MinSkewInt64"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxSkewInt64");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "MaxSkewInt64"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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

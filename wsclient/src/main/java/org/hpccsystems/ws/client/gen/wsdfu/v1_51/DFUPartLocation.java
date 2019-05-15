/**
 * DFUPartLocation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsdfu.v1_51;

public class DFUPartLocation  implements java.io.Serializable {
    private java.lang.Integer locationIndex;

    private java.lang.String host;

    public DFUPartLocation() {
    }

    public DFUPartLocation(
           java.lang.Integer locationIndex,
           java.lang.String host) {
           this.locationIndex = locationIndex;
           this.host = host;
    }


    /**
     * Gets the locationIndex value for this DFUPartLocation.
     * 
     * @return locationIndex
     */
    public java.lang.Integer getLocationIndex() {
        return locationIndex;
    }


    /**
     * Sets the locationIndex value for this DFUPartLocation.
     * 
     * @param locationIndex
     */
    public void setLocationIndex(java.lang.Integer locationIndex) {
        this.locationIndex = locationIndex;
    }


    /**
     * Gets the host value for this DFUPartLocation.
     * 
     * @return host
     */
    public java.lang.String getHost() {
        return host;
    }


    /**
     * Sets the host value for this DFUPartLocation.
     * 
     * @param host
     */
    public void setHost(java.lang.String host) {
        this.host = host;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DFUPartLocation)) return false;
        DFUPartLocation other = (DFUPartLocation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.locationIndex==null && other.getLocationIndex()==null) || 
             (this.locationIndex!=null &&
              this.locationIndex.equals(other.getLocationIndex()))) &&
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              this.host.equals(other.getHost())));
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
        if (getLocationIndex() != null) {
            _hashCode += getLocationIndex().hashCode();
        }
        if (getHost() != null) {
            _hashCode += getHost().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DFUPartLocation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUPartLocation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "LocationIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Host"));
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

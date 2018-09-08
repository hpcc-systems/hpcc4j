/**
 * DFUPartCopies.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsdfu.v1_39;

public class DFUPartCopies  implements java.io.Serializable {
    private java.lang.Integer partIndex;

    private java.lang.String[] locationIndexes;

    public DFUPartCopies() {
    }

    public DFUPartCopies(
           java.lang.Integer partIndex,
           java.lang.String[] locationIndexes) {
           this.partIndex = partIndex;
           this.locationIndexes = locationIndexes;
    }


    /**
     * Gets the partIndex value for this DFUPartCopies.
     * 
     * @return partIndex
     */
    public java.lang.Integer getPartIndex() {
        return partIndex;
    }


    /**
     * Sets the partIndex value for this DFUPartCopies.
     * 
     * @param partIndex
     */
    public void setPartIndex(java.lang.Integer partIndex) {
        this.partIndex = partIndex;
    }


    /**
     * Gets the locationIndexes value for this DFUPartCopies.
     * 
     * @return locationIndexes
     */
    public java.lang.String[] getLocationIndexes() {
        return locationIndexes;
    }


    /**
     * Sets the locationIndexes value for this DFUPartCopies.
     * 
     * @param locationIndexes
     */
    public void setLocationIndexes(java.lang.String[] locationIndexes) {
        this.locationIndexes = locationIndexes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DFUPartCopies)) return false;
        DFUPartCopies other = (DFUPartCopies) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.partIndex==null && other.getPartIndex()==null) || 
             (this.partIndex!=null &&
              this.partIndex.equals(other.getPartIndex()))) &&
            ((this.locationIndexes==null && other.getLocationIndexes()==null) || 
             (this.locationIndexes!=null &&
              java.util.Arrays.equals(this.locationIndexes, other.getLocationIndexes())));
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
        if (getPartIndex() != null) {
            _hashCode += getPartIndex().hashCode();
        }
        if (getLocationIndexes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationIndexes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationIndexes(), i);
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
        new org.apache.axis.description.TypeDesc(DFUPartCopies.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUPartCopies"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "PartIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationIndexes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "LocationIndexes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Item"));
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

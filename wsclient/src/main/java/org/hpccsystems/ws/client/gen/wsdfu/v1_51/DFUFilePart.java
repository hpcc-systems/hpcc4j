/**
 * DFUFilePart.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsdfu.v1_51;

public class DFUFilePart  implements java.io.Serializable {
    private java.lang.Integer partIndex;

    private org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileCopy[] copies;

    public DFUFilePart() {
    }

    public DFUFilePart(
           java.lang.Integer partIndex,
           org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileCopy[] copies) {
           this.partIndex = partIndex;
           this.copies = copies;
    }


    /**
     * Gets the partIndex value for this DFUFilePart.
     * 
     * @return partIndex
     */
    public java.lang.Integer getPartIndex() {
        return partIndex;
    }


    /**
     * Sets the partIndex value for this DFUFilePart.
     * 
     * @param partIndex
     */
    public void setPartIndex(java.lang.Integer partIndex) {
        this.partIndex = partIndex;
    }


    /**
     * Gets the copies value for this DFUFilePart.
     * 
     * @return copies
     */
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileCopy[] getCopies() {
        return copies;
    }


    /**
     * Sets the copies value for this DFUFilePart.
     * 
     * @param copies
     */
    public void setCopies(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileCopy[] copies) {
        this.copies = copies;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DFUFilePart)) return false;
        DFUFilePart other = (DFUFilePart) obj;
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
            ((this.copies==null && other.getCopies()==null) || 
             (this.copies!=null &&
              java.util.Arrays.equals(this.copies, other.getCopies())));
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
        if (getCopies() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCopies());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCopies(), i);
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
        new org.apache.axis.description.TypeDesc(DFUFilePart.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFilePart"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "PartIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copies");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Copies"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFileCopy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFileCopy"));
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

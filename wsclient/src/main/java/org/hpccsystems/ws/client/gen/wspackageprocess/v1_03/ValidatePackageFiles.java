/**
 * ValidatePackageFiles.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wspackageprocess.v1_03;

public class ValidatePackageFiles  implements java.io.Serializable {
    private java.lang.String[] unmatched;

    private java.lang.String[] notInDFS;

    public ValidatePackageFiles() {
    }

    public ValidatePackageFiles(
           java.lang.String[] unmatched,
           java.lang.String[] notInDFS) {
           this.unmatched = unmatched;
           this.notInDFS = notInDFS;
    }


    /**
     * Gets the unmatched value for this ValidatePackageFiles.
     * 
     * @return unmatched
     */
    public java.lang.String[] getUnmatched() {
        return unmatched;
    }


    /**
     * Sets the unmatched value for this ValidatePackageFiles.
     * 
     * @param unmatched
     */
    public void setUnmatched(java.lang.String[] unmatched) {
        this.unmatched = unmatched;
    }


    /**
     * Gets the notInDFS value for this ValidatePackageFiles.
     * 
     * @return notInDFS
     */
    public java.lang.String[] getNotInDFS() {
        return notInDFS;
    }


    /**
     * Sets the notInDFS value for this ValidatePackageFiles.
     * 
     * @param notInDFS
     */
    public void setNotInDFS(java.lang.String[] notInDFS) {
        this.notInDFS = notInDFS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidatePackageFiles)) return false;
        ValidatePackageFiles other = (ValidatePackageFiles) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.unmatched==null && other.getUnmatched()==null) || 
             (this.unmatched!=null &&
              java.util.Arrays.equals(this.unmatched, other.getUnmatched()))) &&
            ((this.notInDFS==null && other.getNotInDFS()==null) || 
             (this.notInDFS!=null &&
              java.util.Arrays.equals(this.notInDFS, other.getNotInDFS())));
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
        if (getUnmatched() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnmatched());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnmatched(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNotInDFS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotInDFS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotInDFS(), i);
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
        new org.apache.axis.description.TypeDesc(ValidatePackageFiles.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "ValidatePackageFiles"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unmatched");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "Unmatched"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "Item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notInDFS");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "NotInDFS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "File"));
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

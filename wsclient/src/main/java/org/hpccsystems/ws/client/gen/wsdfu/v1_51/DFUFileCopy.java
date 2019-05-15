/**
 * DFUFileCopy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsdfu.v1_51;

public class DFUFileCopy  implements java.io.Serializable {
    private java.lang.Integer copyIndex;

    private java.lang.Integer locationIndex;

    private java.lang.String path;

    public DFUFileCopy() {
    }

    public DFUFileCopy(
           java.lang.Integer copyIndex,
           java.lang.Integer locationIndex,
           java.lang.String path) {
           this.copyIndex = copyIndex;
           this.locationIndex = locationIndex;
           this.path = path;
    }


    /**
     * Gets the copyIndex value for this DFUFileCopy.
     * 
     * @return copyIndex
     */
    public java.lang.Integer getCopyIndex() {
        return copyIndex;
    }


    /**
     * Sets the copyIndex value for this DFUFileCopy.
     * 
     * @param copyIndex
     */
    public void setCopyIndex(java.lang.Integer copyIndex) {
        this.copyIndex = copyIndex;
    }


    /**
     * Gets the locationIndex value for this DFUFileCopy.
     * 
     * @return locationIndex
     */
    public java.lang.Integer getLocationIndex() {
        return locationIndex;
    }


    /**
     * Sets the locationIndex value for this DFUFileCopy.
     * 
     * @param locationIndex
     */
    public void setLocationIndex(java.lang.Integer locationIndex) {
        this.locationIndex = locationIndex;
    }


    /**
     * Gets the path value for this DFUFileCopy.
     * 
     * @return path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this DFUFileCopy.
     * 
     * @param path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DFUFileCopy)) return false;
        DFUFileCopy other = (DFUFileCopy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.copyIndex==null && other.getCopyIndex()==null) || 
             (this.copyIndex!=null &&
              this.copyIndex.equals(other.getCopyIndex()))) &&
            ((this.locationIndex==null && other.getLocationIndex()==null) || 
             (this.locationIndex!=null &&
              this.locationIndex.equals(other.getLocationIndex()))) &&
            ((this.path==null && other.getPath()==null) || 
             (this.path!=null &&
              this.path.equals(other.getPath())));
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
        if (getCopyIndex() != null) {
            _hashCode += getCopyIndex().hashCode();
        }
        if (getLocationIndex() != null) {
            _hashCode += getLocationIndex().hashCode();
        }
        if (getPath() != null) {
            _hashCode += getPath().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DFUFileCopy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFileCopy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copyIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "CopyIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "LocationIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Path"));
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

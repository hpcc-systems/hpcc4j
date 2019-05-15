/**
 * DFUFileProtect.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsdfu.v1_51;

public class DFUFileProtect  implements java.io.Serializable {
    private java.lang.String owner;

    private java.lang.Integer count;

    private java.lang.String modified;

    public DFUFileProtect() {
    }

    public DFUFileProtect(
           java.lang.String owner,
           java.lang.Integer count,
           java.lang.String modified) {
           this.owner = owner;
           this.count = count;
           this.modified = modified;
    }


    /**
     * Gets the owner value for this DFUFileProtect.
     * 
     * @return owner
     */
    public java.lang.String getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this DFUFileProtect.
     * 
     * @param owner
     */
    public void setOwner(java.lang.String owner) {
        this.owner = owner;
    }


    /**
     * Gets the count value for this DFUFileProtect.
     * 
     * @return count
     */
    public java.lang.Integer getCount() {
        return count;
    }


    /**
     * Sets the count value for this DFUFileProtect.
     * 
     * @param count
     */
    public void setCount(java.lang.Integer count) {
        this.count = count;
    }


    /**
     * Gets the modified value for this DFUFileProtect.
     * 
     * @return modified
     */
    public java.lang.String getModified() {
        return modified;
    }


    /**
     * Sets the modified value for this DFUFileProtect.
     * 
     * @param modified
     */
    public void setModified(java.lang.String modified) {
        this.modified = modified;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DFUFileProtect)) return false;
        DFUFileProtect other = (DFUFileProtect) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.count==null && other.getCount()==null) || 
             (this.count!=null &&
              this.count.equals(other.getCount()))) &&
            ((this.modified==null && other.getModified()==null) || 
             (this.modified!=null &&
              this.modified.equals(other.getModified())));
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
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getCount() != null) {
            _hashCode += getCount().hashCode();
        }
        if (getModified() != null) {
            _hashCode += getModified().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DFUFileProtect.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFileProtect"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modified");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Modified"));
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

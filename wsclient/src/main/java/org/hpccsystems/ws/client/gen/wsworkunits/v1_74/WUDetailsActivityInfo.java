/**
 * WUDetailsActivityInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_74;

public class WUDetailsActivityInfo  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt kind;

    private java.lang.String name;

    private java.lang.Boolean isSink;

    private java.lang.Boolean isSource;

    public WUDetailsActivityInfo() {
    }

    public WUDetailsActivityInfo(
           org.apache.axis.types.UnsignedInt kind,
           java.lang.String name,
           java.lang.Boolean isSink,
           java.lang.Boolean isSource) {
           this.kind = kind;
           this.name = name;
           this.isSink = isSink;
           this.isSource = isSource;
    }


    /**
     * Gets the kind value for this WUDetailsActivityInfo.
     * 
     * @return kind
     */
    public org.apache.axis.types.UnsignedInt getKind() {
        return kind;
    }


    /**
     * Sets the kind value for this WUDetailsActivityInfo.
     * 
     * @param kind
     */
    public void setKind(org.apache.axis.types.UnsignedInt kind) {
        this.kind = kind;
    }


    /**
     * Gets the name value for this WUDetailsActivityInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this WUDetailsActivityInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the isSink value for this WUDetailsActivityInfo.
     * 
     * @return isSink
     */
    public java.lang.Boolean getIsSink() {
        return isSink;
    }


    /**
     * Sets the isSink value for this WUDetailsActivityInfo.
     * 
     * @param isSink
     */
    public void setIsSink(java.lang.Boolean isSink) {
        this.isSink = isSink;
    }


    /**
     * Gets the isSource value for this WUDetailsActivityInfo.
     * 
     * @return isSource
     */
    public java.lang.Boolean getIsSource() {
        return isSource;
    }


    /**
     * Sets the isSource value for this WUDetailsActivityInfo.
     * 
     * @param isSource
     */
    public void setIsSource(java.lang.Boolean isSource) {
        this.isSource = isSource;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUDetailsActivityInfo)) return false;
        WUDetailsActivityInfo other = (WUDetailsActivityInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kind==null && other.getKind()==null) || 
             (this.kind!=null &&
              this.kind.equals(other.getKind()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.isSink==null && other.getIsSink()==null) || 
             (this.isSink!=null &&
              this.isSink.equals(other.getIsSink()))) &&
            ((this.isSource==null && other.getIsSource()==null) || 
             (this.isSource!=null &&
              this.isSource.equals(other.getIsSource())));
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
        if (getKind() != null) {
            _hashCode += getKind().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getIsSink() != null) {
            _hashCode += getIsSink().hashCode();
        }
        if (getIsSource() != null) {
            _hashCode += getIsSource().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WUDetailsActivityInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUDetailsActivityInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kind");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Kind"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSink");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IsSink"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IsSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

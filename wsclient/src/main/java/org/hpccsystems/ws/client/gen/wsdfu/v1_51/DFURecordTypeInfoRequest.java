/**
 * DFURecordTypeInfoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsdfu.v1_51;

public class DFURecordTypeInfoRequest  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.Boolean includeJsonTypeInfo;

    private java.lang.Boolean includeBinTypeInfo;

    public DFURecordTypeInfoRequest() {
    }

    public DFURecordTypeInfoRequest(
           java.lang.String name,
           java.lang.Boolean includeJsonTypeInfo,
           java.lang.Boolean includeBinTypeInfo) {
           this.name = name;
           this.includeJsonTypeInfo = includeJsonTypeInfo;
           this.includeBinTypeInfo = includeBinTypeInfo;
    }


    /**
     * Gets the name value for this DFURecordTypeInfoRequest.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DFURecordTypeInfoRequest.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the includeJsonTypeInfo value for this DFURecordTypeInfoRequest.
     * 
     * @return includeJsonTypeInfo
     */
    public java.lang.Boolean getIncludeJsonTypeInfo() {
        return includeJsonTypeInfo;
    }


    /**
     * Sets the includeJsonTypeInfo value for this DFURecordTypeInfoRequest.
     * 
     * @param includeJsonTypeInfo
     */
    public void setIncludeJsonTypeInfo(java.lang.Boolean includeJsonTypeInfo) {
        this.includeJsonTypeInfo = includeJsonTypeInfo;
    }


    /**
     * Gets the includeBinTypeInfo value for this DFURecordTypeInfoRequest.
     * 
     * @return includeBinTypeInfo
     */
    public java.lang.Boolean getIncludeBinTypeInfo() {
        return includeBinTypeInfo;
    }


    /**
     * Sets the includeBinTypeInfo value for this DFURecordTypeInfoRequest.
     * 
     * @param includeBinTypeInfo
     */
    public void setIncludeBinTypeInfo(java.lang.Boolean includeBinTypeInfo) {
        this.includeBinTypeInfo = includeBinTypeInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DFURecordTypeInfoRequest)) return false;
        DFURecordTypeInfoRequest other = (DFURecordTypeInfoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.includeJsonTypeInfo==null && other.getIncludeJsonTypeInfo()==null) || 
             (this.includeJsonTypeInfo!=null &&
              this.includeJsonTypeInfo.equals(other.getIncludeJsonTypeInfo()))) &&
            ((this.includeBinTypeInfo==null && other.getIncludeBinTypeInfo()==null) || 
             (this.includeBinTypeInfo!=null &&
              this.includeBinTypeInfo.equals(other.getIncludeBinTypeInfo())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getIncludeJsonTypeInfo() != null) {
            _hashCode += getIncludeJsonTypeInfo().hashCode();
        }
        if (getIncludeBinTypeInfo() != null) {
            _hashCode += getIncludeBinTypeInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DFURecordTypeInfoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFURecordTypeInfoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeJsonTypeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "IncludeJsonTypeInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeBinTypeInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "IncludeBinTypeInfo"));
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

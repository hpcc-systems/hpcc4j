/**
 * EclRecordTypeInfoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsdfu.v1_51;

public class EclRecordTypeInfoRequest  implements java.io.Serializable {
    private java.lang.String ecl;

    private java.lang.Boolean includeJsonTypeInfo;

    private java.lang.Boolean includeBinTypeInfo;

    public EclRecordTypeInfoRequest() {
    }

    public EclRecordTypeInfoRequest(
           java.lang.String ecl,
           java.lang.Boolean includeJsonTypeInfo,
           java.lang.Boolean includeBinTypeInfo) {
           this.ecl = ecl;
           this.includeJsonTypeInfo = includeJsonTypeInfo;
           this.includeBinTypeInfo = includeBinTypeInfo;
    }


    /**
     * Gets the ecl value for this EclRecordTypeInfoRequest.
     * 
     * @return ecl
     */
    public java.lang.String getEcl() {
        return ecl;
    }


    /**
     * Sets the ecl value for this EclRecordTypeInfoRequest.
     * 
     * @param ecl
     */
    public void setEcl(java.lang.String ecl) {
        this.ecl = ecl;
    }


    /**
     * Gets the includeJsonTypeInfo value for this EclRecordTypeInfoRequest.
     * 
     * @return includeJsonTypeInfo
     */
    public java.lang.Boolean getIncludeJsonTypeInfo() {
        return includeJsonTypeInfo;
    }


    /**
     * Sets the includeJsonTypeInfo value for this EclRecordTypeInfoRequest.
     * 
     * @param includeJsonTypeInfo
     */
    public void setIncludeJsonTypeInfo(java.lang.Boolean includeJsonTypeInfo) {
        this.includeJsonTypeInfo = includeJsonTypeInfo;
    }


    /**
     * Gets the includeBinTypeInfo value for this EclRecordTypeInfoRequest.
     * 
     * @return includeBinTypeInfo
     */
    public java.lang.Boolean getIncludeBinTypeInfo() {
        return includeBinTypeInfo;
    }


    /**
     * Sets the includeBinTypeInfo value for this EclRecordTypeInfoRequest.
     * 
     * @param includeBinTypeInfo
     */
    public void setIncludeBinTypeInfo(java.lang.Boolean includeBinTypeInfo) {
        this.includeBinTypeInfo = includeBinTypeInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EclRecordTypeInfoRequest)) return false;
        EclRecordTypeInfoRequest other = (EclRecordTypeInfoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ecl==null && other.getEcl()==null) || 
             (this.ecl!=null &&
              this.ecl.equals(other.getEcl()))) &&
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
        if (getEcl() != null) {
            _hashCode += getEcl().hashCode();
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
        new org.apache.axis.description.TypeDesc(EclRecordTypeInfoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">EclRecordTypeInfoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ecl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Ecl"));
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

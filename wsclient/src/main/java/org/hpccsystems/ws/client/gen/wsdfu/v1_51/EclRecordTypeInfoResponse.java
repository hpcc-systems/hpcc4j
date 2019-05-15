/**
 * EclRecordTypeInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsdfu.v1_51;

public class EclRecordTypeInfoResponse  implements java.io.Serializable {
    private java.lang.String jsonInfo;

    private byte[] binInfo;

    public EclRecordTypeInfoResponse() {
    }

    public EclRecordTypeInfoResponse(
           java.lang.String jsonInfo,
           byte[] binInfo) {
           this.jsonInfo = jsonInfo;
           this.binInfo = binInfo;
    }


    /**
     * Gets the jsonInfo value for this EclRecordTypeInfoResponse.
     * 
     * @return jsonInfo
     */
    public java.lang.String getJsonInfo() {
        return jsonInfo;
    }


    /**
     * Sets the jsonInfo value for this EclRecordTypeInfoResponse.
     * 
     * @param jsonInfo
     */
    public void setJsonInfo(java.lang.String jsonInfo) {
        this.jsonInfo = jsonInfo;
    }


    /**
     * Gets the binInfo value for this EclRecordTypeInfoResponse.
     * 
     * @return binInfo
     */
    public byte[] getBinInfo() {
        return binInfo;
    }


    /**
     * Sets the binInfo value for this EclRecordTypeInfoResponse.
     * 
     * @param binInfo
     */
    public void setBinInfo(byte[] binInfo) {
        this.binInfo = binInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EclRecordTypeInfoResponse)) return false;
        EclRecordTypeInfoResponse other = (EclRecordTypeInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.jsonInfo==null && other.getJsonInfo()==null) || 
             (this.jsonInfo!=null &&
              this.jsonInfo.equals(other.getJsonInfo()))) &&
            ((this.binInfo==null && other.getBinInfo()==null) || 
             (this.binInfo!=null &&
              java.util.Arrays.equals(this.binInfo, other.getBinInfo())));
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
        if (getJsonInfo() != null) {
            _hashCode += getJsonInfo().hashCode();
        }
        if (getBinInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBinInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBinInfo(), i);
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
        new org.apache.axis.description.TypeDesc(EclRecordTypeInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">EclRecordTypeInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jsonInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "jsonInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "binInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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

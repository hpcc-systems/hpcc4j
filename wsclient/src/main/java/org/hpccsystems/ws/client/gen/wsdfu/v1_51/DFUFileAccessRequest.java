/**
 * DFUFileAccessRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsdfu.v1_51;

public class DFUFileAccessRequest  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileAccessRequestBase requestBase;

    public DFUFileAccessRequest() {
    }

    public DFUFileAccessRequest(
           org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileAccessRequestBase requestBase) {
           this.requestBase = requestBase;
    }


    /**
     * Gets the requestBase value for this DFUFileAccessRequest.
     * 
     * @return requestBase
     */
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileAccessRequestBase getRequestBase() {
        return requestBase;
    }


    /**
     * Sets the requestBase value for this DFUFileAccessRequest.
     * 
     * @param requestBase
     */
    public void setRequestBase(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileAccessRequestBase requestBase) {
        this.requestBase = requestBase;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DFUFileAccessRequest)) return false;
        DFUFileAccessRequest other = (DFUFileAccessRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestBase==null && other.getRequestBase()==null) || 
             (this.requestBase!=null &&
              this.requestBase.equals(other.getRequestBase())));
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
        if (getRequestBase() != null) {
            _hashCode += getRequestBase().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DFUFileAccessRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUFileAccessRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestBase");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "RequestBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFileAccessRequestBase"));
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

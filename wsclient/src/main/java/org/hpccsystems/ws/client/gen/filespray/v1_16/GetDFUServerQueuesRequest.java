/**
 * GetDFUServerQueuesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.filespray.v1_16;

public class GetDFUServerQueuesRequest  implements java.io.Serializable {
    private java.lang.String DFUServerName;

    public GetDFUServerQueuesRequest() {
    }

    public GetDFUServerQueuesRequest(
           java.lang.String DFUServerName) {
           this.DFUServerName = DFUServerName;
    }


    /**
     * Gets the DFUServerName value for this GetDFUServerQueuesRequest.
     * 
     * @return DFUServerName
     */
    public java.lang.String getDFUServerName() {
        return DFUServerName;
    }


    /**
     * Sets the DFUServerName value for this GetDFUServerQueuesRequest.
     * 
     * @param DFUServerName
     */
    public void setDFUServerName(java.lang.String DFUServerName) {
        this.DFUServerName = DFUServerName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDFUServerQueuesRequest)) return false;
        GetDFUServerQueuesRequest other = (GetDFUServerQueuesRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DFUServerName==null && other.getDFUServerName()==null) || 
             (this.DFUServerName!=null &&
              this.DFUServerName.equals(other.getDFUServerName())));
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
        if (getDFUServerName() != null) {
            _hashCode += getDFUServerName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDFUServerQueuesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">GetDFUServerQueuesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DFUServerName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DFUServerName"));
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

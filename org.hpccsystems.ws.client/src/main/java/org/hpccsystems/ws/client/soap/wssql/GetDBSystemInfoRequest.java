/**
 * GetDBSystemInfoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.soap.wssql;

public class GetDBSystemInfoRequest  implements java.io.Serializable {
    private java.lang.Boolean includeAll;

    public GetDBSystemInfoRequest() {
    }

    public GetDBSystemInfoRequest(
           java.lang.Boolean includeAll) {
           this.includeAll = includeAll;
    }


    /**
     * Gets the includeAll value for this GetDBSystemInfoRequest.
     * 
     * @return includeAll
     */
    public java.lang.Boolean getIncludeAll() {
        return includeAll;
    }


    /**
     * Sets the includeAll value for this GetDBSystemInfoRequest.
     * 
     * @param includeAll
     */
    public void setIncludeAll(java.lang.Boolean includeAll) {
        this.includeAll = includeAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDBSystemInfoRequest)) return false;
        GetDBSystemInfoRequest other = (GetDBSystemInfoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.includeAll==null && other.getIncludeAll()==null) || 
             (this.includeAll!=null &&
              this.includeAll.equals(other.getIncludeAll())));
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
        if (getIncludeAll() != null) {
            _hashCode += getIncludeAll().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDBSystemInfoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">GetDBSystemInfoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeAll");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "IncludeAll"));
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

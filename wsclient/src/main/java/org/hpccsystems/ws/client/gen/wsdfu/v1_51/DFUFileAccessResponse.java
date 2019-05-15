/**
 * DFUFileAccessResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsdfu.v1_51;

public class DFUFileAccessResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException exceptions;

    private org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileAccessInfo accessInfo;

    private org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileType type;

    public DFUFileAccessResponse() {
    }

    public DFUFileAccessResponse(
           org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException exceptions,
           org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileAccessInfo accessInfo,
           org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileType type) {
           this.exceptions = exceptions;
           this.accessInfo = accessInfo;
           this.type = type;
    }


    /**
     * Gets the exceptions value for this DFUFileAccessResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this DFUFileAccessResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the accessInfo value for this DFUFileAccessResponse.
     * 
     * @return accessInfo
     */
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileAccessInfo getAccessInfo() {
        return accessInfo;
    }


    /**
     * Sets the accessInfo value for this DFUFileAccessResponse.
     * 
     * @param accessInfo
     */
    public void setAccessInfo(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileAccessInfo accessInfo) {
        this.accessInfo = accessInfo;
    }


    /**
     * Gets the type value for this DFUFileAccessResponse.
     * 
     * @return type
     */
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileType getType() {
        return type;
    }


    /**
     * Sets the type value for this DFUFileAccessResponse.
     * 
     * @param type
     */
    public void setType(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileType type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DFUFileAccessResponse)) return false;
        DFUFileAccessResponse other = (DFUFileAccessResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.exceptions==null && other.getExceptions()==null) || 
             (this.exceptions!=null &&
              this.exceptions.equals(other.getExceptions()))) &&
            ((this.accessInfo==null && other.getAccessInfo()==null) || 
             (this.accessInfo!=null &&
              this.accessInfo.equals(other.getAccessInfo()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getExceptions() != null) {
            _hashCode += getExceptions().hashCode();
        }
        if (getAccessInfo() != null) {
            _hashCode += getAccessInfo().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DFUFileAccessResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUFileAccessResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "AccessInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFileAccessInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFileType"));
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

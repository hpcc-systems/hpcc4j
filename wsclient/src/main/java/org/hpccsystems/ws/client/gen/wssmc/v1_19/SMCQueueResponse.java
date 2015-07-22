/**
 * SMCQueueResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wssmc.v1_19;

public class SMCQueueResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wssmc.v1_19.ArrayOfEspException exceptions;

    private org.hpccsystems.ws.client.gen.wssmc.v1_19.StatusServerInfo statusServerInfo;

    public SMCQueueResponse() {
    }

    public SMCQueueResponse(
           org.hpccsystems.ws.client.gen.wssmc.v1_19.ArrayOfEspException exceptions,
           org.hpccsystems.ws.client.gen.wssmc.v1_19.StatusServerInfo statusServerInfo) {
           this.exceptions = exceptions;
           this.statusServerInfo = statusServerInfo;
    }


    /**
     * Gets the exceptions value for this SMCQueueResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wssmc.v1_19.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this SMCQueueResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wssmc.v1_19.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the statusServerInfo value for this SMCQueueResponse.
     * 
     * @return statusServerInfo
     */
    public org.hpccsystems.ws.client.gen.wssmc.v1_19.StatusServerInfo getStatusServerInfo() {
        return statusServerInfo;
    }


    /**
     * Sets the statusServerInfo value for this SMCQueueResponse.
     * 
     * @param statusServerInfo
     */
    public void setStatusServerInfo(org.hpccsystems.ws.client.gen.wssmc.v1_19.StatusServerInfo statusServerInfo) {
        this.statusServerInfo = statusServerInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SMCQueueResponse)) return false;
        SMCQueueResponse other = (SMCQueueResponse) obj;
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
            ((this.statusServerInfo==null && other.getStatusServerInfo()==null) || 
             (this.statusServerInfo!=null &&
              this.statusServerInfo.equals(other.getStatusServerInfo())));
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
        if (getStatusServerInfo() != null) {
            _hashCode += getStatusServerInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SMCQueueResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">SMCQueueResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusServerInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "StatusServerInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "StatusServerInfo"));
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

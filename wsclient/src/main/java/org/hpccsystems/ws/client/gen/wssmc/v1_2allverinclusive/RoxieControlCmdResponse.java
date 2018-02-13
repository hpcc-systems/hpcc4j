/**
 * RoxieControlCmdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive;

public class RoxieControlCmdResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException exceptions;

    private org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.RoxieControlEndpointInfo[] endpoints;

    public RoxieControlCmdResponse() {
    }

    public RoxieControlCmdResponse(
           org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException exceptions,
           org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.RoxieControlEndpointInfo[] endpoints) {
           this.exceptions = exceptions;
           this.endpoints = endpoints;
    }


    /**
     * Gets the exceptions value for this RoxieControlCmdResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this RoxieControlCmdResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the endpoints value for this RoxieControlCmdResponse.
     * 
     * @return endpoints
     */
    public org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.RoxieControlEndpointInfo[] getEndpoints() {
        return endpoints;
    }


    /**
     * Sets the endpoints value for this RoxieControlCmdResponse.
     * 
     * @param endpoints
     */
    public void setEndpoints(org.hpccsystems.ws.client.gen.wssmc.v1_2allverinclusive.RoxieControlEndpointInfo[] endpoints) {
        this.endpoints = endpoints;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoxieControlCmdResponse)) return false;
        RoxieControlCmdResponse other = (RoxieControlCmdResponse) obj;
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
            ((this.endpoints==null && other.getEndpoints()==null) || 
             (this.endpoints!=null &&
              java.util.Arrays.equals(this.endpoints, other.getEndpoints())));
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
        if (getEndpoints() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEndpoints());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEndpoints(), i);
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
        new org.apache.axis.description.TypeDesc(RoxieControlCmdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", ">RoxieControlCmdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endpoints");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Endpoints"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "RoxieControlEndpointInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Endpoint"));
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

/**
 * GetESDLBindingRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0;

public class GetESDLBindingRequest  implements java.io.Serializable {
    private java.lang.String espProcName;

    private java.lang.String espBindingName;

    private java.lang.String espPort;

    private java.lang.String esdlBindingId;

    public GetESDLBindingRequest() {
    }

    public GetESDLBindingRequest(
           java.lang.String espProcName,
           java.lang.String espBindingName,
           java.lang.String espPort,
           java.lang.String esdlBindingId) {
           this.espProcName = espProcName;
           this.espBindingName = espBindingName;
           this.espPort = espPort;
           this.esdlBindingId = esdlBindingId;
    }


    /**
     * Gets the espProcName value for this GetESDLBindingRequest.
     * 
     * @return espProcName
     */
    public java.lang.String getEspProcName() {
        return espProcName;
    }


    /**
     * Sets the espProcName value for this GetESDLBindingRequest.
     * 
     * @param espProcName
     */
    public void setEspProcName(java.lang.String espProcName) {
        this.espProcName = espProcName;
    }


    /**
     * Gets the espBindingName value for this GetESDLBindingRequest.
     * 
     * @return espBindingName
     */
    public java.lang.String getEspBindingName() {
        return espBindingName;
    }


    /**
     * Sets the espBindingName value for this GetESDLBindingRequest.
     * 
     * @param espBindingName
     */
    public void setEspBindingName(java.lang.String espBindingName) {
        this.espBindingName = espBindingName;
    }


    /**
     * Gets the espPort value for this GetESDLBindingRequest.
     * 
     * @return espPort
     */
    public java.lang.String getEspPort() {
        return espPort;
    }


    /**
     * Sets the espPort value for this GetESDLBindingRequest.
     * 
     * @param espPort
     */
    public void setEspPort(java.lang.String espPort) {
        this.espPort = espPort;
    }


    /**
     * Gets the esdlBindingId value for this GetESDLBindingRequest.
     * 
     * @return esdlBindingId
     */
    public java.lang.String getEsdlBindingId() {
        return esdlBindingId;
    }


    /**
     * Sets the esdlBindingId value for this GetESDLBindingRequest.
     * 
     * @param esdlBindingId
     */
    public void setEsdlBindingId(java.lang.String esdlBindingId) {
        this.esdlBindingId = esdlBindingId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetESDLBindingRequest)) return false;
        GetESDLBindingRequest other = (GetESDLBindingRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.espProcName==null && other.getEspProcName()==null) || 
             (this.espProcName!=null &&
              this.espProcName.equals(other.getEspProcName()))) &&
            ((this.espBindingName==null && other.getEspBindingName()==null) || 
             (this.espBindingName!=null &&
              this.espBindingName.equals(other.getEspBindingName()))) &&
            ((this.espPort==null && other.getEspPort()==null) || 
             (this.espPort!=null &&
              this.espPort.equals(other.getEspPort()))) &&
            ((this.esdlBindingId==null && other.getEsdlBindingId()==null) || 
             (this.esdlBindingId!=null &&
              this.esdlBindingId.equals(other.getEsdlBindingId())));
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
        if (getEspProcName() != null) {
            _hashCode += getEspProcName().hashCode();
        }
        if (getEspBindingName() != null) {
            _hashCode += getEspBindingName().hashCode();
        }
        if (getEspPort() != null) {
            _hashCode += getEspPort().hashCode();
        }
        if (getEsdlBindingId() != null) {
            _hashCode += getEsdlBindingId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetESDLBindingRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", ">GetESDLBindingRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("espProcName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "EspProcName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("espBindingName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "EspBindingName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("espPort");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "EspPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esdlBindingId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "EsdlBindingId"));
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

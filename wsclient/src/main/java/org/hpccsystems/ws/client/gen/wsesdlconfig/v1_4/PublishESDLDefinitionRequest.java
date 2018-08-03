/**
 * PublishESDLDefinitionRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4;

public class PublishESDLDefinitionRequest  implements java.io.Serializable {
    private java.lang.String serviceName;

    private java.lang.String XMLDefinition;

    private java.lang.Boolean deletePrevious;

    private java.lang.Boolean echoDefinition;

    public PublishESDLDefinitionRequest() {
    }

    public PublishESDLDefinitionRequest(
           java.lang.String serviceName,
           java.lang.String XMLDefinition,
           java.lang.Boolean deletePrevious,
           java.lang.Boolean echoDefinition) {
           this.serviceName = serviceName;
           this.XMLDefinition = XMLDefinition;
           this.deletePrevious = deletePrevious;
           this.echoDefinition = echoDefinition;
    }


    /**
     * Gets the serviceName value for this PublishESDLDefinitionRequest.
     * 
     * @return serviceName
     */
    public java.lang.String getServiceName() {
        return serviceName;
    }


    /**
     * Sets the serviceName value for this PublishESDLDefinitionRequest.
     * 
     * @param serviceName
     */
    public void setServiceName(java.lang.String serviceName) {
        this.serviceName = serviceName;
    }


    /**
     * Gets the XMLDefinition value for this PublishESDLDefinitionRequest.
     * 
     * @return XMLDefinition
     */
    public java.lang.String getXMLDefinition() {
        return XMLDefinition;
    }


    /**
     * Sets the XMLDefinition value for this PublishESDLDefinitionRequest.
     * 
     * @param XMLDefinition
     */
    public void setXMLDefinition(java.lang.String XMLDefinition) {
        this.XMLDefinition = XMLDefinition;
    }


    /**
     * Gets the deletePrevious value for this PublishESDLDefinitionRequest.
     * 
     * @return deletePrevious
     */
    public java.lang.Boolean getDeletePrevious() {
        return deletePrevious;
    }


    /**
     * Sets the deletePrevious value for this PublishESDLDefinitionRequest.
     * 
     * @param deletePrevious
     */
    public void setDeletePrevious(java.lang.Boolean deletePrevious) {
        this.deletePrevious = deletePrevious;
    }


    /**
     * Gets the echoDefinition value for this PublishESDLDefinitionRequest.
     * 
     * @return echoDefinition
     */
    public java.lang.Boolean getEchoDefinition() {
        return echoDefinition;
    }


    /**
     * Sets the echoDefinition value for this PublishESDLDefinitionRequest.
     * 
     * @param echoDefinition
     */
    public void setEchoDefinition(java.lang.Boolean echoDefinition) {
        this.echoDefinition = echoDefinition;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PublishESDLDefinitionRequest)) return false;
        PublishESDLDefinitionRequest other = (PublishESDLDefinitionRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serviceName==null && other.getServiceName()==null) || 
             (this.serviceName!=null &&
              this.serviceName.equals(other.getServiceName()))) &&
            ((this.XMLDefinition==null && other.getXMLDefinition()==null) || 
             (this.XMLDefinition!=null &&
              this.XMLDefinition.equals(other.getXMLDefinition()))) &&
            ((this.deletePrevious==null && other.getDeletePrevious()==null) || 
             (this.deletePrevious!=null &&
              this.deletePrevious.equals(other.getDeletePrevious()))) &&
            ((this.echoDefinition==null && other.getEchoDefinition()==null) || 
             (this.echoDefinition!=null &&
              this.echoDefinition.equals(other.getEchoDefinition())));
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
        if (getServiceName() != null) {
            _hashCode += getServiceName().hashCode();
        }
        if (getXMLDefinition() != null) {
            _hashCode += getXMLDefinition().hashCode();
        }
        if (getDeletePrevious() != null) {
            _hashCode += getDeletePrevious().hashCode();
        }
        if (getEchoDefinition() != null) {
            _hashCode += getEchoDefinition().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PublishESDLDefinitionRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", ">PublishESDLDefinitionRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "ServiceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XMLDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "XMLDefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deletePrevious");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "DeletePrevious"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("echoDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "EchoDefinition"));
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

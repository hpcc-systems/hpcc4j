/**
 * GetESDLDefinitionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0;

public class GetESDLDefinitionResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.ArrayOfEspException exceptions;

    private java.lang.String id;

    private java.lang.String XMLDefinition;

    private org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.BaseESDLStatus status;

    public GetESDLDefinitionResponse() {
    }

    public GetESDLDefinitionResponse(
           org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.ArrayOfEspException exceptions,
           java.lang.String id,
           java.lang.String XMLDefinition,
           org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.BaseESDLStatus status) {
           this.exceptions = exceptions;
           this.id = id;
           this.XMLDefinition = XMLDefinition;
           this.status = status;
    }


    /**
     * Gets the exceptions value for this GetESDLDefinitionResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this GetESDLDefinitionResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the id value for this GetESDLDefinitionResponse.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this GetESDLDefinitionResponse.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the XMLDefinition value for this GetESDLDefinitionResponse.
     * 
     * @return XMLDefinition
     */
    public java.lang.String getXMLDefinition() {
        return XMLDefinition;
    }


    /**
     * Sets the XMLDefinition value for this GetESDLDefinitionResponse.
     * 
     * @param XMLDefinition
     */
    public void setXMLDefinition(java.lang.String XMLDefinition) {
        this.XMLDefinition = XMLDefinition;
    }


    /**
     * Gets the status value for this GetESDLDefinitionResponse.
     * 
     * @return status
     */
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.BaseESDLStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetESDLDefinitionResponse.
     * 
     * @param status
     */
    public void setStatus(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_0.BaseESDLStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetESDLDefinitionResponse)) return false;
        GetESDLDefinitionResponse other = (GetESDLDefinitionResponse) obj;
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
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.XMLDefinition==null && other.getXMLDefinition()==null) || 
             (this.XMLDefinition!=null &&
              this.XMLDefinition.equals(other.getXMLDefinition()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getXMLDefinition() != null) {
            _hashCode += getXMLDefinition().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetESDLDefinitionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", ">GetESDLDefinitionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "Id"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "BaseESDLStatus"));
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

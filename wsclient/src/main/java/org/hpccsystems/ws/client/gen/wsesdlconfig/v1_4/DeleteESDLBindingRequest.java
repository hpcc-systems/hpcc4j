/**
 * DeleteESDLBindingRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4;

public class DeleteESDLBindingRequest  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String espProcess;

    private java.lang.String espBinding;

    public DeleteESDLBindingRequest() {
    }

    public DeleteESDLBindingRequest(
           java.lang.String id,
           java.lang.String espProcess,
           java.lang.String espBinding) {
           this.id = id;
           this.espProcess = espProcess;
           this.espBinding = espBinding;
    }


    /**
     * Gets the id value for this DeleteESDLBindingRequest.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this DeleteESDLBindingRequest.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the espProcess value for this DeleteESDLBindingRequest.
     * 
     * @return espProcess
     */
    public java.lang.String getEspProcess() {
        return espProcess;
    }


    /**
     * Sets the espProcess value for this DeleteESDLBindingRequest.
     * 
     * @param espProcess
     */
    public void setEspProcess(java.lang.String espProcess) {
        this.espProcess = espProcess;
    }


    /**
     * Gets the espBinding value for this DeleteESDLBindingRequest.
     * 
     * @return espBinding
     */
    public java.lang.String getEspBinding() {
        return espBinding;
    }


    /**
     * Sets the espBinding value for this DeleteESDLBindingRequest.
     * 
     * @param espBinding
     */
    public void setEspBinding(java.lang.String espBinding) {
        this.espBinding = espBinding;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteESDLBindingRequest)) return false;
        DeleteESDLBindingRequest other = (DeleteESDLBindingRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.espProcess==null && other.getEspProcess()==null) || 
             (this.espProcess!=null &&
              this.espProcess.equals(other.getEspProcess()))) &&
            ((this.espBinding==null && other.getEspBinding()==null) || 
             (this.espBinding!=null &&
              this.espBinding.equals(other.getEspBinding())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getEspProcess() != null) {
            _hashCode += getEspProcess().hashCode();
        }
        if (getEspBinding() != null) {
            _hashCode += getEspBinding().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteESDLBindingRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", ">DeleteESDLBindingRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("espProcess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "EspProcess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("espBinding");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "EspBinding"));
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

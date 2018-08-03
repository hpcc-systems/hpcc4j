/**
 * ConfigureESDLBindingMethodRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4;

public class ConfigureESDLBindingMethodRequest  implements java.io.Serializable {
    private java.lang.String esdlBindingId;

    private java.lang.String methodName;

    private java.lang.Boolean overwrite;

    private java.lang.String config;

    private org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.MethodConfig methodStructure;

    private java.lang.Boolean echoBinding;

    public ConfigureESDLBindingMethodRequest() {
    }

    public ConfigureESDLBindingMethodRequest(
           java.lang.String esdlBindingId,
           java.lang.String methodName,
           java.lang.Boolean overwrite,
           java.lang.String config,
           org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.MethodConfig methodStructure,
           java.lang.Boolean echoBinding) {
           this.esdlBindingId = esdlBindingId;
           this.methodName = methodName;
           this.overwrite = overwrite;
           this.config = config;
           this.methodStructure = methodStructure;
           this.echoBinding = echoBinding;
    }


    /**
     * Gets the esdlBindingId value for this ConfigureESDLBindingMethodRequest.
     * 
     * @return esdlBindingId
     */
    public java.lang.String getEsdlBindingId() {
        return esdlBindingId;
    }


    /**
     * Sets the esdlBindingId value for this ConfigureESDLBindingMethodRequest.
     * 
     * @param esdlBindingId
     */
    public void setEsdlBindingId(java.lang.String esdlBindingId) {
        this.esdlBindingId = esdlBindingId;
    }


    /**
     * Gets the methodName value for this ConfigureESDLBindingMethodRequest.
     * 
     * @return methodName
     */
    public java.lang.String getMethodName() {
        return methodName;
    }


    /**
     * Sets the methodName value for this ConfigureESDLBindingMethodRequest.
     * 
     * @param methodName
     */
    public void setMethodName(java.lang.String methodName) {
        this.methodName = methodName;
    }


    /**
     * Gets the overwrite value for this ConfigureESDLBindingMethodRequest.
     * 
     * @return overwrite
     */
    public java.lang.Boolean getOverwrite() {
        return overwrite;
    }


    /**
     * Sets the overwrite value for this ConfigureESDLBindingMethodRequest.
     * 
     * @param overwrite
     */
    public void setOverwrite(java.lang.Boolean overwrite) {
        this.overwrite = overwrite;
    }


    /**
     * Gets the config value for this ConfigureESDLBindingMethodRequest.
     * 
     * @return config
     */
    public java.lang.String getConfig() {
        return config;
    }


    /**
     * Sets the config value for this ConfigureESDLBindingMethodRequest.
     * 
     * @param config
     */
    public void setConfig(java.lang.String config) {
        this.config = config;
    }


    /**
     * Gets the methodStructure value for this ConfigureESDLBindingMethodRequest.
     * 
     * @return methodStructure
     */
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.MethodConfig getMethodStructure() {
        return methodStructure;
    }


    /**
     * Sets the methodStructure value for this ConfigureESDLBindingMethodRequest.
     * 
     * @param methodStructure
     */
    public void setMethodStructure(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.MethodConfig methodStructure) {
        this.methodStructure = methodStructure;
    }


    /**
     * Gets the echoBinding value for this ConfigureESDLBindingMethodRequest.
     * 
     * @return echoBinding
     */
    public java.lang.Boolean getEchoBinding() {
        return echoBinding;
    }


    /**
     * Sets the echoBinding value for this ConfigureESDLBindingMethodRequest.
     * 
     * @param echoBinding
     */
    public void setEchoBinding(java.lang.Boolean echoBinding) {
        this.echoBinding = echoBinding;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConfigureESDLBindingMethodRequest)) return false;
        ConfigureESDLBindingMethodRequest other = (ConfigureESDLBindingMethodRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.esdlBindingId==null && other.getEsdlBindingId()==null) || 
             (this.esdlBindingId!=null &&
              this.esdlBindingId.equals(other.getEsdlBindingId()))) &&
            ((this.methodName==null && other.getMethodName()==null) || 
             (this.methodName!=null &&
              this.methodName.equals(other.getMethodName()))) &&
            ((this.overwrite==null && other.getOverwrite()==null) || 
             (this.overwrite!=null &&
              this.overwrite.equals(other.getOverwrite()))) &&
            ((this.config==null && other.getConfig()==null) || 
             (this.config!=null &&
              this.config.equals(other.getConfig()))) &&
            ((this.methodStructure==null && other.getMethodStructure()==null) || 
             (this.methodStructure!=null &&
              this.methodStructure.equals(other.getMethodStructure()))) &&
            ((this.echoBinding==null && other.getEchoBinding()==null) || 
             (this.echoBinding!=null &&
              this.echoBinding.equals(other.getEchoBinding())));
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
        if (getEsdlBindingId() != null) {
            _hashCode += getEsdlBindingId().hashCode();
        }
        if (getMethodName() != null) {
            _hashCode += getMethodName().hashCode();
        }
        if (getOverwrite() != null) {
            _hashCode += getOverwrite().hashCode();
        }
        if (getConfig() != null) {
            _hashCode += getConfig().hashCode();
        }
        if (getMethodStructure() != null) {
            _hashCode += getMethodStructure().hashCode();
        }
        if (getEchoBinding() != null) {
            _hashCode += getEchoBinding().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConfigureESDLBindingMethodRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", ">ConfigureESDLBindingMethodRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esdlBindingId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "EsdlBindingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("methodName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "MethodName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overwrite");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "Overwrite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("config");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "Config"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("methodStructure");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "MethodStructure"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "MethodConfig"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("echoBinding");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "EchoBinding"));
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

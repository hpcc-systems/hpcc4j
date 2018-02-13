/**
 * ConfigureESDLBindingMethodRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive;

public class ConfigureESDLBindingMethodRequest  implements java.io.Serializable {
    private java.lang.String espProcName;

    private java.lang.String espBindingName;

    private java.lang.String espPort;

    private java.lang.String esdlDefinitionID;

    private java.lang.String esdlServiceName;

    private java.lang.Boolean overwrite;

    private java.lang.String config;

    private org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.MethodConfig methodStructure;

    private java.lang.Boolean echoBinding;

    public ConfigureESDLBindingMethodRequest() {
    }

    public ConfigureESDLBindingMethodRequest(
           java.lang.String espProcName,
           java.lang.String espBindingName,
           java.lang.String espPort,
           java.lang.String esdlDefinitionID,
           java.lang.String esdlServiceName,
           java.lang.Boolean overwrite,
           java.lang.String config,
           org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.MethodConfig methodStructure,
           java.lang.Boolean echoBinding) {
           this.espProcName = espProcName;
           this.espBindingName = espBindingName;
           this.espPort = espPort;
           this.esdlDefinitionID = esdlDefinitionID;
           this.esdlServiceName = esdlServiceName;
           this.overwrite = overwrite;
           this.config = config;
           this.methodStructure = methodStructure;
           this.echoBinding = echoBinding;
    }


    /**
     * Gets the espProcName value for this ConfigureESDLBindingMethodRequest.
     * 
     * @return espProcName
     */
    public java.lang.String getEspProcName() {
        return espProcName;
    }


    /**
     * Sets the espProcName value for this ConfigureESDLBindingMethodRequest.
     * 
     * @param espProcName
     */
    public void setEspProcName(java.lang.String espProcName) {
        this.espProcName = espProcName;
    }


    /**
     * Gets the espBindingName value for this ConfigureESDLBindingMethodRequest.
     * 
     * @return espBindingName
     */
    public java.lang.String getEspBindingName() {
        return espBindingName;
    }


    /**
     * Sets the espBindingName value for this ConfigureESDLBindingMethodRequest.
     * 
     * @param espBindingName
     */
    public void setEspBindingName(java.lang.String espBindingName) {
        this.espBindingName = espBindingName;
    }


    /**
     * Gets the espPort value for this ConfigureESDLBindingMethodRequest.
     * 
     * @return espPort
     */
    public java.lang.String getEspPort() {
        return espPort;
    }


    /**
     * Sets the espPort value for this ConfigureESDLBindingMethodRequest.
     * 
     * @param espPort
     */
    public void setEspPort(java.lang.String espPort) {
        this.espPort = espPort;
    }


    /**
     * Gets the esdlDefinitionID value for this ConfigureESDLBindingMethodRequest.
     * 
     * @return esdlDefinitionID
     */
    public java.lang.String getEsdlDefinitionID() {
        return esdlDefinitionID;
    }


    /**
     * Sets the esdlDefinitionID value for this ConfigureESDLBindingMethodRequest.
     * 
     * @param esdlDefinitionID
     */
    public void setEsdlDefinitionID(java.lang.String esdlDefinitionID) {
        this.esdlDefinitionID = esdlDefinitionID;
    }


    /**
     * Gets the esdlServiceName value for this ConfigureESDLBindingMethodRequest.
     * 
     * @return esdlServiceName
     */
    public java.lang.String getEsdlServiceName() {
        return esdlServiceName;
    }


    /**
     * Sets the esdlServiceName value for this ConfigureESDLBindingMethodRequest.
     * 
     * @param esdlServiceName
     */
    public void setEsdlServiceName(java.lang.String esdlServiceName) {
        this.esdlServiceName = esdlServiceName;
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
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.MethodConfig getMethodStructure() {
        return methodStructure;
    }


    /**
     * Sets the methodStructure value for this ConfigureESDLBindingMethodRequest.
     * 
     * @param methodStructure
     */
    public void setMethodStructure(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.MethodConfig methodStructure) {
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
            ((this.espProcName==null && other.getEspProcName()==null) || 
             (this.espProcName!=null &&
              this.espProcName.equals(other.getEspProcName()))) &&
            ((this.espBindingName==null && other.getEspBindingName()==null) || 
             (this.espBindingName!=null &&
              this.espBindingName.equals(other.getEspBindingName()))) &&
            ((this.espPort==null && other.getEspPort()==null) || 
             (this.espPort!=null &&
              this.espPort.equals(other.getEspPort()))) &&
            ((this.esdlDefinitionID==null && other.getEsdlDefinitionID()==null) || 
             (this.esdlDefinitionID!=null &&
              this.esdlDefinitionID.equals(other.getEsdlDefinitionID()))) &&
            ((this.esdlServiceName==null && other.getEsdlServiceName()==null) || 
             (this.esdlServiceName!=null &&
              this.esdlServiceName.equals(other.getEsdlServiceName()))) &&
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
        if (getEspProcName() != null) {
            _hashCode += getEspProcName().hashCode();
        }
        if (getEspBindingName() != null) {
            _hashCode += getEspBindingName().hashCode();
        }
        if (getEspPort() != null) {
            _hashCode += getEspPort().hashCode();
        }
        if (getEsdlDefinitionID() != null) {
            _hashCode += getEsdlDefinitionID().hashCode();
        }
        if (getEsdlServiceName() != null) {
            _hashCode += getEsdlServiceName().hashCode();
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
        elemField.setFieldName("esdlDefinitionID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "EsdlDefinitionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esdlServiceName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "EsdlServiceName"));
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

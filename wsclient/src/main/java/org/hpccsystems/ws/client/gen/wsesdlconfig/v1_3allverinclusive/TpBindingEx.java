/**
 * TpBindingEx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive;

public class TpBindingEx  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String service;

    private java.lang.String serviceType;

    private java.lang.String bindingType;

    private java.lang.String serviceBuildSet;

    private java.lang.String port;

    private java.lang.String protocol;

    private org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.ESDLBindingContents ESDLBinding;

    public TpBindingEx() {
    }

    public TpBindingEx(
           java.lang.String name,
           java.lang.String service,
           java.lang.String serviceType,
           java.lang.String bindingType,
           java.lang.String serviceBuildSet,
           java.lang.String port,
           java.lang.String protocol,
           org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.ESDLBindingContents ESDLBinding) {
           this.name = name;
           this.service = service;
           this.serviceType = serviceType;
           this.bindingType = bindingType;
           this.serviceBuildSet = serviceBuildSet;
           this.port = port;
           this.protocol = protocol;
           this.ESDLBinding = ESDLBinding;
    }


    /**
     * Gets the name value for this TpBindingEx.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TpBindingEx.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the service value for this TpBindingEx.
     * 
     * @return service
     */
    public java.lang.String getService() {
        return service;
    }


    /**
     * Sets the service value for this TpBindingEx.
     * 
     * @param service
     */
    public void setService(java.lang.String service) {
        this.service = service;
    }


    /**
     * Gets the serviceType value for this TpBindingEx.
     * 
     * @return serviceType
     */
    public java.lang.String getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this TpBindingEx.
     * 
     * @param serviceType
     */
    public void setServiceType(java.lang.String serviceType) {
        this.serviceType = serviceType;
    }


    /**
     * Gets the bindingType value for this TpBindingEx.
     * 
     * @return bindingType
     */
    public java.lang.String getBindingType() {
        return bindingType;
    }


    /**
     * Sets the bindingType value for this TpBindingEx.
     * 
     * @param bindingType
     */
    public void setBindingType(java.lang.String bindingType) {
        this.bindingType = bindingType;
    }


    /**
     * Gets the serviceBuildSet value for this TpBindingEx.
     * 
     * @return serviceBuildSet
     */
    public java.lang.String getServiceBuildSet() {
        return serviceBuildSet;
    }


    /**
     * Sets the serviceBuildSet value for this TpBindingEx.
     * 
     * @param serviceBuildSet
     */
    public void setServiceBuildSet(java.lang.String serviceBuildSet) {
        this.serviceBuildSet = serviceBuildSet;
    }


    /**
     * Gets the port value for this TpBindingEx.
     * 
     * @return port
     */
    public java.lang.String getPort() {
        return port;
    }


    /**
     * Sets the port value for this TpBindingEx.
     * 
     * @param port
     */
    public void setPort(java.lang.String port) {
        this.port = port;
    }


    /**
     * Gets the protocol value for this TpBindingEx.
     * 
     * @return protocol
     */
    public java.lang.String getProtocol() {
        return protocol;
    }


    /**
     * Sets the protocol value for this TpBindingEx.
     * 
     * @param protocol
     */
    public void setProtocol(java.lang.String protocol) {
        this.protocol = protocol;
    }


    /**
     * Gets the ESDLBinding value for this TpBindingEx.
     * 
     * @return ESDLBinding
     */
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.ESDLBindingContents getESDLBinding() {
        return ESDLBinding;
    }


    /**
     * Sets the ESDLBinding value for this TpBindingEx.
     * 
     * @param ESDLBinding
     */
    public void setESDLBinding(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.ESDLBindingContents ESDLBinding) {
        this.ESDLBinding = ESDLBinding;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpBindingEx)) return false;
        TpBindingEx other = (TpBindingEx) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.service==null && other.getService()==null) || 
             (this.service!=null &&
              this.service.equals(other.getService()))) &&
            ((this.serviceType==null && other.getServiceType()==null) || 
             (this.serviceType!=null &&
              this.serviceType.equals(other.getServiceType()))) &&
            ((this.bindingType==null && other.getBindingType()==null) || 
             (this.bindingType!=null &&
              this.bindingType.equals(other.getBindingType()))) &&
            ((this.serviceBuildSet==null && other.getServiceBuildSet()==null) || 
             (this.serviceBuildSet!=null &&
              this.serviceBuildSet.equals(other.getServiceBuildSet()))) &&
            ((this.port==null && other.getPort()==null) || 
             (this.port!=null &&
              this.port.equals(other.getPort()))) &&
            ((this.protocol==null && other.getProtocol()==null) || 
             (this.protocol!=null &&
              this.protocol.equals(other.getProtocol()))) &&
            ((this.ESDLBinding==null && other.getESDLBinding()==null) || 
             (this.ESDLBinding!=null &&
              this.ESDLBinding.equals(other.getESDLBinding())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getService() != null) {
            _hashCode += getService().hashCode();
        }
        if (getServiceType() != null) {
            _hashCode += getServiceType().hashCode();
        }
        if (getBindingType() != null) {
            _hashCode += getBindingType().hashCode();
        }
        if (getServiceBuildSet() != null) {
            _hashCode += getServiceBuildSet().hashCode();
        }
        if (getPort() != null) {
            _hashCode += getPort().hashCode();
        }
        if (getProtocol() != null) {
            _hashCode += getProtocol().hashCode();
        }
        if (getESDLBinding() != null) {
            _hashCode += getESDLBinding().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TpBindingEx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "TpBindingEx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "Service"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "ServiceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bindingType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "BindingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceBuildSet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "ServiceBuildSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("port");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "Port"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocol");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "Protocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESDLBinding");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "ESDLBinding"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "ESDLBindingContents"));
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

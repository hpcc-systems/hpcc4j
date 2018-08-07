/**
 * ESDLBinding.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4;

public class ESDLBinding  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String espProcess;

    private java.lang.Integer port;

    private org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.PublishHistory history;

    public ESDLBinding() {
    }

    public ESDLBinding(
           java.lang.String id,
           java.lang.String espProcess,
           java.lang.Integer port,
           org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.PublishHistory history) {
           this.id = id;
           this.espProcess = espProcess;
           this.port = port;
           this.history = history;
    }


    /**
     * Gets the id value for this ESDLBinding.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this ESDLBinding.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the espProcess value for this ESDLBinding.
     * 
     * @return espProcess
     */
    public java.lang.String getEspProcess() {
        return espProcess;
    }


    /**
     * Sets the espProcess value for this ESDLBinding.
     * 
     * @param espProcess
     */
    public void setEspProcess(java.lang.String espProcess) {
        this.espProcess = espProcess;
    }


    /**
     * Gets the port value for this ESDLBinding.
     * 
     * @return port
     */
    public java.lang.Integer getPort() {
        return port;
    }


    /**
     * Sets the port value for this ESDLBinding.
     * 
     * @param port
     */
    public void setPort(java.lang.Integer port) {
        this.port = port;
    }


    /**
     * Gets the history value for this ESDLBinding.
     * 
     * @return history
     */
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.PublishHistory getHistory() {
        return history;
    }


    /**
     * Sets the history value for this ESDLBinding.
     * 
     * @param history
     */
    public void setHistory(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.PublishHistory history) {
        this.history = history;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ESDLBinding)) return false;
        ESDLBinding other = (ESDLBinding) obj;
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
            ((this.port==null && other.getPort()==null) || 
             (this.port!=null &&
              this.port.equals(other.getPort()))) &&
            ((this.history==null && other.getHistory()==null) || 
             (this.history!=null &&
              this.history.equals(other.getHistory())));
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
        if (getPort() != null) {
            _hashCode += getPort().hashCode();
        }
        if (getHistory() != null) {
            _hashCode += getHistory().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ESDLBinding.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "ESDLBinding"));
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
        elemField.setFieldName("port");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "Port"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("history");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "History"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "PublishHistory"));
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

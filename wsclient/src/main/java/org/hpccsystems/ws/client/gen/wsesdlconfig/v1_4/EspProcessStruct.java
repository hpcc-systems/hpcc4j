/**
 * EspProcessStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4;

public class EspProcessStruct  implements java.io.Serializable {
    private java.lang.String name;

    private org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.EspPortStruct[] ports;

    public EspProcessStruct() {
    }

    public EspProcessStruct(
           java.lang.String name,
           org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.EspPortStruct[] ports) {
           this.name = name;
           this.ports = ports;
    }


    /**
     * Gets the name value for this EspProcessStruct.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this EspProcessStruct.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the ports value for this EspProcessStruct.
     * 
     * @return ports
     */
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.EspPortStruct[] getPorts() {
        return ports;
    }


    /**
     * Sets the ports value for this EspProcessStruct.
     * 
     * @param ports
     */
    public void setPorts(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_4.EspPortStruct[] ports) {
        this.ports = ports;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EspProcessStruct)) return false;
        EspProcessStruct other = (EspProcessStruct) obj;
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
            ((this.ports==null && other.getPorts()==null) || 
             (this.ports!=null &&
              java.util.Arrays.equals(this.ports, other.getPorts())));
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
        if (getPorts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPorts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPorts(), i);
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
        new org.apache.axis.description.TypeDesc(EspProcessStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "EspProcessStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ports");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "Ports"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "EspPortStruct"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "Port"));
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

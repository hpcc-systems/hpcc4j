/**
 * ListDESDLEspBindingsResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive;

public class ListDESDLEspBindingsResp  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.ESPServerEx[] ESPServers;

    public ListDESDLEspBindingsResp() {
    }

    public ListDESDLEspBindingsResp(
           org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.ESPServerEx[] ESPServers) {
           this.ESPServers = ESPServers;
    }


    /**
     * Gets the ESPServers value for this ListDESDLEspBindingsResp.
     * 
     * @return ESPServers
     */
    public org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.ESPServerEx[] getESPServers() {
        return ESPServers;
    }


    /**
     * Sets the ESPServers value for this ListDESDLEspBindingsResp.
     * 
     * @param ESPServers
     */
    public void setESPServers(org.hpccsystems.ws.client.gen.wsesdlconfig.v1_3allverinclusive.ESPServerEx[] ESPServers) {
        this.ESPServers = ESPServers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListDESDLEspBindingsResp)) return false;
        ListDESDLEspBindingsResp other = (ListDESDLEspBindingsResp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ESPServers==null && other.getESPServers()==null) || 
             (this.ESPServers!=null &&
              java.util.Arrays.equals(this.ESPServers, other.getESPServers())));
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
        if (getESPServers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getESPServers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getESPServers(), i);
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
        new org.apache.axis.description.TypeDesc(ListDESDLEspBindingsResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", ">ListDESDLEspBindingsResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESPServers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "ESPServers"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "ESPServerEx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsesdlconfig", "ESPServer"));
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

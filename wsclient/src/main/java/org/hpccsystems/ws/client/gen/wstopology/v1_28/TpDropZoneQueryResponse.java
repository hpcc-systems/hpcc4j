/**
 * TpDropZoneQueryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wstopology.v1_28;

public class TpDropZoneQueryResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException exceptions;

    private org.hpccsystems.ws.client.gen.wstopology.v1_28.TpDropZone[] tpDropZones;

    public TpDropZoneQueryResponse() {
    }

    public TpDropZoneQueryResponse(
           org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException exceptions,
           org.hpccsystems.ws.client.gen.wstopology.v1_28.TpDropZone[] tpDropZones) {
           this.exceptions = exceptions;
           this.tpDropZones = tpDropZones;
    }


    /**
     * Gets the exceptions value for this TpDropZoneQueryResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this TpDropZoneQueryResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wstopology.v1_28.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the tpDropZones value for this TpDropZoneQueryResponse.
     * 
     * @return tpDropZones
     */
    public org.hpccsystems.ws.client.gen.wstopology.v1_28.TpDropZone[] getTpDropZones() {
        return tpDropZones;
    }


    /**
     * Sets the tpDropZones value for this TpDropZoneQueryResponse.
     * 
     * @param tpDropZones
     */
    public void setTpDropZones(org.hpccsystems.ws.client.gen.wstopology.v1_28.TpDropZone[] tpDropZones) {
        this.tpDropZones = tpDropZones;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpDropZoneQueryResponse)) return false;
        TpDropZoneQueryResponse other = (TpDropZoneQueryResponse) obj;
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
            ((this.tpDropZones==null && other.getTpDropZones()==null) || 
             (this.tpDropZones!=null &&
              java.util.Arrays.equals(this.tpDropZones, other.getTpDropZones())));
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
        if (getTpDropZones() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTpDropZones());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTpDropZones(), i);
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
        new org.apache.axis.description.TypeDesc(TpDropZoneQueryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpDropZoneQueryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tpDropZones");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpDropZones"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpDropZone"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpDropZone"));
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

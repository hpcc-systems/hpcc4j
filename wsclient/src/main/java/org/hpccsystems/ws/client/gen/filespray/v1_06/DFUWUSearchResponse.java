/**
 * DFUWUSearchResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.filespray.v1_06;

public class DFUWUSearchResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException exceptions;

    private java.lang.String[] clusterNames;

    public DFUWUSearchResponse() {
    }

    public DFUWUSearchResponse(
           org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException exceptions,
           java.lang.String[] clusterNames) {
           this.exceptions = exceptions;
           this.clusterNames = clusterNames;
    }


    /**
     * Gets the exceptions value for this DFUWUSearchResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this DFUWUSearchResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.filespray.v1_06.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the clusterNames value for this DFUWUSearchResponse.
     * 
     * @return clusterNames
     */
    public java.lang.String[] getClusterNames() {
        return clusterNames;
    }


    /**
     * Sets the clusterNames value for this DFUWUSearchResponse.
     * 
     * @param clusterNames
     */
    public void setClusterNames(java.lang.String[] clusterNames) {
        this.clusterNames = clusterNames;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DFUWUSearchResponse)) return false;
        DFUWUSearchResponse other = (DFUWUSearchResponse) obj;
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
            ((this.clusterNames==null && other.getClusterNames()==null) || 
             (this.clusterNames!=null &&
              java.util.Arrays.equals(this.clusterNames, other.getClusterNames())));
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
        if (getClusterNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClusterNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClusterNames(), i);
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
        new org.apache.axis.description.TypeDesc(DFUWUSearchResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", ">DFUWUSearchResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterNames");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ClusterNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ClusterName"));
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

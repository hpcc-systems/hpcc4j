/**
 * TpListTargetClustersResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wstopology.v1_19;

public class TpListTargetClustersResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wstopology.v1_19.ArrayOfEspException exceptions;

    private org.hpccsystems.ws.client.gen.wstopology.v1_19.TpClusterNameType[] targetClusters;

    public TpListTargetClustersResponse() {
    }

    public TpListTargetClustersResponse(
           org.hpccsystems.ws.client.gen.wstopology.v1_19.ArrayOfEspException exceptions,
           org.hpccsystems.ws.client.gen.wstopology.v1_19.TpClusterNameType[] targetClusters) {
           this.exceptions = exceptions;
           this.targetClusters = targetClusters;
    }


    /**
     * Gets the exceptions value for this TpListTargetClustersResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wstopology.v1_19.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this TpListTargetClustersResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wstopology.v1_19.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the targetClusters value for this TpListTargetClustersResponse.
     * 
     * @return targetClusters
     */
    public org.hpccsystems.ws.client.gen.wstopology.v1_19.TpClusterNameType[] getTargetClusters() {
        return targetClusters;
    }


    /**
     * Sets the targetClusters value for this TpListTargetClustersResponse.
     * 
     * @param targetClusters
     */
    public void setTargetClusters(org.hpccsystems.ws.client.gen.wstopology.v1_19.TpClusterNameType[] targetClusters) {
        this.targetClusters = targetClusters;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TpListTargetClustersResponse)) return false;
        TpListTargetClustersResponse other = (TpListTargetClustersResponse) obj;
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
            ((this.targetClusters==null && other.getTargetClusters()==null) || 
             (this.targetClusters!=null &&
              java.util.Arrays.equals(this.targetClusters, other.getTargetClusters())));
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
        if (getTargetClusters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTargetClusters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTargetClusters(), i);
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
        new org.apache.axis.description.TypeDesc(TpListTargetClustersResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", ">TpListTargetClustersResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetClusters");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TargetClusters"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpClusterNameType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpClusterNameType"));
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

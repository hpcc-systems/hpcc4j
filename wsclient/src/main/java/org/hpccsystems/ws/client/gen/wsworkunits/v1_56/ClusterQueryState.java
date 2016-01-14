/**
 * ClusterQueryState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_56;

public class ClusterQueryState  implements java.io.Serializable {
    private java.lang.String cluster;

    private java.lang.String state;

    private java.lang.String errors;

    private java.lang.Boolean mixedNodeStates;

    public ClusterQueryState() {
    }

    public ClusterQueryState(
           java.lang.String cluster,
           java.lang.String state,
           java.lang.String errors,
           java.lang.Boolean mixedNodeStates) {
           this.cluster = cluster;
           this.state = state;
           this.errors = errors;
           this.mixedNodeStates = mixedNodeStates;
    }


    /**
     * Gets the cluster value for this ClusterQueryState.
     * 
     * @return cluster
     */
    public java.lang.String getCluster() {
        return cluster;
    }


    /**
     * Sets the cluster value for this ClusterQueryState.
     * 
     * @param cluster
     */
    public void setCluster(java.lang.String cluster) {
        this.cluster = cluster;
    }


    /**
     * Gets the state value for this ClusterQueryState.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this ClusterQueryState.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the errors value for this ClusterQueryState.
     * 
     * @return errors
     */
    public java.lang.String getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this ClusterQueryState.
     * 
     * @param errors
     */
    public void setErrors(java.lang.String errors) {
        this.errors = errors;
    }


    /**
     * Gets the mixedNodeStates value for this ClusterQueryState.
     * 
     * @return mixedNodeStates
     */
    public java.lang.Boolean getMixedNodeStates() {
        return mixedNodeStates;
    }


    /**
     * Sets the mixedNodeStates value for this ClusterQueryState.
     * 
     * @param mixedNodeStates
     */
    public void setMixedNodeStates(java.lang.Boolean mixedNodeStates) {
        this.mixedNodeStates = mixedNodeStates;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClusterQueryState)) return false;
        ClusterQueryState other = (ClusterQueryState) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cluster==null && other.getCluster()==null) || 
             (this.cluster!=null &&
              this.cluster.equals(other.getCluster()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              this.errors.equals(other.getErrors()))) &&
            ((this.mixedNodeStates==null && other.getMixedNodeStates()==null) || 
             (this.mixedNodeStates!=null &&
              this.mixedNodeStates.equals(other.getMixedNodeStates())));
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
        if (getCluster() != null) {
            _hashCode += getCluster().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getErrors() != null) {
            _hashCode += getErrors().hashCode();
        }
        if (getMixedNodeStates() != null) {
            _hashCode += getMixedNodeStates().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClusterQueryState.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ClusterQueryState"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cluster");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Cluster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mixedNodeStates");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "MixedNodeStates"));
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

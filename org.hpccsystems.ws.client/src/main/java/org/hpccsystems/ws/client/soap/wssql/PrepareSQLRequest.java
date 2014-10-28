/**
 * PrepareSQLRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.soap.wssql;

public class PrepareSQLRequest  implements java.io.Serializable {
    private java.lang.String sqlText;

    private java.lang.String targetCluster;

    private java.lang.String targetQuerySet;

    private java.lang.Integer wait;

    public PrepareSQLRequest() {
    }

    public PrepareSQLRequest(
           java.lang.String sqlText,
           java.lang.String targetCluster,
           java.lang.String targetQuerySet,
           java.lang.Integer wait) {
           this.sqlText = sqlText;
           this.targetCluster = targetCluster;
           this.targetQuerySet = targetQuerySet;
           this.wait = wait;
    }


    /**
     * Gets the sqlText value for this PrepareSQLRequest.
     * 
     * @return sqlText
     */
    public java.lang.String getSqlText() {
        return sqlText;
    }


    /**
     * Sets the sqlText value for this PrepareSQLRequest.
     * 
     * @param sqlText
     */
    public void setSqlText(java.lang.String sqlText) {
        this.sqlText = sqlText;
    }


    /**
     * Gets the targetCluster value for this PrepareSQLRequest.
     * 
     * @return targetCluster
     */
    public java.lang.String getTargetCluster() {
        return targetCluster;
    }


    /**
     * Sets the targetCluster value for this PrepareSQLRequest.
     * 
     * @param targetCluster
     */
    public void setTargetCluster(java.lang.String targetCluster) {
        this.targetCluster = targetCluster;
    }


    /**
     * Gets the targetQuerySet value for this PrepareSQLRequest.
     * 
     * @return targetQuerySet
     */
    public java.lang.String getTargetQuerySet() {
        return targetQuerySet;
    }


    /**
     * Sets the targetQuerySet value for this PrepareSQLRequest.
     * 
     * @param targetQuerySet
     */
    public void setTargetQuerySet(java.lang.String targetQuerySet) {
        this.targetQuerySet = targetQuerySet;
    }


    /**
     * Gets the wait value for this PrepareSQLRequest.
     * 
     * @return wait
     */
    public java.lang.Integer getWait() {
        return wait;
    }


    /**
     * Sets the wait value for this PrepareSQLRequest.
     * 
     * @param wait
     */
    public void setWait(java.lang.Integer wait) {
        this.wait = wait;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrepareSQLRequest)) return false;
        PrepareSQLRequest other = (PrepareSQLRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sqlText==null && other.getSqlText()==null) || 
             (this.sqlText!=null &&
              this.sqlText.equals(other.getSqlText()))) &&
            ((this.targetCluster==null && other.getTargetCluster()==null) || 
             (this.targetCluster!=null &&
              this.targetCluster.equals(other.getTargetCluster()))) &&
            ((this.targetQuerySet==null && other.getTargetQuerySet()==null) || 
             (this.targetQuerySet!=null &&
              this.targetQuerySet.equals(other.getTargetQuerySet()))) &&
            ((this.wait==null && other.getWait()==null) || 
             (this.wait!=null &&
              this.wait.equals(other.getWait())));
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
        if (getSqlText() != null) {
            _hashCode += getSqlText().hashCode();
        }
        if (getTargetCluster() != null) {
            _hashCode += getTargetCluster().hashCode();
        }
        if (getTargetQuerySet() != null) {
            _hashCode += getTargetQuerySet().hashCode();
        }
        if (getWait() != null) {
            _hashCode += getWait().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrepareSQLRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">PrepareSQLRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sqlText");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "SqlText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetCluster");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "TargetCluster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetQuerySet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "TargetQuerySet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wait");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Wait"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

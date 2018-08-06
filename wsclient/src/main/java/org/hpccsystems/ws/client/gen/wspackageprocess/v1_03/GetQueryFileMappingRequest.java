/**
 * GetQueryFileMappingRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wspackageprocess.v1_03;

public class GetQueryFileMappingRequest  implements java.io.Serializable {
    private java.lang.String target;

    private java.lang.String PMID;

    private java.lang.String queryName;

    private java.lang.Boolean globalScope;

    public GetQueryFileMappingRequest() {
    }

    public GetQueryFileMappingRequest(
           java.lang.String target,
           java.lang.String PMID,
           java.lang.String queryName,
           java.lang.Boolean globalScope) {
           this.target = target;
           this.PMID = PMID;
           this.queryName = queryName;
           this.globalScope = globalScope;
    }


    /**
     * Gets the target value for this GetQueryFileMappingRequest.
     * 
     * @return target
     */
    public java.lang.String getTarget() {
        return target;
    }


    /**
     * Sets the target value for this GetQueryFileMappingRequest.
     * 
     * @param target
     */
    public void setTarget(java.lang.String target) {
        this.target = target;
    }


    /**
     * Gets the PMID value for this GetQueryFileMappingRequest.
     * 
     * @return PMID
     */
    public java.lang.String getPMID() {
        return PMID;
    }


    /**
     * Sets the PMID value for this GetQueryFileMappingRequest.
     * 
     * @param PMID
     */
    public void setPMID(java.lang.String PMID) {
        this.PMID = PMID;
    }


    /**
     * Gets the queryName value for this GetQueryFileMappingRequest.
     * 
     * @return queryName
     */
    public java.lang.String getQueryName() {
        return queryName;
    }


    /**
     * Sets the queryName value for this GetQueryFileMappingRequest.
     * 
     * @param queryName
     */
    public void setQueryName(java.lang.String queryName) {
        this.queryName = queryName;
    }


    /**
     * Gets the globalScope value for this GetQueryFileMappingRequest.
     * 
     * @return globalScope
     */
    public java.lang.Boolean getGlobalScope() {
        return globalScope;
    }


    /**
     * Sets the globalScope value for this GetQueryFileMappingRequest.
     * 
     * @param globalScope
     */
    public void setGlobalScope(java.lang.Boolean globalScope) {
        this.globalScope = globalScope;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetQueryFileMappingRequest)) return false;
        GetQueryFileMappingRequest other = (GetQueryFileMappingRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.target==null && other.getTarget()==null) || 
             (this.target!=null &&
              this.target.equals(other.getTarget()))) &&
            ((this.PMID==null && other.getPMID()==null) || 
             (this.PMID!=null &&
              this.PMID.equals(other.getPMID()))) &&
            ((this.queryName==null && other.getQueryName()==null) || 
             (this.queryName!=null &&
              this.queryName.equals(other.getQueryName()))) &&
            ((this.globalScope==null && other.getGlobalScope()==null) || 
             (this.globalScope!=null &&
              this.globalScope.equals(other.getGlobalScope())));
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
        if (getTarget() != null) {
            _hashCode += getTarget().hashCode();
        }
        if (getPMID() != null) {
            _hashCode += getPMID().hashCode();
        }
        if (getQueryName() != null) {
            _hashCode += getQueryName().hashCode();
        }
        if (getGlobalScope() != null) {
            _hashCode += getGlobalScope().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetQueryFileMappingRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", ">GetQueryFileMappingRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "Target"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PMID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "PMID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "QueryName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalScope");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "GlobalScope"));
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

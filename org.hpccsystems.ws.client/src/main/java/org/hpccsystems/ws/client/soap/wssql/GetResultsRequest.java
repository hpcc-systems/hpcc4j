/**
 * GetResultsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.soap.wssql;

public class GetResultsRequest  implements java.io.Serializable {
    private java.lang.String wuId;

    private java.lang.Boolean suppressXmlSchema;

    private java.lang.Integer resultWindowStart;

    private java.lang.Integer resultWindowCount;

    public GetResultsRequest() {
    }

    public GetResultsRequest(
           java.lang.String wuId,
           java.lang.Boolean suppressXmlSchema,
           java.lang.Integer resultWindowStart,
           java.lang.Integer resultWindowCount) {
           this.wuId = wuId;
           this.suppressXmlSchema = suppressXmlSchema;
           this.resultWindowStart = resultWindowStart;
           this.resultWindowCount = resultWindowCount;
    }


    /**
     * Gets the wuId value for this GetResultsRequest.
     * 
     * @return wuId
     */
    public java.lang.String getWuId() {
        return wuId;
    }


    /**
     * Sets the wuId value for this GetResultsRequest.
     * 
     * @param wuId
     */
    public void setWuId(java.lang.String wuId) {
        this.wuId = wuId;
    }


    /**
     * Gets the suppressXmlSchema value for this GetResultsRequest.
     * 
     * @return suppressXmlSchema
     */
    public java.lang.Boolean getSuppressXmlSchema() {
        return suppressXmlSchema;
    }


    /**
     * Sets the suppressXmlSchema value for this GetResultsRequest.
     * 
     * @param suppressXmlSchema
     */
    public void setSuppressXmlSchema(java.lang.Boolean suppressXmlSchema) {
        this.suppressXmlSchema = suppressXmlSchema;
    }


    /**
     * Gets the resultWindowStart value for this GetResultsRequest.
     * 
     * @return resultWindowStart
     */
    public java.lang.Integer getResultWindowStart() {
        return resultWindowStart;
    }


    /**
     * Sets the resultWindowStart value for this GetResultsRequest.
     * 
     * @param resultWindowStart
     */
    public void setResultWindowStart(java.lang.Integer resultWindowStart) {
        this.resultWindowStart = resultWindowStart;
    }


    /**
     * Gets the resultWindowCount value for this GetResultsRequest.
     * 
     * @return resultWindowCount
     */
    public java.lang.Integer getResultWindowCount() {
        return resultWindowCount;
    }


    /**
     * Sets the resultWindowCount value for this GetResultsRequest.
     * 
     * @param resultWindowCount
     */
    public void setResultWindowCount(java.lang.Integer resultWindowCount) {
        this.resultWindowCount = resultWindowCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetResultsRequest)) return false;
        GetResultsRequest other = (GetResultsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wuId==null && other.getWuId()==null) || 
             (this.wuId!=null &&
              this.wuId.equals(other.getWuId()))) &&
            ((this.suppressXmlSchema==null && other.getSuppressXmlSchema()==null) || 
             (this.suppressXmlSchema!=null &&
              this.suppressXmlSchema.equals(other.getSuppressXmlSchema()))) &&
            ((this.resultWindowStart==null && other.getResultWindowStart()==null) || 
             (this.resultWindowStart!=null &&
              this.resultWindowStart.equals(other.getResultWindowStart()))) &&
            ((this.resultWindowCount==null && other.getResultWindowCount()==null) || 
             (this.resultWindowCount!=null &&
              this.resultWindowCount.equals(other.getResultWindowCount())));
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
        if (getWuId() != null) {
            _hashCode += getWuId().hashCode();
        }
        if (getSuppressXmlSchema() != null) {
            _hashCode += getSuppressXmlSchema().hashCode();
        }
        if (getResultWindowStart() != null) {
            _hashCode += getResultWindowStart().hashCode();
        }
        if (getResultWindowCount() != null) {
            _hashCode += getResultWindowCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetResultsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">GetResultsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wuId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "WuId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suppressXmlSchema");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "SuppressXmlSchema"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultWindowStart");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ResultWindowStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultWindowCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ResultWindowCount"));
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

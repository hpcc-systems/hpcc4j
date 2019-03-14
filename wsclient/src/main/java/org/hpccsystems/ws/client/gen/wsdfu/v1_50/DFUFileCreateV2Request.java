/**
 * DFUFileCreateV2Request.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsdfu.v1_50;

public class DFUFileCreateV2Request  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String cluster;

    private org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUFileType type;

    private java.lang.String ECLRecordDefinition;

    private java.lang.String requestId;

    private java.lang.Integer expirySeconds;

    private java.lang.Boolean returnTextResponse;

    private java.lang.Boolean compressed;

    public DFUFileCreateV2Request() {
    }

    public DFUFileCreateV2Request(
           java.lang.String name,
           java.lang.String cluster,
           org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUFileType type,
           java.lang.String ECLRecordDefinition,
           java.lang.String requestId,
           java.lang.Integer expirySeconds,
           java.lang.Boolean returnTextResponse,
           java.lang.Boolean compressed) {
           this.name = name;
           this.cluster = cluster;
           this.type = type;
           this.ECLRecordDefinition = ECLRecordDefinition;
           this.requestId = requestId;
           this.expirySeconds = expirySeconds;
           this.returnTextResponse = returnTextResponse;
           this.compressed = compressed;
    }


    /**
     * Gets the name value for this DFUFileCreateV2Request.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DFUFileCreateV2Request.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the cluster value for this DFUFileCreateV2Request.
     * 
     * @return cluster
     */
    public java.lang.String getCluster() {
        return cluster;
    }


    /**
     * Sets the cluster value for this DFUFileCreateV2Request.
     * 
     * @param cluster
     */
    public void setCluster(java.lang.String cluster) {
        this.cluster = cluster;
    }


    /**
     * Gets the type value for this DFUFileCreateV2Request.
     * 
     * @return type
     */
    public org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUFileType getType() {
        return type;
    }


    /**
     * Sets the type value for this DFUFileCreateV2Request.
     * 
     * @param type
     */
    public void setType(org.hpccsystems.ws.client.gen.wsdfu.v1_50.DFUFileType type) {
        this.type = type;
    }


    /**
     * Gets the ECLRecordDefinition value for this DFUFileCreateV2Request.
     * 
     * @return ECLRecordDefinition
     */
    public java.lang.String getECLRecordDefinition() {
        return ECLRecordDefinition;
    }


    /**
     * Sets the ECLRecordDefinition value for this DFUFileCreateV2Request.
     * 
     * @param ECLRecordDefinition
     */
    public void setECLRecordDefinition(java.lang.String ECLRecordDefinition) {
        this.ECLRecordDefinition = ECLRecordDefinition;
    }


    /**
     * Gets the requestId value for this DFUFileCreateV2Request.
     * 
     * @return requestId
     */
    public java.lang.String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this DFUFileCreateV2Request.
     * 
     * @param requestId
     */
    public void setRequestId(java.lang.String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the expirySeconds value for this DFUFileCreateV2Request.
     * 
     * @return expirySeconds
     */
    public java.lang.Integer getExpirySeconds() {
        return expirySeconds;
    }


    /**
     * Sets the expirySeconds value for this DFUFileCreateV2Request.
     * 
     * @param expirySeconds
     */
    public void setExpirySeconds(java.lang.Integer expirySeconds) {
        this.expirySeconds = expirySeconds;
    }


    /**
     * Gets the returnTextResponse value for this DFUFileCreateV2Request.
     * 
     * @return returnTextResponse
     */
    public java.lang.Boolean getReturnTextResponse() {
        return returnTextResponse;
    }


    /**
     * Sets the returnTextResponse value for this DFUFileCreateV2Request.
     * 
     * @param returnTextResponse
     */
    public void setReturnTextResponse(java.lang.Boolean returnTextResponse) {
        this.returnTextResponse = returnTextResponse;
    }


    /**
     * Gets the compressed value for this DFUFileCreateV2Request.
     * 
     * @return compressed
     */
    public java.lang.Boolean getCompressed() {
        return compressed;
    }


    /**
     * Sets the compressed value for this DFUFileCreateV2Request.
     * 
     * @param compressed
     */
    public void setCompressed(java.lang.Boolean compressed) {
        this.compressed = compressed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DFUFileCreateV2Request)) return false;
        DFUFileCreateV2Request other = (DFUFileCreateV2Request) obj;
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
            ((this.cluster==null && other.getCluster()==null) || 
             (this.cluster!=null &&
              this.cluster.equals(other.getCluster()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.ECLRecordDefinition==null && other.getECLRecordDefinition()==null) || 
             (this.ECLRecordDefinition!=null &&
              this.ECLRecordDefinition.equals(other.getECLRecordDefinition()))) &&
            ((this.requestId==null && other.getRequestId()==null) || 
             (this.requestId!=null &&
              this.requestId.equals(other.getRequestId()))) &&
            ((this.expirySeconds==null && other.getExpirySeconds()==null) || 
             (this.expirySeconds!=null &&
              this.expirySeconds.equals(other.getExpirySeconds()))) &&
            ((this.returnTextResponse==null && other.getReturnTextResponse()==null) || 
             (this.returnTextResponse!=null &&
              this.returnTextResponse.equals(other.getReturnTextResponse()))) &&
            ((this.compressed==null && other.getCompressed()==null) || 
             (this.compressed!=null &&
              this.compressed.equals(other.getCompressed())));
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
        if (getCluster() != null) {
            _hashCode += getCluster().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getECLRecordDefinition() != null) {
            _hashCode += getECLRecordDefinition().hashCode();
        }
        if (getRequestId() != null) {
            _hashCode += getRequestId().hashCode();
        }
        if (getExpirySeconds() != null) {
            _hashCode += getExpirySeconds().hashCode();
        }
        if (getReturnTextResponse() != null) {
            _hashCode += getReturnTextResponse().hashCode();
        }
        if (getCompressed() != null) {
            _hashCode += getCompressed().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DFUFileCreateV2Request.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUFileCreateV2Request"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cluster");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Cluster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFileType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ECLRecordDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ECLRecordDefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "RequestId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirySeconds");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ExpirySeconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnTextResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ReturnTextResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compressed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Compressed"));
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

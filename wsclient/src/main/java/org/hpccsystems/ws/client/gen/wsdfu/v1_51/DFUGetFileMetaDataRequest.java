/**
 * DFUGetFileMetaDataRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsdfu.v1_51;

public class DFUGetFileMetaDataRequest  implements java.io.Serializable {
    private java.lang.String logicalFileName;

    private java.lang.String clusterName;

    private java.lang.Boolean includeXmlSchema;

    private java.lang.Boolean addHeaderInXmlSchema;

    private java.lang.Boolean includeXmlXPathSchema;

    private java.lang.Boolean addHeaderInXmlXPathSchema;

    public DFUGetFileMetaDataRequest() {
    }

    public DFUGetFileMetaDataRequest(
           java.lang.String logicalFileName,
           java.lang.String clusterName,
           java.lang.Boolean includeXmlSchema,
           java.lang.Boolean addHeaderInXmlSchema,
           java.lang.Boolean includeXmlXPathSchema,
           java.lang.Boolean addHeaderInXmlXPathSchema) {
           this.logicalFileName = logicalFileName;
           this.clusterName = clusterName;
           this.includeXmlSchema = includeXmlSchema;
           this.addHeaderInXmlSchema = addHeaderInXmlSchema;
           this.includeXmlXPathSchema = includeXmlXPathSchema;
           this.addHeaderInXmlXPathSchema = addHeaderInXmlXPathSchema;
    }


    /**
     * Gets the logicalFileName value for this DFUGetFileMetaDataRequest.
     * 
     * @return logicalFileName
     */
    public java.lang.String getLogicalFileName() {
        return logicalFileName;
    }


    /**
     * Sets the logicalFileName value for this DFUGetFileMetaDataRequest.
     * 
     * @param logicalFileName
     */
    public void setLogicalFileName(java.lang.String logicalFileName) {
        this.logicalFileName = logicalFileName;
    }


    /**
     * Gets the clusterName value for this DFUGetFileMetaDataRequest.
     * 
     * @return clusterName
     */
    public java.lang.String getClusterName() {
        return clusterName;
    }


    /**
     * Sets the clusterName value for this DFUGetFileMetaDataRequest.
     * 
     * @param clusterName
     */
    public void setClusterName(java.lang.String clusterName) {
        this.clusterName = clusterName;
    }


    /**
     * Gets the includeXmlSchema value for this DFUGetFileMetaDataRequest.
     * 
     * @return includeXmlSchema
     */
    public java.lang.Boolean getIncludeXmlSchema() {
        return includeXmlSchema;
    }


    /**
     * Sets the includeXmlSchema value for this DFUGetFileMetaDataRequest.
     * 
     * @param includeXmlSchema
     */
    public void setIncludeXmlSchema(java.lang.Boolean includeXmlSchema) {
        this.includeXmlSchema = includeXmlSchema;
    }


    /**
     * Gets the addHeaderInXmlSchema value for this DFUGetFileMetaDataRequest.
     * 
     * @return addHeaderInXmlSchema
     */
    public java.lang.Boolean getAddHeaderInXmlSchema() {
        return addHeaderInXmlSchema;
    }


    /**
     * Sets the addHeaderInXmlSchema value for this DFUGetFileMetaDataRequest.
     * 
     * @param addHeaderInXmlSchema
     */
    public void setAddHeaderInXmlSchema(java.lang.Boolean addHeaderInXmlSchema) {
        this.addHeaderInXmlSchema = addHeaderInXmlSchema;
    }


    /**
     * Gets the includeXmlXPathSchema value for this DFUGetFileMetaDataRequest.
     * 
     * @return includeXmlXPathSchema
     */
    public java.lang.Boolean getIncludeXmlXPathSchema() {
        return includeXmlXPathSchema;
    }


    /**
     * Sets the includeXmlXPathSchema value for this DFUGetFileMetaDataRequest.
     * 
     * @param includeXmlXPathSchema
     */
    public void setIncludeXmlXPathSchema(java.lang.Boolean includeXmlXPathSchema) {
        this.includeXmlXPathSchema = includeXmlXPathSchema;
    }


    /**
     * Gets the addHeaderInXmlXPathSchema value for this DFUGetFileMetaDataRequest.
     * 
     * @return addHeaderInXmlXPathSchema
     */
    public java.lang.Boolean getAddHeaderInXmlXPathSchema() {
        return addHeaderInXmlXPathSchema;
    }


    /**
     * Sets the addHeaderInXmlXPathSchema value for this DFUGetFileMetaDataRequest.
     * 
     * @param addHeaderInXmlXPathSchema
     */
    public void setAddHeaderInXmlXPathSchema(java.lang.Boolean addHeaderInXmlXPathSchema) {
        this.addHeaderInXmlXPathSchema = addHeaderInXmlXPathSchema;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DFUGetFileMetaDataRequest)) return false;
        DFUGetFileMetaDataRequest other = (DFUGetFileMetaDataRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.logicalFileName==null && other.getLogicalFileName()==null) || 
             (this.logicalFileName!=null &&
              this.logicalFileName.equals(other.getLogicalFileName()))) &&
            ((this.clusterName==null && other.getClusterName()==null) || 
             (this.clusterName!=null &&
              this.clusterName.equals(other.getClusterName()))) &&
            ((this.includeXmlSchema==null && other.getIncludeXmlSchema()==null) || 
             (this.includeXmlSchema!=null &&
              this.includeXmlSchema.equals(other.getIncludeXmlSchema()))) &&
            ((this.addHeaderInXmlSchema==null && other.getAddHeaderInXmlSchema()==null) || 
             (this.addHeaderInXmlSchema!=null &&
              this.addHeaderInXmlSchema.equals(other.getAddHeaderInXmlSchema()))) &&
            ((this.includeXmlXPathSchema==null && other.getIncludeXmlXPathSchema()==null) || 
             (this.includeXmlXPathSchema!=null &&
              this.includeXmlXPathSchema.equals(other.getIncludeXmlXPathSchema()))) &&
            ((this.addHeaderInXmlXPathSchema==null && other.getAddHeaderInXmlXPathSchema()==null) || 
             (this.addHeaderInXmlXPathSchema!=null &&
              this.addHeaderInXmlXPathSchema.equals(other.getAddHeaderInXmlXPathSchema())));
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
        if (getLogicalFileName() != null) {
            _hashCode += getLogicalFileName().hashCode();
        }
        if (getClusterName() != null) {
            _hashCode += getClusterName().hashCode();
        }
        if (getIncludeXmlSchema() != null) {
            _hashCode += getIncludeXmlSchema().hashCode();
        }
        if (getAddHeaderInXmlSchema() != null) {
            _hashCode += getAddHeaderInXmlSchema().hashCode();
        }
        if (getIncludeXmlXPathSchema() != null) {
            _hashCode += getIncludeXmlXPathSchema().hashCode();
        }
        if (getAddHeaderInXmlXPathSchema() != null) {
            _hashCode += getAddHeaderInXmlXPathSchema().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DFUGetFileMetaDataRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUGetFileMetaDataRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logicalFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "LogicalFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ClusterName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeXmlSchema");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "IncludeXmlSchema"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addHeaderInXmlSchema");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "AddHeaderInXmlSchema"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeXmlXPathSchema");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "IncludeXmlXPathSchema"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addHeaderInXmlXPathSchema");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "AddHeaderInXmlXPathSchema"));
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

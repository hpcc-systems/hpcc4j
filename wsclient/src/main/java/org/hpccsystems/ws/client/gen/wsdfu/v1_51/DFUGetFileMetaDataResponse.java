/**
 * DFUGetFileMetaDataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsdfu.v1_51;

public class DFUGetFileMetaDataResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException exceptions;

    private java.lang.Integer totalColumnCount;

    private java.lang.Integer keyedColumnCount;

    private org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUDataColumn[] dataColumns;

    private java.lang.String xmlSchema;

    private java.lang.String xmlXPathSchema;

    private java.lang.Long totalResultRows;

    public DFUGetFileMetaDataResponse() {
    }

    public DFUGetFileMetaDataResponse(
           org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException exceptions,
           java.lang.Integer totalColumnCount,
           java.lang.Integer keyedColumnCount,
           org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUDataColumn[] dataColumns,
           java.lang.String xmlSchema,
           java.lang.String xmlXPathSchema,
           java.lang.Long totalResultRows) {
           this.exceptions = exceptions;
           this.totalColumnCount = totalColumnCount;
           this.keyedColumnCount = keyedColumnCount;
           this.dataColumns = dataColumns;
           this.xmlSchema = xmlSchema;
           this.xmlXPathSchema = xmlXPathSchema;
           this.totalResultRows = totalResultRows;
    }


    /**
     * Gets the exceptions value for this DFUGetFileMetaDataResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this DFUGetFileMetaDataResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the totalColumnCount value for this DFUGetFileMetaDataResponse.
     * 
     * @return totalColumnCount
     */
    public java.lang.Integer getTotalColumnCount() {
        return totalColumnCount;
    }


    /**
     * Sets the totalColumnCount value for this DFUGetFileMetaDataResponse.
     * 
     * @param totalColumnCount
     */
    public void setTotalColumnCount(java.lang.Integer totalColumnCount) {
        this.totalColumnCount = totalColumnCount;
    }


    /**
     * Gets the keyedColumnCount value for this DFUGetFileMetaDataResponse.
     * 
     * @return keyedColumnCount
     */
    public java.lang.Integer getKeyedColumnCount() {
        return keyedColumnCount;
    }


    /**
     * Sets the keyedColumnCount value for this DFUGetFileMetaDataResponse.
     * 
     * @param keyedColumnCount
     */
    public void setKeyedColumnCount(java.lang.Integer keyedColumnCount) {
        this.keyedColumnCount = keyedColumnCount;
    }


    /**
     * Gets the dataColumns value for this DFUGetFileMetaDataResponse.
     * 
     * @return dataColumns
     */
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUDataColumn[] getDataColumns() {
        return dataColumns;
    }


    /**
     * Sets the dataColumns value for this DFUGetFileMetaDataResponse.
     * 
     * @param dataColumns
     */
    public void setDataColumns(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUDataColumn[] dataColumns) {
        this.dataColumns = dataColumns;
    }


    /**
     * Gets the xmlSchema value for this DFUGetFileMetaDataResponse.
     * 
     * @return xmlSchema
     */
    public java.lang.String getXmlSchema() {
        return xmlSchema;
    }


    /**
     * Sets the xmlSchema value for this DFUGetFileMetaDataResponse.
     * 
     * @param xmlSchema
     */
    public void setXmlSchema(java.lang.String xmlSchema) {
        this.xmlSchema = xmlSchema;
    }


    /**
     * Gets the xmlXPathSchema value for this DFUGetFileMetaDataResponse.
     * 
     * @return xmlXPathSchema
     */
    public java.lang.String getXmlXPathSchema() {
        return xmlXPathSchema;
    }


    /**
     * Sets the xmlXPathSchema value for this DFUGetFileMetaDataResponse.
     * 
     * @param xmlXPathSchema
     */
    public void setXmlXPathSchema(java.lang.String xmlXPathSchema) {
        this.xmlXPathSchema = xmlXPathSchema;
    }


    /**
     * Gets the totalResultRows value for this DFUGetFileMetaDataResponse.
     * 
     * @return totalResultRows
     */
    public java.lang.Long getTotalResultRows() {
        return totalResultRows;
    }


    /**
     * Sets the totalResultRows value for this DFUGetFileMetaDataResponse.
     * 
     * @param totalResultRows
     */
    public void setTotalResultRows(java.lang.Long totalResultRows) {
        this.totalResultRows = totalResultRows;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DFUGetFileMetaDataResponse)) return false;
        DFUGetFileMetaDataResponse other = (DFUGetFileMetaDataResponse) obj;
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
            ((this.totalColumnCount==null && other.getTotalColumnCount()==null) || 
             (this.totalColumnCount!=null &&
              this.totalColumnCount.equals(other.getTotalColumnCount()))) &&
            ((this.keyedColumnCount==null && other.getKeyedColumnCount()==null) || 
             (this.keyedColumnCount!=null &&
              this.keyedColumnCount.equals(other.getKeyedColumnCount()))) &&
            ((this.dataColumns==null && other.getDataColumns()==null) || 
             (this.dataColumns!=null &&
              java.util.Arrays.equals(this.dataColumns, other.getDataColumns()))) &&
            ((this.xmlSchema==null && other.getXmlSchema()==null) || 
             (this.xmlSchema!=null &&
              this.xmlSchema.equals(other.getXmlSchema()))) &&
            ((this.xmlXPathSchema==null && other.getXmlXPathSchema()==null) || 
             (this.xmlXPathSchema!=null &&
              this.xmlXPathSchema.equals(other.getXmlXPathSchema()))) &&
            ((this.totalResultRows==null && other.getTotalResultRows()==null) || 
             (this.totalResultRows!=null &&
              this.totalResultRows.equals(other.getTotalResultRows())));
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
        if (getTotalColumnCount() != null) {
            _hashCode += getTotalColumnCount().hashCode();
        }
        if (getKeyedColumnCount() != null) {
            _hashCode += getKeyedColumnCount().hashCode();
        }
        if (getDataColumns() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDataColumns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDataColumns(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlSchema() != null) {
            _hashCode += getXmlSchema().hashCode();
        }
        if (getXmlXPathSchema() != null) {
            _hashCode += getXmlXPathSchema().hashCode();
        }
        if (getTotalResultRows() != null) {
            _hashCode += getTotalResultRows().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DFUGetFileMetaDataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUGetFileMetaDataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalColumnCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "TotalColumnCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyedColumnCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "KeyedColumnCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataColumns");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DataColumns"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlSchema");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "XmlSchema"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlXPathSchema");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "XmlXPathSchema"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalResultRows");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "TotalResultRows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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

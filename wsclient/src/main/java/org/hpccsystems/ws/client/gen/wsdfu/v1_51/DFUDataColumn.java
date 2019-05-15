/**
 * DFUDataColumn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsdfu.v1_51;

public class DFUDataColumn  implements java.io.Serializable {
    private java.lang.Integer columnID;

    private java.lang.String columnLabel;

    private java.lang.String columnType;

    private java.lang.String columnValue;

    private java.lang.Integer columnSize;

    private java.lang.Integer maxSize;

    private java.lang.String columnEclType;

    private java.lang.Integer columnRawSize;

    private java.lang.Boolean isNaturalColumn;

    private java.lang.Boolean isKeyedColumn;

    private org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUDataColumn[] dataColumns;

    public DFUDataColumn() {
    }

    public DFUDataColumn(
           java.lang.Integer columnID,
           java.lang.String columnLabel,
           java.lang.String columnType,
           java.lang.String columnValue,
           java.lang.Integer columnSize,
           java.lang.Integer maxSize,
           java.lang.String columnEclType,
           java.lang.Integer columnRawSize,
           java.lang.Boolean isNaturalColumn,
           java.lang.Boolean isKeyedColumn,
           org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUDataColumn[] dataColumns) {
           this.columnID = columnID;
           this.columnLabel = columnLabel;
           this.columnType = columnType;
           this.columnValue = columnValue;
           this.columnSize = columnSize;
           this.maxSize = maxSize;
           this.columnEclType = columnEclType;
           this.columnRawSize = columnRawSize;
           this.isNaturalColumn = isNaturalColumn;
           this.isKeyedColumn = isKeyedColumn;
           this.dataColumns = dataColumns;
    }


    /**
     * Gets the columnID value for this DFUDataColumn.
     * 
     * @return columnID
     */
    public java.lang.Integer getColumnID() {
        return columnID;
    }


    /**
     * Sets the columnID value for this DFUDataColumn.
     * 
     * @param columnID
     */
    public void setColumnID(java.lang.Integer columnID) {
        this.columnID = columnID;
    }


    /**
     * Gets the columnLabel value for this DFUDataColumn.
     * 
     * @return columnLabel
     */
    public java.lang.String getColumnLabel() {
        return columnLabel;
    }


    /**
     * Sets the columnLabel value for this DFUDataColumn.
     * 
     * @param columnLabel
     */
    public void setColumnLabel(java.lang.String columnLabel) {
        this.columnLabel = columnLabel;
    }


    /**
     * Gets the columnType value for this DFUDataColumn.
     * 
     * @return columnType
     */
    public java.lang.String getColumnType() {
        return columnType;
    }


    /**
     * Sets the columnType value for this DFUDataColumn.
     * 
     * @param columnType
     */
    public void setColumnType(java.lang.String columnType) {
        this.columnType = columnType;
    }


    /**
     * Gets the columnValue value for this DFUDataColumn.
     * 
     * @return columnValue
     */
    public java.lang.String getColumnValue() {
        return columnValue;
    }


    /**
     * Sets the columnValue value for this DFUDataColumn.
     * 
     * @param columnValue
     */
    public void setColumnValue(java.lang.String columnValue) {
        this.columnValue = columnValue;
    }


    /**
     * Gets the columnSize value for this DFUDataColumn.
     * 
     * @return columnSize
     */
    public java.lang.Integer getColumnSize() {
        return columnSize;
    }


    /**
     * Sets the columnSize value for this DFUDataColumn.
     * 
     * @param columnSize
     */
    public void setColumnSize(java.lang.Integer columnSize) {
        this.columnSize = columnSize;
    }


    /**
     * Gets the maxSize value for this DFUDataColumn.
     * 
     * @return maxSize
     */
    public java.lang.Integer getMaxSize() {
        return maxSize;
    }


    /**
     * Sets the maxSize value for this DFUDataColumn.
     * 
     * @param maxSize
     */
    public void setMaxSize(java.lang.Integer maxSize) {
        this.maxSize = maxSize;
    }


    /**
     * Gets the columnEclType value for this DFUDataColumn.
     * 
     * @return columnEclType
     */
    public java.lang.String getColumnEclType() {
        return columnEclType;
    }


    /**
     * Sets the columnEclType value for this DFUDataColumn.
     * 
     * @param columnEclType
     */
    public void setColumnEclType(java.lang.String columnEclType) {
        this.columnEclType = columnEclType;
    }


    /**
     * Gets the columnRawSize value for this DFUDataColumn.
     * 
     * @return columnRawSize
     */
    public java.lang.Integer getColumnRawSize() {
        return columnRawSize;
    }


    /**
     * Sets the columnRawSize value for this DFUDataColumn.
     * 
     * @param columnRawSize
     */
    public void setColumnRawSize(java.lang.Integer columnRawSize) {
        this.columnRawSize = columnRawSize;
    }


    /**
     * Gets the isNaturalColumn value for this DFUDataColumn.
     * 
     * @return isNaturalColumn
     */
    public java.lang.Boolean getIsNaturalColumn() {
        return isNaturalColumn;
    }


    /**
     * Sets the isNaturalColumn value for this DFUDataColumn.
     * 
     * @param isNaturalColumn
     */
    public void setIsNaturalColumn(java.lang.Boolean isNaturalColumn) {
        this.isNaturalColumn = isNaturalColumn;
    }


    /**
     * Gets the isKeyedColumn value for this DFUDataColumn.
     * 
     * @return isKeyedColumn
     */
    public java.lang.Boolean getIsKeyedColumn() {
        return isKeyedColumn;
    }


    /**
     * Sets the isKeyedColumn value for this DFUDataColumn.
     * 
     * @param isKeyedColumn
     */
    public void setIsKeyedColumn(java.lang.Boolean isKeyedColumn) {
        this.isKeyedColumn = isKeyedColumn;
    }


    /**
     * Gets the dataColumns value for this DFUDataColumn.
     * 
     * @return dataColumns
     */
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUDataColumn[] getDataColumns() {
        return dataColumns;
    }


    /**
     * Sets the dataColumns value for this DFUDataColumn.
     * 
     * @param dataColumns
     */
    public void setDataColumns(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUDataColumn[] dataColumns) {
        this.dataColumns = dataColumns;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DFUDataColumn)) return false;
        DFUDataColumn other = (DFUDataColumn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.columnID==null && other.getColumnID()==null) || 
             (this.columnID!=null &&
              this.columnID.equals(other.getColumnID()))) &&
            ((this.columnLabel==null && other.getColumnLabel()==null) || 
             (this.columnLabel!=null &&
              this.columnLabel.equals(other.getColumnLabel()))) &&
            ((this.columnType==null && other.getColumnType()==null) || 
             (this.columnType!=null &&
              this.columnType.equals(other.getColumnType()))) &&
            ((this.columnValue==null && other.getColumnValue()==null) || 
             (this.columnValue!=null &&
              this.columnValue.equals(other.getColumnValue()))) &&
            ((this.columnSize==null && other.getColumnSize()==null) || 
             (this.columnSize!=null &&
              this.columnSize.equals(other.getColumnSize()))) &&
            ((this.maxSize==null && other.getMaxSize()==null) || 
             (this.maxSize!=null &&
              this.maxSize.equals(other.getMaxSize()))) &&
            ((this.columnEclType==null && other.getColumnEclType()==null) || 
             (this.columnEclType!=null &&
              this.columnEclType.equals(other.getColumnEclType()))) &&
            ((this.columnRawSize==null && other.getColumnRawSize()==null) || 
             (this.columnRawSize!=null &&
              this.columnRawSize.equals(other.getColumnRawSize()))) &&
            ((this.isNaturalColumn==null && other.getIsNaturalColumn()==null) || 
             (this.isNaturalColumn!=null &&
              this.isNaturalColumn.equals(other.getIsNaturalColumn()))) &&
            ((this.isKeyedColumn==null && other.getIsKeyedColumn()==null) || 
             (this.isKeyedColumn!=null &&
              this.isKeyedColumn.equals(other.getIsKeyedColumn()))) &&
            ((this.dataColumns==null && other.getDataColumns()==null) || 
             (this.dataColumns!=null &&
              java.util.Arrays.equals(this.dataColumns, other.getDataColumns())));
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
        if (getColumnID() != null) {
            _hashCode += getColumnID().hashCode();
        }
        if (getColumnLabel() != null) {
            _hashCode += getColumnLabel().hashCode();
        }
        if (getColumnType() != null) {
            _hashCode += getColumnType().hashCode();
        }
        if (getColumnValue() != null) {
            _hashCode += getColumnValue().hashCode();
        }
        if (getColumnSize() != null) {
            _hashCode += getColumnSize().hashCode();
        }
        if (getMaxSize() != null) {
            _hashCode += getMaxSize().hashCode();
        }
        if (getColumnEclType() != null) {
            _hashCode += getColumnEclType().hashCode();
        }
        if (getColumnRawSize() != null) {
            _hashCode += getColumnRawSize().hashCode();
        }
        if (getIsNaturalColumn() != null) {
            _hashCode += getIsNaturalColumn().hashCode();
        }
        if (getIsKeyedColumn() != null) {
            _hashCode += getIsKeyedColumn().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DFUDataColumn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataColumn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ColumnID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ColumnLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ColumnType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ColumnValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ColumnSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "MaxSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnEclType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ColumnEclType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnRawSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ColumnRawSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNaturalColumn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "IsNaturalColumn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isKeyedColumn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "IsKeyedColumn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

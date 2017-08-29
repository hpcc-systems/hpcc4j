/**
 * CreateTableAndLoadRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.extended.wssql.v3_05;

public class CreateTableAndLoadRequest  implements java.io.Serializable {
    private java.lang.String tableName;

    private java.lang.String tableDescription;

    private java.lang.Boolean overwrite;

    private org.hpccsystems.ws.client.gen.extended.wssql.v3_05.EclFieldDeclaration[] eclFields;

    private java.lang.String targetCluster;

    private java.lang.String owner;

    private org.hpccsystems.ws.client.gen.extended.wssql.v3_05.DataSourceInfo dataSource;

    private org.hpccsystems.ws.client.gen.extended.wssql.v3_05.DataType dataSourceType;

    private java.lang.Integer wait;

    public CreateTableAndLoadRequest() {
    }

    public CreateTableAndLoadRequest(
           java.lang.String tableName,
           java.lang.String tableDescription,
           java.lang.Boolean overwrite,
           org.hpccsystems.ws.client.gen.extended.wssql.v3_05.EclFieldDeclaration[] eclFields,
           java.lang.String targetCluster,
           java.lang.String owner,
           org.hpccsystems.ws.client.gen.extended.wssql.v3_05.DataSourceInfo dataSource,
           org.hpccsystems.ws.client.gen.extended.wssql.v3_05.DataType dataSourceType,
           java.lang.Integer wait) {
           this.tableName = tableName;
           this.tableDescription = tableDescription;
           this.overwrite = overwrite;
           this.eclFields = eclFields;
           this.targetCluster = targetCluster;
           this.owner = owner;
           this.dataSource = dataSource;
           this.dataSourceType = dataSourceType;
           this.wait = wait;
    }


    /**
     * Gets the tableName value for this CreateTableAndLoadRequest.
     * 
     * @return tableName
     */
    public java.lang.String getTableName() {
        return tableName;
    }


    /**
     * Sets the tableName value for this CreateTableAndLoadRequest.
     * 
     * @param tableName
     */
    public void setTableName(java.lang.String tableName) {
        this.tableName = tableName;
    }


    /**
     * Gets the tableDescription value for this CreateTableAndLoadRequest.
     * 
     * @return tableDescription
     */
    public java.lang.String getTableDescription() {
        return tableDescription;
    }


    /**
     * Sets the tableDescription value for this CreateTableAndLoadRequest.
     * 
     * @param tableDescription
     */
    public void setTableDescription(java.lang.String tableDescription) {
        this.tableDescription = tableDescription;
    }


    /**
     * Gets the overwrite value for this CreateTableAndLoadRequest.
     * 
     * @return overwrite
     */
    public java.lang.Boolean getOverwrite() {
        return overwrite;
    }


    /**
     * Sets the overwrite value for this CreateTableAndLoadRequest.
     * 
     * @param overwrite
     */
    public void setOverwrite(java.lang.Boolean overwrite) {
        this.overwrite = overwrite;
    }


    /**
     * Gets the eclFields value for this CreateTableAndLoadRequest.
     * 
     * @return eclFields
     */
    public org.hpccsystems.ws.client.gen.extended.wssql.v3_05.EclFieldDeclaration[] getEclFields() {
        return eclFields;
    }


    /**
     * Sets the eclFields value for this CreateTableAndLoadRequest.
     * 
     * @param eclFields
     */
    public void setEclFields(org.hpccsystems.ws.client.gen.extended.wssql.v3_05.EclFieldDeclaration[] eclFields) {
        this.eclFields = eclFields;
    }


    /**
     * Gets the targetCluster value for this CreateTableAndLoadRequest.
     * 
     * @return targetCluster
     */
    public java.lang.String getTargetCluster() {
        return targetCluster;
    }


    /**
     * Sets the targetCluster value for this CreateTableAndLoadRequest.
     * 
     * @param targetCluster
     */
    public void setTargetCluster(java.lang.String targetCluster) {
        this.targetCluster = targetCluster;
    }


    /**
     * Gets the owner value for this CreateTableAndLoadRequest.
     * 
     * @return owner
     */
    public java.lang.String getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this CreateTableAndLoadRequest.
     * 
     * @param owner
     */
    public void setOwner(java.lang.String owner) {
        this.owner = owner;
    }


    /**
     * Gets the dataSource value for this CreateTableAndLoadRequest.
     * 
     * @return dataSource
     */
    public org.hpccsystems.ws.client.gen.extended.wssql.v3_05.DataSourceInfo getDataSource() {
        return dataSource;
    }


    /**
     * Sets the dataSource value for this CreateTableAndLoadRequest.
     * 
     * @param dataSource
     */
    public void setDataSource(org.hpccsystems.ws.client.gen.extended.wssql.v3_05.DataSourceInfo dataSource) {
        this.dataSource = dataSource;
    }


    /**
     * Gets the dataSourceType value for this CreateTableAndLoadRequest.
     * 
     * @return dataSourceType
     */
    public org.hpccsystems.ws.client.gen.extended.wssql.v3_05.DataType getDataSourceType() {
        return dataSourceType;
    }


    /**
     * Sets the dataSourceType value for this CreateTableAndLoadRequest.
     * 
     * @param dataSourceType
     */
    public void setDataSourceType(org.hpccsystems.ws.client.gen.extended.wssql.v3_05.DataType dataSourceType) {
        this.dataSourceType = dataSourceType;
    }


    /**
     * Gets the wait value for this CreateTableAndLoadRequest.
     * 
     * @return wait
     */
    public java.lang.Integer getWait() {
        return wait;
    }


    /**
     * Sets the wait value for this CreateTableAndLoadRequest.
     * 
     * @param wait
     */
    public void setWait(java.lang.Integer wait) {
        this.wait = wait;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateTableAndLoadRequest)) return false;
        CreateTableAndLoadRequest other = (CreateTableAndLoadRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tableName==null && other.getTableName()==null) || 
             (this.tableName!=null &&
              this.tableName.equals(other.getTableName()))) &&
            ((this.tableDescription==null && other.getTableDescription()==null) || 
             (this.tableDescription!=null &&
              this.tableDescription.equals(other.getTableDescription()))) &&
            ((this.overwrite==null && other.getOverwrite()==null) || 
             (this.overwrite!=null &&
              this.overwrite.equals(other.getOverwrite()))) &&
            ((this.eclFields==null && other.getEclFields()==null) || 
             (this.eclFields!=null &&
              java.util.Arrays.equals(this.eclFields, other.getEclFields()))) &&
            ((this.targetCluster==null && other.getTargetCluster()==null) || 
             (this.targetCluster!=null &&
              this.targetCluster.equals(other.getTargetCluster()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.dataSource==null && other.getDataSource()==null) || 
             (this.dataSource!=null &&
              this.dataSource.equals(other.getDataSource()))) &&
            ((this.dataSourceType==null && other.getDataSourceType()==null) || 
             (this.dataSourceType!=null &&
              this.dataSourceType.equals(other.getDataSourceType()))) &&
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
        if (getTableName() != null) {
            _hashCode += getTableName().hashCode();
        }
        if (getTableDescription() != null) {
            _hashCode += getTableDescription().hashCode();
        }
        if (getOverwrite() != null) {
            _hashCode += getOverwrite().hashCode();
        }
        if (getEclFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEclFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEclFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTargetCluster() != null) {
            _hashCode += getTargetCluster().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getDataSource() != null) {
            _hashCode += getDataSource().hashCode();
        }
        if (getDataSourceType() != null) {
            _hashCode += getDataSourceType().hashCode();
        }
        if (getWait() != null) {
            _hashCode += getWait().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateTableAndLoadRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">CreateTableAndLoadRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tableName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "TableName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tableDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "TableDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overwrite");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Overwrite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eclFields");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "EclFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "EclFieldDeclaration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "EclField"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetCluster");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "TargetCluster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "DataSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "DataSourceInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataSourceType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "DataSourceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "DataType"));
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

/**
 * CreateTableAndLoadResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.extended.wssql.v3_04;

public class CreateTableAndLoadResponse  implements java.io.Serializable {
    private java.lang.String tableName;

    private java.lang.Boolean success;

    private java.lang.String eclRecordDefinition;

    private org.hpccsystems.ws.client.gen.extended.wssql.v3_04.ECLWorkunit workunit;

    public CreateTableAndLoadResponse() {
    }

    public CreateTableAndLoadResponse(
           java.lang.String tableName,
           java.lang.Boolean success,
           java.lang.String eclRecordDefinition,
           org.hpccsystems.ws.client.gen.extended.wssql.v3_04.ECLWorkunit workunit) {
           this.tableName = tableName;
           this.success = success;
           this.eclRecordDefinition = eclRecordDefinition;
           this.workunit = workunit;
    }


    /**
     * Gets the tableName value for this CreateTableAndLoadResponse.
     * 
     * @return tableName
     */
    public java.lang.String getTableName() {
        return tableName;
    }


    /**
     * Sets the tableName value for this CreateTableAndLoadResponse.
     * 
     * @param tableName
     */
    public void setTableName(java.lang.String tableName) {
        this.tableName = tableName;
    }


    /**
     * Gets the success value for this CreateTableAndLoadResponse.
     * 
     * @return success
     */
    public java.lang.Boolean getSuccess() {
        return success;
    }


    /**
     * Sets the success value for this CreateTableAndLoadResponse.
     * 
     * @param success
     */
    public void setSuccess(java.lang.Boolean success) {
        this.success = success;
    }


    /**
     * Gets the eclRecordDefinition value for this CreateTableAndLoadResponse.
     * 
     * @return eclRecordDefinition
     */
    public java.lang.String getEclRecordDefinition() {
        return eclRecordDefinition;
    }


    /**
     * Sets the eclRecordDefinition value for this CreateTableAndLoadResponse.
     * 
     * @param eclRecordDefinition
     */
    public void setEclRecordDefinition(java.lang.String eclRecordDefinition) {
        this.eclRecordDefinition = eclRecordDefinition;
    }


    /**
     * Gets the workunit value for this CreateTableAndLoadResponse.
     * 
     * @return workunit
     */
    public org.hpccsystems.ws.client.gen.extended.wssql.v3_04.ECLWorkunit getWorkunit() {
        return workunit;
    }


    /**
     * Sets the workunit value for this CreateTableAndLoadResponse.
     * 
     * @param workunit
     */
    public void setWorkunit(org.hpccsystems.ws.client.gen.extended.wssql.v3_04.ECLWorkunit workunit) {
        this.workunit = workunit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateTableAndLoadResponse)) return false;
        CreateTableAndLoadResponse other = (CreateTableAndLoadResponse) obj;
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
            ((this.success==null && other.getSuccess()==null) || 
             (this.success!=null &&
              this.success.equals(other.getSuccess()))) &&
            ((this.eclRecordDefinition==null && other.getEclRecordDefinition()==null) || 
             (this.eclRecordDefinition!=null &&
              this.eclRecordDefinition.equals(other.getEclRecordDefinition()))) &&
            ((this.workunit==null && other.getWorkunit()==null) || 
             (this.workunit!=null &&
              this.workunit.equals(other.getWorkunit())));
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
        if (getSuccess() != null) {
            _hashCode += getSuccess().hashCode();
        }
        if (getEclRecordDefinition() != null) {
            _hashCode += getEclRecordDefinition().hashCode();
        }
        if (getWorkunit() != null) {
            _hashCode += getWorkunit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateTableAndLoadResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">CreateTableAndLoadResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tableName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "TableName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Success"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eclRecordDefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "EclRecordDefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workunit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Workunit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLWorkunit"));
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

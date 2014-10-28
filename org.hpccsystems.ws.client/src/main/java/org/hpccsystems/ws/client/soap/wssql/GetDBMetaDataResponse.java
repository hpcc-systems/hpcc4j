/**
 * GetDBMetaDataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.soap.wssql;

public class GetDBMetaDataResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.soap.wssql.ArrayOfEspException exceptions;

    private org.hpccsystems.ws.client.soap.wssql.HPCCTable[] tables;

    private java.math.BigInteger tableCount;

    private org.hpccsystems.ws.client.soap.wssql.HPCCQuerySet[] querySets;

    private java.lang.String[] clusterNames;

    public GetDBMetaDataResponse() {
    }

    public GetDBMetaDataResponse(
           org.hpccsystems.ws.client.soap.wssql.ArrayOfEspException exceptions,
           org.hpccsystems.ws.client.soap.wssql.HPCCTable[] tables,
           java.math.BigInteger tableCount,
           org.hpccsystems.ws.client.soap.wssql.HPCCQuerySet[] querySets,
           java.lang.String[] clusterNames) {
           this.exceptions = exceptions;
           this.tables = tables;
           this.tableCount = tableCount;
           this.querySets = querySets;
           this.clusterNames = clusterNames;
    }


    /**
     * Gets the exceptions value for this GetDBMetaDataResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.soap.wssql.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this GetDBMetaDataResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.soap.wssql.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the tables value for this GetDBMetaDataResponse.
     * 
     * @return tables
     */
    public org.hpccsystems.ws.client.soap.wssql.HPCCTable[] getTables() {
        return tables;
    }


    /**
     * Sets the tables value for this GetDBMetaDataResponse.
     * 
     * @param tables
     */
    public void setTables(org.hpccsystems.ws.client.soap.wssql.HPCCTable[] tables) {
        this.tables = tables;
    }


    /**
     * Gets the tableCount value for this GetDBMetaDataResponse.
     * 
     * @return tableCount
     */
    public java.math.BigInteger getTableCount() {
        return tableCount;
    }


    /**
     * Sets the tableCount value for this GetDBMetaDataResponse.
     * 
     * @param tableCount
     */
    public void setTableCount(java.math.BigInteger tableCount) {
        this.tableCount = tableCount;
    }


    /**
     * Gets the querySets value for this GetDBMetaDataResponse.
     * 
     * @return querySets
     */
    public org.hpccsystems.ws.client.soap.wssql.HPCCQuerySet[] getQuerySets() {
        return querySets;
    }


    /**
     * Sets the querySets value for this GetDBMetaDataResponse.
     * 
     * @param querySets
     */
    public void setQuerySets(org.hpccsystems.ws.client.soap.wssql.HPCCQuerySet[] querySets) {
        this.querySets = querySets;
    }


    /**
     * Gets the clusterNames value for this GetDBMetaDataResponse.
     * 
     * @return clusterNames
     */
    public java.lang.String[] getClusterNames() {
        return clusterNames;
    }


    /**
     * Sets the clusterNames value for this GetDBMetaDataResponse.
     * 
     * @param clusterNames
     */
    public void setClusterNames(java.lang.String[] clusterNames) {
        this.clusterNames = clusterNames;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDBMetaDataResponse)) return false;
        GetDBMetaDataResponse other = (GetDBMetaDataResponse) obj;
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
            ((this.tables==null && other.getTables()==null) || 
             (this.tables!=null &&
              java.util.Arrays.equals(this.tables, other.getTables()))) &&
            ((this.tableCount==null && other.getTableCount()==null) || 
             (this.tableCount!=null &&
              this.tableCount.equals(other.getTableCount()))) &&
            ((this.querySets==null && other.getQuerySets()==null) || 
             (this.querySets!=null &&
              java.util.Arrays.equals(this.querySets, other.getQuerySets()))) &&
            ((this.clusterNames==null && other.getClusterNames()==null) || 
             (this.clusterNames!=null &&
              java.util.Arrays.equals(this.clusterNames, other.getClusterNames())));
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
        if (getTables() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTables());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTables(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTableCount() != null) {
            _hashCode += getTableCount().hashCode();
        }
        if (getQuerySets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuerySets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuerySets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClusterNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClusterNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClusterNames(), i);
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
        new org.apache.axis.description.TypeDesc(GetDBMetaDataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">GetDBMetaDataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tables");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Tables"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "HPCCTable"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Table"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tableCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "TableCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("querySets");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "QuerySets"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "HPCCQuerySet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "QuerySet"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterNames");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ClusterNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ClusterName"));
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

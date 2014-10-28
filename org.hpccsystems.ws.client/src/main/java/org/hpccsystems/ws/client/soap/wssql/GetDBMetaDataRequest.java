/**
 * GetDBMetaDataRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.soap.wssql;

public class GetDBMetaDataRequest  implements java.io.Serializable {
    private java.lang.Boolean includeTables;

    private java.lang.String tableFilter;

    private java.lang.Boolean includeStoredProcedures;

    private java.lang.String querySet;

    private java.lang.Boolean includeTargetClusters;

    private java.lang.String clusterType;

    public GetDBMetaDataRequest() {
    }

    public GetDBMetaDataRequest(
           java.lang.Boolean includeTables,
           java.lang.String tableFilter,
           java.lang.Boolean includeStoredProcedures,
           java.lang.String querySet,
           java.lang.Boolean includeTargetClusters,
           java.lang.String clusterType) {
           this.includeTables = includeTables;
           this.tableFilter = tableFilter;
           this.includeStoredProcedures = includeStoredProcedures;
           this.querySet = querySet;
           this.includeTargetClusters = includeTargetClusters;
           this.clusterType = clusterType;
    }


    /**
     * Gets the includeTables value for this GetDBMetaDataRequest.
     * 
     * @return includeTables
     */
    public java.lang.Boolean getIncludeTables() {
        return includeTables;
    }


    /**
     * Sets the includeTables value for this GetDBMetaDataRequest.
     * 
     * @param includeTables
     */
    public void setIncludeTables(java.lang.Boolean includeTables) {
        this.includeTables = includeTables;
    }


    /**
     * Gets the tableFilter value for this GetDBMetaDataRequest.
     * 
     * @return tableFilter
     */
    public java.lang.String getTableFilter() {
        return tableFilter;
    }


    /**
     * Sets the tableFilter value for this GetDBMetaDataRequest.
     * 
     * @param tableFilter
     */
    public void setTableFilter(java.lang.String tableFilter) {
        this.tableFilter = tableFilter;
    }


    /**
     * Gets the includeStoredProcedures value for this GetDBMetaDataRequest.
     * 
     * @return includeStoredProcedures
     */
    public java.lang.Boolean getIncludeStoredProcedures() {
        return includeStoredProcedures;
    }


    /**
     * Sets the includeStoredProcedures value for this GetDBMetaDataRequest.
     * 
     * @param includeStoredProcedures
     */
    public void setIncludeStoredProcedures(java.lang.Boolean includeStoredProcedures) {
        this.includeStoredProcedures = includeStoredProcedures;
    }


    /**
     * Gets the querySet value for this GetDBMetaDataRequest.
     * 
     * @return querySet
     */
    public java.lang.String getQuerySet() {
        return querySet;
    }


    /**
     * Sets the querySet value for this GetDBMetaDataRequest.
     * 
     * @param querySet
     */
    public void setQuerySet(java.lang.String querySet) {
        this.querySet = querySet;
    }


    /**
     * Gets the includeTargetClusters value for this GetDBMetaDataRequest.
     * 
     * @return includeTargetClusters
     */
    public java.lang.Boolean getIncludeTargetClusters() {
        return includeTargetClusters;
    }


    /**
     * Sets the includeTargetClusters value for this GetDBMetaDataRequest.
     * 
     * @param includeTargetClusters
     */
    public void setIncludeTargetClusters(java.lang.Boolean includeTargetClusters) {
        this.includeTargetClusters = includeTargetClusters;
    }


    /**
     * Gets the clusterType value for this GetDBMetaDataRequest.
     * 
     * @return clusterType
     */
    public java.lang.String getClusterType() {
        return clusterType;
    }


    /**
     * Sets the clusterType value for this GetDBMetaDataRequest.
     * 
     * @param clusterType
     */
    public void setClusterType(java.lang.String clusterType) {
        this.clusterType = clusterType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDBMetaDataRequest)) return false;
        GetDBMetaDataRequest other = (GetDBMetaDataRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.includeTables==null && other.getIncludeTables()==null) || 
             (this.includeTables!=null &&
              this.includeTables.equals(other.getIncludeTables()))) &&
            ((this.tableFilter==null && other.getTableFilter()==null) || 
             (this.tableFilter!=null &&
              this.tableFilter.equals(other.getTableFilter()))) &&
            ((this.includeStoredProcedures==null && other.getIncludeStoredProcedures()==null) || 
             (this.includeStoredProcedures!=null &&
              this.includeStoredProcedures.equals(other.getIncludeStoredProcedures()))) &&
            ((this.querySet==null && other.getQuerySet()==null) || 
             (this.querySet!=null &&
              this.querySet.equals(other.getQuerySet()))) &&
            ((this.includeTargetClusters==null && other.getIncludeTargetClusters()==null) || 
             (this.includeTargetClusters!=null &&
              this.includeTargetClusters.equals(other.getIncludeTargetClusters()))) &&
            ((this.clusterType==null && other.getClusterType()==null) || 
             (this.clusterType!=null &&
              this.clusterType.equals(other.getClusterType())));
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
        if (getIncludeTables() != null) {
            _hashCode += getIncludeTables().hashCode();
        }
        if (getTableFilter() != null) {
            _hashCode += getTableFilter().hashCode();
        }
        if (getIncludeStoredProcedures() != null) {
            _hashCode += getIncludeStoredProcedures().hashCode();
        }
        if (getQuerySet() != null) {
            _hashCode += getQuerySet().hashCode();
        }
        if (getIncludeTargetClusters() != null) {
            _hashCode += getIncludeTargetClusters().hashCode();
        }
        if (getClusterType() != null) {
            _hashCode += getClusterType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDBMetaDataRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", ">GetDBMetaDataRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeTables");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "IncludeTables"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tableFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "TableFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeStoredProcedures");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "IncludeStoredProcedures"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("querySet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "QuerySet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeTargetClusters");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "IncludeTargetClusters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ClusterType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

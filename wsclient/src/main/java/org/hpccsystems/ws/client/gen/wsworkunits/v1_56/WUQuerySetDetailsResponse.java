/**
 * WUQuerySetDetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_56;

public class WUQuerySetDetailsResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException exceptions;

    private java.lang.String querySetName;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySetQuery[] querysetQueries;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySetAlias[] querysetAliases;

    private java.lang.String clusterName;

    private java.lang.String filter;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetFilterType filterType;

    private java.lang.String[] clusterNames;

    public WUQuerySetDetailsResponse() {
    }

    public WUQuerySetDetailsResponse(
           org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException exceptions,
           java.lang.String querySetName,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySetQuery[] querysetQueries,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySetAlias[] querysetAliases,
           java.lang.String clusterName,
           java.lang.String filter,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetFilterType filterType,
           java.lang.String[] clusterNames) {
           this.exceptions = exceptions;
           this.querySetName = querySetName;
           this.querysetQueries = querysetQueries;
           this.querysetAliases = querysetAliases;
           this.clusterName = clusterName;
           this.filter = filter;
           this.filterType = filterType;
           this.clusterNames = clusterNames;
    }


    /**
     * Gets the exceptions value for this WUQuerySetDetailsResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this WUQuerySetDetailsResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the querySetName value for this WUQuerySetDetailsResponse.
     * 
     * @return querySetName
     */
    public java.lang.String getQuerySetName() {
        return querySetName;
    }


    /**
     * Sets the querySetName value for this WUQuerySetDetailsResponse.
     * 
     * @param querySetName
     */
    public void setQuerySetName(java.lang.String querySetName) {
        this.querySetName = querySetName;
    }


    /**
     * Gets the querysetQueries value for this WUQuerySetDetailsResponse.
     * 
     * @return querysetQueries
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySetQuery[] getQuerysetQueries() {
        return querysetQueries;
    }


    /**
     * Sets the querysetQueries value for this WUQuerySetDetailsResponse.
     * 
     * @param querysetQueries
     */
    public void setQuerysetQueries(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySetQuery[] querysetQueries) {
        this.querysetQueries = querysetQueries;
    }


    /**
     * Gets the querysetAliases value for this WUQuerySetDetailsResponse.
     * 
     * @return querysetAliases
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySetAlias[] getQuerysetAliases() {
        return querysetAliases;
    }


    /**
     * Sets the querysetAliases value for this WUQuerySetDetailsResponse.
     * 
     * @param querysetAliases
     */
    public void setQuerysetAliases(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySetAlias[] querysetAliases) {
        this.querysetAliases = querysetAliases;
    }


    /**
     * Gets the clusterName value for this WUQuerySetDetailsResponse.
     * 
     * @return clusterName
     */
    public java.lang.String getClusterName() {
        return clusterName;
    }


    /**
     * Sets the clusterName value for this WUQuerySetDetailsResponse.
     * 
     * @param clusterName
     */
    public void setClusterName(java.lang.String clusterName) {
        this.clusterName = clusterName;
    }


    /**
     * Gets the filter value for this WUQuerySetDetailsResponse.
     * 
     * @return filter
     */
    public java.lang.String getFilter() {
        return filter;
    }


    /**
     * Sets the filter value for this WUQuerySetDetailsResponse.
     * 
     * @param filter
     */
    public void setFilter(java.lang.String filter) {
        this.filter = filter;
    }


    /**
     * Gets the filterType value for this WUQuerySetDetailsResponse.
     * 
     * @return filterType
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetFilterType getFilterType() {
        return filterType;
    }


    /**
     * Sets the filterType value for this WUQuerySetDetailsResponse.
     * 
     * @param filterType
     */
    public void setFilterType(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.WUQuerySetFilterType filterType) {
        this.filterType = filterType;
    }


    /**
     * Gets the clusterNames value for this WUQuerySetDetailsResponse.
     * 
     * @return clusterNames
     */
    public java.lang.String[] getClusterNames() {
        return clusterNames;
    }


    /**
     * Sets the clusterNames value for this WUQuerySetDetailsResponse.
     * 
     * @param clusterNames
     */
    public void setClusterNames(java.lang.String[] clusterNames) {
        this.clusterNames = clusterNames;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUQuerySetDetailsResponse)) return false;
        WUQuerySetDetailsResponse other = (WUQuerySetDetailsResponse) obj;
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
            ((this.querySetName==null && other.getQuerySetName()==null) || 
             (this.querySetName!=null &&
              this.querySetName.equals(other.getQuerySetName()))) &&
            ((this.querysetQueries==null && other.getQuerysetQueries()==null) || 
             (this.querysetQueries!=null &&
              java.util.Arrays.equals(this.querysetQueries, other.getQuerysetQueries()))) &&
            ((this.querysetAliases==null && other.getQuerysetAliases()==null) || 
             (this.querysetAliases!=null &&
              java.util.Arrays.equals(this.querysetAliases, other.getQuerysetAliases()))) &&
            ((this.clusterName==null && other.getClusterName()==null) || 
             (this.clusterName!=null &&
              this.clusterName.equals(other.getClusterName()))) &&
            ((this.filter==null && other.getFilter()==null) || 
             (this.filter!=null &&
              this.filter.equals(other.getFilter()))) &&
            ((this.filterType==null && other.getFilterType()==null) || 
             (this.filterType!=null &&
              this.filterType.equals(other.getFilterType()))) &&
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
        if (getQuerySetName() != null) {
            _hashCode += getQuerySetName().hashCode();
        }
        if (getQuerysetQueries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuerysetQueries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuerysetQueries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuerysetAliases() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuerysetAliases());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuerysetAliases(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClusterName() != null) {
            _hashCode += getClusterName().hashCode();
        }
        if (getFilter() != null) {
            _hashCode += getFilter().hashCode();
        }
        if (getFilterType() != null) {
            _hashCode += getFilterType().hashCode();
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
        new org.apache.axis.description.TypeDesc(WUQuerySetDetailsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUQuerySetDetailsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("querySetName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("querysetQueries");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerysetQueries"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetQuery"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetQuery"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("querysetAliases");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerysetAliases"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetAlias"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetAlias"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ClusterName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filter");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "FilterType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQuerySetFilterType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterNames");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ClusterNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Item"));
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

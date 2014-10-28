/**
 * HPCCQuerySet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.soap.wssql;

public class HPCCQuerySet  implements java.io.Serializable {
    private java.lang.String name;

    private org.hpccsystems.ws.client.soap.wssql.PublishedQuery[] querySetQueries;

    private org.hpccsystems.ws.client.soap.wssql.QuerySetAliasMap[] querySetAliases;

    public HPCCQuerySet() {
    }

    public HPCCQuerySet(
           java.lang.String name,
           org.hpccsystems.ws.client.soap.wssql.PublishedQuery[] querySetQueries,
           org.hpccsystems.ws.client.soap.wssql.QuerySetAliasMap[] querySetAliases) {
           this.name = name;
           this.querySetQueries = querySetQueries;
           this.querySetAliases = querySetAliases;
    }


    /**
     * Gets the name value for this HPCCQuerySet.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this HPCCQuerySet.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the querySetQueries value for this HPCCQuerySet.
     * 
     * @return querySetQueries
     */
    public org.hpccsystems.ws.client.soap.wssql.PublishedQuery[] getQuerySetQueries() {
        return querySetQueries;
    }


    /**
     * Sets the querySetQueries value for this HPCCQuerySet.
     * 
     * @param querySetQueries
     */
    public void setQuerySetQueries(org.hpccsystems.ws.client.soap.wssql.PublishedQuery[] querySetQueries) {
        this.querySetQueries = querySetQueries;
    }


    /**
     * Gets the querySetAliases value for this HPCCQuerySet.
     * 
     * @return querySetAliases
     */
    public org.hpccsystems.ws.client.soap.wssql.QuerySetAliasMap[] getQuerySetAliases() {
        return querySetAliases;
    }


    /**
     * Sets the querySetAliases value for this HPCCQuerySet.
     * 
     * @param querySetAliases
     */
    public void setQuerySetAliases(org.hpccsystems.ws.client.soap.wssql.QuerySetAliasMap[] querySetAliases) {
        this.querySetAliases = querySetAliases;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HPCCQuerySet)) return false;
        HPCCQuerySet other = (HPCCQuerySet) obj;
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
            ((this.querySetQueries==null && other.getQuerySetQueries()==null) || 
             (this.querySetQueries!=null &&
              java.util.Arrays.equals(this.querySetQueries, other.getQuerySetQueries()))) &&
            ((this.querySetAliases==null && other.getQuerySetAliases()==null) || 
             (this.querySetAliases!=null &&
              java.util.Arrays.equals(this.querySetAliases, other.getQuerySetAliases())));
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
        if (getQuerySetQueries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuerySetQueries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuerySetQueries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuerySetAliases() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuerySetAliases());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuerySetAliases(), i);
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
        new org.apache.axis.description.TypeDesc(HPCCQuerySet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "HPCCQuerySet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("querySetQueries");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "QuerySetQueries"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "PublishedQuery"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "QuerySetQuery"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("querySetAliases");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "QuerySetAliases"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "QuerySetAliasMap"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "QuerySetAlias"));
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

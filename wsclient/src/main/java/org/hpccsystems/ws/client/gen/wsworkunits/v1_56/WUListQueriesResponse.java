/**
 * WUListQueriesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_56;

public class WUListQueriesResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException exceptions;

    private java.lang.Integer numberOfQueries;

    private java.lang.Long cacheHint;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySetQuery[] querysetQueries;

    public WUListQueriesResponse() {
    }

    public WUListQueriesResponse(
           org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException exceptions,
           java.lang.Integer numberOfQueries,
           java.lang.Long cacheHint,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySetQuery[] querysetQueries) {
           this.exceptions = exceptions;
           this.numberOfQueries = numberOfQueries;
           this.cacheHint = cacheHint;
           this.querysetQueries = querysetQueries;
    }


    /**
     * Gets the exceptions value for this WUListQueriesResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this WUListQueriesResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the numberOfQueries value for this WUListQueriesResponse.
     * 
     * @return numberOfQueries
     */
    public java.lang.Integer getNumberOfQueries() {
        return numberOfQueries;
    }


    /**
     * Sets the numberOfQueries value for this WUListQueriesResponse.
     * 
     * @param numberOfQueries
     */
    public void setNumberOfQueries(java.lang.Integer numberOfQueries) {
        this.numberOfQueries = numberOfQueries;
    }


    /**
     * Gets the cacheHint value for this WUListQueriesResponse.
     * 
     * @return cacheHint
     */
    public java.lang.Long getCacheHint() {
        return cacheHint;
    }


    /**
     * Sets the cacheHint value for this WUListQueriesResponse.
     * 
     * @param cacheHint
     */
    public void setCacheHint(java.lang.Long cacheHint) {
        this.cacheHint = cacheHint;
    }


    /**
     * Gets the querysetQueries value for this WUListQueriesResponse.
     * 
     * @return querysetQueries
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySetQuery[] getQuerysetQueries() {
        return querysetQueries;
    }


    /**
     * Sets the querysetQueries value for this WUListQueriesResponse.
     * 
     * @param querysetQueries
     */
    public void setQuerysetQueries(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.QuerySetQuery[] querysetQueries) {
        this.querysetQueries = querysetQueries;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUListQueriesResponse)) return false;
        WUListQueriesResponse other = (WUListQueriesResponse) obj;
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
            ((this.numberOfQueries==null && other.getNumberOfQueries()==null) || 
             (this.numberOfQueries!=null &&
              this.numberOfQueries.equals(other.getNumberOfQueries()))) &&
            ((this.cacheHint==null && other.getCacheHint()==null) || 
             (this.cacheHint!=null &&
              this.cacheHint.equals(other.getCacheHint()))) &&
            ((this.querysetQueries==null && other.getQuerysetQueries()==null) || 
             (this.querysetQueries!=null &&
              java.util.Arrays.equals(this.querysetQueries, other.getQuerysetQueries())));
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
        if (getNumberOfQueries() != null) {
            _hashCode += getNumberOfQueries().hashCode();
        }
        if (getCacheHint() != null) {
            _hashCode += getCacheHint().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WUListQueriesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUListQueriesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfQueries");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "NumberOfQueries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cacheHint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "CacheHint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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

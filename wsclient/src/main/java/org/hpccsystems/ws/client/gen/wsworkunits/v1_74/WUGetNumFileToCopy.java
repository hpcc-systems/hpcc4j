/**
 * WUGetNumFileToCopy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_74;

public class WUGetNumFileToCopy  implements java.io.Serializable {
    private java.lang.String clusterName;

    private java.lang.Long pageSize;

    private java.lang.Long pageStartFrom;

    private java.lang.String sortby;

    private java.lang.Boolean descending;

    private java.lang.Long cacheHint;

    public WUGetNumFileToCopy() {
    }

    public WUGetNumFileToCopy(
           java.lang.String clusterName,
           java.lang.Long pageSize,
           java.lang.Long pageStartFrom,
           java.lang.String sortby,
           java.lang.Boolean descending,
           java.lang.Long cacheHint) {
           this.clusterName = clusterName;
           this.pageSize = pageSize;
           this.pageStartFrom = pageStartFrom;
           this.sortby = sortby;
           this.descending = descending;
           this.cacheHint = cacheHint;
    }


    /**
     * Gets the clusterName value for this WUGetNumFileToCopy.
     * 
     * @return clusterName
     */
    public java.lang.String getClusterName() {
        return clusterName;
    }


    /**
     * Sets the clusterName value for this WUGetNumFileToCopy.
     * 
     * @param clusterName
     */
    public void setClusterName(java.lang.String clusterName) {
        this.clusterName = clusterName;
    }


    /**
     * Gets the pageSize value for this WUGetNumFileToCopy.
     * 
     * @return pageSize
     */
    public java.lang.Long getPageSize() {
        return pageSize;
    }


    /**
     * Sets the pageSize value for this WUGetNumFileToCopy.
     * 
     * @param pageSize
     */
    public void setPageSize(java.lang.Long pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * Gets the pageStartFrom value for this WUGetNumFileToCopy.
     * 
     * @return pageStartFrom
     */
    public java.lang.Long getPageStartFrom() {
        return pageStartFrom;
    }


    /**
     * Sets the pageStartFrom value for this WUGetNumFileToCopy.
     * 
     * @param pageStartFrom
     */
    public void setPageStartFrom(java.lang.Long pageStartFrom) {
        this.pageStartFrom = pageStartFrom;
    }


    /**
     * Gets the sortby value for this WUGetNumFileToCopy.
     * 
     * @return sortby
     */
    public java.lang.String getSortby() {
        return sortby;
    }


    /**
     * Sets the sortby value for this WUGetNumFileToCopy.
     * 
     * @param sortby
     */
    public void setSortby(java.lang.String sortby) {
        this.sortby = sortby;
    }


    /**
     * Gets the descending value for this WUGetNumFileToCopy.
     * 
     * @return descending
     */
    public java.lang.Boolean getDescending() {
        return descending;
    }


    /**
     * Sets the descending value for this WUGetNumFileToCopy.
     * 
     * @param descending
     */
    public void setDescending(java.lang.Boolean descending) {
        this.descending = descending;
    }


    /**
     * Gets the cacheHint value for this WUGetNumFileToCopy.
     * 
     * @return cacheHint
     */
    public java.lang.Long getCacheHint() {
        return cacheHint;
    }


    /**
     * Sets the cacheHint value for this WUGetNumFileToCopy.
     * 
     * @param cacheHint
     */
    public void setCacheHint(java.lang.Long cacheHint) {
        this.cacheHint = cacheHint;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUGetNumFileToCopy)) return false;
        WUGetNumFileToCopy other = (WUGetNumFileToCopy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clusterName==null && other.getClusterName()==null) || 
             (this.clusterName!=null &&
              this.clusterName.equals(other.getClusterName()))) &&
            ((this.pageSize==null && other.getPageSize()==null) || 
             (this.pageSize!=null &&
              this.pageSize.equals(other.getPageSize()))) &&
            ((this.pageStartFrom==null && other.getPageStartFrom()==null) || 
             (this.pageStartFrom!=null &&
              this.pageStartFrom.equals(other.getPageStartFrom()))) &&
            ((this.sortby==null && other.getSortby()==null) || 
             (this.sortby!=null &&
              this.sortby.equals(other.getSortby()))) &&
            ((this.descending==null && other.getDescending()==null) || 
             (this.descending!=null &&
              this.descending.equals(other.getDescending()))) &&
            ((this.cacheHint==null && other.getCacheHint()==null) || 
             (this.cacheHint!=null &&
              this.cacheHint.equals(other.getCacheHint())));
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
        if (getClusterName() != null) {
            _hashCode += getClusterName().hashCode();
        }
        if (getPageSize() != null) {
            _hashCode += getPageSize().hashCode();
        }
        if (getPageStartFrom() != null) {
            _hashCode += getPageStartFrom().hashCode();
        }
        if (getSortby() != null) {
            _hashCode += getSortby().hashCode();
        }
        if (getDescending() != null) {
            _hashCode += getDescending().hashCode();
        }
        if (getCacheHint() != null) {
            _hashCode += getCacheHint().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WUGetNumFileToCopy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUGetNumFileToCopy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ClusterName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PageSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageStartFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PageStartFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortby");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Sortby"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descending");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Descending"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

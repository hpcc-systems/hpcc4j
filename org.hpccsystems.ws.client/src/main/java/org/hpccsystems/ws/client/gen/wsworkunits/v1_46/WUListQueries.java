/**
 * WUListQueries.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_46;

public class WUListQueries  implements java.io.Serializable {
    private java.lang.String querySetName;

    private java.lang.String clusterName;

    private java.lang.Long memoryLimitLow;

    private java.lang.Long memoryLimitHigh;

    private org.apache.axis.types.NonNegativeInteger timeLimitLow;

    private org.apache.axis.types.NonNegativeInteger timeLimitHigh;

    private org.apache.axis.types.NonNegativeInteger warnTimeLimitLow;

    private org.apache.axis.types.NonNegativeInteger warnTimeLimitHigh;

    private org.apache.axis.types.NonNegativeInteger priorityLow;

    private org.apache.axis.types.NonNegativeInteger priorityHigh;

    private org.apache.axis.types.NonNegativeInteger pageSize;

    private org.apache.axis.types.NonNegativeInteger pageStartFrom;

    private java.lang.String sortby;

    private java.lang.Boolean descending;

    private java.lang.Long cacheHint;

    public WUListQueries() {
    }

    public WUListQueries(
           java.lang.String querySetName,
           java.lang.String clusterName,
           java.lang.Long memoryLimitLow,
           java.lang.Long memoryLimitHigh,
           org.apache.axis.types.NonNegativeInteger timeLimitLow,
           org.apache.axis.types.NonNegativeInteger timeLimitHigh,
           org.apache.axis.types.NonNegativeInteger warnTimeLimitLow,
           org.apache.axis.types.NonNegativeInteger warnTimeLimitHigh,
           org.apache.axis.types.NonNegativeInteger priorityLow,
           org.apache.axis.types.NonNegativeInteger priorityHigh,
           org.apache.axis.types.NonNegativeInteger pageSize,
           org.apache.axis.types.NonNegativeInteger pageStartFrom,
           java.lang.String sortby,
           java.lang.Boolean descending,
           java.lang.Long cacheHint) {
           this.querySetName = querySetName;
           this.clusterName = clusterName;
           this.memoryLimitLow = memoryLimitLow;
           this.memoryLimitHigh = memoryLimitHigh;
           this.timeLimitLow = timeLimitLow;
           this.timeLimitHigh = timeLimitHigh;
           this.warnTimeLimitLow = warnTimeLimitLow;
           this.warnTimeLimitHigh = warnTimeLimitHigh;
           this.priorityLow = priorityLow;
           this.priorityHigh = priorityHigh;
           this.pageSize = pageSize;
           this.pageStartFrom = pageStartFrom;
           this.sortby = sortby;
           this.descending = descending;
           this.cacheHint = cacheHint;
    }


    /**
     * Gets the querySetName value for this WUListQueries.
     * 
     * @return querySetName
     */
    public java.lang.String getQuerySetName() {
        return querySetName;
    }


    /**
     * Sets the querySetName value for this WUListQueries.
     * 
     * @param querySetName
     */
    public void setQuerySetName(java.lang.String querySetName) {
        this.querySetName = querySetName;
    }


    /**
     * Gets the clusterName value for this WUListQueries.
     * 
     * @return clusterName
     */
    public java.lang.String getClusterName() {
        return clusterName;
    }


    /**
     * Sets the clusterName value for this WUListQueries.
     * 
     * @param clusterName
     */
    public void setClusterName(java.lang.String clusterName) {
        this.clusterName = clusterName;
    }


    /**
     * Gets the memoryLimitLow value for this WUListQueries.
     * 
     * @return memoryLimitLow
     */
    public java.lang.Long getMemoryLimitLow() {
        return memoryLimitLow;
    }


    /**
     * Sets the memoryLimitLow value for this WUListQueries.
     * 
     * @param memoryLimitLow
     */
    public void setMemoryLimitLow(java.lang.Long memoryLimitLow) {
        this.memoryLimitLow = memoryLimitLow;
    }


    /**
     * Gets the memoryLimitHigh value for this WUListQueries.
     * 
     * @return memoryLimitHigh
     */
    public java.lang.Long getMemoryLimitHigh() {
        return memoryLimitHigh;
    }


    /**
     * Sets the memoryLimitHigh value for this WUListQueries.
     * 
     * @param memoryLimitHigh
     */
    public void setMemoryLimitHigh(java.lang.Long memoryLimitHigh) {
        this.memoryLimitHigh = memoryLimitHigh;
    }


    /**
     * Gets the timeLimitLow value for this WUListQueries.
     * 
     * @return timeLimitLow
     */
    public org.apache.axis.types.NonNegativeInteger getTimeLimitLow() {
        return timeLimitLow;
    }


    /**
     * Sets the timeLimitLow value for this WUListQueries.
     * 
     * @param timeLimitLow
     */
    public void setTimeLimitLow(org.apache.axis.types.NonNegativeInteger timeLimitLow) {
        this.timeLimitLow = timeLimitLow;
    }


    /**
     * Gets the timeLimitHigh value for this WUListQueries.
     * 
     * @return timeLimitHigh
     */
    public org.apache.axis.types.NonNegativeInteger getTimeLimitHigh() {
        return timeLimitHigh;
    }


    /**
     * Sets the timeLimitHigh value for this WUListQueries.
     * 
     * @param timeLimitHigh
     */
    public void setTimeLimitHigh(org.apache.axis.types.NonNegativeInteger timeLimitHigh) {
        this.timeLimitHigh = timeLimitHigh;
    }


    /**
     * Gets the warnTimeLimitLow value for this WUListQueries.
     * 
     * @return warnTimeLimitLow
     */
    public org.apache.axis.types.NonNegativeInteger getWarnTimeLimitLow() {
        return warnTimeLimitLow;
    }


    /**
     * Sets the warnTimeLimitLow value for this WUListQueries.
     * 
     * @param warnTimeLimitLow
     */
    public void setWarnTimeLimitLow(org.apache.axis.types.NonNegativeInteger warnTimeLimitLow) {
        this.warnTimeLimitLow = warnTimeLimitLow;
    }


    /**
     * Gets the warnTimeLimitHigh value for this WUListQueries.
     * 
     * @return warnTimeLimitHigh
     */
    public org.apache.axis.types.NonNegativeInteger getWarnTimeLimitHigh() {
        return warnTimeLimitHigh;
    }


    /**
     * Sets the warnTimeLimitHigh value for this WUListQueries.
     * 
     * @param warnTimeLimitHigh
     */
    public void setWarnTimeLimitHigh(org.apache.axis.types.NonNegativeInteger warnTimeLimitHigh) {
        this.warnTimeLimitHigh = warnTimeLimitHigh;
    }


    /**
     * Gets the priorityLow value for this WUListQueries.
     * 
     * @return priorityLow
     */
    public org.apache.axis.types.NonNegativeInteger getPriorityLow() {
        return priorityLow;
    }


    /**
     * Sets the priorityLow value for this WUListQueries.
     * 
     * @param priorityLow
     */
    public void setPriorityLow(org.apache.axis.types.NonNegativeInteger priorityLow) {
        this.priorityLow = priorityLow;
    }


    /**
     * Gets the priorityHigh value for this WUListQueries.
     * 
     * @return priorityHigh
     */
    public org.apache.axis.types.NonNegativeInteger getPriorityHigh() {
        return priorityHigh;
    }


    /**
     * Sets the priorityHigh value for this WUListQueries.
     * 
     * @param priorityHigh
     */
    public void setPriorityHigh(org.apache.axis.types.NonNegativeInteger priorityHigh) {
        this.priorityHigh = priorityHigh;
    }


    /**
     * Gets the pageSize value for this WUListQueries.
     * 
     * @return pageSize
     */
    public org.apache.axis.types.NonNegativeInteger getPageSize() {
        return pageSize;
    }


    /**
     * Sets the pageSize value for this WUListQueries.
     * 
     * @param pageSize
     */
    public void setPageSize(org.apache.axis.types.NonNegativeInteger pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * Gets the pageStartFrom value for this WUListQueries.
     * 
     * @return pageStartFrom
     */
    public org.apache.axis.types.NonNegativeInteger getPageStartFrom() {
        return pageStartFrom;
    }


    /**
     * Sets the pageStartFrom value for this WUListQueries.
     * 
     * @param pageStartFrom
     */
    public void setPageStartFrom(org.apache.axis.types.NonNegativeInteger pageStartFrom) {
        this.pageStartFrom = pageStartFrom;
    }


    /**
     * Gets the sortby value for this WUListQueries.
     * 
     * @return sortby
     */
    public java.lang.String getSortby() {
        return sortby;
    }


    /**
     * Sets the sortby value for this WUListQueries.
     * 
     * @param sortby
     */
    public void setSortby(java.lang.String sortby) {
        this.sortby = sortby;
    }


    /**
     * Gets the descending value for this WUListQueries.
     * 
     * @return descending
     */
    public java.lang.Boolean getDescending() {
        return descending;
    }


    /**
     * Sets the descending value for this WUListQueries.
     * 
     * @param descending
     */
    public void setDescending(java.lang.Boolean descending) {
        this.descending = descending;
    }


    /**
     * Gets the cacheHint value for this WUListQueries.
     * 
     * @return cacheHint
     */
    public java.lang.Long getCacheHint() {
        return cacheHint;
    }


    /**
     * Sets the cacheHint value for this WUListQueries.
     * 
     * @param cacheHint
     */
    public void setCacheHint(java.lang.Long cacheHint) {
        this.cacheHint = cacheHint;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WUListQueries)) return false;
        WUListQueries other = (WUListQueries) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.querySetName==null && other.getQuerySetName()==null) || 
             (this.querySetName!=null &&
              this.querySetName.equals(other.getQuerySetName()))) &&
            ((this.clusterName==null && other.getClusterName()==null) || 
             (this.clusterName!=null &&
              this.clusterName.equals(other.getClusterName()))) &&
            ((this.memoryLimitLow==null && other.getMemoryLimitLow()==null) || 
             (this.memoryLimitLow!=null &&
              this.memoryLimitLow.equals(other.getMemoryLimitLow()))) &&
            ((this.memoryLimitHigh==null && other.getMemoryLimitHigh()==null) || 
             (this.memoryLimitHigh!=null &&
              this.memoryLimitHigh.equals(other.getMemoryLimitHigh()))) &&
            ((this.timeLimitLow==null && other.getTimeLimitLow()==null) || 
             (this.timeLimitLow!=null &&
              this.timeLimitLow.equals(other.getTimeLimitLow()))) &&
            ((this.timeLimitHigh==null && other.getTimeLimitHigh()==null) || 
             (this.timeLimitHigh!=null &&
              this.timeLimitHigh.equals(other.getTimeLimitHigh()))) &&
            ((this.warnTimeLimitLow==null && other.getWarnTimeLimitLow()==null) || 
             (this.warnTimeLimitLow!=null &&
              this.warnTimeLimitLow.equals(other.getWarnTimeLimitLow()))) &&
            ((this.warnTimeLimitHigh==null && other.getWarnTimeLimitHigh()==null) || 
             (this.warnTimeLimitHigh!=null &&
              this.warnTimeLimitHigh.equals(other.getWarnTimeLimitHigh()))) &&
            ((this.priorityLow==null && other.getPriorityLow()==null) || 
             (this.priorityLow!=null &&
              this.priorityLow.equals(other.getPriorityLow()))) &&
            ((this.priorityHigh==null && other.getPriorityHigh()==null) || 
             (this.priorityHigh!=null &&
              this.priorityHigh.equals(other.getPriorityHigh()))) &&
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
        if (getQuerySetName() != null) {
            _hashCode += getQuerySetName().hashCode();
        }
        if (getClusterName() != null) {
            _hashCode += getClusterName().hashCode();
        }
        if (getMemoryLimitLow() != null) {
            _hashCode += getMemoryLimitLow().hashCode();
        }
        if (getMemoryLimitHigh() != null) {
            _hashCode += getMemoryLimitHigh().hashCode();
        }
        if (getTimeLimitLow() != null) {
            _hashCode += getTimeLimitLow().hashCode();
        }
        if (getTimeLimitHigh() != null) {
            _hashCode += getTimeLimitHigh().hashCode();
        }
        if (getWarnTimeLimitLow() != null) {
            _hashCode += getWarnTimeLimitLow().hashCode();
        }
        if (getWarnTimeLimitHigh() != null) {
            _hashCode += getWarnTimeLimitHigh().hashCode();
        }
        if (getPriorityLow() != null) {
            _hashCode += getPriorityLow().hashCode();
        }
        if (getPriorityHigh() != null) {
            _hashCode += getPriorityHigh().hashCode();
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
        new org.apache.axis.description.TypeDesc(WUListQueries.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WUListQueries"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("querySetName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ClusterName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memoryLimitLow");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "MemoryLimitLow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memoryLimitHigh");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "MemoryLimitHigh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeLimitLow");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "TimeLimitLow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeLimitHigh");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "TimeLimitHigh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warnTimeLimitLow");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WarnTimeLimitLow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warnTimeLimitHigh");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WarnTimeLimitHigh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorityLow");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PriorityLow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priorityHigh");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PriorityHigh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PageSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageStartFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PageStartFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
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

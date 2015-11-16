/**
 * WULightWeightQuery.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_56;

public class WULightWeightQuery  implements java.io.Serializable {
    private java.lang.String wuid;

    private java.lang.String type;

    private java.lang.String cluster;

    private java.lang.String owner;

    private java.lang.String jobName;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String state;

    private org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ApplicationValue[] applicationValues;

    private java.lang.Long pageStartFrom;

    private org.apache.axis.types.UnsignedInt pageSize;

    private java.lang.String sortBy;

    private java.lang.Boolean descending;

    private java.lang.Long cacheHint;

    public WULightWeightQuery() {
    }

    public WULightWeightQuery(
           java.lang.String wuid,
           java.lang.String type,
           java.lang.String cluster,
           java.lang.String owner,
           java.lang.String jobName,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String state,
           org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ApplicationValue[] applicationValues,
           java.lang.Long pageStartFrom,
           org.apache.axis.types.UnsignedInt pageSize,
           java.lang.String sortBy,
           java.lang.Boolean descending,
           java.lang.Long cacheHint) {
           this.wuid = wuid;
           this.type = type;
           this.cluster = cluster;
           this.owner = owner;
           this.jobName = jobName;
           this.startDate = startDate;
           this.endDate = endDate;
           this.state = state;
           this.applicationValues = applicationValues;
           this.pageStartFrom = pageStartFrom;
           this.pageSize = pageSize;
           this.sortBy = sortBy;
           this.descending = descending;
           this.cacheHint = cacheHint;
    }


    /**
     * Gets the wuid value for this WULightWeightQuery.
     * 
     * @return wuid
     */
    public java.lang.String getWuid() {
        return wuid;
    }


    /**
     * Sets the wuid value for this WULightWeightQuery.
     * 
     * @param wuid
     */
    public void setWuid(java.lang.String wuid) {
        this.wuid = wuid;
    }


    /**
     * Gets the type value for this WULightWeightQuery.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this WULightWeightQuery.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the cluster value for this WULightWeightQuery.
     * 
     * @return cluster
     */
    public java.lang.String getCluster() {
        return cluster;
    }


    /**
     * Sets the cluster value for this WULightWeightQuery.
     * 
     * @param cluster
     */
    public void setCluster(java.lang.String cluster) {
        this.cluster = cluster;
    }


    /**
     * Gets the owner value for this WULightWeightQuery.
     * 
     * @return owner
     */
    public java.lang.String getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this WULightWeightQuery.
     * 
     * @param owner
     */
    public void setOwner(java.lang.String owner) {
        this.owner = owner;
    }


    /**
     * Gets the jobName value for this WULightWeightQuery.
     * 
     * @return jobName
     */
    public java.lang.String getJobName() {
        return jobName;
    }


    /**
     * Sets the jobName value for this WULightWeightQuery.
     * 
     * @param jobName
     */
    public void setJobName(java.lang.String jobName) {
        this.jobName = jobName;
    }


    /**
     * Gets the startDate value for this WULightWeightQuery.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this WULightWeightQuery.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this WULightWeightQuery.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this WULightWeightQuery.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the state value for this WULightWeightQuery.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this WULightWeightQuery.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the applicationValues value for this WULightWeightQuery.
     * 
     * @return applicationValues
     */
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ApplicationValue[] getApplicationValues() {
        return applicationValues;
    }


    /**
     * Sets the applicationValues value for this WULightWeightQuery.
     * 
     * @param applicationValues
     */
    public void setApplicationValues(org.hpccsystems.ws.client.gen.wsworkunits.v1_56.ApplicationValue[] applicationValues) {
        this.applicationValues = applicationValues;
    }


    /**
     * Gets the pageStartFrom value for this WULightWeightQuery.
     * 
     * @return pageStartFrom
     */
    public java.lang.Long getPageStartFrom() {
        return pageStartFrom;
    }


    /**
     * Sets the pageStartFrom value for this WULightWeightQuery.
     * 
     * @param pageStartFrom
     */
    public void setPageStartFrom(java.lang.Long pageStartFrom) {
        this.pageStartFrom = pageStartFrom;
    }


    /**
     * Gets the pageSize value for this WULightWeightQuery.
     * 
     * @return pageSize
     */
    public org.apache.axis.types.UnsignedInt getPageSize() {
        return pageSize;
    }


    /**
     * Sets the pageSize value for this WULightWeightQuery.
     * 
     * @param pageSize
     */
    public void setPageSize(org.apache.axis.types.UnsignedInt pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * Gets the sortBy value for this WULightWeightQuery.
     * 
     * @return sortBy
     */
    public java.lang.String getSortBy() {
        return sortBy;
    }


    /**
     * Sets the sortBy value for this WULightWeightQuery.
     * 
     * @param sortBy
     */
    public void setSortBy(java.lang.String sortBy) {
        this.sortBy = sortBy;
    }


    /**
     * Gets the descending value for this WULightWeightQuery.
     * 
     * @return descending
     */
    public java.lang.Boolean getDescending() {
        return descending;
    }


    /**
     * Sets the descending value for this WULightWeightQuery.
     * 
     * @param descending
     */
    public void setDescending(java.lang.Boolean descending) {
        this.descending = descending;
    }


    /**
     * Gets the cacheHint value for this WULightWeightQuery.
     * 
     * @return cacheHint
     */
    public java.lang.Long getCacheHint() {
        return cacheHint;
    }


    /**
     * Sets the cacheHint value for this WULightWeightQuery.
     * 
     * @param cacheHint
     */
    public void setCacheHint(java.lang.Long cacheHint) {
        this.cacheHint = cacheHint;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WULightWeightQuery)) return false;
        WULightWeightQuery other = (WULightWeightQuery) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wuid==null && other.getWuid()==null) || 
             (this.wuid!=null &&
              this.wuid.equals(other.getWuid()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.cluster==null && other.getCluster()==null) || 
             (this.cluster!=null &&
              this.cluster.equals(other.getCluster()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.jobName==null && other.getJobName()==null) || 
             (this.jobName!=null &&
              this.jobName.equals(other.getJobName()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.applicationValues==null && other.getApplicationValues()==null) || 
             (this.applicationValues!=null &&
              java.util.Arrays.equals(this.applicationValues, other.getApplicationValues()))) &&
            ((this.pageStartFrom==null && other.getPageStartFrom()==null) || 
             (this.pageStartFrom!=null &&
              this.pageStartFrom.equals(other.getPageStartFrom()))) &&
            ((this.pageSize==null && other.getPageSize()==null) || 
             (this.pageSize!=null &&
              this.pageSize.equals(other.getPageSize()))) &&
            ((this.sortBy==null && other.getSortBy()==null) || 
             (this.sortBy!=null &&
              this.sortBy.equals(other.getSortBy()))) &&
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
        if (getWuid() != null) {
            _hashCode += getWuid().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getCluster() != null) {
            _hashCode += getCluster().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getJobName() != null) {
            _hashCode += getJobName().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getApplicationValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApplicationValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApplicationValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPageStartFrom() != null) {
            _hashCode += getPageStartFrom().hashCode();
        }
        if (getPageSize() != null) {
            _hashCode += getPageSize().hashCode();
        }
        if (getSortBy() != null) {
            _hashCode += getSortBy().hashCode();
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
        new org.apache.axis.description.TypeDesc(WULightWeightQuery.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", ">WULightWeightQuery"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Wuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cluster");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Cluster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "JobName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "State"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationValues");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ApplicationValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ApplicationValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ApplicationValue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageStartFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PageStartFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PageSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "SortBy"));
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

/**
 * WUListQueries.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsworkunits.v1_56;

public class WUListQueries  implements java.io.Serializable {
    private java.lang.String querySetName;

    private java.lang.String clusterName;

    private java.lang.String libraryName;

    private java.lang.Long memoryLimitLow;

    private java.lang.Long memoryLimitHigh;

    private org.apache.axis.types.NonNegativeInteger timeLimitLow;

    private org.apache.axis.types.NonNegativeInteger timeLimitHigh;

    private org.apache.axis.types.NonNegativeInteger warnTimeLimitLow;

    private org.apache.axis.types.NonNegativeInteger warnTimeLimitHigh;

    private org.apache.axis.types.NonNegativeInteger priorityLow;

    private org.apache.axis.types.NonNegativeInteger priorityHigh;

    private java.lang.Boolean activated;

    private java.lang.Boolean suspendedByUser;

    private java.lang.String WUID;

    private java.lang.String queryID;

    private java.lang.String queryName;

    private java.lang.String publishedBy;

    private org.apache.axis.types.NonNegativeInteger pageSize;

    private org.apache.axis.types.NonNegativeInteger pageStartFrom;

    private java.lang.String sortby;

    private java.lang.Boolean descending;

    private java.lang.Long cacheHint;

    private java.lang.String fileName;

    private java.lang.Boolean checkAllNodes;

    public WUListQueries() {
    }

    public WUListQueries(
           java.lang.String querySetName,
           java.lang.String clusterName,
           java.lang.String libraryName,
           java.lang.Long memoryLimitLow,
           java.lang.Long memoryLimitHigh,
           org.apache.axis.types.NonNegativeInteger timeLimitLow,
           org.apache.axis.types.NonNegativeInteger timeLimitHigh,
           org.apache.axis.types.NonNegativeInteger warnTimeLimitLow,
           org.apache.axis.types.NonNegativeInteger warnTimeLimitHigh,
           org.apache.axis.types.NonNegativeInteger priorityLow,
           org.apache.axis.types.NonNegativeInteger priorityHigh,
           java.lang.Boolean activated,
           java.lang.Boolean suspendedByUser,
           java.lang.String WUID,
           java.lang.String queryID,
           java.lang.String queryName,
           java.lang.String publishedBy,
           org.apache.axis.types.NonNegativeInteger pageSize,
           org.apache.axis.types.NonNegativeInteger pageStartFrom,
           java.lang.String sortby,
           java.lang.Boolean descending,
           java.lang.Long cacheHint,
           java.lang.String fileName,
           java.lang.Boolean checkAllNodes) {
           this.querySetName = querySetName;
           this.clusterName = clusterName;
           this.libraryName = libraryName;
           this.memoryLimitLow = memoryLimitLow;
           this.memoryLimitHigh = memoryLimitHigh;
           this.timeLimitLow = timeLimitLow;
           this.timeLimitHigh = timeLimitHigh;
           this.warnTimeLimitLow = warnTimeLimitLow;
           this.warnTimeLimitHigh = warnTimeLimitHigh;
           this.priorityLow = priorityLow;
           this.priorityHigh = priorityHigh;
           this.activated = activated;
           this.suspendedByUser = suspendedByUser;
           this.WUID = WUID;
           this.queryID = queryID;
           this.queryName = queryName;
           this.publishedBy = publishedBy;
           this.pageSize = pageSize;
           this.pageStartFrom = pageStartFrom;
           this.sortby = sortby;
           this.descending = descending;
           this.cacheHint = cacheHint;
           this.fileName = fileName;
           this.checkAllNodes = checkAllNodes;
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
     * Gets the libraryName value for this WUListQueries.
     * 
     * @return libraryName
     */
    public java.lang.String getLibraryName() {
        return libraryName;
    }


    /**
     * Sets the libraryName value for this WUListQueries.
     * 
     * @param libraryName
     */
    public void setLibraryName(java.lang.String libraryName) {
        this.libraryName = libraryName;
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
     * Gets the activated value for this WUListQueries.
     * 
     * @return activated
     */
    public java.lang.Boolean getActivated() {
        return activated;
    }


    /**
     * Sets the activated value for this WUListQueries.
     * 
     * @param activated
     */
    public void setActivated(java.lang.Boolean activated) {
        this.activated = activated;
    }


    /**
     * Gets the suspendedByUser value for this WUListQueries.
     * 
     * @return suspendedByUser
     */
    public java.lang.Boolean getSuspendedByUser() {
        return suspendedByUser;
    }


    /**
     * Sets the suspendedByUser value for this WUListQueries.
     * 
     * @param suspendedByUser
     */
    public void setSuspendedByUser(java.lang.Boolean suspendedByUser) {
        this.suspendedByUser = suspendedByUser;
    }


    /**
     * Gets the WUID value for this WUListQueries.
     * 
     * @return WUID
     */
    public java.lang.String getWUID() {
        return WUID;
    }


    /**
     * Sets the WUID value for this WUListQueries.
     * 
     * @param WUID
     */
    public void setWUID(java.lang.String WUID) {
        this.WUID = WUID;
    }


    /**
     * Gets the queryID value for this WUListQueries.
     * 
     * @return queryID
     */
    public java.lang.String getQueryID() {
        return queryID;
    }


    /**
     * Sets the queryID value for this WUListQueries.
     * 
     * @param queryID
     */
    public void setQueryID(java.lang.String queryID) {
        this.queryID = queryID;
    }


    /**
     * Gets the queryName value for this WUListQueries.
     * 
     * @return queryName
     */
    public java.lang.String getQueryName() {
        return queryName;
    }


    /**
     * Sets the queryName value for this WUListQueries.
     * 
     * @param queryName
     */
    public void setQueryName(java.lang.String queryName) {
        this.queryName = queryName;
    }


    /**
     * Gets the publishedBy value for this WUListQueries.
     * 
     * @return publishedBy
     */
    public java.lang.String getPublishedBy() {
        return publishedBy;
    }


    /**
     * Sets the publishedBy value for this WUListQueries.
     * 
     * @param publishedBy
     */
    public void setPublishedBy(java.lang.String publishedBy) {
        this.publishedBy = publishedBy;
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


    /**
     * Gets the fileName value for this WUListQueries.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this WUListQueries.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the checkAllNodes value for this WUListQueries.
     * 
     * @return checkAllNodes
     */
    public java.lang.Boolean getCheckAllNodes() {
        return checkAllNodes;
    }


    /**
     * Sets the checkAllNodes value for this WUListQueries.
     * 
     * @param checkAllNodes
     */
    public void setCheckAllNodes(java.lang.Boolean checkAllNodes) {
        this.checkAllNodes = checkAllNodes;
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
            ((this.libraryName==null && other.getLibraryName()==null) || 
             (this.libraryName!=null &&
              this.libraryName.equals(other.getLibraryName()))) &&
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
            ((this.activated==null && other.getActivated()==null) || 
             (this.activated!=null &&
              this.activated.equals(other.getActivated()))) &&
            ((this.suspendedByUser==null && other.getSuspendedByUser()==null) || 
             (this.suspendedByUser!=null &&
              this.suspendedByUser.equals(other.getSuspendedByUser()))) &&
            ((this.WUID==null && other.getWUID()==null) || 
             (this.WUID!=null &&
              this.WUID.equals(other.getWUID()))) &&
            ((this.queryID==null && other.getQueryID()==null) || 
             (this.queryID!=null &&
              this.queryID.equals(other.getQueryID()))) &&
            ((this.queryName==null && other.getQueryName()==null) || 
             (this.queryName!=null &&
              this.queryName.equals(other.getQueryName()))) &&
            ((this.publishedBy==null && other.getPublishedBy()==null) || 
             (this.publishedBy!=null &&
              this.publishedBy.equals(other.getPublishedBy()))) &&
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
              this.cacheHint.equals(other.getCacheHint()))) &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.checkAllNodes==null && other.getCheckAllNodes()==null) || 
             (this.checkAllNodes!=null &&
              this.checkAllNodes.equals(other.getCheckAllNodes())));
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
        if (getLibraryName() != null) {
            _hashCode += getLibraryName().hashCode();
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
        if (getActivated() != null) {
            _hashCode += getActivated().hashCode();
        }
        if (getSuspendedByUser() != null) {
            _hashCode += getSuspendedByUser().hashCode();
        }
        if (getWUID() != null) {
            _hashCode += getWUID().hashCode();
        }
        if (getQueryID() != null) {
            _hashCode += getQueryID().hashCode();
        }
        if (getQueryName() != null) {
            _hashCode += getQueryName().hashCode();
        }
        if (getPublishedBy() != null) {
            _hashCode += getPublishedBy().hashCode();
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
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getCheckAllNodes() != null) {
            _hashCode += getCheckAllNodes().hashCode();
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
        elemField.setFieldName("libraryName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LibraryName"));
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
        elemField.setFieldName("activated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Activated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspendedByUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "SuspendedByUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("WUID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QueryID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QueryName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publishedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PublishedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "FileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkAllNodes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "CheckAllNodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

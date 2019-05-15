/**
 * DFUQueryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsdfu.v1_51;

public class DFUQueryResponse  implements java.io.Serializable {
    private org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException exceptions;

    private org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFULogicalFile[] DFULogicalFiles;

    private java.lang.String prefix;

    private java.lang.String nodeGroup;

    private java.lang.String logicalName;

    private java.lang.String description;

    private java.lang.String owner;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String fileType;

    private java.lang.Long fileSizeFrom;

    private java.lang.Long fileSizeTo;

    private java.lang.Integer firstN;

    private java.lang.Integer pageSize;

    private java.lang.Long pageStartFrom;

    private java.lang.Long lastPageFrom;

    private java.lang.Long pageEndAt;

    private java.lang.Long prevPageFrom;

    private java.lang.Long nextPageFrom;

    private java.lang.Long numFiles;

    private java.lang.String sortby;

    private java.lang.Boolean descending;

    private java.lang.String basicQuery;

    private java.lang.String parametersForPaging;

    private java.lang.String filters;

    private java.lang.Long cacheHint;

    private java.lang.Boolean isSubsetOfFiles;

    private java.lang.String warning;

    public DFUQueryResponse() {
    }

    public DFUQueryResponse(
           org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException exceptions,
           org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFULogicalFile[] DFULogicalFiles,
           java.lang.String prefix,
           java.lang.String nodeGroup,
           java.lang.String logicalName,
           java.lang.String description,
           java.lang.String owner,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String fileType,
           java.lang.Long fileSizeFrom,
           java.lang.Long fileSizeTo,
           java.lang.Integer firstN,
           java.lang.Integer pageSize,
           java.lang.Long pageStartFrom,
           java.lang.Long lastPageFrom,
           java.lang.Long pageEndAt,
           java.lang.Long prevPageFrom,
           java.lang.Long nextPageFrom,
           java.lang.Long numFiles,
           java.lang.String sortby,
           java.lang.Boolean descending,
           java.lang.String basicQuery,
           java.lang.String parametersForPaging,
           java.lang.String filters,
           java.lang.Long cacheHint,
           java.lang.Boolean isSubsetOfFiles,
           java.lang.String warning) {
           this.exceptions = exceptions;
           this.DFULogicalFiles = DFULogicalFiles;
           this.prefix = prefix;
           this.nodeGroup = nodeGroup;
           this.logicalName = logicalName;
           this.description = description;
           this.owner = owner;
           this.startDate = startDate;
           this.endDate = endDate;
           this.fileType = fileType;
           this.fileSizeFrom = fileSizeFrom;
           this.fileSizeTo = fileSizeTo;
           this.firstN = firstN;
           this.pageSize = pageSize;
           this.pageStartFrom = pageStartFrom;
           this.lastPageFrom = lastPageFrom;
           this.pageEndAt = pageEndAt;
           this.prevPageFrom = prevPageFrom;
           this.nextPageFrom = nextPageFrom;
           this.numFiles = numFiles;
           this.sortby = sortby;
           this.descending = descending;
           this.basicQuery = basicQuery;
           this.parametersForPaging = parametersForPaging;
           this.filters = filters;
           this.cacheHint = cacheHint;
           this.isSubsetOfFiles = isSubsetOfFiles;
           this.warning = warning;
    }


    /**
     * Gets the exceptions value for this DFUQueryResponse.
     * 
     * @return exceptions
     */
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException getExceptions() {
        return exceptions;
    }


    /**
     * Sets the exceptions value for this DFUQueryResponse.
     * 
     * @param exceptions
     */
    public void setExceptions(org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException exceptions) {
        this.exceptions = exceptions;
    }


    /**
     * Gets the DFULogicalFiles value for this DFUQueryResponse.
     * 
     * @return DFULogicalFiles
     */
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFULogicalFile[] getDFULogicalFiles() {
        return DFULogicalFiles;
    }


    /**
     * Sets the DFULogicalFiles value for this DFUQueryResponse.
     * 
     * @param DFULogicalFiles
     */
    public void setDFULogicalFiles(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFULogicalFile[] DFULogicalFiles) {
        this.DFULogicalFiles = DFULogicalFiles;
    }


    /**
     * Gets the prefix value for this DFUQueryResponse.
     * 
     * @return prefix
     */
    public java.lang.String getPrefix() {
        return prefix;
    }


    /**
     * Sets the prefix value for this DFUQueryResponse.
     * 
     * @param prefix
     */
    public void setPrefix(java.lang.String prefix) {
        this.prefix = prefix;
    }


    /**
     * Gets the nodeGroup value for this DFUQueryResponse.
     * 
     * @return nodeGroup
     */
    public java.lang.String getNodeGroup() {
        return nodeGroup;
    }


    /**
     * Sets the nodeGroup value for this DFUQueryResponse.
     * 
     * @param nodeGroup
     */
    public void setNodeGroup(java.lang.String nodeGroup) {
        this.nodeGroup = nodeGroup;
    }


    /**
     * Gets the logicalName value for this DFUQueryResponse.
     * 
     * @return logicalName
     */
    public java.lang.String getLogicalName() {
        return logicalName;
    }


    /**
     * Sets the logicalName value for this DFUQueryResponse.
     * 
     * @param logicalName
     */
    public void setLogicalName(java.lang.String logicalName) {
        this.logicalName = logicalName;
    }


    /**
     * Gets the description value for this DFUQueryResponse.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this DFUQueryResponse.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the owner value for this DFUQueryResponse.
     * 
     * @return owner
     */
    public java.lang.String getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this DFUQueryResponse.
     * 
     * @param owner
     */
    public void setOwner(java.lang.String owner) {
        this.owner = owner;
    }


    /**
     * Gets the startDate value for this DFUQueryResponse.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this DFUQueryResponse.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this DFUQueryResponse.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this DFUQueryResponse.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the fileType value for this DFUQueryResponse.
     * 
     * @return fileType
     */
    public java.lang.String getFileType() {
        return fileType;
    }


    /**
     * Sets the fileType value for this DFUQueryResponse.
     * 
     * @param fileType
     */
    public void setFileType(java.lang.String fileType) {
        this.fileType = fileType;
    }


    /**
     * Gets the fileSizeFrom value for this DFUQueryResponse.
     * 
     * @return fileSizeFrom
     */
    public java.lang.Long getFileSizeFrom() {
        return fileSizeFrom;
    }


    /**
     * Sets the fileSizeFrom value for this DFUQueryResponse.
     * 
     * @param fileSizeFrom
     */
    public void setFileSizeFrom(java.lang.Long fileSizeFrom) {
        this.fileSizeFrom = fileSizeFrom;
    }


    /**
     * Gets the fileSizeTo value for this DFUQueryResponse.
     * 
     * @return fileSizeTo
     */
    public java.lang.Long getFileSizeTo() {
        return fileSizeTo;
    }


    /**
     * Sets the fileSizeTo value for this DFUQueryResponse.
     * 
     * @param fileSizeTo
     */
    public void setFileSizeTo(java.lang.Long fileSizeTo) {
        this.fileSizeTo = fileSizeTo;
    }


    /**
     * Gets the firstN value for this DFUQueryResponse.
     * 
     * @return firstN
     */
    public java.lang.Integer getFirstN() {
        return firstN;
    }


    /**
     * Sets the firstN value for this DFUQueryResponse.
     * 
     * @param firstN
     */
    public void setFirstN(java.lang.Integer firstN) {
        this.firstN = firstN;
    }


    /**
     * Gets the pageSize value for this DFUQueryResponse.
     * 
     * @return pageSize
     */
    public java.lang.Integer getPageSize() {
        return pageSize;
    }


    /**
     * Sets the pageSize value for this DFUQueryResponse.
     * 
     * @param pageSize
     */
    public void setPageSize(java.lang.Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * Gets the pageStartFrom value for this DFUQueryResponse.
     * 
     * @return pageStartFrom
     */
    public java.lang.Long getPageStartFrom() {
        return pageStartFrom;
    }


    /**
     * Sets the pageStartFrom value for this DFUQueryResponse.
     * 
     * @param pageStartFrom
     */
    public void setPageStartFrom(java.lang.Long pageStartFrom) {
        this.pageStartFrom = pageStartFrom;
    }


    /**
     * Gets the lastPageFrom value for this DFUQueryResponse.
     * 
     * @return lastPageFrom
     */
    public java.lang.Long getLastPageFrom() {
        return lastPageFrom;
    }


    /**
     * Sets the lastPageFrom value for this DFUQueryResponse.
     * 
     * @param lastPageFrom
     */
    public void setLastPageFrom(java.lang.Long lastPageFrom) {
        this.lastPageFrom = lastPageFrom;
    }


    /**
     * Gets the pageEndAt value for this DFUQueryResponse.
     * 
     * @return pageEndAt
     */
    public java.lang.Long getPageEndAt() {
        return pageEndAt;
    }


    /**
     * Sets the pageEndAt value for this DFUQueryResponse.
     * 
     * @param pageEndAt
     */
    public void setPageEndAt(java.lang.Long pageEndAt) {
        this.pageEndAt = pageEndAt;
    }


    /**
     * Gets the prevPageFrom value for this DFUQueryResponse.
     * 
     * @return prevPageFrom
     */
    public java.lang.Long getPrevPageFrom() {
        return prevPageFrom;
    }


    /**
     * Sets the prevPageFrom value for this DFUQueryResponse.
     * 
     * @param prevPageFrom
     */
    public void setPrevPageFrom(java.lang.Long prevPageFrom) {
        this.prevPageFrom = prevPageFrom;
    }


    /**
     * Gets the nextPageFrom value for this DFUQueryResponse.
     * 
     * @return nextPageFrom
     */
    public java.lang.Long getNextPageFrom() {
        return nextPageFrom;
    }


    /**
     * Sets the nextPageFrom value for this DFUQueryResponse.
     * 
     * @param nextPageFrom
     */
    public void setNextPageFrom(java.lang.Long nextPageFrom) {
        this.nextPageFrom = nextPageFrom;
    }


    /**
     * Gets the numFiles value for this DFUQueryResponse.
     * 
     * @return numFiles
     */
    public java.lang.Long getNumFiles() {
        return numFiles;
    }


    /**
     * Sets the numFiles value for this DFUQueryResponse.
     * 
     * @param numFiles
     */
    public void setNumFiles(java.lang.Long numFiles) {
        this.numFiles = numFiles;
    }


    /**
     * Gets the sortby value for this DFUQueryResponse.
     * 
     * @return sortby
     */
    public java.lang.String getSortby() {
        return sortby;
    }


    /**
     * Sets the sortby value for this DFUQueryResponse.
     * 
     * @param sortby
     */
    public void setSortby(java.lang.String sortby) {
        this.sortby = sortby;
    }


    /**
     * Gets the descending value for this DFUQueryResponse.
     * 
     * @return descending
     */
    public java.lang.Boolean getDescending() {
        return descending;
    }


    /**
     * Sets the descending value for this DFUQueryResponse.
     * 
     * @param descending
     */
    public void setDescending(java.lang.Boolean descending) {
        this.descending = descending;
    }


    /**
     * Gets the basicQuery value for this DFUQueryResponse.
     * 
     * @return basicQuery
     */
    public java.lang.String getBasicQuery() {
        return basicQuery;
    }


    /**
     * Sets the basicQuery value for this DFUQueryResponse.
     * 
     * @param basicQuery
     */
    public void setBasicQuery(java.lang.String basicQuery) {
        this.basicQuery = basicQuery;
    }


    /**
     * Gets the parametersForPaging value for this DFUQueryResponse.
     * 
     * @return parametersForPaging
     */
    public java.lang.String getParametersForPaging() {
        return parametersForPaging;
    }


    /**
     * Sets the parametersForPaging value for this DFUQueryResponse.
     * 
     * @param parametersForPaging
     */
    public void setParametersForPaging(java.lang.String parametersForPaging) {
        this.parametersForPaging = parametersForPaging;
    }


    /**
     * Gets the filters value for this DFUQueryResponse.
     * 
     * @return filters
     */
    public java.lang.String getFilters() {
        return filters;
    }


    /**
     * Sets the filters value for this DFUQueryResponse.
     * 
     * @param filters
     */
    public void setFilters(java.lang.String filters) {
        this.filters = filters;
    }


    /**
     * Gets the cacheHint value for this DFUQueryResponse.
     * 
     * @return cacheHint
     */
    public java.lang.Long getCacheHint() {
        return cacheHint;
    }


    /**
     * Sets the cacheHint value for this DFUQueryResponse.
     * 
     * @param cacheHint
     */
    public void setCacheHint(java.lang.Long cacheHint) {
        this.cacheHint = cacheHint;
    }


    /**
     * Gets the isSubsetOfFiles value for this DFUQueryResponse.
     * 
     * @return isSubsetOfFiles
     */
    public java.lang.Boolean getIsSubsetOfFiles() {
        return isSubsetOfFiles;
    }


    /**
     * Sets the isSubsetOfFiles value for this DFUQueryResponse.
     * 
     * @param isSubsetOfFiles
     */
    public void setIsSubsetOfFiles(java.lang.Boolean isSubsetOfFiles) {
        this.isSubsetOfFiles = isSubsetOfFiles;
    }


    /**
     * Gets the warning value for this DFUQueryResponse.
     * 
     * @return warning
     */
    public java.lang.String getWarning() {
        return warning;
    }


    /**
     * Sets the warning value for this DFUQueryResponse.
     * 
     * @param warning
     */
    public void setWarning(java.lang.String warning) {
        this.warning = warning;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DFUQueryResponse)) return false;
        DFUQueryResponse other = (DFUQueryResponse) obj;
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
            ((this.DFULogicalFiles==null && other.getDFULogicalFiles()==null) || 
             (this.DFULogicalFiles!=null &&
              java.util.Arrays.equals(this.DFULogicalFiles, other.getDFULogicalFiles()))) &&
            ((this.prefix==null && other.getPrefix()==null) || 
             (this.prefix!=null &&
              this.prefix.equals(other.getPrefix()))) &&
            ((this.nodeGroup==null && other.getNodeGroup()==null) || 
             (this.nodeGroup!=null &&
              this.nodeGroup.equals(other.getNodeGroup()))) &&
            ((this.logicalName==null && other.getLogicalName()==null) || 
             (this.logicalName!=null &&
              this.logicalName.equals(other.getLogicalName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.fileType==null && other.getFileType()==null) || 
             (this.fileType!=null &&
              this.fileType.equals(other.getFileType()))) &&
            ((this.fileSizeFrom==null && other.getFileSizeFrom()==null) || 
             (this.fileSizeFrom!=null &&
              this.fileSizeFrom.equals(other.getFileSizeFrom()))) &&
            ((this.fileSizeTo==null && other.getFileSizeTo()==null) || 
             (this.fileSizeTo!=null &&
              this.fileSizeTo.equals(other.getFileSizeTo()))) &&
            ((this.firstN==null && other.getFirstN()==null) || 
             (this.firstN!=null &&
              this.firstN.equals(other.getFirstN()))) &&
            ((this.pageSize==null && other.getPageSize()==null) || 
             (this.pageSize!=null &&
              this.pageSize.equals(other.getPageSize()))) &&
            ((this.pageStartFrom==null && other.getPageStartFrom()==null) || 
             (this.pageStartFrom!=null &&
              this.pageStartFrom.equals(other.getPageStartFrom()))) &&
            ((this.lastPageFrom==null && other.getLastPageFrom()==null) || 
             (this.lastPageFrom!=null &&
              this.lastPageFrom.equals(other.getLastPageFrom()))) &&
            ((this.pageEndAt==null && other.getPageEndAt()==null) || 
             (this.pageEndAt!=null &&
              this.pageEndAt.equals(other.getPageEndAt()))) &&
            ((this.prevPageFrom==null && other.getPrevPageFrom()==null) || 
             (this.prevPageFrom!=null &&
              this.prevPageFrom.equals(other.getPrevPageFrom()))) &&
            ((this.nextPageFrom==null && other.getNextPageFrom()==null) || 
             (this.nextPageFrom!=null &&
              this.nextPageFrom.equals(other.getNextPageFrom()))) &&
            ((this.numFiles==null && other.getNumFiles()==null) || 
             (this.numFiles!=null &&
              this.numFiles.equals(other.getNumFiles()))) &&
            ((this.sortby==null && other.getSortby()==null) || 
             (this.sortby!=null &&
              this.sortby.equals(other.getSortby()))) &&
            ((this.descending==null && other.getDescending()==null) || 
             (this.descending!=null &&
              this.descending.equals(other.getDescending()))) &&
            ((this.basicQuery==null && other.getBasicQuery()==null) || 
             (this.basicQuery!=null &&
              this.basicQuery.equals(other.getBasicQuery()))) &&
            ((this.parametersForPaging==null && other.getParametersForPaging()==null) || 
             (this.parametersForPaging!=null &&
              this.parametersForPaging.equals(other.getParametersForPaging()))) &&
            ((this.filters==null && other.getFilters()==null) || 
             (this.filters!=null &&
              this.filters.equals(other.getFilters()))) &&
            ((this.cacheHint==null && other.getCacheHint()==null) || 
             (this.cacheHint!=null &&
              this.cacheHint.equals(other.getCacheHint()))) &&
            ((this.isSubsetOfFiles==null && other.getIsSubsetOfFiles()==null) || 
             (this.isSubsetOfFiles!=null &&
              this.isSubsetOfFiles.equals(other.getIsSubsetOfFiles()))) &&
            ((this.warning==null && other.getWarning()==null) || 
             (this.warning!=null &&
              this.warning.equals(other.getWarning())));
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
        if (getDFULogicalFiles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDFULogicalFiles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDFULogicalFiles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrefix() != null) {
            _hashCode += getPrefix().hashCode();
        }
        if (getNodeGroup() != null) {
            _hashCode += getNodeGroup().hashCode();
        }
        if (getLogicalName() != null) {
            _hashCode += getLogicalName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getFileType() != null) {
            _hashCode += getFileType().hashCode();
        }
        if (getFileSizeFrom() != null) {
            _hashCode += getFileSizeFrom().hashCode();
        }
        if (getFileSizeTo() != null) {
            _hashCode += getFileSizeTo().hashCode();
        }
        if (getFirstN() != null) {
            _hashCode += getFirstN().hashCode();
        }
        if (getPageSize() != null) {
            _hashCode += getPageSize().hashCode();
        }
        if (getPageStartFrom() != null) {
            _hashCode += getPageStartFrom().hashCode();
        }
        if (getLastPageFrom() != null) {
            _hashCode += getLastPageFrom().hashCode();
        }
        if (getPageEndAt() != null) {
            _hashCode += getPageEndAt().hashCode();
        }
        if (getPrevPageFrom() != null) {
            _hashCode += getPrevPageFrom().hashCode();
        }
        if (getNextPageFrom() != null) {
            _hashCode += getNextPageFrom().hashCode();
        }
        if (getNumFiles() != null) {
            _hashCode += getNumFiles().hashCode();
        }
        if (getSortby() != null) {
            _hashCode += getSortby().hashCode();
        }
        if (getDescending() != null) {
            _hashCode += getDescending().hashCode();
        }
        if (getBasicQuery() != null) {
            _hashCode += getBasicQuery().hashCode();
        }
        if (getParametersForPaging() != null) {
            _hashCode += getParametersForPaging().hashCode();
        }
        if (getFilters() != null) {
            _hashCode += getFilters().hashCode();
        }
        if (getCacheHint() != null) {
            _hashCode += getCacheHint().hashCode();
        }
        if (getIsSubsetOfFiles() != null) {
            _hashCode += getIsSubsetOfFiles().hashCode();
        }
        if (getWarning() != null) {
            _hashCode += getWarning().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DFUQueryResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUQueryResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exceptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ArrayOfEspException"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DFULogicalFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFULogicalFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFULogicalFile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFULogicalFile"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Prefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodeGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "NodeGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logicalName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "LogicalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FileType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSizeFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FileSizeFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSizeTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FileSizeTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstN");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FirstN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "PageSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageStartFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "PageStartFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPageFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "LastPageFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageEndAt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "PageEndAt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prevPageFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "PrevPageFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextPageFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "NextPageFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "NumFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortby");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Sortby"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descending");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Descending"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basicQuery");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "BasicQuery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parametersForPaging");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ParametersForPaging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filters");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Filters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cacheHint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "CacheHint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSubsetOfFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "IsSubsetOfFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warning");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Warning"));
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

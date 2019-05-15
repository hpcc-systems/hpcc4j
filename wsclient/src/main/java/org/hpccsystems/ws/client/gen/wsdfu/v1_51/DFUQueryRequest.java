/**
 * DFUQueryRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsdfu.v1_51;

public class DFUQueryRequest  implements java.io.Serializable {
    private java.lang.String prefix;

    private java.lang.String nodeGroup;

    private java.lang.String contentType;

    private java.lang.String logicalName;

    private java.lang.String owner;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String fileType;

    private java.lang.Long fileSizeFrom;

    private java.lang.Long fileSizeTo;

    private java.lang.Integer firstN;

    private java.lang.Integer pageSize;

    private java.lang.Integer pageStartFrom;

    private java.lang.String sortby;

    private java.lang.Boolean descending;

    private java.lang.Boolean oneLevelDirFileReturn;

    private java.lang.Long cacheHint;

    private java.lang.Integer maxNumberOfFiles;

    private java.lang.Boolean includeSuperOwner;

    public DFUQueryRequest() {
    }

    public DFUQueryRequest(
           java.lang.String prefix,
           java.lang.String nodeGroup,
           java.lang.String contentType,
           java.lang.String logicalName,
           java.lang.String owner,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String fileType,
           java.lang.Long fileSizeFrom,
           java.lang.Long fileSizeTo,
           java.lang.Integer firstN,
           java.lang.Integer pageSize,
           java.lang.Integer pageStartFrom,
           java.lang.String sortby,
           java.lang.Boolean descending,
           java.lang.Boolean oneLevelDirFileReturn,
           java.lang.Long cacheHint,
           java.lang.Integer maxNumberOfFiles,
           java.lang.Boolean includeSuperOwner) {
           this.prefix = prefix;
           this.nodeGroup = nodeGroup;
           this.contentType = contentType;
           this.logicalName = logicalName;
           this.owner = owner;
           this.startDate = startDate;
           this.endDate = endDate;
           this.fileType = fileType;
           this.fileSizeFrom = fileSizeFrom;
           this.fileSizeTo = fileSizeTo;
           this.firstN = firstN;
           this.pageSize = pageSize;
           this.pageStartFrom = pageStartFrom;
           this.sortby = sortby;
           this.descending = descending;
           this.oneLevelDirFileReturn = oneLevelDirFileReturn;
           this.cacheHint = cacheHint;
           this.maxNumberOfFiles = maxNumberOfFiles;
           this.includeSuperOwner = includeSuperOwner;
    }


    /**
     * Gets the prefix value for this DFUQueryRequest.
     * 
     * @return prefix
     */
    public java.lang.String getPrefix() {
        return prefix;
    }


    /**
     * Sets the prefix value for this DFUQueryRequest.
     * 
     * @param prefix
     */
    public void setPrefix(java.lang.String prefix) {
        this.prefix = prefix;
    }


    /**
     * Gets the nodeGroup value for this DFUQueryRequest.
     * 
     * @return nodeGroup
     */
    public java.lang.String getNodeGroup() {
        return nodeGroup;
    }


    /**
     * Sets the nodeGroup value for this DFUQueryRequest.
     * 
     * @param nodeGroup
     */
    public void setNodeGroup(java.lang.String nodeGroup) {
        this.nodeGroup = nodeGroup;
    }


    /**
     * Gets the contentType value for this DFUQueryRequest.
     * 
     * @return contentType
     */
    public java.lang.String getContentType() {
        return contentType;
    }


    /**
     * Sets the contentType value for this DFUQueryRequest.
     * 
     * @param contentType
     */
    public void setContentType(java.lang.String contentType) {
        this.contentType = contentType;
    }


    /**
     * Gets the logicalName value for this DFUQueryRequest.
     * 
     * @return logicalName
     */
    public java.lang.String getLogicalName() {
        return logicalName;
    }


    /**
     * Sets the logicalName value for this DFUQueryRequest.
     * 
     * @param logicalName
     */
    public void setLogicalName(java.lang.String logicalName) {
        this.logicalName = logicalName;
    }


    /**
     * Gets the owner value for this DFUQueryRequest.
     * 
     * @return owner
     */
    public java.lang.String getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this DFUQueryRequest.
     * 
     * @param owner
     */
    public void setOwner(java.lang.String owner) {
        this.owner = owner;
    }


    /**
     * Gets the startDate value for this DFUQueryRequest.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this DFUQueryRequest.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this DFUQueryRequest.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this DFUQueryRequest.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the fileType value for this DFUQueryRequest.
     * 
     * @return fileType
     */
    public java.lang.String getFileType() {
        return fileType;
    }


    /**
     * Sets the fileType value for this DFUQueryRequest.
     * 
     * @param fileType
     */
    public void setFileType(java.lang.String fileType) {
        this.fileType = fileType;
    }


    /**
     * Gets the fileSizeFrom value for this DFUQueryRequest.
     * 
     * @return fileSizeFrom
     */
    public java.lang.Long getFileSizeFrom() {
        return fileSizeFrom;
    }


    /**
     * Sets the fileSizeFrom value for this DFUQueryRequest.
     * 
     * @param fileSizeFrom
     */
    public void setFileSizeFrom(java.lang.Long fileSizeFrom) {
        this.fileSizeFrom = fileSizeFrom;
    }


    /**
     * Gets the fileSizeTo value for this DFUQueryRequest.
     * 
     * @return fileSizeTo
     */
    public java.lang.Long getFileSizeTo() {
        return fileSizeTo;
    }


    /**
     * Sets the fileSizeTo value for this DFUQueryRequest.
     * 
     * @param fileSizeTo
     */
    public void setFileSizeTo(java.lang.Long fileSizeTo) {
        this.fileSizeTo = fileSizeTo;
    }


    /**
     * Gets the firstN value for this DFUQueryRequest.
     * 
     * @return firstN
     */
    public java.lang.Integer getFirstN() {
        return firstN;
    }


    /**
     * Sets the firstN value for this DFUQueryRequest.
     * 
     * @param firstN
     */
    public void setFirstN(java.lang.Integer firstN) {
        this.firstN = firstN;
    }


    /**
     * Gets the pageSize value for this DFUQueryRequest.
     * 
     * @return pageSize
     */
    public java.lang.Integer getPageSize() {
        return pageSize;
    }


    /**
     * Sets the pageSize value for this DFUQueryRequest.
     * 
     * @param pageSize
     */
    public void setPageSize(java.lang.Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * Gets the pageStartFrom value for this DFUQueryRequest.
     * 
     * @return pageStartFrom
     */
    public java.lang.Integer getPageStartFrom() {
        return pageStartFrom;
    }


    /**
     * Sets the pageStartFrom value for this DFUQueryRequest.
     * 
     * @param pageStartFrom
     */
    public void setPageStartFrom(java.lang.Integer pageStartFrom) {
        this.pageStartFrom = pageStartFrom;
    }


    /**
     * Gets the sortby value for this DFUQueryRequest.
     * 
     * @return sortby
     */
    public java.lang.String getSortby() {
        return sortby;
    }


    /**
     * Sets the sortby value for this DFUQueryRequest.
     * 
     * @param sortby
     */
    public void setSortby(java.lang.String sortby) {
        this.sortby = sortby;
    }


    /**
     * Gets the descending value for this DFUQueryRequest.
     * 
     * @return descending
     */
    public java.lang.Boolean getDescending() {
        return descending;
    }


    /**
     * Sets the descending value for this DFUQueryRequest.
     * 
     * @param descending
     */
    public void setDescending(java.lang.Boolean descending) {
        this.descending = descending;
    }


    /**
     * Gets the oneLevelDirFileReturn value for this DFUQueryRequest.
     * 
     * @return oneLevelDirFileReturn
     */
    public java.lang.Boolean getOneLevelDirFileReturn() {
        return oneLevelDirFileReturn;
    }


    /**
     * Sets the oneLevelDirFileReturn value for this DFUQueryRequest.
     * 
     * @param oneLevelDirFileReturn
     */
    public void setOneLevelDirFileReturn(java.lang.Boolean oneLevelDirFileReturn) {
        this.oneLevelDirFileReturn = oneLevelDirFileReturn;
    }


    /**
     * Gets the cacheHint value for this DFUQueryRequest.
     * 
     * @return cacheHint
     */
    public java.lang.Long getCacheHint() {
        return cacheHint;
    }


    /**
     * Sets the cacheHint value for this DFUQueryRequest.
     * 
     * @param cacheHint
     */
    public void setCacheHint(java.lang.Long cacheHint) {
        this.cacheHint = cacheHint;
    }


    /**
     * Gets the maxNumberOfFiles value for this DFUQueryRequest.
     * 
     * @return maxNumberOfFiles
     */
    public java.lang.Integer getMaxNumberOfFiles() {
        return maxNumberOfFiles;
    }


    /**
     * Sets the maxNumberOfFiles value for this DFUQueryRequest.
     * 
     * @param maxNumberOfFiles
     */
    public void setMaxNumberOfFiles(java.lang.Integer maxNumberOfFiles) {
        this.maxNumberOfFiles = maxNumberOfFiles;
    }


    /**
     * Gets the includeSuperOwner value for this DFUQueryRequest.
     * 
     * @return includeSuperOwner
     */
    public java.lang.Boolean getIncludeSuperOwner() {
        return includeSuperOwner;
    }


    /**
     * Sets the includeSuperOwner value for this DFUQueryRequest.
     * 
     * @param includeSuperOwner
     */
    public void setIncludeSuperOwner(java.lang.Boolean includeSuperOwner) {
        this.includeSuperOwner = includeSuperOwner;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DFUQueryRequest)) return false;
        DFUQueryRequest other = (DFUQueryRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.prefix==null && other.getPrefix()==null) || 
             (this.prefix!=null &&
              this.prefix.equals(other.getPrefix()))) &&
            ((this.nodeGroup==null && other.getNodeGroup()==null) || 
             (this.nodeGroup!=null &&
              this.nodeGroup.equals(other.getNodeGroup()))) &&
            ((this.contentType==null && other.getContentType()==null) || 
             (this.contentType!=null &&
              this.contentType.equals(other.getContentType()))) &&
            ((this.logicalName==null && other.getLogicalName()==null) || 
             (this.logicalName!=null &&
              this.logicalName.equals(other.getLogicalName()))) &&
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
            ((this.sortby==null && other.getSortby()==null) || 
             (this.sortby!=null &&
              this.sortby.equals(other.getSortby()))) &&
            ((this.descending==null && other.getDescending()==null) || 
             (this.descending!=null &&
              this.descending.equals(other.getDescending()))) &&
            ((this.oneLevelDirFileReturn==null && other.getOneLevelDirFileReturn()==null) || 
             (this.oneLevelDirFileReturn!=null &&
              this.oneLevelDirFileReturn.equals(other.getOneLevelDirFileReturn()))) &&
            ((this.cacheHint==null && other.getCacheHint()==null) || 
             (this.cacheHint!=null &&
              this.cacheHint.equals(other.getCacheHint()))) &&
            ((this.maxNumberOfFiles==null && other.getMaxNumberOfFiles()==null) || 
             (this.maxNumberOfFiles!=null &&
              this.maxNumberOfFiles.equals(other.getMaxNumberOfFiles()))) &&
            ((this.includeSuperOwner==null && other.getIncludeSuperOwner()==null) || 
             (this.includeSuperOwner!=null &&
              this.includeSuperOwner.equals(other.getIncludeSuperOwner())));
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
        if (getPrefix() != null) {
            _hashCode += getPrefix().hashCode();
        }
        if (getNodeGroup() != null) {
            _hashCode += getNodeGroup().hashCode();
        }
        if (getContentType() != null) {
            _hashCode += getContentType().hashCode();
        }
        if (getLogicalName() != null) {
            _hashCode += getLogicalName().hashCode();
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
        if (getSortby() != null) {
            _hashCode += getSortby().hashCode();
        }
        if (getDescending() != null) {
            _hashCode += getDescending().hashCode();
        }
        if (getOneLevelDirFileReturn() != null) {
            _hashCode += getOneLevelDirFileReturn().hashCode();
        }
        if (getCacheHint() != null) {
            _hashCode += getCacheHint().hashCode();
        }
        if (getMaxNumberOfFiles() != null) {
            _hashCode += getMaxNumberOfFiles().hashCode();
        }
        if (getIncludeSuperOwner() != null) {
            _hashCode += getIncludeSuperOwner().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DFUQueryRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", ">DFUQueryRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("contentType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ContentType"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("oneLevelDirFileReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "OneLevelDirFileReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("maxNumberOfFiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "MaxNumberOfFiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeSuperOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "IncludeSuperOwner"));
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

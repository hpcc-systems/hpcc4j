/**
 * DFUQueryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39;


/**
 *  DFUQueryResponse bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class DFUQueryResponse implements org.apache.axis2.databinding.ADBBean {
    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu",
            "DFUQueryResponse", "ns3");

    /**
     * field for Exceptions
     */
    protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfEspException localExceptions;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localExceptionsTracker = false;

    /**
     * field for DFULogicalFiles
     */
    protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFULogicalFile localDFULogicalFiles;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDFULogicalFilesTracker = false;

    /**
     * field for Prefix
     */
    protected java.lang.String localPrefix;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPrefixTracker = false;

    /**
     * field for NodeGroup
     */
    protected java.lang.String localNodeGroup;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNodeGroupTracker = false;

    /**
     * field for LogicalName
     */
    protected java.lang.String localLogicalName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLogicalNameTracker = false;

    /**
     * field for Description
     */
    protected java.lang.String localDescription;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDescriptionTracker = false;

    /**
     * field for Owner
     */
    protected java.lang.String localOwner;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localOwnerTracker = false;

    /**
     * field for StartDate
     */
    protected java.lang.String localStartDate;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localStartDateTracker = false;

    /**
     * field for EndDate
     */
    protected java.lang.String localEndDate;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEndDateTracker = false;

    /**
     * field for FileType
     */
    protected java.lang.String localFileType;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFileTypeTracker = false;

    /**
     * field for FileSizeFrom
     */
    protected long localFileSizeFrom = org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
            "-1");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFileSizeFromTracker = false;

    /**
     * field for FileSizeTo
     */
    protected long localFileSizeTo = org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
            "-1");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFileSizeToTracker = false;

    /**
     * field for FirstN
     */
    protected int localFirstN = org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
            "-1");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFirstNTracker = false;

    /**
     * field for PageSize
     */
    protected int localPageSize = org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
            "20");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPageSizeTracker = false;

    /**
     * field for PageStartFrom
     */
    protected long localPageStartFrom = org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
            "1");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPageStartFromTracker = false;

    /**
     * field for LastPageFrom
     */
    protected long localLastPageFrom = org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
            "-1");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLastPageFromTracker = false;

    /**
     * field for PageEndAt
     */
    protected long localPageEndAt;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPageEndAtTracker = false;

    /**
     * field for PrevPageFrom
     */
    protected long localPrevPageFrom = org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
            "-1");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPrevPageFromTracker = false;

    /**
     * field for NextPageFrom
     */
    protected long localNextPageFrom = org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
            "-1");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNextPageFromTracker = false;

    /**
     * field for NumFiles
     */
    protected long localNumFiles;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNumFilesTracker = false;

    /**
     * field for Sortby
     */
    protected java.lang.String localSortby;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSortbyTracker = false;

    /**
     * field for Descending
     */
    protected boolean localDescending = org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
            "false");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDescendingTracker = false;

    /**
     * field for BasicQuery
     */
    protected java.lang.String localBasicQuery;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBasicQueryTracker = false;

    /**
     * field for ParametersForPaging
     */
    protected java.lang.String localParametersForPaging;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localParametersForPagingTracker = false;

    /**
     * field for Filters
     */
    protected java.lang.String localFilters;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFiltersTracker = false;

    /**
     * field for CacheHint
     */
    protected long localCacheHint;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCacheHintTracker = false;

    /**
     * field for IsSubsetOfFiles
     */
    protected boolean localIsSubsetOfFiles;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIsSubsetOfFilesTracker = false;

    /**
     * field for Warning
     */
    protected java.lang.String localWarning;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localWarningTracker = false;

    public boolean isExceptionsSpecified() {
        return localExceptionsTracker;
    }

    /**
     * Auto generated getter method
     * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfEspException
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfEspException getExceptions() {
        return localExceptions;
    }

    /**
     * Auto generated setter method
     * @param param Exceptions
     */
    public void setExceptions(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfEspException param) {
        localExceptionsTracker = param != null;

        this.localExceptions = param;
    }

    public boolean isDFULogicalFilesSpecified() {
        return localDFULogicalFilesTracker;
    }

    /**
     * Auto generated getter method
     * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFULogicalFile
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFULogicalFile getDFULogicalFiles() {
        return localDFULogicalFiles;
    }

    /**
     * Auto generated setter method
     * @param param DFULogicalFiles
     */
    public void setDFULogicalFiles(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFULogicalFile param) {
        localDFULogicalFilesTracker = param != null;

        this.localDFULogicalFiles = param;
    }

    public boolean isPrefixSpecified() {
        return localPrefixTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPrefix() {
        return localPrefix;
    }

    /**
     * Auto generated setter method
     * @param param Prefix
     */
    public void setPrefix(java.lang.String param) {
        localPrefixTracker = param != null;

        this.localPrefix = param;
    }

    public boolean isNodeGroupSpecified() {
        return localNodeGroupTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNodeGroup() {
        return localNodeGroup;
    }

    /**
     * Auto generated setter method
     * @param param NodeGroup
     */
    public void setNodeGroup(java.lang.String param) {
        localNodeGroupTracker = param != null;

        this.localNodeGroup = param;
    }

    public boolean isLogicalNameSpecified() {
        return localLogicalNameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getLogicalName() {
        return localLogicalName;
    }

    /**
     * Auto generated setter method
     * @param param LogicalName
     */
    public void setLogicalName(java.lang.String param) {
        localLogicalNameTracker = param != null;

        this.localLogicalName = param;
    }

    public boolean isDescriptionSpecified() {
        return localDescriptionTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDescription() {
        return localDescription;
    }

    /**
     * Auto generated setter method
     * @param param Description
     */
    public void setDescription(java.lang.String param) {
        localDescriptionTracker = param != null;

        this.localDescription = param;
    }

    public boolean isOwnerSpecified() {
        return localOwnerTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getOwner() {
        return localOwner;
    }

    /**
     * Auto generated setter method
     * @param param Owner
     */
    public void setOwner(java.lang.String param) {
        localOwnerTracker = param != null;

        this.localOwner = param;
    }

    public boolean isStartDateSpecified() {
        return localStartDateTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getStartDate() {
        return localStartDate;
    }

    /**
     * Auto generated setter method
     * @param param StartDate
     */
    public void setStartDate(java.lang.String param) {
        localStartDateTracker = param != null;

        this.localStartDate = param;
    }

    public boolean isEndDateSpecified() {
        return localEndDateTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getEndDate() {
        return localEndDate;
    }

    /**
     * Auto generated setter method
     * @param param EndDate
     */
    public void setEndDate(java.lang.String param) {
        localEndDateTracker = param != null;

        this.localEndDate = param;
    }

    public boolean isFileTypeSpecified() {
        return localFileTypeTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getFileType() {
        return localFileType;
    }

    /**
     * Auto generated setter method
     * @param param FileType
     */
    public void setFileType(java.lang.String param) {
        localFileTypeTracker = param != null;

        this.localFileType = param;
    }

    public boolean isFileSizeFromSpecified() {
        return localFileSizeFromTracker;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getFileSizeFrom() {
        return localFileSizeFrom;
    }

    /**
     * Auto generated setter method
     * @param param FileSizeFrom
     */
    public void setFileSizeFrom(long param) {
        // setting primitive attribute tracker to true
        localFileSizeFromTracker = param != java.lang.Long.MIN_VALUE;

        this.localFileSizeFrom = param;
    }

    public boolean isFileSizeToSpecified() {
        return localFileSizeToTracker;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getFileSizeTo() {
        return localFileSizeTo;
    }

    /**
     * Auto generated setter method
     * @param param FileSizeTo
     */
    public void setFileSizeTo(long param) {
        // setting primitive attribute tracker to true
        localFileSizeToTracker = param != java.lang.Long.MIN_VALUE;

        this.localFileSizeTo = param;
    }

    public boolean isFirstNSpecified() {
        return localFirstNTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getFirstN() {
        return localFirstN;
    }

    /**
     * Auto generated setter method
     * @param param FirstN
     */
    public void setFirstN(int param) {
        // setting primitive attribute tracker to true
        localFirstNTracker = param != java.lang.Integer.MIN_VALUE;

        this.localFirstN = param;
    }

    public boolean isPageSizeSpecified() {
        return localPageSizeTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getPageSize() {
        return localPageSize;
    }

    /**
     * Auto generated setter method
     * @param param PageSize
     */
    public void setPageSize(int param) {
        // setting primitive attribute tracker to true
        localPageSizeTracker = param != java.lang.Integer.MIN_VALUE;

        this.localPageSize = param;
    }

    public boolean isPageStartFromSpecified() {
        return localPageStartFromTracker;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getPageStartFrom() {
        return localPageStartFrom;
    }

    /**
     * Auto generated setter method
     * @param param PageStartFrom
     */
    public void setPageStartFrom(long param) {
        // setting primitive attribute tracker to true
        localPageStartFromTracker = param != java.lang.Long.MIN_VALUE;

        this.localPageStartFrom = param;
    }

    public boolean isLastPageFromSpecified() {
        return localLastPageFromTracker;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getLastPageFrom() {
        return localLastPageFrom;
    }

    /**
     * Auto generated setter method
     * @param param LastPageFrom
     */
    public void setLastPageFrom(long param) {
        // setting primitive attribute tracker to true
        localLastPageFromTracker = param != java.lang.Long.MIN_VALUE;

        this.localLastPageFrom = param;
    }

    public boolean isPageEndAtSpecified() {
        return localPageEndAtTracker;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getPageEndAt() {
        return localPageEndAt;
    }

    /**
     * Auto generated setter method
     * @param param PageEndAt
     */
    public void setPageEndAt(long param) {
        // setting primitive attribute tracker to true
        localPageEndAtTracker = param != java.lang.Long.MIN_VALUE;

        this.localPageEndAt = param;
    }

    public boolean isPrevPageFromSpecified() {
        return localPrevPageFromTracker;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getPrevPageFrom() {
        return localPrevPageFrom;
    }

    /**
     * Auto generated setter method
     * @param param PrevPageFrom
     */
    public void setPrevPageFrom(long param) {
        // setting primitive attribute tracker to true
        localPrevPageFromTracker = param != java.lang.Long.MIN_VALUE;

        this.localPrevPageFrom = param;
    }

    public boolean isNextPageFromSpecified() {
        return localNextPageFromTracker;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getNextPageFrom() {
        return localNextPageFrom;
    }

    /**
     * Auto generated setter method
     * @param param NextPageFrom
     */
    public void setNextPageFrom(long param) {
        // setting primitive attribute tracker to true
        localNextPageFromTracker = param != java.lang.Long.MIN_VALUE;

        this.localNextPageFrom = param;
    }

    public boolean isNumFilesSpecified() {
        return localNumFilesTracker;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getNumFiles() {
        return localNumFiles;
    }

    /**
     * Auto generated setter method
     * @param param NumFiles
     */
    public void setNumFiles(long param) {
        // setting primitive attribute tracker to true
        localNumFilesTracker = param != java.lang.Long.MIN_VALUE;

        this.localNumFiles = param;
    }

    public boolean isSortbySpecified() {
        return localSortbyTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getSortby() {
        return localSortby;
    }

    /**
     * Auto generated setter method
     * @param param Sortby
     */
    public void setSortby(java.lang.String param) {
        localSortbyTracker = param != null;

        this.localSortby = param;
    }

    public boolean isDescendingSpecified() {
        return localDescendingTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getDescending() {
        return localDescending;
    }

    /**
     * Auto generated setter method
     * @param param Descending
     */
    public void setDescending(boolean param) {
        // setting primitive attribute tracker to true
        localDescendingTracker = true;

        this.localDescending = param;
    }

    public boolean isBasicQuerySpecified() {
        return localBasicQueryTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getBasicQuery() {
        return localBasicQuery;
    }

    /**
     * Auto generated setter method
     * @param param BasicQuery
     */
    public void setBasicQuery(java.lang.String param) {
        localBasicQueryTracker = param != null;

        this.localBasicQuery = param;
    }

    public boolean isParametersForPagingSpecified() {
        return localParametersForPagingTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getParametersForPaging() {
        return localParametersForPaging;
    }

    /**
     * Auto generated setter method
     * @param param ParametersForPaging
     */
    public void setParametersForPaging(java.lang.String param) {
        localParametersForPagingTracker = param != null;

        this.localParametersForPaging = param;
    }

    public boolean isFiltersSpecified() {
        return localFiltersTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getFilters() {
        return localFilters;
    }

    /**
     * Auto generated setter method
     * @param param Filters
     */
    public void setFilters(java.lang.String param) {
        localFiltersTracker = param != null;

        this.localFilters = param;
    }

    public boolean isCacheHintSpecified() {
        return localCacheHintTracker;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getCacheHint() {
        return localCacheHint;
    }

    /**
     * Auto generated setter method
     * @param param CacheHint
     */
    public void setCacheHint(long param) {
        // setting primitive attribute tracker to true
        localCacheHintTracker = param != java.lang.Long.MIN_VALUE;

        this.localCacheHint = param;
    }

    public boolean isIsSubsetOfFilesSpecified() {
        return localIsSubsetOfFilesTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getIsSubsetOfFiles() {
        return localIsSubsetOfFiles;
    }

    /**
     * Auto generated setter method
     * @param param IsSubsetOfFiles
     */
    public void setIsSubsetOfFiles(boolean param) {
        // setting primitive attribute tracker to true
        localIsSubsetOfFilesTracker = true;

        this.localIsSubsetOfFiles = param;
    }

    public boolean isWarningSpecified() {
        return localWarningTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getWarning() {
        return localWarning;
    }

    /**
     * Auto generated setter method
     * @param param Warning
     */
    public void setWarning(java.lang.String param) {
        localWarningTracker = param != null;

        this.localWarning = param;
    }

    /**
     *
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName,
        final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {
        return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                this, MY_QNAME));
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        serialize(parentQName, xmlWriter, false);
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        java.lang.String prefix = null;
        java.lang.String namespace = null;

        prefix = parentQName.getPrefix();
        namespace = parentQName.getNamespaceURI();
        writeStartElement(prefix, namespace, parentQName.getLocalPart(),
            xmlWriter);

        if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                    "urn:hpccsystems:ws:wsdfu");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":DFUQueryResponse", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "DFUQueryResponse", xmlWriter);
            }
        }

        if (localExceptionsTracker) {
            if (localExceptions == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Exceptions cannot be null!!");
            }

            localExceptions.serialize(new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsdfu", "Exceptions"), xmlWriter);
        }

        if (localDFULogicalFilesTracker) {
            if (localDFULogicalFiles == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "DFULogicalFiles cannot be null!!");
            }

            localDFULogicalFiles.serialize(new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsdfu", "DFULogicalFiles"), xmlWriter);
        }

        if (localPrefixTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "Prefix", xmlWriter);

            if (localPrefix == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Prefix cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localPrefix);
            }

            xmlWriter.writeEndElement();
        }

        if (localNodeGroupTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "NodeGroup", xmlWriter);

            if (localNodeGroup == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "NodeGroup cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localNodeGroup);
            }

            xmlWriter.writeEndElement();
        }

        if (localLogicalNameTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "LogicalName", xmlWriter);

            if (localLogicalName == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "LogicalName cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localLogicalName);
            }

            xmlWriter.writeEndElement();
        }

        if (localDescriptionTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "Description", xmlWriter);

            if (localDescription == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Description cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localDescription);
            }

            xmlWriter.writeEndElement();
        }

        if (localOwnerTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "Owner", xmlWriter);

            if (localOwner == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Owner cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localOwner);
            }

            xmlWriter.writeEndElement();
        }

        if (localStartDateTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "StartDate", xmlWriter);

            if (localStartDate == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "StartDate cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localStartDate);
            }

            xmlWriter.writeEndElement();
        }

        if (localEndDateTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "EndDate", xmlWriter);

            if (localEndDate == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "EndDate cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localEndDate);
            }

            xmlWriter.writeEndElement();
        }

        if (localFileTypeTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "FileType", xmlWriter);

            if (localFileType == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "FileType cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localFileType);
            }

            xmlWriter.writeEndElement();
        }

        if (localFileSizeFromTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "FileSizeFrom", xmlWriter);

            if (localFileSizeFrom == java.lang.Long.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "FileSizeFrom cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localFileSizeFrom));
            }

            xmlWriter.writeEndElement();
        }

        if (localFileSizeToTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "FileSizeTo", xmlWriter);

            if (localFileSizeTo == java.lang.Long.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "FileSizeTo cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localFileSizeTo));
            }

            xmlWriter.writeEndElement();
        }

        if (localFirstNTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "FirstN", xmlWriter);

            if (localFirstN == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "FirstN cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localFirstN));
            }

            xmlWriter.writeEndElement();
        }

        if (localPageSizeTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "PageSize", xmlWriter);

            if (localPageSize == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "PageSize cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localPageSize));
            }

            xmlWriter.writeEndElement();
        }

        if (localPageStartFromTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "PageStartFrom", xmlWriter);

            if (localPageStartFrom == java.lang.Long.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "PageStartFrom cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localPageStartFrom));
            }

            xmlWriter.writeEndElement();
        }

        if (localLastPageFromTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "LastPageFrom", xmlWriter);

            if (localLastPageFrom == java.lang.Long.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "LastPageFrom cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localLastPageFrom));
            }

            xmlWriter.writeEndElement();
        }

        if (localPageEndAtTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "PageEndAt", xmlWriter);

            if (localPageEndAt == java.lang.Long.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "PageEndAt cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localPageEndAt));
            }

            xmlWriter.writeEndElement();
        }

        if (localPrevPageFromTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "PrevPageFrom", xmlWriter);

            if (localPrevPageFrom == java.lang.Long.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "PrevPageFrom cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localPrevPageFrom));
            }

            xmlWriter.writeEndElement();
        }

        if (localNextPageFromTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "NextPageFrom", xmlWriter);

            if (localNextPageFrom == java.lang.Long.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "NextPageFrom cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localNextPageFrom));
            }

            xmlWriter.writeEndElement();
        }

        if (localNumFilesTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "NumFiles", xmlWriter);

            if (localNumFiles == java.lang.Long.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "NumFiles cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localNumFiles));
            }

            xmlWriter.writeEndElement();
        }

        if (localSortbyTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "Sortby", xmlWriter);

            if (localSortby == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Sortby cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSortby);
            }

            xmlWriter.writeEndElement();
        }

        if (localDescendingTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "Descending", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Descending cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localDescending));
            }

            xmlWriter.writeEndElement();
        }

        if (localBasicQueryTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "BasicQuery", xmlWriter);

            if (localBasicQuery == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "BasicQuery cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localBasicQuery);
            }

            xmlWriter.writeEndElement();
        }

        if (localParametersForPagingTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "ParametersForPaging", xmlWriter);

            if (localParametersForPaging == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "ParametersForPaging cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localParametersForPaging);
            }

            xmlWriter.writeEndElement();
        }

        if (localFiltersTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "Filters", xmlWriter);

            if (localFilters == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Filters cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localFilters);
            }

            xmlWriter.writeEndElement();
        }

        if (localCacheHintTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "CacheHint", xmlWriter);

            if (localCacheHint == java.lang.Long.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "CacheHint cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localCacheHint));
            }

            xmlWriter.writeEndElement();
        }

        if (localIsSubsetOfFilesTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "IsSubsetOfFiles", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "IsSubsetOfFiles cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localIsSubsetOfFiles));
            }

            xmlWriter.writeEndElement();
        }

        if (localWarningTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "Warning", xmlWriter);

            if (localWarning == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Warning cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localWarning);
            }

            xmlWriter.writeEndElement();
        }

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("urn:hpccsystems:ws:wsdfu")) {
            return "ns3";
        }

        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(java.lang.String prefix,
        java.lang.String namespace, java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
        } else {
            if (namespace.length() == 0) {
                prefix = "";
            } else if (prefix == null) {
                prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(java.lang.String prefix,
        java.lang.String namespace, java.lang.String attName,
        java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
        } else {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
            xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(java.lang.String namespace,
        java.lang.String attName, java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
        } else {
            xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace,
        java.lang.String attName, javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }

        java.lang.String attributeValue;

        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                attributeValue);
        }
    }

    /**
     *  method to handle Qnames
     */
    private void writeQName(javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String namespaceURI = qname.getNamespaceURI();

        if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

            if (prefix == null) {
                prefix = generatePrefix(namespaceURI);
                xmlWriter.writeNamespace(prefix, namespaceURI);
                xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
                xmlWriter.writeCharacters(prefix + ":" +
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            } else {
                // i.e this is the default namespace
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    qname));
        }
    }

    private void writeQNames(javax.xml.namespace.QName[] qnames,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
                if (i > 0) {
                    stringToWrite.append(" ");
                }

                namespaceURI = qnames[i].getNamespaceURI();

                if (namespaceURI != null) {
                    prefix = xmlWriter.getPrefix(namespaceURI);

                    if ((prefix == null) || (prefix.length() == 0)) {
                        prefix = generatePrefix(namespaceURI);
                        xmlWriter.writeNamespace(prefix, namespaceURI);
                        xmlWriter.setPrefix(prefix, namespaceURI);
                    }

                    if (prefix.trim().length() > 0) {
                        stringToWrite.append(prefix).append(":")
                                     .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qnames[i]));
                }
            }

            xmlWriter.writeCharacters(stringToWrite.toString());
        }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String prefix = xmlWriter.getPrefix(namespace);

        if (prefix == null) {
            prefix = generatePrefix(namespace);

            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

            while (true) {
                java.lang.String uri = nsContext.getNamespaceURI(prefix);

                if ((uri == null) || (uri.length() == 0)) {
                    break;
                }

                prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }

            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }

        return prefix;
    }

    /**
     *  Factory class that keeps the parse method
     */
    public static class Factory {
        private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

        /**
         * static method to create the object
         * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
         *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
         * Postcondition: If this object is an element, the reader is positioned at its end element
         *                If this object is a complex type, the reader is positioned at the end element of its outer element
         */
        public static DFUQueryResponse parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            DFUQueryResponse object = new DFUQueryResponse();

            int event;
            javax.xml.namespace.QName currentQName = null;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";

            try {
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                currentQName = reader.getName();

                if (reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                    java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "type");

                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;

                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0,
                                    fullTypeName.indexOf(":"));
                        }

                        nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                        java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                    ":") + 1);

                        if (!"DFUQueryResponse".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (DFUQueryResponse) org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                while (!reader.isEndElement()) {
                    if (reader.isStartElement()) {
                        if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "Exceptions").equals(
                                    reader.getName())) {
                            object.setExceptions(org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfEspException.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu",
                                    "DFULogicalFiles").equals(reader.getName())) {
                            object.setDFULogicalFiles(org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFULogicalFile.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "Prefix").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Prefix" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setPrefix(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "NodeGroup").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "NodeGroup" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setNodeGroup(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "LogicalName").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "LogicalName" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setLogicalName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "Description").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Description" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setDescription(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "Owner").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Owner" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setOwner(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "StartDate").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "StartDate" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setStartDate(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "EndDate").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "EndDate" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setEndDate(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "FileType").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "FileType" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setFileType(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "FileSizeFrom").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "FileSizeFrom" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setFileSizeFrom(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "FileSizeTo").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "FileSizeTo" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setFileSizeTo(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "FirstN").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "FirstN" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setFirstN(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "PageSize").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "PageSize" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setPageSize(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "PageStartFrom").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "PageStartFrom" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setPageStartFrom(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "LastPageFrom").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "LastPageFrom" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setLastPageFrom(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "PageEndAt").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "PageEndAt" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setPageEndAt(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "PrevPageFrom").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "PrevPageFrom" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setPrevPageFrom(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "NextPageFrom").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "NextPageFrom" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setNextPageFrom(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "NumFiles").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "NumFiles" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setNumFiles(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "Sortby").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Sortby" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setSortby(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "Descending").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Descending" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setDescending(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "BasicQuery").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "BasicQuery" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setBasicQuery(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu",
                                    "ParametersForPaging").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "ParametersForPaging" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setParametersForPaging(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "Filters").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Filters" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setFilters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "CacheHint").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "CacheHint" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setCacheHint(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu",
                                    "IsSubsetOfFiles").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "IsSubsetOfFiles" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setIsSubsetOfFiles(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "Warning").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Warning" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setWarning(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else {
                            // 3 - A start element we are not expecting indicates an invalid parameter was passed
                            throw new org.apache.axis2.databinding.ADBException(
                                "Unexpected subelement " + reader.getName());
                        }
                    } else {
                        reader.next();
                    }
                } // end of while loop
            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }
    } //end of factory class
}

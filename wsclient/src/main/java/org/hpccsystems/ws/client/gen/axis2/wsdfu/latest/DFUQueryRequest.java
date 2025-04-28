/**
 * DFUQueryRequest.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsdfu.latest;

/** DFUQueryRequest bean class */
@SuppressWarnings({"unchecked", "unused"})
public class DFUQueryRequest implements org.apache.axis2.databinding.ADBBean {

  public static final javax.xml.namespace.QName MY_QNAME =
      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUQueryRequest", "ns1");

  /** field for Prefix */
  protected java.lang.String localPrefix;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPrefixTracker = false;

  public boolean isPrefixSpecified() {
    return localPrefixTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getPrefix() {
    return localPrefix;
  }

  /**
   * Auto generated setter method
   *
   * @param param Prefix
   */
  public void setPrefix(java.lang.String param) {
    localPrefixTracker = param != null;

    this.localPrefix = param;
  }

  /** field for NodeGroup */
  protected java.lang.String localNodeGroup;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localNodeGroupTracker = false;

  public boolean isNodeGroupSpecified() {
    return localNodeGroupTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getNodeGroup() {
    return localNodeGroup;
  }

  /**
   * Auto generated setter method
   *
   * @param param NodeGroup
   */
  public void setNodeGroup(java.lang.String param) {
    localNodeGroupTracker = param != null;

    this.localNodeGroup = param;
  }

  /** field for ContentType */
  protected java.lang.String localContentType;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localContentTypeTracker = false;

  public boolean isContentTypeSpecified() {
    return localContentTypeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getContentType() {
    return localContentType;
  }

  /**
   * Auto generated setter method
   *
   * @param param ContentType
   */
  public void setContentType(java.lang.String param) {
    localContentTypeTracker = param != null;

    this.localContentType = param;
  }

  /** field for InvertContent */
  protected boolean localInvertContent;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localInvertContentTracker = false;

  public boolean isInvertContentSpecified() {
    return localInvertContentTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getInvertContent() {
    return localInvertContent;
  }

  /**
   * Auto generated setter method
   *
   * @param param InvertContent
   */
  public void setInvertContent(boolean param) {

    // setting primitive attribute tracker to true
    localInvertContentTracker = true;

    this.localInvertContent = param;
  }

  /** field for LogicalName */
  protected java.lang.String localLogicalName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localLogicalNameTracker = false;

  public boolean isLogicalNameSpecified() {
    return localLogicalNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getLogicalName() {
    return localLogicalName;
  }

  /**
   * Auto generated setter method
   *
   * @param param LogicalName
   */
  public void setLogicalName(java.lang.String param) {
    localLogicalNameTracker = param != null;

    this.localLogicalName = param;
  }

  /** field for Owner */
  protected java.lang.String localOwner;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localOwnerTracker = false;

  public boolean isOwnerSpecified() {
    return localOwnerTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getOwner() {
    return localOwner;
  }

  /**
   * Auto generated setter method
   *
   * @param param Owner
   */
  public void setOwner(java.lang.String param) {
    localOwnerTracker = param != null;

    this.localOwner = param;
  }

  /** field for StartDate */
  protected java.lang.String localStartDate;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localStartDateTracker = false;

  public boolean isStartDateSpecified() {
    return localStartDateTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getStartDate() {
    return localStartDate;
  }

  /**
   * Auto generated setter method
   *
   * @param param StartDate
   */
  public void setStartDate(java.lang.String param) {
    localStartDateTracker = param != null;

    this.localStartDate = param;
  }

  /** field for EndDate */
  protected java.lang.String localEndDate;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localEndDateTracker = false;

  public boolean isEndDateSpecified() {
    return localEndDateTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getEndDate() {
    return localEndDate;
  }

  /**
   * Auto generated setter method
   *
   * @param param EndDate
   */
  public void setEndDate(java.lang.String param) {
    localEndDateTracker = param != null;

    this.localEndDate = param;
  }

  /** field for FileType */
  protected java.lang.String localFileType;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localFileTypeTracker = false;

  public boolean isFileTypeSpecified() {
    return localFileTypeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getFileType() {
    return localFileType;
  }

  /**
   * Auto generated setter method
   *
   * @param param FileType
   */
  public void setFileType(java.lang.String param) {
    localFileTypeTracker = param != null;

    this.localFileType = param;
  }

  /** field for FileSizeFrom */
  protected long localFileSizeFrom =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToLong("-1");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localFileSizeFromTracker = false;

  public boolean isFileSizeFromSpecified() {
    return localFileSizeFromTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getFileSizeFrom() {
    return localFileSizeFrom;
  }

  /**
   * Auto generated setter method
   *
   * @param param FileSizeFrom
   */
  public void setFileSizeFrom(long param) {

    // setting primitive attribute tracker to true
    localFileSizeFromTracker = param != java.lang.Long.MIN_VALUE;

    this.localFileSizeFrom = param;
  }

  /** field for FileSizeTo */
  protected long localFileSizeTo =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToLong("-1");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localFileSizeToTracker = false;

  public boolean isFileSizeToSpecified() {
    return localFileSizeToTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getFileSizeTo() {
    return localFileSizeTo;
  }

  /**
   * Auto generated setter method
   *
   * @param param FileSizeTo
   */
  public void setFileSizeTo(long param) {

    // setting primitive attribute tracker to true
    localFileSizeToTracker = param != java.lang.Long.MIN_VALUE;

    this.localFileSizeTo = param;
  }

  /** field for FirstN */
  protected int localFirstN = org.apache.axis2.databinding.utils.ConverterUtil.convertToInt("-1");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localFirstNTracker = false;

  public boolean isFirstNSpecified() {
    return localFirstNTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getFirstN() {
    return localFirstN;
  }

  /**
   * Auto generated setter method
   *
   * @param param FirstN
   */
  public void setFirstN(int param) {

    // setting primitive attribute tracker to true
    localFirstNTracker = param != java.lang.Integer.MIN_VALUE;

    this.localFirstN = param;
  }

  /** field for PageSize */
  protected int localPageSize;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPageSizeTracker = false;

  public boolean isPageSizeSpecified() {
    return localPageSizeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getPageSize() {
    return localPageSize;
  }

  /**
   * Auto generated setter method
   *
   * @param param PageSize
   */
  public void setPageSize(int param) {

    // setting primitive attribute tracker to true
    localPageSizeTracker = param != java.lang.Integer.MIN_VALUE;

    this.localPageSize = param;
  }

  /** field for PageStartFrom */
  protected int localPageStartFrom;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPageStartFromTracker = false;

  public boolean isPageStartFromSpecified() {
    return localPageStartFromTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getPageStartFrom() {
    return localPageStartFrom;
  }

  /**
   * Auto generated setter method
   *
   * @param param PageStartFrom
   */
  public void setPageStartFrom(int param) {

    // setting primitive attribute tracker to true
    localPageStartFromTracker = param != java.lang.Integer.MIN_VALUE;

    this.localPageStartFrom = param;
  }

  /** field for Sortby */
  protected java.lang.String localSortby;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSortbyTracker = false;

  public boolean isSortbySpecified() {
    return localSortbyTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getSortby() {
    return localSortby;
  }

  /**
   * Auto generated setter method
   *
   * @param param Sortby
   */
  public void setSortby(java.lang.String param) {
    localSortbyTracker = param != null;

    this.localSortby = param;
  }

  /** field for Descending */
  protected boolean localDescending =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDescendingTracker = false;

  public boolean isDescendingSpecified() {
    return localDescendingTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getDescending() {
    return localDescending;
  }

  /**
   * Auto generated setter method
   *
   * @param param Descending
   */
  public void setDescending(boolean param) {

    // setting primitive attribute tracker to true
    localDescendingTracker = true;

    this.localDescending = param;
  }

  /** field for OneLevelDirFileReturn */
  protected boolean localOneLevelDirFileReturn =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localOneLevelDirFileReturnTracker = false;

  public boolean isOneLevelDirFileReturnSpecified() {
    return localOneLevelDirFileReturnTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getOneLevelDirFileReturn() {
    return localOneLevelDirFileReturn;
  }

  /**
   * Auto generated setter method
   *
   * @param param OneLevelDirFileReturn
   */
  public void setOneLevelDirFileReturn(boolean param) {

    // setting primitive attribute tracker to true
    localOneLevelDirFileReturnTracker = true;

    this.localOneLevelDirFileReturn = param;
  }

  /** field for CacheHint */
  protected long localCacheHint;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localCacheHintTracker = false;

  public boolean isCacheHintSpecified() {
    return localCacheHintTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getCacheHint() {
    return localCacheHint;
  }

  /**
   * Auto generated setter method
   *
   * @param param CacheHint
   */
  public void setCacheHint(long param) {

    // setting primitive attribute tracker to true
    localCacheHintTracker = param != java.lang.Long.MIN_VALUE;

    this.localCacheHint = param;
  }

  /** field for MaxNumberOfFiles */
  protected int localMaxNumberOfFiles;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localMaxNumberOfFilesTracker = false;

  public boolean isMaxNumberOfFilesSpecified() {
    return localMaxNumberOfFilesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getMaxNumberOfFiles() {
    return localMaxNumberOfFiles;
  }

  /**
   * Auto generated setter method
   *
   * @param param MaxNumberOfFiles
   */
  public void setMaxNumberOfFiles(int param) {

    // setting primitive attribute tracker to true
    localMaxNumberOfFilesTracker = param != java.lang.Integer.MIN_VALUE;

    this.localMaxNumberOfFiles = param;
  }

  /** field for IncludeSuperOwner */
  protected boolean localIncludeSuperOwner;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIncludeSuperOwnerTracker = false;

  public boolean isIncludeSuperOwnerSpecified() {
    return localIncludeSuperOwnerTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getIncludeSuperOwner() {
    return localIncludeSuperOwner;
  }

  /**
   * Auto generated setter method
   *
   * @param param IncludeSuperOwner
   */
  public void setIncludeSuperOwner(boolean param) {

    // setting primitive attribute tracker to true
    localIncludeSuperOwnerTracker = true;

    this.localIncludeSuperOwner = param;
  }

  /** field for StartAccessedTime */
  protected java.lang.String localStartAccessedTime;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localStartAccessedTimeTracker = false;

  public boolean isStartAccessedTimeSpecified() {
    return localStartAccessedTimeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getStartAccessedTime() {
    return localStartAccessedTime;
  }

  /**
   * Auto generated setter method
   *
   * @param param StartAccessedTime
   */
  public void setStartAccessedTime(java.lang.String param) {
    localStartAccessedTimeTracker = param != null;

    this.localStartAccessedTime = param;
  }

  /** field for EndAccessedTime */
  protected java.lang.String localEndAccessedTime;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localEndAccessedTimeTracker = false;

  public boolean isEndAccessedTimeSpecified() {
    return localEndAccessedTimeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getEndAccessedTime() {
    return localEndAccessedTime;
  }

  /**
   * Auto generated setter method
   *
   * @param param EndAccessedTime
   */
  public void setEndAccessedTime(java.lang.String param) {
    localEndAccessedTimeTracker = param != null;

    this.localEndAccessedTime = param;
  }

  /** field for MaxSkewFrom */
  protected long localMaxSkewFrom;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localMaxSkewFromTracker = false;

  public boolean isMaxSkewFromSpecified() {
    return localMaxSkewFromTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getMaxSkewFrom() {
    return localMaxSkewFrom;
  }

  /**
   * Auto generated setter method
   *
   * @param param MaxSkewFrom
   */
  public void setMaxSkewFrom(long param) {

    // setting primitive attribute tracker to true
    localMaxSkewFromTracker = param != java.lang.Long.MIN_VALUE;

    this.localMaxSkewFrom = param;
  }

  /** field for MaxSkewTo */
  protected long localMaxSkewTo;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localMaxSkewToTracker = false;

  public boolean isMaxSkewToSpecified() {
    return localMaxSkewToTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getMaxSkewTo() {
    return localMaxSkewTo;
  }

  /**
   * Auto generated setter method
   *
   * @param param MaxSkewTo
   */
  public void setMaxSkewTo(long param) {

    // setting primitive attribute tracker to true
    localMaxSkewToTracker = param != java.lang.Long.MIN_VALUE;

    this.localMaxSkewTo = param;
  }

  /** field for MinSkewFrom */
  protected long localMinSkewFrom;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localMinSkewFromTracker = false;

  public boolean isMinSkewFromSpecified() {
    return localMinSkewFromTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getMinSkewFrom() {
    return localMinSkewFrom;
  }

  /**
   * Auto generated setter method
   *
   * @param param MinSkewFrom
   */
  public void setMinSkewFrom(long param) {

    // setting primitive attribute tracker to true
    localMinSkewFromTracker = param != java.lang.Long.MIN_VALUE;

    this.localMinSkewFrom = param;
  }

  /** field for MinSkewTo */
  protected long localMinSkewTo;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localMinSkewToTracker = false;

  public boolean isMinSkewToSpecified() {
    return localMinSkewToTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getMinSkewTo() {
    return localMinSkewTo;
  }

  /**
   * Auto generated setter method
   *
   * @param param MinSkewTo
   */
  public void setMinSkewTo(long param) {

    // setting primitive attribute tracker to true
    localMinSkewToTracker = param != java.lang.Long.MIN_VALUE;

    this.localMinSkewTo = param;
  }

  /**
   * @param parentQName
   * @param factory
   * @return org.apache.axiom.om.OMElement
   */
  public org.apache.axiom.om.OMElement getOMElement(
      final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
      throws org.apache.axis2.databinding.ADBException {

    return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
  }

  public void serialize(
      final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
      throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
    serialize(parentQName, xmlWriter, false);
  }

  public void serialize(
      final javax.xml.namespace.QName parentQName,
      javax.xml.stream.XMLStreamWriter xmlWriter,
      boolean serializeType)
      throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

    java.lang.String prefix = null;
    java.lang.String namespace = null;

    prefix = parentQName.getPrefix();
    namespace = parentQName.getNamespaceURI();
    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

    if (serializeType) {

      java.lang.String namespacePrefix = registerPrefix(xmlWriter, "urn:hpccsystems:ws:wsdfu");
      if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            namespacePrefix + ":DFUQueryRequest",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            "DFUQueryRequest",
            xmlWriter);
      }
    }
    if (localPrefixTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "Prefix", xmlWriter);

      if (localPrefix == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Prefix cannot be null!!");

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

        throw new org.apache.axis2.databinding.ADBException("NodeGroup cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localNodeGroup);
      }

      xmlWriter.writeEndElement();
    }
    if (localContentTypeTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "ContentType", xmlWriter);

      if (localContentType == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ContentType cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localContentType);
      }

      xmlWriter.writeEndElement();
    }
    if (localInvertContentTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "InvertContent", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("InvertContent cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInvertContent));
      }

      xmlWriter.writeEndElement();
    }
    if (localLogicalNameTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "LogicalName", xmlWriter);

      if (localLogicalName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("LogicalName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localLogicalName);
      }

      xmlWriter.writeEndElement();
    }
    if (localOwnerTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "Owner", xmlWriter);

      if (localOwner == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Owner cannot be null!!");

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

        throw new org.apache.axis2.databinding.ADBException("StartDate cannot be null!!");

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

        throw new org.apache.axis2.databinding.ADBException("EndDate cannot be null!!");

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

        throw new org.apache.axis2.databinding.ADBException("FileType cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localFileType);
      }

      xmlWriter.writeEndElement();
    }
    if (localFileSizeFromTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "FileSizeFrom", xmlWriter);

      if (localFileSizeFrom == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("FileSizeFrom cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFileSizeFrom));
      }

      xmlWriter.writeEndElement();
    }
    if (localFileSizeToTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "FileSizeTo", xmlWriter);

      if (localFileSizeTo == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("FileSizeTo cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFileSizeTo));
      }

      xmlWriter.writeEndElement();
    }
    if (localFirstNTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "FirstN", xmlWriter);

      if (localFirstN == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("FirstN cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFirstN));
      }

      xmlWriter.writeEndElement();
    }
    if (localPageSizeTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "PageSize", xmlWriter);

      if (localPageSize == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("PageSize cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPageSize));
      }

      xmlWriter.writeEndElement();
    }
    if (localPageStartFromTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "PageStartFrom", xmlWriter);

      if (localPageStartFrom == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("PageStartFrom cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPageStartFrom));
      }

      xmlWriter.writeEndElement();
    }
    if (localSortbyTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "Sortby", xmlWriter);

      if (localSortby == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Sortby cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSortby);
      }

      xmlWriter.writeEndElement();
    }
    if (localDescendingTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "Descending", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("Descending cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescending));
      }

      xmlWriter.writeEndElement();
    }
    if (localOneLevelDirFileReturnTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "OneLevelDirFileReturn", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException(
            "OneLevelDirFileReturn cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localOneLevelDirFileReturn));
      }

      xmlWriter.writeEndElement();
    }
    if (localCacheHintTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "CacheHint", xmlWriter);

      if (localCacheHint == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("CacheHint cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCacheHint));
      }

      xmlWriter.writeEndElement();
    }
    if (localMaxNumberOfFilesTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "MaxNumberOfFiles", xmlWriter);

      if (localMaxNumberOfFiles == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("MaxNumberOfFiles cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localMaxNumberOfFiles));
      }

      xmlWriter.writeEndElement();
    }
    if (localIncludeSuperOwnerTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "IncludeSuperOwner", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("IncludeSuperOwner cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localIncludeSuperOwner));
      }

      xmlWriter.writeEndElement();
    }
    if (localStartAccessedTimeTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "StartAccessedTime", xmlWriter);

      if (localStartAccessedTime == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("StartAccessedTime cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localStartAccessedTime);
      }

      xmlWriter.writeEndElement();
    }
    if (localEndAccessedTimeTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "EndAccessedTime", xmlWriter);

      if (localEndAccessedTime == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("EndAccessedTime cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localEndAccessedTime);
      }

      xmlWriter.writeEndElement();
    }
    if (localMaxSkewFromTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "MaxSkewFrom", xmlWriter);

      if (localMaxSkewFrom == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("MaxSkewFrom cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxSkewFrom));
      }

      xmlWriter.writeEndElement();
    }
    if (localMaxSkewToTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "MaxSkewTo", xmlWriter);

      if (localMaxSkewTo == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("MaxSkewTo cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxSkewTo));
      }

      xmlWriter.writeEndElement();
    }
    if (localMinSkewFromTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "MinSkewFrom", xmlWriter);

      if (localMinSkewFrom == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("MinSkewFrom cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMinSkewFrom));
      }

      xmlWriter.writeEndElement();
    }
    if (localMinSkewToTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "MinSkewTo", xmlWriter);

      if (localMinSkewTo == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("MinSkewTo cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMinSkewTo));
      }

      xmlWriter.writeEndElement();
    }
    xmlWriter.writeEndElement();
  }

  private static java.lang.String generatePrefix(java.lang.String namespace) {
    if (namespace.equals("urn:hpccsystems:ws:wsdfu")) {
      return "ns1";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
  }

  /** Utility method to write an element start tag. */
  private void writeStartElement(
      java.lang.String prefix,
      java.lang.String namespace,
      java.lang.String localPart,
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

  /** Util method to write an attribute with the ns prefix */
  private void writeAttribute(
      java.lang.String prefix,
      java.lang.String namespace,
      java.lang.String attName,
      java.lang.String attValue,
      javax.xml.stream.XMLStreamWriter xmlWriter)
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

  /** Util method to write an attribute without the ns prefix */
  private void writeAttribute(
      java.lang.String namespace,
      java.lang.String attName,
      java.lang.String attValue,
      javax.xml.stream.XMLStreamWriter xmlWriter)
      throws javax.xml.stream.XMLStreamException {
    if (namespace.equals("")) {
      xmlWriter.writeAttribute(attName, attValue);
    } else {
      xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
    }
  }

  /** Util method to write an attribute without the ns prefix */
  private void writeQNameAttribute(
      java.lang.String namespace,
      java.lang.String attName,
      javax.xml.namespace.QName qname,
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
      xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
    }
  }
  /** method to handle Qnames */
  private void writeQName(
      javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
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
        xmlWriter.writeCharacters(
            prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      } else {
        // i.e this is the default namespace
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }

    } else {
      xmlWriter.writeCharacters(
          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
  }

  private void writeQNames(
      javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
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
            stringToWrite
                .append(prefix)
                .append(":")
                .append(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        } else {
          stringToWrite.append(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
        }
      }
      xmlWriter.writeCharacters(stringToWrite.toString());
    }
  }

  /** Register a namespace prefix */
  private java.lang.String registerPrefix(
      javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
      throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
      prefix = generatePrefix(namespace);
      javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
      while (true) {
        java.lang.String uri = nsContext.getNamespaceURI(prefix);
        if (uri == null || uri.length() == 0) {
          break;
        }
        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
      }
      xmlWriter.writeNamespace(prefix, namespace);
      xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
  }

  /** Factory class that keeps the parse method */
  public static class Factory {
    private static org.apache.commons.logging.Log log =
        org.apache.commons.logging.LogFactory.getLog(Factory.class);

    /**
     * static method to create the object Precondition: If this object is an element, the current or
     * next start element starts this object and any intervening reader events are ignorable If this
     * object is not an element, it is a complex type and the reader is at the event just after the
     * outer start element Postcondition: If this object is an element, the reader is positioned at
     * its end element If this object is a complex type, the reader is positioned at the end element
     * of its outer element
     */
    public static DFUQueryRequest parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      DFUQueryRequest object = new DFUQueryRequest();

      int event;
      javax.xml.namespace.QName currentQName = null;
      java.lang.String nillableValue = null;
      java.lang.String prefix = "";
      java.lang.String namespaceuri = "";
      try {

        while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

        currentQName = reader.getName();

        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
          java.lang.String fullTypeName =
              reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
          if (fullTypeName != null) {
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1) {
              nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix == null ? "" : nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

            if (!"DFUQueryRequest".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (DFUQueryRequest)
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ExtensionMapper.getTypeObject(
                      nsUri, type, reader);
            }
          }
        }

        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();

        reader.next();

        while (!reader.isEndElement()) {
          if (reader.isStartElement()) {

            if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Prefix")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Prefix" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPrefix(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "NodeGroup")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "NodeGroup" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setNodeGroup(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ContentType")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ContentType" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setContentType(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "InvertContent")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "InvertContent" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setInvertContent(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "LogicalName")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "LogicalName" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setLogicalName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Owner")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Owner" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setOwner(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "StartDate")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "StartDate" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setStartDate(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "EndDate")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "EndDate" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setEndDate(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FileType")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "FileType" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setFileType(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FileSizeFrom")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "FileSizeFrom" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setFileSizeFrom(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FileSizeTo")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "FileSizeTo" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setFileSizeTo(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FirstN")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "FirstN" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setFirstN(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "PageSize")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "PageSize" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPageSize(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "PageStartFrom")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "PageStartFrom" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPageStartFrom(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Sortby")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Sortby" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSortby(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Descending")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Descending" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDescending(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "OneLevelDirFileReturn")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "OneLevelDirFileReturn" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setOneLevelDirFileReturn(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "CacheHint")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "CacheHint" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setCacheHint(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "MaxNumberOfFiles")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "MaxNumberOfFiles" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setMaxNumberOfFiles(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "IncludeSuperOwner")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "IncludeSuperOwner" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setIncludeSuperOwner(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "StartAccessedTime")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "StartAccessedTime" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setStartAccessedTime(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "EndAccessedTime")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "EndAccessedTime" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setEndAccessedTime(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "MaxSkewFrom")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "MaxSkewFrom" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setMaxSkewFrom(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "MaxSkewTo")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "MaxSkewTo" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setMaxSkewTo(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "MinSkewFrom")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "MinSkewFrom" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setMinSkewFrom(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "MinSkewTo")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "MinSkewTo" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setMinSkewTo(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else {
              // 3 - A start element we are not expecting indicates an invalid parameter was passed

              log.warn("Unexpected subelement " + reader.getLocalName());
              // consume everything, ending on the unexpected subelement's endtag
              javax.xml.namespace.QName subQName = reader.getName();
              while (!(reader.isEndElement() && reader.getName().equals(subQName))) {
                reader.next();
              }
              // skip past this extra element completely
              reader.next();
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
  } // end of factory class
}

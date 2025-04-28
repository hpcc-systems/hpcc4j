/**
 * WUListQueries.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58;

/** WUListQueries bean class */
@SuppressWarnings({"unchecked", "unused"})
public class WUListQueries implements org.apache.axis2.databinding.ADBBean {

  public static final javax.xml.namespace.QName MY_QNAME =
      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUListQueries", "ns1");

  /** field for QuerySetName */
  protected java.lang.String localQuerySetName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localQuerySetNameTracker = false;

  public boolean isQuerySetNameSpecified() {
    return localQuerySetNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getQuerySetName() {
    return localQuerySetName;
  }

  /**
   * Auto generated setter method
   *
   * @param param QuerySetName
   */
  public void setQuerySetName(java.lang.String param) {
    localQuerySetNameTracker = param != null;

    this.localQuerySetName = param;
  }

  /** field for ClusterName */
  protected java.lang.String localClusterName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localClusterNameTracker = false;

  public boolean isClusterNameSpecified() {
    return localClusterNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getClusterName() {
    return localClusterName;
  }

  /**
   * Auto generated setter method
   *
   * @param param ClusterName
   */
  public void setClusterName(java.lang.String param) {
    localClusterNameTracker = param != null;

    this.localClusterName = param;
  }

  /** field for LibraryName */
  protected java.lang.String localLibraryName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localLibraryNameTracker = false;

  public boolean isLibraryNameSpecified() {
    return localLibraryNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getLibraryName() {
    return localLibraryName;
  }

  /**
   * Auto generated setter method
   *
   * @param param LibraryName
   */
  public void setLibraryName(java.lang.String param) {
    localLibraryNameTracker = param != null;

    this.localLibraryName = param;
  }

  /** field for MemoryLimitLow */
  protected long localMemoryLimitLow;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localMemoryLimitLowTracker = false;

  public boolean isMemoryLimitLowSpecified() {
    return localMemoryLimitLowTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getMemoryLimitLow() {
    return localMemoryLimitLow;
  }

  /**
   * Auto generated setter method
   *
   * @param param MemoryLimitLow
   */
  public void setMemoryLimitLow(long param) {

    // setting primitive attribute tracker to true
    localMemoryLimitLowTracker = param != java.lang.Long.MIN_VALUE;

    this.localMemoryLimitLow = param;
  }

  /** field for MemoryLimitHigh */
  protected long localMemoryLimitHigh;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localMemoryLimitHighTracker = false;

  public boolean isMemoryLimitHighSpecified() {
    return localMemoryLimitHighTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getMemoryLimitHigh() {
    return localMemoryLimitHigh;
  }

  /**
   * Auto generated setter method
   *
   * @param param MemoryLimitHigh
   */
  public void setMemoryLimitHigh(long param) {

    // setting primitive attribute tracker to true
    localMemoryLimitHighTracker = param != java.lang.Long.MIN_VALUE;

    this.localMemoryLimitHigh = param;
  }

  /** field for TimeLimitLow */
  protected org.apache.axis2.databinding.types.NonNegativeInteger localTimeLimitLow;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTimeLimitLowTracker = false;

  public boolean isTimeLimitLowSpecified() {
    return localTimeLimitLowTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.apache.axis2.databinding.types.NonNegativeInteger
   */
  public org.apache.axis2.databinding.types.NonNegativeInteger getTimeLimitLow() {
    return localTimeLimitLow;
  }

  /**
   * Auto generated setter method
   *
   * @param param TimeLimitLow
   */
  public void setTimeLimitLow(org.apache.axis2.databinding.types.NonNegativeInteger param) {
    localTimeLimitLowTracker = param != null;

    this.localTimeLimitLow = param;
  }

  /** field for TimeLimitHigh */
  protected org.apache.axis2.databinding.types.NonNegativeInteger localTimeLimitHigh;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTimeLimitHighTracker = false;

  public boolean isTimeLimitHighSpecified() {
    return localTimeLimitHighTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.apache.axis2.databinding.types.NonNegativeInteger
   */
  public org.apache.axis2.databinding.types.NonNegativeInteger getTimeLimitHigh() {
    return localTimeLimitHigh;
  }

  /**
   * Auto generated setter method
   *
   * @param param TimeLimitHigh
   */
  public void setTimeLimitHigh(org.apache.axis2.databinding.types.NonNegativeInteger param) {
    localTimeLimitHighTracker = param != null;

    this.localTimeLimitHigh = param;
  }

  /** field for WarnTimeLimitLow */
  protected org.apache.axis2.databinding.types.NonNegativeInteger localWarnTimeLimitLow;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localWarnTimeLimitLowTracker = false;

  public boolean isWarnTimeLimitLowSpecified() {
    return localWarnTimeLimitLowTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.apache.axis2.databinding.types.NonNegativeInteger
   */
  public org.apache.axis2.databinding.types.NonNegativeInteger getWarnTimeLimitLow() {
    return localWarnTimeLimitLow;
  }

  /**
   * Auto generated setter method
   *
   * @param param WarnTimeLimitLow
   */
  public void setWarnTimeLimitLow(org.apache.axis2.databinding.types.NonNegativeInteger param) {
    localWarnTimeLimitLowTracker = param != null;

    this.localWarnTimeLimitLow = param;
  }

  /** field for WarnTimeLimitHigh */
  protected org.apache.axis2.databinding.types.NonNegativeInteger localWarnTimeLimitHigh;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localWarnTimeLimitHighTracker = false;

  public boolean isWarnTimeLimitHighSpecified() {
    return localWarnTimeLimitHighTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.apache.axis2.databinding.types.NonNegativeInteger
   */
  public org.apache.axis2.databinding.types.NonNegativeInteger getWarnTimeLimitHigh() {
    return localWarnTimeLimitHigh;
  }

  /**
   * Auto generated setter method
   *
   * @param param WarnTimeLimitHigh
   */
  public void setWarnTimeLimitHigh(org.apache.axis2.databinding.types.NonNegativeInteger param) {
    localWarnTimeLimitHighTracker = param != null;

    this.localWarnTimeLimitHigh = param;
  }

  /** field for PriorityLow */
  protected org.apache.axis2.databinding.types.NonNegativeInteger localPriorityLow;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPriorityLowTracker = false;

  public boolean isPriorityLowSpecified() {
    return localPriorityLowTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.apache.axis2.databinding.types.NonNegativeInteger
   */
  public org.apache.axis2.databinding.types.NonNegativeInteger getPriorityLow() {
    return localPriorityLow;
  }

  /**
   * Auto generated setter method
   *
   * @param param PriorityLow
   */
  public void setPriorityLow(org.apache.axis2.databinding.types.NonNegativeInteger param) {
    localPriorityLowTracker = param != null;

    this.localPriorityLow = param;
  }

  /** field for PriorityHigh */
  protected org.apache.axis2.databinding.types.NonNegativeInteger localPriorityHigh;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPriorityHighTracker = false;

  public boolean isPriorityHighSpecified() {
    return localPriorityHighTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.apache.axis2.databinding.types.NonNegativeInteger
   */
  public org.apache.axis2.databinding.types.NonNegativeInteger getPriorityHigh() {
    return localPriorityHigh;
  }

  /**
   * Auto generated setter method
   *
   * @param param PriorityHigh
   */
  public void setPriorityHigh(org.apache.axis2.databinding.types.NonNegativeInteger param) {
    localPriorityHighTracker = param != null;

    this.localPriorityHigh = param;
  }

  /** field for Activated */
  protected boolean localActivated;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localActivatedTracker = false;

  public boolean isActivatedSpecified() {
    return localActivatedTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getActivated() {
    return localActivated;
  }

  /**
   * Auto generated setter method
   *
   * @param param Activated
   */
  public void setActivated(boolean param) {

    // setting primitive attribute tracker to true
    localActivatedTracker = true;

    this.localActivated = param;
  }

  /** field for SuspendedByUser */
  protected boolean localSuspendedByUser;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSuspendedByUserTracker = false;

  public boolean isSuspendedByUserSpecified() {
    return localSuspendedByUserTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getSuspendedByUser() {
    return localSuspendedByUser;
  }

  /**
   * Auto generated setter method
   *
   * @param param SuspendedByUser
   */
  public void setSuspendedByUser(boolean param) {

    // setting primitive attribute tracker to true
    localSuspendedByUserTracker = true;

    this.localSuspendedByUser = param;
  }

  /** field for WUID */
  protected java.lang.String localWUID;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localWUIDTracker = false;

  public boolean isWUIDSpecified() {
    return localWUIDTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getWUID() {
    return localWUID;
  }

  /**
   * Auto generated setter method
   *
   * @param param WUID
   */
  public void setWUID(java.lang.String param) {
    localWUIDTracker = param != null;

    this.localWUID = param;
  }

  /** field for QueryID */
  protected java.lang.String localQueryID;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localQueryIDTracker = false;

  public boolean isQueryIDSpecified() {
    return localQueryIDTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getQueryID() {
    return localQueryID;
  }

  /**
   * Auto generated setter method
   *
   * @param param QueryID
   */
  public void setQueryID(java.lang.String param) {
    localQueryIDTracker = param != null;

    this.localQueryID = param;
  }

  /** field for QueryName */
  protected java.lang.String localQueryName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localQueryNameTracker = false;

  public boolean isQueryNameSpecified() {
    return localQueryNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getQueryName() {
    return localQueryName;
  }

  /**
   * Auto generated setter method
   *
   * @param param QueryName
   */
  public void setQueryName(java.lang.String param) {
    localQueryNameTracker = param != null;

    this.localQueryName = param;
  }

  /** field for PublishedBy */
  protected java.lang.String localPublishedBy;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPublishedByTracker = false;

  public boolean isPublishedBySpecified() {
    return localPublishedByTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getPublishedBy() {
    return localPublishedBy;
  }

  /**
   * Auto generated setter method
   *
   * @param param PublishedBy
   */
  public void setPublishedBy(java.lang.String param) {
    localPublishedByTracker = param != null;

    this.localPublishedBy = param;
  }

  /** field for PageSize */
  protected org.apache.axis2.databinding.types.NonNegativeInteger localPageSize;

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
   * @return org.apache.axis2.databinding.types.NonNegativeInteger
   */
  public org.apache.axis2.databinding.types.NonNegativeInteger getPageSize() {
    return localPageSize;
  }

  /**
   * Auto generated setter method
   *
   * @param param PageSize
   */
  public void setPageSize(org.apache.axis2.databinding.types.NonNegativeInteger param) {
    localPageSizeTracker = param != null;

    this.localPageSize = param;
  }

  /** field for PageStartFrom */
  protected org.apache.axis2.databinding.types.NonNegativeInteger localPageStartFrom;

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
   * @return org.apache.axis2.databinding.types.NonNegativeInteger
   */
  public org.apache.axis2.databinding.types.NonNegativeInteger getPageStartFrom() {
    return localPageStartFrom;
  }

  /**
   * Auto generated setter method
   *
   * @param param PageStartFrom
   */
  public void setPageStartFrom(org.apache.axis2.databinding.types.NonNegativeInteger param) {
    localPageStartFromTracker = param != null;

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

  /** field for FileName */
  protected java.lang.String localFileName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localFileNameTracker = false;

  public boolean isFileNameSpecified() {
    return localFileNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getFileName() {
    return localFileName;
  }

  /**
   * Auto generated setter method
   *
   * @param param FileName
   */
  public void setFileName(java.lang.String param) {
    localFileNameTracker = param != null;

    this.localFileName = param;
  }

  /** field for CheckAllNodes */
  protected boolean localCheckAllNodes =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("true");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localCheckAllNodesTracker = false;

  public boolean isCheckAllNodesSpecified() {
    return localCheckAllNodesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getCheckAllNodes() {
    return localCheckAllNodes;
  }

  /**
   * Auto generated setter method
   *
   * @param param CheckAllNodes
   */
  public void setCheckAllNodes(boolean param) {

    // setting primitive attribute tracker to true
    localCheckAllNodesTracker = true;

    this.localCheckAllNodes = param;
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

      java.lang.String namespacePrefix =
          registerPrefix(xmlWriter, "urn:hpccsystems:ws:wsworkunits");
      if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            namespacePrefix + ":WUListQueries",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "WUListQueries", xmlWriter);
      }
    }
    if (localQuerySetNameTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "QuerySetName", xmlWriter);

      if (localQuerySetName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("QuerySetName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localQuerySetName);
      }

      xmlWriter.writeEndElement();
    }
    if (localClusterNameTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "ClusterName", xmlWriter);

      if (localClusterName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ClusterName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localClusterName);
      }

      xmlWriter.writeEndElement();
    }
    if (localLibraryNameTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "LibraryName", xmlWriter);

      if (localLibraryName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("LibraryName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localLibraryName);
      }

      xmlWriter.writeEndElement();
    }
    if (localMemoryLimitLowTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "MemoryLimitLow", xmlWriter);

      if (localMemoryLimitLow == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("MemoryLimitLow cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMemoryLimitLow));
      }

      xmlWriter.writeEndElement();
    }
    if (localMemoryLimitHighTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "MemoryLimitHigh", xmlWriter);

      if (localMemoryLimitHigh == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("MemoryLimitHigh cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMemoryLimitHigh));
      }

      xmlWriter.writeEndElement();
    }
    if (localTimeLimitLowTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "TimeLimitLow", xmlWriter);

      if (localTimeLimitLow == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("TimeLimitLow cannot be null!!");

      } else {

        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeLimitLow));
      }

      xmlWriter.writeEndElement();
    }
    if (localTimeLimitHighTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "TimeLimitHigh", xmlWriter);

      if (localTimeLimitHigh == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("TimeLimitHigh cannot be null!!");

      } else {

        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeLimitHigh));
      }

      xmlWriter.writeEndElement();
    }
    if (localWarnTimeLimitLowTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "WarnTimeLimitLow", xmlWriter);

      if (localWarnTimeLimitLow == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("WarnTimeLimitLow cannot be null!!");

      } else {

        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localWarnTimeLimitLow));
      }

      xmlWriter.writeEndElement();
    }
    if (localWarnTimeLimitHighTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "WarnTimeLimitHigh", xmlWriter);

      if (localWarnTimeLimitHigh == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("WarnTimeLimitHigh cannot be null!!");

      } else {

        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localWarnTimeLimitHigh));
      }

      xmlWriter.writeEndElement();
    }
    if (localPriorityLowTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "PriorityLow", xmlWriter);

      if (localPriorityLow == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("PriorityLow cannot be null!!");

      } else {

        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPriorityLow));
      }

      xmlWriter.writeEndElement();
    }
    if (localPriorityHighTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "PriorityHigh", xmlWriter);

      if (localPriorityHigh == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("PriorityHigh cannot be null!!");

      } else {

        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPriorityHigh));
      }

      xmlWriter.writeEndElement();
    }
    if (localActivatedTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Activated", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("Activated cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localActivated));
      }

      xmlWriter.writeEndElement();
    }
    if (localSuspendedByUserTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "SuspendedByUser", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("SuspendedByUser cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSuspendedByUser));
      }

      xmlWriter.writeEndElement();
    }
    if (localWUIDTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "WUID", xmlWriter);

      if (localWUID == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("WUID cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localWUID);
      }

      xmlWriter.writeEndElement();
    }
    if (localQueryIDTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "QueryID", xmlWriter);

      if (localQueryID == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("QueryID cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localQueryID);
      }

      xmlWriter.writeEndElement();
    }
    if (localQueryNameTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "QueryName", xmlWriter);

      if (localQueryName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("QueryName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localQueryName);
      }

      xmlWriter.writeEndElement();
    }
    if (localPublishedByTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "PublishedBy", xmlWriter);

      if (localPublishedBy == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("PublishedBy cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localPublishedBy);
      }

      xmlWriter.writeEndElement();
    }
    if (localPageSizeTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "PageSize", xmlWriter);

      if (localPageSize == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("PageSize cannot be null!!");

      } else {

        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPageSize));
      }

      xmlWriter.writeEndElement();
    }
    if (localPageStartFromTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "PageStartFrom", xmlWriter);

      if (localPageStartFrom == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("PageStartFrom cannot be null!!");

      } else {

        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPageStartFrom));
      }

      xmlWriter.writeEndElement();
    }
    if (localSortbyTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
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
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Descending", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("Descending cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescending));
      }

      xmlWriter.writeEndElement();
    }
    if (localCacheHintTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "CacheHint", xmlWriter);

      if (localCacheHint == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("CacheHint cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCacheHint));
      }

      xmlWriter.writeEndElement();
    }
    if (localFileNameTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "FileName", xmlWriter);

      if (localFileName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("FileName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localFileName);
      }

      xmlWriter.writeEndElement();
    }
    if (localCheckAllNodesTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "CheckAllNodes", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("CheckAllNodes cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCheckAllNodes));
      }

      xmlWriter.writeEndElement();
    }
    xmlWriter.writeEndElement();
  }

  private static java.lang.String generatePrefix(java.lang.String namespace) {
    if (namespace.equals("urn:hpccsystems:ws:wsworkunits")) {
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
    public static WUListQueries parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      WUListQueries object = new WUListQueries();

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

            if (!"WUListQueries".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (WUListQueries)
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ExtensionMapper
                      .getTypeObject(nsUri, type, reader);
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetName")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "QuerySetName" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setQuerySetName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ClusterName")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ClusterName" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setClusterName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LibraryName")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "LibraryName" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setLibraryName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "MemoryLimitLow")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "MemoryLimitLow" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setMemoryLimitLow(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "MemoryLimitHigh")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "MemoryLimitHigh" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setMemoryLimitHigh(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "TimeLimitLow")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "TimeLimitLow" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setTimeLimitLow(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(
                      content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "TimeLimitHigh")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "TimeLimitHigh" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setTimeLimitHigh(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(
                      content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WarnTimeLimitLow")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "WarnTimeLimitLow" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setWarnTimeLimitLow(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(
                      content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "WarnTimeLimitHigh")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "WarnTimeLimitHigh" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setWarnTimeLimitHigh(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(
                      content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PriorityLow")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "PriorityLow" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPriorityLow(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(
                      content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PriorityHigh")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "PriorityHigh" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPriorityHigh(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(
                      content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Activated")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Activated" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setActivated(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "SuspendedByUser")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SuspendedByUser" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSuspendedByUser(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUID")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "WUID" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setWUID(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QueryID")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "QueryID" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setQueryID(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QueryName")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "QueryName" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setQueryName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PublishedBy")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "PublishedBy" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPublishedBy(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PageSize")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "PageSize" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPageSize(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(
                      content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PageStartFrom")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "PageStartFrom" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPageStartFrom(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(
                      content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Sortby")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Descending")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "CacheHint")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "FileName")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "FileName" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setFileName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "CheckAllNodes")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "CheckAllNodes" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setCheckAllNodes(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

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
  } // end of factory class
}

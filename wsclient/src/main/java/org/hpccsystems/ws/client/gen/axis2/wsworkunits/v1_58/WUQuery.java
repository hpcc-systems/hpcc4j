/**
 * WUQuery.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58;

/** WUQuery bean class */
@SuppressWarnings({"unchecked", "unused"})
public class WUQuery implements org.apache.axis2.databinding.ADBBean {

  public static final javax.xml.namespace.QName MY_QNAME =
      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQuery", "ns1");

  /** field for Wuid */
  protected java.lang.String localWuid;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localWuidTracker = false;

  public boolean isWuidSpecified() {
    return localWuidTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getWuid() {
    return localWuid;
  }

  /**
   * Auto generated setter method
   *
   * @param param Wuid
   */
  public void setWuid(java.lang.String param) {
    localWuidTracker = param != null;

    this.localWuid = param;
  }

  /** field for Type */
  protected java.lang.String localType;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTypeTracker = false;

  public boolean isTypeSpecified() {
    return localTypeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getType() {
    return localType;
  }

  /**
   * Auto generated setter method
   *
   * @param param Type
   */
  public void setType(java.lang.String param) {
    localTypeTracker = param != null;

    this.localType = param;
  }

  /** field for Cluster */
  protected java.lang.String localCluster;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localClusterTracker = false;

  public boolean isClusterSpecified() {
    return localClusterTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getCluster() {
    return localCluster;
  }

  /**
   * Auto generated setter method
   *
   * @param param Cluster
   */
  public void setCluster(java.lang.String param) {
    localClusterTracker = param != null;

    this.localCluster = param;
  }

  /** field for RoxieCluster */
  protected java.lang.String localRoxieCluster;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localRoxieClusterTracker = false;

  public boolean isRoxieClusterSpecified() {
    return localRoxieClusterTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getRoxieCluster() {
    return localRoxieCluster;
  }

  /**
   * Auto generated setter method
   *
   * @param param RoxieCluster
   */
  public void setRoxieCluster(java.lang.String param) {
    localRoxieClusterTracker = param != null;

    this.localRoxieCluster = param;
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

  /** field for State */
  protected java.lang.String localState;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localStateTracker = false;

  public boolean isStateSpecified() {
    return localStateTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getState() {
    return localState;
  }

  /**
   * Auto generated setter method
   *
   * @param param State
   */
  public void setState(java.lang.String param) {
    localStateTracker = param != null;

    this.localState = param;
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

  /** field for ECL */
  protected java.lang.String localECL;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localECLTracker = false;

  public boolean isECLSpecified() {
    return localECLTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getECL() {
    return localECL;
  }

  /**
   * Auto generated setter method
   *
   * @param param ECL
   */
  public void setECL(java.lang.String param) {
    localECLTracker = param != null;

    this.localECL = param;
  }

  /** field for Jobname */
  protected java.lang.String localJobname;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localJobnameTracker = false;

  public boolean isJobnameSpecified() {
    return localJobnameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getJobname() {
    return localJobname;
  }

  /**
   * Auto generated setter method
   *
   * @param param Jobname
   */
  public void setJobname(java.lang.String param) {
    localJobnameTracker = param != null;

    this.localJobname = param;
  }

  /** field for LogicalFile */
  protected java.lang.String localLogicalFile;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localLogicalFileTracker = false;

  public boolean isLogicalFileSpecified() {
    return localLogicalFileTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getLogicalFile() {
    return localLogicalFile;
  }

  /**
   * Auto generated setter method
   *
   * @param param LogicalFile
   */
  public void setLogicalFile(java.lang.String param) {
    localLogicalFileTracker = param != null;

    this.localLogicalFile = param;
  }

  /** field for LogicalFileSearchType */
  protected java.lang.String localLogicalFileSearchType =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToString("");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localLogicalFileSearchTypeTracker = false;

  public boolean isLogicalFileSearchTypeSpecified() {
    return localLogicalFileSearchTypeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getLogicalFileSearchType() {
    return localLogicalFileSearchType;
  }

  /**
   * Auto generated setter method
   *
   * @param param LogicalFileSearchType
   */
  public void setLogicalFileSearchType(java.lang.String param) {
    localLogicalFileSearchTypeTracker = param != null;

    this.localLogicalFileSearchType = param;
  }

  /** field for ApplicationValues */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ArrayOfApplicationValue
      localApplicationValues;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localApplicationValuesTracker = false;

  public boolean isApplicationValuesSpecified() {
    return localApplicationValuesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ArrayOfApplicationValue
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ArrayOfApplicationValue
      getApplicationValues() {
    return localApplicationValues;
  }

  /**
   * Auto generated setter method
   *
   * @param param ApplicationValues
   */
  public void setApplicationValues(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ArrayOfApplicationValue param) {
    localApplicationValuesTracker = param != null;

    this.localApplicationValues = param;
  }

  /** field for Count */
  protected int localCount;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localCountTracker = false;

  public boolean isCountSpecified() {
    return localCountTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getCount() {
    return localCount;
  }

  /**
   * Auto generated setter method
   *
   * @param param Count
   */
  public void setCount(int param) {

    // setting primitive attribute tracker to true
    localCountTracker = param != java.lang.Integer.MIN_VALUE;

    this.localCount = param;
  }

  /** field for PageSize */
  protected long localPageSize;

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
   * @return long
   */
  public long getPageSize() {
    return localPageSize;
  }

  /**
   * Auto generated setter method
   *
   * @param param PageSize
   */
  public void setPageSize(long param) {

    // setting primitive attribute tracker to true
    localPageSizeTracker = param != java.lang.Long.MIN_VALUE;

    this.localPageSize = param;
  }

  /** field for PageStartFrom */
  protected long localPageStartFrom;

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
   * @return long
   */
  public long getPageStartFrom() {
    return localPageStartFrom;
  }

  /**
   * Auto generated setter method
   *
   * @param param PageStartFrom
   */
  public void setPageStartFrom(long param) {

    // setting primitive attribute tracker to true
    localPageStartFromTracker = param != java.lang.Long.MIN_VALUE;

    this.localPageStartFrom = param;
  }

  /** field for PageEndAt */
  protected long localPageEndAt;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPageEndAtTracker = false;

  public boolean isPageEndAtSpecified() {
    return localPageEndAtTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getPageEndAt() {
    return localPageEndAt;
  }

  /**
   * Auto generated setter method
   *
   * @param param PageEndAt
   */
  public void setPageEndAt(long param) {

    // setting primitive attribute tracker to true
    localPageEndAtTracker = param != java.lang.Long.MIN_VALUE;

    this.localPageEndAt = param;
  }

  /** field for LastNDays */
  protected int localLastNDays;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localLastNDaysTracker = false;

  public boolean isLastNDaysSpecified() {
    return localLastNDaysTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getLastNDays() {
    return localLastNDays;
  }

  /**
   * Auto generated setter method
   *
   * @param param LastNDays
   */
  public void setLastNDays(int param) {

    // setting primitive attribute tracker to true
    localLastNDaysTracker = param != java.lang.Integer.MIN_VALUE;

    this.localLastNDays = param;
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
            namespacePrefix + ":WUQuery",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "WUQuery", xmlWriter);
      }
    }
    if (localWuidTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Wuid", xmlWriter);

      if (localWuid == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Wuid cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localWuid);
      }

      xmlWriter.writeEndElement();
    }
    if (localTypeTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Type", xmlWriter);

      if (localType == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Type cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localType);
      }

      xmlWriter.writeEndElement();
    }
    if (localClusterTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Cluster", xmlWriter);

      if (localCluster == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Cluster cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localCluster);
      }

      xmlWriter.writeEndElement();
    }
    if (localRoxieClusterTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "RoxieCluster", xmlWriter);

      if (localRoxieCluster == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("RoxieCluster cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localRoxieCluster);
      }

      xmlWriter.writeEndElement();
    }
    if (localOwnerTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Owner", xmlWriter);

      if (localOwner == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Owner cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localOwner);
      }

      xmlWriter.writeEndElement();
    }
    if (localStateTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "State", xmlWriter);

      if (localState == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("State cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localState);
      }

      xmlWriter.writeEndElement();
    }
    if (localStartDateTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
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
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "EndDate", xmlWriter);

      if (localEndDate == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("EndDate cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localEndDate);
      }

      xmlWriter.writeEndElement();
    }
    if (localECLTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "ECL", xmlWriter);

      if (localECL == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ECL cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localECL);
      }

      xmlWriter.writeEndElement();
    }
    if (localJobnameTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Jobname", xmlWriter);

      if (localJobname == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Jobname cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localJobname);
      }

      xmlWriter.writeEndElement();
    }
    if (localLogicalFileTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "LogicalFile", xmlWriter);

      if (localLogicalFile == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("LogicalFile cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localLogicalFile);
      }

      xmlWriter.writeEndElement();
    }
    if (localLogicalFileSearchTypeTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "LogicalFileSearchType", xmlWriter);

      if (localLogicalFileSearchType == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException(
            "LogicalFileSearchType cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localLogicalFileSearchType);
      }

      xmlWriter.writeEndElement();
    }
    if (localApplicationValuesTracker) {
      if (localApplicationValues == null) {
        throw new org.apache.axis2.databinding.ADBException("ApplicationValues cannot be null!!");
      }
      localApplicationValues.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ApplicationValues"),
          xmlWriter);
    }
    if (localCountTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Count", xmlWriter);

      if (localCount == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("Count cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCount));
      }

      xmlWriter.writeEndElement();
    }
    if (localPageSizeTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "PageSize", xmlWriter);

      if (localPageSize == java.lang.Long.MIN_VALUE) {

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

      if (localPageStartFrom == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("PageStartFrom cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPageStartFrom));
      }

      xmlWriter.writeEndElement();
    }
    if (localPageEndAtTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "PageEndAt", xmlWriter);

      if (localPageEndAt == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("PageEndAt cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPageEndAt));
      }

      xmlWriter.writeEndElement();
    }
    if (localLastNDaysTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "LastNDays", xmlWriter);

      if (localLastNDays == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("LastNDays cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastNDays));
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
    public static WUQuery parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      WUQuery object = new WUQuery();

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

            if (!"WUQuery".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (WUQuery)
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Wuid")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Wuid" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setWuid(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Type")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Type" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setType(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Cluster")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Cluster" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setCluster(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "RoxieCluster")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "RoxieCluster" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setRoxieCluster(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Owner")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "State")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "State" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setState(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "StartDate")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "EndDate")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ECL")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ECL" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setECL(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Jobname")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Jobname" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setJobname(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LogicalFile")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "LogicalFile" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setLogicalFile(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "LogicalFileSearchType")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "LogicalFileSearchType" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setLogicalFileSearchType(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "ApplicationValues")
                    .equals(reader.getName())) {

              object.setApplicationValues(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ArrayOfApplicationValue
                      .Factory.parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Count")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Count" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setCount(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

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
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

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
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PageEndAt")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "PageEndAt" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPageEndAt(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LastNDays")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "LastNDays" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setLastNDays(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

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

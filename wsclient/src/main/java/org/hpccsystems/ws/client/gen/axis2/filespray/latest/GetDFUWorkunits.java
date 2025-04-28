/**
 * GetDFUWorkunits.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.filespray.latest;

/** GetDFUWorkunits bean class */
@SuppressWarnings({"unchecked", "unused"})
public class GetDFUWorkunits implements org.apache.axis2.databinding.ADBBean {

  public static final javax.xml.namespace.QName MY_QNAME =
      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "GetDFUWorkunits", "ns1");

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

  /** field for StateReq */
  protected java.lang.String localStateReq;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localStateReqTracker = false;

  public boolean isStateReqSpecified() {
    return localStateReqTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getStateReq() {
    return localStateReq;
  }

  /**
   * Auto generated setter method
   *
   * @param param StateReq
   */
  public void setStateReq(java.lang.String param) {
    localStateReqTracker = param != null;

    this.localStateReq = param;
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

  /** field for CurrentPage */
  protected int localCurrentPage;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localCurrentPageTracker = false;

  public boolean isCurrentPageSpecified() {
    return localCurrentPageTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getCurrentPage() {
    return localCurrentPage;
  }

  /**
   * Auto generated setter method
   *
   * @param param CurrentPage
   */
  public void setCurrentPage(int param) {

    // setting primitive attribute tracker to true
    localCurrentPageTracker = param != java.lang.Integer.MIN_VALUE;

    this.localCurrentPage = param;
  }

  /** field for PageStartFrom */
  protected long localPageStartFrom =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToLong("-1");

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
  protected long localCacheHint =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToLong("-1");

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

  /** field for ParentWuid */
  protected java.lang.String localParentWuid;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localParentWuidTracker = false;

  public boolean isParentWuidSpecified() {
    return localParentWuidTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getParentWuid() {
    return localParentWuid;
  }

  /**
   * Auto generated setter method
   *
   * @param param ParentWuid
   */
  public void setParentWuid(java.lang.String param) {
    localParentWuidTracker = param != null;

    this.localParentWuid = param;
  }

  /** field for PublisherWuid */
  protected java.lang.String localPublisherWuid;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPublisherWuidTracker = false;

  public boolean isPublisherWuidSpecified() {
    return localPublisherWuidTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getPublisherWuid() {
    return localPublisherWuid;
  }

  /**
   * Auto generated setter method
   *
   * @param param PublisherWuid
   */
  public void setPublisherWuid(java.lang.String param) {
    localPublisherWuidTracker = param != null;

    this.localPublisherWuid = param;
  }

  /** field for IncludeProgressMessages */
  protected boolean localIncludeProgressMessages =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIncludeProgressMessagesTracker = false;

  public boolean isIncludeProgressMessagesSpecified() {
    return localIncludeProgressMessagesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getIncludeProgressMessages() {
    return localIncludeProgressMessages;
  }

  /**
   * Auto generated setter method
   *
   * @param param IncludeProgressMessages
   */
  public void setIncludeProgressMessages(boolean param) {

    // setting primitive attribute tracker to true
    localIncludeProgressMessagesTracker = true;

    this.localIncludeProgressMessages = param;
  }

  /** field for IncludeTimings */
  protected boolean localIncludeTimings =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIncludeTimingsTracker = false;

  public boolean isIncludeTimingsSpecified() {
    return localIncludeTimingsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getIncludeTimings() {
    return localIncludeTimings;
  }

  /**
   * Auto generated setter method
   *
   * @param param IncludeTimings
   */
  public void setIncludeTimings(boolean param) {

    // setting primitive attribute tracker to true
    localIncludeTimingsTracker = true;

    this.localIncludeTimings = param;
  }

  /** field for IncludeTransferRate */
  protected boolean localIncludeTransferRate =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIncludeTransferRateTracker = false;

  public boolean isIncludeTransferRateSpecified() {
    return localIncludeTransferRateTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getIncludeTransferRate() {
    return localIncludeTransferRate;
  }

  /**
   * Auto generated setter method
   *
   * @param param IncludeTransferRate
   */
  public void setIncludeTransferRate(boolean param) {

    // setting primitive attribute tracker to true
    localIncludeTransferRateTracker = true;

    this.localIncludeTransferRate = param;
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

      java.lang.String namespacePrefix = registerPrefix(xmlWriter, "urn:hpccsystems:ws:filespray");
      if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            namespacePrefix + ":GetDFUWorkunits",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            "GetDFUWorkunits",
            xmlWriter);
      }
    }
    if (localWuidTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "Wuid", xmlWriter);

      if (localWuid == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Wuid cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localWuid);
      }

      xmlWriter.writeEndElement();
    }
    if (localOwnerTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "Owner", xmlWriter);

      if (localOwner == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Owner cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localOwner);
      }

      xmlWriter.writeEndElement();
    }
    if (localClusterTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "Cluster", xmlWriter);

      if (localCluster == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Cluster cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localCluster);
      }

      xmlWriter.writeEndElement();
    }
    if (localStateReqTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "StateReq", xmlWriter);

      if (localStateReq == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("StateReq cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localStateReq);
      }

      xmlWriter.writeEndElement();
    }
    if (localTypeTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "Type", xmlWriter);

      if (localType == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Type cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localType);
      }

      xmlWriter.writeEndElement();
    }
    if (localJobnameTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "Jobname", xmlWriter);

      if (localJobname == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Jobname cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localJobname);
      }

      xmlWriter.writeEndElement();
    }
    if (localPageSizeTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "PageSize", xmlWriter);

      if (localPageSize == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("PageSize cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPageSize));
      }

      xmlWriter.writeEndElement();
    }
    if (localCurrentPageTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "CurrentPage", xmlWriter);

      if (localCurrentPage == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("CurrentPage cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCurrentPage));
      }

      xmlWriter.writeEndElement();
    }
    if (localPageStartFromTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "PageStartFrom", xmlWriter);

      if (localPageStartFrom == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("PageStartFrom cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPageStartFrom));
      }

      xmlWriter.writeEndElement();
    }
    if (localSortbyTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
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
      namespace = "urn:hpccsystems:ws:filespray";
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
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "CacheHint", xmlWriter);

      if (localCacheHint == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("CacheHint cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCacheHint));
      }

      xmlWriter.writeEndElement();
    }
    if (localParentWuidTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "ParentWuid", xmlWriter);

      if (localParentWuid == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ParentWuid cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localParentWuid);
      }

      xmlWriter.writeEndElement();
    }
    if (localPublisherWuidTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "PublisherWuid", xmlWriter);

      if (localPublisherWuid == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("PublisherWuid cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localPublisherWuid);
      }

      xmlWriter.writeEndElement();
    }
    if (localIncludeProgressMessagesTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "includeProgressMessages", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException(
            "includeProgressMessages cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localIncludeProgressMessages));
      }

      xmlWriter.writeEndElement();
    }
    if (localIncludeTimingsTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "includeTimings", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("includeTimings cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludeTimings));
      }

      xmlWriter.writeEndElement();
    }
    if (localIncludeTransferRateTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "includeTransferRate", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("includeTransferRate cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localIncludeTransferRate));
      }

      xmlWriter.writeEndElement();
    }
    xmlWriter.writeEndElement();
  }

  private static java.lang.String generatePrefix(java.lang.String namespace) {
    if (namespace.equals("urn:hpccsystems:ws:filespray")) {
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
    public static GetDFUWorkunits parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      GetDFUWorkunits object = new GetDFUWorkunits();

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

            if (!"GetDFUWorkunits".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (GetDFUWorkunits)
                  org.hpccsystems.ws.client.gen.axis2.filespray.latest.ExtensionMapper
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Wuid")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Owner")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Cluster")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "StateReq")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "StateReq" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setStateReq(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Type")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Jobname")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "PageSize")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "CurrentPage")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "CurrentPage" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setCurrentPage(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "PageStartFrom")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Sortby")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Descending")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "CacheHint")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ParentWuid")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ParentWuid" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setParentWuid(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "PublisherWuid")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "PublisherWuid" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPublisherWuid(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "includeProgressMessages")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "includeProgressMessages" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setIncludeProgressMessages(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "includeTimings")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "includeTimings" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setIncludeTimings(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "includeTransferRate")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "includeTransferRate" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setIncludeTransferRate(
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

/**
 * QuerySetQuery.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest;

/** QuerySetQuery bean class */
@SuppressWarnings({"unchecked", "unused"})
public class QuerySetQuery implements org.apache.axis2.databinding.ADBBean {
  /* This type was generated from the piece of schema that had
  name = QuerySetQuery
  Namespace URI = urn:hpccsystems:ws:wsworkunits
  Namespace Prefix = ns13
  */

  /** field for Id */
  protected java.lang.String localId;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIdTracker = false;

  public boolean isIdSpecified() {
    return localIdTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getId() {
    return localId;
  }

  /**
   * Auto generated setter method
   *
   * @param param Id
   */
  public void setId(java.lang.String param) {
    localIdTracker = param != null;

    this.localId = param;
  }

  /** field for Name */
  protected java.lang.String localName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localNameTracker = false;

  public boolean isNameSpecified() {
    return localNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getName() {
    return localName;
  }

  /**
   * Auto generated setter method
   *
   * @param param Name
   */
  public void setName(java.lang.String param) {
    localNameTracker = param != null;

    this.localName = param;
  }

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

  /** field for Dll */
  protected java.lang.String localDll;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDllTracker = false;

  public boolean isDllSpecified() {
    return localDllTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getDll() {
    return localDll;
  }

  /**
   * Auto generated setter method
   *
   * @param param Dll
   */
  public void setDll(java.lang.String param) {
    localDllTracker = param != null;

    this.localDll = param;
  }

  /** field for Suspended */
  protected boolean localSuspended;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSuspendedTracker = false;

  public boolean isSuspendedSpecified() {
    return localSuspendedTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getSuspended() {
    return localSuspended;
  }

  /**
   * Auto generated setter method
   *
   * @param param Suspended
   */
  public void setSuspended(boolean param) {

    // setting primitive attribute tracker to true
    localSuspendedTracker = true;

    this.localSuspended = param;
  }

  /** field for Clusters */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfClusterQueryState
      localClusters;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localClustersTracker = false;

  public boolean isClustersSpecified() {
    return localClustersTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfClusterQueryState
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfClusterQueryState
      getClusters() {
    return localClusters;
  }

  /**
   * Auto generated setter method
   *
   * @param param Clusters
   */
  public void setClusters(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfClusterQueryState param) {
    localClustersTracker = param != null;

    this.localClusters = param;
  }

  /** field for MemoryLimit */
  protected java.lang.String localMemoryLimit;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localMemoryLimitTracker = false;

  public boolean isMemoryLimitSpecified() {
    return localMemoryLimitTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getMemoryLimit() {
    return localMemoryLimit;
  }

  /**
   * Auto generated setter method
   *
   * @param param MemoryLimit
   */
  public void setMemoryLimit(java.lang.String param) {
    localMemoryLimitTracker = param != null;

    this.localMemoryLimit = param;
  }

  /** field for TimeLimit */
  protected org.apache.axis2.databinding.types.NonNegativeInteger localTimeLimit;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTimeLimitTracker = false;

  public boolean isTimeLimitSpecified() {
    return localTimeLimitTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.apache.axis2.databinding.types.NonNegativeInteger
   */
  public org.apache.axis2.databinding.types.NonNegativeInteger getTimeLimit() {
    return localTimeLimit;
  }

  /**
   * Auto generated setter method
   *
   * @param param TimeLimit
   */
  public void setTimeLimit(org.apache.axis2.databinding.types.NonNegativeInteger param) {
    localTimeLimitTracker = param != null;

    this.localTimeLimit = param;
  }

  /** field for WarnTimeLimit */
  protected org.apache.axis2.databinding.types.NonNegativeInteger localWarnTimeLimit;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localWarnTimeLimitTracker = false;

  public boolean isWarnTimeLimitSpecified() {
    return localWarnTimeLimitTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.apache.axis2.databinding.types.NonNegativeInteger
   */
  public org.apache.axis2.databinding.types.NonNegativeInteger getWarnTimeLimit() {
    return localWarnTimeLimit;
  }

  /**
   * Auto generated setter method
   *
   * @param param WarnTimeLimit
   */
  public void setWarnTimeLimit(org.apache.axis2.databinding.types.NonNegativeInteger param) {
    localWarnTimeLimitTracker = param != null;

    this.localWarnTimeLimit = param;
  }

  /** field for Priority */
  protected java.lang.String localPriority;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPriorityTracker = false;

  public boolean isPrioritySpecified() {
    return localPriorityTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getPriority() {
    return localPriority;
  }

  /**
   * Auto generated setter method
   *
   * @param param Priority
   */
  public void setPriority(java.lang.String param) {
    localPriorityTracker = param != null;

    this.localPriority = param;
  }

  /** field for Comment */
  protected java.lang.String localComment;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localCommentTracker = false;

  public boolean isCommentSpecified() {
    return localCommentTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getComment() {
    return localComment;
  }

  /**
   * Auto generated setter method
   *
   * @param param Comment
   */
  public void setComment(java.lang.String param) {
    localCommentTracker = param != null;

    this.localComment = param;
  }

  /** field for QuerySetId */
  protected java.lang.String localQuerySetId;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localQuerySetIdTracker = false;

  public boolean isQuerySetIdSpecified() {
    return localQuerySetIdTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getQuerySetId() {
    return localQuerySetId;
  }

  /**
   * Auto generated setter method
   *
   * @param param QuerySetId
   */
  public void setQuerySetId(java.lang.String param) {
    localQuerySetIdTracker = param != null;

    this.localQuerySetId = param;
  }

  /** field for IsLibrary */
  protected boolean localIsLibrary;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIsLibraryTracker = false;

  public boolean isIsLibrarySpecified() {
    return localIsLibraryTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getIsLibrary() {
    return localIsLibrary;
  }

  /**
   * Auto generated setter method
   *
   * @param param IsLibrary
   */
  public void setIsLibrary(boolean param) {

    // setting primitive attribute tracker to true
    localIsLibraryTracker = true;

    this.localIsLibrary = param;
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

  /** field for Snapshot */
  protected java.lang.String localSnapshot;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSnapshotTracker = false;

  public boolean isSnapshotSpecified() {
    return localSnapshotTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getSnapshot() {
    return localSnapshot;
  }

  /**
   * Auto generated setter method
   *
   * @param param Snapshot
   */
  public void setSnapshot(java.lang.String param) {
    localSnapshotTracker = param != null;

    this.localSnapshot = param;
  }

  /** field for PriorityID */
  protected int localPriorityID;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPriorityIDTracker = false;

  public boolean isPriorityIDSpecified() {
    return localPriorityIDTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getPriorityID() {
    return localPriorityID;
  }

  /**
   * Auto generated setter method
   *
   * @param param PriorityID
   */
  public void setPriorityID(int param) {

    // setting primitive attribute tracker to true
    localPriorityIDTracker = param != java.lang.Integer.MIN_VALUE;

    this.localPriorityID = param;
  }

  /**
   * @param parentQName
   * @param factory
   * @return org.apache.axiom.om.OMElement
   */
  public org.apache.axiom.om.OMElement getOMElement(
      final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
      throws org.apache.axis2.databinding.ADBException {

    return factory.createOMElement(
        new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
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
            namespacePrefix + ":QuerySetQuery",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "QuerySetQuery", xmlWriter);
      }
    }
    if (localIdTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Id", xmlWriter);

      if (localId == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Id cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localId);
      }

      xmlWriter.writeEndElement();
    }
    if (localNameTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Name", xmlWriter);

      if (localName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localName);
      }

      xmlWriter.writeEndElement();
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
    if (localDllTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Dll", xmlWriter);

      if (localDll == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Dll cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localDll);
      }

      xmlWriter.writeEndElement();
    }
    if (localSuspendedTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Suspended", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("Suspended cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSuspended));
      }

      xmlWriter.writeEndElement();
    }
    if (localClustersTracker) {
      if (localClusters == null) {
        throw new org.apache.axis2.databinding.ADBException("Clusters cannot be null!!");
      }
      localClusters.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Clusters"), xmlWriter);
    }
    if (localMemoryLimitTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "memoryLimit", xmlWriter);

      if (localMemoryLimit == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("memoryLimit cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localMemoryLimit);
      }

      xmlWriter.writeEndElement();
    }
    if (localTimeLimitTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "timeLimit", xmlWriter);

      if (localTimeLimit == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("timeLimit cannot be null!!");

      } else {

        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeLimit));
      }

      xmlWriter.writeEndElement();
    }
    if (localWarnTimeLimitTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "warnTimeLimit", xmlWriter);

      if (localWarnTimeLimit == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("warnTimeLimit cannot be null!!");

      } else {

        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWarnTimeLimit));
      }

      xmlWriter.writeEndElement();
    }
    if (localPriorityTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "priority", xmlWriter);

      if (localPriority == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("priority cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localPriority);
      }

      xmlWriter.writeEndElement();
    }
    if (localCommentTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Comment", xmlWriter);

      if (localComment == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Comment cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localComment);
      }

      xmlWriter.writeEndElement();
    }
    if (localQuerySetIdTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "QuerySetId", xmlWriter);

      if (localQuerySetId == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("QuerySetId cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localQuerySetId);
      }

      xmlWriter.writeEndElement();
    }
    if (localIsLibraryTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "IsLibrary", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("IsLibrary cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsLibrary));
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
    if (localSnapshotTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "snapshot", xmlWriter);

      if (localSnapshot == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("snapshot cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSnapshot);
      }

      xmlWriter.writeEndElement();
    }
    if (localPriorityIDTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "PriorityID", xmlWriter);

      if (localPriorityID == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("PriorityID cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPriorityID));
      }

      xmlWriter.writeEndElement();
    }
    xmlWriter.writeEndElement();
  }

  private static java.lang.String generatePrefix(java.lang.String namespace) {
    if (namespace.equals("urn:hpccsystems:ws:wsworkunits")) {
      return "ns13";
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
    public static QuerySetQuery parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      QuerySetQuery object = new QuerySetQuery();

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

            if (!"QuerySetQuery".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (QuerySetQuery)
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ExtensionMapper
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Id")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Id" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setId(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Name")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Name" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Dll")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Dll" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDll(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Suspended")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Suspended" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSuspended(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Clusters")
                    .equals(reader.getName())) {

              object.setClusters(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfClusterQueryState
                      .Factory.parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "memoryLimit")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "memoryLimit" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setMemoryLimit(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "timeLimit")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "timeLimit" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setTimeLimit(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(
                      content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "warnTimeLimit")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "warnTimeLimit" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setWarnTimeLimit(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(
                      content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "priority")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "priority" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPriority(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Comment")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Comment" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setComment(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySetId")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "QuerySetId" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setQuerySetId(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IsLibrary")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "IsLibrary" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setIsLibrary(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "snapshot")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "snapshot" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSnapshot(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PriorityID")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "PriorityID" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPriorityID(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

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

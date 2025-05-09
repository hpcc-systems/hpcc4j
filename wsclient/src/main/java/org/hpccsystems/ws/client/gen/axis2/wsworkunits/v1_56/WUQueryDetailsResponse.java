/**
 * WUQueryDetailsResponse.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56;

/** WUQueryDetailsResponse bean class */
@SuppressWarnings({"unchecked", "unused"})
public class WUQueryDetailsResponse implements org.apache.axis2.databinding.ADBBean {

  public static final javax.xml.namespace.QName MY_QNAME =
      new javax.xml.namespace.QName(
          "urn:hpccsystems:ws:wsworkunits", "WUQueryDetailsResponse", "ns1");

  /** field for Exceptions */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ArrayOfEspException
      localExceptions;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localExceptionsTracker = false;

  public boolean isExceptionsSpecified() {
    return localExceptionsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ArrayOfEspException
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ArrayOfEspException getExceptions() {
    return localExceptions;
  }

  /**
   * Auto generated setter method
   *
   * @param param Exceptions
   */
  public void setExceptions(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ArrayOfEspException param) {
    localExceptionsTracker = param != null;

    this.localExceptions = param;
  }

  /** field for QueryId */
  protected java.lang.String localQueryId;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localQueryIdTracker = false;

  public boolean isQueryIdSpecified() {
    return localQueryIdTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getQueryId() {
    return localQueryId;
  }

  /**
   * Auto generated setter method
   *
   * @param param QueryId
   */
  public void setQueryId(java.lang.String param) {
    localQueryIdTracker = param != null;

    this.localQueryId = param;
  }

  /** field for QuerySet */
  protected java.lang.String localQuerySet;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localQuerySetTracker = false;

  public boolean isQuerySetSpecified() {
    return localQuerySetTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getQuerySet() {
    return localQuerySet;
  }

  /**
   * Auto generated setter method
   *
   * @param param QuerySet
   */
  public void setQuerySet(java.lang.String param) {
    localQuerySetTracker = param != null;

    this.localQuerySet = param;
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

  /** field for SuspendedBy */
  protected java.lang.String localSuspendedBy;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSuspendedByTracker = false;

  public boolean isSuspendedBySpecified() {
    return localSuspendedByTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getSuspendedBy() {
    return localSuspendedBy;
  }

  /**
   * Auto generated setter method
   *
   * @param param SuspendedBy
   */
  public void setSuspendedBy(java.lang.String param) {
    localSuspendedByTracker = param != null;

    this.localSuspendedBy = param;
  }

  /** field for Clusters */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ArrayOfClusterQueryState
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
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ArrayOfClusterQueryState
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ArrayOfClusterQueryState
      getClusters() {
    return localClusters;
  }

  /**
   * Auto generated setter method
   *
   * @param param Clusters
   */
  public void setClusters(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ArrayOfClusterQueryState param) {
    localClustersTracker = param != null;

    this.localClusters = param;
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

  /** field for LogicalFiles */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.EspStringArray localLogicalFiles;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localLogicalFilesTracker = false;

  public boolean isLogicalFilesSpecified() {
    return localLogicalFilesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.EspStringArray
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.EspStringArray getLogicalFiles() {
    return localLogicalFiles;
  }

  /**
   * Auto generated setter method
   *
   * @param param LogicalFiles
   */
  public void setLogicalFiles(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.EspStringArray param) {
    localLogicalFilesTracker = param != null;

    this.localLogicalFiles = param;
  }

  /** field for SuperFiles */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.SuperFiles_type1 localSuperFiles;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSuperFilesTracker = false;

  public boolean isSuperFilesSpecified() {
    return localSuperFilesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.SuperFiles_type1
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.SuperFiles_type1 getSuperFiles() {
    return localSuperFiles;
  }

  /**
   * Auto generated setter method
   *
   * @param param SuperFiles
   */
  public void setSuperFiles(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.SuperFiles_type1 param) {
    localSuperFilesTracker = param != null;

    this.localSuperFiles = param;
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

  /** field for WUSnapShot */
  protected java.lang.String localWUSnapShot;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localWUSnapShotTracker = false;

  public boolean isWUSnapShotSpecified() {
    return localWUSnapShotTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getWUSnapShot() {
    return localWUSnapShot;
  }

  /**
   * Auto generated setter method
   *
   * @param param WUSnapShot
   */
  public void setWUSnapShot(java.lang.String param) {
    localWUSnapShotTracker = param != null;

    this.localWUSnapShot = param;
  }

  /** field for CompileTime */
  protected java.lang.String localCompileTime;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localCompileTimeTracker = false;

  public boolean isCompileTimeSpecified() {
    return localCompileTimeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getCompileTime() {
    return localCompileTime;
  }

  /**
   * Auto generated setter method
   *
   * @param param CompileTime
   */
  public void setCompileTime(java.lang.String param) {
    localCompileTimeTracker = param != null;

    this.localCompileTime = param;
  }

  /** field for LibrariesUsed */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.EspStringArray localLibrariesUsed;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localLibrariesUsedTracker = false;

  public boolean isLibrariesUsedSpecified() {
    return localLibrariesUsedTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.EspStringArray
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.EspStringArray getLibrariesUsed() {
    return localLibrariesUsed;
  }

  /**
   * Auto generated setter method
   *
   * @param param LibrariesUsed
   */
  public void setLibrariesUsed(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.EspStringArray param) {
    localLibrariesUsedTracker = param != null;

    this.localLibrariesUsed = param;
  }

  /** field for CountGraphs */
  protected int localCountGraphs;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localCountGraphsTracker = false;

  public boolean isCountGraphsSpecified() {
    return localCountGraphsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getCountGraphs() {
    return localCountGraphs;
  }

  /**
   * Auto generated setter method
   *
   * @param param CountGraphs
   */
  public void setCountGraphs(int param) {

    // setting primitive attribute tracker to true
    localCountGraphsTracker = param != java.lang.Integer.MIN_VALUE;

    this.localCountGraphs = param;
  }

  /** field for GraphIds */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.EspStringArray localGraphIds;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localGraphIdsTracker = false;

  public boolean isGraphIdsSpecified() {
    return localGraphIdsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.EspStringArray
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.EspStringArray getGraphIds() {
    return localGraphIds;
  }

  /**
   * Auto generated setter method
   *
   * @param param GraphIds
   */
  public void setGraphIds(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.EspStringArray param) {
    localGraphIdsTracker = param != null;

    this.localGraphIds = param;
  }

  /** field for ResourceURLCount */
  protected int localResourceURLCount;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localResourceURLCountTracker = false;

  public boolean isResourceURLCountSpecified() {
    return localResourceURLCountTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getResourceURLCount() {
    return localResourceURLCount;
  }

  /**
   * Auto generated setter method
   *
   * @param param ResourceURLCount
   */
  public void setResourceURLCount(int param) {

    // setting primitive attribute tracker to true
    localResourceURLCountTracker = param != java.lang.Integer.MIN_VALUE;

    this.localResourceURLCount = param;
  }

  /** field for WsEclAddresses */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.WsEclAddresses_type0
      localWsEclAddresses;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localWsEclAddressesTracker = false;

  public boolean isWsEclAddressesSpecified() {
    return localWsEclAddressesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.WsEclAddresses_type0
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.WsEclAddresses_type0
      getWsEclAddresses() {
    return localWsEclAddresses;
  }

  /**
   * Auto generated setter method
   *
   * @param param WsEclAddresses
   */
  public void setWsEclAddresses(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.WsEclAddresses_type0 param) {
    localWsEclAddressesTracker = param != null;

    this.localWsEclAddresses = param;
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
            namespacePrefix + ":WUQueryDetailsResponse",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            "WUQueryDetailsResponse",
            xmlWriter);
      }
    }
    if (localExceptionsTracker) {
      if (localExceptions == null) {
        throw new org.apache.axis2.databinding.ADBException("Exceptions cannot be null!!");
      }
      localExceptions.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"), xmlWriter);
    }
    if (localQueryIdTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "QueryId", xmlWriter);

      if (localQueryId == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("QueryId cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localQueryId);
      }

      xmlWriter.writeEndElement();
    }
    if (localQuerySetTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "QuerySet", xmlWriter);

      if (localQuerySet == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("QuerySet cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localQuerySet);
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
    if (localSuspendedByTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "SuspendedBy", xmlWriter);

      if (localSuspendedBy == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("SuspendedBy cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSuspendedBy);
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
    if (localLogicalFilesTracker) {
      if (localLogicalFiles == null) {
        throw new org.apache.axis2.databinding.ADBException("LogicalFiles cannot be null!!");
      }
      localLogicalFiles.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LogicalFiles"),
          xmlWriter);
    }
    if (localSuperFilesTracker) {
      if (localSuperFiles == null) {
        throw new org.apache.axis2.databinding.ADBException("SuperFiles cannot be null!!");
      }
      localSuperFiles.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "SuperFiles"), xmlWriter);
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
    if (localPriorityTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Priority", xmlWriter);

      if (localPriority == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Priority cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localPriority);
      }

      xmlWriter.writeEndElement();
    }
    if (localWUSnapShotTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "WUSnapShot", xmlWriter);

      if (localWUSnapShot == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("WUSnapShot cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localWUSnapShot);
      }

      xmlWriter.writeEndElement();
    }
    if (localCompileTimeTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "CompileTime", xmlWriter);

      if (localCompileTime == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("CompileTime cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localCompileTime);
      }

      xmlWriter.writeEndElement();
    }
    if (localLibrariesUsedTracker) {
      if (localLibrariesUsed == null) {
        throw new org.apache.axis2.databinding.ADBException("LibrariesUsed cannot be null!!");
      }
      localLibrariesUsed.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LibrariesUsed"),
          xmlWriter);
    }
    if (localCountGraphsTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "CountGraphs", xmlWriter);

      if (localCountGraphs == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("CountGraphs cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCountGraphs));
      }

      xmlWriter.writeEndElement();
    }
    if (localGraphIdsTracker) {
      if (localGraphIds == null) {
        throw new org.apache.axis2.databinding.ADBException("GraphIds cannot be null!!");
      }
      localGraphIds.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "GraphIds"), xmlWriter);
    }
    if (localResourceURLCountTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "ResourceURLCount", xmlWriter);

      if (localResourceURLCount == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("ResourceURLCount cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localResourceURLCount));
      }

      xmlWriter.writeEndElement();
    }
    if (localWsEclAddressesTracker) {
      if (localWsEclAddresses == null) {
        throw new org.apache.axis2.databinding.ADBException("WsEclAddresses cannot be null!!");
      }
      localWsEclAddresses.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WsEclAddresses"),
          xmlWriter);
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
    public static WUQueryDetailsResponse parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      WUQueryDetailsResponse object = new WUQueryDetailsResponse();

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

            if (!"WUQueryDetailsResponse".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (WUQueryDetailsResponse)
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ExtensionMapper
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions")
                    .equals(reader.getName())) {

              object.setExceptions(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ArrayOfEspException.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QueryId")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "QueryId" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setQueryId(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySet")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "QuerySet" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setQuerySet(
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "SuspendedBy")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SuspendedBy" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSuspendedBy(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Clusters")
                    .equals(reader.getName())) {

              object.setClusters(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ArrayOfClusterQueryState
                      .Factory.parse(reader));

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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LogicalFiles")
                    .equals(reader.getName())) {

              object.setLogicalFiles(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.EspStringArray.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "SuperFiles")
                    .equals(reader.getName())) {

              object.setSuperFiles(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.SuperFiles_type1.Factory
                      .parse(reader));

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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Priority")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Priority" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPriority(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUSnapShot")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "WUSnapShot" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setWUSnapShot(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "CompileTime")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "CompileTime" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setCompileTime(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LibrariesUsed")
                    .equals(reader.getName())) {

              object.setLibrariesUsed(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.EspStringArray.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "CountGraphs")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "CountGraphs" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setCountGraphs(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "GraphIds")
                    .equals(reader.getName())) {

              object.setGraphIds(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.EspStringArray.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "ResourceURLCount")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ResourceURLCount" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setResourceURLCount(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WsEclAddresses")
                    .equals(reader.getName())) {

              object.setWsEclAddresses(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.WsEclAddresses_type0.Factory
                      .parse(reader));

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

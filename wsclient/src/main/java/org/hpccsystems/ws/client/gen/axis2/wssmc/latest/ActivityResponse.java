/**
 * ActivityResponse.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 1.8.1 Built on : Jun 07,
 * 2022 (03:47:13 EDT)
 */
package org.hpccsystems.ws.client.gen.axis2.wssmc.latest;

/** ActivityResponse bean class */
@SuppressWarnings({"unchecked", "unused"})
public class ActivityResponse implements org.apache.axis2.databinding.ADBBean {

  public static final javax.xml.namespace.QName MY_QNAME =
      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ActivityResponse", "ns1");

  /** field for Exceptions */
  protected org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfEspException localExceptions;

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
   * @return org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfEspException
   */
  public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfEspException getExceptions() {
    return localExceptions;
  }

  /**
   * Auto generated setter method
   *
   * @param param Exceptions
   */
  public void setExceptions(
      org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfEspException param) {
    localExceptionsTracker = param != null;

    this.localExceptions = param;
  }

  /** field for Build */
  protected java.lang.String localBuild;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localBuildTracker = false;

  public boolean isBuildSpecified() {
    return localBuildTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getBuild() {
    return localBuild;
  }

  /**
   * Auto generated setter method
   *
   * @param param Build
   */
  public void setBuild(java.lang.String param) {
    localBuildTracker = param != null;

    this.localBuild = param;
  }

  /** field for ThorClusterList */
  protected org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfTargetCluster
      localThorClusterList;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localThorClusterListTracker = false;

  public boolean isThorClusterListSpecified() {
    return localThorClusterListTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfTargetCluster
   */
  public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfTargetCluster
      getThorClusterList() {
    return localThorClusterList;
  }

  /**
   * Auto generated setter method
   *
   * @param param ThorClusterList
   */
  public void setThorClusterList(
      org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfTargetCluster param) {
    localThorClusterListTracker = param != null;

    this.localThorClusterList = param;
  }

  /** field for RoxieClusterList */
  protected org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfTargetCluster
      localRoxieClusterList;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localRoxieClusterListTracker = false;

  public boolean isRoxieClusterListSpecified() {
    return localRoxieClusterListTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfTargetCluster
   */
  public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfTargetCluster
      getRoxieClusterList() {
    return localRoxieClusterList;
  }

  /**
   * Auto generated setter method
   *
   * @param param RoxieClusterList
   */
  public void setRoxieClusterList(
      org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfTargetCluster param) {
    localRoxieClusterListTracker = param != null;

    this.localRoxieClusterList = param;
  }

  /** field for HThorClusterList */
  protected org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfTargetCluster
      localHThorClusterList;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localHThorClusterListTracker = false;

  public boolean isHThorClusterListSpecified() {
    return localHThorClusterListTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfTargetCluster
   */
  public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfTargetCluster
      getHThorClusterList() {
    return localHThorClusterList;
  }

  /**
   * Auto generated setter method
   *
   * @param param HThorClusterList
   */
  public void setHThorClusterList(
      org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfTargetCluster param) {
    localHThorClusterListTracker = param != null;

    this.localHThorClusterList = param;
  }

  /** field for DFUJobs */
  protected org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfDFUJob localDFUJobs;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUJobsTracker = false;

  public boolean isDFUJobsSpecified() {
    return localDFUJobsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfDFUJob
   */
  public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfDFUJob getDFUJobs() {
    return localDFUJobs;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUJobs
   */
  public void setDFUJobs(org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfDFUJob param) {
    localDFUJobsTracker = param != null;

    this.localDFUJobs = param;
  }

  /** field for Running */
  protected org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfActiveWorkunit localRunning;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localRunningTracker = false;

  public boolean isRunningSpecified() {
    return localRunningTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfActiveWorkunit
   */
  public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfActiveWorkunit getRunning() {
    return localRunning;
  }

  /**
   * Auto generated setter method
   *
   * @param param Running
   */
  public void setRunning(
      org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfActiveWorkunit param) {
    localRunningTracker = param != null;

    this.localRunning = param;
  }

  /** field for BannerContent */
  protected java.lang.String localBannerContent;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localBannerContentTracker = false;

  public boolean isBannerContentSpecified() {
    return localBannerContentTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getBannerContent() {
    return localBannerContent;
  }

  /**
   * Auto generated setter method
   *
   * @param param BannerContent
   */
  public void setBannerContent(java.lang.String param) {
    localBannerContentTracker = param != null;

    this.localBannerContent = param;
  }

  /** field for BannerColor */
  protected java.lang.String localBannerColor;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localBannerColorTracker = false;

  public boolean isBannerColorSpecified() {
    return localBannerColorTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getBannerColor() {
    return localBannerColor;
  }

  /**
   * Auto generated setter method
   *
   * @param param BannerColor
   */
  public void setBannerColor(java.lang.String param) {
    localBannerColorTracker = param != null;

    this.localBannerColor = param;
  }

  /** field for BannerSize */
  protected java.lang.String localBannerSize;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localBannerSizeTracker = false;

  public boolean isBannerSizeSpecified() {
    return localBannerSizeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getBannerSize() {
    return localBannerSize;
  }

  /**
   * Auto generated setter method
   *
   * @param param BannerSize
   */
  public void setBannerSize(java.lang.String param) {
    localBannerSizeTracker = param != null;

    this.localBannerSize = param;
  }

  /** field for BannerScroll */
  protected java.lang.String localBannerScroll;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localBannerScrollTracker = false;

  public boolean isBannerScrollSpecified() {
    return localBannerScrollTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getBannerScroll() {
    return localBannerScroll;
  }

  /**
   * Auto generated setter method
   *
   * @param param BannerScroll
   */
  public void setBannerScroll(java.lang.String param) {
    localBannerScrollTracker = param != null;

    this.localBannerScroll = param;
  }

  /** field for ChatURL */
  protected java.lang.String localChatURL;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localChatURLTracker = false;

  public boolean isChatURLSpecified() {
    return localChatURLTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getChatURL() {
    return localChatURL;
  }

  /**
   * Auto generated setter method
   *
   * @param param ChatURL
   */
  public void setChatURL(java.lang.String param) {
    localChatURLTracker = param != null;

    this.localChatURL = param;
  }

  /** field for ShowBanner */
  protected int localShowBanner =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToInt("0");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localShowBannerTracker = false;

  public boolean isShowBannerSpecified() {
    return localShowBannerTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getShowBanner() {
    return localShowBanner;
  }

  /**
   * Auto generated setter method
   *
   * @param param ShowBanner
   */
  public void setShowBanner(int param) {

    // setting primitive attribute tracker to true
    localShowBannerTracker = param != java.lang.Integer.MIN_VALUE;

    this.localShowBanner = param;
  }

  /** field for ShowChatURL */
  protected int localShowChatURL =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToInt("0");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localShowChatURLTracker = false;

  public boolean isShowChatURLSpecified() {
    return localShowChatURLTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getShowChatURL() {
    return localShowChatURL;
  }

  /**
   * Auto generated setter method
   *
   * @param param ShowChatURL
   */
  public void setShowChatURL(int param) {

    // setting primitive attribute tracker to true
    localShowChatURLTracker = param != java.lang.Integer.MIN_VALUE;

    this.localShowChatURL = param;
  }

  /** field for SortBy */
  protected java.lang.String localSortBy;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSortByTracker = false;

  public boolean isSortBySpecified() {
    return localSortByTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getSortBy() {
    return localSortBy;
  }

  /**
   * Auto generated setter method
   *
   * @param param SortBy
   */
  public void setSortBy(java.lang.String param) {
    localSortByTracker = param != null;

    this.localSortBy = param;
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

  /** field for SuperUser */
  protected boolean localSuperUser =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSuperUserTracker = false;

  public boolean isSuperUserSpecified() {
    return localSuperUserTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getSuperUser() {
    return localSuperUser;
  }

  /**
   * Auto generated setter method
   *
   * @param param SuperUser
   */
  public void setSuperUser(boolean param) {

    // setting primitive attribute tracker to true
    localSuperUserTracker = true;

    this.localSuperUser = param;
  }

  /** field for AccessRight */
  protected java.lang.String localAccessRight;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localAccessRightTracker = false;

  public boolean isAccessRightSpecified() {
    return localAccessRightTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getAccessRight() {
    return localAccessRight;
  }

  /**
   * Auto generated setter method
   *
   * @param param AccessRight
   */
  public void setAccessRight(java.lang.String param) {
    localAccessRightTracker = param != null;

    this.localAccessRight = param;
  }

  /** field for ServerJobQueues */
  protected org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfServerJobQueue
      localServerJobQueues;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localServerJobQueuesTracker = false;

  public boolean isServerJobQueuesSpecified() {
    return localServerJobQueuesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfServerJobQueue
   */
  public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfServerJobQueue
      getServerJobQueues() {
    return localServerJobQueues;
  }

  /**
   * Auto generated setter method
   *
   * @param param ServerJobQueues
   */
  public void setServerJobQueues(
      org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfServerJobQueue param) {
    localServerJobQueuesTracker = param != null;

    this.localServerJobQueues = param;
  }

  /** field for ActivityTime */
  protected java.lang.String localActivityTime;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localActivityTimeTracker = false;

  public boolean isActivityTimeSpecified() {
    return localActivityTimeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getActivityTime() {
    return localActivityTime;
  }

  /**
   * Auto generated setter method
   *
   * @param param ActivityTime
   */
  public void setActivityTime(java.lang.String param) {
    localActivityTimeTracker = param != null;

    this.localActivityTime = param;
  }

  /** field for DaliDetached */
  protected boolean localDaliDetached;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDaliDetachedTracker = false;

  public boolean isDaliDetachedSpecified() {
    return localDaliDetachedTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getDaliDetached() {
    return localDaliDetached;
  }

  /**
   * Auto generated setter method
   *
   * @param param DaliDetached
   */
  public void setDaliDetached(boolean param) {

    // setting primitive attribute tracker to true
    localDaliDetachedTracker = true;

    this.localDaliDetached = param;
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

      java.lang.String namespacePrefix = registerPrefix(xmlWriter, "urn:hpccsystems:ws:wssmc");
      if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            namespacePrefix + ":ActivityResponse",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            "ActivityResponse",
            xmlWriter);
      }
    }
    if (localExceptionsTracker) {
      if (localExceptions == null) {
        throw new org.apache.axis2.databinding.ADBException("Exceptions cannot be null!!");
      }
      localExceptions.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions"), xmlWriter);
    }
    if (localBuildTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "Build", xmlWriter);

      if (localBuild == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Build cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localBuild);
      }

      xmlWriter.writeEndElement();
    }
    if (localThorClusterListTracker) {
      if (localThorClusterList == null) {
        throw new org.apache.axis2.databinding.ADBException("ThorClusterList cannot be null!!");
      }
      localThorClusterList.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ThorClusterList"), xmlWriter);
    }
    if (localRoxieClusterListTracker) {
      if (localRoxieClusterList == null) {
        throw new org.apache.axis2.databinding.ADBException("RoxieClusterList cannot be null!!");
      }
      localRoxieClusterList.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "RoxieClusterList"), xmlWriter);
    }
    if (localHThorClusterListTracker) {
      if (localHThorClusterList == null) {
        throw new org.apache.axis2.databinding.ADBException("HThorClusterList cannot be null!!");
      }
      localHThorClusterList.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "HThorClusterList"), xmlWriter);
    }
    if (localDFUJobsTracker) {
      if (localDFUJobs == null) {
        throw new org.apache.axis2.databinding.ADBException("DFUJobs cannot be null!!");
      }
      localDFUJobs.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "DFUJobs"), xmlWriter);
    }
    if (localRunningTracker) {
      if (localRunning == null) {
        throw new org.apache.axis2.databinding.ADBException("Running cannot be null!!");
      }
      localRunning.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Running"), xmlWriter);
    }
    if (localBannerContentTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "BannerContent", xmlWriter);

      if (localBannerContent == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("BannerContent cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localBannerContent);
      }

      xmlWriter.writeEndElement();
    }
    if (localBannerColorTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "BannerColor", xmlWriter);

      if (localBannerColor == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("BannerColor cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localBannerColor);
      }

      xmlWriter.writeEndElement();
    }
    if (localBannerSizeTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "BannerSize", xmlWriter);

      if (localBannerSize == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("BannerSize cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localBannerSize);
      }

      xmlWriter.writeEndElement();
    }
    if (localBannerScrollTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "BannerScroll", xmlWriter);

      if (localBannerScroll == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("BannerScroll cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localBannerScroll);
      }

      xmlWriter.writeEndElement();
    }
    if (localChatURLTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "ChatURL", xmlWriter);

      if (localChatURL == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ChatURL cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localChatURL);
      }

      xmlWriter.writeEndElement();
    }
    if (localShowBannerTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "ShowBanner", xmlWriter);

      if (localShowBanner == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("ShowBanner cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localShowBanner));
      }

      xmlWriter.writeEndElement();
    }
    if (localShowChatURLTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "ShowChatURL", xmlWriter);

      if (localShowChatURL == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("ShowChatURL cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localShowChatURL));
      }

      xmlWriter.writeEndElement();
    }
    if (localSortByTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "SortBy", xmlWriter);

      if (localSortBy == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("SortBy cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSortBy);
      }

      xmlWriter.writeEndElement();
    }
    if (localDescendingTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "Descending", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("Descending cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDescending));
      }

      xmlWriter.writeEndElement();
    }
    if (localSuperUserTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "SuperUser", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("SuperUser cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSuperUser));
      }

      xmlWriter.writeEndElement();
    }
    if (localAccessRightTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "AccessRight", xmlWriter);

      if (localAccessRight == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("AccessRight cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localAccessRight);
      }

      xmlWriter.writeEndElement();
    }
    if (localServerJobQueuesTracker) {
      if (localServerJobQueues == null) {
        throw new org.apache.axis2.databinding.ADBException("ServerJobQueues cannot be null!!");
      }
      localServerJobQueues.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ServerJobQueues"), xmlWriter);
    }
    if (localActivityTimeTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "ActivityTime", xmlWriter);

      if (localActivityTime == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ActivityTime cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localActivityTime);
      }

      xmlWriter.writeEndElement();
    }
    if (localDaliDetachedTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "DaliDetached", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("DaliDetached cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDaliDetached));
      }

      xmlWriter.writeEndElement();
    }
    xmlWriter.writeEndElement();
  }

  private static java.lang.String generatePrefix(java.lang.String namespace) {
    if (namespace.equals("urn:hpccsystems:ws:wssmc")) {
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
    public static ActivityResponse parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      ActivityResponse object = new ActivityResponse();

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

            if (!"ActivityResponse".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (ActivityResponse)
                  org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ExtensionMapper.getTypeObject(
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Exceptions")
                    .equals(reader.getName())) {

              object.setExceptions(
                  org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfEspException.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Build")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Build" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setBuild(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ThorClusterList")
                    .equals(reader.getName())) {

              object.setThorClusterList(
                  org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfTargetCluster.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "RoxieClusterList")
                    .equals(reader.getName())) {

              object.setRoxieClusterList(
                  org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfTargetCluster.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "HThorClusterList")
                    .equals(reader.getName())) {

              object.setHThorClusterList(
                  org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfTargetCluster.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "DFUJobs")
                    .equals(reader.getName())) {

              object.setDFUJobs(
                  org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfDFUJob.Factory.parse(
                      reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Running")
                    .equals(reader.getName())) {

              object.setRunning(
                  org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfActiveWorkunit.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "BannerContent")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "BannerContent" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setBannerContent(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "BannerColor")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "BannerColor" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setBannerColor(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "BannerSize")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "BannerSize" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setBannerSize(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "BannerScroll")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "BannerScroll" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setBannerScroll(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ChatURL")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ChatURL" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setChatURL(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ShowBanner")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ShowBanner" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setShowBanner(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ShowChatURL")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ShowChatURL" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setShowChatURL(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "SortBy")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SortBy" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSortBy(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Descending")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "SuperUser")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SuperUser" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSuperUser(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "AccessRight")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "AccessRight" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setAccessRight(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ServerJobQueues")
                    .equals(reader.getName())) {

              object.setServerJobQueues(
                  org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfServerJobQueue.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ActivityTime")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ActivityTime" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setActivityTime(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "DaliDetached")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "DaliDetached" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDaliDetached(
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

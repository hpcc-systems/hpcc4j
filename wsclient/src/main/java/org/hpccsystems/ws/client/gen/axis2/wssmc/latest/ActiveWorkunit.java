/**
 * ActiveWorkunit.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wssmc.latest;

/** ActiveWorkunit bean class */
@SuppressWarnings({"unchecked", "unused"})
public class ActiveWorkunit implements org.apache.axis2.databinding.ADBBean {
  /* This type was generated from the piece of schema that had
  name = ActiveWorkunit
  Namespace URI = urn:hpccsystems:ws:wssmc
  Namespace Prefix = ns1
  */

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

  /** field for StateID */
  protected int localStateID;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localStateIDTracker = false;

  public boolean isStateIDSpecified() {
    return localStateIDTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getStateID() {
    return localStateID;
  }

  /**
   * Auto generated setter method
   *
   * @param param StateID
   */
  public void setStateID(int param) {

    // setting primitive attribute tracker to true
    localStateIDTracker = param != java.lang.Integer.MIN_VALUE;

    this.localStateID = param;
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

  /** field for Server */
  protected java.lang.String localServer;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localServerTracker = false;

  public boolean isServerSpecified() {
    return localServerTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getServer() {
    return localServer;
  }

  /**
   * Auto generated setter method
   *
   * @param param Server
   */
  public void setServer(java.lang.String param) {
    localServerTracker = param != null;

    this.localServer = param;
  }

  /** field for Instance */
  protected java.lang.String localInstance;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localInstanceTracker = false;

  public boolean isInstanceSpecified() {
    return localInstanceTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getInstance() {
    return localInstance;
  }

  /**
   * Auto generated setter method
   *
   * @param param Instance
   */
  public void setInstance(java.lang.String param) {
    localInstanceTracker = param != null;

    this.localInstance = param;
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

  /** field for Extra */
  protected java.lang.String localExtra;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localExtraTracker = false;

  public boolean isExtraSpecified() {
    return localExtraTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getExtra() {
    return localExtra;
  }

  /**
   * Auto generated setter method
   *
   * @param param Extra
   */
  public void setExtra(java.lang.String param) {
    localExtraTracker = param != null;

    this.localExtra = param;
  }

  /** field for GraphName */
  protected java.lang.String localGraphName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localGraphNameTracker = false;

  public boolean isGraphNameSpecified() {
    return localGraphNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getGraphName() {
    return localGraphName;
  }

  /**
   * Auto generated setter method
   *
   * @param param GraphName
   */
  public void setGraphName(java.lang.String param) {
    localGraphNameTracker = param != null;

    this.localGraphName = param;
  }

  /** field for Duration */
  protected java.lang.String localDuration;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDurationTracker = false;

  public boolean isDurationSpecified() {
    return localDurationTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getDuration() {
    return localDuration;
  }

  /**
   * Auto generated setter method
   *
   * @param param Duration
   */
  public void setDuration(java.lang.String param) {
    localDurationTracker = param != null;

    this.localDuration = param;
  }

  /** field for GID */
  protected java.lang.String localGID;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localGIDTracker = false;

  public boolean isGIDSpecified() {
    return localGIDTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getGID() {
    return localGID;
  }

  /**
   * Auto generated setter method
   *
   * @param param GID
   */
  public void setGID(java.lang.String param) {
    localGIDTracker = param != null;

    this.localGID = param;
  }

  /** field for QueueName */
  protected java.lang.String localQueueName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localQueueNameTracker = false;

  public boolean isQueueNameSpecified() {
    return localQueueNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getQueueName() {
    return localQueueName;
  }

  /**
   * Auto generated setter method
   *
   * @param param QueueName
   */
  public void setQueueName(java.lang.String param) {
    localQueueNameTracker = param != null;

    this.localQueueName = param;
  }

  /** field for MemoryBlocked */
  protected int localMemoryBlocked;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localMemoryBlockedTracker = false;

  public boolean isMemoryBlockedSpecified() {
    return localMemoryBlockedTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getMemoryBlocked() {
    return localMemoryBlocked;
  }

  /**
   * Auto generated setter method
   *
   * @param param MemoryBlocked
   */
  public void setMemoryBlocked(int param) {

    // setting primitive attribute tracker to true
    localMemoryBlockedTracker = param != java.lang.Integer.MIN_VALUE;

    this.localMemoryBlocked = param;
  }

  /** field for IsPausing */
  protected boolean localIsPausing =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIsPausingTracker = false;

  public boolean isIsPausingSpecified() {
    return localIsPausingTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getIsPausing() {
    return localIsPausing;
  }

  /**
   * Auto generated setter method
   *
   * @param param IsPausing
   */
  public void setIsPausing(boolean param) {

    // setting primitive attribute tracker to true
    localIsPausingTracker = true;

    this.localIsPausing = param;
  }

  /** field for Warning */
  protected java.lang.String localWarning;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localWarningTracker = false;

  public boolean isWarningSpecified() {
    return localWarningTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getWarning() {
    return localWarning;
  }

  /**
   * Auto generated setter method
   *
   * @param param Warning
   */
  public void setWarning(java.lang.String param) {
    localWarningTracker = param != null;

    this.localWarning = param;
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

  /** field for ClusterType */
  protected java.lang.String localClusterType;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localClusterTypeTracker = false;

  public boolean isClusterTypeSpecified() {
    return localClusterTypeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getClusterType() {
    return localClusterType;
  }

  /**
   * Auto generated setter method
   *
   * @param param ClusterType
   */
  public void setClusterType(java.lang.String param) {
    localClusterTypeTracker = param != null;

    this.localClusterType = param;
  }

  /** field for ClusterQueueName */
  protected java.lang.String localClusterQueueName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localClusterQueueNameTracker = false;

  public boolean isClusterQueueNameSpecified() {
    return localClusterQueueNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getClusterQueueName() {
    return localClusterQueueName;
  }

  /**
   * Auto generated setter method
   *
   * @param param ClusterQueueName
   */
  public void setClusterQueueName(java.lang.String param) {
    localClusterQueueNameTracker = param != null;

    this.localClusterQueueName = param;
  }

  /** field for TargetClusterName */
  protected java.lang.String localTargetClusterName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTargetClusterNameTracker = false;

  public boolean isTargetClusterNameSpecified() {
    return localTargetClusterNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getTargetClusterName() {
    return localTargetClusterName;
  }

  /**
   * Auto generated setter method
   *
   * @param param TargetClusterName
   */
  public void setTargetClusterName(java.lang.String param) {
    localTargetClusterNameTracker = param != null;

    this.localTargetClusterName = param;
  }

  /** field for NoAccess */
  protected boolean localNoAccess =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localNoAccessTracker = false;

  public boolean isNoAccessSpecified() {
    return localNoAccessTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getNoAccess() {
    return localNoAccess;
  }

  /**
   * Auto generated setter method
   *
   * @param param NoAccess
   */
  public void setNoAccess(boolean param) {

    // setting primitive attribute tracker to true
    localNoAccessTracker = true;

    this.localNoAccess = param;
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

      java.lang.String namespacePrefix = registerPrefix(xmlWriter, "urn:hpccsystems:ws:wssmc");
      if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            namespacePrefix + ":ActiveWorkunit",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            "ActiveWorkunit",
            xmlWriter);
      }
    }
    if (localWuidTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "Wuid", xmlWriter);

      if (localWuid == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Wuid cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localWuid);
      }

      xmlWriter.writeEndElement();
    }
    if (localStateTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "State", xmlWriter);

      if (localState == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("State cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localState);
      }

      xmlWriter.writeEndElement();
    }
    if (localStateIDTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "StateID", xmlWriter);

      if (localStateID == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("StateID cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStateID));
      }

      xmlWriter.writeEndElement();
    }
    if (localOwnerTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "Owner", xmlWriter);

      if (localOwner == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Owner cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localOwner);
      }

      xmlWriter.writeEndElement();
    }
    if (localJobnameTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "Jobname", xmlWriter);

      if (localJobname == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Jobname cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localJobname);
      }

      xmlWriter.writeEndElement();
    }
    if (localServerTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "Server", xmlWriter);

      if (localServer == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Server cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localServer);
      }

      xmlWriter.writeEndElement();
    }
    if (localInstanceTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "Instance", xmlWriter);

      if (localInstance == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Instance cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localInstance);
      }

      xmlWriter.writeEndElement();
    }
    if (localPriorityTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "Priority", xmlWriter);

      if (localPriority == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Priority cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localPriority);
      }

      xmlWriter.writeEndElement();
    }
    if (localExtraTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "Extra", xmlWriter);

      if (localExtra == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Extra cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localExtra);
      }

      xmlWriter.writeEndElement();
    }
    if (localGraphNameTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "GraphName", xmlWriter);

      if (localGraphName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("GraphName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localGraphName);
      }

      xmlWriter.writeEndElement();
    }
    if (localDurationTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "Duration", xmlWriter);

      if (localDuration == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Duration cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localDuration);
      }

      xmlWriter.writeEndElement();
    }
    if (localGIDTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "GID", xmlWriter);

      if (localGID == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("GID cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localGID);
      }

      xmlWriter.writeEndElement();
    }
    if (localQueueNameTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "QueueName", xmlWriter);

      if (localQueueName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("QueueName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localQueueName);
      }

      xmlWriter.writeEndElement();
    }
    if (localMemoryBlockedTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "MemoryBlocked", xmlWriter);

      if (localMemoryBlocked == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("MemoryBlocked cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMemoryBlocked));
      }

      xmlWriter.writeEndElement();
    }
    if (localIsPausingTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "IsPausing", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("IsPausing cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsPausing));
      }

      xmlWriter.writeEndElement();
    }
    if (localWarningTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "Warning", xmlWriter);

      if (localWarning == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Warning cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localWarning);
      }

      xmlWriter.writeEndElement();
    }
    if (localClusterNameTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "ClusterName", xmlWriter);

      if (localClusterName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ClusterName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localClusterName);
      }

      xmlWriter.writeEndElement();
    }
    if (localClusterTypeTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "ClusterType", xmlWriter);

      if (localClusterType == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ClusterType cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localClusterType);
      }

      xmlWriter.writeEndElement();
    }
    if (localClusterQueueNameTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "ClusterQueueName", xmlWriter);

      if (localClusterQueueName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ClusterQueueName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localClusterQueueName);
      }

      xmlWriter.writeEndElement();
    }
    if (localTargetClusterNameTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "TargetClusterName", xmlWriter);

      if (localTargetClusterName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("TargetClusterName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localTargetClusterName);
      }

      xmlWriter.writeEndElement();
    }
    if (localNoAccessTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "NoAccess", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("NoAccess cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNoAccess));
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
    public static ActiveWorkunit parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      ActiveWorkunit object = new ActiveWorkunit();

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

            if (!"ActiveWorkunit".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (ActiveWorkunit)
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Wuid")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "State")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "StateID")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "StateID" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setStateID(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Owner")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Jobname")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Server")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Server" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setServer(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Instance")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Instance" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setInstance(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Priority")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Extra")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Extra" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setExtra(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "GraphName")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "GraphName" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setGraphName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Duration")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Duration" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDuration(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "GID")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "GID" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setGID(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "QueueName")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "QueueName" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setQueueName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "MemoryBlocked")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "MemoryBlocked" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setMemoryBlocked(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "IsPausing")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "IsPausing" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setIsPausing(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Warning")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Warning" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setWarning(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ClusterName")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ClusterType")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ClusterType" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setClusterType(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ClusterQueueName")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ClusterQueueName" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setClusterQueueName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "TargetClusterName")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "TargetClusterName" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setTargetClusterName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "NoAccess")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "NoAccess" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setNoAccess(
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

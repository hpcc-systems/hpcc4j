/**
 * WURecreateQueryResponse.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest;

/** WURecreateQueryResponse bean class */
@SuppressWarnings({"unchecked", "unused"})
public class WURecreateQueryResponse implements org.apache.axis2.databinding.ADBBean {

  public static final javax.xml.namespace.QName MY_QNAME =
      new javax.xml.namespace.QName(
          "urn:hpccsystems:ws:wsworkunits", "WURecreateQueryResponse", "ns1");

  /** field for Exceptions */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfEspException
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
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfEspException
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfEspException
      getExceptions() {
    return localExceptions;
  }

  /**
   * Auto generated setter method
   *
   * @param param Exceptions
   */
  public void setExceptions(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfEspException param) {
    localExceptionsTracker = param != null;

    this.localExceptions = param;
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

  /** field for ReloadFailed */
  protected boolean localReloadFailed;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localReloadFailedTracker = false;

  public boolean isReloadFailedSpecified() {
    return localReloadFailedTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getReloadFailed() {
    return localReloadFailed;
  }

  /**
   * Auto generated setter method
   *
   * @param param ReloadFailed
   */
  public void setReloadFailed(boolean param) {

    // setting primitive attribute tracker to true
    localReloadFailedTracker = true;

    this.localReloadFailed = param;
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

  /** field for ErrorMessage */
  protected java.lang.String localErrorMessage;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localErrorMessageTracker = false;

  public boolean isErrorMessageSpecified() {
    return localErrorMessageTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getErrorMessage() {
    return localErrorMessage;
  }

  /**
   * Auto generated setter method
   *
   * @param param ErrorMessage
   */
  public void setErrorMessage(java.lang.String param) {
    localErrorMessageTracker = param != null;

    this.localErrorMessage = param;
  }

  /** field for FileErrors */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.FileErrors_type4 localFileErrors;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localFileErrorsTracker = false;

  public boolean isFileErrorsSpecified() {
    return localFileErrorsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.FileErrors_type4
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.FileErrors_type4 getFileErrors() {
    return localFileErrors;
  }

  /**
   * Auto generated setter method
   *
   * @param param FileErrors
   */
  public void setFileErrors(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.FileErrors_type4 param) {
    localFileErrorsTracker = param != null;

    this.localFileErrors = param;
  }

  /** field for DfuPublisherWuid */
  protected java.lang.String localDfuPublisherWuid;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDfuPublisherWuidTracker = false;

  public boolean isDfuPublisherWuidSpecified() {
    return localDfuPublisherWuidTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getDfuPublisherWuid() {
    return localDfuPublisherWuid;
  }

  /**
   * Auto generated setter method
   *
   * @param param DfuPublisherWuid
   */
  public void setDfuPublisherWuid(java.lang.String param) {
    localDfuPublisherWuidTracker = param != null;

    this.localDfuPublisherWuid = param;
  }

  /** field for DfuPublisherState */
  protected java.lang.String localDfuPublisherState;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDfuPublisherStateTracker = false;

  public boolean isDfuPublisherStateSpecified() {
    return localDfuPublisherStateTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getDfuPublisherState() {
    return localDfuPublisherState;
  }

  /**
   * Auto generated setter method
   *
   * @param param DfuPublisherState
   */
  public void setDfuPublisherState(java.lang.String param) {
    localDfuPublisherStateTracker = param != null;

    this.localDfuPublisherState = param;
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
            namespacePrefix + ":WURecreateQueryResponse",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            "WURecreateQueryResponse",
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
    if (localMemoryLimitTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "MemoryLimit", xmlWriter);

      if (localMemoryLimit == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("MemoryLimit cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localMemoryLimit);
      }

      xmlWriter.writeEndElement();
    }
    if (localTimeLimitTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "TimeLimit", xmlWriter);

      if (localTimeLimit == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("TimeLimit cannot be null!!");

      } else {

        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeLimit));
      }

      xmlWriter.writeEndElement();
    }
    if (localWarnTimeLimitTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "WarnTimeLimit", xmlWriter);

      if (localWarnTimeLimit == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("WarnTimeLimit cannot be null!!");

      } else {

        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWarnTimeLimit));
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
    if (localReloadFailedTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "ReloadFailed", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("ReloadFailed cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReloadFailed));
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
    if (localErrorMessageTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "ErrorMessage", xmlWriter);

      if (localErrorMessage == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ErrorMessage cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localErrorMessage);
      }

      xmlWriter.writeEndElement();
    }
    if (localFileErrorsTracker) {
      if (localFileErrors == null) {
        throw new org.apache.axis2.databinding.ADBException("FileErrors cannot be null!!");
      }
      localFileErrors.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "FileErrors"), xmlWriter);
    }
    if (localDfuPublisherWuidTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "DfuPublisherWuid", xmlWriter);

      if (localDfuPublisherWuid == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("DfuPublisherWuid cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localDfuPublisherWuid);
      }

      xmlWriter.writeEndElement();
    }
    if (localDfuPublisherStateTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "DfuPublisherState", xmlWriter);

      if (localDfuPublisherState == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("DfuPublisherState cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localDfuPublisherState);
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
    public static WURecreateQueryResponse parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      WURecreateQueryResponse object = new WURecreateQueryResponse();

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

            if (!"WURecreateQueryResponse".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (WURecreateQueryResponse)
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions")
                    .equals(reader.getName())) {

              object.setExceptions(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfEspException.Factory
                      .parse(reader));

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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "MemoryLimit")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "MemoryLimit" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setMemoryLimit(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "TimeLimit")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "TimeLimit" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setTimeLimit(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(
                      content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WarnTimeLimit")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "WarnTimeLimit" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setWarnTimeLimit(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(
                      content));

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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ReloadFailed")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ReloadFailed" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setReloadFailed(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ErrorMessage")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ErrorMessage" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setErrorMessage(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "FileErrors")
                    .equals(reader.getName())) {

              object.setFileErrors(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.FileErrors_type4.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "DfuPublisherWuid")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "DfuPublisherWuid" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDfuPublisherWuid(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "DfuPublisherState")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "DfuPublisherState" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDfuPublisherState(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

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

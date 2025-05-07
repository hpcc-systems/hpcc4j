/**
 * WUGetZAPInfoResponse.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest;

/** WUGetZAPInfoResponse bean class */
@SuppressWarnings({"unchecked", "unused"})
public class WUGetZAPInfoResponse implements org.apache.axis2.databinding.ADBBean {

  public static final javax.xml.namespace.QName MY_QNAME =
      new javax.xml.namespace.QName(
          "urn:hpccsystems:ws:wsworkunits", "WUGetZAPInfoResponse", "ns1");

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

  /** field for ESPApplication */
  protected java.lang.String localESPApplication;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localESPApplicationTracker = false;

  public boolean isESPApplicationSpecified() {
    return localESPApplicationTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getESPApplication() {
    return localESPApplication;
  }

  /**
   * Auto generated setter method
   *
   * @param param ESPApplication
   */
  public void setESPApplication(java.lang.String param) {
    localESPApplicationTracker = param != null;

    this.localESPApplication = param;
  }

  /** field for ThorProcesses */
  protected java.lang.String localThorProcesses;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localThorProcessesTracker = false;

  public boolean isThorProcessesSpecified() {
    return localThorProcessesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getThorProcesses() {
    return localThorProcesses;
  }

  /**
   * Auto generated setter method
   *
   * @param param ThorProcesses
   */
  public void setThorProcesses(java.lang.String param) {
    localThorProcessesTracker = param != null;

    this.localThorProcesses = param;
  }

  /** field for BuildVersion */
  protected java.lang.String localBuildVersion;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localBuildVersionTracker = false;

  public boolean isBuildVersionSpecified() {
    return localBuildVersionTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getBuildVersion() {
    return localBuildVersion;
  }

  /**
   * Auto generated setter method
   *
   * @param param BuildVersion
   */
  public void setBuildVersion(java.lang.String param) {
    localBuildVersionTracker = param != null;

    this.localBuildVersion = param;
  }

  /** field for Archive */
  protected java.lang.String localArchive;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localArchiveTracker = false;

  public boolean isArchiveSpecified() {
    return localArchiveTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getArchive() {
    return localArchive;
  }

  /**
   * Auto generated setter method
   *
   * @param param Archive
   */
  public void setArchive(java.lang.String param) {
    localArchiveTracker = param != null;

    this.localArchive = param;
  }

  /** field for EmailTo */
  protected java.lang.String localEmailTo;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localEmailToTracker = false;

  public boolean isEmailToSpecified() {
    return localEmailToTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getEmailTo() {
    return localEmailTo;
  }

  /**
   * Auto generated setter method
   *
   * @param param EmailTo
   */
  public void setEmailTo(java.lang.String param) {
    localEmailToTracker = param != null;

    this.localEmailTo = param;
  }

  /** field for EmailFrom */
  protected java.lang.String localEmailFrom;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localEmailFromTracker = false;

  public boolean isEmailFromSpecified() {
    return localEmailFromTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getEmailFrom() {
    return localEmailFrom;
  }

  /**
   * Auto generated setter method
   *
   * @param param EmailFrom
   */
  public void setEmailFrom(java.lang.String param) {
    localEmailFromTracker = param != null;

    this.localEmailFrom = param;
  }

  /** field for Message */
  protected java.lang.String localMessage;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localMessageTracker = false;

  public boolean isMessageSpecified() {
    return localMessageTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getMessage() {
    return localMessage;
  }

  /**
   * Auto generated setter method
   *
   * @param param Message
   */
  public void setMessage(java.lang.String param) {
    localMessageTracker = param != null;

    this.localMessage = param;
  }

  /** field for IsContainerized */
  protected boolean localIsContainerized =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIsContainerizedTracker = false;

  public boolean isIsContainerizedSpecified() {
    return localIsContainerizedTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getIsContainerized() {
    return localIsContainerized;
  }

  /**
   * Auto generated setter method
   *
   * @param param IsContainerized
   */
  public void setIsContainerized(boolean param) {

    // setting primitive attribute tracker to true
    localIsContainerizedTracker = true;

    this.localIsContainerized = param;
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
            namespacePrefix + ":WUGetZAPInfoResponse",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            "WUGetZAPInfoResponse",
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
    if (localESPApplicationTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "ESPApplication", xmlWriter);

      if (localESPApplication == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ESPApplication cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localESPApplication);
      }

      xmlWriter.writeEndElement();
    }
    if (localThorProcessesTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "ThorProcesses", xmlWriter);

      if (localThorProcesses == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ThorProcesses cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localThorProcesses);
      }

      xmlWriter.writeEndElement();
    }
    if (localBuildVersionTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "BuildVersion", xmlWriter);

      if (localBuildVersion == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("BuildVersion cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localBuildVersion);
      }

      xmlWriter.writeEndElement();
    }
    if (localArchiveTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Archive", xmlWriter);

      if (localArchive == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Archive cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localArchive);
      }

      xmlWriter.writeEndElement();
    }
    if (localEmailToTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "EmailTo", xmlWriter);

      if (localEmailTo == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("EmailTo cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localEmailTo);
      }

      xmlWriter.writeEndElement();
    }
    if (localEmailFromTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "EmailFrom", xmlWriter);

      if (localEmailFrom == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("EmailFrom cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localEmailFrom);
      }

      xmlWriter.writeEndElement();
    }
    if (localMessageTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Message", xmlWriter);

      if (localMessage == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Message cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localMessage);
      }

      xmlWriter.writeEndElement();
    }
    if (localIsContainerizedTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "IsContainerized", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("IsContainerized cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsContainerized));
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
    public static WUGetZAPInfoResponse parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      WUGetZAPInfoResponse object = new WUGetZAPInfoResponse();

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

            if (!"WUGetZAPInfoResponse".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (WUGetZAPInfoResponse)
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ESPApplication")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ESPApplication" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setESPApplication(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ThorProcesses")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ThorProcesses" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setThorProcesses(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "BuildVersion")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "BuildVersion" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setBuildVersion(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Archive")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Archive" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setArchive(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "EmailTo")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "EmailTo" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setEmailTo(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "EmailFrom")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "EmailFrom" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setEmailFrom(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Message")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Message" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setMessage(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "IsContainerized")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "IsContainerized" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setIsContainerized(
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

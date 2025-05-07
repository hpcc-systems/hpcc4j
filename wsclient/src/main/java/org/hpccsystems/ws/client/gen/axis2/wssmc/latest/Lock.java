/**
 * Lock.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wssmc.latest;

/** Lock bean class */
@SuppressWarnings({"unchecked", "unused"})
public class Lock implements org.apache.axis2.databinding.ADBBean {
  /* This type was generated from the piece of schema that had
  name = Lock
  Namespace URI = urn:hpccsystems:ws:wssmc
  Namespace Prefix = ns1
  */

  /** field for EPIP */
  protected java.lang.String localEPIP;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localEPIPTracker = false;

  public boolean isEPIPSpecified() {
    return localEPIPTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getEPIP() {
    return localEPIP;
  }

  /**
   * Auto generated setter method
   *
   * @param param EPIP
   */
  public void setEPIP(java.lang.String param) {
    localEPIPTracker = param != null;

    this.localEPIP = param;
  }

  /** field for XPath */
  protected java.lang.String localXPath;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localXPathTracker = false;

  public boolean isXPathSpecified() {
    return localXPathTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getXPath() {
    return localXPath;
  }

  /**
   * Auto generated setter method
   *
   * @param param XPath
   */
  public void setXPath(java.lang.String param) {
    localXPathTracker = param != null;

    this.localXPath = param;
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

  /** field for SessionID */
  protected long localSessionID;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSessionIDTracker = false;

  public boolean isSessionIDSpecified() {
    return localSessionIDTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getSessionID() {
    return localSessionID;
  }

  /**
   * Auto generated setter method
   *
   * @param param SessionID
   */
  public void setSessionID(long param) {

    // setting primitive attribute tracker to true
    localSessionIDTracker = param != java.lang.Long.MIN_VALUE;

    this.localSessionID = param;
  }

  /** field for DurationMS */
  protected org.apache.axis2.databinding.types.UnsignedInt localDurationMS;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDurationMSTracker = false;

  public boolean isDurationMSSpecified() {
    return localDurationMSTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.apache.axis2.databinding.types.UnsignedInt
   */
  public org.apache.axis2.databinding.types.UnsignedInt getDurationMS() {
    return localDurationMS;
  }

  /**
   * Auto generated setter method
   *
   * @param param DurationMS
   */
  public void setDurationMS(org.apache.axis2.databinding.types.UnsignedInt param) {
    localDurationMSTracker = param != null;

    this.localDurationMS = param;
  }

  /** field for TimeLocked */
  protected java.lang.String localTimeLocked;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTimeLockedTracker = false;

  public boolean isTimeLockedSpecified() {
    return localTimeLockedTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getTimeLocked() {
    return localTimeLocked;
  }

  /**
   * Auto generated setter method
   *
   * @param param TimeLocked
   */
  public void setTimeLocked(java.lang.String param) {
    localTimeLockedTracker = param != null;

    this.localTimeLocked = param;
  }

  /** field for Modes */
  protected java.lang.String localModes;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localModesTracker = false;

  public boolean isModesSpecified() {
    return localModesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getModes() {
    return localModes;
  }

  /**
   * Auto generated setter method
   *
   * @param param Modes
   */
  public void setModes(java.lang.String param) {
    localModesTracker = param != null;

    this.localModes = param;
  }

  /** field for ModeNames */
  protected org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspStringArray localModeNames;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localModeNamesTracker = false;

  public boolean isModeNamesSpecified() {
    return localModeNamesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspStringArray
   */
  public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspStringArray getModeNames() {
    return localModeNames;
  }

  /**
   * Auto generated setter method
   *
   * @param param ModeNames
   */
  public void setModeNames(org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspStringArray param) {
    localModeNamesTracker = param != null;

    this.localModeNames = param;
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
            namespacePrefix + ":Lock",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "Lock", xmlWriter);
      }
    }
    if (localEPIPTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "EPIP", xmlWriter);

      if (localEPIP == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("EPIP cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localEPIP);
      }

      xmlWriter.writeEndElement();
    }
    if (localXPathTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "XPath", xmlWriter);

      if (localXPath == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("XPath cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localXPath);
      }

      xmlWriter.writeEndElement();
    }
    if (localLogicalFileTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "LogicalFile", xmlWriter);

      if (localLogicalFile == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("LogicalFile cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localLogicalFile);
      }

      xmlWriter.writeEndElement();
    }
    if (localSessionIDTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "SessionID", xmlWriter);

      if (localSessionID == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("SessionID cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSessionID));
      }

      xmlWriter.writeEndElement();
    }
    if (localDurationMSTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "DurationMS", xmlWriter);

      if (localDurationMS == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("DurationMS cannot be null!!");

      } else {

        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDurationMS));
      }

      xmlWriter.writeEndElement();
    }
    if (localTimeLockedTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "TimeLocked", xmlWriter);

      if (localTimeLocked == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("TimeLocked cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localTimeLocked);
      }

      xmlWriter.writeEndElement();
    }
    if (localModesTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "Modes", xmlWriter);

      if (localModes == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Modes cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localModes);
      }

      xmlWriter.writeEndElement();
    }
    if (localModeNamesTracker) {
      if (localModeNames == null) {
        throw new org.apache.axis2.databinding.ADBException("ModeNames cannot be null!!");
      }
      localModeNames.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ModeNames"), xmlWriter);
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
    public static Lock parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
      Lock object = new Lock();

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

            if (!"Lock".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (Lock)
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "EPIP")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "EPIP" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setEPIP(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "XPath")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "XPath" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setXPath(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "LogicalFile")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "SessionID")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SessionID" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSessionID(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "DurationMS")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "DurationMS" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDurationMS(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "TimeLocked")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "TimeLocked" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setTimeLocked(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Modes")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Modes" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setModes(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ModeNames")
                    .equals(reader.getName())) {

              object.setModeNames(
                  org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspStringArray.Factory.parse(
                      reader));

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

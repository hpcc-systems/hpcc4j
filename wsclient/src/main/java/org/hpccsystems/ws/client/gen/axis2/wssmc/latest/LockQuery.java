/**
 * LockQuery.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wssmc.latest;

/** LockQuery bean class */
@SuppressWarnings({"unchecked", "unused"})
public class LockQuery implements org.apache.axis2.databinding.ADBBean {

  public static final javax.xml.namespace.QName MY_QNAME =
      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "LockQuery", "ns1");

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

  /** field for DurationMSLow */
  protected org.apache.axis2.databinding.types.UnsignedInt localDurationMSLow;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDurationMSLowTracker = false;

  public boolean isDurationMSLowSpecified() {
    return localDurationMSLowTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.apache.axis2.databinding.types.UnsignedInt
   */
  public org.apache.axis2.databinding.types.UnsignedInt getDurationMSLow() {
    return localDurationMSLow;
  }

  /**
   * Auto generated setter method
   *
   * @param param DurationMSLow
   */
  public void setDurationMSLow(org.apache.axis2.databinding.types.UnsignedInt param) {
    localDurationMSLowTracker = param != null;

    this.localDurationMSLow = param;
  }

  /** field for DurationMSHigh */
  protected org.apache.axis2.databinding.types.UnsignedInt localDurationMSHigh;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDurationMSHighTracker = false;

  public boolean isDurationMSHighSpecified() {
    return localDurationMSHighTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.apache.axis2.databinding.types.UnsignedInt
   */
  public org.apache.axis2.databinding.types.UnsignedInt getDurationMSHigh() {
    return localDurationMSHigh;
  }

  /**
   * Auto generated setter method
   *
   * @param param DurationMSHigh
   */
  public void setDurationMSHigh(org.apache.axis2.databinding.types.UnsignedInt param) {
    localDurationMSHighTracker = param != null;

    this.localDurationMSHigh = param;
  }

  /** field for TimeLockedLow */
  protected java.lang.String localTimeLockedLow;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTimeLockedLowTracker = false;

  public boolean isTimeLockedLowSpecified() {
    return localTimeLockedLowTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getTimeLockedLow() {
    return localTimeLockedLow;
  }

  /**
   * Auto generated setter method
   *
   * @param param TimeLockedLow
   */
  public void setTimeLockedLow(java.lang.String param) {
    localTimeLockedLowTracker = param != null;

    this.localTimeLockedLow = param;
  }

  /** field for TimeLockedHigh */
  protected java.lang.String localTimeLockedHigh;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTimeLockedHighTracker = false;

  public boolean isTimeLockedHighSpecified() {
    return localTimeLockedHighTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getTimeLockedHigh() {
    return localTimeLockedHigh;
  }

  /**
   * Auto generated setter method
   *
   * @param param TimeLockedHigh
   */
  public void setTimeLockedHigh(java.lang.String param) {
    localTimeLockedHighTracker = param != null;

    this.localTimeLockedHigh = param;
  }

  /** field for Mode */
  protected org.hpccsystems.ws.client.gen.axis2.wssmc.latest.LockModes localMode;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localModeTracker = false;

  public boolean isModeSpecified() {
    return localModeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wssmc.latest.LockModes
   */
  public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.LockModes getMode() {
    return localMode;
  }

  /**
   * Auto generated setter method
   *
   * @param param Mode
   */
  public void setMode(org.hpccsystems.ws.client.gen.axis2.wssmc.latest.LockModes param) {
    localModeTracker = param != null;

    this.localMode = param;
  }

  /** field for AllFileLocks */
  protected boolean localAllFileLocks =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localAllFileLocksTracker = false;

  public boolean isAllFileLocksSpecified() {
    return localAllFileLocksTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getAllFileLocks() {
    return localAllFileLocks;
  }

  /**
   * Auto generated setter method
   *
   * @param param AllFileLocks
   */
  public void setAllFileLocks(boolean param) {

    // setting primitive attribute tracker to true
    localAllFileLocksTracker = true;

    this.localAllFileLocks = param;
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
            namespacePrefix + ":LockQuery",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "LockQuery", xmlWriter);
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
    if (localDurationMSLowTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "DurationMSLow", xmlWriter);

      if (localDurationMSLow == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("DurationMSLow cannot be null!!");

      } else {

        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDurationMSLow));
      }

      xmlWriter.writeEndElement();
    }
    if (localDurationMSHighTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "DurationMSHigh", xmlWriter);

      if (localDurationMSHigh == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("DurationMSHigh cannot be null!!");

      } else {

        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDurationMSHigh));
      }

      xmlWriter.writeEndElement();
    }
    if (localTimeLockedLowTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "TimeLockedLow", xmlWriter);

      if (localTimeLockedLow == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("TimeLockedLow cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localTimeLockedLow);
      }

      xmlWriter.writeEndElement();
    }
    if (localTimeLockedHighTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "TimeLockedHigh", xmlWriter);

      if (localTimeLockedHigh == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("TimeLockedHigh cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localTimeLockedHigh);
      }

      xmlWriter.writeEndElement();
    }
    if (localModeTracker) {
      if (localMode == null) {
        throw new org.apache.axis2.databinding.ADBException("Mode cannot be null!!");
      }
      localMode.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Mode"), xmlWriter);
    }
    if (localAllFileLocksTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "AllFileLocks", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("AllFileLocks cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAllFileLocks));
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
    public static LockQuery parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      LockQuery object = new LockQuery();

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

            if (!"LockQuery".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (LockQuery)
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "DurationMSLow")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "DurationMSLow" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDurationMSLow(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "DurationMSHigh")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "DurationMSHigh" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDurationMSHigh(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "TimeLockedLow")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "TimeLockedLow" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setTimeLockedLow(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "TimeLockedHigh")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "TimeLockedHigh" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setTimeLockedHigh(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "Mode")
                    .equals(reader.getName())) {

              object.setMode(
                  org.hpccsystems.ws.client.gen.axis2.wssmc.latest.LockModes.Factory.parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "AllFileLocks")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "AllFileLocks" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setAllFileLocks(
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

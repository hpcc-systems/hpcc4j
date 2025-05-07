/**
 * DFUFileAccessInfo.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsdfu.latest;

/** DFUFileAccessInfo bean class */
@SuppressWarnings({"unchecked", "unused"})
public class DFUFileAccessInfo implements org.apache.axis2.databinding.ADBBean {
  /* This type was generated from the piece of schema that had
  name = DFUFileAccessInfo
  Namespace URI = urn:hpccsystems:ws:wsdfu
  Namespace Prefix = ns1
  */

  /** field for MetaInfoBlob */
  protected java.lang.String localMetaInfoBlob;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localMetaInfoBlobTracker = false;

  public boolean isMetaInfoBlobSpecified() {
    return localMetaInfoBlobTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getMetaInfoBlob() {
    return localMetaInfoBlob;
  }

  /**
   * Auto generated setter method
   *
   * @param param MetaInfoBlob
   */
  public void setMetaInfoBlob(java.lang.String param) {
    localMetaInfoBlobTracker = param != null;

    this.localMetaInfoBlob = param;
  }

  /** field for ExpiryTime */
  protected java.lang.String localExpiryTime;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localExpiryTimeTracker = false;

  public boolean isExpiryTimeSpecified() {
    return localExpiryTimeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getExpiryTime() {
    return localExpiryTime;
  }

  /**
   * Auto generated setter method
   *
   * @param param ExpiryTime
   */
  public void setExpiryTime(java.lang.String param) {
    localExpiryTimeTracker = param != null;

    this.localExpiryTime = param;
  }

  /** field for NumParts */
  protected int localNumParts;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localNumPartsTracker = false;

  public boolean isNumPartsSpecified() {
    return localNumPartsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getNumParts() {
    return localNumParts;
  }

  /**
   * Auto generated setter method
   *
   * @param param NumParts
   */
  public void setNumParts(int param) {

    // setting primitive attribute tracker to true
    localNumPartsTracker = param != java.lang.Integer.MIN_VALUE;

    this.localNumParts = param;
  }

  /** field for FileLocations */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUPartLocation
      localFileLocations;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localFileLocationsTracker = false;

  public boolean isFileLocationsSpecified() {
    return localFileLocationsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUPartLocation
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUPartLocation
      getFileLocations() {
    return localFileLocations;
  }

  /**
   * Auto generated setter method
   *
   * @param param FileLocations
   */
  public void setFileLocations(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUPartLocation param) {
    localFileLocationsTracker = param != null;

    this.localFileLocations = param;
  }

  /** field for FileParts */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFilePart localFileParts;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localFilePartsTracker = false;

  public boolean isFilePartsSpecified() {
    return localFilePartsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFilePart
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFilePart getFileParts() {
    return localFileParts;
  }

  /**
   * Auto generated setter method
   *
   * @param param FileParts
   */
  public void setFileParts(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFilePart param) {
    localFilePartsTracker = param != null;

    this.localFileParts = param;
  }

  /** field for RecordTypeInfoJson */
  protected java.lang.String localRecordTypeInfoJson;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localRecordTypeInfoJsonTracker = false;

  public boolean isRecordTypeInfoJsonSpecified() {
    return localRecordTypeInfoJsonTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getRecordTypeInfoJson() {
    return localRecordTypeInfoJson;
  }

  /**
   * Auto generated setter method
   *
   * @param param RecordTypeInfoJson
   */
  public void setRecordTypeInfoJson(java.lang.String param) {
    localRecordTypeInfoJsonTracker = param != null;

    this.localRecordTypeInfoJson = param;
  }

  /** field for FileAccessPort */
  protected int localFileAccessPort;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localFileAccessPortTracker = false;

  public boolean isFileAccessPortSpecified() {
    return localFileAccessPortTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getFileAccessPort() {
    return localFileAccessPort;
  }

  /**
   * Auto generated setter method
   *
   * @param param FileAccessPort
   */
  public void setFileAccessPort(int param) {

    // setting primitive attribute tracker to true
    localFileAccessPortTracker = param != java.lang.Integer.MIN_VALUE;

    this.localFileAccessPort = param;
  }

  /** field for FileAccessSSL */
  protected boolean localFileAccessSSL;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localFileAccessSSLTracker = false;

  public boolean isFileAccessSSLSpecified() {
    return localFileAccessSSLTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getFileAccessSSL() {
    return localFileAccessSSL;
  }

  /**
   * Auto generated setter method
   *
   * @param param FileAccessSSL
   */
  public void setFileAccessSSL(boolean param) {

    // setting primitive attribute tracker to true
    localFileAccessSSLTracker = true;

    this.localFileAccessSSL = param;
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

      java.lang.String namespacePrefix = registerPrefix(xmlWriter, "urn:hpccsystems:ws:wsdfu");
      if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            namespacePrefix + ":DFUFileAccessInfo",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            "DFUFileAccessInfo",
            xmlWriter);
      }
    }
    if (localMetaInfoBlobTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "MetaInfoBlob", xmlWriter);

      if (localMetaInfoBlob == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("MetaInfoBlob cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localMetaInfoBlob);
      }

      xmlWriter.writeEndElement();
    }
    if (localExpiryTimeTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "ExpiryTime", xmlWriter);

      if (localExpiryTime == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ExpiryTime cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localExpiryTime);
      }

      xmlWriter.writeEndElement();
    }
    if (localNumPartsTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "NumParts", xmlWriter);

      if (localNumParts == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("NumParts cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumParts));
      }

      xmlWriter.writeEndElement();
    }
    if (localFileLocationsTracker) {
      if (localFileLocations == null) {
        throw new org.apache.axis2.databinding.ADBException("FileLocations cannot be null!!");
      }
      localFileLocations.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FileLocations"), xmlWriter);
    }
    if (localFilePartsTracker) {
      if (localFileParts == null) {
        throw new org.apache.axis2.databinding.ADBException("FileParts cannot be null!!");
      }
      localFileParts.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FileParts"), xmlWriter);
    }
    if (localRecordTypeInfoJsonTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "RecordTypeInfoJson", xmlWriter);

      if (localRecordTypeInfoJson == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("RecordTypeInfoJson cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localRecordTypeInfoJson);
      }

      xmlWriter.writeEndElement();
    }
    if (localFileAccessPortTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "fileAccessPort", xmlWriter);

      if (localFileAccessPort == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("fileAccessPort cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFileAccessPort));
      }

      xmlWriter.writeEndElement();
    }
    if (localFileAccessSSLTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "fileAccessSSL", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("fileAccessSSL cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFileAccessSSL));
      }

      xmlWriter.writeEndElement();
    }
    xmlWriter.writeEndElement();
  }

  private static java.lang.String generatePrefix(java.lang.String namespace) {
    if (namespace.equals("urn:hpccsystems:ws:wsdfu")) {
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
    public static DFUFileAccessInfo parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      DFUFileAccessInfo object = new DFUFileAccessInfo();

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

            if (!"DFUFileAccessInfo".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (DFUFileAccessInfo)
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ExtensionMapper.getTypeObject(
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "MetaInfoBlob")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "MetaInfoBlob" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setMetaInfoBlob(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ExpiryTime")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ExpiryTime" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setExpiryTime(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "NumParts")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "NumParts" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setNumParts(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FileLocations")
                    .equals(reader.getName())) {

              object.setFileLocations(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUPartLocation.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FileParts")
                    .equals(reader.getName())) {

              object.setFileParts(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFilePart.Factory.parse(
                      reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "RecordTypeInfoJson")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "RecordTypeInfoJson" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setRecordTypeInfoJson(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "fileAccessPort")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "fileAccessPort" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setFileAccessPort(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "fileAccessSSL")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "fileAccessSSL" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setFileAccessSSL(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else {
              // 3 - A start element we are not expecting indicates an invalid parameter was passed

              log.warn("Unexpected subelement " + reader.getLocalName());
              // consume everything, ending on the unexpected subelement's endtag
              javax.xml.namespace.QName subQName = reader.getName();
              while (!(reader.isEndElement() && reader.getName().equals(subQName))) {
                reader.next();
              }
              // skip past this extra element completely
              reader.next();
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

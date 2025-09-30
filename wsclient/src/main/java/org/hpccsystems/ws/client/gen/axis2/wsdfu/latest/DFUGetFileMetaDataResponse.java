/**
 * DFUGetFileMetaDataResponse.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsdfu.latest;

/** DFUGetFileMetaDataResponse bean class */
@SuppressWarnings({"unchecked", "unused"})
public class DFUGetFileMetaDataResponse implements org.apache.axis2.databinding.ADBBean {

  public static final javax.xml.namespace.QName MY_QNAME =
      new javax.xml.namespace.QName(
          "urn:hpccsystems:ws:wsdfu", "DFUGetFileMetaDataResponse", "ns4");

  /** field for Exceptions */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfEspException localExceptions;

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
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfEspException
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfEspException getExceptions() {
    return localExceptions;
  }

  /**
   * Auto generated setter method
   *
   * @param param Exceptions
   */
  public void setExceptions(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfEspException param) {
    localExceptionsTracker = param != null;

    this.localExceptions = param;
  }

  /** field for TotalColumnCount */
  protected int localTotalColumnCount;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTotalColumnCountTracker = false;

  public boolean isTotalColumnCountSpecified() {
    return localTotalColumnCountTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getTotalColumnCount() {
    return localTotalColumnCount;
  }

  /**
   * Auto generated setter method
   *
   * @param param TotalColumnCount
   */
  public void setTotalColumnCount(int param) {

    // setting primitive attribute tracker to true
    localTotalColumnCountTracker = param != java.lang.Integer.MIN_VALUE;

    this.localTotalColumnCount = param;
  }

  /** field for KeyedColumnCount */
  protected int localKeyedColumnCount;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localKeyedColumnCountTracker = false;

  public boolean isKeyedColumnCountSpecified() {
    return localKeyedColumnCountTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getKeyedColumnCount() {
    return localKeyedColumnCount;
  }

  /**
   * Auto generated setter method
   *
   * @param param KeyedColumnCount
   */
  public void setKeyedColumnCount(int param) {

    // setting primitive attribute tracker to true
    localKeyedColumnCountTracker = param != java.lang.Integer.MIN_VALUE;

    this.localKeyedColumnCount = param;
  }

  /** field for DataColumns */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUDataColumn localDataColumns;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDataColumnsTracker = false;

  public boolean isDataColumnsSpecified() {
    return localDataColumnsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUDataColumn getDataColumns() {
    return localDataColumns;
  }

  /**
   * Auto generated setter method
   *
   * @param param DataColumns
   */
  public void setDataColumns(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUDataColumn param) {
    localDataColumnsTracker = param != null;

    this.localDataColumns = param;
  }

  /** field for XmlSchema */
  protected java.lang.String localXmlSchema;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localXmlSchemaTracker = false;

  public boolean isXmlSchemaSpecified() {
    return localXmlSchemaTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getXmlSchema() {
    return localXmlSchema;
  }

  /**
   * Auto generated setter method
   *
   * @param param XmlSchema
   */
  public void setXmlSchema(java.lang.String param) {
    localXmlSchemaTracker = param != null;

    this.localXmlSchema = param;
  }

  /** field for XmlXPathSchema */
  protected java.lang.String localXmlXPathSchema;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localXmlXPathSchemaTracker = false;

  public boolean isXmlXPathSchemaSpecified() {
    return localXmlXPathSchemaTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getXmlXPathSchema() {
    return localXmlXPathSchema;
  }

  /**
   * Auto generated setter method
   *
   * @param param XmlXPathSchema
   */
  public void setXmlXPathSchema(java.lang.String param) {
    localXmlXPathSchemaTracker = param != null;

    this.localXmlXPathSchema = param;
  }

  /** field for TotalResultRows */
  protected long localTotalResultRows;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTotalResultRowsTracker = false;

  public boolean isTotalResultRowsSpecified() {
    return localTotalResultRowsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getTotalResultRows() {
    return localTotalResultRows;
  }

  /**
   * Auto generated setter method
   *
   * @param param TotalResultRows
   */
  public void setTotalResultRows(long param) {

    // setting primitive attribute tracker to true
    localTotalResultRowsTracker = param != java.lang.Long.MIN_VALUE;

    this.localTotalResultRows = param;
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

      java.lang.String namespacePrefix = registerPrefix(xmlWriter, "urn:hpccsystems:ws:wsdfu");
      if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            namespacePrefix + ":DFUGetFileMetaDataResponse",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            "DFUGetFileMetaDataResponse",
            xmlWriter);
      }
    }
    if (localExceptionsTracker) {
      if (localExceptions == null) {
        throw new org.apache.axis2.databinding.ADBException("Exceptions cannot be null!!");
      }
      localExceptions.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"), xmlWriter);
    }
    if (localTotalColumnCountTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "TotalColumnCount", xmlWriter);

      if (localTotalColumnCount == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("TotalColumnCount cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localTotalColumnCount));
      }

      xmlWriter.writeEndElement();
    }
    if (localKeyedColumnCountTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "KeyedColumnCount", xmlWriter);

      if (localKeyedColumnCount == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("KeyedColumnCount cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localKeyedColumnCount));
      }

      xmlWriter.writeEndElement();
    }
    if (localDataColumnsTracker) {
      if (localDataColumns == null) {
        throw new org.apache.axis2.databinding.ADBException("DataColumns cannot be null!!");
      }
      localDataColumns.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DataColumns"), xmlWriter);
    }
    if (localXmlSchemaTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "XmlSchema", xmlWriter);

      if (localXmlSchema == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("XmlSchema cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localXmlSchema);
      }

      xmlWriter.writeEndElement();
    }
    if (localXmlXPathSchemaTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "XmlXPathSchema", xmlWriter);

      if (localXmlXPathSchema == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("XmlXPathSchema cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localXmlXPathSchema);
      }

      xmlWriter.writeEndElement();
    }
    if (localTotalResultRowsTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "TotalResultRows", xmlWriter);

      if (localTotalResultRows == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("TotalResultRows cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotalResultRows));
      }

      xmlWriter.writeEndElement();
    }
    xmlWriter.writeEndElement();
  }

  private static java.lang.String generatePrefix(java.lang.String namespace) {
    if (namespace.equals("urn:hpccsystems:ws:wsdfu")) {
      return "ns4";
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
    public static DFUGetFileMetaDataResponse parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      DFUGetFileMetaDataResponse object = new DFUGetFileMetaDataResponse();

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

            if (!"DFUGetFileMetaDataResponse".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (DFUGetFileMetaDataResponse)
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions")
                    .equals(reader.getName())) {

              object.setExceptions(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfEspException.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "TotalColumnCount")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "TotalColumnCount" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setTotalColumnCount(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "KeyedColumnCount")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "KeyedColumnCount" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setKeyedColumnCount(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DataColumns")
                    .equals(reader.getName())) {

              object.setDataColumns(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "XmlSchema")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "XmlSchema" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setXmlSchema(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "XmlXPathSchema")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "XmlXPathSchema" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setXmlXPathSchema(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "TotalResultRows")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "TotalResultRows" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setTotalResultRows(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

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

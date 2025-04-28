/**
 * DFUDataColumn.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39;

/** DFUDataColumn bean class */
@SuppressWarnings({"unchecked", "unused"})
public class DFUDataColumn implements org.apache.axis2.databinding.ADBBean {
  /* This type was generated from the piece of schema that had
  name = DFUDataColumn
  Namespace URI = urn:hpccsystems:ws:wsdfu
  Namespace Prefix = ns1
  */

  /** field for ColumnID */
  protected int localColumnID;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localColumnIDTracker = false;

  public boolean isColumnIDSpecified() {
    return localColumnIDTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getColumnID() {
    return localColumnID;
  }

  /**
   * Auto generated setter method
   *
   * @param param ColumnID
   */
  public void setColumnID(int param) {

    // setting primitive attribute tracker to true
    localColumnIDTracker = param != java.lang.Integer.MIN_VALUE;

    this.localColumnID = param;
  }

  /** field for ColumnLabel */
  protected java.lang.String localColumnLabel;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localColumnLabelTracker = false;

  public boolean isColumnLabelSpecified() {
    return localColumnLabelTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getColumnLabel() {
    return localColumnLabel;
  }

  /**
   * Auto generated setter method
   *
   * @param param ColumnLabel
   */
  public void setColumnLabel(java.lang.String param) {
    localColumnLabelTracker = param != null;

    this.localColumnLabel = param;
  }

  /** field for ColumnType */
  protected java.lang.String localColumnType;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localColumnTypeTracker = false;

  public boolean isColumnTypeSpecified() {
    return localColumnTypeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getColumnType() {
    return localColumnType;
  }

  /**
   * Auto generated setter method
   *
   * @param param ColumnType
   */
  public void setColumnType(java.lang.String param) {
    localColumnTypeTracker = param != null;

    this.localColumnType = param;
  }

  /** field for ColumnValue */
  protected java.lang.String localColumnValue;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localColumnValueTracker = false;

  public boolean isColumnValueSpecified() {
    return localColumnValueTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getColumnValue() {
    return localColumnValue;
  }

  /**
   * Auto generated setter method
   *
   * @param param ColumnValue
   */
  public void setColumnValue(java.lang.String param) {
    localColumnValueTracker = param != null;

    this.localColumnValue = param;
  }

  /** field for ColumnSize */
  protected int localColumnSize;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localColumnSizeTracker = false;

  public boolean isColumnSizeSpecified() {
    return localColumnSizeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getColumnSize() {
    return localColumnSize;
  }

  /**
   * Auto generated setter method
   *
   * @param param ColumnSize
   */
  public void setColumnSize(int param) {

    // setting primitive attribute tracker to true
    localColumnSizeTracker = param != java.lang.Integer.MIN_VALUE;

    this.localColumnSize = param;
  }

  /** field for MaxSize */
  protected int localMaxSize;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localMaxSizeTracker = false;

  public boolean isMaxSizeSpecified() {
    return localMaxSizeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getMaxSize() {
    return localMaxSize;
  }

  /**
   * Auto generated setter method
   *
   * @param param MaxSize
   */
  public void setMaxSize(int param) {

    // setting primitive attribute tracker to true
    localMaxSizeTracker = param != java.lang.Integer.MIN_VALUE;

    this.localMaxSize = param;
  }

  /** field for ColumnEclType */
  protected java.lang.String localColumnEclType;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localColumnEclTypeTracker = false;

  public boolean isColumnEclTypeSpecified() {
    return localColumnEclTypeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getColumnEclType() {
    return localColumnEclType;
  }

  /**
   * Auto generated setter method
   *
   * @param param ColumnEclType
   */
  public void setColumnEclType(java.lang.String param) {
    localColumnEclTypeTracker = param != null;

    this.localColumnEclType = param;
  }

  /** field for ColumnRawSize */
  protected int localColumnRawSize;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localColumnRawSizeTracker = false;

  public boolean isColumnRawSizeSpecified() {
    return localColumnRawSizeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getColumnRawSize() {
    return localColumnRawSize;
  }

  /**
   * Auto generated setter method
   *
   * @param param ColumnRawSize
   */
  public void setColumnRawSize(int param) {

    // setting primitive attribute tracker to true
    localColumnRawSizeTracker = param != java.lang.Integer.MIN_VALUE;

    this.localColumnRawSize = param;
  }

  /** field for IsNaturalColumn */
  protected boolean localIsNaturalColumn;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIsNaturalColumnTracker = false;

  public boolean isIsNaturalColumnSpecified() {
    return localIsNaturalColumnTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getIsNaturalColumn() {
    return localIsNaturalColumn;
  }

  /**
   * Auto generated setter method
   *
   * @param param IsNaturalColumn
   */
  public void setIsNaturalColumn(boolean param) {

    // setting primitive attribute tracker to true
    localIsNaturalColumnTracker = true;

    this.localIsNaturalColumn = param;
  }

  /** field for IsKeyedColumn */
  protected boolean localIsKeyedColumn;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIsKeyedColumnTracker = false;

  public boolean isIsKeyedColumnSpecified() {
    return localIsKeyedColumnTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getIsKeyedColumn() {
    return localIsKeyedColumn;
  }

  /**
   * Auto generated setter method
   *
   * @param param IsKeyedColumn
   */
  public void setIsKeyedColumn(boolean param) {

    // setting primitive attribute tracker to true
    localIsKeyedColumnTracker = true;

    this.localIsKeyedColumn = param;
  }

  /** field for DataColumns */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn localDataColumns;

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
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn getDataColumns() {
    return localDataColumns;
  }

  /**
   * Auto generated setter method
   *
   * @param param DataColumns
   */
  public void setDataColumns(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDataColumnsTracker = param != null;

    this.localDataColumns = param;
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
            namespacePrefix + ":DFUDataColumn",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "DFUDataColumn", xmlWriter);
      }
    }
    if (localColumnIDTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "ColumnID", xmlWriter);

      if (localColumnID == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("ColumnID cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localColumnID));
      }

      xmlWriter.writeEndElement();
    }
    if (localColumnLabelTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "ColumnLabel", xmlWriter);

      if (localColumnLabel == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ColumnLabel cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localColumnLabel);
      }

      xmlWriter.writeEndElement();
    }
    if (localColumnTypeTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "ColumnType", xmlWriter);

      if (localColumnType == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ColumnType cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localColumnType);
      }

      xmlWriter.writeEndElement();
    }
    if (localColumnValueTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "ColumnValue", xmlWriter);

      if (localColumnValue == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ColumnValue cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localColumnValue);
      }

      xmlWriter.writeEndElement();
    }
    if (localColumnSizeTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "ColumnSize", xmlWriter);

      if (localColumnSize == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("ColumnSize cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localColumnSize));
      }

      xmlWriter.writeEndElement();
    }
    if (localMaxSizeTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "MaxSize", xmlWriter);

      if (localMaxSize == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("MaxSize cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxSize));
      }

      xmlWriter.writeEndElement();
    }
    if (localColumnEclTypeTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "ColumnEclType", xmlWriter);

      if (localColumnEclType == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ColumnEclType cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localColumnEclType);
      }

      xmlWriter.writeEndElement();
    }
    if (localColumnRawSizeTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "ColumnRawSize", xmlWriter);

      if (localColumnRawSize == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("ColumnRawSize cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localColumnRawSize));
      }

      xmlWriter.writeEndElement();
    }
    if (localIsNaturalColumnTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "IsNaturalColumn", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("IsNaturalColumn cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsNaturalColumn));
      }

      xmlWriter.writeEndElement();
    }
    if (localIsKeyedColumnTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "IsKeyedColumn", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("IsKeyedColumn cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsKeyedColumn));
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
    public static DFUDataColumn parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      DFUDataColumn object = new DFUDataColumn();

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

            if (!"DFUDataColumn".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (DFUDataColumn)
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ExtensionMapper.getTypeObject(
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ColumnID")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ColumnID" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setColumnID(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ColumnLabel")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ColumnLabel" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setColumnLabel(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ColumnType")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ColumnType" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setColumnType(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ColumnValue")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ColumnValue" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setColumnValue(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ColumnSize")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ColumnSize" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setColumnSize(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "MaxSize")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "MaxSize" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setMaxSize(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ColumnEclType")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ColumnEclType" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setColumnEclType(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ColumnRawSize")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ColumnRawSize" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setColumnRawSize(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "IsNaturalColumn")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "IsNaturalColumn" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setIsNaturalColumn(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "IsKeyedColumn")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "IsKeyedColumn" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setIsKeyedColumn(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DataColumns")
                    .equals(reader.getName())) {

              object.setDataColumns(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
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

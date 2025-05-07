/**
 * CreateTableAndLoadRequest.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wssql.latest;

/** CreateTableAndLoadRequest bean class */
@SuppressWarnings({"unchecked", "unused"})
public class CreateTableAndLoadRequest implements org.apache.axis2.databinding.ADBBean {

  public static final javax.xml.namespace.QName MY_QNAME =
      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "CreateTableAndLoadRequest", "ns1");

  /** field for TableName */
  protected java.lang.String localTableName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTableNameTracker = false;

  public boolean isTableNameSpecified() {
    return localTableNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getTableName() {
    return localTableName;
  }

  /**
   * Auto generated setter method
   *
   * @param param TableName
   */
  public void setTableName(java.lang.String param) {
    localTableNameTracker = param != null;

    this.localTableName = param;
  }

  /** field for TableDescription */
  protected java.lang.String localTableDescription;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTableDescriptionTracker = false;

  public boolean isTableDescriptionSpecified() {
    return localTableDescriptionTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getTableDescription() {
    return localTableDescription;
  }

  /**
   * Auto generated setter method
   *
   * @param param TableDescription
   */
  public void setTableDescription(java.lang.String param) {
    localTableDescriptionTracker = param != null;

    this.localTableDescription = param;
  }

  /** field for Overwrite */
  protected org.apache.axiom.om.OMElement localOverwrite;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localOverwriteTracker = false;

  public boolean isOverwriteSpecified() {
    return localOverwriteTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.apache.axiom.om.OMElement
   */
  public org.apache.axiom.om.OMElement getOverwrite() {
    return localOverwrite;
  }

  /**
   * Auto generated setter method
   *
   * @param param Overwrite
   */
  public void setOverwrite(org.apache.axiom.om.OMElement param) {
    localOverwriteTracker = param != null;

    this.localOverwrite = param;
  }

  /** field for EclFields */
  protected org.hpccsystems.ws.client.gen.axis2.wssql.latest.EclFields_type0 localEclFields;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localEclFieldsTracker = false;

  public boolean isEclFieldsSpecified() {
    return localEclFieldsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wssql.latest.EclFields_type0
   */
  public org.hpccsystems.ws.client.gen.axis2.wssql.latest.EclFields_type0 getEclFields() {
    return localEclFields;
  }

  /**
   * Auto generated setter method
   *
   * @param param EclFields
   */
  public void setEclFields(org.hpccsystems.ws.client.gen.axis2.wssql.latest.EclFields_type0 param) {
    localEclFieldsTracker = param != null;

    this.localEclFields = param;
  }

  /** field for TargetCluster */
  protected java.lang.String localTargetCluster;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTargetClusterTracker = false;

  public boolean isTargetClusterSpecified() {
    return localTargetClusterTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getTargetCluster() {
    return localTargetCluster;
  }

  /**
   * Auto generated setter method
   *
   * @param param TargetCluster
   */
  public void setTargetCluster(java.lang.String param) {
    localTargetClusterTracker = param != null;

    this.localTargetCluster = param;
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

  /** field for DataSource */
  protected org.hpccsystems.ws.client.gen.axis2.wssql.latest.DataSourceInfo localDataSource;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDataSourceTracker = false;

  public boolean isDataSourceSpecified() {
    return localDataSourceTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wssql.latest.DataSourceInfo
   */
  public org.hpccsystems.ws.client.gen.axis2.wssql.latest.DataSourceInfo getDataSource() {
    return localDataSource;
  }

  /**
   * Auto generated setter method
   *
   * @param param DataSource
   */
  public void setDataSource(org.hpccsystems.ws.client.gen.axis2.wssql.latest.DataSourceInfo param) {
    localDataSourceTracker = param != null;

    this.localDataSource = param;
  }

  /** field for DataSourceType */
  protected org.hpccsystems.ws.client.gen.axis2.wssql.latest.DataType localDataSourceType;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDataSourceTypeTracker = false;

  public boolean isDataSourceTypeSpecified() {
    return localDataSourceTypeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wssql.latest.DataType
   */
  public org.hpccsystems.ws.client.gen.axis2.wssql.latest.DataType getDataSourceType() {
    return localDataSourceType;
  }

  /**
   * Auto generated setter method
   *
   * @param param DataSourceType
   */
  public void setDataSourceType(org.hpccsystems.ws.client.gen.axis2.wssql.latest.DataType param) {
    localDataSourceTypeTracker = param != null;

    this.localDataSourceType = param;
  }

  /** field for Wait */
  protected int localWait = org.apache.axis2.databinding.utils.ConverterUtil.convertToInt("-1");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localWaitTracker = false;

  public boolean isWaitSpecified() {
    return localWaitTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getWait() {
    return localWait;
  }

  /**
   * Auto generated setter method
   *
   * @param param Wait
   */
  public void setWait(int param) {

    // setting primitive attribute tracker to true
    localWaitTracker = param != java.lang.Integer.MIN_VALUE;

    this.localWait = param;
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

      java.lang.String namespacePrefix = registerPrefix(xmlWriter, "urn:hpccsystems:ws:wssql");
      if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            namespacePrefix + ":CreateTableAndLoadRequest",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            "CreateTableAndLoadRequest",
            xmlWriter);
      }
    }
    if (localTableNameTracker) {
      namespace = "urn:hpccsystems:ws:wssql";
      writeStartElement(null, namespace, "TableName", xmlWriter);

      if (localTableName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("TableName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localTableName);
      }

      xmlWriter.writeEndElement();
    }
    if (localTableDescriptionTracker) {
      namespace = "urn:hpccsystems:ws:wssql";
      writeStartElement(null, namespace, "TableDescription", xmlWriter);

      if (localTableDescription == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("TableDescription cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localTableDescription);
      }

      xmlWriter.writeEndElement();
    }
    if (localOverwriteTracker) {
      namespace = "urn:hpccsystems:ws:wssql";
      writeStartElement(null, namespace, "Overwrite", xmlWriter);

      if (localOverwrite == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Overwrite cannot be null!!");

      } else {

        localOverwrite.serialize(xmlWriter);
      }

      xmlWriter.writeEndElement();
    }
    if (localEclFieldsTracker) {
      if (localEclFields == null) {
        throw new org.apache.axis2.databinding.ADBException("EclFields cannot be null!!");
      }
      localEclFields.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "EclFields"), xmlWriter);
    }
    if (localTargetClusterTracker) {
      namespace = "urn:hpccsystems:ws:wssql";
      writeStartElement(null, namespace, "TargetCluster", xmlWriter);

      if (localTargetCluster == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("TargetCluster cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localTargetCluster);
      }

      xmlWriter.writeEndElement();
    }
    if (localOwnerTracker) {
      namespace = "urn:hpccsystems:ws:wssql";
      writeStartElement(null, namespace, "Owner", xmlWriter);

      if (localOwner == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Owner cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localOwner);
      }

      xmlWriter.writeEndElement();
    }
    if (localDataSourceTracker) {
      if (localDataSource == null) {
        throw new org.apache.axis2.databinding.ADBException("DataSource cannot be null!!");
      }
      localDataSource.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "DataSource"), xmlWriter);
    }
    if (localDataSourceTypeTracker) {
      if (localDataSourceType == null) {
        throw new org.apache.axis2.databinding.ADBException("DataSourceType cannot be null!!");
      }
      localDataSourceType.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "DataSourceType"), xmlWriter);
    }
    if (localWaitTracker) {
      namespace = "urn:hpccsystems:ws:wssql";
      writeStartElement(null, namespace, "Wait", xmlWriter);

      if (localWait == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("Wait cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWait));
      }

      xmlWriter.writeEndElement();
    }
    xmlWriter.writeEndElement();
  }

  private static java.lang.String generatePrefix(java.lang.String namespace) {
    if (namespace.equals("urn:hpccsystems:ws:wssql")) {
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
    public static CreateTableAndLoadRequest parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      CreateTableAndLoadRequest object = new CreateTableAndLoadRequest();

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

            if (!"CreateTableAndLoadRequest".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (CreateTableAndLoadRequest)
                  org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExtensionMapper.getTypeObject(
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "TableName")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "TableName" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setTableName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "TableDescription")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "TableDescription" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setTableDescription(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Overwrite" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              org.apache.axiom.om.OMFactory fac =
                  org.apache.axiom.om.OMAbstractFactory.getOMFactory();
              org.apache.axiom.om.OMNamespace omNs =
                  fac.createOMNamespace("urn:hpccsystems:ws:wssql", "");
              org.apache.axiom.om.OMElement _valueOverwrite =
                  fac.createOMElement("Overwrite", omNs);
              _valueOverwrite.addChild(fac.createOMText(_valueOverwrite, content));
              object.setOverwrite(_valueOverwrite);

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "EclFields")
                    .equals(reader.getName())) {

              object.setEclFields(
                  org.hpccsystems.ws.client.gen.axis2.wssql.latest.EclFields_type0.Factory.parse(
                      reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "TargetCluster")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "TargetCluster" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setTargetCluster(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Owner")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "DataSource")
                    .equals(reader.getName())) {

              object.setDataSource(
                  org.hpccsystems.ws.client.gen.axis2.wssql.latest.DataSourceInfo.Factory.parse(
                      reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "DataSourceType")
                    .equals(reader.getName())) {

              object.setDataSourceType(
                  org.hpccsystems.ws.client.gen.axis2.wssql.latest.DataType.Factory.parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Wait")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Wait" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setWait(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

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

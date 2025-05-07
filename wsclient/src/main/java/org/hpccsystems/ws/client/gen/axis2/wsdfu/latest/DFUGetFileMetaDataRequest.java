/**
 * DFUGetFileMetaDataRequest.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsdfu.latest;

/** DFUGetFileMetaDataRequest bean class */
@SuppressWarnings({"unchecked", "unused"})
public class DFUGetFileMetaDataRequest implements org.apache.axis2.databinding.ADBBean {

  public static final javax.xml.namespace.QName MY_QNAME =
      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUGetFileMetaDataRequest", "ns1");

  /** field for LogicalFileName */
  protected java.lang.String localLogicalFileName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localLogicalFileNameTracker = false;

  public boolean isLogicalFileNameSpecified() {
    return localLogicalFileNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getLogicalFileName() {
    return localLogicalFileName;
  }

  /**
   * Auto generated setter method
   *
   * @param param LogicalFileName
   */
  public void setLogicalFileName(java.lang.String param) {
    localLogicalFileNameTracker = param != null;

    this.localLogicalFileName = param;
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

  /** field for IncludeXmlSchema */
  protected boolean localIncludeXmlSchema =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIncludeXmlSchemaTracker = false;

  public boolean isIncludeXmlSchemaSpecified() {
    return localIncludeXmlSchemaTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getIncludeXmlSchema() {
    return localIncludeXmlSchema;
  }

  /**
   * Auto generated setter method
   *
   * @param param IncludeXmlSchema
   */
  public void setIncludeXmlSchema(boolean param) {

    // setting primitive attribute tracker to true
    localIncludeXmlSchemaTracker = true;

    this.localIncludeXmlSchema = param;
  }

  /** field for AddHeaderInXmlSchema */
  protected boolean localAddHeaderInXmlSchema =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localAddHeaderInXmlSchemaTracker = false;

  public boolean isAddHeaderInXmlSchemaSpecified() {
    return localAddHeaderInXmlSchemaTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getAddHeaderInXmlSchema() {
    return localAddHeaderInXmlSchema;
  }

  /**
   * Auto generated setter method
   *
   * @param param AddHeaderInXmlSchema
   */
  public void setAddHeaderInXmlSchema(boolean param) {

    // setting primitive attribute tracker to true
    localAddHeaderInXmlSchemaTracker = true;

    this.localAddHeaderInXmlSchema = param;
  }

  /** field for IncludeXmlXPathSchema */
  protected boolean localIncludeXmlXPathSchema =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIncludeXmlXPathSchemaTracker = false;

  public boolean isIncludeXmlXPathSchemaSpecified() {
    return localIncludeXmlXPathSchemaTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getIncludeXmlXPathSchema() {
    return localIncludeXmlXPathSchema;
  }

  /**
   * Auto generated setter method
   *
   * @param param IncludeXmlXPathSchema
   */
  public void setIncludeXmlXPathSchema(boolean param) {

    // setting primitive attribute tracker to true
    localIncludeXmlXPathSchemaTracker = true;

    this.localIncludeXmlXPathSchema = param;
  }

  /** field for AddHeaderInXmlXPathSchema */
  protected boolean localAddHeaderInXmlXPathSchema =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localAddHeaderInXmlXPathSchemaTracker = false;

  public boolean isAddHeaderInXmlXPathSchemaSpecified() {
    return localAddHeaderInXmlXPathSchemaTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getAddHeaderInXmlXPathSchema() {
    return localAddHeaderInXmlXPathSchema;
  }

  /**
   * Auto generated setter method
   *
   * @param param AddHeaderInXmlXPathSchema
   */
  public void setAddHeaderInXmlXPathSchema(boolean param) {

    // setting primitive attribute tracker to true
    localAddHeaderInXmlXPathSchemaTracker = true;

    this.localAddHeaderInXmlXPathSchema = param;
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
            namespacePrefix + ":DFUGetFileMetaDataRequest",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            "DFUGetFileMetaDataRequest",
            xmlWriter);
      }
    }
    if (localLogicalFileNameTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "LogicalFileName", xmlWriter);

      if (localLogicalFileName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("LogicalFileName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localLogicalFileName);
      }

      xmlWriter.writeEndElement();
    }
    if (localClusterNameTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "ClusterName", xmlWriter);

      if (localClusterName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ClusterName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localClusterName);
      }

      xmlWriter.writeEndElement();
    }
    if (localIncludeXmlSchemaTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "IncludeXmlSchema", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("IncludeXmlSchema cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localIncludeXmlSchema));
      }

      xmlWriter.writeEndElement();
    }
    if (localAddHeaderInXmlSchemaTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "AddHeaderInXmlSchema", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException(
            "AddHeaderInXmlSchema cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localAddHeaderInXmlSchema));
      }

      xmlWriter.writeEndElement();
    }
    if (localIncludeXmlXPathSchemaTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "IncludeXmlXPathSchema", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException(
            "IncludeXmlXPathSchema cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localIncludeXmlXPathSchema));
      }

      xmlWriter.writeEndElement();
    }
    if (localAddHeaderInXmlXPathSchemaTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "AddHeaderInXmlXPathSchema", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException(
            "AddHeaderInXmlXPathSchema cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localAddHeaderInXmlXPathSchema));
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
    public static DFUGetFileMetaDataRequest parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      DFUGetFileMetaDataRequest object = new DFUGetFileMetaDataRequest();

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

            if (!"DFUGetFileMetaDataRequest".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (DFUGetFileMetaDataRequest)
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "LogicalFileName")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "LogicalFileName" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setLogicalFileName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ClusterName")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "IncludeXmlSchema")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "IncludeXmlSchema" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setIncludeXmlSchema(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "AddHeaderInXmlSchema")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "AddHeaderInXmlSchema" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setAddHeaderInXmlSchema(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "IncludeXmlXPathSchema")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "IncludeXmlXPathSchema" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setIncludeXmlXPathSchema(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "AddHeaderInXmlXPathSchema")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "AddHeaderInXmlXPathSchema" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setAddHeaderInXmlXPathSchema(
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

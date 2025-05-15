/**
 * DFUArrayActionRequest.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsdfu.latest;

/** DFUArrayActionRequest bean class */
@SuppressWarnings({"unchecked", "unused"})
public class DFUArrayActionRequest implements org.apache.axis2.databinding.ADBBean {

  public static final javax.xml.namespace.QName MY_QNAME =
      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUArrayActionRequest", "ns1");

  /** field for Type */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUArrayActions localType;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTypeTracker = false;

  public boolean isTypeSpecified() {
    return localTypeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUArrayActions
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUArrayActions getType() {
    return localType;
  }

  /**
   * Auto generated setter method
   *
   * @param param Type
   */
  public void setType(org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUArrayActions param) {
    localTypeTracker = param != null;

    this.localType = param;
  }

  /** field for NoDelete */
  protected boolean localNoDelete;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localNoDeleteTracker = false;

  public boolean isNoDeleteSpecified() {
    return localNoDeleteTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getNoDelete() {
    return localNoDelete;
  }

  /**
   * Auto generated setter method
   *
   * @param param NoDelete
   */
  public void setNoDelete(boolean param) {

    // setting primitive attribute tracker to true
    localNoDeleteTracker = true;

    this.localNoDelete = param;
  }

  /** field for BackToPage */
  protected java.lang.String localBackToPage;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localBackToPageTracker = false;

  public boolean isBackToPageSpecified() {
    return localBackToPageTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getBackToPage() {
    return localBackToPage;
  }

  /**
   * Auto generated setter method
   *
   * @param param BackToPage
   */
  public void setBackToPage(java.lang.String param) {
    localBackToPageTracker = param != null;

    this.localBackToPage = param;
  }

  /** field for LogicalFiles */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspStringArray localLogicalFiles;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localLogicalFilesTracker = false;

  public boolean isLogicalFilesSpecified() {
    return localLogicalFilesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspStringArray
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspStringArray getLogicalFiles() {
    return localLogicalFiles;
  }

  /**
   * Auto generated setter method
   *
   * @param param LogicalFiles
   */
  public void setLogicalFiles(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspStringArray param) {
    localLogicalFilesTracker = param != null;

    this.localLogicalFiles = param;
  }

  /** field for RemoveFromSuperfiles */
  protected boolean localRemoveFromSuperfiles =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localRemoveFromSuperfilesTracker = false;

  public boolean isRemoveFromSuperfilesSpecified() {
    return localRemoveFromSuperfilesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getRemoveFromSuperfiles() {
    return localRemoveFromSuperfiles;
  }

  /**
   * Auto generated setter method
   *
   * @param param RemoveFromSuperfiles
   */
  public void setRemoveFromSuperfiles(boolean param) {

    // setting primitive attribute tracker to true
    localRemoveFromSuperfilesTracker = true;

    this.localRemoveFromSuperfiles = param;
  }

  /** field for RemoveRecursively */
  protected boolean localRemoveRecursively =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localRemoveRecursivelyTracker = false;

  public boolean isRemoveRecursivelySpecified() {
    return localRemoveRecursivelyTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getRemoveRecursively() {
    return localRemoveRecursively;
  }

  /**
   * Auto generated setter method
   *
   * @param param RemoveRecursively
   */
  public void setRemoveRecursively(boolean param) {

    // setting primitive attribute tracker to true
    localRemoveRecursivelyTracker = true;

    this.localRemoveRecursively = param;
  }

  /** field for Protect */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUChangeProtection localProtect;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localProtectTracker = false;

  public boolean isProtectSpecified() {
    return localProtectTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUChangeProtection
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUChangeProtection getProtect() {
    return localProtect;
  }

  /**
   * Auto generated setter method
   *
   * @param param Protect
   */
  public void setProtect(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUChangeProtection param) {
    localProtectTracker = param != null;

    this.localProtect = param;
  }

  /** field for Restrict */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUChangeRestriction localRestrict;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localRestrictTracker = false;

  public boolean isRestrictSpecified() {
    return localRestrictTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUChangeRestriction
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUChangeRestriction getRestrict() {
    return localRestrict;
  }

  /**
   * Auto generated setter method
   *
   * @param param Restrict
   */
  public void setRestrict(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUChangeRestriction param) {
    localRestrictTracker = param != null;

    this.localRestrict = param;
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
            namespacePrefix + ":DFUArrayActionRequest",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            "DFUArrayActionRequest",
            xmlWriter);
      }
    }
    if (localTypeTracker) {
      if (localType == null) {
        throw new org.apache.axis2.databinding.ADBException("Type cannot be null!!");
      }
      localType.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Type"), xmlWriter);
    }
    if (localNoDeleteTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "NoDelete", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("NoDelete cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNoDelete));
      }

      xmlWriter.writeEndElement();
    }
    if (localBackToPageTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "BackToPage", xmlWriter);

      if (localBackToPage == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("BackToPage cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localBackToPage);
      }

      xmlWriter.writeEndElement();
    }
    if (localLogicalFilesTracker) {
      if (localLogicalFiles == null) {
        throw new org.apache.axis2.databinding.ADBException("LogicalFiles cannot be null!!");
      }
      localLogicalFiles.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "LogicalFiles"), xmlWriter);
    }
    if (localRemoveFromSuperfilesTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "removeFromSuperfiles", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException(
            "removeFromSuperfiles cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localRemoveFromSuperfiles));
      }

      xmlWriter.writeEndElement();
    }
    if (localRemoveRecursivelyTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "removeRecursively", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("removeRecursively cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localRemoveRecursively));
      }

      xmlWriter.writeEndElement();
    }
    if (localProtectTracker) {
      if (localProtect == null) {
        throw new org.apache.axis2.databinding.ADBException("Protect cannot be null!!");
      }
      localProtect.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Protect"), xmlWriter);
    }
    if (localRestrictTracker) {
      if (localRestrict == null) {
        throw new org.apache.axis2.databinding.ADBException("Restrict cannot be null!!");
      }
      localRestrict.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Restrict"), xmlWriter);
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
    public static DFUArrayActionRequest parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      DFUArrayActionRequest object = new DFUArrayActionRequest();

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

            if (!"DFUArrayActionRequest".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (DFUArrayActionRequest)
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Type")
                    .equals(reader.getName())) {

              object.setType(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUArrayActions.Factory.parse(
                      reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "NoDelete")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "NoDelete" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setNoDelete(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "BackToPage")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "BackToPage" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setBackToPage(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "LogicalFiles")
                    .equals(reader.getName())) {

              object.setLogicalFiles(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspStringArray.Factory.parse(
                      reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "removeFromSuperfiles")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "removeFromSuperfiles" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setRemoveFromSuperfiles(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "removeRecursively")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "removeRecursively" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setRemoveRecursively(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Protect")
                    .equals(reader.getName())) {

              object.setProtect(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUChangeProtection.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Restrict")
                    .equals(reader.getName())) {

              object.setRestrict(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUChangeRestriction.Factory
                      .parse(reader));

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

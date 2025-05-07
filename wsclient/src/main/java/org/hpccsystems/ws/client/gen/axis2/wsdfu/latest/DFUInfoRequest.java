/**
 * DFUInfoRequest.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsdfu.latest;

/** DFUInfoRequest bean class */
@SuppressWarnings({"unchecked", "unused"})
public class DFUInfoRequest implements org.apache.axis2.databinding.ADBBean {

  public static final javax.xml.namespace.QName MY_QNAME =
      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUInfoRequest", "ns1");

  /** field for Name */
  protected java.lang.String localName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localNameTracker = false;

  public boolean isNameSpecified() {
    return localNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getName() {
    return localName;
  }

  /**
   * Auto generated setter method
   *
   * @param param Name
   */
  public void setName(java.lang.String param) {
    localNameTracker = param != null;

    this.localName = param;
  }

  /** field for Cluster */
  protected java.lang.String localCluster;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localClusterTracker = false;

  public boolean isClusterSpecified() {
    return localClusterTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getCluster() {
    return localCluster;
  }

  /**
   * Auto generated setter method
   *
   * @param param Cluster
   */
  public void setCluster(java.lang.String param) {
    localClusterTracker = param != null;

    this.localCluster = param;
  }

  /** field for UpdateDescription */
  protected boolean localUpdateDescription =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localUpdateDescriptionTracker = false;

  public boolean isUpdateDescriptionSpecified() {
    return localUpdateDescriptionTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getUpdateDescription() {
    return localUpdateDescription;
  }

  /**
   * Auto generated setter method
   *
   * @param param UpdateDescription
   */
  public void setUpdateDescription(boolean param) {

    // setting primitive attribute tracker to true
    localUpdateDescriptionTracker = true;

    this.localUpdateDescription = param;
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

  /** field for Query */
  protected java.lang.String localQuery;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localQueryTracker = false;

  public boolean isQuerySpecified() {
    return localQueryTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getQuery() {
    return localQuery;
  }

  /**
   * Auto generated setter method
   *
   * @param param Query
   */
  public void setQuery(java.lang.String param) {
    localQueryTracker = param != null;

    this.localQuery = param;
  }

  /** field for FileDesc */
  protected java.lang.String localFileDesc;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localFileDescTracker = false;

  public boolean isFileDescSpecified() {
    return localFileDescTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getFileDesc() {
    return localFileDesc;
  }

  /**
   * Auto generated setter method
   *
   * @param param FileDesc
   */
  public void setFileDesc(java.lang.String param) {
    localFileDescTracker = param != null;

    this.localFileDesc = param;
  }

  /** field for IncludeJsonTypeInfo */
  protected boolean localIncludeJsonTypeInfo =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIncludeJsonTypeInfoTracker = false;

  public boolean isIncludeJsonTypeInfoSpecified() {
    return localIncludeJsonTypeInfoTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getIncludeJsonTypeInfo() {
    return localIncludeJsonTypeInfo;
  }

  /**
   * Auto generated setter method
   *
   * @param param IncludeJsonTypeInfo
   */
  public void setIncludeJsonTypeInfo(boolean param) {

    // setting primitive attribute tracker to true
    localIncludeJsonTypeInfoTracker = true;

    this.localIncludeJsonTypeInfo = param;
  }

  /** field for IncludeBinTypeInfo */
  protected boolean localIncludeBinTypeInfo =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIncludeBinTypeInfoTracker = false;

  public boolean isIncludeBinTypeInfoSpecified() {
    return localIncludeBinTypeInfoTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getIncludeBinTypeInfo() {
    return localIncludeBinTypeInfo;
  }

  /**
   * Auto generated setter method
   *
   * @param param IncludeBinTypeInfo
   */
  public void setIncludeBinTypeInfo(boolean param) {

    // setting primitive attribute tracker to true
    localIncludeBinTypeInfoTracker = true;

    this.localIncludeBinTypeInfo = param;
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

  /** field for ForceIndexInfo */
  protected boolean localForceIndexInfo =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localForceIndexInfoTracker = false;

  public boolean isForceIndexInfoSpecified() {
    return localForceIndexInfoTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getForceIndexInfo() {
    return localForceIndexInfo;
  }

  /**
   * Auto generated setter method
   *
   * @param param ForceIndexInfo
   */
  public void setForceIndexInfo(boolean param) {

    // setting primitive attribute tracker to true
    localForceIndexInfoTracker = true;

    this.localForceIndexInfo = param;
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
            namespacePrefix + ":DFUInfoRequest",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            "DFUInfoRequest",
            xmlWriter);
      }
    }
    if (localNameTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "Name", xmlWriter);

      if (localName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localName);
      }

      xmlWriter.writeEndElement();
    }
    if (localClusterTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "Cluster", xmlWriter);

      if (localCluster == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Cluster cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localCluster);
      }

      xmlWriter.writeEndElement();
    }
    if (localUpdateDescriptionTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "UpdateDescription", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("UpdateDescription cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localUpdateDescription));
      }

      xmlWriter.writeEndElement();
    }
    if (localQuerySetTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "QuerySet", xmlWriter);

      if (localQuerySet == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("QuerySet cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localQuerySet);
      }

      xmlWriter.writeEndElement();
    }
    if (localQueryTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "Query", xmlWriter);

      if (localQuery == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Query cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localQuery);
      }

      xmlWriter.writeEndElement();
    }
    if (localFileDescTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "FileDesc", xmlWriter);

      if (localFileDesc == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("FileDesc cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localFileDesc);
      }

      xmlWriter.writeEndElement();
    }
    if (localIncludeJsonTypeInfoTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "IncludeJsonTypeInfo", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("IncludeJsonTypeInfo cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localIncludeJsonTypeInfo));
      }

      xmlWriter.writeEndElement();
    }
    if (localIncludeBinTypeInfoTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "IncludeBinTypeInfo", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("IncludeBinTypeInfo cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localIncludeBinTypeInfo));
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
    if (localForceIndexInfoTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "ForceIndexInfo", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("ForceIndexInfo cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localForceIndexInfo));
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
    public static DFUInfoRequest parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      DFUInfoRequest object = new DFUInfoRequest();

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

            if (!"DFUInfoRequest".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (DFUInfoRequest)
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Name")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Name" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Cluster")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Cluster" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setCluster(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "UpdateDescription")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "UpdateDescription" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setUpdateDescription(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "QuerySet")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Query")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Query" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setQuery(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FileDesc")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "FileDesc" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setFileDesc(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "IncludeJsonTypeInfo")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "IncludeJsonTypeInfo" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setIncludeJsonTypeInfo(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "IncludeBinTypeInfo")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "IncludeBinTypeInfo" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setIncludeBinTypeInfo(
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
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ForceIndexInfo")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ForceIndexInfo" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setForceIndexInfo(
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

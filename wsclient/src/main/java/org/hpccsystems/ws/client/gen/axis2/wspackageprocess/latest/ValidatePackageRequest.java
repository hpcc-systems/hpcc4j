/**
 * ValidatePackageRequest.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest;

/** ValidatePackageRequest bean class */
@SuppressWarnings({"unchecked", "unused"})
public class ValidatePackageRequest implements org.apache.axis2.databinding.ADBBean {

  public static final javax.xml.namespace.QName MY_QNAME =
      new javax.xml.namespace.QName(
          "urn:hpccsystems:ws:wspackageprocess", "ValidatePackageRequest", "ns1");

  /** field for Info */
  protected java.lang.String localInfo;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localInfoTracker = false;

  public boolean isInfoSpecified() {
    return localInfoTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getInfo() {
    return localInfo;
  }

  /**
   * Auto generated setter method
   *
   * @param param Info
   */
  public void setInfo(java.lang.String param) {
    localInfoTracker = param != null;

    this.localInfo = param;
  }

  /** field for Target */
  protected java.lang.String localTarget;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTargetTracker = false;

  public boolean isTargetSpecified() {
    return localTargetTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getTarget() {
    return localTarget;
  }

  /**
   * Auto generated setter method
   *
   * @param param Target
   */
  public void setTarget(java.lang.String param) {
    localTargetTracker = param != null;

    this.localTarget = param;
  }

  /** field for Process */
  protected java.lang.String localProcess;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localProcessTracker = false;

  public boolean isProcessSpecified() {
    return localProcessTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getProcess() {
    return localProcess;
  }

  /**
   * Auto generated setter method
   *
   * @param param Process
   */
  public void setProcess(java.lang.String param) {
    localProcessTracker = param != null;

    this.localProcess = param;
  }

  /** field for Active */
  protected boolean localActive;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localActiveTracker = false;

  public boolean isActiveSpecified() {
    return localActiveTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getActive() {
    return localActive;
  }

  /**
   * Auto generated setter method
   *
   * @param param Active
   */
  public void setActive(boolean param) {

    // setting primitive attribute tracker to true
    localActiveTracker = true;

    this.localActive = param;
  }

  /** field for PMID */
  protected java.lang.String localPMID;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPMIDTracker = false;

  public boolean isPMIDSpecified() {
    return localPMIDTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getPMID() {
    return localPMID;
  }

  /**
   * Auto generated setter method
   *
   * @param param PMID
   */
  public void setPMID(java.lang.String param) {
    localPMIDTracker = param != null;

    this.localPMID = param;
  }

  /** field for QueryIdToVerify */
  protected java.lang.String localQueryIdToVerify;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localQueryIdToVerifyTracker = false;

  public boolean isQueryIdToVerifySpecified() {
    return localQueryIdToVerifyTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getQueryIdToVerify() {
    return localQueryIdToVerify;
  }

  /**
   * Auto generated setter method
   *
   * @param param QueryIdToVerify
   */
  public void setQueryIdToVerify(java.lang.String param) {
    localQueryIdToVerifyTracker = param != null;

    this.localQueryIdToVerify = param;
  }

  /** field for QueriesToVerify */
  protected org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspStringArray
      localQueriesToVerify;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localQueriesToVerifyTracker = false;

  public boolean isQueriesToVerifySpecified() {
    return localQueriesToVerifyTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspStringArray
   */
  public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspStringArray
      getQueriesToVerify() {
    return localQueriesToVerify;
  }

  /**
   * Auto generated setter method
   *
   * @param param QueriesToVerify
   */
  public void setQueriesToVerify(
      org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspStringArray param) {
    localQueriesToVerifyTracker = param != null;

    this.localQueriesToVerify = param;
  }

  /** field for QueriesToIgnore */
  protected org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspStringArray
      localQueriesToIgnore;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localQueriesToIgnoreTracker = false;

  public boolean isQueriesToIgnoreSpecified() {
    return localQueriesToIgnoreTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspStringArray
   */
  public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspStringArray
      getQueriesToIgnore() {
    return localQueriesToIgnore;
  }

  /**
   * Auto generated setter method
   *
   * @param param QueriesToIgnore
   */
  public void setQueriesToIgnore(
      org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspStringArray param) {
    localQueriesToIgnoreTracker = param != null;

    this.localQueriesToIgnore = param;
  }

  /** field for CheckDFS */
  protected boolean localCheckDFS;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localCheckDFSTracker = false;

  public boolean isCheckDFSSpecified() {
    return localCheckDFSTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getCheckDFS() {
    return localCheckDFS;
  }

  /**
   * Auto generated setter method
   *
   * @param param CheckDFS
   */
  public void setCheckDFS(boolean param) {

    // setting primitive attribute tracker to true
    localCheckDFSTracker = true;

    this.localCheckDFS = param;
  }

  /** field for GlobalScope */
  protected boolean localGlobalScope =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localGlobalScopeTracker = false;

  public boolean isGlobalScopeSpecified() {
    return localGlobalScopeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getGlobalScope() {
    return localGlobalScope;
  }

  /**
   * Auto generated setter method
   *
   * @param param GlobalScope
   */
  public void setGlobalScope(boolean param) {

    // setting primitive attribute tracker to true
    localGlobalScopeTracker = true;

    this.localGlobalScope = param;
  }

  /** field for IgnoreWarnings */
  protected boolean localIgnoreWarnings =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIgnoreWarningsTracker = false;

  public boolean isIgnoreWarningsSpecified() {
    return localIgnoreWarningsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getIgnoreWarnings() {
    return localIgnoreWarnings;
  }

  /**
   * Auto generated setter method
   *
   * @param param IgnoreWarnings
   */
  public void setIgnoreWarnings(boolean param) {

    // setting primitive attribute tracker to true
    localIgnoreWarningsTracker = true;

    this.localIgnoreWarnings = param;
  }

  /** field for IgnoreOptionalFiles */
  protected boolean localIgnoreOptionalFiles =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIgnoreOptionalFilesTracker = false;

  public boolean isIgnoreOptionalFilesSpecified() {
    return localIgnoreOptionalFilesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getIgnoreOptionalFiles() {
    return localIgnoreOptionalFiles;
  }

  /**
   * Auto generated setter method
   *
   * @param param IgnoreOptionalFiles
   */
  public void setIgnoreOptionalFiles(boolean param) {

    // setting primitive attribute tracker to true
    localIgnoreOptionalFilesTracker = true;

    this.localIgnoreOptionalFiles = param;
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
          registerPrefix(xmlWriter, "urn:hpccsystems:ws:wspackageprocess");
      if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            namespacePrefix + ":ValidatePackageRequest",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            "ValidatePackageRequest",
            xmlWriter);
      }
    }
    if (localInfoTracker) {
      namespace = "urn:hpccsystems:ws:wspackageprocess";
      writeStartElement(null, namespace, "Info", xmlWriter);

      if (localInfo == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Info cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localInfo);
      }

      xmlWriter.writeEndElement();
    }
    if (localTargetTracker) {
      namespace = "urn:hpccsystems:ws:wspackageprocess";
      writeStartElement(null, namespace, "Target", xmlWriter);

      if (localTarget == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Target cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localTarget);
      }

      xmlWriter.writeEndElement();
    }
    if (localProcessTracker) {
      namespace = "urn:hpccsystems:ws:wspackageprocess";
      writeStartElement(null, namespace, "Process", xmlWriter);

      if (localProcess == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Process cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localProcess);
      }

      xmlWriter.writeEndElement();
    }
    if (localActiveTracker) {
      namespace = "urn:hpccsystems:ws:wspackageprocess";
      writeStartElement(null, namespace, "Active", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("Active cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localActive));
      }

      xmlWriter.writeEndElement();
    }
    if (localPMIDTracker) {
      namespace = "urn:hpccsystems:ws:wspackageprocess";
      writeStartElement(null, namespace, "PMID", xmlWriter);

      if (localPMID == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("PMID cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localPMID);
      }

      xmlWriter.writeEndElement();
    }
    if (localQueryIdToVerifyTracker) {
      namespace = "urn:hpccsystems:ws:wspackageprocess";
      writeStartElement(null, namespace, "QueryIdToVerify", xmlWriter);

      if (localQueryIdToVerify == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("QueryIdToVerify cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localQueryIdToVerify);
      }

      xmlWriter.writeEndElement();
    }
    if (localQueriesToVerifyTracker) {
      if (localQueriesToVerify == null) {
        throw new org.apache.axis2.databinding.ADBException("QueriesToVerify cannot be null!!");
      }
      localQueriesToVerify.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "QueriesToVerify"),
          xmlWriter);
    }
    if (localQueriesToIgnoreTracker) {
      if (localQueriesToIgnore == null) {
        throw new org.apache.axis2.databinding.ADBException("QueriesToIgnore cannot be null!!");
      }
      localQueriesToIgnore.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "QueriesToIgnore"),
          xmlWriter);
    }
    if (localCheckDFSTracker) {
      namespace = "urn:hpccsystems:ws:wspackageprocess";
      writeStartElement(null, namespace, "CheckDFS", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("CheckDFS cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCheckDFS));
      }

      xmlWriter.writeEndElement();
    }
    if (localGlobalScopeTracker) {
      namespace = "urn:hpccsystems:ws:wspackageprocess";
      writeStartElement(null, namespace, "GlobalScope", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("GlobalScope cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGlobalScope));
      }

      xmlWriter.writeEndElement();
    }
    if (localIgnoreWarningsTracker) {
      namespace = "urn:hpccsystems:ws:wspackageprocess";
      writeStartElement(null, namespace, "IgnoreWarnings", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("IgnoreWarnings cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIgnoreWarnings));
      }

      xmlWriter.writeEndElement();
    }
    if (localIgnoreOptionalFilesTracker) {
      namespace = "urn:hpccsystems:ws:wspackageprocess";
      writeStartElement(null, namespace, "IgnoreOptionalFiles", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("IgnoreOptionalFiles cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localIgnoreOptionalFiles));
      }

      xmlWriter.writeEndElement();
    }
    xmlWriter.writeEndElement();
  }

  private static java.lang.String generatePrefix(java.lang.String namespace) {
    if (namespace.equals("urn:hpccsystems:ws:wspackageprocess")) {
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
    public static ValidatePackageRequest parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      ValidatePackageRequest object = new ValidatePackageRequest();

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

            if (!"ValidatePackageRequest".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (ValidatePackageRequest)
                  org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ExtensionMapper
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "Info")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Info" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setInfo(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "Target")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Target" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setTarget(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "Process")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Process" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setProcess(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "Active")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Active" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setActive(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "PMID")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "PMID" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPMID(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wspackageprocess", "QueryIdToVerify")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "QueryIdToVerify" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setQueryIdToVerify(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wspackageprocess", "QueriesToVerify")
                    .equals(reader.getName())) {

              object.setQueriesToVerify(
                  org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspStringArray.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wspackageprocess", "QueriesToIgnore")
                    .equals(reader.getName())) {

              object.setQueriesToIgnore(
                  org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspStringArray.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess", "CheckDFS")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "CheckDFS" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setCheckDFS(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wspackageprocess", "GlobalScope")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "GlobalScope" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setGlobalScope(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wspackageprocess", "IgnoreWarnings")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "IgnoreWarnings" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setIgnoreWarnings(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wspackageprocess", "IgnoreOptionalFiles")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "IgnoreOptionalFiles" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setIgnoreOptionalFiles(
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

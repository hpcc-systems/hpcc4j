/**
 * TpMachine.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wstopology.latest;

/** TpMachine bean class */
@SuppressWarnings({"unchecked", "unused"})
public class TpMachine implements org.apache.axis2.databinding.ADBBean {
  /* This type was generated from the piece of schema that had
  name = TpMachine
  Namespace URI = urn:hpccsystems:ws:wstopology
  Namespace Prefix = ns1
  */

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

  /** field for Netaddress */
  protected java.lang.String localNetaddress;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localNetaddressTracker = false;

  public boolean isNetaddressSpecified() {
    return localNetaddressTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getNetaddress() {
    return localNetaddress;
  }

  /**
   * Auto generated setter method
   *
   * @param param Netaddress
   */
  public void setNetaddress(java.lang.String param) {
    localNetaddressTracker = param != null;

    this.localNetaddress = param;
  }

  /** field for ConfigNetaddress */
  protected java.lang.String localConfigNetaddress;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localConfigNetaddressTracker = false;

  public boolean isConfigNetaddressSpecified() {
    return localConfigNetaddressTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getConfigNetaddress() {
    return localConfigNetaddress;
  }

  /**
   * Auto generated setter method
   *
   * @param param ConfigNetaddress
   */
  public void setConfigNetaddress(java.lang.String param) {
    localConfigNetaddressTracker = param != null;

    this.localConfigNetaddress = param;
  }

  /** field for Domain */
  protected java.lang.String localDomain;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDomainTracker = false;

  public boolean isDomainSpecified() {
    return localDomainTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getDomain() {
    return localDomain;
  }

  /**
   * Auto generated setter method
   *
   * @param param Domain
   */
  public void setDomain(java.lang.String param) {
    localDomainTracker = param != null;

    this.localDomain = param;
  }

  /** field for Directory */
  protected java.lang.String localDirectory;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDirectoryTracker = false;

  public boolean isDirectorySpecified() {
    return localDirectoryTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getDirectory() {
    return localDirectory;
  }

  /**
   * Auto generated setter method
   *
   * @param param Directory
   */
  public void setDirectory(java.lang.String param) {
    localDirectoryTracker = param != null;

    this.localDirectory = param;
  }

  /** field for Type */
  protected java.lang.String localType;

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
   * @return java.lang.String
   */
  public java.lang.String getType() {
    return localType;
  }

  /**
   * Auto generated setter method
   *
   * @param param Type
   */
  public void setType(java.lang.String param) {
    localTypeTracker = param != null;

    this.localType = param;
  }

  /** field for Available */
  protected java.lang.String localAvailable;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localAvailableTracker = false;

  public boolean isAvailableSpecified() {
    return localAvailableTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getAvailable() {
    return localAvailable;
  }

  /**
   * Auto generated setter method
   *
   * @param param Available
   */
  public void setAvailable(java.lang.String param) {
    localAvailableTracker = param != null;

    this.localAvailable = param;
  }

  /** field for OS */
  protected int localOS;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localOSTracker = false;

  public boolean isOSSpecified() {
    return localOSTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getOS() {
    return localOS;
  }

  /**
   * Auto generated setter method
   *
   * @param param OS
   */
  public void setOS(int param) {

    // setting primitive attribute tracker to true
    localOSTracker = param != java.lang.Integer.MIN_VALUE;

    this.localOS = param;
  }

  /** field for Path */
  protected java.lang.String localPath;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPathTracker = false;

  public boolean isPathSpecified() {
    return localPathTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getPath() {
    return localPath;
  }

  /**
   * Auto generated setter method
   *
   * @param param Path
   */
  public void setPath(java.lang.String param) {
    localPathTracker = param != null;

    this.localPath = param;
  }

  /** field for Port */
  protected int localPort;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPortTracker = false;

  public boolean isPortSpecified() {
    return localPortTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getPort() {
    return localPort;
  }

  /**
   * Auto generated setter method
   *
   * @param param Port
   */
  public void setPort(int param) {

    // setting primitive attribute tracker to true
    localPortTracker = param != java.lang.Integer.MIN_VALUE;

    this.localPort = param;
  }

  /** field for ProcessNumber */
  protected int localProcessNumber;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localProcessNumberTracker = false;

  public boolean isProcessNumberSpecified() {
    return localProcessNumberTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getProcessNumber() {
    return localProcessNumber;
  }

  /**
   * Auto generated setter method
   *
   * @param param ProcessNumber
   */
  public void setProcessNumber(int param) {

    // setting primitive attribute tracker to true
    localProcessNumberTracker = param != java.lang.Integer.MIN_VALUE;

    this.localProcessNumber = param;
  }

  /** field for Channels */
  protected org.apache.axis2.databinding.types.UnsignedInt localChannels;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localChannelsTracker = false;

  public boolean isChannelsSpecified() {
    return localChannelsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.apache.axis2.databinding.types.UnsignedInt
   */
  public org.apache.axis2.databinding.types.UnsignedInt getChannels() {
    return localChannels;
  }

  /**
   * Auto generated setter method
   *
   * @param param Channels
   */
  public void setChannels(org.apache.axis2.databinding.types.UnsignedInt param) {
    localChannelsTracker = param != null;

    this.localChannels = param;
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

      java.lang.String namespacePrefix = registerPrefix(xmlWriter, "urn:hpccsystems:ws:wstopology");
      if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            namespacePrefix + ":TpMachine",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "TpMachine", xmlWriter);
      }
    }
    if (localNameTracker) {
      namespace = "urn:hpccsystems:ws:wstopology";
      writeStartElement(null, namespace, "Name", xmlWriter);

      if (localName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localName);
      }

      xmlWriter.writeEndElement();
    }
    if (localNetaddressTracker) {
      namespace = "urn:hpccsystems:ws:wstopology";
      writeStartElement(null, namespace, "Netaddress", xmlWriter);

      if (localNetaddress == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Netaddress cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localNetaddress);
      }

      xmlWriter.writeEndElement();
    }
    if (localConfigNetaddressTracker) {
      namespace = "urn:hpccsystems:ws:wstopology";
      writeStartElement(null, namespace, "ConfigNetaddress", xmlWriter);

      if (localConfigNetaddress == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ConfigNetaddress cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localConfigNetaddress);
      }

      xmlWriter.writeEndElement();
    }
    if (localDomainTracker) {
      namespace = "urn:hpccsystems:ws:wstopology";
      writeStartElement(null, namespace, "Domain", xmlWriter);

      if (localDomain == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Domain cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localDomain);
      }

      xmlWriter.writeEndElement();
    }
    if (localDirectoryTracker) {
      namespace = "urn:hpccsystems:ws:wstopology";
      writeStartElement(null, namespace, "Directory", xmlWriter);

      if (localDirectory == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Directory cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localDirectory);
      }

      xmlWriter.writeEndElement();
    }
    if (localTypeTracker) {
      namespace = "urn:hpccsystems:ws:wstopology";
      writeStartElement(null, namespace, "Type", xmlWriter);

      if (localType == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Type cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localType);
      }

      xmlWriter.writeEndElement();
    }
    if (localAvailableTracker) {
      namespace = "urn:hpccsystems:ws:wstopology";
      writeStartElement(null, namespace, "Available", xmlWriter);

      if (localAvailable == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Available cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localAvailable);
      }

      xmlWriter.writeEndElement();
    }
    if (localOSTracker) {
      namespace = "urn:hpccsystems:ws:wstopology";
      writeStartElement(null, namespace, "OS", xmlWriter);

      if (localOS == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("OS cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOS));
      }

      xmlWriter.writeEndElement();
    }
    if (localPathTracker) {
      namespace = "urn:hpccsystems:ws:wstopology";
      writeStartElement(null, namespace, "Path", xmlWriter);

      if (localPath == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Path cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localPath);
      }

      xmlWriter.writeEndElement();
    }
    if (localPortTracker) {
      namespace = "urn:hpccsystems:ws:wstopology";
      writeStartElement(null, namespace, "Port", xmlWriter);

      if (localPort == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("Port cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPort));
      }

      xmlWriter.writeEndElement();
    }
    if (localProcessNumberTracker) {
      namespace = "urn:hpccsystems:ws:wstopology";
      writeStartElement(null, namespace, "ProcessNumber", xmlWriter);

      if (localProcessNumber == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("ProcessNumber cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProcessNumber));
      }

      xmlWriter.writeEndElement();
    }
    if (localChannelsTracker) {
      namespace = "urn:hpccsystems:ws:wstopology";
      writeStartElement(null, namespace, "Channels", xmlWriter);

      if (localChannels == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Channels cannot be null!!");

      } else {

        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChannels));
      }

      xmlWriter.writeEndElement();
    }
    xmlWriter.writeEndElement();
  }

  private static java.lang.String generatePrefix(java.lang.String namespace) {
    if (namespace.equals("urn:hpccsystems:ws:wstopology")) {
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
    public static TpMachine parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      TpMachine object = new TpMachine();

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

            if (!"TpMachine".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (TpMachine)
                  org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ExtensionMapper
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Name")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Netaddress")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Netaddress" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setNetaddress(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wstopology", "ConfigNetaddress")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ConfigNetaddress" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setConfigNetaddress(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Domain")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Domain" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDomain(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Directory")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Directory" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDirectory(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Type")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Type" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setType(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Available")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Available" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setAvailable(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "OS")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "OS" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setOS(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Path")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Path" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPath(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Port")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Port" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPort(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ProcessNumber")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ProcessNumber" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setProcessNumber(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Channels")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Channels" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setChannels(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedInt(content));

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

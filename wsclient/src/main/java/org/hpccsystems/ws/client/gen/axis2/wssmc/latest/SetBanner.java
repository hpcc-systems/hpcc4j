/**
 * SetBanner.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wssmc.latest;

/** SetBanner bean class */
@SuppressWarnings({"unchecked", "unused"})
public class SetBanner implements org.apache.axis2.databinding.ADBBean {

  public static final javax.xml.namespace.QName MY_QNAME =
      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "SetBanner", "ns1");

  /** field for ChatURL */
  protected java.lang.String localChatURL;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localChatURLTracker = false;

  public boolean isChatURLSpecified() {
    return localChatURLTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getChatURL() {
    return localChatURL;
  }

  /**
   * Auto generated setter method
   *
   * @param param ChatURL
   */
  public void setChatURL(java.lang.String param) {
    localChatURLTracker = param != null;

    this.localChatURL = param;
  }

  /** field for BannerContent */
  protected java.lang.String localBannerContent;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localBannerContentTracker = false;

  public boolean isBannerContentSpecified() {
    return localBannerContentTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getBannerContent() {
    return localBannerContent;
  }

  /**
   * Auto generated setter method
   *
   * @param param BannerContent
   */
  public void setBannerContent(java.lang.String param) {
    localBannerContentTracker = param != null;

    this.localBannerContent = param;
  }

  /** field for BannerColor */
  protected java.lang.String localBannerColor;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localBannerColorTracker = false;

  public boolean isBannerColorSpecified() {
    return localBannerColorTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getBannerColor() {
    return localBannerColor;
  }

  /**
   * Auto generated setter method
   *
   * @param param BannerColor
   */
  public void setBannerColor(java.lang.String param) {
    localBannerColorTracker = param != null;

    this.localBannerColor = param;
  }

  /** field for BannerSize */
  protected java.lang.String localBannerSize;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localBannerSizeTracker = false;

  public boolean isBannerSizeSpecified() {
    return localBannerSizeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getBannerSize() {
    return localBannerSize;
  }

  /**
   * Auto generated setter method
   *
   * @param param BannerSize
   */
  public void setBannerSize(java.lang.String param) {
    localBannerSizeTracker = param != null;

    this.localBannerSize = param;
  }

  /** field for BannerScroll */
  protected java.lang.String localBannerScroll;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localBannerScrollTracker = false;

  public boolean isBannerScrollSpecified() {
    return localBannerScrollTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getBannerScroll() {
    return localBannerScroll;
  }

  /**
   * Auto generated setter method
   *
   * @param param BannerScroll
   */
  public void setBannerScroll(java.lang.String param) {
    localBannerScrollTracker = param != null;

    this.localBannerScroll = param;
  }

  /** field for BannerAction */
  protected int localBannerAction;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localBannerActionTracker = false;

  public boolean isBannerActionSpecified() {
    return localBannerActionTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getBannerAction() {
    return localBannerAction;
  }

  /**
   * Auto generated setter method
   *
   * @param param BannerAction
   */
  public void setBannerAction(int param) {

    // setting primitive attribute tracker to true
    localBannerActionTracker = param != java.lang.Integer.MIN_VALUE;

    this.localBannerAction = param;
  }

  /** field for EnableChatURL */
  protected boolean localEnableChatURL;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localEnableChatURLTracker = false;

  public boolean isEnableChatURLSpecified() {
    return localEnableChatURLTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getEnableChatURL() {
    return localEnableChatURL;
  }

  /**
   * Auto generated setter method
   *
   * @param param EnableChatURL
   */
  public void setEnableChatURL(boolean param) {

    // setting primitive attribute tracker to true
    localEnableChatURLTracker = true;

    this.localEnableChatURL = param;
  }

  /** field for FromSubmitBtn */
  protected boolean localFromSubmitBtn =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localFromSubmitBtnTracker = false;

  public boolean isFromSubmitBtnSpecified() {
    return localFromSubmitBtnTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getFromSubmitBtn() {
    return localFromSubmitBtn;
  }

  /**
   * Auto generated setter method
   *
   * @param param FromSubmitBtn
   */
  public void setFromSubmitBtn(boolean param) {

    // setting primitive attribute tracker to true
    localFromSubmitBtnTracker = true;

    this.localFromSubmitBtn = param;
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
            namespacePrefix + ":SetBanner",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "SetBanner", xmlWriter);
      }
    }
    if (localChatURLTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "ChatURL", xmlWriter);

      if (localChatURL == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ChatURL cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localChatURL);
      }

      xmlWriter.writeEndElement();
    }
    if (localBannerContentTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "BannerContent", xmlWriter);

      if (localBannerContent == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("BannerContent cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localBannerContent);
      }

      xmlWriter.writeEndElement();
    }
    if (localBannerColorTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "BannerColor", xmlWriter);

      if (localBannerColor == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("BannerColor cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localBannerColor);
      }

      xmlWriter.writeEndElement();
    }
    if (localBannerSizeTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "BannerSize", xmlWriter);

      if (localBannerSize == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("BannerSize cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localBannerSize);
      }

      xmlWriter.writeEndElement();
    }
    if (localBannerScrollTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "BannerScroll", xmlWriter);

      if (localBannerScroll == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("BannerScroll cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localBannerScroll);
      }

      xmlWriter.writeEndElement();
    }
    if (localBannerActionTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "BannerAction", xmlWriter);

      if (localBannerAction == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("BannerAction cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBannerAction));
      }

      xmlWriter.writeEndElement();
    }
    if (localEnableChatURLTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "EnableChatURL", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("EnableChatURL cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEnableChatURL));
      }

      xmlWriter.writeEndElement();
    }
    if (localFromSubmitBtnTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "FromSubmitBtn", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("FromSubmitBtn cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFromSubmitBtn));
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
    public static SetBanner parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      SetBanner object = new SetBanner();

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

            if (!"SetBanner".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (SetBanner)
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ChatURL")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ChatURL" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setChatURL(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "BannerContent")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "BannerContent" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setBannerContent(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "BannerColor")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "BannerColor" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setBannerColor(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "BannerSize")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "BannerSize" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setBannerSize(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "BannerScroll")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "BannerScroll" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setBannerScroll(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "BannerAction")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "BannerAction" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setBannerAction(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "EnableChatURL")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "EnableChatURL" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setEnableChatURL(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "FromSubmitBtn")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "FromSubmitBtn" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setFromSubmitBtn(
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

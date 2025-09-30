/**
 * FindAttributes.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsattributes.latest;

/** FindAttributes bean class */
@SuppressWarnings({"unchecked", "unused"})
public class FindAttributes implements org.apache.axis2.databinding.ADBBean {

  public static final javax.xml.namespace.QName MY_QNAME =
      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "FindAttributes", "ns2");

  /** field for ModuleName */
  protected java.lang.String localModuleName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localModuleNameTracker = false;

  public boolean isModuleNameSpecified() {
    return localModuleNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getModuleName() {
    return localModuleName;
  }

  /**
   * Auto generated setter method
   *
   * @param param ModuleName
   */
  public void setModuleName(java.lang.String param) {
    localModuleNameTracker = param != null;

    this.localModuleName = param;
  }

  /** field for AttributeName */
  protected java.lang.String localAttributeName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localAttributeNameTracker = false;

  public boolean isAttributeNameSpecified() {
    return localAttributeNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getAttributeName() {
    return localAttributeName;
  }

  /**
   * Auto generated setter method
   *
   * @param param AttributeName
   */
  public void setAttributeName(java.lang.String param) {
    localAttributeNameTracker = param != null;

    this.localAttributeName = param;
  }

  /** field for UserName */
  protected java.lang.String localUserName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localUserNameTracker = false;

  public boolean isUserNameSpecified() {
    return localUserNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getUserName() {
    return localUserName;
  }

  /**
   * Auto generated setter method
   *
   * @param param UserName
   */
  public void setUserName(java.lang.String param) {
    localUserNameTracker = param != null;

    this.localUserName = param;
  }

  /** field for Label */
  protected java.lang.String localLabel;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localLabelTracker = false;

  public boolean isLabelSpecified() {
    return localLabelTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getLabel() {
    return localLabel;
  }

  /**
   * Auto generated setter method
   *
   * @param param Label
   */
  public void setLabel(java.lang.String param) {
    localLabelTracker = param != null;

    this.localLabel = param;
  }

  /** field for Pattern */
  protected java.lang.String localPattern;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPatternTracker = false;

  public boolean isPatternSpecified() {
    return localPatternTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getPattern() {
    return localPattern;
  }

  /**
   * Auto generated setter method
   *
   * @param param Pattern
   */
  public void setPattern(java.lang.String param) {
    localPatternTracker = param != null;

    this.localPattern = param;
  }

  /** field for Regexp */
  protected java.lang.String localRegexp;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localRegexpTracker = false;

  public boolean isRegexpSpecified() {
    return localRegexpTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getRegexp() {
    return localRegexp;
  }

  /**
   * Auto generated setter method
   *
   * @param param Regexp
   */
  public void setRegexp(java.lang.String param) {
    localRegexpTracker = param != null;

    this.localRegexp = param;
  }

  /** field for Plain */
  protected java.lang.String localPlain;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPlainTracker = false;

  public boolean isPlainSpecified() {
    return localPlainTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getPlain() {
    return localPlain;
  }

  /**
   * Auto generated setter method
   *
   * @param param Plain
   */
  public void setPlain(java.lang.String param) {
    localPlainTracker = param != null;

    this.localPlain = param;
  }

  /** field for ChangedSince */
  protected java.lang.String localChangedSince;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localChangedSinceTracker = false;

  public boolean isChangedSinceSpecified() {
    return localChangedSinceTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getChangedSince() {
    return localChangedSince;
  }

  /**
   * Auto generated setter method
   *
   * @param param ChangedSince
   */
  public void setChangedSince(java.lang.String param) {
    localChangedSinceTracker = param != null;

    this.localChangedSince = param;
  }

  /** field for TypeList */
  protected org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspStringArray localTypeList;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTypeListTracker = false;

  public boolean isTypeListSpecified() {
    return localTypeListTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspStringArray
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspStringArray getTypeList() {
    return localTypeList;
  }

  /**
   * Auto generated setter method
   *
   * @param param TypeList
   */
  public void setTypeList(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspStringArray param) {
    localTypeListTracker = param != null;

    this.localTypeList = param;
  }

  /** field for Sandboxed */
  protected boolean localSandboxed =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSandboxedTracker = false;

  public boolean isSandboxedSpecified() {
    return localSandboxedTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getSandboxed() {
    return localSandboxed;
  }

  /**
   * Auto generated setter method
   *
   * @param param Sandboxed
   */
  public void setSandboxed(boolean param) {

    // setting primitive attribute tracker to true
    localSandboxedTracker = true;

    this.localSandboxed = param;
  }

  /** field for Locked */
  protected boolean localLocked =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localLockedTracker = false;

  public boolean isLockedSpecified() {
    return localLockedTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getLocked() {
    return localLocked;
  }

  /**
   * Auto generated setter method
   *
   * @param param Locked
   */
  public void setLocked(boolean param) {

    // setting primitive attribute tracker to true
    localLockedTracker = true;

    this.localLocked = param;
  }

  /** field for CheckedOut */
  protected boolean localCheckedOut =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localCheckedOutTracker = false;

  public boolean isCheckedOutSpecified() {
    return localCheckedOutTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getCheckedOut() {
    return localCheckedOut;
  }

  /**
   * Auto generated setter method
   *
   * @param param CheckedOut
   */
  public void setCheckedOut(boolean param) {

    // setting primitive attribute tracker to true
    localCheckedOutTracker = true;

    this.localCheckedOut = param;
  }

  /** field for Orphaned */
  protected boolean localOrphaned =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localOrphanedTracker = false;

  public boolean isOrphanedSpecified() {
    return localOrphanedTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getOrphaned() {
    return localOrphaned;
  }

  /**
   * Auto generated setter method
   *
   * @param param Orphaned
   */
  public void setOrphaned(boolean param) {

    // setting primitive attribute tracker to true
    localOrphanedTracker = true;

    this.localOrphaned = param;
  }

  /** field for GetText */
  protected boolean localGetText =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localGetTextTracker = false;

  public boolean isGetTextSpecified() {
    return localGetTextTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getGetText() {
    return localGetText;
  }

  /**
   * Auto generated setter method
   *
   * @param param GetText
   */
  public void setGetText(boolean param) {

    // setting primitive attribute tracker to true
    localGetTextTracker = true;

    this.localGetText = param;
  }

  /** field for GetMatchedLines */
  protected boolean localGetMatchedLines =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localGetMatchedLinesTracker = false;

  public boolean isGetMatchedLinesSpecified() {
    return localGetMatchedLinesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getGetMatchedLines() {
    return localGetMatchedLines;
  }

  /**
   * Auto generated setter method
   *
   * @param param GetMatchedLines
   */
  public void setGetMatchedLines(boolean param) {

    // setting primitive attribute tracker to true
    localGetMatchedLinesTracker = true;

    this.localGetMatchedLines = param;
  }

  /** field for IncludeHistory */
  protected boolean localIncludeHistory =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIncludeHistoryTracker = false;

  public boolean isIncludeHistorySpecified() {
    return localIncludeHistoryTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getIncludeHistory() {
    return localIncludeHistory;
  }

  /**
   * Auto generated setter method
   *
   * @param param IncludeHistory
   */
  public void setIncludeHistory(boolean param) {

    // setting primitive attribute tracker to true
    localIncludeHistoryTracker = true;

    this.localIncludeHistory = param;
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
          registerPrefix(xmlWriter, "urn:hpccsystems:ws:wsattributes");
      if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            namespacePrefix + ":FindAttributes",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            "FindAttributes",
            xmlWriter);
      }
    }
    if (localModuleNameTracker) {
      namespace = "urn:hpccsystems:ws:wsattributes";
      writeStartElement(null, namespace, "ModuleName", xmlWriter);

      if (localModuleName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ModuleName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localModuleName);
      }

      xmlWriter.writeEndElement();
    }
    if (localAttributeNameTracker) {
      namespace = "urn:hpccsystems:ws:wsattributes";
      writeStartElement(null, namespace, "AttributeName", xmlWriter);

      if (localAttributeName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("AttributeName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localAttributeName);
      }

      xmlWriter.writeEndElement();
    }
    if (localUserNameTracker) {
      namespace = "urn:hpccsystems:ws:wsattributes";
      writeStartElement(null, namespace, "UserName", xmlWriter);

      if (localUserName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("UserName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localUserName);
      }

      xmlWriter.writeEndElement();
    }
    if (localLabelTracker) {
      namespace = "urn:hpccsystems:ws:wsattributes";
      writeStartElement(null, namespace, "label", xmlWriter);

      if (localLabel == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("label cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localLabel);
      }

      xmlWriter.writeEndElement();
    }
    if (localPatternTracker) {
      namespace = "urn:hpccsystems:ws:wsattributes";
      writeStartElement(null, namespace, "Pattern", xmlWriter);

      if (localPattern == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Pattern cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localPattern);
      }

      xmlWriter.writeEndElement();
    }
    if (localRegexpTracker) {
      namespace = "urn:hpccsystems:ws:wsattributes";
      writeStartElement(null, namespace, "Regexp", xmlWriter);

      if (localRegexp == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Regexp cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localRegexp);
      }

      xmlWriter.writeEndElement();
    }
    if (localPlainTracker) {
      namespace = "urn:hpccsystems:ws:wsattributes";
      writeStartElement(null, namespace, "Plain", xmlWriter);

      if (localPlain == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Plain cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localPlain);
      }

      xmlWriter.writeEndElement();
    }
    if (localChangedSinceTracker) {
      namespace = "urn:hpccsystems:ws:wsattributes";
      writeStartElement(null, namespace, "ChangedSince", xmlWriter);

      if (localChangedSince == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ChangedSince cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localChangedSince);
      }

      xmlWriter.writeEndElement();
    }
    if (localTypeListTracker) {
      if (localTypeList == null) {
        throw new org.apache.axis2.databinding.ADBException("TypeList cannot be null!!");
      }
      localTypeList.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "TypeList"), xmlWriter);
    }
    if (localSandboxedTracker) {
      namespace = "urn:hpccsystems:ws:wsattributes";
      writeStartElement(null, namespace, "Sandboxed", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("Sandboxed cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSandboxed));
      }

      xmlWriter.writeEndElement();
    }
    if (localLockedTracker) {
      namespace = "urn:hpccsystems:ws:wsattributes";
      writeStartElement(null, namespace, "Locked", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("Locked cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLocked));
      }

      xmlWriter.writeEndElement();
    }
    if (localCheckedOutTracker) {
      namespace = "urn:hpccsystems:ws:wsattributes";
      writeStartElement(null, namespace, "CheckedOut", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("CheckedOut cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCheckedOut));
      }

      xmlWriter.writeEndElement();
    }
    if (localOrphanedTracker) {
      namespace = "urn:hpccsystems:ws:wsattributes";
      writeStartElement(null, namespace, "Orphaned", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("Orphaned cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOrphaned));
      }

      xmlWriter.writeEndElement();
    }
    if (localGetTextTracker) {
      namespace = "urn:hpccsystems:ws:wsattributes";
      writeStartElement(null, namespace, "GetText", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("GetText cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGetText));
      }

      xmlWriter.writeEndElement();
    }
    if (localGetMatchedLinesTracker) {
      namespace = "urn:hpccsystems:ws:wsattributes";
      writeStartElement(null, namespace, "GetMatchedLines", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("GetMatchedLines cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGetMatchedLines));
      }

      xmlWriter.writeEndElement();
    }
    if (localIncludeHistoryTracker) {
      namespace = "urn:hpccsystems:ws:wsattributes";
      writeStartElement(null, namespace, "IncludeHistory", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("IncludeHistory cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludeHistory));
      }

      xmlWriter.writeEndElement();
    }
    xmlWriter.writeEndElement();
  }

  private static java.lang.String generatePrefix(java.lang.String namespace) {
    if (namespace.equals("urn:hpccsystems:ws:wsattributes")) {
      return "ns2";
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
    public static FindAttributes parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      FindAttributes object = new FindAttributes();

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

            if (!"FindAttributes".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (FindAttributes)
                  org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ExtensionMapper
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ModuleName")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ModuleName" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setModuleName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "AttributeName")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "AttributeName" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setAttributeName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "UserName")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "UserName" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setUserName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "label")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "label" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setLabel(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Pattern")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Pattern" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPattern(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Regexp")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Regexp" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setRegexp(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Plain")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Plain" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPlain(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ChangedSince")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ChangedSince" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setChangedSince(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "TypeList")
                    .equals(reader.getName())) {

              object.setTypeList(
                  org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspStringArray.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Sandboxed")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Sandboxed" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSandboxed(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Locked")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Locked" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setLocked(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "CheckedOut")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "CheckedOut" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setCheckedOut(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Orphaned")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Orphaned" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setOrphaned(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "GetText")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "GetText" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setGetText(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsattributes", "GetMatchedLines")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "GetMatchedLines" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setGetMatchedLines(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsattributes", "IncludeHistory")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "IncludeHistory" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setIncludeHistory(
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

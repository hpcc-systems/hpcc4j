/**
 * WUGetStats.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62;

/** WUGetStats bean class */
@SuppressWarnings({"unchecked", "unused"})
public class WUGetStats implements org.apache.axis2.databinding.ADBBean {

  public static final javax.xml.namespace.QName MY_QNAME =
      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUGetStats", "ns1");

  /** field for WUID */
  protected java.lang.String localWUID;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localWUIDTracker = false;

  public boolean isWUIDSpecified() {
    return localWUIDTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getWUID() {
    return localWUID;
  }

  /**
   * Auto generated setter method
   *
   * @param param WUID
   */
  public void setWUID(java.lang.String param) {
    localWUIDTracker = param != null;

    this.localWUID = param;
  }

  /** field for CreatorType */
  protected java.lang.String localCreatorType;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localCreatorTypeTracker = false;

  public boolean isCreatorTypeSpecified() {
    return localCreatorTypeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getCreatorType() {
    return localCreatorType;
  }

  /**
   * Auto generated setter method
   *
   * @param param CreatorType
   */
  public void setCreatorType(java.lang.String param) {
    localCreatorTypeTracker = param != null;

    this.localCreatorType = param;
  }

  /** field for Creator */
  protected java.lang.String localCreator;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localCreatorTracker = false;

  public boolean isCreatorSpecified() {
    return localCreatorTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getCreator() {
    return localCreator;
  }

  /**
   * Auto generated setter method
   *
   * @param param Creator
   */
  public void setCreator(java.lang.String param) {
    localCreatorTracker = param != null;

    this.localCreator = param;
  }

  /** field for ScopeType */
  protected java.lang.String localScopeType;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localScopeTypeTracker = false;

  public boolean isScopeTypeSpecified() {
    return localScopeTypeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getScopeType() {
    return localScopeType;
  }

  /**
   * Auto generated setter method
   *
   * @param param ScopeType
   */
  public void setScopeType(java.lang.String param) {
    localScopeTypeTracker = param != null;

    this.localScopeType = param;
  }

  /** field for Scope */
  protected java.lang.String localScope;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localScopeTracker = false;

  public boolean isScopeSpecified() {
    return localScopeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getScope() {
    return localScope;
  }

  /**
   * Auto generated setter method
   *
   * @param param Scope
   */
  public void setScope(java.lang.String param) {
    localScopeTracker = param != null;

    this.localScope = param;
  }

  /** field for Kind */
  protected java.lang.String localKind;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localKindTracker = false;

  public boolean isKindSpecified() {
    return localKindTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getKind() {
    return localKind;
  }

  /**
   * Auto generated setter method
   *
   * @param param Kind
   */
  public void setKind(java.lang.String param) {
    localKindTracker = param != null;

    this.localKind = param;
  }

  /** field for Measure */
  protected java.lang.String localMeasure;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localMeasureTracker = false;

  public boolean isMeasureSpecified() {
    return localMeasureTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getMeasure() {
    return localMeasure;
  }

  /**
   * Auto generated setter method
   *
   * @param param Measure
   */
  public void setMeasure(java.lang.String param) {
    localMeasureTracker = param != null;

    this.localMeasure = param;
  }

  /** field for MinScopeDepth */
  protected org.apache.axis2.databinding.types.UnsignedInt localMinScopeDepth;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localMinScopeDepthTracker = false;

  public boolean isMinScopeDepthSpecified() {
    return localMinScopeDepthTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.apache.axis2.databinding.types.UnsignedInt
   */
  public org.apache.axis2.databinding.types.UnsignedInt getMinScopeDepth() {
    return localMinScopeDepth;
  }

  /**
   * Auto generated setter method
   *
   * @param param MinScopeDepth
   */
  public void setMinScopeDepth(org.apache.axis2.databinding.types.UnsignedInt param) {
    localMinScopeDepthTracker = param != null;

    this.localMinScopeDepth = param;
  }

  /** field for MaxScopeDepth */
  protected org.apache.axis2.databinding.types.UnsignedInt localMaxScopeDepth;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localMaxScopeDepthTracker = false;

  public boolean isMaxScopeDepthSpecified() {
    return localMaxScopeDepthTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.apache.axis2.databinding.types.UnsignedInt
   */
  public org.apache.axis2.databinding.types.UnsignedInt getMaxScopeDepth() {
    return localMaxScopeDepth;
  }

  /**
   * Auto generated setter method
   *
   * @param param MaxScopeDepth
   */
  public void setMaxScopeDepth(org.apache.axis2.databinding.types.UnsignedInt param) {
    localMaxScopeDepthTracker = param != null;

    this.localMaxScopeDepth = param;
  }

  /** field for IncludeGraphs */
  protected boolean localIncludeGraphs;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIncludeGraphsTracker = false;

  public boolean isIncludeGraphsSpecified() {
    return localIncludeGraphsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getIncludeGraphs() {
    return localIncludeGraphs;
  }

  /**
   * Auto generated setter method
   *
   * @param param IncludeGraphs
   */
  public void setIncludeGraphs(boolean param) {

    // setting primitive attribute tracker to true
    localIncludeGraphsTracker = true;

    this.localIncludeGraphs = param;
  }

  /** field for CreateDescriptions */
  protected boolean localCreateDescriptions;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localCreateDescriptionsTracker = false;

  public boolean isCreateDescriptionsSpecified() {
    return localCreateDescriptionsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getCreateDescriptions() {
    return localCreateDescriptions;
  }

  /**
   * Auto generated setter method
   *
   * @param param CreateDescriptions
   */
  public void setCreateDescriptions(boolean param) {

    // setting primitive attribute tracker to true
    localCreateDescriptionsTracker = true;

    this.localCreateDescriptions = param;
  }

  /** field for MinValue */
  protected long localMinValue;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localMinValueTracker = false;

  public boolean isMinValueSpecified() {
    return localMinValueTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getMinValue() {
    return localMinValue;
  }

  /**
   * Auto generated setter method
   *
   * @param param MinValue
   */
  public void setMinValue(long param) {

    // setting primitive attribute tracker to true
    localMinValueTracker = param != java.lang.Long.MIN_VALUE;

    this.localMinValue = param;
  }

  /** field for MaxValue */
  protected long localMaxValue;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localMaxValueTracker = false;

  public boolean isMaxValueSpecified() {
    return localMaxValueTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getMaxValue() {
    return localMaxValue;
  }

  /**
   * Auto generated setter method
   *
   * @param param MaxValue
   */
  public void setMaxValue(long param) {

    // setting primitive attribute tracker to true
    localMaxValueTracker = param != java.lang.Long.MIN_VALUE;

    this.localMaxValue = param;
  }

  /** field for Filter */
  protected java.lang.String localFilter;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localFilterTracker = false;

  public boolean isFilterSpecified() {
    return localFilterTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getFilter() {
    return localFilter;
  }

  /**
   * Auto generated setter method
   *
   * @param param Filter
   */
  public void setFilter(java.lang.String param) {
    localFilterTracker = param != null;

    this.localFilter = param;
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
          registerPrefix(xmlWriter, "urn:hpccsystems:ws:wsworkunits");
      if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            namespacePrefix + ":WUGetStats",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "WUGetStats", xmlWriter);
      }
    }
    if (localWUIDTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "WUID", xmlWriter);

      if (localWUID == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("WUID cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localWUID);
      }

      xmlWriter.writeEndElement();
    }
    if (localCreatorTypeTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "CreatorType", xmlWriter);

      if (localCreatorType == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("CreatorType cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localCreatorType);
      }

      xmlWriter.writeEndElement();
    }
    if (localCreatorTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Creator", xmlWriter);

      if (localCreator == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Creator cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localCreator);
      }

      xmlWriter.writeEndElement();
    }
    if (localScopeTypeTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "ScopeType", xmlWriter);

      if (localScopeType == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ScopeType cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localScopeType);
      }

      xmlWriter.writeEndElement();
    }
    if (localScopeTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Scope", xmlWriter);

      if (localScope == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Scope cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localScope);
      }

      xmlWriter.writeEndElement();
    }
    if (localKindTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Kind", xmlWriter);

      if (localKind == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Kind cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localKind);
      }

      xmlWriter.writeEndElement();
    }
    if (localMeasureTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Measure", xmlWriter);

      if (localMeasure == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Measure cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localMeasure);
      }

      xmlWriter.writeEndElement();
    }
    if (localMinScopeDepthTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "MinScopeDepth", xmlWriter);

      if (localMinScopeDepth == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("MinScopeDepth cannot be null!!");

      } else {

        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMinScopeDepth));
      }

      xmlWriter.writeEndElement();
    }
    if (localMaxScopeDepthTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "MaxScopeDepth", xmlWriter);

      if (localMaxScopeDepth == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("MaxScopeDepth cannot be null!!");

      } else {

        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxScopeDepth));
      }

      xmlWriter.writeEndElement();
    }
    if (localIncludeGraphsTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "IncludeGraphs", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("IncludeGraphs cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIncludeGraphs));
      }

      xmlWriter.writeEndElement();
    }
    if (localCreateDescriptionsTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "CreateDescriptions", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("CreateDescriptions cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localCreateDescriptions));
      }

      xmlWriter.writeEndElement();
    }
    if (localMinValueTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "MinValue", xmlWriter);

      if (localMinValue == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("MinValue cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMinValue));
      }

      xmlWriter.writeEndElement();
    }
    if (localMaxValueTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "MaxValue", xmlWriter);

      if (localMaxValue == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("MaxValue cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxValue));
      }

      xmlWriter.writeEndElement();
    }
    if (localFilterTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Filter", xmlWriter);

      if (localFilter == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Filter cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localFilter);
      }

      xmlWriter.writeEndElement();
    }
    xmlWriter.writeEndElement();
  }

  private static java.lang.String generatePrefix(java.lang.String namespace) {
    if (namespace.equals("urn:hpccsystems:ws:wsworkunits")) {
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
    public static WUGetStats parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      WUGetStats object = new WUGetStats();

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

            if (!"WUGetStats".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (WUGetStats)
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ExtensionMapper
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUID")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "WUID" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setWUID(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "CreatorType")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "CreatorType" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setCreatorType(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Creator")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Creator" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setCreator(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ScopeType")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ScopeType" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setScopeType(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Scope")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Scope" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setScope(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Kind")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Kind" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setKind(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Measure")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Measure" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setMeasure(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "MinScopeDepth")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "MinScopeDepth" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setMinScopeDepth(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "MaxScopeDepth")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "MaxScopeDepth" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setMaxScopeDepth(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IncludeGraphs")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "IncludeGraphs" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setIncludeGraphs(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "CreateDescriptions")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "CreateDescriptions" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setCreateDescriptions(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "MinValue")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "MinValue" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setMinValue(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "MaxValue")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "MaxValue" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setMaxValue(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Filter")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Filter" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setFilter(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

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

/**
 * LogAccessFilter.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest;

/** LogAccessFilter bean class */
@SuppressWarnings({"unchecked", "unused"})
public class LogAccessFilter implements org.apache.axis2.databinding.ADBBean {
  /* This type was generated from the piece of schema that had
  name = LogAccessFilter
  Namespace URI = urn:hpccsystems:ws:wsworkunits
  Namespace Prefix = ns1
  */

  /** field for WildcardFilter */
  protected java.lang.String localWildcardFilter;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localWildcardFilterTracker = false;

  public boolean isWildcardFilterSpecified() {
    return localWildcardFilterTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getWildcardFilter() {
    return localWildcardFilter;
  }

  /**
   * Auto generated setter method
   *
   * @param param WildcardFilter
   */
  public void setWildcardFilter(java.lang.String param) {
    localWildcardFilterTracker = param != null;

    this.localWildcardFilter = param;
  }

  /** field for AbsoluteTimeRange */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.TimeRange localAbsoluteTimeRange;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localAbsoluteTimeRangeTracker = false;

  public boolean isAbsoluteTimeRangeSpecified() {
    return localAbsoluteTimeRangeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.TimeRange
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.TimeRange getAbsoluteTimeRange() {
    return localAbsoluteTimeRange;
  }

  /**
   * Auto generated setter method
   *
   * @param param AbsoluteTimeRange
   */
  public void setAbsoluteTimeRange(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.TimeRange param) {
    localAbsoluteTimeRangeTracker = param != null;

    this.localAbsoluteTimeRange = param;
  }

  /** field for RelativeTimeRangeBuffer */
  protected org.apache.axis2.databinding.types.UnsignedInt localRelativeTimeRangeBuffer;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localRelativeTimeRangeBufferTracker = false;

  public boolean isRelativeTimeRangeBufferSpecified() {
    return localRelativeTimeRangeBufferTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.apache.axis2.databinding.types.UnsignedInt
   */
  public org.apache.axis2.databinding.types.UnsignedInt getRelativeTimeRangeBuffer() {
    return localRelativeTimeRangeBuffer;
  }

  /**
   * Auto generated setter method
   *
   * @param param RelativeTimeRangeBuffer
   */
  public void setRelativeTimeRangeBuffer(org.apache.axis2.databinding.types.UnsignedInt param) {
    localRelativeTimeRangeBufferTracker = param != null;

    this.localRelativeTimeRangeBuffer = param;
  }

  /** field for LineLimit */
  protected org.apache.axis2.databinding.types.UnsignedInt localLineLimit =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedInt("10000");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localLineLimitTracker = false;

  public boolean isLineLimitSpecified() {
    return localLineLimitTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.apache.axis2.databinding.types.UnsignedInt
   */
  public org.apache.axis2.databinding.types.UnsignedInt getLineLimit() {
    return localLineLimit;
  }

  /**
   * Auto generated setter method
   *
   * @param param LineLimit
   */
  public void setLineLimit(org.apache.axis2.databinding.types.UnsignedInt param) {
    localLineLimitTracker = param != null;

    this.localLineLimit = param;
  }

  /** field for LineStartFrom */
  protected long localLineStartFrom =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToLong("0");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localLineStartFromTracker = false;

  public boolean isLineStartFromSpecified() {
    return localLineStartFromTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getLineStartFrom() {
    return localLineStartFrom;
  }

  /**
   * Auto generated setter method
   *
   * @param param LineStartFrom
   */
  public void setLineStartFrom(long param) {

    // setting primitive attribute tracker to true
    localLineStartFromTracker = param != java.lang.Long.MIN_VALUE;

    this.localLineStartFrom = param;
  }

  /** field for SelectColumnMode */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogSelectColumnMode
      localSelectColumnMode;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSelectColumnModeTracker = false;

  public boolean isSelectColumnModeSpecified() {
    return localSelectColumnModeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogSelectColumnMode
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogSelectColumnMode
      getSelectColumnMode() {
    return localSelectColumnMode;
  }

  /**
   * Auto generated setter method
   *
   * @param param SelectColumnMode
   */
  public void setSelectColumnMode(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogSelectColumnMode param) {
    localSelectColumnModeTracker = param != null;

    this.localSelectColumnMode = param;
  }

  /** field for CustomColumns */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EspStringArray
      localCustomColumns;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localCustomColumnsTracker = false;

  public boolean isCustomColumnsSpecified() {
    return localCustomColumnsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EspStringArray
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EspStringArray getCustomColumns() {
    return localCustomColumns;
  }

  /**
   * Auto generated setter method
   *
   * @param param CustomColumns
   */
  public void setCustomColumns(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EspStringArray param) {
    localCustomColumnsTracker = param != null;

    this.localCustomColumns = param;
  }

  /** field for ComponentsFilter */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EspStringArray
      localComponentsFilter;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localComponentsFilterTracker = false;

  public boolean isComponentsFilterSpecified() {
    return localComponentsFilterTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EspStringArray
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EspStringArray
      getComponentsFilter() {
    return localComponentsFilter;
  }

  /**
   * Auto generated setter method
   *
   * @param param ComponentsFilter
   */
  public void setComponentsFilter(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EspStringArray param) {
    localComponentsFilterTracker = param != null;

    this.localComponentsFilter = param;
  }

  /** field for Format */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogAccessLogFormat localFormat;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localFormatTracker = false;

  public boolean isFormatSpecified() {
    return localFormatTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogAccessLogFormat
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogAccessLogFormat getFormat() {
    return localFormat;
  }

  /**
   * Auto generated setter method
   *
   * @param param Format
   */
  public void setFormat(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogAccessLogFormat param) {
    localFormatTracker = param != null;

    this.localFormat = param;
  }

  /** field for SortByTimeDirection */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.SortDirection
      localSortByTimeDirection;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSortByTimeDirectionTracker = false;

  public boolean isSortByTimeDirectionSpecified() {
    return localSortByTimeDirectionTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.SortDirection
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.SortDirection
      getSortByTimeDirection() {
    return localSortByTimeDirection;
  }

  /**
   * Auto generated setter method
   *
   * @param param SortByTimeDirection
   */
  public void setSortByTimeDirection(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.SortDirection param) {
    localSortByTimeDirectionTracker = param != null;

    this.localSortByTimeDirection = param;
  }

  /** field for LogEventType */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogEventClass localLogEventType;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localLogEventTypeTracker = false;

  public boolean isLogEventTypeSpecified() {
    return localLogEventTypeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogEventClass
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogEventClass getLogEventType() {
    return localLogEventType;
  }

  /**
   * Auto generated setter method
   *
   * @param param LogEventType
   */
  public void setLogEventType(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogEventClass param) {
    localLogEventTypeTracker = param != null;

    this.localLogEventType = param;
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

      java.lang.String namespacePrefix =
          registerPrefix(xmlWriter, "urn:hpccsystems:ws:wsworkunits");
      if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            namespacePrefix + ":LogAccessFilter",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            "LogAccessFilter",
            xmlWriter);
      }
    }
    if (localWildcardFilterTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "WildcardFilter", xmlWriter);

      if (localWildcardFilter == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("WildcardFilter cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localWildcardFilter);
      }

      xmlWriter.writeEndElement();
    }
    if (localAbsoluteTimeRangeTracker) {
      if (localAbsoluteTimeRange == null) {
        throw new org.apache.axis2.databinding.ADBException("AbsoluteTimeRange cannot be null!!");
      }
      localAbsoluteTimeRange.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "AbsoluteTimeRange"),
          xmlWriter);
    }
    if (localRelativeTimeRangeBufferTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "RelativeTimeRangeBuffer", xmlWriter);

      if (localRelativeTimeRangeBuffer == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException(
            "RelativeTimeRangeBuffer cannot be null!!");

      } else {

        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localRelativeTimeRangeBuffer));
      }

      xmlWriter.writeEndElement();
    }
    if (localLineLimitTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "LineLimit", xmlWriter);

      if (localLineLimit == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("LineLimit cannot be null!!");

      } else {

        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLineLimit));
      }

      xmlWriter.writeEndElement();
    }
    if (localLineStartFromTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "LineStartFrom", xmlWriter);

      if (localLineStartFrom == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("LineStartFrom cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLineStartFrom));
      }

      xmlWriter.writeEndElement();
    }
    if (localSelectColumnModeTracker) {
      if (localSelectColumnMode == null) {
        throw new org.apache.axis2.databinding.ADBException("SelectColumnMode cannot be null!!");
      }
      localSelectColumnMode.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "SelectColumnMode"),
          xmlWriter);
    }
    if (localCustomColumnsTracker) {
      if (localCustomColumns == null) {
        throw new org.apache.axis2.databinding.ADBException("CustomColumns cannot be null!!");
      }
      localCustomColumns.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "CustomColumns"),
          xmlWriter);
    }
    if (localComponentsFilterTracker) {
      if (localComponentsFilter == null) {
        throw new org.apache.axis2.databinding.ADBException("ComponentsFilter cannot be null!!");
      }
      localComponentsFilter.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ComponentsFilter"),
          xmlWriter);
    }
    if (localFormatTracker) {
      if (localFormat == null) {
        throw new org.apache.axis2.databinding.ADBException("Format cannot be null!!");
      }
      localFormat.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Format"), xmlWriter);
    }
    if (localSortByTimeDirectionTracker) {
      if (localSortByTimeDirection == null) {
        throw new org.apache.axis2.databinding.ADBException("sortByTimeDirection cannot be null!!");
      }
      localSortByTimeDirection.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "sortByTimeDirection"),
          xmlWriter);
    }
    if (localLogEventTypeTracker) {
      if (localLogEventType == null) {
        throw new org.apache.axis2.databinding.ADBException("LogEventType cannot be null!!");
      }
      localLogEventType.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LogEventType"),
          xmlWriter);
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
    public static LogAccessFilter parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      LogAccessFilter object = new LogAccessFilter();

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

            if (!"LogAccessFilter".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (LogAccessFilter)
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ExtensionMapper
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WildcardFilter")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "WildcardFilter" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setWildcardFilter(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "AbsoluteTimeRange")
                    .equals(reader.getName())) {

              object.setAbsoluteTimeRange(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.TimeRange.Factory.parse(
                      reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "RelativeTimeRangeBuffer")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "RelativeTimeRangeBuffer" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setRelativeTimeRangeBuffer(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LineLimit")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "LineLimit" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setLineLimit(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LineStartFrom")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "LineStartFrom" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setLineStartFrom(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "SelectColumnMode")
                    .equals(reader.getName())) {

              object.setSelectColumnMode(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogSelectColumnMode.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "CustomColumns")
                    .equals(reader.getName())) {

              object.setCustomColumns(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EspStringArray.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "ComponentsFilter")
                    .equals(reader.getName())) {

              object.setComponentsFilter(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EspStringArray.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Format")
                    .equals(reader.getName())) {

              object.setFormat(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogAccessLogFormat.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "sortByTimeDirection")
                    .equals(reader.getName())) {

              object.setSortByTimeDirection(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.SortDirection.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LogEventType")
                    .equals(reader.getName())) {

              object.setLogEventType(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogEventClass.Factory
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

/**
 * QuerySummaryStats.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest;

/** QuerySummaryStats bean class */
@SuppressWarnings({"unchecked", "unused"})
public class QuerySummaryStats implements org.apache.axis2.databinding.ADBBean {
  /* This type was generated from the piece of schema that had
  name = QuerySummaryStats
  Namespace URI = urn:hpccsystems:ws:wsworkunits
  Namespace Prefix = ns1
  */

  /** field for Endpoint */
  protected java.lang.String localEndpoint;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localEndpointTracker = false;

  public boolean isEndpointSpecified() {
    return localEndpointTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getEndpoint() {
    return localEndpoint;
  }

  /**
   * Auto generated setter method
   *
   * @param param Endpoint
   */
  public void setEndpoint(java.lang.String param) {
    localEndpointTracker = param != null;

    this.localEndpoint = param;
  }

  /** field for Status */
  protected java.lang.String localStatus;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localStatusTracker = false;

  public boolean isStatusSpecified() {
    return localStatusTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getStatus() {
    return localStatus;
  }

  /**
   * Auto generated setter method
   *
   * @param param Status
   */
  public void setStatus(java.lang.String param) {
    localStatusTracker = param != null;

    this.localStatus = param;
  }

  /** field for StartTime */
  protected java.lang.String localStartTime;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localStartTimeTracker = false;

  public boolean isStartTimeSpecified() {
    return localStartTimeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getStartTime() {
    return localStartTime;
  }

  /**
   * Auto generated setter method
   *
   * @param param StartTime
   */
  public void setStartTime(java.lang.String param) {
    localStartTimeTracker = param != null;

    this.localStartTime = param;
  }

  /** field for EndTime */
  protected java.lang.String localEndTime;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localEndTimeTracker = false;

  public boolean isEndTimeSpecified() {
    return localEndTimeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getEndTime() {
    return localEndTime;
  }

  /**
   * Auto generated setter method
   *
   * @param param EndTime
   */
  public void setEndTime(java.lang.String param) {
    localEndTimeTracker = param != null;

    this.localEndTime = param;
  }

  /** field for CountTotal */
  protected int localCountTotal;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localCountTotalTracker = false;

  public boolean isCountTotalSpecified() {
    return localCountTotalTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getCountTotal() {
    return localCountTotal;
  }

  /**
   * Auto generated setter method
   *
   * @param param CountTotal
   */
  public void setCountTotal(int param) {

    // setting primitive attribute tracker to true
    localCountTotalTracker = param != java.lang.Integer.MIN_VALUE;

    this.localCountTotal = param;
  }

  /** field for CountFailed */
  protected int localCountFailed;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localCountFailedTracker = false;

  public boolean isCountFailedSpecified() {
    return localCountFailedTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getCountFailed() {
    return localCountFailed;
  }

  /**
   * Auto generated setter method
   *
   * @param param CountFailed
   */
  public void setCountFailed(int param) {

    // setting primitive attribute tracker to true
    localCountFailedTracker = param != java.lang.Integer.MIN_VALUE;

    this.localCountFailed = param;
  }

  /** field for AverageSlavesReplyLen */
  protected int localAverageSlavesReplyLen;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localAverageSlavesReplyLenTracker = false;

  public boolean isAverageSlavesReplyLenSpecified() {
    return localAverageSlavesReplyLenTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getAverageSlavesReplyLen() {
    return localAverageSlavesReplyLen;
  }

  /**
   * Auto generated setter method
   *
   * @param param AverageSlavesReplyLen
   */
  public void setAverageSlavesReplyLen(int param) {

    // setting primitive attribute tracker to true
    localAverageSlavesReplyLenTracker = param != java.lang.Integer.MIN_VALUE;

    this.localAverageSlavesReplyLen = param;
  }

  /** field for AverageBytesOut */
  protected long localAverageBytesOut;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localAverageBytesOutTracker = false;

  public boolean isAverageBytesOutSpecified() {
    return localAverageBytesOutTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getAverageBytesOut() {
    return localAverageBytesOut;
  }

  /**
   * Auto generated setter method
   *
   * @param param AverageBytesOut
   */
  public void setAverageBytesOut(long param) {

    // setting primitive attribute tracker to true
    localAverageBytesOutTracker = param != java.lang.Long.MIN_VALUE;

    this.localAverageBytesOut = param;
  }

  /** field for SizeAvgPeakMemory */
  protected long localSizeAvgPeakMemory;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSizeAvgPeakMemoryTracker = false;

  public boolean isSizeAvgPeakMemorySpecified() {
    return localSizeAvgPeakMemoryTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getSizeAvgPeakMemory() {
    return localSizeAvgPeakMemory;
  }

  /**
   * Auto generated setter method
   *
   * @param param SizeAvgPeakMemory
   */
  public void setSizeAvgPeakMemory(long param) {

    // setting primitive attribute tracker to true
    localSizeAvgPeakMemoryTracker = param != java.lang.Long.MIN_VALUE;

    this.localSizeAvgPeakMemory = param;
  }

  /** field for TimeAvgTotalExecuteMinutes */
  protected long localTimeAvgTotalExecuteMinutes;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTimeAvgTotalExecuteMinutesTracker = false;

  public boolean isTimeAvgTotalExecuteMinutesSpecified() {
    return localTimeAvgTotalExecuteMinutesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getTimeAvgTotalExecuteMinutes() {
    return localTimeAvgTotalExecuteMinutes;
  }

  /**
   * Auto generated setter method
   *
   * @param param TimeAvgTotalExecuteMinutes
   */
  public void setTimeAvgTotalExecuteMinutes(long param) {

    // setting primitive attribute tracker to true
    localTimeAvgTotalExecuteMinutesTracker = param != java.lang.Long.MIN_VALUE;

    this.localTimeAvgTotalExecuteMinutes = param;
  }

  /** field for TimeMinTotalExecuteMinutes */
  protected long localTimeMinTotalExecuteMinutes;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTimeMinTotalExecuteMinutesTracker = false;

  public boolean isTimeMinTotalExecuteMinutesSpecified() {
    return localTimeMinTotalExecuteMinutesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getTimeMinTotalExecuteMinutes() {
    return localTimeMinTotalExecuteMinutes;
  }

  /**
   * Auto generated setter method
   *
   * @param param TimeMinTotalExecuteMinutes
   */
  public void setTimeMinTotalExecuteMinutes(long param) {

    // setting primitive attribute tracker to true
    localTimeMinTotalExecuteMinutesTracker = param != java.lang.Long.MIN_VALUE;

    this.localTimeMinTotalExecuteMinutes = param;
  }

  /** field for TimeMaxTotalExecuteMinutes */
  protected long localTimeMaxTotalExecuteMinutes;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTimeMaxTotalExecuteMinutesTracker = false;

  public boolean isTimeMaxTotalExecuteMinutesSpecified() {
    return localTimeMaxTotalExecuteMinutesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getTimeMaxTotalExecuteMinutes() {
    return localTimeMaxTotalExecuteMinutes;
  }

  /**
   * Auto generated setter method
   *
   * @param param TimeMaxTotalExecuteMinutes
   */
  public void setTimeMaxTotalExecuteMinutes(long param) {

    // setting primitive attribute tracker to true
    localTimeMaxTotalExecuteMinutesTracker = param != java.lang.Long.MIN_VALUE;

    this.localTimeMaxTotalExecuteMinutes = param;
  }

  /** field for Percentile97 */
  protected long localPercentile97;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPercentile97Tracker = false;

  public boolean isPercentile97Specified() {
    return localPercentile97Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getPercentile97() {
    return localPercentile97;
  }

  /**
   * Auto generated setter method
   *
   * @param param Percentile97
   */
  public void setPercentile97(long param) {

    // setting primitive attribute tracker to true
    localPercentile97Tracker = param != java.lang.Long.MIN_VALUE;

    this.localPercentile97 = param;
  }

  /** field for Percentile97Estimate */
  protected boolean localPercentile97Estimate;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPercentile97EstimateTracker = false;

  public boolean isPercentile97EstimateSpecified() {
    return localPercentile97EstimateTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getPercentile97Estimate() {
    return localPercentile97Estimate;
  }

  /**
   * Auto generated setter method
   *
   * @param param Percentile97Estimate
   */
  public void setPercentile97Estimate(boolean param) {

    // setting primitive attribute tracker to true
    localPercentile97EstimateTracker = true;

    this.localPercentile97Estimate = param;
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
            namespacePrefix + ":QuerySummaryStats",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            "QuerySummaryStats",
            xmlWriter);
      }
    }
    if (localEndpointTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Endpoint", xmlWriter);

      if (localEndpoint == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Endpoint cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localEndpoint);
      }

      xmlWriter.writeEndElement();
    }
    if (localStatusTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Status", xmlWriter);

      if (localStatus == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Status cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localStatus);
      }

      xmlWriter.writeEndElement();
    }
    if (localStartTimeTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "StartTime", xmlWriter);

      if (localStartTime == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("StartTime cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localStartTime);
      }

      xmlWriter.writeEndElement();
    }
    if (localEndTimeTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "EndTime", xmlWriter);

      if (localEndTime == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("EndTime cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localEndTime);
      }

      xmlWriter.writeEndElement();
    }
    if (localCountTotalTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "CountTotal", xmlWriter);

      if (localCountTotal == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("CountTotal cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCountTotal));
      }

      xmlWriter.writeEndElement();
    }
    if (localCountFailedTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "CountFailed", xmlWriter);

      if (localCountFailed == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("CountFailed cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCountFailed));
      }

      xmlWriter.writeEndElement();
    }
    if (localAverageSlavesReplyLenTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "AverageSlavesReplyLen", xmlWriter);

      if (localAverageSlavesReplyLen == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException(
            "AverageSlavesReplyLen cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localAverageSlavesReplyLen));
      }

      xmlWriter.writeEndElement();
    }
    if (localAverageBytesOutTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "AverageBytesOut", xmlWriter);

      if (localAverageBytesOut == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("AverageBytesOut cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAverageBytesOut));
      }

      xmlWriter.writeEndElement();
    }
    if (localSizeAvgPeakMemoryTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "SizeAvgPeakMemory", xmlWriter);

      if (localSizeAvgPeakMemory == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("SizeAvgPeakMemory cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localSizeAvgPeakMemory));
      }

      xmlWriter.writeEndElement();
    }
    if (localTimeAvgTotalExecuteMinutesTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "TimeAvgTotalExecuteMinutes", xmlWriter);

      if (localTimeAvgTotalExecuteMinutes == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException(
            "TimeAvgTotalExecuteMinutes cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localTimeAvgTotalExecuteMinutes));
      }

      xmlWriter.writeEndElement();
    }
    if (localTimeMinTotalExecuteMinutesTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "TimeMinTotalExecuteMinutes", xmlWriter);

      if (localTimeMinTotalExecuteMinutes == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException(
            "TimeMinTotalExecuteMinutes cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localTimeMinTotalExecuteMinutes));
      }

      xmlWriter.writeEndElement();
    }
    if (localTimeMaxTotalExecuteMinutesTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "TimeMaxTotalExecuteMinutes", xmlWriter);

      if (localTimeMaxTotalExecuteMinutes == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException(
            "TimeMaxTotalExecuteMinutes cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localTimeMaxTotalExecuteMinutes));
      }

      xmlWriter.writeEndElement();
    }
    if (localPercentile97Tracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Percentile97", xmlWriter);

      if (localPercentile97 == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("Percentile97 cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPercentile97));
      }

      xmlWriter.writeEndElement();
    }
    if (localPercentile97EstimateTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Percentile97Estimate", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException(
            "Percentile97Estimate cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localPercentile97Estimate));
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
    public static QuerySummaryStats parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      QuerySummaryStats object = new QuerySummaryStats();

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

            if (!"QuerySummaryStats".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (QuerySummaryStats)
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Endpoint")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Endpoint" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setEndpoint(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Status")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Status" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setStatus(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "StartTime")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "StartTime" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setStartTime(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "EndTime")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "EndTime" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setEndTime(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "CountTotal")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "CountTotal" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setCountTotal(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "CountFailed")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "CountFailed" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setCountFailed(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "AverageSlavesReplyLen")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "AverageSlavesReplyLen" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setAverageSlavesReplyLen(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "AverageBytesOut")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "AverageBytesOut" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setAverageBytesOut(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "SizeAvgPeakMemory")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SizeAvgPeakMemory" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSizeAvgPeakMemory(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "TimeAvgTotalExecuteMinutes")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "TimeAvgTotalExecuteMinutes" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setTimeAvgTotalExecuteMinutes(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "TimeMinTotalExecuteMinutes")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "TimeMinTotalExecuteMinutes" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setTimeMinTotalExecuteMinutes(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "TimeMaxTotalExecuteMinutes")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "TimeMaxTotalExecuteMinutes" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setTimeMaxTotalExecuteMinutes(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Percentile97")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Percentile97" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPercentile97(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "Percentile97Estimate")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Percentile97Estimate" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPercentile97Estimate(
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

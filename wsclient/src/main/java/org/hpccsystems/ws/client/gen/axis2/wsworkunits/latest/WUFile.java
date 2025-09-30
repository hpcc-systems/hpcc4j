/**
 * WUFile.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest;

/** WUFile bean class */
@SuppressWarnings({"unchecked", "unused"})
public class WUFile implements org.apache.axis2.databinding.ADBBean {

  public static final javax.xml.namespace.QName MY_QNAME =
      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUFile", "ns13");

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

  /** field for Wuid */
  protected java.lang.String localWuid;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localWuidTracker = false;

  public boolean isWuidSpecified() {
    return localWuidTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getWuid() {
    return localWuid;
  }

  /**
   * Auto generated setter method
   *
   * @param param Wuid
   */
  public void setWuid(java.lang.String param) {
    localWuidTracker = param != null;

    this.localWuid = param;
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

  /** field for Option */
  protected int localOption;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localOptionTracker = false;

  public boolean isOptionSpecified() {
    return localOptionTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getOption() {
    return localOption;
  }

  /**
   * Auto generated setter method
   *
   * @param param Option
   */
  public void setOption(int param) {

    // setting primitive attribute tracker to true
    localOptionTracker = param != java.lang.Integer.MIN_VALUE;

    this.localOption = param;
  }

  /** field for SlaveIP */
  protected java.lang.String localSlaveIP;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSlaveIPTracker = false;

  public boolean isSlaveIPSpecified() {
    return localSlaveIPTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getSlaveIP() {
    return localSlaveIP;
  }

  /**
   * Auto generated setter method
   *
   * @param param SlaveIP
   */
  public void setSlaveIP(java.lang.String param) {
    localSlaveIPTracker = param != null;

    this.localSlaveIP = param;
  }

  /** field for IPAddress */
  protected java.lang.String localIPAddress;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIPAddressTracker = false;

  public boolean isIPAddressSpecified() {
    return localIPAddressTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getIPAddress() {
    return localIPAddress;
  }

  /**
   * Auto generated setter method
   *
   * @param param IPAddress
   */
  public void setIPAddress(java.lang.String param) {
    localIPAddressTracker = param != null;

    this.localIPAddress = param;
  }

  /** field for Description */
  protected java.lang.String localDescription;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDescriptionTracker = false;

  public boolean isDescriptionSpecified() {
    return localDescriptionTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getDescription() {
    return localDescription;
  }

  /**
   * Auto generated setter method
   *
   * @param param Description
   */
  public void setDescription(java.lang.String param) {
    localDescriptionTracker = param != null;

    this.localDescription = param;
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

  /** field for ClusterGroup */
  protected java.lang.String localClusterGroup;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localClusterGroupTracker = false;

  public boolean isClusterGroupSpecified() {
    return localClusterGroupTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getClusterGroup() {
    return localClusterGroup;
  }

  /**
   * Auto generated setter method
   *
   * @param param ClusterGroup
   */
  public void setClusterGroup(java.lang.String param) {
    localClusterGroupTracker = param != null;

    this.localClusterGroup = param;
  }

  /** field for LogDate */
  protected java.lang.String localLogDate;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localLogDateTracker = false;

  public boolean isLogDateSpecified() {
    return localLogDateTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getLogDate() {
    return localLogDate;
  }

  /**
   * Auto generated setter method
   *
   * @param param LogDate
   */
  public void setLogDate(java.lang.String param) {
    localLogDateTracker = param != null;

    this.localLogDate = param;
  }

  /** field for SlaveNumber */
  protected int localSlaveNumber =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToInt("1");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSlaveNumberTracker = false;

  public boolean isSlaveNumberSpecified() {
    return localSlaveNumberTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getSlaveNumber() {
    return localSlaveNumber;
  }

  /**
   * Auto generated setter method
   *
   * @param param SlaveNumber
   */
  public void setSlaveNumber(int param) {

    // setting primitive attribute tracker to true
    localSlaveNumberTracker = param != java.lang.Integer.MIN_VALUE;

    this.localSlaveNumber = param;
  }

  /** field for SizeLimit */
  protected long localSizeLimit =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToLong("0");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSizeLimitTracker = false;

  public boolean isSizeLimitSpecified() {
    return localSizeLimitTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getSizeLimit() {
    return localSizeLimit;
  }

  /**
   * Auto generated setter method
   *
   * @param param SizeLimit
   */
  public void setSizeLimit(long param) {

    // setting primitive attribute tracker to true
    localSizeLimitTracker = param != java.lang.Long.MIN_VALUE;

    this.localSizeLimit = param;
  }

  /** field for ErrorMessageFormat */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ErrorMessageFormat
      localErrorMessageFormat;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localErrorMessageFormatTracker = false;

  public boolean isErrorMessageFormatSpecified() {
    return localErrorMessageFormatTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ErrorMessageFormat
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ErrorMessageFormat
      getErrorMessageFormat() {
    return localErrorMessageFormat;
  }

  /**
   * Auto generated setter method
   *
   * @param param ErrorMessageFormat
   */
  public void setErrorMessageFormat(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ErrorMessageFormat param) {
    localErrorMessageFormatTracker = param != null;

    this.localErrorMessageFormat = param;
  }

  /** field for PlainText */
  protected java.lang.String localPlainText;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPlainTextTracker = false;

  public boolean isPlainTextSpecified() {
    return localPlainTextTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getPlainText() {
    return localPlainText;
  }

  /**
   * Auto generated setter method
   *
   * @param param PlainText
   */
  public void setPlainText(java.lang.String param) {
    localPlainTextTracker = param != null;

    this.localPlainText = param;
  }

  /** field for MaxLogRecords */
  protected org.apache.axis2.databinding.types.UnsignedInt localMaxLogRecords;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localMaxLogRecordsTracker = false;

  public boolean isMaxLogRecordsSpecified() {
    return localMaxLogRecordsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.apache.axis2.databinding.types.UnsignedInt
   */
  public org.apache.axis2.databinding.types.UnsignedInt getMaxLogRecords() {
    return localMaxLogRecords;
  }

  /**
   * Auto generated setter method
   *
   * @param param MaxLogRecords
   */
  public void setMaxLogRecords(org.apache.axis2.databinding.types.UnsignedInt param) {
    localMaxLogRecordsTracker = param != null;

    this.localMaxLogRecords = param;
  }

  /** field for LogSelectColumnMode */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogSelectColumnMode
      localLogSelectColumnMode;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localLogSelectColumnModeTracker = false;

  public boolean isLogSelectColumnModeSpecified() {
    return localLogSelectColumnModeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogSelectColumnMode
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogSelectColumnMode
      getLogSelectColumnMode() {
    return localLogSelectColumnMode;
  }

  /**
   * Auto generated setter method
   *
   * @param param LogSelectColumnMode
   */
  public void setLogSelectColumnMode(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogSelectColumnMode param) {
    localLogSelectColumnModeTracker = param != null;

    this.localLogSelectColumnMode = param;
  }

  /** field for LogFormat */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogAccessLogFormat
      localLogFormat;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localLogFormatTracker = false;

  public boolean isLogFormatSpecified() {
    return localLogFormatTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogAccessLogFormat
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogAccessLogFormat getLogFormat() {
    return localLogFormat;
  }

  /**
   * Auto generated setter method
   *
   * @param param LogFormat
   */
  public void setLogFormat(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogAccessLogFormat param) {
    localLogFormatTracker = param != null;

    this.localLogFormat = param;
  }

  /** field for LogSearchTimeBuffSecs */
  protected org.apache.axis2.databinding.types.UnsignedInt localLogSearchTimeBuffSecs;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localLogSearchTimeBuffSecsTracker = false;

  public boolean isLogSearchTimeBuffSecsSpecified() {
    return localLogSearchTimeBuffSecsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.apache.axis2.databinding.types.UnsignedInt
   */
  public org.apache.axis2.databinding.types.UnsignedInt getLogSearchTimeBuffSecs() {
    return localLogSearchTimeBuffSecs;
  }

  /**
   * Auto generated setter method
   *
   * @param param LogSearchTimeBuffSecs
   */
  public void setLogSearchTimeBuffSecs(org.apache.axis2.databinding.types.UnsignedInt param) {
    localLogSearchTimeBuffSecsTracker = param != null;

    this.localLogSearchTimeBuffSecs = param;
  }

  /** field for LogColumns */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EspStringArray localLogColumns;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localLogColumnsTracker = false;

  public boolean isLogColumnsSpecified() {
    return localLogColumnsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EspStringArray
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EspStringArray getLogColumns() {
    return localLogColumns;
  }

  /**
   * Auto generated setter method
   *
   * @param param LogColumns
   */
  public void setLogColumns(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EspStringArray param) {
    localLogColumnsTracker = param != null;

    this.localLogColumns = param;
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
            namespacePrefix + ":WUFile",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "WUFile", xmlWriter);
      }
    }
    if (localNameTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Name", xmlWriter);

      if (localName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localName);
      }

      xmlWriter.writeEndElement();
    }
    if (localWuidTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Wuid", xmlWriter);

      if (localWuid == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Wuid cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localWuid);
      }

      xmlWriter.writeEndElement();
    }
    if (localTypeTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Type", xmlWriter);

      if (localType == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Type cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localType);
      }

      xmlWriter.writeEndElement();
    }
    if (localOptionTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Option", xmlWriter);

      if (localOption == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("Option cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOption));
      }

      xmlWriter.writeEndElement();
    }
    if (localSlaveIPTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "SlaveIP", xmlWriter);

      if (localSlaveIP == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("SlaveIP cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSlaveIP);
      }

      xmlWriter.writeEndElement();
    }
    if (localIPAddressTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "IPAddress", xmlWriter);

      if (localIPAddress == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("IPAddress cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localIPAddress);
      }

      xmlWriter.writeEndElement();
    }
    if (localDescriptionTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Description", xmlWriter);

      if (localDescription == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Description cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localDescription);
      }

      xmlWriter.writeEndElement();
    }
    if (localQuerySetTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
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
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Query", xmlWriter);

      if (localQuery == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Query cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localQuery);
      }

      xmlWriter.writeEndElement();
    }
    if (localProcessTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Process", xmlWriter);

      if (localProcess == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Process cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localProcess);
      }

      xmlWriter.writeEndElement();
    }
    if (localClusterGroupTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "ClusterGroup", xmlWriter);

      if (localClusterGroup == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ClusterGroup cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localClusterGroup);
      }

      xmlWriter.writeEndElement();
    }
    if (localLogDateTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "LogDate", xmlWriter);

      if (localLogDate == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("LogDate cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localLogDate);
      }

      xmlWriter.writeEndElement();
    }
    if (localSlaveNumberTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "SlaveNumber", xmlWriter);

      if (localSlaveNumber == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("SlaveNumber cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSlaveNumber));
      }

      xmlWriter.writeEndElement();
    }
    if (localSizeLimitTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "SizeLimit", xmlWriter);

      if (localSizeLimit == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("SizeLimit cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSizeLimit));
      }

      xmlWriter.writeEndElement();
    }
    if (localErrorMessageFormatTracker) {
      if (localErrorMessageFormat == null) {
        throw new org.apache.axis2.databinding.ADBException("ErrorMessageFormat cannot be null!!");
      }
      localErrorMessageFormat.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ErrorMessageFormat"),
          xmlWriter);
    }
    if (localPlainTextTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "PlainText", xmlWriter);

      if (localPlainText == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("PlainText cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localPlainText);
      }

      xmlWriter.writeEndElement();
    }
    if (localMaxLogRecordsTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "MaxLogRecords", xmlWriter);

      if (localMaxLogRecords == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("MaxLogRecords cannot be null!!");

      } else {

        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxLogRecords));
      }

      xmlWriter.writeEndElement();
    }
    if (localLogSelectColumnModeTracker) {
      if (localLogSelectColumnMode == null) {
        throw new org.apache.axis2.databinding.ADBException("LogSelectColumnMode cannot be null!!");
      }
      localLogSelectColumnMode.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LogSelectColumnMode"),
          xmlWriter);
    }
    if (localLogFormatTracker) {
      if (localLogFormat == null) {
        throw new org.apache.axis2.databinding.ADBException("LogFormat cannot be null!!");
      }
      localLogFormat.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LogFormat"), xmlWriter);
    }
    if (localLogSearchTimeBuffSecsTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "LogSearchTimeBuffSecs", xmlWriter);

      if (localLogSearchTimeBuffSecs == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException(
            "LogSearchTimeBuffSecs cannot be null!!");

      } else {

        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localLogSearchTimeBuffSecs));
      }

      xmlWriter.writeEndElement();
    }
    if (localLogColumnsTracker) {
      if (localLogColumns == null) {
        throw new org.apache.axis2.databinding.ADBException("LogColumns cannot be null!!");
      }
      localLogColumns.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LogColumns"), xmlWriter);
    }
    xmlWriter.writeEndElement();
  }

  private static java.lang.String generatePrefix(java.lang.String namespace) {
    if (namespace.equals("urn:hpccsystems:ws:wsworkunits")) {
      return "ns13";
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
    public static WUFile parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
      WUFile object = new WUFile();

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

            if (!"WUFile".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (WUFile)
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Name")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Wuid")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Wuid" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setWuid(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Type")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Option")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Option" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setOption(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "SlaveIP")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SlaveIP" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSlaveIP(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IPAddress")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "IPAddress" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setIPAddress(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Description")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Description" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDescription(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QuerySet")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Query")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Process")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ClusterGroup")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ClusterGroup" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setClusterGroup(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LogDate")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "LogDate" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setLogDate(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "SlaveNumber")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SlaveNumber" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSlaveNumber(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "SizeLimit")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SizeLimit" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSizeLimit(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "ErrorMessageFormat")
                    .equals(reader.getName())) {

              object.setErrorMessageFormat(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ErrorMessageFormat.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PlainText")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "PlainText" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPlainText(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "MaxLogRecords")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "MaxLogRecords" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setMaxLogRecords(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "LogSelectColumnMode")
                    .equals(reader.getName())) {

              object.setLogSelectColumnMode(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogSelectColumnMode.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LogFormat")
                    .equals(reader.getName())) {

              object.setLogFormat(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogAccessLogFormat.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "LogSearchTimeBuffSecs")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "LogSearchTimeBuffSecs" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setLogSearchTimeBuffSecs(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToUnsignedInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "LogColumns")
                    .equals(reader.getName())) {

              object.setLogColumns(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EspStringArray.Factory
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

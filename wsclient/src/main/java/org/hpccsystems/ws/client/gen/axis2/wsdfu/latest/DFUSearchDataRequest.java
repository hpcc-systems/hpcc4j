/**
 * DFUSearchDataRequest.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsdfu.latest;

/** DFUSearchDataRequest bean class */
@SuppressWarnings({"unchecked", "unused"})
public class DFUSearchDataRequest implements org.apache.axis2.databinding.ADBBean {

  public static final javax.xml.namespace.QName MY_QNAME =
      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUSearchDataRequest", "ns4");

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

  /** field for ClusterType */
  protected java.lang.String localClusterType;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localClusterTypeTracker = false;

  public boolean isClusterTypeSpecified() {
    return localClusterTypeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getClusterType() {
    return localClusterType;
  }

  /**
   * Auto generated setter method
   *
   * @param param ClusterType
   */
  public void setClusterType(java.lang.String param) {
    localClusterTypeTracker = param != null;

    this.localClusterType = param;
  }

  /** field for OpenLogicalName */
  protected java.lang.String localOpenLogicalName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localOpenLogicalNameTracker = false;

  public boolean isOpenLogicalNameSpecified() {
    return localOpenLogicalNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getOpenLogicalName() {
    return localOpenLogicalName;
  }

  /**
   * Auto generated setter method
   *
   * @param param OpenLogicalName
   */
  public void setOpenLogicalName(java.lang.String param) {
    localOpenLogicalNameTracker = param != null;

    this.localOpenLogicalName = param;
  }

  /** field for FilterBy */
  protected java.lang.String localFilterBy;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localFilterByTracker = false;

  public boolean isFilterBySpecified() {
    return localFilterByTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getFilterBy() {
    return localFilterBy;
  }

  /**
   * Auto generated setter method
   *
   * @param param FilterBy
   */
  public void setFilterBy(java.lang.String param) {
    localFilterByTracker = param != null;

    this.localFilterBy = param;
  }

  /** field for ShowColumns */
  protected java.lang.String localShowColumns;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localShowColumnsTracker = false;

  public boolean isShowColumnsSpecified() {
    return localShowColumnsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getShowColumns() {
    return localShowColumns;
  }

  /**
   * Auto generated setter method
   *
   * @param param ShowColumns
   */
  public void setShowColumns(java.lang.String param) {
    localShowColumnsTracker = param != null;

    this.localShowColumns = param;
  }

  /** field for ChooseFile */
  protected int localChooseFile;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localChooseFileTracker = false;

  public boolean isChooseFileSpecified() {
    return localChooseFileTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getChooseFile() {
    return localChooseFile;
  }

  /**
   * Auto generated setter method
   *
   * @param param ChooseFile
   */
  public void setChooseFile(int param) {

    // setting primitive attribute tracker to true
    localChooseFileTracker = param != java.lang.Integer.MIN_VALUE;

    this.localChooseFile = param;
  }

  /** field for StartIndex */
  protected long localStartIndex;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localStartIndexTracker = false;

  public boolean isStartIndexSpecified() {
    return localStartIndexTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getStartIndex() {
    return localStartIndex;
  }

  /**
   * Auto generated setter method
   *
   * @param param StartIndex
   */
  public void setStartIndex(long param) {

    // setting primitive attribute tracker to true
    localStartIndexTracker = param != java.lang.Long.MIN_VALUE;

    this.localStartIndex = param;
  }

  /** field for EndIndex */
  protected long localEndIndex;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localEndIndexTracker = false;

  public boolean isEndIndexSpecified() {
    return localEndIndexTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getEndIndex() {
    return localEndIndex;
  }

  /**
   * Auto generated setter method
   *
   * @param param EndIndex
   */
  public void setEndIndex(long param) {

    // setting primitive attribute tracker to true
    localEndIndexTracker = param != java.lang.Long.MIN_VALUE;

    this.localEndIndex = param;
  }

  /** field for LogicalName */
  protected java.lang.String localLogicalName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localLogicalNameTracker = false;

  public boolean isLogicalNameSpecified() {
    return localLogicalNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getLogicalName() {
    return localLogicalName;
  }

  /**
   * Auto generated setter method
   *
   * @param param LogicalName
   */
  public void setLogicalName(java.lang.String param) {
    localLogicalNameTracker = param != null;

    this.localLogicalName = param;
  }

  /** field for ParentName */
  protected java.lang.String localParentName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localParentNameTracker = false;

  public boolean isParentNameSpecified() {
    return localParentNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getParentName() {
    return localParentName;
  }

  /**
   * Auto generated setter method
   *
   * @param param ParentName
   */
  public void setParentName(java.lang.String param) {
    localParentNameTracker = param != null;

    this.localParentName = param;
  }

  /** field for StartForGoback */
  protected long localStartForGoback;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localStartForGobackTracker = false;

  public boolean isStartForGobackSpecified() {
    return localStartForGobackTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getStartForGoback() {
    return localStartForGoback;
  }

  /**
   * Auto generated setter method
   *
   * @param param StartForGoback
   */
  public void setStartForGoback(long param) {

    // setting primitive attribute tracker to true
    localStartForGobackTracker = param != java.lang.Long.MIN_VALUE;

    this.localStartForGoback = param;
  }

  /** field for CountForGoback */
  protected int localCountForGoback;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localCountForGobackTracker = false;

  public boolean isCountForGobackSpecified() {
    return localCountForGobackTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getCountForGoback() {
    return localCountForGoback;
  }

  /**
   * Auto generated setter method
   *
   * @param param CountForGoback
   */
  public void setCountForGoback(int param) {

    // setting primitive attribute tracker to true
    localCountForGobackTracker = param != java.lang.Integer.MIN_VALUE;

    this.localCountForGoback = param;
  }

  /** field for Start */
  protected long localStart;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localStartTracker = false;

  public boolean isStartSpecified() {
    return localStartTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getStart() {
    return localStart;
  }

  /**
   * Auto generated setter method
   *
   * @param param Start
   */
  public void setStart(long param) {

    // setting primitive attribute tracker to true
    localStartTracker = param != java.lang.Long.MIN_VALUE;

    this.localStart = param;
  }

  /** field for Count */
  protected int localCount;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localCountTracker = false;

  public boolean isCountSpecified() {
    return localCountTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getCount() {
    return localCount;
  }

  /**
   * Auto generated setter method
   *
   * @param param Count
   */
  public void setCount(int param) {

    // setting primitive attribute tracker to true
    localCountTracker = param != java.lang.Integer.MIN_VALUE;

    this.localCount = param;
  }

  /** field for File */
  protected java.lang.String localFile;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localFileTracker = false;

  public boolean isFileSpecified() {
    return localFileTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getFile() {
    return localFile;
  }

  /**
   * Auto generated setter method
   *
   * @param param File
   */
  public void setFile(java.lang.String param) {
    localFileTracker = param != null;

    this.localFile = param;
  }

  /** field for Key */
  protected java.lang.String localKey;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localKeyTracker = false;

  public boolean isKeySpecified() {
    return localKeyTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getKey() {
    return localKey;
  }

  /**
   * Auto generated setter method
   *
   * @param param Key
   */
  public void setKey(java.lang.String param) {
    localKeyTracker = param != null;

    this.localKey = param;
  }

  /** field for SchemaOnly */
  protected boolean localSchemaOnly =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("true");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSchemaOnlyTracker = false;

  public boolean isSchemaOnlySpecified() {
    return localSchemaOnlyTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getSchemaOnly() {
    return localSchemaOnly;
  }

  /**
   * Auto generated setter method
   *
   * @param param SchemaOnly
   */
  public void setSchemaOnly(boolean param) {

    // setting primitive attribute tracker to true
    localSchemaOnlyTracker = true;

    this.localSchemaOnly = param;
  }

  /** field for RoxieSelections */
  protected boolean localRoxieSelections =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("true");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localRoxieSelectionsTracker = false;

  public boolean isRoxieSelectionsSpecified() {
    return localRoxieSelectionsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getRoxieSelections() {
    return localRoxieSelections;
  }

  /**
   * Auto generated setter method
   *
   * @param param RoxieSelections
   */
  public void setRoxieSelections(boolean param) {

    // setting primitive attribute tracker to true
    localRoxieSelectionsTracker = true;

    this.localRoxieSelections = param;
  }

  /** field for DisableUppercaseTranslation */
  protected boolean localDisableUppercaseTranslation;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDisableUppercaseTranslationTracker = false;

  public boolean isDisableUppercaseTranslationSpecified() {
    return localDisableUppercaseTranslationTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getDisableUppercaseTranslation() {
    return localDisableUppercaseTranslation;
  }

  /**
   * Auto generated setter method
   *
   * @param param DisableUppercaseTranslation
   */
  public void setDisableUppercaseTranslation(boolean param) {

    // setting primitive attribute tracker to true
    localDisableUppercaseTranslationTracker = true;

    this.localDisableUppercaseTranslation = param;
  }

  /** field for SelectedKey */
  protected java.lang.String localSelectedKey;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSelectedKeyTracker = false;

  public boolean isSelectedKeySpecified() {
    return localSelectedKeyTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getSelectedKey() {
    return localSelectedKey;
  }

  /**
   * Auto generated setter method
   *
   * @param param SelectedKey
   */
  public void setSelectedKey(java.lang.String param) {
    localSelectedKeyTracker = param != null;

    this.localSelectedKey = param;
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
            namespacePrefix + ":DFUSearchDataRequest",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            "DFUSearchDataRequest",
            xmlWriter);
      }
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
    if (localClusterTypeTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "ClusterType", xmlWriter);

      if (localClusterType == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ClusterType cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localClusterType);
      }

      xmlWriter.writeEndElement();
    }
    if (localOpenLogicalNameTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "OpenLogicalName", xmlWriter);

      if (localOpenLogicalName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("OpenLogicalName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localOpenLogicalName);
      }

      xmlWriter.writeEndElement();
    }
    if (localFilterByTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "FilterBy", xmlWriter);

      if (localFilterBy == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("FilterBy cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localFilterBy);
      }

      xmlWriter.writeEndElement();
    }
    if (localShowColumnsTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "ShowColumns", xmlWriter);

      if (localShowColumns == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ShowColumns cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localShowColumns);
      }

      xmlWriter.writeEndElement();
    }
    if (localChooseFileTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "ChooseFile", xmlWriter);

      if (localChooseFile == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("ChooseFile cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChooseFile));
      }

      xmlWriter.writeEndElement();
    }
    if (localStartIndexTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "StartIndex", xmlWriter);

      if (localStartIndex == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("StartIndex cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartIndex));
      }

      xmlWriter.writeEndElement();
    }
    if (localEndIndexTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "EndIndex", xmlWriter);

      if (localEndIndex == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("EndIndex cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndIndex));
      }

      xmlWriter.writeEndElement();
    }
    if (localLogicalNameTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "LogicalName", xmlWriter);

      if (localLogicalName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("LogicalName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localLogicalName);
      }

      xmlWriter.writeEndElement();
    }
    if (localParentNameTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "ParentName", xmlWriter);

      if (localParentName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ParentName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localParentName);
      }

      xmlWriter.writeEndElement();
    }
    if (localStartForGobackTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "StartForGoback", xmlWriter);

      if (localStartForGoback == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("StartForGoback cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartForGoback));
      }

      xmlWriter.writeEndElement();
    }
    if (localCountForGobackTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "CountForGoback", xmlWriter);

      if (localCountForGoback == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("CountForGoback cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCountForGoback));
      }

      xmlWriter.writeEndElement();
    }
    if (localStartTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "Start", xmlWriter);

      if (localStart == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("Start cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStart));
      }

      xmlWriter.writeEndElement();
    }
    if (localCountTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "Count", xmlWriter);

      if (localCount == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("Count cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCount));
      }

      xmlWriter.writeEndElement();
    }
    if (localFileTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "File", xmlWriter);

      if (localFile == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("File cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localFile);
      }

      xmlWriter.writeEndElement();
    }
    if (localKeyTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "Key", xmlWriter);

      if (localKey == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Key cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localKey);
      }

      xmlWriter.writeEndElement();
    }
    if (localSchemaOnlyTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "SchemaOnly", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("SchemaOnly cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSchemaOnly));
      }

      xmlWriter.writeEndElement();
    }
    if (localRoxieSelectionsTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "RoxieSelections", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("RoxieSelections cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoxieSelections));
      }

      xmlWriter.writeEndElement();
    }
    if (localDisableUppercaseTranslationTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "DisableUppercaseTranslation", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException(
            "DisableUppercaseTranslation cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localDisableUppercaseTranslation));
      }

      xmlWriter.writeEndElement();
    }
    if (localSelectedKeyTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "SelectedKey", xmlWriter);

      if (localSelectedKey == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("SelectedKey cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSelectedKey);
      }

      xmlWriter.writeEndElement();
    }
    xmlWriter.writeEndElement();
  }

  private static java.lang.String generatePrefix(java.lang.String namespace) {
    if (namespace.equals("urn:hpccsystems:ws:wsdfu")) {
      return "ns4";
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
    public static DFUSearchDataRequest parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      DFUSearchDataRequest object = new DFUSearchDataRequest();

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

            if (!"DFUSearchDataRequest".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (DFUSearchDataRequest)
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ClusterType")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ClusterType" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setClusterType(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "OpenLogicalName")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "OpenLogicalName" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setOpenLogicalName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FilterBy")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "FilterBy" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setFilterBy(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ShowColumns")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ShowColumns" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setShowColumns(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ChooseFile")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ChooseFile" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setChooseFile(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "StartIndex")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "StartIndex" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setStartIndex(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "EndIndex")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "EndIndex" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setEndIndex(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "LogicalName")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "LogicalName" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setLogicalName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ParentName")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ParentName" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setParentName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "StartForGoback")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "StartForGoback" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setStartForGoback(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "CountForGoback")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "CountForGoback" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setCountForGoback(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Start")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Start" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setStart(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Count")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Count" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setCount(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "File")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "File" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setFile(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Key")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Key" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setKey(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "SchemaOnly")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SchemaOnly" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSchemaOnly(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "RoxieSelections")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "RoxieSelections" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setRoxieSelections(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "DisableUppercaseTranslation")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "DisableUppercaseTranslation" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDisableUppercaseTranslation(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "SelectedKey")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SelectedKey" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSelectedKey(
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

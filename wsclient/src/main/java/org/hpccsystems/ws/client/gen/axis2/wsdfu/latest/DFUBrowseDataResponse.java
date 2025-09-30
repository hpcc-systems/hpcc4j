/**
 * DFUBrowseDataResponse.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsdfu.latest;

/** DFUBrowseDataResponse bean class */
@SuppressWarnings({"unchecked", "unused"})
public class DFUBrowseDataResponse implements org.apache.axis2.databinding.ADBBean {

  public static final javax.xml.namespace.QName MY_QNAME =
      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUBrowseDataResponse", "ns4");

  /** field for Exceptions */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfEspException localExceptions;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localExceptionsTracker = false;

  public boolean isExceptionsSpecified() {
    return localExceptionsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfEspException
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfEspException getExceptions() {
    return localExceptions;
  }

  /**
   * Auto generated setter method
   *
   * @param param Exceptions
   */
  public void setExceptions(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfEspException param) {
    localExceptionsTracker = param != null;

    this.localExceptions = param;
  }

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

  /** field for FilterForGoBack */
  protected java.lang.String localFilterForGoBack;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localFilterForGoBackTracker = false;

  public boolean isFilterForGoBackSpecified() {
    return localFilterForGoBackTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getFilterForGoBack() {
    return localFilterForGoBack;
  }

  /**
   * Auto generated setter method
   *
   * @param param FilterForGoBack
   */
  public void setFilterForGoBack(java.lang.String param) {
    localFilterForGoBackTracker = param != null;

    this.localFilterForGoBack = param;
  }

  /** field for ColumnsHidden */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ColumnsHidden_type0 localColumnsHidden;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localColumnsHiddenTracker = false;

  public boolean isColumnsHiddenSpecified() {
    return localColumnsHiddenTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ColumnsHidden_type0
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ColumnsHidden_type0 getColumnsHidden() {
    return localColumnsHidden;
  }

  /**
   * Auto generated setter method
   *
   * @param param ColumnsHidden
   */
  public void setColumnsHidden(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ColumnsHidden_type0 param) {
    localColumnsHiddenTracker = param != null;

    this.localColumnsHidden = param;
  }

  /** field for ColumnCount */
  protected int localColumnCount;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localColumnCountTracker = false;

  public boolean isColumnCountSpecified() {
    return localColumnCountTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getColumnCount() {
    return localColumnCount;
  }

  /**
   * Auto generated setter method
   *
   * @param param ColumnCount
   */
  public void setColumnCount(int param) {

    // setting primitive attribute tracker to true
    localColumnCountTracker = param != java.lang.Integer.MIN_VALUE;

    this.localColumnCount = param;
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

  /** field for SchemaOnly */
  protected boolean localSchemaOnly =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

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
  protected long localCount;

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
   * @return long
   */
  public long getCount() {
    return localCount;
  }

  /**
   * Auto generated setter method
   *
   * @param param Count
   */
  public void setCount(long param) {

    // setting primitive attribute tracker to true
    localCountTracker = param != java.lang.Long.MIN_VALUE;

    this.localCount = param;
  }

  /** field for PageSize */
  protected long localPageSize;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPageSizeTracker = false;

  public boolean isPageSizeSpecified() {
    return localPageSizeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getPageSize() {
    return localPageSize;
  }

  /**
   * Auto generated setter method
   *
   * @param param PageSize
   */
  public void setPageSize(long param) {

    // setting primitive attribute tracker to true
    localPageSizeTracker = param != java.lang.Long.MIN_VALUE;

    this.localPageSize = param;
  }

  /** field for Total */
  protected long localTotal;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTotalTracker = false;

  public boolean isTotalSpecified() {
    return localTotalTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getTotal() {
    return localTotal;
  }

  /**
   * Auto generated setter method
   *
   * @param param Total
   */
  public void setTotal(long param) {

    // setting primitive attribute tracker to true
    localTotalTracker = param != java.lang.Long.MIN_VALUE;

    this.localTotal = param;
  }

  /** field for Result */
  protected java.lang.String localResult;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localResultTracker = false;

  public boolean isResultSpecified() {
    return localResultTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getResult() {
    return localResult;
  }

  /**
   * Auto generated setter method
   *
   * @param param Result
   */
  public void setResult(java.lang.String param) {
    localResultTracker = param != null;

    this.localResult = param;
  }

  /** field for MsgToDisplay */
  protected java.lang.String localMsgToDisplay;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localMsgToDisplayTracker = false;

  public boolean isMsgToDisplaySpecified() {
    return localMsgToDisplayTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getMsgToDisplay() {
    return localMsgToDisplay;
  }

  /**
   * Auto generated setter method
   *
   * @param param MsgToDisplay
   */
  public void setMsgToDisplay(java.lang.String param) {
    localMsgToDisplayTracker = param != null;

    this.localMsgToDisplay = param;
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
            namespacePrefix + ":DFUBrowseDataResponse",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            "DFUBrowseDataResponse",
            xmlWriter);
      }
    }
    if (localExceptionsTracker) {
      if (localExceptions == null) {
        throw new org.apache.axis2.databinding.ADBException("Exceptions cannot be null!!");
      }
      localExceptions.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"), xmlWriter);
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
    if (localFilterForGoBackTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "FilterForGoBack", xmlWriter);

      if (localFilterForGoBack == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("FilterForGoBack cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localFilterForGoBack);
      }

      xmlWriter.writeEndElement();
    }
    if (localColumnsHiddenTracker) {
      if (localColumnsHidden == null) {
        throw new org.apache.axis2.databinding.ADBException("ColumnsHidden cannot be null!!");
      }
      localColumnsHidden.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ColumnsHidden"), xmlWriter);
    }
    if (localColumnCountTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "ColumnCount", xmlWriter);

      if (localColumnCount == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("ColumnCount cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localColumnCount));
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

      if (localCount == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("Count cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCount));
      }

      xmlWriter.writeEndElement();
    }
    if (localPageSizeTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "PageSize", xmlWriter);

      if (localPageSize == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("PageSize cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPageSize));
      }

      xmlWriter.writeEndElement();
    }
    if (localTotalTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "Total", xmlWriter);

      if (localTotal == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("Total cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotal));
      }

      xmlWriter.writeEndElement();
    }
    if (localResultTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "Result", xmlWriter);

      if (localResult == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Result cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localResult);
      }

      xmlWriter.writeEndElement();
    }
    if (localMsgToDisplayTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "MsgToDisplay", xmlWriter);

      if (localMsgToDisplay == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("MsgToDisplay cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localMsgToDisplay);
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
    public static DFUBrowseDataResponse parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      DFUBrowseDataResponse object = new DFUBrowseDataResponse();

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

            if (!"DFUBrowseDataResponse".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (DFUBrowseDataResponse)
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions")
                    .equals(reader.getName())) {

              object.setExceptions(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfEspException.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FilterForGoBack")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "FilterForGoBack" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setFilterForGoBack(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ColumnsHidden")
                    .equals(reader.getName())) {

              object.setColumnsHidden(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ColumnsHidden_type0.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ColumnCount")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ColumnCount" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setColumnCount(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

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
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "PageSize")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "PageSize" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPageSize(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Total")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Total" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setTotal(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Result")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Result" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setResult(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "MsgToDisplay")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "MsgToDisplay" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setMsgToDisplay(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

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

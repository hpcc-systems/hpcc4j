/**
 * DFUIndexInfo.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsdfu.latest;

/** DFUIndexInfo bean class */
@SuppressWarnings({"unchecked", "unused"})
public class DFUIndexInfo implements org.apache.axis2.databinding.ADBBean {
  /* This type was generated from the piece of schema that had
  name = DFUIndexInfo
  Namespace URI = urn:hpccsystems:ws:wsdfu
  Namespace Prefix = ns1
  */

  /** field for IsLeafCountEstimated */
  protected boolean localIsLeafCountEstimated;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIsLeafCountEstimatedTracker = false;

  public boolean isIsLeafCountEstimatedSpecified() {
    return localIsLeafCountEstimatedTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getIsLeafCountEstimated() {
    return localIsLeafCountEstimated;
  }

  /**
   * Auto generated setter method
   *
   * @param param IsLeafCountEstimated
   */
  public void setIsLeafCountEstimated(boolean param) {

    // setting primitive attribute tracker to true
    localIsLeafCountEstimatedTracker = true;

    this.localIsLeafCountEstimated = param;
  }

  /** field for NumLeafNodes */
  protected long localNumLeafNodes;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localNumLeafNodesTracker = false;

  public boolean isNumLeafNodesSpecified() {
    return localNumLeafNodesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getNumLeafNodes() {
    return localNumLeafNodes;
  }

  /**
   * Auto generated setter method
   *
   * @param param NumLeafNodes
   */
  public void setNumLeafNodes(long param) {

    // setting primitive attribute tracker to true
    localNumLeafNodesTracker = param != java.lang.Long.MIN_VALUE;

    this.localNumLeafNodes = param;
  }

  /** field for NumBlobNodes */
  protected long localNumBlobNodes;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localNumBlobNodesTracker = false;

  public boolean isNumBlobNodesSpecified() {
    return localNumBlobNodesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getNumBlobNodes() {
    return localNumBlobNodes;
  }

  /**
   * Auto generated setter method
   *
   * @param param NumBlobNodes
   */
  public void setNumBlobNodes(long param) {

    // setting primitive attribute tracker to true
    localNumBlobNodesTracker = param != java.lang.Long.MIN_VALUE;

    this.localNumBlobNodes = param;
  }

  /** field for NumBranchNodes */
  protected long localNumBranchNodes;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localNumBranchNodesTracker = false;

  public boolean isNumBranchNodesSpecified() {
    return localNumBranchNodesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getNumBranchNodes() {
    return localNumBranchNodes;
  }

  /**
   * Auto generated setter method
   *
   * @param param NumBranchNodes
   */
  public void setNumBranchNodes(long param) {

    // setting primitive attribute tracker to true
    localNumBranchNodesTracker = param != java.lang.Long.MIN_VALUE;

    this.localNumBranchNodes = param;
  }

  /** field for SizeDiskLeaves */
  protected long localSizeDiskLeaves;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSizeDiskLeavesTracker = false;

  public boolean isSizeDiskLeavesSpecified() {
    return localSizeDiskLeavesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getSizeDiskLeaves() {
    return localSizeDiskLeaves;
  }

  /**
   * Auto generated setter method
   *
   * @param param SizeDiskLeaves
   */
  public void setSizeDiskLeaves(long param) {

    // setting primitive attribute tracker to true
    localSizeDiskLeavesTracker = param != java.lang.Long.MIN_VALUE;

    this.localSizeDiskLeaves = param;
  }

  /** field for SizeDiskBlobs */
  protected long localSizeDiskBlobs;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSizeDiskBlobsTracker = false;

  public boolean isSizeDiskBlobsSpecified() {
    return localSizeDiskBlobsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getSizeDiskBlobs() {
    return localSizeDiskBlobs;
  }

  /**
   * Auto generated setter method
   *
   * @param param SizeDiskBlobs
   */
  public void setSizeDiskBlobs(long param) {

    // setting primitive attribute tracker to true
    localSizeDiskBlobsTracker = param != java.lang.Long.MIN_VALUE;

    this.localSizeDiskBlobs = param;
  }

  /** field for SizeDiskBranches */
  protected long localSizeDiskBranches;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSizeDiskBranchesTracker = false;

  public boolean isSizeDiskBranchesSpecified() {
    return localSizeDiskBranchesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getSizeDiskBranches() {
    return localSizeDiskBranches;
  }

  /**
   * Auto generated setter method
   *
   * @param param SizeDiskBranches
   */
  public void setSizeDiskBranches(long param) {

    // setting primitive attribute tracker to true
    localSizeDiskBranchesTracker = param != java.lang.Long.MIN_VALUE;

    this.localSizeDiskBranches = param;
  }

  /** field for SizeOriginalData */
  protected long localSizeOriginalData;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSizeOriginalDataTracker = false;

  public boolean isSizeOriginalDataSpecified() {
    return localSizeOriginalDataTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getSizeOriginalData() {
    return localSizeOriginalData;
  }

  /**
   * Auto generated setter method
   *
   * @param param SizeOriginalData
   */
  public void setSizeOriginalData(long param) {

    // setting primitive attribute tracker to true
    localSizeOriginalDataTracker = param != java.lang.Long.MIN_VALUE;

    this.localSizeOriginalData = param;
  }

  /** field for SizeOriginalBranches */
  protected long localSizeOriginalBranches;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSizeOriginalBranchesTracker = false;

  public boolean isSizeOriginalBranchesSpecified() {
    return localSizeOriginalBranchesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getSizeOriginalBranches() {
    return localSizeOriginalBranches;
  }

  /**
   * Auto generated setter method
   *
   * @param param SizeOriginalBranches
   */
  public void setSizeOriginalBranches(long param) {

    // setting primitive attribute tracker to true
    localSizeOriginalBranchesTracker = param != java.lang.Long.MIN_VALUE;

    this.localSizeOriginalBranches = param;
  }

  /** field for SizeMemoryLeaves */
  protected long localSizeMemoryLeaves;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSizeMemoryLeavesTracker = false;

  public boolean isSizeMemoryLeavesSpecified() {
    return localSizeMemoryLeavesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getSizeMemoryLeaves() {
    return localSizeMemoryLeaves;
  }

  /**
   * Auto generated setter method
   *
   * @param param SizeMemoryLeaves
   */
  public void setSizeMemoryLeaves(long param) {

    // setting primitive attribute tracker to true
    localSizeMemoryLeavesTracker = param != java.lang.Long.MIN_VALUE;

    this.localSizeMemoryLeaves = param;
  }

  /** field for SizeMemoryBranches */
  protected long localSizeMemoryBranches;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSizeMemoryBranchesTracker = false;

  public boolean isSizeMemoryBranchesSpecified() {
    return localSizeMemoryBranchesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getSizeMemoryBranches() {
    return localSizeMemoryBranches;
  }

  /**
   * Auto generated setter method
   *
   * @param param SizeMemoryBranches
   */
  public void setSizeMemoryBranches(long param) {

    // setting primitive attribute tracker to true
    localSizeMemoryBranchesTracker = param != java.lang.Long.MIN_VALUE;

    this.localSizeMemoryBranches = param;
  }

  /** field for BranchCompressionPercent */
  protected double localBranchCompressionPercent;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localBranchCompressionPercentTracker = false;

  public boolean isBranchCompressionPercentSpecified() {
    return localBranchCompressionPercentTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return double
   */
  public double getBranchCompressionPercent() {
    return localBranchCompressionPercent;
  }

  /**
   * Auto generated setter method
   *
   * @param param BranchCompressionPercent
   */
  public void setBranchCompressionPercent(double param) {

    // setting primitive attribute tracker to true
    localBranchCompressionPercentTracker = !java.lang.Double.isNaN(param);

    this.localBranchCompressionPercent = param;
  }

  /** field for DataCompressionPercent */
  protected double localDataCompressionPercent;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDataCompressionPercentTracker = false;

  public boolean isDataCompressionPercentSpecified() {
    return localDataCompressionPercentTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return double
   */
  public double getDataCompressionPercent() {
    return localDataCompressionPercent;
  }

  /**
   * Auto generated setter method
   *
   * @param param DataCompressionPercent
   */
  public void setDataCompressionPercent(double param) {

    // setting primitive attribute tracker to true
    localDataCompressionPercentTracker = !java.lang.Double.isNaN(param);

    this.localDataCompressionPercent = param;
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

      java.lang.String namespacePrefix = registerPrefix(xmlWriter, "urn:hpccsystems:ws:wsdfu");
      if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            namespacePrefix + ":DFUIndexInfo",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "DFUIndexInfo", xmlWriter);
      }
    }
    if (localIsLeafCountEstimatedTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "IsLeafCountEstimated", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException(
            "IsLeafCountEstimated cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localIsLeafCountEstimated));
      }

      xmlWriter.writeEndElement();
    }
    if (localNumLeafNodesTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "NumLeafNodes", xmlWriter);

      if (localNumLeafNodes == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("NumLeafNodes cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumLeafNodes));
      }

      xmlWriter.writeEndElement();
    }
    if (localNumBlobNodesTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "NumBlobNodes", xmlWriter);

      if (localNumBlobNodes == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("NumBlobNodes cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumBlobNodes));
      }

      xmlWriter.writeEndElement();
    }
    if (localNumBranchNodesTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "NumBranchNodes", xmlWriter);

      if (localNumBranchNodes == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("NumBranchNodes cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumBranchNodes));
      }

      xmlWriter.writeEndElement();
    }
    if (localSizeDiskLeavesTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "SizeDiskLeaves", xmlWriter);

      if (localSizeDiskLeaves == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("SizeDiskLeaves cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSizeDiskLeaves));
      }

      xmlWriter.writeEndElement();
    }
    if (localSizeDiskBlobsTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "SizeDiskBlobs", xmlWriter);

      if (localSizeDiskBlobs == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("SizeDiskBlobs cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSizeDiskBlobs));
      }

      xmlWriter.writeEndElement();
    }
    if (localSizeDiskBranchesTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "SizeDiskBranches", xmlWriter);

      if (localSizeDiskBranches == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("SizeDiskBranches cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localSizeDiskBranches));
      }

      xmlWriter.writeEndElement();
    }
    if (localSizeOriginalDataTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "SizeOriginalData", xmlWriter);

      if (localSizeOriginalData == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("SizeOriginalData cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localSizeOriginalData));
      }

      xmlWriter.writeEndElement();
    }
    if (localSizeOriginalBranchesTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "SizeOriginalBranches", xmlWriter);

      if (localSizeOriginalBranches == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException(
            "SizeOriginalBranches cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localSizeOriginalBranches));
      }

      xmlWriter.writeEndElement();
    }
    if (localSizeMemoryLeavesTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "SizeMemoryLeaves", xmlWriter);

      if (localSizeMemoryLeaves == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("SizeMemoryLeaves cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localSizeMemoryLeaves));
      }

      xmlWriter.writeEndElement();
    }
    if (localSizeMemoryBranchesTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "SizeMemoryBranches", xmlWriter);

      if (localSizeMemoryBranches == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("SizeMemoryBranches cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localSizeMemoryBranches));
      }

      xmlWriter.writeEndElement();
    }
    if (localBranchCompressionPercentTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "BranchCompressionPercent", xmlWriter);

      if (java.lang.Double.isNaN(localBranchCompressionPercent)) {

        throw new org.apache.axis2.databinding.ADBException(
            "BranchCompressionPercent cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localBranchCompressionPercent));
      }

      xmlWriter.writeEndElement();
    }
    if (localDataCompressionPercentTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "DataCompressionPercent", xmlWriter);

      if (java.lang.Double.isNaN(localDataCompressionPercent)) {

        throw new org.apache.axis2.databinding.ADBException(
            "DataCompressionPercent cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localDataCompressionPercent));
      }

      xmlWriter.writeEndElement();
    }
    xmlWriter.writeEndElement();
  }

  private static java.lang.String generatePrefix(java.lang.String namespace) {
    if (namespace.equals("urn:hpccsystems:ws:wsdfu")) {
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
    public static DFUIndexInfo parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      DFUIndexInfo object = new DFUIndexInfo();

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

            if (!"DFUIndexInfo".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (DFUIndexInfo)
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "IsLeafCountEstimated")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "IsLeafCountEstimated" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setIsLeafCountEstimated(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "NumLeafNodes")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "NumLeafNodes" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setNumLeafNodes(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "NumBlobNodes")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "NumBlobNodes" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setNumBlobNodes(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "NumBranchNodes")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "NumBranchNodes" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setNumBranchNodes(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "SizeDiskLeaves")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SizeDiskLeaves" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSizeDiskLeaves(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "SizeDiskBlobs")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SizeDiskBlobs" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSizeDiskBlobs(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "SizeDiskBranches")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SizeDiskBranches" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSizeDiskBranches(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "SizeOriginalData")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SizeOriginalData" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSizeOriginalData(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "SizeOriginalBranches")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SizeOriginalBranches" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSizeOriginalBranches(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "SizeMemoryLeaves")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SizeMemoryLeaves" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSizeMemoryLeaves(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "SizeMemoryBranches")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SizeMemoryBranches" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSizeMemoryBranches(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "BranchCompressionPercent")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "BranchCompressionPercent" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setBranchCompressionPercent(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "DataCompressionPercent")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "DataCompressionPercent" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDataCompressionPercent(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));

              reader.next();

            } // End of if for expected property start element
            else {
              // 3 - A start element we are not expecting indicates an invalid parameter was passed

              log.warn("Unexpected subelement " + reader.getLocalName());
              // consume everything, ending on the unexpected subelement's endtag
              javax.xml.namespace.QName subQName = reader.getName();
              while (!(reader.isEndElement() && reader.getName().equals(subQName))) {
                reader.next();
              }
              // skip past this extra element completely
              reader.next();
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

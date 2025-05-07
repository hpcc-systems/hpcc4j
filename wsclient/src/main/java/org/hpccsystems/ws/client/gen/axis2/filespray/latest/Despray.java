/**
 * Despray.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.filespray.latest;

/** Despray bean class */
@SuppressWarnings({"unchecked", "unused"})
public class Despray implements org.apache.axis2.databinding.ADBBean {

  public static final javax.xml.namespace.QName MY_QNAME =
      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Despray", "ns1");

  /** field for DestGroup */
  protected java.lang.String localDestGroup;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDestGroupTracker = false;

  public boolean isDestGroupSpecified() {
    return localDestGroupTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getDestGroup() {
    return localDestGroup;
  }

  /**
   * Auto generated setter method
   *
   * @param param DestGroup
   */
  public void setDestGroup(java.lang.String param) {
    localDestGroupTracker = param != null;

    this.localDestGroup = param;
  }

  /** field for SourceLogicalName */
  protected java.lang.String localSourceLogicalName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSourceLogicalNameTracker = false;

  public boolean isSourceLogicalNameSpecified() {
    return localSourceLogicalNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getSourceLogicalName() {
    return localSourceLogicalName;
  }

  /**
   * Auto generated setter method
   *
   * @param param SourceLogicalName
   */
  public void setSourceLogicalName(java.lang.String param) {
    localSourceLogicalNameTracker = param != null;

    this.localSourceLogicalName = param;
  }

  /** field for DestIP */
  protected java.lang.String localDestIP;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDestIPTracker = false;

  public boolean isDestIPSpecified() {
    return localDestIPTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getDestIP() {
    return localDestIP;
  }

  /**
   * Auto generated setter method
   *
   * @param param DestIP
   */
  public void setDestIP(java.lang.String param) {
    localDestIPTracker = param != null;

    this.localDestIP = param;
  }

  /** field for DestPath */
  protected java.lang.String localDestPath;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDestPathTracker = false;

  public boolean isDestPathSpecified() {
    return localDestPathTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getDestPath() {
    return localDestPath;
  }

  /**
   * Auto generated setter method
   *
   * @param param DestPath
   */
  public void setDestPath(java.lang.String param) {
    localDestPathTracker = param != null;

    this.localDestPath = param;
  }

  /** field for DestPlane */
  protected java.lang.String localDestPlane;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDestPlaneTracker = false;

  public boolean isDestPlaneSpecified() {
    return localDestPlaneTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getDestPlane() {
    return localDestPlane;
  }

  /**
   * Auto generated setter method
   *
   * @param param DestPlane
   */
  public void setDestPlane(java.lang.String param) {
    localDestPlaneTracker = param != null;

    this.localDestPlane = param;
  }

  /** field for Dstxml */
  protected jakarta.activation.DataHandler localDstxml;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDstxmlTracker = false;

  public boolean isDstxmlSpecified() {
    return localDstxmlTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return jakarta.activation.DataHandler
   */
  public jakarta.activation.DataHandler getDstxml() {
    return localDstxml;
  }

  /**
   * Auto generated setter method
   *
   * @param param Dstxml
   */
  public void setDstxml(jakarta.activation.DataHandler param) {
    localDstxmlTracker = param != null;

    this.localDstxml = param;
  }

  /** field for Overwrite */
  protected boolean localOverwrite;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localOverwriteTracker = false;

  public boolean isOverwriteSpecified() {
    return localOverwriteTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getOverwrite() {
    return localOverwrite;
  }

  /**
   * Auto generated setter method
   *
   * @param param Overwrite
   */
  public void setOverwrite(boolean param) {

    // setting primitive attribute tracker to true
    localOverwriteTracker = true;

    this.localOverwrite = param;
  }

  /** field for MaxConnections */
  protected int localMaxConnections;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localMaxConnectionsTracker = false;

  public boolean isMaxConnectionsSpecified() {
    return localMaxConnectionsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getMaxConnections() {
    return localMaxConnections;
  }

  /**
   * Auto generated setter method
   *
   * @param param MaxConnections
   */
  public void setMaxConnections(int param) {

    // setting primitive attribute tracker to true
    localMaxConnectionsTracker = param != java.lang.Integer.MIN_VALUE;

    this.localMaxConnections = param;
  }

  /** field for Throttle */
  protected int localThrottle;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localThrottleTracker = false;

  public boolean isThrottleSpecified() {
    return localThrottleTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getThrottle() {
    return localThrottle;
  }

  /**
   * Auto generated setter method
   *
   * @param param Throttle
   */
  public void setThrottle(int param) {

    // setting primitive attribute tracker to true
    localThrottleTracker = param != java.lang.Integer.MIN_VALUE;

    this.localThrottle = param;
  }

  /** field for TransferBufferSize */
  protected int localTransferBufferSize;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTransferBufferSizeTracker = false;

  public boolean isTransferBufferSizeSpecified() {
    return localTransferBufferSizeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getTransferBufferSize() {
    return localTransferBufferSize;
  }

  /**
   * Auto generated setter method
   *
   * @param param TransferBufferSize
   */
  public void setTransferBufferSize(int param) {

    // setting primitive attribute tracker to true
    localTransferBufferSizeTracker = param != java.lang.Integer.MIN_VALUE;

    this.localTransferBufferSize = param;
  }

  /** field for Splitprefix */
  protected java.lang.String localSplitprefix;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSplitprefixTracker = false;

  public boolean isSplitprefixSpecified() {
    return localSplitprefixTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getSplitprefix() {
    return localSplitprefix;
  }

  /**
   * Auto generated setter method
   *
   * @param param Splitprefix
   */
  public void setSplitprefix(java.lang.String param) {
    localSplitprefixTracker = param != null;

    this.localSplitprefix = param;
  }

  /** field for Norecover */
  protected boolean localNorecover =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localNorecoverTracker = false;

  public boolean isNorecoverSpecified() {
    return localNorecoverTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getNorecover() {
    return localNorecover;
  }

  /**
   * Auto generated setter method
   *
   * @param param Norecover
   */
  public void setNorecover(boolean param) {

    // setting primitive attribute tracker to true
    localNorecoverTracker = true;

    this.localNorecover = param;
  }

  /** field for Wrap */
  protected boolean localWrap =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localWrapTracker = false;

  public boolean isWrapSpecified() {
    return localWrapTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getWrap() {
    return localWrap;
  }

  /**
   * Auto generated setter method
   *
   * @param param Wrap
   */
  public void setWrap(boolean param) {

    // setting primitive attribute tracker to true
    localWrapTracker = true;

    this.localWrap = param;
  }

  /** field for MultiCopy */
  protected boolean localMultiCopy =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localMultiCopyTracker = false;

  public boolean isMultiCopySpecified() {
    return localMultiCopyTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getMultiCopy() {
    return localMultiCopy;
  }

  /**
   * Auto generated setter method
   *
   * @param param MultiCopy
   */
  public void setMultiCopy(boolean param) {

    // setting primitive attribute tracker to true
    localMultiCopyTracker = true;

    this.localMultiCopy = param;
  }

  /** field for SingleConnection */
  protected boolean localSingleConnection;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSingleConnectionTracker = false;

  public boolean isSingleConnectionSpecified() {
    return localSingleConnectionTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getSingleConnection() {
    return localSingleConnection;
  }

  /**
   * Auto generated setter method
   *
   * @param param SingleConnection
   */
  public void setSingleConnection(boolean param) {

    // setting primitive attribute tracker to true
    localSingleConnectionTracker = true;

    this.localSingleConnection = param;
  }

  /** field for DFUServerQueue */
  protected java.lang.String localDFUServerQueue;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUServerQueueTracker = false;

  public boolean isDFUServerQueueSpecified() {
    return localDFUServerQueueTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getDFUServerQueue() {
    return localDFUServerQueue;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUServerQueue
   */
  public void setDFUServerQueue(java.lang.String param) {
    localDFUServerQueueTracker = param != null;

    this.localDFUServerQueue = param;
  }

  /** field for Compress */
  protected boolean localCompress =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localCompressTracker = false;

  public boolean isCompressSpecified() {
    return localCompressTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getCompress() {
    return localCompress;
  }

  /**
   * Auto generated setter method
   *
   * @param param Compress
   */
  public void setCompress(boolean param) {

    // setting primitive attribute tracker to true
    localCompressTracker = true;

    this.localCompress = param;
  }

  /** field for Encrypt */
  protected java.lang.String localEncrypt;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localEncryptTracker = false;

  public boolean isEncryptSpecified() {
    return localEncryptTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getEncrypt() {
    return localEncrypt;
  }

  /**
   * Auto generated setter method
   *
   * @param param Encrypt
   */
  public void setEncrypt(java.lang.String param) {
    localEncryptTracker = param != null;

    this.localEncrypt = param;
  }

  /** field for Decrypt */
  protected java.lang.String localDecrypt;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDecryptTracker = false;

  public boolean isDecryptSpecified() {
    return localDecryptTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getDecrypt() {
    return localDecrypt;
  }

  /**
   * Auto generated setter method
   *
   * @param param Decrypt
   */
  public void setDecrypt(java.lang.String param) {
    localDecryptTracker = param != null;

    this.localDecrypt = param;
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

      java.lang.String namespacePrefix = registerPrefix(xmlWriter, "urn:hpccsystems:ws:filespray");
      if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            namespacePrefix + ":Despray",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "Despray", xmlWriter);
      }
    }
    if (localDestGroupTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "destGroup", xmlWriter);

      if (localDestGroup == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("destGroup cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localDestGroup);
      }

      xmlWriter.writeEndElement();
    }
    if (localSourceLogicalNameTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "sourceLogicalName", xmlWriter);

      if (localSourceLogicalName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("sourceLogicalName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSourceLogicalName);
      }

      xmlWriter.writeEndElement();
    }
    if (localDestIPTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "destIP", xmlWriter);

      if (localDestIP == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("destIP cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localDestIP);
      }

      xmlWriter.writeEndElement();
    }
    if (localDestPathTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "destPath", xmlWriter);

      if (localDestPath == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("destPath cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localDestPath);
      }

      xmlWriter.writeEndElement();
    }
    if (localDestPlaneTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "destPlane", xmlWriter);

      if (localDestPlane == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("destPlane cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localDestPlane);
      }

      xmlWriter.writeEndElement();
    }
    if (localDstxmlTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "dstxml", xmlWriter);

      if (localDstxml != null) {
        try {
          org.apache.axiom.util.stax.XMLStreamWriterUtils.writeBlob(
              xmlWriter,
              org.apache.axiom.util.activation.DataHandlerUtils.toBlob(localDstxml),
              null,
              true);
        } catch (java.io.IOException ex) {
          throw new javax.xml.stream.XMLStreamException(
              "Unable to read data handler for dstxml", ex);
        }
      } else {

      }

      xmlWriter.writeEndElement();
    }
    if (localOverwriteTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "overwrite", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("overwrite cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOverwrite));
      }

      xmlWriter.writeEndElement();
    }
    if (localMaxConnectionsTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "maxConnections", xmlWriter);

      if (localMaxConnections == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("maxConnections cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxConnections));
      }

      xmlWriter.writeEndElement();
    }
    if (localThrottleTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "throttle", xmlWriter);

      if (localThrottle == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("throttle cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localThrottle));
      }

      xmlWriter.writeEndElement();
    }
    if (localTransferBufferSizeTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "transferBufferSize", xmlWriter);

      if (localTransferBufferSize == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("transferBufferSize cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localTransferBufferSize));
      }

      xmlWriter.writeEndElement();
    }
    if (localSplitprefixTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "splitprefix", xmlWriter);

      if (localSplitprefix == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("splitprefix cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSplitprefix);
      }

      xmlWriter.writeEndElement();
    }
    if (localNorecoverTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "norecover", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("norecover cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNorecover));
      }

      xmlWriter.writeEndElement();
    }
    if (localWrapTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "wrap", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("wrap cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWrap));
      }

      xmlWriter.writeEndElement();
    }
    if (localMultiCopyTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "multiCopy", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("multiCopy cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMultiCopy));
      }

      xmlWriter.writeEndElement();
    }
    if (localSingleConnectionTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "SingleConnection", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("SingleConnection cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localSingleConnection));
      }

      xmlWriter.writeEndElement();
    }
    if (localDFUServerQueueTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "DFUServerQueue", xmlWriter);

      if (localDFUServerQueue == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("DFUServerQueue cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localDFUServerQueue);
      }

      xmlWriter.writeEndElement();
    }
    if (localCompressTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "compress", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("compress cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCompress));
      }

      xmlWriter.writeEndElement();
    }
    if (localEncryptTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "encrypt", xmlWriter);

      if (localEncrypt == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("encrypt cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localEncrypt);
      }

      xmlWriter.writeEndElement();
    }
    if (localDecryptTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "decrypt", xmlWriter);

      if (localDecrypt == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("decrypt cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localDecrypt);
      }

      xmlWriter.writeEndElement();
    }
    xmlWriter.writeEndElement();
  }

  private static java.lang.String generatePrefix(java.lang.String namespace) {
    if (namespace.equals("urn:hpccsystems:ws:filespray")) {
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
    public static Despray parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      Despray object = new Despray();

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

            if (!"Despray".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (Despray)
                  org.hpccsystems.ws.client.gen.axis2.filespray.latest.ExtensionMapper
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "destGroup")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "destGroup" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDestGroup(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "sourceLogicalName")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "sourceLogicalName" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSourceLogicalName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "destIP")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "destIP" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDestIP(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "destPath")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "destPath" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDestPath(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "destPlane")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "destPlane" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDestPlane(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "dstxml")
                    .equals(reader.getName())) {

              object.setDstxml(
                  org.apache.axiom.util.activation.DataHandlerUtils.toDataHandler(
                      org.apache.axiom.util.stax.XMLStreamReaderUtils.getBlobFromElement(reader)));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "overwrite")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "overwrite" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setOverwrite(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "maxConnections")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "maxConnections" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setMaxConnections(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "throttle")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "throttle" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setThrottle(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "transferBufferSize")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "transferBufferSize" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setTransferBufferSize(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "splitprefix")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "splitprefix" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSplitprefix(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "norecover")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "norecover" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setNorecover(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "wrap")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "wrap" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setWrap(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "multiCopy")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "multiCopy" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setMultiCopy(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "SingleConnection")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SingleConnection" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSingleConnection(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DFUServerQueue")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "DFUServerQueue" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDFUServerQueue(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "compress")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "compress" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setCompress(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "encrypt")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "encrypt" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setEncrypt(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "decrypt")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "decrypt" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDecrypt(
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

/**
 * ThorCluster.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wssmc.latest;

/** ThorCluster bean class */
@SuppressWarnings({"unchecked", "unused"})
public class ThorCluster implements org.apache.axis2.databinding.ADBBean {
  /* This type was generated from the piece of schema that had
  name = ThorCluster
  Namespace URI = urn:hpccsystems:ws:wssmc
  Namespace Prefix = ns9
  */

  /** field for ClusterName */
  protected java.lang.String localClusterName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localClusterNameTracker = false;

  public boolean isClusterNameSpecified() {
    return localClusterNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getClusterName() {
    return localClusterName;
  }

  /**
   * Auto generated setter method
   *
   * @param param ClusterName
   */
  public void setClusterName(java.lang.String param) {
    localClusterNameTracker = param != null;

    this.localClusterName = param;
  }

  /** field for QueueName */
  protected java.lang.String localQueueName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localQueueNameTracker = false;

  public boolean isQueueNameSpecified() {
    return localQueueNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getQueueName() {
    return localQueueName;
  }

  /**
   * Auto generated setter method
   *
   * @param param QueueName
   */
  public void setQueueName(java.lang.String param) {
    localQueueNameTracker = param != null;

    this.localQueueName = param;
  }

  /** field for QueueStatus */
  protected java.lang.String localQueueStatus;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localQueueStatusTracker = false;

  public boolean isQueueStatusSpecified() {
    return localQueueStatusTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getQueueStatus() {
    return localQueueStatus;
  }

  /**
   * Auto generated setter method
   *
   * @param param QueueStatus
   */
  public void setQueueStatus(java.lang.String param) {
    localQueueStatusTracker = param != null;

    this.localQueueStatus = param;
  }

  /** field for QueueAvailable */
  protected int localQueueAvailable;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localQueueAvailableTracker = false;

  public boolean isQueueAvailableSpecified() {
    return localQueueAvailableTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getQueueAvailable() {
    return localQueueAvailable;
  }

  /**
   * Auto generated setter method
   *
   * @param param QueueAvailable
   */
  public void setQueueAvailable(int param) {

    // setting primitive attribute tracker to true
    localQueueAvailableTracker = param != java.lang.Integer.MIN_VALUE;

    this.localQueueAvailable = param;
  }

  /** field for JobsRunning */
  protected int localJobsRunning;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localJobsRunningTracker = false;

  public boolean isJobsRunningSpecified() {
    return localJobsRunningTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getJobsRunning() {
    return localJobsRunning;
  }

  /**
   * Auto generated setter method
   *
   * @param param JobsRunning
   */
  public void setJobsRunning(int param) {

    // setting primitive attribute tracker to true
    localJobsRunningTracker = param != java.lang.Integer.MIN_VALUE;

    this.localJobsRunning = param;
  }

  /** field for JobsInQueue */
  protected int localJobsInQueue;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localJobsInQueueTracker = false;

  public boolean isJobsInQueueSpecified() {
    return localJobsInQueueTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getJobsInQueue() {
    return localJobsInQueue;
  }

  /**
   * Auto generated setter method
   *
   * @param param JobsInQueue
   */
  public void setJobsInQueue(int param) {

    // setting primitive attribute tracker to true
    localJobsInQueueTracker = param != java.lang.Integer.MIN_VALUE;

    this.localJobsInQueue = param;
  }

  /** field for QueueStatus2 */
  protected int localQueueStatus2;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localQueueStatus2Tracker = false;

  public boolean isQueueStatus2Specified() {
    return localQueueStatus2Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getQueueStatus2() {
    return localQueueStatus2;
  }

  /**
   * Auto generated setter method
   *
   * @param param QueueStatus2
   */
  public void setQueueStatus2(int param) {

    // setting primitive attribute tracker to true
    localQueueStatus2Tracker = param != java.lang.Integer.MIN_VALUE;

    this.localQueueStatus2 = param;
  }

  /** field for ThorLCR */
  protected java.lang.String localThorLCR;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localThorLCRTracker = false;

  public boolean isThorLCRSpecified() {
    return localThorLCRTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getThorLCR() {
    return localThorLCR;
  }

  /**
   * Auto generated setter method
   *
   * @param param ThorLCR
   */
  public void setThorLCR(java.lang.String param) {
    localThorLCRTracker = param != null;

    this.localThorLCR = param;
  }

  /** field for ClusterSize */
  protected int localClusterSize;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localClusterSizeTracker = false;

  public boolean isClusterSizeSpecified() {
    return localClusterSizeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getClusterSize() {
    return localClusterSize;
  }

  /**
   * Auto generated setter method
   *
   * @param param ClusterSize
   */
  public void setClusterSize(int param) {

    // setting primitive attribute tracker to true
    localClusterSizeTracker = param != java.lang.Integer.MIN_VALUE;

    this.localClusterSize = param;
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

      java.lang.String namespacePrefix = registerPrefix(xmlWriter, "urn:hpccsystems:ws:wssmc");
      if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            namespacePrefix + ":ThorCluster",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "ThorCluster", xmlWriter);
      }
    }
    if (localClusterNameTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "ClusterName", xmlWriter);

      if (localClusterName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ClusterName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localClusterName);
      }

      xmlWriter.writeEndElement();
    }
    if (localQueueNameTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "QueueName", xmlWriter);

      if (localQueueName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("QueueName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localQueueName);
      }

      xmlWriter.writeEndElement();
    }
    if (localQueueStatusTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "QueueStatus", xmlWriter);

      if (localQueueStatus == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("QueueStatus cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localQueueStatus);
      }

      xmlWriter.writeEndElement();
    }
    if (localQueueAvailableTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "QueueAvailable", xmlWriter);

      if (localQueueAvailable == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("QueueAvailable cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQueueAvailable));
      }

      xmlWriter.writeEndElement();
    }
    if (localJobsRunningTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "JobsRunning", xmlWriter);

      if (localJobsRunning == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("JobsRunning cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localJobsRunning));
      }

      xmlWriter.writeEndElement();
    }
    if (localJobsInQueueTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "JobsInQueue", xmlWriter);

      if (localJobsInQueue == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("JobsInQueue cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localJobsInQueue));
      }

      xmlWriter.writeEndElement();
    }
    if (localQueueStatus2Tracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "QueueStatus2", xmlWriter);

      if (localQueueStatus2 == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("QueueStatus2 cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localQueueStatus2));
      }

      xmlWriter.writeEndElement();
    }
    if (localThorLCRTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "ThorLCR", xmlWriter);

      if (localThorLCR == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ThorLCR cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localThorLCR);
      }

      xmlWriter.writeEndElement();
    }
    if (localClusterSizeTracker) {
      namespace = "urn:hpccsystems:ws:wssmc";
      writeStartElement(null, namespace, "ClusterSize", xmlWriter);

      if (localClusterSize == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("ClusterSize cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClusterSize));
      }

      xmlWriter.writeEndElement();
    }
    xmlWriter.writeEndElement();
  }

  private static java.lang.String generatePrefix(java.lang.String namespace) {
    if (namespace.equals("urn:hpccsystems:ws:wssmc")) {
      return "ns9";
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
    public static ThorCluster parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      ThorCluster object = new ThorCluster();

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

            if (!"ThorCluster".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (ThorCluster)
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ClusterName")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ClusterName" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setClusterName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "QueueName")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "QueueName" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setQueueName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "QueueStatus")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "QueueStatus" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setQueueStatus(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "QueueAvailable")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "QueueAvailable" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setQueueAvailable(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "JobsRunning")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "JobsRunning" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setJobsRunning(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "JobsInQueue")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "JobsInQueue" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setJobsInQueue(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "QueueStatus2")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "QueueStatus2" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setQueueStatus2(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ThorLCR")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ThorLCR" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setThorLCR(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssmc", "ClusterSize")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ClusterSize" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setClusterSize(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

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

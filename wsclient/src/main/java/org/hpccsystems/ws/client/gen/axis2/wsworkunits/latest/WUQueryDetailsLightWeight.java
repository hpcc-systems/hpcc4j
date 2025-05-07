/**
 * WUQueryDetailsLightWeight.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest;

/** WUQueryDetailsLightWeight bean class */
@SuppressWarnings({"unchecked", "unused"})
public class WUQueryDetailsLightWeight implements org.apache.axis2.databinding.ADBBean {

  public static final javax.xml.namespace.QName MY_QNAME =
      new javax.xml.namespace.QName(
          "urn:hpccsystems:ws:wsworkunits", "WUQueryDetailsLightWeight", "ns1");

  /** field for QueryId */
  protected java.lang.String localQueryId;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localQueryIdTracker = false;

  public boolean isQueryIdSpecified() {
    return localQueryIdTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getQueryId() {
    return localQueryId;
  }

  /**
   * Auto generated setter method
   *
   * @param param QueryId
   */
  public void setQueryId(java.lang.String param) {
    localQueryIdTracker = param != null;

    this.localQueryId = param;
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

  /** field for IncludeWUDetails */
  protected boolean localIncludeWUDetails =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIncludeWUDetailsTracker = false;

  public boolean isIncludeWUDetailsSpecified() {
    return localIncludeWUDetailsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getIncludeWUDetails() {
    return localIncludeWUDetails;
  }

  /**
   * Auto generated setter method
   *
   * @param param IncludeWUDetails
   */
  public void setIncludeWUDetails(boolean param) {

    // setting primitive attribute tracker to true
    localIncludeWUDetailsTracker = true;

    this.localIncludeWUDetails = param;
  }

  /** field for IncludeWUQueryFiles */
  protected boolean localIncludeWUQueryFiles =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIncludeWUQueryFilesTracker = false;

  public boolean isIncludeWUQueryFilesSpecified() {
    return localIncludeWUQueryFilesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getIncludeWUQueryFiles() {
    return localIncludeWUQueryFiles;
  }

  /**
   * Auto generated setter method
   *
   * @param param IncludeWUQueryFiles
   */
  public void setIncludeWUQueryFiles(boolean param) {

    // setting primitive attribute tracker to true
    localIncludeWUQueryFilesTracker = true;

    this.localIncludeWUQueryFiles = param;
  }

  /** field for IncludeSuperFiles */
  protected boolean localIncludeSuperFiles =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIncludeSuperFilesTracker = false;

  public boolean isIncludeSuperFilesSpecified() {
    return localIncludeSuperFilesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getIncludeSuperFiles() {
    return localIncludeSuperFiles;
  }

  /**
   * Auto generated setter method
   *
   * @param param IncludeSuperFiles
   */
  public void setIncludeSuperFiles(boolean param) {

    // setting primitive attribute tracker to true
    localIncludeSuperFilesTracker = true;

    this.localIncludeSuperFiles = param;
  }

  /** field for IncludeWsEclAddresses */
  protected boolean localIncludeWsEclAddresses =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIncludeWsEclAddressesTracker = false;

  public boolean isIncludeWsEclAddressesSpecified() {
    return localIncludeWsEclAddressesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getIncludeWsEclAddresses() {
    return localIncludeWsEclAddresses;
  }

  /**
   * Auto generated setter method
   *
   * @param param IncludeWsEclAddresses
   */
  public void setIncludeWsEclAddresses(boolean param) {

    // setting primitive attribute tracker to true
    localIncludeWsEclAddressesTracker = true;

    this.localIncludeWsEclAddresses = param;
  }

  /** field for IncludeStateOnClusters */
  protected boolean localIncludeStateOnClusters =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIncludeStateOnClustersTracker = false;

  public boolean isIncludeStateOnClustersSpecified() {
    return localIncludeStateOnClustersTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getIncludeStateOnClusters() {
    return localIncludeStateOnClusters;
  }

  /**
   * Auto generated setter method
   *
   * @param param IncludeStateOnClusters
   */
  public void setIncludeStateOnClusters(boolean param) {

    // setting primitive attribute tracker to true
    localIncludeStateOnClustersTracker = true;

    this.localIncludeStateOnClusters = param;
  }

  /** field for CheckAllNodes */
  protected boolean localCheckAllNodes =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localCheckAllNodesTracker = false;

  public boolean isCheckAllNodesSpecified() {
    return localCheckAllNodesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getCheckAllNodes() {
    return localCheckAllNodes;
  }

  /**
   * Auto generated setter method
   *
   * @param param CheckAllNodes
   */
  public void setCheckAllNodes(boolean param) {

    // setting primitive attribute tracker to true
    localCheckAllNodesTracker = true;

    this.localCheckAllNodes = param;
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
            namespacePrefix + ":WUQueryDetailsLightWeight",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            "WUQueryDetailsLightWeight",
            xmlWriter);
      }
    }
    if (localQueryIdTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "QueryId", xmlWriter);

      if (localQueryId == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("QueryId cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localQueryId);
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
    if (localIncludeWUDetailsTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "IncludeWUDetails", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("IncludeWUDetails cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localIncludeWUDetails));
      }

      xmlWriter.writeEndElement();
    }
    if (localIncludeWUQueryFilesTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "IncludeWUQueryFiles", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("IncludeWUQueryFiles cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localIncludeWUQueryFiles));
      }

      xmlWriter.writeEndElement();
    }
    if (localIncludeSuperFilesTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "IncludeSuperFiles", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("IncludeSuperFiles cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localIncludeSuperFiles));
      }

      xmlWriter.writeEndElement();
    }
    if (localIncludeWsEclAddressesTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "IncludeWsEclAddresses", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException(
            "IncludeWsEclAddresses cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localIncludeWsEclAddresses));
      }

      xmlWriter.writeEndElement();
    }
    if (localIncludeStateOnClustersTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "IncludeStateOnClusters", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException(
            "IncludeStateOnClusters cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localIncludeStateOnClusters));
      }

      xmlWriter.writeEndElement();
    }
    if (localCheckAllNodesTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "CheckAllNodes", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("CheckAllNodes cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCheckAllNodes));
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
    public static WUQueryDetailsLightWeight parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      WUQueryDetailsLightWeight object = new WUQueryDetailsLightWeight();

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

            if (!"WUQueryDetailsLightWeight".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (WUQueryDetailsLightWeight)
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QueryId")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "QueryId" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setQueryId(
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
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "IncludeWUDetails")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "IncludeWUDetails" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setIncludeWUDetails(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "IncludeWUQueryFiles")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "IncludeWUQueryFiles" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setIncludeWUQueryFiles(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "IncludeSuperFiles")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "IncludeSuperFiles" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setIncludeSuperFiles(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "IncludeWsEclAddresses")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "IncludeWsEclAddresses" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setIncludeWsEclAddresses(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "IncludeStateOnClusters")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "IncludeStateOnClusters" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setIncludeStateOnClusters(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "CheckAllNodes")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "CheckAllNodes" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setCheckAllNodes(
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

/**
 * DFUXRefUnusedFilesRequest.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 1.8.1 Built on : Jun 07,
 * 2022 (03:47:13 EDT)
 */
package org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest;

/** DFUXRefUnusedFilesRequest bean class */
@SuppressWarnings({"unchecked", "unused"})
public class DFUXRefUnusedFilesRequest implements org.apache.axis2.databinding.ADBBean {

  public static final javax.xml.namespace.QName MY_QNAME =
      new javax.xml.namespace.QName(
          "urn:hpccsystems:ws:wsdfuxref", "DFUXRefUnusedFilesRequest", "ns1");

  /** field for ProcessCluster */
  protected java.lang.String localProcessCluster;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localProcessClusterTracker = false;

  public boolean isProcessClusterSpecified() {
    return localProcessClusterTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getProcessCluster() {
    return localProcessCluster;
  }

  /**
   * Auto generated setter method
   *
   * @param param ProcessCluster
   */
  public void setProcessCluster(java.lang.String param) {
    localProcessClusterTracker = param != null;

    this.localProcessCluster = param;
  }

  /** field for CheckPackageMaps */
  protected boolean localCheckPackageMaps;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localCheckPackageMapsTracker = false;

  public boolean isCheckPackageMapsSpecified() {
    return localCheckPackageMapsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getCheckPackageMaps() {
    return localCheckPackageMaps;
  }

  /**
   * Auto generated setter method
   *
   * @param param CheckPackageMaps
   */
  public void setCheckPackageMaps(boolean param) {

    // setting primitive attribute tracker to true
    localCheckPackageMapsTracker = true;

    this.localCheckPackageMaps = param;
  }

  /** field for GetFileDetails */
  protected boolean localGetFileDetails =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localGetFileDetailsTracker = false;

  public boolean isGetFileDetailsSpecified() {
    return localGetFileDetailsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getGetFileDetails() {
    return localGetFileDetails;
  }

  /**
   * Auto generated setter method
   *
   * @param param GetFileDetails
   */
  public void setGetFileDetails(boolean param) {

    // setting primitive attribute tracker to true
    localGetFileDetailsTracker = true;

    this.localGetFileDetails = param;
  }

  /** field for ProcessClusterList */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspStringArray
      localProcessClusterList;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localProcessClusterListTracker = false;

  public boolean isProcessClusterListSpecified() {
    return localProcessClusterListTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspStringArray
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspStringArray
      getProcessClusterList() {
    return localProcessClusterList;
  }

  /**
   * Auto generated setter method
   *
   * @param param ProcessClusterList
   */
  public void setProcessClusterList(
      org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspStringArray param) {
    localProcessClusterListTracker = param != null;

    this.localProcessClusterList = param;
  }

  /** field for CheckPlanes */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspStringArray localCheckPlanes;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localCheckPlanesTracker = false;

  public boolean isCheckPlanesSpecified() {
    return localCheckPlanesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspStringArray
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspStringArray getCheckPlanes() {
    return localCheckPlanes;
  }

  /**
   * Auto generated setter method
   *
   * @param param CheckPlanes
   */
  public void setCheckPlanes(
      org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspStringArray param) {
    localCheckPlanesTracker = param != null;

    this.localCheckPlanes = param;
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

      java.lang.String namespacePrefix = registerPrefix(xmlWriter, "urn:hpccsystems:ws:wsdfuxref");
      if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            namespacePrefix + ":DFUXRefUnusedFilesRequest",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            "DFUXRefUnusedFilesRequest",
            xmlWriter);
      }
    }
    if (localProcessClusterTracker) {
      namespace = "urn:hpccsystems:ws:wsdfuxref";
      writeStartElement(null, namespace, "ProcessCluster", xmlWriter);

      if (localProcessCluster == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ProcessCluster cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localProcessCluster);
      }

      xmlWriter.writeEndElement();
    }
    if (localCheckPackageMapsTracker) {
      namespace = "urn:hpccsystems:ws:wsdfuxref";
      writeStartElement(null, namespace, "CheckPackageMaps", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("CheckPackageMaps cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localCheckPackageMaps));
      }

      xmlWriter.writeEndElement();
    }
    if (localGetFileDetailsTracker) {
      namespace = "urn:hpccsystems:ws:wsdfuxref";
      writeStartElement(null, namespace, "GetFileDetails", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("GetFileDetails cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGetFileDetails));
      }

      xmlWriter.writeEndElement();
    }
    if (localProcessClusterListTracker) {
      if (localProcessClusterList == null) {
        throw new org.apache.axis2.databinding.ADBException("ProcessClusterList cannot be null!!");
      }
      localProcessClusterList.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref", "ProcessClusterList"),
          xmlWriter);
    }
    if (localCheckPlanesTracker) {
      if (localCheckPlanes == null) {
        throw new org.apache.axis2.databinding.ADBException("CheckPlanes cannot be null!!");
      }
      localCheckPlanes.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref", "CheckPlanes"), xmlWriter);
    }
    xmlWriter.writeEndElement();
  }

  private static java.lang.String generatePrefix(java.lang.String namespace) {
    if (namespace.equals("urn:hpccsystems:ws:wsdfuxref")) {
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
    public static DFUXRefUnusedFilesRequest parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      DFUXRefUnusedFilesRequest object = new DFUXRefUnusedFilesRequest();

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

            if (!"DFUXRefUnusedFilesRequest".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (DFUXRefUnusedFilesRequest)
                  org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.ExtensionMapper
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref", "ProcessCluster")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ProcessCluster" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setProcessCluster(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref", "CheckPackageMaps")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "CheckPackageMaps" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setCheckPackageMaps(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref", "GetFileDetails")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "GetFileDetails" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setGetFileDetails(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfuxref", "ProcessClusterList")
                    .equals(reader.getName())) {

              object.setProcessClusterList(
                  org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspStringArray.Factory.parse(
                      reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref", "CheckPlanes")
                    .equals(reader.getName())) {

              object.setCheckPlanes(
                  org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspStringArray.Factory.parse(
                      reader));

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

/**
 * TpTargetCluster.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wstopology.latest;

/** TpTargetCluster bean class */
@SuppressWarnings({"unchecked", "unused"})
public class TpTargetCluster implements org.apache.axis2.databinding.ADBBean {
  /* This type was generated from the piece of schema that had
  name = TpTargetCluster
  Namespace URI = urn:hpccsystems:ws:wstopology
  Namespace Prefix = ns1
  */

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

  /** field for Prefix */
  protected java.lang.String localPrefix;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPrefixTracker = false;

  public boolean isPrefixSpecified() {
    return localPrefixTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getPrefix() {
    return localPrefix;
  }

  /**
   * Auto generated setter method
   *
   * @param param Prefix
   */
  public void setPrefix(java.lang.String param) {
    localPrefixTracker = param != null;

    this.localPrefix = param;
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

  /** field for TpClusters */
  protected org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpCluster localTpClusters;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTpClustersTracker = false;

  public boolean isTpClustersSpecified() {
    return localTpClustersTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpCluster
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpCluster getTpClusters() {
    return localTpClusters;
  }

  /**
   * Auto generated setter method
   *
   * @param param TpClusters
   */
  public void setTpClusters(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpCluster param) {
    localTpClustersTracker = param != null;

    this.localTpClusters = param;
  }

  /** field for TpEclCCServers */
  protected org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpEclServer
      localTpEclCCServers;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTpEclCCServersTracker = false;

  public boolean isTpEclCCServersSpecified() {
    return localTpEclCCServersTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpEclServer
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpEclServer
      getTpEclCCServers() {
    return localTpEclCCServers;
  }

  /**
   * Auto generated setter method
   *
   * @param param TpEclCCServers
   */
  public void setTpEclCCServers(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpEclServer param) {
    localTpEclCCServersTracker = param != null;

    this.localTpEclCCServers = param;
  }

  /** field for TpEclServers */
  protected org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpEclServer
      localTpEclServers;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTpEclServersTracker = false;

  public boolean isTpEclServersSpecified() {
    return localTpEclServersTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpEclServer
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpEclServer
      getTpEclServers() {
    return localTpEclServers;
  }

  /**
   * Auto generated setter method
   *
   * @param param TpEclServers
   */
  public void setTpEclServers(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpEclServer param) {
    localTpEclServersTracker = param != null;

    this.localTpEclServers = param;
  }

  /** field for TpEclAgents */
  protected org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpEclAgent
      localTpEclAgents;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTpEclAgentsTracker = false;

  public boolean isTpEclAgentsSpecified() {
    return localTpEclAgentsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpEclAgent
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpEclAgent getTpEclAgents() {
    return localTpEclAgents;
  }

  /**
   * Auto generated setter method
   *
   * @param param TpEclAgents
   */
  public void setTpEclAgents(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpEclAgent param) {
    localTpEclAgentsTracker = param != null;

    this.localTpEclAgents = param;
  }

  /** field for TpEclSchedulers */
  protected org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpEclScheduler
      localTpEclSchedulers;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTpEclSchedulersTracker = false;

  public boolean isTpEclSchedulersSpecified() {
    return localTpEclSchedulersTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpEclScheduler
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpEclScheduler
      getTpEclSchedulers() {
    return localTpEclSchedulers;
  }

  /**
   * Auto generated setter method
   *
   * @param param TpEclSchedulers
   */
  public void setTpEclSchedulers(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpEclScheduler param) {
    localTpEclSchedulersTracker = param != null;

    this.localTpEclSchedulers = param;
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

      java.lang.String namespacePrefix = registerPrefix(xmlWriter, "urn:hpccsystems:ws:wstopology");
      if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            namespacePrefix + ":TpTargetCluster",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            "TpTargetCluster",
            xmlWriter);
      }
    }
    if (localNameTracker) {
      namespace = "urn:hpccsystems:ws:wstopology";
      writeStartElement(null, namespace, "Name", xmlWriter);

      if (localName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localName);
      }

      xmlWriter.writeEndElement();
    }
    if (localPrefixTracker) {
      namespace = "urn:hpccsystems:ws:wstopology";
      writeStartElement(null, namespace, "Prefix", xmlWriter);

      if (localPrefix == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Prefix cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localPrefix);
      }

      xmlWriter.writeEndElement();
    }
    if (localTypeTracker) {
      namespace = "urn:hpccsystems:ws:wstopology";
      writeStartElement(null, namespace, "Type", xmlWriter);

      if (localType == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Type cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localType);
      }

      xmlWriter.writeEndElement();
    }
    if (localTpClustersTracker) {
      if (localTpClusters == null) {
        throw new org.apache.axis2.databinding.ADBException("TpClusters cannot be null!!");
      }
      localTpClusters.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpClusters"), xmlWriter);
    }
    if (localTpEclCCServersTracker) {
      if (localTpEclCCServers == null) {
        throw new org.apache.axis2.databinding.ADBException("TpEclCCServers cannot be null!!");
      }
      localTpEclCCServers.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpEclCCServers"),
          xmlWriter);
    }
    if (localTpEclServersTracker) {
      if (localTpEclServers == null) {
        throw new org.apache.axis2.databinding.ADBException("TpEclServers cannot be null!!");
      }
      localTpEclServers.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpEclServers"),
          xmlWriter);
    }
    if (localTpEclAgentsTracker) {
      if (localTpEclAgents == null) {
        throw new org.apache.axis2.databinding.ADBException("TpEclAgents cannot be null!!");
      }
      localTpEclAgents.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpEclAgents"), xmlWriter);
    }
    if (localTpEclSchedulersTracker) {
      if (localTpEclSchedulers == null) {
        throw new org.apache.axis2.databinding.ADBException("TpEclSchedulers cannot be null!!");
      }
      localTpEclSchedulers.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpEclSchedulers"),
          xmlWriter);
    }
    xmlWriter.writeEndElement();
  }

  private static java.lang.String generatePrefix(java.lang.String namespace) {
    if (namespace.equals("urn:hpccsystems:ws:wstopology")) {
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
    public static TpTargetCluster parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      TpTargetCluster object = new TpTargetCluster();

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

            if (!"TpTargetCluster".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (TpTargetCluster)
                  org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ExtensionMapper
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Name")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Prefix")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Prefix" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPrefix(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Type")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpClusters")
                    .equals(reader.getName())) {

              object.setTpClusters(
                  org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpCluster.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpEclCCServers")
                    .equals(reader.getName())) {

              object.setTpEclCCServers(
                  org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpEclServer.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpEclServers")
                    .equals(reader.getName())) {

              object.setTpEclServers(
                  org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpEclServer.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpEclAgents")
                    .equals(reader.getName())) {

              object.setTpEclAgents(
                  org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpEclAgent.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpEclSchedulers")
                    .equals(reader.getName())) {

              object.setTpEclSchedulers(
                  org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpEclScheduler
                      .Factory.parse(reader));

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

/**
 * WUScopeFilter.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest;

/** WUScopeFilter bean class */
@SuppressWarnings({"unchecked", "unused"})
public class WUScopeFilter implements org.apache.axis2.databinding.ADBBean {
  /* This type was generated from the piece of schema that had
  name = WUScopeFilter
  Namespace URI = urn:hpccsystems:ws:wsworkunits
  Namespace Prefix = ns13
  */

  /** field for MaxDepth */
  protected java.math.BigInteger localMaxDepth =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger("9999");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localMaxDepthTracker = false;

  public boolean isMaxDepthSpecified() {
    return localMaxDepthTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.math.BigInteger
   */
  public java.math.BigInteger getMaxDepth() {
    return localMaxDepth;
  }

  /**
   * Auto generated setter method
   *
   * @param param MaxDepth
   */
  public void setMaxDepth(java.math.BigInteger param) {
    localMaxDepthTracker = param != null;

    this.localMaxDepth = param;
  }

  /** field for Scopes */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Scopes_type0 localScopes;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localScopesTracker = false;

  public boolean isScopesSpecified() {
    return localScopesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Scopes_type0
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Scopes_type0 getScopes() {
    return localScopes;
  }

  /**
   * Auto generated setter method
   *
   * @param param Scopes
   */
  public void setScopes(org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Scopes_type0 param) {
    localScopesTracker = param != null;

    this.localScopes = param;
  }

  /** field for Ids */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Ids_type0 localIds;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIdsTracker = false;

  public boolean isIdsSpecified() {
    return localIdsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Ids_type0
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Ids_type0 getIds() {
    return localIds;
  }

  /**
   * Auto generated setter method
   *
   * @param param Ids
   */
  public void setIds(org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Ids_type0 param) {
    localIdsTracker = param != null;

    this.localIds = param;
  }

  /** field for ScopeTypes */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ScopeTypes_type0 localScopeTypes;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localScopeTypesTracker = false;

  public boolean isScopeTypesSpecified() {
    return localScopeTypesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ScopeTypes_type0
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ScopeTypes_type0 getScopeTypes() {
    return localScopeTypes;
  }

  /**
   * Auto generated setter method
   *
   * @param param ScopeTypes
   */
  public void setScopeTypes(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ScopeTypes_type0 param) {
    localScopeTypesTracker = param != null;

    this.localScopeTypes = param;
  }

  /** field for PropertyFilters */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.PropertyFilters_type0
      localPropertyFilters;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPropertyFiltersTracker = false;

  public boolean isPropertyFiltersSpecified() {
    return localPropertyFiltersTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.PropertyFilters_type0
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.PropertyFilters_type0
      getPropertyFilters() {
    return localPropertyFilters;
  }

  /**
   * Auto generated setter method
   *
   * @param param PropertyFilters
   */
  public void setPropertyFilters(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.PropertyFilters_type0 param) {
    localPropertyFiltersTracker = param != null;

    this.localPropertyFilters = param;
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
            namespacePrefix + ":WUScopeFilter",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "WUScopeFilter", xmlWriter);
      }
    }
    if (localMaxDepthTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "MaxDepth", xmlWriter);

      if (localMaxDepth == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("MaxDepth cannot be null!!");

      } else {

        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxDepth));
      }

      xmlWriter.writeEndElement();
    }
    if (localScopesTracker) {
      if (localScopes == null) {
        throw new org.apache.axis2.databinding.ADBException("Scopes cannot be null!!");
      }
      localScopes.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Scopes"), xmlWriter);
    }
    if (localIdsTracker) {
      if (localIds == null) {
        throw new org.apache.axis2.databinding.ADBException("Ids cannot be null!!");
      }
      localIds.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Ids"), xmlWriter);
    }
    if (localScopeTypesTracker) {
      if (localScopeTypes == null) {
        throw new org.apache.axis2.databinding.ADBException("ScopeTypes cannot be null!!");
      }
      localScopeTypes.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ScopeTypes"), xmlWriter);
    }
    if (localPropertyFiltersTracker) {
      if (localPropertyFilters == null) {
        throw new org.apache.axis2.databinding.ADBException("PropertyFilters cannot be null!!");
      }
      localPropertyFilters.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PropertyFilters"),
          xmlWriter);
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
    public static WUScopeFilter parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      WUScopeFilter object = new WUScopeFilter();

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

            if (!"WUScopeFilter".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (WUScopeFilter)
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "MaxDepth")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "MaxDepth" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setMaxDepth(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Scopes")
                    .equals(reader.getName())) {

              object.setScopes(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Scopes_type0.Factory.parse(
                      reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Ids")
                    .equals(reader.getName())) {

              object.setIds(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Ids_type0.Factory.parse(
                      reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ScopeTypes")
                    .equals(reader.getName())) {

              object.setScopeTypes(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ScopeTypes_type0.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "PropertyFilters")
                    .equals(reader.getName())) {

              object.setPropertyFilters(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.PropertyFilters_type0
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

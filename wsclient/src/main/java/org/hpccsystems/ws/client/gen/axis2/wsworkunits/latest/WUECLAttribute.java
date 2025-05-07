/**
 * WUECLAttribute.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest;

/** WUECLAttribute bean class */
@SuppressWarnings({"unchecked", "unused"})
public class WUECLAttribute implements org.apache.axis2.databinding.ADBBean {
  /* This type was generated from the piece of schema that had
  name = WUECLAttribute
  Namespace URI = urn:hpccsystems:ws:wsworkunits
  Namespace Prefix = ns1
  */

  /** field for ModuleName */
  protected java.lang.String localModuleName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localModuleNameTracker = false;

  public boolean isModuleNameSpecified() {
    return localModuleNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getModuleName() {
    return localModuleName;
  }

  /**
   * Auto generated setter method
   *
   * @param param ModuleName
   */
  public void setModuleName(java.lang.String param) {
    localModuleNameTracker = param != null;

    this.localModuleName = param;
  }

  /** field for AttributeName */
  protected java.lang.String localAttributeName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localAttributeNameTracker = false;

  public boolean isAttributeNameSpecified() {
    return localAttributeNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getAttributeName() {
    return localAttributeName;
  }

  /**
   * Auto generated setter method
   *
   * @param param AttributeName
   */
  public void setAttributeName(java.lang.String param) {
    localAttributeNameTracker = param != null;

    this.localAttributeName = param;
  }

  /** field for IsLocked */
  protected boolean localIsLocked;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIsLockedTracker = false;

  public boolean isIsLockedSpecified() {
    return localIsLockedTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getIsLocked() {
    return localIsLocked;
  }

  /**
   * Auto generated setter method
   *
   * @param param IsLocked
   */
  public void setIsLocked(boolean param) {

    // setting primitive attribute tracker to true
    localIsLockedTracker = true;

    this.localIsLocked = param;
  }

  /** field for IsCheckedOut */
  protected boolean localIsCheckedOut;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIsCheckedOutTracker = false;

  public boolean isIsCheckedOutSpecified() {
    return localIsCheckedOutTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getIsCheckedOut() {
    return localIsCheckedOut;
  }

  /**
   * Auto generated setter method
   *
   * @param param IsCheckedOut
   */
  public void setIsCheckedOut(boolean param) {

    // setting primitive attribute tracker to true
    localIsCheckedOutTracker = true;

    this.localIsCheckedOut = param;
  }

  /** field for IsSandbox */
  protected boolean localIsSandbox;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIsSandboxTracker = false;

  public boolean isIsSandboxSpecified() {
    return localIsSandboxTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getIsSandbox() {
    return localIsSandbox;
  }

  /**
   * Auto generated setter method
   *
   * @param param IsSandbox
   */
  public void setIsSandbox(boolean param) {

    // setting primitive attribute tracker to true
    localIsSandboxTracker = true;

    this.localIsSandbox = param;
  }

  /** field for IsOrphaned */
  protected boolean localIsOrphaned;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIsOrphanedTracker = false;

  public boolean isIsOrphanedSpecified() {
    return localIsOrphanedTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getIsOrphaned() {
    return localIsOrphaned;
  }

  /**
   * Auto generated setter method
   *
   * @param param IsOrphaned
   */
  public void setIsOrphaned(boolean param) {

    // setting primitive attribute tracker to true
    localIsOrphanedTracker = true;

    this.localIsOrphaned = param;
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
            namespacePrefix + ":WUECLAttribute",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            "WUECLAttribute",
            xmlWriter);
      }
    }
    if (localModuleNameTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "ModuleName", xmlWriter);

      if (localModuleName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ModuleName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localModuleName);
      }

      xmlWriter.writeEndElement();
    }
    if (localAttributeNameTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "AttributeName", xmlWriter);

      if (localAttributeName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("AttributeName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localAttributeName);
      }

      xmlWriter.writeEndElement();
    }
    if (localIsLockedTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "IsLocked", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("IsLocked cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsLocked));
      }

      xmlWriter.writeEndElement();
    }
    if (localIsCheckedOutTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "IsCheckedOut", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("IsCheckedOut cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsCheckedOut));
      }

      xmlWriter.writeEndElement();
    }
    if (localIsSandboxTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "IsSandbox", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("IsSandbox cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsSandbox));
      }

      xmlWriter.writeEndElement();
    }
    if (localIsOrphanedTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "IsOrphaned", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("IsOrphaned cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsOrphaned));
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
    public static WUECLAttribute parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      WUECLAttribute object = new WUECLAttribute();

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

            if (!"WUECLAttribute".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (WUECLAttribute)
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ModuleName")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ModuleName" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setModuleName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "AttributeName")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "AttributeName" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setAttributeName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IsLocked")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "IsLocked" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setIsLocked(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IsCheckedOut")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "IsCheckedOut" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setIsCheckedOut(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IsSandbox")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "IsSandbox" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setIsSandbox(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IsOrphaned")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "IsOrphaned" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setIsOrphaned(
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

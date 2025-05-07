/**
 * ArrayOfEspException.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest;

/** ArrayOfEspException bean class */
@SuppressWarnings({"unchecked", "unused"})
public class ArrayOfEspException implements org.apache.axis2.databinding.ADBBean {
  /* This type was generated from the piece of schema that had
  name = ArrayOfEspException
  Namespace URI = urn:hpccsystems:ws:wsdfuxref
  Namespace Prefix = ns1
  */

  /** field for Source */
  protected java.lang.String localSource;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSourceTracker = false;

  public boolean isSourceSpecified() {
    return localSourceTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getSource() {
    return localSource;
  }

  /**
   * Auto generated setter method
   *
   * @param param Source
   */
  public void setSource(java.lang.String param) {
    localSourceTracker = param != null;

    this.localSource = param;
  }

  /** field for Exception This was an Array! */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspException[] localException;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localExceptionTracker = false;

  public boolean isExceptionSpecified() {
    return localExceptionTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspException[]
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspException[] getException() {
    return localException;
  }

  /** validate the array for Exception */
  protected void validateException(
      org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspException[] param) {}

  /**
   * Auto generated setter method
   *
   * @param param Exception
   */
  public void setException(
      org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspException[] param) {

    validateException(param);

    localExceptionTracker = param != null;

    this.localException = param;
  }

  /**
   * Auto generated add method for the array for convenience
   *
   * @param param org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspException
   */
  public void addException(
      org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspException param) {
    if (localException == null) {
      localException = new org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspException[] {};
    }

    // update the setting tracker
    localExceptionTracker = true;

    java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localException);
    list.add(param);
    this.localException =
        (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspException[])
            list.toArray(
                new org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspException[list.size()]);
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

      java.lang.String namespacePrefix = registerPrefix(xmlWriter, "urn:hpccsystems:ws:wsdfuxref");
      if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            namespacePrefix + ":ArrayOfEspException",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            "ArrayOfEspException",
            xmlWriter);
      }
    }
    if (localSourceTracker) {
      namespace = "urn:hpccsystems:ws:wsdfuxref";
      writeStartElement(null, namespace, "Source", xmlWriter);

      if (localSource == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Source cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSource);
      }

      xmlWriter.writeEndElement();
    }
    if (localExceptionTracker) {
      if (localException != null) {
        for (int i = 0; i < localException.length; i++) {
          if (localException[i] != null) {
            localException[i].serialize(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref", "Exception"),
                xmlWriter);
          } else {

            // we don't have to do any thing since minOccures is zero

          }
        }
      } else {

        throw new org.apache.axis2.databinding.ADBException("Exception cannot be null!!");
      }
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
    public static ArrayOfEspException parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      ArrayOfEspException object = new ArrayOfEspException();

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

            if (!"ArrayOfEspException".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (ArrayOfEspException)
                  org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.ExtensionMapper
                      .getTypeObject(nsUri, type, reader);
            }
          }
        }

        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();

        reader.next();

        java.util.ArrayList list2 = new java.util.ArrayList();

        while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

        if (reader.isStartElement()
            && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref", "Source")
                .equals(reader.getName())) {

          nillableValue =
              reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
          if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
            throw new org.apache.axis2.databinding.ADBException(
                "The element: " + "Source" + "  cannot be null");
          }

          java.lang.String content = reader.getElementText();

          object.setSource(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

          reader.next();

        } // End of if for expected property start element
        else {

        }

        while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

        if (reader.isStartElement()
            && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref", "Exception")
                .equals(reader.getName())) {

          // Process the array and step past its final element's end.

          list2.add(
              org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspException.Factory.parse(
                  reader));

          // loop until we find a start element that is not part of this array
          boolean loopDone2 = false;
          while (!loopDone2) {
            // We should be at the end element, but make sure
            while (!reader.isEndElement()) reader.next();
            // Step out of this element
            reader.next();
            // Step to next element event.
            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
            if (reader.isEndElement()) {
              // two continuous end elements means we are exiting the xml structure
              loopDone2 = true;
            } else {
              if (new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref", "Exception")
                  .equals(reader.getName())) {
                list2.add(
                    org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspException.Factory.parse(
                        reader));

              } else {
                loopDone2 = true;
              }
            }
          }
          // call the converter utility  to convert and set the array

          object.setException(
              (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspException[])
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                      org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspException.class,
                      list2));

        } // End of if for expected property start element
        else {

        }

        while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

        if (reader.isStartElement())
          // 2 - A start element we are not expecting indicates a trailing invalid property

          throw new org.apache.axis2.databinding.ADBException(
              "Unexpected subelement " + reader.getName());

      } catch (javax.xml.stream.XMLStreamException e) {
        throw new java.lang.Exception(e);
      }

      return object;
    }
  } // end of factory class
}

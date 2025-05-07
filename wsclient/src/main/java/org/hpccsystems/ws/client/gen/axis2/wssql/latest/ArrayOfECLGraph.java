/**
 * ArrayOfECLGraph.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wssql.latest;

/** ArrayOfECLGraph bean class */
@SuppressWarnings({"unchecked", "unused"})
public class ArrayOfECLGraph implements org.apache.axis2.databinding.ADBBean {
  /* This type was generated from the piece of schema that had
  name = ArrayOfECLGraph
  Namespace URI = urn:hpccsystems:ws:wssql
  Namespace Prefix = ns1
  */

  /** field for ECLGraph This was an Array! */
  protected org.hpccsystems.ws.client.gen.axis2.wssql.latest.ECLGraph[] localECLGraph;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localECLGraphTracker = false;

  public boolean isECLGraphSpecified() {
    return localECLGraphTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wssql.latest.ECLGraph[]
   */
  public org.hpccsystems.ws.client.gen.axis2.wssql.latest.ECLGraph[] getECLGraph() {
    return localECLGraph;
  }

  /** validate the array for ECLGraph */
  protected void validateECLGraph(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.ECLGraph[] param) {}

  /**
   * Auto generated setter method
   *
   * @param param ECLGraph
   */
  public void setECLGraph(org.hpccsystems.ws.client.gen.axis2.wssql.latest.ECLGraph[] param) {

    validateECLGraph(param);

    localECLGraphTracker = param != null;

    this.localECLGraph = param;
  }

  /**
   * Auto generated add method for the array for convenience
   *
   * @param param org.hpccsystems.ws.client.gen.axis2.wssql.latest.ECLGraph
   */
  public void addECLGraph(org.hpccsystems.ws.client.gen.axis2.wssql.latest.ECLGraph param) {
    if (localECLGraph == null) {
      localECLGraph = new org.hpccsystems.ws.client.gen.axis2.wssql.latest.ECLGraph[] {};
    }

    // update the setting tracker
    localECLGraphTracker = true;

    java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localECLGraph);
    list.add(param);
    this.localECLGraph =
        (org.hpccsystems.ws.client.gen.axis2.wssql.latest.ECLGraph[])
            list.toArray(
                new org.hpccsystems.ws.client.gen.axis2.wssql.latest.ECLGraph[list.size()]);
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

      java.lang.String namespacePrefix = registerPrefix(xmlWriter, "urn:hpccsystems:ws:wssql");
      if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            namespacePrefix + ":ArrayOfECLGraph",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            "ArrayOfECLGraph",
            xmlWriter);
      }
    }
    if (localECLGraphTracker) {
      if (localECLGraph != null) {
        for (int i = 0; i < localECLGraph.length; i++) {
          if (localECLGraph[i] != null) {
            localECLGraph[i].serialize(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLGraph"), xmlWriter);
          } else {

            // we don't have to do any thing since minOccures is zero

          }
        }
      } else {

        throw new org.apache.axis2.databinding.ADBException("ECLGraph cannot be null!!");
      }
    }
    xmlWriter.writeEndElement();
  }

  private static java.lang.String generatePrefix(java.lang.String namespace) {
    if (namespace.equals("urn:hpccsystems:ws:wssql")) {
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
    public static ArrayOfECLGraph parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      ArrayOfECLGraph object = new ArrayOfECLGraph();

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

            if (!"ArrayOfECLGraph".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (ArrayOfECLGraph)
                  org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExtensionMapper.getTypeObject(
                      nsUri, type, reader);
            }
          }
        }

        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();

        reader.next();

        java.util.ArrayList list1 = new java.util.ArrayList();

        while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

        if (reader.isStartElement()
            && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLGraph")
                .equals(reader.getName())) {

          // Process the array and step past its final element's end.

          list1.add(
              org.hpccsystems.ws.client.gen.axis2.wssql.latest.ECLGraph.Factory.parse(reader));

          // loop until we find a start element that is not part of this array
          boolean loopDone1 = false;
          while (!loopDone1) {
            // We should be at the end element, but make sure
            while (!reader.isEndElement()) reader.next();
            // Step out of this element
            reader.next();
            // Step to next element event.
            while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
            if (reader.isEndElement()) {
              // two continuous end elements means we are exiting the xml structure
              loopDone1 = true;
            } else {
              if (new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECLGraph")
                  .equals(reader.getName())) {
                list1.add(
                    org.hpccsystems.ws.client.gen.axis2.wssql.latest.ECLGraph.Factory.parse(
                        reader));

              } else {
                loopDone1 = true;
              }
            }
          }
          // call the converter utility  to convert and set the array

          object.setECLGraph(
              (org.hpccsystems.ws.client.gen.axis2.wssql.latest.ECLGraph[])
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                      org.hpccsystems.ws.client.gen.axis2.wssql.latest.ECLGraph.class, list1));

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

/**
 * ProgressResponse.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.filespray.latest;

/** ProgressResponse bean class */
@SuppressWarnings({"unchecked", "unused"})
public class ProgressResponse implements org.apache.axis2.databinding.ADBBean {

  public static final javax.xml.namespace.QName MY_QNAME =
      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ProgressResponse", "ns1");

  /** field for Exceptions */
  protected org.hpccsystems.ws.client.gen.axis2.filespray.latest.ArrayOfEspException
      localExceptions;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localExceptionsTracker = false;

  public boolean isExceptionsSpecified() {
    return localExceptionsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.filespray.latest.ArrayOfEspException
   */
  public org.hpccsystems.ws.client.gen.axis2.filespray.latest.ArrayOfEspException getExceptions() {
    return localExceptions;
  }

  /**
   * Auto generated setter method
   *
   * @param param Exceptions
   */
  public void setExceptions(
      org.hpccsystems.ws.client.gen.axis2.filespray.latest.ArrayOfEspException param) {
    localExceptionsTracker = param != null;

    this.localExceptions = param;
  }

  /** field for Wuid */
  protected java.lang.String localWuid;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localWuidTracker = false;

  public boolean isWuidSpecified() {
    return localWuidTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getWuid() {
    return localWuid;
  }

  /**
   * Auto generated setter method
   *
   * @param param Wuid
   */
  public void setWuid(java.lang.String param) {
    localWuidTracker = param != null;

    this.localWuid = param;
  }

  /** field for PercentDone */
  protected int localPercentDone;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPercentDoneTracker = false;

  public boolean isPercentDoneSpecified() {
    return localPercentDoneTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getPercentDone() {
    return localPercentDone;
  }

  /**
   * Auto generated setter method
   *
   * @param param PercentDone
   */
  public void setPercentDone(int param) {

    // setting primitive attribute tracker to true
    localPercentDoneTracker = param != java.lang.Integer.MIN_VALUE;

    this.localPercentDone = param;
  }

  /** field for SecsLeft */
  protected int localSecsLeft;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSecsLeftTracker = false;

  public boolean isSecsLeftSpecified() {
    return localSecsLeftTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getSecsLeft() {
    return localSecsLeft;
  }

  /**
   * Auto generated setter method
   *
   * @param param SecsLeft
   */
  public void setSecsLeft(int param) {

    // setting primitive attribute tracker to true
    localSecsLeftTracker = param != java.lang.Integer.MIN_VALUE;

    this.localSecsLeft = param;
  }

  /** field for KbPerSecAve */
  protected int localKbPerSecAve;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localKbPerSecAveTracker = false;

  public boolean isKbPerSecAveSpecified() {
    return localKbPerSecAveTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getKbPerSecAve() {
    return localKbPerSecAve;
  }

  /**
   * Auto generated setter method
   *
   * @param param KbPerSecAve
   */
  public void setKbPerSecAve(int param) {

    // setting primitive attribute tracker to true
    localKbPerSecAveTracker = param != java.lang.Integer.MIN_VALUE;

    this.localKbPerSecAve = param;
  }

  /** field for KbPerSec */
  protected int localKbPerSec;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localKbPerSecTracker = false;

  public boolean isKbPerSecSpecified() {
    return localKbPerSecTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getKbPerSec() {
    return localKbPerSec;
  }

  /**
   * Auto generated setter method
   *
   * @param param KbPerSec
   */
  public void setKbPerSec(int param) {

    // setting primitive attribute tracker to true
    localKbPerSecTracker = param != java.lang.Integer.MIN_VALUE;

    this.localKbPerSec = param;
  }

  /** field for SlavesDone */
  protected int localSlavesDone;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSlavesDoneTracker = false;

  public boolean isSlavesDoneSpecified() {
    return localSlavesDoneTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getSlavesDone() {
    return localSlavesDone;
  }

  /**
   * Auto generated setter method
   *
   * @param param SlavesDone
   */
  public void setSlavesDone(int param) {

    // setting primitive attribute tracker to true
    localSlavesDoneTracker = param != java.lang.Integer.MIN_VALUE;

    this.localSlavesDone = param;
  }

  /** field for TimeTaken */
  protected java.lang.String localTimeTaken;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTimeTakenTracker = false;

  public boolean isTimeTakenSpecified() {
    return localTimeTakenTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getTimeTaken() {
    return localTimeTaken;
  }

  /**
   * Auto generated setter method
   *
   * @param param TimeTaken
   */
  public void setTimeTaken(java.lang.String param) {
    localTimeTakenTracker = param != null;

    this.localTimeTaken = param;
  }

  /** field for ProgressMessage */
  protected java.lang.String localProgressMessage;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localProgressMessageTracker = false;

  public boolean isProgressMessageSpecified() {
    return localProgressMessageTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getProgressMessage() {
    return localProgressMessage;
  }

  /**
   * Auto generated setter method
   *
   * @param param ProgressMessage
   */
  public void setProgressMessage(java.lang.String param) {
    localProgressMessageTracker = param != null;

    this.localProgressMessage = param;
  }

  /** field for SummaryMessage */
  protected java.lang.String localSummaryMessage;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSummaryMessageTracker = false;

  public boolean isSummaryMessageSpecified() {
    return localSummaryMessageTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getSummaryMessage() {
    return localSummaryMessage;
  }

  /**
   * Auto generated setter method
   *
   * @param param SummaryMessage
   */
  public void setSummaryMessage(java.lang.String param) {
    localSummaryMessageTracker = param != null;

    this.localSummaryMessage = param;
  }

  /** field for State */
  protected java.lang.String localState;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localStateTracker = false;

  public boolean isStateSpecified() {
    return localStateTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getState() {
    return localState;
  }

  /**
   * Auto generated setter method
   *
   * @param param State
   */
  public void setState(java.lang.String param) {
    localStateTracker = param != null;

    this.localState = param;
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
            namespacePrefix + ":ProgressResponse",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            "ProgressResponse",
            xmlWriter);
      }
    }
    if (localExceptionsTracker) {
      if (localExceptions == null) {
        throw new org.apache.axis2.databinding.ADBException("Exceptions cannot be null!!");
      }
      localExceptions.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Exceptions"), xmlWriter);
    }
    if (localWuidTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "wuid", xmlWriter);

      if (localWuid == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("wuid cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localWuid);
      }

      xmlWriter.writeEndElement();
    }
    if (localPercentDoneTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "PercentDone", xmlWriter);

      if (localPercentDone == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("PercentDone cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPercentDone));
      }

      xmlWriter.writeEndElement();
    }
    if (localSecsLeftTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "SecsLeft", xmlWriter);

      if (localSecsLeft == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("SecsLeft cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSecsLeft));
      }

      xmlWriter.writeEndElement();
    }
    if (localKbPerSecAveTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "KbPerSecAve", xmlWriter);

      if (localKbPerSecAve == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("KbPerSecAve cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKbPerSecAve));
      }

      xmlWriter.writeEndElement();
    }
    if (localKbPerSecTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "KbPerSec", xmlWriter);

      if (localKbPerSec == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("KbPerSec cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKbPerSec));
      }

      xmlWriter.writeEndElement();
    }
    if (localSlavesDoneTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "SlavesDone", xmlWriter);

      if (localSlavesDone == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("SlavesDone cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSlavesDone));
      }

      xmlWriter.writeEndElement();
    }
    if (localTimeTakenTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "TimeTaken", xmlWriter);

      if (localTimeTaken == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("TimeTaken cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localTimeTaken);
      }

      xmlWriter.writeEndElement();
    }
    if (localProgressMessageTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "ProgressMessage", xmlWriter);

      if (localProgressMessage == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ProgressMessage cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localProgressMessage);
      }

      xmlWriter.writeEndElement();
    }
    if (localSummaryMessageTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "SummaryMessage", xmlWriter);

      if (localSummaryMessage == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("SummaryMessage cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSummaryMessage);
      }

      xmlWriter.writeEndElement();
    }
    if (localStateTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "State", xmlWriter);

      if (localState == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("State cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localState);
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
    public static ProgressResponse parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      ProgressResponse object = new ProgressResponse();

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

            if (!"ProgressResponse".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (ProgressResponse)
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Exceptions")
                    .equals(reader.getName())) {

              object.setExceptions(
                  org.hpccsystems.ws.client.gen.axis2.filespray.latest.ArrayOfEspException.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "wuid")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "wuid" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setWuid(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "PercentDone")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "PercentDone" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPercentDone(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "SecsLeft")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SecsLeft" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSecsLeft(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "KbPerSecAve")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "KbPerSecAve" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setKbPerSecAve(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "KbPerSec")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "KbPerSec" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setKbPerSec(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "SlavesDone")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SlavesDone" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSlavesDone(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "TimeTaken")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "TimeTaken" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setTimeTaken(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ProgressMessage")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ProgressMessage" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setProgressMessage(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "SummaryMessage")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SummaryMessage" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSummaryMessage(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "State")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "State" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setState(
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

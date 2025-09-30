/**
 * GetDBSystemInfoResponse.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wssql.latest;

/** GetDBSystemInfoResponse bean class */
@SuppressWarnings({"unchecked", "unused"})
public class GetDBSystemInfoResponse implements org.apache.axis2.databinding.ADBBean {

  public static final javax.xml.namespace.QName MY_QNAME =
      new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "GetDBSystemInfoResponse", "ns10");

  /** field for Exceptions */
  protected org.hpccsystems.ws.client.gen.axis2.wssql.latest.ArrayOfEspException localExceptions;

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
   * @return org.hpccsystems.ws.client.gen.axis2.wssql.latest.ArrayOfEspException
   */
  public org.hpccsystems.ws.client.gen.axis2.wssql.latest.ArrayOfEspException getExceptions() {
    return localExceptions;
  }

  /**
   * Auto generated setter method
   *
   * @param param Exceptions
   */
  public void setExceptions(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.ArrayOfEspException param) {
    localExceptionsTracker = param != null;

    this.localExceptions = param;
  }

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

  /** field for FullVersion */
  protected java.lang.String localFullVersion;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localFullVersionTracker = false;

  public boolean isFullVersionSpecified() {
    return localFullVersionTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getFullVersion() {
    return localFullVersion;
  }

  /**
   * Auto generated setter method
   *
   * @param param FullVersion
   */
  public void setFullVersion(java.lang.String param) {
    localFullVersionTracker = param != null;

    this.localFullVersion = param;
  }

  /** field for Major */
  protected java.lang.String localMajor;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localMajorTracker = false;

  public boolean isMajorSpecified() {
    return localMajorTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getMajor() {
    return localMajor;
  }

  /**
   * Auto generated setter method
   *
   * @param param Major
   */
  public void setMajor(java.lang.String param) {
    localMajorTracker = param != null;

    this.localMajor = param;
  }

  /** field for Minor */
  protected java.lang.String localMinor;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localMinorTracker = false;

  public boolean isMinorSpecified() {
    return localMinorTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getMinor() {
    return localMinor;
  }

  /**
   * Auto generated setter method
   *
   * @param param Minor
   */
  public void setMinor(java.lang.String param) {
    localMinorTracker = param != null;

    this.localMinor = param;
  }

  /** field for Point */
  protected java.lang.String localPoint;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPointTracker = false;

  public boolean isPointSpecified() {
    return localPointTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getPoint() {
    return localPoint;
  }

  /**
   * Auto generated setter method
   *
   * @param param Point
   */
  public void setPoint(java.lang.String param) {
    localPointTracker = param != null;

    this.localPoint = param;
  }

  /** field for Project */
  protected java.lang.String localProject;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localProjectTracker = false;

  public boolean isProjectSpecified() {
    return localProjectTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getProject() {
    return localProject;
  }

  /**
   * Auto generated setter method
   *
   * @param param Project
   */
  public void setProject(java.lang.String param) {
    localProjectTracker = param != null;

    this.localProject = param;
  }

  /** field for Maturity */
  protected java.lang.String localMaturity;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localMaturityTracker = false;

  public boolean isMaturitySpecified() {
    return localMaturityTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getMaturity() {
    return localMaturity;
  }

  /**
   * Auto generated setter method
   *
   * @param param Maturity
   */
  public void setMaturity(java.lang.String param) {
    localMaturityTracker = param != null;

    this.localMaturity = param;
  }

  /** field for WsSQLFullVersion */
  protected java.lang.String localWsSQLFullVersion;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localWsSQLFullVersionTracker = false;

  public boolean isWsSQLFullVersionSpecified() {
    return localWsSQLFullVersionTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getWsSQLFullVersion() {
    return localWsSQLFullVersion;
  }

  /**
   * Auto generated setter method
   *
   * @param param WsSQLFullVersion
   */
  public void setWsSQLFullVersion(java.lang.String param) {
    localWsSQLFullVersionTracker = param != null;

    this.localWsSQLFullVersion = param;
  }

  /** field for WsSQLMajor */
  protected java.lang.String localWsSQLMajor;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localWsSQLMajorTracker = false;

  public boolean isWsSQLMajorSpecified() {
    return localWsSQLMajorTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getWsSQLMajor() {
    return localWsSQLMajor;
  }

  /**
   * Auto generated setter method
   *
   * @param param WsSQLMajor
   */
  public void setWsSQLMajor(java.lang.String param) {
    localWsSQLMajorTracker = param != null;

    this.localWsSQLMajor = param;
  }

  /** field for WsSQLMinor */
  protected java.lang.String localWsSQLMinor;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localWsSQLMinorTracker = false;

  public boolean isWsSQLMinorSpecified() {
    return localWsSQLMinorTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getWsSQLMinor() {
    return localWsSQLMinor;
  }

  /**
   * Auto generated setter method
   *
   * @param param WsSQLMinor
   */
  public void setWsSQLMinor(java.lang.String param) {
    localWsSQLMinorTracker = param != null;

    this.localWsSQLMinor = param;
  }

  /** field for WsSQLPoint */
  protected java.lang.String localWsSQLPoint;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localWsSQLPointTracker = false;

  public boolean isWsSQLPointSpecified() {
    return localWsSQLPointTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getWsSQLPoint() {
    return localWsSQLPoint;
  }

  /**
   * Auto generated setter method
   *
   * @param param WsSQLPoint
   */
  public void setWsSQLPoint(java.lang.String param) {
    localWsSQLPointTracker = param != null;

    this.localWsSQLPoint = param;
  }

  /** field for WsSQLProject */
  protected java.lang.String localWsSQLProject;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localWsSQLProjectTracker = false;

  public boolean isWsSQLProjectSpecified() {
    return localWsSQLProjectTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getWsSQLProject() {
    return localWsSQLProject;
  }

  /**
   * Auto generated setter method
   *
   * @param param WsSQLProject
   */
  public void setWsSQLProject(java.lang.String param) {
    localWsSQLProjectTracker = param != null;

    this.localWsSQLProject = param;
  }

  /** field for WsSQLMaturity */
  protected java.lang.String localWsSQLMaturity;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localWsSQLMaturityTracker = false;

  public boolean isWsSQLMaturitySpecified() {
    return localWsSQLMaturityTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getWsSQLMaturity() {
    return localWsSQLMaturity;
  }

  /**
   * Auto generated setter method
   *
   * @param param WsSQLMaturity
   */
  public void setWsSQLMaturity(java.lang.String param) {
    localWsSQLMaturityTracker = param != null;

    this.localWsSQLMaturity = param;
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

      java.lang.String namespacePrefix = registerPrefix(xmlWriter, "urn:hpccsystems:ws:wssql");
      if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            namespacePrefix + ":GetDBSystemInfoResponse",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            "GetDBSystemInfoResponse",
            xmlWriter);
      }
    }
    if (localExceptionsTracker) {
      if (localExceptions == null) {
        throw new org.apache.axis2.databinding.ADBException("Exceptions cannot be null!!");
      }
      localExceptions.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"), xmlWriter);
    }
    if (localNameTracker) {
      namespace = "urn:hpccsystems:ws:wssql";
      writeStartElement(null, namespace, "Name", xmlWriter);

      if (localName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localName);
      }

      xmlWriter.writeEndElement();
    }
    if (localFullVersionTracker) {
      namespace = "urn:hpccsystems:ws:wssql";
      writeStartElement(null, namespace, "FullVersion", xmlWriter);

      if (localFullVersion == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("FullVersion cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localFullVersion);
      }

      xmlWriter.writeEndElement();
    }
    if (localMajorTracker) {
      namespace = "urn:hpccsystems:ws:wssql";
      writeStartElement(null, namespace, "Major", xmlWriter);

      if (localMajor == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Major cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localMajor);
      }

      xmlWriter.writeEndElement();
    }
    if (localMinorTracker) {
      namespace = "urn:hpccsystems:ws:wssql";
      writeStartElement(null, namespace, "Minor", xmlWriter);

      if (localMinor == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Minor cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localMinor);
      }

      xmlWriter.writeEndElement();
    }
    if (localPointTracker) {
      namespace = "urn:hpccsystems:ws:wssql";
      writeStartElement(null, namespace, "Point", xmlWriter);

      if (localPoint == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Point cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localPoint);
      }

      xmlWriter.writeEndElement();
    }
    if (localProjectTracker) {
      namespace = "urn:hpccsystems:ws:wssql";
      writeStartElement(null, namespace, "Project", xmlWriter);

      if (localProject == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Project cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localProject);
      }

      xmlWriter.writeEndElement();
    }
    if (localMaturityTracker) {
      namespace = "urn:hpccsystems:ws:wssql";
      writeStartElement(null, namespace, "Maturity", xmlWriter);

      if (localMaturity == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Maturity cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localMaturity);
      }

      xmlWriter.writeEndElement();
    }
    if (localWsSQLFullVersionTracker) {
      namespace = "urn:hpccsystems:ws:wssql";
      writeStartElement(null, namespace, "WsSQLFullVersion", xmlWriter);

      if (localWsSQLFullVersion == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("WsSQLFullVersion cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localWsSQLFullVersion);
      }

      xmlWriter.writeEndElement();
    }
    if (localWsSQLMajorTracker) {
      namespace = "urn:hpccsystems:ws:wssql";
      writeStartElement(null, namespace, "WsSQLMajor", xmlWriter);

      if (localWsSQLMajor == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("WsSQLMajor cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localWsSQLMajor);
      }

      xmlWriter.writeEndElement();
    }
    if (localWsSQLMinorTracker) {
      namespace = "urn:hpccsystems:ws:wssql";
      writeStartElement(null, namespace, "WsSQLMinor", xmlWriter);

      if (localWsSQLMinor == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("WsSQLMinor cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localWsSQLMinor);
      }

      xmlWriter.writeEndElement();
    }
    if (localWsSQLPointTracker) {
      namespace = "urn:hpccsystems:ws:wssql";
      writeStartElement(null, namespace, "WsSQLPoint", xmlWriter);

      if (localWsSQLPoint == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("WsSQLPoint cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localWsSQLPoint);
      }

      xmlWriter.writeEndElement();
    }
    if (localWsSQLProjectTracker) {
      namespace = "urn:hpccsystems:ws:wssql";
      writeStartElement(null, namespace, "WsSQLProject", xmlWriter);

      if (localWsSQLProject == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("WsSQLProject cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localWsSQLProject);
      }

      xmlWriter.writeEndElement();
    }
    if (localWsSQLMaturityTracker) {
      namespace = "urn:hpccsystems:ws:wssql";
      writeStartElement(null, namespace, "WsSQLMaturity", xmlWriter);

      if (localWsSQLMaturity == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("WsSQLMaturity cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localWsSQLMaturity);
      }

      xmlWriter.writeEndElement();
    }
    xmlWriter.writeEndElement();
  }

  private static java.lang.String generatePrefix(java.lang.String namespace) {
    if (namespace.equals("urn:hpccsystems:ws:wssql")) {
      return "ns10";
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
    public static GetDBSystemInfoResponse parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      GetDBSystemInfoResponse object = new GetDBSystemInfoResponse();

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

            if (!"GetDBSystemInfoResponse".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (GetDBSystemInfoResponse)
                  org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExtensionMapper.getTypeObject(
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions")
                    .equals(reader.getName())) {

              object.setExceptions(
                  org.hpccsystems.ws.client.gen.axis2.wssql.latest.ArrayOfEspException.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Name")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "FullVersion")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "FullVersion" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setFullVersion(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Major")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Major" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setMajor(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Minor")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Minor" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setMinor(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Point")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Point" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPoint(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Project")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Project" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setProject(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Maturity")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Maturity" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setMaturity(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "WsSQLFullVersion")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "WsSQLFullVersion" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setWsSQLFullVersion(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "WsSQLMajor")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "WsSQLMajor" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setWsSQLMajor(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "WsSQLMinor")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "WsSQLMinor" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setWsSQLMinor(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "WsSQLPoint")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "WsSQLPoint" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setWsSQLPoint(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "WsSQLProject")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "WsSQLProject" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setWsSQLProject(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "WsSQLMaturity")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "WsSQLMaturity" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setWsSQLMaturity(
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

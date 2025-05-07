/**
 * HPCCTable.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wssql.latest;

/** HPCCTable bean class */
@SuppressWarnings({"unchecked", "unused"})
public class HPCCTable implements org.apache.axis2.databinding.ADBBean {
  /* This type was generated from the piece of schema that had
  name = HPCCTable
  Namespace URI = urn:hpccsystems:ws:wssql
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

  /** field for Columns */
  protected org.hpccsystems.ws.client.gen.axis2.wssql.latest.Columns_type1 localColumns;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localColumnsTracker = false;

  public boolean isColumnsSpecified() {
    return localColumnsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wssql.latest.Columns_type1
   */
  public org.hpccsystems.ws.client.gen.axis2.wssql.latest.Columns_type1 getColumns() {
    return localColumns;
  }

  /**
   * Auto generated setter method
   *
   * @param param Columns
   */
  public void setColumns(org.hpccsystems.ws.client.gen.axis2.wssql.latest.Columns_type1 param) {
    localColumnsTracker = param != null;

    this.localColumns = param;
  }

  /** field for ECL */
  protected java.lang.String localECL;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localECLTracker = false;

  public boolean isECLSpecified() {
    return localECLTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getECL() {
    return localECL;
  }

  /**
   * Auto generated setter method
   *
   * @param param ECL
   */
  public void setECL(java.lang.String param) {
    localECLTracker = param != null;

    this.localECL = param;
  }

  /** field for Format */
  protected java.lang.String localFormat;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localFormatTracker = false;

  public boolean isFormatSpecified() {
    return localFormatTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getFormat() {
    return localFormat;
  }

  /**
   * Auto generated setter method
   *
   * @param param Format
   */
  public void setFormat(java.lang.String param) {
    localFormatTracker = param != null;

    this.localFormat = param;
  }

  /** field for ContentType */
  protected java.lang.String localContentType;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localContentTypeTracker = false;

  public boolean isContentTypeSpecified() {
    return localContentTypeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getContentType() {
    return localContentType;
  }

  /**
   * Auto generated setter method
   *
   * @param param ContentType
   */
  public void setContentType(java.lang.String param) {
    localContentTypeTracker = param != null;

    this.localContentType = param;
  }

  /** field for Description */
  protected java.lang.String localDescription;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDescriptionTracker = false;

  public boolean isDescriptionSpecified() {
    return localDescriptionTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getDescription() {
    return localDescription;
  }

  /**
   * Auto generated setter method
   *
   * @param param Description
   */
  public void setDescription(java.lang.String param) {
    localDescriptionTracker = param != null;

    this.localDescription = param;
  }

  /** field for IsKeyed */
  protected boolean localIsKeyed;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIsKeyedTracker = false;

  public boolean isIsKeyedSpecified() {
    return localIsKeyedTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getIsKeyed() {
    return localIsKeyed;
  }

  /**
   * Auto generated setter method
   *
   * @param param IsKeyed
   */
  public void setIsKeyed(boolean param) {

    // setting primitive attribute tracker to true
    localIsKeyedTracker = true;

    this.localIsKeyed = param;
  }

  /** field for IsSuper */
  protected boolean localIsSuper;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIsSuperTracker = false;

  public boolean isIsSuperSpecified() {
    return localIsSuperTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getIsSuper() {
    return localIsSuper;
  }

  /**
   * Auto generated setter method
   *
   * @param param IsSuper
   */
  public void setIsSuper(boolean param) {

    // setting primitive attribute tracker to true
    localIsSuperTracker = true;

    this.localIsSuper = param;
  }

  /** field for CsvQuote */
  protected java.lang.String localCsvQuote;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localCsvQuoteTracker = false;

  public boolean isCsvQuoteSpecified() {
    return localCsvQuoteTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getCsvQuote() {
    return localCsvQuote;
  }

  /**
   * Auto generated setter method
   *
   * @param param CsvQuote
   */
  public void setCsvQuote(java.lang.String param) {
    localCsvQuoteTracker = param != null;

    this.localCsvQuote = param;
  }

  /** field for CsvSeparate */
  protected java.lang.String localCsvSeparate;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localCsvSeparateTracker = false;

  public boolean isCsvSeparateSpecified() {
    return localCsvSeparateTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getCsvSeparate() {
    return localCsvSeparate;
  }

  /**
   * Auto generated setter method
   *
   * @param param CsvSeparate
   */
  public void setCsvSeparate(java.lang.String param) {
    localCsvSeparateTracker = param != null;

    this.localCsvSeparate = param;
  }

  /** field for CsvTerminate */
  protected java.lang.String localCsvTerminate;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localCsvTerminateTracker = false;

  public boolean isCsvTerminateSpecified() {
    return localCsvTerminateTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getCsvTerminate() {
    return localCsvTerminate;
  }

  /**
   * Auto generated setter method
   *
   * @param param CsvTerminate
   */
  public void setCsvTerminate(java.lang.String param) {
    localCsvTerminateTracker = param != null;

    this.localCsvTerminate = param;
  }

  /** field for Group */
  protected java.lang.String localGroup;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localGroupTracker = false;

  public boolean isGroupSpecified() {
    return localGroupTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getGroup() {
    return localGroup;
  }

  /**
   * Auto generated setter method
   *
   * @param param Group
   */
  public void setGroup(java.lang.String param) {
    localGroupTracker = param != null;

    this.localGroup = param;
  }

  /** field for MaxRecordSize */
  protected java.math.BigInteger localMaxRecordSize;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localMaxRecordSizeTracker = false;

  public boolean isMaxRecordSizeSpecified() {
    return localMaxRecordSizeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.math.BigInteger
   */
  public java.math.BigInteger getMaxRecordSize() {
    return localMaxRecordSize;
  }

  /**
   * Auto generated setter method
   *
   * @param param MaxRecordSize
   */
  public void setMaxRecordSize(java.math.BigInteger param) {
    localMaxRecordSizeTracker = param != null;

    this.localMaxRecordSize = param;
  }

  /** field for Modified */
  protected java.lang.String localModified;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localModifiedTracker = false;

  public boolean isModifiedSpecified() {
    return localModifiedTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getModified() {
    return localModified;
  }

  /**
   * Auto generated setter method
   *
   * @param param Modified
   */
  public void setModified(java.lang.String param) {
    localModifiedTracker = param != null;

    this.localModified = param;
  }

  /** field for NumParts */
  protected java.math.BigInteger localNumParts;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localNumPartsTracker = false;

  public boolean isNumPartsSpecified() {
    return localNumPartsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.math.BigInteger
   */
  public java.math.BigInteger getNumParts() {
    return localNumParts;
  }

  /**
   * Auto generated setter method
   *
   * @param param NumParts
   */
  public void setNumParts(java.math.BigInteger param) {
    localNumPartsTracker = param != null;

    this.localNumParts = param;
  }

  /** field for Owner */
  protected java.lang.String localOwner;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localOwnerTracker = false;

  public boolean isOwnerSpecified() {
    return localOwnerTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getOwner() {
    return localOwner;
  }

  /**
   * Auto generated setter method
   *
   * @param param Owner
   */
  public void setOwner(java.lang.String param) {
    localOwnerTracker = param != null;

    this.localOwner = param;
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
            namespacePrefix + ":HPCCTable",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "HPCCTable", xmlWriter);
      }
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
    if (localColumnsTracker) {
      if (localColumns == null) {
        throw new org.apache.axis2.databinding.ADBException("Columns cannot be null!!");
      }
      localColumns.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Columns"), xmlWriter);
    }
    if (localECLTracker) {
      namespace = "urn:hpccsystems:ws:wssql";
      writeStartElement(null, namespace, "ECL", xmlWriter);

      if (localECL == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ECL cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localECL);
      }

      xmlWriter.writeEndElement();
    }
    if (localFormatTracker) {
      namespace = "urn:hpccsystems:ws:wssql";
      writeStartElement(null, namespace, "Format", xmlWriter);

      if (localFormat == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Format cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localFormat);
      }

      xmlWriter.writeEndElement();
    }
    if (localContentTypeTracker) {
      namespace = "urn:hpccsystems:ws:wssql";
      writeStartElement(null, namespace, "ContentType", xmlWriter);

      if (localContentType == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ContentType cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localContentType);
      }

      xmlWriter.writeEndElement();
    }
    if (localDescriptionTracker) {
      namespace = "urn:hpccsystems:ws:wssql";
      writeStartElement(null, namespace, "Description", xmlWriter);

      if (localDescription == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Description cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localDescription);
      }

      xmlWriter.writeEndElement();
    }
    if (localIsKeyedTracker) {
      namespace = "urn:hpccsystems:ws:wssql";
      writeStartElement(null, namespace, "IsKeyed", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("IsKeyed cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsKeyed));
      }

      xmlWriter.writeEndElement();
    }
    if (localIsSuperTracker) {
      namespace = "urn:hpccsystems:ws:wssql";
      writeStartElement(null, namespace, "IsSuper", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("IsSuper cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsSuper));
      }

      xmlWriter.writeEndElement();
    }
    if (localCsvQuoteTracker) {
      namespace = "urn:hpccsystems:ws:wssql";
      writeStartElement(null, namespace, "CsvQuote", xmlWriter);

      if (localCsvQuote == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("CsvQuote cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localCsvQuote);
      }

      xmlWriter.writeEndElement();
    }
    if (localCsvSeparateTracker) {
      namespace = "urn:hpccsystems:ws:wssql";
      writeStartElement(null, namespace, "CsvSeparate", xmlWriter);

      if (localCsvSeparate == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("CsvSeparate cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localCsvSeparate);
      }

      xmlWriter.writeEndElement();
    }
    if (localCsvTerminateTracker) {
      namespace = "urn:hpccsystems:ws:wssql";
      writeStartElement(null, namespace, "CsvTerminate", xmlWriter);

      if (localCsvTerminate == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("CsvTerminate cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localCsvTerminate);
      }

      xmlWriter.writeEndElement();
    }
    if (localGroupTracker) {
      namespace = "urn:hpccsystems:ws:wssql";
      writeStartElement(null, namespace, "Group", xmlWriter);

      if (localGroup == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Group cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localGroup);
      }

      xmlWriter.writeEndElement();
    }
    if (localMaxRecordSizeTracker) {
      namespace = "urn:hpccsystems:ws:wssql";
      writeStartElement(null, namespace, "MaxRecordSize", xmlWriter);

      if (localMaxRecordSize == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("MaxRecordSize cannot be null!!");

      } else {

        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxRecordSize));
      }

      xmlWriter.writeEndElement();
    }
    if (localModifiedTracker) {
      namespace = "urn:hpccsystems:ws:wssql";
      writeStartElement(null, namespace, "Modified", xmlWriter);

      if (localModified == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Modified cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localModified);
      }

      xmlWriter.writeEndElement();
    }
    if (localNumPartsTracker) {
      namespace = "urn:hpccsystems:ws:wssql";
      writeStartElement(null, namespace, "NumParts", xmlWriter);

      if (localNumParts == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("NumParts cannot be null!!");

      } else {

        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumParts));
      }

      xmlWriter.writeEndElement();
    }
    if (localOwnerTracker) {
      namespace = "urn:hpccsystems:ws:wssql";
      writeStartElement(null, namespace, "Owner", xmlWriter);

      if (localOwner == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Owner cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localOwner);
      }

      xmlWriter.writeEndElement();
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
    public static HPCCTable parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      HPCCTable object = new HPCCTable();

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

            if (!"HPCCTable".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (HPCCTable)
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Columns")
                    .equals(reader.getName())) {

              object.setColumns(
                  org.hpccsystems.ws.client.gen.axis2.wssql.latest.Columns_type1.Factory.parse(
                      reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ECL")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ECL" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setECL(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Format")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Format" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setFormat(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ContentType")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ContentType" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setContentType(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Description")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Description" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDescription(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "IsKeyed")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "IsKeyed" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setIsKeyed(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "IsSuper")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "IsSuper" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setIsSuper(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "CsvQuote")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "CsvQuote" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setCsvQuote(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "CsvSeparate")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "CsvSeparate" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setCsvSeparate(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "CsvTerminate")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "CsvTerminate" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setCsvTerminate(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Group")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Group" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setGroup(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "MaxRecordSize")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "MaxRecordSize" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setMaxRecordSize(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Modified")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Modified" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setModified(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "NumParts")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "NumParts" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setNumParts(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInteger(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Owner")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Owner" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setOwner(
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

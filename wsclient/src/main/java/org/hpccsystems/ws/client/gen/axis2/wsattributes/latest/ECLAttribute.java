/**
 * ECLAttribute.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsattributes.latest;

/** ECLAttribute bean class */
@SuppressWarnings({"unchecked", "unused"})
public class ECLAttribute implements org.apache.axis2.databinding.ADBBean {
  /* This type was generated from the piece of schema that had
  name = ECLAttribute
  Namespace URI = urn:hpccsystems:ws:wsattributes
  Namespace Prefix = ns2
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

  /** field for Version */
  protected int localVersion;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localVersionTracker = false;

  public boolean isVersionSpecified() {
    return localVersionTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getVersion() {
    return localVersion;
  }

  /**
   * Auto generated setter method
   *
   * @param param Version
   */
  public void setVersion(int param) {

    // setting primitive attribute tracker to true
    localVersionTracker = param != java.lang.Integer.MIN_VALUE;

    this.localVersion = param;
  }

  /** field for LatestVersion */
  protected int localLatestVersion;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localLatestVersionTracker = false;

  public boolean isLatestVersionSpecified() {
    return localLatestVersionTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getLatestVersion() {
    return localLatestVersion;
  }

  /**
   * Auto generated setter method
   *
   * @param param LatestVersion
   */
  public void setLatestVersion(int param) {

    // setting primitive attribute tracker to true
    localLatestVersionTracker = param != java.lang.Integer.MIN_VALUE;

    this.localLatestVersion = param;
  }

  /** field for SandboxVersion */
  protected int localSandboxVersion;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSandboxVersionTracker = false;

  public boolean isSandboxVersionSpecified() {
    return localSandboxVersionTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getSandboxVersion() {
    return localSandboxVersion;
  }

  /**
   * Auto generated setter method
   *
   * @param param SandboxVersion
   */
  public void setSandboxVersion(int param) {

    // setting primitive attribute tracker to true
    localSandboxVersionTracker = param != java.lang.Integer.MIN_VALUE;

    this.localSandboxVersion = param;
  }

  /** field for Flags */
  protected int localFlags;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localFlagsTracker = false;

  public boolean isFlagsSpecified() {
    return localFlagsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getFlags() {
    return localFlags;
  }

  /**
   * Auto generated setter method
   *
   * @param param Flags
   */
  public void setFlags(int param) {

    // setting primitive attribute tracker to true
    localFlagsTracker = param != java.lang.Integer.MIN_VALUE;

    this.localFlags = param;
  }

  /** field for Access */
  protected int localAccess;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localAccessTracker = false;

  public boolean isAccessSpecified() {
    return localAccessTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getAccess() {
    return localAccess;
  }

  /**
   * Auto generated setter method
   *
   * @param param Access
   */
  public void setAccess(int param) {

    // setting primitive attribute tracker to true
    localAccessTracker = param != java.lang.Integer.MIN_VALUE;

    this.localAccess = param;
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

  /** field for ResultType */
  protected int localResultType;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localResultTypeTracker = false;

  public boolean isResultTypeSpecified() {
    return localResultTypeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getResultType() {
    return localResultType;
  }

  /**
   * Auto generated setter method
   *
   * @param param ResultType
   */
  public void setResultType(int param) {

    // setting primitive attribute tracker to true
    localResultTypeTracker = param != java.lang.Integer.MIN_VALUE;

    this.localResultType = param;
  }

  /** field for LockedBy */
  protected java.lang.String localLockedBy;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localLockedByTracker = false;

  public boolean isLockedBySpecified() {
    return localLockedByTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getLockedBy() {
    return localLockedBy;
  }

  /**
   * Auto generated setter method
   *
   * @param param LockedBy
   */
  public void setLockedBy(java.lang.String param) {
    localLockedByTracker = param != null;

    this.localLockedBy = param;
  }

  /** field for ModifiedBy */
  protected java.lang.String localModifiedBy;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localModifiedByTracker = false;

  public boolean isModifiedBySpecified() {
    return localModifiedByTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getModifiedBy() {
    return localModifiedBy;
  }

  /**
   * Auto generated setter method
   *
   * @param param ModifiedBy
   */
  public void setModifiedBy(java.lang.String param) {
    localModifiedByTracker = param != null;

    this.localModifiedBy = param;
  }

  /** field for ModifiedDate */
  protected java.lang.String localModifiedDate;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localModifiedDateTracker = false;

  public boolean isModifiedDateSpecified() {
    return localModifiedDateTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getModifiedDate() {
    return localModifiedDate;
  }

  /**
   * Auto generated setter method
   *
   * @param param ModifiedDate
   */
  public void setModifiedDate(java.lang.String param) {
    localModifiedDateTracker = param != null;

    this.localModifiedDate = param;
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

  /** field for Checksum */
  protected java.lang.String localChecksum;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localChecksumTracker = false;

  public boolean isChecksumSpecified() {
    return localChecksumTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getChecksum() {
    return localChecksum;
  }

  /**
   * Auto generated setter method
   *
   * @param param Checksum
   */
  public void setChecksum(java.lang.String param) {
    localChecksumTracker = param != null;

    this.localChecksum = param;
  }

  /** field for Text */
  protected java.lang.String localText;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTextTracker = false;

  public boolean isTextSpecified() {
    return localTextTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getText() {
    return localText;
  }

  /**
   * Auto generated setter method
   *
   * @param param Text
   */
  public void setText(java.lang.String param) {
    localTextTracker = param != null;

    this.localText = param;
  }

  /** field for MatchedLines */
  protected org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.MatchedLines_type0
      localMatchedLines;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localMatchedLinesTracker = false;

  public boolean isMatchedLinesSpecified() {
    return localMatchedLinesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.MatchedLines_type0
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.MatchedLines_type0
      getMatchedLines() {
    return localMatchedLines;
  }

  /**
   * Auto generated setter method
   *
   * @param param MatchedLines
   */
  public void setMatchedLines(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.MatchedLines_type0 param) {
    localMatchedLinesTracker = param != null;

    this.localMatchedLines = param;
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
          registerPrefix(xmlWriter, "urn:hpccsystems:ws:wsattributes");
      if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            namespacePrefix + ":ECLAttribute",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "ECLAttribute", xmlWriter);
      }
    }
    if (localModuleNameTracker) {
      namespace = "urn:hpccsystems:ws:wsattributes";
      writeStartElement(null, namespace, "ModuleName", xmlWriter);

      if (localModuleName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ModuleName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localModuleName);
      }

      xmlWriter.writeEndElement();
    }
    if (localNameTracker) {
      namespace = "urn:hpccsystems:ws:wsattributes";
      writeStartElement(null, namespace, "Name", xmlWriter);

      if (localName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localName);
      }

      xmlWriter.writeEndElement();
    }
    if (localTypeTracker) {
      namespace = "urn:hpccsystems:ws:wsattributes";
      writeStartElement(null, namespace, "Type", xmlWriter);

      if (localType == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Type cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localType);
      }

      xmlWriter.writeEndElement();
    }
    if (localVersionTracker) {
      namespace = "urn:hpccsystems:ws:wsattributes";
      writeStartElement(null, namespace, "Version", xmlWriter);

      if (localVersion == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("Version cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVersion));
      }

      xmlWriter.writeEndElement();
    }
    if (localLatestVersionTracker) {
      namespace = "urn:hpccsystems:ws:wsattributes";
      writeStartElement(null, namespace, "LatestVersion", xmlWriter);

      if (localLatestVersion == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("LatestVersion cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLatestVersion));
      }

      xmlWriter.writeEndElement();
    }
    if (localSandboxVersionTracker) {
      namespace = "urn:hpccsystems:ws:wsattributes";
      writeStartElement(null, namespace, "SandboxVersion", xmlWriter);

      if (localSandboxVersion == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("SandboxVersion cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSandboxVersion));
      }

      xmlWriter.writeEndElement();
    }
    if (localFlagsTracker) {
      namespace = "urn:hpccsystems:ws:wsattributes";
      writeStartElement(null, namespace, "Flags", xmlWriter);

      if (localFlags == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("Flags cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFlags));
      }

      xmlWriter.writeEndElement();
    }
    if (localAccessTracker) {
      namespace = "urn:hpccsystems:ws:wsattributes";
      writeStartElement(null, namespace, "Access", xmlWriter);

      if (localAccess == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("Access cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAccess));
      }

      xmlWriter.writeEndElement();
    }
    if (localIsLockedTracker) {
      namespace = "urn:hpccsystems:ws:wsattributes";
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
      namespace = "urn:hpccsystems:ws:wsattributes";
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
      namespace = "urn:hpccsystems:ws:wsattributes";
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
      namespace = "urn:hpccsystems:ws:wsattributes";
      writeStartElement(null, namespace, "IsOrphaned", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("IsOrphaned cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsOrphaned));
      }

      xmlWriter.writeEndElement();
    }
    if (localResultTypeTracker) {
      namespace = "urn:hpccsystems:ws:wsattributes";
      writeStartElement(null, namespace, "ResultType", xmlWriter);

      if (localResultType == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("ResultType cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResultType));
      }

      xmlWriter.writeEndElement();
    }
    if (localLockedByTracker) {
      namespace = "urn:hpccsystems:ws:wsattributes";
      writeStartElement(null, namespace, "LockedBy", xmlWriter);

      if (localLockedBy == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("LockedBy cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localLockedBy);
      }

      xmlWriter.writeEndElement();
    }
    if (localModifiedByTracker) {
      namespace = "urn:hpccsystems:ws:wsattributes";
      writeStartElement(null, namespace, "ModifiedBy", xmlWriter);

      if (localModifiedBy == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ModifiedBy cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localModifiedBy);
      }

      xmlWriter.writeEndElement();
    }
    if (localModifiedDateTracker) {
      namespace = "urn:hpccsystems:ws:wsattributes";
      writeStartElement(null, namespace, "ModifiedDate", xmlWriter);

      if (localModifiedDate == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ModifiedDate cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localModifiedDate);
      }

      xmlWriter.writeEndElement();
    }
    if (localDescriptionTracker) {
      namespace = "urn:hpccsystems:ws:wsattributes";
      writeStartElement(null, namespace, "Description", xmlWriter);

      if (localDescription == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Description cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localDescription);
      }

      xmlWriter.writeEndElement();
    }
    if (localChecksumTracker) {
      namespace = "urn:hpccsystems:ws:wsattributes";
      writeStartElement(null, namespace, "Checksum", xmlWriter);

      if (localChecksum == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Checksum cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localChecksum);
      }

      xmlWriter.writeEndElement();
    }
    if (localTextTracker) {
      namespace = "urn:hpccsystems:ws:wsattributes";
      writeStartElement(null, namespace, "Text", xmlWriter);

      if (localText == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Text cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localText);
      }

      xmlWriter.writeEndElement();
    }
    if (localMatchedLinesTracker) {
      if (localMatchedLines == null) {
        throw new org.apache.axis2.databinding.ADBException("MatchedLines cannot be null!!");
      }
      localMatchedLines.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "MatchedLines"),
          xmlWriter);
    }
    xmlWriter.writeEndElement();
  }

  private static java.lang.String generatePrefix(java.lang.String namespace) {
    if (namespace.equals("urn:hpccsystems:ws:wsattributes")) {
      return "ns2";
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
    public static ECLAttribute parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      ECLAttribute object = new ECLAttribute();

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

            if (!"ECLAttribute".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (ECLAttribute)
                  org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ExtensionMapper
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ModuleName")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Name")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Type")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Version")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Version" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setVersion(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "LatestVersion")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "LatestVersion" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setLatestVersion(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsattributes", "SandboxVersion")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SandboxVersion" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSandboxVersion(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Flags")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Flags" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setFlags(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Access")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Access" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setAccess(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "IsLocked")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "IsCheckedOut")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "IsSandbox")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "IsOrphaned")
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
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ResultType")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ResultType" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setResultType(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "LockedBy")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "LockedBy" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setLockedBy(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ModifiedBy")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ModifiedBy" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setModifiedBy(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ModifiedDate")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ModifiedDate" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setModifiedDate(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Description")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Checksum")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Checksum" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setChecksum(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Text")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Text" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setText(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "MatchedLines")
                    .equals(reader.getName())) {

              object.setMatchedLines(
                  org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.MatchedLines_type0.Factory
                      .parse(reader));

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

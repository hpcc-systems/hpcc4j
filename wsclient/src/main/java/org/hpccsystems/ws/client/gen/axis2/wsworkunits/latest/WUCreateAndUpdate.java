/**
 * WUCreateAndUpdate.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest;

/** WUCreateAndUpdate bean class */
@SuppressWarnings({"unchecked", "unused"})
public class WUCreateAndUpdate implements org.apache.axis2.databinding.ADBBean {

  public static final javax.xml.namespace.QName MY_QNAME =
      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUCreateAndUpdate", "ns1");

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

  /** field for State */
  protected int localState;

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
   * @return int
   */
  public int getState() {
    return localState;
  }

  /**
   * Auto generated setter method
   *
   * @param param State
   */
  public void setState(int param) {

    // setting primitive attribute tracker to true
    localStateTracker = param != java.lang.Integer.MIN_VALUE;

    this.localState = param;
  }

  /** field for StateOrig */
  protected int localStateOrig;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localStateOrigTracker = false;

  public boolean isStateOrigSpecified() {
    return localStateOrigTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getStateOrig() {
    return localStateOrig;
  }

  /**
   * Auto generated setter method
   *
   * @param param StateOrig
   */
  public void setStateOrig(int param) {

    // setting primitive attribute tracker to true
    localStateOrigTracker = param != java.lang.Integer.MIN_VALUE;

    this.localStateOrig = param;
  }

  /** field for Jobname */
  protected java.lang.String localJobname;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localJobnameTracker = false;

  public boolean isJobnameSpecified() {
    return localJobnameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getJobname() {
    return localJobname;
  }

  /**
   * Auto generated setter method
   *
   * @param param Jobname
   */
  public void setJobname(java.lang.String param) {
    localJobnameTracker = param != null;

    this.localJobname = param;
  }

  /** field for JobnameOrig */
  protected java.lang.String localJobnameOrig;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localJobnameOrigTracker = false;

  public boolean isJobnameOrigSpecified() {
    return localJobnameOrigTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getJobnameOrig() {
    return localJobnameOrig;
  }

  /**
   * Auto generated setter method
   *
   * @param param JobnameOrig
   */
  public void setJobnameOrig(java.lang.String param) {
    localJobnameOrigTracker = param != null;

    this.localJobnameOrig = param;
  }

  /** field for QueryText */
  protected java.lang.String localQueryText;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localQueryTextTracker = false;

  public boolean isQueryTextSpecified() {
    return localQueryTextTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getQueryText() {
    return localQueryText;
  }

  /**
   * Auto generated setter method
   *
   * @param param QueryText
   */
  public void setQueryText(java.lang.String param) {
    localQueryTextTracker = param != null;

    this.localQueryText = param;
  }

  /** field for Action */
  protected int localAction;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localActionTracker = false;

  public boolean isActionSpecified() {
    return localActionTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getAction() {
    return localAction;
  }

  /**
   * Auto generated setter method
   *
   * @param param Action
   */
  public void setAction(int param) {

    // setting primitive attribute tracker to true
    localActionTracker = param != java.lang.Integer.MIN_VALUE;

    this.localAction = param;
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

  /** field for DescriptionOrig */
  protected java.lang.String localDescriptionOrig;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDescriptionOrigTracker = false;

  public boolean isDescriptionOrigSpecified() {
    return localDescriptionOrigTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getDescriptionOrig() {
    return localDescriptionOrig;
  }

  /**
   * Auto generated setter method
   *
   * @param param DescriptionOrig
   */
  public void setDescriptionOrig(java.lang.String param) {
    localDescriptionOrigTracker = param != null;

    this.localDescriptionOrig = param;
  }

  /** field for AddDrilldownFields */
  protected boolean localAddDrilldownFields;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localAddDrilldownFieldsTracker = false;

  public boolean isAddDrilldownFieldsSpecified() {
    return localAddDrilldownFieldsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getAddDrilldownFields() {
    return localAddDrilldownFields;
  }

  /**
   * Auto generated setter method
   *
   * @param param AddDrilldownFields
   */
  public void setAddDrilldownFields(boolean param) {

    // setting primitive attribute tracker to true
    localAddDrilldownFieldsTracker = true;

    this.localAddDrilldownFields = param;
  }

  /** field for ResultLimit */
  protected int localResultLimit;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localResultLimitTracker = false;

  public boolean isResultLimitSpecified() {
    return localResultLimitTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getResultLimit() {
    return localResultLimit;
  }

  /**
   * Auto generated setter method
   *
   * @param param ResultLimit
   */
  public void setResultLimit(int param) {

    // setting primitive attribute tracker to true
    localResultLimitTracker = param != java.lang.Integer.MIN_VALUE;

    this.localResultLimit = param;
  }

  /** field for Protected */
  protected boolean localProtected;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localProtectedTracker = false;

  public boolean isProtectedSpecified() {
    return localProtectedTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getProtected() {
    return localProtected;
  }

  /**
   * Auto generated setter method
   *
   * @param param Protected
   */
  public void setProtected(boolean param) {

    // setting primitive attribute tracker to true
    localProtectedTracker = true;

    this.localProtected = param;
  }

  /** field for ProtectedOrig */
  protected boolean localProtectedOrig;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localProtectedOrigTracker = false;

  public boolean isProtectedOrigSpecified() {
    return localProtectedOrigTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getProtectedOrig() {
    return localProtectedOrig;
  }

  /**
   * Auto generated setter method
   *
   * @param param ProtectedOrig
   */
  public void setProtectedOrig(boolean param) {

    // setting primitive attribute tracker to true
    localProtectedOrigTracker = true;

    this.localProtectedOrig = param;
  }

  /** field for PriorityClass */
  protected int localPriorityClass;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPriorityClassTracker = false;

  public boolean isPriorityClassSpecified() {
    return localPriorityClassTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getPriorityClass() {
    return localPriorityClass;
  }

  /**
   * Auto generated setter method
   *
   * @param param PriorityClass
   */
  public void setPriorityClass(int param) {

    // setting primitive attribute tracker to true
    localPriorityClassTracker = param != java.lang.Integer.MIN_VALUE;

    this.localPriorityClass = param;
  }

  /** field for PriorityLevel */
  protected int localPriorityLevel;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPriorityLevelTracker = false;

  public boolean isPriorityLevelSpecified() {
    return localPriorityLevelTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getPriorityLevel() {
    return localPriorityLevel;
  }

  /**
   * Auto generated setter method
   *
   * @param param PriorityLevel
   */
  public void setPriorityLevel(int param) {

    // setting primitive attribute tracker to true
    localPriorityLevelTracker = param != java.lang.Integer.MIN_VALUE;

    this.localPriorityLevel = param;
  }

  /** field for Scope */
  protected java.lang.String localScope;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localScopeTracker = false;

  public boolean isScopeSpecified() {
    return localScopeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getScope() {
    return localScope;
  }

  /**
   * Auto generated setter method
   *
   * @param param Scope
   */
  public void setScope(java.lang.String param) {
    localScopeTracker = param != null;

    this.localScope = param;
  }

  /** field for ScopeOrig */
  protected java.lang.String localScopeOrig;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localScopeOrigTracker = false;

  public boolean isScopeOrigSpecified() {
    return localScopeOrigTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getScopeOrig() {
    return localScopeOrig;
  }

  /**
   * Auto generated setter method
   *
   * @param param ScopeOrig
   */
  public void setScopeOrig(java.lang.String param) {
    localScopeOrigTracker = param != null;

    this.localScopeOrig = param;
  }

  /** field for ClusterSelection */
  protected java.lang.String localClusterSelection;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localClusterSelectionTracker = false;

  public boolean isClusterSelectionSpecified() {
    return localClusterSelectionTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getClusterSelection() {
    return localClusterSelection;
  }

  /**
   * Auto generated setter method
   *
   * @param param ClusterSelection
   */
  public void setClusterSelection(java.lang.String param) {
    localClusterSelectionTracker = param != null;

    this.localClusterSelection = param;
  }

  /** field for ClusterOrig */
  protected java.lang.String localClusterOrig;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localClusterOrigTracker = false;

  public boolean isClusterOrigSpecified() {
    return localClusterOrigTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getClusterOrig() {
    return localClusterOrig;
  }

  /**
   * Auto generated setter method
   *
   * @param param ClusterOrig
   */
  public void setClusterOrig(java.lang.String param) {
    localClusterOrigTracker = param != null;

    this.localClusterOrig = param;
  }

  /** field for XmlParams */
  protected java.lang.String localXmlParams;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localXmlParamsTracker = false;

  public boolean isXmlParamsSpecified() {
    return localXmlParamsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getXmlParams() {
    return localXmlParams;
  }

  /**
   * Auto generated setter method
   *
   * @param param XmlParams
   */
  public void setXmlParams(java.lang.String param) {
    localXmlParamsTracker = param != null;

    this.localXmlParams = param;
  }

  /** field for ThorSlaveIP */
  protected java.lang.String localThorSlaveIP;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localThorSlaveIPTracker = false;

  public boolean isThorSlaveIPSpecified() {
    return localThorSlaveIPTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getThorSlaveIP() {
    return localThorSlaveIP;
  }

  /**
   * Auto generated setter method
   *
   * @param param ThorSlaveIP
   */
  public void setThorSlaveIP(java.lang.String param) {
    localThorSlaveIPTracker = param != null;

    this.localThorSlaveIP = param;
  }

  /** field for QueryMainDefinition */
  protected java.lang.String localQueryMainDefinition;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localQueryMainDefinitionTracker = false;

  public boolean isQueryMainDefinitionSpecified() {
    return localQueryMainDefinitionTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getQueryMainDefinition() {
    return localQueryMainDefinition;
  }

  /**
   * Auto generated setter method
   *
   * @param param QueryMainDefinition
   */
  public void setQueryMainDefinition(java.lang.String param) {
    localQueryMainDefinitionTracker = param != null;

    this.localQueryMainDefinition = param;
  }

  /** field for DebugValues */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfDebugValue
      localDebugValues;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDebugValuesTracker = false;

  public boolean isDebugValuesSpecified() {
    return localDebugValuesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfDebugValue
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfDebugValue getDebugValues() {
    return localDebugValues;
  }

  /**
   * Auto generated setter method
   *
   * @param param DebugValues
   */
  public void setDebugValues(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfDebugValue param) {
    localDebugValuesTracker = param != null;

    this.localDebugValues = param;
  }

  /** field for ApplicationValues */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfApplicationValue
      localApplicationValues;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localApplicationValuesTracker = false;

  public boolean isApplicationValuesSpecified() {
    return localApplicationValuesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfApplicationValue
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfApplicationValue
      getApplicationValues() {
    return localApplicationValues;
  }

  /**
   * Auto generated setter method
   *
   * @param param ApplicationValues
   */
  public void setApplicationValues(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfApplicationValue param) {
    localApplicationValuesTracker = param != null;

    this.localApplicationValues = param;
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

      java.lang.String namespacePrefix =
          registerPrefix(xmlWriter, "urn:hpccsystems:ws:wsworkunits");
      if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            namespacePrefix + ":WUCreateAndUpdate",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            "WUCreateAndUpdate",
            xmlWriter);
      }
    }
    if (localWuidTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Wuid", xmlWriter);

      if (localWuid == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Wuid cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localWuid);
      }

      xmlWriter.writeEndElement();
    }
    if (localStateTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "State", xmlWriter);

      if (localState == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("State cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localState));
      }

      xmlWriter.writeEndElement();
    }
    if (localStateOrigTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "StateOrig", xmlWriter);

      if (localStateOrig == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("StateOrig cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStateOrig));
      }

      xmlWriter.writeEndElement();
    }
    if (localJobnameTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Jobname", xmlWriter);

      if (localJobname == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Jobname cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localJobname);
      }

      xmlWriter.writeEndElement();
    }
    if (localJobnameOrigTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "JobnameOrig", xmlWriter);

      if (localJobnameOrig == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("JobnameOrig cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localJobnameOrig);
      }

      xmlWriter.writeEndElement();
    }
    if (localQueryTextTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "QueryText", xmlWriter);

      if (localQueryText == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("QueryText cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localQueryText);
      }

      xmlWriter.writeEndElement();
    }
    if (localActionTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Action", xmlWriter);

      if (localAction == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("Action cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAction));
      }

      xmlWriter.writeEndElement();
    }
    if (localDescriptionTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Description", xmlWriter);

      if (localDescription == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Description cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localDescription);
      }

      xmlWriter.writeEndElement();
    }
    if (localDescriptionOrigTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "DescriptionOrig", xmlWriter);

      if (localDescriptionOrig == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("DescriptionOrig cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localDescriptionOrig);
      }

      xmlWriter.writeEndElement();
    }
    if (localAddDrilldownFieldsTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "AddDrilldownFields", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("AddDrilldownFields cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localAddDrilldownFields));
      }

      xmlWriter.writeEndElement();
    }
    if (localResultLimitTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "ResultLimit", xmlWriter);

      if (localResultLimit == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("ResultLimit cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResultLimit));
      }

      xmlWriter.writeEndElement();
    }
    if (localProtectedTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Protected", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("Protected cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProtected));
      }

      xmlWriter.writeEndElement();
    }
    if (localProtectedOrigTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "ProtectedOrig", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("ProtectedOrig cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProtectedOrig));
      }

      xmlWriter.writeEndElement();
    }
    if (localPriorityClassTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "PriorityClass", xmlWriter);

      if (localPriorityClass == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("PriorityClass cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPriorityClass));
      }

      xmlWriter.writeEndElement();
    }
    if (localPriorityLevelTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "PriorityLevel", xmlWriter);

      if (localPriorityLevel == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("PriorityLevel cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPriorityLevel));
      }

      xmlWriter.writeEndElement();
    }
    if (localScopeTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Scope", xmlWriter);

      if (localScope == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Scope cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localScope);
      }

      xmlWriter.writeEndElement();
    }
    if (localScopeOrigTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "ScopeOrig", xmlWriter);

      if (localScopeOrig == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ScopeOrig cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localScopeOrig);
      }

      xmlWriter.writeEndElement();
    }
    if (localClusterSelectionTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "ClusterSelection", xmlWriter);

      if (localClusterSelection == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ClusterSelection cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localClusterSelection);
      }

      xmlWriter.writeEndElement();
    }
    if (localClusterOrigTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "ClusterOrig", xmlWriter);

      if (localClusterOrig == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ClusterOrig cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localClusterOrig);
      }

      xmlWriter.writeEndElement();
    }
    if (localXmlParamsTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "XmlParams", xmlWriter);

      if (localXmlParams == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("XmlParams cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localXmlParams);
      }

      xmlWriter.writeEndElement();
    }
    if (localThorSlaveIPTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "ThorSlaveIP", xmlWriter);

      if (localThorSlaveIP == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ThorSlaveIP cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localThorSlaveIP);
      }

      xmlWriter.writeEndElement();
    }
    if (localQueryMainDefinitionTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "QueryMainDefinition", xmlWriter);

      if (localQueryMainDefinition == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("QueryMainDefinition cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localQueryMainDefinition);
      }

      xmlWriter.writeEndElement();
    }
    if (localDebugValuesTracker) {
      if (localDebugValues == null) {
        throw new org.apache.axis2.databinding.ADBException("DebugValues cannot be null!!");
      }
      localDebugValues.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DebugValues"),
          xmlWriter);
    }
    if (localApplicationValuesTracker) {
      if (localApplicationValues == null) {
        throw new org.apache.axis2.databinding.ADBException("ApplicationValues cannot be null!!");
      }
      localApplicationValues.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ApplicationValues"),
          xmlWriter);
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
    public static WUCreateAndUpdate parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      WUCreateAndUpdate object = new WUCreateAndUpdate();

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

            if (!"WUCreateAndUpdate".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (WUCreateAndUpdate)
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Wuid")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Wuid" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setWuid(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "State")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "State" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setState(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "StateOrig")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "StateOrig" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setStateOrig(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Jobname")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Jobname" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setJobname(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "JobnameOrig")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "JobnameOrig" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setJobnameOrig(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QueryText")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "QueryText" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setQueryText(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Action")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Action" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setAction(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Description")
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
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "DescriptionOrig")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "DescriptionOrig" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDescriptionOrig(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "AddDrilldownFields")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "AddDrilldownFields" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setAddDrilldownFields(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ResultLimit")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ResultLimit" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setResultLimit(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Protected")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Protected" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setProtected(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ProtectedOrig")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ProtectedOrig" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setProtectedOrig(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PriorityClass")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "PriorityClass" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPriorityClass(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PriorityLevel")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "PriorityLevel" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPriorityLevel(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Scope")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Scope" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setScope(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ScopeOrig")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ScopeOrig" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setScopeOrig(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "ClusterSelection")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ClusterSelection" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setClusterSelection(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ClusterOrig")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ClusterOrig" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setClusterOrig(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "XmlParams")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "XmlParams" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setXmlParams(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ThorSlaveIP")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ThorSlaveIP" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setThorSlaveIP(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "QueryMainDefinition")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "QueryMainDefinition" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setQueryMainDefinition(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DebugValues")
                    .equals(reader.getName())) {

              object.setDebugValues(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfDebugValue.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "ApplicationValues")
                    .equals(reader.getName())) {

              object.setApplicationValues(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfApplicationValue
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

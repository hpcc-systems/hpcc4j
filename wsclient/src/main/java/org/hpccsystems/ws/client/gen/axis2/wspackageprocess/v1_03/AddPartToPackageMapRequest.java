/**
 * AddPartToPackageMapRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03;


/**
 *  AddPartToPackageMapRequest bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class AddPartToPackageMapRequest implements org.apache.axis2.databinding.ADBBean {
    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess",
            "AddPartToPackageMapRequest", "ns7");

    /**
     * field for Target
     */
    protected java.lang.String localTarget;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTargetTracker = false;

    /**
     * field for Process
     */
    protected java.lang.String localProcess;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localProcessTracker = false;

    /**
     * field for PackageMap
     */
    protected java.lang.String localPackageMap;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPackageMapTracker = false;

    /**
     * field for GlobalScope
     */
    protected boolean localGlobalScope = org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
            "false");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localGlobalScopeTracker = false;

    /**
     * field for PartName
     */
    protected java.lang.String localPartName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPartNameTracker = false;

    /**
     * field for Content
     */
    protected java.lang.String localContent;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localContentTracker = false;

    /**
     * field for DeletePrevious
     */
    protected boolean localDeletePrevious;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDeletePreviousTracker = false;

    /**
     * field for DaliIp
     */
    protected java.lang.String localDaliIp;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDaliIpTracker = false;

    /**
     * field for SourceProcess
     */
    protected java.lang.String localSourceProcess;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSourceProcessTracker = false;

    /**
     * field for AllowForeignFiles
     */
    protected boolean localAllowForeignFiles = org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
            "true");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAllowForeignFilesTracker = false;

    /**
     * field for PreloadAllPackages
     */
    protected boolean localPreloadAllPackages = org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
            "false");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPreloadAllPackagesTracker = false;

    /**
     * field for UpdateSuperFiles
     */
    protected boolean localUpdateSuperFiles = org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
            "false");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUpdateSuperFilesTracker = false;

    /**
     * field for UpdateCloneFrom
     */
    protected boolean localUpdateCloneFrom = org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
            "false");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUpdateCloneFromTracker = false;

    /**
     * field for AppendCluster
     */
    protected boolean localAppendCluster = org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
            "true");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAppendClusterTracker = false;

    public boolean isTargetSpecified() {
        return localTargetTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTarget() {
        return localTarget;
    }

    /**
     * Auto generated setter method
     * @param param Target
     */
    public void setTarget(java.lang.String param) {
        localTargetTracker = param != null;

        this.localTarget = param;
    }

    public boolean isProcessSpecified() {
        return localProcessTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getProcess() {
        return localProcess;
    }

    /**
     * Auto generated setter method
     * @param param Process
     */
    public void setProcess(java.lang.String param) {
        localProcessTracker = param != null;

        this.localProcess = param;
    }

    public boolean isPackageMapSpecified() {
        return localPackageMapTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPackageMap() {
        return localPackageMap;
    }

    /**
     * Auto generated setter method
     * @param param PackageMap
     */
    public void setPackageMap(java.lang.String param) {
        localPackageMapTracker = param != null;

        this.localPackageMap = param;
    }

    public boolean isGlobalScopeSpecified() {
        return localGlobalScopeTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getGlobalScope() {
        return localGlobalScope;
    }

    /**
     * Auto generated setter method
     * @param param GlobalScope
     */
    public void setGlobalScope(boolean param) {
        // setting primitive attribute tracker to true
        localGlobalScopeTracker = true;

        this.localGlobalScope = param;
    }

    public boolean isPartNameSpecified() {
        return localPartNameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPartName() {
        return localPartName;
    }

    /**
     * Auto generated setter method
     * @param param PartName
     */
    public void setPartName(java.lang.String param) {
        localPartNameTracker = param != null;

        this.localPartName = param;
    }

    public boolean isContentSpecified() {
        return localContentTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getContent() {
        return localContent;
    }

    /**
     * Auto generated setter method
     * @param param Content
     */
    public void setContent(java.lang.String param) {
        localContentTracker = param != null;

        this.localContent = param;
    }

    public boolean isDeletePreviousSpecified() {
        return localDeletePreviousTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getDeletePrevious() {
        return localDeletePrevious;
    }

    /**
     * Auto generated setter method
     * @param param DeletePrevious
     */
    public void setDeletePrevious(boolean param) {
        // setting primitive attribute tracker to true
        localDeletePreviousTracker = true;

        this.localDeletePrevious = param;
    }

    public boolean isDaliIpSpecified() {
        return localDaliIpTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDaliIp() {
        return localDaliIp;
    }

    /**
     * Auto generated setter method
     * @param param DaliIp
     */
    public void setDaliIp(java.lang.String param) {
        localDaliIpTracker = param != null;

        this.localDaliIp = param;
    }

    public boolean isSourceProcessSpecified() {
        return localSourceProcessTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getSourceProcess() {
        return localSourceProcess;
    }

    /**
     * Auto generated setter method
     * @param param SourceProcess
     */
    public void setSourceProcess(java.lang.String param) {
        localSourceProcessTracker = param != null;

        this.localSourceProcess = param;
    }

    public boolean isAllowForeignFilesSpecified() {
        return localAllowForeignFilesTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getAllowForeignFiles() {
        return localAllowForeignFiles;
    }

    /**
     * Auto generated setter method
     * @param param AllowForeignFiles
     */
    public void setAllowForeignFiles(boolean param) {
        // setting primitive attribute tracker to true
        localAllowForeignFilesTracker = true;

        this.localAllowForeignFiles = param;
    }

    public boolean isPreloadAllPackagesSpecified() {
        return localPreloadAllPackagesTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getPreloadAllPackages() {
        return localPreloadAllPackages;
    }

    /**
     * Auto generated setter method
     * @param param PreloadAllPackages
     */
    public void setPreloadAllPackages(boolean param) {
        // setting primitive attribute tracker to true
        localPreloadAllPackagesTracker = true;

        this.localPreloadAllPackages = param;
    }

    public boolean isUpdateSuperFilesSpecified() {
        return localUpdateSuperFilesTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getUpdateSuperFiles() {
        return localUpdateSuperFiles;
    }

    /**
     * Auto generated setter method
     * @param param UpdateSuperFiles
     */
    public void setUpdateSuperFiles(boolean param) {
        // setting primitive attribute tracker to true
        localUpdateSuperFilesTracker = true;

        this.localUpdateSuperFiles = param;
    }

    public boolean isUpdateCloneFromSpecified() {
        return localUpdateCloneFromTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getUpdateCloneFrom() {
        return localUpdateCloneFrom;
    }

    /**
     * Auto generated setter method
     * @param param UpdateCloneFrom
     */
    public void setUpdateCloneFrom(boolean param) {
        // setting primitive attribute tracker to true
        localUpdateCloneFromTracker = true;

        this.localUpdateCloneFrom = param;
    }

    public boolean isAppendClusterSpecified() {
        return localAppendClusterTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getAppendCluster() {
        return localAppendCluster;
    }

    /**
     * Auto generated setter method
     * @param param AppendCluster
     */
    public void setAppendCluster(boolean param) {
        // setting primitive attribute tracker to true
        localAppendClusterTracker = true;

        this.localAppendCluster = param;
    }

    /**
     *
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName,
        final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {
        return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                this, MY_QNAME));
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        serialize(parentQName, xmlWriter, false);
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        java.lang.String prefix = null;
        java.lang.String namespace = null;

        prefix = parentQName.getPrefix();
        namespace = parentQName.getNamespaceURI();
        writeStartElement(prefix, namespace, parentQName.getLocalPart(),
            xmlWriter);

        if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                    "urn:hpccsystems:ws:wspackageprocess");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":AddPartToPackageMapRequest", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "AddPartToPackageMapRequest", xmlWriter);
            }
        }

        if (localTargetTracker) {
            namespace = "urn:hpccsystems:ws:wspackageprocess";
            writeStartElement(null, namespace, "Target", xmlWriter);

            if (localTarget == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Target cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localTarget);
            }

            xmlWriter.writeEndElement();
        }

        if (localProcessTracker) {
            namespace = "urn:hpccsystems:ws:wspackageprocess";
            writeStartElement(null, namespace, "Process", xmlWriter);

            if (localProcess == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Process cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localProcess);
            }

            xmlWriter.writeEndElement();
        }

        if (localPackageMapTracker) {
            namespace = "urn:hpccsystems:ws:wspackageprocess";
            writeStartElement(null, namespace, "PackageMap", xmlWriter);

            if (localPackageMap == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "PackageMap cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localPackageMap);
            }

            xmlWriter.writeEndElement();
        }

        if (localGlobalScopeTracker) {
            namespace = "urn:hpccsystems:ws:wspackageprocess";
            writeStartElement(null, namespace, "GlobalScope", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "GlobalScope cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localGlobalScope));
            }

            xmlWriter.writeEndElement();
        }

        if (localPartNameTracker) {
            namespace = "urn:hpccsystems:ws:wspackageprocess";
            writeStartElement(null, namespace, "PartName", xmlWriter);

            if (localPartName == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "PartName cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localPartName);
            }

            xmlWriter.writeEndElement();
        }

        if (localContentTracker) {
            namespace = "urn:hpccsystems:ws:wspackageprocess";
            writeStartElement(null, namespace, "Content", xmlWriter);

            if (localContent == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Content cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localContent);
            }

            xmlWriter.writeEndElement();
        }

        if (localDeletePreviousTracker) {
            namespace = "urn:hpccsystems:ws:wspackageprocess";
            writeStartElement(null, namespace, "DeletePrevious", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "DeletePrevious cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localDeletePrevious));
            }

            xmlWriter.writeEndElement();
        }

        if (localDaliIpTracker) {
            namespace = "urn:hpccsystems:ws:wspackageprocess";
            writeStartElement(null, namespace, "DaliIp", xmlWriter);

            if (localDaliIp == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "DaliIp cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localDaliIp);
            }

            xmlWriter.writeEndElement();
        }

        if (localSourceProcessTracker) {
            namespace = "urn:hpccsystems:ws:wspackageprocess";
            writeStartElement(null, namespace, "SourceProcess", xmlWriter);

            if (localSourceProcess == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "SourceProcess cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSourceProcess);
            }

            xmlWriter.writeEndElement();
        }

        if (localAllowForeignFilesTracker) {
            namespace = "urn:hpccsystems:ws:wspackageprocess";
            writeStartElement(null, namespace, "AllowForeignFiles", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "AllowForeignFiles cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localAllowForeignFiles));
            }

            xmlWriter.writeEndElement();
        }

        if (localPreloadAllPackagesTracker) {
            namespace = "urn:hpccsystems:ws:wspackageprocess";
            writeStartElement(null, namespace, "PreloadAllPackages", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "PreloadAllPackages cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localPreloadAllPackages));
            }

            xmlWriter.writeEndElement();
        }

        if (localUpdateSuperFilesTracker) {
            namespace = "urn:hpccsystems:ws:wspackageprocess";
            writeStartElement(null, namespace, "UpdateSuperFiles", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "UpdateSuperFiles cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localUpdateSuperFiles));
            }

            xmlWriter.writeEndElement();
        }

        if (localUpdateCloneFromTracker) {
            namespace = "urn:hpccsystems:ws:wspackageprocess";
            writeStartElement(null, namespace, "UpdateCloneFrom", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "UpdateCloneFrom cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localUpdateCloneFrom));
            }

            xmlWriter.writeEndElement();
        }

        if (localAppendClusterTracker) {
            namespace = "urn:hpccsystems:ws:wspackageprocess";
            writeStartElement(null, namespace, "AppendCluster", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "AppendCluster cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localAppendCluster));
            }

            xmlWriter.writeEndElement();
        }

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("urn:hpccsystems:ws:wspackageprocess")) {
            return "ns7";
        }

        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(java.lang.String prefix,
        java.lang.String namespace, java.lang.String localPart,
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

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(java.lang.String prefix,
        java.lang.String namespace, java.lang.String attName,
        java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
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

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(java.lang.String namespace,
        java.lang.String attName, java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
        } else {
            xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace,
        java.lang.String attName, javax.xml.namespace.QName qname,
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
            xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                attributeValue);
        }
    }

    /**
     *  method to handle Qnames
     */
    private void writeQName(javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
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
                xmlWriter.writeCharacters(prefix + ":" +
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            } else {
                // i.e this is the default namespace
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    qname));
        }
    }

    private void writeQNames(javax.xml.namespace.QName[] qnames,
        javax.xml.stream.XMLStreamWriter xmlWriter)
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
                        stringToWrite.append(prefix).append(":")
                                     .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qnames[i]));
                }
            }

            xmlWriter.writeCharacters(stringToWrite.toString());
        }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String prefix = xmlWriter.getPrefix(namespace);

        if (prefix == null) {
            prefix = generatePrefix(namespace);

            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

            while (true) {
                java.lang.String uri = nsContext.getNamespaceURI(prefix);

                if ((uri == null) || (uri.length() == 0)) {
                    break;
                }

                prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }

            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }

        return prefix;
    }

    /**
     *  Factory class that keeps the parse method
     */
    public static class Factory {
        private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

        /**
         * static method to create the object
         * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
         *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
         * Postcondition: If this object is an element, the reader is positioned at its end element
         *                If this object is a complex type, the reader is positioned at the end element of its outer element
         */
        public static AddPartToPackageMapRequest parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            AddPartToPackageMapRequest object = new AddPartToPackageMapRequest();

            int event;
            javax.xml.namespace.QName currentQName = null;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";

            try {
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                currentQName = reader.getName();

                if (reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                    java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "type");

                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;

                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0,
                                    fullTypeName.indexOf(":"));
                        }

                        nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                        java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                    ":") + 1);

                        if (!"AddPartToPackageMapRequest".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (AddPartToPackageMapRequest) org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                while (!reader.isEndElement()) {
                    if (reader.isStartElement()) {
                        if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wspackageprocess",
                                    "Target").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Target" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setTarget(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wspackageprocess",
                                    "Process").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Process" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setProcess(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wspackageprocess",
                                    "PackageMap").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "PackageMap" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setPackageMap(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wspackageprocess",
                                    "GlobalScope").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "GlobalScope" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setGlobalScope(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wspackageprocess",
                                    "PartName").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "PartName" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setPartName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wspackageprocess",
                                    "Content").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Content" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setContent(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wspackageprocess",
                                    "DeletePrevious").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "DeletePrevious" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setDeletePrevious(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wspackageprocess",
                                    "DaliIp").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "DaliIp" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setDaliIp(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wspackageprocess",
                                    "SourceProcess").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "SourceProcess" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setSourceProcess(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wspackageprocess",
                                    "AllowForeignFiles").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "AllowForeignFiles" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setAllowForeignFiles(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wspackageprocess",
                                    "PreloadAllPackages").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "PreloadAllPackages" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setPreloadAllPackages(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wspackageprocess",
                                    "UpdateSuperFiles").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "UpdateSuperFiles" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setUpdateSuperFiles(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wspackageprocess",
                                    "UpdateCloneFrom").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "UpdateCloneFrom" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setUpdateCloneFrom(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wspackageprocess",
                                    "AppendCluster").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "AppendCluster" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setAppendCluster(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

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
    } //end of factory class
}

/**
 * ECLModule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21;


/**
 *  ECLModule bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class ECLModule implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = ECLModule
       Namespace URI = urn:hpccsystems:ws:wsattributes
       Namespace Prefix = ns1
     */

    /**
     * field for Name
     */
    protected java.lang.String localName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNameTracker = false;

    /**
     * field for Flags
     */
    protected int localFlags;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFlagsTracker = false;

    /**
     * field for Access
     */
    protected int localAccess;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAccessTracker = false;

    /**
     * field for Timestamp
     */
    protected long localTimestamp;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTimestampTracker = false;

    /**
     * field for IsPlugin
     */
    protected boolean localIsPlugin;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIsPluginTracker = false;

    /**
     * field for Rank
     */
    protected int localRank;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRankTracker = false;

    /**
     * field for FileName
     */
    protected java.lang.String localFileName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFileNameTracker = false;

    /**
     * field for FileCRC
     */
    protected java.lang.String localFileCRC;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFileCRCTracker = false;

    /**
     * field for Version
     */
    protected java.lang.String localVersion;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localVersionTracker = false;

    /**
     * field for Checksum
     */
    protected java.lang.String localChecksum;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localChecksumTracker = false;

    public boolean isNameSpecified() {
        return localNameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getName() {
        return localName;
    }

    /**
     * Auto generated setter method
     * @param param Name
     */
    public void setName(java.lang.String param) {
        localNameTracker = param != null;

        this.localName = param;
    }

    public boolean isFlagsSpecified() {
        return localFlagsTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getFlags() {
        return localFlags;
    }

    /**
     * Auto generated setter method
     * @param param Flags
     */
    public void setFlags(int param) {
        // setting primitive attribute tracker to true
        localFlagsTracker = param != java.lang.Integer.MIN_VALUE;

        this.localFlags = param;
    }

    public boolean isAccessSpecified() {
        return localAccessTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getAccess() {
        return localAccess;
    }

    /**
     * Auto generated setter method
     * @param param Access
     */
    public void setAccess(int param) {
        // setting primitive attribute tracker to true
        localAccessTracker = param != java.lang.Integer.MIN_VALUE;

        this.localAccess = param;
    }

    public boolean isTimestampSpecified() {
        return localTimestampTracker;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getTimestamp() {
        return localTimestamp;
    }

    /**
     * Auto generated setter method
     * @param param Timestamp
     */
    public void setTimestamp(long param) {
        // setting primitive attribute tracker to true
        localTimestampTracker = param != java.lang.Long.MIN_VALUE;

        this.localTimestamp = param;
    }

    public boolean isIsPluginSpecified() {
        return localIsPluginTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getIsPlugin() {
        return localIsPlugin;
    }

    /**
     * Auto generated setter method
     * @param param IsPlugin
     */
    public void setIsPlugin(boolean param) {
        // setting primitive attribute tracker to true
        localIsPluginTracker = true;

        this.localIsPlugin = param;
    }

    public boolean isRankSpecified() {
        return localRankTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getRank() {
        return localRank;
    }

    /**
     * Auto generated setter method
     * @param param Rank
     */
    public void setRank(int param) {
        // setting primitive attribute tracker to true
        localRankTracker = param != java.lang.Integer.MIN_VALUE;

        this.localRank = param;
    }

    public boolean isFileNameSpecified() {
        return localFileNameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getFileName() {
        return localFileName;
    }

    /**
     * Auto generated setter method
     * @param param FileName
     */
    public void setFileName(java.lang.String param) {
        localFileNameTracker = param != null;

        this.localFileName = param;
    }

    public boolean isFileCRCSpecified() {
        return localFileCRCTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getFileCRC() {
        return localFileCRC;
    }

    /**
     * Auto generated setter method
     * @param param FileCRC
     */
    public void setFileCRC(java.lang.String param) {
        localFileCRCTracker = param != null;

        this.localFileCRC = param;
    }

    public boolean isVersionSpecified() {
        return localVersionTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getVersion() {
        return localVersion;
    }

    /**
     * Auto generated setter method
     * @param param Version
     */
    public void setVersion(java.lang.String param) {
        localVersionTracker = param != null;

        this.localVersion = param;
    }

    public boolean isChecksumSpecified() {
        return localChecksumTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getChecksum() {
        return localChecksum;
    }

    /**
     * Auto generated setter method
     * @param param Checksum
     */
    public void setChecksum(java.lang.String param) {
        localChecksumTracker = param != null;

        this.localChecksum = param;
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
                this, parentQName));
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
                    "urn:hpccsystems:ws:wsattributes");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":ECLModule", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "ECLModule", xmlWriter);
            }
        }

        if (localNameTracker) {
            namespace = "urn:hpccsystems:ws:wsattributes";
            writeStartElement(null, namespace, "Name", xmlWriter);

            if (localName == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Name cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localName);
            }

            xmlWriter.writeEndElement();
        }

        if (localFlagsTracker) {
            namespace = "urn:hpccsystems:ws:wsattributes";
            writeStartElement(null, namespace, "Flags", xmlWriter);

            if (localFlags == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Flags cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localFlags));
            }

            xmlWriter.writeEndElement();
        }

        if (localAccessTracker) {
            namespace = "urn:hpccsystems:ws:wsattributes";
            writeStartElement(null, namespace, "Access", xmlWriter);

            if (localAccess == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Access cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localAccess));
            }

            xmlWriter.writeEndElement();
        }

        if (localTimestampTracker) {
            namespace = "urn:hpccsystems:ws:wsattributes";
            writeStartElement(null, namespace, "Timestamp", xmlWriter);

            if (localTimestamp == java.lang.Long.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Timestamp cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localTimestamp));
            }

            xmlWriter.writeEndElement();
        }

        if (localIsPluginTracker) {
            namespace = "urn:hpccsystems:ws:wsattributes";
            writeStartElement(null, namespace, "IsPlugin", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "IsPlugin cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localIsPlugin));
            }

            xmlWriter.writeEndElement();
        }

        if (localRankTracker) {
            namespace = "urn:hpccsystems:ws:wsattributes";
            writeStartElement(null, namespace, "Rank", xmlWriter);

            if (localRank == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Rank cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localRank));
            }

            xmlWriter.writeEndElement();
        }

        if (localFileNameTracker) {
            namespace = "urn:hpccsystems:ws:wsattributes";
            writeStartElement(null, namespace, "FileName", xmlWriter);

            if (localFileName == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "FileName cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localFileName);
            }

            xmlWriter.writeEndElement();
        }

        if (localFileCRCTracker) {
            namespace = "urn:hpccsystems:ws:wsattributes";
            writeStartElement(null, namespace, "FileCRC", xmlWriter);

            if (localFileCRC == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "FileCRC cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localFileCRC);
            }

            xmlWriter.writeEndElement();
        }

        if (localVersionTracker) {
            namespace = "urn:hpccsystems:ws:wsattributes";
            writeStartElement(null, namespace, "Version", xmlWriter);

            if (localVersion == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Version cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localVersion);
            }

            xmlWriter.writeEndElement();
        }

        if (localChecksumTracker) {
            namespace = "urn:hpccsystems:ws:wsattributes";
            writeStartElement(null, namespace, "Checksum", xmlWriter);

            if (localChecksum == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Checksum cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localChecksum);
            }

            xmlWriter.writeEndElement();
        }

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("urn:hpccsystems:ws:wsattributes")) {
            return "ns1";
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
        public static ECLModule parse(javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {
            ECLModule object = new ECLModule();

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

                        if (!"ECLModule".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (ECLModule) org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.ExtensionMapper.getTypeObject(nsUri,
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
                                    "urn:hpccsystems:ws:wsattributes", "Name").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Name" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsattributes", "Flags").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Flags" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setFlags(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsattributes", "Access").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Access" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setAccess(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsattributes",
                                    "Timestamp").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Timestamp" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setTimestamp(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsattributes",
                                    "IsPlugin").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "IsPlugin" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setIsPlugin(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsattributes", "Rank").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Rank" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setRank(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsattributes",
                                    "FileName").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "FileName" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setFileName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsattributes", "FileCRC").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "FileCRC" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setFileCRC(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsattributes", "Version").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Version" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setVersion(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsattributes",
                                    "Checksum").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Checksum" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setChecksum(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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

/**
 * DropZoneFilesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.filespray.v1_16;


/**
 *  DropZoneFilesRequest bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class DropZoneFilesRequest implements org.apache.axis2.databinding.ADBBean {
    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
            "DropZoneFilesRequest", "ns2");

    /**
     * field for DropZoneName
     */
    protected java.lang.String localDropZoneName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDropZoneNameTracker = false;

    /**
     * field for NetAddress
     */
    protected java.lang.String localNetAddress;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNetAddressTracker = false;

    /**
     * field for Path
     */
    protected java.lang.String localPath;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPathTracker = false;

    /**
     * field for OS
     */
    protected java.lang.String localOS;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localOSTracker = false;

    /**
     * field for Subfolder
     */
    protected java.lang.String localSubfolder;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSubfolderTracker = false;

    /**
     * field for ECLWatchVisibleOnly
     */
    protected boolean localECLWatchVisibleOnly = org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
            "false");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localECLWatchVisibleOnlyTracker = false;

    /**
     * field for DirectoryOnly
     */
    protected boolean localDirectoryOnly = org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
            "false");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDirectoryOnlyTracker = false;

    public boolean isDropZoneNameSpecified() {
        return localDropZoneNameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDropZoneName() {
        return localDropZoneName;
    }

    /**
     * Auto generated setter method
     * @param param DropZoneName
     */
    public void setDropZoneName(java.lang.String param) {
        localDropZoneNameTracker = param != null;

        this.localDropZoneName = param;
    }

    public boolean isNetAddressSpecified() {
        return localNetAddressTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNetAddress() {
        return localNetAddress;
    }

    /**
     * Auto generated setter method
     * @param param NetAddress
     */
    public void setNetAddress(java.lang.String param) {
        localNetAddressTracker = param != null;

        this.localNetAddress = param;
    }

    public boolean isPathSpecified() {
        return localPathTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPath() {
        return localPath;
    }

    /**
     * Auto generated setter method
     * @param param Path
     */
    public void setPath(java.lang.String param) {
        localPathTracker = param != null;

        this.localPath = param;
    }

    public boolean isOSSpecified() {
        return localOSTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getOS() {
        return localOS;
    }

    /**
     * Auto generated setter method
     * @param param OS
     */
    public void setOS(java.lang.String param) {
        localOSTracker = param != null;

        this.localOS = param;
    }

    public boolean isSubfolderSpecified() {
        return localSubfolderTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getSubfolder() {
        return localSubfolder;
    }

    /**
     * Auto generated setter method
     * @param param Subfolder
     */
    public void setSubfolder(java.lang.String param) {
        localSubfolderTracker = param != null;

        this.localSubfolder = param;
    }

    public boolean isECLWatchVisibleOnlySpecified() {
        return localECLWatchVisibleOnlyTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getECLWatchVisibleOnly() {
        return localECLWatchVisibleOnly;
    }

    /**
     * Auto generated setter method
     * @param param ECLWatchVisibleOnly
     */
    public void setECLWatchVisibleOnly(boolean param) {
        // setting primitive attribute tracker to true
        localECLWatchVisibleOnlyTracker = true;

        this.localECLWatchVisibleOnly = param;
    }

    public boolean isDirectoryOnlySpecified() {
        return localDirectoryOnlyTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getDirectoryOnly() {
        return localDirectoryOnly;
    }

    /**
     * Auto generated setter method
     * @param param DirectoryOnly
     */
    public void setDirectoryOnly(boolean param) {
        // setting primitive attribute tracker to true
        localDirectoryOnlyTracker = true;

        this.localDirectoryOnly = param;
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
                    "urn:hpccsystems:ws:filespray");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":DropZoneFilesRequest", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "DropZoneFilesRequest", xmlWriter);
            }
        }

        if (localDropZoneNameTracker) {
            namespace = "urn:hpccsystems:ws:filespray";
            writeStartElement(null, namespace, "DropZoneName", xmlWriter);

            if (localDropZoneName == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "DropZoneName cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localDropZoneName);
            }

            xmlWriter.writeEndElement();
        }

        if (localNetAddressTracker) {
            namespace = "urn:hpccsystems:ws:filespray";
            writeStartElement(null, namespace, "NetAddress", xmlWriter);

            if (localNetAddress == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "NetAddress cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localNetAddress);
            }

            xmlWriter.writeEndElement();
        }

        if (localPathTracker) {
            namespace = "urn:hpccsystems:ws:filespray";
            writeStartElement(null, namespace, "Path", xmlWriter);

            if (localPath == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Path cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localPath);
            }

            xmlWriter.writeEndElement();
        }

        if (localOSTracker) {
            namespace = "urn:hpccsystems:ws:filespray";
            writeStartElement(null, namespace, "OS", xmlWriter);

            if (localOS == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "OS cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localOS);
            }

            xmlWriter.writeEndElement();
        }

        if (localSubfolderTracker) {
            namespace = "urn:hpccsystems:ws:filespray";
            writeStartElement(null, namespace, "Subfolder", xmlWriter);

            if (localSubfolder == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Subfolder cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSubfolder);
            }

            xmlWriter.writeEndElement();
        }

        if (localECLWatchVisibleOnlyTracker) {
            namespace = "urn:hpccsystems:ws:filespray";
            writeStartElement(null, namespace, "ECLWatchVisibleOnly", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "ECLWatchVisibleOnly cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localECLWatchVisibleOnly));
            }

            xmlWriter.writeEndElement();
        }

        if (localDirectoryOnlyTracker) {
            namespace = "urn:hpccsystems:ws:filespray";
            writeStartElement(null, namespace, "DirectoryOnly", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "DirectoryOnly cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localDirectoryOnly));
            }

            xmlWriter.writeEndElement();
        }

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("urn:hpccsystems:ws:filespray")) {
            return "ns2";
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
        public static DropZoneFilesRequest parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            DropZoneFilesRequest object = new DropZoneFilesRequest();

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

                        if (!"DropZoneFilesRequest".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (DropZoneFilesRequest) org.hpccsystems.ws.client.gen.axis2.filespray.v1_16.ExtensionMapper.getTypeObject(nsUri,
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
                                    "urn:hpccsystems:ws:filespray",
                                    "DropZoneName").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "DropZoneName" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setDropZoneName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:filespray", "NetAddress").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "NetAddress" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setNetAddress(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:filespray", "Path").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Path" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setPath(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:filespray", "OS").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "OS" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setOS(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:filespray", "Subfolder").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Subfolder" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setSubfolder(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:filespray",
                                    "ECLWatchVisibleOnly").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "ECLWatchVisibleOnly" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setECLWatchVisibleOnly(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:filespray",
                                    "DirectoryOnly").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "DirectoryOnly" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setDirectoryOnly(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
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

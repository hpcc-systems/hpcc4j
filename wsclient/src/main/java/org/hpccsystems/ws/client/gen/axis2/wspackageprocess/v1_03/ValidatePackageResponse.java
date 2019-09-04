/**
 * ValidatePackageResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03;


/**
 *  ValidatePackageResponse bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class ValidatePackageResponse implements org.apache.axis2.databinding.ADBBean {
    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("urn:hpccsystems:ws:wspackageprocess",
            "ValidatePackageResponse", "ns7");

    /**
     * field for Exceptions
     */
    protected org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ArrayOfEspException localExceptions;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localExceptionsTracker = false;

    /**
     * field for PMID
     */
    protected java.lang.String localPMID;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPMIDTracker = false;

    /**
     * field for Status
     */
    protected org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.BasePackageStatus localStatus;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localStatusTracker = false;

    /**
     * field for Warnings
     */
    protected org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspStringArray localWarnings;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localWarningsTracker = false;

    /**
     * field for Errors
     */
    protected org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspStringArray localErrors;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localErrorsTracker = false;

    /**
     * field for Packages
     */
    protected org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ValidatePackageInfo localPackages;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPackagesTracker = false;

    /**
     * field for Queries
     */
    protected org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ValidatePackageQueries localQueries;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localQueriesTracker = false;

    /**
     * field for Files
     */
    protected org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ValidatePackageFiles localFiles;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFilesTracker = false;

    public boolean isExceptionsSpecified() {
        return localExceptionsTracker;
    }

    /**
     * Auto generated getter method
     * @return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ArrayOfEspException
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ArrayOfEspException getExceptions() {
        return localExceptions;
    }

    /**
     * Auto generated setter method
     * @param param Exceptions
     */
    public void setExceptions(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ArrayOfEspException param) {
        localExceptionsTracker = param != null;

        this.localExceptions = param;
    }

    public boolean isPMIDSpecified() {
        return localPMIDTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPMID() {
        return localPMID;
    }

    /**
     * Auto generated setter method
     * @param param PMID
     */
    public void setPMID(java.lang.String param) {
        localPMIDTracker = param != null;

        this.localPMID = param;
    }

    public boolean isStatusSpecified() {
        return localStatusTracker;
    }

    /**
     * Auto generated getter method
     * @return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.BasePackageStatus
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.BasePackageStatus getStatus() {
        return localStatus;
    }

    /**
     * Auto generated setter method
     * @param param Status
     */
    public void setStatus(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.BasePackageStatus param) {
        localStatusTracker = param != null;

        this.localStatus = param;
    }

    public boolean isWarningsSpecified() {
        return localWarningsTracker;
    }

    /**
     * Auto generated getter method
     * @return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspStringArray
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspStringArray getWarnings() {
        return localWarnings;
    }

    /**
     * Auto generated setter method
     * @param param Warnings
     */
    public void setWarnings(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspStringArray param) {
        localWarningsTracker = param != null;

        this.localWarnings = param;
    }

    public boolean isErrorsSpecified() {
        return localErrorsTracker;
    }

    /**
     * Auto generated getter method
     * @return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspStringArray
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspStringArray getErrors() {
        return localErrors;
    }

    /**
     * Auto generated setter method
     * @param param Errors
     */
    public void setErrors(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspStringArray param) {
        localErrorsTracker = param != null;

        this.localErrors = param;
    }

    public boolean isPackagesSpecified() {
        return localPackagesTracker;
    }

    /**
     * Auto generated getter method
     * @return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ValidatePackageInfo
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ValidatePackageInfo getPackages() {
        return localPackages;
    }

    /**
     * Auto generated setter method
     * @param param Packages
     */
    public void setPackages(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ValidatePackageInfo param) {
        localPackagesTracker = param != null;

        this.localPackages = param;
    }

    public boolean isQueriesSpecified() {
        return localQueriesTracker;
    }

    /**
     * Auto generated getter method
     * @return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ValidatePackageQueries
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ValidatePackageQueries getQueries() {
        return localQueries;
    }

    /**
     * Auto generated setter method
     * @param param Queries
     */
    public void setQueries(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ValidatePackageQueries param) {
        localQueriesTracker = param != null;

        this.localQueries = param;
    }

    public boolean isFilesSpecified() {
        return localFilesTracker;
    }

    /**
     * Auto generated getter method
     * @return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ValidatePackageFiles
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ValidatePackageFiles getFiles() {
        return localFiles;
    }

    /**
     * Auto generated setter method
     * @param param Files
     */
    public void setFiles(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ValidatePackageFiles param) {
        localFilesTracker = param != null;

        this.localFiles = param;
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
                    namespacePrefix + ":ValidatePackageResponse", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "ValidatePackageResponse", xmlWriter);
            }
        }

        if (localExceptionsTracker) {
            if (localExceptions == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Exceptions cannot be null!!");
            }

            localExceptions.serialize(new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                xmlWriter);
        }

        if (localPMIDTracker) {
            namespace = "urn:hpccsystems:ws:wspackageprocess";
            writeStartElement(null, namespace, "PMID", xmlWriter);

            if (localPMID == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "PMID cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localPMID);
            }

            xmlWriter.writeEndElement();
        }

        if (localStatusTracker) {
            if (localStatus == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "status cannot be null!!");
            }

            localStatus.serialize(new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "status"), xmlWriter);
        }

        if (localWarningsTracker) {
            if (localWarnings == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Warnings cannot be null!!");
            }

            localWarnings.serialize(new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Warnings"),
                xmlWriter);
        }

        if (localErrorsTracker) {
            if (localErrors == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Errors cannot be null!!");
            }

            localErrors.serialize(new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Errors"), xmlWriter);
        }

        if (localPackagesTracker) {
            if (localPackages == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "packages cannot be null!!");
            }

            localPackages.serialize(new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "packages"),
                xmlWriter);
        }

        if (localQueriesTracker) {
            if (localQueries == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "queries cannot be null!!");
            }

            localQueries.serialize(new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "queries"), xmlWriter);
        }

        if (localFilesTracker) {
            if (localFiles == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "files cannot be null!!");
            }

            localFiles.serialize(new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "files"), xmlWriter);
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
        public static ValidatePackageResponse parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            ValidatePackageResponse object = new ValidatePackageResponse();

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

                        if (!"ValidatePackageResponse".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (ValidatePackageResponse) org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ExtensionMapper.getTypeObject(nsUri,
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
                                    "Exceptions").equals(reader.getName())) {
                            object.setExceptions(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ArrayOfEspException.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wspackageprocess",
                                    "PMID").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "PMID" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setPMID(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wspackageprocess",
                                    "status").equals(reader.getName())) {
                            object.setStatus(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.BasePackageStatus.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wspackageprocess",
                                    "Warnings").equals(reader.getName())) {
                            object.setWarnings(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspStringArray.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wspackageprocess",
                                    "Errors").equals(reader.getName())) {
                            object.setErrors(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspStringArray.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wspackageprocess",
                                    "packages").equals(reader.getName())) {
                            object.setPackages(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ValidatePackageInfo.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wspackageprocess",
                                    "queries").equals(reader.getName())) {
                            object.setQueries(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ValidatePackageQueries.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wspackageprocess",
                                    "files").equals(reader.getName())) {
                            object.setFiles(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ValidatePackageFiles.Factory.parse(
                                    reader));

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

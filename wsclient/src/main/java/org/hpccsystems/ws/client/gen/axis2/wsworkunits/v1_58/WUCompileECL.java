/**
 * WUCompileECL.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58;


/**
 *  WUCompileECL bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class WUCompileECL implements org.apache.axis2.databinding.ADBBean {
    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits",
            "WUCompileECL", "ns8");

    /**
     * field for ECL
     */
    protected java.lang.String localECL;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localECLTracker = false;

    /**
     * field for ModuleName
     */
    protected java.lang.String localModuleName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localModuleNameTracker = false;

    /**
     * field for AttributeName
     */
    protected java.lang.String localAttributeName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAttributeNameTracker = false;

    /**
     * field for Queue
     */
    protected java.lang.String localQueue;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localQueueTracker = false;

    /**
     * field for Cluster
     */
    protected java.lang.String localCluster;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localClusterTracker = false;

    /**
     * field for Snapshot
     */
    protected java.lang.String localSnapshot;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSnapshotTracker = false;

    /**
     * field for IncludeDependencies
     */
    protected boolean localIncludeDependencies = org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
            "false");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIncludeDependenciesTracker = false;

    /**
     * field for IncludeComplexity
     */
    protected boolean localIncludeComplexity;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIncludeComplexityTracker = false;

    /**
     * field for TimeToWait
     */
    protected int localTimeToWait = org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
            "60000");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTimeToWaitTracker = false;

    public boolean isECLSpecified() {
        return localECLTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getECL() {
        return localECL;
    }

    /**
     * Auto generated setter method
     * @param param ECL
     */
    public void setECL(java.lang.String param) {
        localECLTracker = param != null;

        this.localECL = param;
    }

    public boolean isModuleNameSpecified() {
        return localModuleNameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getModuleName() {
        return localModuleName;
    }

    /**
     * Auto generated setter method
     * @param param ModuleName
     */
    public void setModuleName(java.lang.String param) {
        localModuleNameTracker = param != null;

        this.localModuleName = param;
    }

    public boolean isAttributeNameSpecified() {
        return localAttributeNameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getAttributeName() {
        return localAttributeName;
    }

    /**
     * Auto generated setter method
     * @param param AttributeName
     */
    public void setAttributeName(java.lang.String param) {
        localAttributeNameTracker = param != null;

        this.localAttributeName = param;
    }

    public boolean isQueueSpecified() {
        return localQueueTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getQueue() {
        return localQueue;
    }

    /**
     * Auto generated setter method
     * @param param Queue
     */
    public void setQueue(java.lang.String param) {
        localQueueTracker = param != null;

        this.localQueue = param;
    }

    public boolean isClusterSpecified() {
        return localClusterTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getCluster() {
        return localCluster;
    }

    /**
     * Auto generated setter method
     * @param param Cluster
     */
    public void setCluster(java.lang.String param) {
        localClusterTracker = param != null;

        this.localCluster = param;
    }

    public boolean isSnapshotSpecified() {
        return localSnapshotTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getSnapshot() {
        return localSnapshot;
    }

    /**
     * Auto generated setter method
     * @param param Snapshot
     */
    public void setSnapshot(java.lang.String param) {
        localSnapshotTracker = param != null;

        this.localSnapshot = param;
    }

    public boolean isIncludeDependenciesSpecified() {
        return localIncludeDependenciesTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getIncludeDependencies() {
        return localIncludeDependencies;
    }

    /**
     * Auto generated setter method
     * @param param IncludeDependencies
     */
    public void setIncludeDependencies(boolean param) {
        // setting primitive attribute tracker to true
        localIncludeDependenciesTracker = true;

        this.localIncludeDependencies = param;
    }

    public boolean isIncludeComplexitySpecified() {
        return localIncludeComplexityTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getIncludeComplexity() {
        return localIncludeComplexity;
    }

    /**
     * Auto generated setter method
     * @param param IncludeComplexity
     */
    public void setIncludeComplexity(boolean param) {
        // setting primitive attribute tracker to true
        localIncludeComplexityTracker = true;

        this.localIncludeComplexity = param;
    }

    public boolean isTimeToWaitSpecified() {
        return localTimeToWaitTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getTimeToWait() {
        return localTimeToWait;
    }

    /**
     * Auto generated setter method
     * @param param TimeToWait
     */
    public void setTimeToWait(int param) {
        // setting primitive attribute tracker to true
        localTimeToWaitTracker = param != java.lang.Integer.MIN_VALUE;

        this.localTimeToWait = param;
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
                    "urn:hpccsystems:ws:wsworkunits");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":WUCompileECL", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "WUCompileECL", xmlWriter);
            }
        }

        if (localECLTracker) {
            namespace = "urn:hpccsystems:ws:wsworkunits";
            writeStartElement(null, namespace, "ECL", xmlWriter);

            if (localECL == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "ECL cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localECL);
            }

            xmlWriter.writeEndElement();
        }

        if (localModuleNameTracker) {
            namespace = "urn:hpccsystems:ws:wsworkunits";
            writeStartElement(null, namespace, "ModuleName", xmlWriter);

            if (localModuleName == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "ModuleName cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localModuleName);
            }

            xmlWriter.writeEndElement();
        }

        if (localAttributeNameTracker) {
            namespace = "urn:hpccsystems:ws:wsworkunits";
            writeStartElement(null, namespace, "AttributeName", xmlWriter);

            if (localAttributeName == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "AttributeName cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localAttributeName);
            }

            xmlWriter.writeEndElement();
        }

        if (localQueueTracker) {
            namespace = "urn:hpccsystems:ws:wsworkunits";
            writeStartElement(null, namespace, "Queue", xmlWriter);

            if (localQueue == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Queue cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localQueue);
            }

            xmlWriter.writeEndElement();
        }

        if (localClusterTracker) {
            namespace = "urn:hpccsystems:ws:wsworkunits";
            writeStartElement(null, namespace, "Cluster", xmlWriter);

            if (localCluster == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Cluster cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localCluster);
            }

            xmlWriter.writeEndElement();
        }

        if (localSnapshotTracker) {
            namespace = "urn:hpccsystems:ws:wsworkunits";
            writeStartElement(null, namespace, "Snapshot", xmlWriter);

            if (localSnapshot == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Snapshot cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSnapshot);
            }

            xmlWriter.writeEndElement();
        }

        if (localIncludeDependenciesTracker) {
            namespace = "urn:hpccsystems:ws:wsworkunits";
            writeStartElement(null, namespace, "IncludeDependencies", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "IncludeDependencies cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localIncludeDependencies));
            }

            xmlWriter.writeEndElement();
        }

        if (localIncludeComplexityTracker) {
            namespace = "urn:hpccsystems:ws:wsworkunits";
            writeStartElement(null, namespace, "IncludeComplexity", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "IncludeComplexity cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localIncludeComplexity));
            }

            xmlWriter.writeEndElement();
        }

        if (localTimeToWaitTracker) {
            namespace = "urn:hpccsystems:ws:wsworkunits";
            writeStartElement(null, namespace, "TimeToWait", xmlWriter);

            if (localTimeToWait == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "TimeToWait cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localTimeToWait));
            }

            xmlWriter.writeEndElement();
        }

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("urn:hpccsystems:ws:wsworkunits")) {
            return "ns8";
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
        public static WUCompileECL parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            WUCompileECL object = new WUCompileECL();

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

                        if (!"WUCompileECL".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (WUCompileECL) org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ExtensionMapper.getTypeObject(nsUri,
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
                                    "urn:hpccsystems:ws:wsworkunits", "ECL").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "ECL" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setECL(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsworkunits",
                                    "ModuleName").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "ModuleName" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setModuleName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsworkunits",
                                    "AttributeName").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "AttributeName" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setAttributeName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsworkunits", "Queue").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Queue" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setQueue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsworkunits", "Cluster").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Cluster" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setCluster(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsworkunits", "Snapshot").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Snapshot" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setSnapshot(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsworkunits",
                                    "IncludeDependencies").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "IncludeDependencies" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setIncludeDependencies(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsworkunits",
                                    "IncludeComplexity").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "IncludeComplexity" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setIncludeComplexity(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsworkunits",
                                    "TimeToWait").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "TimeToWait" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setTimeToWait(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
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

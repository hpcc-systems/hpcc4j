/**
 * TpTargetClusterQueryResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28;


/**
 *  TpTargetClusterQueryResponse bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class TpTargetClusterQueryResponse implements org.apache.axis2.databinding.ADBBean {
    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology",
            "TpTargetClusterQueryResponse", "ns5");

    /**
     * field for Exceptions
     */
    protected org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfEspException localExceptions;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localExceptionsTracker = false;

    /**
     * field for ShowDetails
     */
    protected boolean localShowDetails = org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
            "false");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localShowDetailsTracker = false;

    /**
     * field for MemThreshold
     */
    protected int localMemThreshold;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMemThresholdTracker = false;

    /**
     * field for DiskThreshold
     */
    protected int localDiskThreshold;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDiskThresholdTracker = false;

    /**
     * field for CpuThreshold
     */
    protected int localCpuThreshold;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCpuThresholdTracker = false;

    /**
     * field for MemThresholdType
     */
    protected java.lang.String localMemThresholdType;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMemThresholdTypeTracker = false;

    /**
     * field for DiskThresholdType
     */
    protected java.lang.String localDiskThresholdType;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDiskThresholdTypeTracker = false;

    /**
     * field for PreflightProcessFilter
     */
    protected java.lang.String localPreflightProcessFilter;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPreflightProcessFilterTracker = false;

    /**
     * field for AcceptLanguage
     */
    protected java.lang.String localAcceptLanguage;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAcceptLanguageTracker = false;

    /**
     * field for TpTargetClusters
     */
    protected org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpTargetCluster localTpTargetClusters;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTpTargetClustersTracker = false;

    public boolean isExceptionsSpecified() {
        return localExceptionsTracker;
    }

    /**
     * Auto generated getter method
     * @return org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfEspException
     */
    public org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfEspException getExceptions() {
        return localExceptions;
    }

    /**
     * Auto generated setter method
     * @param param Exceptions
     */
    public void setExceptions(
        org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfEspException param) {
        localExceptionsTracker = param != null;

        this.localExceptions = param;
    }

    public boolean isShowDetailsSpecified() {
        return localShowDetailsTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getShowDetails() {
        return localShowDetails;
    }

    /**
     * Auto generated setter method
     * @param param ShowDetails
     */
    public void setShowDetails(boolean param) {
        // setting primitive attribute tracker to true
        localShowDetailsTracker = true;

        this.localShowDetails = param;
    }

    public boolean isMemThresholdSpecified() {
        return localMemThresholdTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getMemThreshold() {
        return localMemThreshold;
    }

    /**
     * Auto generated setter method
     * @param param MemThreshold
     */
    public void setMemThreshold(int param) {
        // setting primitive attribute tracker to true
        localMemThresholdTracker = param != java.lang.Integer.MIN_VALUE;

        this.localMemThreshold = param;
    }

    public boolean isDiskThresholdSpecified() {
        return localDiskThresholdTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getDiskThreshold() {
        return localDiskThreshold;
    }

    /**
     * Auto generated setter method
     * @param param DiskThreshold
     */
    public void setDiskThreshold(int param) {
        // setting primitive attribute tracker to true
        localDiskThresholdTracker = param != java.lang.Integer.MIN_VALUE;

        this.localDiskThreshold = param;
    }

    public boolean isCpuThresholdSpecified() {
        return localCpuThresholdTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getCpuThreshold() {
        return localCpuThreshold;
    }

    /**
     * Auto generated setter method
     * @param param CpuThreshold
     */
    public void setCpuThreshold(int param) {
        // setting primitive attribute tracker to true
        localCpuThresholdTracker = param != java.lang.Integer.MIN_VALUE;

        this.localCpuThreshold = param;
    }

    public boolean isMemThresholdTypeSpecified() {
        return localMemThresholdTypeTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getMemThresholdType() {
        return localMemThresholdType;
    }

    /**
     * Auto generated setter method
     * @param param MemThresholdType
     */
    public void setMemThresholdType(java.lang.String param) {
        localMemThresholdTypeTracker = param != null;

        this.localMemThresholdType = param;
    }

    public boolean isDiskThresholdTypeSpecified() {
        return localDiskThresholdTypeTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDiskThresholdType() {
        return localDiskThresholdType;
    }

    /**
     * Auto generated setter method
     * @param param DiskThresholdType
     */
    public void setDiskThresholdType(java.lang.String param) {
        localDiskThresholdTypeTracker = param != null;

        this.localDiskThresholdType = param;
    }

    public boolean isPreflightProcessFilterSpecified() {
        return localPreflightProcessFilterTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPreflightProcessFilter() {
        return localPreflightProcessFilter;
    }

    /**
     * Auto generated setter method
     * @param param PreflightProcessFilter
     */
    public void setPreflightProcessFilter(java.lang.String param) {
        localPreflightProcessFilterTracker = param != null;

        this.localPreflightProcessFilter = param;
    }

    public boolean isAcceptLanguageSpecified() {
        return localAcceptLanguageTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getAcceptLanguage() {
        return localAcceptLanguage;
    }

    /**
     * Auto generated setter method
     * @param param AcceptLanguage
     */
    public void setAcceptLanguage(java.lang.String param) {
        localAcceptLanguageTracker = param != null;

        this.localAcceptLanguage = param;
    }

    public boolean isTpTargetClustersSpecified() {
        return localTpTargetClustersTracker;
    }

    /**
     * Auto generated getter method
     * @return org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpTargetCluster
     */
    public org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpTargetCluster getTpTargetClusters() {
        return localTpTargetClusters;
    }

    /**
     * Auto generated setter method
     * @param param TpTargetClusters
     */
    public void setTpTargetClusters(
        org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpTargetCluster param) {
        localTpTargetClustersTracker = param != null;

        this.localTpTargetClusters = param;
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
                    "urn:hpccsystems:ws:wstopology");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":TpTargetClusterQueryResponse", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "TpTargetClusterQueryResponse", xmlWriter);
            }
        }

        if (localExceptionsTracker) {
            if (localExceptions == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Exceptions cannot be null!!");
            }

            localExceptions.serialize(new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wstopology", "Exceptions"), xmlWriter);
        }

        if (localShowDetailsTracker) {
            namespace = "urn:hpccsystems:ws:wstopology";
            writeStartElement(null, namespace, "ShowDetails", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "ShowDetails cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localShowDetails));
            }

            xmlWriter.writeEndElement();
        }

        if (localMemThresholdTracker) {
            namespace = "urn:hpccsystems:ws:wstopology";
            writeStartElement(null, namespace, "MemThreshold", xmlWriter);

            if (localMemThreshold == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "MemThreshold cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localMemThreshold));
            }

            xmlWriter.writeEndElement();
        }

        if (localDiskThresholdTracker) {
            namespace = "urn:hpccsystems:ws:wstopology";
            writeStartElement(null, namespace, "DiskThreshold", xmlWriter);

            if (localDiskThreshold == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "DiskThreshold cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localDiskThreshold));
            }

            xmlWriter.writeEndElement();
        }

        if (localCpuThresholdTracker) {
            namespace = "urn:hpccsystems:ws:wstopology";
            writeStartElement(null, namespace, "CpuThreshold", xmlWriter);

            if (localCpuThreshold == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "CpuThreshold cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localCpuThreshold));
            }

            xmlWriter.writeEndElement();
        }

        if (localMemThresholdTypeTracker) {
            namespace = "urn:hpccsystems:ws:wstopology";
            writeStartElement(null, namespace, "MemThresholdType", xmlWriter);

            if (localMemThresholdType == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "MemThresholdType cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localMemThresholdType);
            }

            xmlWriter.writeEndElement();
        }

        if (localDiskThresholdTypeTracker) {
            namespace = "urn:hpccsystems:ws:wstopology";
            writeStartElement(null, namespace, "DiskThresholdType", xmlWriter);

            if (localDiskThresholdType == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "DiskThresholdType cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localDiskThresholdType);
            }

            xmlWriter.writeEndElement();
        }

        if (localPreflightProcessFilterTracker) {
            namespace = "urn:hpccsystems:ws:wstopology";
            writeStartElement(null, namespace, "PreflightProcessFilter",
                xmlWriter);

            if (localPreflightProcessFilter == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "PreflightProcessFilter cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localPreflightProcessFilter);
            }

            xmlWriter.writeEndElement();
        }

        if (localAcceptLanguageTracker) {
            namespace = "urn:hpccsystems:ws:wstopology";
            writeStartElement(null, namespace, "AcceptLanguage", xmlWriter);

            if (localAcceptLanguage == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "AcceptLanguage cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localAcceptLanguage);
            }

            xmlWriter.writeEndElement();
        }

        if (localTpTargetClustersTracker) {
            if (localTpTargetClusters == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "TpTargetClusters cannot be null!!");
            }

            localTpTargetClusters.serialize(new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wstopology", "TpTargetClusters"),
                xmlWriter);
        }

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("urn:hpccsystems:ws:wstopology")) {
            return "ns5";
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
        public static TpTargetClusterQueryResponse parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            TpTargetClusterQueryResponse object = new TpTargetClusterQueryResponse();

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

                        if (!"TpTargetClusterQueryResponse".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (TpTargetClusterQueryResponse) org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ExtensionMapper.getTypeObject(nsUri,
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
                                    "urn:hpccsystems:ws:wstopology",
                                    "Exceptions").equals(reader.getName())) {
                            object.setExceptions(org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfEspException.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wstopology",
                                    "ShowDetails").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "ShowDetails" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setShowDetails(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wstopology",
                                    "MemThreshold").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "MemThreshold" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setMemThreshold(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wstopology",
                                    "DiskThreshold").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "DiskThreshold" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setDiskThreshold(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wstopology",
                                    "CpuThreshold").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "CpuThreshold" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setCpuThreshold(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wstopology",
                                    "MemThresholdType").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "MemThresholdType" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setMemThresholdType(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wstopology",
                                    "DiskThresholdType").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "DiskThresholdType" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setDiskThresholdType(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wstopology",
                                    "PreflightProcessFilter").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "PreflightProcessFilter" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setPreflightProcessFilter(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wstopology",
                                    "AcceptLanguage").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "AcceptLanguage" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setAcceptLanguage(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wstopology",
                                    "TpTargetClusters").equals(reader.getName())) {
                            object.setTpTargetClusters(org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.ArrayOfTpTargetCluster.Factory.parse(
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

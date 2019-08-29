/**
 * ExecuteSQLRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wssql.v1_05;


/**
 *  ExecuteSQLRequest bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class ExecuteSQLRequest implements org.apache.axis2.databinding.ADBBean {
    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql",
            "ExecuteSQLRequest", "ns9");

    /**
     * field for SqlText
     */
    protected java.lang.String localSqlText;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSqlTextTracker = false;

    /**
     * field for UserName
     */
    protected java.lang.String localUserName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUserNameTracker = false;

    /**
     * field for TargetCluster
     */
    protected java.lang.String localTargetCluster;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTargetClusterTracker = false;

    /**
     * field for AlternateClusters
     */
    protected org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.AlternateClusters_type0 localAlternateClusters;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAlternateClustersTracker = false;

    /**
     * field for TargetQuerySet
     */
    protected java.lang.String localTargetQuerySet;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTargetQuerySetTracker = false;

    /**
     * field for SuppressResults
     */
    protected boolean localSuppressResults;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSuppressResultsTracker = false;

    /**
     * field for SuppressXmlSchema
     */
    protected boolean localSuppressXmlSchema = org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
            "1");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSuppressXmlSchemaTracker = false;

    /**
     * field for Wait
     */
    protected int localWait = org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
            "-1");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localWaitTracker = false;

    /**
     * field for ResultLimit
     */
    protected int localResultLimit;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localResultLimitTracker = false;

    /**
     * field for ResultWindowStart
     */
    protected int localResultWindowStart;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localResultWindowStartTracker = false;

    /**
     * field for ResultWindowCount
     */
    protected int localResultWindowCount;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localResultWindowCountTracker = false;

    /**
     * field for IgnoreCache
     */
    protected boolean localIgnoreCache;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIgnoreCacheTracker = false;

    public boolean isSqlTextSpecified() {
        return localSqlTextTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getSqlText() {
        return localSqlText;
    }

    /**
     * Auto generated setter method
     * @param param SqlText
     */
    public void setSqlText(java.lang.String param) {
        localSqlTextTracker = param != null;

        this.localSqlText = param;
    }

    public boolean isUserNameSpecified() {
        return localUserNameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getUserName() {
        return localUserName;
    }

    /**
     * Auto generated setter method
     * @param param UserName
     */
    public void setUserName(java.lang.String param) {
        localUserNameTracker = param != null;

        this.localUserName = param;
    }

    public boolean isTargetClusterSpecified() {
        return localTargetClusterTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTargetCluster() {
        return localTargetCluster;
    }

    /**
     * Auto generated setter method
     * @param param TargetCluster
     */
    public void setTargetCluster(java.lang.String param) {
        localTargetClusterTracker = param != null;

        this.localTargetCluster = param;
    }

    public boolean isAlternateClustersSpecified() {
        return localAlternateClustersTracker;
    }

    /**
     * Auto generated getter method
     * @return org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.AlternateClusters_type0
     */
    public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.AlternateClusters_type0 getAlternateClusters() {
        return localAlternateClusters;
    }

    /**
     * Auto generated setter method
     * @param param AlternateClusters
     */
    public void setAlternateClusters(
        org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.AlternateClusters_type0 param) {
        localAlternateClustersTracker = param != null;

        this.localAlternateClusters = param;
    }

    public boolean isTargetQuerySetSpecified() {
        return localTargetQuerySetTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTargetQuerySet() {
        return localTargetQuerySet;
    }

    /**
     * Auto generated setter method
     * @param param TargetQuerySet
     */
    public void setTargetQuerySet(java.lang.String param) {
        localTargetQuerySetTracker = param != null;

        this.localTargetQuerySet = param;
    }

    public boolean isSuppressResultsSpecified() {
        return localSuppressResultsTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getSuppressResults() {
        return localSuppressResults;
    }

    /**
     * Auto generated setter method
     * @param param SuppressResults
     */
    public void setSuppressResults(boolean param) {
        // setting primitive attribute tracker to true
        localSuppressResultsTracker = true;

        this.localSuppressResults = param;
    }

    public boolean isSuppressXmlSchemaSpecified() {
        return localSuppressXmlSchemaTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getSuppressXmlSchema() {
        return localSuppressXmlSchema;
    }

    /**
     * Auto generated setter method
     * @param param SuppressXmlSchema
     */
    public void setSuppressXmlSchema(boolean param) {
        // setting primitive attribute tracker to true
        localSuppressXmlSchemaTracker = true;

        this.localSuppressXmlSchema = param;
    }

    public boolean isWaitSpecified() {
        return localWaitTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getWait() {
        return localWait;
    }

    /**
     * Auto generated setter method
     * @param param Wait
     */
    public void setWait(int param) {
        // setting primitive attribute tracker to true
        localWaitTracker = param != java.lang.Integer.MIN_VALUE;

        this.localWait = param;
    }

    public boolean isResultLimitSpecified() {
        return localResultLimitTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getResultLimit() {
        return localResultLimit;
    }

    /**
     * Auto generated setter method
     * @param param ResultLimit
     */
    public void setResultLimit(int param) {
        // setting primitive attribute tracker to true
        localResultLimitTracker = param != java.lang.Integer.MIN_VALUE;

        this.localResultLimit = param;
    }

    public boolean isResultWindowStartSpecified() {
        return localResultWindowStartTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getResultWindowStart() {
        return localResultWindowStart;
    }

    /**
     * Auto generated setter method
     * @param param ResultWindowStart
     */
    public void setResultWindowStart(int param) {
        // setting primitive attribute tracker to true
        localResultWindowStartTracker = param != java.lang.Integer.MIN_VALUE;

        this.localResultWindowStart = param;
    }

    public boolean isResultWindowCountSpecified() {
        return localResultWindowCountTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getResultWindowCount() {
        return localResultWindowCount;
    }

    /**
     * Auto generated setter method
     * @param param ResultWindowCount
     */
    public void setResultWindowCount(int param) {
        // setting primitive attribute tracker to true
        localResultWindowCountTracker = param != java.lang.Integer.MIN_VALUE;

        this.localResultWindowCount = param;
    }

    public boolean isIgnoreCacheSpecified() {
        return localIgnoreCacheTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getIgnoreCache() {
        return localIgnoreCache;
    }

    /**
     * Auto generated setter method
     * @param param IgnoreCache
     */
    public void setIgnoreCache(boolean param) {
        // setting primitive attribute tracker to true
        localIgnoreCacheTracker = true;

        this.localIgnoreCache = param;
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
                    "urn:hpccsystems:ws:wssql");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":ExecuteSQLRequest", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "ExecuteSQLRequest", xmlWriter);
            }
        }

        if (localSqlTextTracker) {
            namespace = "urn:hpccsystems:ws:wssql";
            writeStartElement(null, namespace, "SqlText", xmlWriter);

            if (localSqlText == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "SqlText cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSqlText);
            }

            xmlWriter.writeEndElement();
        }

        if (localUserNameTracker) {
            namespace = "urn:hpccsystems:ws:wssql";
            writeStartElement(null, namespace, "UserName", xmlWriter);

            if (localUserName == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "UserName cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localUserName);
            }

            xmlWriter.writeEndElement();
        }

        if (localTargetClusterTracker) {
            namespace = "urn:hpccsystems:ws:wssql";
            writeStartElement(null, namespace, "TargetCluster", xmlWriter);

            if (localTargetCluster == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "TargetCluster cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localTargetCluster);
            }

            xmlWriter.writeEndElement();
        }

        if (localAlternateClustersTracker) {
            if (localAlternateClusters == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "AlternateClusters cannot be null!!");
            }

            localAlternateClusters.serialize(new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wssql", "AlternateClusters"), xmlWriter);
        }

        if (localTargetQuerySetTracker) {
            namespace = "urn:hpccsystems:ws:wssql";
            writeStartElement(null, namespace, "TargetQuerySet", xmlWriter);

            if (localTargetQuerySet == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "TargetQuerySet cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localTargetQuerySet);
            }

            xmlWriter.writeEndElement();
        }

        if (localSuppressResultsTracker) {
            namespace = "urn:hpccsystems:ws:wssql";
            writeStartElement(null, namespace, "SuppressResults", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "SuppressResults cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localSuppressResults));
            }

            xmlWriter.writeEndElement();
        }

        if (localSuppressXmlSchemaTracker) {
            namespace = "urn:hpccsystems:ws:wssql";
            writeStartElement(null, namespace, "SuppressXmlSchema", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "SuppressXmlSchema cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localSuppressXmlSchema));
            }

            xmlWriter.writeEndElement();
        }

        if (localWaitTracker) {
            namespace = "urn:hpccsystems:ws:wssql";
            writeStartElement(null, namespace, "Wait", xmlWriter);

            if (localWait == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Wait cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localWait));
            }

            xmlWriter.writeEndElement();
        }

        if (localResultLimitTracker) {
            namespace = "urn:hpccsystems:ws:wssql";
            writeStartElement(null, namespace, "resultLimit", xmlWriter);

            if (localResultLimit == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "resultLimit cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localResultLimit));
            }

            xmlWriter.writeEndElement();
        }

        if (localResultWindowStartTracker) {
            namespace = "urn:hpccsystems:ws:wssql";
            writeStartElement(null, namespace, "ResultWindowStart", xmlWriter);

            if (localResultWindowStart == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "ResultWindowStart cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localResultWindowStart));
            }

            xmlWriter.writeEndElement();
        }

        if (localResultWindowCountTracker) {
            namespace = "urn:hpccsystems:ws:wssql";
            writeStartElement(null, namespace, "ResultWindowCount", xmlWriter);

            if (localResultWindowCount == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "ResultWindowCount cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localResultWindowCount));
            }

            xmlWriter.writeEndElement();
        }

        if (localIgnoreCacheTracker) {
            namespace = "urn:hpccsystems:ws:wssql";
            writeStartElement(null, namespace, "IgnoreCache", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "IgnoreCache cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localIgnoreCache));
            }

            xmlWriter.writeEndElement();
        }

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("urn:hpccsystems:ws:wssql")) {
            return "ns9";
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
        public static ExecuteSQLRequest parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            ExecuteSQLRequest object = new ExecuteSQLRequest();

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

                        if (!"ExecuteSQLRequest".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (ExecuteSQLRequest) org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ExtensionMapper.getTypeObject(nsUri,
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
                                    "urn:hpccsystems:ws:wssql", "SqlText").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "SqlText" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setSqlText(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wssql", "UserName").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "UserName" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setUserName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wssql", "TargetCluster").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "TargetCluster" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setTargetCluster(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wssql",
                                    "AlternateClusters").equals(
                                    reader.getName())) {
                            object.setAlternateClusters(org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.AlternateClusters_type0.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wssql", "TargetQuerySet").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "TargetQuerySet" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setTargetQuerySet(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wssql",
                                    "SuppressResults").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "SuppressResults" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setSuppressResults(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wssql",
                                    "SuppressXmlSchema").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "SuppressXmlSchema" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setSuppressXmlSchema(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wssql", "Wait").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Wait" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setWait(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wssql", "resultLimit").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "resultLimit" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setResultLimit(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wssql",
                                    "ResultWindowStart").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "ResultWindowStart" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setResultWindowStart(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wssql",
                                    "ResultWindowCount").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "ResultWindowCount" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setResultWindowCount(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wssql", "IgnoreCache").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "IgnoreCache" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setIgnoreCache(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
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

/**
 * WUQuerySetDetailsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69;


/**
 *  WUQuerySetDetailsResponse bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class WUQuerySetDetailsResponse implements org.apache.axis2.databinding.ADBBean {
    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits",
            "WUQuerySetDetailsResponse", "ns8");

    /**
     * field for Exceptions
     */
    protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ArrayOfEspException localExceptions;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localExceptionsTracker = false;

    /**
     * field for QuerySetName
     */
    protected java.lang.String localQuerySetName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localQuerySetNameTracker = false;

    /**
     * field for QuerysetQueries
     */
    protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ArrayOfQuerySetQuery localQuerysetQueries;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localQuerysetQueriesTracker = false;

    /**
     * field for QuerysetAliases
     */
    protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ArrayOfQuerySetAlias localQuerysetAliases;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localQuerysetAliasesTracker = false;

    /**
     * field for ClusterName
     */
    protected java.lang.String localClusterName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localClusterNameTracker = false;

    /**
     * field for Filter
     */
    protected java.lang.String localFilter;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFilterTracker = false;

    /**
     * field for FilterType
     */
    protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerySetFilterType localFilterType;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFilterTypeTracker = false;

    /**
     * field for ClusterNames
     */
    protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspStringArray localClusterNames;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localClusterNamesTracker = false;

    public boolean isExceptionsSpecified() {
        return localExceptionsTracker;
    }

    /**
     * Auto generated getter method
     * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ArrayOfEspException
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ArrayOfEspException getExceptions() {
        return localExceptions;
    }

    /**
     * Auto generated setter method
     * @param param Exceptions
     */
    public void setExceptions(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ArrayOfEspException param) {
        localExceptionsTracker = param != null;

        this.localExceptions = param;
    }

    public boolean isQuerySetNameSpecified() {
        return localQuerySetNameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getQuerySetName() {
        return localQuerySetName;
    }

    /**
     * Auto generated setter method
     * @param param QuerySetName
     */
    public void setQuerySetName(java.lang.String param) {
        localQuerySetNameTracker = param != null;

        this.localQuerySetName = param;
    }

    public boolean isQuerysetQueriesSpecified() {
        return localQuerysetQueriesTracker;
    }

    /**
     * Auto generated getter method
     * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ArrayOfQuerySetQuery
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ArrayOfQuerySetQuery getQuerysetQueries() {
        return localQuerysetQueries;
    }

    /**
     * Auto generated setter method
     * @param param QuerysetQueries
     */
    public void setQuerysetQueries(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ArrayOfQuerySetQuery param) {
        localQuerysetQueriesTracker = param != null;

        this.localQuerysetQueries = param;
    }

    public boolean isQuerysetAliasesSpecified() {
        return localQuerysetAliasesTracker;
    }

    /**
     * Auto generated getter method
     * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ArrayOfQuerySetAlias
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ArrayOfQuerySetAlias getQuerysetAliases() {
        return localQuerysetAliases;
    }

    /**
     * Auto generated setter method
     * @param param QuerysetAliases
     */
    public void setQuerysetAliases(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ArrayOfQuerySetAlias param) {
        localQuerysetAliasesTracker = param != null;

        this.localQuerysetAliases = param;
    }

    public boolean isClusterNameSpecified() {
        return localClusterNameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getClusterName() {
        return localClusterName;
    }

    /**
     * Auto generated setter method
     * @param param ClusterName
     */
    public void setClusterName(java.lang.String param) {
        localClusterNameTracker = param != null;

        this.localClusterName = param;
    }

    public boolean isFilterSpecified() {
        return localFilterTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getFilter() {
        return localFilter;
    }

    /**
     * Auto generated setter method
     * @param param Filter
     */
    public void setFilter(java.lang.String param) {
        localFilterTracker = param != null;

        this.localFilter = param;
    }

    public boolean isFilterTypeSpecified() {
        return localFilterTypeTracker;
    }

    /**
     * Auto generated getter method
     * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerySetFilterType
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerySetFilterType getFilterType() {
        return localFilterType;
    }

    /**
     * Auto generated setter method
     * @param param FilterType
     */
    public void setFilterType(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerySetFilterType param) {
        localFilterTypeTracker = param != null;

        this.localFilterType = param;
    }

    public boolean isClusterNamesSpecified() {
        return localClusterNamesTracker;
    }

    /**
     * Auto generated getter method
     * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspStringArray
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspStringArray getClusterNames() {
        return localClusterNames;
    }

    /**
     * Auto generated setter method
     * @param param ClusterNames
     */
    public void setClusterNames(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspStringArray param) {
        localClusterNamesTracker = param != null;

        this.localClusterNames = param;
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
                    namespacePrefix + ":WUQuerySetDetailsResponse", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "WUQuerySetDetailsResponse", xmlWriter);
            }
        }

        if (localExceptionsTracker) {
            if (localExceptions == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Exceptions cannot be null!!");
            }

            localExceptions.serialize(new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Exceptions"), xmlWriter);
        }

        if (localQuerySetNameTracker) {
            namespace = "urn:hpccsystems:ws:wsworkunits";
            writeStartElement(null, namespace, "QuerySetName", xmlWriter);

            if (localQuerySetName == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "QuerySetName cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localQuerySetName);
            }

            xmlWriter.writeEndElement();
        }

        if (localQuerysetQueriesTracker) {
            if (localQuerysetQueries == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "QuerysetQueries cannot be null!!");
            }

            localQuerysetQueries.serialize(new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "QuerysetQueries"),
                xmlWriter);
        }

        if (localQuerysetAliasesTracker) {
            if (localQuerysetAliases == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "QuerysetAliases cannot be null!!");
            }

            localQuerysetAliases.serialize(new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "QuerysetAliases"),
                xmlWriter);
        }

        if (localClusterNameTracker) {
            namespace = "urn:hpccsystems:ws:wsworkunits";
            writeStartElement(null, namespace, "ClusterName", xmlWriter);

            if (localClusterName == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "ClusterName cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localClusterName);
            }

            xmlWriter.writeEndElement();
        }

        if (localFilterTracker) {
            namespace = "urn:hpccsystems:ws:wsworkunits";
            writeStartElement(null, namespace, "Filter", xmlWriter);

            if (localFilter == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Filter cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localFilter);
            }

            xmlWriter.writeEndElement();
        }

        if (localFilterTypeTracker) {
            if (localFilterType == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "FilterType cannot be null!!");
            }

            localFilterType.serialize(new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "FilterType"), xmlWriter);
        }

        if (localClusterNamesTracker) {
            if (localClusterNames == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "ClusterNames cannot be null!!");
            }

            localClusterNames.serialize(new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "ClusterNames"), xmlWriter);
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
        public static WUQuerySetDetailsResponse parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            WUQuerySetDetailsResponse object = new WUQuerySetDetailsResponse();

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

                        if (!"WUQuerySetDetailsResponse".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (WUQuerySetDetailsResponse) org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ExtensionMapper.getTypeObject(nsUri,
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
                                    "urn:hpccsystems:ws:wsworkunits",
                                    "Exceptions").equals(reader.getName())) {
                            object.setExceptions(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ArrayOfEspException.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsworkunits",
                                    "QuerySetName").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "QuerySetName" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setQuerySetName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsworkunits",
                                    "QuerysetQueries").equals(reader.getName())) {
                            object.setQuerysetQueries(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ArrayOfQuerySetQuery.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsworkunits",
                                    "QuerysetAliases").equals(reader.getName())) {
                            object.setQuerysetAliases(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ArrayOfQuerySetAlias.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsworkunits",
                                    "ClusterName").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "ClusterName" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setClusterName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsworkunits", "Filter").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Filter" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setFilter(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsworkunits",
                                    "FilterType").equals(reader.getName())) {
                            object.setFilterType(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerySetFilterType.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsworkunits",
                                    "ClusterNames").equals(reader.getName())) {
                            object.setClusterNames(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspStringArray.Factory.parse(
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

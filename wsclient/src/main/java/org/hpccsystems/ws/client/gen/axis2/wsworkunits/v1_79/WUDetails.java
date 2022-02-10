/**
 * WUDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79;


/**
 *  WUDetails bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class WUDetails implements org.apache.axis2.databinding.ADBBean {
    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits",
            "WUDetails", "ns8");

    /**
     * field for WUID
     */
    protected java.lang.String localWUID;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localWUIDTracker = false;

    /**
     * field for ScopeFilter
     */
    protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUScopeFilter localScopeFilter;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localScopeFilterTracker = false;

    /**
     * field for NestedFilter
     */
    protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUNestedFilter localNestedFilter;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNestedFilterTracker = false;

    /**
     * field for PropertiesToReturn
     */
    protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUPropertiesToReturn localPropertiesToReturn;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPropertiesToReturnTracker = false;

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
     * field for ScopeOptions
     */
    protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUScopeOptions localScopeOptions;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localScopeOptionsTracker = false;

    /**
     * field for PropertyOptions
     */
    protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUPropertyOptions localPropertyOptions;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPropertyOptionsTracker = false;

    public boolean isWUIDSpecified() {
        return localWUIDTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getWUID() {
        return localWUID;
    }

    /**
     * Auto generated setter method
     * @param param WUID
     */
    public void setWUID(java.lang.String param) {
        localWUIDTracker = param != null;

        this.localWUID = param;
    }

    public boolean isScopeFilterSpecified() {
        return localScopeFilterTracker;
    }

    /**
     * Auto generated getter method
     * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUScopeFilter
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUScopeFilter getScopeFilter() {
        return localScopeFilter;
    }

    /**
     * Auto generated setter method
     * @param param ScopeFilter
     */
    public void setScopeFilter(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUScopeFilter param) {
        localScopeFilterTracker = param != null;

        this.localScopeFilter = param;
    }

    public boolean isNestedFilterSpecified() {
        return localNestedFilterTracker;
    }

    /**
     * Auto generated getter method
     * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUNestedFilter
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUNestedFilter getNestedFilter() {
        return localNestedFilter;
    }

    /**
     * Auto generated setter method
     * @param param NestedFilter
     */
    public void setNestedFilter(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUNestedFilter param) {
        localNestedFilterTracker = param != null;

        this.localNestedFilter = param;
    }

    public boolean isPropertiesToReturnSpecified() {
        return localPropertiesToReturnTracker;
    }

    /**
     * Auto generated getter method
     * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUPropertiesToReturn
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUPropertiesToReturn getPropertiesToReturn() {
        return localPropertiesToReturn;
    }

    /**
     * Auto generated setter method
     * @param param PropertiesToReturn
     */
    public void setPropertiesToReturn(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUPropertiesToReturn param) {
        localPropertiesToReturnTracker = param != null;

        this.localPropertiesToReturn = param;
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

    public boolean isScopeOptionsSpecified() {
        return localScopeOptionsTracker;
    }

    /**
     * Auto generated getter method
     * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUScopeOptions
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUScopeOptions getScopeOptions() {
        return localScopeOptions;
    }

    /**
     * Auto generated setter method
     * @param param ScopeOptions
     */
    public void setScopeOptions(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUScopeOptions param) {
        localScopeOptionsTracker = param != null;

        this.localScopeOptions = param;
    }

    public boolean isPropertyOptionsSpecified() {
        return localPropertyOptionsTracker;
    }

    /**
     * Auto generated getter method
     * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUPropertyOptions
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUPropertyOptions getPropertyOptions() {
        return localPropertyOptions;
    }

    /**
     * Auto generated setter method
     * @param param PropertyOptions
     */
    public void setPropertyOptions(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUPropertyOptions param) {
        localPropertyOptionsTracker = param != null;

        this.localPropertyOptions = param;
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
                    namespacePrefix + ":WUDetails", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "WUDetails", xmlWriter);
            }
        }

        if (localWUIDTracker) {
            namespace = "urn:hpccsystems:ws:wsworkunits";
            writeStartElement(null, namespace, "WUID", xmlWriter);

            if (localWUID == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "WUID cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localWUID);
            }

            xmlWriter.writeEndElement();
        }

        if (localScopeFilterTracker) {
            if (localScopeFilter == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "ScopeFilter cannot be null!!");
            }

            localScopeFilter.serialize(new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "ScopeFilter"), xmlWriter);
        }

        if (localNestedFilterTracker) {
            if (localNestedFilter == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "NestedFilter cannot be null!!");
            }

            localNestedFilter.serialize(new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "NestedFilter"), xmlWriter);
        }

        if (localPropertiesToReturnTracker) {
            if (localPropertiesToReturn == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "PropertiesToReturn cannot be null!!");
            }

            localPropertiesToReturn.serialize(new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "PropertiesToReturn"),
                xmlWriter);
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

        if (localScopeOptionsTracker) {
            if (localScopeOptions == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "ScopeOptions cannot be null!!");
            }

            localScopeOptions.serialize(new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "ScopeOptions"), xmlWriter);
        }

        if (localPropertyOptionsTracker) {
            if (localPropertyOptions == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "PropertyOptions cannot be null!!");
            }

            localPropertyOptions.serialize(new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "PropertyOptions"),
                xmlWriter);
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
        public static WUDetails parse(javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {
            WUDetails object = new WUDetails();

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

                        if (!"WUDetails".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (WUDetails) org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.ExtensionMapper.getTypeObject(nsUri,
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
                                    "urn:hpccsystems:ws:wsworkunits", "WUID").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "WUID" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setWUID(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsworkunits",
                                    "ScopeFilter").equals(reader.getName())) {
                            object.setScopeFilter(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUScopeFilter.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsworkunits",
                                    "NestedFilter").equals(reader.getName())) {
                            object.setNestedFilter(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUNestedFilter.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsworkunits",
                                    "PropertiesToReturn").equals(
                                    reader.getName())) {
                            object.setPropertiesToReturn(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUPropertiesToReturn.Factory.parse(
                                    reader));

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
                                    "ScopeOptions").equals(reader.getName())) {
                            object.setScopeOptions(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUScopeOptions.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsworkunits",
                                    "PropertyOptions").equals(reader.getName())) {
                            object.setPropertyOptions(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUPropertyOptions.Factory.parse(
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
/**
 * WUInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58;


/**
 *  WUInfoResponse bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class WUInfoResponse implements org.apache.axis2.databinding.ADBBean {
    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits",
            "WUInfoResponse", "ns8");

    /**
     * field for Exceptions
     */
    protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ArrayOfEspException localExceptions;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localExceptionsTracker = false;

    /**
     * field for Workunit
     */
    protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ECLWorkunit localWorkunit;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localWorkunitTracker = false;

    /**
     * field for AutoRefresh
     */
    protected int localAutoRefresh;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAutoRefreshTracker = false;

    /**
     * field for CanCompile
     */
    protected boolean localCanCompile;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCanCompileTracker = false;

    /**
     * field for ThorSlaveIP
     */
    protected java.lang.String localThorSlaveIP;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localThorSlaveIPTracker = false;

    /**
     * field for ResultViews
     */
    protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ResultViews_type0 localResultViews;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localResultViewsTracker = false;

    /**
     * field for SecMethod
     */
    protected java.lang.String localSecMethod;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSecMethodTracker = false;

    public boolean isExceptionsSpecified() {
        return localExceptionsTracker;
    }

    /**
     * Auto generated getter method
     * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ArrayOfEspException
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ArrayOfEspException getExceptions() {
        return localExceptions;
    }

    /**
     * Auto generated setter method
     * @param param Exceptions
     */
    public void setExceptions(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ArrayOfEspException param) {
        localExceptionsTracker = param != null;

        this.localExceptions = param;
    }

    public boolean isWorkunitSpecified() {
        return localWorkunitTracker;
    }

    /**
     * Auto generated getter method
     * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ECLWorkunit
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ECLWorkunit getWorkunit() {
        return localWorkunit;
    }

    /**
     * Auto generated setter method
     * @param param Workunit
     */
    public void setWorkunit(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ECLWorkunit param) {
        localWorkunitTracker = param != null;

        this.localWorkunit = param;
    }

    public boolean isAutoRefreshSpecified() {
        return localAutoRefreshTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getAutoRefresh() {
        return localAutoRefresh;
    }

    /**
     * Auto generated setter method
     * @param param AutoRefresh
     */
    public void setAutoRefresh(int param) {
        // setting primitive attribute tracker to true
        localAutoRefreshTracker = param != java.lang.Integer.MIN_VALUE;

        this.localAutoRefresh = param;
    }

    public boolean isCanCompileSpecified() {
        return localCanCompileTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getCanCompile() {
        return localCanCompile;
    }

    /**
     * Auto generated setter method
     * @param param CanCompile
     */
    public void setCanCompile(boolean param) {
        // setting primitive attribute tracker to true
        localCanCompileTracker = true;

        this.localCanCompile = param;
    }

    public boolean isThorSlaveIPSpecified() {
        return localThorSlaveIPTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getThorSlaveIP() {
        return localThorSlaveIP;
    }

    /**
     * Auto generated setter method
     * @param param ThorSlaveIP
     */
    public void setThorSlaveIP(java.lang.String param) {
        localThorSlaveIPTracker = param != null;

        this.localThorSlaveIP = param;
    }

    public boolean isResultViewsSpecified() {
        return localResultViewsTracker;
    }

    /**
     * Auto generated getter method
     * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ResultViews_type0
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ResultViews_type0 getResultViews() {
        return localResultViews;
    }

    /**
     * Auto generated setter method
     * @param param ResultViews
     */
    public void setResultViews(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ResultViews_type0 param) {
        localResultViewsTracker = param != null;

        this.localResultViews = param;
    }

    public boolean isSecMethodSpecified() {
        return localSecMethodTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getSecMethod() {
        return localSecMethod;
    }

    /**
     * Auto generated setter method
     * @param param SecMethod
     */
    public void setSecMethod(java.lang.String param) {
        localSecMethodTracker = param != null;

        this.localSecMethod = param;
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
                    namespacePrefix + ":WUInfoResponse", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "WUInfoResponse", xmlWriter);
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

        if (localWorkunitTracker) {
            if (localWorkunit == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Workunit cannot be null!!");
            }

            localWorkunit.serialize(new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "Workunit"), xmlWriter);
        }

        if (localAutoRefreshTracker) {
            namespace = "urn:hpccsystems:ws:wsworkunits";
            writeStartElement(null, namespace, "AutoRefresh", xmlWriter);

            if (localAutoRefresh == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "AutoRefresh cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localAutoRefresh));
            }

            xmlWriter.writeEndElement();
        }

        if (localCanCompileTracker) {
            namespace = "urn:hpccsystems:ws:wsworkunits";
            writeStartElement(null, namespace, "CanCompile", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "CanCompile cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localCanCompile));
            }

            xmlWriter.writeEndElement();
        }

        if (localThorSlaveIPTracker) {
            namespace = "urn:hpccsystems:ws:wsworkunits";
            writeStartElement(null, namespace, "ThorSlaveIP", xmlWriter);

            if (localThorSlaveIP == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "ThorSlaveIP cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localThorSlaveIP);
            }

            xmlWriter.writeEndElement();
        }

        if (localResultViewsTracker) {
            if (localResultViews == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "ResultViews cannot be null!!");
            }

            localResultViews.serialize(new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsworkunits", "ResultViews"), xmlWriter);
        }

        if (localSecMethodTracker) {
            namespace = "urn:hpccsystems:ws:wsworkunits";
            writeStartElement(null, namespace, "SecMethod", xmlWriter);

            if (localSecMethod == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "SecMethod cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSecMethod);
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
        public static WUInfoResponse parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            WUInfoResponse object = new WUInfoResponse();

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

                        if (!"WUInfoResponse".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (WUInfoResponse) org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ExtensionMapper.getTypeObject(nsUri,
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
                            object.setExceptions(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ArrayOfEspException.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsworkunits", "Workunit").equals(
                                    reader.getName())) {
                            object.setWorkunit(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ECLWorkunit.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsworkunits",
                                    "AutoRefresh").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "AutoRefresh" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setAutoRefresh(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsworkunits",
                                    "CanCompile").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "CanCompile" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setCanCompile(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsworkunits",
                                    "ThorSlaveIP").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "ThorSlaveIP" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setThorSlaveIP(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsworkunits",
                                    "ResultViews").equals(reader.getName())) {
                            object.setResultViews(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ResultViews_type0.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsworkunits",
                                    "SecMethod").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "SecMethod" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setSecMethod(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
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

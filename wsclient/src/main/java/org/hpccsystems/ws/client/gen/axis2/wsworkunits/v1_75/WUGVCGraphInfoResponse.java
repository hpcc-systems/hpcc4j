/**
 * WUGVCGraphInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75;


/**
 *  WUGVCGraphInfoResponse bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class WUGVCGraphInfoResponse implements org.apache.axis2.databinding.ADBBean {
    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits",
            "WUGVCGraphInfoResponse", "ns8");

    /**
     * field for Exceptions
     */
    protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfEspException localExceptions;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localExceptionsTracker = false;

    /**
     * field for Wuid
     */
    protected java.lang.String localWuid;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localWuidTracker = false;

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
     * field for GID
     */
    protected java.lang.String localGID;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localGIDTracker = false;

    /**
     * field for Running
     */
    protected boolean localRunning;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRunningTracker = false;

    /**
     * field for TheGraph
     */
    protected java.lang.String localTheGraph;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTheGraphTracker = false;

    /**
     * field for BatchWU
     */
    protected int localBatchWU;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBatchWUTracker = false;

    public boolean isExceptionsSpecified() {
        return localExceptionsTracker;
    }

    /**
     * Auto generated getter method
     * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfEspException
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfEspException getExceptions() {
        return localExceptions;
    }

    /**
     * Auto generated setter method
     * @param param Exceptions
     */
    public void setExceptions(
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfEspException param) {
        localExceptionsTracker = param != null;

        this.localExceptions = param;
    }

    public boolean isWuidSpecified() {
        return localWuidTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getWuid() {
        return localWuid;
    }

    /**
     * Auto generated setter method
     * @param param Wuid
     */
    public void setWuid(java.lang.String param) {
        localWuidTracker = param != null;

        this.localWuid = param;
    }

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

    public boolean isGIDSpecified() {
        return localGIDTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getGID() {
        return localGID;
    }

    /**
     * Auto generated setter method
     * @param param GID
     */
    public void setGID(java.lang.String param) {
        localGIDTracker = param != null;

        this.localGID = param;
    }

    public boolean isRunningSpecified() {
        return localRunningTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getRunning() {
        return localRunning;
    }

    /**
     * Auto generated setter method
     * @param param Running
     */
    public void setRunning(boolean param) {
        // setting primitive attribute tracker to true
        localRunningTracker = true;

        this.localRunning = param;
    }

    public boolean isTheGraphSpecified() {
        return localTheGraphTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTheGraph() {
        return localTheGraph;
    }

    /**
     * Auto generated setter method
     * @param param TheGraph
     */
    public void setTheGraph(java.lang.String param) {
        localTheGraphTracker = param != null;

        this.localTheGraph = param;
    }

    public boolean isBatchWUSpecified() {
        return localBatchWUTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getBatchWU() {
        return localBatchWU;
    }

    /**
     * Auto generated setter method
     * @param param BatchWU
     */
    public void setBatchWU(int param) {
        // setting primitive attribute tracker to true
        localBatchWUTracker = param != java.lang.Integer.MIN_VALUE;

        this.localBatchWU = param;
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
                    namespacePrefix + ":WUGVCGraphInfoResponse", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "WUGVCGraphInfoResponse", xmlWriter);
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

        if (localWuidTracker) {
            namespace = "urn:hpccsystems:ws:wsworkunits";
            writeStartElement(null, namespace, "Wuid", xmlWriter);

            if (localWuid == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Wuid cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localWuid);
            }

            xmlWriter.writeEndElement();
        }

        if (localNameTracker) {
            namespace = "urn:hpccsystems:ws:wsworkunits";
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

        if (localGIDTracker) {
            namespace = "urn:hpccsystems:ws:wsworkunits";
            writeStartElement(null, namespace, "GID", xmlWriter);

            if (localGID == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "GID cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localGID);
            }

            xmlWriter.writeEndElement();
        }

        if (localRunningTracker) {
            namespace = "urn:hpccsystems:ws:wsworkunits";
            writeStartElement(null, namespace, "Running", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Running cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localRunning));
            }

            xmlWriter.writeEndElement();
        }

        if (localTheGraphTracker) {
            namespace = "urn:hpccsystems:ws:wsworkunits";
            writeStartElement(null, namespace, "TheGraph", xmlWriter);

            if (localTheGraph == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "TheGraph cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localTheGraph);
            }

            xmlWriter.writeEndElement();
        }

        if (localBatchWUTracker) {
            namespace = "urn:hpccsystems:ws:wsworkunits";
            writeStartElement(null, namespace, "BatchWU", xmlWriter);

            if (localBatchWU == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "BatchWU cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localBatchWU));
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
        public static WUGVCGraphInfoResponse parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            WUGVCGraphInfoResponse object = new WUGVCGraphInfoResponse();

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

                        if (!"WUGVCGraphInfoResponse".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (WUGVCGraphInfoResponse) org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ExtensionMapper.getTypeObject(nsUri,
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
                            object.setExceptions(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfEspException.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsworkunits", "Wuid").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Wuid" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setWuid(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsworkunits", "Name").equals(
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
                                    "urn:hpccsystems:ws:wsworkunits", "GID").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "GID" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setGID(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsworkunits", "Running").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Running" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setRunning(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsworkunits", "TheGraph").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "TheGraph" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setTheGraph(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsworkunits", "BatchWU").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "BatchWU" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setBatchWU(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
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

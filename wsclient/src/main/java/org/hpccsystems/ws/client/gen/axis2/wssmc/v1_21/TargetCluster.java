/**
 * TargetCluster.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21;


/**
 *  TargetCluster bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class TargetCluster implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = TargetCluster
       Namespace URI = urn:hpccsystems:ws:wssmc
       Namespace Prefix = ns6
     */

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
     * field for QueueName
     */
    protected java.lang.String localQueueName;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localQueueNameTracker = false;

    /**
     * field for QueueStatus
     */
    protected java.lang.String localQueueStatus;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localQueueStatusTracker = false;

    /**
     * field for StatusDetails
     */
    protected java.lang.String localStatusDetails;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localStatusDetailsTracker = false;

    /**
     * field for Warning
     */
    protected java.lang.String localWarning;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localWarningTracker = false;

    /**
     * field for ClusterType
     */
    protected int localClusterType;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localClusterTypeTracker = false;

    /**
     * field for ClusterSize
     */
    protected int localClusterSize;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localClusterSizeTracker = false;

    /**
     * field for ClusterStatus
     */
    protected int localClusterStatus;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localClusterStatusTracker = false;

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

    public boolean isQueueNameSpecified() {
        return localQueueNameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getQueueName() {
        return localQueueName;
    }

    /**
     * Auto generated setter method
     * @param param QueueName
     */
    public void setQueueName(java.lang.String param) {
        localQueueNameTracker = param != null;

        this.localQueueName = param;
    }

    public boolean isQueueStatusSpecified() {
        return localQueueStatusTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getQueueStatus() {
        return localQueueStatus;
    }

    /**
     * Auto generated setter method
     * @param param QueueStatus
     */
    public void setQueueStatus(java.lang.String param) {
        localQueueStatusTracker = param != null;

        this.localQueueStatus = param;
    }

    public boolean isStatusDetailsSpecified() {
        return localStatusDetailsTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getStatusDetails() {
        return localStatusDetails;
    }

    /**
     * Auto generated setter method
     * @param param StatusDetails
     */
    public void setStatusDetails(java.lang.String param) {
        localStatusDetailsTracker = param != null;

        this.localStatusDetails = param;
    }

    public boolean isWarningSpecified() {
        return localWarningTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getWarning() {
        return localWarning;
    }

    /**
     * Auto generated setter method
     * @param param Warning
     */
    public void setWarning(java.lang.String param) {
        localWarningTracker = param != null;

        this.localWarning = param;
    }

    public boolean isClusterTypeSpecified() {
        return localClusterTypeTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getClusterType() {
        return localClusterType;
    }

    /**
     * Auto generated setter method
     * @param param ClusterType
     */
    public void setClusterType(int param) {
        // setting primitive attribute tracker to true
        localClusterTypeTracker = param != java.lang.Integer.MIN_VALUE;

        this.localClusterType = param;
    }

    public boolean isClusterSizeSpecified() {
        return localClusterSizeTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getClusterSize() {
        return localClusterSize;
    }

    /**
     * Auto generated setter method
     * @param param ClusterSize
     */
    public void setClusterSize(int param) {
        // setting primitive attribute tracker to true
        localClusterSizeTracker = param != java.lang.Integer.MIN_VALUE;

        this.localClusterSize = param;
    }

    public boolean isClusterStatusSpecified() {
        return localClusterStatusTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getClusterStatus() {
        return localClusterStatus;
    }

    /**
     * Auto generated setter method
     * @param param ClusterStatus
     */
    public void setClusterStatus(int param) {
        // setting primitive attribute tracker to true
        localClusterStatusTracker = param != java.lang.Integer.MIN_VALUE;

        this.localClusterStatus = param;
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
                    "urn:hpccsystems:ws:wssmc");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":TargetCluster", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "TargetCluster", xmlWriter);
            }
        }

        if (localClusterNameTracker) {
            namespace = "urn:hpccsystems:ws:wssmc";
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

        if (localQueueNameTracker) {
            namespace = "urn:hpccsystems:ws:wssmc";
            writeStartElement(null, namespace, "QueueName", xmlWriter);

            if (localQueueName == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "QueueName cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localQueueName);
            }

            xmlWriter.writeEndElement();
        }

        if (localQueueStatusTracker) {
            namespace = "urn:hpccsystems:ws:wssmc";
            writeStartElement(null, namespace, "QueueStatus", xmlWriter);

            if (localQueueStatus == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "QueueStatus cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localQueueStatus);
            }

            xmlWriter.writeEndElement();
        }

        if (localStatusDetailsTracker) {
            namespace = "urn:hpccsystems:ws:wssmc";
            writeStartElement(null, namespace, "StatusDetails", xmlWriter);

            if (localStatusDetails == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "StatusDetails cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localStatusDetails);
            }

            xmlWriter.writeEndElement();
        }

        if (localWarningTracker) {
            namespace = "urn:hpccsystems:ws:wssmc";
            writeStartElement(null, namespace, "Warning", xmlWriter);

            if (localWarning == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Warning cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localWarning);
            }

            xmlWriter.writeEndElement();
        }

        if (localClusterTypeTracker) {
            namespace = "urn:hpccsystems:ws:wssmc";
            writeStartElement(null, namespace, "ClusterType", xmlWriter);

            if (localClusterType == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "ClusterType cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localClusterType));
            }

            xmlWriter.writeEndElement();
        }

        if (localClusterSizeTracker) {
            namespace = "urn:hpccsystems:ws:wssmc";
            writeStartElement(null, namespace, "ClusterSize", xmlWriter);

            if (localClusterSize == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "ClusterSize cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localClusterSize));
            }

            xmlWriter.writeEndElement();
        }

        if (localClusterStatusTracker) {
            namespace = "urn:hpccsystems:ws:wssmc";
            writeStartElement(null, namespace, "ClusterStatus", xmlWriter);

            if (localClusterStatus == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "ClusterStatus cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localClusterStatus));
            }

            xmlWriter.writeEndElement();
        }

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("urn:hpccsystems:ws:wssmc")) {
            return "ns6";
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
        public static TargetCluster parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            TargetCluster object = new TargetCluster();

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

                        if (!"TargetCluster".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (TargetCluster) org.hpccsystems.ws.client.gen.axis2.wssmc.v1_21.ExtensionMapper.getTypeObject(nsUri,
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
                                    "urn:hpccsystems:ws:wssmc", "ClusterName").equals(
                                    reader.getName())) {
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
                                    "urn:hpccsystems:ws:wssmc", "QueueName").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "QueueName" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setQueueName(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wssmc", "QueueStatus").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "QueueStatus" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setQueueStatus(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wssmc", "StatusDetails").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "StatusDetails" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setStatusDetails(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wssmc", "Warning").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Warning" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setWarning(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wssmc", "ClusterType").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "ClusterType" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setClusterType(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wssmc", "ClusterSize").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "ClusterSize" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setClusterSize(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wssmc", "ClusterStatus").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "ClusterStatus" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setClusterStatus(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
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

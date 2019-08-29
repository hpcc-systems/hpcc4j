/**
 * DFUFileAccessRequestBase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51;


/**
 *  DFUFileAccessRequestBase bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class DFUFileAccessRequestBase implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = DFUFileAccessRequestBase
       Namespace URI = urn:hpccsystems:ws:wsdfu
       Namespace Prefix = ns3
     */

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
     * field for Cluster
     */
    protected java.lang.String localCluster;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localClusterTracker = false;

    /**
     * field for JobId
     */
    protected java.lang.String localJobId;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localJobIdTracker = false;

    /**
     * field for ExpirySeconds
     */
    protected int localExpirySeconds = org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
            "60");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localExpirySecondsTracker = false;

    /**
     * field for AccessRole
     */
    protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.FileAccessRole localAccessRole;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAccessRoleTracker = false;

    /**
     * field for AccessType
     */
    protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.SecAccessType localAccessType;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAccessTypeTracker = false;

    /**
     * field for ReturnJsonTypeInfo
     */
    protected boolean localReturnJsonTypeInfo = org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
            "false");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localReturnJsonTypeInfoTracker = false;

    /**
     * field for ReturnBinTypeInfo
     */
    protected boolean localReturnBinTypeInfo = org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
            "false");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localReturnBinTypeInfoTracker = false;

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

    public boolean isJobIdSpecified() {
        return localJobIdTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getJobId() {
        return localJobId;
    }

    /**
     * Auto generated setter method
     * @param param JobId
     */
    public void setJobId(java.lang.String param) {
        localJobIdTracker = param != null;

        this.localJobId = param;
    }

    public boolean isExpirySecondsSpecified() {
        return localExpirySecondsTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getExpirySeconds() {
        return localExpirySeconds;
    }

    /**
     * Auto generated setter method
     * @param param ExpirySeconds
     */
    public void setExpirySeconds(int param) {
        // setting primitive attribute tracker to true
        localExpirySecondsTracker = param != java.lang.Integer.MIN_VALUE;

        this.localExpirySeconds = param;
    }

    public boolean isAccessRoleSpecified() {
        return localAccessRoleTracker;
    }

    /**
     * Auto generated getter method
     * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.FileAccessRole
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.FileAccessRole getAccessRole() {
        return localAccessRole;
    }

    /**
     * Auto generated setter method
     * @param param AccessRole
     */
    public void setAccessRole(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.FileAccessRole param) {
        localAccessRoleTracker = param != null;

        this.localAccessRole = param;
    }

    public boolean isAccessTypeSpecified() {
        return localAccessTypeTracker;
    }

    /**
     * Auto generated getter method
     * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.SecAccessType
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.SecAccessType getAccessType() {
        return localAccessType;
    }

    /**
     * Auto generated setter method
     * @param param AccessType
     */
    public void setAccessType(
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.SecAccessType param) {
        localAccessTypeTracker = param != null;

        this.localAccessType = param;
    }

    public boolean isReturnJsonTypeInfoSpecified() {
        return localReturnJsonTypeInfoTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getReturnJsonTypeInfo() {
        return localReturnJsonTypeInfo;
    }

    /**
     * Auto generated setter method
     * @param param ReturnJsonTypeInfo
     */
    public void setReturnJsonTypeInfo(boolean param) {
        // setting primitive attribute tracker to true
        localReturnJsonTypeInfoTracker = true;

        this.localReturnJsonTypeInfo = param;
    }

    public boolean isReturnBinTypeInfoSpecified() {
        return localReturnBinTypeInfoTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getReturnBinTypeInfo() {
        return localReturnBinTypeInfo;
    }

    /**
     * Auto generated setter method
     * @param param ReturnBinTypeInfo
     */
    public void setReturnBinTypeInfo(boolean param) {
        // setting primitive attribute tracker to true
        localReturnBinTypeInfoTracker = true;

        this.localReturnBinTypeInfo = param;
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
                    "urn:hpccsystems:ws:wsdfu");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":DFUFileAccessRequestBase", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "DFUFileAccessRequestBase", xmlWriter);
            }
        }

        if (localNameTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
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

        if (localClusterTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
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

        if (localJobIdTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "JobId", xmlWriter);

            if (localJobId == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "JobId cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localJobId);
            }

            xmlWriter.writeEndElement();
        }

        if (localExpirySecondsTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "ExpirySeconds", xmlWriter);

            if (localExpirySeconds == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "ExpirySeconds cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localExpirySeconds));
            }

            xmlWriter.writeEndElement();
        }

        if (localAccessRoleTracker) {
            if (localAccessRole == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "AccessRole cannot be null!!");
            }

            localAccessRole.serialize(new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsdfu", "AccessRole"), xmlWriter);
        }

        if (localAccessTypeTracker) {
            if (localAccessType == null) {
                throw new org.apache.axis2.databinding.ADBException(
                    "AccessType cannot be null!!");
            }

            localAccessType.serialize(new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wsdfu", "AccessType"), xmlWriter);
        }

        if (localReturnJsonTypeInfoTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "ReturnJsonTypeInfo", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "ReturnJsonTypeInfo cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localReturnJsonTypeInfo));
            }

            xmlWriter.writeEndElement();
        }

        if (localReturnBinTypeInfoTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "ReturnBinTypeInfo", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "ReturnBinTypeInfo cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localReturnBinTypeInfo));
            }

            xmlWriter.writeEndElement();
        }

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("urn:hpccsystems:ws:wsdfu")) {
            return "ns3";
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
        public static DFUFileAccessRequestBase parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            DFUFileAccessRequestBase object = new DFUFileAccessRequestBase();

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

                        if (!"DFUFileAccessRequestBase".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (DFUFileAccessRequestBase) org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.ExtensionMapper.getTypeObject(nsUri,
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
                                    "urn:hpccsystems:ws:wsdfu", "Name").equals(
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
                                    "urn:hpccsystems:ws:wsdfu", "Cluster").equals(
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
                                    "urn:hpccsystems:ws:wsdfu", "JobId").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "JobId" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setJobId(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "ExpirySeconds").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "ExpirySeconds" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setExpirySeconds(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "AccessRole").equals(
                                    reader.getName())) {
                            object.setAccessRole(org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.FileAccessRole.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "AccessType").equals(
                                    reader.getName())) {
                            object.setAccessType(org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.SecAccessType.Factory.parse(
                                    reader));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu",
                                    "ReturnJsonTypeInfo").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "ReturnJsonTypeInfo" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setReturnJsonTypeInfo(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu",
                                    "ReturnBinTypeInfo").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "ReturnBinTypeInfo" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setReturnBinTypeInfo(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
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

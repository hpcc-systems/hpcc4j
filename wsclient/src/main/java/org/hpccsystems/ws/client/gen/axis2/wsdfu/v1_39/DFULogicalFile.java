/**
 * DFULogicalFile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:06:07 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39;


/**
 *  DFULogicalFile bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class DFULogicalFile implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = DFULogicalFile
       Namespace URI = urn:hpccsystems:ws:wsdfu
       Namespace Prefix = ns3
     */

    /**
     * field for Prefix
     */
    protected java.lang.String localPrefix;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPrefixTracker = false;

    /**
     * field for NodeGroup
     */
    protected java.lang.String localNodeGroup;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNodeGroupTracker = false;

    /**
     * field for Directory
     */
    protected java.lang.String localDirectory;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDirectoryTracker = false;

    /**
     * field for Description
     */
    protected java.lang.String localDescription;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDescriptionTracker = false;

    /**
     * field for Parts
     */
    protected java.lang.String localParts;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPartsTracker = false;

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
     * field for Owner
     */
    protected java.lang.String localOwner;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localOwnerTracker = false;

    /**
     * field for Totalsize
     */
    protected java.lang.String localTotalsize;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTotalsizeTracker = false;

    /**
     * field for RecordCount
     */
    protected java.lang.String localRecordCount;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRecordCountTracker = false;

    /**
     * field for Modified
     */
    protected java.lang.String localModified;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localModifiedTracker = false;

    /**
     * field for LongSize
     */
    protected java.lang.String localLongSize;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLongSizeTracker = false;

    /**
     * field for LongRecordCount
     */
    protected java.lang.String localLongRecordCount;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLongRecordCountTracker = false;

    /**
     * field for IsSuperfile
     */
    protected boolean localIsSuperfile;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIsSuperfileTracker = false;

    /**
     * field for IsDirectory
     */
    protected boolean localIsDirectory = org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
            "false");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIsDirectoryTracker = false;

    /**
     * field for Replicate
     */
    protected boolean localReplicate = org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
            "false");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localReplicateTracker = false;

    /**
     * field for IntSize
     */
    protected long localIntSize;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIntSizeTracker = false;

    /**
     * field for IntRecordCount
     */
    protected long localIntRecordCount;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIntRecordCountTracker = false;

    /**
     * field for FromRoxieCluster
     */
    protected boolean localFromRoxieCluster;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFromRoxieClusterTracker = false;

    /**
     * field for BrowseData
     */
    protected boolean localBrowseData;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBrowseDataTracker = false;

    /**
     * field for IsCompressed
     */
    protected boolean localIsCompressed;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIsCompressedTracker = false;

    /**
     * field for ContentType
     */
    protected java.lang.String localContentType;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localContentTypeTracker = false;

    /**
     * field for CompressedFileSize
     */
    protected long localCompressedFileSize;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCompressedFileSizeTracker = false;

    /**
     * field for SuperOwners
     */
    protected java.lang.String localSuperOwners;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSuperOwnersTracker = false;

    /**
     * field for Persistent
     */
    protected boolean localPersistent = org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
            "false");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPersistentTracker = false;

    /**
     * field for IsProtected
     */
    protected boolean localIsProtected = org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
            "false");

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIsProtectedTracker = false;

    public boolean isPrefixSpecified() {
        return localPrefixTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPrefix() {
        return localPrefix;
    }

    /**
     * Auto generated setter method
     * @param param Prefix
     */
    public void setPrefix(java.lang.String param) {
        localPrefixTracker = param != null;

        this.localPrefix = param;
    }

    public boolean isNodeGroupSpecified() {
        return localNodeGroupTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getNodeGroup() {
        return localNodeGroup;
    }

    /**
     * Auto generated setter method
     * @param param NodeGroup
     */
    public void setNodeGroup(java.lang.String param) {
        localNodeGroupTracker = param != null;

        this.localNodeGroup = param;
    }

    public boolean isDirectorySpecified() {
        return localDirectoryTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDirectory() {
        return localDirectory;
    }

    /**
     * Auto generated setter method
     * @param param Directory
     */
    public void setDirectory(java.lang.String param) {
        localDirectoryTracker = param != null;

        this.localDirectory = param;
    }

    public boolean isDescriptionSpecified() {
        return localDescriptionTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDescription() {
        return localDescription;
    }

    /**
     * Auto generated setter method
     * @param param Description
     */
    public void setDescription(java.lang.String param) {
        localDescriptionTracker = param != null;

        this.localDescription = param;
    }

    public boolean isPartsSpecified() {
        return localPartsTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getParts() {
        return localParts;
    }

    /**
     * Auto generated setter method
     * @param param Parts
     */
    public void setParts(java.lang.String param) {
        localPartsTracker = param != null;

        this.localParts = param;
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

    public boolean isOwnerSpecified() {
        return localOwnerTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getOwner() {
        return localOwner;
    }

    /**
     * Auto generated setter method
     * @param param Owner
     */
    public void setOwner(java.lang.String param) {
        localOwnerTracker = param != null;

        this.localOwner = param;
    }

    public boolean isTotalsizeSpecified() {
        return localTotalsizeTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getTotalsize() {
        return localTotalsize;
    }

    /**
     * Auto generated setter method
     * @param param Totalsize
     */
    public void setTotalsize(java.lang.String param) {
        localTotalsizeTracker = param != null;

        this.localTotalsize = param;
    }

    public boolean isRecordCountSpecified() {
        return localRecordCountTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getRecordCount() {
        return localRecordCount;
    }

    /**
     * Auto generated setter method
     * @param param RecordCount
     */
    public void setRecordCount(java.lang.String param) {
        localRecordCountTracker = param != null;

        this.localRecordCount = param;
    }

    public boolean isModifiedSpecified() {
        return localModifiedTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getModified() {
        return localModified;
    }

    /**
     * Auto generated setter method
     * @param param Modified
     */
    public void setModified(java.lang.String param) {
        localModifiedTracker = param != null;

        this.localModified = param;
    }

    public boolean isLongSizeSpecified() {
        return localLongSizeTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getLongSize() {
        return localLongSize;
    }

    /**
     * Auto generated setter method
     * @param param LongSize
     */
    public void setLongSize(java.lang.String param) {
        localLongSizeTracker = param != null;

        this.localLongSize = param;
    }

    public boolean isLongRecordCountSpecified() {
        return localLongRecordCountTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getLongRecordCount() {
        return localLongRecordCount;
    }

    /**
     * Auto generated setter method
     * @param param LongRecordCount
     */
    public void setLongRecordCount(java.lang.String param) {
        localLongRecordCountTracker = param != null;

        this.localLongRecordCount = param;
    }

    public boolean isIsSuperfileSpecified() {
        return localIsSuperfileTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getIsSuperfile() {
        return localIsSuperfile;
    }

    /**
     * Auto generated setter method
     * @param param IsSuperfile
     */
    public void setIsSuperfile(boolean param) {
        // setting primitive attribute tracker to true
        localIsSuperfileTracker = true;

        this.localIsSuperfile = param;
    }

    public boolean isIsDirectorySpecified() {
        return localIsDirectoryTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getIsDirectory() {
        return localIsDirectory;
    }

    /**
     * Auto generated setter method
     * @param param IsDirectory
     */
    public void setIsDirectory(boolean param) {
        // setting primitive attribute tracker to true
        localIsDirectoryTracker = true;

        this.localIsDirectory = param;
    }

    public boolean isReplicateSpecified() {
        return localReplicateTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getReplicate() {
        return localReplicate;
    }

    /**
     * Auto generated setter method
     * @param param Replicate
     */
    public void setReplicate(boolean param) {
        // setting primitive attribute tracker to true
        localReplicateTracker = true;

        this.localReplicate = param;
    }

    public boolean isIntSizeSpecified() {
        return localIntSizeTracker;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getIntSize() {
        return localIntSize;
    }

    /**
     * Auto generated setter method
     * @param param IntSize
     */
    public void setIntSize(long param) {
        // setting primitive attribute tracker to true
        localIntSizeTracker = param != java.lang.Long.MIN_VALUE;

        this.localIntSize = param;
    }

    public boolean isIntRecordCountSpecified() {
        return localIntRecordCountTracker;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getIntRecordCount() {
        return localIntRecordCount;
    }

    /**
     * Auto generated setter method
     * @param param IntRecordCount
     */
    public void setIntRecordCount(long param) {
        // setting primitive attribute tracker to true
        localIntRecordCountTracker = param != java.lang.Long.MIN_VALUE;

        this.localIntRecordCount = param;
    }

    public boolean isFromRoxieClusterSpecified() {
        return localFromRoxieClusterTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getFromRoxieCluster() {
        return localFromRoxieCluster;
    }

    /**
     * Auto generated setter method
     * @param param FromRoxieCluster
     */
    public void setFromRoxieCluster(boolean param) {
        // setting primitive attribute tracker to true
        localFromRoxieClusterTracker = true;

        this.localFromRoxieCluster = param;
    }

    public boolean isBrowseDataSpecified() {
        return localBrowseDataTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getBrowseData() {
        return localBrowseData;
    }

    /**
     * Auto generated setter method
     * @param param BrowseData
     */
    public void setBrowseData(boolean param) {
        // setting primitive attribute tracker to true
        localBrowseDataTracker = true;

        this.localBrowseData = param;
    }

    public boolean isIsCompressedSpecified() {
        return localIsCompressedTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getIsCompressed() {
        return localIsCompressed;
    }

    /**
     * Auto generated setter method
     * @param param IsCompressed
     */
    public void setIsCompressed(boolean param) {
        // setting primitive attribute tracker to true
        localIsCompressedTracker = true;

        this.localIsCompressed = param;
    }

    public boolean isContentTypeSpecified() {
        return localContentTypeTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getContentType() {
        return localContentType;
    }

    /**
     * Auto generated setter method
     * @param param ContentType
     */
    public void setContentType(java.lang.String param) {
        localContentTypeTracker = param != null;

        this.localContentType = param;
    }

    public boolean isCompressedFileSizeSpecified() {
        return localCompressedFileSizeTracker;
    }

    /**
     * Auto generated getter method
     * @return long
     */
    public long getCompressedFileSize() {
        return localCompressedFileSize;
    }

    /**
     * Auto generated setter method
     * @param param CompressedFileSize
     */
    public void setCompressedFileSize(long param) {
        // setting primitive attribute tracker to true
        localCompressedFileSizeTracker = param != java.lang.Long.MIN_VALUE;

        this.localCompressedFileSize = param;
    }

    public boolean isSuperOwnersSpecified() {
        return localSuperOwnersTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getSuperOwners() {
        return localSuperOwners;
    }

    /**
     * Auto generated setter method
     * @param param SuperOwners
     */
    public void setSuperOwners(java.lang.String param) {
        localSuperOwnersTracker = param != null;

        this.localSuperOwners = param;
    }

    public boolean isPersistentSpecified() {
        return localPersistentTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getPersistent() {
        return localPersistent;
    }

    /**
     * Auto generated setter method
     * @param param Persistent
     */
    public void setPersistent(boolean param) {
        // setting primitive attribute tracker to true
        localPersistentTracker = true;

        this.localPersistent = param;
    }

    public boolean isIsProtectedSpecified() {
        return localIsProtectedTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getIsProtected() {
        return localIsProtected;
    }

    /**
     * Auto generated setter method
     * @param param IsProtected
     */
    public void setIsProtected(boolean param) {
        // setting primitive attribute tracker to true
        localIsProtectedTracker = true;

        this.localIsProtected = param;
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
                    namespacePrefix + ":DFULogicalFile", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "DFULogicalFile", xmlWriter);
            }
        }

        if (localPrefixTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "Prefix", xmlWriter);

            if (localPrefix == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Prefix cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localPrefix);
            }

            xmlWriter.writeEndElement();
        }

        if (localNodeGroupTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "NodeGroup", xmlWriter);

            if (localNodeGroup == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "NodeGroup cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localNodeGroup);
            }

            xmlWriter.writeEndElement();
        }

        if (localDirectoryTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "Directory", xmlWriter);

            if (localDirectory == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Directory cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localDirectory);
            }

            xmlWriter.writeEndElement();
        }

        if (localDescriptionTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "Description", xmlWriter);

            if (localDescription == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Description cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localDescription);
            }

            xmlWriter.writeEndElement();
        }

        if (localPartsTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "Parts", xmlWriter);

            if (localParts == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Parts cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localParts);
            }

            xmlWriter.writeEndElement();
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

        if (localOwnerTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "Owner", xmlWriter);

            if (localOwner == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Owner cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localOwner);
            }

            xmlWriter.writeEndElement();
        }

        if (localTotalsizeTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "Totalsize", xmlWriter);

            if (localTotalsize == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Totalsize cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localTotalsize);
            }

            xmlWriter.writeEndElement();
        }

        if (localRecordCountTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "RecordCount", xmlWriter);

            if (localRecordCount == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "RecordCount cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localRecordCount);
            }

            xmlWriter.writeEndElement();
        }

        if (localModifiedTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "Modified", xmlWriter);

            if (localModified == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "Modified cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localModified);
            }

            xmlWriter.writeEndElement();
        }

        if (localLongSizeTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "LongSize", xmlWriter);

            if (localLongSize == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "LongSize cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localLongSize);
            }

            xmlWriter.writeEndElement();
        }

        if (localLongRecordCountTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "LongRecordCount", xmlWriter);

            if (localLongRecordCount == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "LongRecordCount cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localLongRecordCount);
            }

            xmlWriter.writeEndElement();
        }

        if (localIsSuperfileTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "isSuperfile", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "isSuperfile cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localIsSuperfile));
            }

            xmlWriter.writeEndElement();
        }

        if (localIsDirectoryTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "isDirectory", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "isDirectory cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localIsDirectory));
            }

            xmlWriter.writeEndElement();
        }

        if (localReplicateTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "Replicate", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Replicate cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localReplicate));
            }

            xmlWriter.writeEndElement();
        }

        if (localIntSizeTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "IntSize", xmlWriter);

            if (localIntSize == java.lang.Long.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "IntSize cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localIntSize));
            }

            xmlWriter.writeEndElement();
        }

        if (localIntRecordCountTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "IntRecordCount", xmlWriter);

            if (localIntRecordCount == java.lang.Long.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "IntRecordCount cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localIntRecordCount));
            }

            xmlWriter.writeEndElement();
        }

        if (localFromRoxieClusterTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "FromRoxieCluster", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "FromRoxieCluster cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localFromRoxieCluster));
            }

            xmlWriter.writeEndElement();
        }

        if (localBrowseDataTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "BrowseData", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "BrowseData cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localBrowseData));
            }

            xmlWriter.writeEndElement();
        }

        if (localIsCompressedTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "IsCompressed", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "IsCompressed cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localIsCompressed));
            }

            xmlWriter.writeEndElement();
        }

        if (localContentTypeTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "ContentType", xmlWriter);

            if (localContentType == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "ContentType cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localContentType);
            }

            xmlWriter.writeEndElement();
        }

        if (localCompressedFileSizeTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "CompressedFileSize", xmlWriter);

            if (localCompressedFileSize == java.lang.Long.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "CompressedFileSize cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localCompressedFileSize));
            }

            xmlWriter.writeEndElement();
        }

        if (localSuperOwnersTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "SuperOwners", xmlWriter);

            if (localSuperOwners == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "SuperOwners cannot be null!!");
            } else {
                xmlWriter.writeCharacters(localSuperOwners);
            }

            xmlWriter.writeEndElement();
        }

        if (localPersistentTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "Persistent", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "Persistent cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localPersistent));
            }

            xmlWriter.writeEndElement();
        }

        if (localIsProtectedTracker) {
            namespace = "urn:hpccsystems:ws:wsdfu";
            writeStartElement(null, namespace, "IsProtected", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "IsProtected cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localIsProtected));
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
        public static DFULogicalFile parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            DFULogicalFile object = new DFULogicalFile();

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

                        if (!"DFULogicalFile".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (DFULogicalFile) org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ExtensionMapper.getTypeObject(nsUri,
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
                                    "urn:hpccsystems:ws:wsdfu", "Prefix").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Prefix" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setPrefix(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "NodeGroup").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "NodeGroup" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setNodeGroup(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "Directory").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Directory" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setDirectory(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "Description").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Description" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setDescription(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "Parts").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Parts" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setParts(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
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
                                    "urn:hpccsystems:ws:wsdfu", "Owner").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Owner" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setOwner(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "Totalsize").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Totalsize" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setTotalsize(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "RecordCount").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "RecordCount" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setRecordCount(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "Modified").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Modified" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setModified(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "LongSize").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "LongSize" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setLongSize(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu",
                                    "LongRecordCount").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "LongRecordCount" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setLongRecordCount(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "isSuperfile").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "isSuperfile" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setIsSuperfile(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "isDirectory").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "isDirectory" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setIsDirectory(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "Replicate").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Replicate" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setReplicate(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "IntSize").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "IntSize" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setIntSize(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "IntRecordCount").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "IntRecordCount" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setIntRecordCount(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu",
                                    "FromRoxieCluster").equals(reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "FromRoxieCluster" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setFromRoxieCluster(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "BrowseData").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "BrowseData" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setBrowseData(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "IsCompressed").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "IsCompressed" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setIsCompressed(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "ContentType").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "ContentType" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setContentType(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu",
                                    "CompressedFileSize").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "CompressedFileSize" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setCompressedFileSize(org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "SuperOwners").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "SuperOwners" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setSuperOwners(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "Persistent").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "Persistent" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setPersistent(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                                    content));

                            reader.next();
                        } // End of if for expected property start element

                        else
                         if (reader.isStartElement() &&
                                new javax.xml.namespace.QName(
                                    "urn:hpccsystems:ws:wsdfu", "IsProtected").equals(
                                    reader.getName())) {
                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                    "nil");

                            if ("true".equals(nillableValue) ||
                                    "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                    "The element: " + "IsProtected" +
                                    "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setIsProtected(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
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

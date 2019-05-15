/**
 * DFULogicalFile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsdfu.v1_51;

public class DFULogicalFile  implements java.io.Serializable {
    private java.lang.String prefix;

    private java.lang.String nodeGroup;

    private java.lang.String directory;

    private java.lang.String description;

    private java.lang.String parts;

    private java.lang.String name;

    private java.lang.String owner;

    private java.lang.String totalsize;

    private java.lang.String recordCount;

    private java.lang.String modified;

    private java.lang.String longSize;

    private java.lang.String longRecordCount;

    private java.lang.Boolean isSuperfile;

    private java.lang.Boolean isDirectory;

    private java.lang.Boolean replicate;

    private java.lang.Long intSize;

    private java.lang.Long intRecordCount;

    private java.lang.Boolean fromRoxieCluster;

    private java.lang.Boolean browseData;

    private java.lang.Boolean isCompressed;

    private java.lang.String contentType;

    private java.lang.Long compressedFileSize;

    private java.lang.String superOwners;

    private java.lang.Boolean persistent;

    private java.lang.Boolean isProtected;

    private java.lang.String keyType;

    public DFULogicalFile() {
    }

    public DFULogicalFile(
           java.lang.String prefix,
           java.lang.String nodeGroup,
           java.lang.String directory,
           java.lang.String description,
           java.lang.String parts,
           java.lang.String name,
           java.lang.String owner,
           java.lang.String totalsize,
           java.lang.String recordCount,
           java.lang.String modified,
           java.lang.String longSize,
           java.lang.String longRecordCount,
           java.lang.Boolean isSuperfile,
           java.lang.Boolean isDirectory,
           java.lang.Boolean replicate,
           java.lang.Long intSize,
           java.lang.Long intRecordCount,
           java.lang.Boolean fromRoxieCluster,
           java.lang.Boolean browseData,
           java.lang.Boolean isCompressed,
           java.lang.String contentType,
           java.lang.Long compressedFileSize,
           java.lang.String superOwners,
           java.lang.Boolean persistent,
           java.lang.Boolean isProtected,
           java.lang.String keyType) {
           this.prefix = prefix;
           this.nodeGroup = nodeGroup;
           this.directory = directory;
           this.description = description;
           this.parts = parts;
           this.name = name;
           this.owner = owner;
           this.totalsize = totalsize;
           this.recordCount = recordCount;
           this.modified = modified;
           this.longSize = longSize;
           this.longRecordCount = longRecordCount;
           this.isSuperfile = isSuperfile;
           this.isDirectory = isDirectory;
           this.replicate = replicate;
           this.intSize = intSize;
           this.intRecordCount = intRecordCount;
           this.fromRoxieCluster = fromRoxieCluster;
           this.browseData = browseData;
           this.isCompressed = isCompressed;
           this.contentType = contentType;
           this.compressedFileSize = compressedFileSize;
           this.superOwners = superOwners;
           this.persistent = persistent;
           this.isProtected = isProtected;
           this.keyType = keyType;
    }


    /**
     * Gets the prefix value for this DFULogicalFile.
     * 
     * @return prefix
     */
    public java.lang.String getPrefix() {
        return prefix;
    }


    /**
     * Sets the prefix value for this DFULogicalFile.
     * 
     * @param prefix
     */
    public void setPrefix(java.lang.String prefix) {
        this.prefix = prefix;
    }


    /**
     * Gets the nodeGroup value for this DFULogicalFile.
     * 
     * @return nodeGroup
     */
    public java.lang.String getNodeGroup() {
        return nodeGroup;
    }


    /**
     * Sets the nodeGroup value for this DFULogicalFile.
     * 
     * @param nodeGroup
     */
    public void setNodeGroup(java.lang.String nodeGroup) {
        this.nodeGroup = nodeGroup;
    }


    /**
     * Gets the directory value for this DFULogicalFile.
     * 
     * @return directory
     */
    public java.lang.String getDirectory() {
        return directory;
    }


    /**
     * Sets the directory value for this DFULogicalFile.
     * 
     * @param directory
     */
    public void setDirectory(java.lang.String directory) {
        this.directory = directory;
    }


    /**
     * Gets the description value for this DFULogicalFile.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this DFULogicalFile.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the parts value for this DFULogicalFile.
     * 
     * @return parts
     */
    public java.lang.String getParts() {
        return parts;
    }


    /**
     * Sets the parts value for this DFULogicalFile.
     * 
     * @param parts
     */
    public void setParts(java.lang.String parts) {
        this.parts = parts;
    }


    /**
     * Gets the name value for this DFULogicalFile.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DFULogicalFile.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the owner value for this DFULogicalFile.
     * 
     * @return owner
     */
    public java.lang.String getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this DFULogicalFile.
     * 
     * @param owner
     */
    public void setOwner(java.lang.String owner) {
        this.owner = owner;
    }


    /**
     * Gets the totalsize value for this DFULogicalFile.
     * 
     * @return totalsize
     */
    public java.lang.String getTotalsize() {
        return totalsize;
    }


    /**
     * Sets the totalsize value for this DFULogicalFile.
     * 
     * @param totalsize
     */
    public void setTotalsize(java.lang.String totalsize) {
        this.totalsize = totalsize;
    }


    /**
     * Gets the recordCount value for this DFULogicalFile.
     * 
     * @return recordCount
     */
    public java.lang.String getRecordCount() {
        return recordCount;
    }


    /**
     * Sets the recordCount value for this DFULogicalFile.
     * 
     * @param recordCount
     */
    public void setRecordCount(java.lang.String recordCount) {
        this.recordCount = recordCount;
    }


    /**
     * Gets the modified value for this DFULogicalFile.
     * 
     * @return modified
     */
    public java.lang.String getModified() {
        return modified;
    }


    /**
     * Sets the modified value for this DFULogicalFile.
     * 
     * @param modified
     */
    public void setModified(java.lang.String modified) {
        this.modified = modified;
    }


    /**
     * Gets the longSize value for this DFULogicalFile.
     * 
     * @return longSize
     */
    public java.lang.String getLongSize() {
        return longSize;
    }


    /**
     * Sets the longSize value for this DFULogicalFile.
     * 
     * @param longSize
     */
    public void setLongSize(java.lang.String longSize) {
        this.longSize = longSize;
    }


    /**
     * Gets the longRecordCount value for this DFULogicalFile.
     * 
     * @return longRecordCount
     */
    public java.lang.String getLongRecordCount() {
        return longRecordCount;
    }


    /**
     * Sets the longRecordCount value for this DFULogicalFile.
     * 
     * @param longRecordCount
     */
    public void setLongRecordCount(java.lang.String longRecordCount) {
        this.longRecordCount = longRecordCount;
    }


    /**
     * Gets the isSuperfile value for this DFULogicalFile.
     * 
     * @return isSuperfile
     */
    public java.lang.Boolean getIsSuperfile() {
        return isSuperfile;
    }


    /**
     * Sets the isSuperfile value for this DFULogicalFile.
     * 
     * @param isSuperfile
     */
    public void setIsSuperfile(java.lang.Boolean isSuperfile) {
        this.isSuperfile = isSuperfile;
    }


    /**
     * Gets the isDirectory value for this DFULogicalFile.
     * 
     * @return isDirectory
     */
    public java.lang.Boolean getIsDirectory() {
        return isDirectory;
    }


    /**
     * Sets the isDirectory value for this DFULogicalFile.
     * 
     * @param isDirectory
     */
    public void setIsDirectory(java.lang.Boolean isDirectory) {
        this.isDirectory = isDirectory;
    }


    /**
     * Gets the replicate value for this DFULogicalFile.
     * 
     * @return replicate
     */
    public java.lang.Boolean getReplicate() {
        return replicate;
    }


    /**
     * Sets the replicate value for this DFULogicalFile.
     * 
     * @param replicate
     */
    public void setReplicate(java.lang.Boolean replicate) {
        this.replicate = replicate;
    }


    /**
     * Gets the intSize value for this DFULogicalFile.
     * 
     * @return intSize
     */
    public java.lang.Long getIntSize() {
        return intSize;
    }


    /**
     * Sets the intSize value for this DFULogicalFile.
     * 
     * @param intSize
     */
    public void setIntSize(java.lang.Long intSize) {
        this.intSize = intSize;
    }


    /**
     * Gets the intRecordCount value for this DFULogicalFile.
     * 
     * @return intRecordCount
     */
    public java.lang.Long getIntRecordCount() {
        return intRecordCount;
    }


    /**
     * Sets the intRecordCount value for this DFULogicalFile.
     * 
     * @param intRecordCount
     */
    public void setIntRecordCount(java.lang.Long intRecordCount) {
        this.intRecordCount = intRecordCount;
    }


    /**
     * Gets the fromRoxieCluster value for this DFULogicalFile.
     * 
     * @return fromRoxieCluster
     */
    public java.lang.Boolean getFromRoxieCluster() {
        return fromRoxieCluster;
    }


    /**
     * Sets the fromRoxieCluster value for this DFULogicalFile.
     * 
     * @param fromRoxieCluster
     */
    public void setFromRoxieCluster(java.lang.Boolean fromRoxieCluster) {
        this.fromRoxieCluster = fromRoxieCluster;
    }


    /**
     * Gets the browseData value for this DFULogicalFile.
     * 
     * @return browseData
     */
    public java.lang.Boolean getBrowseData() {
        return browseData;
    }


    /**
     * Sets the browseData value for this DFULogicalFile.
     * 
     * @param browseData
     */
    public void setBrowseData(java.lang.Boolean browseData) {
        this.browseData = browseData;
    }


    /**
     * Gets the isCompressed value for this DFULogicalFile.
     * 
     * @return isCompressed
     */
    public java.lang.Boolean getIsCompressed() {
        return isCompressed;
    }


    /**
     * Sets the isCompressed value for this DFULogicalFile.
     * 
     * @param isCompressed
     */
    public void setIsCompressed(java.lang.Boolean isCompressed) {
        this.isCompressed = isCompressed;
    }


    /**
     * Gets the contentType value for this DFULogicalFile.
     * 
     * @return contentType
     */
    public java.lang.String getContentType() {
        return contentType;
    }


    /**
     * Sets the contentType value for this DFULogicalFile.
     * 
     * @param contentType
     */
    public void setContentType(java.lang.String contentType) {
        this.contentType = contentType;
    }


    /**
     * Gets the compressedFileSize value for this DFULogicalFile.
     * 
     * @return compressedFileSize
     */
    public java.lang.Long getCompressedFileSize() {
        return compressedFileSize;
    }


    /**
     * Sets the compressedFileSize value for this DFULogicalFile.
     * 
     * @param compressedFileSize
     */
    public void setCompressedFileSize(java.lang.Long compressedFileSize) {
        this.compressedFileSize = compressedFileSize;
    }


    /**
     * Gets the superOwners value for this DFULogicalFile.
     * 
     * @return superOwners
     */
    public java.lang.String getSuperOwners() {
        return superOwners;
    }


    /**
     * Sets the superOwners value for this DFULogicalFile.
     * 
     * @param superOwners
     */
    public void setSuperOwners(java.lang.String superOwners) {
        this.superOwners = superOwners;
    }


    /**
     * Gets the persistent value for this DFULogicalFile.
     * 
     * @return persistent
     */
    public java.lang.Boolean getPersistent() {
        return persistent;
    }


    /**
     * Sets the persistent value for this DFULogicalFile.
     * 
     * @param persistent
     */
    public void setPersistent(java.lang.Boolean persistent) {
        this.persistent = persistent;
    }


    /**
     * Gets the isProtected value for this DFULogicalFile.
     * 
     * @return isProtected
     */
    public java.lang.Boolean getIsProtected() {
        return isProtected;
    }


    /**
     * Sets the isProtected value for this DFULogicalFile.
     * 
     * @param isProtected
     */
    public void setIsProtected(java.lang.Boolean isProtected) {
        this.isProtected = isProtected;
    }


    /**
     * Gets the keyType value for this DFULogicalFile.
     * 
     * @return keyType
     */
    public java.lang.String getKeyType() {
        return keyType;
    }


    /**
     * Sets the keyType value for this DFULogicalFile.
     * 
     * @param keyType
     */
    public void setKeyType(java.lang.String keyType) {
        this.keyType = keyType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DFULogicalFile)) return false;
        DFULogicalFile other = (DFULogicalFile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.prefix==null && other.getPrefix()==null) || 
             (this.prefix!=null &&
              this.prefix.equals(other.getPrefix()))) &&
            ((this.nodeGroup==null && other.getNodeGroup()==null) || 
             (this.nodeGroup!=null &&
              this.nodeGroup.equals(other.getNodeGroup()))) &&
            ((this.directory==null && other.getDirectory()==null) || 
             (this.directory!=null &&
              this.directory.equals(other.getDirectory()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.parts==null && other.getParts()==null) || 
             (this.parts!=null &&
              this.parts.equals(other.getParts()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.totalsize==null && other.getTotalsize()==null) || 
             (this.totalsize!=null &&
              this.totalsize.equals(other.getTotalsize()))) &&
            ((this.recordCount==null && other.getRecordCount()==null) || 
             (this.recordCount!=null &&
              this.recordCount.equals(other.getRecordCount()))) &&
            ((this.modified==null && other.getModified()==null) || 
             (this.modified!=null &&
              this.modified.equals(other.getModified()))) &&
            ((this.longSize==null && other.getLongSize()==null) || 
             (this.longSize!=null &&
              this.longSize.equals(other.getLongSize()))) &&
            ((this.longRecordCount==null && other.getLongRecordCount()==null) || 
             (this.longRecordCount!=null &&
              this.longRecordCount.equals(other.getLongRecordCount()))) &&
            ((this.isSuperfile==null && other.getIsSuperfile()==null) || 
             (this.isSuperfile!=null &&
              this.isSuperfile.equals(other.getIsSuperfile()))) &&
            ((this.isDirectory==null && other.getIsDirectory()==null) || 
             (this.isDirectory!=null &&
              this.isDirectory.equals(other.getIsDirectory()))) &&
            ((this.replicate==null && other.getReplicate()==null) || 
             (this.replicate!=null &&
              this.replicate.equals(other.getReplicate()))) &&
            ((this.intSize==null && other.getIntSize()==null) || 
             (this.intSize!=null &&
              this.intSize.equals(other.getIntSize()))) &&
            ((this.intRecordCount==null && other.getIntRecordCount()==null) || 
             (this.intRecordCount!=null &&
              this.intRecordCount.equals(other.getIntRecordCount()))) &&
            ((this.fromRoxieCluster==null && other.getFromRoxieCluster()==null) || 
             (this.fromRoxieCluster!=null &&
              this.fromRoxieCluster.equals(other.getFromRoxieCluster()))) &&
            ((this.browseData==null && other.getBrowseData()==null) || 
             (this.browseData!=null &&
              this.browseData.equals(other.getBrowseData()))) &&
            ((this.isCompressed==null && other.getIsCompressed()==null) || 
             (this.isCompressed!=null &&
              this.isCompressed.equals(other.getIsCompressed()))) &&
            ((this.contentType==null && other.getContentType()==null) || 
             (this.contentType!=null &&
              this.contentType.equals(other.getContentType()))) &&
            ((this.compressedFileSize==null && other.getCompressedFileSize()==null) || 
             (this.compressedFileSize!=null &&
              this.compressedFileSize.equals(other.getCompressedFileSize()))) &&
            ((this.superOwners==null && other.getSuperOwners()==null) || 
             (this.superOwners!=null &&
              this.superOwners.equals(other.getSuperOwners()))) &&
            ((this.persistent==null && other.getPersistent()==null) || 
             (this.persistent!=null &&
              this.persistent.equals(other.getPersistent()))) &&
            ((this.isProtected==null && other.getIsProtected()==null) || 
             (this.isProtected!=null &&
              this.isProtected.equals(other.getIsProtected()))) &&
            ((this.keyType==null && other.getKeyType()==null) || 
             (this.keyType!=null &&
              this.keyType.equals(other.getKeyType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getPrefix() != null) {
            _hashCode += getPrefix().hashCode();
        }
        if (getNodeGroup() != null) {
            _hashCode += getNodeGroup().hashCode();
        }
        if (getDirectory() != null) {
            _hashCode += getDirectory().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getParts() != null) {
            _hashCode += getParts().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getTotalsize() != null) {
            _hashCode += getTotalsize().hashCode();
        }
        if (getRecordCount() != null) {
            _hashCode += getRecordCount().hashCode();
        }
        if (getModified() != null) {
            _hashCode += getModified().hashCode();
        }
        if (getLongSize() != null) {
            _hashCode += getLongSize().hashCode();
        }
        if (getLongRecordCount() != null) {
            _hashCode += getLongRecordCount().hashCode();
        }
        if (getIsSuperfile() != null) {
            _hashCode += getIsSuperfile().hashCode();
        }
        if (getIsDirectory() != null) {
            _hashCode += getIsDirectory().hashCode();
        }
        if (getReplicate() != null) {
            _hashCode += getReplicate().hashCode();
        }
        if (getIntSize() != null) {
            _hashCode += getIntSize().hashCode();
        }
        if (getIntRecordCount() != null) {
            _hashCode += getIntRecordCount().hashCode();
        }
        if (getFromRoxieCluster() != null) {
            _hashCode += getFromRoxieCluster().hashCode();
        }
        if (getBrowseData() != null) {
            _hashCode += getBrowseData().hashCode();
        }
        if (getIsCompressed() != null) {
            _hashCode += getIsCompressed().hashCode();
        }
        if (getContentType() != null) {
            _hashCode += getContentType().hashCode();
        }
        if (getCompressedFileSize() != null) {
            _hashCode += getCompressedFileSize().hashCode();
        }
        if (getSuperOwners() != null) {
            _hashCode += getSuperOwners().hashCode();
        }
        if (getPersistent() != null) {
            _hashCode += getPersistent().hashCode();
        }
        if (getIsProtected() != null) {
            _hashCode += getIsProtected().hashCode();
        }
        if (getKeyType() != null) {
            _hashCode += getKeyType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DFULogicalFile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFULogicalFile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Prefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodeGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "NodeGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Directory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Parts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalsize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Totalsize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "RecordCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modified");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Modified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "LongSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longRecordCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "LongRecordCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSuperfile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "isSuperfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDirectory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "isDirectory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replicate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Replicate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "IntSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intRecordCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "IntRecordCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromRoxieCluster");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FromRoxieCluster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("browseData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "BrowseData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCompressed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "IsCompressed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ContentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("compressedFileSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "CompressedFileSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("superOwners");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "SuperOwners"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("persistent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Persistent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isProtected");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "IsProtected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "KeyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

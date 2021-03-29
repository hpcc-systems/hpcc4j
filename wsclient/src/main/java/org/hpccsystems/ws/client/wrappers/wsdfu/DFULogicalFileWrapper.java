package org.hpccsystems.ws.client.wrappers.wsdfu;

import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFULogicalFile;

public class DFULogicalFileWrapper
{   
    private String totalsize;
    private String superOwners;
    private Boolean replicate;
    private String recordCount;
    private String prefix;
    private Boolean persistent;
    private String parts;
    private String owner;
    private String nodeGroup;
    private String filename;
    private String modified;
    private String longSize;
    private String longRecordCount;
    //removed in HPCC 4.2.0
    //private Boolean isZipfile;
    private Boolean isSuperfile;
    private Boolean isProtected;
    //removed in HPCC 5.0.0
    //private Boolean isKeyFile;
    private Boolean isDirectory;
    private Boolean isCompressed;
    private Long intSize;
    private Long intRecordCount;
    private Boolean fromRoxieCluster;
    private String directory;
    private String description;
    private String contentType;
    private Long compressedFileSize;

    //removed in HPCC 5.0.0
    //private String clusterName;
    private Boolean browseData;

    /**
     * Instantiates a new DFU logical file wrapper.
     *
     * @param raw
     *            the raw
     */
    //rodrigo this replaces dfulogicalfileinfo from platform package
    public DFULogicalFileWrapper(DFULogicalFile raw)
    {
        browseData=raw.getBrowseData();
        //removed in HPCC 5.0.0
        //clusterName=raw.getClusterName();
        compressedFileSize=raw.getCompressedFileSize();
        contentType=raw.getContentType();
        description=raw.getDescription();
        directory=raw.getDirectory();
        fromRoxieCluster=raw.getFromRoxieCluster();
        intRecordCount=raw.getIntRecordCount();
        intSize=raw.getIntSize();
        isCompressed=raw.getIsCompressed();
        isDirectory=raw.getIsDirectory();
        //removed in HPCC 5.0.0
        //isKeyFile=raw.getIsKeyFile();
        isProtected=raw.getIsProtected();
        isSuperfile=raw.getIsSuperfile();
        //removed in HPCC 4.2.0
        //isZipfile=raw.getIsZipfile();
        longRecordCount=raw.getLongRecordCount();
        longSize=raw.getLongSize();
        modified=raw.getModified();
        filename=raw.getName();
        nodeGroup=raw.getNodeGroup();
        owner=raw.getOwner();
        parts=raw.getParts();
        persistent=raw.getPersistent();
        prefix=raw.getPrefix();
        recordCount=raw.getRecordCount();
        replicate=raw.getReplicate();
        superOwners=raw.getSuperOwners();
        totalsize=raw.getTotalsize();
    }

    /**
     * Gets the totalsize.
     *
     * @return the totalsize
     */
    public String getTotalsize()
    {
        return totalsize;
    }

    /**
     * Sets the totalsize.
     *
     * @param totalsize
     *            the new totalsize
     */
    public void setTotalsize(String totalsize)
    {
        this.totalsize = totalsize;
    }

    /**
     * Gets the super owners.
     *
     * @return the super owners
     */
    public String getSuperOwners()
    {
        return superOwners;
    }

    /**
     * Sets the super owners.
     *
     * @param superOwners
     *            the new super owners
     */
    public void setSuperOwners(String superOwners)
    {
        this.superOwners = superOwners;
    }

    /**
     * Gets the replicate.
     *
     * @return the replicate
     */
    public Boolean getReplicate()
    {
        return replicate;
    }

    /**
     * Sets the replicate.
     *
     * @param replicate
     *            the new replicate
     */
    public void setReplicate(Boolean replicate)
    {
        this.replicate = replicate;
    }

    /**
     * Gets the record count.
     *
     * @return the record count
     */
    public String getRecordCount()
    {
        return recordCount;
    }

    /**
     * Sets the record count.
     *
     * @param recordCount
     *            the new record count
     */
    public void setRecordCount(String recordCount)
    {
        this.recordCount = recordCount;
    }

    /**
     * Gets the prefix.
     *
     * @return the prefix
     */
    public String getPrefix()
    {
        return prefix;
    }

    /**
     * Sets the prefix.
     *
     * @param prefix
     *            the new prefix
     */
    public void setPrefix(String prefix)
    {
        this.prefix = prefix;
    }

    /**
     * Gets the persistent.
     *
     * @return the persistent
     */
    public Boolean getPersistent()
    {
        return persistent;
    }

    /**
     * Sets the persistent.
     *
     * @param persistent
     *            the new persistent
     */
    public void setPersistent(Boolean persistent)
    {
        this.persistent = persistent;
    }

    /**
     * Gets the parts.
     *
     * @return the parts
     */
    public String getParts()
    {
        return parts;
    }

    /**
     * Sets the parts.
     *
     * @param parts
     *            the new parts
     */
    public void setParts(String parts)
    {
        this.parts = parts;
    }

    /**
     * Gets the owner.
     *
     * @return the owner
     */
    public String getOwner()
    {
        return owner;
    }

    /**
     * Sets the owner.
     *
     * @param owner
     *            the new owner
     */
    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    /**
     * Gets the node group.
     *
     * @return the node group
     */
    public String getNodeGroup()
    {
        return nodeGroup;
    }

    /**
     * Sets the node group.
     *
     * @param nodeGroup
     *            the new node group
     */
    public void setNodeGroup(String nodeGroup)
    {
        this.nodeGroup = nodeGroup;
    }

    /**
     * Gets the file name.
     *
     * @return the file name
     */
    public String getFileName()
    {
        return filename;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName()
    {
        String dirname=getDirectory();
        String filename=getFileName();
        Boolean isDir=filename != null && !filename.equals("")?false:true;
        String name=isDir?dirname:filename;
        return name;
    }

    /**
     * Sets the file name.
     *
     * @param name
     *            the new file name
     */
    public void setFileName(String name)
    {
        this.filename = name;
    }

    /**
     * Gets the modified.
     *
     * @return the modified
     */
    public String getModified()
    {
        return modified;
    }

    /**
     * Sets the modified.
     *
     * @param modified
     *            the new modified
     */
    public void setModified(String modified)
    {
        this.modified = modified;
    }

    /**
     * Gets the long size.
     *
     * @return the long size
     */
    public String getLongSize()
    {
        return longSize;
    }

    /**
     * Sets the long size.
     *
     * @param longSize
     *            the new long size
     */
    public void setLongSize(String longSize)
    {
        this.longSize = longSize;
    }

    /**
     * Gets the long record count.
     *
     * @return the long record count
     */
    public String getLongRecordCount()
    {
        return longRecordCount;
    }

    /**
     * Sets the long record count.
     *
     * @param longRecordCount
     *            the new long record count
     */
    public void setLongRecordCount(String longRecordCount)
    {
        this.longRecordCount = longRecordCount;
    }

    /* removed in HPCC 4.2.0
    public Boolean getIsZipfile() {
        return isZipfile;
    }

    public void setIsZipfile(Boolean isZipfile) {
        this.isZipfile = isZipfile;
    }
    */

    /**
     * Gets the checks if is superfile.
     *
     * @return the checks if is superfile
     */
    public Boolean getIsSuperfile()
    {
        return isSuperfile;
    }

    /**
     * Sets the checks if is superfile.
     *
     * @param isSuperfile
     *            the new checks if is superfile
     */
    public void setIsSuperfile(Boolean isSuperfile)
    {
        this.isSuperfile = isSuperfile;
    }

    /**
     * Gets the checks if is protected.
     *
     * @return the checks if is protected
     */
    public Boolean getIsProtected()
    {
        return isProtected;
    }

    /**
     * Sets the checks if is protected.
     *
     * @param isProtected
     *            the new checks if is protected
     */
    public void setIsProtected(Boolean isProtected)
    {
        this.isProtected = isProtected;
    }

    /* removed in thpcc 5.0.0
    public Boolean getIsKeyFile() {
        return isKeyFile;
    }

    public void setIsKeyFile(Boolean isKeyFile) {
        this.isKeyFile = isKeyFile;
    }
    */

    /**
     * Gets the checks if is directory.
     *
     * @return the checks if is directory
     */
    public Boolean getIsDirectory()
    {
        return isDirectory;
    }

   
    /**
     * Sets the checks if is directory.
     *
     * @param isDirectory
     *            the new checks if is directory
     */
    public void setIsDirectory(Boolean isDirectory)
    {
        this.isDirectory = isDirectory;
    }

    /**
     * Gets the checks if is compressed.
     *
     * @return the checks if is compressed
     */
    public Boolean getIsCompressed()
    {
        return isCompressed;
    }

    /**
     * Sets the checks if is compressed.
     *
     * @param isCompressed
     *            the new checks if is compressed
     */
    public void setIsCompressed(Boolean isCompressed)
    {
        this.isCompressed = isCompressed;
    }

    /**
     * Gets the int size.
     *
     * @return the int size
     */
    public Long getIntSize()
    {
        return intSize;
    }

    /**
     * Sets the int size.
     *
     * @param intSize
     *            the new int size
     */
    public void setIntSize(Long intSize)
    {
        this.intSize = intSize;
    }

    /**
     * Gets the int record count.
     *
     * @return the int record count
     */
    public Long getIntRecordCount()
    {
        return intRecordCount;
    }

    /**
     * Sets the int record count.
     *
     * @param intRecordCount
     *            the new int record count
     */
    public void setIntRecordCount(Long intRecordCount)
    {
        this.intRecordCount = intRecordCount;
    }

    /**
     * Gets the from roxie cluster.
     *
     * @return the from roxie cluster
     */
    public Boolean getFromRoxieCluster()
    {
        return fromRoxieCluster;
    }

    /**
     * Sets the from roxie cluster.
     *
     * @param fromRoxieCluster
     *            the new from roxie cluster
     */
    public void setFromRoxieCluster(Boolean fromRoxieCluster)
    {
        this.fromRoxieCluster = fromRoxieCluster;
    }

    /**
     * Gets the directory.
     *
     * @return the directory
     */
    public String getDirectory()
    {
        return directory;
    }

    /**
     * Sets the directory.
     *
     * @param directory
     *            the new directory
     */
    public void setDirectory(String directory)
    {
        this.directory = directory;
    }

    /**
     * Gets the description.
     *
     * @return the description
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Sets the description.
     *
     * @param description
     *            the new description
     */
    public void setDescription(String description)
    {
        this.description = description;
    }

    /**
     * Gets the content type.
     *
     * @return the content type
     */
    public String getContentType()
    {
        return contentType;
    }

    /**
     * Sets the content type.
     *
     * @param contentType
     *            the new content type
     */
    public void setContentType(String contentType)
    {
        this.contentType = contentType;
    }

    /**
     * Gets the compressed file size.
     *
     * @return the compressed file size
     */
    public Long getCompressedFileSize()
    {
        return compressedFileSize;
    }

    /**
     * Sets the compressed file size.
     *
     * @param compressedFileSize
     *            the new compressed file size
     */
    public void setCompressedFileSize(Long compressedFileSize)
    {
        this.compressedFileSize = compressedFileSize;
    }

    /**
     * Gets the browse data.
     *
     * @return the browse data
     */
    /*removed in HPCC 5.0.0
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }
*/
    public Boolean getBrowseData()
    {
        return browseData;
    }

    /**
     * Sets the browse data.
     *
     * @param browseData
     *            the new browse data
     */
    public void setBrowseData(Boolean browseData)
    {
        this.browseData = browseData;
    }

}


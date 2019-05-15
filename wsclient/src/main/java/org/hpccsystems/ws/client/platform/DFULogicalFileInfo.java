package org.hpccsystems.ws.client.platform;

import org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFULogicalFile;


public class DFULogicalFileInfo {
    
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

    public DFULogicalFileInfo(DFULogicalFile raw) {
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

    public String getTotalsize() {
        return totalsize;
    }

    public void setTotalsize(String totalsize) {
        this.totalsize = totalsize;
    }

    public String getSuperOwners() {
        return superOwners;
    }

    public void setSuperOwners(String superOwners) {
        this.superOwners = superOwners;
    }

    public Boolean getReplicate() {
        return replicate;
    }

    public void setReplicate(Boolean replicate) {
        this.replicate = replicate;
    }

    public String getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(String recordCount) {
        this.recordCount = recordCount;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Boolean getPersistent() {
        return persistent;
    }

    public void setPersistent(Boolean persistent) {
        this.persistent = persistent;
    }

    public String getParts() {
        return parts;
    }

    public void setParts(String parts) {
        this.parts = parts;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getNodeGroup() {
        return nodeGroup;
    }

    public void setNodeGroup(String nodeGroup) {
        this.nodeGroup = nodeGroup;
    }

    public String getFileName() {
        return filename;
    }

    public String getName() {
        String dirname=getDirectory();
        String filename=getFileName();
        Boolean isDir=filename != null && !filename.equals("")?false:true;
        String name=isDir?dirname:filename;
        return name;
    }
    public void setFileName(String name) {
        this.filename = name;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getLongSize() {
        return longSize;
    }

    public void setLongSize(String longSize) {
        this.longSize = longSize;
    }

    public String getLongRecordCount() {
        return longRecordCount;
    }

    public void setLongRecordCount(String longRecordCount) {
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

    public Boolean getIsSuperfile() {
        return isSuperfile;
    }

    public void setIsSuperfile(Boolean isSuperfile) {
        this.isSuperfile = isSuperfile;
    }

    public Boolean getIsProtected() {
        return isProtected;
    }

    public void setIsProtected(Boolean isProtected) {
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

    public Boolean getIsDirectory() {
        return isDirectory;
    }

   
    public void setIsDirectory(Boolean isDirectory) {
        this.isDirectory = isDirectory;
    }

    public Boolean getIsCompressed() {
        return isCompressed;
    }

    public void setIsCompressed(Boolean isCompressed) {
        this.isCompressed = isCompressed;
    }

    public Long getIntSize() {
        return intSize;
    }

    public void setIntSize(Long intSize) {
        this.intSize = intSize;
    }

    public Long getIntRecordCount() {
        return intRecordCount;
    }

    public void setIntRecordCount(Long intRecordCount) {
        this.intRecordCount = intRecordCount;
    }

    public Boolean getFromRoxieCluster() {
        return fromRoxieCluster;
    }

    public void setFromRoxieCluster(Boolean fromRoxieCluster) {
        this.fromRoxieCluster = fromRoxieCluster;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Long getCompressedFileSize() {
        return compressedFileSize;
    }

    public void setCompressedFileSize(Long compressedFileSize) {
        this.compressedFileSize = compressedFileSize;
    }

    /*removed in HPCC 5.0.0
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }
*/
    public Boolean getBrowseData() {
        return browseData;
    }

    public void setBrowseData(Boolean browseData) {
        this.browseData = browseData;
    }

}

/**
 * DFUFileDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.hpccsystems.ws.client.gen.wsdfu.v1_51;

public class DFUFileDetail  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String filename;

    private java.lang.String prefix;

    private java.lang.String nodeGroup;

    private java.lang.Integer numParts;

    private java.lang.String description;

    private java.lang.String dir;

    private java.lang.String pathMask;

    private java.lang.String filesize;

    private java.lang.Long fileSizeInt64;

    private java.lang.String recordSize;

    private java.lang.String recordCount;

    private java.lang.Long recordSizeInt64;

    private java.lang.Long recordCountInt64;

    private java.lang.String wuid;

    private java.lang.String owner;

    private java.lang.String jobName;

    private java.lang.String persistent;

    private java.lang.String format;

    private java.lang.String maxRecordSize;

    private java.lang.String csvSeparate;

    private java.lang.String csvQuote;

    private java.lang.String csvTerminate;

    private java.lang.String csvEscape;

    private java.lang.String modified;

    private java.lang.String ecl;

    private org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileStat stat;

    private org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFilePartsOnCluster[] DFUFilePartsOnClusters;

    private java.lang.Boolean isSuperfile;

    private java.lang.Boolean showFileContent;

    private java.lang.String[] subfiles;

    private org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFULogicalFile[] superfiles;

    private org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileProtect[] protectList;

    private java.lang.Boolean fromRoxieCluster;

    private java.lang.String[] graphs;

    private java.lang.String userPermission;

    private java.lang.String contentType;

    private java.lang.Long compressedFileSize;

    private java.lang.String percentCompressed;

    private java.lang.Boolean isCompressed;

    private java.lang.Boolean browseData;

    private java.lang.String jsonInfo;

    private byte[] binInfo;

    private java.lang.String packageID;

    private org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFilePartition partition;

    private org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileBloom[] blooms;

    private java.lang.Integer expireDays;

    private java.lang.String keyType;

    public DFUFileDetail() {
    }

    public DFUFileDetail(
           java.lang.String name,
           java.lang.String filename,
           java.lang.String prefix,
           java.lang.String nodeGroup,
           java.lang.Integer numParts,
           java.lang.String description,
           java.lang.String dir,
           java.lang.String pathMask,
           java.lang.String filesize,
           java.lang.Long fileSizeInt64,
           java.lang.String recordSize,
           java.lang.String recordCount,
           java.lang.Long recordSizeInt64,
           java.lang.Long recordCountInt64,
           java.lang.String wuid,
           java.lang.String owner,
           java.lang.String jobName,
           java.lang.String persistent,
           java.lang.String format,
           java.lang.String maxRecordSize,
           java.lang.String csvSeparate,
           java.lang.String csvQuote,
           java.lang.String csvTerminate,
           java.lang.String csvEscape,
           java.lang.String modified,
           java.lang.String ecl,
           org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileStat stat,
           org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFilePartsOnCluster[] DFUFilePartsOnClusters,
           java.lang.Boolean isSuperfile,
           java.lang.Boolean showFileContent,
           java.lang.String[] subfiles,
           org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFULogicalFile[] superfiles,
           org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileProtect[] protectList,
           java.lang.Boolean fromRoxieCluster,
           java.lang.String[] graphs,
           java.lang.String userPermission,
           java.lang.String contentType,
           java.lang.Long compressedFileSize,
           java.lang.String percentCompressed,
           java.lang.Boolean isCompressed,
           java.lang.Boolean browseData,
           java.lang.String jsonInfo,
           byte[] binInfo,
           java.lang.String packageID,
           org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFilePartition partition,
           org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileBloom[] blooms,
           java.lang.Integer expireDays,
           java.lang.String keyType) {
           this.name = name;
           this.filename = filename;
           this.prefix = prefix;
           this.nodeGroup = nodeGroup;
           this.numParts = numParts;
           this.description = description;
           this.dir = dir;
           this.pathMask = pathMask;
           this.filesize = filesize;
           this.fileSizeInt64 = fileSizeInt64;
           this.recordSize = recordSize;
           this.recordCount = recordCount;
           this.recordSizeInt64 = recordSizeInt64;
           this.recordCountInt64 = recordCountInt64;
           this.wuid = wuid;
           this.owner = owner;
           this.jobName = jobName;
           this.persistent = persistent;
           this.format = format;
           this.maxRecordSize = maxRecordSize;
           this.csvSeparate = csvSeparate;
           this.csvQuote = csvQuote;
           this.csvTerminate = csvTerminate;
           this.csvEscape = csvEscape;
           this.modified = modified;
           this.ecl = ecl;
           this.stat = stat;
           this.DFUFilePartsOnClusters = DFUFilePartsOnClusters;
           this.isSuperfile = isSuperfile;
           this.showFileContent = showFileContent;
           this.subfiles = subfiles;
           this.superfiles = superfiles;
           this.protectList = protectList;
           this.fromRoxieCluster = fromRoxieCluster;
           this.graphs = graphs;
           this.userPermission = userPermission;
           this.contentType = contentType;
           this.compressedFileSize = compressedFileSize;
           this.percentCompressed = percentCompressed;
           this.isCompressed = isCompressed;
           this.browseData = browseData;
           this.jsonInfo = jsonInfo;
           this.binInfo = binInfo;
           this.packageID = packageID;
           this.partition = partition;
           this.blooms = blooms;
           this.expireDays = expireDays;
           this.keyType = keyType;
    }


    /**
     * Gets the name value for this DFUFileDetail.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DFUFileDetail.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the filename value for this DFUFileDetail.
     * 
     * @return filename
     */
    public java.lang.String getFilename() {
        return filename;
    }


    /**
     * Sets the filename value for this DFUFileDetail.
     * 
     * @param filename
     */
    public void setFilename(java.lang.String filename) {
        this.filename = filename;
    }


    /**
     * Gets the prefix value for this DFUFileDetail.
     * 
     * @return prefix
     */
    public java.lang.String getPrefix() {
        return prefix;
    }


    /**
     * Sets the prefix value for this DFUFileDetail.
     * 
     * @param prefix
     */
    public void setPrefix(java.lang.String prefix) {
        this.prefix = prefix;
    }


    /**
     * Gets the nodeGroup value for this DFUFileDetail.
     * 
     * @return nodeGroup
     */
    public java.lang.String getNodeGroup() {
        return nodeGroup;
    }


    /**
     * Sets the nodeGroup value for this DFUFileDetail.
     * 
     * @param nodeGroup
     */
    public void setNodeGroup(java.lang.String nodeGroup) {
        this.nodeGroup = nodeGroup;
    }


    /**
     * Gets the numParts value for this DFUFileDetail.
     * 
     * @return numParts
     */
    public java.lang.Integer getNumParts() {
        return numParts;
    }


    /**
     * Sets the numParts value for this DFUFileDetail.
     * 
     * @param numParts
     */
    public void setNumParts(java.lang.Integer numParts) {
        this.numParts = numParts;
    }


    /**
     * Gets the description value for this DFUFileDetail.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this DFUFileDetail.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the dir value for this DFUFileDetail.
     * 
     * @return dir
     */
    public java.lang.String getDir() {
        return dir;
    }


    /**
     * Sets the dir value for this DFUFileDetail.
     * 
     * @param dir
     */
    public void setDir(java.lang.String dir) {
        this.dir = dir;
    }


    /**
     * Gets the pathMask value for this DFUFileDetail.
     * 
     * @return pathMask
     */
    public java.lang.String getPathMask() {
        return pathMask;
    }


    /**
     * Sets the pathMask value for this DFUFileDetail.
     * 
     * @param pathMask
     */
    public void setPathMask(java.lang.String pathMask) {
        this.pathMask = pathMask;
    }


    /**
     * Gets the filesize value for this DFUFileDetail.
     * 
     * @return filesize
     */
    public java.lang.String getFilesize() {
        return filesize;
    }


    /**
     * Sets the filesize value for this DFUFileDetail.
     * 
     * @param filesize
     */
    public void setFilesize(java.lang.String filesize) {
        this.filesize = filesize;
    }


    /**
     * Gets the fileSizeInt64 value for this DFUFileDetail.
     * 
     * @return fileSizeInt64
     */
    public java.lang.Long getFileSizeInt64() {
        return fileSizeInt64;
    }


    /**
     * Sets the fileSizeInt64 value for this DFUFileDetail.
     * 
     * @param fileSizeInt64
     */
    public void setFileSizeInt64(java.lang.Long fileSizeInt64) {
        this.fileSizeInt64 = fileSizeInt64;
    }


    /**
     * Gets the recordSize value for this DFUFileDetail.
     * 
     * @return recordSize
     */
    public java.lang.String getRecordSize() {
        return recordSize;
    }


    /**
     * Sets the recordSize value for this DFUFileDetail.
     * 
     * @param recordSize
     */
    public void setRecordSize(java.lang.String recordSize) {
        this.recordSize = recordSize;
    }


    /**
     * Gets the recordCount value for this DFUFileDetail.
     * 
     * @return recordCount
     */
    public java.lang.String getRecordCount() {
        return recordCount;
    }


    /**
     * Sets the recordCount value for this DFUFileDetail.
     * 
     * @param recordCount
     */
    public void setRecordCount(java.lang.String recordCount) {
        this.recordCount = recordCount;
    }


    /**
     * Gets the recordSizeInt64 value for this DFUFileDetail.
     * 
     * @return recordSizeInt64
     */
    public java.lang.Long getRecordSizeInt64() {
        return recordSizeInt64;
    }


    /**
     * Sets the recordSizeInt64 value for this DFUFileDetail.
     * 
     * @param recordSizeInt64
     */
    public void setRecordSizeInt64(java.lang.Long recordSizeInt64) {
        this.recordSizeInt64 = recordSizeInt64;
    }


    /**
     * Gets the recordCountInt64 value for this DFUFileDetail.
     * 
     * @return recordCountInt64
     */
    public java.lang.Long getRecordCountInt64() {
        return recordCountInt64;
    }


    /**
     * Sets the recordCountInt64 value for this DFUFileDetail.
     * 
     * @param recordCountInt64
     */
    public void setRecordCountInt64(java.lang.Long recordCountInt64) {
        this.recordCountInt64 = recordCountInt64;
    }


    /**
     * Gets the wuid value for this DFUFileDetail.
     * 
     * @return wuid
     */
    public java.lang.String getWuid() {
        return wuid;
    }


    /**
     * Sets the wuid value for this DFUFileDetail.
     * 
     * @param wuid
     */
    public void setWuid(java.lang.String wuid) {
        this.wuid = wuid;
    }


    /**
     * Gets the owner value for this DFUFileDetail.
     * 
     * @return owner
     */
    public java.lang.String getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this DFUFileDetail.
     * 
     * @param owner
     */
    public void setOwner(java.lang.String owner) {
        this.owner = owner;
    }


    /**
     * Gets the jobName value for this DFUFileDetail.
     * 
     * @return jobName
     */
    public java.lang.String getJobName() {
        return jobName;
    }


    /**
     * Sets the jobName value for this DFUFileDetail.
     * 
     * @param jobName
     */
    public void setJobName(java.lang.String jobName) {
        this.jobName = jobName;
    }


    /**
     * Gets the persistent value for this DFUFileDetail.
     * 
     * @return persistent
     */
    public java.lang.String getPersistent() {
        return persistent;
    }


    /**
     * Sets the persistent value for this DFUFileDetail.
     * 
     * @param persistent
     */
    public void setPersistent(java.lang.String persistent) {
        this.persistent = persistent;
    }


    /**
     * Gets the format value for this DFUFileDetail.
     * 
     * @return format
     */
    public java.lang.String getFormat() {
        return format;
    }


    /**
     * Sets the format value for this DFUFileDetail.
     * 
     * @param format
     */
    public void setFormat(java.lang.String format) {
        this.format = format;
    }


    /**
     * Gets the maxRecordSize value for this DFUFileDetail.
     * 
     * @return maxRecordSize
     */
    public java.lang.String getMaxRecordSize() {
        return maxRecordSize;
    }


    /**
     * Sets the maxRecordSize value for this DFUFileDetail.
     * 
     * @param maxRecordSize
     */
    public void setMaxRecordSize(java.lang.String maxRecordSize) {
        this.maxRecordSize = maxRecordSize;
    }


    /**
     * Gets the csvSeparate value for this DFUFileDetail.
     * 
     * @return csvSeparate
     */
    public java.lang.String getCsvSeparate() {
        return csvSeparate;
    }


    /**
     * Sets the csvSeparate value for this DFUFileDetail.
     * 
     * @param csvSeparate
     */
    public void setCsvSeparate(java.lang.String csvSeparate) {
        this.csvSeparate = csvSeparate;
    }


    /**
     * Gets the csvQuote value for this DFUFileDetail.
     * 
     * @return csvQuote
     */
    public java.lang.String getCsvQuote() {
        return csvQuote;
    }


    /**
     * Sets the csvQuote value for this DFUFileDetail.
     * 
     * @param csvQuote
     */
    public void setCsvQuote(java.lang.String csvQuote) {
        this.csvQuote = csvQuote;
    }


    /**
     * Gets the csvTerminate value for this DFUFileDetail.
     * 
     * @return csvTerminate
     */
    public java.lang.String getCsvTerminate() {
        return csvTerminate;
    }


    /**
     * Sets the csvTerminate value for this DFUFileDetail.
     * 
     * @param csvTerminate
     */
    public void setCsvTerminate(java.lang.String csvTerminate) {
        this.csvTerminate = csvTerminate;
    }


    /**
     * Gets the csvEscape value for this DFUFileDetail.
     * 
     * @return csvEscape
     */
    public java.lang.String getCsvEscape() {
        return csvEscape;
    }


    /**
     * Sets the csvEscape value for this DFUFileDetail.
     * 
     * @param csvEscape
     */
    public void setCsvEscape(java.lang.String csvEscape) {
        this.csvEscape = csvEscape;
    }


    /**
     * Gets the modified value for this DFUFileDetail.
     * 
     * @return modified
     */
    public java.lang.String getModified() {
        return modified;
    }


    /**
     * Sets the modified value for this DFUFileDetail.
     * 
     * @param modified
     */
    public void setModified(java.lang.String modified) {
        this.modified = modified;
    }


    /**
     * Gets the ecl value for this DFUFileDetail.
     * 
     * @return ecl
     */
    public java.lang.String getEcl() {
        return ecl;
    }


    /**
     * Sets the ecl value for this DFUFileDetail.
     * 
     * @param ecl
     */
    public void setEcl(java.lang.String ecl) {
        this.ecl = ecl;
    }


    /**
     * Gets the stat value for this DFUFileDetail.
     * 
     * @return stat
     */
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileStat getStat() {
        return stat;
    }


    /**
     * Sets the stat value for this DFUFileDetail.
     * 
     * @param stat
     */
    public void setStat(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileStat stat) {
        this.stat = stat;
    }


    /**
     * Gets the DFUFilePartsOnClusters value for this DFUFileDetail.
     * 
     * @return DFUFilePartsOnClusters
     */
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFilePartsOnCluster[] getDFUFilePartsOnClusters() {
        return DFUFilePartsOnClusters;
    }


    /**
     * Sets the DFUFilePartsOnClusters value for this DFUFileDetail.
     * 
     * @param DFUFilePartsOnClusters
     */
    public void setDFUFilePartsOnClusters(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFilePartsOnCluster[] DFUFilePartsOnClusters) {
        this.DFUFilePartsOnClusters = DFUFilePartsOnClusters;
    }


    /**
     * Gets the isSuperfile value for this DFUFileDetail.
     * 
     * @return isSuperfile
     */
    public java.lang.Boolean getIsSuperfile() {
        return isSuperfile;
    }


    /**
     * Sets the isSuperfile value for this DFUFileDetail.
     * 
     * @param isSuperfile
     */
    public void setIsSuperfile(java.lang.Boolean isSuperfile) {
        this.isSuperfile = isSuperfile;
    }


    /**
     * Gets the showFileContent value for this DFUFileDetail.
     * 
     * @return showFileContent
     */
    public java.lang.Boolean getShowFileContent() {
        return showFileContent;
    }


    /**
     * Sets the showFileContent value for this DFUFileDetail.
     * 
     * @param showFileContent
     */
    public void setShowFileContent(java.lang.Boolean showFileContent) {
        this.showFileContent = showFileContent;
    }


    /**
     * Gets the subfiles value for this DFUFileDetail.
     * 
     * @return subfiles
     */
    public java.lang.String[] getSubfiles() {
        return subfiles;
    }


    /**
     * Sets the subfiles value for this DFUFileDetail.
     * 
     * @param subfiles
     */
    public void setSubfiles(java.lang.String[] subfiles) {
        this.subfiles = subfiles;
    }


    /**
     * Gets the superfiles value for this DFUFileDetail.
     * 
     * @return superfiles
     */
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFULogicalFile[] getSuperfiles() {
        return superfiles;
    }


    /**
     * Sets the superfiles value for this DFUFileDetail.
     * 
     * @param superfiles
     */
    public void setSuperfiles(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFULogicalFile[] superfiles) {
        this.superfiles = superfiles;
    }


    /**
     * Gets the protectList value for this DFUFileDetail.
     * 
     * @return protectList
     */
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileProtect[] getProtectList() {
        return protectList;
    }


    /**
     * Sets the protectList value for this DFUFileDetail.
     * 
     * @param protectList
     */
    public void setProtectList(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileProtect[] protectList) {
        this.protectList = protectList;
    }


    /**
     * Gets the fromRoxieCluster value for this DFUFileDetail.
     * 
     * @return fromRoxieCluster
     */
    public java.lang.Boolean getFromRoxieCluster() {
        return fromRoxieCluster;
    }


    /**
     * Sets the fromRoxieCluster value for this DFUFileDetail.
     * 
     * @param fromRoxieCluster
     */
    public void setFromRoxieCluster(java.lang.Boolean fromRoxieCluster) {
        this.fromRoxieCluster = fromRoxieCluster;
    }


    /**
     * Gets the graphs value for this DFUFileDetail.
     * 
     * @return graphs
     */
    public java.lang.String[] getGraphs() {
        return graphs;
    }


    /**
     * Sets the graphs value for this DFUFileDetail.
     * 
     * @param graphs
     */
    public void setGraphs(java.lang.String[] graphs) {
        this.graphs = graphs;
    }


    /**
     * Gets the userPermission value for this DFUFileDetail.
     * 
     * @return userPermission
     */
    public java.lang.String getUserPermission() {
        return userPermission;
    }


    /**
     * Sets the userPermission value for this DFUFileDetail.
     * 
     * @param userPermission
     */
    public void setUserPermission(java.lang.String userPermission) {
        this.userPermission = userPermission;
    }


    /**
     * Gets the contentType value for this DFUFileDetail.
     * 
     * @return contentType
     */
    public java.lang.String getContentType() {
        return contentType;
    }


    /**
     * Sets the contentType value for this DFUFileDetail.
     * 
     * @param contentType
     */
    public void setContentType(java.lang.String contentType) {
        this.contentType = contentType;
    }


    /**
     * Gets the compressedFileSize value for this DFUFileDetail.
     * 
     * @return compressedFileSize
     */
    public java.lang.Long getCompressedFileSize() {
        return compressedFileSize;
    }


    /**
     * Sets the compressedFileSize value for this DFUFileDetail.
     * 
     * @param compressedFileSize
     */
    public void setCompressedFileSize(java.lang.Long compressedFileSize) {
        this.compressedFileSize = compressedFileSize;
    }


    /**
     * Gets the percentCompressed value for this DFUFileDetail.
     * 
     * @return percentCompressed
     */
    public java.lang.String getPercentCompressed() {
        return percentCompressed;
    }


    /**
     * Sets the percentCompressed value for this DFUFileDetail.
     * 
     * @param percentCompressed
     */
    public void setPercentCompressed(java.lang.String percentCompressed) {
        this.percentCompressed = percentCompressed;
    }


    /**
     * Gets the isCompressed value for this DFUFileDetail.
     * 
     * @return isCompressed
     */
    public java.lang.Boolean getIsCompressed() {
        return isCompressed;
    }


    /**
     * Sets the isCompressed value for this DFUFileDetail.
     * 
     * @param isCompressed
     */
    public void setIsCompressed(java.lang.Boolean isCompressed) {
        this.isCompressed = isCompressed;
    }


    /**
     * Gets the browseData value for this DFUFileDetail.
     * 
     * @return browseData
     */
    public java.lang.Boolean getBrowseData() {
        return browseData;
    }


    /**
     * Sets the browseData value for this DFUFileDetail.
     * 
     * @param browseData
     */
    public void setBrowseData(java.lang.Boolean browseData) {
        this.browseData = browseData;
    }


    /**
     * Gets the jsonInfo value for this DFUFileDetail.
     * 
     * @return jsonInfo
     */
    public java.lang.String getJsonInfo() {
        return jsonInfo;
    }


    /**
     * Sets the jsonInfo value for this DFUFileDetail.
     * 
     * @param jsonInfo
     */
    public void setJsonInfo(java.lang.String jsonInfo) {
        this.jsonInfo = jsonInfo;
    }


    /**
     * Gets the binInfo value for this DFUFileDetail.
     * 
     * @return binInfo
     */
    public byte[] getBinInfo() {
        return binInfo;
    }


    /**
     * Sets the binInfo value for this DFUFileDetail.
     * 
     * @param binInfo
     */
    public void setBinInfo(byte[] binInfo) {
        this.binInfo = binInfo;
    }


    /**
     * Gets the packageID value for this DFUFileDetail.
     * 
     * @return packageID
     */
    public java.lang.String getPackageID() {
        return packageID;
    }


    /**
     * Sets the packageID value for this DFUFileDetail.
     * 
     * @param packageID
     */
    public void setPackageID(java.lang.String packageID) {
        this.packageID = packageID;
    }


    /**
     * Gets the partition value for this DFUFileDetail.
     * 
     * @return partition
     */
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFilePartition getPartition() {
        return partition;
    }


    /**
     * Sets the partition value for this DFUFileDetail.
     * 
     * @param partition
     */
    public void setPartition(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFilePartition partition) {
        this.partition = partition;
    }


    /**
     * Gets the blooms value for this DFUFileDetail.
     * 
     * @return blooms
     */
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileBloom[] getBlooms() {
        return blooms;
    }


    /**
     * Sets the blooms value for this DFUFileDetail.
     * 
     * @param blooms
     */
    public void setBlooms(org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileBloom[] blooms) {
        this.blooms = blooms;
    }


    /**
     * Gets the expireDays value for this DFUFileDetail.
     * 
     * @return expireDays
     */
    public java.lang.Integer getExpireDays() {
        return expireDays;
    }


    /**
     * Sets the expireDays value for this DFUFileDetail.
     * 
     * @param expireDays
     */
    public void setExpireDays(java.lang.Integer expireDays) {
        this.expireDays = expireDays;
    }


    /**
     * Gets the keyType value for this DFUFileDetail.
     * 
     * @return keyType
     */
    public java.lang.String getKeyType() {
        return keyType;
    }


    /**
     * Sets the keyType value for this DFUFileDetail.
     * 
     * @param keyType
     */
    public void setKeyType(java.lang.String keyType) {
        this.keyType = keyType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DFUFileDetail)) return false;
        DFUFileDetail other = (DFUFileDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.filename==null && other.getFilename()==null) || 
             (this.filename!=null &&
              this.filename.equals(other.getFilename()))) &&
            ((this.prefix==null && other.getPrefix()==null) || 
             (this.prefix!=null &&
              this.prefix.equals(other.getPrefix()))) &&
            ((this.nodeGroup==null && other.getNodeGroup()==null) || 
             (this.nodeGroup!=null &&
              this.nodeGroup.equals(other.getNodeGroup()))) &&
            ((this.numParts==null && other.getNumParts()==null) || 
             (this.numParts!=null &&
              this.numParts.equals(other.getNumParts()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.dir==null && other.getDir()==null) || 
             (this.dir!=null &&
              this.dir.equals(other.getDir()))) &&
            ((this.pathMask==null && other.getPathMask()==null) || 
             (this.pathMask!=null &&
              this.pathMask.equals(other.getPathMask()))) &&
            ((this.filesize==null && other.getFilesize()==null) || 
             (this.filesize!=null &&
              this.filesize.equals(other.getFilesize()))) &&
            ((this.fileSizeInt64==null && other.getFileSizeInt64()==null) || 
             (this.fileSizeInt64!=null &&
              this.fileSizeInt64.equals(other.getFileSizeInt64()))) &&
            ((this.recordSize==null && other.getRecordSize()==null) || 
             (this.recordSize!=null &&
              this.recordSize.equals(other.getRecordSize()))) &&
            ((this.recordCount==null && other.getRecordCount()==null) || 
             (this.recordCount!=null &&
              this.recordCount.equals(other.getRecordCount()))) &&
            ((this.recordSizeInt64==null && other.getRecordSizeInt64()==null) || 
             (this.recordSizeInt64!=null &&
              this.recordSizeInt64.equals(other.getRecordSizeInt64()))) &&
            ((this.recordCountInt64==null && other.getRecordCountInt64()==null) || 
             (this.recordCountInt64!=null &&
              this.recordCountInt64.equals(other.getRecordCountInt64()))) &&
            ((this.wuid==null && other.getWuid()==null) || 
             (this.wuid!=null &&
              this.wuid.equals(other.getWuid()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.jobName==null && other.getJobName()==null) || 
             (this.jobName!=null &&
              this.jobName.equals(other.getJobName()))) &&
            ((this.persistent==null && other.getPersistent()==null) || 
             (this.persistent!=null &&
              this.persistent.equals(other.getPersistent()))) &&
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            ((this.maxRecordSize==null && other.getMaxRecordSize()==null) || 
             (this.maxRecordSize!=null &&
              this.maxRecordSize.equals(other.getMaxRecordSize()))) &&
            ((this.csvSeparate==null && other.getCsvSeparate()==null) || 
             (this.csvSeparate!=null &&
              this.csvSeparate.equals(other.getCsvSeparate()))) &&
            ((this.csvQuote==null && other.getCsvQuote()==null) || 
             (this.csvQuote!=null &&
              this.csvQuote.equals(other.getCsvQuote()))) &&
            ((this.csvTerminate==null && other.getCsvTerminate()==null) || 
             (this.csvTerminate!=null &&
              this.csvTerminate.equals(other.getCsvTerminate()))) &&
            ((this.csvEscape==null && other.getCsvEscape()==null) || 
             (this.csvEscape!=null &&
              this.csvEscape.equals(other.getCsvEscape()))) &&
            ((this.modified==null && other.getModified()==null) || 
             (this.modified!=null &&
              this.modified.equals(other.getModified()))) &&
            ((this.ecl==null && other.getEcl()==null) || 
             (this.ecl!=null &&
              this.ecl.equals(other.getEcl()))) &&
            ((this.stat==null && other.getStat()==null) || 
             (this.stat!=null &&
              this.stat.equals(other.getStat()))) &&
            ((this.DFUFilePartsOnClusters==null && other.getDFUFilePartsOnClusters()==null) || 
             (this.DFUFilePartsOnClusters!=null &&
              java.util.Arrays.equals(this.DFUFilePartsOnClusters, other.getDFUFilePartsOnClusters()))) &&
            ((this.isSuperfile==null && other.getIsSuperfile()==null) || 
             (this.isSuperfile!=null &&
              this.isSuperfile.equals(other.getIsSuperfile()))) &&
            ((this.showFileContent==null && other.getShowFileContent()==null) || 
             (this.showFileContent!=null &&
              this.showFileContent.equals(other.getShowFileContent()))) &&
            ((this.subfiles==null && other.getSubfiles()==null) || 
             (this.subfiles!=null &&
              java.util.Arrays.equals(this.subfiles, other.getSubfiles()))) &&
            ((this.superfiles==null && other.getSuperfiles()==null) || 
             (this.superfiles!=null &&
              java.util.Arrays.equals(this.superfiles, other.getSuperfiles()))) &&
            ((this.protectList==null && other.getProtectList()==null) || 
             (this.protectList!=null &&
              java.util.Arrays.equals(this.protectList, other.getProtectList()))) &&
            ((this.fromRoxieCluster==null && other.getFromRoxieCluster()==null) || 
             (this.fromRoxieCluster!=null &&
              this.fromRoxieCluster.equals(other.getFromRoxieCluster()))) &&
            ((this.graphs==null && other.getGraphs()==null) || 
             (this.graphs!=null &&
              java.util.Arrays.equals(this.graphs, other.getGraphs()))) &&
            ((this.userPermission==null && other.getUserPermission()==null) || 
             (this.userPermission!=null &&
              this.userPermission.equals(other.getUserPermission()))) &&
            ((this.contentType==null && other.getContentType()==null) || 
             (this.contentType!=null &&
              this.contentType.equals(other.getContentType()))) &&
            ((this.compressedFileSize==null && other.getCompressedFileSize()==null) || 
             (this.compressedFileSize!=null &&
              this.compressedFileSize.equals(other.getCompressedFileSize()))) &&
            ((this.percentCompressed==null && other.getPercentCompressed()==null) || 
             (this.percentCompressed!=null &&
              this.percentCompressed.equals(other.getPercentCompressed()))) &&
            ((this.isCompressed==null && other.getIsCompressed()==null) || 
             (this.isCompressed!=null &&
              this.isCompressed.equals(other.getIsCompressed()))) &&
            ((this.browseData==null && other.getBrowseData()==null) || 
             (this.browseData!=null &&
              this.browseData.equals(other.getBrowseData()))) &&
            ((this.jsonInfo==null && other.getJsonInfo()==null) || 
             (this.jsonInfo!=null &&
              this.jsonInfo.equals(other.getJsonInfo()))) &&
            ((this.binInfo==null && other.getBinInfo()==null) || 
             (this.binInfo!=null &&
              java.util.Arrays.equals(this.binInfo, other.getBinInfo()))) &&
            ((this.packageID==null && other.getPackageID()==null) || 
             (this.packageID!=null &&
              this.packageID.equals(other.getPackageID()))) &&
            ((this.partition==null && other.getPartition()==null) || 
             (this.partition!=null &&
              this.partition.equals(other.getPartition()))) &&
            ((this.blooms==null && other.getBlooms()==null) || 
             (this.blooms!=null &&
              java.util.Arrays.equals(this.blooms, other.getBlooms()))) &&
            ((this.expireDays==null && other.getExpireDays()==null) || 
             (this.expireDays!=null &&
              this.expireDays.equals(other.getExpireDays()))) &&
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getFilename() != null) {
            _hashCode += getFilename().hashCode();
        }
        if (getPrefix() != null) {
            _hashCode += getPrefix().hashCode();
        }
        if (getNodeGroup() != null) {
            _hashCode += getNodeGroup().hashCode();
        }
        if (getNumParts() != null) {
            _hashCode += getNumParts().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDir() != null) {
            _hashCode += getDir().hashCode();
        }
        if (getPathMask() != null) {
            _hashCode += getPathMask().hashCode();
        }
        if (getFilesize() != null) {
            _hashCode += getFilesize().hashCode();
        }
        if (getFileSizeInt64() != null) {
            _hashCode += getFileSizeInt64().hashCode();
        }
        if (getRecordSize() != null) {
            _hashCode += getRecordSize().hashCode();
        }
        if (getRecordCount() != null) {
            _hashCode += getRecordCount().hashCode();
        }
        if (getRecordSizeInt64() != null) {
            _hashCode += getRecordSizeInt64().hashCode();
        }
        if (getRecordCountInt64() != null) {
            _hashCode += getRecordCountInt64().hashCode();
        }
        if (getWuid() != null) {
            _hashCode += getWuid().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getJobName() != null) {
            _hashCode += getJobName().hashCode();
        }
        if (getPersistent() != null) {
            _hashCode += getPersistent().hashCode();
        }
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        if (getMaxRecordSize() != null) {
            _hashCode += getMaxRecordSize().hashCode();
        }
        if (getCsvSeparate() != null) {
            _hashCode += getCsvSeparate().hashCode();
        }
        if (getCsvQuote() != null) {
            _hashCode += getCsvQuote().hashCode();
        }
        if (getCsvTerminate() != null) {
            _hashCode += getCsvTerminate().hashCode();
        }
        if (getCsvEscape() != null) {
            _hashCode += getCsvEscape().hashCode();
        }
        if (getModified() != null) {
            _hashCode += getModified().hashCode();
        }
        if (getEcl() != null) {
            _hashCode += getEcl().hashCode();
        }
        if (getStat() != null) {
            _hashCode += getStat().hashCode();
        }
        if (getDFUFilePartsOnClusters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDFUFilePartsOnClusters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDFUFilePartsOnClusters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsSuperfile() != null) {
            _hashCode += getIsSuperfile().hashCode();
        }
        if (getShowFileContent() != null) {
            _hashCode += getShowFileContent().hashCode();
        }
        if (getSubfiles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubfiles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubfiles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSuperfiles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSuperfiles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSuperfiles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProtectList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProtectList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProtectList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFromRoxieCluster() != null) {
            _hashCode += getFromRoxieCluster().hashCode();
        }
        if (getGraphs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGraphs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGraphs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserPermission() != null) {
            _hashCode += getUserPermission().hashCode();
        }
        if (getContentType() != null) {
            _hashCode += getContentType().hashCode();
        }
        if (getCompressedFileSize() != null) {
            _hashCode += getCompressedFileSize().hashCode();
        }
        if (getPercentCompressed() != null) {
            _hashCode += getPercentCompressed().hashCode();
        }
        if (getIsCompressed() != null) {
            _hashCode += getIsCompressed().hashCode();
        }
        if (getBrowseData() != null) {
            _hashCode += getBrowseData().hashCode();
        }
        if (getJsonInfo() != null) {
            _hashCode += getJsonInfo().hashCode();
        }
        if (getBinInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBinInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBinInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPackageID() != null) {
            _hashCode += getPackageID().hashCode();
        }
        if (getPartition() != null) {
            _hashCode += getPartition().hashCode();
        }
        if (getBlooms() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBlooms());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBlooms(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpireDays() != null) {
            _hashCode += getExpireDays().hashCode();
        }
        if (getKeyType() != null) {
            _hashCode += getKeyType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DFUFileDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFileDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filename");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Filename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("numParts");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "NumParts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("dir");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Dir"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pathMask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "PathMask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filesize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Filesize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSizeInt64");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FileSizeInt64"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "RecordSize"));
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
        elemField.setFieldName("recordSizeInt64");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "RecordSizeInt64"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordCountInt64");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "RecordCountInt64"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wuid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Wuid"));
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
        elemField.setFieldName("jobName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "JobName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("persistent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Persistent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxRecordSize");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "MaxRecordSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csvSeparate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "CsvSeparate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csvQuote");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "CsvQuote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csvTerminate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "CsvTerminate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csvEscape");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "CsvEscape"));
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
        elemField.setFieldName("ecl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Ecl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stat");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Stat"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFileStat"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DFUFilePartsOnClusters");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFilePartsOnClusters"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFilePartsOnCluster"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFilePartsOnCluster"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSuperfile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "isSuperfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showFileContent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ShowFileContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subfiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "subfiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("superfiles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Superfiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFULogicalFile"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFULogicalFile"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protectList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ProtectList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFileProtect"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFileProtect"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromRoxieCluster");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FromRoxieCluster"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graphs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Graphs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ECLGraph"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPermission");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "UserPermission"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("percentCompressed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "PercentCompressed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("browseData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "BrowseData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jsonInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "jsonInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "binInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "PackageID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Partition"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFilePartition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blooms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Blooms"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFileBloom"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFileBloom"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ExpireDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

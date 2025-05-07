/**
 * DFUFileDetail.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsdfu.latest;

/** DFUFileDetail bean class */
@SuppressWarnings({"unchecked", "unused"})
public class DFUFileDetail implements org.apache.axis2.databinding.ADBBean {
  /* This type was generated from the piece of schema that had
  name = DFUFileDetail
  Namespace URI = urn:hpccsystems:ws:wsdfu
  Namespace Prefix = ns1
  */

  /** field for Name */
  protected java.lang.String localName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localNameTracker = false;

  public boolean isNameSpecified() {
    return localNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getName() {
    return localName;
  }

  /**
   * Auto generated setter method
   *
   * @param param Name
   */
  public void setName(java.lang.String param) {
    localNameTracker = param != null;

    this.localName = param;
  }

  /** field for Filename */
  protected java.lang.String localFilename;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localFilenameTracker = false;

  public boolean isFilenameSpecified() {
    return localFilenameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getFilename() {
    return localFilename;
  }

  /**
   * Auto generated setter method
   *
   * @param param Filename
   */
  public void setFilename(java.lang.String param) {
    localFilenameTracker = param != null;

    this.localFilename = param;
  }

  /** field for Prefix */
  protected java.lang.String localPrefix;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPrefixTracker = false;

  public boolean isPrefixSpecified() {
    return localPrefixTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getPrefix() {
    return localPrefix;
  }

  /**
   * Auto generated setter method
   *
   * @param param Prefix
   */
  public void setPrefix(java.lang.String param) {
    localPrefixTracker = param != null;

    this.localPrefix = param;
  }

  /** field for NodeGroup */
  protected java.lang.String localNodeGroup;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localNodeGroupTracker = false;

  public boolean isNodeGroupSpecified() {
    return localNodeGroupTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getNodeGroup() {
    return localNodeGroup;
  }

  /**
   * Auto generated setter method
   *
   * @param param NodeGroup
   */
  public void setNodeGroup(java.lang.String param) {
    localNodeGroupTracker = param != null;

    this.localNodeGroup = param;
  }

  /** field for NumParts */
  protected int localNumParts;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localNumPartsTracker = false;

  public boolean isNumPartsSpecified() {
    return localNumPartsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getNumParts() {
    return localNumParts;
  }

  /**
   * Auto generated setter method
   *
   * @param param NumParts
   */
  public void setNumParts(int param) {

    // setting primitive attribute tracker to true
    localNumPartsTracker = param != java.lang.Integer.MIN_VALUE;

    this.localNumParts = param;
  }

  /** field for Description */
  protected java.lang.String localDescription;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDescriptionTracker = false;

  public boolean isDescriptionSpecified() {
    return localDescriptionTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getDescription() {
    return localDescription;
  }

  /**
   * Auto generated setter method
   *
   * @param param Description
   */
  public void setDescription(java.lang.String param) {
    localDescriptionTracker = param != null;

    this.localDescription = param;
  }

  /** field for Dir */
  protected java.lang.String localDir;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDirTracker = false;

  public boolean isDirSpecified() {
    return localDirTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getDir() {
    return localDir;
  }

  /**
   * Auto generated setter method
   *
   * @param param Dir
   */
  public void setDir(java.lang.String param) {
    localDirTracker = param != null;

    this.localDir = param;
  }

  /** field for PathMask */
  protected java.lang.String localPathMask;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPathMaskTracker = false;

  public boolean isPathMaskSpecified() {
    return localPathMaskTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getPathMask() {
    return localPathMask;
  }

  /**
   * Auto generated setter method
   *
   * @param param PathMask
   */
  public void setPathMask(java.lang.String param) {
    localPathMaskTracker = param != null;

    this.localPathMask = param;
  }

  /** field for Filesize */
  protected java.lang.String localFilesize;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localFilesizeTracker = false;

  public boolean isFilesizeSpecified() {
    return localFilesizeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getFilesize() {
    return localFilesize;
  }

  /**
   * Auto generated setter method
   *
   * @param param Filesize
   */
  public void setFilesize(java.lang.String param) {
    localFilesizeTracker = param != null;

    this.localFilesize = param;
  }

  /** field for FileSizeInt64 */
  protected long localFileSizeInt64;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localFileSizeInt64Tracker = false;

  public boolean isFileSizeInt64Specified() {
    return localFileSizeInt64Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getFileSizeInt64() {
    return localFileSizeInt64;
  }

  /**
   * Auto generated setter method
   *
   * @param param FileSizeInt64
   */
  public void setFileSizeInt64(long param) {

    // setting primitive attribute tracker to true
    localFileSizeInt64Tracker = param != java.lang.Long.MIN_VALUE;

    this.localFileSizeInt64 = param;
  }

  /** field for RecordSize */
  protected java.lang.String localRecordSize;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localRecordSizeTracker = false;

  public boolean isRecordSizeSpecified() {
    return localRecordSizeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getRecordSize() {
    return localRecordSize;
  }

  /**
   * Auto generated setter method
   *
   * @param param RecordSize
   */
  public void setRecordSize(java.lang.String param) {
    localRecordSizeTracker = param != null;

    this.localRecordSize = param;
  }

  /** field for RecordCount */
  protected java.lang.String localRecordCount;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localRecordCountTracker = false;

  public boolean isRecordCountSpecified() {
    return localRecordCountTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getRecordCount() {
    return localRecordCount;
  }

  /**
   * Auto generated setter method
   *
   * @param param RecordCount
   */
  public void setRecordCount(java.lang.String param) {
    localRecordCountTracker = param != null;

    this.localRecordCount = param;
  }

  /** field for RecordSizeInt64 */
  protected long localRecordSizeInt64;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localRecordSizeInt64Tracker = false;

  public boolean isRecordSizeInt64Specified() {
    return localRecordSizeInt64Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getRecordSizeInt64() {
    return localRecordSizeInt64;
  }

  /**
   * Auto generated setter method
   *
   * @param param RecordSizeInt64
   */
  public void setRecordSizeInt64(long param) {

    // setting primitive attribute tracker to true
    localRecordSizeInt64Tracker = param != java.lang.Long.MIN_VALUE;

    this.localRecordSizeInt64 = param;
  }

  /** field for RecordCountInt64 */
  protected long localRecordCountInt64;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localRecordCountInt64Tracker = false;

  public boolean isRecordCountInt64Specified() {
    return localRecordCountInt64Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getRecordCountInt64() {
    return localRecordCountInt64;
  }

  /**
   * Auto generated setter method
   *
   * @param param RecordCountInt64
   */
  public void setRecordCountInt64(long param) {

    // setting primitive attribute tracker to true
    localRecordCountInt64Tracker = param != java.lang.Long.MIN_VALUE;

    this.localRecordCountInt64 = param;
  }

  /** field for Wuid */
  protected java.lang.String localWuid;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localWuidTracker = false;

  public boolean isWuidSpecified() {
    return localWuidTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getWuid() {
    return localWuid;
  }

  /**
   * Auto generated setter method
   *
   * @param param Wuid
   */
  public void setWuid(java.lang.String param) {
    localWuidTracker = param != null;

    this.localWuid = param;
  }

  /** field for Owner */
  protected java.lang.String localOwner;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localOwnerTracker = false;

  public boolean isOwnerSpecified() {
    return localOwnerTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getOwner() {
    return localOwner;
  }

  /**
   * Auto generated setter method
   *
   * @param param Owner
   */
  public void setOwner(java.lang.String param) {
    localOwnerTracker = param != null;

    this.localOwner = param;
  }

  /** field for JobName */
  protected java.lang.String localJobName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localJobNameTracker = false;

  public boolean isJobNameSpecified() {
    return localJobNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getJobName() {
    return localJobName;
  }

  /**
   * Auto generated setter method
   *
   * @param param JobName
   */
  public void setJobName(java.lang.String param) {
    localJobNameTracker = param != null;

    this.localJobName = param;
  }

  /** field for Persistent */
  protected java.lang.String localPersistent;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPersistentTracker = false;

  public boolean isPersistentSpecified() {
    return localPersistentTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getPersistent() {
    return localPersistent;
  }

  /**
   * Auto generated setter method
   *
   * @param param Persistent
   */
  public void setPersistent(java.lang.String param) {
    localPersistentTracker = param != null;

    this.localPersistent = param;
  }

  /** field for Format */
  protected java.lang.String localFormat;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localFormatTracker = false;

  public boolean isFormatSpecified() {
    return localFormatTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getFormat() {
    return localFormat;
  }

  /**
   * Auto generated setter method
   *
   * @param param Format
   */
  public void setFormat(java.lang.String param) {
    localFormatTracker = param != null;

    this.localFormat = param;
  }

  /** field for MaxRecordSize */
  protected java.lang.String localMaxRecordSize;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localMaxRecordSizeTracker = false;

  public boolean isMaxRecordSizeSpecified() {
    return localMaxRecordSizeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getMaxRecordSize() {
    return localMaxRecordSize;
  }

  /**
   * Auto generated setter method
   *
   * @param param MaxRecordSize
   */
  public void setMaxRecordSize(java.lang.String param) {
    localMaxRecordSizeTracker = param != null;

    this.localMaxRecordSize = param;
  }

  /** field for CsvSeparate */
  protected java.lang.String localCsvSeparate;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localCsvSeparateTracker = false;

  public boolean isCsvSeparateSpecified() {
    return localCsvSeparateTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getCsvSeparate() {
    return localCsvSeparate;
  }

  /**
   * Auto generated setter method
   *
   * @param param CsvSeparate
   */
  public void setCsvSeparate(java.lang.String param) {
    localCsvSeparateTracker = param != null;

    this.localCsvSeparate = param;
  }

  /** field for CsvQuote */
  protected java.lang.String localCsvQuote;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localCsvQuoteTracker = false;

  public boolean isCsvQuoteSpecified() {
    return localCsvQuoteTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getCsvQuote() {
    return localCsvQuote;
  }

  /**
   * Auto generated setter method
   *
   * @param param CsvQuote
   */
  public void setCsvQuote(java.lang.String param) {
    localCsvQuoteTracker = param != null;

    this.localCsvQuote = param;
  }

  /** field for CsvTerminate */
  protected java.lang.String localCsvTerminate;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localCsvTerminateTracker = false;

  public boolean isCsvTerminateSpecified() {
    return localCsvTerminateTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getCsvTerminate() {
    return localCsvTerminate;
  }

  /**
   * Auto generated setter method
   *
   * @param param CsvTerminate
   */
  public void setCsvTerminate(java.lang.String param) {
    localCsvTerminateTracker = param != null;

    this.localCsvTerminate = param;
  }

  /** field for CsvEscape */
  protected java.lang.String localCsvEscape;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localCsvEscapeTracker = false;

  public boolean isCsvEscapeSpecified() {
    return localCsvEscapeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getCsvEscape() {
    return localCsvEscape;
  }

  /**
   * Auto generated setter method
   *
   * @param param CsvEscape
   */
  public void setCsvEscape(java.lang.String param) {
    localCsvEscapeTracker = param != null;

    this.localCsvEscape = param;
  }

  /** field for Modified */
  protected java.lang.String localModified;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localModifiedTracker = false;

  public boolean isModifiedSpecified() {
    return localModifiedTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getModified() {
    return localModified;
  }

  /**
   * Auto generated setter method
   *
   * @param param Modified
   */
  public void setModified(java.lang.String param) {
    localModifiedTracker = param != null;

    this.localModified = param;
  }

  /** field for Ecl */
  protected java.lang.String localEcl;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localEclTracker = false;

  public boolean isEclSpecified() {
    return localEclTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getEcl() {
    return localEcl;
  }

  /**
   * Auto generated setter method
   *
   * @param param Ecl
   */
  public void setEcl(java.lang.String param) {
    localEclTracker = param != null;

    this.localEcl = param;
  }

  /** field for Stat */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileStat localStat;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localStatTracker = false;

  public boolean isStatSpecified() {
    return localStatTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileStat
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileStat getStat() {
    return localStat;
  }

  /**
   * Auto generated setter method
   *
   * @param param Stat
   */
  public void setStat(org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileStat param) {
    localStatTracker = param != null;

    this.localStat = param;
  }

  /** field for DFUFilePartsOnClusters */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFilePartsOnCluster
      localDFUFilePartsOnClusters;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUFilePartsOnClustersTracker = false;

  public boolean isDFUFilePartsOnClustersSpecified() {
    return localDFUFilePartsOnClustersTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFilePartsOnCluster
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFilePartsOnCluster
      getDFUFilePartsOnClusters() {
    return localDFUFilePartsOnClusters;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUFilePartsOnClusters
   */
  public void setDFUFilePartsOnClusters(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFilePartsOnCluster param) {
    localDFUFilePartsOnClustersTracker = param != null;

    this.localDFUFilePartsOnClusters = param;
  }

  /** field for IsSuperfile */
  protected boolean localIsSuperfile =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIsSuperfileTracker = false;

  public boolean isIsSuperfileSpecified() {
    return localIsSuperfileTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getIsSuperfile() {
    return localIsSuperfile;
  }

  /**
   * Auto generated setter method
   *
   * @param param IsSuperfile
   */
  public void setIsSuperfile(boolean param) {

    // setting primitive attribute tracker to true
    localIsSuperfileTracker = true;

    this.localIsSuperfile = param;
  }

  /** field for ShowFileContent */
  protected boolean localShowFileContent =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("true");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localShowFileContentTracker = false;

  public boolean isShowFileContentSpecified() {
    return localShowFileContentTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getShowFileContent() {
    return localShowFileContent;
  }

  /**
   * Auto generated setter method
   *
   * @param param ShowFileContent
   */
  public void setShowFileContent(boolean param) {

    // setting primitive attribute tracker to true
    localShowFileContentTracker = true;

    this.localShowFileContent = param;
  }

  /** field for Subfiles */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspStringArray localSubfiles;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSubfilesTracker = false;

  public boolean isSubfilesSpecified() {
    return localSubfilesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspStringArray
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspStringArray getSubfiles() {
    return localSubfiles;
  }

  /**
   * Auto generated setter method
   *
   * @param param Subfiles
   */
  public void setSubfiles(org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspStringArray param) {
    localSubfilesTracker = param != null;

    this.localSubfiles = param;
  }

  /** field for Superfiles */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFULogicalFile localSuperfiles;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSuperfilesTracker = false;

  public boolean isSuperfilesSpecified() {
    return localSuperfilesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFULogicalFile
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFULogicalFile getSuperfiles() {
    return localSuperfiles;
  }

  /**
   * Auto generated setter method
   *
   * @param param Superfiles
   */
  public void setSuperfiles(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFULogicalFile param) {
    localSuperfilesTracker = param != null;

    this.localSuperfiles = param;
  }

  /** field for ProtectList */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileProtect localProtectList;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localProtectListTracker = false;

  public boolean isProtectListSpecified() {
    return localProtectListTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileProtect
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileProtect getProtectList() {
    return localProtectList;
  }

  /**
   * Auto generated setter method
   *
   * @param param ProtectList
   */
  public void setProtectList(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileProtect param) {
    localProtectListTracker = param != null;

    this.localProtectList = param;
  }

  /** field for FromRoxieCluster */
  protected boolean localFromRoxieCluster;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localFromRoxieClusterTracker = false;

  public boolean isFromRoxieClusterSpecified() {
    return localFromRoxieClusterTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getFromRoxieCluster() {
    return localFromRoxieCluster;
  }

  /**
   * Auto generated setter method
   *
   * @param param FromRoxieCluster
   */
  public void setFromRoxieCluster(boolean param) {

    // setting primitive attribute tracker to true
    localFromRoxieClusterTracker = true;

    this.localFromRoxieCluster = param;
  }

  /** field for Graphs */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.Graphs_type0 localGraphs;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localGraphsTracker = false;

  public boolean isGraphsSpecified() {
    return localGraphsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.Graphs_type0
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.Graphs_type0 getGraphs() {
    return localGraphs;
  }

  /**
   * Auto generated setter method
   *
   * @param param Graphs
   */
  public void setGraphs(org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.Graphs_type0 param) {
    localGraphsTracker = param != null;

    this.localGraphs = param;
  }

  /** field for UserPermission */
  protected java.lang.String localUserPermission;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localUserPermissionTracker = false;

  public boolean isUserPermissionSpecified() {
    return localUserPermissionTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getUserPermission() {
    return localUserPermission;
  }

  /**
   * Auto generated setter method
   *
   * @param param UserPermission
   */
  public void setUserPermission(java.lang.String param) {
    localUserPermissionTracker = param != null;

    this.localUserPermission = param;
  }

  /** field for ContentType */
  protected java.lang.String localContentType;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localContentTypeTracker = false;

  public boolean isContentTypeSpecified() {
    return localContentTypeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getContentType() {
    return localContentType;
  }

  /**
   * Auto generated setter method
   *
   * @param param ContentType
   */
  public void setContentType(java.lang.String param) {
    localContentTypeTracker = param != null;

    this.localContentType = param;
  }

  /** field for CompressedFileSize */
  protected long localCompressedFileSize;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localCompressedFileSizeTracker = false;

  public boolean isCompressedFileSizeSpecified() {
    return localCompressedFileSizeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getCompressedFileSize() {
    return localCompressedFileSize;
  }

  /**
   * Auto generated setter method
   *
   * @param param CompressedFileSize
   */
  public void setCompressedFileSize(long param) {

    // setting primitive attribute tracker to true
    localCompressedFileSizeTracker = param != java.lang.Long.MIN_VALUE;

    this.localCompressedFileSize = param;
  }

  /** field for PercentCompressed */
  protected java.lang.String localPercentCompressed;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPercentCompressedTracker = false;

  public boolean isPercentCompressedSpecified() {
    return localPercentCompressedTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getPercentCompressed() {
    return localPercentCompressed;
  }

  /**
   * Auto generated setter method
   *
   * @param param PercentCompressed
   */
  public void setPercentCompressed(java.lang.String param) {
    localPercentCompressedTracker = param != null;

    this.localPercentCompressed = param;
  }

  /** field for IsCompressed */
  protected boolean localIsCompressed =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIsCompressedTracker = false;

  public boolean isIsCompressedSpecified() {
    return localIsCompressedTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getIsCompressed() {
    return localIsCompressed;
  }

  /**
   * Auto generated setter method
   *
   * @param param IsCompressed
   */
  public void setIsCompressed(boolean param) {

    // setting primitive attribute tracker to true
    localIsCompressedTracker = true;

    this.localIsCompressed = param;
  }

  /** field for IsRestricted */
  protected boolean localIsRestricted =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIsRestrictedTracker = false;

  public boolean isIsRestrictedSpecified() {
    return localIsRestrictedTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getIsRestricted() {
    return localIsRestricted;
  }

  /**
   * Auto generated setter method
   *
   * @param param IsRestricted
   */
  public void setIsRestricted(boolean param) {

    // setting primitive attribute tracker to true
    localIsRestrictedTracker = true;

    this.localIsRestricted = param;
  }

  /** field for BrowseData */
  protected boolean localBrowseData =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("true");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localBrowseDataTracker = false;

  public boolean isBrowseDataSpecified() {
    return localBrowseDataTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getBrowseData() {
    return localBrowseData;
  }

  /**
   * Auto generated setter method
   *
   * @param param BrowseData
   */
  public void setBrowseData(boolean param) {

    // setting primitive attribute tracker to true
    localBrowseDataTracker = true;

    this.localBrowseData = param;
  }

  /** field for JsonInfo */
  protected java.lang.String localJsonInfo;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localJsonInfoTracker = false;

  public boolean isJsonInfoSpecified() {
    return localJsonInfoTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getJsonInfo() {
    return localJsonInfo;
  }

  /**
   * Auto generated setter method
   *
   * @param param JsonInfo
   */
  public void setJsonInfo(java.lang.String param) {
    localJsonInfoTracker = param != null;

    this.localJsonInfo = param;
  }

  /** field for BinInfo */
  protected jakarta.activation.DataHandler localBinInfo;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localBinInfoTracker = false;

  public boolean isBinInfoSpecified() {
    return localBinInfoTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return jakarta.activation.DataHandler
   */
  public jakarta.activation.DataHandler getBinInfo() {
    return localBinInfo;
  }

  /**
   * Auto generated setter method
   *
   * @param param BinInfo
   */
  public void setBinInfo(jakarta.activation.DataHandler param) {
    localBinInfoTracker = param != null;

    this.localBinInfo = param;
  }

  /** field for PackageID */
  protected java.lang.String localPackageID;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPackageIDTracker = false;

  public boolean isPackageIDSpecified() {
    return localPackageIDTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getPackageID() {
    return localPackageID;
  }

  /**
   * Auto generated setter method
   *
   * @param param PackageID
   */
  public void setPackageID(java.lang.String param) {
    localPackageIDTracker = param != null;

    this.localPackageID = param;
  }

  /** field for Partition */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFilePartition localPartition;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPartitionTracker = false;

  public boolean isPartitionSpecified() {
    return localPartitionTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFilePartition
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFilePartition getPartition() {
    return localPartition;
  }

  /**
   * Auto generated setter method
   *
   * @param param Partition
   */
  public void setPartition(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFilePartition param) {
    localPartitionTracker = param != null;

    this.localPartition = param;
  }

  /** field for Blooms */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileBloom localBlooms;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localBloomsTracker = false;

  public boolean isBloomsSpecified() {
    return localBloomsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileBloom
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileBloom getBlooms() {
    return localBlooms;
  }

  /**
   * Auto generated setter method
   *
   * @param param Blooms
   */
  public void setBlooms(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileBloom param) {
    localBloomsTracker = param != null;

    this.localBlooms = param;
  }

  /** field for ExpireDays */
  protected int localExpireDays;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localExpireDaysTracker = false;

  public boolean isExpireDaysSpecified() {
    return localExpireDaysTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getExpireDays() {
    return localExpireDays;
  }

  /**
   * Auto generated setter method
   *
   * @param param ExpireDays
   */
  public void setExpireDays(int param) {

    // setting primitive attribute tracker to true
    localExpireDaysTracker = param != java.lang.Integer.MIN_VALUE;

    this.localExpireDays = param;
  }

  /** field for KeyType */
  protected java.lang.String localKeyType;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localKeyTypeTracker = false;

  public boolean isKeyTypeSpecified() {
    return localKeyTypeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getKeyType() {
    return localKeyType;
  }

  /**
   * Auto generated setter method
   *
   * @param param KeyType
   */
  public void setKeyType(java.lang.String param) {
    localKeyTypeTracker = param != null;

    this.localKeyType = param;
  }

  /** field for AtRestCost */
  protected double localAtRestCost;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localAtRestCostTracker = false;

  public boolean isAtRestCostSpecified() {
    return localAtRestCostTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return double
   */
  public double getAtRestCost() {
    return localAtRestCost;
  }

  /**
   * Auto generated setter method
   *
   * @param param AtRestCost
   */
  public void setAtRestCost(double param) {

    // setting primitive attribute tracker to true
    localAtRestCostTracker = !java.lang.Double.isNaN(param);

    this.localAtRestCost = param;
  }

  /** field for AccessCost */
  protected double localAccessCost;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localAccessCostTracker = false;

  public boolean isAccessCostSpecified() {
    return localAccessCostTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return double
   */
  public double getAccessCost() {
    return localAccessCost;
  }

  /**
   * Auto generated setter method
   *
   * @param param AccessCost
   */
  public void setAccessCost(double param) {

    // setting primitive attribute tracker to true
    localAccessCostTracker = !java.lang.Double.isNaN(param);

    this.localAccessCost = param;
  }

  /** field for ExpirationDate */
  protected java.lang.String localExpirationDate;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localExpirationDateTracker = false;

  public boolean isExpirationDateSpecified() {
    return localExpirationDateTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getExpirationDate() {
    return localExpirationDate;
  }

  /**
   * Auto generated setter method
   *
   * @param param ExpirationDate
   */
  public void setExpirationDate(java.lang.String param) {
    localExpirationDateTracker = param != null;

    this.localExpirationDate = param;
  }

  /** field for ExtendedIndexInfo */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUIndexInfo localExtendedIndexInfo;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localExtendedIndexInfoTracker = false;

  public boolean isExtendedIndexInfoSpecified() {
    return localExtendedIndexInfoTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUIndexInfo
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUIndexInfo getExtendedIndexInfo() {
    return localExtendedIndexInfo;
  }

  /**
   * Auto generated setter method
   *
   * @param param ExtendedIndexInfo
   */
  public void setExtendedIndexInfo(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUIndexInfo param) {
    localExtendedIndexInfoTracker = param != null;

    this.localExtendedIndexInfo = param;
  }

  /**
   * @param parentQName
   * @param factory
   * @return org.apache.axiom.om.OMElement
   */
  public org.apache.axiom.om.OMElement getOMElement(
      final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
      throws org.apache.axis2.databinding.ADBException {

    return factory.createOMElement(
        new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
  }

  public void serialize(
      final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
      throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
    serialize(parentQName, xmlWriter, false);
  }

  public void serialize(
      final javax.xml.namespace.QName parentQName,
      javax.xml.stream.XMLStreamWriter xmlWriter,
      boolean serializeType)
      throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

    java.lang.String prefix = null;
    java.lang.String namespace = null;

    prefix = parentQName.getPrefix();
    namespace = parentQName.getNamespaceURI();
    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

    if (serializeType) {

      java.lang.String namespacePrefix = registerPrefix(xmlWriter, "urn:hpccsystems:ws:wsdfu");
      if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            namespacePrefix + ":DFUFileDetail",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "DFUFileDetail", xmlWriter);
      }
    }
    if (localNameTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "Name", xmlWriter);

      if (localName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Name cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localName);
      }

      xmlWriter.writeEndElement();
    }
    if (localFilenameTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "Filename", xmlWriter);

      if (localFilename == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Filename cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localFilename);
      }

      xmlWriter.writeEndElement();
    }
    if (localPrefixTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "Prefix", xmlWriter);

      if (localPrefix == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Prefix cannot be null!!");

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

        throw new org.apache.axis2.databinding.ADBException("NodeGroup cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localNodeGroup);
      }

      xmlWriter.writeEndElement();
    }
    if (localNumPartsTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "NumParts", xmlWriter);

      if (localNumParts == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("NumParts cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNumParts));
      }

      xmlWriter.writeEndElement();
    }
    if (localDescriptionTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "Description", xmlWriter);

      if (localDescription == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Description cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localDescription);
      }

      xmlWriter.writeEndElement();
    }
    if (localDirTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "Dir", xmlWriter);

      if (localDir == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Dir cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localDir);
      }

      xmlWriter.writeEndElement();
    }
    if (localPathMaskTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "PathMask", xmlWriter);

      if (localPathMask == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("PathMask cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localPathMask);
      }

      xmlWriter.writeEndElement();
    }
    if (localFilesizeTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "Filesize", xmlWriter);

      if (localFilesize == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Filesize cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localFilesize);
      }

      xmlWriter.writeEndElement();
    }
    if (localFileSizeInt64Tracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "FileSizeInt64", xmlWriter);

      if (localFileSizeInt64 == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("FileSizeInt64 cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFileSizeInt64));
      }

      xmlWriter.writeEndElement();
    }
    if (localRecordSizeTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "RecordSize", xmlWriter);

      if (localRecordSize == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("RecordSize cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localRecordSize);
      }

      xmlWriter.writeEndElement();
    }
    if (localRecordCountTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "RecordCount", xmlWriter);

      if (localRecordCount == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("RecordCount cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localRecordCount);
      }

      xmlWriter.writeEndElement();
    }
    if (localRecordSizeInt64Tracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "RecordSizeInt64", xmlWriter);

      if (localRecordSizeInt64 == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("RecordSizeInt64 cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRecordSizeInt64));
      }

      xmlWriter.writeEndElement();
    }
    if (localRecordCountInt64Tracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "RecordCountInt64", xmlWriter);

      if (localRecordCountInt64 == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("RecordCountInt64 cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localRecordCountInt64));
      }

      xmlWriter.writeEndElement();
    }
    if (localWuidTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "Wuid", xmlWriter);

      if (localWuid == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Wuid cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localWuid);
      }

      xmlWriter.writeEndElement();
    }
    if (localOwnerTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "Owner", xmlWriter);

      if (localOwner == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Owner cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localOwner);
      }

      xmlWriter.writeEndElement();
    }
    if (localJobNameTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "JobName", xmlWriter);

      if (localJobName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("JobName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localJobName);
      }

      xmlWriter.writeEndElement();
    }
    if (localPersistentTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "Persistent", xmlWriter);

      if (localPersistent == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Persistent cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localPersistent);
      }

      xmlWriter.writeEndElement();
    }
    if (localFormatTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "Format", xmlWriter);

      if (localFormat == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Format cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localFormat);
      }

      xmlWriter.writeEndElement();
    }
    if (localMaxRecordSizeTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "MaxRecordSize", xmlWriter);

      if (localMaxRecordSize == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("MaxRecordSize cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localMaxRecordSize);
      }

      xmlWriter.writeEndElement();
    }
    if (localCsvSeparateTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "CsvSeparate", xmlWriter);

      if (localCsvSeparate == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("CsvSeparate cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localCsvSeparate);
      }

      xmlWriter.writeEndElement();
    }
    if (localCsvQuoteTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "CsvQuote", xmlWriter);

      if (localCsvQuote == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("CsvQuote cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localCsvQuote);
      }

      xmlWriter.writeEndElement();
    }
    if (localCsvTerminateTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "CsvTerminate", xmlWriter);

      if (localCsvTerminate == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("CsvTerminate cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localCsvTerminate);
      }

      xmlWriter.writeEndElement();
    }
    if (localCsvEscapeTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "CsvEscape", xmlWriter);

      if (localCsvEscape == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("CsvEscape cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localCsvEscape);
      }

      xmlWriter.writeEndElement();
    }
    if (localModifiedTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "Modified", xmlWriter);

      if (localModified == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Modified cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localModified);
      }

      xmlWriter.writeEndElement();
    }
    if (localEclTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "Ecl", xmlWriter);

      if (localEcl == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Ecl cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localEcl);
      }

      xmlWriter.writeEndElement();
    }
    if (localStatTracker) {
      if (localStat == null) {
        throw new org.apache.axis2.databinding.ADBException("Stat cannot be null!!");
      }
      localStat.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Stat"), xmlWriter);
    }
    if (localDFUFilePartsOnClustersTracker) {
      if (localDFUFilePartsOnClusters == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUFilePartsOnClusters cannot be null!!");
      }
      localDFUFilePartsOnClusters.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFilePartsOnClusters"),
          xmlWriter);
    }
    if (localIsSuperfileTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "isSuperfile", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("isSuperfile cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsSuperfile));
      }

      xmlWriter.writeEndElement();
    }
    if (localShowFileContentTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "ShowFileContent", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("ShowFileContent cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localShowFileContent));
      }

      xmlWriter.writeEndElement();
    }
    if (localSubfilesTracker) {
      if (localSubfiles == null) {
        throw new org.apache.axis2.databinding.ADBException("subfiles cannot be null!!");
      }
      localSubfiles.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "subfiles"), xmlWriter);
    }
    if (localSuperfilesTracker) {
      if (localSuperfiles == null) {
        throw new org.apache.axis2.databinding.ADBException("Superfiles cannot be null!!");
      }
      localSuperfiles.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Superfiles"), xmlWriter);
    }
    if (localProtectListTracker) {
      if (localProtectList == null) {
        throw new org.apache.axis2.databinding.ADBException("ProtectList cannot be null!!");
      }
      localProtectList.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ProtectList"), xmlWriter);
    }
    if (localFromRoxieClusterTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "FromRoxieCluster", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("FromRoxieCluster cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localFromRoxieCluster));
      }

      xmlWriter.writeEndElement();
    }
    if (localGraphsTracker) {
      if (localGraphs == null) {
        throw new org.apache.axis2.databinding.ADBException("Graphs cannot be null!!");
      }
      localGraphs.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Graphs"), xmlWriter);
    }
    if (localUserPermissionTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "UserPermission", xmlWriter);

      if (localUserPermission == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("UserPermission cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localUserPermission);
      }

      xmlWriter.writeEndElement();
    }
    if (localContentTypeTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "ContentType", xmlWriter);

      if (localContentType == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ContentType cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localContentType);
      }

      xmlWriter.writeEndElement();
    }
    if (localCompressedFileSizeTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "CompressedFileSize", xmlWriter);

      if (localCompressedFileSize == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("CompressedFileSize cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localCompressedFileSize));
      }

      xmlWriter.writeEndElement();
    }
    if (localPercentCompressedTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "PercentCompressed", xmlWriter);

      if (localPercentCompressed == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("PercentCompressed cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localPercentCompressed);
      }

      xmlWriter.writeEndElement();
    }
    if (localIsCompressedTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "IsCompressed", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("IsCompressed cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsCompressed));
      }

      xmlWriter.writeEndElement();
    }
    if (localIsRestrictedTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "IsRestricted", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("IsRestricted cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsRestricted));
      }

      xmlWriter.writeEndElement();
    }
    if (localBrowseDataTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "BrowseData", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("BrowseData cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localBrowseData));
      }

      xmlWriter.writeEndElement();
    }
    if (localJsonInfoTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "jsonInfo", xmlWriter);

      if (localJsonInfo == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("jsonInfo cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localJsonInfo);
      }

      xmlWriter.writeEndElement();
    }
    if (localBinInfoTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "binInfo", xmlWriter);

      if (localBinInfo != null) {
        try {
          org.apache.axiom.util.stax.XMLStreamWriterUtils.writeBlob(
              xmlWriter,
              org.apache.axiom.util.activation.DataHandlerUtils.toBlob(localBinInfo),
              null,
              true);
        } catch (java.io.IOException ex) {
          throw new javax.xml.stream.XMLStreamException(
              "Unable to read data handler for binInfo", ex);
        }
      } else {

      }

      xmlWriter.writeEndElement();
    }
    if (localPackageIDTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "PackageID", xmlWriter);

      if (localPackageID == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("PackageID cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localPackageID);
      }

      xmlWriter.writeEndElement();
    }
    if (localPartitionTracker) {
      if (localPartition == null) {
        throw new org.apache.axis2.databinding.ADBException("Partition cannot be null!!");
      }
      localPartition.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Partition"), xmlWriter);
    }
    if (localBloomsTracker) {
      if (localBlooms == null) {
        throw new org.apache.axis2.databinding.ADBException("Blooms cannot be null!!");
      }
      localBlooms.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Blooms"), xmlWriter);
    }
    if (localExpireDaysTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "ExpireDays", xmlWriter);

      if (localExpireDays == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("ExpireDays cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExpireDays));
      }

      xmlWriter.writeEndElement();
    }
    if (localKeyTypeTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "KeyType", xmlWriter);

      if (localKeyType == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("KeyType cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localKeyType);
      }

      xmlWriter.writeEndElement();
    }
    if (localAtRestCostTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "AtRestCost", xmlWriter);

      if (java.lang.Double.isNaN(localAtRestCost)) {

        throw new org.apache.axis2.databinding.ADBException("AtRestCost cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAtRestCost));
      }

      xmlWriter.writeEndElement();
    }
    if (localAccessCostTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "AccessCost", xmlWriter);

      if (java.lang.Double.isNaN(localAccessCost)) {

        throw new org.apache.axis2.databinding.ADBException("AccessCost cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAccessCost));
      }

      xmlWriter.writeEndElement();
    }
    if (localExpirationDateTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "ExpirationDate", xmlWriter);

      if (localExpirationDate == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ExpirationDate cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localExpirationDate);
      }

      xmlWriter.writeEndElement();
    }
    if (localExtendedIndexInfoTracker) {
      if (localExtendedIndexInfo == null) {
        throw new org.apache.axis2.databinding.ADBException("ExtendedIndexInfo cannot be null!!");
      }
      localExtendedIndexInfo.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ExtendedIndexInfo"),
          xmlWriter);
    }
    xmlWriter.writeEndElement();
  }

  private static java.lang.String generatePrefix(java.lang.String namespace) {
    if (namespace.equals("urn:hpccsystems:ws:wsdfu")) {
      return "ns1";
    }
    return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
  }

  /** Utility method to write an element start tag. */
  private void writeStartElement(
      java.lang.String prefix,
      java.lang.String namespace,
      java.lang.String localPart,
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

  /** Util method to write an attribute with the ns prefix */
  private void writeAttribute(
      java.lang.String prefix,
      java.lang.String namespace,
      java.lang.String attName,
      java.lang.String attValue,
      javax.xml.stream.XMLStreamWriter xmlWriter)
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

  /** Util method to write an attribute without the ns prefix */
  private void writeAttribute(
      java.lang.String namespace,
      java.lang.String attName,
      java.lang.String attValue,
      javax.xml.stream.XMLStreamWriter xmlWriter)
      throws javax.xml.stream.XMLStreamException {
    if (namespace.equals("")) {
      xmlWriter.writeAttribute(attName, attValue);
    } else {
      xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
    }
  }

  /** Util method to write an attribute without the ns prefix */
  private void writeQNameAttribute(
      java.lang.String namespace,
      java.lang.String attName,
      javax.xml.namespace.QName qname,
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
      xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
    }
  }
  /** method to handle Qnames */
  private void writeQName(
      javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
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
        xmlWriter.writeCharacters(
            prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      } else {
        // i.e this is the default namespace
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }

    } else {
      xmlWriter.writeCharacters(
          org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
    }
  }

  private void writeQNames(
      javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
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
            stringToWrite
                .append(prefix)
                .append(":")
                .append(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        } else {
          stringToWrite.append(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
        }
      }
      xmlWriter.writeCharacters(stringToWrite.toString());
    }
  }

  /** Register a namespace prefix */
  private java.lang.String registerPrefix(
      javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
      throws javax.xml.stream.XMLStreamException {
    java.lang.String prefix = xmlWriter.getPrefix(namespace);
    if (prefix == null) {
      prefix = generatePrefix(namespace);
      javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
      while (true) {
        java.lang.String uri = nsContext.getNamespaceURI(prefix);
        if (uri == null || uri.length() == 0) {
          break;
        }
        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
      }
      xmlWriter.writeNamespace(prefix, namespace);
      xmlWriter.setPrefix(prefix, namespace);
    }
    return prefix;
  }

  /** Factory class that keeps the parse method */
  public static class Factory {
    private static org.apache.commons.logging.Log log =
        org.apache.commons.logging.LogFactory.getLog(Factory.class);

    /**
     * static method to create the object Precondition: If this object is an element, the current or
     * next start element starts this object and any intervening reader events are ignorable If this
     * object is not an element, it is a complex type and the reader is at the event just after the
     * outer start element Postcondition: If this object is an element, the reader is positioned at
     * its end element If this object is a complex type, the reader is positioned at the end element
     * of its outer element
     */
    public static DFUFileDetail parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      DFUFileDetail object = new DFUFileDetail();

      int event;
      javax.xml.namespace.QName currentQName = null;
      java.lang.String nillableValue = null;
      java.lang.String prefix = "";
      java.lang.String namespaceuri = "";
      try {

        while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

        currentQName = reader.getName();

        if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
          java.lang.String fullTypeName =
              reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
          if (fullTypeName != null) {
            java.lang.String nsPrefix = null;
            if (fullTypeName.indexOf(":") > -1) {
              nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
            }
            nsPrefix = nsPrefix == null ? "" : nsPrefix;

            java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

            if (!"DFUFileDetail".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (DFUFileDetail)
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ExtensionMapper.getTypeObject(
                      nsUri, type, reader);
            }
          }
        }

        // Note all attributes that were handled. Used to differ normal attributes
        // from anyAttributes.
        java.util.Vector handledAttributes = new java.util.Vector();

        reader.next();

        while (!reader.isEndElement()) {
          if (reader.isStartElement()) {

            if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Name")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Name" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Filename")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Filename" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setFilename(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Prefix")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Prefix" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPrefix(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "NodeGroup")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "NodeGroup" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setNodeGroup(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "NumParts")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "NumParts" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setNumParts(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Description")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Description" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDescription(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Dir")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Dir" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDir(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "PathMask")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "PathMask" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPathMask(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Filesize")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Filesize" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setFilesize(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FileSizeInt64")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "FileSizeInt64" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setFileSizeInt64(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "RecordSize")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "RecordSize" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setRecordSize(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "RecordCount")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "RecordCount" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setRecordCount(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "RecordSizeInt64")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "RecordSizeInt64" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setRecordSizeInt64(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "RecordCountInt64")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "RecordCountInt64" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setRecordCountInt64(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Wuid")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Wuid" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setWuid(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Owner")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Owner" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setOwner(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "JobName")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "JobName" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setJobName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Persistent")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Persistent" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPersistent(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Format")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Format" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setFormat(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "MaxRecordSize")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "MaxRecordSize" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setMaxRecordSize(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "CsvSeparate")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "CsvSeparate" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setCsvSeparate(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "CsvQuote")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "CsvQuote" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setCsvQuote(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "CsvTerminate")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "CsvTerminate" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setCsvTerminate(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "CsvEscape")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "CsvEscape" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setCsvEscape(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Modified")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Modified" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setModified(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Ecl")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Ecl" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setEcl(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Stat")
                    .equals(reader.getName())) {

              object.setStat(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileStat.Factory.parse(
                      reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "DFUFilePartsOnClusters")
                    .equals(reader.getName())) {

              object.setDFUFilePartsOnClusters(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFilePartsOnCluster
                      .Factory.parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "isSuperfile")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "isSuperfile" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setIsSuperfile(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ShowFileContent")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ShowFileContent" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setShowFileContent(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "subfiles")
                    .equals(reader.getName())) {

              object.setSubfiles(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspStringArray.Factory.parse(
                      reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Superfiles")
                    .equals(reader.getName())) {

              object.setSuperfiles(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFULogicalFile.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ProtectList")
                    .equals(reader.getName())) {

              object.setProtectList(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileProtect.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FromRoxieCluster")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "FromRoxieCluster" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setFromRoxieCluster(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Graphs")
                    .equals(reader.getName())) {

              object.setGraphs(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.Graphs_type0.Factory.parse(
                      reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "UserPermission")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "UserPermission" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setUserPermission(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ContentType")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ContentType" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setContentType(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "CompressedFileSize")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "CompressedFileSize" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setCompressedFileSize(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "PercentCompressed")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "PercentCompressed" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPercentCompressed(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "IsCompressed")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "IsCompressed" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setIsCompressed(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "IsRestricted")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "IsRestricted" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setIsRestricted(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "BrowseData")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "BrowseData" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setBrowseData(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "jsonInfo")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "jsonInfo" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setJsonInfo(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "binInfo")
                    .equals(reader.getName())) {

              object.setBinInfo(
                  org.apache.axiom.util.activation.DataHandlerUtils.toDataHandler(
                      org.apache.axiom.util.stax.XMLStreamReaderUtils.getBlobFromElement(reader)));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "PackageID")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "PackageID" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPackageID(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Partition")
                    .equals(reader.getName())) {

              object.setPartition(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFilePartition.Factory.parse(
                      reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Blooms")
                    .equals(reader.getName())) {

              object.setBlooms(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFileBloom.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ExpireDays")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ExpireDays" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setExpireDays(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "KeyType")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "KeyType" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setKeyType(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "AtRestCost")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "AtRestCost" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setAtRestCost(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "AccessCost")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "AccessCost" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setAccessCost(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ExpirationDate")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ExpirationDate" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setExpirationDate(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ExtendedIndexInfo")
                    .equals(reader.getName())) {

              object.setExtendedIndexInfo(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUIndexInfo.Factory.parse(
                      reader));

              reader.next();

            } // End of if for expected property start element
            else {
              // 3 - A start element we are not expecting indicates an invalid parameter was passed

              log.warn("Unexpected subelement " + reader.getLocalName());
              // consume everything, ending on the unexpected subelement's endtag
              javax.xml.namespace.QName subQName = reader.getName();
              while (!(reader.isEndElement() && reader.getName().equals(subQName))) {
                reader.next();
              }
              // skip past this extra element completely
              reader.next();
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
  } // end of factory class
}

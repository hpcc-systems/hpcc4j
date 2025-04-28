/**
 * DFUWorkunit.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.filespray.latest;

/** DFUWorkunit bean class */
@SuppressWarnings({"unchecked", "unused"})
public class DFUWorkunit implements org.apache.axis2.databinding.ADBBean {
  /* This type was generated from the piece of schema that had
  name = DFUWorkunit
  Namespace URI = urn:hpccsystems:ws:filespray
  Namespace Prefix = ns1
  */

  /** field for ID */
  protected java.lang.String localID;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIDTracker = false;

  public boolean isIDSpecified() {
    return localIDTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getID() {
    return localID;
  }

  /**
   * Auto generated setter method
   *
   * @param param ID
   */
  public void setID(java.lang.String param) {
    localIDTracker = param != null;

    this.localID = param;
  }

  /** field for DFUServerName */
  protected java.lang.String localDFUServerName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUServerNameTracker = false;

  public boolean isDFUServerNameSpecified() {
    return localDFUServerNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getDFUServerName() {
    return localDFUServerName;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUServerName
   */
  public void setDFUServerName(java.lang.String param) {
    localDFUServerNameTracker = param != null;

    this.localDFUServerName = param;
  }

  /** field for ClusterName */
  protected java.lang.String localClusterName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localClusterNameTracker = false;

  public boolean isClusterNameSpecified() {
    return localClusterNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getClusterName() {
    return localClusterName;
  }

  /**
   * Auto generated setter method
   *
   * @param param ClusterName
   */
  public void setClusterName(java.lang.String param) {
    localClusterNameTracker = param != null;

    this.localClusterName = param;
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

  /** field for Queue */
  protected java.lang.String localQueue;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localQueueTracker = false;

  public boolean isQueueSpecified() {
    return localQueueTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getQueue() {
    return localQueue;
  }

  /**
   * Auto generated setter method
   *
   * @param param Queue
   */
  public void setQueue(java.lang.String param) {
    localQueueTracker = param != null;

    this.localQueue = param;
  }

  /** field for User */
  protected java.lang.String localUser;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localUserTracker = false;

  public boolean isUserSpecified() {
    return localUserTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getUser() {
    return localUser;
  }

  /**
   * Auto generated setter method
   *
   * @param param User
   */
  public void setUser(java.lang.String param) {
    localUserTracker = param != null;

    this.localUser = param;
  }

  /** field for IsProtected */
  protected boolean localIsProtected;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIsProtectedTracker = false;

  public boolean isIsProtectedSpecified() {
    return localIsProtectedTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getIsProtected() {
    return localIsProtected;
  }

  /**
   * Auto generated setter method
   *
   * @param param IsProtected
   */
  public void setIsProtected(boolean param) {

    // setting primitive attribute tracker to true
    localIsProtectedTracker = true;

    this.localIsProtected = param;
  }

  /** field for Command */
  protected int localCommand;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localCommandTracker = false;

  public boolean isCommandSpecified() {
    return localCommandTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getCommand() {
    return localCommand;
  }

  /**
   * Auto generated setter method
   *
   * @param param Command
   */
  public void setCommand(int param) {

    // setting primitive attribute tracker to true
    localCommandTracker = param != java.lang.Integer.MIN_VALUE;

    this.localCommand = param;
  }

  /** field for CommandMessage */
  protected java.lang.String localCommandMessage;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localCommandMessageTracker = false;

  public boolean isCommandMessageSpecified() {
    return localCommandMessageTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getCommandMessage() {
    return localCommandMessage;
  }

  /**
   * Auto generated setter method
   *
   * @param param CommandMessage
   */
  public void setCommandMessage(java.lang.String param) {
    localCommandMessageTracker = param != null;

    this.localCommandMessage = param;
  }

  /** field for PercentDone */
  protected int localPercentDone;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPercentDoneTracker = false;

  public boolean isPercentDoneSpecified() {
    return localPercentDoneTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getPercentDone() {
    return localPercentDone;
  }

  /**
   * Auto generated setter method
   *
   * @param param PercentDone
   */
  public void setPercentDone(int param) {

    // setting primitive attribute tracker to true
    localPercentDoneTracker = param != java.lang.Integer.MIN_VALUE;

    this.localPercentDone = param;
  }

  /** field for SecsLeft */
  protected int localSecsLeft;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSecsLeftTracker = false;

  public boolean isSecsLeftSpecified() {
    return localSecsLeftTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getSecsLeft() {
    return localSecsLeft;
  }

  /**
   * Auto generated setter method
   *
   * @param param SecsLeft
   */
  public void setSecsLeft(int param) {

    // setting primitive attribute tracker to true
    localSecsLeftTracker = param != java.lang.Integer.MIN_VALUE;

    this.localSecsLeft = param;
  }

  /** field for ProgressMessage */
  protected java.lang.String localProgressMessage;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localProgressMessageTracker = false;

  public boolean isProgressMessageSpecified() {
    return localProgressMessageTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getProgressMessage() {
    return localProgressMessage;
  }

  /**
   * Auto generated setter method
   *
   * @param param ProgressMessage
   */
  public void setProgressMessage(java.lang.String param) {
    localProgressMessageTracker = param != null;

    this.localProgressMessage = param;
  }

  /** field for SummaryMessage */
  protected java.lang.String localSummaryMessage;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSummaryMessageTracker = false;

  public boolean isSummaryMessageSpecified() {
    return localSummaryMessageTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getSummaryMessage() {
    return localSummaryMessage;
  }

  /**
   * Auto generated setter method
   *
   * @param param SummaryMessage
   */
  public void setSummaryMessage(java.lang.String param) {
    localSummaryMessageTracker = param != null;

    this.localSummaryMessage = param;
  }

  /** field for State */
  protected int localState;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localStateTracker = false;

  public boolean isStateSpecified() {
    return localStateTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getState() {
    return localState;
  }

  /**
   * Auto generated setter method
   *
   * @param param State
   */
  public void setState(int param) {

    // setting primitive attribute tracker to true
    localStateTracker = param != java.lang.Integer.MIN_VALUE;

    this.localState = param;
  }

  /** field for SourceLogicalName */
  protected java.lang.String localSourceLogicalName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSourceLogicalNameTracker = false;

  public boolean isSourceLogicalNameSpecified() {
    return localSourceLogicalNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getSourceLogicalName() {
    return localSourceLogicalName;
  }

  /**
   * Auto generated setter method
   *
   * @param param SourceLogicalName
   */
  public void setSourceLogicalName(java.lang.String param) {
    localSourceLogicalNameTracker = param != null;

    this.localSourceLogicalName = param;
  }

  /** field for SourceIP */
  protected java.lang.String localSourceIP;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSourceIPTracker = false;

  public boolean isSourceIPSpecified() {
    return localSourceIPTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getSourceIP() {
    return localSourceIP;
  }

  /**
   * Auto generated setter method
   *
   * @param param SourceIP
   */
  public void setSourceIP(java.lang.String param) {
    localSourceIPTracker = param != null;

    this.localSourceIP = param;
  }

  /** field for SourceFilePath */
  protected java.lang.String localSourceFilePath;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSourceFilePathTracker = false;

  public boolean isSourceFilePathSpecified() {
    return localSourceFilePathTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getSourceFilePath() {
    return localSourceFilePath;
  }

  /**
   * Auto generated setter method
   *
   * @param param SourceFilePath
   */
  public void setSourceFilePath(java.lang.String param) {
    localSourceFilePathTracker = param != null;

    this.localSourceFilePath = param;
  }

  /** field for SourceDali */
  protected java.lang.String localSourceDali;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSourceDaliTracker = false;

  public boolean isSourceDaliSpecified() {
    return localSourceDaliTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getSourceDali() {
    return localSourceDali;
  }

  /**
   * Auto generated setter method
   *
   * @param param SourceDali
   */
  public void setSourceDali(java.lang.String param) {
    localSourceDaliTracker = param != null;

    this.localSourceDali = param;
  }

  /** field for SourceRecordSize */
  protected int localSourceRecordSize;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSourceRecordSizeTracker = false;

  public boolean isSourceRecordSizeSpecified() {
    return localSourceRecordSizeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getSourceRecordSize() {
    return localSourceRecordSize;
  }

  /**
   * Auto generated setter method
   *
   * @param param SourceRecordSize
   */
  public void setSourceRecordSize(int param) {

    // setting primitive attribute tracker to true
    localSourceRecordSizeTracker = param != java.lang.Integer.MIN_VALUE;

    this.localSourceRecordSize = param;
  }

  /** field for SourceFormat */
  protected int localSourceFormat;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSourceFormatTracker = false;

  public boolean isSourceFormatSpecified() {
    return localSourceFormatTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getSourceFormat() {
    return localSourceFormat;
  }

  /**
   * Auto generated setter method
   *
   * @param param SourceFormat
   */
  public void setSourceFormat(int param) {

    // setting primitive attribute tracker to true
    localSourceFormatTracker = param != java.lang.Integer.MIN_VALUE;

    this.localSourceFormat = param;
  }

  /** field for RowTag */
  protected java.lang.String localRowTag;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localRowTagTracker = false;

  public boolean isRowTagSpecified() {
    return localRowTagTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getRowTag() {
    return localRowTag;
  }

  /**
   * Auto generated setter method
   *
   * @param param RowTag
   */
  public void setRowTag(java.lang.String param) {
    localRowTagTracker = param != null;

    this.localRowTag = param;
  }

  /** field for SourceNumParts */
  protected int localSourceNumParts;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSourceNumPartsTracker = false;

  public boolean isSourceNumPartsSpecified() {
    return localSourceNumPartsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getSourceNumParts() {
    return localSourceNumParts;
  }

  /**
   * Auto generated setter method
   *
   * @param param SourceNumParts
   */
  public void setSourceNumParts(int param) {

    // setting primitive attribute tracker to true
    localSourceNumPartsTracker = param != java.lang.Integer.MIN_VALUE;

    this.localSourceNumParts = param;
  }

  /** field for SourceDirectory */
  protected java.lang.String localSourceDirectory;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSourceDirectoryTracker = false;

  public boolean isSourceDirectorySpecified() {
    return localSourceDirectoryTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getSourceDirectory() {
    return localSourceDirectory;
  }

  /**
   * Auto generated setter method
   *
   * @param param SourceDirectory
   */
  public void setSourceDirectory(java.lang.String param) {
    localSourceDirectoryTracker = param != null;

    this.localSourceDirectory = param;
  }

  /** field for DestLogicalName */
  protected java.lang.String localDestLogicalName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDestLogicalNameTracker = false;

  public boolean isDestLogicalNameSpecified() {
    return localDestLogicalNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getDestLogicalName() {
    return localDestLogicalName;
  }

  /**
   * Auto generated setter method
   *
   * @param param DestLogicalName
   */
  public void setDestLogicalName(java.lang.String param) {
    localDestLogicalNameTracker = param != null;

    this.localDestLogicalName = param;
  }

  /** field for DestGroupName */
  protected java.lang.String localDestGroupName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDestGroupNameTracker = false;

  public boolean isDestGroupNameSpecified() {
    return localDestGroupNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getDestGroupName() {
    return localDestGroupName;
  }

  /**
   * Auto generated setter method
   *
   * @param param DestGroupName
   */
  public void setDestGroupName(java.lang.String param) {
    localDestGroupNameTracker = param != null;

    this.localDestGroupName = param;
  }

  /** field for DestDirectory */
  protected java.lang.String localDestDirectory;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDestDirectoryTracker = false;

  public boolean isDestDirectorySpecified() {
    return localDestDirectoryTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getDestDirectory() {
    return localDestDirectory;
  }

  /**
   * Auto generated setter method
   *
   * @param param DestDirectory
   */
  public void setDestDirectory(java.lang.String param) {
    localDestDirectoryTracker = param != null;

    this.localDestDirectory = param;
  }

  /** field for DestIP */
  protected java.lang.String localDestIP;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDestIPTracker = false;

  public boolean isDestIPSpecified() {
    return localDestIPTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getDestIP() {
    return localDestIP;
  }

  /**
   * Auto generated setter method
   *
   * @param param DestIP
   */
  public void setDestIP(java.lang.String param) {
    localDestIPTracker = param != null;

    this.localDestIP = param;
  }

  /** field for DestFilePath */
  protected java.lang.String localDestFilePath;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDestFilePathTracker = false;

  public boolean isDestFilePathSpecified() {
    return localDestFilePathTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getDestFilePath() {
    return localDestFilePath;
  }

  /**
   * Auto generated setter method
   *
   * @param param DestFilePath
   */
  public void setDestFilePath(java.lang.String param) {
    localDestFilePathTracker = param != null;

    this.localDestFilePath = param;
  }

  /** field for DestFormat */
  protected int localDestFormat;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDestFormatTracker = false;

  public boolean isDestFormatSpecified() {
    return localDestFormatTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getDestFormat() {
    return localDestFormat;
  }

  /**
   * Auto generated setter method
   *
   * @param param DestFormat
   */
  public void setDestFormat(int param) {

    // setting primitive attribute tracker to true
    localDestFormatTracker = param != java.lang.Integer.MIN_VALUE;

    this.localDestFormat = param;
  }

  /** field for DestNumParts */
  protected int localDestNumParts;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDestNumPartsTracker = false;

  public boolean isDestNumPartsSpecified() {
    return localDestNumPartsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getDestNumParts() {
    return localDestNumParts;
  }

  /**
   * Auto generated setter method
   *
   * @param param DestNumParts
   */
  public void setDestNumParts(int param) {

    // setting primitive attribute tracker to true
    localDestNumPartsTracker = param != java.lang.Integer.MIN_VALUE;

    this.localDestNumParts = param;
  }

  /** field for DestRecordSize */
  protected int localDestRecordSize;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDestRecordSizeTracker = false;

  public boolean isDestRecordSizeSpecified() {
    return localDestRecordSizeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getDestRecordSize() {
    return localDestRecordSize;
  }

  /**
   * Auto generated setter method
   *
   * @param param DestRecordSize
   */
  public void setDestRecordSize(int param) {

    // setting primitive attribute tracker to true
    localDestRecordSizeTracker = param != java.lang.Integer.MIN_VALUE;

    this.localDestRecordSize = param;
  }

  /** field for Replicate */
  protected boolean localReplicate;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localReplicateTracker = false;

  public boolean isReplicateSpecified() {
    return localReplicateTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getReplicate() {
    return localReplicate;
  }

  /**
   * Auto generated setter method
   *
   * @param param Replicate
   */
  public void setReplicate(boolean param) {

    // setting primitive attribute tracker to true
    localReplicateTracker = true;

    this.localReplicate = param;
  }

  /** field for Overwrite */
  protected boolean localOverwrite;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localOverwriteTracker = false;

  public boolean isOverwriteSpecified() {
    return localOverwriteTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getOverwrite() {
    return localOverwrite;
  }

  /**
   * Auto generated setter method
   *
   * @param param Overwrite
   */
  public void setOverwrite(boolean param) {

    // setting primitive attribute tracker to true
    localOverwriteTracker = true;

    this.localOverwrite = param;
  }

  /** field for Compress */
  protected boolean localCompress;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localCompressTracker = false;

  public boolean isCompressSpecified() {
    return localCompressTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getCompress() {
    return localCompress;
  }

  /**
   * Auto generated setter method
   *
   * @param param Compress
   */
  public void setCompress(boolean param) {

    // setting primitive attribute tracker to true
    localCompressTracker = true;

    this.localCompress = param;
  }

  /** field for SourceCsvSeparate */
  protected java.lang.String localSourceCsvSeparate;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSourceCsvSeparateTracker = false;

  public boolean isSourceCsvSeparateSpecified() {
    return localSourceCsvSeparateTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getSourceCsvSeparate() {
    return localSourceCsvSeparate;
  }

  /**
   * Auto generated setter method
   *
   * @param param SourceCsvSeparate
   */
  public void setSourceCsvSeparate(java.lang.String param) {
    localSourceCsvSeparateTracker = param != null;

    this.localSourceCsvSeparate = param;
  }

  /** field for SourceCsvQuote */
  protected java.lang.String localSourceCsvQuote;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSourceCsvQuoteTracker = false;

  public boolean isSourceCsvQuoteSpecified() {
    return localSourceCsvQuoteTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getSourceCsvQuote() {
    return localSourceCsvQuote;
  }

  /**
   * Auto generated setter method
   *
   * @param param SourceCsvQuote
   */
  public void setSourceCsvQuote(java.lang.String param) {
    localSourceCsvQuoteTracker = param != null;

    this.localSourceCsvQuote = param;
  }

  /** field for SourceCsvTerminate */
  protected java.lang.String localSourceCsvTerminate;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSourceCsvTerminateTracker = false;

  public boolean isSourceCsvTerminateSpecified() {
    return localSourceCsvTerminateTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getSourceCsvTerminate() {
    return localSourceCsvTerminate;
  }

  /**
   * Auto generated setter method
   *
   * @param param SourceCsvTerminate
   */
  public void setSourceCsvTerminate(java.lang.String param) {
    localSourceCsvTerminateTracker = param != null;

    this.localSourceCsvTerminate = param;
  }

  /** field for SourceCsvEscape */
  protected java.lang.String localSourceCsvEscape;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSourceCsvEscapeTracker = false;

  public boolean isSourceCsvEscapeSpecified() {
    return localSourceCsvEscapeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getSourceCsvEscape() {
    return localSourceCsvEscape;
  }

  /**
   * Auto generated setter method
   *
   * @param param SourceCsvEscape
   */
  public void setSourceCsvEscape(java.lang.String param) {
    localSourceCsvEscapeTracker = param != null;

    this.localSourceCsvEscape = param;
  }

  /** field for TimeStarted */
  protected java.lang.String localTimeStarted;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTimeStartedTracker = false;

  public boolean isTimeStartedSpecified() {
    return localTimeStartedTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getTimeStarted() {
    return localTimeStarted;
  }

  /**
   * Auto generated setter method
   *
   * @param param TimeStarted
   */
  public void setTimeStarted(java.lang.String param) {
    localTimeStartedTracker = param != null;

    this.localTimeStarted = param;
  }

  /** field for TimeStopped */
  protected java.lang.String localTimeStopped;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTimeStoppedTracker = false;

  public boolean isTimeStoppedSpecified() {
    return localTimeStoppedTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getTimeStopped() {
    return localTimeStopped;
  }

  /**
   * Auto generated setter method
   *
   * @param param TimeStopped
   */
  public void setTimeStopped(java.lang.String param) {
    localTimeStoppedTracker = param != null;

    this.localTimeStopped = param;
  }

  /** field for StateMessage */
  protected java.lang.String localStateMessage;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localStateMessageTracker = false;

  public boolean isStateMessageSpecified() {
    return localStateMessageTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getStateMessage() {
    return localStateMessage;
  }

  /**
   * Auto generated setter method
   *
   * @param param StateMessage
   */
  public void setStateMessage(java.lang.String param) {
    localStateMessageTracker = param != null;

    this.localStateMessage = param;
  }

  /** field for MonitorEventName */
  protected java.lang.String localMonitorEventName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localMonitorEventNameTracker = false;

  public boolean isMonitorEventNameSpecified() {
    return localMonitorEventNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getMonitorEventName() {
    return localMonitorEventName;
  }

  /**
   * Auto generated setter method
   *
   * @param param MonitorEventName
   */
  public void setMonitorEventName(java.lang.String param) {
    localMonitorEventNameTracker = param != null;

    this.localMonitorEventName = param;
  }

  /** field for MonitorSub */
  protected boolean localMonitorSub;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localMonitorSubTracker = false;

  public boolean isMonitorSubSpecified() {
    return localMonitorSubTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getMonitorSub() {
    return localMonitorSub;
  }

  /**
   * Auto generated setter method
   *
   * @param param MonitorSub
   */
  public void setMonitorSub(boolean param) {

    // setting primitive attribute tracker to true
    localMonitorSubTracker = true;

    this.localMonitorSub = param;
  }

  /** field for MonitorShotLimit */
  protected int localMonitorShotLimit;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localMonitorShotLimitTracker = false;

  public boolean isMonitorShotLimitSpecified() {
    return localMonitorShotLimitTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getMonitorShotLimit() {
    return localMonitorShotLimit;
  }

  /**
   * Auto generated setter method
   *
   * @param param MonitorShotLimit
   */
  public void setMonitorShotLimit(int param) {

    // setting primitive attribute tracker to true
    localMonitorShotLimitTracker = param != java.lang.Integer.MIN_VALUE;

    this.localMonitorShotLimit = param;
  }

  /** field for SourceDiffKeyName */
  protected java.lang.String localSourceDiffKeyName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSourceDiffKeyNameTracker = false;

  public boolean isSourceDiffKeyNameSpecified() {
    return localSourceDiffKeyNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getSourceDiffKeyName() {
    return localSourceDiffKeyName;
  }

  /**
   * Auto generated setter method
   *
   * @param param SourceDiffKeyName
   */
  public void setSourceDiffKeyName(java.lang.String param) {
    localSourceDiffKeyNameTracker = param != null;

    this.localSourceDiffKeyName = param;
  }

  /** field for DestDiffKeyName */
  protected java.lang.String localDestDiffKeyName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDestDiffKeyNameTracker = false;

  public boolean isDestDiffKeyNameSpecified() {
    return localDestDiffKeyNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getDestDiffKeyName() {
    return localDestDiffKeyName;
  }

  /**
   * Auto generated setter method
   *
   * @param param DestDiffKeyName
   */
  public void setDestDiffKeyName(java.lang.String param) {
    localDestDiffKeyNameTracker = param != null;

    this.localDestDiffKeyName = param;
  }

  /** field for Archived */
  protected boolean localArchived =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localArchivedTracker = false;

  public boolean isArchivedSpecified() {
    return localArchivedTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getArchived() {
    return localArchived;
  }

  /**
   * Auto generated setter method
   *
   * @param param Archived
   */
  public void setArchived(boolean param) {

    // setting primitive attribute tracker to true
    localArchivedTracker = true;

    this.localArchived = param;
  }

  /** field for Encrypt */
  protected java.lang.String localEncrypt;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localEncryptTracker = false;

  public boolean isEncryptSpecified() {
    return localEncryptTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getEncrypt() {
    return localEncrypt;
  }

  /**
   * Auto generated setter method
   *
   * @param param Encrypt
   */
  public void setEncrypt(java.lang.String param) {
    localEncryptTracker = param != null;

    this.localEncrypt = param;
  }

  /** field for Decrypt */
  protected java.lang.String localDecrypt;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDecryptTracker = false;

  public boolean isDecryptSpecified() {
    return localDecryptTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getDecrypt() {
    return localDecrypt;
  }

  /**
   * Auto generated setter method
   *
   * @param param Decrypt
   */
  public void setDecrypt(java.lang.String param) {
    localDecryptTracker = param != null;

    this.localDecrypt = param;
  }

  /** field for FailIfNoSourceFile */
  protected boolean localFailIfNoSourceFile =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localFailIfNoSourceFileTracker = false;

  public boolean isFailIfNoSourceFileSpecified() {
    return localFailIfNoSourceFileTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getFailIfNoSourceFile() {
    return localFailIfNoSourceFile;
  }

  /**
   * Auto generated setter method
   *
   * @param param FailIfNoSourceFile
   */
  public void setFailIfNoSourceFile(boolean param) {

    // setting primitive attribute tracker to true
    localFailIfNoSourceFileTracker = true;

    this.localFailIfNoSourceFile = param;
  }

  /** field for RecordStructurePresent */
  protected boolean localRecordStructurePresent =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localRecordStructurePresentTracker = false;

  public boolean isRecordStructurePresentSpecified() {
    return localRecordStructurePresentTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getRecordStructurePresent() {
    return localRecordStructurePresent;
  }

  /**
   * Auto generated setter method
   *
   * @param param RecordStructurePresent
   */
  public void setRecordStructurePresent(boolean param) {

    // setting primitive attribute tracker to true
    localRecordStructurePresentTracker = true;

    this.localRecordStructurePresent = param;
  }

  /** field for QuotedTerminator */
  protected boolean localQuotedTerminator =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("true");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localQuotedTerminatorTracker = false;

  public boolean isQuotedTerminatorSpecified() {
    return localQuotedTerminatorTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getQuotedTerminator() {
    return localQuotedTerminator;
  }

  /**
   * Auto generated setter method
   *
   * @param param QuotedTerminator
   */
  public void setQuotedTerminator(boolean param) {

    // setting primitive attribute tracker to true
    localQuotedTerminatorTracker = true;

    this.localQuotedTerminator = param;
  }

  /** field for PreserveCompression */
  protected boolean localPreserveCompression =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("true");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPreserveCompressionTracker = false;

  public boolean isPreserveCompressionSpecified() {
    return localPreserveCompressionTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getPreserveCompression() {
    return localPreserveCompression;
  }

  /**
   * Auto generated setter method
   *
   * @param param PreserveCompression
   */
  public void setPreserveCompression(boolean param) {

    // setting primitive attribute tracker to true
    localPreserveCompressionTracker = true;

    this.localPreserveCompression = param;
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

  /** field for PreserveFileParts */
  protected boolean localPreserveFileParts;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPreserveFilePartsTracker = false;

  public boolean isPreserveFilePartsSpecified() {
    return localPreserveFilePartsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getPreserveFileParts() {
    return localPreserveFileParts;
  }

  /**
   * Auto generated setter method
   *
   * @param param PreserveFileParts
   */
  public void setPreserveFileParts(boolean param) {

    // setting primitive attribute tracker to true
    localPreserveFilePartsTracker = true;

    this.localPreserveFileParts = param;
  }

  /** field for FileAccessCost */
  protected double localFileAccessCost;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localFileAccessCostTracker = false;

  public boolean isFileAccessCostSpecified() {
    return localFileAccessCostTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return double
   */
  public double getFileAccessCost() {
    return localFileAccessCost;
  }

  /**
   * Auto generated setter method
   *
   * @param param FileAccessCost
   */
  public void setFileAccessCost(double param) {

    // setting primitive attribute tracker to true
    localFileAccessCostTracker = !java.lang.Double.isNaN(param);

    this.localFileAccessCost = param;
  }

  /** field for KbPerSecAve */
  protected int localKbPerSecAve;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localKbPerSecAveTracker = false;

  public boolean isKbPerSecAveSpecified() {
    return localKbPerSecAveTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getKbPerSecAve() {
    return localKbPerSecAve;
  }

  /**
   * Auto generated setter method
   *
   * @param param KbPerSecAve
   */
  public void setKbPerSecAve(int param) {

    // setting primitive attribute tracker to true
    localKbPerSecAveTracker = param != java.lang.Integer.MIN_VALUE;

    this.localKbPerSecAve = param;
  }

  /** field for KbPerSec */
  protected int localKbPerSec;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localKbPerSecTracker = false;

  public boolean isKbPerSecSpecified() {
    return localKbPerSecTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getKbPerSec() {
    return localKbPerSec;
  }

  /**
   * Auto generated setter method
   *
   * @param param KbPerSec
   */
  public void setKbPerSec(int param) {

    // setting primitive attribute tracker to true
    localKbPerSecTracker = param != java.lang.Integer.MIN_VALUE;

    this.localKbPerSec = param;
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

      java.lang.String namespacePrefix = registerPrefix(xmlWriter, "urn:hpccsystems:ws:filespray");
      if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            namespacePrefix + ":DFUWorkunit",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "DFUWorkunit", xmlWriter);
      }
    }
    if (localIDTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "ID", xmlWriter);

      if (localID == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ID cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localID);
      }

      xmlWriter.writeEndElement();
    }
    if (localDFUServerNameTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "DFUServerName", xmlWriter);

      if (localDFUServerName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("DFUServerName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localDFUServerName);
      }

      xmlWriter.writeEndElement();
    }
    if (localClusterNameTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "ClusterName", xmlWriter);

      if (localClusterName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ClusterName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localClusterName);
      }

      xmlWriter.writeEndElement();
    }
    if (localJobNameTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "JobName", xmlWriter);

      if (localJobName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("JobName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localJobName);
      }

      xmlWriter.writeEndElement();
    }
    if (localQueueTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "Queue", xmlWriter);

      if (localQueue == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Queue cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localQueue);
      }

      xmlWriter.writeEndElement();
    }
    if (localUserTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "User", xmlWriter);

      if (localUser == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("User cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localUser);
      }

      xmlWriter.writeEndElement();
    }
    if (localIsProtectedTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "isProtected", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("isProtected cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsProtected));
      }

      xmlWriter.writeEndElement();
    }
    if (localCommandTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "Command", xmlWriter);

      if (localCommand == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("Command cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCommand));
      }

      xmlWriter.writeEndElement();
    }
    if (localCommandMessageTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "CommandMessage", xmlWriter);

      if (localCommandMessage == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("CommandMessage cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localCommandMessage);
      }

      xmlWriter.writeEndElement();
    }
    if (localPercentDoneTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "PercentDone", xmlWriter);

      if (localPercentDone == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("PercentDone cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPercentDone));
      }

      xmlWriter.writeEndElement();
    }
    if (localSecsLeftTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "SecsLeft", xmlWriter);

      if (localSecsLeft == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("SecsLeft cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSecsLeft));
      }

      xmlWriter.writeEndElement();
    }
    if (localProgressMessageTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "ProgressMessage", xmlWriter);

      if (localProgressMessage == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ProgressMessage cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localProgressMessage);
      }

      xmlWriter.writeEndElement();
    }
    if (localSummaryMessageTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "SummaryMessage", xmlWriter);

      if (localSummaryMessage == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("SummaryMessage cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSummaryMessage);
      }

      xmlWriter.writeEndElement();
    }
    if (localStateTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "State", xmlWriter);

      if (localState == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("State cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localState));
      }

      xmlWriter.writeEndElement();
    }
    if (localSourceLogicalNameTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "SourceLogicalName", xmlWriter);

      if (localSourceLogicalName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("SourceLogicalName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSourceLogicalName);
      }

      xmlWriter.writeEndElement();
    }
    if (localSourceIPTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "SourceIP", xmlWriter);

      if (localSourceIP == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("SourceIP cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSourceIP);
      }

      xmlWriter.writeEndElement();
    }
    if (localSourceFilePathTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "SourceFilePath", xmlWriter);

      if (localSourceFilePath == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("SourceFilePath cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSourceFilePath);
      }

      xmlWriter.writeEndElement();
    }
    if (localSourceDaliTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "SourceDali", xmlWriter);

      if (localSourceDali == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("SourceDali cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSourceDali);
      }

      xmlWriter.writeEndElement();
    }
    if (localSourceRecordSizeTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "SourceRecordSize", xmlWriter);

      if (localSourceRecordSize == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("SourceRecordSize cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localSourceRecordSize));
      }

      xmlWriter.writeEndElement();
    }
    if (localSourceFormatTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "SourceFormat", xmlWriter);

      if (localSourceFormat == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("SourceFormat cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSourceFormat));
      }

      xmlWriter.writeEndElement();
    }
    if (localRowTagTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "RowTag", xmlWriter);

      if (localRowTag == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("RowTag cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localRowTag);
      }

      xmlWriter.writeEndElement();
    }
    if (localSourceNumPartsTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "SourceNumParts", xmlWriter);

      if (localSourceNumParts == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("SourceNumParts cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSourceNumParts));
      }

      xmlWriter.writeEndElement();
    }
    if (localSourceDirectoryTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "SourceDirectory", xmlWriter);

      if (localSourceDirectory == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("SourceDirectory cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSourceDirectory);
      }

      xmlWriter.writeEndElement();
    }
    if (localDestLogicalNameTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "DestLogicalName", xmlWriter);

      if (localDestLogicalName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("DestLogicalName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localDestLogicalName);
      }

      xmlWriter.writeEndElement();
    }
    if (localDestGroupNameTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "DestGroupName", xmlWriter);

      if (localDestGroupName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("DestGroupName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localDestGroupName);
      }

      xmlWriter.writeEndElement();
    }
    if (localDestDirectoryTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "DestDirectory", xmlWriter);

      if (localDestDirectory == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("DestDirectory cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localDestDirectory);
      }

      xmlWriter.writeEndElement();
    }
    if (localDestIPTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "DestIP", xmlWriter);

      if (localDestIP == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("DestIP cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localDestIP);
      }

      xmlWriter.writeEndElement();
    }
    if (localDestFilePathTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "DestFilePath", xmlWriter);

      if (localDestFilePath == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("DestFilePath cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localDestFilePath);
      }

      xmlWriter.writeEndElement();
    }
    if (localDestFormatTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "DestFormat", xmlWriter);

      if (localDestFormat == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("DestFormat cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDestFormat));
      }

      xmlWriter.writeEndElement();
    }
    if (localDestNumPartsTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "DestNumParts", xmlWriter);

      if (localDestNumParts == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("DestNumParts cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDestNumParts));
      }

      xmlWriter.writeEndElement();
    }
    if (localDestRecordSizeTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "DestRecordSize", xmlWriter);

      if (localDestRecordSize == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("DestRecordSize cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDestRecordSize));
      }

      xmlWriter.writeEndElement();
    }
    if (localReplicateTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "Replicate", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("Replicate cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReplicate));
      }

      xmlWriter.writeEndElement();
    }
    if (localOverwriteTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "Overwrite", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("Overwrite cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOverwrite));
      }

      xmlWriter.writeEndElement();
    }
    if (localCompressTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "Compress", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("Compress cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCompress));
      }

      xmlWriter.writeEndElement();
    }
    if (localSourceCsvSeparateTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "SourceCsvSeparate", xmlWriter);

      if (localSourceCsvSeparate == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("SourceCsvSeparate cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSourceCsvSeparate);
      }

      xmlWriter.writeEndElement();
    }
    if (localSourceCsvQuoteTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "SourceCsvQuote", xmlWriter);

      if (localSourceCsvQuote == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("SourceCsvQuote cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSourceCsvQuote);
      }

      xmlWriter.writeEndElement();
    }
    if (localSourceCsvTerminateTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "SourceCsvTerminate", xmlWriter);

      if (localSourceCsvTerminate == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("SourceCsvTerminate cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSourceCsvTerminate);
      }

      xmlWriter.writeEndElement();
    }
    if (localSourceCsvEscapeTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "SourceCsvEscape", xmlWriter);

      if (localSourceCsvEscape == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("SourceCsvEscape cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSourceCsvEscape);
      }

      xmlWriter.writeEndElement();
    }
    if (localTimeStartedTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "TimeStarted", xmlWriter);

      if (localTimeStarted == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("TimeStarted cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localTimeStarted);
      }

      xmlWriter.writeEndElement();
    }
    if (localTimeStoppedTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "TimeStopped", xmlWriter);

      if (localTimeStopped == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("TimeStopped cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localTimeStopped);
      }

      xmlWriter.writeEndElement();
    }
    if (localStateMessageTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "StateMessage", xmlWriter);

      if (localStateMessage == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("StateMessage cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localStateMessage);
      }

      xmlWriter.writeEndElement();
    }
    if (localMonitorEventNameTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "MonitorEventName", xmlWriter);

      if (localMonitorEventName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("MonitorEventName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localMonitorEventName);
      }

      xmlWriter.writeEndElement();
    }
    if (localMonitorSubTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "MonitorSub", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("MonitorSub cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMonitorSub));
      }

      xmlWriter.writeEndElement();
    }
    if (localMonitorShotLimitTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "MonitorShotLimit", xmlWriter);

      if (localMonitorShotLimit == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("MonitorShotLimit cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localMonitorShotLimit));
      }

      xmlWriter.writeEndElement();
    }
    if (localSourceDiffKeyNameTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "SourceDiffKeyName", xmlWriter);

      if (localSourceDiffKeyName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("SourceDiffKeyName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSourceDiffKeyName);
      }

      xmlWriter.writeEndElement();
    }
    if (localDestDiffKeyNameTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "DestDiffKeyName", xmlWriter);

      if (localDestDiffKeyName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("DestDiffKeyName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localDestDiffKeyName);
      }

      xmlWriter.writeEndElement();
    }
    if (localArchivedTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "Archived", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("Archived cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localArchived));
      }

      xmlWriter.writeEndElement();
    }
    if (localEncryptTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "encrypt", xmlWriter);

      if (localEncrypt == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("encrypt cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localEncrypt);
      }

      xmlWriter.writeEndElement();
    }
    if (localDecryptTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "decrypt", xmlWriter);

      if (localDecrypt == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("decrypt cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localDecrypt);
      }

      xmlWriter.writeEndElement();
    }
    if (localFailIfNoSourceFileTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "failIfNoSourceFile", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("failIfNoSourceFile cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localFailIfNoSourceFile));
      }

      xmlWriter.writeEndElement();
    }
    if (localRecordStructurePresentTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "recordStructurePresent", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException(
            "recordStructurePresent cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localRecordStructurePresent));
      }

      xmlWriter.writeEndElement();
    }
    if (localQuotedTerminatorTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "quotedTerminator", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("quotedTerminator cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localQuotedTerminator));
      }

      xmlWriter.writeEndElement();
    }
    if (localPreserveCompressionTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "preserveCompression", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("preserveCompression cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localPreserveCompression));
      }

      xmlWriter.writeEndElement();
    }
    if (localExpireDaysTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "expireDays", xmlWriter);

      if (localExpireDays == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("expireDays cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExpireDays));
      }

      xmlWriter.writeEndElement();
    }
    if (localPreserveFilePartsTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "PreserveFileParts", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("PreserveFileParts cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localPreserveFileParts));
      }

      xmlWriter.writeEndElement();
    }
    if (localFileAccessCostTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "FileAccessCost", xmlWriter);

      if (java.lang.Double.isNaN(localFileAccessCost)) {

        throw new org.apache.axis2.databinding.ADBException("FileAccessCost cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFileAccessCost));
      }

      xmlWriter.writeEndElement();
    }
    if (localKbPerSecAveTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "KbPerSecAve", xmlWriter);

      if (localKbPerSecAve == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("KbPerSecAve cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKbPerSecAve));
      }

      xmlWriter.writeEndElement();
    }
    if (localKbPerSecTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "KbPerSec", xmlWriter);

      if (localKbPerSec == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("KbPerSec cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localKbPerSec));
      }

      xmlWriter.writeEndElement();
    }
    xmlWriter.writeEndElement();
  }

  private static java.lang.String generatePrefix(java.lang.String namespace) {
    if (namespace.equals("urn:hpccsystems:ws:filespray")) {
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
    public static DFUWorkunit parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      DFUWorkunit object = new DFUWorkunit();

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

            if (!"DFUWorkunit".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (DFUWorkunit)
                  org.hpccsystems.ws.client.gen.axis2.filespray.latest.ExtensionMapper
                      .getTypeObject(nsUri, type, reader);
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ID")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ID" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setID(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DFUServerName")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "DFUServerName" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDFUServerName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ClusterName")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ClusterName" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setClusterName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "JobName")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Queue")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Queue" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setQueue(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "User")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "User" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setUser(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "isProtected")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "isProtected" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setIsProtected(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Command")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Command" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setCommand(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "CommandMessage")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "CommandMessage" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setCommandMessage(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "PercentDone")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "PercentDone" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPercentDone(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "SecsLeft")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SecsLeft" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSecsLeft(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ProgressMessage")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ProgressMessage" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setProgressMessage(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "SummaryMessage")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SummaryMessage" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSummaryMessage(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "State")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "State" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setState(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "SourceLogicalName")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SourceLogicalName" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSourceLogicalName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "SourceIP")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SourceIP" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSourceIP(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "SourceFilePath")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SourceFilePath" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSourceFilePath(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "SourceDali")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SourceDali" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSourceDali(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "SourceRecordSize")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SourceRecordSize" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSourceRecordSize(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "SourceFormat")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SourceFormat" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSourceFormat(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "RowTag")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "RowTag" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setRowTag(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "SourceNumParts")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SourceNumParts" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSourceNumParts(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "SourceDirectory")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SourceDirectory" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSourceDirectory(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DestLogicalName")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "DestLogicalName" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDestLogicalName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DestGroupName")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "DestGroupName" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDestGroupName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DestDirectory")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "DestDirectory" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDestDirectory(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DestIP")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "DestIP" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDestIP(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DestFilePath")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "DestFilePath" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDestFilePath(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DestFormat")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "DestFormat" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDestFormat(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DestNumParts")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "DestNumParts" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDestNumParts(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DestRecordSize")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "DestRecordSize" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDestRecordSize(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Replicate")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Replicate" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setReplicate(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Overwrite")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Overwrite" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setOverwrite(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Compress")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Compress" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setCompress(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "SourceCsvSeparate")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SourceCsvSeparate" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSourceCsvSeparate(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "SourceCsvQuote")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SourceCsvQuote" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSourceCsvQuote(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "SourceCsvTerminate")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SourceCsvTerminate" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSourceCsvTerminate(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "SourceCsvEscape")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SourceCsvEscape" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSourceCsvEscape(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "TimeStarted")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "TimeStarted" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setTimeStarted(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "TimeStopped")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "TimeStopped" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setTimeStopped(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "StateMessage")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "StateMessage" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setStateMessage(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "MonitorEventName")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "MonitorEventName" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setMonitorEventName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "MonitorSub")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "MonitorSub" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setMonitorSub(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "MonitorShotLimit")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "MonitorShotLimit" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setMonitorShotLimit(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "SourceDiffKeyName")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SourceDiffKeyName" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSourceDiffKeyName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DestDiffKeyName")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "DestDiffKeyName" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDestDiffKeyName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "Archived")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Archived" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setArchived(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "encrypt")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "encrypt" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setEncrypt(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "decrypt")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "decrypt" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDecrypt(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "failIfNoSourceFile")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "failIfNoSourceFile" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setFailIfNoSourceFile(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "recordStructurePresent")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "recordStructurePresent" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setRecordStructurePresent(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "quotedTerminator")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "quotedTerminator" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setQuotedTerminator(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "preserveCompression")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "preserveCompression" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPreserveCompression(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "expireDays")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "expireDays" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setExpireDays(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "PreserveFileParts")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "PreserveFileParts" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPreserveFileParts(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "FileAccessCost")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "FileAccessCost" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setFileAccessCost(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "KbPerSecAve")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "KbPerSecAve" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setKbPerSecAve(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "KbPerSec")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "KbPerSec" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setKbPerSec(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

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
  } // end of factory class
}

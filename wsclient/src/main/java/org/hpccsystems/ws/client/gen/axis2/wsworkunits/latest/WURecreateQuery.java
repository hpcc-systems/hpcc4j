/**
 * WURecreateQuery.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest;

/** WURecreateQuery bean class */
@SuppressWarnings({"unchecked", "unused"})
public class WURecreateQuery implements org.apache.axis2.databinding.ADBBean {

  public static final javax.xml.namespace.QName MY_QNAME =
      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WURecreateQuery", "ns13");

  /** field for Target */
  protected java.lang.String localTarget;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTargetTracker = false;

  public boolean isTargetSpecified() {
    return localTargetTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getTarget() {
    return localTarget;
  }

  /**
   * Auto generated setter method
   *
   * @param param Target
   */
  public void setTarget(java.lang.String param) {
    localTargetTracker = param != null;

    this.localTarget = param;
  }

  /** field for QueryId */
  protected java.lang.String localQueryId;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localQueryIdTracker = false;

  public boolean isQueryIdSpecified() {
    return localQueryIdTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getQueryId() {
    return localQueryId;
  }

  /**
   * Auto generated setter method
   *
   * @param param QueryId
   */
  public void setQueryId(java.lang.String param) {
    localQueryIdTracker = param != null;

    this.localQueryId = param;
  }

  /** field for DebugValues */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfNamedValue
      localDebugValues;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDebugValuesTracker = false;

  public boolean isDebugValuesSpecified() {
    return localDebugValuesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfNamedValue
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfNamedValue getDebugValues() {
    return localDebugValues;
  }

  /**
   * Auto generated setter method
   *
   * @param param DebugValues
   */
  public void setDebugValues(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfNamedValue param) {
    localDebugValuesTracker = param != null;

    this.localDebugValues = param;
  }

  /** field for DestTarget */
  protected java.lang.String localDestTarget;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDestTargetTracker = false;

  public boolean isDestTargetSpecified() {
    return localDestTargetTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getDestTarget() {
    return localDestTarget;
  }

  /**
   * Auto generated setter method
   *
   * @param param DestTarget
   */
  public void setDestTarget(java.lang.String param) {
    localDestTargetTracker = param != null;

    this.localDestTarget = param;
  }

  /** field for Republish */
  protected boolean localRepublish =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localRepublishTracker = false;

  public boolean isRepublishSpecified() {
    return localRepublishTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getRepublish() {
    return localRepublish;
  }

  /**
   * Auto generated setter method
   *
   * @param param Republish
   */
  public void setRepublish(boolean param) {

    // setting primitive attribute tracker to true
    localRepublishTracker = true;

    this.localRepublish = param;
  }

  /** field for Activate */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryActivationMode
      localActivate;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localActivateTracker = false;

  public boolean isActivateSpecified() {
    return localActivateTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryActivationMode
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryActivationMode
      getActivate() {
    return localActivate;
  }

  /**
   * Auto generated setter method
   *
   * @param param Activate
   */
  public void setActivate(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryActivationMode param) {
    localActivateTracker = param != null;

    this.localActivate = param;
  }

  /** field for NoReload */
  protected boolean localNoReload =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localNoReloadTracker = false;

  public boolean isNoReloadSpecified() {
    return localNoReloadTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getNoReload() {
    return localNoReload;
  }

  /**
   * Auto generated setter method
   *
   * @param param NoReload
   */
  public void setNoReload(boolean param) {

    // setting primitive attribute tracker to true
    localNoReloadTracker = true;

    this.localNoReload = param;
  }

  /** field for MemoryLimit */
  protected java.lang.String localMemoryLimit;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localMemoryLimitTracker = false;

  public boolean isMemoryLimitSpecified() {
    return localMemoryLimitTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getMemoryLimit() {
    return localMemoryLimit;
  }

  /**
   * Auto generated setter method
   *
   * @param param MemoryLimit
   */
  public void setMemoryLimit(java.lang.String param) {
    localMemoryLimitTracker = param != null;

    this.localMemoryLimit = param;
  }

  /** field for TimeLimit */
  protected org.apache.axis2.databinding.types.NonNegativeInteger localTimeLimit =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger("0");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTimeLimitTracker = false;

  public boolean isTimeLimitSpecified() {
    return localTimeLimitTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.apache.axis2.databinding.types.NonNegativeInteger
   */
  public org.apache.axis2.databinding.types.NonNegativeInteger getTimeLimit() {
    return localTimeLimit;
  }

  /**
   * Auto generated setter method
   *
   * @param param TimeLimit
   */
  public void setTimeLimit(org.apache.axis2.databinding.types.NonNegativeInteger param) {
    localTimeLimitTracker = param != null;

    this.localTimeLimit = param;
  }

  /** field for WarnTimeLimit */
  protected org.apache.axis2.databinding.types.NonNegativeInteger localWarnTimeLimit =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger("0");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localWarnTimeLimitTracker = false;

  public boolean isWarnTimeLimitSpecified() {
    return localWarnTimeLimitTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.apache.axis2.databinding.types.NonNegativeInteger
   */
  public org.apache.axis2.databinding.types.NonNegativeInteger getWarnTimeLimit() {
    return localWarnTimeLimit;
  }

  /**
   * Auto generated setter method
   *
   * @param param WarnTimeLimit
   */
  public void setWarnTimeLimit(org.apache.axis2.databinding.types.NonNegativeInteger param) {
    localWarnTimeLimitTracker = param != null;

    this.localWarnTimeLimit = param;
  }

  /** field for Priority */
  protected java.lang.String localPriority;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPriorityTracker = false;

  public boolean isPrioritySpecified() {
    return localPriorityTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getPriority() {
    return localPriority;
  }

  /**
   * Auto generated setter method
   *
   * @param param Priority
   */
  public void setPriority(java.lang.String param) {
    localPriorityTracker = param != null;

    this.localPriority = param;
  }

  /** field for Comment */
  protected java.lang.String localComment;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localCommentTracker = false;

  public boolean isCommentSpecified() {
    return localCommentTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getComment() {
    return localComment;
  }

  /**
   * Auto generated setter method
   *
   * @param param Comment
   */
  public void setComment(java.lang.String param) {
    localCommentTracker = param != null;

    this.localComment = param;
  }

  /** field for RemoteDali */
  protected java.lang.String localRemoteDali;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localRemoteDaliTracker = false;

  public boolean isRemoteDaliSpecified() {
    return localRemoteDaliTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getRemoteDali() {
    return localRemoteDali;
  }

  /**
   * Auto generated setter method
   *
   * @param param RemoteDali
   */
  public void setRemoteDali(java.lang.String param) {
    localRemoteDaliTracker = param != null;

    this.localRemoteDali = param;
  }

  /** field for DontCopyFiles */
  protected boolean localDontCopyFiles =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDontCopyFilesTracker = false;

  public boolean isDontCopyFilesSpecified() {
    return localDontCopyFilesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getDontCopyFiles() {
    return localDontCopyFiles;
  }

  /**
   * Auto generated setter method
   *
   * @param param DontCopyFiles
   */
  public void setDontCopyFiles(boolean param) {

    // setting primitive attribute tracker to true
    localDontCopyFilesTracker = true;

    this.localDontCopyFiles = param;
  }

  /** field for SourceProcess */
  protected java.lang.String localSourceProcess;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSourceProcessTracker = false;

  public boolean isSourceProcessSpecified() {
    return localSourceProcessTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getSourceProcess() {
    return localSourceProcess;
  }

  /**
   * Auto generated setter method
   *
   * @param param SourceProcess
   */
  public void setSourceProcess(java.lang.String param) {
    localSourceProcessTracker = param != null;

    this.localSourceProcess = param;
  }

  /** field for AllowForeignFiles */
  protected boolean localAllowForeignFiles =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localAllowForeignFilesTracker = false;

  public boolean isAllowForeignFilesSpecified() {
    return localAllowForeignFilesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getAllowForeignFiles() {
    return localAllowForeignFiles;
  }

  /**
   * Auto generated setter method
   *
   * @param param AllowForeignFiles
   */
  public void setAllowForeignFiles(boolean param) {

    // setting primitive attribute tracker to true
    localAllowForeignFilesTracker = true;

    this.localAllowForeignFiles = param;
  }

  /** field for UpdateDfs */
  protected boolean localUpdateDfs =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localUpdateDfsTracker = false;

  public boolean isUpdateDfsSpecified() {
    return localUpdateDfsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getUpdateDfs() {
    return localUpdateDfs;
  }

  /**
   * Auto generated setter method
   *
   * @param param UpdateDfs
   */
  public void setUpdateDfs(boolean param) {

    // setting primitive attribute tracker to true
    localUpdateDfsTracker = true;

    this.localUpdateDfs = param;
  }

  /** field for UpdateSuperFiles */
  protected boolean localUpdateSuperFiles =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localUpdateSuperFilesTracker = false;

  public boolean isUpdateSuperFilesSpecified() {
    return localUpdateSuperFilesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getUpdateSuperFiles() {
    return localUpdateSuperFiles;
  }

  /**
   * Auto generated setter method
   *
   * @param param UpdateSuperFiles
   */
  public void setUpdateSuperFiles(boolean param) {

    // setting primitive attribute tracker to true
    localUpdateSuperFilesTracker = true;

    this.localUpdateSuperFiles = param;
  }

  /** field for UpdateCloneFrom */
  protected boolean localUpdateCloneFrom =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localUpdateCloneFromTracker = false;

  public boolean isUpdateCloneFromSpecified() {
    return localUpdateCloneFromTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getUpdateCloneFrom() {
    return localUpdateCloneFrom;
  }

  /**
   * Auto generated setter method
   *
   * @param param UpdateCloneFrom
   */
  public void setUpdateCloneFrom(boolean param) {

    // setting primitive attribute tracker to true
    localUpdateCloneFromTracker = true;

    this.localUpdateCloneFrom = param;
  }

  /** field for AppendCluster */
  protected boolean localAppendCluster =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("true");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localAppendClusterTracker = false;

  public boolean isAppendClusterSpecified() {
    return localAppendClusterTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getAppendCluster() {
    return localAppendCluster;
  }

  /**
   * Auto generated setter method
   *
   * @param param AppendCluster
   */
  public void setAppendCluster(boolean param) {

    // setting primitive attribute tracker to true
    localAppendClusterTracker = true;

    this.localAppendCluster = param;
  }

  /** field for IncludeFileErrors */
  protected boolean localIncludeFileErrors =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIncludeFileErrorsTracker = false;

  public boolean isIncludeFileErrorsSpecified() {
    return localIncludeFileErrorsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getIncludeFileErrors() {
    return localIncludeFileErrors;
  }

  /**
   * Auto generated setter method
   *
   * @param param IncludeFileErrors
   */
  public void setIncludeFileErrors(boolean param) {

    // setting primitive attribute tracker to true
    localIncludeFileErrorsTracker = true;

    this.localIncludeFileErrors = param;
  }

  /** field for Wait */
  protected int localWait = org.apache.axis2.databinding.utils.ConverterUtil.convertToInt("-1");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localWaitTracker = false;

  public boolean isWaitSpecified() {
    return localWaitTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getWait() {
    return localWait;
  }

  /**
   * Auto generated setter method
   *
   * @param param Wait
   */
  public void setWait(int param) {

    // setting primitive attribute tracker to true
    localWaitTracker = param != java.lang.Integer.MIN_VALUE;

    this.localWait = param;
  }

  /** field for DfuCopyFiles */
  protected boolean localDfuCopyFiles =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDfuCopyFilesTracker = false;

  public boolean isDfuCopyFilesSpecified() {
    return localDfuCopyFilesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getDfuCopyFiles() {
    return localDfuCopyFiles;
  }

  /**
   * Auto generated setter method
   *
   * @param param DfuCopyFiles
   */
  public void setDfuCopyFiles(boolean param) {

    // setting primitive attribute tracker to true
    localDfuCopyFilesTracker = true;

    this.localDfuCopyFiles = param;
  }

  /** field for DfuQueue */
  protected java.lang.String localDfuQueue;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDfuQueueTracker = false;

  public boolean isDfuQueueSpecified() {
    return localDfuQueueTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getDfuQueue() {
    return localDfuQueue;
  }

  /**
   * Auto generated setter method
   *
   * @param param DfuQueue
   */
  public void setDfuQueue(java.lang.String param) {
    localDfuQueueTracker = param != null;

    this.localDfuQueue = param;
  }

  /** field for DfuWait */
  protected org.apache.axis2.databinding.types.NonNegativeInteger localDfuWait =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger("1800000");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDfuWaitTracker = false;

  public boolean isDfuWaitSpecified() {
    return localDfuWaitTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.apache.axis2.databinding.types.NonNegativeInteger
   */
  public org.apache.axis2.databinding.types.NonNegativeInteger getDfuWait() {
    return localDfuWait;
  }

  /**
   * Auto generated setter method
   *
   * @param param DfuWait
   */
  public void setDfuWait(org.apache.axis2.databinding.types.NonNegativeInteger param) {
    localDfuWaitTracker = param != null;

    this.localDfuWait = param;
  }

  /** field for DfuOverwrite */
  protected boolean localDfuOverwrite =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDfuOverwriteTracker = false;

  public boolean isDfuOverwriteSpecified() {
    return localDfuOverwriteTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getDfuOverwrite() {
    return localDfuOverwrite;
  }

  /**
   * Auto generated setter method
   *
   * @param param DfuOverwrite
   */
  public void setDfuOverwrite(boolean param) {

    // setting primitive attribute tracker to true
    localDfuOverwriteTracker = true;

    this.localDfuOverwrite = param;
  }

  /** field for OnlyCopyFiles */
  protected boolean localOnlyCopyFiles =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localOnlyCopyFilesTracker = false;

  public boolean isOnlyCopyFilesSpecified() {
    return localOnlyCopyFilesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getOnlyCopyFiles() {
    return localOnlyCopyFiles;
  }

  /**
   * Auto generated setter method
   *
   * @param param OnlyCopyFiles
   */
  public void setOnlyCopyFiles(boolean param) {

    // setting primitive attribute tracker to true
    localOnlyCopyFilesTracker = true;

    this.localOnlyCopyFiles = param;
  }

  /** field for StopIfFilesCopied */
  protected boolean localStopIfFilesCopied =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localStopIfFilesCopiedTracker = false;

  public boolean isStopIfFilesCopiedSpecified() {
    return localStopIfFilesCopiedTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getStopIfFilesCopied() {
    return localStopIfFilesCopied;
  }

  /**
   * Auto generated setter method
   *
   * @param param StopIfFilesCopied
   */
  public void setStopIfFilesCopied(boolean param) {

    // setting primitive attribute tracker to true
    localStopIfFilesCopiedTracker = true;

    this.localStopIfFilesCopied = param;
  }

  /** field for DfuPublisherWuid */
  protected java.lang.String localDfuPublisherWuid;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDfuPublisherWuidTracker = false;

  public boolean isDfuPublisherWuidSpecified() {
    return localDfuPublisherWuidTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getDfuPublisherWuid() {
    return localDfuPublisherWuid;
  }

  /**
   * Auto generated setter method
   *
   * @param param DfuPublisherWuid
   */
  public void setDfuPublisherWuid(java.lang.String param) {
    localDfuPublisherWuidTracker = param != null;

    this.localDfuPublisherWuid = param;
  }

  /** field for RemoteStorage */
  protected java.lang.String localRemoteStorage;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localRemoteStorageTracker = false;

  public boolean isRemoteStorageSpecified() {
    return localRemoteStorageTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getRemoteStorage() {
    return localRemoteStorage;
  }

  /**
   * Auto generated setter method
   *
   * @param param RemoteStorage
   */
  public void setRemoteStorage(java.lang.String param) {
    localRemoteStorageTracker = param != null;

    this.localRemoteStorage = param;
  }

  /** field for KeyCompression */
  protected java.lang.String localKeyCompression;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localKeyCompressionTracker = false;

  public boolean isKeyCompressionSpecified() {
    return localKeyCompressionTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getKeyCompression() {
    return localKeyCompression;
  }

  /**
   * Auto generated setter method
   *
   * @param param KeyCompression
   */
  public void setKeyCompression(java.lang.String param) {
    localKeyCompressionTracker = param != null;

    this.localKeyCompression = param;
  }

  /**
   * @param parentQName
   * @param factory
   * @return org.apache.axiom.om.OMElement
   */
  public org.apache.axiom.om.OMElement getOMElement(
      final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
      throws org.apache.axis2.databinding.ADBException {

    return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
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

      java.lang.String namespacePrefix =
          registerPrefix(xmlWriter, "urn:hpccsystems:ws:wsworkunits");
      if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            namespacePrefix + ":WURecreateQuery",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            "WURecreateQuery",
            xmlWriter);
      }
    }
    if (localTargetTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Target", xmlWriter);

      if (localTarget == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Target cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localTarget);
      }

      xmlWriter.writeEndElement();
    }
    if (localQueryIdTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "QueryId", xmlWriter);

      if (localQueryId == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("QueryId cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localQueryId);
      }

      xmlWriter.writeEndElement();
    }
    if (localDebugValuesTracker) {
      if (localDebugValues == null) {
        throw new org.apache.axis2.databinding.ADBException("DebugValues cannot be null!!");
      }
      localDebugValues.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DebugValues"),
          xmlWriter);
    }
    if (localDestTargetTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "DestTarget", xmlWriter);

      if (localDestTarget == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("DestTarget cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localDestTarget);
      }

      xmlWriter.writeEndElement();
    }
    if (localRepublishTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Republish", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("Republish cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRepublish));
      }

      xmlWriter.writeEndElement();
    }
    if (localActivateTracker) {
      if (localActivate == null) {
        throw new org.apache.axis2.databinding.ADBException("Activate cannot be null!!");
      }
      localActivate.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Activate"), xmlWriter);
    }
    if (localNoReloadTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "NoReload", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("NoReload cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNoReload));
      }

      xmlWriter.writeEndElement();
    }
    if (localMemoryLimitTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "MemoryLimit", xmlWriter);

      if (localMemoryLimit == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("MemoryLimit cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localMemoryLimit);
      }

      xmlWriter.writeEndElement();
    }
    if (localTimeLimitTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "TimeLimit", xmlWriter);

      if (localTimeLimit == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("TimeLimit cannot be null!!");

      } else {

        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimeLimit));
      }

      xmlWriter.writeEndElement();
    }
    if (localWarnTimeLimitTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "WarnTimeLimit", xmlWriter);

      if (localWarnTimeLimit == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("WarnTimeLimit cannot be null!!");

      } else {

        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWarnTimeLimit));
      }

      xmlWriter.writeEndElement();
    }
    if (localPriorityTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Priority", xmlWriter);

      if (localPriority == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Priority cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localPriority);
      }

      xmlWriter.writeEndElement();
    }
    if (localCommentTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Comment", xmlWriter);

      if (localComment == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Comment cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localComment);
      }

      xmlWriter.writeEndElement();
    }
    if (localRemoteDaliTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "RemoteDali", xmlWriter);

      if (localRemoteDali == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("RemoteDali cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localRemoteDali);
      }

      xmlWriter.writeEndElement();
    }
    if (localDontCopyFilesTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "DontCopyFiles", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("DontCopyFiles cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDontCopyFiles));
      }

      xmlWriter.writeEndElement();
    }
    if (localSourceProcessTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "SourceProcess", xmlWriter);

      if (localSourceProcess == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("SourceProcess cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSourceProcess);
      }

      xmlWriter.writeEndElement();
    }
    if (localAllowForeignFilesTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "AllowForeignFiles", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("AllowForeignFiles cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localAllowForeignFiles));
      }

      xmlWriter.writeEndElement();
    }
    if (localUpdateDfsTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "UpdateDfs", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("UpdateDfs cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdateDfs));
      }

      xmlWriter.writeEndElement();
    }
    if (localUpdateSuperFilesTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "UpdateSuperFiles", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("UpdateSuperFiles cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localUpdateSuperFiles));
      }

      xmlWriter.writeEndElement();
    }
    if (localUpdateCloneFromTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "UpdateCloneFrom", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("UpdateCloneFrom cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUpdateCloneFrom));
      }

      xmlWriter.writeEndElement();
    }
    if (localAppendClusterTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "AppendCluster", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("AppendCluster cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAppendCluster));
      }

      xmlWriter.writeEndElement();
    }
    if (localIncludeFileErrorsTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "IncludeFileErrors", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("IncludeFileErrors cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localIncludeFileErrors));
      }

      xmlWriter.writeEndElement();
    }
    if (localWaitTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Wait", xmlWriter);

      if (localWait == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("Wait cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWait));
      }

      xmlWriter.writeEndElement();
    }
    if (localDfuCopyFilesTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "DfuCopyFiles", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("DfuCopyFiles cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDfuCopyFiles));
      }

      xmlWriter.writeEndElement();
    }
    if (localDfuQueueTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "DfuQueue", xmlWriter);

      if (localDfuQueue == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("DfuQueue cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localDfuQueue);
      }

      xmlWriter.writeEndElement();
    }
    if (localDfuWaitTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "DfuWait", xmlWriter);

      if (localDfuWait == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("DfuWait cannot be null!!");

      } else {

        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDfuWait));
      }

      xmlWriter.writeEndElement();
    }
    if (localDfuOverwriteTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "DfuOverwrite", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("DfuOverwrite cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDfuOverwrite));
      }

      xmlWriter.writeEndElement();
    }
    if (localOnlyCopyFilesTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "OnlyCopyFiles", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("OnlyCopyFiles cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOnlyCopyFiles));
      }

      xmlWriter.writeEndElement();
    }
    if (localStopIfFilesCopiedTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "StopIfFilesCopied", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("StopIfFilesCopied cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localStopIfFilesCopied));
      }

      xmlWriter.writeEndElement();
    }
    if (localDfuPublisherWuidTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "DfuPublisherWuid", xmlWriter);

      if (localDfuPublisherWuid == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("DfuPublisherWuid cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localDfuPublisherWuid);
      }

      xmlWriter.writeEndElement();
    }
    if (localRemoteStorageTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "RemoteStorage", xmlWriter);

      if (localRemoteStorage == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("RemoteStorage cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localRemoteStorage);
      }

      xmlWriter.writeEndElement();
    }
    if (localKeyCompressionTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "KeyCompression", xmlWriter);

      if (localKeyCompression == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("KeyCompression cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localKeyCompression);
      }

      xmlWriter.writeEndElement();
    }
    xmlWriter.writeEndElement();
  }

  private static java.lang.String generatePrefix(java.lang.String namespace) {
    if (namespace.equals("urn:hpccsystems:ws:wsworkunits")) {
      return "ns13";
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
    public static WURecreateQuery parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      WURecreateQuery object = new WURecreateQuery();

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

            if (!"WURecreateQuery".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (WURecreateQuery)
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ExtensionMapper
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Target")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Target" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setTarget(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "QueryId")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "QueryId" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setQueryId(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DebugValues")
                    .equals(reader.getName())) {

              object.setDebugValues(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfNamedValue.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DestTarget")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "DestTarget" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDestTarget(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Republish")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Republish" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setRepublish(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Activate")
                    .equals(reader.getName())) {

              object.setActivate(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryActivationMode
                      .Factory.parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "NoReload")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "NoReload" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setNoReload(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "MemoryLimit")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "MemoryLimit" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setMemoryLimit(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "TimeLimit")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "TimeLimit" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setTimeLimit(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(
                      content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WarnTimeLimit")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "WarnTimeLimit" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setWarnTimeLimit(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(
                      content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Priority")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Priority" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPriority(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Comment")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Comment" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setComment(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "RemoteDali")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "RemoteDali" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setRemoteDali(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DontCopyFiles")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "DontCopyFiles" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDontCopyFiles(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "SourceProcess")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SourceProcess" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSourceProcess(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "AllowForeignFiles")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "AllowForeignFiles" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setAllowForeignFiles(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "UpdateDfs")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "UpdateDfs" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setUpdateDfs(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "UpdateSuperFiles")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "UpdateSuperFiles" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setUpdateSuperFiles(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "UpdateCloneFrom")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "UpdateCloneFrom" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setUpdateCloneFrom(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "AppendCluster")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "AppendCluster" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setAppendCluster(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "IncludeFileErrors")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "IncludeFileErrors" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setIncludeFileErrors(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Wait")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Wait" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setWait(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DfuCopyFiles")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "DfuCopyFiles" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDfuCopyFiles(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DfuQueue")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "DfuQueue" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDfuQueue(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DfuWait")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "DfuWait" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDfuWait(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToNonNegativeInteger(
                      content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DfuOverwrite")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "DfuOverwrite" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDfuOverwrite(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "OnlyCopyFiles")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "OnlyCopyFiles" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setOnlyCopyFiles(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "StopIfFilesCopied")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "StopIfFilesCopied" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setStopIfFilesCopied(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "DfuPublisherWuid")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "DfuPublisherWuid" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDfuPublisherWuid(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "RemoteStorage")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "RemoteStorage" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setRemoteStorage(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "KeyCompression")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "KeyCompression" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setKeyCompression(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

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

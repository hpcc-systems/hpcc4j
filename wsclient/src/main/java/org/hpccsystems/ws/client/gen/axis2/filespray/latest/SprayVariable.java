/**
 * SprayVariable.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.filespray.latest;

/** SprayVariable bean class */
@SuppressWarnings({"unchecked", "unused"})
public class SprayVariable implements org.apache.axis2.databinding.ADBBean {

  public static final javax.xml.namespace.QName MY_QNAME =
      new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "SprayVariable", "ns1");

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

  /** field for SourcePlane */
  protected java.lang.String localSourcePlane;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSourcePlaneTracker = false;

  public boolean isSourcePlaneSpecified() {
    return localSourcePlaneTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getSourcePlane() {
    return localSourcePlane;
  }

  /**
   * Auto generated setter method
   *
   * @param param SourcePlane
   */
  public void setSourcePlane(java.lang.String param) {
    localSourcePlaneTracker = param != null;

    this.localSourcePlane = param;
  }

  /** field for SourcePath */
  protected java.lang.String localSourcePath;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSourcePathTracker = false;

  public boolean isSourcePathSpecified() {
    return localSourcePathTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getSourcePath() {
    return localSourcePath;
  }

  /**
   * Auto generated setter method
   *
   * @param param SourcePath
   */
  public void setSourcePath(java.lang.String param) {
    localSourcePathTracker = param != null;

    this.localSourcePath = param;
  }

  /** field for Srcxml */
  protected jakarta.activation.DataHandler localSrcxml;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSrcxmlTracker = false;

  public boolean isSrcxmlSpecified() {
    return localSrcxmlTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return jakarta.activation.DataHandler
   */
  public jakarta.activation.DataHandler getSrcxml() {
    return localSrcxml;
  }

  /**
   * Auto generated setter method
   *
   * @param param Srcxml
   */
  public void setSrcxml(jakarta.activation.DataHandler param) {
    localSrcxmlTracker = param != null;

    this.localSrcxml = param;
  }

  /** field for SourceMaxRecordSize */
  protected int localSourceMaxRecordSize;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSourceMaxRecordSizeTracker = false;

  public boolean isSourceMaxRecordSizeSpecified() {
    return localSourceMaxRecordSizeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getSourceMaxRecordSize() {
    return localSourceMaxRecordSize;
  }

  /**
   * Auto generated setter method
   *
   * @param param SourceMaxRecordSize
   */
  public void setSourceMaxRecordSize(int param) {

    // setting primitive attribute tracker to true
    localSourceMaxRecordSizeTracker = param != java.lang.Integer.MIN_VALUE;

    this.localSourceMaxRecordSize = param;
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

  /** field for NoSourceCsvSeparator */
  protected boolean localNoSourceCsvSeparator =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localNoSourceCsvSeparatorTracker = false;

  public boolean isNoSourceCsvSeparatorSpecified() {
    return localNoSourceCsvSeparatorTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getNoSourceCsvSeparator() {
    return localNoSourceCsvSeparator;
  }

  /**
   * Auto generated setter method
   *
   * @param param NoSourceCsvSeparator
   */
  public void setNoSourceCsvSeparator(boolean param) {

    // setting primitive attribute tracker to true
    localNoSourceCsvSeparatorTracker = true;

    this.localNoSourceCsvSeparator = param;
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

  /** field for SourceRowTag */
  protected java.lang.String localSourceRowTag;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSourceRowTagTracker = false;

  public boolean isSourceRowTagSpecified() {
    return localSourceRowTagTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getSourceRowTag() {
    return localSourceRowTag;
  }

  /**
   * Auto generated setter method
   *
   * @param param SourceRowTag
   */
  public void setSourceRowTag(java.lang.String param) {
    localSourceRowTagTracker = param != null;

    this.localSourceRowTag = param;
  }

  /** field for DestGroup */
  protected java.lang.String localDestGroup;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDestGroupTracker = false;

  public boolean isDestGroupSpecified() {
    return localDestGroupTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getDestGroup() {
    return localDestGroup;
  }

  /**
   * Auto generated setter method
   *
   * @param param DestGroup
   */
  public void setDestGroup(java.lang.String param) {
    localDestGroupTracker = param != null;

    this.localDestGroup = param;
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

  /** field for DestNumParts */
  protected int localDestNumParts =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToInt("0");

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

  /** field for ReplicateOffset */
  protected int localReplicateOffset =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToInt("1");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localReplicateOffsetTracker = false;

  public boolean isReplicateOffsetSpecified() {
    return localReplicateOffsetTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getReplicateOffset() {
    return localReplicateOffset;
  }

  /**
   * Auto generated setter method
   *
   * @param param ReplicateOffset
   */
  public void setReplicateOffset(int param) {

    // setting primitive attribute tracker to true
    localReplicateOffsetTracker = param != java.lang.Integer.MIN_VALUE;

    this.localReplicateOffset = param;
  }

  /** field for MaxConnections */
  protected int localMaxConnections;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localMaxConnectionsTracker = false;

  public boolean isMaxConnectionsSpecified() {
    return localMaxConnectionsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getMaxConnections() {
    return localMaxConnections;
  }

  /**
   * Auto generated setter method
   *
   * @param param MaxConnections
   */
  public void setMaxConnections(int param) {

    // setting primitive attribute tracker to true
    localMaxConnectionsTracker = param != java.lang.Integer.MIN_VALUE;

    this.localMaxConnections = param;
  }

  /** field for Throttle */
  protected int localThrottle;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localThrottleTracker = false;

  public boolean isThrottleSpecified() {
    return localThrottleTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getThrottle() {
    return localThrottle;
  }

  /**
   * Auto generated setter method
   *
   * @param param Throttle
   */
  public void setThrottle(int param) {

    // setting primitive attribute tracker to true
    localThrottleTracker = param != java.lang.Integer.MIN_VALUE;

    this.localThrottle = param;
  }

  /** field for TransferBufferSize */
  protected int localTransferBufferSize;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTransferBufferSizeTracker = false;

  public boolean isTransferBufferSizeSpecified() {
    return localTransferBufferSizeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getTransferBufferSize() {
    return localTransferBufferSize;
  }

  /**
   * Auto generated setter method
   *
   * @param param TransferBufferSize
   */
  public void setTransferBufferSize(int param) {

    // setting primitive attribute tracker to true
    localTransferBufferSizeTracker = param != java.lang.Integer.MIN_VALUE;

    this.localTransferBufferSize = param;
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

  /** field for Nosplit */
  protected boolean localNosplit =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localNosplitTracker = false;

  public boolean isNosplitSpecified() {
    return localNosplitTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getNosplit() {
    return localNosplit;
  }

  /**
   * Auto generated setter method
   *
   * @param param Nosplit
   */
  public void setNosplit(boolean param) {

    // setting primitive attribute tracker to true
    localNosplitTracker = true;

    this.localNosplit = param;
  }

  /** field for Norecover */
  protected boolean localNorecover =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localNorecoverTracker = false;

  public boolean isNorecoverSpecified() {
    return localNorecoverTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getNorecover() {
    return localNorecover;
  }

  /**
   * Auto generated setter method
   *
   * @param param Norecover
   */
  public void setNorecover(boolean param) {

    // setting primitive attribute tracker to true
    localNorecoverTracker = true;

    this.localNorecover = param;
  }

  /** field for Compress */
  protected boolean localCompress =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

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

  /** field for Push */
  protected boolean localPush =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPushTracker = false;

  public boolean isPushSpecified() {
    return localPushTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getPush() {
    return localPush;
  }

  /**
   * Auto generated setter method
   *
   * @param param Push
   */
  public void setPush(boolean param) {

    // setting primitive attribute tracker to true
    localPushTracker = true;

    this.localPush = param;
  }

  /** field for Pull */
  protected boolean localPull =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPullTracker = false;

  public boolean isPullSpecified() {
    return localPullTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getPull() {
    return localPull;
  }

  /**
   * Auto generated setter method
   *
   * @param param Pull
   */
  public void setPull(boolean param) {

    // setting primitive attribute tracker to true
    localPullTracker = true;

    this.localPull = param;
  }

  /** field for NoCommon */
  protected boolean localNoCommon =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("true");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localNoCommonTracker = false;

  public boolean isNoCommonSpecified() {
    return localNoCommonTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getNoCommon() {
    return localNoCommon;
  }

  /**
   * Auto generated setter method
   *
   * @param param NoCommon
   */
  public void setNoCommon(boolean param) {

    // setting primitive attribute tracker to true
    localNoCommonTracker = true;

    this.localNoCommon = param;
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

  /** field for SourceRowPath */
  protected java.lang.String localSourceRowPath;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSourceRowPathTracker = false;

  public boolean isSourceRowPathSpecified() {
    return localSourceRowPathTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getSourceRowPath() {
    return localSourceRowPath;
  }

  /**
   * Auto generated setter method
   *
   * @param param SourceRowPath
   */
  public void setSourceRowPath(java.lang.String param) {
    localSourceRowPathTracker = param != null;

    this.localSourceRowPath = param;
  }

  /** field for IsJSON */
  protected boolean localIsJSON =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIsJSONTracker = false;

  public boolean isIsJSONSpecified() {
    return localIsJSONTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getIsJSON() {
    return localIsJSON;
  }

  /**
   * Auto generated setter method
   *
   * @param param IsJSON
   */
  public void setIsJSON(boolean param) {

    // setting primitive attribute tracker to true
    localIsJSONTracker = true;

    this.localIsJSON = param;
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

  /** field for DFUServerQueue */
  protected java.lang.String localDFUServerQueue;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUServerQueueTracker = false;

  public boolean isDFUServerQueueSpecified() {
    return localDFUServerQueueTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getDFUServerQueue() {
    return localDFUServerQueue;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUServerQueue
   */
  public void setDFUServerQueue(java.lang.String param) {
    localDFUServerQueueTracker = param != null;

    this.localDFUServerQueue = param;
  }

  /** field for SrcUsername */
  protected java.lang.String localSrcUsername;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSrcUsernameTracker = false;

  public boolean isSrcUsernameSpecified() {
    return localSrcUsernameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getSrcUsername() {
    return localSrcUsername;
  }

  /**
   * Auto generated setter method
   *
   * @param param SrcUsername
   */
  public void setSrcUsername(java.lang.String param) {
    localSrcUsernameTracker = param != null;

    this.localSrcUsername = param;
  }

  /** field for SrcPassword */
  protected java.lang.String localSrcPassword;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSrcPasswordTracker = false;

  public boolean isSrcPasswordSpecified() {
    return localSrcPasswordTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getSrcPassword() {
    return localSrcPassword;
  }

  /**
   * Auto generated setter method
   *
   * @param param SrcPassword
   */
  public void setSrcPassword(java.lang.String param) {
    localSrcPasswordTracker = param != null;

    this.localSrcPassword = param;
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

      java.lang.String namespacePrefix = registerPrefix(xmlWriter, "urn:hpccsystems:ws:filespray");
      if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            namespacePrefix + ":SprayVariable",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "SprayVariable", xmlWriter);
      }
    }
    if (localSourceIPTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "sourceIP", xmlWriter);

      if (localSourceIP == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("sourceIP cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSourceIP);
      }

      xmlWriter.writeEndElement();
    }
    if (localSourcePlaneTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "sourcePlane", xmlWriter);

      if (localSourcePlane == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("sourcePlane cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSourcePlane);
      }

      xmlWriter.writeEndElement();
    }
    if (localSourcePathTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "sourcePath", xmlWriter);

      if (localSourcePath == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("sourcePath cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSourcePath);
      }

      xmlWriter.writeEndElement();
    }
    if (localSrcxmlTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "srcxml", xmlWriter);

      if (localSrcxml != null) {
        try {
          org.apache.axiom.util.stax.XMLStreamWriterUtils.writeBlob(
              xmlWriter,
              org.apache.axiom.util.activation.DataHandlerUtils.toBlob(localSrcxml),
              null,
              true);
        } catch (java.io.IOException ex) {
          throw new javax.xml.stream.XMLStreamException(
              "Unable to read data handler for srcxml", ex);
        }
      } else {

      }

      xmlWriter.writeEndElement();
    }
    if (localSourceMaxRecordSizeTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "sourceMaxRecordSize", xmlWriter);

      if (localSourceMaxRecordSize == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("sourceMaxRecordSize cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localSourceMaxRecordSize));
      }

      xmlWriter.writeEndElement();
    }
    if (localSourceFormatTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "sourceFormat", xmlWriter);

      if (localSourceFormat == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("sourceFormat cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSourceFormat));
      }

      xmlWriter.writeEndElement();
    }
    if (localNoSourceCsvSeparatorTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "NoSourceCsvSeparator", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException(
            "NoSourceCsvSeparator cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localNoSourceCsvSeparator));
      }

      xmlWriter.writeEndElement();
    }
    if (localSourceCsvSeparateTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "sourceCsvSeparate", xmlWriter);

      if (localSourceCsvSeparate == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("sourceCsvSeparate cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSourceCsvSeparate);
      }

      xmlWriter.writeEndElement();
    }
    if (localSourceCsvTerminateTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "sourceCsvTerminate", xmlWriter);

      if (localSourceCsvTerminate == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("sourceCsvTerminate cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSourceCsvTerminate);
      }

      xmlWriter.writeEndElement();
    }
    if (localSourceCsvQuoteTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "sourceCsvQuote", xmlWriter);

      if (localSourceCsvQuote == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("sourceCsvQuote cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSourceCsvQuote);
      }

      xmlWriter.writeEndElement();
    }
    if (localSourceCsvEscapeTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "sourceCsvEscape", xmlWriter);

      if (localSourceCsvEscape == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("sourceCsvEscape cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSourceCsvEscape);
      }

      xmlWriter.writeEndElement();
    }
    if (localSourceRowTagTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "sourceRowTag", xmlWriter);

      if (localSourceRowTag == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("sourceRowTag cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSourceRowTag);
      }

      xmlWriter.writeEndElement();
    }
    if (localDestGroupTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "destGroup", xmlWriter);

      if (localDestGroup == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("destGroup cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localDestGroup);
      }

      xmlWriter.writeEndElement();
    }
    if (localDestLogicalNameTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "destLogicalName", xmlWriter);

      if (localDestLogicalName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("destLogicalName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localDestLogicalName);
      }

      xmlWriter.writeEndElement();
    }
    if (localDestNumPartsTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "destNumParts", xmlWriter);

      if (localDestNumParts == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("destNumParts cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDestNumParts));
      }

      xmlWriter.writeEndElement();
    }
    if (localOverwriteTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "overwrite", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("overwrite cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOverwrite));
      }

      xmlWriter.writeEndElement();
    }
    if (localReplicateTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "replicate", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("replicate cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReplicate));
      }

      xmlWriter.writeEndElement();
    }
    if (localReplicateOffsetTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "ReplicateOffset", xmlWriter);

      if (localReplicateOffset == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("ReplicateOffset cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReplicateOffset));
      }

      xmlWriter.writeEndElement();
    }
    if (localMaxConnectionsTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "maxConnections", xmlWriter);

      if (localMaxConnections == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("maxConnections cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxConnections));
      }

      xmlWriter.writeEndElement();
    }
    if (localThrottleTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "throttle", xmlWriter);

      if (localThrottle == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("throttle cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localThrottle));
      }

      xmlWriter.writeEndElement();
    }
    if (localTransferBufferSizeTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "transferBufferSize", xmlWriter);

      if (localTransferBufferSize == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("transferBufferSize cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localTransferBufferSize));
      }

      xmlWriter.writeEndElement();
    }
    if (localPrefixTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "prefix", xmlWriter);

      if (localPrefix == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("prefix cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localPrefix);
      }

      xmlWriter.writeEndElement();
    }
    if (localNosplitTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "nosplit", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("nosplit cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNosplit));
      }

      xmlWriter.writeEndElement();
    }
    if (localNorecoverTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "norecover", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("norecover cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNorecover));
      }

      xmlWriter.writeEndElement();
    }
    if (localCompressTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "compress", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("compress cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCompress));
      }

      xmlWriter.writeEndElement();
    }
    if (localPushTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "push", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("push cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPush));
      }

      xmlWriter.writeEndElement();
    }
    if (localPullTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "pull", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("pull cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPull));
      }

      xmlWriter.writeEndElement();
    }
    if (localNoCommonTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "noCommon", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("noCommon cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNoCommon));
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
    if (localSourceRowPathTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "sourceRowPath", xmlWriter);

      if (localSourceRowPath == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("sourceRowPath cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSourceRowPath);
      }

      xmlWriter.writeEndElement();
    }
    if (localIsJSONTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "isJSON", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("isJSON cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsJSON));
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
    if (localDFUServerQueueTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "DFUServerQueue", xmlWriter);

      if (localDFUServerQueue == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("DFUServerQueue cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localDFUServerQueue);
      }

      xmlWriter.writeEndElement();
    }
    if (localSrcUsernameTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "srcUsername", xmlWriter);

      if (localSrcUsername == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("srcUsername cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSrcUsername);
      }

      xmlWriter.writeEndElement();
    }
    if (localSrcPasswordTracker) {
      namespace = "urn:hpccsystems:ws:filespray";
      writeStartElement(null, namespace, "srcPassword", xmlWriter);

      if (localSrcPassword == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("srcPassword cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSrcPassword);
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
    public static SprayVariable parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      SprayVariable object = new SprayVariable();

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

            if (!"SprayVariable".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (SprayVariable)
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "sourceIP")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "sourceIP" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSourceIP(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "sourcePlane")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "sourcePlane" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSourcePlane(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "sourcePath")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "sourcePath" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSourcePath(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "srcxml")
                    .equals(reader.getName())) {

              object.setSrcxml(
                  org.apache.axiom.util.activation.DataHandlerUtils.toDataHandler(
                      org.apache.axiom.util.stax.XMLStreamReaderUtils.getBlobFromElement(reader)));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "sourceMaxRecordSize")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "sourceMaxRecordSize" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSourceMaxRecordSize(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "sourceFormat")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "sourceFormat" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSourceFormat(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "NoSourceCsvSeparator")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "NoSourceCsvSeparator" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setNoSourceCsvSeparator(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "sourceCsvSeparate")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "sourceCsvSeparate" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSourceCsvSeparate(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "sourceCsvTerminate")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "sourceCsvTerminate" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSourceCsvTerminate(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "sourceCsvQuote")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "sourceCsvQuote" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSourceCsvQuote(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "sourceCsvEscape")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "sourceCsvEscape" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSourceCsvEscape(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "sourceRowTag")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "sourceRowTag" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSourceRowTag(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "destGroup")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "destGroup" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDestGroup(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "destLogicalName")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "destLogicalName" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDestLogicalName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "destNumParts")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "destNumParts" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDestNumParts(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "overwrite")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "overwrite" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setOverwrite(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "replicate")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "replicate" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setReplicate(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "ReplicateOffset")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ReplicateOffset" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setReplicateOffset(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "maxConnections")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "maxConnections" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setMaxConnections(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "throttle")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "throttle" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setThrottle(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "transferBufferSize")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "transferBufferSize" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setTransferBufferSize(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "prefix")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "prefix" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPrefix(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "nosplit")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "nosplit" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setNosplit(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "norecover")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "norecover" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setNorecover(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "compress")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "compress" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setCompress(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "push")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "push" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPush(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "pull")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "pull" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPull(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "noCommon")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "noCommon" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setNoCommon(
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "sourceRowPath")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "sourceRowPath" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSourceRowPath(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "isJSON")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "isJSON" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setIsJSON(
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "DFUServerQueue")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "DFUServerQueue" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDFUServerQueue(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "srcUsername")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "srcUsername" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSrcUsername(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray", "srcPassword")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "srcPassword" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSrcPassword(
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

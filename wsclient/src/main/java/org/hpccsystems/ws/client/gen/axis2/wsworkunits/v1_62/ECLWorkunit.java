/**
 * ECLWorkunit.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62;

/** ECLWorkunit bean class */
@SuppressWarnings({"unchecked", "unused"})
public class ECLWorkunit implements org.apache.axis2.databinding.ADBBean {
  /* This type was generated from the piece of schema that had
  name = ECLWorkunit
  Namespace URI = urn:hpccsystems:ws:wsworkunits
  Namespace Prefix = ns1
  */

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

  /** field for Cluster */
  protected java.lang.String localCluster;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localClusterTracker = false;

  public boolean isClusterSpecified() {
    return localClusterTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getCluster() {
    return localCluster;
  }

  /**
   * Auto generated setter method
   *
   * @param param Cluster
   */
  public void setCluster(java.lang.String param) {
    localClusterTracker = param != null;

    this.localCluster = param;
  }

  /** field for RoxieCluster */
  protected java.lang.String localRoxieCluster;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localRoxieClusterTracker = false;

  public boolean isRoxieClusterSpecified() {
    return localRoxieClusterTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getRoxieCluster() {
    return localRoxieCluster;
  }

  /**
   * Auto generated setter method
   *
   * @param param RoxieCluster
   */
  public void setRoxieCluster(java.lang.String param) {
    localRoxieClusterTracker = param != null;

    this.localRoxieCluster = param;
  }

  /** field for Jobname */
  protected java.lang.String localJobname;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localJobnameTracker = false;

  public boolean isJobnameSpecified() {
    return localJobnameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getJobname() {
    return localJobname;
  }

  /**
   * Auto generated setter method
   *
   * @param param Jobname
   */
  public void setJobname(java.lang.String param) {
    localJobnameTracker = param != null;

    this.localJobname = param;
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

  /** field for StateID */
  protected int localStateID;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localStateIDTracker = false;

  public boolean isStateIDSpecified() {
    return localStateIDTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getStateID() {
    return localStateID;
  }

  /**
   * Auto generated setter method
   *
   * @param param StateID
   */
  public void setStateID(int param) {

    // setting primitive attribute tracker to true
    localStateIDTracker = param != java.lang.Integer.MIN_VALUE;

    this.localStateID = param;
  }

  /** field for State */
  protected java.lang.String localState;

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
   * @return java.lang.String
   */
  public java.lang.String getState() {
    return localState;
  }

  /**
   * Auto generated setter method
   *
   * @param param State
   */
  public void setState(java.lang.String param) {
    localStateTracker = param != null;

    this.localState = param;
  }

  /** field for StateEx */
  protected java.lang.String localStateEx;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localStateExTracker = false;

  public boolean isStateExSpecified() {
    return localStateExTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getStateEx() {
    return localStateEx;
  }

  /**
   * Auto generated setter method
   *
   * @param param StateEx
   */
  public void setStateEx(java.lang.String param) {
    localStateExTracker = param != null;

    this.localStateEx = param;
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

  /** field for Protected */
  protected boolean localProtected;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localProtectedTracker = false;

  public boolean isProtectedSpecified() {
    return localProtectedTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getProtected() {
    return localProtected;
  }

  /**
   * Auto generated setter method
   *
   * @param param Protected
   */
  public void setProtected(boolean param) {

    // setting primitive attribute tracker to true
    localProtectedTracker = true;

    this.localProtected = param;
  }

  /** field for Active */
  protected boolean localActive;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localActiveTracker = false;

  public boolean isActiveSpecified() {
    return localActiveTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getActive() {
    return localActive;
  }

  /**
   * Auto generated setter method
   *
   * @param param Active
   */
  public void setActive(boolean param) {

    // setting primitive attribute tracker to true
    localActiveTracker = true;

    this.localActive = param;
  }

  /** field for Action */
  protected int localAction;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localActionTracker = false;

  public boolean isActionSpecified() {
    return localActionTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getAction() {
    return localAction;
  }

  /**
   * Auto generated setter method
   *
   * @param param Action
   */
  public void setAction(int param) {

    // setting primitive attribute tracker to true
    localActionTracker = param != java.lang.Integer.MIN_VALUE;

    this.localAction = param;
  }

  /** field for ActionEx */
  protected java.lang.String localActionEx;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localActionExTracker = false;

  public boolean isActionExSpecified() {
    return localActionExTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getActionEx() {
    return localActionEx;
  }

  /**
   * Auto generated setter method
   *
   * @param param ActionEx
   */
  public void setActionEx(java.lang.String param) {
    localActionExTracker = param != null;

    this.localActionEx = param;
  }

  /** field for DateTimeScheduled */
  protected java.util.Calendar localDateTimeScheduled;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDateTimeScheduledTracker = false;

  public boolean isDateTimeScheduledSpecified() {
    return localDateTimeScheduledTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.util.Calendar
   */
  public java.util.Calendar getDateTimeScheduled() {
    return localDateTimeScheduled;
  }

  /**
   * Auto generated setter method
   *
   * @param param DateTimeScheduled
   */
  public void setDateTimeScheduled(java.util.Calendar param) {
    localDateTimeScheduledTracker = param != null;

    this.localDateTimeScheduled = param;
  }

  /** field for PriorityClass */
  protected int localPriorityClass;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPriorityClassTracker = false;

  public boolean isPriorityClassSpecified() {
    return localPriorityClassTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getPriorityClass() {
    return localPriorityClass;
  }

  /**
   * Auto generated setter method
   *
   * @param param PriorityClass
   */
  public void setPriorityClass(int param) {

    // setting primitive attribute tracker to true
    localPriorityClassTracker = param != java.lang.Integer.MIN_VALUE;

    this.localPriorityClass = param;
  }

  /** field for PriorityLevel */
  protected int localPriorityLevel;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPriorityLevelTracker = false;

  public boolean isPriorityLevelSpecified() {
    return localPriorityLevelTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getPriorityLevel() {
    return localPriorityLevel;
  }

  /**
   * Auto generated setter method
   *
   * @param param PriorityLevel
   */
  public void setPriorityLevel(int param) {

    // setting primitive attribute tracker to true
    localPriorityLevelTracker = param != java.lang.Integer.MIN_VALUE;

    this.localPriorityLevel = param;
  }

  /** field for Scope */
  protected java.lang.String localScope;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localScopeTracker = false;

  public boolean isScopeSpecified() {
    return localScopeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getScope() {
    return localScope;
  }

  /**
   * Auto generated setter method
   *
   * @param param Scope
   */
  public void setScope(java.lang.String param) {
    localScopeTracker = param != null;

    this.localScope = param;
  }

  /** field for Snapshot */
  protected java.lang.String localSnapshot;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSnapshotTracker = false;

  public boolean isSnapshotSpecified() {
    return localSnapshotTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getSnapshot() {
    return localSnapshot;
  }

  /**
   * Auto generated setter method
   *
   * @param param Snapshot
   */
  public void setSnapshot(java.lang.String param) {
    localSnapshotTracker = param != null;

    this.localSnapshot = param;
  }

  /** field for ResultLimit */
  protected int localResultLimit;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localResultLimitTracker = false;

  public boolean isResultLimitSpecified() {
    return localResultLimitTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getResultLimit() {
    return localResultLimit;
  }

  /**
   * Auto generated setter method
   *
   * @param param ResultLimit
   */
  public void setResultLimit(int param) {

    // setting primitive attribute tracker to true
    localResultLimitTracker = param != java.lang.Integer.MIN_VALUE;

    this.localResultLimit = param;
  }

  /** field for Archived */
  protected boolean localArchived;

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

  /** field for IsPausing */
  protected boolean localIsPausing =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localIsPausingTracker = false;

  public boolean isIsPausingSpecified() {
    return localIsPausingTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getIsPausing() {
    return localIsPausing;
  }

  /**
   * Auto generated setter method
   *
   * @param param IsPausing
   */
  public void setIsPausing(boolean param) {

    // setting primitive attribute tracker to true
    localIsPausingTracker = true;

    this.localIsPausing = param;
  }

  /** field for ThorLCR */
  protected boolean localThorLCR =
      org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean("false");

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localThorLCRTracker = false;

  public boolean isThorLCRSpecified() {
    return localThorLCRTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getThorLCR() {
    return localThorLCR;
  }

  /**
   * Auto generated setter method
   *
   * @param param ThorLCR
   */
  public void setThorLCR(boolean param) {

    // setting primitive attribute tracker to true
    localThorLCRTracker = true;

    this.localThorLCR = param;
  }

  /** field for EventSchedule */
  protected int localEventSchedule;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localEventScheduleTracker = false;

  public boolean isEventScheduleSpecified() {
    return localEventScheduleTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getEventSchedule() {
    return localEventSchedule;
  }

  /**
   * Auto generated setter method
   *
   * @param param EventSchedule
   */
  public void setEventSchedule(int param) {

    // setting primitive attribute tracker to true
    localEventScheduleTracker = param != java.lang.Integer.MIN_VALUE;

    this.localEventSchedule = param;
  }

  /** field for HaveSubGraphTimings */
  protected boolean localHaveSubGraphTimings;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localHaveSubGraphTimingsTracker = false;

  public boolean isHaveSubGraphTimingsSpecified() {
    return localHaveSubGraphTimingsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getHaveSubGraphTimings() {
    return localHaveSubGraphTimings;
  }

  /**
   * Auto generated setter method
   *
   * @param param HaveSubGraphTimings
   */
  public void setHaveSubGraphTimings(boolean param) {

    // setting primitive attribute tracker to true
    localHaveSubGraphTimingsTracker = true;

    this.localHaveSubGraphTimings = param;
  }

  /** field for TotalClusterTime */
  protected java.lang.String localTotalClusterTime;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTotalClusterTimeTracker = false;

  public boolean isTotalClusterTimeSpecified() {
    return localTotalClusterTimeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getTotalClusterTime() {
    return localTotalClusterTime;
  }

  /**
   * Auto generated setter method
   *
   * @param param TotalClusterTime
   */
  public void setTotalClusterTime(java.lang.String param) {
    localTotalClusterTimeTracker = param != null;

    this.localTotalClusterTime = param;
  }

  /** field for AbortBy */
  protected java.lang.String localAbortBy;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localAbortByTracker = false;

  public boolean isAbortBySpecified() {
    return localAbortByTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getAbortBy() {
    return localAbortBy;
  }

  /**
   * Auto generated setter method
   *
   * @param param AbortBy
   */
  public void setAbortBy(java.lang.String param) {
    localAbortByTracker = param != null;

    this.localAbortBy = param;
  }

  /** field for AbortTime */
  protected java.lang.String localAbortTime;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localAbortTimeTracker = false;

  public boolean isAbortTimeSpecified() {
    return localAbortTimeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getAbortTime() {
    return localAbortTime;
  }

  /**
   * Auto generated setter method
   *
   * @param param AbortTime
   */
  public void setAbortTime(java.lang.String param) {
    localAbortTimeTracker = param != null;

    this.localAbortTime = param;
  }

  /** field for Query */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ECLQuery localQuery;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localQueryTracker = false;

  public boolean isQuerySpecified() {
    return localQueryTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ECLQuery
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ECLQuery getQuery() {
    return localQuery;
  }

  /**
   * Auto generated setter method
   *
   * @param param Query
   */
  public void setQuery(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ECLQuery param) {
    localQueryTracker = param != null;

    this.localQuery = param;
  }

  /** field for Helpers */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLHelpFile localHelpers;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localHelpersTracker = false;

  public boolean isHelpersSpecified() {
    return localHelpersTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLHelpFile
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLHelpFile getHelpers() {
    return localHelpers;
  }

  /**
   * Auto generated setter method
   *
   * @param param Helpers
   */
  public void setHelpers(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLHelpFile param) {
    localHelpersTracker = param != null;

    this.localHelpers = param;
  }

  /** field for Exceptions */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLException
      localExceptions;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localExceptionsTracker = false;

  public boolean isExceptionsSpecified() {
    return localExceptionsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLException
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLException getExceptions() {
    return localExceptions;
  }

  /**
   * Auto generated setter method
   *
   * @param param Exceptions
   */
  public void setExceptions(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLException param) {
    localExceptionsTracker = param != null;

    this.localExceptions = param;
  }

  /** field for Graphs */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLGraph localGraphs;

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
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLGraph
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLGraph getGraphs() {
    return localGraphs;
  }

  /**
   * Auto generated setter method
   *
   * @param param Graphs
   */
  public void setGraphs(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLGraph param) {
    localGraphsTracker = param != null;

    this.localGraphs = param;
  }

  /** field for SourceFiles */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLSourceFile
      localSourceFiles;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSourceFilesTracker = false;

  public boolean isSourceFilesSpecified() {
    return localSourceFilesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLSourceFile
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLSourceFile
      getSourceFiles() {
    return localSourceFiles;
  }

  /**
   * Auto generated setter method
   *
   * @param param SourceFiles
   */
  public void setSourceFiles(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLSourceFile param) {
    localSourceFilesTracker = param != null;

    this.localSourceFiles = param;
  }

  /** field for Results */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLResult localResults;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localResultsTracker = false;

  public boolean isResultsSpecified() {
    return localResultsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLResult
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLResult getResults() {
    return localResults;
  }

  /**
   * Auto generated setter method
   *
   * @param param Results
   */
  public void setResults(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLResult param) {
    localResultsTracker = param != null;

    this.localResults = param;
  }

  /** field for Variables */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLResult localVariables;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localVariablesTracker = false;

  public boolean isVariablesSpecified() {
    return localVariablesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLResult
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLResult getVariables() {
    return localVariables;
  }

  /**
   * Auto generated setter method
   *
   * @param param Variables
   */
  public void setVariables(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLResult param) {
    localVariablesTracker = param != null;

    this.localVariables = param;
  }

  /** field for Timers */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLTimer localTimers;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTimersTracker = false;

  public boolean isTimersSpecified() {
    return localTimersTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLTimer
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLTimer getTimers() {
    return localTimers;
  }

  /**
   * Auto generated setter method
   *
   * @param param Timers
   */
  public void setTimers(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLTimer param) {
    localTimersTracker = param != null;

    this.localTimers = param;
  }

  /** field for DebugValues */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfDebugValue
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
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfDebugValue
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfDebugValue getDebugValues() {
    return localDebugValues;
  }

  /**
   * Auto generated setter method
   *
   * @param param DebugValues
   */
  public void setDebugValues(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfDebugValue param) {
    localDebugValuesTracker = param != null;

    this.localDebugValues = param;
  }

  /** field for ApplicationValues */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfApplicationValue
      localApplicationValues;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localApplicationValuesTracker = false;

  public boolean isApplicationValuesSpecified() {
    return localApplicationValuesTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfApplicationValue
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfApplicationValue
      getApplicationValues() {
    return localApplicationValues;
  }

  /**
   * Auto generated setter method
   *
   * @param param ApplicationValues
   */
  public void setApplicationValues(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfApplicationValue param) {
    localApplicationValuesTracker = param != null;

    this.localApplicationValues = param;
  }

  /** field for Workflows */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLWorkflow localWorkflows;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localWorkflowsTracker = false;

  public boolean isWorkflowsSpecified() {
    return localWorkflowsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLWorkflow
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLWorkflow getWorkflows() {
    return localWorkflows;
  }

  /**
   * Auto generated setter method
   *
   * @param param Workflows
   */
  public void setWorkflows(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLWorkflow param) {
    localWorkflowsTracker = param != null;

    this.localWorkflows = param;
  }

  /** field for TimingData */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLTimingData
      localTimingData;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTimingDataTracker = false;

  public boolean isTimingDataSpecified() {
    return localTimingDataTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLTimingData
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLTimingData
      getTimingData() {
    return localTimingData;
  }

  /**
   * Auto generated setter method
   *
   * @param param TimingData
   */
  public void setTimingData(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLTimingData param) {
    localTimingDataTracker = param != null;

    this.localTimingData = param;
  }

  /** field for AllowedClusters */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.AllowedClusters_type0
      localAllowedClusters;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localAllowedClustersTracker = false;

  public boolean isAllowedClustersSpecified() {
    return localAllowedClustersTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.AllowedClusters_type0
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.AllowedClusters_type0
      getAllowedClusters() {
    return localAllowedClusters;
  }

  /**
   * Auto generated setter method
   *
   * @param param AllowedClusters
   */
  public void setAllowedClusters(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.AllowedClusters_type0 param) {
    localAllowedClustersTracker = param != null;

    this.localAllowedClusters = param;
  }

  /** field for ErrorCount */
  protected int localErrorCount;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localErrorCountTracker = false;

  public boolean isErrorCountSpecified() {
    return localErrorCountTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getErrorCount() {
    return localErrorCount;
  }

  /**
   * Auto generated setter method
   *
   * @param param ErrorCount
   */
  public void setErrorCount(int param) {

    // setting primitive attribute tracker to true
    localErrorCountTracker = param != java.lang.Integer.MIN_VALUE;

    this.localErrorCount = param;
  }

  /** field for WarningCount */
  protected int localWarningCount;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localWarningCountTracker = false;

  public boolean isWarningCountSpecified() {
    return localWarningCountTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getWarningCount() {
    return localWarningCount;
  }

  /**
   * Auto generated setter method
   *
   * @param param WarningCount
   */
  public void setWarningCount(int param) {

    // setting primitive attribute tracker to true
    localWarningCountTracker = param != java.lang.Integer.MIN_VALUE;

    this.localWarningCount = param;
  }

  /** field for InfoCount */
  protected int localInfoCount;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localInfoCountTracker = false;

  public boolean isInfoCountSpecified() {
    return localInfoCountTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getInfoCount() {
    return localInfoCount;
  }

  /**
   * Auto generated setter method
   *
   * @param param InfoCount
   */
  public void setInfoCount(int param) {

    // setting primitive attribute tracker to true
    localInfoCountTracker = param != java.lang.Integer.MIN_VALUE;

    this.localInfoCount = param;
  }

  /** field for AlertCount */
  protected int localAlertCount;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localAlertCountTracker = false;

  public boolean isAlertCountSpecified() {
    return localAlertCountTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getAlertCount() {
    return localAlertCount;
  }

  /**
   * Auto generated setter method
   *
   * @param param AlertCount
   */
  public void setAlertCount(int param) {

    // setting primitive attribute tracker to true
    localAlertCountTracker = param != java.lang.Integer.MIN_VALUE;

    this.localAlertCount = param;
  }

  /** field for GraphCount */
  protected int localGraphCount;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localGraphCountTracker = false;

  public boolean isGraphCountSpecified() {
    return localGraphCountTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getGraphCount() {
    return localGraphCount;
  }

  /**
   * Auto generated setter method
   *
   * @param param GraphCount
   */
  public void setGraphCount(int param) {

    // setting primitive attribute tracker to true
    localGraphCountTracker = param != java.lang.Integer.MIN_VALUE;

    this.localGraphCount = param;
  }

  /** field for SourceFileCount */
  protected int localSourceFileCount;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSourceFileCountTracker = false;

  public boolean isSourceFileCountSpecified() {
    return localSourceFileCountTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getSourceFileCount() {
    return localSourceFileCount;
  }

  /**
   * Auto generated setter method
   *
   * @param param SourceFileCount
   */
  public void setSourceFileCount(int param) {

    // setting primitive attribute tracker to true
    localSourceFileCountTracker = param != java.lang.Integer.MIN_VALUE;

    this.localSourceFileCount = param;
  }

  /** field for ResultCount */
  protected int localResultCount;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localResultCountTracker = false;

  public boolean isResultCountSpecified() {
    return localResultCountTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getResultCount() {
    return localResultCount;
  }

  /**
   * Auto generated setter method
   *
   * @param param ResultCount
   */
  public void setResultCount(int param) {

    // setting primitive attribute tracker to true
    localResultCountTracker = param != java.lang.Integer.MIN_VALUE;

    this.localResultCount = param;
  }

  /** field for VariableCount */
  protected int localVariableCount;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localVariableCountTracker = false;

  public boolean isVariableCountSpecified() {
    return localVariableCountTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getVariableCount() {
    return localVariableCount;
  }

  /**
   * Auto generated setter method
   *
   * @param param VariableCount
   */
  public void setVariableCount(int param) {

    // setting primitive attribute tracker to true
    localVariableCountTracker = param != java.lang.Integer.MIN_VALUE;

    this.localVariableCount = param;
  }

  /** field for TimerCount */
  protected int localTimerCount;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTimerCountTracker = false;

  public boolean isTimerCountSpecified() {
    return localTimerCountTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getTimerCount() {
    return localTimerCount;
  }

  /**
   * Auto generated setter method
   *
   * @param param TimerCount
   */
  public void setTimerCount(int param) {

    // setting primitive attribute tracker to true
    localTimerCountTracker = param != java.lang.Integer.MIN_VALUE;

    this.localTimerCount = param;
  }

  /** field for HasDebugValue */
  protected boolean localHasDebugValue;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localHasDebugValueTracker = false;

  public boolean isHasDebugValueSpecified() {
    return localHasDebugValueTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getHasDebugValue() {
    return localHasDebugValue;
  }

  /**
   * Auto generated setter method
   *
   * @param param HasDebugValue
   */
  public void setHasDebugValue(boolean param) {

    // setting primitive attribute tracker to true
    localHasDebugValueTracker = true;

    this.localHasDebugValue = param;
  }

  /** field for ApplicationValueCount */
  protected int localApplicationValueCount;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localApplicationValueCountTracker = false;

  public boolean isApplicationValueCountSpecified() {
    return localApplicationValueCountTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getApplicationValueCount() {
    return localApplicationValueCount;
  }

  /**
   * Auto generated setter method
   *
   * @param param ApplicationValueCount
   */
  public void setApplicationValueCount(int param) {

    // setting primitive attribute tracker to true
    localApplicationValueCountTracker = param != java.lang.Integer.MIN_VALUE;

    this.localApplicationValueCount = param;
  }

  /** field for XmlParams */
  protected java.lang.String localXmlParams;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localXmlParamsTracker = false;

  public boolean isXmlParamsSpecified() {
    return localXmlParamsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getXmlParams() {
    return localXmlParams;
  }

  /**
   * Auto generated setter method
   *
   * @param param XmlParams
   */
  public void setXmlParams(java.lang.String param) {
    localXmlParamsTracker = param != null;

    this.localXmlParams = param;
  }

  /** field for AccessFlag */
  protected int localAccessFlag;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localAccessFlagTracker = false;

  public boolean isAccessFlagSpecified() {
    return localAccessFlagTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getAccessFlag() {
    return localAccessFlag;
  }

  /**
   * Auto generated setter method
   *
   * @param param AccessFlag
   */
  public void setAccessFlag(int param) {

    // setting primitive attribute tracker to true
    localAccessFlagTracker = param != java.lang.Integer.MIN_VALUE;

    this.localAccessFlag = param;
  }

  /** field for ClusterFlag */
  protected int localClusterFlag;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localClusterFlagTracker = false;

  public boolean isClusterFlagSpecified() {
    return localClusterFlagTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getClusterFlag() {
    return localClusterFlag;
  }

  /**
   * Auto generated setter method
   *
   * @param param ClusterFlag
   */
  public void setClusterFlag(int param) {

    // setting primitive attribute tracker to true
    localClusterFlagTracker = param != java.lang.Integer.MIN_VALUE;

    this.localClusterFlag = param;
  }

  /** field for HelpersDesc */
  protected java.lang.String localHelpersDesc;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localHelpersDescTracker = false;

  public boolean isHelpersDescSpecified() {
    return localHelpersDescTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getHelpersDesc() {
    return localHelpersDesc;
  }

  /**
   * Auto generated setter method
   *
   * @param param HelpersDesc
   */
  public void setHelpersDesc(java.lang.String param) {
    localHelpersDescTracker = param != null;

    this.localHelpersDesc = param;
  }

  /** field for GraphsDesc */
  protected java.lang.String localGraphsDesc;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localGraphsDescTracker = false;

  public boolean isGraphsDescSpecified() {
    return localGraphsDescTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getGraphsDesc() {
    return localGraphsDesc;
  }

  /**
   * Auto generated setter method
   *
   * @param param GraphsDesc
   */
  public void setGraphsDesc(java.lang.String param) {
    localGraphsDescTracker = param != null;

    this.localGraphsDesc = param;
  }

  /** field for SourceFilesDesc */
  protected java.lang.String localSourceFilesDesc;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSourceFilesDescTracker = false;

  public boolean isSourceFilesDescSpecified() {
    return localSourceFilesDescTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getSourceFilesDesc() {
    return localSourceFilesDesc;
  }

  /**
   * Auto generated setter method
   *
   * @param param SourceFilesDesc
   */
  public void setSourceFilesDesc(java.lang.String param) {
    localSourceFilesDescTracker = param != null;

    this.localSourceFilesDesc = param;
  }

  /** field for ResultsDesc */
  protected java.lang.String localResultsDesc;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localResultsDescTracker = false;

  public boolean isResultsDescSpecified() {
    return localResultsDescTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getResultsDesc() {
    return localResultsDesc;
  }

  /**
   * Auto generated setter method
   *
   * @param param ResultsDesc
   */
  public void setResultsDesc(java.lang.String param) {
    localResultsDescTracker = param != null;

    this.localResultsDesc = param;
  }

  /** field for VariablesDesc */
  protected java.lang.String localVariablesDesc;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localVariablesDescTracker = false;

  public boolean isVariablesDescSpecified() {
    return localVariablesDescTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getVariablesDesc() {
    return localVariablesDesc;
  }

  /**
   * Auto generated setter method
   *
   * @param param VariablesDesc
   */
  public void setVariablesDesc(java.lang.String param) {
    localVariablesDescTracker = param != null;

    this.localVariablesDesc = param;
  }

  /** field for TimersDesc */
  protected java.lang.String localTimersDesc;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTimersDescTracker = false;

  public boolean isTimersDescSpecified() {
    return localTimersDescTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getTimersDesc() {
    return localTimersDesc;
  }

  /**
   * Auto generated setter method
   *
   * @param param TimersDesc
   */
  public void setTimersDesc(java.lang.String param) {
    localTimersDescTracker = param != null;

    this.localTimersDesc = param;
  }

  /** field for DebugValuesDesc */
  protected java.lang.String localDebugValuesDesc;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDebugValuesDescTracker = false;

  public boolean isDebugValuesDescSpecified() {
    return localDebugValuesDescTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getDebugValuesDesc() {
    return localDebugValuesDesc;
  }

  /**
   * Auto generated setter method
   *
   * @param param DebugValuesDesc
   */
  public void setDebugValuesDesc(java.lang.String param) {
    localDebugValuesDescTracker = param != null;

    this.localDebugValuesDesc = param;
  }

  /** field for ApplicationValuesDesc */
  protected java.lang.String localApplicationValuesDesc;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localApplicationValuesDescTracker = false;

  public boolean isApplicationValuesDescSpecified() {
    return localApplicationValuesDescTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getApplicationValuesDesc() {
    return localApplicationValuesDesc;
  }

  /**
   * Auto generated setter method
   *
   * @param param ApplicationValuesDesc
   */
  public void setApplicationValuesDesc(java.lang.String param) {
    localApplicationValuesDescTracker = param != null;

    this.localApplicationValuesDesc = param;
  }

  /** field for WorkflowsDesc */
  protected java.lang.String localWorkflowsDesc;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localWorkflowsDescTracker = false;

  public boolean isWorkflowsDescSpecified() {
    return localWorkflowsDescTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getWorkflowsDesc() {
    return localWorkflowsDesc;
  }

  /**
   * Auto generated setter method
   *
   * @param param WorkflowsDesc
   */
  public void setWorkflowsDesc(java.lang.String param) {
    localWorkflowsDescTracker = param != null;

    this.localWorkflowsDesc = param;
  }

  /** field for HasArchiveQuery */
  protected boolean localHasArchiveQuery;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localHasArchiveQueryTracker = false;

  public boolean isHasArchiveQuerySpecified() {
    return localHasArchiveQueryTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getHasArchiveQuery() {
    return localHasArchiveQuery;
  }

  /**
   * Auto generated setter method
   *
   * @param param HasArchiveQuery
   */
  public void setHasArchiveQuery(boolean param) {

    // setting primitive attribute tracker to true
    localHasArchiveQueryTracker = true;

    this.localHasArchiveQuery = param;
  }

  /** field for ThorLogList */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfThorLogInfo
      localThorLogList;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localThorLogListTracker = false;

  public boolean isThorLogListSpecified() {
    return localThorLogListTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfThorLogInfo
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfThorLogInfo getThorLogList() {
    return localThorLogList;
  }

  /**
   * Auto generated setter method
   *
   * @param param ThorLogList
   */
  public void setThorLogList(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfThorLogInfo param) {
    localThorLogListTracker = param != null;

    this.localThorLogList = param;
  }

  /** field for ResourceURLs */
  protected org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ResourceURLs_type0
      localResourceURLs;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localResourceURLsTracker = false;

  public boolean isResourceURLsSpecified() {
    return localResourceURLsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ResourceURLs_type0
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ResourceURLs_type0
      getResourceURLs() {
    return localResourceURLs;
  }

  /**
   * Auto generated setter method
   *
   * @param param ResourceURLs
   */
  public void setResourceURLs(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ResourceURLs_type0 param) {
    localResourceURLsTracker = param != null;

    this.localResourceURLs = param;
  }

  /** field for ResultViewCount */
  protected int localResultViewCount;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localResultViewCountTracker = false;

  public boolean isResultViewCountSpecified() {
    return localResultViewCountTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getResultViewCount() {
    return localResultViewCount;
  }

  /**
   * Auto generated setter method
   *
   * @param param ResultViewCount
   */
  public void setResultViewCount(int param) {

    // setting primitive attribute tracker to true
    localResultViewCountTracker = param != java.lang.Integer.MIN_VALUE;

    this.localResultViewCount = param;
  }

  /** field for ResourceURLCount */
  protected int localResourceURLCount;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localResourceURLCountTracker = false;

  public boolean isResourceURLCountSpecified() {
    return localResourceURLCountTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getResourceURLCount() {
    return localResourceURLCount;
  }

  /**
   * Auto generated setter method
   *
   * @param param ResourceURLCount
   */
  public void setResourceURLCount(int param) {

    // setting primitive attribute tracker to true
    localResourceURLCountTracker = param != java.lang.Integer.MIN_VALUE;

    this.localResourceURLCount = param;
  }

  /** field for DebugValueCount */
  protected int localDebugValueCount;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDebugValueCountTracker = false;

  public boolean isDebugValueCountSpecified() {
    return localDebugValueCountTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getDebugValueCount() {
    return localDebugValueCount;
  }

  /**
   * Auto generated setter method
   *
   * @param param DebugValueCount
   */
  public void setDebugValueCount(int param) {

    // setting primitive attribute tracker to true
    localDebugValueCountTracker = param != java.lang.Integer.MIN_VALUE;

    this.localDebugValueCount = param;
  }

  /** field for WorkflowCount */
  protected int localWorkflowCount;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localWorkflowCountTracker = false;

  public boolean isWorkflowCountSpecified() {
    return localWorkflowCountTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getWorkflowCount() {
    return localWorkflowCount;
  }

  /**
   * Auto generated setter method
   *
   * @param param WorkflowCount
   */
  public void setWorkflowCount(int param) {

    // setting primitive attribute tracker to true
    localWorkflowCountTracker = param != java.lang.Integer.MIN_VALUE;

    this.localWorkflowCount = param;
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

      java.lang.String namespacePrefix =
          registerPrefix(xmlWriter, "urn:hpccsystems:ws:wsworkunits");
      if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            namespacePrefix + ":ECLWorkunit",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "ECLWorkunit", xmlWriter);
      }
    }
    if (localWuidTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
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
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Owner", xmlWriter);

      if (localOwner == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Owner cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localOwner);
      }

      xmlWriter.writeEndElement();
    }
    if (localClusterTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Cluster", xmlWriter);

      if (localCluster == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Cluster cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localCluster);
      }

      xmlWriter.writeEndElement();
    }
    if (localRoxieClusterTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "RoxieCluster", xmlWriter);

      if (localRoxieCluster == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("RoxieCluster cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localRoxieCluster);
      }

      xmlWriter.writeEndElement();
    }
    if (localJobnameTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Jobname", xmlWriter);

      if (localJobname == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Jobname cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localJobname);
      }

      xmlWriter.writeEndElement();
    }
    if (localQueueTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Queue", xmlWriter);

      if (localQueue == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Queue cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localQueue);
      }

      xmlWriter.writeEndElement();
    }
    if (localStateIDTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "StateID", xmlWriter);

      if (localStateID == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("StateID cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStateID));
      }

      xmlWriter.writeEndElement();
    }
    if (localStateTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "State", xmlWriter);

      if (localState == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("State cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localState);
      }

      xmlWriter.writeEndElement();
    }
    if (localStateExTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "StateEx", xmlWriter);

      if (localStateEx == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("StateEx cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localStateEx);
      }

      xmlWriter.writeEndElement();
    }
    if (localDescriptionTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Description", xmlWriter);

      if (localDescription == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Description cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localDescription);
      }

      xmlWriter.writeEndElement();
    }
    if (localProtectedTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Protected", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("Protected cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localProtected));
      }

      xmlWriter.writeEndElement();
    }
    if (localActiveTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Active", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("Active cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localActive));
      }

      xmlWriter.writeEndElement();
    }
    if (localActionTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Action", xmlWriter);

      if (localAction == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("Action cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAction));
      }

      xmlWriter.writeEndElement();
    }
    if (localActionExTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "ActionEx", xmlWriter);

      if (localActionEx == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ActionEx cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localActionEx);
      }

      xmlWriter.writeEndElement();
    }
    if (localDateTimeScheduledTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "DateTimeScheduled", xmlWriter);

      if (localDateTimeScheduled == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("DateTimeScheduled cannot be null!!");

      } else {

        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localDateTimeScheduled));
      }

      xmlWriter.writeEndElement();
    }
    if (localPriorityClassTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "PriorityClass", xmlWriter);

      if (localPriorityClass == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("PriorityClass cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPriorityClass));
      }

      xmlWriter.writeEndElement();
    }
    if (localPriorityLevelTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "PriorityLevel", xmlWriter);

      if (localPriorityLevel == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("PriorityLevel cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPriorityLevel));
      }

      xmlWriter.writeEndElement();
    }
    if (localScopeTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Scope", xmlWriter);

      if (localScope == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Scope cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localScope);
      }

      xmlWriter.writeEndElement();
    }
    if (localSnapshotTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Snapshot", xmlWriter);

      if (localSnapshot == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Snapshot cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSnapshot);
      }

      xmlWriter.writeEndElement();
    }
    if (localResultLimitTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "ResultLimit", xmlWriter);

      if (localResultLimit == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("ResultLimit cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResultLimit));
      }

      xmlWriter.writeEndElement();
    }
    if (localArchivedTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "Archived", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("Archived cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localArchived));
      }

      xmlWriter.writeEndElement();
    }
    if (localIsPausingTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "IsPausing", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("IsPausing cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localIsPausing));
      }

      xmlWriter.writeEndElement();
    }
    if (localThorLCRTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "ThorLCR", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("ThorLCR cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localThorLCR));
      }

      xmlWriter.writeEndElement();
    }
    if (localEventScheduleTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "EventSchedule", xmlWriter);

      if (localEventSchedule == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("EventSchedule cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEventSchedule));
      }

      xmlWriter.writeEndElement();
    }
    if (localHaveSubGraphTimingsTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "HaveSubGraphTimings", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("HaveSubGraphTimings cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localHaveSubGraphTimings));
      }

      xmlWriter.writeEndElement();
    }
    if (localTotalClusterTimeTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "TotalClusterTime", xmlWriter);

      if (localTotalClusterTime == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("TotalClusterTime cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localTotalClusterTime);
      }

      xmlWriter.writeEndElement();
    }
    if (localAbortByTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "AbortBy", xmlWriter);

      if (localAbortBy == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("AbortBy cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localAbortBy);
      }

      xmlWriter.writeEndElement();
    }
    if (localAbortTimeTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "AbortTime", xmlWriter);

      if (localAbortTime == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("AbortTime cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localAbortTime);
      }

      xmlWriter.writeEndElement();
    }
    if (localQueryTracker) {
      if (localQuery == null) {
        throw new org.apache.axis2.databinding.ADBException("Query cannot be null!!");
      }
      localQuery.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Query"), xmlWriter);
    }
    if (localHelpersTracker) {
      if (localHelpers == null) {
        throw new org.apache.axis2.databinding.ADBException("Helpers cannot be null!!");
      }
      localHelpers.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Helpers"), xmlWriter);
    }
    if (localExceptionsTracker) {
      if (localExceptions == null) {
        throw new org.apache.axis2.databinding.ADBException("Exceptions cannot be null!!");
      }
      localExceptions.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"), xmlWriter);
    }
    if (localGraphsTracker) {
      if (localGraphs == null) {
        throw new org.apache.axis2.databinding.ADBException("Graphs cannot be null!!");
      }
      localGraphs.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Graphs"), xmlWriter);
    }
    if (localSourceFilesTracker) {
      if (localSourceFiles == null) {
        throw new org.apache.axis2.databinding.ADBException("SourceFiles cannot be null!!");
      }
      localSourceFiles.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "SourceFiles"),
          xmlWriter);
    }
    if (localResultsTracker) {
      if (localResults == null) {
        throw new org.apache.axis2.databinding.ADBException("Results cannot be null!!");
      }
      localResults.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Results"), xmlWriter);
    }
    if (localVariablesTracker) {
      if (localVariables == null) {
        throw new org.apache.axis2.databinding.ADBException("Variables cannot be null!!");
      }
      localVariables.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Variables"), xmlWriter);
    }
    if (localTimersTracker) {
      if (localTimers == null) {
        throw new org.apache.axis2.databinding.ADBException("Timers cannot be null!!");
      }
      localTimers.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Timers"), xmlWriter);
    }
    if (localDebugValuesTracker) {
      if (localDebugValues == null) {
        throw new org.apache.axis2.databinding.ADBException("DebugValues cannot be null!!");
      }
      localDebugValues.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DebugValues"),
          xmlWriter);
    }
    if (localApplicationValuesTracker) {
      if (localApplicationValues == null) {
        throw new org.apache.axis2.databinding.ADBException("ApplicationValues cannot be null!!");
      }
      localApplicationValues.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ApplicationValues"),
          xmlWriter);
    }
    if (localWorkflowsTracker) {
      if (localWorkflows == null) {
        throw new org.apache.axis2.databinding.ADBException("Workflows cannot be null!!");
      }
      localWorkflows.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Workflows"), xmlWriter);
    }
    if (localTimingDataTracker) {
      if (localTimingData == null) {
        throw new org.apache.axis2.databinding.ADBException("TimingData cannot be null!!");
      }
      localTimingData.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "TimingData"), xmlWriter);
    }
    if (localAllowedClustersTracker) {
      if (localAllowedClusters == null) {
        throw new org.apache.axis2.databinding.ADBException("AllowedClusters cannot be null!!");
      }
      localAllowedClusters.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "AllowedClusters"),
          xmlWriter);
    }
    if (localErrorCountTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "ErrorCount", xmlWriter);

      if (localErrorCount == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("ErrorCount cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localErrorCount));
      }

      xmlWriter.writeEndElement();
    }
    if (localWarningCountTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "WarningCount", xmlWriter);

      if (localWarningCount == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("WarningCount cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWarningCount));
      }

      xmlWriter.writeEndElement();
    }
    if (localInfoCountTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "InfoCount", xmlWriter);

      if (localInfoCount == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("InfoCount cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localInfoCount));
      }

      xmlWriter.writeEndElement();
    }
    if (localAlertCountTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "AlertCount", xmlWriter);

      if (localAlertCount == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("AlertCount cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAlertCount));
      }

      xmlWriter.writeEndElement();
    }
    if (localGraphCountTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "GraphCount", xmlWriter);

      if (localGraphCount == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("GraphCount cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGraphCount));
      }

      xmlWriter.writeEndElement();
    }
    if (localSourceFileCountTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "SourceFileCount", xmlWriter);

      if (localSourceFileCount == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("SourceFileCount cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSourceFileCount));
      }

      xmlWriter.writeEndElement();
    }
    if (localResultCountTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "ResultCount", xmlWriter);

      if (localResultCount == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("ResultCount cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResultCount));
      }

      xmlWriter.writeEndElement();
    }
    if (localVariableCountTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "VariableCount", xmlWriter);

      if (localVariableCount == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("VariableCount cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVariableCount));
      }

      xmlWriter.writeEndElement();
    }
    if (localTimerCountTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "TimerCount", xmlWriter);

      if (localTimerCount == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("TimerCount cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimerCount));
      }

      xmlWriter.writeEndElement();
    }
    if (localHasDebugValueTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "HasDebugValue", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("HasDebugValue cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHasDebugValue));
      }

      xmlWriter.writeEndElement();
    }
    if (localApplicationValueCountTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "ApplicationValueCount", xmlWriter);

      if (localApplicationValueCount == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException(
            "ApplicationValueCount cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localApplicationValueCount));
      }

      xmlWriter.writeEndElement();
    }
    if (localXmlParamsTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "XmlParams", xmlWriter);

      if (localXmlParams == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("XmlParams cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localXmlParams);
      }

      xmlWriter.writeEndElement();
    }
    if (localAccessFlagTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "AccessFlag", xmlWriter);

      if (localAccessFlag == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("AccessFlag cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAccessFlag));
      }

      xmlWriter.writeEndElement();
    }
    if (localClusterFlagTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "ClusterFlag", xmlWriter);

      if (localClusterFlag == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("ClusterFlag cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localClusterFlag));
      }

      xmlWriter.writeEndElement();
    }
    if (localHelpersDescTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "HelpersDesc", xmlWriter);

      if (localHelpersDesc == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("HelpersDesc cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localHelpersDesc);
      }

      xmlWriter.writeEndElement();
    }
    if (localGraphsDescTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "GraphsDesc", xmlWriter);

      if (localGraphsDesc == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("GraphsDesc cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localGraphsDesc);
      }

      xmlWriter.writeEndElement();
    }
    if (localSourceFilesDescTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "SourceFilesDesc", xmlWriter);

      if (localSourceFilesDesc == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("SourceFilesDesc cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSourceFilesDesc);
      }

      xmlWriter.writeEndElement();
    }
    if (localResultsDescTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "ResultsDesc", xmlWriter);

      if (localResultsDesc == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ResultsDesc cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localResultsDesc);
      }

      xmlWriter.writeEndElement();
    }
    if (localVariablesDescTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "VariablesDesc", xmlWriter);

      if (localVariablesDesc == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("VariablesDesc cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localVariablesDesc);
      }

      xmlWriter.writeEndElement();
    }
    if (localTimersDescTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "TimersDesc", xmlWriter);

      if (localTimersDesc == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("TimersDesc cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localTimersDesc);
      }

      xmlWriter.writeEndElement();
    }
    if (localDebugValuesDescTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "DebugValuesDesc", xmlWriter);

      if (localDebugValuesDesc == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("DebugValuesDesc cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localDebugValuesDesc);
      }

      xmlWriter.writeEndElement();
    }
    if (localApplicationValuesDescTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "ApplicationValuesDesc", xmlWriter);

      if (localApplicationValuesDesc == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException(
            "ApplicationValuesDesc cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localApplicationValuesDesc);
      }

      xmlWriter.writeEndElement();
    }
    if (localWorkflowsDescTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "WorkflowsDesc", xmlWriter);

      if (localWorkflowsDesc == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("WorkflowsDesc cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localWorkflowsDesc);
      }

      xmlWriter.writeEndElement();
    }
    if (localHasArchiveQueryTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "HasArchiveQuery", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("HasArchiveQuery cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHasArchiveQuery));
      }

      xmlWriter.writeEndElement();
    }
    if (localThorLogListTracker) {
      if (localThorLogList == null) {
        throw new org.apache.axis2.databinding.ADBException("ThorLogList cannot be null!!");
      }
      localThorLogList.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ThorLogList"),
          xmlWriter);
    }
    if (localResourceURLsTracker) {
      if (localResourceURLs == null) {
        throw new org.apache.axis2.databinding.ADBException("ResourceURLs cannot be null!!");
      }
      localResourceURLs.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ResourceURLs"),
          xmlWriter);
    }
    if (localResultViewCountTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "ResultViewCount", xmlWriter);

      if (localResultViewCount == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("ResultViewCount cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResultViewCount));
      }

      xmlWriter.writeEndElement();
    }
    if (localResourceURLCountTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "ResourceURLCount", xmlWriter);

      if (localResourceURLCount == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("ResourceURLCount cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localResourceURLCount));
      }

      xmlWriter.writeEndElement();
    }
    if (localDebugValueCountTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "DebugValueCount", xmlWriter);

      if (localDebugValueCount == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("DebugValueCount cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDebugValueCount));
      }

      xmlWriter.writeEndElement();
    }
    if (localWorkflowCountTracker) {
      namespace = "urn:hpccsystems:ws:wsworkunits";
      writeStartElement(null, namespace, "WorkflowCount", xmlWriter);

      if (localWorkflowCount == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("WorkflowCount cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWorkflowCount));
      }

      xmlWriter.writeEndElement();
    }
    xmlWriter.writeEndElement();
  }

  private static java.lang.String generatePrefix(java.lang.String namespace) {
    if (namespace.equals("urn:hpccsystems:ws:wsworkunits")) {
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
    public static ECLWorkunit parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      ECLWorkunit object = new ECLWorkunit();

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

            if (!"ECLWorkunit".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (ECLWorkunit)
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ExtensionMapper
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Wuid")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Owner")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Cluster")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Cluster" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setCluster(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "RoxieCluster")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "RoxieCluster" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setRoxieCluster(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Jobname")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Jobname" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setJobname(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Queue")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "StateID")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "StateID" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setStateID(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "State")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "State" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setState(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "StateEx")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "StateEx" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setStateEx(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Description")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Protected")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Protected" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setProtected(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Active")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Active" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setActive(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Action")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Action" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setAction(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ActionEx")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ActionEx" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setActionEx(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "DateTimeScheduled")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "DateTimeScheduled" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDateTimeScheduled(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PriorityClass")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "PriorityClass" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPriorityClass(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "PriorityLevel")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "PriorityLevel" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPriorityLevel(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Scope")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Scope" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setScope(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Snapshot")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Snapshot" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSnapshot(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ResultLimit")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ResultLimit" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setResultLimit(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Archived")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "IsPausing")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "IsPausing" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setIsPausing(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ThorLCR")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ThorLCR" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setThorLCR(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "EventSchedule")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "EventSchedule" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setEventSchedule(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "HaveSubGraphTimings")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "HaveSubGraphTimings" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setHaveSubGraphTimings(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "TotalClusterTime")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "TotalClusterTime" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setTotalClusterTime(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "AbortBy")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "AbortBy" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setAbortBy(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "AbortTime")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "AbortTime" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setAbortTime(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Query")
                    .equals(reader.getName())) {

              object.setQuery(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ECLQuery.Factory.parse(
                      reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Helpers")
                    .equals(reader.getName())) {

              object.setHelpers(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLHelpFile.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions")
                    .equals(reader.getName())) {

              object.setExceptions(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLException.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Graphs")
                    .equals(reader.getName())) {

              object.setGraphs(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLGraph.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "SourceFiles")
                    .equals(reader.getName())) {

              object.setSourceFiles(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLSourceFile.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Results")
                    .equals(reader.getName())) {

              object.setResults(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLResult.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Variables")
                    .equals(reader.getName())) {

              object.setVariables(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLResult.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Timers")
                    .equals(reader.getName())) {

              object.setTimers(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLTimer.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "DebugValues")
                    .equals(reader.getName())) {

              object.setDebugValues(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfDebugValue.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "ApplicationValues")
                    .equals(reader.getName())) {

              object.setApplicationValues(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfApplicationValue
                      .Factory.parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Workflows")
                    .equals(reader.getName())) {

              object.setWorkflows(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLWorkflow.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "TimingData")
                    .equals(reader.getName())) {

              object.setTimingData(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfECLTimingData.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "AllowedClusters")
                    .equals(reader.getName())) {

              object.setAllowedClusters(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.AllowedClusters_type0
                      .Factory.parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ErrorCount")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ErrorCount" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setErrorCount(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WarningCount")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "WarningCount" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setWarningCount(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "InfoCount")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "InfoCount" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setInfoCount(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "AlertCount")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "AlertCount" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setAlertCount(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "GraphCount")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "GraphCount" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setGraphCount(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "SourceFileCount")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SourceFileCount" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSourceFileCount(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ResultCount")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ResultCount" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setResultCount(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "VariableCount")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "VariableCount" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setVariableCount(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "TimerCount")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "TimerCount" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setTimerCount(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "HasDebugValue")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "HasDebugValue" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setHasDebugValue(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "ApplicationValueCount")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ApplicationValueCount" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setApplicationValueCount(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "XmlParams")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "XmlParams" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setXmlParams(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "AccessFlag")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "AccessFlag" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setAccessFlag(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ClusterFlag")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ClusterFlag" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setClusterFlag(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "HelpersDesc")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "HelpersDesc" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setHelpersDesc(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "GraphsDesc")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "GraphsDesc" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setGraphsDesc(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "SourceFilesDesc")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SourceFilesDesc" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSourceFilesDesc(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ResultsDesc")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ResultsDesc" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setResultsDesc(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "VariablesDesc")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "VariablesDesc" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setVariablesDesc(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "TimersDesc")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "TimersDesc" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setTimersDesc(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "DebugValuesDesc")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "DebugValuesDesc" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDebugValuesDesc(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "ApplicationValuesDesc")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ApplicationValuesDesc" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setApplicationValuesDesc(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WorkflowsDesc")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "WorkflowsDesc" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setWorkflowsDesc(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "HasArchiveQuery")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "HasArchiveQuery" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setHasArchiveQuery(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ThorLogList")
                    .equals(reader.getName())) {

              object.setThorLogList(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ArrayOfThorLogInfo.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ResourceURLs")
                    .equals(reader.getName())) {

              object.setResourceURLs(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ResourceURLs_type0.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "ResultViewCount")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ResultViewCount" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setResultViewCount(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "ResourceURLCount")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ResourceURLCount" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setResourceURLCount(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsworkunits", "DebugValueCount")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "DebugValueCount" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDebugValueCount(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WorkflowCount")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "WorkflowCount" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setWorkflowCount(
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

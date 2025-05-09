/**
 * DFUSearchDataResponse.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:50:10 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39;

/** DFUSearchDataResponse bean class */
@SuppressWarnings({"unchecked", "unused"})
public class DFUSearchDataResponse implements org.apache.axis2.databinding.ADBBean {

  public static final javax.xml.namespace.QName MY_QNAME =
      new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUSearchDataResponse", "ns1");

  /** field for Exceptions */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfEspException localExceptions;

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
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfEspException
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfEspException getExceptions() {
    return localExceptions;
  }

  /**
   * Auto generated setter method
   *
   * @param param Exceptions
   */
  public void setExceptions(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfEspException param) {
    localExceptionsTracker = param != null;

    this.localExceptions = param;
  }

  /** field for OpenLogicalName */
  protected java.lang.String localOpenLogicalName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localOpenLogicalNameTracker = false;

  public boolean isOpenLogicalNameSpecified() {
    return localOpenLogicalNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getOpenLogicalName() {
    return localOpenLogicalName;
  }

  /**
   * Auto generated setter method
   *
   * @param param OpenLogicalName
   */
  public void setOpenLogicalName(java.lang.String param) {
    localOpenLogicalNameTracker = param != null;

    this.localOpenLogicalName = param;
  }

  /** field for LogicalName */
  protected java.lang.String localLogicalName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localLogicalNameTracker = false;

  public boolean isLogicalNameSpecified() {
    return localLogicalNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getLogicalName() {
    return localLogicalName;
  }

  /**
   * Auto generated setter method
   *
   * @param param LogicalName
   */
  public void setLogicalName(java.lang.String param) {
    localLogicalNameTracker = param != null;

    this.localLogicalName = param;
  }

  /** field for ParentName */
  protected java.lang.String localParentName;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localParentNameTracker = false;

  public boolean isParentNameSpecified() {
    return localParentNameTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getParentName() {
    return localParentName;
  }

  /**
   * Auto generated setter method
   *
   * @param param ParentName
   */
  public void setParentName(java.lang.String param) {
    localParentNameTracker = param != null;

    this.localParentName = param;
  }

  /** field for StartIndex */
  protected long localStartIndex;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localStartIndexTracker = false;

  public boolean isStartIndexSpecified() {
    return localStartIndexTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getStartIndex() {
    return localStartIndex;
  }

  /**
   * Auto generated setter method
   *
   * @param param StartIndex
   */
  public void setStartIndex(long param) {

    // setting primitive attribute tracker to true
    localStartIndexTracker = param != java.lang.Long.MIN_VALUE;

    this.localStartIndex = param;
  }

  /** field for EndIndex */
  protected long localEndIndex;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localEndIndexTracker = false;

  public boolean isEndIndexSpecified() {
    return localEndIndexTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getEndIndex() {
    return localEndIndex;
  }

  /**
   * Auto generated setter method
   *
   * @param param EndIndex
   */
  public void setEndIndex(long param) {

    // setting primitive attribute tracker to true
    localEndIndexTracker = param != java.lang.Long.MIN_VALUE;

    this.localEndIndex = param;
  }

  /** field for DFUDataKeyedColumns1 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataKeyedColumns1;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataKeyedColumns1Tracker = false;

  public boolean isDFUDataKeyedColumns1Specified() {
    return localDFUDataKeyedColumns1Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataKeyedColumns1() {
    return localDFUDataKeyedColumns1;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataKeyedColumns1
   */
  public void setDFUDataKeyedColumns1(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataKeyedColumns1Tracker = param != null;

    this.localDFUDataKeyedColumns1 = param;
  }

  /** field for DFUDataKeyedColumns2 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataKeyedColumns2;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataKeyedColumns2Tracker = false;

  public boolean isDFUDataKeyedColumns2Specified() {
    return localDFUDataKeyedColumns2Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataKeyedColumns2() {
    return localDFUDataKeyedColumns2;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataKeyedColumns2
   */
  public void setDFUDataKeyedColumns2(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataKeyedColumns2Tracker = param != null;

    this.localDFUDataKeyedColumns2 = param;
  }

  /** field for DFUDataKeyedColumns3 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataKeyedColumns3;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataKeyedColumns3Tracker = false;

  public boolean isDFUDataKeyedColumns3Specified() {
    return localDFUDataKeyedColumns3Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataKeyedColumns3() {
    return localDFUDataKeyedColumns3;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataKeyedColumns3
   */
  public void setDFUDataKeyedColumns3(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataKeyedColumns3Tracker = param != null;

    this.localDFUDataKeyedColumns3 = param;
  }

  /** field for DFUDataKeyedColumns4 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataKeyedColumns4;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataKeyedColumns4Tracker = false;

  public boolean isDFUDataKeyedColumns4Specified() {
    return localDFUDataKeyedColumns4Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataKeyedColumns4() {
    return localDFUDataKeyedColumns4;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataKeyedColumns4
   */
  public void setDFUDataKeyedColumns4(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataKeyedColumns4Tracker = param != null;

    this.localDFUDataKeyedColumns4 = param;
  }

  /** field for DFUDataKeyedColumns5 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataKeyedColumns5;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataKeyedColumns5Tracker = false;

  public boolean isDFUDataKeyedColumns5Specified() {
    return localDFUDataKeyedColumns5Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataKeyedColumns5() {
    return localDFUDataKeyedColumns5;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataKeyedColumns5
   */
  public void setDFUDataKeyedColumns5(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataKeyedColumns5Tracker = param != null;

    this.localDFUDataKeyedColumns5 = param;
  }

  /** field for DFUDataKeyedColumns6 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataKeyedColumns6;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataKeyedColumns6Tracker = false;

  public boolean isDFUDataKeyedColumns6Specified() {
    return localDFUDataKeyedColumns6Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataKeyedColumns6() {
    return localDFUDataKeyedColumns6;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataKeyedColumns6
   */
  public void setDFUDataKeyedColumns6(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataKeyedColumns6Tracker = param != null;

    this.localDFUDataKeyedColumns6 = param;
  }

  /** field for DFUDataKeyedColumns7 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataKeyedColumns7;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataKeyedColumns7Tracker = false;

  public boolean isDFUDataKeyedColumns7Specified() {
    return localDFUDataKeyedColumns7Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataKeyedColumns7() {
    return localDFUDataKeyedColumns7;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataKeyedColumns7
   */
  public void setDFUDataKeyedColumns7(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataKeyedColumns7Tracker = param != null;

    this.localDFUDataKeyedColumns7 = param;
  }

  /** field for DFUDataKeyedColumns8 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataKeyedColumns8;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataKeyedColumns8Tracker = false;

  public boolean isDFUDataKeyedColumns8Specified() {
    return localDFUDataKeyedColumns8Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataKeyedColumns8() {
    return localDFUDataKeyedColumns8;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataKeyedColumns8
   */
  public void setDFUDataKeyedColumns8(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataKeyedColumns8Tracker = param != null;

    this.localDFUDataKeyedColumns8 = param;
  }

  /** field for DFUDataKeyedColumns9 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataKeyedColumns9;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataKeyedColumns9Tracker = false;

  public boolean isDFUDataKeyedColumns9Specified() {
    return localDFUDataKeyedColumns9Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataKeyedColumns9() {
    return localDFUDataKeyedColumns9;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataKeyedColumns9
   */
  public void setDFUDataKeyedColumns9(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataKeyedColumns9Tracker = param != null;

    this.localDFUDataKeyedColumns9 = param;
  }

  /** field for DFUDataKeyedColumns10 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataKeyedColumns10;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataKeyedColumns10Tracker = false;

  public boolean isDFUDataKeyedColumns10Specified() {
    return localDFUDataKeyedColumns10Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataKeyedColumns10() {
    return localDFUDataKeyedColumns10;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataKeyedColumns10
   */
  public void setDFUDataKeyedColumns10(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataKeyedColumns10Tracker = param != null;

    this.localDFUDataKeyedColumns10 = param;
  }

  /** field for DFUDataKeyedColumns11 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataKeyedColumns11;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataKeyedColumns11Tracker = false;

  public boolean isDFUDataKeyedColumns11Specified() {
    return localDFUDataKeyedColumns11Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataKeyedColumns11() {
    return localDFUDataKeyedColumns11;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataKeyedColumns11
   */
  public void setDFUDataKeyedColumns11(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataKeyedColumns11Tracker = param != null;

    this.localDFUDataKeyedColumns11 = param;
  }

  /** field for DFUDataKeyedColumns12 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataKeyedColumns12;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataKeyedColumns12Tracker = false;

  public boolean isDFUDataKeyedColumns12Specified() {
    return localDFUDataKeyedColumns12Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataKeyedColumns12() {
    return localDFUDataKeyedColumns12;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataKeyedColumns12
   */
  public void setDFUDataKeyedColumns12(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataKeyedColumns12Tracker = param != null;

    this.localDFUDataKeyedColumns12 = param;
  }

  /** field for DFUDataKeyedColumns13 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataKeyedColumns13;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataKeyedColumns13Tracker = false;

  public boolean isDFUDataKeyedColumns13Specified() {
    return localDFUDataKeyedColumns13Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataKeyedColumns13() {
    return localDFUDataKeyedColumns13;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataKeyedColumns13
   */
  public void setDFUDataKeyedColumns13(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataKeyedColumns13Tracker = param != null;

    this.localDFUDataKeyedColumns13 = param;
  }

  /** field for DFUDataKeyedColumns14 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataKeyedColumns14;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataKeyedColumns14Tracker = false;

  public boolean isDFUDataKeyedColumns14Specified() {
    return localDFUDataKeyedColumns14Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataKeyedColumns14() {
    return localDFUDataKeyedColumns14;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataKeyedColumns14
   */
  public void setDFUDataKeyedColumns14(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataKeyedColumns14Tracker = param != null;

    this.localDFUDataKeyedColumns14 = param;
  }

  /** field for DFUDataKeyedColumns15 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataKeyedColumns15;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataKeyedColumns15Tracker = false;

  public boolean isDFUDataKeyedColumns15Specified() {
    return localDFUDataKeyedColumns15Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataKeyedColumns15() {
    return localDFUDataKeyedColumns15;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataKeyedColumns15
   */
  public void setDFUDataKeyedColumns15(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataKeyedColumns15Tracker = param != null;

    this.localDFUDataKeyedColumns15 = param;
  }

  /** field for DFUDataKeyedColumns16 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataKeyedColumns16;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataKeyedColumns16Tracker = false;

  public boolean isDFUDataKeyedColumns16Specified() {
    return localDFUDataKeyedColumns16Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataKeyedColumns16() {
    return localDFUDataKeyedColumns16;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataKeyedColumns16
   */
  public void setDFUDataKeyedColumns16(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataKeyedColumns16Tracker = param != null;

    this.localDFUDataKeyedColumns16 = param;
  }

  /** field for DFUDataKeyedColumns17 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataKeyedColumns17;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataKeyedColumns17Tracker = false;

  public boolean isDFUDataKeyedColumns17Specified() {
    return localDFUDataKeyedColumns17Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataKeyedColumns17() {
    return localDFUDataKeyedColumns17;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataKeyedColumns17
   */
  public void setDFUDataKeyedColumns17(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataKeyedColumns17Tracker = param != null;

    this.localDFUDataKeyedColumns17 = param;
  }

  /** field for DFUDataKeyedColumns18 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataKeyedColumns18;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataKeyedColumns18Tracker = false;

  public boolean isDFUDataKeyedColumns18Specified() {
    return localDFUDataKeyedColumns18Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataKeyedColumns18() {
    return localDFUDataKeyedColumns18;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataKeyedColumns18
   */
  public void setDFUDataKeyedColumns18(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataKeyedColumns18Tracker = param != null;

    this.localDFUDataKeyedColumns18 = param;
  }

  /** field for DFUDataKeyedColumns19 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataKeyedColumns19;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataKeyedColumns19Tracker = false;

  public boolean isDFUDataKeyedColumns19Specified() {
    return localDFUDataKeyedColumns19Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataKeyedColumns19() {
    return localDFUDataKeyedColumns19;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataKeyedColumns19
   */
  public void setDFUDataKeyedColumns19(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataKeyedColumns19Tracker = param != null;

    this.localDFUDataKeyedColumns19 = param;
  }

  /** field for DFUDataKeyedColumns20 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataKeyedColumns20;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataKeyedColumns20Tracker = false;

  public boolean isDFUDataKeyedColumns20Specified() {
    return localDFUDataKeyedColumns20Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataKeyedColumns20() {
    return localDFUDataKeyedColumns20;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataKeyedColumns20
   */
  public void setDFUDataKeyedColumns20(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataKeyedColumns20Tracker = param != null;

    this.localDFUDataKeyedColumns20 = param;
  }

  /** field for DFUDataNonKeyedColumns1 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataNonKeyedColumns1;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataNonKeyedColumns1Tracker = false;

  public boolean isDFUDataNonKeyedColumns1Specified() {
    return localDFUDataNonKeyedColumns1Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataNonKeyedColumns1() {
    return localDFUDataNonKeyedColumns1;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataNonKeyedColumns1
   */
  public void setDFUDataNonKeyedColumns1(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataNonKeyedColumns1Tracker = param != null;

    this.localDFUDataNonKeyedColumns1 = param;
  }

  /** field for DFUDataNonKeyedColumns2 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataNonKeyedColumns2;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataNonKeyedColumns2Tracker = false;

  public boolean isDFUDataNonKeyedColumns2Specified() {
    return localDFUDataNonKeyedColumns2Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataNonKeyedColumns2() {
    return localDFUDataNonKeyedColumns2;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataNonKeyedColumns2
   */
  public void setDFUDataNonKeyedColumns2(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataNonKeyedColumns2Tracker = param != null;

    this.localDFUDataNonKeyedColumns2 = param;
  }

  /** field for DFUDataNonKeyedColumns3 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataNonKeyedColumns3;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataNonKeyedColumns3Tracker = false;

  public boolean isDFUDataNonKeyedColumns3Specified() {
    return localDFUDataNonKeyedColumns3Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataNonKeyedColumns3() {
    return localDFUDataNonKeyedColumns3;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataNonKeyedColumns3
   */
  public void setDFUDataNonKeyedColumns3(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataNonKeyedColumns3Tracker = param != null;

    this.localDFUDataNonKeyedColumns3 = param;
  }

  /** field for DFUDataNonKeyedColumns4 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataNonKeyedColumns4;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataNonKeyedColumns4Tracker = false;

  public boolean isDFUDataNonKeyedColumns4Specified() {
    return localDFUDataNonKeyedColumns4Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataNonKeyedColumns4() {
    return localDFUDataNonKeyedColumns4;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataNonKeyedColumns4
   */
  public void setDFUDataNonKeyedColumns4(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataNonKeyedColumns4Tracker = param != null;

    this.localDFUDataNonKeyedColumns4 = param;
  }

  /** field for DFUDataNonKeyedColumns5 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataNonKeyedColumns5;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataNonKeyedColumns5Tracker = false;

  public boolean isDFUDataNonKeyedColumns5Specified() {
    return localDFUDataNonKeyedColumns5Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataNonKeyedColumns5() {
    return localDFUDataNonKeyedColumns5;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataNonKeyedColumns5
   */
  public void setDFUDataNonKeyedColumns5(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataNonKeyedColumns5Tracker = param != null;

    this.localDFUDataNonKeyedColumns5 = param;
  }

  /** field for DFUDataNonKeyedColumns6 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataNonKeyedColumns6;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataNonKeyedColumns6Tracker = false;

  public boolean isDFUDataNonKeyedColumns6Specified() {
    return localDFUDataNonKeyedColumns6Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataNonKeyedColumns6() {
    return localDFUDataNonKeyedColumns6;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataNonKeyedColumns6
   */
  public void setDFUDataNonKeyedColumns6(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataNonKeyedColumns6Tracker = param != null;

    this.localDFUDataNonKeyedColumns6 = param;
  }

  /** field for DFUDataNonKeyedColumns7 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataNonKeyedColumns7;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataNonKeyedColumns7Tracker = false;

  public boolean isDFUDataNonKeyedColumns7Specified() {
    return localDFUDataNonKeyedColumns7Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataNonKeyedColumns7() {
    return localDFUDataNonKeyedColumns7;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataNonKeyedColumns7
   */
  public void setDFUDataNonKeyedColumns7(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataNonKeyedColumns7Tracker = param != null;

    this.localDFUDataNonKeyedColumns7 = param;
  }

  /** field for DFUDataNonKeyedColumns8 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataNonKeyedColumns8;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataNonKeyedColumns8Tracker = false;

  public boolean isDFUDataNonKeyedColumns8Specified() {
    return localDFUDataNonKeyedColumns8Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataNonKeyedColumns8() {
    return localDFUDataNonKeyedColumns8;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataNonKeyedColumns8
   */
  public void setDFUDataNonKeyedColumns8(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataNonKeyedColumns8Tracker = param != null;

    this.localDFUDataNonKeyedColumns8 = param;
  }

  /** field for DFUDataNonKeyedColumns9 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataNonKeyedColumns9;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataNonKeyedColumns9Tracker = false;

  public boolean isDFUDataNonKeyedColumns9Specified() {
    return localDFUDataNonKeyedColumns9Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataNonKeyedColumns9() {
    return localDFUDataNonKeyedColumns9;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataNonKeyedColumns9
   */
  public void setDFUDataNonKeyedColumns9(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataNonKeyedColumns9Tracker = param != null;

    this.localDFUDataNonKeyedColumns9 = param;
  }

  /** field for DFUDataNonKeyedColumns10 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataNonKeyedColumns10;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataNonKeyedColumns10Tracker = false;

  public boolean isDFUDataNonKeyedColumns10Specified() {
    return localDFUDataNonKeyedColumns10Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataNonKeyedColumns10() {
    return localDFUDataNonKeyedColumns10;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataNonKeyedColumns10
   */
  public void setDFUDataNonKeyedColumns10(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataNonKeyedColumns10Tracker = param != null;

    this.localDFUDataNonKeyedColumns10 = param;
  }

  /** field for DFUDataNonKeyedColumns11 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataNonKeyedColumns11;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataNonKeyedColumns11Tracker = false;

  public boolean isDFUDataNonKeyedColumns11Specified() {
    return localDFUDataNonKeyedColumns11Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataNonKeyedColumns11() {
    return localDFUDataNonKeyedColumns11;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataNonKeyedColumns11
   */
  public void setDFUDataNonKeyedColumns11(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataNonKeyedColumns11Tracker = param != null;

    this.localDFUDataNonKeyedColumns11 = param;
  }

  /** field for DFUDataNonKeyedColumns12 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataNonKeyedColumns12;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataNonKeyedColumns12Tracker = false;

  public boolean isDFUDataNonKeyedColumns12Specified() {
    return localDFUDataNonKeyedColumns12Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataNonKeyedColumns12() {
    return localDFUDataNonKeyedColumns12;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataNonKeyedColumns12
   */
  public void setDFUDataNonKeyedColumns12(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataNonKeyedColumns12Tracker = param != null;

    this.localDFUDataNonKeyedColumns12 = param;
  }

  /** field for DFUDataNonKeyedColumns13 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataNonKeyedColumns13;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataNonKeyedColumns13Tracker = false;

  public boolean isDFUDataNonKeyedColumns13Specified() {
    return localDFUDataNonKeyedColumns13Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataNonKeyedColumns13() {
    return localDFUDataNonKeyedColumns13;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataNonKeyedColumns13
   */
  public void setDFUDataNonKeyedColumns13(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataNonKeyedColumns13Tracker = param != null;

    this.localDFUDataNonKeyedColumns13 = param;
  }

  /** field for DFUDataNonKeyedColumns14 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataNonKeyedColumns14;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataNonKeyedColumns14Tracker = false;

  public boolean isDFUDataNonKeyedColumns14Specified() {
    return localDFUDataNonKeyedColumns14Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataNonKeyedColumns14() {
    return localDFUDataNonKeyedColumns14;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataNonKeyedColumns14
   */
  public void setDFUDataNonKeyedColumns14(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataNonKeyedColumns14Tracker = param != null;

    this.localDFUDataNonKeyedColumns14 = param;
  }

  /** field for DFUDataNonKeyedColumns15 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataNonKeyedColumns15;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataNonKeyedColumns15Tracker = false;

  public boolean isDFUDataNonKeyedColumns15Specified() {
    return localDFUDataNonKeyedColumns15Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataNonKeyedColumns15() {
    return localDFUDataNonKeyedColumns15;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataNonKeyedColumns15
   */
  public void setDFUDataNonKeyedColumns15(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataNonKeyedColumns15Tracker = param != null;

    this.localDFUDataNonKeyedColumns15 = param;
  }

  /** field for DFUDataNonKeyedColumns16 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataNonKeyedColumns16;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataNonKeyedColumns16Tracker = false;

  public boolean isDFUDataNonKeyedColumns16Specified() {
    return localDFUDataNonKeyedColumns16Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataNonKeyedColumns16() {
    return localDFUDataNonKeyedColumns16;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataNonKeyedColumns16
   */
  public void setDFUDataNonKeyedColumns16(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataNonKeyedColumns16Tracker = param != null;

    this.localDFUDataNonKeyedColumns16 = param;
  }

  /** field for DFUDataNonKeyedColumns17 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataNonKeyedColumns17;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataNonKeyedColumns17Tracker = false;

  public boolean isDFUDataNonKeyedColumns17Specified() {
    return localDFUDataNonKeyedColumns17Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataNonKeyedColumns17() {
    return localDFUDataNonKeyedColumns17;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataNonKeyedColumns17
   */
  public void setDFUDataNonKeyedColumns17(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataNonKeyedColumns17Tracker = param != null;

    this.localDFUDataNonKeyedColumns17 = param;
  }

  /** field for DFUDataNonKeyedColumns18 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataNonKeyedColumns18;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataNonKeyedColumns18Tracker = false;

  public boolean isDFUDataNonKeyedColumns18Specified() {
    return localDFUDataNonKeyedColumns18Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataNonKeyedColumns18() {
    return localDFUDataNonKeyedColumns18;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataNonKeyedColumns18
   */
  public void setDFUDataNonKeyedColumns18(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataNonKeyedColumns18Tracker = param != null;

    this.localDFUDataNonKeyedColumns18 = param;
  }

  /** field for DFUDataNonKeyedColumns19 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataNonKeyedColumns19;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataNonKeyedColumns19Tracker = false;

  public boolean isDFUDataNonKeyedColumns19Specified() {
    return localDFUDataNonKeyedColumns19Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataNonKeyedColumns19() {
    return localDFUDataNonKeyedColumns19;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataNonKeyedColumns19
   */
  public void setDFUDataNonKeyedColumns19(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataNonKeyedColumns19Tracker = param != null;

    this.localDFUDataNonKeyedColumns19 = param;
  }

  /** field for DFUDataNonKeyedColumns20 */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      localDFUDataNonKeyedColumns20;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDFUDataNonKeyedColumns20Tracker = false;

  public boolean isDFUDataNonKeyedColumns20Specified() {
    return localDFUDataNonKeyedColumns20Tracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn
      getDFUDataNonKeyedColumns20() {
    return localDFUDataNonKeyedColumns20;
  }

  /**
   * Auto generated setter method
   *
   * @param param DFUDataNonKeyedColumns20
   */
  public void setDFUDataNonKeyedColumns20(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn param) {
    localDFUDataNonKeyedColumns20Tracker = param != null;

    this.localDFUDataNonKeyedColumns20 = param;
  }

  /** field for RowCount */
  protected long localRowCount;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localRowCountTracker = false;

  public boolean isRowCountSpecified() {
    return localRowCountTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getRowCount() {
    return localRowCount;
  }

  /**
   * Auto generated setter method
   *
   * @param param RowCount
   */
  public void setRowCount(long param) {

    // setting primitive attribute tracker to true
    localRowCountTracker = param != java.lang.Long.MIN_VALUE;

    this.localRowCount = param;
  }

  /** field for ShowColumns */
  protected java.lang.String localShowColumns;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localShowColumnsTracker = false;

  public boolean isShowColumnsSpecified() {
    return localShowColumnsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getShowColumns() {
    return localShowColumns;
  }

  /**
   * Auto generated setter method
   *
   * @param param ShowColumns
   */
  public void setShowColumns(java.lang.String param) {
    localShowColumnsTracker = param != null;

    this.localShowColumns = param;
  }

  /** field for ChooseFile */
  protected int localChooseFile;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localChooseFileTracker = false;

  public boolean isChooseFileSpecified() {
    return localChooseFileTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getChooseFile() {
    return localChooseFile;
  }

  /**
   * Auto generated setter method
   *
   * @param param ChooseFile
   */
  public void setChooseFile(int param) {

    // setting primitive attribute tracker to true
    localChooseFileTracker = param != java.lang.Integer.MIN_VALUE;

    this.localChooseFile = param;
  }

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

  /** field for FilterBy */
  protected java.lang.String localFilterBy;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localFilterByTracker = false;

  public boolean isFilterBySpecified() {
    return localFilterByTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getFilterBy() {
    return localFilterBy;
  }

  /**
   * Auto generated setter method
   *
   * @param param FilterBy
   */
  public void setFilterBy(java.lang.String param) {
    localFilterByTracker = param != null;

    this.localFilterBy = param;
  }

  /** field for FilterForGoBack */
  protected java.lang.String localFilterForGoBack;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localFilterForGoBackTracker = false;

  public boolean isFilterForGoBackSpecified() {
    return localFilterForGoBackTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getFilterForGoBack() {
    return localFilterForGoBack;
  }

  /**
   * Auto generated setter method
   *
   * @param param FilterForGoBack
   */
  public void setFilterForGoBack(java.lang.String param) {
    localFilterForGoBackTracker = param != null;

    this.localFilterForGoBack = param;
  }

  /** field for ColumnsHidden */
  protected org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ColumnsHidden_type1 localColumnsHidden;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localColumnsHiddenTracker = false;

  public boolean isColumnsHiddenSpecified() {
    return localColumnsHiddenTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ColumnsHidden_type1
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ColumnsHidden_type1 getColumnsHidden() {
    return localColumnsHidden;
  }

  /**
   * Auto generated setter method
   *
   * @param param ColumnsHidden
   */
  public void setColumnsHidden(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ColumnsHidden_type1 param) {
    localColumnsHiddenTracker = param != null;

    this.localColumnsHidden = param;
  }

  /** field for ColumnCount */
  protected int localColumnCount;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localColumnCountTracker = false;

  public boolean isColumnCountSpecified() {
    return localColumnCountTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getColumnCount() {
    return localColumnCount;
  }

  /**
   * Auto generated setter method
   *
   * @param param ColumnCount
   */
  public void setColumnCount(int param) {

    // setting primitive attribute tracker to true
    localColumnCountTracker = param != java.lang.Integer.MIN_VALUE;

    this.localColumnCount = param;
  }

  /** field for StartForGoback */
  protected long localStartForGoback;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localStartForGobackTracker = false;

  public boolean isStartForGobackSpecified() {
    return localStartForGobackTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getStartForGoback() {
    return localStartForGoback;
  }

  /**
   * Auto generated setter method
   *
   * @param param StartForGoback
   */
  public void setStartForGoback(long param) {

    // setting primitive attribute tracker to true
    localStartForGobackTracker = param != java.lang.Long.MIN_VALUE;

    this.localStartForGoback = param;
  }

  /** field for CountForGoback */
  protected int localCountForGoback;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localCountForGobackTracker = false;

  public boolean isCountForGobackSpecified() {
    return localCountForGobackTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return int
   */
  public int getCountForGoback() {
    return localCountForGoback;
  }

  /**
   * Auto generated setter method
   *
   * @param param CountForGoback
   */
  public void setCountForGoback(int param) {

    // setting primitive attribute tracker to true
    localCountForGobackTracker = param != java.lang.Integer.MIN_VALUE;

    this.localCountForGoback = param;
  }

  /** field for Start */
  protected long localStart;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localStartTracker = false;

  public boolean isStartSpecified() {
    return localStartTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getStart() {
    return localStart;
  }

  /**
   * Auto generated setter method
   *
   * @param param Start
   */
  public void setStart(long param) {

    // setting primitive attribute tracker to true
    localStartTracker = param != java.lang.Long.MIN_VALUE;

    this.localStart = param;
  }

  /** field for Count */
  protected long localCount;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localCountTracker = false;

  public boolean isCountSpecified() {
    return localCountTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getCount() {
    return localCount;
  }

  /**
   * Auto generated setter method
   *
   * @param param Count
   */
  public void setCount(long param) {

    // setting primitive attribute tracker to true
    localCountTracker = param != java.lang.Long.MIN_VALUE;

    this.localCount = param;
  }

  /** field for PageSize */
  protected long localPageSize;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localPageSizeTracker = false;

  public boolean isPageSizeSpecified() {
    return localPageSizeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getPageSize() {
    return localPageSize;
  }

  /**
   * Auto generated setter method
   *
   * @param param PageSize
   */
  public void setPageSize(long param) {

    // setting primitive attribute tracker to true
    localPageSizeTracker = param != java.lang.Long.MIN_VALUE;

    this.localPageSize = param;
  }

  /** field for Total */
  protected long localTotal;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localTotalTracker = false;

  public boolean isTotalSpecified() {
    return localTotalTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return long
   */
  public long getTotal() {
    return localTotal;
  }

  /**
   * Auto generated setter method
   *
   * @param param Total
   */
  public void setTotal(long param) {

    // setting primitive attribute tracker to true
    localTotalTracker = param != java.lang.Long.MIN_VALUE;

    this.localTotal = param;
  }

  /** field for Result */
  protected java.lang.String localResult;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localResultTracker = false;

  public boolean isResultSpecified() {
    return localResultTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getResult() {
    return localResult;
  }

  /**
   * Auto generated setter method
   *
   * @param param Result
   */
  public void setResult(java.lang.String param) {
    localResultTracker = param != null;

    this.localResult = param;
  }

  /** field for MsgToDisplay */
  protected java.lang.String localMsgToDisplay;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localMsgToDisplayTracker = false;

  public boolean isMsgToDisplaySpecified() {
    return localMsgToDisplayTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getMsgToDisplay() {
    return localMsgToDisplay;
  }

  /**
   * Auto generated setter method
   *
   * @param param MsgToDisplay
   */
  public void setMsgToDisplay(java.lang.String param) {
    localMsgToDisplayTracker = param != null;

    this.localMsgToDisplay = param;
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

  /** field for ClusterType */
  protected java.lang.String localClusterType;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localClusterTypeTracker = false;

  public boolean isClusterTypeSpecified() {
    return localClusterTypeTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getClusterType() {
    return localClusterType;
  }

  /**
   * Auto generated setter method
   *
   * @param param ClusterType
   */
  public void setClusterType(java.lang.String param) {
    localClusterTypeTracker = param != null;

    this.localClusterType = param;
  }

  /** field for File */
  protected java.lang.String localFile;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localFileTracker = false;

  public boolean isFileSpecified() {
    return localFileTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getFile() {
    return localFile;
  }

  /**
   * Auto generated setter method
   *
   * @param param File
   */
  public void setFile(java.lang.String param) {
    localFileTracker = param != null;

    this.localFile = param;
  }

  /** field for Key */
  protected java.lang.String localKey;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localKeyTracker = false;

  public boolean isKeySpecified() {
    return localKeyTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getKey() {
    return localKey;
  }

  /**
   * Auto generated setter method
   *
   * @param param Key
   */
  public void setKey(java.lang.String param) {
    localKeyTracker = param != null;

    this.localKey = param;
  }

  /** field for SchemaOnly */
  protected boolean localSchemaOnly;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSchemaOnlyTracker = false;

  public boolean isSchemaOnlySpecified() {
    return localSchemaOnlyTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getSchemaOnly() {
    return localSchemaOnly;
  }

  /**
   * Auto generated setter method
   *
   * @param param SchemaOnly
   */
  public void setSchemaOnly(boolean param) {

    // setting primitive attribute tracker to true
    localSchemaOnlyTracker = true;

    this.localSchemaOnly = param;
  }

  /** field for RoxieSelections */
  protected boolean localRoxieSelections;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localRoxieSelectionsTracker = false;

  public boolean isRoxieSelectionsSpecified() {
    return localRoxieSelectionsTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getRoxieSelections() {
    return localRoxieSelections;
  }

  /**
   * Auto generated setter method
   *
   * @param param RoxieSelections
   */
  public void setRoxieSelections(boolean param) {

    // setting primitive attribute tracker to true
    localRoxieSelectionsTracker = true;

    this.localRoxieSelections = param;
  }

  /** field for DisableUppercaseTranslation */
  protected boolean localDisableUppercaseTranslation;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localDisableUppercaseTranslationTracker = false;

  public boolean isDisableUppercaseTranslationSpecified() {
    return localDisableUppercaseTranslationTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getDisableUppercaseTranslation() {
    return localDisableUppercaseTranslation;
  }

  /**
   * Auto generated setter method
   *
   * @param param DisableUppercaseTranslation
   */
  public void setDisableUppercaseTranslation(boolean param) {

    // setting primitive attribute tracker to true
    localDisableUppercaseTranslationTracker = true;

    this.localDisableUppercaseTranslation = param;
  }

  /** field for AutoUppercaseTranslation */
  protected boolean localAutoUppercaseTranslation;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localAutoUppercaseTranslationTracker = false;

  public boolean isAutoUppercaseTranslationSpecified() {
    return localAutoUppercaseTranslationTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return boolean
   */
  public boolean getAutoUppercaseTranslation() {
    return localAutoUppercaseTranslation;
  }

  /**
   * Auto generated setter method
   *
   * @param param AutoUppercaseTranslation
   */
  public void setAutoUppercaseTranslation(boolean param) {

    // setting primitive attribute tracker to true
    localAutoUppercaseTranslationTracker = true;

    this.localAutoUppercaseTranslation = param;
  }

  /** field for SelectedKey */
  protected java.lang.String localSelectedKey;

  /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
   *   in the serialized XML
   */
  protected boolean localSelectedKeyTracker = false;

  public boolean isSelectedKeySpecified() {
    return localSelectedKeyTracker;
  }

  /**
   * Auto generated getter method
   *
   * @return java.lang.String
   */
  public java.lang.String getSelectedKey() {
    return localSelectedKey;
  }

  /**
   * Auto generated setter method
   *
   * @param param SelectedKey
   */
  public void setSelectedKey(java.lang.String param) {
    localSelectedKeyTracker = param != null;

    this.localSelectedKey = param;
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

      java.lang.String namespacePrefix = registerPrefix(xmlWriter, "urn:hpccsystems:ws:wsdfu");
      if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            namespacePrefix + ":DFUSearchDataResponse",
            xmlWriter);
      } else {
        writeAttribute(
            "xsi",
            "http://www.w3.org/2001/XMLSchema-instance",
            "type",
            "DFUSearchDataResponse",
            xmlWriter);
      }
    }
    if (localExceptionsTracker) {
      if (localExceptions == null) {
        throw new org.apache.axis2.databinding.ADBException("Exceptions cannot be null!!");
      }
      localExceptions.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"), xmlWriter);
    }
    if (localOpenLogicalNameTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "OpenLogicalName", xmlWriter);

      if (localOpenLogicalName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("OpenLogicalName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localOpenLogicalName);
      }

      xmlWriter.writeEndElement();
    }
    if (localLogicalNameTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "LogicalName", xmlWriter);

      if (localLogicalName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("LogicalName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localLogicalName);
      }

      xmlWriter.writeEndElement();
    }
    if (localParentNameTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "ParentName", xmlWriter);

      if (localParentName == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ParentName cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localParentName);
      }

      xmlWriter.writeEndElement();
    }
    if (localStartIndexTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "StartIndex", xmlWriter);

      if (localStartIndex == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("StartIndex cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartIndex));
      }

      xmlWriter.writeEndElement();
    }
    if (localEndIndexTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "EndIndex", xmlWriter);

      if (localEndIndex == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("EndIndex cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localEndIndex));
      }

      xmlWriter.writeEndElement();
    }
    if (localDFUDataKeyedColumns1Tracker) {
      if (localDFUDataKeyedColumns1 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataKeyedColumns1 cannot be null!!");
      }
      localDFUDataKeyedColumns1.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns1"),
          xmlWriter);
    }
    if (localDFUDataKeyedColumns2Tracker) {
      if (localDFUDataKeyedColumns2 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataKeyedColumns2 cannot be null!!");
      }
      localDFUDataKeyedColumns2.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns2"),
          xmlWriter);
    }
    if (localDFUDataKeyedColumns3Tracker) {
      if (localDFUDataKeyedColumns3 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataKeyedColumns3 cannot be null!!");
      }
      localDFUDataKeyedColumns3.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns3"),
          xmlWriter);
    }
    if (localDFUDataKeyedColumns4Tracker) {
      if (localDFUDataKeyedColumns4 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataKeyedColumns4 cannot be null!!");
      }
      localDFUDataKeyedColumns4.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns4"),
          xmlWriter);
    }
    if (localDFUDataKeyedColumns5Tracker) {
      if (localDFUDataKeyedColumns5 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataKeyedColumns5 cannot be null!!");
      }
      localDFUDataKeyedColumns5.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns5"),
          xmlWriter);
    }
    if (localDFUDataKeyedColumns6Tracker) {
      if (localDFUDataKeyedColumns6 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataKeyedColumns6 cannot be null!!");
      }
      localDFUDataKeyedColumns6.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns6"),
          xmlWriter);
    }
    if (localDFUDataKeyedColumns7Tracker) {
      if (localDFUDataKeyedColumns7 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataKeyedColumns7 cannot be null!!");
      }
      localDFUDataKeyedColumns7.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns7"),
          xmlWriter);
    }
    if (localDFUDataKeyedColumns8Tracker) {
      if (localDFUDataKeyedColumns8 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataKeyedColumns8 cannot be null!!");
      }
      localDFUDataKeyedColumns8.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns8"),
          xmlWriter);
    }
    if (localDFUDataKeyedColumns9Tracker) {
      if (localDFUDataKeyedColumns9 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataKeyedColumns9 cannot be null!!");
      }
      localDFUDataKeyedColumns9.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns9"),
          xmlWriter);
    }
    if (localDFUDataKeyedColumns10Tracker) {
      if (localDFUDataKeyedColumns10 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataKeyedColumns10 cannot be null!!");
      }
      localDFUDataKeyedColumns10.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns10"),
          xmlWriter);
    }
    if (localDFUDataKeyedColumns11Tracker) {
      if (localDFUDataKeyedColumns11 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataKeyedColumns11 cannot be null!!");
      }
      localDFUDataKeyedColumns11.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns11"),
          xmlWriter);
    }
    if (localDFUDataKeyedColumns12Tracker) {
      if (localDFUDataKeyedColumns12 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataKeyedColumns12 cannot be null!!");
      }
      localDFUDataKeyedColumns12.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns12"),
          xmlWriter);
    }
    if (localDFUDataKeyedColumns13Tracker) {
      if (localDFUDataKeyedColumns13 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataKeyedColumns13 cannot be null!!");
      }
      localDFUDataKeyedColumns13.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns13"),
          xmlWriter);
    }
    if (localDFUDataKeyedColumns14Tracker) {
      if (localDFUDataKeyedColumns14 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataKeyedColumns14 cannot be null!!");
      }
      localDFUDataKeyedColumns14.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns14"),
          xmlWriter);
    }
    if (localDFUDataKeyedColumns15Tracker) {
      if (localDFUDataKeyedColumns15 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataKeyedColumns15 cannot be null!!");
      }
      localDFUDataKeyedColumns15.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns15"),
          xmlWriter);
    }
    if (localDFUDataKeyedColumns16Tracker) {
      if (localDFUDataKeyedColumns16 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataKeyedColumns16 cannot be null!!");
      }
      localDFUDataKeyedColumns16.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns16"),
          xmlWriter);
    }
    if (localDFUDataKeyedColumns17Tracker) {
      if (localDFUDataKeyedColumns17 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataKeyedColumns17 cannot be null!!");
      }
      localDFUDataKeyedColumns17.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns17"),
          xmlWriter);
    }
    if (localDFUDataKeyedColumns18Tracker) {
      if (localDFUDataKeyedColumns18 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataKeyedColumns18 cannot be null!!");
      }
      localDFUDataKeyedColumns18.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns18"),
          xmlWriter);
    }
    if (localDFUDataKeyedColumns19Tracker) {
      if (localDFUDataKeyedColumns19 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataKeyedColumns19 cannot be null!!");
      }
      localDFUDataKeyedColumns19.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns19"),
          xmlWriter);
    }
    if (localDFUDataKeyedColumns20Tracker) {
      if (localDFUDataKeyedColumns20 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataKeyedColumns20 cannot be null!!");
      }
      localDFUDataKeyedColumns20.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns20"),
          xmlWriter);
    }
    if (localDFUDataNonKeyedColumns1Tracker) {
      if (localDFUDataNonKeyedColumns1 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataNonKeyedColumns1 cannot be null!!");
      }
      localDFUDataNonKeyedColumns1.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns1"),
          xmlWriter);
    }
    if (localDFUDataNonKeyedColumns2Tracker) {
      if (localDFUDataNonKeyedColumns2 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataNonKeyedColumns2 cannot be null!!");
      }
      localDFUDataNonKeyedColumns2.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns2"),
          xmlWriter);
    }
    if (localDFUDataNonKeyedColumns3Tracker) {
      if (localDFUDataNonKeyedColumns3 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataNonKeyedColumns3 cannot be null!!");
      }
      localDFUDataNonKeyedColumns3.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns3"),
          xmlWriter);
    }
    if (localDFUDataNonKeyedColumns4Tracker) {
      if (localDFUDataNonKeyedColumns4 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataNonKeyedColumns4 cannot be null!!");
      }
      localDFUDataNonKeyedColumns4.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns4"),
          xmlWriter);
    }
    if (localDFUDataNonKeyedColumns5Tracker) {
      if (localDFUDataNonKeyedColumns5 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataNonKeyedColumns5 cannot be null!!");
      }
      localDFUDataNonKeyedColumns5.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns5"),
          xmlWriter);
    }
    if (localDFUDataNonKeyedColumns6Tracker) {
      if (localDFUDataNonKeyedColumns6 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataNonKeyedColumns6 cannot be null!!");
      }
      localDFUDataNonKeyedColumns6.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns6"),
          xmlWriter);
    }
    if (localDFUDataNonKeyedColumns7Tracker) {
      if (localDFUDataNonKeyedColumns7 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataNonKeyedColumns7 cannot be null!!");
      }
      localDFUDataNonKeyedColumns7.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns7"),
          xmlWriter);
    }
    if (localDFUDataNonKeyedColumns8Tracker) {
      if (localDFUDataNonKeyedColumns8 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataNonKeyedColumns8 cannot be null!!");
      }
      localDFUDataNonKeyedColumns8.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns8"),
          xmlWriter);
    }
    if (localDFUDataNonKeyedColumns9Tracker) {
      if (localDFUDataNonKeyedColumns9 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataNonKeyedColumns9 cannot be null!!");
      }
      localDFUDataNonKeyedColumns9.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns9"),
          xmlWriter);
    }
    if (localDFUDataNonKeyedColumns10Tracker) {
      if (localDFUDataNonKeyedColumns10 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataNonKeyedColumns10 cannot be null!!");
      }
      localDFUDataNonKeyedColumns10.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns10"),
          xmlWriter);
    }
    if (localDFUDataNonKeyedColumns11Tracker) {
      if (localDFUDataNonKeyedColumns11 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataNonKeyedColumns11 cannot be null!!");
      }
      localDFUDataNonKeyedColumns11.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns11"),
          xmlWriter);
    }
    if (localDFUDataNonKeyedColumns12Tracker) {
      if (localDFUDataNonKeyedColumns12 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataNonKeyedColumns12 cannot be null!!");
      }
      localDFUDataNonKeyedColumns12.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns12"),
          xmlWriter);
    }
    if (localDFUDataNonKeyedColumns13Tracker) {
      if (localDFUDataNonKeyedColumns13 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataNonKeyedColumns13 cannot be null!!");
      }
      localDFUDataNonKeyedColumns13.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns13"),
          xmlWriter);
    }
    if (localDFUDataNonKeyedColumns14Tracker) {
      if (localDFUDataNonKeyedColumns14 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataNonKeyedColumns14 cannot be null!!");
      }
      localDFUDataNonKeyedColumns14.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns14"),
          xmlWriter);
    }
    if (localDFUDataNonKeyedColumns15Tracker) {
      if (localDFUDataNonKeyedColumns15 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataNonKeyedColumns15 cannot be null!!");
      }
      localDFUDataNonKeyedColumns15.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns15"),
          xmlWriter);
    }
    if (localDFUDataNonKeyedColumns16Tracker) {
      if (localDFUDataNonKeyedColumns16 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataNonKeyedColumns16 cannot be null!!");
      }
      localDFUDataNonKeyedColumns16.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns16"),
          xmlWriter);
    }
    if (localDFUDataNonKeyedColumns17Tracker) {
      if (localDFUDataNonKeyedColumns17 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataNonKeyedColumns17 cannot be null!!");
      }
      localDFUDataNonKeyedColumns17.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns17"),
          xmlWriter);
    }
    if (localDFUDataNonKeyedColumns18Tracker) {
      if (localDFUDataNonKeyedColumns18 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataNonKeyedColumns18 cannot be null!!");
      }
      localDFUDataNonKeyedColumns18.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns18"),
          xmlWriter);
    }
    if (localDFUDataNonKeyedColumns19Tracker) {
      if (localDFUDataNonKeyedColumns19 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataNonKeyedColumns19 cannot be null!!");
      }
      localDFUDataNonKeyedColumns19.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns19"),
          xmlWriter);
    }
    if (localDFUDataNonKeyedColumns20Tracker) {
      if (localDFUDataNonKeyedColumns20 == null) {
        throw new org.apache.axis2.databinding.ADBException(
            "DFUDataNonKeyedColumns20 cannot be null!!");
      }
      localDFUDataNonKeyedColumns20.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns20"),
          xmlWriter);
    }
    if (localRowCountTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "RowCount", xmlWriter);

      if (localRowCount == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("RowCount cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRowCount));
      }

      xmlWriter.writeEndElement();
    }
    if (localShowColumnsTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "ShowColumns", xmlWriter);

      if (localShowColumns == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ShowColumns cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localShowColumns);
      }

      xmlWriter.writeEndElement();
    }
    if (localChooseFileTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "ChooseFile", xmlWriter);

      if (localChooseFile == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("ChooseFile cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localChooseFile));
      }

      xmlWriter.writeEndElement();
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
    if (localFilterByTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "FilterBy", xmlWriter);

      if (localFilterBy == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("FilterBy cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localFilterBy);
      }

      xmlWriter.writeEndElement();
    }
    if (localFilterForGoBackTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "FilterForGoBack", xmlWriter);

      if (localFilterForGoBack == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("FilterForGoBack cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localFilterForGoBack);
      }

      xmlWriter.writeEndElement();
    }
    if (localColumnsHiddenTracker) {
      if (localColumnsHidden == null) {
        throw new org.apache.axis2.databinding.ADBException("ColumnsHidden cannot be null!!");
      }
      localColumnsHidden.serialize(
          new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ColumnsHidden"), xmlWriter);
    }
    if (localColumnCountTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "ColumnCount", xmlWriter);

      if (localColumnCount == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("ColumnCount cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localColumnCount));
      }

      xmlWriter.writeEndElement();
    }
    if (localStartForGobackTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "StartForGoback", xmlWriter);

      if (localStartForGoback == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("StartForGoback cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStartForGoback));
      }

      xmlWriter.writeEndElement();
    }
    if (localCountForGobackTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "CountForGoback", xmlWriter);

      if (localCountForGoback == java.lang.Integer.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("CountForGoback cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCountForGoback));
      }

      xmlWriter.writeEndElement();
    }
    if (localStartTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "Start", xmlWriter);

      if (localStart == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("Start cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localStart));
      }

      xmlWriter.writeEndElement();
    }
    if (localCountTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "Count", xmlWriter);

      if (localCount == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("Count cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCount));
      }

      xmlWriter.writeEndElement();
    }
    if (localPageSizeTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "PageSize", xmlWriter);

      if (localPageSize == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("PageSize cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPageSize));
      }

      xmlWriter.writeEndElement();
    }
    if (localTotalTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "Total", xmlWriter);

      if (localTotal == java.lang.Long.MIN_VALUE) {

        throw new org.apache.axis2.databinding.ADBException("Total cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTotal));
      }

      xmlWriter.writeEndElement();
    }
    if (localResultTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "Result", xmlWriter);

      if (localResult == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Result cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localResult);
      }

      xmlWriter.writeEndElement();
    }
    if (localMsgToDisplayTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "MsgToDisplay", xmlWriter);

      if (localMsgToDisplay == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("MsgToDisplay cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localMsgToDisplay);
      }

      xmlWriter.writeEndElement();
    }
    if (localClusterTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "Cluster", xmlWriter);

      if (localCluster == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Cluster cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localCluster);
      }

      xmlWriter.writeEndElement();
    }
    if (localClusterTypeTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "ClusterType", xmlWriter);

      if (localClusterType == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("ClusterType cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localClusterType);
      }

      xmlWriter.writeEndElement();
    }
    if (localFileTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "File", xmlWriter);

      if (localFile == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("File cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localFile);
      }

      xmlWriter.writeEndElement();
    }
    if (localKeyTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "Key", xmlWriter);

      if (localKey == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("Key cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localKey);
      }

      xmlWriter.writeEndElement();
    }
    if (localSchemaOnlyTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "SchemaOnly", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("SchemaOnly cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSchemaOnly));
      }

      xmlWriter.writeEndElement();
    }
    if (localRoxieSelectionsTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "RoxieSelections", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("RoxieSelections cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRoxieSelections));
      }

      xmlWriter.writeEndElement();
    }
    if (localDisableUppercaseTranslationTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "DisableUppercaseTranslation", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException(
            "DisableUppercaseTranslation cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localDisableUppercaseTranslation));
      }

      xmlWriter.writeEndElement();
    }
    if (localAutoUppercaseTranslationTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "AutoUppercaseTranslation", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException(
            "AutoUppercaseTranslation cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                localAutoUppercaseTranslation));
      }

      xmlWriter.writeEndElement();
    }
    if (localSelectedKeyTracker) {
      namespace = "urn:hpccsystems:ws:wsdfu";
      writeStartElement(null, namespace, "SelectedKey", xmlWriter);

      if (localSelectedKey == null) {
        // write the nil attribute

        throw new org.apache.axis2.databinding.ADBException("SelectedKey cannot be null!!");

      } else {

        xmlWriter.writeCharacters(localSelectedKey);
      }

      xmlWriter.writeEndElement();
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
    public static DFUSearchDataResponse parse(javax.xml.stream.XMLStreamReader reader)
        throws java.lang.Exception {
      DFUSearchDataResponse object = new DFUSearchDataResponse();

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

            if (!"DFUSearchDataResponse".equals(type)) {
              // find namespace for the prefix
              java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
              return (DFUSearchDataResponse)
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ExtensionMapper.getTypeObject(
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions")
                    .equals(reader.getName())) {

              object.setExceptions(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfEspException.Factory.parse(
                      reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "OpenLogicalName")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "OpenLogicalName" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setOpenLogicalName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "LogicalName")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "LogicalName" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setLogicalName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ParentName")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ParentName" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setParentName(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "StartIndex")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "StartIndex" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setStartIndex(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "EndIndex")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "EndIndex" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setEndIndex(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns1")
                    .equals(reader.getName())) {

              object.setDFUDataKeyedColumns1(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns2")
                    .equals(reader.getName())) {

              object.setDFUDataKeyedColumns2(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns3")
                    .equals(reader.getName())) {

              object.setDFUDataKeyedColumns3(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns4")
                    .equals(reader.getName())) {

              object.setDFUDataKeyedColumns4(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns5")
                    .equals(reader.getName())) {

              object.setDFUDataKeyedColumns5(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns6")
                    .equals(reader.getName())) {

              object.setDFUDataKeyedColumns6(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns7")
                    .equals(reader.getName())) {

              object.setDFUDataKeyedColumns7(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns8")
                    .equals(reader.getName())) {

              object.setDFUDataKeyedColumns8(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns9")
                    .equals(reader.getName())) {

              object.setDFUDataKeyedColumns9(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns10")
                    .equals(reader.getName())) {

              object.setDFUDataKeyedColumns10(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns11")
                    .equals(reader.getName())) {

              object.setDFUDataKeyedColumns11(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns12")
                    .equals(reader.getName())) {

              object.setDFUDataKeyedColumns12(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns13")
                    .equals(reader.getName())) {

              object.setDFUDataKeyedColumns13(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns14")
                    .equals(reader.getName())) {

              object.setDFUDataKeyedColumns14(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns15")
                    .equals(reader.getName())) {

              object.setDFUDataKeyedColumns15(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns16")
                    .equals(reader.getName())) {

              object.setDFUDataKeyedColumns16(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns17")
                    .equals(reader.getName())) {

              object.setDFUDataKeyedColumns17(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns18")
                    .equals(reader.getName())) {

              object.setDFUDataKeyedColumns18(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns19")
                    .equals(reader.getName())) {

              object.setDFUDataKeyedColumns19(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "DFUDataKeyedColumns20")
                    .equals(reader.getName())) {

              object.setDFUDataKeyedColumns20(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns1")
                    .equals(reader.getName())) {

              object.setDFUDataNonKeyedColumns1(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns2")
                    .equals(reader.getName())) {

              object.setDFUDataNonKeyedColumns2(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns3")
                    .equals(reader.getName())) {

              object.setDFUDataNonKeyedColumns3(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns4")
                    .equals(reader.getName())) {

              object.setDFUDataNonKeyedColumns4(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns5")
                    .equals(reader.getName())) {

              object.setDFUDataNonKeyedColumns5(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns6")
                    .equals(reader.getName())) {

              object.setDFUDataNonKeyedColumns6(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns7")
                    .equals(reader.getName())) {

              object.setDFUDataNonKeyedColumns7(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns8")
                    .equals(reader.getName())) {

              object.setDFUDataNonKeyedColumns8(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns9")
                    .equals(reader.getName())) {

              object.setDFUDataNonKeyedColumns9(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns10")
                    .equals(reader.getName())) {

              object.setDFUDataNonKeyedColumns10(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns11")
                    .equals(reader.getName())) {

              object.setDFUDataNonKeyedColumns11(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns12")
                    .equals(reader.getName())) {

              object.setDFUDataNonKeyedColumns12(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns13")
                    .equals(reader.getName())) {

              object.setDFUDataNonKeyedColumns13(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns14")
                    .equals(reader.getName())) {

              object.setDFUDataNonKeyedColumns14(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns15")
                    .equals(reader.getName())) {

              object.setDFUDataNonKeyedColumns15(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns16")
                    .equals(reader.getName())) {

              object.setDFUDataNonKeyedColumns16(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns17")
                    .equals(reader.getName())) {

              object.setDFUDataNonKeyedColumns17(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns18")
                    .equals(reader.getName())) {

              object.setDFUDataNonKeyedColumns18(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns19")
                    .equals(reader.getName())) {

              object.setDFUDataNonKeyedColumns19(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "DFUDataNonKeyedColumns20")
                    .equals(reader.getName())) {

              object.setDFUDataNonKeyedColumns20(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ArrayOfDFUDataColumn.Factory
                      .parse(reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "RowCount")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "RowCount" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setRowCount(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ShowColumns")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ShowColumns" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setShowColumns(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ChooseFile")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ChooseFile" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setChooseFile(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FilterBy")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "FilterBy" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setFilterBy(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "FilterForGoBack")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "FilterForGoBack" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setFilterForGoBack(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ColumnsHidden")
                    .equals(reader.getName())) {

              object.setColumnsHidden(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ColumnsHidden_type1.Factory.parse(
                      reader));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ColumnCount")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ColumnCount" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setColumnCount(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "StartForGoback")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "StartForGoback" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setStartForGoback(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "CountForGoback")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "CountForGoback" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setCountForGoback(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Start")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Start" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setStart(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Count")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Count" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setCount(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "PageSize")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "PageSize" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setPageSize(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Total")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Total" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setTotal(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Result")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Result" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setResult(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "MsgToDisplay")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "MsgToDisplay" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setMsgToDisplay(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Cluster")
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
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ClusterType")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "ClusterType" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setClusterType(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "File")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "File" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setFile(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Key")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "Key" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setKey(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "SchemaOnly")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SchemaOnly" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSchemaOnly(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "RoxieSelections")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "RoxieSelections" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setRoxieSelections(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "DisableUppercaseTranslation")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "DisableUppercaseTranslation" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setDisableUppercaseTranslation(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfu", "AutoUppercaseTranslation")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "AutoUppercaseTranslation" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setAutoUppercaseTranslation(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

              reader.next();

            } // End of if for expected property start element
            else if (reader.isStartElement()
                && new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "SelectedKey")
                    .equals(reader.getName())) {

              nillableValue =
                  reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
              if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                throw new org.apache.axis2.databinding.ADBException(
                    "The element: " + "SelectedKey" + "  cannot be null");
              }

              java.lang.String content = reader.getElementText();

              object.setSelectedKey(
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

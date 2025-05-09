/**
 * WsDfuStub.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:49:45 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39;

/*
 *  WsDfuStub java implementation
 */

public class WsDfuStub extends org.apache.axis2.client.Stub implements WsDfu {
  protected org.apache.axis2.description.AxisOperation[] _operations;

  // hashmaps to keep the fault mapping
  private java.util.Map<org.apache.axis2.client.FaultMapKey, java.lang.String>
      faultExceptionNameMap =
          new java.util.HashMap<org.apache.axis2.client.FaultMapKey, java.lang.String>();
  private java.util.Map<org.apache.axis2.client.FaultMapKey, java.lang.String>
      faultExceptionClassNameMap =
          new java.util.HashMap<org.apache.axis2.client.FaultMapKey, java.lang.String>();
  private java.util.Map<org.apache.axis2.client.FaultMapKey, java.lang.String> faultMessageMap =
      new java.util.HashMap<org.apache.axis2.client.FaultMapKey, java.lang.String>();

  private static int counter = 0;

  private static synchronized java.lang.String getUniqueSuffix() {
    // reset the counter if it is greater than 99999
    if (counter > 99999) {
      counter = 0;
    }
    counter = counter + 1;
    return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
  }

  private void populateAxisService() throws org.apache.axis2.AxisFault {

    // creating the Service with a unique name
    _service = new org.apache.axis2.description.AxisService("WsDfu" + getUniqueSuffix());
    addAnonymousOperations();

    // creating the operations
    org.apache.axis2.description.AxisOperation __operation;

    _operations = new org.apache.axis2.description.AxisOperation[25];

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "listHistory"));
    _service.addOperation(__operation);

    _operations[0] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "eraseHistory"));
    _service.addOperation(__operation);

    _operations[1] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ping"));
    _service.addOperation(__operation);

    _operations[2] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "dFUDefFile"));
    _service.addOperation(__operation);

    _operations[3] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "dFUGetFileMetaData"));
    _service.addOperation(__operation);

    _operations[4] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "dFUFileView"));
    _service.addOperation(__operation);

    _operations[5] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "dFUSpace"));
    _service.addOperation(__operation);

    _operations[6] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "addtoSuperfile"));
    _service.addOperation(__operation);

    _operations[7] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "dFUFileAccess"));
    _service.addOperation(__operation);

    _operations[8] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "dFUSearchData"));
    _service.addOperation(__operation);

    _operations[9] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "dFUArrayAction"));
    _service.addOperation(__operation);

    _operations[10] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "dFUFilePublish"));
    _service.addOperation(__operation);

    _operations[11] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "eclRecordTypeInfo"));
    _service.addOperation(__operation);

    _operations[12] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "addRemote"));
    _service.addOperation(__operation);

    _operations[13] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "superfileAction"));
    _service.addOperation(__operation);

    _operations[14] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "dFUFileCreate"));
    _service.addOperation(__operation);

    _operations[15] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "dFUGetDataColumns"));
    _service.addOperation(__operation);

    _operations[16] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "dFURecordTypeInfo"));
    _service.addOperation(__operation);

    _operations[17] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "superfileList"));
    _service.addOperation(__operation);

    _operations[18] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "add"));
    _service.addOperation(__operation);

    _operations[19] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "savexml"));
    _service.addOperation(__operation);

    _operations[20] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "dFUQuery"));
    _service.addOperation(__operation);

    _operations[21] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "dFUSearch"));
    _service.addOperation(__operation);

    _operations[22] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "dFUBrowseData"));
    _service.addOperation(__operation);

    _operations[23] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "dFUInfo"));
    _service.addOperation(__operation);

    _operations[24] = __operation;
  }

  // populates the faults
  private void populateFaults() {

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"), "ListHistory"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"), "ListHistory"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"), "ListHistory"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "EraseHistory"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "EraseHistory"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "EraseHistory"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"), "Ping"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"), "Ping"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"), "Ping"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"), "DFUDefFile"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"), "DFUDefFile"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"), "DFUDefFile"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "DFUGetFileMetaData"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "DFUGetFileMetaData"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "DFUGetFileMetaData"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"), "DFUFileView"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"), "DFUFileView"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"), "DFUFileView"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"), "DFUSpace"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"), "DFUSpace"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"), "DFUSpace"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "AddtoSuperfile"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "AddtoSuperfile"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "AddtoSuperfile"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "DFUFileAccess"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "DFUFileAccess"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "DFUFileAccess"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "DFUSearchData"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "DFUSearchData"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "DFUSearchData"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "DFUArrayAction"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "DFUArrayAction"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "DFUArrayAction"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "DFUFilePublish"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "DFUFilePublish"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "DFUFilePublish"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "EclRecordTypeInfo"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "EclRecordTypeInfo"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "EclRecordTypeInfo"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"), "AddRemote"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"), "AddRemote"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"), "AddRemote"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "SuperfileAction"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "SuperfileAction"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "SuperfileAction"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "DFUFileCreate"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "DFUFileCreate"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "DFUFileCreate"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "DFUGetDataColumns"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "DFUGetDataColumns"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "DFUGetDataColumns"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "DFURecordTypeInfo"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "DFURecordTypeInfo"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "DFURecordTypeInfo"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "SuperfileList"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "SuperfileList"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "SuperfileList"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"), "Add"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"), "Add"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"), "Add"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"), "Savexml"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"), "Savexml"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"), "Savexml"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"), "DFUQuery"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"), "DFUQuery"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"), "DFUQuery"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"), "DFUSearch"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"), "DFUSearch"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"), "DFUSearch"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "DFUBrowseData"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "DFUBrowseData"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"),
            "DFUBrowseData"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"), "DFUInfo"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"), "DFUInfo"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "Exceptions"), "DFUInfo"),
        "org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.Exceptions");
  }

  /** Constructor that takes in a configContext */
  public WsDfuStub(
      org.apache.axis2.context.ConfigurationContext configurationContext,
      java.lang.String targetEndpoint)
      throws org.apache.axis2.AxisFault {
    this(configurationContext, targetEndpoint, false);
  }

  /** Constructor that takes in a configContext and useseperate listner */
  public WsDfuStub(
      org.apache.axis2.context.ConfigurationContext configurationContext,
      java.lang.String targetEndpoint,
      boolean useSeparateListener)
      throws org.apache.axis2.AxisFault {
    // To populate AxisService
    populateAxisService();
    populateFaults();

    _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext, _service);

    _serviceClient
        .getOptions()
        .setTo(new org.apache.axis2.addressing.EndpointReference(targetEndpoint));
    _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
  }

  /** Default Constructor */
  public WsDfuStub(org.apache.axis2.context.ConfigurationContext configurationContext)
      throws org.apache.axis2.AxisFault {

    this(configurationContext, "http://10.173.160.101:8010/WsDfu?ver_=1.39");
  }

  /** Default Constructor */
  public WsDfuStub() throws org.apache.axis2.AxisFault {

    this("http://10.173.160.101:8010/WsDfu?ver_=1.39");
  }

  /** Constructor taking the target endpoint */
  public WsDfuStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
    this(null, targetEndpoint);
  }

  /**
   * Auto generated method signature
   *
   * @see org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfu#listHistory
   * @param listHistoryRequest0
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ListHistoryResponse listHistory(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ListHistoryRequest listHistoryRequest0)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[0].getName());
      _operationClient.getOptions().setAction("WsDfu/ListHistory?ver_=1.39");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              listHistoryRequest0,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "listHistory")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ListHistoryRequest"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ListHistoryResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ListHistoryResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ListHistory"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ListHistory"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ListHistory"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfu#eraseHistory
   * @param eraseHistoryRequest2
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EraseHistoryResponse eraseHistory(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EraseHistoryRequest eraseHistoryRequest2)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[1].getName());
      _operationClient.getOptions().setAction("WsDfu/EraseHistory?ver_=1.39");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              eraseHistoryRequest2,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "eraseHistory")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "EraseHistoryRequest"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EraseHistoryResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EraseHistoryResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "EraseHistory"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "EraseHistory"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "EraseHistory"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfu#ping
   * @param wsDfuPingRequest4
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfuPingResponse ping(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfuPingRequest wsDfuPingRequest4)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[2].getName());
      _operationClient.getOptions().setAction("WsDfu/Ping?ver_=1.39");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              wsDfuPingRequest4,
              optimizeContent(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "ping")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "WsDfuPingRequest"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfuPingResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfuPingResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Ping"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Ping"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Ping"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfu#dFUDefFile
   * @param dFUDefFileRequest6
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUDefFileResponse dFUDefFile(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUDefFileRequest dFUDefFileRequest6)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[3].getName());
      _operationClient.getOptions().setAction("WsDfu/DFUDefFile?ver_=1.39");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              dFUDefFileRequest6,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "dFUDefFile")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUDefFileRequest"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUDefFileResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUDefFileResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFUDefFile"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFUDefFile"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFUDefFile"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfu#dFUGetFileMetaData
   * @param dFUGetFileMetaDataRequest8
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUGetFileMetaDataResponse
      dFUGetFileMetaData(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUGetFileMetaDataRequest
              dFUGetFileMetaDataRequest8)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[4].getName());
      _operationClient.getOptions().setAction("WsDfu/DFUGetFileMetaData?ver_=1.39");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              dFUGetFileMetaDataRequest8,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "dFUGetFileMetaData")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wsdfu", "DFUGetFileMetaDataRequest"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUGetFileMetaDataResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUGetFileMetaDataResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFUGetFileMetaData"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "DFUGetFileMetaData"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "DFUGetFileMetaData"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfu#dFUFileView
   * @param dFUFileViewRequest10
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileViewResponse dFUFileView(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileViewRequest dFUFileViewRequest10)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[5].getName());
      _operationClient.getOptions().setAction("WsDfu/DFUFileView?ver_=1.39");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              dFUFileViewRequest10,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "dFUFileView")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFileViewRequest"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileViewResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileViewResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFUFileView"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFUFileView"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFUFileView"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfu#dFUSpace
   * @param dFUSpaceRequest12
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSpaceResponse dFUSpace(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSpaceRequest dFUSpaceRequest12)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[6].getName());
      _operationClient.getOptions().setAction("WsDfu/DFUSpace?ver_=1.39");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              dFUSpaceRequest12,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "dFUSpace")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUSpaceRequest"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSpaceResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSpaceResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFUSpace"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFUSpace"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFUSpace"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfu#addtoSuperfile
   * @param addtoSuperfileRequest14
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddtoSuperfileResponse addtoSuperfile(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddtoSuperfileRequest addtoSuperfileRequest14)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[7].getName());
      _operationClient.getOptions().setAction("WsDfu/AddtoSuperfile?ver_=1.39");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              addtoSuperfileRequest14,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "addtoSuperfile")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "AddtoSuperfileRequest"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddtoSuperfileResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddtoSuperfileResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "AddtoSuperfile"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "AddtoSuperfile"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "AddtoSuperfile"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfu#dFUFileAccess
   * @param dFUFileAccessRequest16
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileAccessResponse dFUFileAccess(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileAccessRequest dFUFileAccessRequest16)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[8].getName());
      _operationClient.getOptions().setAction("WsDfu/DFUFileAccess?ver_=1.39");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              dFUFileAccessRequest16,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "dFUFileAccess")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFileAccessRequest"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileAccessResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileAccessResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFUFileAccess"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFUFileAccess"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFUFileAccess"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfu#dFUSearchData
   * @param dFUSearchDataRequest18
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSearchDataResponse dFUSearchData(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSearchDataRequest dFUSearchDataRequest18)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[9].getName());
      _operationClient.getOptions().setAction("WsDfu/DFUSearchData?ver_=1.39");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              dFUSearchDataRequest18,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "dFUSearchData")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUSearchDataRequest"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSearchDataResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSearchDataResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFUSearchData"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFUSearchData"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFUSearchData"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfu#dFUArrayAction
   * @param dFUArrayActionRequest20
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUArrayActionResponse dFUArrayAction(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUArrayActionRequest dFUArrayActionRequest20)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[10].getName());
      _operationClient.getOptions().setAction("WsDfu/DFUArrayAction?ver_=1.39");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              dFUArrayActionRequest20,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "dFUArrayAction")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUArrayActionRequest"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUArrayActionResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUArrayActionResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFUArrayAction"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFUArrayAction"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFUArrayAction"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfu#dFUFilePublish
   * @param dFUFilePublishRequest22
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFilePublishResponse dFUFilePublish(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFilePublishRequest dFUFilePublishRequest22)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[11].getName());
      _operationClient.getOptions().setAction("WsDfu/DFUFilePublish?ver_=1.39");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              dFUFilePublishRequest22,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "dFUFilePublish")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFilePublishRequest"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFilePublishResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFilePublishResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFUFilePublish"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFUFilePublish"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFUFilePublish"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfu#eclRecordTypeInfo
   * @param eclRecordTypeInfoRequest24
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EclRecordTypeInfoResponse
      eclRecordTypeInfo(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EclRecordTypeInfoRequest
              eclRecordTypeInfoRequest24)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[12].getName());
      _operationClient.getOptions().setAction("WsDfu/EclRecordTypeInfo?ver_=1.39");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              eclRecordTypeInfoRequest24,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "eclRecordTypeInfo")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wsdfu", "EclRecordTypeInfoRequest"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EclRecordTypeInfoResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EclRecordTypeInfoResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "EclRecordTypeInfo"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "EclRecordTypeInfo"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "EclRecordTypeInfo"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfu#addRemote
   * @param addRemoteRequest26
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddRemoteResponse addRemote(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddRemoteRequest addRemoteRequest26)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[13].getName());
      _operationClient.getOptions().setAction("WsDfu/AddRemote?ver_=1.39");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              addRemoteRequest26,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "addRemote")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "AddRemoteRequest"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddRemoteResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddRemoteResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "AddRemote"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "AddRemote"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "AddRemote"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfu#superfileAction
   * @param superfileActionRequest28
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SuperfileActionResponse superfileAction(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SuperfileActionRequest
          superfileActionRequest28)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[14].getName());
      _operationClient.getOptions().setAction("WsDfu/SuperfileAction?ver_=1.39");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              superfileActionRequest28,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "superfileAction")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "SuperfileActionRequest"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SuperfileActionResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SuperfileActionResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "SuperfileAction"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "SuperfileAction"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "SuperfileAction"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfu#dFUFileCreate
   * @param dFUFileCreateRequest30
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileCreateResponse dFUFileCreate(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileCreateRequest dFUFileCreateRequest30)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[15].getName());
      _operationClient.getOptions().setAction("WsDfu/DFUFileCreate?ver_=1.39");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              dFUFileCreateRequest30,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "dFUFileCreate")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUFileCreateRequest"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileCreateResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileCreateResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFUFileCreate"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFUFileCreate"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFUFileCreate"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfu#dFUGetDataColumns
   * @param dFUGetDataColumnsRequest32
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUGetDataColumnsResponse
      dFUGetDataColumns(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUGetDataColumnsRequest
              dFUGetDataColumnsRequest32)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[16].getName());
      _operationClient.getOptions().setAction("WsDfu/DFUGetDataColumns?ver_=1.39");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              dFUGetDataColumnsRequest32,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "dFUGetDataColumns")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wsdfu", "DFUGetDataColumnsRequest"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUGetDataColumnsResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUGetDataColumnsResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFUGetDataColumns"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "DFUGetDataColumns"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "DFUGetDataColumns"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfu#dFURecordTypeInfo
   * @param dFURecordTypeInfoRequest34
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFURecordTypeInfoResponse
      dFURecordTypeInfo(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFURecordTypeInfoRequest
              dFURecordTypeInfoRequest34)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[17].getName());
      _operationClient.getOptions().setAction("WsDfu/DFURecordTypeInfo?ver_=1.39");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              dFURecordTypeInfoRequest34,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "dFURecordTypeInfo")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wsdfu", "DFURecordTypeInfoRequest"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFURecordTypeInfoResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFURecordTypeInfoResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFURecordTypeInfo"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "DFURecordTypeInfo"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "DFURecordTypeInfo"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfu#superfileList
   * @param superfileListRequest36
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SuperfileListResponse superfileList(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SuperfileListRequest superfileListRequest36)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[18].getName());
      _operationClient.getOptions().setAction("WsDfu/SuperfileList?ver_=1.39");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              superfileListRequest36,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "superfileList")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "SuperfileListRequest"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SuperfileListResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SuperfileListResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "SuperfileList"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "SuperfileList"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "SuperfileList"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfu#add
   * @param addRequest38
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddResponse add(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddRequest addRequest38)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[19].getName());
      _operationClient.getOptions().setAction("WsDfu/Add?ver_=1.39");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              addRequest38,
              optimizeContent(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "add")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "AddRequest"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Add"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Add"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Add"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfu#savexml
   * @param savexmlRequest40
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SavexmlResponse savexml(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SavexmlRequest savexmlRequest40)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[20].getName());
      _operationClient.getOptions().setAction("WsDfu/Savexml?ver_=1.39");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              savexmlRequest40,
              optimizeContent(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "savexml")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "SavexmlRequest"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SavexmlResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SavexmlResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Savexml"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Savexml"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Savexml"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfu#dFUQuery
   * @param dFUQueryRequest42
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUQueryResponse dFUQuery(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUQueryRequest dFUQueryRequest42)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[21].getName());
      _operationClient.getOptions().setAction("WsDfu/DFUQuery?ver_=1.39");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              dFUQueryRequest42,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "dFUQuery")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUQueryRequest"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUQueryResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUQueryResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFUQuery"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFUQuery"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFUQuery"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfu#dFUSearch
   * @param dFUSearchRequest44
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSearchResponse dFUSearch(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSearchRequest dFUSearchRequest44)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[22].getName());
      _operationClient.getOptions().setAction("WsDfu/DFUSearch?ver_=1.39");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              dFUSearchRequest44,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "dFUSearch")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUSearchRequest"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSearchResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSearchResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFUSearch"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFUSearch"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFUSearch"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfu#dFUBrowseData
   * @param dFUBrowseDataRequest46
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUBrowseDataResponse dFUBrowseData(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUBrowseDataRequest dFUBrowseDataRequest46)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[23].getName());
      _operationClient.getOptions().setAction("WsDfu/DFUBrowseData?ver_=1.39");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              dFUBrowseDataRequest46,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "dFUBrowseData")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUBrowseDataRequest"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUBrowseDataResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUBrowseDataResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFUBrowseData"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFUBrowseData"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFUBrowseData"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfu#dFUInfo
   * @param dFUInfoRequest48
   * @throws org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUInfoResponse dFUInfo(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUInfoRequest dFUInfoRequest48)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[24].getName());
      _operationClient.getOptions().setAction("WsDfu/DFUInfo?ver_=1.39");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              dFUInfoRequest48,
              optimizeContent(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "dFUInfo")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfu", "DFUInfoRequest"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUInfoResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUInfoResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFUInfo"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFUInfo"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DFUInfo"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspSoapFault) ex;
            }

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (java.lang.ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  private javax.xml.namespace.QName[] opNameArray = null;

  private boolean optimizeContent(javax.xml.namespace.QName opName) {

    if (opNameArray == null) {
      return false;
    }
    for (int i = 0; i < opNameArray.length; i++) {
      if (opName.equals(opNameArray[i])) {
        return true;
      }
    }
    return false;
  }
  // http://10.173.160.101:8010/WsDfu?ver_=1.39
  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ListHistoryRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ListHistoryRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ListHistoryResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ListHistoryResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.Exceptions param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.Exceptions.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EraseHistoryRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EraseHistoryRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EraseHistoryResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EraseHistoryResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfuPingRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfuPingRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfuPingResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfuPingResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUDefFileRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUDefFileRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUDefFileResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUDefFileResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUGetFileMetaDataRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUGetFileMetaDataRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUGetFileMetaDataResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUGetFileMetaDataResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileViewRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileViewRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileViewResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileViewResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSpaceRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSpaceRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSpaceResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSpaceResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddtoSuperfileRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddtoSuperfileRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddtoSuperfileResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddtoSuperfileResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileAccessRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileAccessRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileAccessResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileAccessResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSearchDataRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSearchDataRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSearchDataResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSearchDataResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUArrayActionRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUArrayActionRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUArrayActionResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUArrayActionResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFilePublishRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFilePublishRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFilePublishResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFilePublishResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EclRecordTypeInfoRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EclRecordTypeInfoRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EclRecordTypeInfoResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EclRecordTypeInfoResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddRemoteRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddRemoteRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddRemoteResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddRemoteResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SuperfileActionRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SuperfileActionRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SuperfileActionResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SuperfileActionResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileCreateRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileCreateRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileCreateResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileCreateResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUGetDataColumnsRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUGetDataColumnsRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUGetDataColumnsResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUGetDataColumnsResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFURecordTypeInfoRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFURecordTypeInfoRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFURecordTypeInfoResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFURecordTypeInfoResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SuperfileListRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SuperfileListRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SuperfileListResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SuperfileListResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddRequest param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddResponse param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SavexmlRequest param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SavexmlRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SavexmlResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SavexmlResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUQueryRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUQueryRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUQueryResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUQueryResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSearchRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSearchRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSearchResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSearchResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUBrowseDataRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUBrowseDataRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUBrowseDataResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUBrowseDataResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUInfoRequest param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUInfoRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUInfoResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUInfoResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ListHistoryRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ListHistoryRequest.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EraseHistoryRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EraseHistoryRequest.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfuPingRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfuPingRequest.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUDefFileRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUDefFileRequest.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUGetFileMetaDataRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUGetFileMetaDataRequest
                      .MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileViewRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileViewRequest.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSpaceRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSpaceRequest.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddtoSuperfileRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddtoSuperfileRequest.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileAccessRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileAccessRequest.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSearchDataRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSearchDataRequest.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUArrayActionRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUArrayActionRequest.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFilePublishRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFilePublishRequest.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EclRecordTypeInfoRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EclRecordTypeInfoRequest.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddRemoteRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddRemoteRequest.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SuperfileActionRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SuperfileActionRequest.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileCreateRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileCreateRequest.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUGetDataColumnsRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUGetDataColumnsRequest.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFURecordTypeInfoRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFURecordTypeInfoRequest.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SuperfileListRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SuperfileListRequest.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddRequest.MY_QNAME, factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SavexmlRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SavexmlRequest.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUQueryRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUQueryRequest.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSearchRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSearchRequest.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUBrowseDataRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUBrowseDataRequest.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUInfoRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUInfoRequest.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  /** get the default envelope */
  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
    return factory.getDefaultEnvelope();
  }

  private java.lang.Object fromOM(org.apache.axiom.om.OMElement param, java.lang.Class type)
      throws org.apache.axis2.AxisFault {

    try {

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddRemoteRequest.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddRemoteRequest.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddRemoteResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddRemoteResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddRequest.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddRequest.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddtoSuperfileRequest.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddtoSuperfileRequest.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddtoSuperfileResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.AddtoSuperfileResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUArrayActionRequest.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUArrayActionRequest.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUArrayActionResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUArrayActionResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUBrowseDataRequest.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUBrowseDataRequest.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUBrowseDataResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUBrowseDataResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUDefFileRequest.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUDefFileRequest.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUDefFileResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUDefFileResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileAccessRequest.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileAccessRequest.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileAccessResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileAccessResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileCreateRequest.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileCreateRequest.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileCreateResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileCreateResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFilePublishRequest.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFilePublishRequest.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFilePublishResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFilePublishResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileViewRequest.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileViewRequest.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileViewResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileViewResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUGetDataColumnsRequest.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUGetDataColumnsRequest.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUGetDataColumnsResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUGetDataColumnsResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUGetFileMetaDataRequest.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUGetFileMetaDataRequest.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUGetFileMetaDataResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUGetFileMetaDataResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUInfoRequest.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUInfoRequest.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUInfoResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUInfoResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUQueryRequest.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUQueryRequest.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUQueryResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUQueryResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFURecordTypeInfoRequest.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFURecordTypeInfoRequest.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFURecordTypeInfoResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFURecordTypeInfoResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSearchDataRequest.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSearchDataRequest.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSearchDataResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSearchDataResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSearchRequest.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSearchRequest.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSearchResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSearchResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSpaceRequest.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSpaceRequest.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSpaceResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUSpaceResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EclRecordTypeInfoRequest.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EclRecordTypeInfoRequest.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EclRecordTypeInfoResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EclRecordTypeInfoResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EraseHistoryRequest.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EraseHistoryRequest.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EraseHistoryResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EraseHistoryResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.Exceptions.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.Exceptions.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ListHistoryRequest.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ListHistoryRequest.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ListHistoryResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.ListHistoryResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SavexmlRequest.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SavexmlRequest.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SavexmlResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SavexmlResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SuperfileActionRequest.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SuperfileActionRequest.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SuperfileActionResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SuperfileActionResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SuperfileListRequest.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SuperfileListRequest.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SuperfileListResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SuperfileListResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfuPingRequest.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfuPingRequest.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfuPingResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfuPingResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
    return null;
  }
}

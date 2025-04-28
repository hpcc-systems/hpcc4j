/**
 * WsWorkunitsStub.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:49:45 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69;

/*
 *  WsWorkunitsStub java implementation
 */

public class WsWorkunitsStub extends org.apache.axis2.client.Stub implements WsWorkunits {
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
    _service = new org.apache.axis2.description.AxisService("WsWorkunits" + getUniqueSuffix());
    addAnonymousOperations();

    // creating the operations
    org.apache.axis2.description.AxisOperation __operation;

    _operations = new org.apache.axis2.description.AxisOperation[69];

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUQuerysetAliasAction"));
    _service.addOperation(__operation);

    _operations[0] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUGetStats"));
    _service.addOperation(__operation);

    _operations[1] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUQueryDetails"));
    _service.addOperation(__operation);

    _operations[2] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUListArchiveFiles"));
    _service.addOperation(__operation);

    _operations[3] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUCopyQuerySet"));
    _service.addOperation(__operation);

    _operations[4] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUPublishWorkunit"));
    _service.addOperation(__operation);

    _operations[5] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUQueryConfig"));
    _service.addOperation(__operation);

    _operations[6] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUCompileECL"));
    _service.addOperation(__operation);

    _operations[7] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUProtect"));
    _service.addOperation(__operation);

    _operations[8] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUListLocalFileRequired"));
    _service.addOperation(__operation);

    _operations[9] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUCheckFeatures"));
    _service.addOperation(__operation);

    _operations[10] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUCreateAndUpdate"));
    _service.addOperation(__operation);

    _operations[11] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUGraphInfo"));
    _service.addOperation(__operation);

    _operations[12] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUGetGraphNameAndTypes"));
    _service.addOperation(__operation);

    _operations[13] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUListQueriesUsingFile"));
    _service.addOperation(__operation);

    _operations[14] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUSyntaxCheckECL"));
    _service.addOperation(__operation);

    _operations[15] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUDeployWorkunit"));
    _service.addOperation(__operation);

    _operations[16] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUCreateZAPInfo"));
    _service.addOperation(__operation);

    _operations[17] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUUpdateQueryEntry"));
    _service.addOperation(__operation);

    _operations[18] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUResultBin"));
    _service.addOperation(__operation);

    _operations[19] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUShowScheduled"));
    _service.addOperation(__operation);

    _operations[20] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUGetArchiveFile"));
    _service.addOperation(__operation);

    _operations[21] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUFullResult"));
    _service.addOperation(__operation);

    _operations[22] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wULightWeightQuery"));
    _service.addOperation(__operation);

    _operations[23] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUQuerysetDetails"));
    _service.addOperation(__operation);

    _operations[24] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUSchedule"));
    _service.addOperation(__operation);

    _operations[25] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUClusterJobQueueLOG"));
    _service.addOperation(__operation);

    _operations[26] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUResultSummary"));
    _service.addOperation(__operation);

    _operations[27] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUQuery"));
    _service.addOperation(__operation);

    _operations[28] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUAbort"));
    _service.addOperation(__operation);

    _operations[29] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUWaitComplete"));
    _service.addOperation(__operation);

    _operations[30] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUResultView"));
    _service.addOperation(__operation);

    _operations[31] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUInfo"));
    _service.addOperation(__operation);

    _operations[32] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUDelete"));
    _service.addOperation(__operation);

    _operations[33] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUCopyLogicalFiles"));
    _service.addOperation(__operation);

    _operations[34] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUClusterJobSummaryXLS"));
    _service.addOperation(__operation);

    _operations[35] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUGetGraph"));
    _service.addOperation(__operation);

    _operations[36] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUGetNumFileToCopy"));
    _service.addOperation(__operation);

    _operations[37] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUCDebug"));
    _service.addOperation(__operation);

    _operations[38] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUUpdate"));
    _service.addOperation(__operation);

    _operations[39] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUGetDependancyTrees"));
    _service.addOperation(__operation);

    _operations[40] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUQuerysetQueryAction"));
    _service.addOperation(__operation);

    _operations[41] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUWaitCompiled"));
    _service.addOperation(__operation);

    _operations[42] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUResubmit"));
    _service.addOperation(__operation);

    _operations[43] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUGraphTiming"));
    _service.addOperation(__operation);

    _operations[44] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUGVCGraphInfo"));
    _service.addOperation(__operation);

    _operations[45] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUResult"));
    _service.addOperation(__operation);

    _operations[46] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUQuerysets"));
    _service.addOperation(__operation);

    _operations[47] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "gVCAjaxGraph"));
    _service.addOperation(__operation);

    _operations[48] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUProcessGraph"));
    _service.addOperation(__operation);

    _operations[49] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUExport"));
    _service.addOperation(__operation);

    _operations[50] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ping"));
    _service.addOperation(__operation);

    _operations[51] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUInfoDetails"));
    _service.addOperation(__operation);

    _operations[52] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUJobList"));
    _service.addOperation(__operation);

    _operations[53] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUCreate"));
    _service.addOperation(__operation);

    _operations[54] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUAction"));
    _service.addOperation(__operation);

    _operations[55] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUListQueries"));
    _service.addOperation(__operation);

    _operations[56] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUQueryFiles"));
    _service.addOperation(__operation);

    _operations[57] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUQueryGetGraph"));
    _service.addOperation(__operation);

    _operations[58] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUClusterJobXLS"));
    _service.addOperation(__operation);

    _operations[59] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wURun"));
    _service.addOperation(__operation);

    _operations[60] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUFile"));
    _service.addOperation(__operation);

    _operations[61] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUQuerysetCopyQuery"));
    _service.addOperation(__operation);

    _operations[62] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUGetZAPInfo"));
    _service.addOperation(__operation);

    _operations[63] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUClusterJobQueueXLS"));
    _service.addOperation(__operation);

    _operations[64] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUMultiQuerysetDetails"));
    _service.addOperation(__operation);

    _operations[65] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName(
            "urn:hpccsystems:ws:wsworkunits", "wUAddLocalFileToWorkunit"));
    _service.addOperation(__operation);

    _operations[66] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUPushEvent"));
    _service.addOperation(__operation);

    _operations[67] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUSubmit"));
    _service.addOperation(__operation);

    _operations[68] = __operation;
  }

  // populates the faults
  private void populateFaults() {

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUQuerysetAliasAction"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUQuerysetAliasAction"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUQuerysetAliasAction"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUGetStats"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUGetStats"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUGetStats"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUQueryDetails"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUQueryDetails"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUQueryDetails"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUListArchiveFiles"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUListArchiveFiles"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUListArchiveFiles"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUCopyQuerySet"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUCopyQuerySet"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUCopyQuerySet"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUPublishWorkunit"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUPublishWorkunit"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUPublishWorkunit"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUQueryConfig"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUQueryConfig"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUQueryConfig"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUCompileECL"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUCompileECL"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUCompileECL"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUProtect"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUProtect"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUProtect"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUListLocalFileRequired"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUListLocalFileRequired"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUListLocalFileRequired"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUCheckFeatures"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUCheckFeatures"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUCheckFeatures"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUCreateAndUpdate"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUCreateAndUpdate"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUCreateAndUpdate"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUGraphInfo"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUGraphInfo"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUGraphInfo"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUGetGraphNameAndTypes"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUGetGraphNameAndTypes"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUGetGraphNameAndTypes"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUListQueriesUsingFile"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUListQueriesUsingFile"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUListQueriesUsingFile"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUSyntaxCheckECL"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUSyntaxCheckECL"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUSyntaxCheckECL"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUDeployWorkunit"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUDeployWorkunit"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUDeployWorkunit"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUCreateZAPInfo"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUCreateZAPInfo"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUCreateZAPInfo"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUUpdateQueryEntry"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUUpdateQueryEntry"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUUpdateQueryEntry"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUResultBin"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUResultBin"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUResultBin"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUShowScheduled"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUShowScheduled"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUShowScheduled"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUGetArchiveFile"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUGetArchiveFile"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUGetArchiveFile"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUFullResult"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUFullResult"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUFullResult"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WULightWeightQuery"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WULightWeightQuery"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WULightWeightQuery"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUQuerysetDetails"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUQuerysetDetails"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUQuerysetDetails"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUSchedule"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUSchedule"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUSchedule"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUClusterJobQueueLOG"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUClusterJobQueueLOG"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUClusterJobQueueLOG"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUResultSummary"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUResultSummary"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUResultSummary"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUQuery"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUQuery"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUQuery"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUAbort"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUAbort"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUAbort"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUWaitComplete"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUWaitComplete"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUWaitComplete"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUResultView"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUResultView"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUResultView"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUInfo"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUInfo"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUInfo"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUDelete"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUDelete"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUDelete"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUCopyLogicalFiles"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUCopyLogicalFiles"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUCopyLogicalFiles"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUClusterJobSummaryXLS"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUClusterJobSummaryXLS"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUClusterJobSummaryXLS"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUGetGraph"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUGetGraph"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUGetGraph"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUGetNumFileToCopy"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUGetNumFileToCopy"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUGetNumFileToCopy"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUCDebug"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUCDebug"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUCDebug"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUUpdate"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUUpdate"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUUpdate"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUGetDependancyTrees"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUGetDependancyTrees"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUGetDependancyTrees"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUQuerysetQueryAction"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUQuerysetQueryAction"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUQuerysetQueryAction"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUWaitCompiled"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUWaitCompiled"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUWaitCompiled"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUResubmit"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUResubmit"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUResubmit"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUGraphTiming"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUGraphTiming"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUGraphTiming"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUGVCGraphInfo"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUGVCGraphInfo"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUGVCGraphInfo"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUResult"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUResult"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUResult"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUQuerysets"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUQuerysets"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUQuerysets"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "GVCAjaxGraph"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "GVCAjaxGraph"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "GVCAjaxGraph"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUProcessGraph"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUProcessGraph"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUProcessGraph"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUExport"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUExport"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUExport"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"), "Ping"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"), "Ping"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"), "Ping"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUInfoDetails"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUInfoDetails"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUInfoDetails"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUJobList"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUJobList"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUJobList"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUCreate"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUCreate"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUCreate"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUAction"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUAction"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUAction"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUListQueries"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUListQueries"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUListQueries"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUQueryFiles"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUQueryFiles"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUQueryFiles"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUQueryGetGraph"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUQueryGetGraph"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUQueryGetGraph"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUClusterJobXLS"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUClusterJobXLS"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUClusterJobXLS"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WURun"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WURun"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"), "WURun"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUFile"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUFile"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUFile"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUQuerysetCopyQuery"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUQuerysetCopyQuery"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUQuerysetCopyQuery"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUGetZAPInfo"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUGetZAPInfo"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUGetZAPInfo"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUClusterJobQueueXLS"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUClusterJobQueueXLS"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUClusterJobQueueXLS"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUMultiQuerysetDetails"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUMultiQuerysetDetails"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUMultiQuerysetDetails"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUAddLocalFileToWorkunit"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUAddLocalFileToWorkunit"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUAddLocalFileToWorkunit"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUPushEvent"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUPushEvent"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUPushEvent"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUSubmit"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUSubmit"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Exceptions"),
            "WUSubmit"),
        "org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions");
  }

  /** Constructor that takes in a configContext */
  public WsWorkunitsStub(
      org.apache.axis2.context.ConfigurationContext configurationContext,
      java.lang.String targetEndpoint)
      throws org.apache.axis2.AxisFault {
    this(configurationContext, targetEndpoint, false);
  }

  /** Constructor that takes in a configContext and useseperate listner */
  public WsWorkunitsStub(
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
  public WsWorkunitsStub(org.apache.axis2.context.ConfigurationContext configurationContext)
      throws org.apache.axis2.AxisFault {

    this(configurationContext, "http://10.173.160.101:8010/WsWorkunits?ver_=1.69");
  }

  /** Default Constructor */
  public WsWorkunitsStub() throws org.apache.axis2.AxisFault {

    this("http://10.173.160.101:8010/WsWorkunits?ver_=1.69");
  }

  /** Constructor taking the target endpoint */
  public WsWorkunitsStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
    this(null, targetEndpoint);
  }

  /**
   * Auto generated method signature
   *
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUQuerysetAliasAction
   * @param wUQuerysetAliasAction3
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerySetAliasActionResponse
      wUQuerysetAliasAction(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysetAliasAction
              wUQuerysetAliasAction3)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[0].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUQuerysetAliasAction?ver_=1.69");
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
              wUQuerysetAliasAction3,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsworkunits", "wUQuerysetAliasAction")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wsworkunits", "WUQuerysetAliasAction"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerySetAliasActionResponse
                  .class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerySetAliasActionResponse)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(
                faultElt.getQName(), "WUQuerysetAliasAction"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUQuerysetAliasAction"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUQuerysetAliasAction"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUGetStats
   * @param wUGetStats5
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetStatsResponse wUGetStats(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetStats wUGetStats5)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[1].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUGetStats?ver_=1.69");
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
              wUGetStats5,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUGetStats")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUGetStats"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetStatsResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetStatsResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUGetStats"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUGetStats"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUGetStats"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUQueryDetails
   * @param wUQueryDetails7
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryDetailsResponse
      wUQueryDetails(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryDetails wUQueryDetails7)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[2].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUQueryDetails?ver_=1.69");
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
              wUQueryDetails7,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsworkunits", "wUQueryDetails")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQueryDetails"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryDetailsResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryDetailsResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUQueryDetails"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUQueryDetails"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUQueryDetails"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUListArchiveFiles
   * @param wUListArchiveFiles9
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListArchiveFilesResponse
      wUListArchiveFiles(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListArchiveFiles
              wUListArchiveFiles9)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[3].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUListArchiveFiles?ver_=1.69");
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
              wUListArchiveFiles9,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsworkunits", "wUListArchiveFiles")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wsworkunits", "WUListArchiveFiles"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListArchiveFilesResponse
                  .class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListArchiveFilesResponse)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUListArchiveFiles"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUListArchiveFiles"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUListArchiveFiles"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUCopyQuerySet
   * @param wUCopyQuerySet11
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCopyQuerySetResponse
      wUCopyQuerySet(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCopyQuerySet wUCopyQuerySet11)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[4].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUCopyQuerySet?ver_=1.69");
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
              wUCopyQuerySet11,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsworkunits", "wUCopyQuerySet")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUCopyQuerySet"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCopyQuerySetResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCopyQuerySetResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUCopyQuerySet"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUCopyQuerySet"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUCopyQuerySet"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUPublishWorkunit
   * @param wUPublishWorkunit13
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUPublishWorkunitResponse
      wUPublishWorkunit(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUPublishWorkunit
              wUPublishWorkunit13)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[5].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUPublishWorkunit?ver_=1.69");
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
              wUPublishWorkunit13,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsworkunits", "wUPublishWorkunit")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUPublishWorkunit"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUPublishWorkunitResponse
                  .class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUPublishWorkunitResponse)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUPublishWorkunit"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUPublishWorkunit"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUPublishWorkunit"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUQueryConfig
   * @param wUQueryConfig15
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryConfigResponse wUQueryConfig(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryConfig wUQueryConfig15)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[6].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUQueryConfig?ver_=1.69");
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
              wUQueryConfig15,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUQueryConfig")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQueryConfig"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryConfigResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryConfigResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUQueryConfig"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUQueryConfig"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUQueryConfig"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUCompileECL
   * @param wUCompileECL17
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCompileECLResponse wUCompileECL(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCompileECL wUCompileECL17)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[7].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUCompileECL?ver_=1.69");
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
              wUCompileECL17,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUCompileECL")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUCompileECL"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCompileECLResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCompileECLResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUCompileECL"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUCompileECL"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUCompileECL"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUProtect
   * @param wUProtect19
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUProtectResponse wUProtect(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUProtect wUProtect19)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[8].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUProtect?ver_=1.69");
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
              wUProtect19,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUProtect")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUProtect"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUProtectResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUProtectResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUProtect"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUProtect"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUProtect"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUListLocalFileRequired
   * @param wUListLocalFileRequired21
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListLocalFileRequiredResponse
      wUListLocalFileRequired(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListLocalFileRequired
              wUListLocalFileRequired21)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[9].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUListLocalFileRequired?ver_=1.69");
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
              wUListLocalFileRequired21,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsworkunits", "wUListLocalFileRequired")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wsworkunits", "WUListLocalFileRequired"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListLocalFileRequiredResponse
                  .class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListLocalFileRequiredResponse)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(
                faultElt.getQName(), "WUListLocalFileRequired"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUListLocalFileRequired"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUListLocalFileRequired"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUCheckFeatures
   * @param wUCheckFeatures23
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCheckFeaturesResponse
      wUCheckFeatures(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCheckFeatures wUCheckFeatures23)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[10].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUCheckFeatures?ver_=1.69");
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
              wUCheckFeatures23,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsworkunits", "wUCheckFeatures")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUCheckFeatures"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCheckFeaturesResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCheckFeaturesResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUCheckFeatures"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUCheckFeatures"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUCheckFeatures"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUCreateAndUpdate
   * @param wUCreateAndUpdate25
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUUpdateResponse wUCreateAndUpdate(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreateAndUpdate wUCreateAndUpdate25)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[11].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUCreateAndUpdate?ver_=1.69");
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
              wUCreateAndUpdate25,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsworkunits", "wUCreateAndUpdate")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUCreateAndUpdate"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUUpdateResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUUpdateResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUCreateAndUpdate"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUCreateAndUpdate"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUCreateAndUpdate"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUGraphInfo
   * @param wUGraphInfo27
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGraphInfoResponse wUGraphInfo(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGraphInfo wUGraphInfo27)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[12].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUGraphInfo?ver_=1.69");
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
              wUGraphInfo27,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUGraphInfo")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUGraphInfo"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGraphInfoResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGraphInfoResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUGraphInfo"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUGraphInfo"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUGraphInfo"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUGetGraphNameAndTypes
   * @param wUGetGraphNameAndTypes29
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetGraphNameAndTypesResponse
      wUGetGraphNameAndTypes(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetGraphNameAndTypes
              wUGetGraphNameAndTypes29)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[13].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUGetGraphNameAndTypes?ver_=1.69");
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
              wUGetGraphNameAndTypes29,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsworkunits", "wUGetGraphNameAndTypes")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wsworkunits", "WUGetGraphNameAndTypes"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetGraphNameAndTypesResponse
                  .class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetGraphNameAndTypesResponse)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(
                faultElt.getQName(), "WUGetGraphNameAndTypes"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUGetGraphNameAndTypes"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUGetGraphNameAndTypes"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUListQueriesUsingFile
   * @param wUListQueriesUsingFile31
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListQueriesUsingFileResponse
      wUListQueriesUsingFile(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListQueriesUsingFile
              wUListQueriesUsingFile31)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[14].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUListQueriesUsingFile?ver_=1.69");
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
              wUListQueriesUsingFile31,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsworkunits", "wUListQueriesUsingFile")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wsworkunits", "WUListQueriesUsingFile"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListQueriesUsingFileResponse
                  .class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListQueriesUsingFileResponse)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(
                faultElt.getQName(), "WUListQueriesUsingFile"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUListQueriesUsingFile"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUListQueriesUsingFile"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUSyntaxCheckECL
   * @param wUSyntaxCheckECL33
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUSyntaxCheckResponse
      wUSyntaxCheckECL(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUSyntaxCheckECL wUSyntaxCheckECL33)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[15].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUSyntaxCheckECL?ver_=1.69");
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
              wUSyntaxCheckECL33,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsworkunits", "wUSyntaxCheckECL")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUSyntaxCheckECL"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUSyntaxCheckResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUSyntaxCheckResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUSyntaxCheckECL"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUSyntaxCheckECL"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUSyntaxCheckECL"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUDeployWorkunit
   * @param wUDeployWorkunit35
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUDeployWorkunitResponse
      wUDeployWorkunit(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUDeployWorkunit wUDeployWorkunit35)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[16].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUDeployWorkunit?ver_=1.69");
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
              wUDeployWorkunit35,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsworkunits", "wUDeployWorkunit")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUDeployWorkunit"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUDeployWorkunitResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUDeployWorkunitResponse)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUDeployWorkunit"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUDeployWorkunit"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUDeployWorkunit"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUCreateZAPInfo
   * @param wUCreateZAPInfo37
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreateZAPInfoResponse
      wUCreateZAPInfo(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreateZAPInfo wUCreateZAPInfo37)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[17].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUCreateZAPInfo?ver_=1.69");
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
              wUCreateZAPInfo37,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsworkunits", "wUCreateZAPInfo")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUCreateZAPInfo"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreateZAPInfoResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreateZAPInfoResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUCreateZAPInfo"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUCreateZAPInfo"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUCreateZAPInfo"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUUpdateQueryEntry
   * @param wUUpdateQueryEntry39
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUUpdateQueryEntryResponse
      wUUpdateQueryEntry(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUUpdateQueryEntry
              wUUpdateQueryEntry39)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[18].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUUpdateQueryEntry?ver_=1.69");
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
              wUUpdateQueryEntry39,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsworkunits", "wUUpdateQueryEntry")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wsworkunits", "WUUpdateQueryEntry"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUUpdateQueryEntryResponse
                  .class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUUpdateQueryEntryResponse)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUUpdateQueryEntry"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUUpdateQueryEntry"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUUpdateQueryEntry"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUResultBin
   * @param wUResultBin41
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultBinResponse wUResultBin(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultBin wUResultBin41)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[19].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUResultBin?ver_=1.69");
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
              wUResultBin41,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUResultBin")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUResultBin"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultBinResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultBinResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUResultBin"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUResultBin"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUResultBin"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUShowScheduled
   * @param wUShowScheduled43
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUShowScheduledResponse
      wUShowScheduled(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUShowScheduled wUShowScheduled43)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[20].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUShowScheduled?ver_=1.69");
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
              wUShowScheduled43,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsworkunits", "wUShowScheduled")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUShowScheduled"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUShowScheduledResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUShowScheduledResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUShowScheduled"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUShowScheduled"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUShowScheduled"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUGetArchiveFile
   * @param wUGetArchiveFile45
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetArchiveFileResponse
      wUGetArchiveFile(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetArchiveFile wUGetArchiveFile45)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[21].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUGetArchiveFile?ver_=1.69");
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
              wUGetArchiveFile45,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsworkunits", "wUGetArchiveFile")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUGetArchiveFile"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetArchiveFileResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetArchiveFileResponse)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUGetArchiveFile"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUGetArchiveFile"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUGetArchiveFile"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUFullResult
   * @param wUFullResult47
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUFullResultResponse wUFullResult(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUFullResult wUFullResult47)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[22].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUFullResult?ver_=1.69");
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
              wUFullResult47,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUFullResult")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUFullResult"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUFullResultResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUFullResultResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUFullResult"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUFullResult"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUFullResult"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wULightWeightQuery
   * @param wULightWeightQuery49
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WULightWeightQueryResponse
      wULightWeightQuery(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WULightWeightQuery
              wULightWeightQuery49)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[23].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WULightWeightQuery?ver_=1.69");
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
              wULightWeightQuery49,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsworkunits", "wULightWeightQuery")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wsworkunits", "WULightWeightQuery"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WULightWeightQueryResponse
                  .class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WULightWeightQueryResponse)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WULightWeightQuery"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WULightWeightQuery"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WULightWeightQuery"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUQuerysetDetails
   * @param wUQuerysetDetails51
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerySetDetailsResponse
      wUQuerysetDetails(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysetDetails
              wUQuerysetDetails51)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[24].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUQuerysetDetails?ver_=1.69");
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
              wUQuerysetDetails51,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsworkunits", "wUQuerysetDetails")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQuerysetDetails"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerySetDetailsResponse
                  .class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerySetDetailsResponse)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUQuerysetDetails"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUQuerysetDetails"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUQuerysetDetails"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUSchedule
   * @param wUSchedule53
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUScheduleResponse wUSchedule(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUSchedule wUSchedule53)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[25].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUSchedule?ver_=1.69");
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
              wUSchedule53,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUSchedule")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUSchedule"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUScheduleResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUScheduleResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUSchedule"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUSchedule"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUSchedule"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUClusterJobQueueLOG
   * @param wUClusterJobQueueLOG55
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobQueueLOGResponse
      wUClusterJobQueueLOG(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobQueueLOG
              wUClusterJobQueueLOG55)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[26].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUClusterJobQueueLOG?ver_=1.69");
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
              wUClusterJobQueueLOG55,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsworkunits", "wUClusterJobQueueLOG")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wsworkunits", "WUClusterJobQueueLOG"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobQueueLOGResponse
                  .class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobQueueLOGResponse)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUClusterJobQueueLOG"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUClusterJobQueueLOG"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUClusterJobQueueLOG"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUResultSummary
   * @param wUResultSummary57
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultSummaryResponse
      wUResultSummary(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultSummary wUResultSummary57)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[27].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUResultSummary?ver_=1.69");
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
              wUResultSummary57,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsworkunits", "wUResultSummary")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUResultSummary"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultSummaryResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultSummaryResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUResultSummary"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUResultSummary"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUResultSummary"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUQuery
   * @param wUQuery59
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryResponse wUQuery(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuery wUQuery59)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[28].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUQuery?ver_=1.69");
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
              wUQuery59,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUQuery")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQuery"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUQuery"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUQuery"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUQuery"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUAbort
   * @param wUAbort61
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUAbortResponse wUAbort(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUAbort wUAbort61)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[29].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUAbort?ver_=1.69");
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
              wUAbort61,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUAbort")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUAbort"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUAbortResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUAbortResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUAbort"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUAbort"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUAbort"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUWaitComplete
   * @param wUWaitComplete63
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUWaitResponse wUWaitComplete(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUWaitComplete wUWaitComplete63)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[30].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUWaitComplete?ver_=1.69");
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
              wUWaitComplete63,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsworkunits", "wUWaitComplete")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUWaitComplete"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUWaitResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUWaitResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUWaitComplete"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUWaitComplete"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUWaitComplete"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUResultView
   * @param wUResultView65
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultViewResponse wUResultView(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultView wUResultView65)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[31].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUResultView?ver_=1.69");
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
              wUResultView65,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUResultView")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUResultView"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultViewResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultViewResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUResultView"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUResultView"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUResultView"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUInfo
   * @param wUInfo67
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUInfoResponse wUInfo(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUInfo wUInfo67)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[32].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUInfo?ver_=1.69");
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
              wUInfo67,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUInfo")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUInfo"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUInfoResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUInfoResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUInfo"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUInfo"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUInfo"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUDelete
   * @param wUDelete69
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUDeleteResponse wUDelete(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUDelete wUDelete69)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[33].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUDelete?ver_=1.69");
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
              wUDelete69,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUDelete")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUDelete"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUDeleteResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUDeleteResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUDelete"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUDelete"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUDelete"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUCopyLogicalFiles
   * @param wUCopyLogicalFiles71
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCopyLogicalFilesResponse
      wUCopyLogicalFiles(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCopyLogicalFiles
              wUCopyLogicalFiles71)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[34].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUCopyLogicalFiles?ver_=1.69");
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
              wUCopyLogicalFiles71,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsworkunits", "wUCopyLogicalFiles")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wsworkunits", "WUCopyLogicalFiles"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCopyLogicalFilesResponse
                  .class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCopyLogicalFilesResponse)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUCopyLogicalFiles"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUCopyLogicalFiles"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUCopyLogicalFiles"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUClusterJobSummaryXLS
   * @param wUClusterJobSummaryXLS73
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobSummaryXLSResponse
      wUClusterJobSummaryXLS(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobSummaryXLS
              wUClusterJobSummaryXLS73)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[35].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUClusterJobSummaryXLS?ver_=1.69");
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
              wUClusterJobSummaryXLS73,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsworkunits", "wUClusterJobSummaryXLS")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wsworkunits", "WUClusterJobSummaryXLS"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobSummaryXLSResponse
                  .class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobSummaryXLSResponse)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(
                faultElt.getQName(), "WUClusterJobSummaryXLS"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUClusterJobSummaryXLS"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUClusterJobSummaryXLS"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUGetGraph
   * @param wUGetGraph75
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetGraphResponse wUGetGraph(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetGraph wUGetGraph75)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[36].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUGetGraph?ver_=1.69");
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
              wUGetGraph75,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUGetGraph")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUGetGraph"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetGraphResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetGraphResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUGetGraph"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUGetGraph"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUGetGraph"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUGetNumFileToCopy
   * @param wUGetNumFileToCopy77
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetNumFileToCopyResponse
      wUGetNumFileToCopy(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetNumFileToCopy
              wUGetNumFileToCopy77)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[37].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUGetNumFileToCopy?ver_=1.69");
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
              wUGetNumFileToCopy77,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsworkunits", "wUGetNumFileToCopy")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wsworkunits", "WUGetNumFileToCopy"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetNumFileToCopyResponse
                  .class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetNumFileToCopyResponse)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUGetNumFileToCopy"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUGetNumFileToCopy"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUGetNumFileToCopy"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUCDebug
   * @param wUCDebug79
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUDebugResponse wUCDebug(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCDebug wUCDebug79)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[38].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUCDebug?ver_=1.69");
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
              wUCDebug79,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUCDebug")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUCDebug"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUDebugResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUDebugResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUCDebug"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUCDebug"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUCDebug"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUUpdate
   * @param wUUpdate81
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUUpdateResponse wUUpdate(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUUpdate wUUpdate81)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[39].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUUpdate?ver_=1.69");
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
              wUUpdate81,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUUpdate")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUUpdate"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUUpdateResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUUpdateResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUUpdate"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUUpdate"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUUpdate"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUGetDependancyTrees
   * @param wUGetDependancyTrees83
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetDependancyTreesResponse
      wUGetDependancyTrees(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetDependancyTrees
              wUGetDependancyTrees83)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[40].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUGetDependancyTrees?ver_=1.69");
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
              wUGetDependancyTrees83,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsworkunits", "wUGetDependancyTrees")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wsworkunits", "WUGetDependancyTrees"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetDependancyTreesResponse
                  .class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetDependancyTreesResponse)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUGetDependancyTrees"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUGetDependancyTrees"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUGetDependancyTrees"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUQuerysetQueryAction
   * @param wUQuerysetQueryAction85
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerySetQueryActionResponse
      wUQuerysetQueryAction(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysetQueryAction
              wUQuerysetQueryAction85)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[41].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUQuerysetQueryAction?ver_=1.69");
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
              wUQuerysetQueryAction85,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsworkunits", "wUQuerysetQueryAction")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wsworkunits", "WUQuerysetQueryAction"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerySetQueryActionResponse
                  .class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerySetQueryActionResponse)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(
                faultElt.getQName(), "WUQuerysetQueryAction"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUQuerysetQueryAction"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUQuerysetQueryAction"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUWaitCompiled
   * @param wUWaitCompiled87
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUWaitResponse wUWaitCompiled(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUWaitCompiled wUWaitCompiled87)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[42].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUWaitCompiled?ver_=1.69");
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
              wUWaitCompiled87,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsworkunits", "wUWaitCompiled")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUWaitCompiled"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUWaitResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUWaitResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUWaitCompiled"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUWaitCompiled"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUWaitCompiled"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUResubmit
   * @param wUResubmit89
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResubmitResponse wUResubmit(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResubmit wUResubmit89)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[43].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUResubmit?ver_=1.69");
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
              wUResubmit89,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUResubmit")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUResubmit"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResubmitResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResubmitResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUResubmit"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUResubmit"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUResubmit"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUGraphTiming
   * @param wUGraphTiming91
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGraphTimingResponse wUGraphTiming(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGraphTiming wUGraphTiming91)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[44].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUGraphTiming?ver_=1.69");
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
              wUGraphTiming91,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUGraphTiming")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUGraphTiming"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGraphTimingResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGraphTimingResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUGraphTiming"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUGraphTiming"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUGraphTiming"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUGVCGraphInfo
   * @param wUGVCGraphInfo93
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGVCGraphInfoResponse
      wUGVCGraphInfo(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGVCGraphInfo wUGVCGraphInfo93)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[45].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUGVCGraphInfo?ver_=1.69");
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
              wUGVCGraphInfo93,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsworkunits", "wUGVCGraphInfo")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUGVCGraphInfo"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGVCGraphInfoResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGVCGraphInfoResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUGVCGraphInfo"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUGVCGraphInfo"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUGVCGraphInfo"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUResult
   * @param wUResult95
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultResponse wUResult(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResult wUResult95)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[46].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUResult?ver_=1.69");
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
              wUResult95,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUResult")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUResult"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUResult"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUResult"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUResult"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUQuerysets
   * @param wUQuerysets97
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysetsResponse wUQuerysets(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysets wUQuerysets97)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[47].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUQuerysets?ver_=1.69");
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
              wUQuerysets97,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUQuerysets")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQuerysets"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysetsResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysetsResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUQuerysets"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUQuerysets"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUQuerysets"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#gVCAjaxGraph
   * @param gVCAjaxGraph99
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.GVCAjaxGraphResponse gVCAjaxGraph(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.GVCAjaxGraph gVCAjaxGraph99)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[48].getName());
      _operationClient.getOptions().setAction("WsWorkunits/GVCAjaxGraph?ver_=1.69");
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
              gVCAjaxGraph99,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "gVCAjaxGraph")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "GVCAjaxGraph"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.GVCAjaxGraphResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.GVCAjaxGraphResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GVCAjaxGraph"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GVCAjaxGraph"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GVCAjaxGraph"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUProcessGraph
   * @param wUProcessGraph101
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUProcessGraphResponse
      wUProcessGraph(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUProcessGraph wUProcessGraph101)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[49].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUProcessGraph?ver_=1.69");
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
              wUProcessGraph101,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsworkunits", "wUProcessGraph")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUProcessGraph"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUProcessGraphResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUProcessGraphResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUProcessGraph"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUProcessGraph"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUProcessGraph"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUExport
   * @param wUExport103
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUExportResponse wUExport(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUExport wUExport103)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[50].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUExport?ver_=1.69");
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
              wUExport103,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUExport")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUExport"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUExportResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUExportResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUExport"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUExport"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUExport"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#ping
   * @param ping105
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunitsPingResponse ping(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Ping ping105)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[51].getName());
      _operationClient.getOptions().setAction("WsWorkunits/Ping?ver_=1.69");
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
              ping105,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "ping")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "Ping"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunitsPingResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunitsPingResponse) object;

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

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUInfoDetails
   * @param wUInfoDetails107
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUInfoResponse wUInfoDetails(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUInfoDetails wUInfoDetails107)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[52].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUInfoDetails?ver_=1.69");
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
              wUInfoDetails107,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUInfoDetails")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUInfoDetails"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUInfoResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUInfoResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUInfoDetails"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUInfoDetails"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUInfoDetails"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUJobList
   * @param wUJobList109
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUJobListResponse wUJobList(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUJobList wUJobList109)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[53].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUJobList?ver_=1.69");
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
              wUJobList109,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUJobList")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUJobList"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUJobListResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUJobListResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUJobList"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUJobList"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUJobList"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUCreate
   * @param wUCreate111
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreateResponse wUCreate(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreate wUCreate111)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[54].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUCreate?ver_=1.69");
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
              wUCreate111,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUCreate")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUCreate"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreateResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreateResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUCreate"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUCreate"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUCreate"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUAction
   * @param wUAction113
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUActionResponse wUAction(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUAction wUAction113)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[55].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUAction?ver_=1.69");
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
              wUAction113,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUAction")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUAction"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUActionResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUActionResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUAction"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUAction"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUAction"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUListQueries
   * @param wUListQueries115
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListQueriesResponse wUListQueries(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListQueries wUListQueries115)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[56].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUListQueries?ver_=1.69");
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
              wUListQueries115,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUListQueries")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUListQueries"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListQueriesResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListQueriesResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUListQueries"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUListQueries"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUListQueries"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUQueryFiles
   * @param wUQueryFiles117
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryFilesResponse wUQueryFiles(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryFiles wUQueryFiles117)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[57].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUQueryFiles?ver_=1.69");
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
              wUQueryFiles117,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUQueryFiles")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQueryFiles"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryFilesResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryFilesResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUQueryFiles"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUQueryFiles"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUQueryFiles"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUQueryGetGraph
   * @param wUQueryGetGraph119
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryGetGraphResponse
      wUQueryGetGraph(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryGetGraph wUQueryGetGraph119)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[58].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUQueryGetGraph?ver_=1.69");
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
              wUQueryGetGraph119,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsworkunits", "wUQueryGetGraph")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUQueryGetGraph"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryGetGraphResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryGetGraphResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUQueryGetGraph"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUQueryGetGraph"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUQueryGetGraph"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUClusterJobXLS
   * @param wUClusterJobXLS121
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobXLSResponse
      wUClusterJobXLS(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobXLS wUClusterJobXLS121)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[59].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUClusterJobXLS?ver_=1.69");
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
              wUClusterJobXLS121,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsworkunits", "wUClusterJobXLS")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUClusterJobXLS"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobXLSResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobXLSResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUClusterJobXLS"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUClusterJobXLS"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUClusterJobXLS"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wURun
   * @param wURun123
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WURunResponse wURun(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WURun wURun123)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[60].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WURun?ver_=1.69");
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
              wURun123,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wURun")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WURun"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WURunResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WURunResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WURun"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WURun"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WURun"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUFile
   * @param wUFile125
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WULogFileResponse wUFile(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUFile wUFile125)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[61].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUFile?ver_=1.69");
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
              wUFile125,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUFile")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUFile"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WULogFileResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WULogFileResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUFile"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUFile"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUFile"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUQuerysetCopyQuery
   * @param wUQuerysetCopyQuery127
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerySetCopyQueryResponse
      wUQuerysetCopyQuery(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysetCopyQuery
              wUQuerysetCopyQuery127)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[62].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUQuerysetCopyQuery?ver_=1.69");
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
              wUQuerysetCopyQuery127,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsworkunits", "wUQuerysetCopyQuery")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wsworkunits", "WUQuerysetCopyQuery"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerySetCopyQueryResponse
                  .class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerySetCopyQueryResponse)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUQuerysetCopyQuery"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUQuerysetCopyQuery"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUQuerysetCopyQuery"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUGetZAPInfo
   * @param wUGetZAPInfo129
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetZAPInfoResponse wUGetZAPInfo(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetZAPInfo wUGetZAPInfo129)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[63].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUGetZAPInfo?ver_=1.69");
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
              wUGetZAPInfo129,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUGetZAPInfo")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUGetZAPInfo"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetZAPInfoResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetZAPInfoResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUGetZAPInfo"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUGetZAPInfo"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUGetZAPInfo"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUClusterJobQueueXLS
   * @param wUClusterJobQueueXLS131
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobQueueXLSResponse
      wUClusterJobQueueXLS(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobQueueXLS
              wUClusterJobQueueXLS131)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[64].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUClusterJobQueueXLS?ver_=1.69");
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
              wUClusterJobQueueXLS131,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsworkunits", "wUClusterJobQueueXLS")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wsworkunits", "WUClusterJobQueueXLS"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobQueueXLSResponse
                  .class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobQueueXLSResponse)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUClusterJobQueueXLS"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUClusterJobQueueXLS"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUClusterJobQueueXLS"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUMultiQuerysetDetails
   * @param wUMultiQuerysetDetails133
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUMultiQuerySetDetailsResponse
      wUMultiQuerysetDetails(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUMultiQuerysetDetails
              wUMultiQuerysetDetails133)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[65].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUMultiQuerysetDetails?ver_=1.69");
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
              wUMultiQuerysetDetails133,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsworkunits", "wUMultiQuerysetDetails")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wsworkunits", "WUMultiQuerysetDetails"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUMultiQuerySetDetailsResponse
                  .class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUMultiQuerySetDetailsResponse)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(
                faultElt.getQName(), "WUMultiQuerysetDetails"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUMultiQuerysetDetails"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUMultiQuerysetDetails"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUAddLocalFileToWorkunit
   * @param wUAddLocalFileToWorkunit135
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUAddLocalFileToWorkunitResponse
      wUAddLocalFileToWorkunit(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUAddLocalFileToWorkunit
              wUAddLocalFileToWorkunit135)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[66].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUAddLocalFileToWorkunit?ver_=1.69");
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
              wUAddLocalFileToWorkunit135,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsworkunits", "wUAddLocalFileToWorkunit")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wsworkunits", "WUAddLocalFileToWorkunit"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUAddLocalFileToWorkunitResponse
                  .class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69
              .WUAddLocalFileToWorkunitResponse)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(
                faultElt.getQName(), "WUAddLocalFileToWorkunit"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUAddLocalFileToWorkunit"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "WUAddLocalFileToWorkunit"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUPushEvent
   * @param wUPushEvent137
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUPushEventResponse wUPushEvent(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUPushEvent wUPushEvent137)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[67].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUPushEvent?ver_=1.69");
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
              wUPushEvent137,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUPushEvent")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUPushEvent"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUPushEventResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUPushEventResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUPushEvent"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUPushEvent"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUPushEvent"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunits#wUSubmit
   * @param wUSubmit139
   * @throws org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUSubmitResponse wUSubmit(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUSubmit wUSubmit139)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[68].getName());
      _operationClient.getOptions().setAction("WsWorkunits/WUSubmit?ver_=1.69");
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
              wUSubmit139,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "wUSubmit")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsworkunits", "WUSubmit"));

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
              org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUSubmitResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUSubmitResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUSubmit"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUSubmit"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "WUSubmit"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspSoapFault) ex;
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
  // http://10.173.160.101:8010/WsWorkunits?ver_=1.69
  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysetAliasAction param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysetAliasAction.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerySetAliasActionResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerySetAliasActionResponse
              .MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetStats param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetStats.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetStatsResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetStatsResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryDetails param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryDetails.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryDetailsResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryDetailsResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListArchiveFiles param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListArchiveFiles.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListArchiveFilesResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListArchiveFilesResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCopyQuerySet param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCopyQuerySet.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCopyQuerySetResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCopyQuerySetResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUPublishWorkunit param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUPublishWorkunit.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUPublishWorkunitResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUPublishWorkunitResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryConfig param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryConfig.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryConfigResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryConfigResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCompileECL param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCompileECL.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCompileECLResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCompileECLResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUProtect param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUProtect.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUProtectResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUProtectResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListLocalFileRequired param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListLocalFileRequired.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListLocalFileRequiredResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListLocalFileRequiredResponse
              .MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCheckFeatures param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCheckFeatures.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCheckFeaturesResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCheckFeaturesResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreateAndUpdate param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreateAndUpdate.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUUpdateResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUUpdateResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGraphInfo param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGraphInfo.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGraphInfoResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGraphInfoResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetGraphNameAndTypes param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetGraphNameAndTypes.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetGraphNameAndTypesResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetGraphNameAndTypesResponse
              .MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListQueriesUsingFile param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListQueriesUsingFile.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListQueriesUsingFileResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListQueriesUsingFileResponse
              .MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUSyntaxCheckECL param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUSyntaxCheckECL.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUSyntaxCheckResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUSyntaxCheckResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUDeployWorkunit param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUDeployWorkunit.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUDeployWorkunitResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUDeployWorkunitResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreateZAPInfo param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreateZAPInfo.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreateZAPInfoResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreateZAPInfoResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUUpdateQueryEntry param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUUpdateQueryEntry.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUUpdateQueryEntryResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUUpdateQueryEntryResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultBin param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultBin.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultBinResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultBinResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUShowScheduled param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUShowScheduled.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUShowScheduledResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUShowScheduledResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetArchiveFile param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetArchiveFile.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetArchiveFileResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetArchiveFileResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUFullResult param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUFullResult.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUFullResultResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUFullResultResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WULightWeightQuery param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WULightWeightQuery.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WULightWeightQueryResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WULightWeightQueryResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysetDetails param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysetDetails.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerySetDetailsResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerySetDetailsResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUSchedule param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUSchedule.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUScheduleResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUScheduleResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobQueueLOG param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobQueueLOG.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobQueueLOGResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobQueueLOGResponse
              .MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultSummary param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultSummary.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultSummaryResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultSummaryResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuery param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuery.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUAbort param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUAbort.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUAbortResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUAbortResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUWaitComplete param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUWaitComplete.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUWaitResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUWaitResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultView param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultView.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultViewResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultViewResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUInfo param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUInfo.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUInfoResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUInfoResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUDelete param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUDelete.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUDeleteResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUDeleteResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCopyLogicalFiles param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCopyLogicalFiles.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCopyLogicalFilesResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCopyLogicalFilesResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobSummaryXLS param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobSummaryXLS.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobSummaryXLSResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobSummaryXLSResponse
              .MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetGraph param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetGraph.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetGraphResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetGraphResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetNumFileToCopy param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetNumFileToCopy.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetNumFileToCopyResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetNumFileToCopyResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCDebug param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCDebug.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUDebugResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUDebugResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUUpdate param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUUpdate.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetDependancyTrees param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetDependancyTrees.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetDependancyTreesResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetDependancyTreesResponse
              .MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysetQueryAction param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysetQueryAction.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerySetQueryActionResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerySetQueryActionResponse
              .MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUWaitCompiled param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUWaitCompiled.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResubmit param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResubmit.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResubmitResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResubmitResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGraphTiming param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGraphTiming.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGraphTimingResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGraphTimingResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGVCGraphInfo param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGVCGraphInfo.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGVCGraphInfoResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGVCGraphInfoResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResult param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResult.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysets param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysets.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysetsResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysetsResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.GVCAjaxGraph param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.GVCAjaxGraph.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.GVCAjaxGraphResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.GVCAjaxGraphResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUProcessGraph param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUProcessGraph.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUProcessGraphResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUProcessGraphResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUExport param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUExport.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUExportResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUExportResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Ping param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Ping.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunitsPingResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunitsPingResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUInfoDetails param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUInfoDetails.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUJobList param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUJobList.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUJobListResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUJobListResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreate param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreate.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreateResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreateResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUAction param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUAction.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUActionResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUActionResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListQueries param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListQueries.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListQueriesResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListQueriesResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryFiles param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryFiles.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryFilesResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryFilesResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryGetGraph param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryGetGraph.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryGetGraphResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryGetGraphResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobXLS param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobXLS.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobXLSResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobXLSResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WURun param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WURun.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WURunResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WURunResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUFile param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUFile.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WULogFileResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WULogFileResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysetCopyQuery param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysetCopyQuery.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerySetCopyQueryResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerySetCopyQueryResponse
              .MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetZAPInfo param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetZAPInfo.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetZAPInfoResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetZAPInfoResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobQueueXLS param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobQueueXLS.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobQueueXLSResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobQueueXLSResponse
              .MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUMultiQuerysetDetails param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUMultiQuerysetDetails.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUMultiQuerySetDetailsResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUMultiQuerySetDetailsResponse
              .MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUAddLocalFileToWorkunit param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUAddLocalFileToWorkunit.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUAddLocalFileToWorkunitResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUAddLocalFileToWorkunitResponse
              .MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUPushEvent param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUPushEvent.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUPushEventResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUPushEventResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUSubmit param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUSubmit.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUSubmitResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUSubmitResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysetAliasAction param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysetAliasAction
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
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetStats param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetStats.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryDetails param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryDetails.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListArchiveFiles param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListArchiveFiles.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCopyQuerySet param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCopyQuerySet.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUPublishWorkunit param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUPublishWorkunit.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryConfig param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryConfig.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCompileECL param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCompileECL.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUProtect param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUProtect.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListLocalFileRequired param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListLocalFileRequired
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
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCheckFeatures param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCheckFeatures.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreateAndUpdate param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreateAndUpdate.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGraphInfo param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGraphInfo.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetGraphNameAndTypes param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetGraphNameAndTypes
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
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListQueriesUsingFile param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListQueriesUsingFile
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
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUSyntaxCheckECL param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUSyntaxCheckECL.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUDeployWorkunit param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUDeployWorkunit.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreateZAPInfo param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreateZAPInfo.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUUpdateQueryEntry param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUUpdateQueryEntry.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultBin param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultBin.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUShowScheduled param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUShowScheduled.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetArchiveFile param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetArchiveFile.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUFullResult param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUFullResult.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WULightWeightQuery param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WULightWeightQuery.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysetDetails param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysetDetails.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUSchedule param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUSchedule.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobQueueLOG param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobQueueLOG
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
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultSummary param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultSummary.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuery param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuery.MY_QNAME, factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUAbort param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUAbort.MY_QNAME, factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUWaitComplete param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUWaitComplete.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultView param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultView.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUInfo param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUInfo.MY_QNAME, factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUDelete param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUDelete.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCopyLogicalFiles param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCopyLogicalFiles.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobSummaryXLS param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobSummaryXLS
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
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetGraph param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetGraph.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetNumFileToCopy param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetNumFileToCopy.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCDebug param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCDebug.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUUpdate param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUUpdate.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetDependancyTrees param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetDependancyTrees
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
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysetQueryAction param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysetQueryAction
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
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUWaitCompiled param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUWaitCompiled.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResubmit param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResubmit.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGraphTiming param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGraphTiming.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGVCGraphInfo param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGVCGraphInfo.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResult param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResult.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysets param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysets.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.GVCAjaxGraph param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.GVCAjaxGraph.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUProcessGraph param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUProcessGraph.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUExport param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUExport.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Ping param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Ping.MY_QNAME, factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUInfoDetails param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUInfoDetails.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUJobList param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUJobList.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreate param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreate.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUAction param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUAction.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListQueries param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListQueries.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryFiles param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryFiles.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryGetGraph param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryGetGraph.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobXLS param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobXLS.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WURun param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WURun.MY_QNAME, factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUFile param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUFile.MY_QNAME, factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysetCopyQuery param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysetCopyQuery
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
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetZAPInfo param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetZAPInfo.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobQueueXLS param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobQueueXLS
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
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUMultiQuerysetDetails param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUMultiQuerysetDetails
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
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUAddLocalFileToWorkunit param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUAddLocalFileToWorkunit
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
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUPushEvent param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUPushEvent.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUSubmit param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUSubmit.MY_QNAME,
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

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Exceptions.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.GVCAjaxGraph.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.GVCAjaxGraph.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.GVCAjaxGraphResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.GVCAjaxGraphResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Ping.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.Ping.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunitsPingResponse.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WsWorkunitsPingResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUAbort.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUAbort.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUAbortResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUAbortResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUAction.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUAction.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUActionResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUActionResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUAddLocalFileToWorkunit.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUAddLocalFileToWorkunit.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUAddLocalFileToWorkunitResponse
          .class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUAddLocalFileToWorkunitResponse
                .Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCDebug.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCDebug.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCheckFeatures.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCheckFeatures.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCheckFeaturesResponse.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCheckFeaturesResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobQueueLOG.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobQueueLOG.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobQueueLOGResponse.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobQueueLOGResponse
                .Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobQueueXLS.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobQueueXLS.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobQueueXLSResponse.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobQueueXLSResponse
                .Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobSummaryXLS.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobSummaryXLS.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobSummaryXLSResponse.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobSummaryXLSResponse
                .Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobXLS.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobXLS.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobXLSResponse.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUClusterJobXLSResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCompileECL.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCompileECL.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCompileECLResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCompileECLResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCopyLogicalFiles.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCopyLogicalFiles.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCopyLogicalFilesResponse.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCopyLogicalFilesResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCopyQuerySet.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCopyQuerySet.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCopyQuerySetResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCopyQuerySetResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreate.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreate.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreateAndUpdate.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreateAndUpdate.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreateResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreateResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreateZAPInfo.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreateZAPInfo.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreateZAPInfoResponse.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUCreateZAPInfoResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUDebugResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUDebugResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUDelete.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUDelete.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUDeleteResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUDeleteResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUDeployWorkunit.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUDeployWorkunit.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUDeployWorkunitResponse.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUDeployWorkunitResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUExport.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUExport.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUExportResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUExportResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUFile.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUFile.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUFullResult.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUFullResult.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUFullResultResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUFullResultResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetArchiveFile.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetArchiveFile.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetArchiveFileResponse.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetArchiveFileResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetDependancyTrees.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetDependancyTrees.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetDependancyTreesResponse.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetDependancyTreesResponse
                .Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetGraph.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetGraph.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetGraphNameAndTypes.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetGraphNameAndTypes.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetGraphNameAndTypesResponse.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetGraphNameAndTypesResponse
                .Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetGraphResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetGraphResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetNumFileToCopy.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetNumFileToCopy.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetNumFileToCopyResponse.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetNumFileToCopyResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetStats.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetStats.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetStatsResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetStatsResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetZAPInfo.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetZAPInfo.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetZAPInfoResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGetZAPInfoResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGraphInfo.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGraphInfo.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGraphInfoResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGraphInfoResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGraphTiming.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGraphTiming.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGraphTimingResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGraphTimingResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGVCGraphInfo.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGVCGraphInfo.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGVCGraphInfoResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUGVCGraphInfoResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUInfo.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUInfo.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUInfoDetails.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUInfoDetails.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUInfoResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUInfoResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUJobList.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUJobList.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUJobListResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUJobListResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WULightWeightQuery.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WULightWeightQuery.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WULightWeightQueryResponse.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WULightWeightQueryResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListArchiveFiles.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListArchiveFiles.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListArchiveFilesResponse.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListArchiveFilesResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListLocalFileRequired.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListLocalFileRequired.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListLocalFileRequiredResponse
          .class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListLocalFileRequiredResponse
                .Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListQueries.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListQueries.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListQueriesResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListQueriesResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListQueriesUsingFile.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListQueriesUsingFile.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListQueriesUsingFileResponse.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUListQueriesUsingFileResponse
                .Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WULogFileResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WULogFileResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUMultiQuerysetDetails.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUMultiQuerysetDetails.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUMultiQuerySetDetailsResponse.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUMultiQuerySetDetailsResponse
                .Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUProcessGraph.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUProcessGraph.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUProcessGraphResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUProcessGraphResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUProtect.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUProtect.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUProtectResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUProtectResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUPublishWorkunit.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUPublishWorkunit.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUPublishWorkunitResponse.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUPublishWorkunitResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUPushEvent.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUPushEvent.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUPushEventResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUPushEventResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuery.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuery.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryConfig.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryConfig.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryConfigResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryConfigResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryDetails.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryDetails.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryDetailsResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryDetailsResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryFiles.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryFiles.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryFilesResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryFilesResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryGetGraph.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryGetGraph.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryGetGraphResponse.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryGetGraphResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQueryResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysetAliasAction.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysetAliasAction.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerySetAliasActionResponse.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerySetAliasActionResponse
                .Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysetCopyQuery.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysetCopyQuery.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerySetCopyQueryResponse.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerySetCopyQueryResponse
                .Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysetDetails.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysetDetails.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerySetDetailsResponse.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerySetDetailsResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysetQueryAction.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysetQueryAction.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerySetQueryActionResponse.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerySetQueryActionResponse
                .Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysets.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysets.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysetsResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUQuerysetsResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResubmit.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResubmit.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResubmitResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResubmitResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResult.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResult.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultBin.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultBin.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultBinResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultBinResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultSummary.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultSummary.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultSummaryResponse.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultSummaryResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultView.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultView.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultViewResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUResultViewResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WURun.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WURun.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WURunResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WURunResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUSchedule.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUSchedule.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUScheduleResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUScheduleResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUShowScheduled.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUShowScheduled.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUShowScheduledResponse.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUShowScheduledResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUSubmit.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUSubmit.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUSubmitResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUSubmitResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUSyntaxCheckECL.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUSyntaxCheckECL.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUSyntaxCheckResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUSyntaxCheckResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUUpdate.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUUpdate.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUUpdateQueryEntry.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUUpdateQueryEntry.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUUpdateQueryEntryResponse.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUUpdateQueryEntryResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUUpdateResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUUpdateResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUWaitCompiled.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUWaitCompiled.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUWaitComplete.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUWaitComplete.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUWaitResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.WUWaitResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
    return null;
  }
}

/**
 * WsTopologyStub.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:49:45 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wstopology.latest;

/*
 *  WsTopologyStub java implementation
 */

public class WsTopologyStub extends org.apache.axis2.client.Stub implements WsTopology {
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
    _service = new org.apache.axis2.description.AxisService("WsTopology" + getUniqueSuffix());
    addAnonymousOperations();

    // creating the operations
    org.apache.axis2.description.AxisOperation __operation;

    _operations = new org.apache.axis2.description.AxisOperation[21];

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "tpServiceQuery"));
    _service.addOperation(__operation);

    _operations[0] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "tpGetServicePlugins"));
    _service.addOperation(__operation);

    _operations[1] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "tpClusterQuery"));
    _service.addOperation(__operation);

    _operations[2] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "tpLogicalClusterQuery"));
    _service.addOperation(__operation);

    _operations[3] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "tpListTargetClusters"));
    _service.addOperation(__operation);

    _operations[4] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "tpThorStatus"));
    _service.addOperation(__operation);

    _operations[5] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "tpGetComponentFile"));
    _service.addOperation(__operation);

    _operations[6] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "tpClusterInfo"));
    _service.addOperation(__operation);

    _operations[7] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "tpListLogFiles"));
    _service.addOperation(__operation);

    _operations[8] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "tpGroupQuery"));
    _service.addOperation(__operation);

    _operations[9] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "tpDropZoneQuery"));
    _service.addOperation(__operation);

    _operations[10] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "tpSetMachineStatus"));
    _service.addOperation(__operation);

    _operations[11] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ping"));
    _service.addOperation(__operation);

    _operations[12] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "tpSwapNode"));
    _service.addOperation(__operation);

    _operations[13] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "systemLog"));
    _service.addOperation(__operation);

    _operations[14] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "tpLogFileDisplay"));
    _service.addOperation(__operation);

    _operations[15] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "tpLogFile"));
    _service.addOperation(__operation);

    _operations[16] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "tpMachineQuery"));
    _service.addOperation(__operation);

    _operations[17] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "tpTargetClusterQuery"));
    _service.addOperation(__operation);

    _operations[18] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "tpMachineInfo"));
    _service.addOperation(__operation);

    _operations[19] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "tpXMLFile"));
    _service.addOperation(__operation);

    _operations[20] = __operation;
  }

  // populates the faults
  private void populateFaults() {

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpServiceQuery"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpServiceQuery"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpServiceQuery"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpGetServicePlugins"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpGetServicePlugins"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpGetServicePlugins"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpClusterQuery"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpClusterQuery"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpClusterQuery"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpLogicalClusterQuery"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpLogicalClusterQuery"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpLogicalClusterQuery"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpListTargetClusters"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpListTargetClusters"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpListTargetClusters"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpThorStatus"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpThorStatus"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpThorStatus"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpGetComponentFile"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpGetComponentFile"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpGetComponentFile"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpClusterInfo"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpClusterInfo"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpClusterInfo"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpListLogFiles"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpListLogFiles"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpListLogFiles"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpGroupQuery"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpGroupQuery"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpGroupQuery"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpDropZoneQuery"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpDropZoneQuery"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpDropZoneQuery"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpSetMachineStatus"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpSetMachineStatus"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpSetMachineStatus"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"), "Ping"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"), "Ping"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"), "Ping"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpSwapNode"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpSwapNode"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpSwapNode"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "SystemLog"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "SystemLog"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "SystemLog"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpLogFileDisplay"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpLogFileDisplay"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpLogFileDisplay"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpLogFile"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpLogFile"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpLogFile"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpMachineQuery"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpMachineQuery"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpMachineQuery"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpTargetClusterQuery"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpTargetClusterQuery"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpTargetClusterQuery"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpMachineInfo"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpMachineInfo"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpMachineInfo"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpXMLFile"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpXMLFile"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "Exceptions"),
            "TpXMLFile"),
        "org.hpccsystems.ws.client.gen.axis2.wstopology.latest.Exceptions");
  }

  /** Constructor that takes in a configContext */
  public WsTopologyStub(
      org.apache.axis2.context.ConfigurationContext configurationContext,
      java.lang.String targetEndpoint)
      throws org.apache.axis2.AxisFault {
    this(configurationContext, targetEndpoint, false);
  }

  /** Constructor that takes in a configContext and useseperate listner */
  public WsTopologyStub(
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
  public WsTopologyStub(org.apache.axis2.context.ConfigurationContext configurationContext)
      throws org.apache.axis2.AxisFault {

    this(configurationContext, "http://eclwatch-65768756c6-9sm8c:8888/WsTopology?ver_=1.32");
  }

  /** Default Constructor */
  public WsTopologyStub() throws org.apache.axis2.AxisFault {

    this("http://eclwatch-65768756c6-9sm8c:8888/WsTopology?ver_=1.32");
  }

  /** Constructor taking the target endpoint */
  public WsTopologyStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
    this(null, targetEndpoint);
  }

  /**
   * Auto generated method signature
   *
   * @see org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopology#tpServiceQuery
   * @param tpServiceQueryRequest2
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpServiceQueryResponse
      tpServiceQuery(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpServiceQueryRequest
              tpServiceQueryRequest2)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[0].getName());
      _operationClient.getOptions().setAction("WsTopology/TpServiceQuery?ver_=1.32");
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
              tpServiceQueryRequest2,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "tpServiceQuery")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wstopology", "TpServiceQueryRequest"));

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
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpServiceQueryResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpServiceQueryResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpServiceQuery"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpServiceQuery"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpServiceQuery"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopology#tpGetServicePlugins
   * @param tpGetServicePluginsRequest4
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGetServicePluginsResponse
      tpGetServicePlugins(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGetServicePluginsRequest
              tpGetServicePluginsRequest4)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[1].getName());
      _operationClient.getOptions().setAction("WsTopology/TpGetServicePlugins?ver_=1.32");
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
              tpGetServicePluginsRequest4,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wstopology", "tpGetServicePlugins")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wstopology", "TpGetServicePluginsRequest"));

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
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGetServicePluginsResponse
                  .class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGetServicePluginsResponse)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpGetServicePlugins"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "TpGetServicePlugins"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "TpGetServicePlugins"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopology#tpClusterQuery
   * @param tpClusterQueryRequest6
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterQueryResponse
      tpClusterQuery(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterQueryRequest
              tpClusterQueryRequest6)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[2].getName());
      _operationClient.getOptions().setAction("WsTopology/TpClusterQuery?ver_=1.32");
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
              tpClusterQueryRequest6,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "tpClusterQuery")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wstopology", "TpClusterQueryRequest"));

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
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterQueryResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterQueryResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpClusterQuery"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpClusterQuery"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpClusterQuery"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopology#tpLogicalClusterQuery
   * @param tpLogicalClusterQueryRequest8
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogicalClusterQueryResponse
      tpLogicalClusterQuery(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogicalClusterQueryRequest
              tpLogicalClusterQueryRequest8)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[3].getName());
      _operationClient.getOptions().setAction("WsTopology/TpLogicalClusterQuery?ver_=1.32");
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
              tpLogicalClusterQueryRequest8,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wstopology", "tpLogicalClusterQuery")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wstopology", "TpLogicalClusterQueryRequest"));

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
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogicalClusterQueryResponse
                  .class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogicalClusterQueryResponse)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(
                faultElt.getQName(), "TpLogicalClusterQuery"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "TpLogicalClusterQuery"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "TpLogicalClusterQuery"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopology#tpListTargetClusters
   * @param tpListTargetClustersRequest10
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListTargetClustersResponse
      tpListTargetClusters(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListTargetClustersRequest
              tpListTargetClustersRequest10)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[4].getName());
      _operationClient.getOptions().setAction("WsTopology/TpListTargetClusters?ver_=1.32");
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
              tpListTargetClustersRequest10,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wstopology", "tpListTargetClusters")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wstopology", "TpListTargetClustersRequest"));

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
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListTargetClustersResponse
                  .class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListTargetClustersResponse)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpListTargetClusters"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "TpListTargetClusters"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "TpListTargetClusters"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopology#tpThorStatus
   * @param tpThorStatusRequest12
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpThorStatusResponse tpThorStatus(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpThorStatusRequest
          tpThorStatusRequest12)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[5].getName());
      _operationClient.getOptions().setAction("WsTopology/TpThorStatus?ver_=1.32");
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
              tpThorStatusRequest12,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "tpThorStatus")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wstopology", "TpThorStatusRequest"));

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
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpThorStatusResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpThorStatusResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpThorStatus"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpThorStatus"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpThorStatus"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopology#tpGetComponentFile
   * @param tpGetComponentFileRequest14
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGetComponentFileResponse
      tpGetComponentFile(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGetComponentFileRequest
              tpGetComponentFileRequest14)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[6].getName());
      _operationClient.getOptions().setAction("WsTopology/TpGetComponentFile?ver_=1.32");
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
              tpGetComponentFileRequest14,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wstopology", "tpGetComponentFile")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wstopology", "TpGetComponentFileRequest"));

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
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGetComponentFileResponse
                  .class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGetComponentFileResponse)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpGetComponentFile"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "TpGetComponentFile"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "TpGetComponentFile"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopology#tpClusterInfo
   * @param tpClusterInfoRequest16
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterInfoResponse tpClusterInfo(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterInfoRequest
          tpClusterInfoRequest16)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[7].getName());
      _operationClient.getOptions().setAction("WsTopology/TpClusterInfo?ver_=1.32");
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
              tpClusterInfoRequest16,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "tpClusterInfo")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wstopology", "TpClusterInfoRequest"));

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
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterInfoResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterInfoResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpClusterInfo"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpClusterInfo"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpClusterInfo"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopology#tpListLogFiles
   * @param tpListLogFilesRequest18
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListLogFilesResponse
      tpListLogFiles(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListLogFilesRequest
              tpListLogFilesRequest18)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[8].getName());
      _operationClient.getOptions().setAction("WsTopology/TpListLogFiles?ver_=1.32");
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
              tpListLogFilesRequest18,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "tpListLogFiles")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wstopology", "TpListLogFilesRequest"));

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
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListLogFilesResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListLogFilesResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpListLogFiles"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpListLogFiles"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpListLogFiles"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopology#tpGroupQuery
   * @param tpGroupQueryRequest20
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGroupQueryResponse tpGroupQuery(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGroupQueryRequest
          tpGroupQueryRequest20)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[9].getName());
      _operationClient.getOptions().setAction("WsTopology/TpGroupQuery?ver_=1.32");
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
              tpGroupQueryRequest20,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "tpGroupQuery")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wstopology", "TpGroupQueryRequest"));

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
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGroupQueryResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGroupQueryResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpGroupQuery"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpGroupQuery"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpGroupQuery"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopology#tpDropZoneQuery
   * @param tpDropZoneQueryRequest22
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZoneQueryResponse
      tpDropZoneQuery(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZoneQueryRequest
              tpDropZoneQueryRequest22)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[10].getName());
      _operationClient.getOptions().setAction("WsTopology/TpDropZoneQuery?ver_=1.32");
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
              tpDropZoneQueryRequest22,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wstopology", "tpDropZoneQuery")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wstopology", "TpDropZoneQueryRequest"));

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
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZoneQueryResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZoneQueryResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpDropZoneQuery"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "TpDropZoneQuery"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "TpDropZoneQuery"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopology#tpSetMachineStatus
   * @param tpSetMachineStatusRequest24
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSetMachineStatusResponse
      tpSetMachineStatus(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSetMachineStatusRequest
              tpSetMachineStatusRequest24)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[11].getName());
      _operationClient.getOptions().setAction("WsTopology/TpSetMachineStatus?ver_=1.32");
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
              tpSetMachineStatusRequest24,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wstopology", "tpSetMachineStatus")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wstopology", "TpSetMachineStatusRequest"));

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
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSetMachineStatusResponse
                  .class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSetMachineStatusResponse)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpSetMachineStatus"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "TpSetMachineStatus"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "TpSetMachineStatus"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopology#ping
   * @param wsTopologyPingRequest26
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopologyPingResponse ping(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopologyPingRequest
          wsTopologyPingRequest26)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[12].getName());
      _operationClient.getOptions().setAction("WsTopology/Ping?ver_=1.32");
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
              wsTopologyPingRequest26,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "ping")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wstopology", "WsTopologyPingRequest"));

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
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopologyPingResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopologyPingResponse) object;

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

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopology#tpSwapNode
   * @param tpSwapNodeRequest28
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSwapNodeResponse tpSwapNode(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSwapNodeRequest tpSwapNodeRequest28)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[13].getName());
      _operationClient.getOptions().setAction("WsTopology/TpSwapNode?ver_=1.32");
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
              tpSwapNodeRequest28,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "tpSwapNode")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpSwapNodeRequest"));

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
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSwapNodeResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSwapNodeResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpSwapNode"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpSwapNode"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpSwapNode"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopology#systemLog
   * @param systemLogRequest30
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.SystemLogResponse systemLog(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.SystemLogRequest systemLogRequest30)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[14].getName());
      _operationClient.getOptions().setAction("WsTopology/SystemLog?ver_=1.32");
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
              systemLogRequest30,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "systemLog")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "SystemLogRequest"));

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
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.SystemLogResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.SystemLogResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "SystemLog"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "SystemLog"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "SystemLog"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopology#tpLogFileDisplay
   * @param tpLogFileRequest32
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogFileResponse tpLogFileDisplay(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogFileRequest tpLogFileRequest32)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[15].getName());
      _operationClient.getOptions().setAction("WsTopology/TpLogFileDisplay?ver_=1.32");
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
              tpLogFileRequest32,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wstopology", "tpLogFileDisplay")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpLogFileRequest"));

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
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogFileResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogFileResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpLogFileDisplay"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "TpLogFileDisplay"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "TpLogFileDisplay"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopology#tpLogFile
   * @param tpLogFileRequest34
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogFileResponse tpLogFile(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogFileRequest tpLogFileRequest34)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[16].getName());
      _operationClient.getOptions().setAction("WsTopology/TpLogFile?ver_=1.32");
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
              tpLogFileRequest34,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "tpLogFile")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpLogFileRequest"));

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
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogFileResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogFileResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpLogFile"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpLogFile"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpLogFile"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopology#tpMachineQuery
   * @param tpMachineQueryRequest36
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineQueryResponse
      tpMachineQuery(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineQueryRequest
              tpMachineQueryRequest36)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[17].getName());
      _operationClient.getOptions().setAction("WsTopology/TpMachineQuery?ver_=1.32");
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
              tpMachineQueryRequest36,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "tpMachineQuery")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wstopology", "TpMachineQueryRequest"));

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
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineQueryResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineQueryResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpMachineQuery"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpMachineQuery"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpMachineQuery"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopology#tpTargetClusterQuery
   * @param tpTargetClusterQueryRequest38
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetClusterQueryResponse
      tpTargetClusterQuery(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetClusterQueryRequest
              tpTargetClusterQueryRequest38)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[18].getName());
      _operationClient.getOptions().setAction("WsTopology/TpTargetClusterQuery?ver_=1.32");
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
              tpTargetClusterQueryRequest38,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wstopology", "tpTargetClusterQuery")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wstopology", "TpTargetClusterQueryRequest"));

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
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetClusterQueryResponse
                  .class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetClusterQueryResponse)
          object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpTargetClusterQuery"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "TpTargetClusterQuery"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "TpTargetClusterQuery"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopology#tpMachineInfo
   * @param tpMachineInfoRequest40
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineInfoResponse tpMachineInfo(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineInfoRequest
          tpMachineInfoRequest40)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[19].getName());
      _operationClient.getOptions().setAction("WsTopology/TpMachineInfo?ver_=1.32");
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
              tpMachineInfoRequest40,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "tpMachineInfo")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wstopology", "TpMachineInfoRequest"));

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
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineInfoResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineInfoResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpMachineInfo"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpMachineInfo"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpMachineInfo"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopology#tpXMLFile
   * @param tpXMLFileRequest42
   * @throws org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpXMLFileResponse tpXMLFile(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpXMLFileRequest tpXMLFileRequest42)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[20].getName());
      _operationClient.getOptions().setAction("WsTopology/TpXMLFile?ver_=1.32");
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
              tpXMLFileRequest42,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "tpXMLFile")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wstopology", "TpXMLFileRequest"));

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
              org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpXMLFileResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpXMLFileResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpXMLFile"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpXMLFile"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "TpXMLFile"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspSoapFault) ex;
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
  // http://eclwatch-65768756c6-9sm8c:8888/WsTopology?ver_=1.32
  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpServiceQueryRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpServiceQueryRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpServiceQueryResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpServiceQueryResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.Exceptions param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.Exceptions.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGetServicePluginsRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGetServicePluginsRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGetServicePluginsResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGetServicePluginsResponse
              .MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterQueryRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterQueryRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterQueryResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterQueryResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogicalClusterQueryRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogicalClusterQueryRequest
              .MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogicalClusterQueryResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogicalClusterQueryResponse
              .MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListTargetClustersRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListTargetClustersRequest
              .MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListTargetClustersResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListTargetClustersResponse
              .MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpThorStatusRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpThorStatusRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpThorStatusResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpThorStatusResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGetComponentFileRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGetComponentFileRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGetComponentFileResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGetComponentFileResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterInfoRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterInfoRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterInfoResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterInfoResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListLogFilesRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListLogFilesRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListLogFilesResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListLogFilesResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGroupQueryRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGroupQueryRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGroupQueryResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGroupQueryResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZoneQueryRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZoneQueryRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZoneQueryResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZoneQueryResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSetMachineStatusRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSetMachineStatusRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSetMachineStatusResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSetMachineStatusResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopologyPingRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopologyPingRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopologyPingResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopologyPingResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSwapNodeRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSwapNodeRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSwapNodeResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSwapNodeResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.SystemLogRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.SystemLogRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.SystemLogResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.SystemLogResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogFileRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogFileRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogFileResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogFileResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineQueryRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineQueryRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineQueryResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineQueryResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetClusterQueryRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetClusterQueryRequest
              .MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetClusterQueryResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetClusterQueryResponse
              .MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineInfoRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineInfoRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineInfoResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineInfoResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpXMLFileRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpXMLFileRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpXMLFileResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpXMLFileResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpServiceQueryRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpServiceQueryRequest
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
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGetServicePluginsRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGetServicePluginsRequest
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
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterQueryRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterQueryRequest
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
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogicalClusterQueryRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogicalClusterQueryRequest
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
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListTargetClustersRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListTargetClustersRequest
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
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpThorStatusRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpThorStatusRequest
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
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGetComponentFileRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGetComponentFileRequest
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
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterInfoRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterInfoRequest
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
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListLogFilesRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListLogFilesRequest
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
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGroupQueryRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGroupQueryRequest
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
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZoneQueryRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZoneQueryRequest
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
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSetMachineStatusRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSetMachineStatusRequest
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
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopologyPingRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopologyPingRequest
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
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSwapNodeRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSwapNodeRequest.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.SystemLogRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wstopology.latest.SystemLogRequest.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogFileRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogFileRequest.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineQueryRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineQueryRequest
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
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetClusterQueryRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetClusterQueryRequest
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
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineInfoRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineInfoRequest
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
      org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpXMLFileRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpXMLFileRequest.MY_QNAME,
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

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.Exceptions.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.Exceptions.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.SystemLogRequest.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.SystemLogRequest.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.SystemLogResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.SystemLogResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterInfoRequest.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterInfoRequest.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterInfoResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterInfoResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterQueryRequest.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterQueryRequest.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterQueryResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterQueryResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZoneQueryRequest.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZoneQueryRequest.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZoneQueryResponse.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZoneQueryResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGetComponentFileRequest.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGetComponentFileRequest.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGetComponentFileResponse.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGetComponentFileResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGetServicePluginsRequest.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGetServicePluginsRequest.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGetServicePluginsResponse.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGetServicePluginsResponse
                .Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGroupQueryRequest.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGroupQueryRequest.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGroupQueryResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpGroupQueryResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListLogFilesRequest.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListLogFilesRequest.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListLogFilesResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListLogFilesResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListTargetClustersRequest.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListTargetClustersRequest
                .Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListTargetClustersResponse.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListTargetClustersResponse
                .Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogFileRequest.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogFileRequest.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogFileResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogFileResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogicalClusterQueryRequest.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogicalClusterQueryRequest
                .Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogicalClusterQueryResponse.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogicalClusterQueryResponse
                .Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineInfoRequest.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineInfoRequest.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineInfoResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineInfoResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineQueryRequest.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineQueryRequest.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineQueryResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineQueryResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpServiceQueryRequest.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpServiceQueryRequest.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpServiceQueryResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpServiceQueryResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSetMachineStatusRequest.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSetMachineStatusRequest.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSetMachineStatusResponse.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSetMachineStatusResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSwapNodeRequest.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSwapNodeRequest.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSwapNodeResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSwapNodeResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetClusterQueryRequest.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetClusterQueryRequest
                .Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetClusterQueryResponse.class
          .equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetClusterQueryResponse
                .Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpThorStatusRequest.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpThorStatusRequest.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpThorStatusResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpThorStatusResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpXMLFileRequest.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpXMLFileRequest.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpXMLFileResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpXMLFileResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopologyPingRequest.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopologyPingRequest.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopologyPingResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.WsTopologyPingResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
    return null;
  }
}

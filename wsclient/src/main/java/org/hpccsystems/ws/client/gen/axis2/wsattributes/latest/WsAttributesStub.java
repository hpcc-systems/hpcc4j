/**
 * WsAttributesStub.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 1.7.9 Built on : Nov 16,
 * 2018 (12:05:37 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wsattributes.latest;

/*
 *  WsAttributesStub java implementation
 */
public class WsAttributesStub extends org.apache.axis2.client.Stub implements WsAttributes {
  private static int counter = 0;
  protected org.apache.axis2.description.AxisOperation[] _operations;

  // hashmaps to keep the fault mapping
  private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
  private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
  private java.util.HashMap faultMessageMap = new java.util.HashMap();
  private javax.xml.namespace.QName[] opNameArray = null;

  /** Constructor that takes in a configContext */
  public WsAttributesStub(
      org.apache.axis2.context.ConfigurationContext configurationContext,
      java.lang.String targetEndpoint)
      throws org.apache.axis2.AxisFault {
    this(configurationContext, targetEndpoint, false);
  }

  /** Constructor that takes in a configContext and useseperate listner */
  public WsAttributesStub(
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
  public WsAttributesStub(org.apache.axis2.context.ConfigurationContext configurationContext)
      throws org.apache.axis2.AxisFault {
    this(configurationContext, "http://10.173.10.159:8145/WsAttributes?ver_=1.21");
  }

  /** Default Constructor */
  public WsAttributesStub() throws org.apache.axis2.AxisFault {
    this("http://10.173.10.159:8145/WsAttributes?ver_=1.21");
  }

  /** Constructor taking the target endpoint */
  public WsAttributesStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
    this(null, targetEndpoint);
  }

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
    _service = new org.apache.axis2.description.AxisService("WsAttributes" + getUniqueSuffix());
    addAnonymousOperations();

    // creating the operations
    org.apache.axis2.description.AxisOperation __operation;

    _operations = new org.apache.axis2.description.AxisOperation[23];

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "createModule"));
    _service.addOperation(__operation);

    _operations[0] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "deleteModule"));
    _service.addOperation(__operation);

    _operations[1] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "getAttributeLabels"));
    _service.addOperation(__operation);

    _operations[2] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "getAttributes"));
    _service.addOperation(__operation);

    _operations[3] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "createAttribute"));
    _service.addOperation(__operation);

    _operations[4] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "getAttribute"));
    _service.addOperation(__operation);

    _operations[5] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "importAttributes"));
    _service.addOperation(__operation);

    _operations[6] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "rollbackAttributes"));
    _service.addOperation(__operation);

    _operations[7] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "deleteAttributes"));
    _service.addOperation(__operation);

    _operations[8] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "listAttributeTypes"));
    _service.addOperation(__operation);

    _operations[9] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "getAttributeHistory"));
    _service.addOperation(__operation);

    _operations[10] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "renameModule"));
    _service.addOperation(__operation);

    _operations[11] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "supportsEarMark"));
    _service.addOperation(__operation);

    _operations[12] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "getLabels"));
    _service.addOperation(__operation);

    _operations[13] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "renameAttributes"));
    _service.addOperation(__operation);

    _operations[14] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "updateLabel"));
    _service.addOperation(__operation);

    _operations[15] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "createLabel"));
    _service.addOperation(__operation);

    _operations[16] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "checkoutAttributes"));
    _service.addOperation(__operation);

    _operations[17] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "checkinAttributes"));
    _service.addOperation(__operation);

    _operations[18] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "getModules"));
    _service.addOperation(__operation);

    _operations[19] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "deleteLabel"));
    _service.addOperation(__operation);

    _operations[20] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "saveAttributes"));
    _service.addOperation(__operation);

    _operations[21] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "findAttributes"));
    _service.addOperation(__operation);

    _operations[22] = __operation;
  }

  // populates the faults
  private void populateFaults() {
    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "CreateModule"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "CreateModule"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "CreateModule"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "DeleteModule"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "DeleteModule"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "DeleteModule"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "GetAttributeLabels"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "GetAttributeLabels"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "GetAttributeLabels"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "GetAttributes"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "GetAttributes"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "GetAttributes"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "CreateAttribute"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "CreateAttribute"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "CreateAttribute"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "GetAttribute"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "GetAttribute"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "GetAttribute"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "ImportAttributes"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "ImportAttributes"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "ImportAttributes"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "RollbackAttributes"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "RollbackAttributes"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "RollbackAttributes"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "DeleteAttributes"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "DeleteAttributes"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "DeleteAttributes"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "ListAttributeTypes"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "ListAttributeTypes"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "ListAttributeTypes"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "GetAttributeHistory"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "GetAttributeHistory"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "GetAttributeHistory"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "RenameModule"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "RenameModule"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "RenameModule"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "SupportsEarMark"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "SupportsEarMark"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "SupportsEarMark"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "GetLabels"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "GetLabels"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "GetLabels"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "RenameAttributes"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "RenameAttributes"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "RenameAttributes"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "UpdateLabel"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "UpdateLabel"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "UpdateLabel"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "CreateLabel"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "CreateLabel"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "CreateLabel"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "CheckoutAttributes"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "CheckoutAttributes"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "CheckoutAttributes"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "CheckinAttributes"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "CheckinAttributes"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "CheckinAttributes"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "GetModules"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "GetModules"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "GetModules"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "DeleteLabel"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "DeleteLabel"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "DeleteLabel"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "SaveAttributes"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "SaveAttributes"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "SaveAttributes"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "FindAttributes"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "FindAttributes"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "Exceptions"),
            "FindAttributes"),
        "org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.Exceptions");
  }

  /**
   * Auto generated method signature
   *
   * @see org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.WsAttributes#createModule
   * @param createModule6
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateModuleResponse createModule(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateModule createModule6)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[0].getName());
      _operationClient.getOptions().setAction("WsAttributes/CreateModule?ver_=1.21");
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
              createModule6,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "createModule")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "CreateModule"));

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

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateModuleResponse.class);

      return (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateModuleResponse) object;
    } catch (org.apache.axis2.AxisFault f) {
      org.apache.axiom.om.OMElement faultElt = f.getDetail();

      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "CreateModule"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                (java.lang.String)
                    faultExceptionClassNameMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "CreateModule"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

            // message class
            java.lang.String messageClassName =
                (java.lang.String)
                    faultMessageMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "CreateModule"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex
                instanceof org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.WsAttributes#deleteModule
   * @param deleteModule8
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteModuleResponse deleteModule(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteModule deleteModule8)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[1].getName());
      _operationClient.getOptions().setAction("WsAttributes/DeleteModule?ver_=1.21");
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
              deleteModule8,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "deleteModule")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "DeleteModule"));

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

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteModuleResponse.class);

      return (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteModuleResponse) object;
    } catch (org.apache.axis2.AxisFault f) {
      org.apache.axiom.om.OMElement faultElt = f.getDetail();

      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DeleteModule"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                (java.lang.String)
                    faultExceptionClassNameMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "DeleteModule"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

            // message class
            java.lang.String messageClassName =
                (java.lang.String)
                    faultMessageMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "DeleteModule"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex
                instanceof org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.WsAttributes#getAttributeLabels
   * @param getAttributeLabels10
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeLabelsResponse
      getAttributeLabels(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeLabels
              getAttributeLabels10)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[2].getName());
      _operationClient.getOptions().setAction("WsAttributes/GetAttributeLabels?ver_=1.21");
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
              getAttributeLabels10,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsattributes", "getAttributeLabels")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wsattributes", "GetAttributeLabels"));

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

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeLabelsResponse
                  .class);

      return (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeLabelsResponse)
          object;
    } catch (org.apache.axis2.AxisFault f) {
      org.apache.axiom.om.OMElement faultElt = f.getDetail();

      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetAttributeLabels"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                (java.lang.String)
                    faultExceptionClassNameMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "GetAttributeLabels"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

            // message class
            java.lang.String messageClassName =
                (java.lang.String)
                    faultMessageMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "GetAttributeLabels"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex
                instanceof org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.WsAttributes#getAttributes
   * @param getAttributes12
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributesResponse
      getAttributes(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributes getAttributes12)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[3].getName());
      _operationClient.getOptions().setAction("WsAttributes/GetAttributes?ver_=1.21");
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
              getAttributes12,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsattributes", "getAttributes")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "GetAttributes"));

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

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributesResponse.class);

      return (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributesResponse) object;
    } catch (org.apache.axis2.AxisFault f) {
      org.apache.axiom.om.OMElement faultElt = f.getDetail();

      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetAttributes"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                (java.lang.String)
                    faultExceptionClassNameMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "GetAttributes"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

            // message class
            java.lang.String messageClassName =
                (java.lang.String)
                    faultMessageMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "GetAttributes"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex
                instanceof org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.WsAttributes#createAttribute
   * @param createAttribute14
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateAttributeResponse
      createAttribute(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateAttribute createAttribute14)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[4].getName());
      _operationClient.getOptions().setAction("WsAttributes/CreateAttribute?ver_=1.21");
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
              createAttribute14,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsattributes", "createAttribute")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "CreateAttribute"));

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

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateAttributeResponse
                  .class);

      return (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateAttributeResponse)
          object;
    } catch (org.apache.axis2.AxisFault f) {
      org.apache.axiom.om.OMElement faultElt = f.getDetail();

      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "CreateAttribute"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                (java.lang.String)
                    faultExceptionClassNameMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "CreateAttribute"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

            // message class
            java.lang.String messageClassName =
                (java.lang.String)
                    faultMessageMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "CreateAttribute"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex
                instanceof org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.WsAttributes#getAttribute
   * @param getAttribute16
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeResponse getAttribute(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttribute getAttribute16)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[5].getName());
      _operationClient.getOptions().setAction("WsAttributes/GetAttribute?ver_=1.21");
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
              getAttribute16,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "getAttribute")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "GetAttribute"));

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

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeResponse.class);

      return (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeResponse) object;
    } catch (org.apache.axis2.AxisFault f) {
      org.apache.axiom.om.OMElement faultElt = f.getDetail();

      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetAttribute"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                (java.lang.String)
                    faultExceptionClassNameMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "GetAttribute"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

            // message class
            java.lang.String messageClassName =
                (java.lang.String)
                    faultMessageMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "GetAttribute"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex
                instanceof org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.WsAttributes#importAttributes
   * @param importAttributes18
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateAttributesResponse
      importAttributes(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ImportAttributes
              importAttributes18)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[6].getName());
      _operationClient.getOptions().setAction("WsAttributes/ImportAttributes?ver_=1.21");
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
              importAttributes18,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsattributes", "importAttributes")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "ImportAttributes"));

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

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateAttributesResponse
                  .class);

      return (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateAttributesResponse)
          object;
    } catch (org.apache.axis2.AxisFault f) {
      org.apache.axiom.om.OMElement faultElt = f.getDetail();

      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ImportAttributes"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                (java.lang.String)
                    faultExceptionClassNameMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "ImportAttributes"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

            // message class
            java.lang.String messageClassName =
                (java.lang.String)
                    faultMessageMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "ImportAttributes"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex
                instanceof org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.WsAttributes#rollbackAttributes
   * @param rollbackAttributes20
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateAttributesResponse
      rollbackAttributes(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RollbackAttributes
              rollbackAttributes20)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[7].getName());
      _operationClient.getOptions().setAction("WsAttributes/RollbackAttributes?ver_=1.21");
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
              rollbackAttributes20,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsattributes", "rollbackAttributes")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wsattributes", "RollbackAttributes"));

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

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateAttributesResponse
                  .class);

      return (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateAttributesResponse)
          object;
    } catch (org.apache.axis2.AxisFault f) {
      org.apache.axiom.om.OMElement faultElt = f.getDetail();

      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "RollbackAttributes"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                (java.lang.String)
                    faultExceptionClassNameMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "RollbackAttributes"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

            // message class
            java.lang.String messageClassName =
                (java.lang.String)
                    faultMessageMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "RollbackAttributes"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex
                instanceof org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.WsAttributes#deleteAttributes
   * @param deleteAttributes22
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateAttributesResponse
      deleteAttributes(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteAttributes
              deleteAttributes22)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[8].getName());
      _operationClient.getOptions().setAction("WsAttributes/DeleteAttributes?ver_=1.21");
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
              deleteAttributes22,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsattributes", "deleteAttributes")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "DeleteAttributes"));

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

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateAttributesResponse
                  .class);

      return (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateAttributesResponse)
          object;
    } catch (org.apache.axis2.AxisFault f) {
      org.apache.axiom.om.OMElement faultElt = f.getDetail();

      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DeleteAttributes"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                (java.lang.String)
                    faultExceptionClassNameMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "DeleteAttributes"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

            // message class
            java.lang.String messageClassName =
                (java.lang.String)
                    faultMessageMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "DeleteAttributes"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex
                instanceof org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.WsAttributes#listAttributeTypes
   * @param listAttributeTypes24
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ListAttributeTypesResponse
      listAttributeTypes(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ListAttributeTypes
              listAttributeTypes24)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[9].getName());
      _operationClient.getOptions().setAction("WsAttributes/ListAttributeTypes?ver_=1.21");
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
              listAttributeTypes24,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsattributes", "listAttributeTypes")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wsattributes", "ListAttributeTypes"));

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

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ListAttributeTypesResponse
                  .class);

      return (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ListAttributeTypesResponse)
          object;
    } catch (org.apache.axis2.AxisFault f) {
      org.apache.axiom.om.OMElement faultElt = f.getDetail();

      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ListAttributeTypes"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                (java.lang.String)
                    faultExceptionClassNameMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "ListAttributeTypes"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

            // message class
            java.lang.String messageClassName =
                (java.lang.String)
                    faultMessageMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "ListAttributeTypes"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex
                instanceof org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.WsAttributes#getAttributeHistory
   * @param getAttributeHistory26
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeHistoryResponse
      getAttributeHistory(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeHistory
              getAttributeHistory26)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[10].getName());
      _operationClient.getOptions().setAction("WsAttributes/GetAttributeHistory?ver_=1.21");
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
              getAttributeHistory26,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsattributes", "getAttributeHistory")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wsattributes", "GetAttributeHistory"));

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

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeHistoryResponse
                  .class);

      return (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeHistoryResponse)
          object;
    } catch (org.apache.axis2.AxisFault f) {
      org.apache.axiom.om.OMElement faultElt = f.getDetail();

      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetAttributeHistory"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                (java.lang.String)
                    faultExceptionClassNameMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "GetAttributeHistory"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

            // message class
            java.lang.String messageClassName =
                (java.lang.String)
                    faultMessageMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "GetAttributeHistory"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex
                instanceof org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.WsAttributes#renameModule
   * @param renameModule28
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameModuleResponse renameModule(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameModule renameModule28)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[11].getName());
      _operationClient.getOptions().setAction("WsAttributes/RenameModule?ver_=1.21");
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
              renameModule28,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "renameModule")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "RenameModule"));

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

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameModuleResponse.class);

      return (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameModuleResponse) object;
    } catch (org.apache.axis2.AxisFault f) {
      org.apache.axiom.om.OMElement faultElt = f.getDetail();

      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "RenameModule"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                (java.lang.String)
                    faultExceptionClassNameMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "RenameModule"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

            // message class
            java.lang.String messageClassName =
                (java.lang.String)
                    faultMessageMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "RenameModule"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex
                instanceof org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.WsAttributes#supportsEarMark
   * @param supportsEarMark30
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SupportsEarMarkResponse
      supportsEarMark(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SupportsEarMark supportsEarMark30)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[12].getName());
      _operationClient.getOptions().setAction("WsAttributes/SupportsEarMark?ver_=1.21");
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
              supportsEarMark30,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsattributes", "supportsEarMark")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "SupportsEarMark"));

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

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SupportsEarMarkResponse
                  .class);

      return (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SupportsEarMarkResponse)
          object;
    } catch (org.apache.axis2.AxisFault f) {
      org.apache.axiom.om.OMElement faultElt = f.getDetail();

      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "SupportsEarMark"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                (java.lang.String)
                    faultExceptionClassNameMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "SupportsEarMark"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

            // message class
            java.lang.String messageClassName =
                (java.lang.String)
                    faultMessageMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "SupportsEarMark"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex
                instanceof org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.WsAttributes#getLabels
   * @param getLabels32
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetLabelsResponse getLabels(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetLabels getLabels32)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[13].getName());
      _operationClient.getOptions().setAction("WsAttributes/GetLabels?ver_=1.21");
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
              getLabels32,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "getLabels")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "GetLabels"));

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

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetLabelsResponse.class);

      return (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetLabelsResponse) object;
    } catch (org.apache.axis2.AxisFault f) {
      org.apache.axiom.om.OMElement faultElt = f.getDetail();

      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetLabels"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                (java.lang.String)
                    faultExceptionClassNameMap.get(
                        new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetLabels"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

            // message class
            java.lang.String messageClassName =
                (java.lang.String)
                    faultMessageMap.get(
                        new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetLabels"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex
                instanceof org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.WsAttributes#renameAttributes
   * @param renameAttributes34
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateAttributesResponse
      renameAttributes(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameAttributes
              renameAttributes34)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[14].getName());
      _operationClient.getOptions().setAction("WsAttributes/RenameAttributes?ver_=1.21");
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
              renameAttributes34,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsattributes", "renameAttributes")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "RenameAttributes"));

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

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateAttributesResponse
                  .class);

      return (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateAttributesResponse)
          object;
    } catch (org.apache.axis2.AxisFault f) {
      org.apache.axiom.om.OMElement faultElt = f.getDetail();

      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "RenameAttributes"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                (java.lang.String)
                    faultExceptionClassNameMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "RenameAttributes"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

            // message class
            java.lang.String messageClassName =
                (java.lang.String)
                    faultMessageMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "RenameAttributes"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex
                instanceof org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.WsAttributes#updateLabel
   * @param updateLabel36
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateLabelResponse updateLabel(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateLabel updateLabel36)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[15].getName());
      _operationClient.getOptions().setAction("WsAttributes/UpdateLabel?ver_=1.21");
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
              updateLabel36,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "updateLabel")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "UpdateLabel"));

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

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateLabelResponse.class);

      return (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateLabelResponse) object;
    } catch (org.apache.axis2.AxisFault f) {
      org.apache.axiom.om.OMElement faultElt = f.getDetail();

      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "UpdateLabel"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                (java.lang.String)
                    faultExceptionClassNameMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "UpdateLabel"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

            // message class
            java.lang.String messageClassName =
                (java.lang.String)
                    faultMessageMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "UpdateLabel"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex
                instanceof org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.WsAttributes#createLabel
   * @param createLabel38
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateLabelResponse createLabel(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateLabel createLabel38)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[16].getName());
      _operationClient.getOptions().setAction("WsAttributes/CreateLabel?ver_=1.21");
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
              createLabel38,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "createLabel")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "CreateLabel"));

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

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateLabelResponse.class);

      return (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateLabelResponse) object;
    } catch (org.apache.axis2.AxisFault f) {
      org.apache.axiom.om.OMElement faultElt = f.getDetail();

      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "CreateLabel"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                (java.lang.String)
                    faultExceptionClassNameMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "CreateLabel"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

            // message class
            java.lang.String messageClassName =
                (java.lang.String)
                    faultMessageMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "CreateLabel"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex
                instanceof org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.WsAttributes#checkoutAttributes
   * @param checkoutAttributes40
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateAttributesResponse
      checkoutAttributes(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckoutAttributes
              checkoutAttributes40)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[17].getName());
      _operationClient.getOptions().setAction("WsAttributes/CheckoutAttributes?ver_=1.21");
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
              checkoutAttributes40,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsattributes", "checkoutAttributes")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wsattributes", "CheckoutAttributes"));

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

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateAttributesResponse
                  .class);

      return (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateAttributesResponse)
          object;
    } catch (org.apache.axis2.AxisFault f) {
      org.apache.axiom.om.OMElement faultElt = f.getDetail();

      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "CheckoutAttributes"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                (java.lang.String)
                    faultExceptionClassNameMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "CheckoutAttributes"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

            // message class
            java.lang.String messageClassName =
                (java.lang.String)
                    faultMessageMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "CheckoutAttributes"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex
                instanceof org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.WsAttributes#checkinAttributes
   * @param checkinAttributes42
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateAttributesResponse
      checkinAttributes(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckinAttributes
              checkinAttributes42)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[18].getName());
      _operationClient.getOptions().setAction("WsAttributes/CheckinAttributes?ver_=1.21");
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
              checkinAttributes42,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsattributes", "checkinAttributes")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wsattributes", "CheckinAttributes"));

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

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateAttributesResponse
                  .class);

      return (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateAttributesResponse)
          object;
    } catch (org.apache.axis2.AxisFault f) {
      org.apache.axiom.om.OMElement faultElt = f.getDetail();

      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "CheckinAttributes"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                (java.lang.String)
                    faultExceptionClassNameMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "CheckinAttributes"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

            // message class
            java.lang.String messageClassName =
                (java.lang.String)
                    faultMessageMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "CheckinAttributes"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex
                instanceof org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.WsAttributes#getModules
   * @param getModules44
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetModulesResponse getModules(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetModules getModules44)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[19].getName());
      _operationClient.getOptions().setAction("WsAttributes/GetModules?ver_=1.21");
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
              getModules44,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "getModules")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "GetModules"));

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

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetModulesResponse.class);

      return (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetModulesResponse) object;
    } catch (org.apache.axis2.AxisFault f) {
      org.apache.axiom.om.OMElement faultElt = f.getDetail();

      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetModules"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                (java.lang.String)
                    faultExceptionClassNameMap.get(
                        new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetModules"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

            // message class
            java.lang.String messageClassName =
                (java.lang.String)
                    faultMessageMap.get(
                        new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetModules"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex
                instanceof org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.WsAttributes#deleteLabel
   * @param deleteLabel46
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteLabelResponse deleteLabel(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteLabel deleteLabel46)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[20].getName());
      _operationClient.getOptions().setAction("WsAttributes/DeleteLabel?ver_=1.21");
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
              deleteLabel46,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "deleteLabel")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "DeleteLabel"));

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

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteLabelResponse.class);

      return (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteLabelResponse) object;
    } catch (org.apache.axis2.AxisFault f) {
      org.apache.axiom.om.OMElement faultElt = f.getDetail();

      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "DeleteLabel"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                (java.lang.String)
                    faultExceptionClassNameMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "DeleteLabel"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

            // message class
            java.lang.String messageClassName =
                (java.lang.String)
                    faultMessageMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "DeleteLabel"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex
                instanceof org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.WsAttributes#saveAttributes
   * @param saveAttributes48
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateAttributesResponse
      saveAttributes(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SaveAttributes saveAttributes48)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[21].getName());
      _operationClient.getOptions().setAction("WsAttributes/SaveAttributes?ver_=1.21");
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
              saveAttributes48,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsattributes", "saveAttributes")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "SaveAttributes"));

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

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateAttributesResponse
                  .class);

      return (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateAttributesResponse)
          object;
    } catch (org.apache.axis2.AxisFault f) {
      org.apache.axiom.om.OMElement faultElt = f.getDetail();

      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "SaveAttributes"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                (java.lang.String)
                    faultExceptionClassNameMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "SaveAttributes"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

            // message class
            java.lang.String messageClassName =
                (java.lang.String)
                    faultMessageMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "SaveAttributes"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex
                instanceof org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.WsAttributes#findAttributes
   * @param findAttributes50
   * @throws org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.FindAttributesResponse
      findAttributes(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.FindAttributes findAttributes50)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();

    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[22].getName());
      _operationClient.getOptions().setAction("WsAttributes/FindAttributes?ver_=1.21");
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
              findAttributes50,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "urn:hpccsystems:ws:wsattributes", "findAttributes")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wsattributes", "FindAttributes"));

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

      java.lang.Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.FindAttributesResponse.class);

      return (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.FindAttributesResponse)
          object;
    } catch (org.apache.axis2.AxisFault f) {
      org.apache.axiom.om.OMElement faultElt = f.getDetail();

      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "FindAttributes"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                (java.lang.String)
                    faultExceptionClassNameMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "FindAttributes"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

            // message class
            java.lang.String messageClassName =
                (java.lang.String)
                    faultMessageMap.get(
                        new org.apache.axis2.client.FaultMapKey(
                            faultElt.getQName(), "FindAttributes"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex
                instanceof org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault) ex;
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

  // http://10.173.10.159:8145/WsAttributes?ver_=1.21
  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateModule param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateModule.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateModuleResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateModuleResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.Exceptions param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.Exceptions.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteModule param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteModule.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteModuleResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteModuleResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeLabels param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeLabels.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeLabelsResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeLabelsResponse
              .MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributes param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributes.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributesResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributesResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateAttribute param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateAttribute.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateAttributeResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateAttributeResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttribute param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttribute.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ImportAttributes param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ImportAttributes.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateAttributesResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateAttributesResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RollbackAttributes param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RollbackAttributes.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteAttributes param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteAttributes.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ListAttributeTypes param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ListAttributeTypes.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ListAttributeTypesResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ListAttributeTypesResponse
              .MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeHistory param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeHistory.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeHistoryResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeHistoryResponse
              .MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameModule param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameModule.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameModuleResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameModuleResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SupportsEarMark param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SupportsEarMark.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SupportsEarMarkResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SupportsEarMarkResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetLabels param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetLabels.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetLabelsResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetLabelsResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameAttributes param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameAttributes.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateLabel param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateLabel.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateLabelResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateLabelResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateLabel param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateLabel.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateLabelResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateLabelResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckoutAttributes param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckoutAttributes.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckinAttributes param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckinAttributes.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetModules param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetModules.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetModulesResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetModulesResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteLabel param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteLabel.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteLabelResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteLabelResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SaveAttributes param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SaveAttributes.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.FindAttributes param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.FindAttributes.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.FindAttributesResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {
    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.FindAttributesResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateModule param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateModule.MY_QNAME,
                  factory));

      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */
  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteModule param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteModule.MY_QNAME,
                  factory));

      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */
  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeLabels param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeLabels
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
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributes param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributes.MY_QNAME,
                  factory));

      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */
  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateAttribute param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateAttribute.MY_QNAME,
                  factory));

      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */
  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttribute param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttribute.MY_QNAME,
                  factory));

      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */
  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ImportAttributes param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ImportAttributes.MY_QNAME,
                  factory));

      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */
  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RollbackAttributes param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RollbackAttributes
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
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteAttributes param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteAttributes.MY_QNAME,
                  factory));

      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */
  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ListAttributeTypes param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ListAttributeTypes
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
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeHistory param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeHistory
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
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameModule param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameModule.MY_QNAME,
                  factory));

      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */
  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SupportsEarMark param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SupportsEarMark.MY_QNAME,
                  factory));

      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */
  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetLabels param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetLabels.MY_QNAME,
                  factory));

      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */
  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameAttributes param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameAttributes.MY_QNAME,
                  factory));

      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */
  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateLabel param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateLabel.MY_QNAME,
                  factory));

      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */
  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateLabel param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateLabel.MY_QNAME,
                  factory));

      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */
  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckoutAttributes param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckoutAttributes
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
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckinAttributes param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckinAttributes
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
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetModules param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetModules.MY_QNAME,
                  factory));

      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */
  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteLabel param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteLabel.MY_QNAME,
                  factory));

      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */
  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SaveAttributes param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SaveAttributes.MY_QNAME,
                  factory));

      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */
  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.FindAttributes param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.FindAttributes.MY_QNAME,
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
      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckinAttributes.class.equals(
          type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckinAttributes.Factory
            .parse(param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckoutAttributes.class.equals(
          type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckoutAttributes.Factory
            .parse(param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateAttribute.class.equals(
          type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateAttribute.Factory
            .parse(param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateAttributeResponse.class
          .equals(type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateAttributeResponse
            .Factory.parse(param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateLabel.class.equals(type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateLabel.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateLabelResponse.class.equals(
          type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateLabelResponse.Factory
            .parse(param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateModule.class.equals(type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateModule.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateModuleResponse.class.equals(
          type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CreateModuleResponse.Factory
            .parse(param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteAttributes.class.equals(
          type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteAttributes.Factory
            .parse(param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteLabel.class.equals(type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteLabel.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteLabelResponse.class.equals(
          type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteLabelResponse.Factory
            .parse(param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteModule.class.equals(type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteModule.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteModuleResponse.class.equals(
          type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteModuleResponse.Factory
            .parse(param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.Exceptions.class.equals(type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.Exceptions.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.FindAttributes.class.equals(
          type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.FindAttributes.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.FindAttributesResponse.class
          .equals(type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.FindAttributesResponse
            .Factory.parse(param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttribute.class.equals(type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttribute.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeHistory.class.equals(
          type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeHistory.Factory
            .parse(param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeHistoryResponse.class
          .equals(type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeHistoryResponse
            .Factory.parse(param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeLabels.class.equals(
          type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeLabels.Factory
            .parse(param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeLabelsResponse.class
          .equals(type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeLabelsResponse
            .Factory.parse(param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeResponse.class.equals(
          type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeResponse.Factory
            .parse(param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributes.class.equals(
          type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributes.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributesResponse.class
          .equals(type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributesResponse.Factory
            .parse(param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetLabels.class.equals(type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetLabels.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetLabelsResponse.class.equals(
          type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetLabelsResponse.Factory
            .parse(param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetModules.class.equals(type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetModules.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetModulesResponse.class.equals(
          type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetModulesResponse.Factory
            .parse(param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ImportAttributes.class.equals(
          type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ImportAttributes.Factory
            .parse(param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ListAttributeTypes.class.equals(
          type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ListAttributeTypes.Factory
            .parse(param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ListAttributeTypesResponse.class
          .equals(type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ListAttributeTypesResponse
            .Factory.parse(param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameAttributes.class.equals(
          type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameAttributes.Factory
            .parse(param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameModule.class.equals(type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameModule.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameModuleResponse.class.equals(
          type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameModuleResponse.Factory
            .parse(param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RollbackAttributes.class.equals(
          type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RollbackAttributes.Factory
            .parse(param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SaveAttributes.class.equals(
          type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SaveAttributes.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SupportsEarMark.class.equals(
          type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SupportsEarMark.Factory
            .parse(param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SupportsEarMarkResponse.class
          .equals(type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SupportsEarMarkResponse
            .Factory.parse(param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateAttributesResponse.class
          .equals(type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateAttributesResponse
            .Factory.parse(param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateLabel.class.equals(type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateLabel.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
      }

      if (org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateLabelResponse.class.equals(
          type)) {
        return org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateLabelResponse.Factory
            .parse(param.getXMLStreamReaderWithoutCaching());
      }
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }

    return null;
  }
}

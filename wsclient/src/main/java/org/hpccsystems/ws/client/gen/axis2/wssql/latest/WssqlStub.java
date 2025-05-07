/**
 * WssqlStub.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 2.0.0 Built on : Mar 05,
 * 2025 (12:49:45 HST)
 */
package org.hpccsystems.ws.client.gen.axis2.wssql.latest;

/*
 *  WssqlStub java implementation
 */

public class WssqlStub extends org.apache.axis2.client.Stub implements Wssql {
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
    _service = new org.apache.axis2.description.AxisService("Wssql" + getUniqueSuffix());
    addAnonymousOperations();

    // creating the operations
    org.apache.axis2.description.AxisOperation __operation;

    _operations = new org.apache.axis2.description.AxisOperation[11];

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "executeSQL"));
    _service.addOperation(__operation);

    _operations[0] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "prepareSQL"));
    _service.addOperation(__operation);

    _operations[1] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "getDBSystemInfo"));
    _service.addOperation(__operation);

    _operations[2] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "getRelatedIndexes"));
    _service.addOperation(__operation);

    _operations[3] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "getDBMetaData"));
    _service.addOperation(__operation);

    _operations[4] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "setRelatedIndexes"));
    _service.addOperation(__operation);

    _operations[5] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "getResults"));
    _service.addOperation(__operation);

    _operations[6] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ping"));
    _service.addOperation(__operation);

    _operations[7] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "echo"));
    _service.addOperation(__operation);

    _operations[8] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "createTableAndLoad"));
    _service.addOperation(__operation);

    _operations[9] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "executePreparedSQL"));
    _service.addOperation(__operation);

    _operations[10] = __operation;
  }

  // populates the faults
  private void populateFaults() {

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"), "ExecuteSQL"),
        "org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"), "ExecuteSQL"),
        "org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"), "ExecuteSQL"),
        "org.hpccsystems.ws.client.gen.axis2.wssql.latest.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"), "PrepareSQL"),
        "org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"), "PrepareSQL"),
        "org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"), "PrepareSQL"),
        "org.hpccsystems.ws.client.gen.axis2.wssql.latest.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"),
            "GetDBSystemInfo"),
        "org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"),
            "GetDBSystemInfo"),
        "org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"),
            "GetDBSystemInfo"),
        "org.hpccsystems.ws.client.gen.axis2.wssql.latest.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"),
            "GetRelatedIndexes"),
        "org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"),
            "GetRelatedIndexes"),
        "org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"),
            "GetRelatedIndexes"),
        "org.hpccsystems.ws.client.gen.axis2.wssql.latest.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"),
            "GetDBMetaData"),
        "org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"),
            "GetDBMetaData"),
        "org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"),
            "GetDBMetaData"),
        "org.hpccsystems.ws.client.gen.axis2.wssql.latest.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"),
            "SetRelatedIndexes"),
        "org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"),
            "SetRelatedIndexes"),
        "org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"),
            "SetRelatedIndexes"),
        "org.hpccsystems.ws.client.gen.axis2.wssql.latest.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"), "GetResults"),
        "org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"), "GetResults"),
        "org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"), "GetResults"),
        "org.hpccsystems.ws.client.gen.axis2.wssql.latest.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"), "Ping"),
        "org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"), "Ping"),
        "org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"), "Ping"),
        "org.hpccsystems.ws.client.gen.axis2.wssql.latest.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"), "Echo"),
        "org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"), "Echo"),
        "org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"), "Echo"),
        "org.hpccsystems.ws.client.gen.axis2.wssql.latest.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"),
            "CreateTableAndLoad"),
        "org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"),
            "CreateTableAndLoad"),
        "org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"),
            "CreateTableAndLoad"),
        "org.hpccsystems.ws.client.gen.axis2.wssql.latest.Exceptions");

    faultExceptionNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"),
            "ExecutePreparedSQL"),
        "org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault");
    faultExceptionClassNameMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"),
            "ExecutePreparedSQL"),
        "org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault");
    faultMessageMap.put(
        new org.apache.axis2.client.FaultMapKey(
            new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "Exceptions"),
            "ExecutePreparedSQL"),
        "org.hpccsystems.ws.client.gen.axis2.wssql.latest.Exceptions");
  }

  /** Constructor that takes in a configContext */
  public WssqlStub(
      org.apache.axis2.context.ConfigurationContext configurationContext,
      java.lang.String targetEndpoint)
      throws org.apache.axis2.AxisFault {
    this(configurationContext, targetEndpoint, false);
  }

  /** Constructor that takes in a configContext and useseperate listner */
  public WssqlStub(
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
  public WssqlStub(org.apache.axis2.context.ConfigurationContext configurationContext)
      throws org.apache.axis2.AxisFault {

    this(configurationContext, "http://172.27.163.120:8510/wssql?ver_=3.06");
  }

  /** Default Constructor */
  public WssqlStub() throws org.apache.axis2.AxisFault {

    this("http://172.27.163.120:8510/wssql?ver_=3.06");
  }

  /** Constructor taking the target endpoint */
  public WssqlStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
    this(null, targetEndpoint);
  }

  /**
   * Auto generated method signature
   *
   * @see org.hpccsystems.ws.client.gen.axis2.wssql.latest.Wssql#executeSQL
   * @param executeSQLRequest0
   * @throws org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecuteSQLResponse executeSQL(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecuteSQLRequest executeSQLRequest0)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[0].getName());
      _operationClient.getOptions().setAction("wssql/ExecuteSQL?ver_=3.06");
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
              executeSQLRequest0,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "executeSQL")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ExecuteSQLRequest"));

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
              org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecuteSQLResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecuteSQLResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ExecuteSQL"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ExecuteSQL"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ExecuteSQL"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wssql.latest.Wssql#prepareSQL
   * @param prepareSQLRequest2
   * @throws org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssql.latest.PrepareSQLResponse prepareSQL(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.PrepareSQLRequest prepareSQLRequest2)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[1].getName());
      _operationClient.getOptions().setAction("wssql/PrepareSQL?ver_=3.06");
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
              prepareSQLRequest2,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "prepareSQL")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "PrepareSQLRequest"));

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
              org.hpccsystems.ws.client.gen.axis2.wssql.latest.PrepareSQLResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wssql.latest.PrepareSQLResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "PrepareSQL"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "PrepareSQL"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "PrepareSQL"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wssql.latest.Wssql#getDBSystemInfo
   * @param getDBSystemInfoRequest4
   * @throws org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBSystemInfoResponse getDBSystemInfo(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBSystemInfoRequest
          getDBSystemInfoRequest4)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[2].getName());
      _operationClient.getOptions().setAction("wssql/GetDBSystemInfo?ver_=3.06");
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
              getDBSystemInfoRequest4,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "getDBSystemInfo")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "GetDBSystemInfoRequest"));

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
              org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBSystemInfoResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBSystemInfoResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetDBSystemInfo"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "GetDBSystemInfo"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "GetDBSystemInfo"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wssql.latest.Wssql#getRelatedIndexes
   * @param getRelatedIndexesRequest6
   * @throws org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetRelatedIndexesResponse
      getRelatedIndexes(
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetRelatedIndexesRequest
              getRelatedIndexesRequest6)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[3].getName());
      _operationClient.getOptions().setAction("wssql/GetRelatedIndexes?ver_=3.06");
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
              getRelatedIndexesRequest6,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "getRelatedIndexes")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wssql", "GetRelatedIndexesRequest"));

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
              org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetRelatedIndexesResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetRelatedIndexesResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetRelatedIndexes"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "GetRelatedIndexes"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "GetRelatedIndexes"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wssql.latest.Wssql#getDBMetaData
   * @param getDBMetaDataRequest8
   * @throws org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBMetaDataResponse getDBMetaData(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBMetaDataRequest getDBMetaDataRequest8)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[4].getName());
      _operationClient.getOptions().setAction("wssql/GetDBMetaData?ver_=3.06");
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
              getDBMetaDataRequest8,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "getDBMetaData")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "GetDBMetaDataRequest"));

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
              org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBMetaDataResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBMetaDataResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetDBMetaData"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetDBMetaData"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetDBMetaData"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wssql.latest.Wssql#setRelatedIndexes
   * @param setRelatedIndexesRequest10
   * @throws org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssql.latest.SetRelatedIndexesResponse
      setRelatedIndexes(
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.SetRelatedIndexesRequest
              setRelatedIndexesRequest10)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[5].getName());
      _operationClient.getOptions().setAction("wssql/SetRelatedIndexes?ver_=3.06");
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
              setRelatedIndexesRequest10,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "setRelatedIndexes")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wssql", "SetRelatedIndexesRequest"));

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
              org.hpccsystems.ws.client.gen.axis2.wssql.latest.SetRelatedIndexesResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wssql.latest.SetRelatedIndexesResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "SetRelatedIndexes"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "SetRelatedIndexes"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "SetRelatedIndexes"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wssql.latest.Wssql#getResults
   * @param getResultsRequest12
   * @throws org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetResultsResponse getResults(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetResultsRequest getResultsRequest12)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[6].getName());
      _operationClient.getOptions().setAction("wssql/GetResults?ver_=3.06");
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
              getResultsRequest12,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "getResults")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "GetResultsRequest"));

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
              org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetResultsResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetResultsResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetResults"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetResults"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "GetResults"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wssql.latest.Wssql#ping
   * @param wssqlPingRequest14
   * @throws org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssql.latest.WssqlPingResponse ping(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.WssqlPingRequest wssqlPingRequest14)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[7].getName());
      _operationClient.getOptions().setAction("wssql/Ping?ver_=3.06");
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
              wssqlPingRequest14,
              optimizeContent(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "ping")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "wssqlPingRequest"));

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
              org.hpccsystems.ws.client.gen.axis2.wssql.latest.WssqlPingResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wssql.latest.WssqlPingResponse) object;

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

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wssql.latest.Wssql#echo
   * @param echoRequest16
   * @throws org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssql.latest.EchoResponse echo(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.EchoRequest echoRequest16)
      throws java.rmi.RemoteException,
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[8].getName());
      _operationClient.getOptions().setAction("wssql/Echo?ver_=3.06");
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
              echoRequest16,
              optimizeContent(new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "echo")),
              new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "EchoRequest"));

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
              org.hpccsystems.ws.client.gen.axis2.wssql.latest.EchoResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wssql.latest.EchoResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Echo"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Echo"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "Echo"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wssql.latest.Wssql#createTableAndLoad
   * @param createTableAndLoadRequest18
   * @throws org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssql.latest.CreateTableAndLoadResponse
      createTableAndLoad(
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.CreateTableAndLoadRequest
              createTableAndLoadRequest18)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[9].getName());
      _operationClient.getOptions().setAction("wssql/CreateTableAndLoad?ver_=3.06");
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
              createTableAndLoadRequest18,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "createTableAndLoad")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wssql", "CreateTableAndLoadRequest"));

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
              org.hpccsystems.ws.client.gen.axis2.wssql.latest.CreateTableAndLoadResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wssql.latest.CreateTableAndLoadResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "CreateTableAndLoad"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "CreateTableAndLoad"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "CreateTableAndLoad"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault) ex;
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
   * @see org.hpccsystems.ws.client.gen.axis2.wssql.latest.Wssql#executePreparedSQL
   * @param executePreparedSQLRequest20
   * @throws org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault :
   */
  public org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecutePreparedSQLResponse
      executePreparedSQL(
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecutePreparedSQLRequest
              executePreparedSQLRequest20)
          throws java.rmi.RemoteException,
              org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault {
    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[10].getName());
      _operationClient.getOptions().setAction("wssql/ExecutePreparedSQL?ver_=3.06");
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
              executePreparedSQLRequest20,
              optimizeContent(
                  new javax.xml.namespace.QName("urn:hpccsystems:ws:wssql", "executePreparedSQL")),
              new javax.xml.namespace.QName(
                  "urn:hpccsystems:ws:wssql", "ExecutePreparedSQLRequest"));

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
              org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecutePreparedSQLResponse.class);
      org.apache.axis2.kernel.TransportUtils.detachInputStream(_returnMessageContext);

      return (org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecutePreparedSQLResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "ExecutePreparedSQL"))) {
          // make the fault by reflection
          try {
            java.lang.String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "ExecutePreparedSQL"));
            java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(java.lang.String.class);
            java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());
            // message class
            java.lang.String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "ExecutePreparedSQL"));
            java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
            java.lang.Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new java.lang.Class[] {messageClass});
            m.invoke(ex, new java.lang.Object[] {messageObject});

            if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault) {
              throw (org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspSoapFault) ex;
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
  // http://172.27.163.120:8510/wssql?ver_=3.06
  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecuteSQLRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecuteSQLRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecuteSQLResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecuteSQLResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.Exceptions param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.Exceptions.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.PrepareSQLRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.PrepareSQLRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.PrepareSQLResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.PrepareSQLResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBSystemInfoRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBSystemInfoRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBSystemInfoResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBSystemInfoResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetRelatedIndexesRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetRelatedIndexesRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetRelatedIndexesResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetRelatedIndexesResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBMetaDataRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBMetaDataRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBMetaDataResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBMetaDataResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.SetRelatedIndexesRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.SetRelatedIndexesRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.SetRelatedIndexesResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.SetRelatedIndexesResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetResultsRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetResultsRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetResultsResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetResultsResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.WssqlPingRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.WssqlPingRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.WssqlPingResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.WssqlPingResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.EchoRequest param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.EchoRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.EchoResponse param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.EchoResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.CreateTableAndLoadRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.CreateTableAndLoadRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.CreateTableAndLoadResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.CreateTableAndLoadResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecutePreparedSQLRequest param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecutePreparedSQLRequest.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecutePreparedSQLResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecutePreparedSQLResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecuteSQLRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecuteSQLRequest.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.PrepareSQLRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wssql.latest.PrepareSQLRequest.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBSystemInfoRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBSystemInfoRequest.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetRelatedIndexesRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetRelatedIndexesRequest
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
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBMetaDataRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBMetaDataRequest.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.SetRelatedIndexesRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wssql.latest.SetRelatedIndexesRequest
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
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetResultsRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetResultsRequest.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.WssqlPingRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wssql.latest.WssqlPingRequest.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.EchoRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wssql.latest.EchoRequest.MY_QNAME, factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.CreateTableAndLoadRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wssql.latest.CreateTableAndLoadRequest
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
      org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecutePreparedSQLRequest param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecutePreparedSQLRequest
                      .MY_QNAME,
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

      if (org.hpccsystems.ws.client.gen.axis2.wssql.latest.CreateTableAndLoadRequest.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wssql.latest.CreateTableAndLoadRequest.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wssql.latest.CreateTableAndLoadResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wssql.latest.CreateTableAndLoadResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wssql.latest.EchoRequest.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wssql.latest.EchoRequest.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wssql.latest.EchoResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wssql.latest.EchoResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wssql.latest.Exceptions.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wssql.latest.Exceptions.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecutePreparedSQLRequest.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecutePreparedSQLRequest.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecutePreparedSQLResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecutePreparedSQLResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecuteSQLRequest.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecuteSQLRequest.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecuteSQLResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecuteSQLResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBMetaDataRequest.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBMetaDataRequest.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBMetaDataResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBMetaDataResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBSystemInfoRequest.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBSystemInfoRequest.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBSystemInfoResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBSystemInfoResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetRelatedIndexesRequest.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetRelatedIndexesRequest.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetRelatedIndexesResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetRelatedIndexesResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetResultsRequest.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetResultsRequest.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetResultsResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetResultsResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wssql.latest.PrepareSQLRequest.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wssql.latest.PrepareSQLRequest.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wssql.latest.PrepareSQLResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wssql.latest.PrepareSQLResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wssql.latest.SetRelatedIndexesRequest.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wssql.latest.SetRelatedIndexesRequest.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wssql.latest.SetRelatedIndexesResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wssql.latest.SetRelatedIndexesResponse.Factory
                .parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wssql.latest.WssqlPingRequest.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wssql.latest.WssqlPingRequest.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (org.hpccsystems.ws.client.gen.axis2.wssql.latest.WssqlPingResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            org.hpccsystems.ws.client.gen.axis2.wssql.latest.WssqlPingResponse.Factory.parse(
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

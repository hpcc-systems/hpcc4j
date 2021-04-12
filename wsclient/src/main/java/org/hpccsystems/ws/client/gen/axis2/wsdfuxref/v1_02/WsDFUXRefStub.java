/**
 * WsDFUXRefStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02;


/*
 *  WsDFUXRefStub java implementation
 */
public class WsDFUXRefStub extends org.apache.axis2.client.Stub
    implements WsDFUXRef {
    private static int counter = 0;
    protected org.apache.axis2.description.AxisOperation[] _operations;

    //hashmaps to keep the fault mapping
    private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
    private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
    private java.util.HashMap faultMessageMap = new java.util.HashMap();
    private javax.xml.namespace.QName[] opNameArray = null;

    /**
     *Constructor that takes in a configContext
     */
    public WsDFUXRefStub(
        org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false);
    }

    /**
     * Constructor that takes in a configContext  and useseperate listner
     */
    public WsDFUXRefStub(
        org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
        //To populate AxisService
        populateAxisService();
        populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,
                _service);

        _serviceClient.getOptions()
                      .setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
    }

    /**
     * Default Constructor
     */
    public WsDFUXRefStub(
        org.apache.axis2.context.ConfigurationContext configurationContext)
        throws org.apache.axis2.AxisFault {
        this(configurationContext,
            "http://10.173.160.101:8010/WsDFUXRef?ver_=1.02");
    }

    /**
     * Default Constructor
     */
    public WsDFUXRefStub() throws org.apache.axis2.AxisFault {
        this("http://10.173.160.101:8010/WsDFUXRef?ver_=1.02");
    }

    /**
     * Constructor taking the target endpoint
     */
    public WsDFUXRefStub(java.lang.String targetEndpoint)
        throws org.apache.axis2.AxisFault {
        this(null, targetEndpoint);
    }

    private static synchronized java.lang.String getUniqueSuffix() {
        // reset the counter if it is greater than 99999
        if (counter > 99999) {
            counter = 0;
        }

        counter = counter + 1;

        return java.lang.Long.toString(java.lang.System.currentTimeMillis()) +
        "_" + counter;
    }

    private void populateAxisService() throws org.apache.axis2.AxisFault {
        //creating the Service with a unique name
        _service = new org.apache.axis2.description.AxisService("WsDFUXRef" +
                getUniqueSuffix());
        addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[12];

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsdfuxref", "dFUXRefOrphanFiles"));
        _service.addOperation(__operation);

        _operations[0] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsdfuxref", "dFUXRefList"));
        _service.addOperation(__operation);

        _operations[1] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsdfuxref", "dFUXRefFoundFiles"));
        _service.addOperation(__operation);

        _operations[2] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsdfuxref", "dFUXRefBuildCancel"));
        _service.addOperation(__operation);

        _operations[3] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsdfuxref", "dFUXRefArrayAction"));
        _service.addOperation(__operation);

        _operations[4] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsdfuxref", "dFUXRefLostFiles"));
        _service.addOperation(__operation);

        _operations[5] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsdfuxref", "dFUXRefMessages"));
        _service.addOperation(__operation);

        _operations[6] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsdfuxref", "ping"));
        _service.addOperation(__operation);

        _operations[7] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsdfuxref", "dFUXRefDirectories"));
        _service.addOperation(__operation);

        _operations[8] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsdfuxref", "dFUXRefUnusedFiles"));
        _service.addOperation(__operation);

        _operations[9] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsdfuxref", "dFUXRefCleanDirectories"));
        _service.addOperation(__operation);

        _operations[10] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wsdfuxref", "dFUXRefBuild"));
        _service.addOperation(__operation);

        _operations[11] = __operation;
    }

    //populates the faults
    private void populateFaults() {
        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref",
                    "Exceptions"), "DFUXRefOrphanFiles"),
            "org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref",
                    "Exceptions"), "DFUXRefOrphanFiles"),
            "org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref",
                    "Exceptions"), "DFUXRefOrphanFiles"),
            "org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref",
                    "Exceptions"), "DFUXRefList"),
            "org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref",
                    "Exceptions"), "DFUXRefList"),
            "org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref",
                    "Exceptions"), "DFUXRefList"),
            "org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref",
                    "Exceptions"), "DFUXRefFoundFiles"),
            "org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref",
                    "Exceptions"), "DFUXRefFoundFiles"),
            "org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref",
                    "Exceptions"), "DFUXRefFoundFiles"),
            "org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref",
                    "Exceptions"), "DFUXRefBuildCancel"),
            "org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref",
                    "Exceptions"), "DFUXRefBuildCancel"),
            "org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref",
                    "Exceptions"), "DFUXRefBuildCancel"),
            "org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref",
                    "Exceptions"), "DFUXRefArrayAction"),
            "org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref",
                    "Exceptions"), "DFUXRefArrayAction"),
            "org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref",
                    "Exceptions"), "DFUXRefArrayAction"),
            "org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref",
                    "Exceptions"), "DFUXRefLostFiles"),
            "org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref",
                    "Exceptions"), "DFUXRefLostFiles"),
            "org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref",
                    "Exceptions"), "DFUXRefLostFiles"),
            "org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref",
                    "Exceptions"), "DFUXRefMessages"),
            "org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref",
                    "Exceptions"), "DFUXRefMessages"),
            "org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref",
                    "Exceptions"), "DFUXRefMessages"),
            "org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref",
                    "Exceptions"), "Ping"),
            "org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref",
                    "Exceptions"), "Ping"),
            "org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref",
                    "Exceptions"), "Ping"),
            "org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref",
                    "Exceptions"), "DFUXRefDirectories"),
            "org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref",
                    "Exceptions"), "DFUXRefDirectories"),
            "org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref",
                    "Exceptions"), "DFUXRefDirectories"),
            "org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref",
                    "Exceptions"), "DFUXRefUnusedFiles"),
            "org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref",
                    "Exceptions"), "DFUXRefUnusedFiles"),
            "org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref",
                    "Exceptions"), "DFUXRefUnusedFiles"),
            "org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref",
                    "Exceptions"), "DFUXRefCleanDirectories"),
            "org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref",
                    "Exceptions"), "DFUXRefCleanDirectories"),
            "org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref",
                    "Exceptions"), "DFUXRefCleanDirectories"),
            "org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref",
                    "Exceptions"), "DFUXRefBuild"),
            "org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref",
                    "Exceptions"), "DFUXRefBuild"),
            "org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:wsdfuxref",
                    "Exceptions"), "DFUXRefBuild"),
            "org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.Exceptions");
    }

    /**
     * Auto generated method signature
     *
     * @see org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.WsDFUXRef#dFUXRefOrphanFiles
     * @param dFUXRefOrphanFilesQueryRequest0
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefOrphanFilesQueryResponse dFUXRefOrphanFiles(
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefOrphanFilesQueryRequest dFUXRefOrphanFilesQueryRequest0)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
            _operationClient.getOptions()
                            .setAction("WsDFUXRef/DFUXRefOrphanFiles?ver_=1.02");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    dFUXRefOrphanFilesQueryRequest0,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsdfuxref", "dFUXRefOrphanFiles")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfuxref",
                        "DFUXRefOrphanFilesQueryRequest"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefOrphanFilesQueryResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefOrphanFilesQueryResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "DFUXRefOrphanFiles"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DFUXRefOrphanFiles"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DFUXRefOrphanFiles"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault) ex;
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
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature
     *
     * @see org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.WsDFUXRef#dFUXRefList
     * @param dFUXRefListRequest2
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefListResponse dFUXRefList(
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefListRequest dFUXRefListRequest2)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
            _operationClient.getOptions()
                            .setAction("WsDFUXRef/DFUXRefList?ver_=1.02");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    dFUXRefListRequest2,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsdfuxref", "dFUXRefList")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfuxref", "DFUXRefListRequest"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefListResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefListResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "DFUXRefList"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DFUXRefList"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DFUXRefList"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault) ex;
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
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature
     *
     * @see org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.WsDFUXRef#dFUXRefFoundFiles
     * @param dFUXRefFoundFilesQueryRequest4
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefFoundFilesQueryResponse dFUXRefFoundFiles(
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefFoundFilesQueryRequest dFUXRefFoundFilesQueryRequest4)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
            _operationClient.getOptions()
                            .setAction("WsDFUXRef/DFUXRefFoundFiles?ver_=1.02");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    dFUXRefFoundFilesQueryRequest4,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsdfuxref", "dFUXRefFoundFiles")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfuxref",
                        "DFUXRefFoundFilesQueryRequest"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefFoundFilesQueryResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefFoundFilesQueryResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "DFUXRefFoundFiles"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DFUXRefFoundFiles"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DFUXRefFoundFiles"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault) ex;
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
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature
     *
     * @see org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.WsDFUXRef#dFUXRefBuildCancel
     * @param dFUXRefBuildCancelRequest6
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefBuildCancelResponse dFUXRefBuildCancel(
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefBuildCancelRequest dFUXRefBuildCancelRequest6)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
            _operationClient.getOptions()
                            .setAction("WsDFUXRef/DFUXRefBuildCancel?ver_=1.02");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    dFUXRefBuildCancelRequest6,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsdfuxref", "dFUXRefBuildCancel")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfuxref",
                        "DFUXRefBuildCancelRequest"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefBuildCancelResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefBuildCancelResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "DFUXRefBuildCancel"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DFUXRefBuildCancel"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DFUXRefBuildCancel"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault) ex;
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
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature
     *
     * @see org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.WsDFUXRef#dFUXRefArrayAction
     * @param dFUXRefArrayActionRequest8
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefArrayActionResponse dFUXRefArrayAction(
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefArrayActionRequest dFUXRefArrayActionRequest8)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
            _operationClient.getOptions()
                            .setAction("WsDFUXRef/DFUXRefArrayAction?ver_=1.02");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    dFUXRefArrayActionRequest8,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsdfuxref", "dFUXRefArrayAction")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfuxref",
                        "DFUXRefArrayActionRequest"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefArrayActionResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefArrayActionResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "DFUXRefArrayAction"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DFUXRefArrayAction"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DFUXRefArrayAction"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault) ex;
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
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature
     *
     * @see org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.WsDFUXRef#dFUXRefLostFiles
     * @param dFUXRefLostFilesQueryRequest10
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefLostFilesQueryResponse dFUXRefLostFiles(
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefLostFilesQueryRequest dFUXRefLostFilesQueryRequest10)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
            _operationClient.getOptions()
                            .setAction("WsDFUXRef/DFUXRefLostFiles?ver_=1.02");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    dFUXRefLostFilesQueryRequest10,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsdfuxref", "dFUXRefLostFiles")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfuxref",
                        "DFUXRefLostFilesQueryRequest"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefLostFilesQueryResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefLostFilesQueryResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "DFUXRefLostFiles"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DFUXRefLostFiles"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DFUXRefLostFiles"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault) ex;
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
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature
     *
     * @see org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.WsDFUXRef#dFUXRefMessages
     * @param dFUXRefMessagesQueryRequest12
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefMessagesQueryResponse dFUXRefMessages(
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefMessagesQueryRequest dFUXRefMessagesQueryRequest12)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
            _operationClient.getOptions()
                            .setAction("WsDFUXRef/DFUXRefMessages?ver_=1.02");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    dFUXRefMessagesQueryRequest12,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsdfuxref", "dFUXRefMessages")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfuxref",
                        "DFUXRefMessagesQueryRequest"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefMessagesQueryResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefMessagesQueryResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "DFUXRefMessages"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DFUXRefMessages"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DFUXRefMessages"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault) ex;
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
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature
     *
     * @see org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.WsDFUXRef#ping
     * @param wsDFUXRefPingRequest14
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.WsDFUXRefPingResponse ping(
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.WsDFUXRefPingRequest wsDFUXRefPingRequest14)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
            _operationClient.getOptions().setAction("WsDFUXRef/Ping?ver_=1.02");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wsDFUXRefPingRequest14,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsdfuxref", "ping")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfuxref", "WsDFUXRefPingRequest"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.WsDFUXRefPingResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.WsDFUXRefPingResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "Ping"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "Ping"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "Ping"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault) ex;
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
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature
     *
     * @see org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.WsDFUXRef#dFUXRefDirectories
     * @param dFUXRefDirectoriesQueryRequest16
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefDirectoriesQueryResponse dFUXRefDirectories(
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefDirectoriesQueryRequest dFUXRefDirectoriesQueryRequest16)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
            _operationClient.getOptions()
                            .setAction("WsDFUXRef/DFUXRefDirectories?ver_=1.02");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    dFUXRefDirectoriesQueryRequest16,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsdfuxref", "dFUXRefDirectories")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfuxref",
                        "DFUXRefDirectoriesQueryRequest"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefDirectoriesQueryResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefDirectoriesQueryResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "DFUXRefDirectories"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DFUXRefDirectories"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DFUXRefDirectories"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault) ex;
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
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature
     *
     * @see org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.WsDFUXRef#dFUXRefUnusedFiles
     * @param dFUXRefUnusedFilesRequest18
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefUnusedFilesResponse dFUXRefUnusedFiles(
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefUnusedFilesRequest dFUXRefUnusedFilesRequest18)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
            _operationClient.getOptions()
                            .setAction("WsDFUXRef/DFUXRefUnusedFiles?ver_=1.02");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    dFUXRefUnusedFilesRequest18,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsdfuxref", "dFUXRefUnusedFiles")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfuxref",
                        "DFUXRefUnusedFilesRequest"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefUnusedFilesResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefUnusedFilesResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "DFUXRefUnusedFiles"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DFUXRefUnusedFiles"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DFUXRefUnusedFiles"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault) ex;
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
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature
     *
     * @see org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.WsDFUXRef#dFUXRefCleanDirectories
     * @param dFUXRefCleanDirectoriesRequest20
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefCleanDirectoriesResponse dFUXRefCleanDirectories(
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefCleanDirectoriesRequest dFUXRefCleanDirectoriesRequest20)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
            _operationClient.getOptions()
                            .setAction("WsDFUXRef/DFUXRefCleanDirectories?ver_=1.02");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    dFUXRefCleanDirectoriesRequest20,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsdfuxref",
                            "dFUXRefCleanDirectories")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfuxref",
                        "DFUXRefCleanDirectoriesRequest"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefCleanDirectoriesResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefCleanDirectoriesResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "DFUXRefCleanDirectories"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "DFUXRefCleanDirectories"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "DFUXRefCleanDirectories"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault) ex;
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
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
            }
        }
    }

    /**
     * Auto generated method signature
     *
     * @see org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.WsDFUXRef#dFUXRefBuild
     * @param dFUXRefBuildRequest22
     * @throws org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefBuildResponse dFUXRefBuild(
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefBuildRequest dFUXRefBuildRequest22)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
            _operationClient.getOptions()
                            .setAction("WsDFUXRef/DFUXRefBuild?ver_=1.02");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    dFUXRefBuildRequest22,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wsdfuxref", "dFUXRefBuild")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wsdfuxref", "DFUXRefBuildRequest"));

            //adding SOAP soap_headers
            _serviceClient.addHeadersToEnvelope(env);
            // set the message context with that soap envelope
            _messageContext.setEnvelope(env);

            // add the message contxt to the operation client
            _operationClient.addMessageContext(_messageContext);

            //execute the operation client
            _operationClient.execute(true);

            org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
            org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

            java.lang.Object object = fromOM(_returnEnv.getBody()
                                                       .getFirstElement(),
                    org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefBuildResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefBuildResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "DFUXRefBuild"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DFUXRefBuild"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DFUXRefBuild"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.EspSoapFault) ex;
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
                _messageContext.getTransportOut().getSender()
                               .cleanup(_messageContext);
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

    //http://10.173.160.101:8010/WsDFUXRef?ver_=1.02
    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefOrphanFilesQueryRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefOrphanFilesQueryRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefOrphanFilesQueryResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefOrphanFilesQueryResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.Exceptions param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.Exceptions.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefListRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefListRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefListResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefListResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefFoundFilesQueryRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefFoundFilesQueryRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefFoundFilesQueryResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefFoundFilesQueryResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefBuildCancelRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefBuildCancelRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefBuildCancelResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefBuildCancelResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefArrayActionRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefArrayActionRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefArrayActionResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefArrayActionResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefLostFilesQueryRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefLostFilesQueryRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefLostFilesQueryResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefLostFilesQueryResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefMessagesQueryRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefMessagesQueryRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefMessagesQueryResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefMessagesQueryResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.WsDFUXRefPingRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.WsDFUXRefPingRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.WsDFUXRefPingResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.WsDFUXRefPingResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefDirectoriesQueryRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefDirectoriesQueryRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefDirectoriesQueryResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefDirectoriesQueryResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefUnusedFilesRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefUnusedFilesRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefUnusedFilesResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefUnusedFilesResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefCleanDirectoriesRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefCleanDirectoriesRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefCleanDirectoriesResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefCleanDirectoriesResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefBuildRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefBuildRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefBuildResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefBuildResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefOrphanFilesQueryRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefOrphanFilesQueryRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefListRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefListRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefFoundFilesQueryRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefFoundFilesQueryRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefBuildCancelRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefBuildCancelRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefArrayActionRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefArrayActionRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefLostFilesQueryRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefLostFilesQueryRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefMessagesQueryRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefMessagesQueryRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.WsDFUXRefPingRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.WsDFUXRefPingRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefDirectoriesQueryRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefDirectoriesQueryRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefUnusedFilesRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefUnusedFilesRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefCleanDirectoriesRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefCleanDirectoriesRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefBuildRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefBuildRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */

    /**
     *  get the default envelope
     */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory) {
        return factory.getDefaultEnvelope();
    }

    private java.lang.Object fromOM(org.apache.axiom.om.OMElement param,
        java.lang.Class type) throws org.apache.axis2.AxisFault {
        try {
            if (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefArrayActionRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefArrayActionRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefArrayActionResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefArrayActionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefBuildCancelRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefBuildCancelRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefBuildCancelResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefBuildCancelResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefBuildRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefBuildRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefBuildResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefBuildResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefCleanDirectoriesRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefCleanDirectoriesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefCleanDirectoriesResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefCleanDirectoriesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefDirectoriesQueryRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefDirectoriesQueryRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefDirectoriesQueryResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefDirectoriesQueryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefFoundFilesQueryRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefFoundFilesQueryRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefFoundFilesQueryResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefFoundFilesQueryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefListRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefListRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefListResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefListResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefLostFilesQueryRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefLostFilesQueryRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefLostFilesQueryResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefLostFilesQueryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefMessagesQueryRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefMessagesQueryRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefMessagesQueryResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefMessagesQueryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefOrphanFilesQueryRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefOrphanFilesQueryRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefOrphanFilesQueryResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefOrphanFilesQueryResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefUnusedFilesRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefUnusedFilesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefUnusedFilesResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefUnusedFilesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.Exceptions.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.Exceptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.WsDFUXRefPingRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.WsDFUXRefPingRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.WsDFUXRefPingResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.WsDFUXRefPingResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return null;
    }
}

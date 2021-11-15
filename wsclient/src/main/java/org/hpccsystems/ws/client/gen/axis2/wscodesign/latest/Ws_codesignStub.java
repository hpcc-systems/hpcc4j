/**
 * Ws_codesignStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wscodesign.latest;


/*
 *  Ws_codesignStub java implementation
 */
public class Ws_codesignStub extends org.apache.axis2.client.Stub
    implements Ws_codesign {
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
    public Ws_codesignStub(
        org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false);
    }

    /**
     * Constructor that takes in a configContext  and useseperate listner
     */
    public Ws_codesignStub(
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
    public Ws_codesignStub(
        org.apache.axis2.context.ConfigurationContext configurationContext)
        throws org.apache.axis2.AxisFault {
        this(configurationContext, "http://localhost:8888/ws_codesign?ver_=1.1");
    }

    /**
     * Default Constructor
     */
    public Ws_codesignStub() throws org.apache.axis2.AxisFault {
        this("http://localhost:8888/ws_codesign?ver_=1.1");
    }

    /**
     * Constructor taking the target endpoint
     */
    public Ws_codesignStub(java.lang.String targetEndpoint)
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
        _service = new org.apache.axis2.description.AxisService("Ws_codesign" +
                getUniqueSuffix());
        addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[4];

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:ws_codesign", "sign"));
        _service.addOperation(__operation);

        _operations[0] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:ws_codesign", "verify"));
        _service.addOperation(__operation);

        _operations[1] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:ws_codesign", "listUserIDs"));
        _service.addOperation(__operation);

        _operations[2] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:ws_codesign", "ping"));
        _service.addOperation(__operation);

        _operations[3] = __operation;
    }

    //populates the faults
    private void populateFaults() {
        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:ws_codesign", "Exceptions"), "Sign"),
            "org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:ws_codesign", "Exceptions"), "Sign"),
            "org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:ws_codesign", "Exceptions"), "Sign"),
            "org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:ws_codesign", "Exceptions"), "Verify"),
            "org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:ws_codesign", "Exceptions"), "Verify"),
            "org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:ws_codesign", "Exceptions"), "Verify"),
            "org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:ws_codesign", "Exceptions"),
                "ListUserIDs"),
            "org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:ws_codesign", "Exceptions"),
                "ListUserIDs"),
            "org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:ws_codesign", "Exceptions"),
                "ListUserIDs"),
            "org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:ws_codesign", "Exceptions"), "Ping"),
            "org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:ws_codesign", "Exceptions"), "Ping"),
            "org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:ws_codesign", "Exceptions"), "Ping"),
            "org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.Exceptions");
    }

    /**
     * Auto generated method signature
     *
     * @see org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.Ws_codesign#sign
     * @param signRequest0
     * @throws org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.SignResponse sign(
        org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.SignRequest signRequest0)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
            _operationClient.getOptions().setAction("ws_codesign/Sign?ver_=1.1");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    signRequest0,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:ws_codesign", "sign")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:ws_codesign", "SignRequest"));

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
                    org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.SignResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.SignResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "Sign"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "Sign"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "Sign"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.Ws_codesign#verify
     * @param verifyRequest2
     * @throws org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.VerifyResponse verify(
        org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.VerifyRequest verifyRequest2)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
            _operationClient.getOptions()
                            .setAction("ws_codesign/Verify?ver_=1.1");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    verifyRequest2,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:ws_codesign", "verify")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:ws_codesign", "VerifyRequest"));

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
                    org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.VerifyResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.VerifyResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "Verify"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "Verify"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "Verify"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.Ws_codesign#listUserIDs
     * @param listUserIDsRequest4
     * @throws org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.ListUserIDsResponse listUserIDs(
        org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.ListUserIDsRequest listUserIDsRequest4)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
            _operationClient.getOptions()
                            .setAction("ws_codesign/ListUserIDs?ver_=1.1");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    listUserIDsRequest4,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:ws_codesign", "listUserIDs")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:ws_codesign", "ListUserIDsRequest"));

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
                    org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.ListUserIDsResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.ListUserIDsResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "ListUserIDs"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "ListUserIDs"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "ListUserIDs"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.Ws_codesign#ping
     * @param ws_codesignPingRequest6
     * @throws org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.Ws_codesignPingResponse ping(
        org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.Ws_codesignPingRequest ws_codesignPingRequest6)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
            _operationClient.getOptions().setAction("ws_codesign/Ping?ver_=1.1");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    ws_codesignPingRequest6,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:ws_codesign", "ping")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:ws_codesign",
                        "ws_codesignPingRequest"));

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
                    org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.Ws_codesignPingResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.Ws_codesignPingResponse) object;
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

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.EspSoapFault) ex;
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

    //http://localhost:8888/ws_codesign?ver_=1.1
    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.SignRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.SignRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.SignResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.SignResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.Exceptions param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.Exceptions.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.VerifyRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.VerifyRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.VerifyResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.VerifyResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.ListUserIDsRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.ListUserIDsRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.ListUserIDsResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.ListUserIDsResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.Ws_codesignPingRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.Ws_codesignPingRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.Ws_codesignPingResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.Ws_codesignPingResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.SignRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.SignRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.VerifyRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.VerifyRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.ListUserIDsRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.ListUserIDsRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.Ws_codesignPingRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.Ws_codesignPingRequest.MY_QNAME,
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
            if (org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.Exceptions.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.Exceptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.ListUserIDsRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.ListUserIDsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.ListUserIDsResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.ListUserIDsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.SignRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.SignRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.SignResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.SignResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.VerifyRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.VerifyRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.VerifyResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.VerifyResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.Ws_codesignPingRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.Ws_codesignPingRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.Ws_codesignPingResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.Ws_codesignPingResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return null;
    }
}

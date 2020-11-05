/**
 * WsPackageProcessStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04;


/*
 *  WsPackageProcessStub java implementation
 */
public class WsPackageProcessStub extends org.apache.axis2.client.Stub
    implements WsPackageProcess {
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
    public WsPackageProcessStub(
        org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false);
    }

    /**
     * Constructor that takes in a configContext  and useseperate listner
     */
    public WsPackageProcessStub(
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
    public WsPackageProcessStub(
        org.apache.axis2.context.ConfigurationContext configurationContext)
        throws org.apache.axis2.AxisFault {
        this(configurationContext,
            "http://10.173.160.101:8010/WsPackageProcess?ver_=1.04");
    }

    /**
     * Default Constructor
     */
    public WsPackageProcessStub() throws org.apache.axis2.AxisFault {
        this("http://10.173.160.101:8010/WsPackageProcess?ver_=1.04");
    }

    /**
     * Constructor taking the target endpoint
     */
    public WsPackageProcessStub(java.lang.String targetEndpoint)
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
        _service = new org.apache.axis2.description.AxisService(
                "WsPackageProcess" + getUniqueSuffix());
        addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[17];

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wspackageprocess", "deletePackage"));
        _service.addOperation(__operation);

        _operations[0] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wspackageprocess", "getPackage"));
        _service.addOperation(__operation);

        _operations[1] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wspackageprocess", "ping"));
        _service.addOperation(__operation);

        _operations[2] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wspackageprocess", "copyPackageMap"));
        _service.addOperation(__operation);

        _operations[3] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wspackageprocess", "addPackage"));
        _service.addOperation(__operation);

        _operations[4] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wspackageprocess", "validatePackage"));
        _service.addOperation(__operation);

        _operations[5] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wspackageprocess", "addPartToPackageMap"));
        _service.addOperation(__operation);

        _operations[6] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wspackageprocess", "activatePackage"));
        _service.addOperation(__operation);

        _operations[7] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wspackageprocess", "deActivatePackage"));
        _service.addOperation(__operation);

        _operations[8] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wspackageprocess", "echo"));
        _service.addOperation(__operation);

        _operations[9] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wspackageprocess",
                "removePartFromPackageMap"));
        _service.addOperation(__operation);

        _operations[10] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wspackageprocess", "listPackage"));
        _service.addOperation(__operation);

        _operations[11] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wspackageprocess",
                "getPackageMapSelectOptions"));
        _service.addOperation(__operation);

        _operations[12] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wspackageprocess", "getPartFromPackageMap"));
        _service.addOperation(__operation);

        _operations[13] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wspackageprocess", "listPackages"));
        _service.addOperation(__operation);

        _operations[14] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wspackageprocess", "getQueryFileMapping"));
        _service.addOperation(__operation);

        _operations[15] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:wspackageprocess", "getPackageMapById"));
        _service.addOperation(__operation);

        _operations[16] = __operation;
    }

    //populates the faults
    private void populateFaults() {
        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "DeletePackage"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "DeletePackage"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "DeletePackage"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "GetPackage"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "GetPackage"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "GetPackage"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"), "Ping"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"), "Ping"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"), "Ping"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "CopyPackageMap"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "CopyPackageMap"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "CopyPackageMap"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "AddPackage"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "AddPackage"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "AddPackage"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "ValidatePackage"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "ValidatePackage"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "ValidatePackage"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "AddPartToPackageMap"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "AddPartToPackageMap"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "AddPartToPackageMap"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "ActivatePackage"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "ActivatePackage"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "ActivatePackage"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "DeActivatePackage"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "DeActivatePackage"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "DeActivatePackage"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"), "Echo"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"), "Echo"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"), "Echo"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "RemovePartFromPackageMap"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "RemovePartFromPackageMap"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "RemovePartFromPackageMap"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "ListPackage"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "ListPackage"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "ListPackage"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "GetPackageMapSelectOptions"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "GetPackageMapSelectOptions"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "GetPackageMapSelectOptions"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "GetPartFromPackageMap"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "GetPartFromPackageMap"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "GetPartFromPackageMap"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "ListPackages"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "ListPackages"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "ListPackages"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "GetQueryFileMapping"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "GetQueryFileMapping"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "GetQueryFileMapping"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "GetPackageMapById"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "GetPackageMapById"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName(
                    "urn:hpccsystems:ws:wspackageprocess", "Exceptions"),
                "GetPackageMapById"),
            "org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.Exceptions");
    }

    /**
     * Auto generated method signature
     *
     * @see org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.WsPackageProcess#deletePackage
     * @param deletePackageRequest0
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.DeletePackageResponse deletePackage(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.DeletePackageRequest deletePackageRequest0)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
            _operationClient.getOptions()
                            .setAction("WsPackageProcess/DeletePackage?ver_=1.04");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    deletePackageRequest0,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wspackageprocess",
                            "deletePackage")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wspackageprocess",
                        "DeletePackageRequest"));

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
                    org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.DeletePackageResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.DeletePackageResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "DeletePackage"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DeletePackage"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DeletePackage"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.WsPackageProcess#getPackage
     * @param getPackageRequest2
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageResponse getPackage(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageRequest getPackageRequest2)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
            _operationClient.getOptions()
                            .setAction("WsPackageProcess/GetPackage?ver_=1.04");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    getPackageRequest2,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wspackageprocess", "getPackage")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wspackageprocess",
                        "GetPackageRequest"));

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
                    org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "GetPackage"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "GetPackage"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "GetPackage"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.WsPackageProcess#ping
     * @param wsPackageProcessPingRequest4
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.WsPackageProcessPingResponse ping(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.WsPackageProcessPingRequest wsPackageProcessPingRequest4)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
            _operationClient.getOptions()
                            .setAction("WsPackageProcess/Ping?ver_=1.04");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    wsPackageProcessPingRequest4,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wspackageprocess", "ping")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wspackageprocess",
                        "WsPackageProcessPingRequest"));

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
                    org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.WsPackageProcessPingResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.WsPackageProcessPingResponse) object;
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

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.WsPackageProcess#copyPackageMap
     * @param copyPackageMapRequest6
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.CopyPackageMapResponse copyPackageMap(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.CopyPackageMapRequest copyPackageMapRequest6)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
            _operationClient.getOptions()
                            .setAction("WsPackageProcess/CopyPackageMap?ver_=1.04");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    copyPackageMapRequest6,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wspackageprocess",
                            "copyPackageMap")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wspackageprocess",
                        "CopyPackageMapRequest"));

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
                    org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.CopyPackageMapResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.CopyPackageMapResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "CopyPackageMap"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "CopyPackageMap"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "CopyPackageMap"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.WsPackageProcess#addPackage
     * @param addPackageRequest8
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPackageResponse addPackage(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPackageRequest addPackageRequest8)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
            _operationClient.getOptions()
                            .setAction("WsPackageProcess/AddPackage?ver_=1.04");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    addPackageRequest8,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wspackageprocess", "addPackage")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wspackageprocess",
                        "AddPackageRequest"));

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
                    org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPackageResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPackageResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "AddPackage"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "AddPackage"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "AddPackage"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.WsPackageProcess#validatePackage
     * @param validatePackageRequest10
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ValidatePackageResponse validatePackage(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ValidatePackageRequest validatePackageRequest10)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
            _operationClient.getOptions()
                            .setAction("WsPackageProcess/ValidatePackage?ver_=1.04");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    validatePackageRequest10,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wspackageprocess",
                            "validatePackage")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wspackageprocess",
                        "ValidatePackageRequest"));

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
                    org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ValidatePackageResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ValidatePackageResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "ValidatePackage"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "ValidatePackage"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "ValidatePackage"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.WsPackageProcess#addPartToPackageMap
     * @param addPartToPackageMapRequest12
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPartToPackageMapResponse addPartToPackageMap(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPartToPackageMapRequest addPartToPackageMapRequest12)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
            _operationClient.getOptions()
                            .setAction("WsPackageProcess/AddPartToPackageMap?ver_=1.04");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    addPartToPackageMapRequest12,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wspackageprocess",
                            "addPartToPackageMap")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wspackageprocess",
                        "AddPartToPackageMapRequest"));

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
                    org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPartToPackageMapResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPartToPackageMapResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "AddPartToPackageMap"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "AddPartToPackageMap"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "AddPartToPackageMap"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.WsPackageProcess#activatePackage
     * @param activatePackageRequest14
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ActivatePackageResponse activatePackage(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ActivatePackageRequest activatePackageRequest14)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
            _operationClient.getOptions()
                            .setAction("WsPackageProcess/ActivatePackage?ver_=1.04");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    activatePackageRequest14,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wspackageprocess",
                            "activatePackage")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wspackageprocess",
                        "ActivatePackageRequest"));

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
                    org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ActivatePackageResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ActivatePackageResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "ActivatePackage"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "ActivatePackage"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "ActivatePackage"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.WsPackageProcess#deActivatePackage
     * @param deActivatePackageRequest16
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.DeActivatePackageResponse deActivatePackage(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.DeActivatePackageRequest deActivatePackageRequest16)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
            _operationClient.getOptions()
                            .setAction("WsPackageProcess/DeActivatePackage?ver_=1.04");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    deActivatePackageRequest16,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wspackageprocess",
                            "deActivatePackage")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wspackageprocess",
                        "DeActivatePackageRequest"));

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
                    org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.DeActivatePackageResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.DeActivatePackageResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "DeActivatePackage"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DeActivatePackage"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DeActivatePackage"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.WsPackageProcess#echo
     * @param echoRequest18
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EchoResponse echo(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EchoRequest echoRequest18)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
            _operationClient.getOptions()
                            .setAction("WsPackageProcess/Echo?ver_=1.04");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    echoRequest18,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wspackageprocess", "echo")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wspackageprocess", "EchoRequest"));

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
                    org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EchoResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EchoResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "Echo"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "Echo"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "Echo"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.WsPackageProcess#removePartFromPackageMap
     * @param removePartFromPackageMapRequest20
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.RemovePartFromPackageMapResponse removePartFromPackageMap(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.RemovePartFromPackageMapRequest removePartFromPackageMapRequest20)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
            _operationClient.getOptions()
                            .setAction("WsPackageProcess/RemovePartFromPackageMap?ver_=1.04");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    removePartFromPackageMapRequest20,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wspackageprocess",
                            "removePartFromPackageMap")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wspackageprocess",
                        "RemovePartFromPackageMapRequest"));

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
                    org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.RemovePartFromPackageMapResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.RemovePartFromPackageMapResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "RemovePartFromPackageMap"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "RemovePartFromPackageMap"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "RemovePartFromPackageMap"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.WsPackageProcess#listPackage
     * @param listPackageRequest22
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ListPackageResponse listPackage(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ListPackageRequest listPackageRequest22)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
            _operationClient.getOptions()
                            .setAction("WsPackageProcess/ListPackage?ver_=1.04");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    listPackageRequest22,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wspackageprocess", "listPackage")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wspackageprocess",
                        "ListPackageRequest"));

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
                    org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ListPackageResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ListPackageResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "ListPackage"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "ListPackage"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "ListPackage"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.WsPackageProcess#getPackageMapSelectOptions
     * @param getPackageMapSelectOptionsRequest24
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageMapSelectOptionsResponse getPackageMapSelectOptions(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageMapSelectOptionsRequest getPackageMapSelectOptionsRequest24)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
            _operationClient.getOptions()
                            .setAction("WsPackageProcess/GetPackageMapSelectOptions?ver_=1.04");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    getPackageMapSelectOptionsRequest24,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wspackageprocess",
                            "getPackageMapSelectOptions")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wspackageprocess",
                        "GetPackageMapSelectOptionsRequest"));

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
                    org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageMapSelectOptionsResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageMapSelectOptionsResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(),
                                "GetPackageMapSelectOptions"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "GetPackageMapSelectOptions"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(),
                                    "GetPackageMapSelectOptions"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.WsPackageProcess#getPartFromPackageMap
     * @param getPartFromPackageMapRequest26
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPartFromPackageMapResponse getPartFromPackageMap(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPartFromPackageMapRequest getPartFromPackageMapRequest26)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
            _operationClient.getOptions()
                            .setAction("WsPackageProcess/GetPartFromPackageMap?ver_=1.04");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    getPartFromPackageMapRequest26,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wspackageprocess",
                            "getPartFromPackageMap")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wspackageprocess",
                        "GetPartFromPackageMapRequest"));

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
                    org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPartFromPackageMapResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPartFromPackageMapResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "GetPartFromPackageMap"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "GetPartFromPackageMap"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "GetPartFromPackageMap"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.WsPackageProcess#listPackages
     * @param listPackagesRequest28
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ListPackagesResponse listPackages(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ListPackagesRequest listPackagesRequest28)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
            _operationClient.getOptions()
                            .setAction("WsPackageProcess/ListPackages?ver_=1.04");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    listPackagesRequest28,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wspackageprocess",
                            "listPackages")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wspackageprocess",
                        "ListPackagesRequest"));

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
                    org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ListPackagesResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ListPackagesResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "ListPackages"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "ListPackages"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "ListPackages"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.WsPackageProcess#getQueryFileMapping
     * @param getQueryFileMappingRequest30
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetQueryFileMappingResponse getQueryFileMapping(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetQueryFileMappingRequest getQueryFileMappingRequest30)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[15].getName());
            _operationClient.getOptions()
                            .setAction("WsPackageProcess/GetQueryFileMapping?ver_=1.04");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    getQueryFileMappingRequest30,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wspackageprocess",
                            "getQueryFileMapping")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wspackageprocess",
                        "GetQueryFileMappingRequest"));

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
                    org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetQueryFileMappingResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetQueryFileMappingResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "GetQueryFileMapping"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "GetQueryFileMapping"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "GetQueryFileMapping"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.WsPackageProcess#getPackageMapById
     * @param getPackageMapByIdRequest32
     * @throws org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageMapByIdResponse getPackageMapById(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageMapByIdRequest getPackageMapByIdRequest32)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[16].getName());
            _operationClient.getOptions()
                            .setAction("WsPackageProcess/GetPackageMapById?ver_=1.04");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    getPackageMapByIdRequest32,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:wspackageprocess",
                            "getPackageMapById")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:wspackageprocess",
                        "GetPackageMapByIdRequest"));

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
                    org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageMapByIdResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageMapByIdResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "GetPackageMapById"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "GetPackageMapById"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "GetPackageMapById"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EspSoapFault) ex;
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

    //http://10.173.160.101:8010/WsPackageProcess?ver_=1.04
    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.DeletePackageRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.DeletePackageRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.DeletePackageResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.DeletePackageResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.Exceptions param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.Exceptions.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.WsPackageProcessPingRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.WsPackageProcessPingRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.WsPackageProcessPingResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.WsPackageProcessPingResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.CopyPackageMapRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.CopyPackageMapRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.CopyPackageMapResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.CopyPackageMapResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPackageRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPackageRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPackageResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPackageResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ValidatePackageRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ValidatePackageRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ValidatePackageResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ValidatePackageResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPartToPackageMapRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPartToPackageMapRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPartToPackageMapResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPartToPackageMapResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ActivatePackageRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ActivatePackageRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ActivatePackageResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ActivatePackageResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.DeActivatePackageRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.DeActivatePackageRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.DeActivatePackageResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.DeActivatePackageResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EchoRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EchoRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EchoResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EchoResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.RemovePartFromPackageMapRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.RemovePartFromPackageMapRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.RemovePartFromPackageMapResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.RemovePartFromPackageMapResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ListPackageRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ListPackageRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ListPackageResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ListPackageResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageMapSelectOptionsRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageMapSelectOptionsRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageMapSelectOptionsResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageMapSelectOptionsResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPartFromPackageMapRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPartFromPackageMapRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPartFromPackageMapResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPartFromPackageMapResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ListPackagesRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ListPackagesRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ListPackagesResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ListPackagesResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetQueryFileMappingRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetQueryFileMappingRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetQueryFileMappingResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetQueryFileMappingResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageMapByIdRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageMapByIdRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageMapByIdResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageMapByIdResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.DeletePackageRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.DeletePackageRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.WsPackageProcessPingRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.WsPackageProcessPingRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.CopyPackageMapRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.CopyPackageMapRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPackageRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPackageRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ValidatePackageRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ValidatePackageRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPartToPackageMapRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPartToPackageMapRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ActivatePackageRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ActivatePackageRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.DeActivatePackageRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.DeActivatePackageRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EchoRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EchoRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.RemovePartFromPackageMapRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.RemovePartFromPackageMapRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ListPackageRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ListPackageRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageMapSelectOptionsRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageMapSelectOptionsRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPartFromPackageMapRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPartFromPackageMapRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ListPackagesRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ListPackagesRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetQueryFileMappingRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetQueryFileMappingRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageMapByIdRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageMapByIdRequest.MY_QNAME,
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
            if (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ActivatePackageRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ActivatePackageRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ActivatePackageResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ActivatePackageResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPackageRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPackageRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPackageResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPackageResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPartToPackageMapRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPartToPackageMapRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPartToPackageMapResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPartToPackageMapResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.CopyPackageMapRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.CopyPackageMapRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.CopyPackageMapResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.CopyPackageMapResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.DeActivatePackageRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.DeActivatePackageRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.DeActivatePackageResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.DeActivatePackageResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.DeletePackageRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.DeletePackageRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.DeletePackageResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.DeletePackageResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EchoRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EchoRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EchoResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.EchoResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.Exceptions.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.Exceptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageMapByIdRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageMapByIdRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageMapByIdResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageMapByIdResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageMapSelectOptionsRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageMapSelectOptionsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageMapSelectOptionsResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageMapSelectOptionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPackageResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPartFromPackageMapRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPartFromPackageMapRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPartFromPackageMapResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetPartFromPackageMapResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetQueryFileMappingRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetQueryFileMappingRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetQueryFileMappingResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetQueryFileMappingResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ListPackageRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ListPackageRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ListPackageResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ListPackageResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ListPackagesRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ListPackagesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ListPackagesResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ListPackagesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.RemovePartFromPackageMapRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.RemovePartFromPackageMapRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.RemovePartFromPackageMapResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.RemovePartFromPackageMapResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ValidatePackageRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ValidatePackageRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ValidatePackageResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ValidatePackageResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.WsPackageProcessPingRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.WsPackageProcessPingRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.WsPackageProcessPingResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.WsPackageProcessPingResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return null;
    }
}

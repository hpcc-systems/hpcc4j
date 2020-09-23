/**
 * FileSprayStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package org.hpccsystems.ws.client.gen.axis2.filespray.v1_20;


/*
 *  FileSprayStub java implementation
 */
public class FileSprayStub extends org.apache.axis2.client.Stub
    implements FileSpray {
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
    public FileSprayStub(
        org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(configurationContext, targetEndpoint, false);
    }

    /**
     * Constructor that takes in a configContext  and useseperate listner
     */
    public FileSprayStub(
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
    public FileSprayStub(
        org.apache.axis2.context.ConfigurationContext configurationContext)
        throws org.apache.axis2.AxisFault {
        this(configurationContext,
            "http://10.173.160.101:8010/FileSpray?ver_=1.2");
    }

    /**
     * Default Constructor
     */
    public FileSprayStub() throws org.apache.axis2.AxisFault {
        this("http://10.173.160.101:8010/FileSpray?ver_=1.2");
    }

    /**
     * Constructor taking the target endpoint
     */
    public FileSprayStub(java.lang.String targetEndpoint)
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
        _service = new org.apache.axis2.description.AxisService("FileSpray" +
                getUniqueSuffix());
        addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[30];

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:filespray", "sprayVariable"));
        _service.addOperation(__operation);

        _operations[0] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:filespray", "dFUWUFile"));
        _service.addOperation(__operation);

        _operations[1] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:filespray", "ping"));
        _service.addOperation(__operation);

        _operations[2] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:filespray", "copy"));
        _service.addOperation(__operation);

        _operations[3] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:filespray", "replicate"));
        _service.addOperation(__operation);

        _operations[4] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:filespray", "createDFUWorkunit"));
        _service.addOperation(__operation);

        _operations[5] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:filespray", "getDFUWorkunit"));
        _service.addOperation(__operation);

        _operations[6] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:filespray", "rename"));
        _service.addOperation(__operation);

        _operations[7] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:filespray", "sprayFixed"));
        _service.addOperation(__operation);

        _operations[8] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:filespray", "showResult"));
        _service.addOperation(__operation);

        _operations[9] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:filespray", "abortDFUWorkunit"));
        _service.addOperation(__operation);

        _operations[10] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:filespray", "dropZoneFileSearch"));
        _service.addOperation(__operation);

        _operations[11] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:filespray", "getDFUServerQueues"));
        _service.addOperation(__operation);

        _operations[12] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:filespray", "deleteDFUWorkunits"));
        _service.addOperation(__operation);

        _operations[13] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:filespray", "despray"));
        _service.addOperation(__operation);

        _operations[14] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:filespray", "fileList"));
        _service.addOperation(__operation);

        _operations[15] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:filespray", "dFUWorkunitsAction"));
        _service.addOperation(__operation);

        _operations[16] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:filespray", "dropZoneFiles"));
        _service.addOperation(__operation);

        _operations[17] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:filespray", "deleteDFUWorkunit"));
        _service.addOperation(__operation);

        _operations[18] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:filespray", "submitDFUWorkunit"));
        _service.addOperation(__operation);

        _operations[19] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:filespray", "dfuMonitor"));
        _service.addOperation(__operation);

        _operations[20] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:filespray", "dFUWUSearch"));
        _service.addOperation(__operation);

        _operations[21] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:filespray", "getDFUWorkunits"));
        _service.addOperation(__operation);

        _operations[22] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:filespray", "deleteDropZoneFiles"));
        _service.addOperation(__operation);

        _operations[23] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:filespray", "getSprayTargets"));
        _service.addOperation(__operation);

        _operations[24] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:filespray", "getDFUExceptions"));
        _service.addOperation(__operation);

        _operations[25] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:filespray", "echoDateTime"));
        _service.addOperation(__operation);

        _operations[26] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:filespray", "updateDFUWorkunit"));
        _service.addOperation(__operation);

        _operations[27] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:filespray", "getDFUProgress"));
        _service.addOperation(__operation);

        _operations[28] = __operation;

        __operation = new org.apache.axis2.description.OutInAxisOperation();

        __operation.setName(new javax.xml.namespace.QName(
                "urn:hpccsystems:ws:filespray", "openSave"));
        _service.addOperation(__operation);

        _operations[29] = __operation;
    }

    //populates the faults
    private void populateFaults() {
        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "SprayVariable"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "SprayVariable"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "SprayVariable"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "DFUWUFile"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "DFUWUFile"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "DFUWUFile"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "Ping"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "Ping"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "Ping"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "Copy"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "Copy"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "Copy"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "Replicate"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "Replicate"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "Replicate"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "CreateDFUWorkunit"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "CreateDFUWorkunit"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "CreateDFUWorkunit"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "GetDFUWorkunit"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "GetDFUWorkunit"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "GetDFUWorkunit"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "Rename"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "Rename"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "Rename"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "SprayFixed"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "SprayFixed"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "SprayFixed"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "ShowResult"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "ShowResult"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "ShowResult"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "AbortDFUWorkunit"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "AbortDFUWorkunit"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "AbortDFUWorkunit"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "DropZoneFileSearch"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "DropZoneFileSearch"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "DropZoneFileSearch"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "GetDFUServerQueues"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "GetDFUServerQueues"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "GetDFUServerQueues"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "DeleteDFUWorkunits"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "DeleteDFUWorkunits"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "DeleteDFUWorkunits"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "Despray"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "Despray"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "Despray"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "FileList"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "FileList"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "FileList"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "DFUWorkunitsAction"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "DFUWorkunitsAction"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "DFUWorkunitsAction"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "DropZoneFiles"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "DropZoneFiles"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "DropZoneFiles"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "DeleteDFUWorkunit"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "DeleteDFUWorkunit"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "DeleteDFUWorkunit"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "SubmitDFUWorkunit"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "SubmitDFUWorkunit"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "SubmitDFUWorkunit"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "DfuMonitor"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "DfuMonitor"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "DfuMonitor"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "DFUWUSearch"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "DFUWUSearch"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "DFUWUSearch"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "GetDFUWorkunits"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "GetDFUWorkunits"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "GetDFUWorkunits"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "DeleteDropZoneFiles"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "DeleteDropZoneFiles"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "DeleteDropZoneFiles"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "GetSprayTargets"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "GetSprayTargets"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "GetSprayTargets"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "GetDFUExceptions"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "GetDFUExceptions"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "GetDFUExceptions"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "EchoDateTime"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "EchoDateTime"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "EchoDateTime"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "UpdateDFUWorkunit"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "UpdateDFUWorkunit"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "UpdateDFUWorkunit"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "GetDFUProgress"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "GetDFUProgress"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "GetDFUProgress"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Exceptions");

        faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "OpenSave"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "OpenSave"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault");
        faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(
                new javax.xml.namespace.QName("urn:hpccsystems:ws:filespray",
                    "Exceptions"), "OpenSave"),
            "org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Exceptions");
    }

    /**
     * Auto generated method signature
     *
     * @see org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSpray#sprayVariable
     * @param sprayVariable1
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SprayResponse sprayVariable(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SprayVariable sprayVariable1)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
            _operationClient.getOptions()
                            .setAction("FileSpray/SprayVariable?ver_=1.2");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    sprayVariable1,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:filespray", "sprayVariable")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "SprayVariable"));

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
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SprayResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SprayResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "SprayVariable"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "SprayVariable"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "SprayVariable"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSpray#dFUWUFile
     * @param dFUWUFileRequest3
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWUFileResponse dFUWUFile(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWUFileRequest dFUWUFileRequest3)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
            _operationClient.getOptions()
                            .setAction("FileSpray/DFUWUFile?ver_=1.2");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    dFUWUFileRequest3,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:filespray", "dFUWUFile")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "DFUWUFileRequest"));

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
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWUFileResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWUFileResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "DFUWUFile"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DFUWUFile"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DFUWUFile"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSpray#ping
     * @param fileSprayPingRequest5
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSprayPingResponse ping(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSprayPingRequest fileSprayPingRequest5)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
            _operationClient.getOptions().setAction("FileSpray/Ping?ver_=1.2");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    fileSprayPingRequest5,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:filespray", "ping")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "FileSprayPingRequest"));

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
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSprayPingResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSprayPingResponse) object;
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

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSpray#copy
     * @param copy7
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.CopyResponse copy(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Copy copy7)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
            _operationClient.getOptions().setAction("FileSpray/Copy?ver_=1.2");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    copy7,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:filespray", "copy")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "Copy"));

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
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.CopyResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.CopyResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "Copy"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "Copy"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "Copy"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSpray#replicate
     * @param replicate9
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ReplicateResponse replicate(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Replicate replicate9)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
            _operationClient.getOptions()
                            .setAction("FileSpray/Replicate?ver_=1.2");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    replicate9,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:filespray", "replicate")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "Replicate"));

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
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ReplicateResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ReplicateResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "Replicate"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "Replicate"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "Replicate"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSpray#createDFUWorkunit
     * @param createDFUWorkunit11
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.CreateDFUWorkunitResponse createDFUWorkunit(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.CreateDFUWorkunit createDFUWorkunit11)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
            _operationClient.getOptions()
                            .setAction("FileSpray/CreateDFUWorkunit?ver_=1.2");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    createDFUWorkunit11,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:filespray", "createDFUWorkunit")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "CreateDFUWorkunit"));

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
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.CreateDFUWorkunitResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.CreateDFUWorkunitResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "CreateDFUWorkunit"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "CreateDFUWorkunit"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "CreateDFUWorkunit"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSpray#getDFUWorkunit
     * @param getDFUWorkunit13
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUWorkunitResponse getDFUWorkunit(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUWorkunit getDFUWorkunit13)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[6].getName());
            _operationClient.getOptions()
                            .setAction("FileSpray/GetDFUWorkunit?ver_=1.2");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    getDFUWorkunit13,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:filespray", "getDFUWorkunit")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "GetDFUWorkunit"));

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
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUWorkunitResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUWorkunitResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "GetDFUWorkunit"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "GetDFUWorkunit"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "GetDFUWorkunit"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSpray#rename
     * @param rename15
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.RenameResponse rename(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Rename rename15)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[7].getName());
            _operationClient.getOptions().setAction("FileSpray/Rename?ver_=1.2");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    rename15,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:filespray", "rename")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "Rename"));

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
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.RenameResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.RenameResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "Rename"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "Rename"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "Rename"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSpray#sprayFixed
     * @param sprayFixed17
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SprayFixedResponse sprayFixed(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SprayFixed sprayFixed17)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[8].getName());
            _operationClient.getOptions()
                            .setAction("FileSpray/SprayFixed?ver_=1.2");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    sprayFixed17,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:filespray", "sprayFixed")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "SprayFixed"));

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
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SprayFixedResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SprayFixedResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "SprayFixed"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "SprayFixed"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "SprayFixed"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSpray#showResult
     * @param showResultRequest19
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ShowResultResponse showResult(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ShowResultRequest showResultRequest19)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[9].getName());
            _operationClient.getOptions()
                            .setAction("FileSpray/ShowResult?ver_=1.2");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    showResultRequest19,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:filespray", "showResult")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "ShowResultRequest"));

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
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ShowResultResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ShowResultResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "ShowResult"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "ShowResult"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "ShowResult"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSpray#abortDFUWorkunit
     * @param abortDFUWorkunit21
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.AbortDFUWorkunitResponse abortDFUWorkunit(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.AbortDFUWorkunit abortDFUWorkunit21)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[10].getName());
            _operationClient.getOptions()
                            .setAction("FileSpray/AbortDFUWorkunit?ver_=1.2");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    abortDFUWorkunit21,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:filespray", "abortDFUWorkunit")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "AbortDFUWorkunit"));

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
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.AbortDFUWorkunitResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.AbortDFUWorkunitResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "AbortDFUWorkunit"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "AbortDFUWorkunit"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "AbortDFUWorkunit"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSpray#dropZoneFileSearch
     * @param dropZoneFileSearchRequest23
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DropZoneFileSearchResponse dropZoneFileSearch(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DropZoneFileSearchRequest dropZoneFileSearchRequest23)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[11].getName());
            _operationClient.getOptions()
                            .setAction("FileSpray/DropZoneFileSearch?ver_=1.2");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    dropZoneFileSearchRequest23,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:filespray", "dropZoneFileSearch")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray",
                        "DropZoneFileSearchRequest"));

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
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DropZoneFileSearchResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DropZoneFileSearchResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "DropZoneFileSearch"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DropZoneFileSearch"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DropZoneFileSearch"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSpray#getDFUServerQueues
     * @param getDFUServerQueuesRequest25
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUServerQueuesResponse getDFUServerQueues(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUServerQueuesRequest getDFUServerQueuesRequest25)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[12].getName());
            _operationClient.getOptions()
                            .setAction("FileSpray/GetDFUServerQueues?ver_=1.2");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    getDFUServerQueuesRequest25,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:filespray", "getDFUServerQueues")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray",
                        "GetDFUServerQueuesRequest"));

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
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUServerQueuesResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUServerQueuesResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "GetDFUServerQueues"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "GetDFUServerQueues"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "GetDFUServerQueues"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSpray#deleteDFUWorkunits
     * @param deleteDFUWorkunits27
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDFUWorkunitsResponse deleteDFUWorkunits(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDFUWorkunits deleteDFUWorkunits27)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[13].getName());
            _operationClient.getOptions()
                            .setAction("FileSpray/DeleteDFUWorkunits?ver_=1.2");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    deleteDFUWorkunits27,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:filespray", "deleteDFUWorkunits")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "DeleteDFUWorkunits"));

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
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDFUWorkunitsResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDFUWorkunitsResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "DeleteDFUWorkunits"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DeleteDFUWorkunits"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DeleteDFUWorkunits"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSpray#despray
     * @param despray29
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DesprayResponse despray(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Despray despray29)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[14].getName());
            _operationClient.getOptions().setAction("FileSpray/Despray?ver_=1.2");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    despray29,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:filespray", "despray")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "Despray"));

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
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DesprayResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DesprayResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "Despray"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "Despray"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "Despray"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSpray#fileList
     * @param fileListRequest31
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileListResponse fileList(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileListRequest fileListRequest31)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[15].getName());
            _operationClient.getOptions()
                            .setAction("FileSpray/FileList?ver_=1.2");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    fileListRequest31,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:filespray", "fileList")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "FileListRequest"));

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
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileListResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileListResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "FileList"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "FileList"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "FileList"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSpray#dFUWorkunitsAction
     * @param dFUWorkunitsActionRequest33
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWorkunitsActionResponse dFUWorkunitsAction(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWorkunitsActionRequest dFUWorkunitsActionRequest33)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[16].getName());
            _operationClient.getOptions()
                            .setAction("FileSpray/DFUWorkunitsAction?ver_=1.2");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    dFUWorkunitsActionRequest33,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:filespray", "dFUWorkunitsAction")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray",
                        "DFUWorkunitsActionRequest"));

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
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWorkunitsActionResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWorkunitsActionResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "DFUWorkunitsAction"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DFUWorkunitsAction"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DFUWorkunitsAction"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSpray#dropZoneFiles
     * @param dropZoneFilesRequest35
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DropZoneFilesResponse dropZoneFiles(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DropZoneFilesRequest dropZoneFilesRequest35)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[17].getName());
            _operationClient.getOptions()
                            .setAction("FileSpray/DropZoneFiles?ver_=1.2");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    dropZoneFilesRequest35,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:filespray", "dropZoneFiles")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "DropZoneFilesRequest"));

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
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DropZoneFilesResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DropZoneFilesResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "DropZoneFiles"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DropZoneFiles"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DropZoneFiles"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSpray#deleteDFUWorkunit
     * @param deleteDFUWorkunit37
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDFUWorkunitResponse deleteDFUWorkunit(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDFUWorkunit deleteDFUWorkunit37)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[18].getName());
            _operationClient.getOptions()
                            .setAction("FileSpray/DeleteDFUWorkunit?ver_=1.2");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    deleteDFUWorkunit37,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:filespray", "deleteDFUWorkunit")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "DeleteDFUWorkunit"));

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
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDFUWorkunitResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDFUWorkunitResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "DeleteDFUWorkunit"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DeleteDFUWorkunit"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DeleteDFUWorkunit"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSpray#submitDFUWorkunit
     * @param submitDFUWorkunit39
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SubmitDFUWorkunitResponse submitDFUWorkunit(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SubmitDFUWorkunit submitDFUWorkunit39)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[19].getName());
            _operationClient.getOptions()
                            .setAction("FileSpray/SubmitDFUWorkunit?ver_=1.2");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    submitDFUWorkunit39,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:filespray", "submitDFUWorkunit")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "SubmitDFUWorkunit"));

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
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SubmitDFUWorkunitResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SubmitDFUWorkunitResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "SubmitDFUWorkunit"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "SubmitDFUWorkunit"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "SubmitDFUWorkunit"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSpray#dfuMonitor
     * @param dfuMonitorRequest41
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DfuMonitorResponse dfuMonitor(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DfuMonitorRequest dfuMonitorRequest41)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[20].getName());
            _operationClient.getOptions()
                            .setAction("FileSpray/DfuMonitor?ver_=1.2");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    dfuMonitorRequest41,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:filespray", "dfuMonitor")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "DfuMonitorRequest"));

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
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DfuMonitorResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DfuMonitorResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "DfuMonitor"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DfuMonitor"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DfuMonitor"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSpray#dFUWUSearch
     * @param dFUWUSearchRequest43
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWUSearchResponse dFUWUSearch(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWUSearchRequest dFUWUSearchRequest43)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[21].getName());
            _operationClient.getOptions()
                            .setAction("FileSpray/DFUWUSearch?ver_=1.2");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    dFUWUSearchRequest43,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:filespray", "dFUWUSearch")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "DFUWUSearchRequest"));

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
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWUSearchResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWUSearchResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "DFUWUSearch"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DFUWUSearch"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DFUWUSearch"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSpray#getDFUWorkunits
     * @param getDFUWorkunits45
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUWorkunitsResponse getDFUWorkunits(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUWorkunits getDFUWorkunits45)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[22].getName());
            _operationClient.getOptions()
                            .setAction("FileSpray/GetDFUWorkunits?ver_=1.2");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    getDFUWorkunits45,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:filespray", "getDFUWorkunits")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "GetDFUWorkunits"));

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
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUWorkunitsResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUWorkunitsResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "GetDFUWorkunits"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "GetDFUWorkunits"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "GetDFUWorkunits"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSpray#deleteDropZoneFiles
     * @param deleteDropZoneFilesRequest47
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWorkunitsActionResponse deleteDropZoneFiles(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDropZoneFilesRequest deleteDropZoneFilesRequest47)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[23].getName());
            _operationClient.getOptions()
                            .setAction("FileSpray/DeleteDropZoneFiles?ver_=1.2");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    deleteDropZoneFilesRequest47,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:filespray",
                            "deleteDropZoneFiles")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray",
                        "DeleteDropZoneFilesRequest"));

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
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWorkunitsActionResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWorkunitsActionResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "DeleteDropZoneFiles"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DeleteDropZoneFiles"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "DeleteDropZoneFiles"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSpray#getSprayTargets
     * @param getSprayTargetsRequest49
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetSprayTargetsResponse getSprayTargets(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetSprayTargetsRequest getSprayTargetsRequest49)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[24].getName());
            _operationClient.getOptions()
                            .setAction("FileSpray/GetSprayTargets?ver_=1.2");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    getSprayTargetsRequest49,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:filespray", "getSprayTargets")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "GetSprayTargetsRequest"));

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
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetSprayTargetsResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetSprayTargetsResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "GetSprayTargets"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "GetSprayTargets"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "GetSprayTargets"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSpray#getDFUExceptions
     * @param getDFUExceptions51
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUExceptionsResponse getDFUExceptions(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUExceptions getDFUExceptions51)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[25].getName());
            _operationClient.getOptions()
                            .setAction("FileSpray/GetDFUExceptions?ver_=1.2");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    getDFUExceptions51,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:filespray", "getDFUExceptions")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "GetDFUExceptions"));

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
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUExceptionsResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUExceptionsResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "GetDFUExceptions"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "GetDFUExceptions"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "GetDFUExceptions"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSpray#echoDateTime
     * @param echoDateTime53
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EchoDateTimeResponse echoDateTime(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EchoDateTime echoDateTime53)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[26].getName());
            _operationClient.getOptions()
                            .setAction("FileSpray/EchoDateTime?ver_=1.2");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    echoDateTime53,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:filespray", "echoDateTime")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "EchoDateTime"));

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
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EchoDateTimeResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EchoDateTimeResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "EchoDateTime"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "EchoDateTime"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "EchoDateTime"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSpray#updateDFUWorkunit
     * @param updateDFUWorkunit55
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.UpdateDFUWorkunitResponse updateDFUWorkunit(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.UpdateDFUWorkunit updateDFUWorkunit55)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[27].getName());
            _operationClient.getOptions()
                            .setAction("FileSpray/UpdateDFUWorkunit?ver_=1.2");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    updateDFUWorkunit55,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:filespray", "updateDFUWorkunit")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "UpdateDFUWorkunit"));

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
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.UpdateDFUWorkunitResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.UpdateDFUWorkunitResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "UpdateDFUWorkunit"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "UpdateDFUWorkunit"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "UpdateDFUWorkunit"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSpray#getDFUProgress
     * @param progressRequest57
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ProgressResponse getDFUProgress(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ProgressRequest progressRequest57)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[28].getName());
            _operationClient.getOptions()
                            .setAction("FileSpray/GetDFUProgress?ver_=1.2");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    progressRequest57,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:filespray", "getDFUProgress")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "ProgressRequest"));

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
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ProgressResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ProgressResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "GetDFUProgress"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "GetDFUProgress"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "GetDFUProgress"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) ex;
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
     * @see org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSpray#openSave
     * @param openSaveRequest59
     * @throws org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault :
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.OpenSaveResponse openSave(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.OpenSaveRequest openSaveRequest59)
        throws java.rmi.RemoteException,
            org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault {
        org.apache.axis2.context.MessageContext _messageContext = new org.apache.axis2.context.MessageContext();

        try {
            org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[29].getName());
            _operationClient.getOptions()
                            .setAction("FileSpray/OpenSave?ver_=1.2");
            _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

            addPropertyToOperationClient(_operationClient,
                org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
                "&");

            // create SOAP envelope with that payload
            org.apache.axiom.soap.SOAPEnvelope env = null;

            env = toEnvelope(getFactory(_operationClient.getOptions()
                                                        .getSoapVersionURI()),
                    openSaveRequest59,
                    optimizeContent(
                        new javax.xml.namespace.QName(
                            "urn:hpccsystems:ws:filespray", "openSave")),
                    new javax.xml.namespace.QName(
                        "urn:hpccsystems:ws:filespray", "OpenSaveRequest"));

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
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.OpenSaveResponse.class);

            return (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.OpenSaveResponse) object;
        } catch (org.apache.axis2.AxisFault f) {
            org.apache.axiom.om.OMElement faultElt = f.getDetail();

            if (faultElt != null) {
                if (faultExceptionNameMap.containsKey(
                            new org.apache.axis2.client.FaultMapKey(
                                faultElt.getQName(), "OpenSave"))) {
                    //make the fault by reflection
                    try {
                        java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "OpenSave"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.reflect.Constructor constructor = exceptionClass.getConstructor(java.lang.String.class);
                        java.lang.Exception ex = (java.lang.Exception) constructor.newInstance(f.getMessage());

                        //message class
                        java.lang.String messageClassName = (java.lang.String) faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(
                                    faultElt.getQName(), "OpenSave"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,
                                messageClass);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                new java.lang.Class[] { messageClass });
                        m.invoke(ex, new java.lang.Object[] { messageObject });

                        if (ex instanceof org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) {
                            throw (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EspSoapFault) ex;
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

    //http://10.173.160.101:8010/FileSpray?ver_=1.2
    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SprayVariable param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SprayVariable.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SprayResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SprayResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Exceptions param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Exceptions.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWUFileRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWUFileRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWUFileResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWUFileResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSprayPingRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSprayPingRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSprayPingResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSprayPingResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Copy param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Copy.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.CopyResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.CopyResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Replicate param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Replicate.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ReplicateResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ReplicateResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.CreateDFUWorkunit param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.CreateDFUWorkunit.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.CreateDFUWorkunitResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.CreateDFUWorkunitResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUWorkunit param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUWorkunit.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUWorkunitResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUWorkunitResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Rename param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Rename.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.RenameResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.RenameResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SprayFixed param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SprayFixed.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SprayFixedResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SprayFixedResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ShowResultRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ShowResultRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ShowResultResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ShowResultResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.AbortDFUWorkunit param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.AbortDFUWorkunit.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.AbortDFUWorkunitResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.AbortDFUWorkunitResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DropZoneFileSearchRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DropZoneFileSearchRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DropZoneFileSearchResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DropZoneFileSearchResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUServerQueuesRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUServerQueuesRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUServerQueuesResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUServerQueuesResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDFUWorkunits param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDFUWorkunits.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDFUWorkunitsResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDFUWorkunitsResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Despray param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Despray.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DesprayResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DesprayResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileListRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileListRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileListResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileListResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWorkunitsActionRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWorkunitsActionRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWorkunitsActionResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWorkunitsActionResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DropZoneFilesRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DropZoneFilesRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DropZoneFilesResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DropZoneFilesResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDFUWorkunit param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDFUWorkunit.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDFUWorkunitResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDFUWorkunitResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SubmitDFUWorkunit param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SubmitDFUWorkunit.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SubmitDFUWorkunitResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SubmitDFUWorkunitResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DfuMonitorRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DfuMonitorRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DfuMonitorResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DfuMonitorResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWUSearchRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWUSearchRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWUSearchResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWUSearchResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUWorkunits param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUWorkunits.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUWorkunitsResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUWorkunitsResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDropZoneFilesRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDropZoneFilesRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetSprayTargetsRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetSprayTargetsRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetSprayTargetsResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetSprayTargetsResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUExceptions param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUExceptions.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUExceptionsResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUExceptionsResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EchoDateTime param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EchoDateTime.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EchoDateTimeResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EchoDateTimeResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.UpdateDFUWorkunit param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.UpdateDFUWorkunit.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.UpdateDFUWorkunitResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.UpdateDFUWorkunitResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ProgressRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ProgressRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ProgressResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ProgressResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.OpenSaveRequest param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.OpenSaveRequest.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.om.OMElement toOM(
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.OpenSaveResponse param,
        boolean optimizeContent) throws org.apache.axis2.AxisFault {
        try {
            return param.getOMElement(org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.OpenSaveResponse.MY_QNAME,
                org.apache.axiom.om.OMAbstractFactory.getOMFactory());
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SprayVariable param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SprayVariable.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWUFileRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWUFileRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSprayPingRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSprayPingRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Copy param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Copy.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Replicate param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Replicate.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.CreateDFUWorkunit param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.CreateDFUWorkunit.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUWorkunit param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUWorkunit.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Rename param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Rename.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SprayFixed param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SprayFixed.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ShowResultRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ShowResultRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.AbortDFUWorkunit param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.AbortDFUWorkunit.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DropZoneFileSearchRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DropZoneFileSearchRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUServerQueuesRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUServerQueuesRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDFUWorkunits param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDFUWorkunits.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Despray param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Despray.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileListRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileListRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWorkunitsActionRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWorkunitsActionRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DropZoneFilesRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DropZoneFilesRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDFUWorkunit param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDFUWorkunit.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SubmitDFUWorkunit param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SubmitDFUWorkunit.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DfuMonitorRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DfuMonitorRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWUSearchRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWUSearchRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUWorkunits param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUWorkunits.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDropZoneFilesRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDropZoneFilesRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetSprayTargetsRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetSprayTargetsRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUExceptions param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUExceptions.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EchoDateTime param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EchoDateTime.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.UpdateDFUWorkunit param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.UpdateDFUWorkunit.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ProgressRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ProgressRequest.MY_QNAME,
                    factory));

            return emptyEnvelope;
        } catch (org.apache.axis2.databinding.ADBException e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }
    }

    /* methods to provide back word compatibility */
    private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
        org.apache.axiom.soap.SOAPFactory factory,
        org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.OpenSaveRequest param,
        boolean optimizeContent, javax.xml.namespace.QName elementQName)
        throws org.apache.axis2.AxisFault {
        try {
            org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
            emptyEnvelope.getBody()
                         .addChild(param.getOMElement(
                    org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.OpenSaveRequest.MY_QNAME,
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
            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.AbortDFUWorkunit.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.AbortDFUWorkunit.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.AbortDFUWorkunitResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.AbortDFUWorkunitResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Copy.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Copy.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.CopyResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.CopyResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.CreateDFUWorkunit.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.CreateDFUWorkunit.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.CreateDFUWorkunitResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.CreateDFUWorkunitResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDFUWorkunit.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDFUWorkunit.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDFUWorkunitResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDFUWorkunitResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDFUWorkunits.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDFUWorkunits.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDFUWorkunitsResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDFUWorkunitsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDropZoneFilesRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DeleteDropZoneFilesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Despray.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Despray.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DesprayResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DesprayResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DfuMonitorRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DfuMonitorRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DfuMonitorResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DfuMonitorResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWorkunitsActionRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWorkunitsActionRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWorkunitsActionResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWorkunitsActionResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWUFileRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWUFileRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWUFileResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWUFileResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWUSearchRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWUSearchRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWUSearchResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DFUWUSearchResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DropZoneFileSearchRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DropZoneFileSearchRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DropZoneFileSearchResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DropZoneFileSearchResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DropZoneFilesRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DropZoneFilesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DropZoneFilesResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.DropZoneFilesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EchoDateTime.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EchoDateTime.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EchoDateTimeResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.EchoDateTimeResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Exceptions.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Exceptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileListRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileListRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileListResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileListResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSprayPingRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSprayPingRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSprayPingResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.FileSprayPingResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUExceptions.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUExceptions.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUExceptionsResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUExceptionsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUServerQueuesRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUServerQueuesRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUServerQueuesResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUServerQueuesResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUWorkunit.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUWorkunit.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUWorkunitResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUWorkunitResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUWorkunits.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUWorkunits.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUWorkunitsResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetDFUWorkunitsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetSprayTargetsRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetSprayTargetsRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetSprayTargetsResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.GetSprayTargetsResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.OpenSaveRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.OpenSaveRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.OpenSaveResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.OpenSaveResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ProgressRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ProgressRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ProgressResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ProgressResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Rename.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Rename.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.RenameResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.RenameResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Replicate.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.Replicate.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ReplicateResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ReplicateResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ShowResultRequest.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ShowResultRequest.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ShowResultResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.ShowResultResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SprayFixed.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SprayFixed.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SprayFixedResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SprayFixedResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SprayResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SprayResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SprayVariable.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SprayVariable.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SubmitDFUWorkunit.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SubmitDFUWorkunit.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SubmitDFUWorkunitResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SubmitDFUWorkunitResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.UpdateDFUWorkunit.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.UpdateDFUWorkunit.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }

            if (org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.UpdateDFUWorkunitResponse.class.equals(
                        type)) {
                return org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.UpdateDFUWorkunitResponse.Factory.parse(param.getXMLStreamReaderWithoutCaching());
            }
        } catch (java.lang.Exception e) {
            throw org.apache.axis2.AxisFault.makeFault(e);
        }

        return null;
    }
}
